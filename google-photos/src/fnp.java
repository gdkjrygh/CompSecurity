// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.widget.TextView;

public final class fnp
{

    private final fnt a;

    fnp(fnt fnt)
    {
        a = fnt;
    }

    static fnt a(fnp fnp1)
    {
        return fnp1.a;
    }

    public final void a(TextView textview, String s, fnl fnl)
    {
        if (b.Ig == null)
        {
            b.Ig = new ois();
        }
        s = (Spannable)Html.fromHtml(s, null, b.Ig);
        URLSpan aurlspan[] = (URLSpan[])s.getSpans(0, s.length(), android/text/style/URLSpan);
        if (aurlspan.length > 0)
        {
            URLSpan urlspan = aurlspan[0];
            p.b("help".equals(Uri.parse(urlspan.getURL()).getScheme()));
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s.toString());
            int i = s.getSpanStart(urlspan);
            int j = s.getSpanEnd(urlspan);
            spannablestringbuilder.setSpan(new fnq(this), i, j, 33);
            textview.setText(spannablestringbuilder);
            spannablestringbuilder.insert(j, " ");
            spannablestringbuilder.insert(j, textview.getResources().getString(b.pI));
            textview.setContentDescription(spannablestringbuilder);
            textview.setOnClickListener(new fnr(this, fnl));
        }
    }
}
