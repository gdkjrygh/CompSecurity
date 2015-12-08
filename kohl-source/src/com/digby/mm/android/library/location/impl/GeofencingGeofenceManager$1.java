// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location.impl;

import android.text.TextUtils;
import com.digby.mm.android.library.utils.Logger;
import com.digby.mm.android.library.utils.StatusCodesUtils;
import com.google.android.gms.location.LocationClient;
import java.util.List;

// Referenced classes of package com.digby.mm.android.library.location.impl:
//            GeofencingGeofenceManager

class this._cls0
    implements com.google.android.gms.location.sResultListener
{

    final GeofencingGeofenceManager this$0;

    public void onAddGeofencesResult(int i, String as[])
    {
        Logger.Debug((new StringBuilder()).append("GeofenceManager - onAddGeofencesResult. ").append(StatusCodesUtils.getLocationStatus(i)).append(": ").append(TextUtils.join(",", as)).toString(), mContext);
        try
        {
            Logger.Debug("GeofenceManager - add geofences finished, disconnect it.", mContext);
            GeofencingGeofenceManager.access$000(GeofencingGeofenceManager.this).disconnect();
            GeofencingGeofenceManager.access$100(GeofencingGeofenceManager.this).clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Logger.Error("Error in onAddGeofencesResult", as);
        }
    }

    ener()
    {
        this$0 = GeofencingGeofenceManager.this;
        super();
    }
}
