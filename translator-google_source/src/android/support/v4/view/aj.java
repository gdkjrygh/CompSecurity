// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            am, al, ak

public final class aj
{

    static final ak a;

    public static int a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return a.a(marginlayoutparams);
    }

    public static int b(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        return a.b(marginlayoutparams);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new am();
        } else
        {
            a = new al();
        }
    }
}
