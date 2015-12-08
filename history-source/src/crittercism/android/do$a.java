// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            dm, do, dn

public static final class <init> extends dm
{
    public static final class a
        implements dn
    {

        public final dm a(String s)
        {
            if (s == null)
            {
                throw new NullPointerException("packageName cannot be null");
            } else
            {
                return new do.a(s, (byte)0);
            }
        }

        public a()
        {
        }
    }


    private String a;

    public final String a()
    {
        return (new StringBuilder("http://www.amazon.com/gp/mas/dl/android?p=")).append(a).toString();
    }

    private a(String s)
    {
        a = s;
    }

    a(String s, byte byte0)
    {
        this(s);
    }
}
