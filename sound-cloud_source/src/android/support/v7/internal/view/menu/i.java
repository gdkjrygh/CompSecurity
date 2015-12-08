// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;


// Referenced classes of package android.support.v7.internal.view.menu:
//            h, f

final class i
    implements android.support.v4.view.ActionProvider.VisibilityListener
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public final void onActionProviderVisibilityChanged(boolean flag)
    {
        h.a(a).f();
    }
}
