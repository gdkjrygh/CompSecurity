// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.maps.internal.d;
import com.google.android.gms.maps.internal.j;
import com.google.android.gms.maps.model.e;

// Referenced classes of package com.google.android.gms.maps:
//            i, c, GoogleMapOptions, g, 
//            e

public class f extends Fragment
{

    private c zzapW;
    private final i zzaqH = new i(this);

    public f()
    {
    }

    public static f newInstance()
    {
        return new f();
    }

    public static f newInstance(GoogleMapOptions googlemapoptions)
    {
        f f1 = new f();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googlemapoptions);
        f1.setArguments(bundle);
        return f1;
    }

    public final c getMap()
    {
        Object obj = zzqr();
        if (obj != null)
        {
            try
            {
                obj = ((j) (obj)).a();
            }
            catch (RemoteException remoteexception)
            {
                throw new e(remoteexception);
            }
            if (obj != null)
            {
                if (zzapW == null || zzapW.a().asBinder() != ((d) (obj)).asBinder())
                {
                    zzapW = new c(((d) (obj)));
                }
                return zzapW;
            }
        }
        return null;
    }

    public void getMapAsync(com.google.android.gms.maps.e e1)
    {
        ap.b("getMapAsync must be called on the main thread.");
        zzaqH.a(e1);
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/f.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        i.a(zzaqH, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzaqH.a(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzaqH.a(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        zzaqH.e();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzaqH.d();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        i.a(zzaqH, activity);
        attributeset = GoogleMapOptions.a(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        zzaqH.a(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        zzaqH.f();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzaqH.c();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaqH.b();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/f.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        zzaqH.b(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected j zzqr()
    {
        zzaqH.g();
        if (zzaqH.a() == null)
        {
            return null;
        } else
        {
            return ((g)zzaqH.a()).f();
        }
    }
}
