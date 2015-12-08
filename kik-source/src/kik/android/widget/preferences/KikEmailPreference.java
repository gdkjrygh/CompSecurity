// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.kik.e.a;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.sdkutils.d;
import kik.a.d.aa;
import kik.a.e.f;
import kik.a.e.w;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikEditTextPreference, m, q, KikPreference

public class KikEmailPreference extends KikEditTextPreference
{

    protected w b;
    protected f c;
    private EditText d;

    public KikEmailPreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010092);
    }

    public KikEmailPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, com.kik.d.b.a.c.j);
        setDialogLayoutResource(0x7f03008a);
        setDialogTitle(0x7f09029a);
    }

    static void a(KikEmailPreference kikemailpreference)
    {
        kikemailpreference.notifyChanged();
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    protected void onBindDialogView(View view)
    {
        super.onBindDialogView(view);
        aa aa1 = b.d();
        d = (EditText)view.findViewById(0x7f0e01c2);
        d.setText(aa1.a);
        d.setSelection(aa1.a.length());
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        aa aa1 = b.d();
        setDefaultValue(aa1.a);
        TextView textview = (TextView)view.findViewById(0x1020010);
        TextView textview1 = (TextView)view.findViewById(0x7f0e01c1);
        if (textview1 != null)
        {
            textview1.setText(aa1.a);
        }
        if (textview != null)
        {
            if (aa1.b.booleanValue())
            {
                textview.setText(getContext().getString(0x7f09000c));
            } else
            {
                textview.setText(getContext().getString(0x7f09000d));
            }
            textview.setBackgroundResource(0x7f070086);
            textview.setVisibility(0);
            textview.setOnClickListener(new m(this, aa1, view, this));
        }
    }

    protected void onDialogClosed(boolean flag)
    {
        c();
        if (!flag)
        {
            return;
        } else
        {
            callChangeListener(d.getText().toString());
            return;
        }
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        obj = d.getText().toString();
        KikEmailPreference kikemailpreference = (KikEmailPreference)preference;
        if (!((String) (obj)).matches(b().getString(0x7f0901e9)))
        {
            Toast.makeText(getContext(), 0x7f0900d2, 1).show();
            return false;
        } else
        {
            preference.setEnabled(false);
            preference = b.a(((String) (obj)));
            preference.a(com.kik.sdkutils.d.a(b(), new q(this, kikemailpreference, ((String) (obj)))));
            kik.android.widget.preferences.KikPreference.a(getContext().getString(0x7f090346), s.a(preference), b());
            return false;
        }
    }
}
