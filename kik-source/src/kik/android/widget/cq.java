// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.kik.android.a;
import java.util.Vector;
import kik.a.d.k;
import kik.a.e.i;

// Referenced classes of package kik.android.widget:
//            cp

final class cq
    implements android.content.DialogInterface.OnClickListener
{

    final a a;
    final String b;
    final CheckBox c;
    final i d;
    final Vector e;
    final k f;
    final cp g;

    cq(cp cp, a a1, String s, CheckBox checkbox, i j, Vector vector, k k)
    {
        g = cp;
        a = a1;
        b = s;
        c = checkbox;
        d = j;
        e = vector;
        f = k;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        com.kik.android.a.f f1 = a.b("Report Spam Clicked");
        f1.a("Screen", b);
        if (j == -2)
        {
            f1.a("Button Tapped", "Cancel");
            dialoginterface.cancel();
        } else
        {
            i k;
            if (c.isChecked())
            {
                dialoginterface = "Report With History";
            } else
            {
                dialoginterface = "Report";
            }
            f1.a("Button Tapped", dialoginterface);
            k = d;
            if (c.isChecked())
            {
                dialoginterface = e;
            } else
            {
                dialoginterface = null;
            }
            k.a(dialoginterface, f);
        }
        f1.b();
    }
}
