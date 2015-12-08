// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            Toolbar

final class bd
    implements Runnable
{

    final Toolbar a;

    bd(Toolbar toolbar)
    {
        a = toolbar;
        super();
    }

    public final void run()
    {
        a.b();
    }
}
