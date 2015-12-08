// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.lyft.scoop;

import android.view.View;

// Referenced classes of package com.lyft.scoop:
//            SimpleUiContainer, IScreenTransition

class c
    implements back
{

    final IScreenTransition a;
    final View b;
    final View c;
    final SimpleUiContainer d;

    public void a(View view, int i, int j)
    {
        a.a(d, b, c);
    }

    back(SimpleUiContainer simpleuicontainer, IScreenTransition iscreentransition, View view, View view1)
    {
        d = simpleuicontainer;
        a = iscreentransition;
        b = view;
        c = view1;
        super();
    }
}
