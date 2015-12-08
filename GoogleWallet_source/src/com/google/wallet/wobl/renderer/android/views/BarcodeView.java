// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.google.wallet.wobl.renderer.common.BarcodeRenderUtils;
import com.google.zxing.common.BitMatrix;
import java.util.Arrays;

public class BarcodeView extends View
{
    static interface BarcodeRenderListener
    {

        public abstract void onErrorRenderingBarcode();

        public abstract void onReset();
    }


    private static final int OFF_COLOR = -1;
    private static final int ON_COLOR = 0xff000000;
    private static final String TAG = com/google/wallet/wobl/renderer/android/views/BarcodeView.getSimpleName();
    private final int barcode1dNonSquareHeightPx;
    private final int barcode2dNonSquareHeightPx;
    private final int barcodeMaxWidthPx;
    final Rect barcodeRect = new Rect();
    private com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodeType;
    private String data;
    private int gravity;
    boolean hasErrorRenderingBarcode;
    private BarcodeRenderListener listener;
    Bitmap renderedBarcode;

    public BarcodeView(Context context)
    {
        super(context);
        hasErrorRenderingBarcode = false;
        barcodeMaxWidthPx = context.getResources().getDimensionPixelSize(com.google.wallet.wobl.renderer.android.R.dimen.barcode_max_width);
        barcode1dNonSquareHeightPx = context.getResources().getDimensionPixelSize(com.google.wallet.wobl.renderer.android.R.dimen.barcode_1d_non_square_height);
        barcode2dNonSquareHeightPx = context.getResources().getDimensionPixelSize(com.google.wallet.wobl.renderer.android.R.dimen.barcode_2d_non_square_height);
    }

    private void errorRenderingBarcode()
    {
        hasErrorRenderingBarcode = true;
        if (listener != null)
        {
            listener.onErrorRenderingBarcode();
        }
    }

    private int measureHeight(int i, Rect rect)
    {
        int j;
        int k;
        j = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        if (hasErrorRenderingBarcode)
        {
            i = 0;
        } else
        if (barcodeType.isSquare())
        {
            i = rect.width();
        } else
        if (barcodeType.is2d())
        {
            i = barcode2dNonSquareHeightPx;
        } else
        {
            i = barcode1dNonSquareHeightPx;
        }
        j;
        JVM INSTR lookupswitch 3: default 56
    //                   -2147483648: 125
    //                   0: 120
    //                   1073741824: 135;
           goto _L1 _L2 _L3 _L4
_L1:
        j = k;
_L6:
        rect.top = 0;
        rect.bottom = rect.top + i;
        return j;
_L3:
        j = i;
        continue; /* Loop/switch isn't completed */
_L2:
        j = Math.min(k, i);
        continue; /* Loop/switch isn't completed */
_L4:
        j = k;
        if (i > k)
        {
            errorRenderingBarcode();
            j = k;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int measureWidth(int i, Rect rect)
    {
        int j;
        j = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        j;
        JVM INSTR lookupswitch 2: default 36
    //                   -2147483648: 125
    //                   0: 117;
           goto _L1 _L2 _L3
_L1:
        if (i <= barcodeMaxWidthPx) goto _L5; else goto _L4
_L4:
        j = i - barcodeMaxWidthPx;
        gravity & 7;
        JVM INSTR tableswitch 3 5: default 84
    //                   3 137
    //                   4 84
    //                   5 158;
           goto _L6 _L7 _L6 _L8
_L6:
        rect.left = j / 2;
        rect.right = rect.left + barcodeMaxWidthPx;
_L9:
        if (rect.width() <= 0)
        {
            errorRenderingBarcode();
        }
        return i;
_L3:
        i = barcodeMaxWidthPx;
          goto _L1
_L2:
        i = Math.min(i, barcodeMaxWidthPx);
          goto _L1
_L7:
        rect.left = 0;
        rect.right = rect.left + barcodeMaxWidthPx;
          goto _L9
_L8:
        rect.left = j;
        rect.right = rect.left + barcodeMaxWidthPx;
          goto _L9
_L5:
        rect.left = 0;
        rect.right = rect.left + i;
          goto _L9
    }

    private void reset()
    {
        hasErrorRenderingBarcode = false;
        if (listener != null)
        {
            listener.onReset();
        }
    }

    Bitmap generateBarcodeBitmap(String s, com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype, int i, int j)
    {
        BitMatrix bitmatrix = null;
        if (!hasErrorRenderingBarcode) goto _L2; else goto _L1
_L1:
        s = bitmatrix;
_L4:
        return s;
_L2:
        try
        {
            bitmatrix = BarcodeRenderUtils.renderPaddingIfNecessary(barcodetype, BarcodeRenderUtils.generateBarcodeBitMatrix(s, barcodetype, i, j));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            errorRenderingBarcode();
            requestLayout();
            Log.e(TAG, "ZXing could not render barcode. Defaulting to blank.", s);
            return null;
        }
        s = new int[bitmatrix.getWidth() * bitmatrix.getHeight()];
        Arrays.fill(s, -1);
        for (int k = 0; k < bitmatrix.getHeight(); k++)
        {
            for (int l = 0; l < bitmatrix.getWidth(); l++)
            {
                if (bitmatrix.get(l, k))
                {
                    s[bitmatrix.getWidth() * k + l] = 0xff000000;
                }
            }

        }

        barcodetype = Bitmap.createBitmap(s, bitmatrix.getWidth(), bitmatrix.getHeight(), android.graphics.Bitmap.Config.RGB_565);
        if (bitmatrix.getHeight() != j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = barcodetype;
        if (bitmatrix.getWidth() == i) goto _L4; else goto _L3
_L3:
        return Bitmap.createScaledBitmap(barcodetype, i, j, false);
    }

    protected void onDraw(Canvas canvas)
    {
        if (data != null && barcodeType != null)
        {
            if (renderedBarcode == null || renderedBarcode.getWidth() != barcodeRect.width() || renderedBarcode.getHeight() != barcodeRect.height())
            {
                renderedBarcode = generateBarcodeBitmap(data, barcodeType, barcodeRect.width(), barcodeRect.height());
            }
            if (!hasErrorRenderingBarcode)
            {
                canvas.drawBitmap(renderedBarcode, barcodeRect.left, barcodeRect.top, null);
                canvas = ((Activity)getContext()).getWindow().getAttributes();
                canvas.screenBrightness = 1.0F;
                ((Activity)getContext()).getWindow().setAttributes(canvas);
                return;
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        barcodeRect.setEmpty();
        setMeasuredDimension(measureWidth(i, barcodeRect), measureHeight(j, barcodeRect));
    }

    public void setData(String s, com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype)
    {
        reset();
        data = s;
        barcodeType = barcodetype;
        if (barcodetype == null)
        {
            errorRenderingBarcode();
        }
        renderedBarcode = null;
        requestLayout();
    }

    public void setGravity(int i)
    {
        gravity = i;
    }

    public void setListener(BarcodeRenderListener barcoderenderlistener)
    {
        listener = barcoderenderlistener;
    }

}
