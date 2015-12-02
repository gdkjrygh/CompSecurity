// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.threads.ui.name;

import android.text.TextPaint;
import com.google.common.a.hq;
import java.util.List;

// Referenced classes of package com.facebook.messages.threads.ui.name:
//            b, c

public class a
{

    private final StringBuilder a = new StringBuilder(30);

    public a()
    {
    }

    private float a(CharSequence charsequence, boolean flag, TextPaint textpaint)
    {
        a.setLength(0);
        if (flag)
        {
            a.append(", ").append(charsequence);
        } else
        {
            a.append(charsequence);
        }
        return textpaint.measureText(a, 0, a.length());
    }

    private int a(int ai[], int i)
    {
        if (ai == null || ai.length == 0)
        {
            return 0;
        }
        if (ai.length == 1 || i < 10)
        {
            return ai[0];
        }
        if (ai.length == 2 || i < 100)
        {
            return ai[1];
        } else
        {
            return ai[2];
        }
    }

    private String a(String s, TextPaint textpaint, float f)
    {
        float f2 = textpaint.measureText("\u2026, ");
        int i = s.length();
        float f1;
        for (f1 = textpaint.measureText(s); f < f1 && i > 3; f1 = textpaint.measureText(s, 0, i) + f2)
        {
            i -= Character.charCount(s.codePointBefore(i));
        }

        if (f >= f1)
        {
            return s.substring(0, i);
        } else
        {
            return null;
        }
    }

    private void a(StringBuilder stringbuilder, String s, boolean flag)
    {
        if (flag)
        {
            stringbuilder.append(", ");
        }
        stringbuilder.append(s);
    }

    public c a(List list, int i, int j, int k, TextPaint textpaint, int ai[])
    {
        float f;
        float f4;
        float f5;
        Object obj;
        StringBuilder stringbuilder;
        obj = textpaint.getFontMetrics();
        f4 = ((android.graphics.Paint.FontMetrics) (obj)).bottom - ((android.graphics.Paint.FontMetrics) (obj)).top;
        f = Math.max(k, f4);
        obj = hq.a();
        list = b.a(list);
        byte byte0 = -1;
        f5 = textpaint.measureText(",");
        stringbuilder = new StringBuilder(100);
        k = j;
        j = byte0;
_L10:
        if (k <= 0 || list.b() <= 0 || f < f4) goto _L2; else goto _L1
_L1:
        float f2;
        int l;
        l = k - 1;
        f2 = f - f4;
        f = i;
        stringbuilder.setLength(0);
_L9:
        k = j;
        if (!list.hasNext()) goto _L4; else goto _L3
_L3:
        String s = (String)list.a();
        float f1;
        float f3;
        boolean flag;
        if (stringbuilder.length() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f3 = a(((CharSequence) (s)), flag, textpaint);
        StringBuilder stringbuilder1;
        String s1;
        int i1;
        if (list.b() > 1 && l > 0)
        {
            f1 = f3 + f5;
        } else
        {
            f1 = f3;
        }
        if (l <= 0 || f2 < f4) goto _L6; else goto _L5
_L5:
        if (f1 >= f) goto _L8; else goto _L7
_L7:
        list.next();
        if (stringbuilder.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(stringbuilder, s, flag);
_L11:
        f -= f3;
          goto _L9
_L8:
        stringbuilder.append(",");
        k = j;
_L4:
        if (stringbuilder.length() != 0)
        {
            ((List) (obj)).add(stringbuilder.toString());
        }
        j = k;
        f = f2;
        k = l;
          goto _L10
_L6:
label0:
        {
            if (list.b() != 1)
            {
                break label0;
            }
            if (f < f3)
            {
                j = 1;
            } else
            {
                if (stringbuilder.length() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(stringbuilder, s, flag);
            }
            list.next();
        }
          goto _L11
        k = list.b();
        i1 = a(ai, list.b());
        if (f - f3 >= (float)i1) goto _L13; else goto _L12
_L12:
label1:
        {
            if (k >= 5)
            {
                break label1;
            }
            stringbuilder1 = new StringBuilder();
            while (list.hasNext()) 
            {
                s1 = (String)list.next();
                if (stringbuilder.length() != 0 || stringbuilder1.length() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(stringbuilder1, s1, flag);
            }
            if (a(((CharSequence) (stringbuilder1)), false, textpaint) > f)
            {
                break label1;
            }
            stringbuilder.append(stringbuilder1);
            k = j;
        }
          goto _L4
        if (stringbuilder.length() != 0)
        {
            break MISSING_BLOCK_LABEL_575;
        }
        s = a(s, textpaint, f - (float)i1);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_575;
        }
        stringbuilder.append(s);
        stringbuilder.append("\u2026");
        j = k - 1;
_L14:
        k = j;
          goto _L4
_L13:
        list.next();
        if (stringbuilder.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(stringbuilder, s, flag);
          goto _L11
_L2:
        return new c(((List) (obj)), j);
        j = k;
          goto _L14
    }
}
