// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpeechRecognition
{
    class Listener
        implements RecognitionListener
    {

        static final boolean $assertionsDisabled;
        final SpeechRecognition this$0;

        private void handleResults(Bundle bundle, boolean flag)
        {
            boolean flag1 = flag;
            if (mContinuous)
            {
                flag1 = flag;
                if (flag)
                {
                    flag1 = false;
                }
            }
            ArrayList arraylist = bundle.getStringArrayList("results_recognition");
            String as[] = (String[])arraylist.toArray(new String[arraylist.size()]);
            bundle = bundle.getFloatArray("confidence_scores");
            nativeOnRecognitionResults(mNativeSpeechRecognizerImplAndroid, as, bundle, flag1);
        }

        public void onBeginningOfSpeech()
        {
            mState = 2;
            nativeOnSoundStart(mNativeSpeechRecognizerImplAndroid);
        }

        public void onBufferReceived(byte abyte0[])
        {
        }

        public void onEndOfSpeech()
        {
            if (!mContinuous)
            {
                nativeOnSoundEnd(mNativeSpeechRecognizerImplAndroid);
                nativeOnAudioEnd(mNativeSpeechRecognizerImplAndroid);
                mState = 0;
            }
        }

        public void onError(int i)
        {
            i;
            JVM INSTR tableswitch 1 9: default 52
        //                       1 87
        //                       2 87
        //                       3 66
        //                       4 87
        //                       5 77
        //                       6 98
        //                       7 92
        //                       8 82
        //                       9 82;
               goto _L1 _L2 _L2 _L3 _L2 _L4 _L5 _L6 _L7 _L7
_L1:
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            }
              goto _L8
_L3:
            i = 2;
_L10:
            terminate(i);
_L8:
            return;
_L4:
            i = 1;
            continue; /* Loop/switch isn't completed */
_L7:
            i = 4;
            continue; /* Loop/switch isn't completed */
_L2:
            i = 3;
            continue; /* Loop/switch isn't completed */
_L6:
            i = 6;
            continue; /* Loop/switch isn't completed */
_L5:
            i = 5;
            if (true) goto _L10; else goto _L9
_L9:
        }

        public void onEvent(int i, Bundle bundle)
        {
        }

        public void onPartialResults(Bundle bundle)
        {
            handleResults(bundle, true);
        }

        public void onReadyForSpeech(Bundle bundle)
        {
            mState = 1;
            nativeOnAudioStart(mNativeSpeechRecognizerImplAndroid);
        }

        public void onResults(Bundle bundle)
        {
            handleResults(bundle, false);
            terminate(0);
        }

        public void onRmsChanged(float f)
        {
        }

        static 
        {
            boolean flag;
            if (!org/chromium/content/browser/SpeechRecognition.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        Listener()
        {
            this$0 = SpeechRecognition.this;
            super();
        }
    }


    private static final int PROVIDER_MIN_VERSION = 0x11e4cbb6;
    private static final String PROVIDER_PACKAGE_NAME = "com.google.android.googlequicksearchbox";
    private static final int STATE_AWAITING_SPEECH = 1;
    private static final int STATE_CAPTURING_SPEECH = 2;
    private static final int STATE_IDLE = 0;
    private static ComponentName sRecognitionProvider;
    private final Context mContext;
    private boolean mContinuous;
    private final Intent mIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    private final RecognitionListener mListener = new Listener();
    private long mNativeSpeechRecognizerImplAndroid;
    private SpeechRecognizer mRecognizer;
    private int mState;

    private SpeechRecognition(Context context, long l)
    {
        mContext = context;
        mContinuous = false;
        mNativeSpeechRecognizerImplAndroid = l;
        if (sRecognitionProvider != null)
        {
            mRecognizer = SpeechRecognizer.createSpeechRecognizer(mContext, sRecognitionProvider);
        } else
        {
            mRecognizer = SpeechRecognizer.createSpeechRecognizer(mContext);
        }
        mRecognizer.setRecognitionListener(mListener);
    }

    private void abortRecognition()
    {
        if (mRecognizer == null)
        {
            return;
        } else
        {
            mRecognizer.cancel();
            terminate(1);
            return;
        }
    }

    private static SpeechRecognition createSpeechRecognition(Context context, long l)
    {
        return new SpeechRecognition(context, l);
    }

    public static boolean initialize(Context context)
    {
        if (SpeechRecognizer.isRecognitionAvailable(context)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        context = context.getPackageManager();
        iterator = context.queryIntentServices(new Intent("android.speech.RecognitionService"), 4).iterator();
_L4:
        ServiceInfo serviceinfo;
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        serviceinfo = ((ResolveInfo)iterator.next()).serviceInfo;
        if (!serviceinfo.packageName.equals("com.google.android.googlequicksearchbox"))
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = context.getPackageInfo(serviceinfo.packageName, 0).versionCode;
        if (i >= 0x11e4cbb6)
        {
            sRecognitionProvider = new ComponentName(serviceinfo.packageName, serviceinfo.name);
            return true;
        }
        continue; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    private native void nativeOnAudioEnd(long l);

    private native void nativeOnAudioStart(long l);

    private native void nativeOnRecognitionEnd(long l);

    private native void nativeOnRecognitionError(long l, int i);

    private native void nativeOnRecognitionResults(long l, String as[], float af[], boolean flag);

    private native void nativeOnSoundEnd(long l);

    private native void nativeOnSoundStart(long l);

    private void startRecognition(String s, boolean flag, boolean flag1)
    {
        if (mRecognizer == null)
        {
            return;
        } else
        {
            mContinuous = flag;
            mIntent.putExtra("android.speech.extra.DICTATION_MODE", flag);
            mIntent.putExtra("android.speech.extra.LANGUAGE", s);
            mIntent.putExtra("android.speech.extra.PARTIAL_RESULTS", flag1);
            mRecognizer.startListening(mIntent);
            return;
        }
    }

    private void stopRecognition()
    {
        if (mRecognizer == null)
        {
            return;
        } else
        {
            mContinuous = false;
            mRecognizer.stopListening();
            return;
        }
    }

    private void terminate(int i)
    {
        if (mState != 0)
        {
            if (mState == 2)
            {
                nativeOnSoundEnd(mNativeSpeechRecognizerImplAndroid);
            }
            nativeOnAudioEnd(mNativeSpeechRecognizerImplAndroid);
            mState = 0;
        }
        if (i != 0)
        {
            nativeOnRecognitionError(mNativeSpeechRecognizerImplAndroid, i);
        }
        mRecognizer.destroy();
        mRecognizer = null;
        nativeOnRecognitionEnd(mNativeSpeechRecognizerImplAndroid);
        mNativeSpeechRecognizerImplAndroid = 0L;
    }


/*
    static int access$002(SpeechRecognition speechrecognition, int i)
    {
        speechrecognition.mState = i;
        return i;
    }

*/








}
