// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.Uri;
import java.util.List;

// Referenced classes of package com.squareup.picasso:
//            Request

public static final class config
{

    private boolean centerCrop;
    private boolean centerInside;
    private android.graphics.der.targetHeight config;
    private boolean hasRotationPivot;
    private boolean onlyScaleDown;
    private  priority;
    private int resourceId;
    private float rotationDegrees;
    private float rotationPivotX;
    private float rotationPivotY;
    private String stableKey;
    private int targetHeight;
    private int targetWidth;
    private List transformations;
    private Uri uri;

    public Request build()
    {
        if (centerInside && centerCrop)
        {
            throw new IllegalStateException("Center crop and center inside can not be used together.");
        }
        if (centerCrop && targetWidth == 0 && targetHeight == 0)
        {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        }
        if (centerInside && targetWidth == 0 && targetHeight == 0)
        {
            throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
        }
        if (priority == null)
        {
            priority = .NORMAL;
        }
        return new Request(uri, resourceId, stableKey, transformations, targetWidth, targetHeight, centerCrop, centerInside, onlyScaleDown, rotationDegrees, rotationPivotX, rotationPivotY, hasRotationPivot, config, priority, null);
    }

    public  centerCrop()
    {
        if (centerInside)
        {
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        } else
        {
            centerCrop = true;
            return this;
        }
    }

    boolean hasImage()
    {
        return uri != null || resourceId != 0;
    }

    boolean hasSize()
    {
        return targetWidth != 0 || targetHeight != 0;
    }

    public targetHeight resize(int i, int j)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }
        if (j < 0)
        {
            throw new IllegalArgumentException("Height must be positive number or 0.");
        }
        if (j == 0 && i == 0)
        {
            throw new IllegalArgumentException("At least one dimension has to be positive number.");
        } else
        {
            targetWidth = i;
            targetHeight = j;
            return this;
        }
    }

    (Uri uri1, int i, android.graphics.der der)
    {
        uri = uri1;
        resourceId = i;
        config = der;
    }
}
