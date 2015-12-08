// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.internal.MatcherApi;
import com.google.i18n.phonenumbers.internal.RegexBasedMatcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.i18n.phonenumbers:
//            CountryCodeToRegionCodeMap, MetadataManager, PhoneNumberUtil

public class ShortNumberInfo
{

    private static final ShortNumberInfo INSTANCE = new ShortNumberInfo(RegexBasedMatcher.create());
    private static final Set REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT;
    private static final Logger logger = Logger.getLogger(com/google/i18n/phonenumbers/ShortNumberInfo.getName());
    private final Map countryCallingCodeToRegionCodeMap = CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap();
    private final MatcherApi matcherApi;

    ShortNumberInfo(MatcherApi matcherapi)
    {
        matcherApi = matcherapi;
    }

    public static ShortNumberInfo getInstance()
    {
        return INSTANCE;
    }

    private static String getNationalSignificantNumber(Phonenumber.PhoneNumber phonenumber)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (phonenumber.isItalianLeadingZero())
        {
            char ac[] = new char[phonenumber.getNumberOfLeadingZeros()];
            Arrays.fill(ac, '0');
            stringbuilder.append(new String(ac));
        }
        stringbuilder.append(phonenumber.getNationalNumber());
        return stringbuilder.toString();
    }

    private String getRegionCodeForShortNumberFromRegionList(Phonenumber.PhoneNumber phonenumber, List list)
    {
        if (list.size() == 0)
        {
            return null;
        }
        if (list.size() == 1)
        {
            return (String)list.get(0);
        }
        phonenumber = getNationalSignificantNumber(phonenumber);
        for (list = list.iterator(); list.hasNext();)
        {
            String s = (String)list.next();
            com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata phonemetadata = MetadataManager.getShortNumberMetadataForRegion(s);
            if (phonemetadata != null && matchesPossibleNumberAndNationalNumber(phonenumber, phonemetadata.shortCode))
            {
                return s;
            }
        }

        return null;
    }

    private List getRegionCodesForCountryCode(int i)
    {
        List list = (List)countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i));
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList(0);
        }
        return Collections.unmodifiableList(((List) (obj)));
    }

    private boolean matchesEmergencyNumberHelper(String s, String s1, boolean flag)
    {
        boolean flag2 = false;
        String s2 = PhoneNumberUtil.extractPossibleNumber(s);
        if (!PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(s2).lookingAt())
        {
            if ((s = MetadataManager.getShortNumberMetadataForRegion(s1)) != null && ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (s)).emergency != null)
            {
                s2 = PhoneNumberUtil.normalizeDigitsOnly(s2);
                s = ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (s)).emergency;
                boolean flag1 = flag2;
                if (flag)
                {
                    flag1 = flag2;
                    if (!REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT.contains(s1))
                    {
                        flag1 = true;
                    }
                }
                return matcherApi.matchesNationalNumber(s2, s, flag1);
            }
        }
        return false;
    }

    private boolean matchesPossibleNumberAndNationalNumber(String s, com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneNumberDesc phonenumberdesc)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (matcherApi.matchesPossibleNumber(s, phonenumberdesc))
        {
            flag = flag1;
            if (matcherApi.matchesNationalNumber(s, phonenumberdesc, false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean regionDialingFromMatchesNumber(Phonenumber.PhoneNumber phonenumber, String s)
    {
        return getRegionCodesForCountryCode(phonenumber.getCountryCode()).contains(s);
    }

    public boolean connectsToEmergencyNumber(String s, String s1)
    {
        return matchesEmergencyNumberHelper(s, s1, true);
    }

    String getExampleShortNumber(String s)
    {
        s = MetadataManager.getShortNumberMetadataForRegion(s);
        if (s == null)
        {
            return "";
        }
        s = ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (s)).shortCode;
        if (!((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneNumberDesc) (s)).exampleNumber.equals(""))
        {
            return ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneNumberDesc) (s)).exampleNumber;
        } else
        {
            return "";
        }
    }

    String getExampleShortNumberForCost(String s, ShortNumberCost shortnumbercost)
    {
        Object obj;
        com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata phonemetadata;
        phonemetadata = MetadataManager.getShortNumberMetadataForRegion(s);
        if (phonemetadata == null)
        {
            return "";
        }
        obj = null;
        s = obj;
        _cls1..SwitchMap.com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost[shortnumbercost.ordinal()];
        JVM INSTR tableswitch 1 4: default 56
    //                   1 97
    //                   2 58
    //                   3 88
    //                   4 79;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_97;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        s = obj;
_L6:
        if (s != null && !((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneNumberDesc) (s)).exampleNumber.equals(""))
        {
            return ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneNumberDesc) (s)).exampleNumber;
        } else
        {
            return "";
        }
_L5:
        s = phonemetadata.tollFree;
          goto _L6
_L4:
        s = phonemetadata.standardRate;
          goto _L6
        s = phonemetadata.premiumRate;
          goto _L6
    }

    public ShortNumberCost getExpectedCost(Phonenumber.PhoneNumber phonenumber)
    {
        Object obj = getRegionCodesForCountryCode(phonenumber.getCountryCode());
        if (((List) (obj)).size() != 0) goto _L2; else goto _L1
_L1:
        obj = ShortNumberCost.UNKNOWN_COST;
_L4:
        return ((ShortNumberCost) (obj));
_L2:
        ShortNumberCost shortnumbercost;
        Iterator iterator;
        if (((List) (obj)).size() == 1)
        {
            return getExpectedCostForRegion(phonenumber, (String)((List) (obj)).get(0));
        }
        shortnumbercost = ShortNumberCost.TOLL_FREE;
        iterator = ((List) (obj)).iterator();
_L6:
        obj = shortnumbercost;
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj1 = getExpectedCostForRegion(phonenumber, (String)iterator.next());
        switch (_cls1..SwitchMap.com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost[((ShortNumberCost) (obj1)).ordinal()])
        {
        default:
            Logger logger1 = logger;
            Level level = Level.SEVERE;
            obj1 = String.valueOf(String.valueOf(obj1));
            logger1.log(level, (new StringBuilder(((String) (obj1)).length() + 30)).append("Unrecognised cost for region: ").append(((String) (obj1))).toString());
            break;

        case 1: // '\001'
            return ShortNumberCost.PREMIUM_RATE;

        case 2: // '\002'
            shortnumbercost = ShortNumberCost.UNKNOWN_COST;
            break;

        case 3: // '\003'
            if (shortnumbercost != ShortNumberCost.UNKNOWN_COST)
            {
                shortnumbercost = ShortNumberCost.STANDARD_RATE;
            }
            break;

        case 4: // '\004'
            break;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public ShortNumberCost getExpectedCostForRegion(Phonenumber.PhoneNumber phonenumber, String s)
    {
        if (!regionDialingFromMatchesNumber(phonenumber, s))
        {
            return ShortNumberCost.UNKNOWN_COST;
        }
        com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata phonemetadata = MetadataManager.getShortNumberMetadataForRegion(s);
        if (phonemetadata == null)
        {
            return ShortNumberCost.UNKNOWN_COST;
        }
        phonenumber = getNationalSignificantNumber(phonenumber);
        if (matchesPossibleNumberAndNationalNumber(phonenumber, phonemetadata.premiumRate))
        {
            return ShortNumberCost.PREMIUM_RATE;
        }
        if (matchesPossibleNumberAndNationalNumber(phonenumber, phonemetadata.standardRate))
        {
            return ShortNumberCost.STANDARD_RATE;
        }
        if (matchesPossibleNumberAndNationalNumber(phonenumber, phonemetadata.tollFree))
        {
            return ShortNumberCost.TOLL_FREE;
        }
        if (isEmergencyNumber(phonenumber, s))
        {
            return ShortNumberCost.TOLL_FREE;
        } else
        {
            return ShortNumberCost.UNKNOWN_COST;
        }
    }

    public ShortNumberCost getExpectedCostForRegion(String s, String s1)
    {
        com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata phonemetadata = MetadataManager.getShortNumberMetadataForRegion(s1);
        if (phonemetadata == null)
        {
            return ShortNumberCost.UNKNOWN_COST;
        }
        if (matchesPossibleNumberAndNationalNumber(s, phonemetadata.premiumRate))
        {
            return ShortNumberCost.PREMIUM_RATE;
        }
        if (matchesPossibleNumberAndNationalNumber(s, phonemetadata.standardRate))
        {
            return ShortNumberCost.STANDARD_RATE;
        }
        if (matchesPossibleNumberAndNationalNumber(s, phonemetadata.tollFree))
        {
            return ShortNumberCost.TOLL_FREE;
        }
        if (isEmergencyNumber(s, s1))
        {
            return ShortNumberCost.TOLL_FREE;
        } else
        {
            return ShortNumberCost.UNKNOWN_COST;
        }
    }

    Set getSupportedRegions()
    {
        return Collections.unmodifiableSet(MetadataManager.getShortNumberMetadataSupportedRegions());
    }

    public boolean isCarrierSpecific(Phonenumber.PhoneNumber phonenumber)
    {
        Object obj = getRegionCodeForShortNumberFromRegionList(phonenumber, getRegionCodesForCountryCode(phonenumber.getCountryCode()));
        phonenumber = getNationalSignificantNumber(phonenumber);
        obj = MetadataManager.getShortNumberMetadataForRegion(((String) (obj)));
        return obj != null && matchesPossibleNumberAndNationalNumber(phonenumber, ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (obj)).carrierSpecific);
    }

    public boolean isEmergencyNumber(String s, String s1)
    {
        return matchesEmergencyNumberHelper(s, s1, false);
    }

    public boolean isPossibleShortNumber(Phonenumber.PhoneNumber phonenumber)
    {
        Object obj = getRegionCodesForCountryCode(phonenumber.getCountryCode());
        phonenumber = getNationalSignificantNumber(phonenumber);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata phonemetadata = MetadataManager.getShortNumberMetadataForRegion((String)((Iterator) (obj)).next());
            if (phonemetadata != null && matcherApi.matchesPossibleNumber(phonenumber, phonemetadata.generalDesc))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isPossibleShortNumberForRegion(Phonenumber.PhoneNumber phonenumber, String s)
    {
        if (regionDialingFromMatchesNumber(phonenumber, s))
        {
            if ((s = MetadataManager.getShortNumberMetadataForRegion(s)) != null)
            {
                return matcherApi.matchesPossibleNumber(getNationalSignificantNumber(phonenumber), ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (s)).generalDesc);
            }
        }
        return false;
    }

    public boolean isPossibleShortNumberForRegion(String s, String s1)
    {
        s1 = MetadataManager.getShortNumberMetadataForRegion(s1);
        if (s1 == null)
        {
            return false;
        } else
        {
            return matcherApi.matchesPossibleNumber(s, ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (s1)).generalDesc);
        }
    }

    public boolean isValidShortNumber(Phonenumber.PhoneNumber phonenumber)
    {
        List list = getRegionCodesForCountryCode(phonenumber.getCountryCode());
        String s = getRegionCodeForShortNumberFromRegionList(phonenumber, list);
        if (list.size() > 1 && s != null)
        {
            return true;
        } else
        {
            return isValidShortNumberForRegion(phonenumber, s);
        }
    }

    public boolean isValidShortNumberForRegion(Phonenumber.PhoneNumber phonenumber, String s)
    {
        if (regionDialingFromMatchesNumber(phonenumber, s))
        {
            if ((s = MetadataManager.getShortNumberMetadataForRegion(s)) != null && matchesPossibleNumberAndNationalNumber(phonenumber = getNationalSignificantNumber(phonenumber), ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (s)).generalDesc))
            {
                return matchesPossibleNumberAndNationalNumber(phonenumber, ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (s)).shortCode);
            }
        }
        return false;
    }

    public boolean isValidShortNumberForRegion(String s, String s1)
    {
        for (s1 = MetadataManager.getShortNumberMetadataForRegion(s1); s1 == null || !matchesPossibleNumberAndNationalNumber(s, ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (s1)).generalDesc);)
        {
            return false;
        }

        return matchesPossibleNumberAndNationalNumber(s, ((com.google.i18n.phonenumbers.nano.Phonemetadata.PhoneMetadata) (s1)).shortCode);
    }

    static 
    {
        HashSet hashset = new HashSet();
        REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT = hashset;
        hashset.add("BR");
        REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT.add("CL");
        REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT.add("NI");
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class ShortNumberCost {}

}
