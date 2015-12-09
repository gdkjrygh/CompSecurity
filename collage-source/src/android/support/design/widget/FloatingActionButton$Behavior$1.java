// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButton, ValueAnimatorCompat

class val.fab
    implements teListener
{

    final loatValue this$0;
    final FloatingActionButton val$fab;

    public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
    {
        ViewCompat.setTranslationY(val$fab, valueanimatorcompat.getAnimatedFloatValue());
    }

    teListener()
    {
        this$0 = final_telistener;
        val$fab = FloatingActionButton.this;
        super();
    }
}
