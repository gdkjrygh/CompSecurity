// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.repository.UserLocale;
import java.util.Locale;
import java.util.StringTokenizer;

public final class UserLocaleRepository
{

    private static final String LANGUAGE_DELIMITER = ",";
    private static final String TAG = "nf_loc";
    private UserLocale currentAppLocale;
    private UserLocale defaultAppLocale;
    private String preferredLanguages;
    private UserLocale supportedLocales[];

    public UserLocaleRepository()
    {
        initSupportedLocales();
    }

    private UserLocale findBestMatch(String s)
    {
        Object obj = null;
        UserLocale auserlocale[] = toUserLocales(s);
        if (auserlocale.length < 1)
        {
            Log.w("nf_loc", "Empty list of preferred languages, set default");
            return null;
        }
        int i = 0;
        s = obj;
        do
        {
            if (i >= auserlocale.length)
            {
                break;
            }
            if (Log.isLoggable("nf_loc", 3))
            {
                Log.d("nf_loc", (new StringBuilder()).append("Choice #").append(i).append(": ").append(auserlocale[i]).toString());
            }
            for (int j = 0; j < supportedLocales.length;)
            {
                Object obj1;
label0:
                {
                    if (Log.isLoggable("nf_loc", 3))
                    {
                        Log.d("nf_loc", (new StringBuilder()).append("Try to match by locale with #").append(j).append(": ").append(supportedLocales[j]).toString());
                    }
                    obj1 = s;
                    if (auserlocale[i] == null)
                    {
                        break label0;
                    }
                    if (!auserlocale[i].equals(supportedLocales[j]))
                    {
                        obj1 = s;
                        if (!auserlocale[i].equalsByLanguage(supportedLocales[j]))
                        {
                            break label0;
                        }
                    }
                    if (Log.isLoggable("nf_loc", 3))
                    {
                        Log.d("nf_loc", (new StringBuilder()).append("Match by locale with #").append(j).append(": ").append(supportedLocales[j]).toString());
                    }
                    if (auserlocale[i].equals(supportedLocales[j]))
                    {
                        Log.d("nf_loc", (new StringBuilder()).append("Perfect Match by locale with #").append(j).append(": ").append(supportedLocales[j]).toString());
                        return supportedLocales[j];
                    }
                    obj1 = s;
                    if (s == null)
                    {
                        obj1 = supportedLocales[j];
                    }
                }
                j++;
                s = ((String) (obj1));
            }

            i++;
        } while (true);
        Log.i("nf_loc", (new StringBuilder()).append("findBestMatch: ").append(s).toString());
        return s;
    }

    private void initSupportedLocales()
    {
        supportedLocales = new UserLocale[12];
        defaultAppLocale = new UserLocale(Locale.ENGLISH.getLanguage(), null, "English");
        supportedLocales[0] = defaultAppLocale;
        supportedLocales[1] = new UserLocale(Locale.FRENCH.getLanguage(), null, "Fran\347ais");
        supportedLocales[2] = new UserLocale("es", null, "Espa\361ol");
        supportedLocales[3] = new UserLocale("pt", null, "Portugu\352s");
        supportedLocales[4] = new UserLocale(Locale.UK.getLanguage(), Locale.UK.getCountry(), "English-GB");
        supportedLocales[5] = new UserLocale("sv", null, "Svenskt");
        supportedLocales[6] = new UserLocale("nb", null, "Norske");
        supportedLocales[7] = new UserLocale("da", null, "Dansk");
        supportedLocales[8] = new UserLocale("fi", null, "Suomi");
        supportedLocales[9] = new UserLocale("nl", null, "Nederlands");
        supportedLocales[10] = new UserLocale(Locale.FRENCH.getLanguage(), Locale.CANADA.getCountry(), "Fran\347ais-CA");
        supportedLocales[11] = new UserLocale(Locale.GERMAN.getLanguage(), null, "Deutsch");
        UserLocale auserlocale[] = supportedLocales;
        int j = auserlocale.length;
        for (int i = 0; i < j; i++)
        {
            UserLocale userlocale = auserlocale[i];
            Log.d("nf_loc", (new StringBuilder()).append("").append(userlocale).toString());
        }

    }

    private String[] toArray(String s)
    {
        s = new StringTokenizer(s, ",");
        if (s.countTokens() < 1)
        {
            return new String[0];
        }
        String as[] = new String[s.countTokens()];
        for (int i = 0; s.hasMoreTokens(); i++)
        {
            as[i] = s.nextToken();
        }

        return as;
    }

    private UserLocale[] toUserLocales(String s)
    {
        s = new StringTokenizer(s, ",");
        if (s.countTokens() < 1)
        {
            return new UserLocale[0];
        }
        UserLocale auserlocale[] = new UserLocale[s.countTokens()];
        int j;
        for (int i = 0; s.hasMoreTokens(); i = j)
        {
            UserLocale userlocale = new UserLocale(s.nextToken());
            j = i + 1;
            auserlocale[i] = userlocale;
            if (Log.isLoggable("nf_loc", 3))
            {
                Log.d("nf_loc", (new StringBuilder()).append("Preffered locale ").append(j).append(":").append(userlocale).toString());
            }
        }

        return auserlocale;
    }

    public UserLocale getCurrentAppLocale()
    {
        return currentAppLocale;
    }

    public UserLocale getDefaultAppLocale()
    {
        return defaultAppLocale;
    }

    public String getPreferredLanguages()
    {
        return preferredLanguages;
    }

    public String[] getPreferredLanguagesAsArray()
    {
        if (preferredLanguages == null || "".equals(preferredLanguages.trim()))
        {
            return new String[0];
        } else
        {
            return toArray(preferredLanguages);
        }
    }

    public UserLocale[] getSupportedLocales()
    {
        return supportedLocales;
    }

    public boolean isPreferredLanguagesSet()
    {
        return preferredLanguages != null && !"".equals(preferredLanguages.trim());
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("nf_loc", "reset");
        preferredLanguages = null;
        currentAppLocale = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setApplicationLanguage(UserLocale userlocale)
    {
        if (currentAppLocale != null && currentAppLocale.equals(userlocale))
        {
            if (Log.isLoggable("nf_loc", 3))
            {
                Log.d("nf_loc", (new StringBuilder()).append("Keeping same application locale ").append(currentAppLocale.getRaw()).toString());
            }
            return;
        }
        if (Log.isLoggable("nf_loc", 3))
        {
            Log.d("nf_loc", (new StringBuilder()).append("Change locale from ").append(currentAppLocale).append(" to ").append(userlocale).toString());
        }
        currentAppLocale = userlocale;
    }

    public void setPreferredLanguages(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (!"".equals(s.trim()))
                {
                    break label0;
                }
            }
            Log.e("nf_loc", "Empty list of preferred languages, set to default");
            s1 = "";
        }
        preferredLanguages = s1;
        UserLocale userlocale = findBestMatch(s1);
        s = userlocale;
        if (userlocale == null)
        {
            Log.w("nf_loc", (new StringBuilder()).append("Match is not found under application supported languages for prefered languages: ").append(s1).append(". Default to ").append(defaultAppLocale).toString());
            s = defaultAppLocale;
        }
        setApplicationLanguage(s);
    }
}
