// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.services;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fsr.tracker.SurveyUrlBuilder;
import com.fsr.tracker.app.TrackingContext;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.service.Callback;
import com.fsr.tracker.service.ExitSurveyServiceClient;
import com.fsr.tracker.tasks.HttpGetAsyncTask;
import com.fsr.tracker.util.FsrSettings;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

public class ExitSurveyServiceClientImpl
    implements ExitSurveyServiceClient
{

    private Logger logger;

    public ExitSurveyServiceClientImpl()
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
    }

    public Void initializeNotification(String s, String s1, String s2, String s3, String s4, final Callback callback)
    {
        TrackingContext trackingcontext = TrackingContext.Instance();
        try
        {
            s = SurveyUrlBuilder.buildOnExitInitializeUrl((new StringBuilder()).append((new FsrSettings()).getOnExitUrlBase()).append("/initialize?").toString(), s1, s2, s3, s, trackingcontext.getConfiguration().getCpps(), trackingcontext.getConfiguration().getQueryStringParams());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            logger.error(s.getMessage(), s);
            return null;
        }
        s1 = new HttpGetAsyncTask(s4) {

            final ExitSurveyServiceClientImpl this$0;

            protected com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult processResponse(HttpResponse httpresponse)
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                httpresponse.getEntity().writeTo(bytearrayoutputstream);
                httpresponse = bytearrayoutputstream.toByteArray();
                httpresponse = BitmapFactory.decodeByteArray(httpresponse, 0, httpresponse.length);
                if (httpresponse != null)
                {
                    break MISSING_BLOCK_LABEL_41;
                }
                return com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.SERVER_ERROR;
                int i;
                i = httpresponse.getWidth();
                logger.debug("Validation returned with width = {}", Integer.valueOf(i));
                i;
                JVM INSTR tableswitch 1 3: default 92
            //                           1 96
            //                           2 100
            //                           3 104;
                   goto _L1 _L2 _L3 _L4
_L1:
                return com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.UNKNOWN;
_L2:
                return com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.VALID;
_L3:
                return com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.REQUIRED_FIELD;
_L4:
                httpresponse = com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.INVALID_FORMAT;
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

            
            {
                this$0 = ExitSurveyServiceClientImpl.this;
                super(s);
            }
        };
        s1.setCallback(new com.fsr.tracker.tasks.HttpGetAsyncTask.AsyncCallback() {

            final ExitSurveyServiceClientImpl this$0;
            final Callback val$callback;

            public void onComplete(com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult validationresult)
            {
                callback.onComplete(validationresult);
            }

            public volatile void onComplete(Object obj)
            {
                onComplete((com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult)obj);
            }

            public void onFailure(Throwable throwable)
            {
                callback.onFailure(throwable);
            }

            
            {
                this$0 = ExitSurveyServiceClientImpl.this;
                callback = callback1;
                super();
            }
        });
        s1.execute(new String[] {
            s
        });
        return null;
    }

}
