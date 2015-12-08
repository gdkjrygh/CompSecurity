// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            l, Toolbar, bh

final class bc
    implements l
{

    final Toolbar a;

    bc(Toolbar toolbar)
    {
        a = toolbar;
        super();
    }

    public final boolean a()
    {
        if (Toolbar.a(a) != null)
        {
            return Toolbar.a(a).a();
        } else
        {
            return false;
        }
    }
}
