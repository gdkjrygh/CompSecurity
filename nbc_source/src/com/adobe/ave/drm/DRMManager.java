// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;

// Referenced classes of package com.adobe.ave.drm:
//            DRMAcquireLicenseSettings, DRMMetadata, DRMOperationCompleteCallback, DRMOperationErrorCallback, 
//            DRMLicenseAcquiredCallback, DRMAuthenticationCompleteCallback, DRMLicenseDomain, DRMLicenseReturnCompleteCallback, 
//            DRMOperationErrorWithErrorObjectCallback, DRMError, DRMLicense

public class DRMManager
{
    class UIThreadAuthCB
        implements DRMAuthenticationCompleteCallback
    {

        DRMAuthenticationCompleteCallback cb;
        final DRMManager this$0;

        public void AuthenticationComplete(byte abyte0[])
        {
            mHandler.post(abyte0. new Runnable() {

                final UIThreadAuthCB this$1;
                final byte val$authenticationToken[];

                public void run()
                {
                    cb.AuthenticationComplete(authenticationToken);
                }

            
            {
                this$1 = final_uithreadauthcb;
                authenticationToken = _5B_B.this;
                super();
            }
            });
        }

        public UIThreadAuthCB(DRMAuthenticationCompleteCallback drmauthenticationcompletecallback)
        {
            this$0 = DRMManager.this;
            super();
            cb = drmauthenticationcompletecallback;
        }
    }

    class UIThreadCompleteCB
        implements DRMOperationCompleteCallback
    {

        DRMOperationCompleteCallback cb;
        final DRMManager this$0;

        public void OperationComplete()
        {
            mHandler.post(new Runnable() {

                final UIThreadCompleteCB this$1;

                public void run()
                {
                    cb.OperationComplete();
                }

            
            {
                this$1 = UIThreadCompleteCB.this;
                super();
            }
            });
        }

        public UIThreadCompleteCB(DRMOperationCompleteCallback drmoperationcompletecallback)
        {
            this$0 = DRMManager.this;
            super();
            cb = drmoperationcompletecallback;
        }
    }

    class UIThreadErrorCB
        implements DRMOperationErrorWithErrorObjectCallback
    {

        DRMOperationErrorCallback cb;
        DRMError drmError;
        final DRMManager this$0;

        public void OperationError(final long majorCode, final long minorCode, Exception exception)
        {
            mHandler.post(exception. new Runnable() {

                final UIThreadErrorCB this$1;
                final Exception val$e;
                final long val$majorCode;
                final long val$minorCode;

                public void run()
                {
                    cb.OperationError(majorCode, minorCode, e);
                }

            
            {
                this$1 = final_uithreaderrorcb;
                majorCode = l;
                minorCode = l1;
                e = Exception.this;
                super();
            }
            });
        }

        public void OperationError(DRMError drmerror)
        {
            drmError = drmerror;
            mHandler.post(new Runnable() {

                final UIThreadErrorCB this$1;

                public void run()
                {
                    if (cb instanceof DRMOperationErrorWithErrorObjectCallback)
                    {
                        ((DRMOperationErrorWithErrorObjectCallback)cb).OperationError(drmError);
                        return;
                    } else
                    {
                        cb.OperationError(drmError.getMajorError(), drmError.getMinorError(), null);
                        return;
                    }
                }

            
            {
                this$1 = UIThreadErrorCB.this;
                super();
            }
            });
        }

        public UIThreadErrorCB(DRMOperationErrorCallback drmoperationerrorcallback)
        {
            this$0 = DRMManager.this;
            super();
            cb = drmoperationerrorcallback;
        }
    }

    class UIThreadLicenseAcquiredCB
        implements DRMLicenseAcquiredCallback
    {

        DRMLicenseAcquiredCallback cb;
        final DRMManager this$0;

        public void LicenseAcquired(DRMLicense drmlicense)
        {
            mHandler.post(drmlicense. new Runnable() {

                final UIThreadLicenseAcquiredCB this$1;
                final DRMLicense val$license;

                public void run()
                {
                    cb.LicenseAcquired(license);
                }

            
            {
                this$1 = final_uithreadlicenseacquiredcb;
                license = DRMLicense.this;
                super();
            }
            });
        }

        public UIThreadLicenseAcquiredCB(DRMLicenseAcquiredCallback drmlicenseacquiredcallback)
        {
            this$0 = DRMManager.this;
            super();
            cb = drmlicenseacquiredcallback;
        }
    }

    class UIThreadLicenseReturnCompleteCB
        implements DRMLicenseReturnCompleteCallback
    {

        DRMLicenseReturnCompleteCallback cb;
        final DRMManager this$0;

        public void OperationComplete(long l)
        {
            mHandler.post(l. new Runnable() {

                final UIThreadLicenseReturnCompleteCB this$1;
                final long val$numReturned;

                public void run()
                {
                    cb.OperationComplete(numReturned);
                }

            
            {
                this$1 = final_uithreadlicensereturncompletecb;
                numReturned = J.this;
                super();
            }
            });
        }

        public UIThreadLicenseReturnCompleteCB(DRMLicenseReturnCompleteCallback drmlicensereturncompletecallback)
        {
            this$0 = DRMManager.this;
            super();
            cb = drmlicensereturncompletecallback;
        }
    }


    static final String TAG = "DRMManager(j)";
    private static DRMMetadata sEmbeddedMetadata;
    private static DRMManager sManager = null;
    private Handler mHandler;
    protected long peerObject;

    private DRMManager(Context context)
    {
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        mHandler = new Handler(Looper.getMainLooper());
        s3 = "/data/local";
        s4 = "<default-pubid>";
        s5 = "<default-appid>";
        s6 = "1.0";
        s2 = s3;
        s1 = s4;
        s = s5;
        Object obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
        s2 = s3;
        s1 = s4;
        s = s5;
        s3 = context.getFilesDir().getAbsolutePath();
        s2 = s3;
        s1 = s4;
        s = s5;
        s4 = toHexString(((PackageInfo) (obj)).signatures[0].toByteArray());
        s2 = s3;
        s1 = s4;
        s = s5;
        s5 = ((PackageInfo) (obj)).packageName;
        s2 = s3;
        s1 = s4;
        s = s5;
        obj = ((PackageInfo) (obj)).versionName;
        s6 = ((String) (obj));
        s = s5;
        s1 = s4;
        s2 = s3;
_L2:
        peerObject = constructNative(context, s2, s1, s, s6, false);
        return;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private native void acquireLicenseNative(DRMMetadata drmmetadata, int i, DRMOperationErrorCallback drmoperationerrorcallback, DRMLicenseAcquiredCallback drmlicenseacquiredcallback);

    private native void acquirePreviewLicenseNative(DRMMetadata drmmetadata, DRMOperationErrorCallback drmoperationerrorcallback, DRMLicenseAcquiredCallback drmlicenseacquiredcallback);

    private native void authenticateNative(DRMMetadata drmmetadata, String s, String s1, String s2, String s3, DRMOperationErrorCallback drmoperationerrorcallback, DRMAuthenticationCompleteCallback drmauthenticationcompletecallback);

    private native long constructNative(Context context, String s, String s1, String s2, String s3, boolean flag);

    private native byte[] getEmbeddedLicense();

    public static DRMManager getSharedManager(Context context)
    {
        com/adobe/ave/drm/DRMManager;
        JVM INSTR monitorenter ;
        if (sManager == null)
        {
            sManager = new DRMManager(context);
        }
        context = sManager;
        com/adobe/ave/drm/DRMManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static void jobDoneNotify()
    {
        Log.w("DRMManager(j)", "DRMManager.jobDoneNotify()");
        if (sManager == null)
        {
            throw new NullPointerException();
        } else
        {
            sManager.mHandler.post(new Runnable() {

                public void run()
                {
                    Log.w("DRMManager(j)", "DRMManager.needsCycles()");
                    DRMManager.sManager.needsCycles();
                }

            });
            return;
        }
    }

    private native void joinLicenseDomainNative(DRMLicenseDomain drmlicensedomain, boolean flag, DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback);

    private native void leaveLicenseDomainNative(DRMLicenseDomain drmlicensedomain, DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback);

    private native void needsCycles();

    private native void resetDRMNative(DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback);

    private native void returnLicenseNative(String s, String s1, String s2, boolean flag, DRMOperationErrorCallback drmoperationerrorcallback, DRMLicenseReturnCompleteCallback drmlicensereturncompletecallback);

    private native void setAuthenticationTokenNative(DRMMetadata drmmetadata, String s, byte abyte0[], DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback);

    private native void storeLicenseBytesNative(byte abyte0[], DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback);

    private static String toHexString(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < abyte0.length; i++)
        {
            String s = Integer.toHexString(abyte0[i] & 0xff);
            if (s.length() == 1)
            {
                stringbuffer.append('0');
            }
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }

    public void acquireLicense(DRMMetadata drmmetadata, DRMAcquireLicenseSettings drmacquirelicensesettings, DRMOperationErrorCallback drmoperationerrorcallback, DRMLicenseAcquiredCallback drmlicenseacquiredcallback)
    {
        if (drmmetadata == null || drmacquirelicensesettings == null || drmoperationerrorcallback == null || drmlicenseacquiredcallback == null)
        {
            throw new NullPointerException();
        } else
        {
            acquireLicenseNative(drmmetadata, drmacquirelicensesettings.ordinal(), new UIThreadErrorCB(drmoperationerrorcallback), new UIThreadLicenseAcquiredCB(drmlicenseacquiredcallback));
            return;
        }
    }

    public void acquirePreviewLicense(DRMMetadata drmmetadata, DRMOperationErrorCallback drmoperationerrorcallback, DRMLicenseAcquiredCallback drmlicenseacquiredcallback)
    {
        if (drmmetadata == null || drmoperationerrorcallback == null || drmlicenseacquiredcallback == null)
        {
            throw new NullPointerException();
        } else
        {
            acquirePreviewLicenseNative(drmmetadata, new UIThreadErrorCB(drmoperationerrorcallback), new UIThreadLicenseAcquiredCB(drmlicenseacquiredcallback));
            return;
        }
    }

    public void authenticate(DRMMetadata drmmetadata, String s, String s1, String s2, String s3, DRMOperationErrorCallback drmoperationerrorcallback, DRMAuthenticationCompleteCallback drmauthenticationcompletecallback)
    {
        if (drmmetadata == null || s == null || s1 == null || s2 == null || s3 == null || drmoperationerrorcallback == null || drmauthenticationcompletecallback == null)
        {
            throw new NullPointerException();
        } else
        {
            authenticateNative(drmmetadata, s, s1, s2, s3, new UIThreadErrorCB(drmoperationerrorcallback), new UIThreadAuthCB(drmauthenticationcompletecallback));
            return;
        }
    }

    public DRMMetadata createMetadataFromBytes(byte abyte0[], DRMOperationErrorCallback drmoperationerrorcallback)
    {
        return DRMMetadata.createFromData(this, abyte0, drmoperationerrorcallback);
    }

    public native long getMaxOperationTime();

    public void initialize(DRMOperationErrorCallback drmoperationerrorcallback, final DRMOperationCompleteCallback complete)
    {
        if (sEmbeddedMetadata != null)
        {
            complete.OperationComplete();
        } else
        {
            sEmbeddedMetadata = createMetadataFromBytes(getEmbeddedLicense(), drmoperationerrorcallback);
            if (sEmbeddedMetadata != null)
            {
                acquireLicense(sEmbeddedMetadata, DRMAcquireLicenseSettings.LOCAL_ONLY, drmoperationerrorcallback, new DRMLicenseAcquiredCallback() {

                    final DRMManager this$0;
                    final DRMOperationCompleteCallback val$complete;

                    public void LicenseAcquired(DRMLicense drmlicense)
                    {
                        complete.OperationComplete();
                    }

            
            {
                this$0 = DRMManager.this;
                complete = drmoperationcompletecallback;
                super();
            }
                });
                return;
            }
        }
    }

    public void joinLicenseDomain(DRMLicenseDomain drmlicensedomain, boolean flag, DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback)
    {
        if (drmlicensedomain == null || drmoperationerrorcallback == null || drmoperationcompletecallback == null)
        {
            throw new NullPointerException();
        } else
        {
            joinLicenseDomainNative(drmlicensedomain, flag, new UIThreadErrorCB(drmoperationerrorcallback), new UIThreadCompleteCB(drmoperationcompletecallback));
            return;
        }
    }

    public void leaveLicenseDomain(DRMLicenseDomain drmlicensedomain, DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback)
    {
        if (drmlicensedomain == null || drmoperationerrorcallback == null || drmoperationcompletecallback == null)
        {
            throw new NullPointerException();
        } else
        {
            leaveLicenseDomainNative(drmlicensedomain, new UIThreadErrorCB(drmoperationerrorcallback), new UIThreadCompleteCB(drmoperationcompletecallback));
            return;
        }
    }

    public void resetDRM(DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback)
    {
        if (drmoperationerrorcallback == null || drmoperationcompletecallback == null)
        {
            throw new NullPointerException();
        } else
        {
            resetDRMNative(new UIThreadErrorCB(drmoperationerrorcallback), new UIThreadCompleteCB(drmoperationcompletecallback));
            return;
        }
    }

    public void returnLicense(String s, String s1, String s2, boolean flag, DRMOperationErrorCallback drmoperationerrorcallback, DRMLicenseReturnCompleteCallback drmlicensereturncompletecallback)
    {
        if (s == null || drmoperationerrorcallback == null || drmlicensereturncompletecallback == null)
        {
            throw new NullPointerException();
        } else
        {
            returnLicenseNative(s, s1, s2, flag, new UIThreadErrorCB(drmoperationerrorcallback), new UIThreadLicenseReturnCompleteCB(drmlicensereturncompletecallback));
            return;
        }
    }

    public void setAuthenticationToken(DRMMetadata drmmetadata, String s, byte abyte0[], DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback)
    {
        if (drmmetadata == null || s == null || drmoperationerrorcallback == null || drmoperationcompletecallback == null)
        {
            throw new NullPointerException();
        } else
        {
            setAuthenticationTokenNative(drmmetadata, s, abyte0, new UIThreadErrorCB(drmoperationerrorcallback), new UIThreadCompleteCB(drmoperationcompletecallback));
            return;
        }
    }

    public void setMaxOperationTime(long l)
    {
        if (l <= 0L || l > 0x7fffffffL)
        {
            throw new IllegalArgumentException();
        } else
        {
            setMaxOperationTimeNative(l);
            return;
        }
    }

    public native void setMaxOperationTimeNative(long l);

    public void storeLicenseBytes(byte abyte0[], DRMOperationErrorCallback drmoperationerrorcallback, DRMOperationCompleteCallback drmoperationcompletecallback)
    {
label0:
        {
            boolean flag1 = true;
            if (abyte0 != null)
            {
                boolean flag;
                if (drmoperationerrorcallback == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (drmoperationcompletecallback != null)
                {
                    flag1 = false;
                }
                if (!(flag1 | flag))
                {
                    break label0;
                }
            }
            throw new NullPointerException();
        }
        storeLicenseBytesNative(abyte0, new UIThreadErrorCB(drmoperationerrorcallback), new UIThreadCompleteCB(drmoperationcompletecallback));
    }

    static 
    {
        System.loadLibrary("AVEAndroid");
    }



}
