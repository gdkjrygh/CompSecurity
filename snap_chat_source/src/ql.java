// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;

public final class ql extends oD
{

    private static final String PATH = "/bq/upload_failed_purchase";
    private static final String TAG = "UploadFailedPurchaseTask";
    private final String mProductId;
    private final Se mProductType;
    private final long mPurchaseTimestamp;

    public ql(String s, Se se, long l)
    {
        mProductId = s;
        mProductType = se;
        mPurchaseTimestamp = l;
    }

    public final String getPath()
    {
        return "/bq/upload_failed_purchase";
    }

    public final pn getRequestPayload()
    {
        QO qo = (new QO()).b(mProductId).a(mProductType.toString()).a(Long.valueOf(mPurchaseTimestamp));
        return new oO(buildAuthPayload((new Tl()).a(qo)));
    }

    public final void onResult(pi pi1)
    {
        if (pi1.c())
        {
            Timber.c("UploadFailedPurchaseTask", "Successfully uploaded failed purchase information", new Object[0]);
            return;
        } else
        {
            Timber.c("UploadFailedPurchaseTask", (new StringBuilder("Failed to upload purchase information: ")).append(pi1.mResponseCode).toString(), new Object[0]);
            return;
        }
    }
}
