// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class ccw extends TextView
{

    private static final Set a;
    private CharSequence b;
    private float c;
    private boolean d;

    public ccw(Context context)
    {
        super(context);
        b = "";
    }

    private static SpannableString a(String s, float f)
    {
        s = new SpannableString(s);
        for (int i = 1; i < s.length(); i += 2)
        {
            s.setSpan(new ScaleXSpan(-0.1F + f), i, i + 1, 33);
        }

        return s;
    }

    private void a()
    {
        CharSequence charsequence;
        int i;
        charsequence = b;
        i = 0;
_L5:
        Object obj;
        if (i >= charsequence.length())
        {
            break MISSING_BLOCK_LABEL_159;
        }
        obj = Character.UnicodeBlock.of(charsequence.charAt(i));
        if (a.contains(obj)) goto _L2; else goto _L1
_L1:
        i = 0;
_L3:
        float f;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        CharSequence charsequence1 = b;
        f = c;
        obj = new StringBuilder();
        i = 0;
        while (i < charsequence1.length()) 
        {
            char c1 = charsequence1.charAt(i);
            ((StringBuilder) (obj)).append(c1);
            if (Character.isSpaceChar(c1))
            {
                ((StringBuilder) (obj)).append(' ');
                int j = ((StringBuilder) (obj)).length();
                if (j >= 3)
                {
                    ((StringBuilder) (obj)).setCharAt(j - 3, ' ');
                }
            } else
            {
                ((StringBuilder) (obj)).append('\240');
            }
            i++;
        }
        break MISSING_BLOCK_LABEL_177;
_L2:
        i++;
        continue; /* Loop/switch isn't completed */
        i = 1;
          goto _L3
        obj = ((StringBuilder) (obj)).substring(0, Math.max(0, ((StringBuilder) (obj)).length() - 1));
        String s = ((String) (obj));
        if (d)
        {
            s = ((String) (obj)).toUpperCase(Locale.getDefault());
        }
        super.setText(a(s, f), android.widget.TextView.BufferType.SPANNABLE);
        return;
        if (d)
        {
            super.setText(b.toString().toUpperCase(Locale.getDefault()), android.widget.TextView.BufferType.NORMAL);
            return;
        }
        super.setText(b, android.widget.TextView.BufferType.NORMAL);
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(float f)
    {
        c = f;
        a();
    }

    public final void setAllCaps(boolean flag)
    {
        d = flag;
        a();
    }

    public final void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        b = charsequence;
        a();
    }

    static 
    {
        HashSet hashset = new HashSet();
        a = hashset;
        hashset.add(Character.UnicodeBlock.ARROWS);
        a.add(Character.UnicodeBlock.BASIC_LATIN);
        a.add(Character.UnicodeBlock.BLOCK_ELEMENTS);
        a.add(Character.UnicodeBlock.BRAILLE_PATTERNS);
        a.add(Character.UnicodeBlock.CURRENCY_SYMBOLS);
        a.add(Character.UnicodeBlock.CYRILLIC);
        a.add(Character.UnicodeBlock.CYRILLIC_SUPPLEMENTARY);
        a.add(Character.UnicodeBlock.ENCLOSED_ALPHANUMERICS);
        a.add(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS);
        a.add(Character.UnicodeBlock.GENERAL_PUNCTUATION);
        a.add(Character.UnicodeBlock.GEOMETRIC_SHAPES);
        a.add(Character.UnicodeBlock.GOTHIC);
        a.add(Character.UnicodeBlock.GREEK);
        a.add(Character.UnicodeBlock.GREEK_EXTENDED);
        a.add(Character.UnicodeBlock.HEBREW);
        a.add(Character.UnicodeBlock.LATIN_1_SUPPLEMENT);
        a.add(Character.UnicodeBlock.LATIN_EXTENDED_A);
        a.add(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL);
        a.add(Character.UnicodeBlock.LATIN_EXTENDED_B);
        a.add(Character.UnicodeBlock.IPA_EXTENSIONS);
        a.add(Character.UnicodeBlock.LETTERLIKE_SYMBOLS);
        a.add(Character.UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS);
        a.add(Character.UnicodeBlock.MATHEMATICAL_OPERATORS);
        a.add(Character.UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A);
        a.add(Character.UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B);
        a.add(Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS);
        a.add(Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS);
        a.add(Character.UnicodeBlock.MISCELLANEOUS_TECHNICAL);
        a.add(Character.UnicodeBlock.MUSICAL_SYMBOLS);
        a.add(Character.UnicodeBlock.NUMBER_FORMS);
        a.add(Character.UnicodeBlock.OGHAM);
        a.add(Character.UnicodeBlock.OLD_ITALIC);
        a.add(Character.UnicodeBlock.OPTICAL_CHARACTER_RECOGNITION);
        a.add(Character.UnicodeBlock.PHONETIC_EXTENSIONS);
        a.add(Character.UnicodeBlock.SUPPLEMENTAL_ARROWS_A);
        a.add(Character.UnicodeBlock.SUPPLEMENTAL_ARROWS_B);
        a.add(Character.UnicodeBlock.SUPPLEMENTAL_MATHEMATICAL_OPERATORS);
    }
}
