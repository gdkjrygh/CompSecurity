// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.util;

import android.graphics.Bitmap;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.skype.android.app.wear.util:
//            WearDataLayerUtil

public static class Reason
    implements g
{
    public static final class Reason extends Enum
    {

        private static final Reason $VALUES[];
        public static final Reason ASSET_IS_NULL;
        public static final Reason DATA_API_ERROR;
        public static final Reason FAILED_TO_DECODE_BITMAP;

        public static Reason valueOf(String s)
        {
            return (Reason)Enum.valueOf(com/skype/android/app/wear/util/WearDataLayerUtil$LoadBitmapFromAssetResult$Reason, s);
        }

        public static Reason[] values()
        {
            return (Reason[])$VALUES.clone();
        }

        static 
        {
            FAILED_TO_DECODE_BITMAP = new Reason("FAILED_TO_DECODE_BITMAP", 0);
            DATA_API_ERROR = new Reason("DATA_API_ERROR", 1);
            ASSET_IS_NULL = new Reason("ASSET_IS_NULL", 2);
            $VALUES = (new Reason[] {
                FAILED_TO_DECODE_BITMAP, DATA_API_ERROR, ASSET_IS_NULL
            });
        }

        private Reason(String s, int i)
        {
            super(s, i);
        }
    }


    private Bitmap bitmap;
    private g dataApiResult;
    private Reason reason;
    private final Status status;

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    public g getDataApiResult()
    {
        return dataApiResult;
    }

    public Reason getFailureReason()
    {
        return reason;
    }

    public Status getStatus()
    {
        return status;
    }

    private Reason(Bitmap bitmap1)
    {
        bitmap = bitmap1;
        status = new Status(0);
    }

    status(Bitmap bitmap1, status status1)
    {
        this(bitmap1);
    }

    private <init>(g g1)
    {
        reason = Reason.DATA_API_ERROR;
        status = new Status(g1.getStatus().e());
        dataApiResult = g1;
    }

    dataApiResult(g g1, dataApiResult dataapiresult)
    {
        this(g1);
    }

    private Reason(Reason reason1)
    {
        reason = reason1;
        status = new Status(13);
    }

    Reason(Reason reason1, Reason reason2)
    {
        this(reason1);
    }
}
