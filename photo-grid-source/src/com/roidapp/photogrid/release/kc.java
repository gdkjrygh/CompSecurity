// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector, kg, ig

final class kc
    implements android.view.View.OnClickListener
{

    final ig a;
    final ImageSelector b;

    kc(ImageSelector imageselector, ig ig)
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
        obj = (String)view.getTag();
        view = ((String) (obj)).substring(((String) (obj)).indexOf("#") + 1);
        ImageSelector.b(b, view);
        Bitmap bitmap = (Bitmap)ImageSelector.E(b).get(obj);
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        ImageSelector.l(b);
        ImageSelector.E(b).remove(obj);
        ImageSelector.k(b).remove(a);
        ImageSelector.F(b);
        obj = b.getSupportFragmentManager().findFragmentByTag("FragmentImagePreview");
        if (obj != null)
        {
            ((kg)obj).a(view);
        }
    }
}
