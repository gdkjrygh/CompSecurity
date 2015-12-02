// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.notify.as;
import java.util.Date;

// Referenced classes of package com.facebook.contacts.contactcard:
//            aa, ab

public class  extends DialogFragment
{

    private int Z;
    private String aa;
    private ab ab;

    static ab a( )
    {
        return .ab;
    }

    public void a(ab ab1)
    {
        ab = ab1;
    }

    public void a(String s, int i)
    {
        aa = s;
        Z = i;
    }

    public Dialog c(Bundle bundle)
    {
        Object obj = n();
        bundle = (as)t.a(((Context) (obj))).a(com/facebook/orca/notify/as);
        android.app.ettingsDialogFragment ettingsdialogfragment = new android.app.ettingsDialogFragment.n(((Context) (obj)));
        ettingsdialogfragment.n(o.contact_notifications_dialog_label);
        Object obj1 = bundle.b();
        obj1 = DateFormat.getTimeFormat(((Context) (obj))).format(((Date) (obj1)));
        String s;
        String s1;
        int i;
        if (Z == 2)
        {
            bundle = new Date(bundle.a(aa).b() * 1000L);
            bundle = DateFormat.getTimeFormat(((Context) (obj))).format(bundle);
            bundle = ((Context) (obj)).getString(o.contact_notifications_muted_until, new Object[] {
                bundle
            });
        } else
        {
            bundle = ((Context) (obj)).getString(o.contact_notifications_muted_one_hour);
        }
        s = ((Context) (obj)).getString(o.contact_notifications_enabled);
        s1 = ((Context) (obj)).getString(o.contact_notifications_disabled);
        obj = ((Context) (obj)).getString(o.contact_notifications_muted_until, new Object[] {
            obj1
        });
        i = Z;
        obj1 = new aa(this);
        ettingsdialogfragment.ettingsDialogFragment(new CharSequence[] {
            s, s1, bundle, obj
        }, i, ((android.content.ngsDialogFragment) (obj1)));
        return ettingsdialogfragment.ettingsDialogFragment();
    }

    public ()
    {
    }
}
