// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import dfo;
import dfv;
import dgo;
import dmz;
import gji;
import gjj;
import gwi;

public class CircleImageCompoundTextView extends TextView
    implements gwi
{

    public gji a;

    public CircleImageCompoundTextView(Context context)
    {
        super(context);
        dgo.b(getContext(), this, 0x7f0101d6);
        setGravity(16);
        dmz.a(gjj);
        a = gjj.a(context);
    }

    public CircleImageCompoundTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        dgo.b(getContext(), this, 0x7f0101d6);
        setGravity(16);
        dmz.a(gjj);
        a = gjj.a(context);
    }

    public CircleImageCompoundTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        dgo.b(getContext(), this, 0x7f0101d6);
        setGravity(16);
        dmz.a(gjj);
        a = gjj.a(context);
    }

    public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        setCompoundDrawablesWithIntrinsicBounds(dfo.a().a(bitmap), null, null, null);
    }

    public final void a(Drawable drawable)
    {
        if (drawable != null)
        {
            int i = getResources().getDimensionPixelSize(0x7f0c00a1);
            drawable.setBounds(0, 0, i, i);
            setCompoundDrawables(drawable, null, null, null);
        }
    }

    public final void b(Drawable drawable)
    {
        if (drawable != null)
        {
            int i = getResources().getDimensionPixelSize(0x7f0c00a1);
            drawable.setBounds(0, 0, i, i);
            setCompoundDrawables(drawable, null, null, null);
        }
    }
}
