// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            n, i, g, h

static final class 
    implements 
{

    public final g a()
    {
        Object obj;
        if (android.os.d.VERSION.SDK_INT >= 12)
        {
            obj = new i();
        } else
        {
            obj = new h();
        }
        return new g(((nit>) (obj)));
    }

    ()
    {
    }
}
