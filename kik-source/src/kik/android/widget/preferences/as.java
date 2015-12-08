// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;
import android.widget.EditText;
import android.widget.Toast;
import com.kik.g.r;
import kik.a.d.aa;
import kik.a.d.k;
import kik.a.f.q;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.util.cy;

// Referenced classes of package kik.android.widget.preferences:
//            NamePreference

final class as extends r
{

    final Preference a;
    final NamePreference b;

    as(NamePreference namepreference, Preference preference)
    {
        b = namepreference;
        a = preference;
        super();
    }

    public final void a()
    {
        a.setEnabled(true);
        NamePreference.c(b);
    }

    public final void a(Object obj)
    {
        Object obj1 = (aa)obj;
        Toast.makeText(b.getContext(), b.b().getString(0x7f09016b), 0).show();
        k k1 = b.c.b(((aa) (obj1)).c);
        if (k1 != null)
        {
            if (((aa) (obj1)).d != null)
            {
                obj = ((aa) (obj1)).d;
            } else
            {
                obj = "";
            }
            if (((aa) (obj1)).e != null)
            {
                obj1 = ((aa) (obj1)).e;
            } else
            {
                obj1 = "";
            }
            k1.b((new StringBuilder()).append(((String) (obj))).append(" ").append(((String) (obj1))).toString().trim());
            b.c.a(k1);
        }
    }

    public final void a(Throwable throwable)
    {
        switch (q.a(throwable))
        {
        default:
            Toast.makeText(b.getContext(), b.b().getString(0x7f09037f, new Object[] {
                cy.a(throwable)
            }), 0).show();
            return;

        case 202: 
            throwable = new kik.android.chat.fragment.KikDialogFragment.a(NamePreference.a(b).getResources());
            break;
        }
        throwable.a(0x7f0902ba);
        throwable.b(0x7f090101);
        throwable.a(0x7f090193, null);
        b.a(throwable.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "dialog");
    }
}
