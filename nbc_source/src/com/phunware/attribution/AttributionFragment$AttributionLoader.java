// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.attribution;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import java.util.List;

// Referenced classes of package com.phunware.attribution:
//            AttributionFragment, AttributionParser

public static class  extends AsyncTaskLoader
{

    private List result;

    public volatile Object loadInBackground()
    {
        return loadInBackground();
    }

    public List loadInBackground()
    {
        return AttributionParser.getNotices(getContext());
    }

    protected void onStartLoading()
    {
        super.onStartLoading();
        if (result != null)
        {
            deliverResult(result);
            return;
        } else
        {
            forceLoad();
            return;
        }
    }

    public (Context context)
    {
        super(context);
    }
}
