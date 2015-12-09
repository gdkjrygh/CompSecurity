// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import com.pandora.radio.util.b;
import com.pandora.radio.util.i;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.pandora.radio.data:
//            ac, aa, d, c

public class ab extends b
{

    public static aa a(long l, JSONObject jsonobject)
        throws JSONException
    {
        ac ac1 = a(jsonobject);
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ac.values().length];
                try
                {
                    a[ac.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.data.ac.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ac.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[ac1.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("unexpected track type ").append(ac1).toString());

        case 1: // '\001'
            return b(l, jsonobject);

        case 2: // '\002'
            return a(l, jsonobject.getString("adToken"));

        case 3: // '\003'
            break;
        }
        if (jsonobject == null)
        {
            return new aa(l);
        } else
        {
            return new aa(l, jsonobject);
        }
    }

    private static ac a(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return ac.a;
        }
        String s = jsonobject.optString("trackType", null);
        if (!i.a(s))
        {
            jsonobject = ac.values();
            for (int j = 0; j < jsonobject.length; j++)
            {
                if (s.equals(jsonobject[j].name()))
                {
                    return jsonobject[j];
                }
            }

            return ac.a;
        }
        if (jsonobject.has("adToken"))
        {
            return com.pandora.radio.data.ac.b;
        } else
        {
            return ac.a;
        }
    }

    public static d a(long l, String s)
    {
        return new d(l, s);
    }

    public static c b(long l, JSONObject jsonobject)
        throws JSONException
    {
        return new c(l, jsonobject);
    }
}
