// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.x;

// Referenced classes of package com.tinder.adapters:
//            z

public static final class ewById extends android.support.v7.widget.clerView.ViewHolder
    implements x
{

    RelativeLayout a;
    RelativeLayout b;
    TextView c;
    TextView d;
    TextView e;
    ImageView f;
    int g;

    public final void onBitmapFailed(Drawable drawable)
    {
    }

    public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.sso.LoadedFrom loadedfrom)
    {
        f.setImageBitmap(bitmap);
    }

    public final void onPrepareLoad(Drawable drawable)
    {
    }

    public e.Drawable(View view)
    {
        super(view);
        view.setEnabled(false);
        a = (RelativeLayout)view.findViewById(0x7f0e01ff);
        b = (RelativeLayout)view.findViewById(0x7f0e01fd);
        c = (TextView)view.findViewById(0x7f0e0200);
        d = (TextView)view.findViewById(0x7f0e0201);
        e = (TextView)view.findViewById(0x7f0e0202);
        f = (ImageView)view.findViewById(0x7f0e01fe);
    }
}
