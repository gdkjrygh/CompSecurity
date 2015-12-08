// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.fitbit.data.bl.an;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionInfo;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.r;
import java.util.List;

public class AppUpdateManager
    implements com.fitbit.serverinteraction.restrictions.RestrictionsController.a
{
    public static class UpdateAvailableDialogFragment extends UpdateDialogFragment
    {

        protected void a()
        {
            UISavedState.c(true);
            super.a();
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new android.app.AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 0x7f0c01d0));
            bundle.setMessage(r.b(this));
            bundle.setTitle(r.a(this));
            bundle.setPositiveButton(0x7f08036d, new android.content.DialogInterface.OnClickListener(this) {

                final UpdateAvailableDialogFragment a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    a.e();
                    a.a();
                }

            
            {
                a = updateavailabledialogfragment;
                super();
            }
            });
            bundle.setNegativeButton(0x7f0802c2, new android.content.DialogInterface.OnClickListener(this) {

                final UpdateAvailableDialogFragment a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    a.a();
                }

            
            {
                a = updateavailabledialogfragment;
                super();
            }
            });
            return bundle.create();
        }

        public UpdateAvailableDialogFragment()
        {
        }
    }

    public static class UpdateDialogFragment extends DialogFragment
    {

        private static final String a = "com.fitbit.AppUpdateManager.UpdateAvailableDialogFragment.ARG_RESTRICTION";
        private boolean b;

        protected void a()
        {
            b = true;
            dismiss();
            AppUpdateManager.b(AppUpdateManager.a());
        }

        public void a(RestrictionInfo restrictioninfo)
        {
            if (restrictioninfo != null)
            {
                Bundle bundle = r.a(d(), restrictioninfo.d());
                bundle.putSerializable("com.fitbit.AppUpdateManager.UpdateAvailableDialogFragment.ARG_RESTRICTION", restrictioninfo);
                setArguments(bundle);
            }
        }

        public boolean b()
        {
            return b;
        }

        public RestrictionInfo c()
        {
            Bundle bundle = getArguments();
            if (bundle != null && bundle.containsKey("com.fitbit.AppUpdateManager.UpdateAvailableDialogFragment.ARG_RESTRICTION"))
            {
                return (RestrictionInfo)bundle.getSerializable("com.fitbit.AppUpdateManager.UpdateAvailableDialogFragment.ARG_RESTRICTION");
            } else
            {
                return null;
            }
        }

        protected int d()
        {
            return 0;
        }

        protected boolean e()
        {
            try
            {
                Intent intent = new Intent("android.intent.action.VIEW");
                String s = getActivity().getApplicationContext().getPackageName();
                intent.setData(Uri.parse((new StringBuilder()).append("market://details?id=").append(s).toString()));
                startActivity(intent);
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                Toast.makeText(getActivity(), 0x7f08018c, 1).show();
                return false;
            }
            return false;
        }

        public UpdateDialogFragment()
        {
            b = false;
            setCancelable(false);
        }
    }

    public static class UpdateRequiredDialogFragment extends UpdateAvailableDialogFragment
    {

        protected int d()
        {
            return 0x7f080534;
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new android.app.AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 0x7f0c01d0));
            bundle.setMessage(r.b(this));
            bundle.setTitle(r.a(this));
            bundle.setNeutralButton(0x7f08036d, new android.content.DialogInterface.OnClickListener(this) {

                final UpdateRequiredDialogFragment a;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    a.e();
                    a.a();
                }

            
            {
                a = updaterequireddialogfragment;
                super();
            }
            });
            return bundle.create();
        }

        public UpdateRequiredDialogFragment()
        {
        }
    }


    public static final String a = "com.fitbit.AppUpdateManager.DIALOG_TAG";
    private static AppUpdateManager b = null;
    private FitbitActivity c;

    private AppUpdateManager()
    {
        ServerGateway.a().b().b(this);
    }

    public static AppUpdateManager a()
    {
        com/fitbit/AppUpdateManager;
        JVM INSTR monitorenter ;
        AppUpdateManager appupdatemanager;
        if (b == null)
        {
            b = new AppUpdateManager();
        }
        appupdatemanager = b;
        com/fitbit/AppUpdateManager;
        JVM INSTR monitorexit ;
        return appupdatemanager;
        Exception exception;
        exception;
        throw exception;
    }

    static void a(AppUpdateManager appupdatemanager)
    {
        appupdatemanager.c();
    }

    private void b()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                final AppUpdateManager a;

                public void run()
                {
                    AppUpdateManager.a(a);
                }

            
            {
                a = AppUpdateManager.this;
                super();
            }
            });
            return;
        } else
        {
            c();
            return;
        }
    }

    static void b(AppUpdateManager appupdatemanager)
    {
        appupdatemanager.b();
    }

    private UpdateDialogFragment c(RestrictionInfo restrictioninfo)
    {
        UpdateRequiredDialogFragment updaterequireddialogfragment;
        Object obj1;
        updaterequireddialogfragment = null;
        obj1 = null;
        if (restrictioninfo == null) goto _L2; else goto _L1
_L1:
        if (!restrictioninfo.b()) goto _L4; else goto _L3
_L3:
        Object obj = new UpdateRequiredDialogFragment();
_L6:
        updaterequireddialogfragment = ((UpdateRequiredDialogFragment) (obj));
        if (obj != null)
        {
            ((UpdateDialogFragment) (obj)).a(restrictioninfo);
            updaterequireddialogfragment = ((UpdateRequiredDialogFragment) (obj));
        }
_L2:
        return updaterequireddialogfragment;
_L4:
        obj = obj1;
        if (an.a().b() != null)
        {
            obj = obj1;
            if (!UISavedState.q())
            {
                obj = new UpdateAvailableDialogFragment();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void c()
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        UpdateDialogFragment updatedialogfragment;
        RestrictionInfo restrictioninfo;
        updatedialogfragment = (UpdateDialogFragment)c.getSupportFragmentManager().findFragmentByTag("com.fitbit.AppUpdateManager.DIALOG_TAG");
        restrictioninfo = ServerGateway.a().b().d();
        if (updatedialogfragment != null && !updatedialogfragment.b()) goto _L4; else goto _L3
_L3:
        updatedialogfragment = c(restrictioninfo);
_L6:
        if (updatedialogfragment != null)
        {
            updatedialogfragment.show(c.getSupportFragmentManager().beginTransaction(), "com.fitbit.AppUpdateManager.DIALOG_TAG");
        }
_L2:
        return;
_L4:
        RestrictionInfo restrictioninfo1 = updatedialogfragment.c();
        if (restrictioninfo1 == null)
        {
            updatedialogfragment.dismiss();
            updatedialogfragment = c(restrictioninfo);
            continue; /* Loop/switch isn't completed */
        }
        if (restrictioninfo1.b())
        {
            if (restrictioninfo == null || !restrictioninfo.b())
            {
                updatedialogfragment.dismiss();
                if (restrictioninfo != null)
                {
                    updatedialogfragment = c(restrictioninfo);
                    continue; /* Loop/switch isn't completed */
                }
            }
        } else
        if (restrictioninfo1.a() && restrictioninfo != null && !restrictioninfo1.equals(restrictioninfo))
        {
            updatedialogfragment.dismiss();
            updatedialogfragment = c(restrictioninfo);
            continue; /* Loop/switch isn't completed */
        }
        updatedialogfragment = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(RestrictionInfo restrictioninfo)
    {
    }

    public void a(FitbitActivity fitbitactivity)
    {
        if (c != fitbitactivity)
        {
            c = fitbitactivity;
            b();
        }
    }

    public void a(List list)
    {
    }

    public void b(RestrictionInfo restrictioninfo)
    {
        b();
    }

    public void b(FitbitActivity fitbitactivity)
    {
        if (c == fitbitactivity)
        {
            c = null;
        }
    }

}
