// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue.api;

import com.google.common.base.Objects;

// Referenced classes of package com.google.android.apps.wallet.storedvalue.api:
//            StoredValueModel

public class StoredValueEvent
{

    private final Exception failureCause;
    private final StoredValueModel model;
    private final boolean storedValueFeatureEnabled;

    public StoredValueEvent(StoredValueModel storedvaluemodel, Exception exception, boolean flag)
    {
        model = storedvaluemodel;
        failureCause = exception;
        storedValueFeatureEnabled = flag;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StoredValueEvent))
            {
                return false;
            }
            obj = (StoredValueEvent)obj;
            if (!Objects.equal(model, ((StoredValueEvent) (obj)).model) || !Objects.equal(failureCause, ((StoredValueEvent) (obj)).failureCause) || storedValueFeatureEnabled != ((StoredValueEvent) (obj)).storedValueFeatureEnabled)
            {
                return false;
            }
        }
        return true;
    }

    public final Exception getFailureCause()
    {
        return failureCause;
    }

    public final StoredValueModel getModel()
    {
        return model;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            model, failureCause, Boolean.valueOf(storedValueFeatureEnabled)
        });
    }

    public final boolean isFeatureEnabled()
    {
        return storedValueFeatureEnabled;
    }
}
