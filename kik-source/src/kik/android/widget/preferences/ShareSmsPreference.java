// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.preference.Preference;
import android.util.AttributeSet;
import android.widget.Toast;
import com.kik.e.a;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference

public class ShareSmsPreference extends KikPreference
{

    w b;

    public ShareSmsPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.f);
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = String.format(b().getString(0x7f09023a), new Object[] {
            b.d().c
        });
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("sms_body", preference);
        intent.setType("vnd.android-dir/mms-sms");
        try
        {
            b().startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Preference preference)
        {
            preference = b().getActivity();
            if (preference != null)
            {
                Toast.makeText(preference, preference.getResources().getString(0x7f090262), 0).show();
                return false;
            }
        }
        return false;
    }
}
