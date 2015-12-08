// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.CountryCode;
import com.skype.android.util.NetworkUtil;
import java.io.File;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MnvUtil
{
    public static final class VERIFY_METHOD extends Enum
    {

        private static final VERIFY_METHOD $VALUES[];
        public static final VERIFY_METHOD SMS;
        public static final VERIFY_METHOD VOICE;
        private final String verifyMethod;

        public static VERIFY_METHOD valueOf(String s)
        {
            return (VERIFY_METHOD)Enum.valueOf(com/skype/android/app/mnv/MnvUtil$VERIFY_METHOD, s);
        }

        public static VERIFY_METHOD[] values()
        {
            return (VERIFY_METHOD[])$VALUES.clone();
        }

        public final String toString()
        {
            return name();
        }

        public final String verifyMethod()
        {
            return verifyMethod;
        }

        static 
        {
            SMS = new VERIFY_METHOD("SMS", 0, "Sms");
            VOICE = new VERIFY_METHOD("VOICE", 1, "Voice");
            $VALUES = (new VERIFY_METHOD[] {
                SMS, VOICE
            });
        }

        private VERIFY_METHOD(String s, int i, String s1)
        {
            super(s, i);
            verifyMethod = s1;
        }
    }


    private static final int DEFAULT_REQUIRED_PROCESSORS_COUNT = 2;
    private static final long MNV_DEFAULT_SPINNER_TIMEOUT = 10000L;
    private static final long MNV_SMS_SPINNER_TIMEOUT = 30000L;
    private static final String PROCESSORS_DIRECTORY = "/sys/devices/system/cpu/";
    private static Logger log = Logger.getLogger("MnvUtil");
    private AccountProvider accountProvider;
    private final EcsConfiguration configuration;
    private final ContactUtil contactUtil;
    private final NetworkUtil networkUtil;

    public MnvUtil(AccountProvider accountprovider, NetworkUtil networkutil, EcsConfiguration ecsconfiguration, ContactUtil contactutil)
    {
        networkUtil = networkutil;
        accountProvider = accountprovider;
        configuration = ecsconfiguration;
        contactUtil = contactutil;
    }

    private String fixCountryForUK(String s)
    {
        if (s == null)
        {
            return "";
        }
        if (s.equalsIgnoreCase("gb"))
        {
            return "UK";
        } else
        {
            return s.toUpperCase(Locale.US);
        }
    }

    private String removeLeadingZeros(String s)
    {
        Matcher matcher = Pattern.compile("(0*)(.*)").matcher(s);
        if (matcher.matches())
        {
            s = matcher.group(2);
        }
        log.info((new StringBuilder("MNV removeLeadingZeros: ")).append(s).toString());
        return s;
    }

    private String removePlusCode(int i, String s)
    {
        String s2 = (new StringBuilder("+")).append(i).toString();
        String s1 = s;
        if (s.startsWith(s2))
        {
            s1 = s.replace(s2, "");
        }
        log.info((new StringBuilder("MNV removePlusCode: ")).append(s1).toString());
        return s1;
    }

    public String cleanPhoneNumber(String s, int i)
    {
        s = removeLeadingZeros(removePlusCode(i, stripPhoneNumber(s)));
        log.info((new StringBuilder("MNV cleanPhoneNumber: ")).append(s).toString());
        return s;
    }

    public boolean comparePhoneNumbers(String s, String s1)
    {
        return PhoneNumberUtils.compare(s, s1);
    }

    protected CountryCode getCountryCode()
    {
        return getDeviceCountryCode();
    }

    protected int getCountryCodeFromString(String s)
    {
        return Integer.parseInt(TextUtils.split(s, "-")[1]);
    }

    protected CountryCode getCountryCodeObjectFromString(String s)
    {
        s = TextUtils.split(s, "-")[0];
        return contactUtil.h(s);
    }

    public CountryCode getDeviceCountryCode()
    {
        return networkUtil.a(contactUtil, accountProvider.get());
    }

    long getNativeProgressTimeout()
    {
        int i;
        try
        {
            i = Integer.parseInt(configuration.getNativeSpinnerTimeout());
        }
        catch (NumberFormatException numberformatexception)
        {
            return 10000L;
        }
        return (long)i;
    }

    int getProcessorCount()
    {
        File afile[] = (new File("/sys/devices/system/cpu/")).listFiles();
        int i = 0;
        int l = afile.length;
        int j = 0;
_L2:
        int k;
        k = i;
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = Pattern.matches("cpu[0-9]+", afile[j].getName());
        k = i;
        if (flag)
        {
            k = i + 1;
        }
        j++;
        i = k;
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        exception.printStackTrace();
        k = Runtime.getRuntime().availableProcessors();
_L1:
        return k;
    }

    int getRequiredProcessorsCount()
    {
        int i;
        try
        {
            i = Integer.parseInt(configuration.getRequiredProcessorsCount());
        }
        catch (NumberFormatException numberformatexception)
        {
            return 2;
        }
        return i;
    }

    long getSmsProgressTimeout()
    {
        int i;
        try
        {
            i = Integer.parseInt(configuration.getSmsSpinnerTimeout());
        }
        catch (NumberFormatException numberformatexception)
        {
            return 30000L;
        }
        return (long)i;
    }

    protected String getUserCountry()
    {
        return getUserCountry(getCountryCode());
    }

    protected String getUserCountry(CountryCode countrycode)
    {
        if (countrycode == null)
        {
            return "";
        } else
        {
            return getUserCountry(countrycode.b(), countrycode.c());
        }
    }

    protected String getUserCountry(String s, int i)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = getDeviceCountryCode().b();
        }
        s = fixCountryForUK(s1);
        return String.format(Locale.US, "%s-%d", new Object[] {
            s.toUpperCase(Locale.US), Integer.valueOf(i)
        });
    }

    public String getUserLanguage()
    {
        String s1 = Locale.getDefault().getLanguage().toLowerCase(Locale.US);
        String s2 = Locale.getDefault().getCountry().toUpperCase(Locale.US);
        String s = s1;
        if (!TextUtils.isEmpty(s2))
        {
            s = (new StringBuilder()).append(s1).append("-").append(s2).toString();
        }
        return s;
    }

    protected String getUserPhoneNumber()
    {
        return networkUtil.i();
    }

    protected boolean hasDeviceNumber()
    {
        return !TextUtils.isEmpty(getUserPhoneNumber());
    }

    boolean isDeviceNumber(CountryCode countrycode, String s)
    {
        if (hasDeviceNumber())
        {
            CountryCode countrycode1 = getCountryCode();
            String s1 = stripPhoneNumber(getUserPhoneNumber());
            s = stripPhoneNumber(s);
            if (countrycode1.c() == countrycode.c() && comparePhoneNumbers(s1, s))
            {
                return true;
            }
        }
        return false;
    }

    String stripPhoneNumber(String s)
    {
        s = PhoneNumberUtils.stripSeparators(s);
        log.info((new StringBuilder("MNV stripPhoneNumber: ")).append(s).toString());
        return s;
    }

}
