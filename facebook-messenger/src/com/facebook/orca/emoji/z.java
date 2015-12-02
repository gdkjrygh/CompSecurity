// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.Spannable;
import android.widget.EditText;
import com.facebook.common.w.j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.orca.emoji:
//            c, y, aa

public class z
{

    private final aa a;
    private final Resources b;

    z(aa aa1, Resources resources)
    {
        a = aa1;
        b = resources;
    }

    private y a(c c1, int i)
    {
        c1 = (BitmapDrawable)b.getDrawable(c1.a());
        int k = c1.getIntrinsicWidth();
        int l = c1.getIntrinsicHeight();
        int i1 = j.a(b, 16F);
        c1.setBounds(0, 0, (k * i) / i1, (l * i) / i1);
        return new y(c1);
    }

    private void a(Spannable spannable, int i, int k, int l, boolean flag)
    {
        int i1;
        if (l == -1)
        {
            l = spannable.length();
            i1 = k;
        } else
        {
            l = k + l;
            i1 = k;
        }
        for (; i1 < l; i1 += k)
        {
            int k1 = Character.codePointAt(spannable, i1);
            k = Character.charCount(k1);
            int j1 = 0;
            if (i1 + k < spannable.length())
            {
                j1 = Character.codePointAt(spannable, i1 + k);
            }
            c c1 = a.a(k1, j1);
            if (c1 == null)
            {
                continue;
            }
            if (c1.c() != 0)
            {
                k = Character.charCount(c1.b()) + Character.charCount(c1.c());
            }
            spannable.setSpan(a(c1, i), i1, i1 + k, 33);
        }

        if (flag)
        {
            Matcher matcher = aa.q.matcher(spannable);
            while (matcher.find()) 
            {
                c c2 = a.a(matcher.group(1));
                if (c2 != null)
                {
                    spannable.setSpan(a(c2, i), matcher.start(1), matcher.end(1), 33);
                }
            }
        }
    }

    public void a(Spannable spannable, int i)
    {
        a(spannable, i, 0, -1, true);
    }

    public void a(Spannable spannable, int i, int k, int l)
    {
        a(spannable, i, k, l, false);
    }

    public void a(EditText edittext, c c1)
    {
        int i = edittext.getSelectionStart();
        int k = edittext.getSelectionEnd();
        StringBuilder stringbuilder = new StringBuilder(4);
        stringbuilder.append(Character.toChars(c1.b()));
        if (c1.c() != 0)
        {
            stringbuilder.append(Character.toChars(c1.c()));
        }
        edittext.getEditableText().replace(i, k, stringbuilder);
    }
}
