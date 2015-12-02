// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;


// Referenced classes of package com.facebook.widget.listview:
//            BetterListView

class b
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final BetterListView a;

    b(BetterListView betterlistview)
    {
        a = betterlistview;
        super();
    }

    public boolean onPreDraw()
    {
        a.a();
        return true;
    }
}
