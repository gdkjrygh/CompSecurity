// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            cn, cl

public final class cm
{

    public int a;
    public int b;

    public cm(Throwable throwable)
    {
label0:
        {
            super();
            a = cn.d.ordinal();
            b = cl.a.ordinal();
            if (throwable != null)
            {
                a = cn.a(throwable);
                if (a != cn.d.ordinal())
                {
                    break label0;
                }
                b = cl.a(throwable).a();
            }
            return;
        }
        b = Integer.parseInt(throwable.getMessage());
    }
}
