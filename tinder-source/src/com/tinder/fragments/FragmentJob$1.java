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
        Career.forceRefreshCareer(new com.tinder.model.Career.ForceRefreshListener(((ProgressDialog) (obj))) {

            final ProgressDialog a;
            final FragmentJob._cls1 b;

            public final void onFailure()
            {
                a.dismiss();
                Toast.makeText(b.a.getActivity(), 0x7f060248, 0);
            }

            public final void onProfileLoaded()
            {
                if (FragmentJob.a(b.a) != null)
                {
                    FragmentJob.a(b.a).setVisibility(8);
                }
                b.a.b = b.a.f.b();
                b.a.b();
                a.dismiss();
            }

            
            {
                b = FragmentJob._cls1.this;
                a = progressdialog;
                super();
            }
        });
    }

    _cls1.a(FragmentJob fragmentjob)
    {
        a = fragmentjob;
        super();
    }
}
