// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.picasso:
//            Transformation

public final class Request
{
    public static final class Builder
    {

        private boolean centerCrop;
        private boolean centerInside;
        private android.graphics.Bitmap.Config config;
        private boolean hasRotationPivot;
        private int resourceId;
        private float rotationDegrees;
        private float rotationPivotX;
        private float rotationPivotY;
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
            if (centerCrop && targetWidth == 0)
            {
                throw new IllegalStateException("Center crop requires calling resize.");
            }
            if (centerInside && targetWidth == 0)
            {
                throw new IllegalStateException("Center inside requires calling resize.");
            } else
            {
                return new Request(uri, resourceId, transformations, targetWidth, targetHeight, centerCrop, centerInside, rotationDegrees, rotationPivotX, rotationPivotY, hasRotationPivot, config);
            }
        }

        public Builder centerCrop()
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

        public Builder centerInside()
        {
            if (centerCrop)
            {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            } else
            {
                centerInside = true;
                return this;
            }
        }

        public Builder clearCenterCrop()
        {
            centerCrop = false;
            return this;
        }

        public Builder clearCenterInside()
        {
            centerInside = false;
            return this;
        }

        public Builder clearResize()
        {
            targetWidth = 0;
            targetHeight = 0;
            centerCrop = false;
            centerInside = false;
            return this;
        }

        public Builder clearRotation()
        {
            rotationDegrees = 0.0F;
            rotationPivotX = 0.0F;
            rotationPivotY = 0.0F;
            hasRotationPivot = false;
            return this;
        }

        public Builder config(android.graphics.Bitmap.Config config1)
        {
            config = config1;
            return this;
        }

        boolean hasImage()
        {
            return uri != null || resourceId != 0;
        }

        boolean hasSize()
        {
            return targetWidth != 0;
        }

        public Builder resize(int i, int j)
        {
            if (i <= 0)
            {
                throw new IllegalArgumentException("Width must be positive number.");
            }
            if (j <= 0)
            {
                throw new IllegalArgumentException("Height must be positive number.");
            } else
            {
                targetWidth = i;
                targetHeight = j;
                return this;
            }
        }

        public Builder rotate(float f)
        {
            rotationDegrees = f;
            return this;
        }

        public Builder rotate(float f, float f1, float f2)
        {
            rotationDegrees = f;
            rotationPivotX = f1;
            rotationPivotY = f2;
            hasRotationPivot = true;
            return this;
        }

        public Builder setResourceId(int i)
        {
            if (i == 0)
            {
                throw new IllegalArgumentException("Image resource ID may not be 0.");
            } else
            {
                resourceId = i;
                uri = null;
                return this;
            }
        }

        public Builder setUri(Uri uri1)
        {
            if (uri1 == null)
            {
                throw new IllegalArgumentException("Image URI may not be null.");
            } else
            {
                uri = uri1;
                resourceId = 0;
                return this;
            }
        }

        public Builder transform(Transformation transformation)
        {
            if (transformation == null)
            {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (transformations == null)
            {
                transformations = new ArrayList(2);
            }
            transformations.add(transformation);
            return this;
        }

        public Builder(int i)
        {
            setResourceId(i);
        }

        public Builder(Uri uri1)
        {
            setUri(uri1);
        }

        Builder(Uri uri1, int i)
        {
            uri = uri1;
            resourceId = i;
        }

        private Builder(Request request)
        {
            uri = request.uri;
            resourceId = request.resourceId;
            targetWidth = request.targetWidth;
            targetHeight = request.targetHeight;
            centerCrop = request.centerCrop;
            centerInside = request.centerInside;
            rotationDegrees = request.rotationDegrees;
            rotationPivotX = request.rotationPivotX;
            rotationPivotY = request.rotationPivotY;
            hasRotationPivot = request.hasRotationPivot;
            if (request.transformations != null)
            {
                transformations = new ArrayList(request.transformations);
            }
            config = request.config;
        }

    }


    private static final long TOO_LONG_LOG;
    public final boolean centerCrop;
    public final boolean centerInside;
    public final android.graphics.Bitmap.Config config;
    public final boolean hasRotationPivot;
    int id;
    public final int resourceId;
    public final float rotationDegrees;
    public final float rotationPivotX;
    public final float rotationPivotY;
    long started;
    public final int targetHeight;
    public final int targetWidth;
    public final List transformations;
    public final Uri uri;

    private Request(Uri uri1, int i, List list, int j, int k, boolean flag, boolean flag1, 
            float f, float f1, float f2, boolean flag2, android.graphics.Bitmap.Config config1)
    {
        uri = uri1;
        resourceId = i;
        if (list == null)
        {
            transformations = null;
        } else
        {
            transformations = Collections.unmodifiableList(list);
        }
        targetWidth = j;
        targetHeight = k;
        centerCrop = flag;
        centerInside = flag1;
        rotationDegrees = f;
        rotationPivotX = f1;
        rotationPivotY = f2;
        hasRotationPivot = flag2;
        config = config1;
    }


    public Builder buildUpon()
    {
        return new Builder(this);
    }

    String getName()
    {
        if (uri != null)
        {
            return uri.getPath();
        } else
        {
            return Integer.toHexString(resourceId);
        }
    }

    boolean hasCustomTransformations()
    {
        return transformations != null;
    }

    public boolean hasSize()
    {
        return targetWidth != 0;
    }

    String logId()
    {
        long l = System.nanoTime() - started;
        if (l > TOO_LONG_LOG)
        {
            return (new StringBuilder()).append(plainId()).append('+').append(TimeUnit.NANOSECONDS.toSeconds(l)).append('s').toString();
        } else
        {
            return (new StringBuilder()).append(plainId()).append('+').append(TimeUnit.NANOSECONDS.toMillis(l)).append("ms").toString();
        }
    }

    boolean needsMatrixTransform()
    {
        return targetWidth != 0 || rotationDegrees != 0.0F;
    }

    boolean needsTransformation()
    {
        return needsMatrixTransform() || hasCustomTransformations();
    }

    String plainId()
    {
        return (new StringBuilder()).append("[R").append(id).append(']').toString();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Request{");
        if (resourceId > 0)
        {
            stringbuilder.append(resourceId);
        } else
        {
            stringbuilder.append(uri);
        }
        if (transformations != null && !transformations.isEmpty())
        {
            Transformation transformation;
            for (Iterator iterator = transformations.iterator(); iterator.hasNext(); stringbuilder.append(' ').append(transformation.key()))
            {
                transformation = (Transformation)iterator.next();
            }

        }
        if (targetWidth > 0)
        {
            stringbuilder.append(" resize(").append(targetWidth).append(',').append(targetHeight).append(')');
        }
        if (centerCrop)
        {
            stringbuilder.append(" centerCrop");
        }
        if (centerInside)
        {
            stringbuilder.append(" centerInside");
        }
        if (rotationDegrees != 0.0F)
        {
            stringbuilder.append(" rotation(").append(rotationDegrees);
            if (hasRotationPivot)
            {
                stringbuilder.append(" @ ").append(rotationPivotX).append(',').append(rotationPivotY);
            }
            stringbuilder.append(')');
        }
        if (config != null)
        {
            stringbuilder.append(' ').append(config);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        TOO_LONG_LOG = TimeUnit.SECONDS.toNanos(5L);
    }
}
