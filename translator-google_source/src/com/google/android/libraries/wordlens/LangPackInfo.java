// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.wordlens.util.h;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.wordlens:
//            i

public class LangPackInfo
{

    private static final String CHAR_UNDERSCORE = "_";
    public static final int DEMO_ALL_INSTALLED = 4;
    public static final int DEMO_DISABLED = 3;
    public static final int DEMO_ERASE = 2;
    public static final int DEMO_OFF = 0;
    public static final int DEMO_REVERSE = 1;
    private static final String LANG_CODE_DEMO = "--";
    private static final String TEST_PRODUCT_IDS[] = {
        "android.test.purchase", "android.test.canceled", "android.test.refunded", "android.test.item_unavailable"
    };
    private static Map languageNameMap = null;
    private static Map sAbbrevToAbbrev = null;
    private static Map sAbbrevToProductIds = null;
    public int demoMode;
    public String destLang;
    public String packageName;
    public String srcLang;

    public LangPackInfo()
    {
        initProductIds();
        initProductAbbrevs();
    }

    public LangPackInfo(int j, String s)
    {
        initProductIds();
        initProductAbbrevs();
        demoMode = j;
        srcLang = s;
        destLang = "";
    }

    public LangPackInfo(String s, String s1)
    {
        initProductIds();
        initProductAbbrevs();
        demoMode = 0;
        srcLang = s;
        destLang = s1;
    }

    private static boolean LangIsInvalid(String s)
    {
        return s == null || s.length() == 0 || "??".equalsIgnoreCase(s) || "--".equalsIgnoreCase(s);
    }

    private static String descriptionFormat(String s, String s1, boolean flag)
    {
        String s2;
        if (flag)
        {
            s2 = "\u21C4";
        } else
        {
            s2 = "\u2192";
        }
        return (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s2).length() + String.valueOf(s1).length())).append(s).append(" ").append(s2).append(" ").append(s1).toString();
    }

    private static String expandToJavaLocaleName(String s)
    {
        String s1 = s;
        if (s.length() > 2)
        {
            s1 = String.valueOf(s.substring(0, 2));
            s = String.valueOf(s.substring(2));
            s1 = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("_").append(s).toString();
        }
        return s1;
    }

    public static String generateBidirectionalDescription(Context context, LangPackInfo langpackinfo)
    {
        return generateDescription(context, langpackinfo, true, true);
    }

    private static String generateDescription(Context context, LangPackInfo langpackinfo, boolean flag, boolean flag1)
    {
        switch (langpackinfo.demoMode)
        {
        default:
            context = langpackinfo.srcLang;
            langpackinfo = langpackinfo.destLang;
            if (context == null || langpackinfo == null)
            {
                return descriptionFormat(context, langpackinfo, flag);
            }
            break;

        case 4: // '\004'
            if (context != null)
            {
                return context.getString(i.store_empty);
            } else
            {
                return "Store Empty";
            }

        case 3: // '\003'
            if (context != null)
            {
                return context.getString(i.store_is_disabled);
            } else
            {
                return "Store Disabled";
            }

        case 1: // '\001'
        case 2: // '\002'
            StringBuilder stringbuilder = new StringBuilder();
            if (langpackinfo.demoMode == 2)
            {
                if (context != null)
                {
                    context = context.getString(i.lang_demo_erasewords);
                } else
                {
                    context = "Demo: Erase Words";
                }
                stringbuilder.append(context);
            } else
            {
                if (context != null)
                {
                    context = context.getString(i.lang_demo_reversewords);
                } else
                {
                    context = "Demo: Reverse Words";
                }
                stringbuilder.append(context);
            }
            if (!LangIsInvalid(langpackinfo.srcLang) && flag1)
            {
                stringbuilder.append(" (");
                stringbuilder.append(langpackinfo.srcLang);
                stringbuilder.append(")");
            }
            return stringbuilder.toString();
        }
        Object obj1 = new Locale(expandToJavaLocaleName(context));
        Object obj = new Locale(expandToJavaLocaleName(langpackinfo));
        obj1 = ((Locale) (obj1)).getDisplayLanguage();
        obj = ((Locale) (obj)).getDisplayLanguage();
        if (context.equals(obj1) || langpackinfo.equals(obj))
        {
            (new StringBuilder(String.valueOf(context).length() + 37 + String.valueOf(langpackinfo).length())).append("Unknown locale on device: src=").append(context).append(", dest=").append(langpackinfo);
            return descriptionFormat(lookupLanguageName(context), lookupLanguageName(langpackinfo), flag);
        } else
        {
            return descriptionFormat(((String) (obj1)), ((String) (obj)), flag);
        }
    }

    public static LangPackInfo getAllInstalledLangPack()
    {
        LangPackInfo langpackinfo = new LangPackInfo("", "");
        langpackinfo.demoMode = 4;
        return langpackinfo;
    }

    public static LangPackInfo getDisabledLangPack()
    {
        LangPackInfo langpackinfo = new LangPackInfo("", "");
        langpackinfo.demoMode = 3;
        return langpackinfo;
    }

    private static void initProductAbbrevs()
    {
        HashMap hashmap = new HashMap();
        sAbbrevToAbbrev = hashmap;
        hashmap.put("en_es", "en_es");
        sAbbrevToAbbrev.put("es_en", "en_es");
        sAbbrevToAbbrev.put("en_fr", "en_fr");
        sAbbrevToAbbrev.put("fr_en", "en_fr");
        sAbbrevToAbbrev.put("en_it", "en_it");
        sAbbrevToAbbrev.put("it_en", "en_it");
        sAbbrevToAbbrev.put("en_de", "en_de");
        sAbbrevToAbbrev.put("de_en", "en_de");
        sAbbrevToAbbrev.put("en_pt", "en_pt");
        sAbbrevToAbbrev.put("pt_en", "en_pt");
        sAbbrevToAbbrev.put("en_ru", "en_ru");
        sAbbrevToAbbrev.put("ru_en", "en_ru");
    }

    private static void initProductIds()
    {
        HashMap hashmap = new HashMap();
        sAbbrevToProductIds = hashmap;
        hashmap.put("en_es", Integer.valueOf(1));
        sAbbrevToProductIds.put("es_en", Integer.valueOf(1));
        sAbbrevToProductIds.put("en_fr", Integer.valueOf(2));
        sAbbrevToProductIds.put("fr_en", Integer.valueOf(2));
        sAbbrevToProductIds.put("en_it", Integer.valueOf(3));
        sAbbrevToProductIds.put("it_en", Integer.valueOf(3));
        sAbbrevToProductIds.put("en_de", Integer.valueOf(4));
        sAbbrevToProductIds.put("de_en", Integer.valueOf(4));
        sAbbrevToProductIds.put("en_pt", Integer.valueOf(5));
        sAbbrevToProductIds.put("pt_en", Integer.valueOf(5));
        sAbbrevToProductIds.put("en_ru", Integer.valueOf(6));
        sAbbrevToProductIds.put("ru_en", Integer.valueOf(6));
    }

    public static boolean isEraseWords(LangPackInfo langpackinfo)
    {
        return langpackinfo.demoMode == 2;
    }

    private static String lookupLanguageName(String s)
    {
        if (languageNameMap == null)
        {
            HashMap hashmap = new HashMap();
            languageNameMap = hashmap;
            hashmap.put("??", "(Unknown)");
            languageNameMap.put("en", "English");
            languageNameMap.put("es", "Spanish");
            languageNameMap.put("ru", "Russian");
            languageNameMap.put("fr", "French");
            languageNameMap.put("pt", "Portuguese");
            languageNameMap.put("ko", "Korean");
            languageNameMap.put("it", "Italian");
            languageNameMap.put("de", "German");
            languageNameMap.put("zhcn", "Chinese");
        }
        String s1 = (String)languageNameMap.get(s);
        s = s1;
        if (s1 == null)
        {
            s = "(NULL)";
        }
        return s;
    }

    public static String normalizeAbbrev(String s)
    {
        if (sAbbrevToAbbrev == null)
        {
            initProductAbbrevs();
        }
        String s1 = (String)sAbbrevToAbbrev.get(s);
        if (s1 == null)
        {
            s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                "Unable to normalize abbreviation: ".concat(s1);
                return s;
            } else
            {
                new String("Unable to normalize abbreviation: ");
                return s;
            }
        } else
        {
            return s1;
        }
    }

    public static int normalizeAbbrevToProductId(String s)
    {
        if (sAbbrevToProductIds == null)
        {
            initProductIds();
        }
        Integer integer = (Integer)sAbbrevToProductIds.get(s);
        if (integer == null)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                "Unable to get product ID for abbreviation: ".concat(s);
            } else
            {
                new String("Unable to get product ID for abbreviation: ");
            }
            return -1;
        } else
        {
            return integer.intValue();
        }
    }

    public static LangPackInfo parseLangPair(String s)
    {
        String s1;
        s1 = s.substring(0, s.indexOf("_"));
        s = s.substring(s.indexOf("_") + 1);
        if (s1.equals("--") || s.equals("--"))
        {
            break MISSING_BLOCK_LABEL_65;
        }
        s = new LangPackInfo(s1, s);
        return s;
        s;
_L2:
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public boolean equals(LangPackInfo langpackinfo, boolean flag)
    {
        if (demoMode != langpackinfo.demoMode)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (demoMode == 0 || !flag) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (srcLang == null && langpackinfo.srcLang != null)
        {
            return false;
        }
        if (destLang == null && langpackinfo.destLang != null)
        {
            return false;
        }
        if (srcLang.equalsIgnoreCase(langpackinfo.srcLang) && destLang.equalsIgnoreCase(langpackinfo.destLang)) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (LangPackInfo)obj;
        if (demoMode != ((LangPackInfo) (obj)).demoMode)
        {
            return false;
        }
        if (destLang == null)
        {
            if (((LangPackInfo) (obj)).destLang != null)
            {
                return false;
            }
        } else
        if (!destLang.equals(((LangPackInfo) (obj)).destLang))
        {
            return false;
        }
        if (srcLang != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((LangPackInfo) (obj)).srcLang == null) goto _L1; else goto _L3
_L3:
        return false;
        if (srcLang.equals(((LangPackInfo) (obj)).srcLang)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getAbbreviation()
    {
        String s = srcLang;
        String s1 = String.valueOf("_");
        String s2 = destLang;
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(s2).toString();
    }

    public String getDescription(Context context)
    {
        return generateDescription(context, this, false, true);
    }

    public String getDescription(Context context, boolean flag)
    {
        return generateDescription(context, this, false, flag);
    }

    public String getDisplayEncoding()
    {
        switch (demoMode)
        {
        default:
            return h.a(destLang);

        case 1: // '\001'
            return h.a(srcLang);
        }
    }

    public String getReverseAbbreviation()
    {
        String s = destLang;
        String s1 = String.valueOf("_");
        String s2 = srcLang;
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(s2).toString();
    }

    public String getSourceLangName()
    {
        return (new Locale(srcLang)).getDisplayLanguage();
    }

    public int hashCode()
    {
        int k = 0;
        int l = demoMode;
        int j;
        if (destLang == null)
        {
            j = 0;
        } else
        {
            j = destLang.hashCode();
        }
        if (srcLang != null)
        {
            k = srcLang.hashCode();
        }
        return (j + (l + 31) * 31) * 31 + k;
    }

    public boolean isDemo()
    {
        return 1 == demoMode || 2 == demoMode;
    }

    public boolean isEmpty()
    {
        return TextUtils.isEmpty(srcLang) && TextUtils.isEmpty(destLang);
    }

    public boolean isStoreDisabled()
    {
        return 3 == demoMode;
    }

    public boolean isStoreEmpty()
    {
        return 4 == demoMode;
    }

    public String toString()
    {
        String s = srcLang;
        String s1 = destLang;
        String s2 = getDescription(null);
        return (new StringBuilder(String.valueOf(s).length() + 18 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("LangPackInfo: [").append(s).append(",").append(s1).append("] ").append(s2).toString();
    }

}
