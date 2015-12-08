// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            PhoneticEngine, Rule

private static final class maxPhonemes
{

    private final List finalRules;
    private boolean found;
    private int i;
    private final CharSequence input;
    private int maxPhonemes;
    private found phonemeBuilder;

    public int getI()
    {
        return i;
    }

    public i getPhonemeBuilder()
    {
        return phonemeBuilder;
    }

    public phonemeBuilder invoke()
    {
        found = false;
        int j = 0;
        Iterator iterator = finalRules.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Rule rule = (Rule)iterator.next();
            int k = rule.getPattern().length();
            j = k;
            if (!rule.patternAndContextMatches(input, i))
            {
                continue;
            }
            phonemeBuilder = phonemeBuilder.ply(rule.getPhoneme(), maxPhonemes);
            found = true;
            j = k;
            break;
        } while (true);
        if (!found)
        {
            j = 1;
        }
        i = i + j;
        return this;
    }

    public boolean isFound()
    {
        return found;
    }

    public (List list, CharSequence charsequence,  , int j, int k)
    {
        if (list == null)
        {
            throw new NullPointerException("The finalRules argument must not be null");
        } else
        {
            finalRules = list;
            phonemeBuilder = ;
            input = charsequence;
            i = j;
            maxPhonemes = k;
            return;
        }
    }
}
