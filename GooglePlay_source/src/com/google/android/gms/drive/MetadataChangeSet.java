// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.graphics.Bitmap;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;
import java.util.Collections;
import java.util.Map;

public final class MetadataChangeSet
{
    public static final class Builder
    {

        public final MetadataBundle mBag = MetadataBundle.create();
        public com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.Builder mCustomPropertiesBuilder;

        public static void checkSize(String s, int i, int j)
        {
            boolean flag;
            if (j <= i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, String.format("%s must be no more than %d bytes, but is %d bytes.", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            }));
        }

        public static int getUtf8EncodedByteLength(String s)
        {
            if (s == null)
            {
                return 0;
            } else
            {
                return s.getBytes().length;
            }
        }

        public final MetadataChangeSet build()
        {
            if (mCustomPropertiesBuilder != null)
            {
                mBag.put(BasicFields.CUSTOM_FILE_PROPERTIES, mCustomPropertiesBuilder.build());
            }
            return new MetadataChangeSet(mBag);
        }

        public final Builder setMimeType(String s)
        {
            mBag.put(BasicFields.MIME_TYPE, s);
            return this;
        }

        public final Builder setTitle(String s)
        {
            mBag.put(BasicFields.TITLE, s);
            return this;
        }

        public Builder()
        {
        }
    }


    public static final MetadataChangeSet EMPTY_CHANGESET = new MetadataChangeSet(MetadataBundle.create());
    public final MetadataBundle mBag;

    public MetadataChangeSet(MetadataBundle metadatabundle)
    {
        mBag = MetadataBundle.copyOf(metadatabundle);
    }

    public static MetadataChangeSet copyOf(MetadataChangeSet metadatachangeset)
    {
        return new MetadataChangeSet(metadatachangeset.mBag);
    }

    public final Map getCustomPropertyChangeMap()
    {
        AppVisibleCustomProperties appvisiblecustomproperties = (AppVisibleCustomProperties)mBag.get(BasicFields.CUSTOM_FILE_PROPERTIES);
        if (appvisiblecustomproperties == null)
        {
            return Collections.emptyMap();
        } else
        {
            return appvisiblecustomproperties.asMap();
        }
    }

    public final String getDescription()
    {
        return (String)mBag.get(BasicFields.DESCRIPTION);
    }

    public final String getMimeType()
    {
        return (String)mBag.get(BasicFields.MIME_TYPE);
    }

    public final Bitmap getThumbnail()
    {
        BitmapTeleporter bitmapteleporter = (BitmapTeleporter)mBag.get(BasicFields.THUMBNAIL);
        if (bitmapteleporter == null)
        {
            return null;
        } else
        {
            return bitmapteleporter.get();
        }
    }

}
