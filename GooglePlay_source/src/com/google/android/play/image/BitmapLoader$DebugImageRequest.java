// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.play.utils.config.GservicesValue;
import com.google.android.play.utils.config.PlayG;

// Referenced classes of package com.google.android.play.image:
//            BitmapLoader

public static final class  extends ImageRequest
{

    private static final Matrix IDENTITY = new Matrix();
    private boolean mResponseDelivered;

    protected final void deliverResponse(Bitmap bitmap)
    {
        if (mResponseDelivered)
        {
            return;
        } else
        {
            mResponseDelivered = true;
            super.deliverResponse(bitmap);
            return;
        }
    }

    protected final volatile void deliverResponse(Object obj)
    {
        deliverResponse((Bitmap)obj);
    }

    protected final Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        Response response = super.parseNetworkResponse(networkresponse);
        if (!response.isSuccess() || !((Boolean)PlayG.debugImageSizes.get()).booleanValue())
        {
            return response;
        }
        Bitmap bitmap = (Bitmap)response.result;
        int j = networkresponse.data.length / 1024;
        networkresponse = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(networkresponse);
        canvas.drawBitmap(bitmap, IDENTITY, null);
        Paint paint = new Paint(8);
        float f;
        String s;
        String s1;
        String s2;
        int i;
        if (getUrl().contains("ggpht.com"))
        {
            i = 0xff00ffff;
        } else
        {
            i = -65281;
        }
        paint.setColor(i);
        paint.setStrokeWidth(3F);
        paint.setTextAlign(android.graphics.ImageRequest.getUrl);
        s = String.format("%dk", new Object[] {
            Integer.valueOf(j)
        });
        s1 = String.format("%dh", new Object[] {
            Integer.valueOf(bitmap.getHeight())
        });
        s2 = String.format("%dw", new Object[] {
            Integer.valueOf(bitmap.getWidth())
        });
        f = 40F;
        do
        {
            paint.setTextSize(f);
            if ((double)f * 3.1000000000000001D > (double)canvas.getHeight() || (double)Math.max(Math.max(paint.measureText(s1), paint.measureText(s2)), paint.measureText(s)) * 1.1000000000000001D >= (double)canvas.getWidth())
            {
                f = (float)(0.80000000000000004D * (double)f);
            } else
            {
                float f1 = (float)(canvas.getHeight() / 2) - f;
                canvas.drawText(s, 4F, f1, paint);
                f1 = 5F + f + f1;
                canvas.drawText(s1, 4F, f1, paint);
                canvas.drawText(s2, 4F, f + 5F + f1, paint);
                bitmap.recycle();
                return Response.success(networkresponse, response.cacheEntry);
            }
        } while (true);
    }


    public (String s, int i, int j, android.graphics.ImageRequest imagerequest, com.android.volley.ageRequest agerequest, com.android.volley.ageRequest agerequest1)
    {
        super(s, agerequest, i, j, android.widget.DE, imagerequest, agerequest1);
    }
}
