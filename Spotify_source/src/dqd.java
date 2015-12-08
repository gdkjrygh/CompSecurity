// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.TextView;

public class dqd
    implements dqi
{

    private final ColorStateList a;
    private final ColorStateList b;
    private final ColorStateList c;

    public dqd(Context context)
    {
        a = dgo.c(context, 0x7f0101d1);
        b = dgo.c(context, 0x7f0101d2);
        c = dgo.c(context, 0x7f0101d3);
    }

    public final CharSequence a(dsc dsc1)
    {
        final class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.values().length];
                try
                {
                    b[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.values().length];
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[dsc1.getFormat().ordinal()])
        {
        default:
            throw new AssertionError((new StringBuilder("Unrecognized format ")).append(dsc1.getFormat()).toString());

        case 1: // '\001'
            return b(dsc1);

        case 2: // '\002'
            return dsc1.asHtml();

        case 3: // '\003'
            return dsc1.getText();
        }
    }

    public final void a(TextView textview, dsc dsc1, com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font font)
    {
        textview.setText(a(dsc1));
        if (dsc1.getFont() != com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.a)
        {
            font = dsc1.getFont();
        }
        if (textview.getTag(0x7f1100ea) == font) goto _L2; else goto _L1
_L1:
        _cls1.b[font.ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 101
    //                   2 133
    //                   3 145;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new AssertionError((new StringBuilder("appearance ")).append(font).append(" not implemented!").toString());
_L4:
        int i;
        i = 0x7f0101d6;
        dsc1 = a;
_L8:
        textview.setTextColor(dsc1);
        dgo.b(textview.getContext(), textview, i);
        textview.setTag(0x7f1100ea, font);
_L2:
        return;
_L5:
        i = 0x7f0101d8;
        dsc1 = b;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f0101dc;
        dsc1 = c;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public CharSequence b(dsc dsc1)
    {
        return dsc1.getText();
    }
}
