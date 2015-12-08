// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.Collections;
import java.util.Comparator;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            Rule

public static final class languages
    implements xpr
{

    public static final Comparator COMPARATOR = new Comparator() {

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((Rule.Phoneme)obj, (Rule.Phoneme)obj1);
        }

        public int compare(Rule.Phoneme phoneme, Rule.Phoneme phoneme1)
        {
            int i = 0;
_L6:
            if (i >= phoneme.phonemeText.length())
            {
                break; /* Loop/switch isn't completed */
            }
            if (i < phoneme1.phonemeText.length()) goto _L2; else goto _L1
_L1:
            int j = 1;
_L4:
            return j;
_L2:
            int k;
            k = phoneme.phonemeText.charAt(i) - phoneme1.phonemeText.charAt(i);
            j = k;
            if (k != 0) goto _L4; else goto _L3
_L3:
            i++;
            if (true) goto _L6; else goto _L5
_L5:
            return phoneme.phonemeText.length() >= phoneme1.phonemeText.length() ? 0 : -1;
        }

    };
    private final guageSet languages;
    private final CharSequence phonemeText;

    public xpr append(CharSequence charsequence)
    {
        return new <init>((new StringBuilder()).append(phonemeText.toString()).append(charsequence.toString()).toString(), languages);
    }

    public guageSet getLanguages()
    {
        return languages;
    }

    public CharSequence getPhonemeText()
    {
        return phonemeText;
    }

    public Iterable getPhonemes()
    {
        return Collections.singleton(this);
    }

    public phonemeText join(phonemeText phonemetext)
    {
        return new <init>((new StringBuilder()).append(phonemeText.toString()).append(phonemetext.phonemeText.toString()).toString(), languages.restrictTo(phonemetext.languages));
    }



    public guageSet(CharSequence charsequence, guageSet guageset)
    {
        phonemeText = charsequence;
        languages = guageset;
    }
}
