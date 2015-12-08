// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.app.Activity;
import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import com.kik.e.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.z;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.util.bf;
import kik.android.util.cq;

// Referenced classes of package kik.android.widget.preferences:
//            KikEditTextPreference, bd

public class PasswordPreference extends KikEditTextPreference
{

    protected w b;
    protected v c;
    private EditText d;
    private EditText e;
    private EditText f;

    public PasswordPreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010092);
    }

    public PasswordPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, com.kik.d.b.a.c.k);
        setDialogLayoutResource(0x7f03008c);
        setLayoutResource(0x7f030088);
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    protected void onBindDialogView(View view)
    {
        super.onBindDialogView(view);
        d = (EditText)view.findViewById(0x7f0e01c5);
        e = (EditText)view.findViewById(0x7f0e01c6);
        f = (EditText)view.findViewById(0x7f0e01c7);
        ((Activity)getContext()).getWindow().setSoftInputMode(3);
    }

    protected void onDialogClosed(boolean flag)
    {
        String s;
        String s2;
        String s3;
        String s4;
        String s5;
        c();
        s2 = getContext().getString(0x7f0901ec);
        if (!flag)
        {
            return;
        }
        ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(d.getWindowToken(), 0);
        s3 = d.getText().toString();
        s4 = e.getText().toString();
        s5 = f.getText().toString();
        s = null;
        String s1 = cq.a(MessageDigest.getInstance("SHA-1").digest(s3.getBytes()));
        s = s1;
_L2:
        z z1 = z.b(c);
        if (s3.length() == 0)
        {
            Toast.makeText(getContext(), 0x7f0901ba, 1).show();
            return;
        }
        if (!z1.d().equals(s))
        {
            Toast.makeText(getContext(), 0x7f0901a5, 1).show();
            return;
        }
        if (!s4.matches(s2))
        {
            Toast.makeText(getContext(), 0x7f0901a7, 1).show();
            return;
        }
        if (!s5.matches(s2))
        {
            Toast.makeText(getContext(), 0x7f0901a7, 1).show();
            return;
        }
        if (!s5.equals(s4))
        {
            Toast.makeText(getContext(), 0x7f0901a8, 1).show();
            return;
        } else
        {
            callChangeListener(s4);
            return;
        }
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        obj = e.getText().toString();
        if (!((String) (obj)).matches(b().getString(0x7f0901ec)))
        {
            Toast.makeText(getContext(), b().getString(0x7f0901a7), 1).show();
            return false;
        } else
        {
            preference.setEnabled(false);
            (new bd(this, ((String) (obj)), preference)).execute(new Void[0]);
            return false;
        }
    }
}
