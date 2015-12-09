// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.FileInputStream;

public final class PeopleClientUtil
{

    public static Bitmap decodeFileDescriptor(ParcelFileDescriptor parcelfiledescriptor)
    {
        if (parcelfiledescriptor == null)
        {
            return null;
        }
        parcelfiledescriptor = new FileInputStream(parcelfiledescriptor.getFileDescriptor());
        Bitmap bitmap = BitmapFactory.decodeStream(parcelfiledescriptor);
        IOUtils.closeQuietly(parcelfiledescriptor);
        return bitmap;
        Exception exception;
        exception;
        IOUtils.closeQuietly(parcelfiledescriptor);
        throw exception;
    }
}
