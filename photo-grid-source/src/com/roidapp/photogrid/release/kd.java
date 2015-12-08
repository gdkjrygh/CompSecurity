// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector, ig

final class kd
    implements android.view.View.OnClickListener
{

    final ig a;
    final ImageSelector b;

    kd(ImageSelector imageselector, ig ig)
    {
        b = imageselector;
        a = ig;
        super();
    }

    public final void onClick(View view)
    {
        ImageSelector.C(b).setVisibility(8);
        Object obj = (View)view.getParent().getParent();
        ImageSelector.D(b).removeView(((View) (obj)));
        view = (String)view.getTag();
        obj = view.substring(view.indexOf("#") + 1);
        ImageSelector.b(b, ((String) (obj)));
        obj = (Bitmap)ImageSelector.E(b).get(view);
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        ImageSelector.l(b);
        ImageSelector.E(b).remove(view);
        ImageSelector.k(b).remove(a);
        ImageSelector.F(b);
    }
}
