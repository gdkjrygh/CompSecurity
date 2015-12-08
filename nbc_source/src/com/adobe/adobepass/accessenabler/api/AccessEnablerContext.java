// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import android.content.Context;
import com.adobe.adobepass.accessenabler.models.DeviceInfo;
import com.adobe.adobepass.accessenabler.models.Requestor;
import com.adobe.adobepass.accessenabler.models.UserMetadata;
import com.adobe.adobepass.accessenabler.network.HttpSessionManager;
import com.adobe.adobepass.accessenabler.storage.StorageManager;
import com.adobe.adobepass.accessenabler.utils.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            IAccessEnablerDelegate

public class AccessEnablerContext
{

    private static final String LOG_TAG = "AccessEnablerContext";
    private Semaphore authenticationInProgress;
    public IAccessEnablerDelegate _flddelegate;
    private DeviceInfo deviceInfo;
    public String genericAuthNData;
    public boolean getAuthenticationWasCalled;
    public HttpSessionManager httpSessionManager;
    private boolean isConfigDataReceived;
    public UserMetadata metadataCache;
    public PassiveAuthnService.PassiveAuthnState passiveAuthnState;
    public Requestor requestor;
    private List resourcesPendingForAuthorization;
    private int setRequestorThreadCount;
    public boolean setSelectedProviderWasCalled;
    public ArrayList spUrls;
    public StorageManager storageManager;

    AccessEnablerContext(Context context)
    {
        resourcesPendingForAuthorization = new ArrayList();
        authenticationInProgress = new Semaphore(1, true);
        requestor = new Requestor(this);
        metadataCache = null;
        httpSessionManager = new HttpSessionManager();
        deviceInfo = new DeviceInfo();
        storageManager = new StorageManager(context);
    }

    public void clearAllResourcesPendingForAuthorization()
    {
        this;
        JVM INSTR monitorenter ;
        resourcesPendingForAuthorization.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public DeviceInfo getDeviceInfo()
    {
        return deviceInfo;
    }

    public boolean getIsConfigDataReceived()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isConfigDataReceived;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public List getResourcesPendingForAuthorization()
    {
        this;
        JVM INSTR monitorenter ;
        List list = resourcesPendingForAuthorization;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public int getSetRequestorThreadCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = setRequestorThreadCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int markResourceAsPendingForAuthorization(final String resourceId, final String genericData)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        resourceId = new HashMap() {

            final AccessEnablerContext this$0;
            final String val$genericData;
            final String val$resourceId;

            
            {
                this$0 = AccessEnablerContext.this;
                resourceId = s;
                genericData = s1;
                super();
                put("resource_id", resourceId);
                put("generic_data", genericData);
            }
        };
        if (!resourcesPendingForAuthorization.contains(resourceId))
        {
            resourcesPendingForAuthorization.add(resourceId);
        }
        i = resourcesPendingForAuthorization.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        resourceId;
        throw resourceId;
    }

    public void resetStatusBeforeSetRequestor()
    {
        isConfigDataReceived = false;
        requestor.getMvpds().clear();
    }

    public void setAuthenticationInProgress(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        authenticationInProgress.acquire();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("AccessEnablerContext", ((InterruptedException) (obj)).toString());
          goto _L1
        obj;
        throw obj;
        authenticationInProgress.release();
          goto _L1
    }

    public void setIsConfigDataReceived(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!isConfigDataReceived)
        {
            isConfigDataReceived = flag;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void startSetRequestorThread()
    {
        this;
        JVM INSTR monitorenter ;
        setRequestorThreadCount = setRequestorThreadCount + 1;
        Log.d("AccessEnablerContext", (new StringBuilder()).append("Increase the setRequestor() thread count to: ").append(setRequestorThreadCount).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void stopSetRequestorThread()
    {
        this;
        JVM INSTR monitorenter ;
        setRequestorThreadCount = setRequestorThreadCount - 1;
        Log.d("AccessEnablerContext", (new StringBuilder()).append("Decrease the setRequestor() thread count to: ").append(setRequestorThreadCount).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
