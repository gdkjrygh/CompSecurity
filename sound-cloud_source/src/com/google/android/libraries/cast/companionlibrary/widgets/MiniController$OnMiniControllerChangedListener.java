// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.widgets;

import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.o;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.OnFailedListener;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.widgets:
//            MiniController

public static interface 
    extends OnFailedListener
{

    public abstract void onPlayPauseClicked(View view)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException;

    public abstract void onTargetActivityInvoked(Context context)
        throws TransientNetworkDisconnectionException, NoConnectionException;

    public abstract void onUpcomingPlayClicked(View view, o o);

    public abstract void onUpcomingStopClicked(View view, o o);
}
