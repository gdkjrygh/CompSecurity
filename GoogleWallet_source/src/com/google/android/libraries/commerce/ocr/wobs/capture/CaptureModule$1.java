// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture;

import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeDecoder;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.capture:
//            CaptureModule

final class val.xzingReader
    implements BarcodeDecoder
{

    final MultiFormatReader val$xzingReader;

    public final Result decodeWithState(BinaryBitmap binarybitmap)
        throws NotFoundException
    {
        return val$xzingReader.decodeWithState(binarybitmap);
    }

    public final void reset()
    {
        val$xzingReader.reset();
    }

    public final void setHint(Map map)
    {
        val$xzingReader.setHints(map);
    }

    r()
    {
        val$xzingReader = multiformatreader;
        super();
    }
}
