// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.common.w:
//            p

public class o
{

    private final Resources a;
    private SpannableStringBuilder b;
    private LinkedList c;

    public o(Resources resources)
    {
        b = new SpannableStringBuilder();
        c = hq.b();
        a = resources;
    }

    public o a()
    {
        p p1;
        boolean flag;
        if (!c.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        p1 = (p)c.removeFirst();
        b.setSpan(p1.b, p1.a, b.length(), p1.c);
        return this;
    }

    public o a(int i)
    {
        b.append(a.getString(i));
        return this;
    }

    public o a(Object obj, int i)
    {
        c.addFirst(new p(b.length(), obj, i));
        return this;
    }

    public o a(String s)
    {
        b.append(s);
        return this;
    }

    public o a(String s, String s1, Object obj, int i)
    {
        Preconditions.checkState(c.isEmpty());
        s = Pattern.compile(Pattern.quote(s)).matcher(b);
        if (s.find())
        {
            int j = s.start();
            int k = s.end();
            b.replace(j, k, s1);
            b.setSpan(obj, j, s1.length() + j, i);
        }
        return this;
    }

    public SpannableString b()
    {
        return new SpannableString(b);
    }
}
