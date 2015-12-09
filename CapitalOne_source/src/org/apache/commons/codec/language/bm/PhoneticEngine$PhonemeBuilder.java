// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            PhoneticEngine

static final class <init>
{

    private final Set phonemes;

    public static <init> empty(<init> <init>1)
    {
        return new <init>(Collections.singleton(new <init>("", <init>1)));
    }

    public <init> append(CharSequence charsequence)
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        for (Iterator iterator = phonemes.iterator(); iterator.hasNext(); linkedhashset.add(((phonemes)iterator.next()).phonemes(charsequence))) { }
        return new <init>(linkedhashset);
    }

    public <init> apply(<init> <init>1, int i)
    {
        LinkedHashSet linkedhashset;
        linkedhashset = new LinkedHashSet();
        Iterator iterator = phonemes.iterator();
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                <init> <init>2 = (phonemes)iterator.next();
                Iterator iterator1 = <init>1.phonemes().iterator();
                while (iterator1.hasNext()) 
                {
                    <init> <init>3 = <init>2.phonemes((phonemes)iterator1.next());
                    if (!<init>3.phonemes().phonemes())
                    {
                        if (linkedhashset.size() >= i)
                        {
                            break label0;
                        }
                        linkedhashset.add(<init>3);
                    }
                }
            }
        } while (true);
        return new <init>(linkedhashset);
    }

    public Set getPhonemes()
    {
        return phonemes;
    }

    public String makeString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        phonemes phonemes1;
        for (Iterator iterator = phonemes.iterator(); iterator.hasNext(); stringbuilder.append(phonemes1.phonemes()))
        {
            phonemes1 = (phonemes)iterator.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("|");
            }
        }

        return stringbuilder.toString();
    }

    private (Set set)
    {
        phonemes = set;
    }

    phonemes(Set set, phonemes phonemes1)
    {
        this(set);
    }
}
