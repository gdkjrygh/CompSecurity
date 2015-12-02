// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.engine.a:
//            a

public static class a extends a
{

    public final String a[];
    public final String b[];
    public final String c;
    public final int d;
    public final int e;

    static a a(JSONObject jsonobject)
    {
        String s = jsonobject.optString("n");
        String s1 = jsonobject.optString("c");
        int i = jsonobject.optInt("st");
        int j = jsonobject.optInt("s");
        if (TextUtils.isEmpty(s1))
        {
            return null;
        } else
        {
            return new <init>(s, i, s1, j);
        }
    }

    (String s, int i, String s1, int j)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        arraylist = new ArrayList(8);
        arraylist1 = new ArrayList(8);
        c = new String(s);
        d = i;
        e = j;
        i = s1.indexOf("#1a");
_L5:
        if (i != -1) goto _L2; else goto _L1
_L1:
        b = (String[])arraylist1.toArray(new String[arraylist1.size()]);
        a = (String[])arraylist.toArray(new String[arraylist.size()]);
        Arrays.sort(a);
        return;
_L2:
        i += 3;
        if (s1.charAt(i) != '#')
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i + 1;
        i = s1.indexOf("#1a", j);
        if (i != -1)
        {
            arraylist1.add(s1.substring(j, i));
        } else
        {
            arraylist1.add(s1.substring(j));
        }
        continue; /* Loop/switch isn't completed */
        if (s1.charAt(i) != '1' || s1.charAt(i + 1) != '#') goto _L1; else goto _L3
_L3:
        j = i + 2;
        i = s1.indexOf("#1a", j);
        if (i != -1)
        {
            arraylist.add(s1.substring(j, i));
        } else
        {
            arraylist.add(s1.substring(j));
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
