// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager, OrientationHelper

class 
{

    int a;
    int b;
    boolean c;
    boolean d;
    final StaggeredGridLayoutManager e;

    void a()
    {
        a = -1;
        b = 0x80000000;
        c = false;
        d = false;
    }

    void a(int i)
    {
        if (c)
        {
            b = e.a.d() - i;
            return;
        } else
        {
            b = e.a.c() + i;
            return;
        }
    }

    void b()
    {
        int i;
        if (c)
        {
            i = e.a.d();
        } else
        {
            i = e.a.c();
        }
        b = i;
    }
}
