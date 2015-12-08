// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.app.Activity;
import android.content.Context;
import android.preference.Preference;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.kik.e.a;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.sdkutils.d;
import java.util.HashMap;
import kik.a.d.aa;
import kik.a.e.r;
import kik.a.e.w;

// Referenced classes of package kik.android.widget.preferences:
//            KikEditTextPreference, ar, as, KikPreference

public class NamePreference extends KikEditTextPreference
{

    protected w b;
    protected r c;
    TextWatcher d;
    private EditText e;
    private EditText f;
    private String g;
    private String h;

    public NamePreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010092);
    }

    public NamePreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, com.kik.d.b.a.c.i);
        d = new ar(this);
        setDialogLayoutResource(0x7f03008b);
        setLayoutResource(0x7f030088);
    }

    static EditText a(NamePreference namepreference)
    {
        return namepreference.e;
    }

    static EditText b(NamePreference namepreference)
    {
        return namepreference.f;
    }

    static void c(NamePreference namepreference)
    {
        namepreference.notifyChanged();
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    protected void onBindDialogView(View view)
    {
        super.onBindDialogView(view);
        h = b.d().d;
        g = b.d().e;
        e = (EditText)view.findViewById(0x7f0e01c3);
        f = (EditText)view.findViewById(0x7f0e01c4);
        e.setText(h);
        f.setText(g);
        e.addTextChangedListener(d);
        e.setSelection(h.length());
        e.requestFocus();
        ((Activity)getContext()).getWindow().setSoftInputMode(3);
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        h = b.d().d;
        g = b.d().e;
        view = (TextView)view.findViewById(0x7f0e01c1);
        if (view != null)
        {
            view.setText((new StringBuilder()).append(h).append(" ").append(g).toString());
        }
    }

    protected void onDialogClosed(boolean flag)
    {
        c();
        String s3 = getContext().getString(0x7f0901eb);
        if (flag)
        {
            String s1 = e.getText().toString();
            String s2 = f.getText().toString();
            if (s1.matches(s3) && s2.matches(s3))
            {
                if (h == null || g == null || !h.equals(s1) || !g.equals(s2))
                {
                    HashMap hashmap = new HashMap();
                    hashmap.put("first_name", s1);
                    hashmap.put("last_name", s2);
                    callChangeListener(hashmap);
                    return;
                }
            } else
            {
                Toast.makeText(getContext(), 0x7f090164, 1).show();
                return;
            }
        }
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        obj = e.getText().toString();
        String s1 = f.getText().toString();
        if (((String) (obj)).trim().length() == 0 || s1.trim().length() == 0)
        {
            Toast.makeText(getContext(), 0x7f090164, 1).show();
            return false;
        } else
        {
            preference.setEnabled(false);
            obj = b.a(((String) (obj)), s1);
            ((p) (obj)).a(com.kik.sdkutils.d.a(b(), new as(this, preference)));
            kik.android.widget.preferences.KikPreference.a(getContext().getString(0x7f090346), s.a(((p) (obj))), b());
            return false;
        }
    }
}
