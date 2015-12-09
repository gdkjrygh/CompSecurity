// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.fitbit.data.domain.User;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeUser;
import com.fitbit.home.ui.i;
import com.fitbit.util.o;
import java.util.Date;

// Referenced classes of package com.fitbit.challenges.ui:
//            InvitationExpiredDialogFragment_

public class InvitationExpiredDialogFragment extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{
    public static interface a
    {

        public abstract void a();
    }


    private i a;
    private Challenge b;
    private a c;

    public InvitationExpiredDialogFragment()
    {
        a = new i();
    }

    public static InvitationExpiredDialogFragment a(Challenge challenge, a a1)
    {
        InvitationExpiredDialogFragment invitationexpireddialogfragment = c();
        invitationexpireddialogfragment.a(challenge);
        invitationexpireddialogfragment.a(a1);
        return invitationexpireddialogfragment;
    }

    public static void a(FragmentManager fragmentmanager, String s, a a1)
    {
        fragmentmanager = (InvitationExpiredDialogFragment)fragmentmanager.findFragmentByTag(s);
        if (fragmentmanager != null)
        {
            fragmentmanager.a(a1);
        }
    }

    public static void a(FragmentManager fragmentmanager, String s, Challenge challenge, a a1)
    {
        InvitationExpiredDialogFragment invitationexpireddialogfragment1 = (InvitationExpiredDialogFragment)fragmentmanager.findFragmentByTag(s);
        InvitationExpiredDialogFragment invitationexpireddialogfragment = invitationexpireddialogfragment1;
        if (invitationexpireddialogfragment1 == null)
        {
            invitationexpireddialogfragment = c();
        }
        invitationexpireddialogfragment.a(challenge);
        invitationexpireddialogfragment.a(a1);
        invitationexpireddialogfragment.show(fragmentmanager, s);
    }

    public static InvitationExpiredDialogFragment c()
    {
        return InvitationExpiredDialogFragment_.d().a();
    }

    public Challenge a()
    {
        return b;
    }

    public void a(a a1)
    {
        c = a1;
    }

    public void a(Challenge challenge)
    {
        b = challenge;
    }

    public a b()
    {
        return c;
    }

    public void onClick(DialogInterface dialoginterface, int j)
    {
        if (c != null && -1 == j)
        {
            c.a();
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        String s1 = "";
        String s = "";
        bundle = "";
        if (b != null)
        {
            s1 = b.I().g().P();
            s = b.h();
            long l = o.b().getTime();
            long l1 = b.z().getTime();
            bundle = a.a(getActivity(), l - l1);
        }
        bundle = getString(0x7f0801a9, new Object[] {
            s1, s, bundle
        });
        builder.setTitle(0x7f08029a).setMessage(bundle).setPositiveButton(0x7f08042e, this);
        return builder.create();
    }
}
