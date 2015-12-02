// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.i;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.w.o;
import com.facebook.k;
import com.facebook.widget.RadioButtonWithSubtitle;
import com.facebook.widget.text.CustomUrlLikeSpan;

// Referenced classes of package com.facebook.contacts.contactcard:
//            a, b, c, e, 
//            d, f

public class BlockContactDialogFragment extends DialogFragment
{

    private Dialog Z;
    private int aa;
    private f ab;
    private RadioButtonWithSubtitle ac;
    private RadioButtonWithSubtitle ad;

    public BlockContactDialogFragment()
    {
        aa = 0;
    }

    static f a(BlockContactDialogFragment blockcontactdialogfragment)
    {
        return blockcontactdialogfragment.ab;
    }

    static void a(BlockContactDialogFragment blockcontactdialogfragment, int j)
    {
        blockcontactdialogfragment.d(j);
    }

    static Dialog b(BlockContactDialogFragment blockcontactdialogfragment)
    {
        return blockcontactdialogfragment.Z;
    }

    static int c(BlockContactDialogFragment blockcontactdialogfragment)
    {
        return blockcontactdialogfragment.aa;
    }

    private void d(int j)
    {
        aa = j;
        switch (j)
        {
        default:
            return;

        case -1: 
            ad.setChecked(false);
            ac.setChecked(false);
            return;

        case 0: // '\0'
            ad.setChecked(false);
            ac.setChecked(true);
            return;

        case 1: // '\001'
            ad.setChecked(true);
            break;
        }
        ac.setChecked(false);
    }

    public void a(f f)
    {
        ab = f;
    }

    public Dialog c(Bundle bundle)
    {
        bundle = l().getLayoutInflater().inflate(k.block_contact_dialog, null);
        ac = (RadioButtonWithSubtitle)bundle.findViewById(com.facebook.i.mute_contact_button);
        ad = (RadioButtonWithSubtitle)bundle.findViewById(com.facebook.i.block_contact_button);
        CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
        customurllikespan.a(new a(this));
        TextView textview = (TextView)bundle.findViewById(com.facebook.i.block_contact_dialog_report_abuse);
        Resources resources = bundle.getResources();
        o o1 = new o(resources);
        o1.a(resources.getString(com.facebook.o.contact_card_block_user_dialog_report_abuse));
        o1.a("[[here_link]]", resources.getString(com.facebook.o.contact_card_block_user_dialog_here_link), customurllikespan, 33);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        textview.setText(o1.b());
        ac.setOnCheckedChangeListener(new b(this));
        ad.setOnCheckedChangeListener(new c(this));
        Z = (new android.app.AlertDialog.Builder(l())).setView(bundle).setNegativeButton(com.facebook.o.dialog_cancel, new e(this)).setPositiveButton(com.facebook.o.dialog_confirm, new d(this)).create();
        return Z;
    }

    public void d(Bundle bundle)
    {
        int j = 0;
        super.d(bundle);
        if (bundle != null)
        {
            j = bundle.getInt("radioSelectionBundleKey", 0);
        }
        d(j);
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("radioSelectionBundleKey", aa);
    }
}
