// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import java.util.regex.Pattern;

public final class a
{

    public static final Pattern a = Pattern.compile("[\\p{InHangulJamo}\\p{InHangulCompatibilityJamo}\\p{InHangulSyllables}\\p{InCjkRadicalsSupplement}\\p{InKangxiRadicals}\\p{InIdeographicDescriptionCharacters}\\p{InCjkSymbolsAndPunctuation}\\p{InEnclosedCjkLettersAndMonths}\\p{InCjkUnifiedIdeographs}\\p{InCjkUnifiedIdeographsExtensionA}\\p{InCjkUnifiedIdeographsExtensionB}\\p{InHiragana}\\p{InKatakana}]");
    public static final String b[] = {
        "de", "en", "es", "fr", "it"
    };

}
