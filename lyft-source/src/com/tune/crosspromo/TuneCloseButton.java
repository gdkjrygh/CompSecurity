// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

// Referenced classes of package com.tune.crosspromo:
//            TuneAdActivity, TuneAdClient

class TuneCloseButton extends FrameLayout
{

    android.view.View.OnClickListener a;
    private ImageButton b;
    private TuneAdActivity c;

    public TuneCloseButton(Context context)
    {
        super(context);
        a = new android.view.View.OnClickListener() {

            final TuneCloseButton a;

            public void onClick(View view)
            {
                TuneAdClient.c(TuneCloseButton.b(a).a, TuneCloseButton.b(a).b);
                TuneCloseButton.b(a).finish();
            }

            
            {
                a = TuneCloseButton.this;
                super();
            }
        };
        c = (TuneAdActivity)context;
        b = new ImageButton(context);
        context = getResources().getDisplayMetrics();
        byte abyte0[] = Base64.decode("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", 0);
        Object obj = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        obj = new BitmapDrawable(getResources(), ((android.graphics.Bitmap) (obj)));
        b.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
        float f = ((DisplayMetrics) (context)).density;
        int i = (int)((double)(36F * f) + 0.5D);
        int j = (int)((double)(8F * f) + 0.5D);
        context = new android.widget.FrameLayout.LayoutParams(i, i);
        context.gravity = 53;
        context.setMargins(0, j, j, 0);
        b.setLayoutParams(context);
        b.setOnClickListener(a);
        addView(b);
        post(new Runnable(f) {

            final float a;
            final TuneCloseButton b;

            public void run()
            {
                Object obj1 = new Rect();
                TuneCloseButton.a(b).getHitRect(((Rect) (obj1)));
                int k = (int)((double)(12F * a) + 0.5D);
                obj1.top = ((Rect) (obj1)).top - k;
                obj1.left = ((Rect) (obj1)).left - k;
                obj1.bottom = ((Rect) (obj1)).bottom + k;
                obj1.right = k + ((Rect) (obj1)).right;
                obj1 = new TouchDelegate(((Rect) (obj1)), TuneCloseButton.a(b));
                if (android/view/View.isInstance(TuneCloseButton.a(b).getParent()))
                {
                    ((View)TuneCloseButton.a(b).getParent()).setTouchDelegate(((TouchDelegate) (obj1)));
                }
            }

            
            {
                b = TuneCloseButton.this;
                a = f;
                super();
            }
        });
    }

    static ImageButton a(TuneCloseButton tuneclosebutton)
    {
        return tuneclosebutton.b;
    }

    static TuneAdActivity b(TuneCloseButton tuneclosebutton)
    {
        return tuneclosebutton.c;
    }
}
