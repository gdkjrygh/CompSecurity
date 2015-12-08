// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.e.aq;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.z;
import com.tinder.model.SparksEvent;
import com.tinder.utils.ad;
import com.tinder.utils.v;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            by

public final class s extends Fragment
    implements android.view.View.OnClickListener, aq, by
{

    View a;
    z b;

    public s()
    {
    }

    public final String e()
    {
        return "discover off";
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624529: 
            view = b;
            break;
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("discoverable", true);
            view.a(jsonobject, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            com.tinder.utils.v.b(view.toString());
        }
        v();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030095, viewgroup, false);
        a = layoutinflater.findViewById(0x7f0e0251);
        ad.b(a);
        a.setOnClickListener(this);
        return layoutinflater;
    }

    public final void u()
    {
        SparksEvent sparksevent = new SparksEvent("Recs.Discovery");
        sparksevent.put("discoveryOn", Boolean.valueOf(true));
        com.tinder.managers.a.a(sparksevent);
        ((aq)getActivity()).u();
    }

    public final void v()
    {
        try
        {
            ((aq)getActivity()).v();
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            return;
        }
    }
}
