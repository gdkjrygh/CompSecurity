// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.preference.PreferenceManager;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.database.SharedPreferenceKey;
import com.squareup.otto.Bus;

public final class Aa
{
    public static interface a
    {

        public abstract void a(boolean flag);
    }


    private final LocationManager a;

    public Aa()
    {
        this(((Context) (SnapchatApplication.get())));
    }

    private Aa(Context context)
    {
        this((LocationManager)context.getSystemService("location"));
    }

    private Aa(LocationManager locationmanager)
    {
        a = locationmanager;
    }

    public static AlertDialog a(Context context, a a1)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        new Bt();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(0x7f080179);
        if (Bt.bA())
        {
            builder.setMessage(0x7f0802e7);
        } else
        {
            builder.setMessage(0x7f080178);
        }
        builder.setCancelable(false);
        builder.setPositiveButton(0x7f0801bc, new android.content.DialogInterface.OnClickListener(sharedpreferences, context, a1) {

            private SharedPreferences a;
            private Context b;
            private a c;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = a.edit();
                dialoginterface.putBoolean(SharedPreferenceKey.ALLOWED_GPS.getKey(), true);
                dialoginterface.apply();
                Aa.a(true);
                Bt.i(false);
                if (!Bt.bB())
                {
                    dialoginterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                    dialoginterface.addFlags(0x10000000);
                    b.startActivity(dialoginterface);
                }
                if (c != null)
                {
                    c.a(true);
                }
            }

            
            {
                a = sharedpreferences;
                b = context;
                c = a1;
                super();
            }
        });
        builder.setNegativeButton(0x7f08011c, new android.content.DialogInterface.OnClickListener(a1) {

            private a a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (a != null)
                {
                    a.a(false);
                }
            }

            
            {
                a = a1;
                super();
            }
        });
        return builder.create();
    }

    public static void a(boolean flag)
    {
        Bt.j(flag);
        Mf.a().a(new MD());
    }

    public final boolean a()
    {
        return a.isProviderEnabled("gps");
    }

    public final boolean b()
    {
        return a.isProviderEnabled("network");
    }
}
