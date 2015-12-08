// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public static interface Layout
    extends Freezable
{
    public static interface CoverInfo
        extends Freezable
    {

        public abstract int getLeftImageOffset();

        public abstract int getTopImageOffset();

        public abstract boolean hasLeftImageOffset();

        public abstract boolean hasTopImageOffset();
    }

    public static interface CoverPhoto
        extends Freezable
    {

        public abstract int getHeight();

        public abstract String getUrl();

        public abstract int getWidth();

        public abstract boolean hasHeight();

        public abstract boolean hasUrl();

        public abstract boolean hasWidth();
    }

    public static final class Layout
    {

        public static final int BANNER = 0;

        private Layout()
        {
        }
    }


    public abstract CoverInfo getCoverInfo();

    public abstract CoverPhoto getCoverPhoto();

    public abstract int getLayout();

    public abstract boolean hasCoverInfo();

    public abstract boolean hasCoverPhoto();

    public abstract boolean hasLayout();
}
