// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import java.util.Arrays;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ce, q, r

public class p
{

    public p()
    {
    }

    private ce[] c(Editable editable)
    {
        ce ace[] = (ce[])editable.getSpans(0, editable.length(), com/facebook/orca/contacts/picker/ce);
        Arrays.sort(ace, new q(this, editable));
        return ace;
    }

    r a(CharSequence charsequence)
    {
        if (!(charsequence instanceof Spannable))
        {
            return new r(0, charsequence.length());
        }
        Spannable spannable = (Spannable)charsequence;
        int k1 = Selection.getSelectionStart(spannable);
        if (k1 != Selection.getSelectionEnd(spannable))
        {
            return null;
        }
        int i = charsequence.length();
        charsequence = (ce[])spannable.getSpans(0, charsequence.length(), com/facebook/orca/contacts/picker/ce);
        int l1 = charsequence.length;
        int l = 0;
        int j = 0;
        do
        {
            int i1 = j;
            if (l < l1)
            {
                Object obj = charsequence[l];
                int i2 = spannable.getSpanStart(obj);
                int j2 = spannable.getSpanEnd(obj);
                if (i2 < k1 && j2 > k1)
                {
                    return null;
                }
                int j1;
                if (i2 < k1)
                {
                    j1 = Math.max(j, j2);
                    i1 = i;
                } else
                {
                    i1 = i;
                    j1 = j;
                    if (j2 > k1)
                    {
                        i1 = Math.min(i, i2);
                        j1 = j;
                    }
                }
                l++;
                i = i1;
                j = j1;
            } else
            {
                int k;
                do
                {
                    k = i;
                    if (i1 >= i)
                    {
                        break;
                    }
                    k = i;
                    if (!Character.isWhitespace(spannable.charAt(i1)))
                    {
                        break;
                    }
                    i1++;
                } while (true);
                for (; i1 < k - 1 && Character.isWhitespace(spannable.charAt(k - 1)); k--) { }
                return new r(i1, k);
            }
        } while (true);
    }

    public void a(Editable editable)
    {
        ce ace[] = c(editable);
        int j = ace.length;
        for (int i = 0; i < j; i++)
        {
            ce ce1 = ace[i];
            int k = editable.getSpanStart(ce1);
            int l = editable.getSpanEnd(ce1);
            if (l - k == 1 && editable.charAt(k) == ' ')
            {
                editable.removeSpan(ce1);
                editable.replace(k, l, "");
            }
        }

    }

    CharSequence b(CharSequence charsequence)
    {
        r r1 = a(charsequence);
        if (r1 == null)
        {
            return "";
        } else
        {
            return charsequence.subSequence(r1.a, r1.b);
        }
    }

    public void b(Editable editable)
    {
        ce ace[] = c(editable);
        if (ace.length == 0)
        {
            editable.clear();
            return;
        } else
        {
            editable.delete(editable.getSpanEnd(ace[0]), editable.length());
            return;
        }
    }
}
