// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.digby.localpoint.sdk.core.ILPError;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.ILPLocationListener;
import com.digby.localpoint.sdk.core.ILPLocationProvider;
import com.digby.localpoint.sdk.core.impl.LPError;
import com.digby.localpoint.sdk.core.impl.LPID;
import com.digby.localpoint.sdk.core.impl.LPLocalpointService;
import com.digby.mm.android.library.utils.Logger;

public abstract class LPAbstractLocationBroadcastReceiver extends BroadcastReceiver
    implements ILPLocationListener
{

    private Context mContext;

    public LPAbstractLocationBroadcastReceiver()
    {
    }

    private ILPError getErrorFromIntent(Intent intent, Context context)
    {
        context = new LPError(440, "Failed to check in to location.");
        if (!"com.digby.localpoint.CheckInFailure".equals(intent.getAction()))
        {
            return context;
        }
        try
        {
            intent = new LPError(intent.getExtras().getInt("errorCode"), intent.getExtras().getString("errorMessage"));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return context;
        }
        return intent;
    }

    private ILPLocation getLocationFromIntent(Intent intent, Context context)
    {
        intent = intent.getExtras().getString("locationId");
        return LPLocalpointService.getInstance(context).getLocationProvider().getLocation(new LPID(intent));
    }

    private ILPID getLocationIdFromIntent(Intent intent, Context context)
    {
        return new LPID(intent.getExtras().getString("locationId"));
    }

    public Context getContext()
    {
        return mContext;
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        ILPLocation ilplocation;
        mContext = context;
        Logger.Debug("Received broadcast in LPAbstractLocationEventReceiver!", context);
        s = intent.getAction();
        ilplocation = getLocationFromIntent(intent, context);
        if (s.equals("com.digby.localpoint.LocationEntry") && ilplocation != null)
        {
            try
            {
                onEntry(ilplocation);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Logger.Error("LocationBroadcastReceiver.onReceive", context);
            }
            break MISSING_BLOCK_LABEL_73;
        }
        if (!s.equals("com.digby.localpoint.LocationExit") || ilplocation == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        onExit(ilplocation);
        return;
        return;
        if (!s.equals("com.digby.localpoint.LocationAdded") || ilplocation == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        onAdd(ilplocation);
        return;
        if (!s.equals("com.digby.localpoint.LocationModified") || ilplocation == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        onModify(ilplocation);
        return;
        if (!s.equals("com.digby.localpoint.LocationRemoved"))
        {
            break MISSING_BLOCK_LABEL_142;
        }
        context = getLocationIdFromIntent(intent, context);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        onDelete(context);
        return;
        if (!s.equals("com.digby.localpoint.CheckInSuccess") || ilplocation == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        onCheckInSuccess(ilplocation);
        return;
        if (!s.equals("com.digby.localpoint.CheckInFailure") || ilplocation == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        onCheckInFailure(ilplocation, getErrorFromIntent(intent, context));
    }
}
