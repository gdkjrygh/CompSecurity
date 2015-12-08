// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gro
{

    public final ekp a;
    public Integer b;

    public gro(ekp ekp1)
    {
        p.a(ekp1);
        a = ekp1;
    }

    public final boolean a(ekp ekp1)
    {
        return a.equals(ekp1);
    }

    public final String toString()
    {
        String s = String.valueOf("{startMedia=");
        String s1 = String.valueOf(a);
        Object obj;
        if (b != null)
        {
            obj = b;
        } else
        {
            obj = "";
        }
        obj = String.valueOf(obj);
        return (new StringBuilder(String.valueOf(s).length() + 16 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(s).append(s1).append(", initialIndex=").append(((String) (obj))).append("}").toString();
    }
}
