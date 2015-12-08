// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fsr
{

    private static void a(TextView textview)
    {
        textview.setMarqueeRepeatLimit(-1);
        textview.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        textview.setSingleLine(true);
        textview.setSelected(true);
    }

    public static void a(TextView textview, TextView textview1, String s, boolean flag)
    {
        if (fse.a(s))
        {
            return;
        }
        if (fse.b(s))
        {
            a(textview);
            return;
        } else
        {
            a(textview, textview1, flag);
            return;
        }
    }

    private static void a(TextView textview, TextView textview1, boolean flag)
    {
        textview = new gjk(textview, textview1);
        if (flag)
        {
            textview.b();
            return;
        } else
        {
            textview.a();
            return;
        }
    }

    public static void a(TextView textview, Flags flags)
    {
label0:
        {
            flags = (String)flags.a(fys.az);
            if (!fse.a(flags))
            {
                if (!fse.b(flags))
                {
                    break label0;
                }
                a(textview);
            }
            return;
        }
        a(textview, null, false);
    }
}
