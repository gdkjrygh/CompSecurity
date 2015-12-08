// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import kik.android.widget.cs;
import kik.android.widget.w;

// Referenced classes of package com.kik.cache:
//            ContactImageView

public class RectContactImageView extends ContactImageView
{

    public RectContactImageView(Context context)
    {
        super(context);
    }

    public RectContactImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public RectContactImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final w a(Bitmap bitmap, String s)
    {
        return new cs(bitmap, s);
    }
}
