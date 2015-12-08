// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.InputFilter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.e;
import com.fitbit.util.ap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

public class GreetingSelector extends DialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    private static String b = "[^A-Za-z0-9!#/()\\-\"\\.,;:?=%_\\s]";
    protected String a;
    private Device c;
    private EditText d;
    private TextView e;

    public GreetingSelector()
    {
    }

    static TextView a(GreetingSelector greetingselector)
    {
        return greetingselector.e;
    }

    private String a()
    {
        if (c != null && c.o() != null)
        {
            e e1 = c.o().a(TrackerOption.GREETING);
            if (e1 != null && e1.c() != null)
            {
                return (String)e1.c();
            }
        }
        return "";
    }

    static String a(GreetingSelector greetingselector, CharSequence charsequence)
    {
        return greetingselector.a(charsequence);
    }

    private String a(CharSequence charsequence)
    {
        charsequence = charsequence.toString().trim();
        boolean flag;
        if (charsequence.length() > 0 && !charsequence.equals(a()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return charsequence;
        } else
        {
            return null;
        }
    }

    private void a(FragmentActivity fragmentactivity)
    {
        d = new _cls1(fragmentactivity);
        d.setSingleLine();
        d.setSelectAllOnFocus(true);
        d.setText(a());
        d.setInputType(0x81091);
        d.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(8), new android.text.InputFilter.AllCaps()
        });
    }

    static boolean a(GreetingSelector greetingselector, String s)
    {
        return greetingselector.a(s);
    }

    private boolean a(String s)
    {
        Matcher matcher = Pattern.compile(b).matcher(s);
        if (matcher.find())
        {
            e.setText(String.format(getString(0x7f080241), new Object[] {
                Character.valueOf(s.charAt(matcher.start()))
            }));
            e.setVisibility(0);
            return false;
        } else
        {
            return true;
        }
    }

    static EditText b(GreetingSelector greetingselector)
    {
        return greetingselector.d;
    }

    private void b(FragmentActivity fragmentactivity)
    {
        e = new TextView(fragmentactivity);
        e.setTextColor(fragmentactivity.getResources().getColor(0x7f0f00be));
        e.setGravity(1);
        e.setVisibility(8);
    }

    private void b(String s)
    {
        if (c != null && c.o() != null)
        {
            e e1 = c.o().a(TrackerOption.GREETING);
            if (e1 != null)
            {
                e1.a(s);
            }
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (isResumed())
        {
            dialoginterface = a(d.getText());
            if (i == -1 && dialoginterface != null)
            {
                b(dialoginterface);
                an.a().a(c, getActivity());
                ((TrackerDetailsActivity)getActivity()).c();
            }
            dismiss();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = an.a().a(a);
        if (c == null)
        {
            dismiss();
        } else
        if (c.o() == null)
        {
            c.a(new TrackerSettings());
            return;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getActivity();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(bundle);
        builder.setTitle(0x7f080557);
        LinearLayout linearlayout = new LinearLayout(bundle);
        int i = ap.a(bundle, 4F);
        linearlayout.setPadding(i, i, i, i);
        linearlayout.setOrientation(1);
        a(bundle);
        b(bundle);
        linearlayout.addView(d, -1, -2);
        linearlayout.addView(e, -1, -2);
        builder.setView(linearlayout);
        builder.setPositiveButton(0x7f08042e, this);
        builder.setNegativeButton(0x7f0802c2, this);
        return builder.create();
    }

    public void onResume()
    {
        super.onResume();
        Button button = ((AlertDialog)getDialog()).getButton(-1);
        boolean flag;
        if (a(d.getText()) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
        d.post(new _cls2());
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
