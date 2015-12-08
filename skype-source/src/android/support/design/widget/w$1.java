// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            w, r, p, q

static final class 
    implements 
{

    public final p a()
    {
        Object obj;
        if (android.os.d.VERSION.SDK_INT >= 12)
        {
            obj = new r();
        } else
        {
            obj = new q();
        }
        return new p(((nit>) (obj)));
    }

    ()
    {
    }
}
