// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.melnykov.fab;

import android.view.ViewTreeObserver;

// Referenced classes of package com.melnykov.fab:
//            FloatingActionButton

class val.animate
    implements android.view.rawListener
{

    final FloatingActionButton this$0;
    final boolean val$animate;
    final boolean val$visible;

    public boolean onPreDraw()
    {
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver.isAlive())
        {
            viewtreeobserver.removeOnPreDrawListener(this);
        }
        FloatingActionButton.access$200(FloatingActionButton.this, val$visible, val$animate, true);
        return true;
    }

    istener()
    {
        this$0 = final_floatingactionbutton;
        val$visible = flag;
        val$animate = Z.this;
        super();
    }
}
