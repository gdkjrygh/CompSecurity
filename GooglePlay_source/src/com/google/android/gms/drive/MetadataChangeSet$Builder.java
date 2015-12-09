// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;

// Referenced classes of package com.google.android.gms.drive:
//            MetadataChangeSet

public static final class leCustomProperties.Builder
{

    public final MetadataBundle mBag = MetadataBundle.create();
    public com.google.android.gms.drive.metadata.internal..Builder mCustomPropertiesBuilder;

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

    public final mBag setMimeType(String s)
    {
        mBag.put(BasicFields.MIME_TYPE, s);
        return this;
    }

    public final asicFields.MIME_TYPE setTitle(String s)
    {
        mBag.put(BasicFields.TITLE, s);
        return this;
    }

    public leCustomProperties.Builder()
    {
    }
}
