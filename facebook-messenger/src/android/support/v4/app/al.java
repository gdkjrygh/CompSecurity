// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            av, au, at, as, 
//            ar

public class al
{

    private static final ar a;

    public al()
    {
    }

    static ar a()
    {
        return a;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new av();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new au();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new at();
        } else
        {
            a = new as();
        }
    }
}
