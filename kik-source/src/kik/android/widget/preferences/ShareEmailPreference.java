// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.util.AttributeSet;
import com.kik.e.a;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference

public class ShareEmailPreference extends KikPreference
{

    w b;

    public ShareEmailPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.g);
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        String s = String.format(b().getString(0x7f09023a), new Object[] {
            b.d().c
        });
        preference = String.format(b().getString(0x7f09023f), new Object[] {
            b.d().c
        });
        s = (new StringBuilder()).append(s).append("\n\n\n").append(b().getString(0x7f09023e)).toString();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.TEXT", s);
        intent.putExtra("android.intent.extra.SUBJECT", preference);
        b().startActivity(intent);
        return false;
    }
}
