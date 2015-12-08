// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.services;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fsr.tracker.tasks.HttpGetAsyncTask;
import fs.org.slf4j.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

// Referenced classes of package com.fsr.tracker.services:
//            ExitSurveyServiceClientImpl

class this._cls0 extends HttpGetAsyncTask
{

    final ExitSurveyServiceClientImpl this$0;

    protected com.fsr.tracker.service.tionResult processResponse(HttpResponse httpresponse)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        httpresponse.getEntity().writeTo(bytearrayoutputstream);
        httpresponse = bytearrayoutputstream.toByteArray();
        httpresponse = BitmapFactory.decodeByteArray(httpresponse, 0, httpresponse.length);
        if (httpresponse != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        return com.fsr.tracker.service.tionResult.SERVER_ERROR;
        int i;
        i = httpresponse.getWidth();
        ExitSurveyServiceClientImpl.access$000(ExitSurveyServiceClientImpl.this).debug("Validation returned with width = {}", Integer.valueOf(i));
        i;
        JVM INSTR tableswitch 1 3: default 92
    //                   1 96
    //                   2 100
    //                   3 104;
           goto _L1 _L2 _L3 _L4
_L1:
        return com.fsr.tracker.service.tionResult.UNKNOWN;
_L2:
        return com.fsr.tracker.service.tionResult.VALID;
_L3:
        return com.fsr.tracker.service.tionResult.REQUIRED_FIELD;
_L4:
        httpresponse = com.fsr.tracker.service.tionResult.INVALID_FORMAT;
        return httpresponse;
        httpresponse;
        httpresponse.printStackTrace();
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected volatile Object processResponse(HttpResponse httpresponse)
    {
        return processResponse(httpresponse);
    }

    ionResult(String s)
    {
        this$0 = ExitSurveyServiceClientImpl.this;
        super(s);
    }
}
