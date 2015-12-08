// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import kik.android.chat.fragment.KikDialogFragment;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.d.a;
import kik.android.d.c;
import kik.android.d.d;
import kik.android.util.ar;
import kik.android.util.bg;

// Referenced classes of package kik.android.widget:
//            cg, cf, ch, ci, 
//            cj, ck

public final class ce
{

    public static ar a;
    private static boolean b = false;

    public static void a(Context context)
    {
        if (context != null)
        {
            a.c().edit().putInt("kik.version.number.eula", 45).commit();
        }
    }

    public static void a(Context context, KikScopedDialogFragment kikscopeddialogfragment)
    {
        if (context != null && kikscopeddialogfragment != null)
        {
            SharedPreferences sharedpreferences = a.c();
            d.a(context).a(new a(context, "eula-resign-app", true, null, a));
            int i = sharedpreferences.getInt("kik.version.number.eula", 0);
            if (!b && i < 45)
            {
                Object obj = View.inflate(context, 0x7f030040, null);
                Object obj1 = (TextView)((View) (obj)).findViewById(0x7f0e00f1);
                String s = (new bg(context)).a();
                ((TextView) (obj1)).setText(Html.fromHtml(context.getString(0x7f09005c, new Object[] {
                    s
                })));
                obj1 = new kik.android.chat.fragment.KikDialogFragment.a(context.getResources());
                ((kik.android.chat.fragment.KikDialogFragment.a) (obj1)).a(((View) (obj))).b(true).a(0x7f0902c3, new cg(context)).b(0x7f090302, new cf(context, s));
                obj = ((kik.android.chat.fragment.KikDialogFragment.a) (obj1)).a();
                ((KikDialogFragment) (obj)).a();
                b = true;
                kikscopeddialogfragment.a(((KikDialogFragment) (obj)));
                ((KikDialogFragment) (obj)).a(new ch(context, kikscopeddialogfragment));
                ((KikDialogFragment) (obj)).a(new ci(context, kikscopeddialogfragment));
                return;
            }
        }
    }

    public static void a(ar ar1)
    {
        a = ar1;
    }

    static boolean a()
    {
        b = false;
        return false;
    }

    static void b(Context context, KikScopedDialogFragment kikscopeddialogfragment)
    {
        b = false;
        View view = kikscopeddialogfragment.getView();
        if (view != null)
        {
            view.postDelayed(new cj(context, kikscopeddialogfragment), 10L);
        }
    }

    static void c(Context context, KikScopedDialogFragment kikscopeddialogfragment)
    {
        View view = View.inflate(context, 0x7f03003f, null);
        kik.android.chat.fragment.KikDialogFragment.a a1 = new kik.android.chat.fragment.KikDialogFragment.a(context.getResources());
        a1.a(view).b(false).a(0x7f090193, new ck(context, kikscopeddialogfragment));
        kikscopeddialogfragment.a(a1.a());
    }

}
