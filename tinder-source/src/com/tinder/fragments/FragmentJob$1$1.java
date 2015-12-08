// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.ProgressDialog;
import android.view.View;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.f;
import com.facebook.login.e;
import com.tinder.managers.z;
import com.tinder.model.Career;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.fragments:
//            FragmentJob

final class a
    implements com.tinder.model.eshListener
{

    final ProgressDialog a;
    final a b;

    public final void onFailure()
    {
        a.dismiss();
        Toast.makeText(b.b.getActivity(), 0x7f060248, 0);
    }

    public final void onProfileLoaded()
    {
        if (FragmentJob.a(b.b) != null)
        {
            FragmentJob.a(b.b).setVisibility(8);
        }
        b.b.b = b.b.f.b();
        b.b.b();
        a.dismiss();
    }

    istener(istener istener, ProgressDialog progressdialog)
    {
        b = istener;
        a = progressdialog;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/FragmentJob$1

/* anonymous class */
    final class FragmentJob._cls1
        implements f
    {

        final FragmentJob a;

        public final void a()
        {
        }

        public final void a(FacebookException facebookexception)
        {
            v.b(facebookexception.getMessage());
        }

        public final void a(Object obj)
        {
            AccessToken.a(((e)obj).a);
            obj = new ProgressDialog(a.getActivity());
            ((ProgressDialog) (obj)).setIndeterminate(true);
            ((ProgressDialog) (obj)).setMessage("Fetching your work history");
            if (a.isAdded())
            {
                ((ProgressDialog) (obj)).show();
            }
            Career.forceRefreshCareer(new FragmentJob._cls1._cls1(this, ((ProgressDialog) (obj))));
        }

            
            {
                a = fragmentjob;
                super();
            }
    }

}
