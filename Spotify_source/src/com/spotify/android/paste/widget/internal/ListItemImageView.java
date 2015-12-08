// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class ListItemImageView extends ImageView
{

    public ListItemImageView(Context context)
    {
        super(context);
        boolean flag;
        if (getDrawable() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public ListItemImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        boolean flag;
        if (getDrawable() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public ListItemImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        boolean flag;
        if (getDrawable() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    private void a(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
    }

    protected final void onMeasure(int i, int j)
    {
        i = Math.min(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), j));
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000));
    }

    public final void setImageBitmap(Bitmap bitmap)
    {
        boolean flag;
        if (bitmap != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        super.setImageBitmap(bitmap);
    }

    public final void setImageDrawable(Drawable drawable)
    {
        boolean flag;
        if (drawable != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        super.setImageDrawable(drawable);
    }

    public final void setImageResource(int i)
    {
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        super.setImageResource(i);
    }

    public final void setImageURI(Uri uri)
    {
        boolean flag;
        if (uri != null && !uri.equals(Uri.EMPTY))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        super.setImageURI(uri);
    }
}
