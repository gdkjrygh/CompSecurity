// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.content.Context;
import com.adobe.ave.drm.DRMManager;
import com.adobe.ave.drm.DRMOperationCompleteCallback;
import com.adobe.ave.drm.DRMOperationErrorCallback;

// Referenced classes of package com.adobe.mediacore:
//            DRMService

public final class DefaultDRMService
    implements DRMService
{

    public static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/DefaultDRMService.getSimpleName()).toString();
    private boolean _drmHasTriedToInitialize;
    private boolean _drmInitialized;
    private DRMManager _drmManager;
    private DRMService.DRMEventListener _listener;

    public DefaultDRMService(Context context)
    {
        _drmInitialized = false;
        _drmHasTriedToInitialize = false;
        _drmManager = DRMManager.getSharedManager(context);
    }

    public DRMManager getManager()
    {
        return _drmManager;
    }

    public boolean hasTriedToInitialize()
    {
        return _drmHasTriedToInitialize;
    }

    public void initialize()
    {
        _drmHasTriedToInitialize = true;
        _drmManager.initialize(new DRMOperationErrorCallback() {

            final DefaultDRMService this$0;

            public void OperationError(long l, long l1, Exception exception)
            {
                if (_listener != null)
                {
                    _listener.onError(l, l1, exception);
                }
            }

            
            {
                this$0 = DefaultDRMService.this;
                super();
            }
        }, new DRMOperationCompleteCallback() {

            final DefaultDRMService this$0;

            public void OperationComplete()
            {
                _drmInitialized = true;
                if (_listener != null)
                {
                    _listener.onInitialized();
                }
            }

            
            {
                this$0 = DefaultDRMService.this;
                super();
            }
        });
    }

    public boolean isInitialized()
    {
        return _drmInitialized;
    }

    public void setDRMEventListener(DRMService.DRMEventListener drmeventlistener)
    {
        _listener = drmeventlistener;
    }




/*
    static boolean access$102(DefaultDRMService defaultdrmservice, boolean flag)
    {
        defaultdrmservice._drmInitialized = flag;
        return flag;
    }

*/
}
