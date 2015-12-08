// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.translate;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.googlecode.eyesfree.braille.translate:
//            ITranslatorService, BrailleTranslator

public class TranslatorManager
{
    private class BrailleTranslatorImpl
        implements BrailleTranslator
    {

        private final String mTable;
        final TranslatorManager this$0;

        public String backTranslate(byte abyte0[])
        {
            ITranslatorService itranslatorservice;
            itranslatorservice = getTranslatorService();
            if (itranslatorservice == null)
            {
                break MISSING_BLOCK_LABEL_37;
            }
            abyte0 = itranslatorservice.backTranslate(abyte0, mTable);
            return abyte0;
            abyte0;
            Log.e(TranslatorManager.LOG_TAG, "Error in backTranslate", abyte0);
            return null;
        }

        public byte[] translate(String s)
        {
            ITranslatorService itranslatorservice;
            itranslatorservice = getTranslatorService();
            if (itranslatorservice == null)
            {
                break MISSING_BLOCK_LABEL_37;
            }
            s = itranslatorservice.translate(s, mTable);
            return s;
            s;
            Log.e(TranslatorManager.LOG_TAG, "Error in translate", s);
            return null;
        }

        public BrailleTranslatorImpl(String s)
        {
            this$0 = TranslatorManager.this;
            super();
            mTable = s;
        }
    }

    private class Connection
        implements ServiceConnection
    {

        private volatile ITranslatorService mService;
        final TranslatorManager this$0;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            Log.i(TranslatorManager.LOG_TAG, "Connected to translation service");
            componentname = ITranslatorService.Stub.asInterface(ibinder);
            componentname.setCallback(mServiceCallback);
            mService = componentname;
            synchronized (mHandler)
            {
                mNumFailedBinds = 0;
            }
            return;
            ibinder;
            componentname;
            JVM INSTR monitorexit ;
            try
            {
                throw ibinder;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname)
            {
                Log.e(TranslatorManager.LOG_TAG, "Error when setting callback", componentname);
            }
            return;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            Log.e(TranslatorManager.LOG_TAG, "Disconnected from translator service");
            mService = null;
            mHandler.scheduleRebind();
        }


        private Connection()
        {
            this$0 = TranslatorManager.this;
            super();
        }

    }

    public static interface OnInitListener
    {

        public abstract void onInit(int i);
    }

    private class ServiceCallback extends ITranslatorServiceCallback.Stub
    {

        final TranslatorManager this$0;

        public void onInit(int i)
        {
            mHandler.onInit(i);
        }

        private ServiceCallback()
        {
            this$0 = TranslatorManager.this;
            super();
        }

    }

    private class TranslatorManagerHandler extends Handler
    {

        private static final int MSG_ON_INIT = 1;
        private static final int MSG_REBIND_SERVICE = 2;
        final TranslatorManager this$0;

        private void handleOnInit(int i)
        {
            if (mOnInitListener != null)
            {
                mOnInitListener.onInit(i);
                mOnInitListener = null;
            }
        }

        private void handleRebindService()
        {
            if (mConnection != null)
            {
                doUnbindService();
            }
            doBindService();
        }

        public void destroy()
        {
            mOnInitListener = null;
            removeCallbacksAndMessages(null);
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                handleOnInit(message.arg1);
                return;

            case 2: // '\002'
                handleRebindService();
                break;
            }
        }

        public void onInit(int i)
        {
            obtainMessage(1, i, 0).sendToTarget();
        }

        public void scheduleRebind()
        {
            this;
            JVM INSTR monitorenter ;
            if (mNumFailedBinds >= 5)
            {
                break MISSING_BLOCK_LABEL_42;
            }
            sendEmptyMessageDelayed(2, 500 << mNumFailedBinds);
            int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        private TranslatorManagerHandler()
        {
            this$0 = TranslatorManager.this;
            super();
        }

    }


    private static final String ACTION_TRANSLATOR_SERVICE = "com.googlecode.eyesfree.braille.service.ACTION_TRANSLATOR_SERVICE";
    public static final int ERROR = -1;
    private static final String LOG_TAG = com/googlecode/eyesfree/braille/translate/TranslatorManager.getSimpleName();
    private static final int MAX_REBIND_ATTEMPTS = 5;
    private static final int REBIND_DELAY_MILLIS = 500;
    public static final int SUCCESS = 0;
    private static final Intent mServiceIntent = new Intent("com.googlecode.eyesfree.braille.service.ACTION_TRANSLATOR_SERVICE");
    private Connection mConnection;
    private final Context mContext;
    private final TranslatorManagerHandler mHandler = new TranslatorManagerHandler();
    private int mNumFailedBinds;
    private OnInitListener mOnInitListener;
    private final ServiceCallback mServiceCallback = new ServiceCallback();

    public TranslatorManager(Context context, OnInitListener oninitlistener)
    {
        mNumFailedBinds = 0;
        mContext = context;
        mOnInitListener = oninitlistener;
        doBindService();
    }

    private void doBindService()
    {
        Connection connection = new Connection();
        if (!mContext.bindService(mServiceIntent, connection, 1))
        {
            Log.e(LOG_TAG, "Failed to bind to service");
            mHandler.scheduleRebind();
            return;
        } else
        {
            mConnection = connection;
            Log.i(LOG_TAG, "Bound to translator service");
            return;
        }
    }

    private void doUnbindService()
    {
        if (mConnection != null)
        {
            mContext.unbindService(mConnection);
            mConnection = null;
        }
    }

    private ITranslatorService getTranslatorService()
    {
        Connection connection = mConnection;
        if (connection != null)
        {
            return connection.mService;
        } else
        {
            return null;
        }
    }

    public void destroy()
    {
        doUnbindService();
        mHandler.destroy();
    }

    public BrailleTranslator getTranslator(String s)
    {
        ITranslatorService itranslatorservice;
        itranslatorservice = getTranslatorService();
        if (itranslatorservice == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (!itranslatorservice.checkTable(s))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        s = new BrailleTranslatorImpl(s);
        return s;
        s;
        Log.e(LOG_TAG, "Error in getTranslator", s);
        return null;
    }










/*
    static int access$702(TranslatorManager translatormanager, int i)
    {
        translatormanager.mNumFailedBinds = i;
        return i;
    }

*/


/*
    static int access$704(TranslatorManager translatormanager)
    {
        int i = translatormanager.mNumFailedBinds + 1;
        translatormanager.mNumFailedBinds = i;
        return i;
    }

*/




/*
    static OnInitListener access$902(TranslatorManager translatormanager, OnInitListener oninitlistener)
    {
        translatormanager.mOnInitListener = oninitlistener;
        return oninitlistener;
    }

*/
}
