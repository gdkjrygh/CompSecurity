// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            ak, aj, ai, ah, 
//            ag, af

public final class z
{

    private static final af a;

    static af a()
    {
        return a;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new ak();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new aj();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new ai();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new ah();
        } else
        {
            a = new ag();
        }
    }
}
