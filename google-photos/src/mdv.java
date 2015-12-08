// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public final class mdv
    implements mee
{

    public mdv()
    {
    }

    public final void a(Context context)
    {
        Intent intent = new Intent("com.google.android.gms.location.settings.GOOGLE_LOCATION_SETTINGS");
        intent.setFlags(0x10000000);
        intent.setPackage("com.google.android.gms");
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("GCoreLocationSettings", (new StringBuilder("Problem while starting settings activity")).append(intent).toString());
        }
    }
}
