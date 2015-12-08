// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.provider.BaseColumns;

// Referenced classes of package com.localytics.android:
//            LocalyticsProvider

public static final class I
    implements BaseColumns
{

    public static final String EVENTS_KEY_REF = "events_key_ref";
    public static final String TABLE_NAME = "upload_blob_events";
    public static final String UPLOAD_BLOBS_KEY_REF = "upload_blobs_key_ref";

    private I()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }
}
