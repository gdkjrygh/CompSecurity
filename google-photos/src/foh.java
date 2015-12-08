// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.apps.photos.home.HomeActivity;

public final class foh extends mtf
{

    private final boolean a;

    public foh(HomeActivity homeactivity, boolean flag)
    {
        super("enable_envelope_intent");
        a = flag;
    }

    protected final mue a(Context context)
    {
        if (a)
        {
            ComponentName componentname = new ComponentName(context, "com.google.android.apps.photos.envelope.EnvelopeActivityAlias");
            try
            {
                context.getPackageManager().setComponentEnabledSetting(componentname, 1, 1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = String.valueOf(componentname.getClassName());
                if (context.length() != 0)
                {
                    context = "Tried to enable a component that does not exist: ".concat(context);
                } else
                {
                    context = new String("Tried to enable a component that does not exist: ");
                }
                Log.w("AndroidComponentUtils", context);
            }
        } else
        {
            ComponentName componentname1 = new ComponentName(context, "com.google.android.apps.photos.envelope.EnvelopeActivityAlias");
            try
            {
                context.getPackageManager().setComponentEnabledSetting(componentname1, 0, 1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = String.valueOf(componentname1.getClassName());
                if (context.length() != 0)
                {
                    context = "Tried to restore a component that does not exist: ".concat(context);
                } else
                {
                    context = new String("Tried to restore a component that does not exist: ");
                }
                Log.w("AndroidComponentUtils", context);
            }
        }
        return new mue(true);
    }
}
