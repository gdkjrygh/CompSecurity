// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

// Referenced classes of package io.card.payment:
//            v, k, b

final class i
    implements v
{

    private static int b[] = {
        4, 11
    };
    private static int c[] = {
        4, 9, 14
    };
    private String a;
    private int d;

    public i()
    {
        d = 0;
    }

    public i(String s)
    {
        d = 0;
        a = s;
    }

    public final boolean a()
    {
        if (c()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        Object obj = a;
        int ai[] = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        obj = new StringCharacterIterator(((String) (obj)));
        char c1 = ((CharacterIterator) (obj)).last();
        int l = 0;
        for (int j = 0; c1 != '\uFFFF'; j++)
        {
            if (!Character.isDigit(c1))
            {
                break; /* Loop/switch isn't completed */
            }
            l += (new int[][] {
                ai, new int[] {
                    0, 2, 4, 6, 8, 1, 3, 5, 7, 9
                }
            })[j & 1][c1 - 48];
            c1 = ((CharacterIterator) (obj)).previous();
        }

        if (l % 10 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
_L4:
        if (flag)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void afterTextChanged(Editable editable)
    {
        boolean flag = false;
        a = k.b(editable.toString());
        b b1 = io.card.payment.b.b(a);
        int j = ((flag) ? 1 : 0);
        if (d > 1)
        {
            int i1 = d;
            int j1 = d - 1;
            d = 0;
            j = ((flag) ? 1 : 0);
            if (i1 > j1)
            {
                editable.delete(j1, i1);
                j = ((flag) ? 1 : 0);
            }
        }
        while (j < editable.length()) 
        {
            char c1 = editable.charAt(j);
            int l;
            if (b1.a() == 15 && (j == 4 || j == 11) || (b1.a() == 16 || b1.a() == 14) && (j == 4 || j == 9 || j == 14))
            {
                l = j;
                if (c1 != ' ')
                {
                    editable.insert(j, " ");
                    l = j;
                }
            } else
            {
                l = j;
                if (c1 == ' ')
                {
                    editable.delete(j, j + 1);
                    l = j - 1;
                }
            }
            j = l + 1;
        }
    }

    public final String b()
    {
        return a;
    }

    public final void beforeTextChanged(CharSequence charsequence, int j, int l, int i1)
    {
    }

    public final boolean c()
    {
        b b1;
        if (!TextUtils.isEmpty(a))
        {
            if (a.length() == (b1 = io.card.payment.b.b(a)).a())
            {
                return true;
            }
        }
        return false;
    }

    public final CharSequence filter(CharSequence charsequence, int j, int l, Spanned spanned, int i1, int j1)
    {
        String s = k.b((new SpannableStringBuilder(spanned)).replace(i1, j1, charsequence, j, l).toString());
        j = io.card.payment.b.b(s).a();
        if (s.length() > j)
        {
            return "";
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(charsequence);
        int ai[];
        int k1;
        if (j == 15)
        {
            ai = b;
        } else
        {
            ai = c;
        }
        k1 = j1 - i1;
        for (j = 0; j < ai.length;)
        {
label0:
            {
                if (charsequence.length() == 0 && i1 == ai[j] && spanned.charAt(i1) == ' ')
                {
                    d = ai[j];
                }
                j1 = l;
                if (i1 - k1 > ai[j])
                {
                    break label0;
                }
                j1 = l;
                if ((i1 + l) - k1 < ai[j])
                {
                    break label0;
                }
                int l1 = ai[j] - i1;
                if (l1 != l)
                {
                    j1 = l;
                    if (l1 < 0)
                    {
                        break label0;
                    }
                    j1 = l;
                    if (l1 >= l)
                    {
                        break label0;
                    }
                    j1 = l;
                    if (spannablestringbuilder.charAt(l1) == ' ')
                    {
                        break label0;
                    }
                }
                spannablestringbuilder.insert(l1, " ");
                j1 = l + 1;
            }
            j++;
            l = j1;
        }

        return spannablestringbuilder;
    }

    public final void onTextChanged(CharSequence charsequence, int j, int l, int i1)
    {
    }

}
