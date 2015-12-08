// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.roidapp.photogrid.release.ig;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity

final class bo
    implements android.view.View.OnClickListener
{

    final ig a;
    final SelectorBaseActivity b;

    bo(SelectorBaseActivity selectorbaseactivity, ig ig)
    {
        b = selectorbaseactivity;
        a = ig;
        super();
    }

    public final void onClick(View view)
    {
        b.i.setVisibility(8);
        Object obj = (View)view.getParent().getParent();
        b.e.removeView(((View) (obj)));
        view = (String)view.getTag();
        obj = (Bitmap)b.k.get(view);
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        SelectorBaseActivity.a(b);
        b.k.remove(view);
        Log.e("delete_tag", view);
        b.l.remove(a);
        b.g();
    }
}
