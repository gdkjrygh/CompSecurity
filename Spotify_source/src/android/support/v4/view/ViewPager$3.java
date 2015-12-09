// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            ViewPager

final class a
    implements Runnable
{

    private ViewPager a;

    public final void run()
    {
        ViewPager.a(a);
        a.d();
    }

    (ViewPager viewpager)
    {
        a = viewpager;
        super();
    }
}
