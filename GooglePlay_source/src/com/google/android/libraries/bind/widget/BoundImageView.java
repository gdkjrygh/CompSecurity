// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.libraries.bind.data.Bound;
import com.google.android.libraries.bind.data.BoundHelper;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.util.Util;

public class BoundImageView extends ImageView
    implements Bound
{

    private Integer bindDrawableKey;
    private Integer bindImageUriKey;
    private final BoundHelper boundHelper;
    private Integer currentDrawableRef;

    public BoundImageView(Context context)
    {
        this(context, null);
    }

    public BoundImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BoundImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        boundHelper = new BoundHelper(context, attributeset, this);
        context = context.obtainStyledAttributes(attributeset, com.google.android.libraries.bind.R.styleable.BoundImageView, i, 0);
        bindImageUriKey = BoundHelper.getInteger(context, 0);
        bindDrawableKey = BoundHelper.getInteger(context, 1);
        context.recycle();
    }

    public final void updateBoundData(Data data)
    {
        boundHelper.updateBoundData(data);
        if (bindImageUriKey != null)
        {
            Object obj = data.get(bindImageUriKey.intValue());
            if (obj instanceof Uri)
            {
                setImageURI((Uri)obj);
            } else
            {
                setImageURI(null);
            }
        }
        if (bindDrawableKey != null)
        {
            if (data == null)
            {
                data = null;
            } else
            {
                data = data.getAsInteger(bindDrawableKey.intValue());
            }
            if (!Util.objectsEqual(currentDrawableRef, data))
            {
                currentDrawableRef = data;
                if (data == null)
                {
                    data = null;
                } else
                {
                    data = getContext().getResources().getDrawable(data.intValue());
                }
                setImageDrawable(data);
            }
        }
    }
}
