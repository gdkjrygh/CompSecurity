// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.permission.PermissionUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServicePreProcessor, GetServiceRequest, IGmsCallbacks

public final class PermissionCheckPreProcessor extends GetServicePreProcessor
{

    private PermissionUtils mPermUtils;
    private Set mRequiredPermGroups;

    public PermissionCheckPreProcessor(Context context, Set set)
    {
        this(context, set, PermissionUtils.getInstance());
    }

    private PermissionCheckPreProcessor(Context context, Set set, PermissionUtils permissionutils)
    {
        super(context);
        mRequiredPermGroups = set;
        mPermUtils = permissionutils;
    }

    public final boolean process(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
        throws RemoteException
    {
        if (!"com.google.android.gms".equals(getservicerequest.callingPackage))
        {
            Object obj = mPermUtils;
            Set set = mRequiredPermGroups;
            if (set == null)
            {
                obj = Collections.emptySet();
            } else
            {
                obj = new HashSet(((PermissionUtils) (obj)).getMissingPermissionGroups());
                ((Set) (obj)).retainAll(set);
            }
            if (!((Set) (obj)).isEmpty())
            {
                logAndCallback(igmscallbacks, getservicerequest, 19, PermissionUtils.getRecoverPermissionIntent(mContext.getApplicationContext(), mRequiredPermGroups));
                return false;
            }
        }
        return true;
    }
}
