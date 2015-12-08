// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package com.tune.crosspromo:
//            TuneCloseButton

class a
    implements Runnable
{

    final float a;
    final TuneCloseButton b;

    public void run()
    {
        Object obj = new Rect();
        TuneCloseButton.a(b).getHitRect(((Rect) (obj)));
        int i = (int)((double)(12F * a) + 0.5D);
        obj.top = ((Rect) (obj)).top - i;
        obj.left = ((Rect) (obj)).left - i;
        obj.bottom = ((Rect) (obj)).bottom + i;
        obj.right = i + ((Rect) (obj)).right;
        obj = new TouchDelegate(((Rect) (obj)), TuneCloseButton.a(b));
        if (android/view/View.isInstance(TuneCloseButton.a(b).getParent()))
        {
            ((View)TuneCloseButton.a(b).getParent()).setTouchDelegate(((TouchDelegate) (obj)));
        }
    }

    (TuneCloseButton tuneclosebutton, float f)
    {
        b = tuneclosebutton;
        a = f;
        super();
    }
}
