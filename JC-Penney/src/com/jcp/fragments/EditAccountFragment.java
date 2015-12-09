// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.b.b;
import com.jcp.c.ad;
import com.jcp.c.l;
import com.jcp.e.ae;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.g.a;
import com.jcp.pojo.Profile;
import com.jcp.util.au;
import com.jcp.util.bk;
import com.jcp.util.z;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.jcp.fragments:
//            s, al, am, et, 
//            t

public class EditAccountFragment extends s
    implements android.view.View.OnClickListener, ae
{

    private l a;
    private boolean aj;
    private boolean ak;
    private String b;
    private String c;
    protected EditText changeEmail;
    protected EditText changeFirstName;
    protected EditText changeLastName;
    private String d;
    private String e;
    protected TextView errorMsgTextView;
    private TextView f;
    private boolean g;
    private InputMethodManager h;
    private boolean i;

    public EditAccountFragment()
    {
    }

    private Dialog Z()
    {
        android.graphics.Typeface typeface = z.a(i(), 5);
        Dialog dialog = new Dialog(i());
        dialog.requestWindowFeature(1);
        dialog.setContentView(0x7f030057);
        DialogHolder dialogholder = new DialogHolder(dialog);
        dialogholder.dialogButtonOk.setTypeface(typeface);
        dialogholder.dialogButtonCancel.setTypeface(typeface);
        dialogholder.mDialogText.setTypeface(typeface);
        dialogholder.dialogButtonOk.setOnClickListener(new al(this, dialogholder, dialog));
        dialogholder.dialogButtonCancel.setOnClickListener(new am(this, dialog));
        return dialog;
    }

    static l a(EditAccountFragment editaccountfragment, l l1)
    {
        editaccountfragment.a = l1;
        return l1;
    }

    static String a(EditAccountFragment editaccountfragment)
    {
        return editaccountfragment.e;
    }

    private void a(View view)
    {
        ButterKnife.inject(this, view);
        view = i().getActionBar();
        view.setDisplayShowHomeEnabled(true);
        view.setDisplayShowTitleEnabled(true);
        View view1 = LayoutInflater.from(i()).inflate(0x7f030040, null);
        ((TextView)view1.findViewById(0x7f0e01de)).setText(0x7f070188);
        f = (TextView)view1.findViewById(0x7f0e01df);
        f.setOnClickListener(this);
        view.setCustomView(view1);
        view.setDisplayShowCustomEnabled(true);
        errorMsgTextView.setVisibility(8);
        h = (InputMethodManager)i().getSystemService("input_method");
        g = false;
    }

    private void a(EditText edittext)
    {
        edittext.setBackgroundResource(0x7f020124);
        U();
    }

    private boolean a(EditText edittext, Editable editable)
    {
        boolean flag = false;
        if (editable.length() == 0)
        {
            edittext.setBackgroundResource(0x7f0201b7);
            edittext.setHintTextColor(j().getColor(0x7f0d006c));
            U();
            flag = true;
        }
        return flag;
    }

    static l b(EditAccountFragment editaccountfragment)
    {
        return editaccountfragment.a;
    }

    public void U()
    {
        if (aj || i || ak)
        {
            errorMsgTextView.setVisibility(0);
            errorMsgTextView.setHintTextColor(j().getColor(0x7f0d006c));
            return;
        } else
        {
            errorMsgTextView.setVisibility(8);
            return;
        }
    }

    public void V()
    {
        boolean flag2 = false;
        h.hideSoftInputFromWindow(i().getCurrentFocus().getWindowToken(), 0);
        String s1 = changeFirstName.getEditableText().toString();
        String s2 = changeLastName.getEditableText().toString();
        String s4 = changeEmail.getEditableText().toString();
        boolean flag;
        boolean flag1;
        if (!s1.equalsIgnoreCase(b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!s2.equalsIgnoreCase(c))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!s4.equalsIgnoreCase(d))
        {
            flag2 = true;
        }
        if ((flag || flag1) && flag2)
        {
            g = true;
            Z().show();
        } else
        {
            if (flag2)
            {
                Z().show();
                return;
            }
            if (flag || flag1)
            {
                Map map = X();
                String s3 = com.jcp.b.b.B();
                a = new l(i());
                a.a(this);
                a.a(map, s3);
                return;
            }
            t t1 = a(i());
            if (t1 != null)
            {
                t1.a("EditAccountFragment", "ProfileFragment", new et());
                return;
            }
        }
    }

    public Map W()
    {
        return ad.a(changeEmail.getEditableText().toString(), e.trim());
    }

    public Map X()
    {
        return (new ad()).d(changeFirstName.getEditableText().toString()).e(changeLastName.getEditableText().toString()).a();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03001b, viewgroup, false);
        a(((View) (layoutinflater)));
        viewgroup = h();
        if (viewgroup != null)
        {
            if (viewgroup.containsKey(a(0x7f0701dd)))
            {
                b = viewgroup.getString(a(0x7f0701dd));
                changeFirstName.setText(b);
                changeFirstName.setSelection(b.length());
            }
            if (viewgroup.containsKey(a(0x7f070267)))
            {
                c = viewgroup.getString(a(0x7f070267));
                changeLastName.setText(c);
            }
            if (viewgroup.containsKey(a(0x7f07018d)))
            {
                d = viewgroup.getString(a(0x7f07018d));
                changeEmail.setText(d);
            }
        }
        f.setOnClickListener(this);
        return layoutinflater;
    }

    protected String a()
    {
        return "EDITACCOUNT";
    }

    public void a(int j, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (!com.jcp.http.b.a(j))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        errormessageentitycontainer = a(i());
        com.jcp.g.a.c(true);
        if (!g) goto _L2; else goto _L1
_L1:
        g = false;
        errormessageentitycontainer = X();
        String s1 = com.jcp.b.b.B();
        a = new l(i());
        a.a(this);
        a.a(errormessageentitycontainer, s1);
_L4:
        return;
_L2:
        if (errormessageentitycontainer == null) goto _L4; else goto _L3
_L3:
        com.jcp.b.a.e(true);
        errormessageentitycontainer.a("EditAccountFragment", "ProfileFragment", new et());
        return;
        au.a(i(), a(0x7f0701bb), errormessageentitycontainer.getErrorMessage());
        return;
    }

    protected void afterChangeEmailTextChanged(Editable editable)
    {
        i = a(changeEmail, editable);
    }

    protected void afterChangeFirstNameTextChanged(Editable editable)
    {
        aj = a(changeFirstName, editable);
    }

    protected void afterChangeLastNameTextChanged(Editable editable)
    {
        ak = a(changeLastName, editable);
    }

    public void b(int j, String s1)
    {
    }

    public void d(Bundle bundle)
    {
        Profile profile = bk.a(i().getApplicationContext());
        if (profile != null)
        {
            e = profile.getPassword();
        }
        super.d(bundle);
    }

    protected void onChangeEmailTextChanged()
    {
        a(changeEmail);
        i = false;
    }

    protected void onChangeFirstNameTextChanged()
    {
        a(changeFirstName);
        aj = false;
    }

    protected void onChangeLastNameTextChanged()
    {
        a(changeLastName);
        ak = false;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624415: 
            view = changeFirstName.getEditableText().toString();
            break;
        }
        String s1 = changeLastName.getEditableText().toString();
        String s2 = changeEmail.getEditableText().toString();
        Matcher matcher = b.a.matcher(s2);
        if (view.equals(""))
        {
            au.a(i(), a(0x7f0701bb), a(0x7f070461));
            return;
        }
        if (s1.equals(""))
        {
            au.a(i(), a(0x7f0701bb), a(0x7f070463));
            return;
        }
        if (s2.equals(""))
        {
            au.a(i(), a(0x7f0701bb), a(0x7f07045e));
            return;
        }
        if (!matcher.matches())
        {
            au.a(i(), a(0x7f0701bb), a(0x7f07045e));
            return;
        } else
        {
            V();
            return;
        }
    }

    private class DialogHolder
    {

        final EditAccountFragment a;
        protected Button dialogButtonCancel;
        protected Button dialogButtonOk;
        protected TextView mDialogText;
        protected EditText updateEmail;

        protected DialogHolder(Dialog dialog)
        {
            a = EditAccountFragment.this;
            super();
            ButterKnife.inject(this, dialog);
        }
    }

}
