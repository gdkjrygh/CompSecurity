// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClientSupervisorImpl, Preconditions, Objects

private static final class mComponentName
{

    private final String mAction;
    private final ComponentName mComponentName;

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mComponentName))
            {
                return false;
            }
            obj = (mComponentName)obj;
            if (!Objects.equal(mAction, ((mAction) (obj)).mAction) || !Objects.equal(mComponentName, ((mComponentName) (obj)).mComponentName))
            {
                return false;
            }
        }
        return true;
    }

    public final Intent getStartServiceIntent()
    {
        if (mAction != null)
        {
            return (new Intent(mAction)).setPackage("com.google.android.gms");
        } else
        {
            return (new Intent()).setComponent(mComponentName);
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mAction, mComponentName
        });
    }

    public final String toString()
    {
        if (mAction == null)
        {
            return mComponentName.flattenToString();
        } else
        {
            return mAction;
        }
    }

    public (ComponentName componentname)
    {
        mAction = null;
        mComponentName = (ComponentName)Preconditions.checkNotNull(componentname);
    }

    public mComponentName(String s)
    {
        mAction = Preconditions.checkNotEmpty(s);
        mComponentName = null;
    }
}
