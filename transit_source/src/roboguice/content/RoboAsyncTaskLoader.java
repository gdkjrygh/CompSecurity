// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.content;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import roboguice.RoboGuice;

public abstract class RoboAsyncTaskLoader extends AsyncTaskLoader
{

    public RoboAsyncTaskLoader(Context context)
    {
        super(context);
        RoboGuice.injectMembers(context, this);
    }
}
