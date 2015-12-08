// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.json.JSONArray;

// Referenced classes of package crittercism.android:
//            o, au, p

public final class w
    implements o
{
    public static final class a
        implements p
    {

        public final o a(JSONArray jsonarray)
        {
            return new w(jsonarray);
        }

        public a()
        {
        }
    }


    public static final w a = new w("session_start");
    private String b;
    private String c;

    public w(String s)
    {
        this(s, au.a.a());
    }

    private w(String s, String s1)
    {
        String s2 = s;
        if (s.length() > 140)
        {
            s2 = s.substring(0, 140);
        }
        b = s2;
        c = s1;
    }

    public w(JSONArray jsonarray)
    {
        this(jsonarray.getString(0), jsonarray.getString(1));
    }

    public final Object b()
    {
        return (new JSONArray()).put(b).put(c);
    }

}
