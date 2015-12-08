// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.languages;

import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.languages:
//            b, Language

public final class a
{

    public static final List a;
    public static final List b;
    private static final b c[] = {
        new b("auto", "Detect language", true, false), new b("af", "Afrikaans"), new b("sq", "Albanian"), new b("ar", "Arabic"), new b("hy", "Armenian"), new b("az", "Azerbaijani"), new b("eu", "Basque"), new b("be", "Belarusian"), new b("bn", "Bengali"), new b("bs", "Bosnian"), 
        new b("bg", "Bulgarian"), new b("ca", "Catalan"), new b("ceb", "Cebuano"), new b("ny", "Chichewa"), new b("zh-CN", "Chinese", true, false), new b("zh-CN", "Chinese (Simplified)", false, true), new b("zh-TW", "Chinese (Traditional)", false, true), new b("hr", "Croatian"), new b("cs", "Czech"), new b("da", "Danish"), 
        new b("nl", "Dutch"), new b("en", "English"), new b("eo", "Esperanto"), new b("et", "Estonian"), new b("tl", "Filipino"), new b("fi", "Finnish"), new b("fr", "French"), new b("gl", "Galician"), new b("ka", "Georgian"), new b("de", "German"), 
        new b("el", "Greek"), new b("gu", "Gujarati"), new b("ht", "Haitian Creole"), new b("ha", "Hausa"), new b("iw", "Hebrew"), new b("hi", "Hindi"), new b("hmn", "Hmong"), new b("hu", "Hungarian"), new b("is", "Icelandic"), new b("ig", "Igbo"), 
        new b("id", "Indonesian"), new b("ga", "Irish"), new b("it", "Italian"), new b("ja", "Japanese"), new b("jw", "Javanese"), new b("kn", "Kannada"), new b("kk", "Kazakh"), new b("km", "Khmer"), new b("ko", "Korean"), new b("lo", "Lao"), 
        new b("la", "Latin"), new b("lv", "Latvian"), new b("lt", "Lithuanian"), new b("mk", "Macedonian"), new b("mg", "Malagasy"), new b("ms", "Malay"), new b("ml", "Malayalam"), new b("mt", "Maltese"), new b("mi", "Maori"), new b("mr", "Marathi"), 
        new b("mn", "Mongolian"), new b("my", "Myanmar (Burmese)"), new b("ne", "Nepali"), new b("no", "Norwegian"), new b("fa", "Persian"), new b("pl", "Polish"), new b("pt", "Portuguese"), new b("pa", "Punjabi"), new b("ro", "Romanian"), new b("ru", "Russian"), 
        new b("sr", "Serbian"), new b("st", "Sesotho"), new b("si", "Sinhala"), new b("sk", "Slovak"), new b("sl", "Slovenian"), new b("so", "Somali"), new b("es", "Spanish"), new b("su", "Sundanese"), new b("sw", "Swahili"), new b("sv", "Swedish"), 
        new b("tg", "Tajik"), new b("ta", "Tamil"), new b("te", "Telugu"), new b("th", "Thai"), new b("tr", "Turkish"), new b("uk", "Ukrainian"), new b("ur", "Urdu"), new b("uz", "Uzbek"), new b("vi", "Vietnamese"), new b("cy", "Welsh"), 
        new b("yi", "Yiddish"), new b("yo", "Yoruba"), new b("zu", "Zulu")
    };

    static 
    {
        int i = 0;
        a = new LinkedList();
        b = new LinkedList();
        b ab[] = c;
        for (int j = ab.length; i < j; i++)
        {
            b b1 = ab[i];
            if (b1.c)
            {
                a.add(new Language(b1.a, b1.b));
            }
            if (b1.d)
            {
                b.add(new Language(b1.a, b1.b));
            }
        }

    }
}
