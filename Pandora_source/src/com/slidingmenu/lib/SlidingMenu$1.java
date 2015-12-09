// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.slidingmenu.lib;


// Referenced classes of package com.slidingmenu.lib:
//            SlidingMenu

class a
    implements e.a
{

    final SlidingMenu a;

    public void a(int i)
    {
        if ((i == 0 || i == 2) && SlidingMenu.a(a) != null)
        {
            SlidingMenu.a(a).a();
        } else
        if (i == 1 && SlidingMenu.b(a) != null)
        {
            SlidingMenu.b(a).a();
            return;
        }
    }

    public void a(int i, float f, int j)
    {
    }

    e.a(SlidingMenu slidingmenu)
    {
        a = slidingmenu;
        super();
    }
}
