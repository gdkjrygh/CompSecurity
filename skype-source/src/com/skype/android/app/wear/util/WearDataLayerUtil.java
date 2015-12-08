// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.o;
import java.io.ByteArrayOutputStream;

public class WearDataLayerUtil
{
    public static class LoadBitmapFromAssetResult
        implements g
    {

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

        private LoadBitmapFromAssetResult(Bitmap bitmap1)
        {
            bitmap = bitmap1;
            status = new Status(0);
        }


        private LoadBitmapFromAssetResult(g g1)
        {
            reason = Reason.DATA_API_ERROR;
            status = new Status(g1.getStatus().e());
            dataApiResult = g1;
        }


        private LoadBitmapFromAssetResult(Reason reason1)
        {
            reason = reason1;
            status = new Status(13);
        }

    }

    public static final class LoadBitmapFromAssetResult.Reason extends Enum
    {

        private static final LoadBitmapFromAssetResult.Reason $VALUES[];
        public static final LoadBitmapFromAssetResult.Reason ASSET_IS_NULL;
        public static final LoadBitmapFromAssetResult.Reason DATA_API_ERROR;
        public static final LoadBitmapFromAssetResult.Reason FAILED_TO_DECODE_BITMAP;

        public static LoadBitmapFromAssetResult.Reason valueOf(String s)
        {
            return (LoadBitmapFromAssetResult.Reason)Enum.valueOf(com/skype/android/app/wear/util/WearDataLayerUtil$LoadBitmapFromAssetResult$Reason, s);
        }

        public static LoadBitmapFromAssetResult.Reason[] values()
        {
            return (LoadBitmapFromAssetResult.Reason[])$VALUES.clone();
        }

        static 
        {
            FAILED_TO_DECODE_BITMAP = new LoadBitmapFromAssetResult.Reason("FAILED_TO_DECODE_BITMAP", 0);
            DATA_API_ERROR = new LoadBitmapFromAssetResult.Reason("DATA_API_ERROR", 1);
            ASSET_IS_NULL = new LoadBitmapFromAssetResult.Reason("ASSET_IS_NULL", 2);
            $VALUES = (new LoadBitmapFromAssetResult.Reason[] {
                FAILED_TO_DECODE_BITMAP, DATA_API_ERROR, ASSET_IS_NULL
            });
        }

        private LoadBitmapFromAssetResult.Reason(String s, int i)
        {
            super(s, i);
        }
    }


    public WearDataLayerUtil()
    {
    }

    public static void connectAndRun(c c1, Runnable runnable)
    {
        if (c1.d())
        {
            runnable.run();
            return;
        } else
        {
            c1.a(new com.google.android.gms.common.api.c.b(c1, runnable) {

                final c val$googleApiClient;
                final Runnable val$runnable;

                public final void onConnected(Bundle bundle)
                {
                    googleApiClient.b(this);
                    runnable.run();
                }

                public final void onConnectionSuspended(int i)
                {
                }

            
            {
                googleApiClient = c1;
                runnable = runnable1;
                super();
            }
            });
            c1.b();
            return;
        }
    }

    public static Asset createAssetFromBitmap(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            if (bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream))
            {
                return Asset.a(bytearrayoutputstream.toByteArray());
            }
        }
        return null;
    }

    public static void loadBitmapFromAsset(c c1, Asset asset, h h1)
    {
        if (asset == null)
        {
            h1.onResult(new LoadBitmapFromAssetResult(LoadBitmapFromAssetResult.Reason.ASSET_IS_NULL));
        }
        o.a.a(c1, asset).a(new h(h1) {

            final h val$resultCallback;

            public final volatile void onResult(g g)
            {
                onResult((com.google.android.gms.wearable.c.d)g);
            }

            public final void onResult(com.google.android.gms.wearable.c.d d)
            {
                if (d.getStatus().d())
                {
                    break MISSING_BLOCK_LABEL_37;
                }
                resultCallback.onResult(new LoadBitmapFromAssetResult(d));
                d.a();
                return;
                Object obj = d.b();
                if (obj != null)
                {
                    break MISSING_BLOCK_LABEL_68;
                }
                resultCallback.onResult(new LoadBitmapFromAssetResult(LoadBitmapFromAssetResult.Reason.FAILED_TO_DECODE_BITMAP));
                obj = BitmapFactory.decodeStream(((java.io.InputStream) (obj)));
                if (obj != null) goto _L2; else goto _L1
_L1:
                resultCallback.onResult(new LoadBitmapFromAssetResult(LoadBitmapFromAssetResult.Reason.FAILED_TO_DECODE_BITMAP));
_L4:
                d.a();
                return;
_L2:
                resultCallback.onResult(new LoadBitmapFromAssetResult(((Bitmap) (obj))));
                if (true) goto _L4; else goto _L3
_L3:
                Exception exception;
                exception;
                d.a();
                throw exception;
            }

            
            {
                resultCallback = h1;
                super();
            }
        });
    }
}
