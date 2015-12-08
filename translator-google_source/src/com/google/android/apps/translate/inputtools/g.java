// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputtools;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.e;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.translate.inputtools:
//            d, h, i, j

final class g
{

    final Pattern a;
    private final SparseArray b = new SparseArray();
    private final Pattern c;

    public g(String s)
    {
        s = new d(s);
        JSONObject jsonobject = new JSONObject(s);
        a = a(jsonobject, s);
        if (jsonobject.has("historyPruneRegex"))
        {
            s = String.valueOf(jsonobject.getString("historyPruneRegex"));
            s = Pattern.compile((new StringBuilder(String.valueOf(s).length() + 4)).append("^(").append(s).append(")$").toString());
        } else
        {
            s = null;
        }
        c = s;
    }

    private Pattern a(JSONObject jsonobject, d d1)
    {
        if (jsonobject.has("transform"))
        {
            jsonobject = jsonobject.getJSONObject("transform");
            StringBuilder stringbuilder = new StringBuilder();
            java.util.ArrayList arraylist = Lists.a(jsonobject.keys());
            Collections.sort(arraylist, new h(this, d1));
            d1 = arraylist.iterator();
            String s;
            for (int k = 1; d1.hasNext(); k = Pattern.compile(String.valueOf(s).concat("|.*")).matcher("").groupCount() + 1 + k)
            {
                s = (String)d1.next();
                Pattern pattern = Pattern.compile((new StringBuilder(String.valueOf(s).length() + 1)).append(s).append("$").toString());
                String s1 = jsonobject.getString(s);
                b.put(k, new i(pattern, s1));
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append('|');
                }
                stringbuilder.append('(').append(s).append("$)");
            }

            return Pattern.compile(stringbuilder.toString());
        } else
        {
            return null;
        }
    }

    public final j a(String s, int k, String s1)
    {
        boolean flag = true;
        if (a == null || s.length() < k)
        {
            return null;
        }
        Object obj;
        if (k > 0)
        {
            String s2 = String.valueOf(s.substring(0, k));
            s = String.valueOf(s.substring(k));
            s = (new StringBuilder(String.valueOf(s2).length() + 1 + String.valueOf(s).length() + String.valueOf(s1).length())).append(s2).append('\035').append(s).append(s1).toString();
        } else
        {
            s = String.valueOf(s);
            obj = String.valueOf(s1);
            if (((String) (obj)).length() != 0)
            {
                s = s.concat(((String) (obj)));
            } else
            {
                s = new String(s);
            }
        }
        obj = a.matcher(s);
        if (((Matcher) (obj)).find())
        {
            for (k = 1; k < ((Matcher) (obj)).groupCount() && TextUtils.isEmpty(((Matcher) (obj)).group(k)); k++) { }
            obj = (i)b.get(k);
            if (obj == null)
            {
                Singleton.b().a(-2101, "");
                return null;
            }
            Matcher matcher = ((i) (obj)).a.matcher(s);
            if (!matcher.find())
            {
                Singleton.b().a(-2102, "");
                return null;
            }
            int l = matcher.start();
            s = s.substring(l);
            if (s.indexOf('\035') >= 0)
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = 0;
            }
            return new j(s.length() - k - s1.length(), matcher.replaceFirst(((i) (obj)).b).substring(l).replace("\035", ""));
        } else
        {
            return null;
        }
    }

    public final boolean a(String s)
    {
        return c != null && c.matcher(s).find();
    }
}
