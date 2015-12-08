// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class PendingCallStore
{

    private static final String CALL_ID_ARRAY_KEY = "com.facebook.internal.PendingCallStore.callIdArrayKey";
    private static final String CALL_KEY_PREFIX = "com.facebook.internal.PendingCallStore.";
    private static PendingCallStore mInstance;
    private Map pendingCallMap;

    public PendingCallStore()
    {
        pendingCallMap = new HashMap();
    }

    private static void createInstance()
    {
        com/facebook/internal/PendingCallStore;
        JVM INSTR monitorenter ;
        if (mInstance == null)
        {
            mInstance = new PendingCallStore();
        }
        com/facebook/internal/PendingCallStore;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static PendingCallStore getInstance()
    {
        if (mInstance == null)
        {
            createInstance();
        }
        return mInstance;
    }

    private String getSavedStateKeyForPendingCallId(String s)
    {
        return (new StringBuilder("com.facebook.internal.PendingCallStore.")).append(s).toString();
    }

    public com.facebook.widget.FacebookDialog.PendingCall getPendingCallById(UUID uuid)
    {
        if (uuid == null)
        {
            return null;
        } else
        {
            return (com.facebook.widget.FacebookDialog.PendingCall)pendingCallMap.get(uuid.toString());
        }
    }

    public void restoreFromSavedInstanceState(Bundle bundle)
    {
        Object obj = bundle.getStringArrayList("com.facebook.internal.PendingCallStore.callIdArrayKey");
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((ArrayList) (obj)).iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        com.facebook.widget.FacebookDialog.PendingCall pendingcall = (com.facebook.widget.FacebookDialog.PendingCall)bundle.getParcelable(getSavedStateKeyForPendingCallId((String)((Iterator) (obj)).next()));
        if (pendingcall != null)
        {
            pendingCallMap.put(pendingcall.getCallId().toString(), pendingcall);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void saveInstanceState(Bundle bundle)
    {
        bundle.putStringArrayList("com.facebook.internal.PendingCallStore.callIdArrayKey", new ArrayList(pendingCallMap.keySet()));
        Iterator iterator = pendingCallMap.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            com.facebook.widget.FacebookDialog.PendingCall pendingcall = (com.facebook.widget.FacebookDialog.PendingCall)iterator.next();
            bundle.putParcelable(getSavedStateKeyForPendingCallId(pendingcall.getCallId().toString()), pendingcall);
        } while (true);
    }

    public void stopTrackingPendingCall(UUID uuid)
    {
        if (uuid != null)
        {
            pendingCallMap.remove(uuid.toString());
        }
    }

    public void trackPendingCall(com.facebook.widget.FacebookDialog.PendingCall pendingcall)
    {
        if (pendingcall != null)
        {
            pendingCallMap.put(pendingcall.getCallId().toString(), pendingcall);
        }
    }
}
