// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class geg
{

    public static int a()
    {
        return android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public static int a(int i)
    {
        return android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
    }

    public static boolean b(int i)
    {
        return android.view.View.MeasureSpec.getMode(i) == 0x40000000;
    }
}
