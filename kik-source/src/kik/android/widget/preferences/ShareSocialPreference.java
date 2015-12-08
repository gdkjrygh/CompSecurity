// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.util.AttributeSet;
import android.widget.Toast;
import com.kik.e.a;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference

public class ShareSocialPreference extends KikPreference
{

    protected w b;

    public ShareSocialPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.h);
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = b.d();
        if (((aa) (preference)).c != null)
        {
            preference = new Intent("android.intent.action.VIEW", Uri.parse(String.format(b().getString(0x7f09010a), new Object[] {
                ((aa) (preference)).c
            })));
            b().startActivity(preference);
            return false;
        } else
        {
            Toast.makeText(getContext(), 0x7f0902e7, 0);
            return false;
        }
    }
}
