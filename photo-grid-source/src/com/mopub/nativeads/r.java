// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Numbers;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mopub.nativeads:
//            a, an, q, s

final class r extends a
{

    private final Context a;
    private final CustomEventNative.CustomEventNativeListener b;
    private final JSONObject c;

    r(Context context, JSONObject jsonobject, CustomEventNative.CustomEventNativeListener customeventnativelistener)
    {
        c = jsonobject;
        a = context;
        b = customeventnativelistener;
    }

    static CustomEventNative.CustomEventNativeListener a(r r1)
    {
        return r1.b;
    }

    private void a(Object obj)
    {
        if (!(obj instanceof JSONArray))
        {
            throw new ClassCastException("Expected impression trackers of type JSONArray.");
        }
        obj = (JSONArray)obj;
        int i = 0;
        while (i < ((JSONArray) (obj)).length()) 
        {
            try
            {
                g(((JSONArray) (obj)).getString(i));
            }
            catch (JSONException jsonexception)
            {
                MoPubLog.d("Unable to parse impression trackers.");
            }
            i++;
        }
    }

    private List b()
    {
        ArrayList arraylist = new ArrayList(getExtras().size());
        Iterator iterator = getExtras().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            String s1 = (String)entry.getKey();
            boolean flag;
            if (s1 != null && s1.toLowerCase(Locale.US).endsWith("image"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && (entry.getValue() instanceof String))
            {
                arraylist.add((String)entry.getValue());
            }
        } while (true);
        return arraylist;
    }

    final void a()
    {
        Object obj;
        obj = c;
        HashSet hashset = new HashSet();
        for (obj = ((JSONObject) (obj)).keys(); ((Iterator) (obj)).hasNext(); hashset.add(((Iterator) (obj)).next())) { }
        if (!hashset.containsAll(an.c))
        {
            throw new IllegalArgumentException("JSONObject did not contain required keys.");
        }
        obj = c.keys();
_L16:
        String s1;
        an an1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (String)((Iterator) (obj)).next();
        an1 = an.a(s1);
        if (an1 == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        try
        {
            obj1 = c.opt(s1);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalArgumentException((new StringBuilder("JSONObject key (")).append(s1).append(") contained unexpected value.").toString());
        }
        q.a[an1.ordinal()];
        JVM INSTR tableswitch 1 9: default 443
    //                   1 257
    //                   2 269
    //                   3 281
    //                   4 73
    //                   5 290
    //                   6 302
    //                   7 314
    //                   8 326
    //                   9 338;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L7:
        if (false)
        {
        }
        continue; /* Loop/switch isn't completed */
_L3:
        MoPubLog.d((new StringBuilder("Unable to add JSON key to internal mapping: ")).append(an1.a).toString());
        continue; /* Loop/switch isn't completed */
_L14:
        if (!an1.b)
        {
            MoPubLog.d((new StringBuilder("Ignoring class cast exception for optional key: ")).append(an1.a).toString());
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
_L4:
        try
        {
            a((String)obj1);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        if (true) goto _L14; else goto _L13
_L5:
        b((String)obj1);
        continue; /* Loop/switch isn't completed */
_L6:
        a(obj1);
        continue; /* Loop/switch isn't completed */
_L8:
        c((String)obj1);
        continue; /* Loop/switch isn't completed */
_L9:
        d((String)obj1);
        continue; /* Loop/switch isn't completed */
_L10:
        e((String)obj1);
        continue; /* Loop/switch isn't completed */
_L11:
        f((String)obj1);
        continue; /* Loop/switch isn't completed */
_L12:
        a(Numbers.parseDouble(obj1));
        continue; /* Loop/switch isn't completed */
_L13:
        throw obj1;
_L2:
        a(s1, c.opt(s1));
        if (true) goto _L16; else goto _L15
_L15:
        Context context = a;
        ArrayList arraylist = new ArrayList();
        if (getMainImageUrl() != null)
        {
            arraylist.add(getMainImageUrl());
        }
        if (getIconImageUrl() != null)
        {
            arraylist.add(getIconImageUrl());
        }
        arraylist.addAll(b());
        a(context, ((List) (arraylist)), ((CustomEventNative.ImageListener) (new s(this))));
        return;
    }
}
