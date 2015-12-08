// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.os:
//            IResultReceiver

public class ResultReceiver
    implements Parcelable
{
    class MyResultReceiver extends IResultReceiver.Stub
    {

        final ResultReceiver this$0;

        public void send(int i, Bundle bundle)
        {
            if (mHandler != null)
            {
                mHandler.post(new MyRunnable(i, bundle));
                return;
            } else
            {
                onReceiveResult(i, bundle);
                return;
            }
        }

        MyResultReceiver()
        {
            this$0 = ResultReceiver.this;
            super();
        }
    }

    class MyRunnable
        implements Runnable
    {

        final int mResultCode;
        final Bundle mResultData;
        final ResultReceiver this$0;

        public void run()
        {
            onReceiveResult(mResultCode, mResultData);
        }

        MyRunnable(int i, Bundle bundle)
        {
            this$0 = ResultReceiver.this;
            super();
            mResultCode = i;
            mResultData = bundle;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ResultReceiver createFromParcel(Parcel parcel)
        {
            return new ResultReceiver(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ResultReceiver[] newArray(int i)
        {
            return new ResultReceiver[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    final Handler mHandler;
    final boolean mLocal;
    IResultReceiver mReceiver;

    public ResultReceiver(Handler handler)
    {
        mLocal = true;
        mHandler = handler;
    }

    ResultReceiver(Parcel parcel)
    {
        mLocal = false;
        mHandler = null;
        mReceiver = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }

    public int describeContents()
    {
        return 0;
    }

    protected void onReceiveResult(int i, Bundle bundle)
    {
    }

    public void send(int i, Bundle bundle)
    {
        if (!mLocal) goto _L2; else goto _L1
_L1:
        if (mHandler == null) goto _L4; else goto _L3
_L3:
        mHandler.post(new MyRunnable(i, bundle));
_L6:
        return;
_L4:
        onReceiveResult(i, bundle);
        return;
_L2:
        if (mReceiver != null)
        {
            try
            {
                mReceiver.send(i, bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (mReceiver == null)
        {
            mReceiver = new MyResultReceiver();
        }
        parcel.writeStrongBinder(mReceiver.asBinder());
        this;
        JVM INSTR monitorexit ;
        return;
        parcel;
        this;
        JVM INSTR monitorexit ;
        throw parcel;
    }

}
