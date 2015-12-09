// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture;

import com.google.android.libraries.commerce.ocr.capture.DecoratingOcrHandler;
import com.google.android.libraries.commerce.ocr.wobs.fragments.TransitionHandler;
import java.util.TimerTask;

public final class WobsActionDecoratingResponseHandler extends DecoratingOcrHandler
{
    public static final class OcrAttemptAction extends Enum
    {

        private static final OcrAttemptAction $VALUES[];
        public static final OcrAttemptAction FINISH_CAPTURE;
        public static final OcrAttemptAction FINISH_CAPTURE_AND_EXIT;
        public static final OcrAttemptAction PAUSE_CAPTURE_AND_FLIP_SIDE;

        public static OcrAttemptAction valueOf(String s)
        {
            return (OcrAttemptAction)Enum.valueOf(com/google/android/libraries/commerce/ocr/wobs/capture/WobsActionDecoratingResponseHandler$OcrAttemptAction, s);
        }

        public static OcrAttemptAction[] values()
        {
            return (OcrAttemptAction[])$VALUES.clone();
        }

        static 
        {
            FINISH_CAPTURE = new OcrAttemptAction("FINISH_CAPTURE", 0);
            PAUSE_CAPTURE_AND_FLIP_SIDE = new OcrAttemptAction("PAUSE_CAPTURE_AND_FLIP_SIDE", 1);
            FINISH_CAPTURE_AND_EXIT = new OcrAttemptAction("FINISH_CAPTURE_AND_EXIT", 2);
            $VALUES = (new OcrAttemptAction[] {
                FINISH_CAPTURE, PAUSE_CAPTURE_AND_FLIP_SIDE, FINISH_CAPTURE_AND_EXIT
            });
        }

        private OcrAttemptAction(String s, int i)
        {
            super(s, i);
        }
    }


    private OcrAttemptAction ocrAttemptAction;
    private final TransitionHandler transitionHandler;

    public WobsActionDecoratingResponseHandler(com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler, TransitionHandler transitionhandler, OcrAttemptAction ocrattemptaction)
    {
        super(ocrresponsehandler);
        transitionHandler = transitionhandler;
        ocrAttemptAction = ocrattemptaction;
    }

    private void exit(final int resultCode, long l)
    {
        transitionHandler.pauseCapture(new TimerTask() {

            final WobsActionDecoratingResponseHandler this$0;
            final int val$resultCode;

            public final void run()
            {
                transitionHandler.exit(resultCode);
            }

            
            {
                this$0 = WobsActionDecoratingResponseHandler.this;
                resultCode = i;
                super();
            }
        }, l);
    }

    public final boolean onOcrAttempt()
    {
        super.onOcrAttempt();
        static final class _cls2
        {

            static final int $SwitchMap$com$google$android$libraries$commerce$ocr$wobs$capture$WobsActionDecoratingResponseHandler$OcrAttemptAction[];

            static 
            {
                $SwitchMap$com$google$android$libraries$commerce$ocr$wobs$capture$WobsActionDecoratingResponseHandler$OcrAttemptAction = new int[OcrAttemptAction.values().length];
                try
                {
                    $SwitchMap$com$google$android$libraries$commerce$ocr$wobs$capture$WobsActionDecoratingResponseHandler$OcrAttemptAction[OcrAttemptAction.PAUSE_CAPTURE_AND_FLIP_SIDE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$libraries$commerce$ocr$wobs$capture$WobsActionDecoratingResponseHandler$OcrAttemptAction[OcrAttemptAction.FINISH_CAPTURE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$libraries$commerce$ocr$wobs$capture$WobsActionDecoratingResponseHandler$OcrAttemptAction[OcrAttemptAction.FINISH_CAPTURE_AND_EXIT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.google.android.libraries.commerce.ocr.wobs.capture.WobsActionDecoratingResponseHandler.OcrAttemptAction[ocrAttemptAction.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 50
    //                   2 69;
           goto _L1 _L2 _L3
_L1:
        exit(-1, 0x8000000000000000L);
_L5:
        return true;
_L2:
        ocrAttemptAction = OcrAttemptAction.FINISH_CAPTURE;
        transitionHandler.pauseCaptureAndFlipSide();
        continue; /* Loop/switch isn't completed */
_L3:
        transitionHandler.pauseCaptureAndPreview();
        if (true) goto _L5; else goto _L4
_L4:
    }

}
