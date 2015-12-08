// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.util.ContactUtil;

public class ChangeLanguageDialog extends SkypeDialogFragment
{

    Account account;
    ContactUtil contactUtil;

    public ChangeLanguageDialog()
    {
    }

    private int getIndexForLanguage(String s, String as[])
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= as.length)
                {
                    break label1;
                }
                j = i;
                if (s.equals(as[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return 0;
    }

    private String getLanguageCodeForIndex(int i)
    {
        String as[] = contactUtil.d();
        if (i >= 0 && i < as.length)
        {
            return as[i];
        } else
        {
            return null;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(getString(0x7f080253));
        String as[] = contactUtil.c();
        String s = account.getLanguagesProp();
        bundle.a(as, getIndexForLanguage(contactUtil.i(s), as), new android.content.DialogInterface.OnClickListener() {

            final ChangeLanguageDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = getLanguageCodeForIndex(i);
                if (dialoginterface != null)
                {
                    account.setStrProperty(PROPKEY.CONTACT_LANGUAGES, dialoginterface);
                    account.setServersideStrProperty(PROPKEY.CONTACT_LANGUAGES, dialoginterface);
                    dismiss();
                }
            }

            
            {
                this$0 = ChangeLanguageDialog.this;
                super();
            }
        });
        return bundle.c();
    }

}
