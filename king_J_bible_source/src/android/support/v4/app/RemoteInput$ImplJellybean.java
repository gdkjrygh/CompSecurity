// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            RemoteInput, RemoteInputCompatJellybean

static class 
    implements 
{

    public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
    {
        RemoteInputCompatJellybean.addResultsToIntent(aremoteinput, intent, bundle);
    }

    public Bundle getResultsFromIntent(Intent intent)
    {
        return RemoteInputCompatJellybean.getResultsFromIntent(intent);
    }

    ()
    {
    }
}
