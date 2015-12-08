// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package io.card.payment.i18n:
//            SupportedLocale

public class I18nManager
{

    static final boolean $assertionsDisabled;
    private static final Set RIGHT_TO_LEFT_LOCALE_SET;
    private static final Map SPECIAL_LOCALE_MAP;
    private static final String TAG = io/card/payment/i18n/I18nManager.getSimpleName();
    private SupportedLocale currentLocale;
    private Class enumClazz;
    private Map supportedLocales;

    public I18nManager(Class class1, List list)
    {
        supportedLocales = new LinkedHashMap();
        enumClazz = class1;
        for (class1 = list.iterator(); class1.hasNext(); addLocale((SupportedLocale)class1.next())) { }
        setLanguage(null);
    }

    private void addLocale(SupportedLocale supportedlocale)
    {
        String s = supportedlocale.getName();
        if (s == null)
        {
            throw new RuntimeException("Null localeName");
        }
        if (supportedLocales.containsKey(s))
        {
            throw new RuntimeException((new StringBuilder()).append("Locale ").append(s).append(" already added").toString());
        } else
        {
            supportedLocales.put(s, supportedlocale);
            logMissingLocalizations(s);
            return;
        }
    }

    private List getMissingLocaleMessages(String s)
    {
        SupportedLocale supportedlocale = (SupportedLocale)supportedLocales.get(s);
        ArrayList arraylist = new ArrayList();
        Log.i(TAG, (new StringBuilder()).append("Checking locale ").append(s).toString());
        Enum aenum[] = (Enum[])enumClazz.getEnumConstants();
        int j = aenum.length;
        for (int i = 0; i < j; i++)
        {
            Enum enum = aenum[i];
            String s1 = (new StringBuilder()).append("[").append(s).append(",").append(enum).append("]").toString();
            if (supportedlocale.getAdaptedDisplay(enum, null) == null)
            {
                arraylist.add((new StringBuilder()).append("Missing ").append(s1).toString());
            }
        }

        return arraylist;
    }

    private void logMissingLocalizations(String s)
    {
        String s1;
        for (s = getMissingLocaleMessages(s).iterator(); s.hasNext(); Log.i(TAG, s1))
        {
            s1 = (String)s.next();
        }

    }

    private SupportedLocale lookupSupportedLocale(String s)
    {
        Object obj3 = null;
        Object obj1 = null;
        Object obj = obj1;
        if (s != null)
        {
            if (s.length() < 2)
            {
                obj = obj1;
            } else
            {
                SupportedLocale supportedlocale = obj3;
                if (SPECIAL_LOCALE_MAP.containsKey(s))
                {
                    obj = (String)SPECIAL_LOCALE_MAP.get(s);
                    supportedlocale = (SupportedLocale)supportedLocales.get(obj);
                    Log.d(TAG, (new StringBuilder()).append("Overriding locale specifier ").append(s).append(" with ").append(((String) (obj))).toString());
                }
                obj = supportedlocale;
                if (supportedlocale == null)
                {
                    Object obj2;
                    if (s.contains("_"))
                    {
                        obj = s;
                    } else
                    {
                        obj = (new StringBuilder()).append(s).append("_").append(Locale.getDefault().getCountry()).toString();
                    }
                    obj = (SupportedLocale)supportedLocales.get(obj);
                }
                obj2 = obj;
                if (obj == null)
                {
                    obj2 = (SupportedLocale)supportedLocales.get(s);
                }
                obj = obj2;
                if (obj2 == null)
                {
                    s = s.substring(0, 2);
                    return (SupportedLocale)supportedLocales.get(s);
                }
            }
        }
        return ((SupportedLocale) (obj));
    }

    public SupportedLocale getLocaleFromSpecifier(String s)
    {
        SupportedLocale supportedlocale = null;
        if (s != null)
        {
            supportedlocale = lookupSupportedLocale(s);
        }
        Object obj = supportedlocale;
        if (supportedlocale == null)
        {
            obj = Locale.getDefault().toString();
            Log.d(TAG, (new StringBuilder()).append(s).append(" not found.  Attempting to look for ").append(((String) (obj))).toString());
            obj = lookupSupportedLocale(((String) (obj)));
        }
        s = ((String) (obj));
        if (obj == null)
        {
            Log.d(TAG, "defaulting to english");
            s = (SupportedLocale)supportedLocales.get("en");
        }
        if (!$assertionsDisabled && s == null)
        {
            throw new AssertionError();
        } else
        {
            return s;
        }
    }

    public String getString(Enum enum)
    {
        return getString(enum, currentLocale);
    }

    public String getString(Enum enum, SupportedLocale supportedlocale)
    {
        String s = Locale.getDefault().getCountry().toUpperCase(Locale.US);
        Object obj = supportedlocale.getAdaptedDisplay(enum, s);
        supportedlocale = ((SupportedLocale) (obj));
        if (obj == null)
        {
            supportedlocale = (new StringBuilder()).append("Missing localized string for [").append(currentLocale.getName()).append(",Key.").append(enum.toString()).append("]").toString();
            Log.i(TAG, supportedlocale);
            supportedlocale = ((SupportedLocale)supportedLocales.get("en")).getAdaptedDisplay(enum, s);
        }
        obj = supportedlocale;
        if (supportedlocale == null)
        {
            Log.i(TAG, (new StringBuilder()).append("Missing localized string for [en,Key.").append(enum.toString()).append("], so defaulting to keyname").toString());
            obj = enum.toString();
        }
        return ((String) (obj));
    }

    public void setLanguage(String s)
    {
        Log.d(TAG, (new StringBuilder()).append("setLanguage(").append(s).append(")").toString());
        currentLocale = null;
        currentLocale = getLocaleFromSpecifier(s);
        if (!$assertionsDisabled && currentLocale == null)
        {
            throw new AssertionError();
        } else
        {
            Log.d(TAG, (new StringBuilder()).append("setting locale to:").append(currentLocale.getName()).toString());
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!io/card/payment/i18n/I18nManager.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        SPECIAL_LOCALE_MAP = new HashMap();
        RIGHT_TO_LEFT_LOCALE_SET = new HashSet();
        SPECIAL_LOCALE_MAP.put("zh_CN", "zh-Hans");
        SPECIAL_LOCALE_MAP.put("zh_TW", "zh-Hant_TW");
        SPECIAL_LOCALE_MAP.put("zh_HK", "zh-Hant");
        SPECIAL_LOCALE_MAP.put("en_UK", "en_GB");
        SPECIAL_LOCALE_MAP.put("en_IE", "en_GB");
        SPECIAL_LOCALE_MAP.put("iw_IL", "he");
        SPECIAL_LOCALE_MAP.put("no", "nb");
        RIGHT_TO_LEFT_LOCALE_SET.add("he");
        RIGHT_TO_LEFT_LOCALE_SET.add("ar");
    }
}
