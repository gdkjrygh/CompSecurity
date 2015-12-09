// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic.api;

import com.google.common.base.Objects;

// Referenced classes of package com.google.android.apps.wallet.plastic.api:
//            PlasticCardModel

public class PlasticCardModelEvent
{

    private final Exception failureCause;
    private final PlasticCardModel model;

    private PlasticCardModelEvent(PlasticCardModel plasticcardmodel, Exception exception)
    {
        model = plasticcardmodel;
        failureCause = exception;
    }

    public static PlasticCardModelEvent newFailureEvent(Exception exception)
    {
        return new PlasticCardModelEvent(null, exception);
    }

    public static PlasticCardModelEvent newModelEvent(PlasticCardModel plasticcardmodel)
    {
        return new PlasticCardModelEvent(plasticcardmodel, null);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlasticCardModelEvent))
            {
                return false;
            }
            obj = (PlasticCardModelEvent)obj;
            if (!Objects.equal(model, ((PlasticCardModelEvent) (obj)).model) || !Objects.equal(failureCause, ((PlasticCardModelEvent) (obj)).failureCause))
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

    public final PlasticCardModel getModel()
    {
        return model;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            model, failureCause
        });
    }
}
