// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.phonenumbers;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.libraries.phonenumbers:
//            MetadataLoader, RegexCache, CountryCodeToRegionCodeMap, NumberParseException

public class PhoneNumberUtil
{
    public static final class PhoneNumberType extends Enum
    {

        private static final PhoneNumberType $VALUES[];
        public static final PhoneNumberType FIXED_LINE;
        public static final PhoneNumberType FIXED_LINE_OR_MOBILE;
        public static final PhoneNumberType MOBILE;
        public static final PhoneNumberType PAGER;
        public static final PhoneNumberType PERSONAL_NUMBER;
        public static final PhoneNumberType PREMIUM_RATE;
        public static final PhoneNumberType SHARED_COST;
        public static final PhoneNumberType TOLL_FREE;
        public static final PhoneNumberType UAN;
        public static final PhoneNumberType UNKNOWN;
        public static final PhoneNumberType VOICEMAIL;
        public static final PhoneNumberType VOIP;

        public static PhoneNumberType valueOf(String s)
        {
            return (PhoneNumberType)Enum.valueOf(com/google/android/libraries/phonenumbers/PhoneNumberUtil$PhoneNumberType, s);
        }

        public static PhoneNumberType[] values()
        {
            return (PhoneNumberType[])$VALUES.clone();
        }

        static 
        {
            FIXED_LINE = new PhoneNumberType("FIXED_LINE", 0);
            MOBILE = new PhoneNumberType("MOBILE", 1);
            FIXED_LINE_OR_MOBILE = new PhoneNumberType("FIXED_LINE_OR_MOBILE", 2);
            TOLL_FREE = new PhoneNumberType("TOLL_FREE", 3);
            PREMIUM_RATE = new PhoneNumberType("PREMIUM_RATE", 4);
            SHARED_COST = new PhoneNumberType("SHARED_COST", 5);
            VOIP = new PhoneNumberType("VOIP", 6);
            PERSONAL_NUMBER = new PhoneNumberType("PERSONAL_NUMBER", 7);
            PAGER = new PhoneNumberType("PAGER", 8);
            UAN = new PhoneNumberType("UAN", 9);
            VOICEMAIL = new PhoneNumberType("VOICEMAIL", 10);
            UNKNOWN = new PhoneNumberType("UNKNOWN", 11);
            $VALUES = (new PhoneNumberType[] {
                FIXED_LINE, MOBILE, FIXED_LINE_OR_MOBILE, TOLL_FREE, PREMIUM_RATE, SHARED_COST, VOIP, PERSONAL_NUMBER, PAGER, UAN, 
                VOICEMAIL, UNKNOWN
            });
        }

        private PhoneNumberType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ValidationResult extends Enum
    {

        private static final ValidationResult $VALUES[];
        public static final ValidationResult INVALID_COUNTRY_CODE;
        public static final ValidationResult IS_POSSIBLE;
        public static final ValidationResult TOO_LONG;
        public static final ValidationResult TOO_SHORT;

        public static ValidationResult valueOf(String s)
        {
            return (ValidationResult)Enum.valueOf(com/google/android/libraries/phonenumbers/PhoneNumberUtil$ValidationResult, s);
        }

        public static ValidationResult[] values()
        {
            return (ValidationResult[])$VALUES.clone();
        }

        static 
        {
            IS_POSSIBLE = new ValidationResult("IS_POSSIBLE", 0);
            INVALID_COUNTRY_CODE = new ValidationResult("INVALID_COUNTRY_CODE", 1);
            TOO_SHORT = new ValidationResult("TOO_SHORT", 2);
            TOO_LONG = new ValidationResult("TOO_LONG", 3);
            $VALUES = (new ValidationResult[] {
                IS_POSSIBLE, INVALID_COUNTRY_CODE, TOO_SHORT, TOO_LONG
            });
        }

        private ValidationResult(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Map ALL_PLUS_NUMBER_GROUPING_SYMBOLS;
    private static final Map ALPHA_MAPPINGS;
    private static final Map ALPHA_PHONE_MAPPINGS;
    private static final Pattern CAPTURING_DIGIT_PATTERN = Pattern.compile("(\\p{Nd})");
    private static final Pattern CC_PATTERN = Pattern.compile("\\$CC");
    static final MetadataLoader DEFAULT_METADATA_LOADER = new MetadataLoader();
    private static final Map DIALLABLE_CHAR_MAPPINGS;
    private static final Pattern EXTN_PATTERN;
    static final String EXTN_PATTERNS_FOR_MATCHING = createExtnPattern("x\uFF58#\uFF03~\uFF5E");
    private static final String EXTN_PATTERNS_FOR_PARSING;
    private static final Pattern FG_PATTERN = Pattern.compile("\\$FG");
    private static final Pattern FIRST_GROUP_ONLY_PREFIX_PATTERN = Pattern.compile("\\(?\\$1\\)?");
    private static final Pattern FIRST_GROUP_PATTERN = Pattern.compile("(\\$\\d)");
    private static final Map MOBILE_TOKEN_MAPPINGS;
    static final Pattern NON_DIGITS_PATTERN = Pattern.compile("(\\D+)");
    private static final Pattern NP_PATTERN = Pattern.compile("\\$NP");
    static final Pattern PLUS_CHARS_PATTERN = Pattern.compile("[+\uFF0B]+");
    static final Pattern SECOND_NUMBER_START_PATTERN = Pattern.compile("[\\\\/] *x");
    private static final Pattern SEPARATOR_PATTERN = Pattern.compile("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]+");
    private static final Pattern UNIQUE_INTERNATIONAL_PREFIX = Pattern.compile("[\\d]+(?:[~\u2053\u223C\uFF5E][\\d]+)?");
    static final Pattern UNWANTED_END_CHAR_PATTERN = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    private static final String VALID_ALPHA;
    private static final Pattern VALID_ALPHA_PHONE_PATTERN = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    private static final String VALID_PHONE_NUMBER;
    private static final Pattern VALID_PHONE_NUMBER_PATTERN;
    private static final Pattern VALID_START_CHAR_PATTERN = Pattern.compile("[+\uFF0B\\p{Nd}]");
    private static PhoneNumberUtil instance = null;
    private static final Logger logger = Logger.getLogger(com/google/android/libraries/phonenumbers/PhoneNumberUtil.getName());
    private final Map countryCallingCodeToRegionCodeMap;
    private final Map countryCodeToNonGeographicalMetadataMap = Collections.synchronizedMap(new HashMap());
    private final Set countryCodesForNonGeographicalRegion = new HashSet();
    private final String currentFilePrefix;
    private final MetadataLoader metadataLoader;
    private final Set nanpaRegions = new HashSet(35);
    private final RegexCache regexCache = new RegexCache(100);
    private final Map regionToMetadataMap = Collections.synchronizedMap(new HashMap());
    private final Set supportedRegions = new HashSet(320);

    private PhoneNumberUtil(String s, MetadataLoader metadataloader, Map map)
    {
        currentFilePrefix = s;
        metadataLoader = metadataloader;
        countryCallingCodeToRegionCodeMap = map;
        for (s = map.entrySet().iterator(); s.hasNext();)
        {
            metadataloader = (java.util.Map.Entry)s.next();
            List list = (List)metadataloader.getValue();
            if (list.size() == 1 && "001".equals(list.get(0)))
            {
                countryCodesForNonGeographicalRegion.add(metadataloader.getKey());
            } else
            {
                supportedRegions.addAll(list);
            }
        }

        if (supportedRegions.remove("001"))
        {
            logger.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        nanpaRegions.addAll((Collection)map.get(Integer.valueOf(1)));
    }

    private static void buildNationalNumberForParsing(String s, StringBuilder stringbuilder)
    {
        int j = s.indexOf(";phone-context=");
        if (j > 0)
        {
            int i = j + 15;
            if (s.charAt(i) == '+')
            {
                int k = s.indexOf(';', i);
                if (k > 0)
                {
                    stringbuilder.append(s.substring(i, k));
                } else
                {
                    stringbuilder.append(s.substring(i));
                }
            }
            i = s.indexOf("tel:");
            if (i >= 0)
            {
                i += 4;
            } else
            {
                i = 0;
            }
            stringbuilder.append(s.substring(i, j));
        } else
        {
            stringbuilder.append(extractPossibleNumber(s));
        }
        i = stringbuilder.indexOf(";isub=");
        if (i > 0)
        {
            stringbuilder.delete(i, stringbuilder.length());
        }
    }

    private boolean checkRegionForParsing(String s, String s1)
    {
        return isValidRegionCode(s1) || s != null && s.length() != 0 && PLUS_CHARS_PATTERN.matcher(s).lookingAt();
    }

    private static String createExtnPattern(String s)
    {
        String s1 = String.valueOf(String.valueOf(";ext=(\\p{Nd}{1,7})|[ \240\\t,]*(?:e?xt(?:ensi(?:o\u0301?|\363))?n?|\uFF45?\uFF58\uFF54\uFF4E?|["));
        s = String.valueOf(String.valueOf(s));
        String s2 = String.valueOf(String.valueOf("(\\p{Nd}{1,7})"));
        String s3 = String.valueOf(String.valueOf("\\p{Nd}"));
        return (new StringBuilder(s1.length() + 48 + s.length() + s2.length() + s3.length())).append(s1).append(s).append("]|int|anexo|\uFF49\uFF4E\uFF54)[:\\.\uFF0E]?[ \240\\t,-]*").append(s2).append("#?|[- ]+(").append(s3).append("{1,5})#").toString();
    }

    private static PhoneNumberUtil createInstance(MetadataLoader metadataloader)
    {
        if (metadataloader == null)
        {
            throw new IllegalArgumentException("metadataLoader could not be null.");
        } else
        {
            return new PhoneNumberUtil("/com/google/android/libraries/phonenumbers/data/PhoneNumberMetadataProto", metadataloader, CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap());
        }
    }

    private int extractCountryCode(StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        if (stringbuilder.length() == 0 || stringbuilder.charAt(0) == '0')
        {
            return 0;
        }
        int j = stringbuilder.length();
        for (int i = 1; i <= 3 && i <= j; i++)
        {
            int k = Integer.parseInt(stringbuilder.substring(0, i));
            if (countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(k)))
            {
                stringbuilder1.append(stringbuilder.substring(i));
                return k;
            }
        }

        return 0;
    }

    private static String extractPossibleNumber(String s)
    {
        Object obj = VALID_START_CHAR_PATTERN.matcher(s);
        if (((Matcher) (obj)).find())
        {
            obj = s.substring(((Matcher) (obj)).start());
            Object obj1 = UNWANTED_END_CHAR_PATTERN.matcher(((CharSequence) (obj)));
            s = ((String) (obj));
            if (((Matcher) (obj1)).find())
            {
                obj = ((String) (obj)).substring(0, ((Matcher) (obj1)).start());
                obj1 = logger;
                Level level = Level.FINER;
                s = String.valueOf(obj);
                if (s.length() != 0)
                {
                    s = "Stripped trailing characters: ".concat(s);
                } else
                {
                    s = new String("Stripped trailing characters: ");
                }
                ((Logger) (obj1)).log(level, s);
                s = ((String) (obj));
            }
            obj1 = SECOND_NUMBER_START_PATTERN.matcher(s);
            obj = s;
            if (((Matcher) (obj1)).find())
            {
                obj = s.substring(0, ((Matcher) (obj1)).start());
            }
            return ((String) (obj));
        } else
        {
            return "";
        }
    }

    private int getCountryCodeForValidRegion(String s)
    {
        Phonemetadata.PhoneMetadata phonemetadata = getMetadataForRegion(s);
        if (phonemetadata == null)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Invalid region code: ".concat(s);
            } else
            {
                s = new String("Invalid region code: ");
            }
            throw new IllegalArgumentException(s);
        } else
        {
            return phonemetadata.getCountryCode();
        }
    }

    public static PhoneNumberUtil getInstance()
    {
        com/google/android/libraries/phonenumbers/PhoneNumberUtil;
        JVM INSTR monitorenter ;
        PhoneNumberUtil phonenumberutil;
        if (instance == null)
        {
            setInstance(createInstance(DEFAULT_METADATA_LOADER));
        }
        phonenumberutil = instance;
        com/google/android/libraries/phonenumbers/PhoneNumberUtil;
        JVM INSTR monitorexit ;
        return phonenumberutil;
        Exception exception;
        exception;
        throw exception;
    }

    private Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i)
    {
label0:
        {
            synchronized (countryCodeToNonGeographicalMetadataMap)
            {
                if (countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(i)))
                {
                    break label0;
                }
            }
            return null;
        }
        if (!countryCodeToNonGeographicalMetadataMap.containsKey(Integer.valueOf(i)))
        {
            loadMetadataFromFile(currentFilePrefix, "001", i, metadataLoader);
        }
        map;
        JVM INSTR monitorexit ;
        return (Phonemetadata.PhoneMetadata)countryCodeToNonGeographicalMetadataMap.get(Integer.valueOf(i));
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private Phonemetadata.PhoneMetadata getMetadataForRegion(String s)
    {
        if (!isValidRegionCode(s))
        {
            return null;
        }
        synchronized (regionToMetadataMap)
        {
            if (!regionToMetadataMap.containsKey(s))
            {
                loadMetadataFromFile(currentFilePrefix, s, 0, metadataLoader);
            }
        }
        return (Phonemetadata.PhoneMetadata)regionToMetadataMap.get(s);
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    private Phonemetadata.PhoneMetadata getMetadataForRegionOrCallingCode(int i, String s)
    {
        if ("001".equals(s))
        {
            return getMetadataForNonGeographicalRegion(i);
        } else
        {
            return getMetadataForRegion(s);
        }
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

    private PhoneNumberType getNumberTypeHelper(String s, Phonemetadata.PhoneMetadata phonemetadata)
    {
        if (!isNumberMatchingDesc(s, phonemetadata.getGeneralDesc()))
        {
            return PhoneNumberType.UNKNOWN;
        }
        if (isNumberMatchingDesc(s, phonemetadata.getPremiumRate()))
        {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (isNumberMatchingDesc(s, phonemetadata.getTollFree()))
        {
            return PhoneNumberType.TOLL_FREE;
        }
        if (isNumberMatchingDesc(s, phonemetadata.getSharedCost()))
        {
            return PhoneNumberType.SHARED_COST;
        }
        if (isNumberMatchingDesc(s, phonemetadata.getVoip()))
        {
            return PhoneNumberType.VOIP;
        }
        if (isNumberMatchingDesc(s, phonemetadata.getPersonalNumber()))
        {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (isNumberMatchingDesc(s, phonemetadata.getPager()))
        {
            return PhoneNumberType.PAGER;
        }
        if (isNumberMatchingDesc(s, phonemetadata.getUan()))
        {
            return PhoneNumberType.UAN;
        }
        if (isNumberMatchingDesc(s, phonemetadata.getVoicemail()))
        {
            return PhoneNumberType.VOICEMAIL;
        }
        if (isNumberMatchingDesc(s, phonemetadata.getFixedLine()))
        {
            if (phonemetadata.isSameMobileAndFixedLinePattern())
            {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (isNumberMatchingDesc(s, phonemetadata.getMobile()))
            {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            } else
            {
                return PhoneNumberType.FIXED_LINE;
            }
        }
        if (!phonemetadata.isSameMobileAndFixedLinePattern() && isNumberMatchingDesc(s, phonemetadata.getMobile()))
        {
            return PhoneNumberType.MOBILE;
        } else
        {
            return PhoneNumberType.UNKNOWN;
        }
    }

    private String getRegionCodeForCountryCode(int i)
    {
        List list = (List)countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i));
        if (list == null)
        {
            return "ZZ";
        } else
        {
            return (String)list.get(0);
        }
    }

    private String getRegionCodeForNumber(Phonenumber.PhoneNumber phonenumber)
    {
        int i = phonenumber.getCountryCode();
        Object obj = (List)countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i));
        if (obj == null)
        {
            String s = getNationalSignificantNumber(phonenumber);
            phonenumber = logger;
            obj = Level.WARNING;
            s = String.valueOf(String.valueOf(s));
            phonenumber.log(((Level) (obj)), (new StringBuilder(s.length() + 54)).append("Missing/invalid country_code (").append(i).append(") for number ").append(s).toString());
            return null;
        }
        if (((List) (obj)).size() == 1)
        {
            return (String)((List) (obj)).get(0);
        } else
        {
            return getRegionCodeForNumberFromRegionList(phonenumber, ((List) (obj)));
        }
    }

    private String getRegionCodeForNumberFromRegionList(Phonenumber.PhoneNumber phonenumber, List list)
    {
label0:
        {
            phonenumber = getNationalSignificantNumber(phonenumber);
            list = list.iterator();
            String s;
            Phonemetadata.PhoneMetadata phonemetadata;
label1:
            do
            {
                do
                {
                    if (!list.hasNext())
                    {
                        break label0;
                    }
                    s = (String)list.next();
                    phonemetadata = getMetadataForRegion(s);
                    if (!phonemetadata.hasLeadingDigits())
                    {
                        continue label1;
                    }
                } while (!regexCache.getPatternForRegex(phonemetadata.getLeadingDigits()).matcher(phonenumber).lookingAt());
                return s;
            } while (getNumberTypeHelper(phonenumber, phonemetadata) == PhoneNumberType.UNKNOWN);
            return s;
        }
        return null;
    }

    private boolean isNumberMatchingDesc(String s, Phonemetadata.PhoneNumberDesc phonenumberdesc)
    {
        Matcher matcher = regexCache.getPatternForRegex(phonenumberdesc.getNationalNumberPattern()).matcher(s);
        return isNumberPossibleForDesc(s, phonenumberdesc) && matcher.matches();
    }

    private boolean isNumberPossibleForDesc(String s, Phonemetadata.PhoneNumberDesc phonenumberdesc)
    {
        return regexCache.getPatternForRegex(phonenumberdesc.getPossibleNumberPattern()).matcher(s).matches();
    }

    private boolean isShorterThanPossibleNormalNumber(Phonemetadata.PhoneMetadata phonemetadata, String s)
    {
        return testNumberLengthAgainstPattern(regexCache.getPatternForRegex(phonemetadata.getGeneralDesc().getPossibleNumberPattern()), s) == ValidationResult.TOO_SHORT;
    }

    private boolean isValidNumberForRegion(Phonenumber.PhoneNumber phonenumber, String s)
    {
        int i = phonenumber.getCountryCode();
        for (Phonemetadata.PhoneMetadata phonemetadata = getMetadataForRegionOrCallingCode(i, s); phonemetadata == null || !"001".equals(s) && i != getCountryCodeForValidRegion(s) || getNumberTypeHelper(getNationalSignificantNumber(phonenumber), phonemetadata) == PhoneNumberType.UNKNOWN;)
        {
            return false;
        }

        return true;
    }

    private boolean isValidRegionCode(String s)
    {
        return s != null && supportedRegions.contains(s);
    }

    private static boolean isViablePhoneNumber(String s)
    {
        if (s.length() < 2)
        {
            return false;
        } else
        {
            return VALID_PHONE_NUMBER_PATTERN.matcher(s).matches();
        }
    }

    private static Phonemetadata.PhoneMetadataCollection loadMetadataAndCloseInput(ObjectInputStream objectinputstream)
    {
        Phonemetadata.PhoneMetadataCollection phonemetadatacollection = new Phonemetadata.PhoneMetadataCollection();
        phonemetadatacollection.readExternal(objectinputstream);
        objectinputstream.close();
        return phonemetadatacollection;
        objectinputstream;
        logger.log(Level.WARNING, "error closing input stream (ignored)", objectinputstream);
        return phonemetadatacollection;
        objectinputstream;
        return phonemetadatacollection;
        Object obj;
        obj;
        logger.log(Level.WARNING, "error reading input (ignored)", ((Throwable) (obj)));
        objectinputstream.close();
        return phonemetadatacollection;
        objectinputstream;
        logger.log(Level.WARNING, "error closing input stream (ignored)", objectinputstream);
        return phonemetadatacollection;
        objectinputstream;
        return phonemetadatacollection;
        obj;
        objectinputstream.close();
        return phonemetadatacollection;
        objectinputstream;
        logger.log(Level.WARNING, "error closing input stream (ignored)", objectinputstream);
        return phonemetadatacollection;
        objectinputstream;
        return phonemetadatacollection;
    }

    private void loadMetadataFromFile(String s, String s1, int i, MetadataLoader metadataloader)
    {
        String s2;
        boolean flag;
        flag = "001".equals(s1);
        s2 = String.valueOf(String.valueOf(s));
        if (flag)
        {
            s = String.valueOf(i);
        } else
        {
            s = s1;
        }
        s = String.valueOf(String.valueOf(s));
        s2 = (new StringBuilder(s2.length() + 1 + s.length())).append(s2).append("_").append(s).toString();
        s = metadataloader.loadMetadata(s2);
        if (s == null)
        {
            s1 = logger;
            metadataloader = Level.SEVERE;
            s = String.valueOf(s2);
            if (s.length() != 0)
            {
                s = "missing metadata: ".concat(s);
            } else
            {
                s = new String("missing metadata: ");
            }
            s1.log(metadataloader, s);
            s = String.valueOf(s2);
            if (s.length() != 0)
            {
                s = "missing metadata: ".concat(s);
            } else
            {
                s = new String("missing metadata: ");
            }
            throw new IllegalStateException(s);
        }
        metadataloader = loadMetadataAndCloseInput(new ObjectInputStream(s)).getMetadataList();
        if (!metadataloader.isEmpty()) goto _L2; else goto _L1
_L1:
        s1 = logger;
        metadataloader = Level.SEVERE;
        s = String.valueOf(s2);
        if (s.length() == 0) goto _L4; else goto _L3
_L3:
        s = "empty metadata: ".concat(s);
_L7:
        s1.log(metadataloader, s);
        s = String.valueOf(s2);
        if (s.length() == 0) goto _L6; else goto _L5
_L5:
        s = "empty metadata: ".concat(s);
_L8:
        Object obj;
        throw new IllegalStateException(s);
_L4:
        try
        {
            s = new String("empty metadata: ");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            metadataloader = logger;
            obj = Level.SEVERE;
            s = String.valueOf(s2);
            Level level;
            if (s.length() != 0)
            {
                s = "cannot load/parse metadata: ".concat(s);
            } else
            {
                s = new String("cannot load/parse metadata: ");
            }
            metadataloader.log(((Level) (obj)), s, s1);
            s = String.valueOf(s2);
            if (s.length() != 0)
            {
                s = "cannot load/parse metadata: ".concat(s);
            } else
            {
                s = new String("cannot load/parse metadata: ");
            }
            throw new RuntimeException(s, s1);
        }
          goto _L7
_L6:
        s = new String("empty metadata: ");
          goto _L8
_L2:
        if (metadataloader.size() <= 1) goto _L10; else goto _L9
_L9:
        obj = logger;
        level = Level.WARNING;
        s = String.valueOf(s2);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_463;
        }
        s = "invalid metadata (too many entries): ".concat(s);
_L11:
        ((Logger) (obj)).log(level, s);
_L10:
        s = (Phonemetadata.PhoneMetadata)metadataloader.get(0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_477;
        }
        countryCodeToNonGeographicalMetadataMap.put(Integer.valueOf(i), s);
        return;
        s = new String("invalid metadata (too many entries): ");
          goto _L11
        regionToMetadataMap.put(s1, s);
        return;
          goto _L7
    }

    private int maybeExtractCountryCode(String s, Phonemetadata.PhoneMetadata phonemetadata, StringBuilder stringbuilder, boolean flag, Phonenumber.PhoneNumber phonenumber)
        throws NumberParseException
    {
        if (s.length() == 0)
        {
            return 0;
        }
        StringBuilder stringbuilder1 = new StringBuilder(s);
        s = "NonMatch";
        if (phonemetadata != null)
        {
            s = phonemetadata.getInternationalPrefix();
        }
        s = maybeStripInternationalPrefixAndNormalize(stringbuilder1, s);
        if (flag)
        {
            phonenumber.setCountryCodeSource(s);
        }
        if (s != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY)
        {
            if (stringbuilder1.length() <= 2)
            {
                throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int i = extractCountryCode(stringbuilder1, stringbuilder);
            if (i != 0)
            {
                phonenumber.setCountryCode(i);
                return i;
            } else
            {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
        }
        if (phonemetadata != null)
        {
            int j = phonemetadata.getCountryCode();
            s = String.valueOf(j);
            Object obj = stringbuilder1.toString();
            if (((String) (obj)).startsWith(s))
            {
                s = new StringBuilder(((String) (obj)).substring(s.length()));
                Phonemetadata.PhoneNumberDesc phonenumberdesc = phonemetadata.getGeneralDesc();
                obj = regexCache.getPatternForRegex(phonenumberdesc.getNationalNumberPattern());
                maybeStripNationalPrefixAndCarrierCode(s, phonemetadata, null);
                phonemetadata = regexCache.getPatternForRegex(phonenumberdesc.getPossibleNumberPattern());
                if (!((Pattern) (obj)).matcher(stringbuilder1).matches() && ((Pattern) (obj)).matcher(s).matches() || testNumberLengthAgainstPattern(phonemetadata, stringbuilder1.toString()) == ValidationResult.TOO_LONG)
                {
                    stringbuilder.append(s);
                    if (flag)
                    {
                        phonenumber.setCountryCodeSource(Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    phonenumber.setCountryCode(j);
                    return j;
                }
            }
        }
        phonenumber.setCountryCode(0);
        return 0;
    }

    private static String maybeStripExtension(StringBuilder stringbuilder)
    {
        Matcher matcher = EXTN_PATTERN.matcher(stringbuilder);
        if (matcher.find() && isViablePhoneNumber(stringbuilder.substring(0, matcher.start())))
        {
            int i = 1;
            for (int j = matcher.groupCount(); i <= j; i++)
            {
                if (matcher.group(i) != null)
                {
                    String s = matcher.group(i);
                    stringbuilder.delete(matcher.start(), stringbuilder.length());
                    return s;
                }
            }

        }
        return "";
    }

    private Phonenumber.PhoneNumber.CountryCodeSource maybeStripInternationalPrefixAndNormalize(StringBuilder stringbuilder, String s)
    {
        if (stringbuilder.length() == 0)
        {
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = PLUS_CHARS_PATTERN.matcher(stringbuilder);
        if (matcher.lookingAt())
        {
            stringbuilder.delete(0, matcher.end());
            normalize(stringbuilder);
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        s = regexCache.getPatternForRegex(s);
        normalize(stringbuilder);
        if (parsePrefixAsIdd(s, stringbuilder))
        {
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD;
        } else
        {
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
    }

    private boolean maybeStripNationalPrefixAndCarrierCode(StringBuilder stringbuilder, Phonemetadata.PhoneMetadata phonemetadata, StringBuilder stringbuilder1)
    {
        Object obj;
        int i;
        i = stringbuilder.length();
        obj = phonemetadata.getNationalPrefixForParsing();
        if (i != 0 && ((String) (obj)).length() != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Pattern pattern;
        int j;
        boolean flag;
        if (!((Matcher) (obj = regexCache.getPatternForRegex(((String) (obj))).matcher(stringbuilder))).lookingAt())
        {
            continue; /* Loop/switch isn't completed */
        }
        pattern = regexCache.getPatternForRegex(phonemetadata.getGeneralDesc().getNationalNumberPattern());
        flag = pattern.matcher(stringbuilder).matches();
        j = ((Matcher) (obj)).groupCount();
        phonemetadata = phonemetadata.getNationalPrefixTransformRule();
        if (phonemetadata != null && phonemetadata.length() != 0 && ((Matcher) (obj)).group(j) != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag || pattern.matcher(stringbuilder.substring(((Matcher) (obj)).end())).matches())
        {
            if (stringbuilder1 != null && j > 0 && ((Matcher) (obj)).group(j) != null)
            {
                stringbuilder1.append(((Matcher) (obj)).group(1));
            }
            stringbuilder.delete(0, ((Matcher) (obj)).end());
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        StringBuilder stringbuilder2 = new StringBuilder(stringbuilder);
        stringbuilder2.replace(0, i, ((Matcher) (obj)).replaceFirst(phonemetadata));
        if (!flag || pattern.matcher(stringbuilder2.toString()).matches())
        {
            if (stringbuilder1 != null && j > 1)
            {
                stringbuilder1.append(((Matcher) (obj)).group(1));
            }
            stringbuilder.replace(0, stringbuilder.length(), stringbuilder2.toString());
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static String normalize(String s)
    {
        if (VALID_ALPHA_PHONE_PATTERN.matcher(s).matches())
        {
            return normalizeHelper(s, ALPHA_PHONE_MAPPINGS, true);
        } else
        {
            return normalizeDigitsOnly(s);
        }
    }

    private static void normalize(StringBuilder stringbuilder)
    {
        String s = normalize(stringbuilder.toString());
        stringbuilder.replace(0, stringbuilder.length(), s);
    }

    private static StringBuilder normalizeDigits(String s, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder(s.length());
        s = s.toCharArray();
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            char c = s[i];
            int k = Character.digit(c, 10);
            if (k != -1)
            {
                stringbuilder.append(k);
            } else
            if (flag)
            {
                stringbuilder.append(c);
            }
            i++;
        }
        return stringbuilder;
    }

    private static String normalizeDigitsOnly(String s)
    {
        return normalizeDigits(s, false).toString();
    }

    private static String normalizeHelper(String s, Map map, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder(s.length());
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            Character character = (Character)map.get(Character.valueOf(Character.toUpperCase(c)));
            if (character != null)
            {
                stringbuilder.append(character);
            } else
            if (!flag)
            {
                stringbuilder.append(c);
            }
            i++;
        }
        return stringbuilder.toString();
    }

    private void parse(String s, String s1, Phonenumber.PhoneNumber phonenumber)
        throws NumberParseException
    {
        parseHelper(s, s1, false, true, phonenumber);
    }

    private void parseHelper(String s, String s1, boolean flag, boolean flag1, Phonenumber.PhoneNumber phonenumber)
        throws NumberParseException
    {
        if (s == null)
        {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (s.length() > 250)
        {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
        Object obj = new StringBuilder();
        buildNationalNumberForParsing(s, ((StringBuilder) (obj)));
        if (!isViablePhoneNumber(((StringBuilder) (obj)).toString()))
        {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        if (flag1 && !checkRegionForParsing(((StringBuilder) (obj)).toString(), s1))
        {
            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        if (flag)
        {
            phonenumber.setRawInput(s);
        }
        s = maybeStripExtension(((StringBuilder) (obj)));
        if (s.length() > 0)
        {
            phonenumber.setExtension(s);
        }
        Phonemetadata.PhoneMetadata phonemetadata = getMetadataForRegion(s1);
        StringBuilder stringbuilder = new StringBuilder();
        int i;
        try
        {
            i = maybeExtractCountryCode(((StringBuilder) (obj)).toString(), phonemetadata, stringbuilder, flag, phonenumber);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Matcher matcher = PLUS_CHARS_PATTERN.matcher(((StringBuilder) (obj)).toString());
            if (s.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE && matcher.lookingAt())
            {
                int j = maybeExtractCountryCode(((StringBuilder) (obj)).substring(matcher.end()), phonemetadata, stringbuilder, flag, phonenumber);
                i = j;
                if (j == 0)
                {
                    throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                }
            } else
            {
                throw new NumberParseException(s.getErrorType(), s.getMessage());
            }
        }
        if (i != 0)
        {
            obj = getRegionCodeForCountryCode(i);
            s = phonemetadata;
            if (!((String) (obj)).equals(s1))
            {
                s = getMetadataForRegionOrCallingCode(i, ((String) (obj)));
            }
        } else
        {
            normalize(((StringBuilder) (obj)));
            stringbuilder.append(((CharSequence) (obj)));
            if (s1 != null)
            {
                phonenumber.setCountryCode(phonemetadata.getCountryCode());
                s = phonemetadata;
            } else
            {
                s = phonemetadata;
                if (flag)
                {
                    phonenumber.clearCountryCodeSource();
                    s = phonemetadata;
                }
            }
        }
        if (stringbuilder.length() < 2)
        {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        s1 = stringbuilder;
        if (s != null)
        {
            StringBuilder stringbuilder2 = new StringBuilder();
            StringBuilder stringbuilder1 = new StringBuilder(stringbuilder);
            maybeStripNationalPrefixAndCarrierCode(stringbuilder1, s, stringbuilder2);
            s1 = stringbuilder;
            if (!isShorterThanPossibleNormalNumber(s, stringbuilder1.toString()))
            {
                s = stringbuilder1;
                s1 = s;
                if (flag)
                {
                    phonenumber.setPreferredDomesticCarrierCode(stringbuilder2.toString());
                    s1 = s;
                }
            }
        }
        i = s1.length();
        if (i < 2)
        {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (i > 17)
        {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
        } else
        {
            setItalianLeadingZerosForPhoneNumber(s1.toString(), phonenumber);
            phonenumber.setNationalNumber(Long.parseLong(s1.toString()));
            return;
        }
    }

    private static boolean parsePrefixAsIdd(Pattern pattern, StringBuilder stringbuilder)
    {
        int i;
label0:
        {
            pattern = pattern.matcher(stringbuilder);
            if (pattern.lookingAt())
            {
                i = pattern.end();
                pattern = CAPTURING_DIGIT_PATTERN.matcher(stringbuilder.substring(i));
                if (!pattern.find() || !normalizeDigitsOnly(pattern.group(1)).equals("0"))
                {
                    break label0;
                }
            }
            return false;
        }
        stringbuilder.delete(0, i);
        return true;
    }

    private static void setInstance(PhoneNumberUtil phonenumberutil)
    {
        com/google/android/libraries/phonenumbers/PhoneNumberUtil;
        JVM INSTR monitorenter ;
        instance = phonenumberutil;
        com/google/android/libraries/phonenumbers/PhoneNumberUtil;
        JVM INSTR monitorexit ;
        return;
        phonenumberutil;
        throw phonenumberutil;
    }

    private static void setItalianLeadingZerosForPhoneNumber(String s, Phonenumber.PhoneNumber phonenumber)
    {
        if (s.length() > 1 && s.charAt(0) == '0')
        {
            phonenumber.setItalianLeadingZero(true);
            int i;
            for (i = 1; i < s.length() - 1 && s.charAt(i) == '0'; i++) { }
            if (i != 1)
            {
                phonenumber.setNumberOfLeadingZeros(i);
            }
        }
    }

    private static ValidationResult testNumberLengthAgainstPattern(Pattern pattern, String s)
    {
        pattern = pattern.matcher(s);
        if (pattern.matches())
        {
            return ValidationResult.IS_POSSIBLE;
        }
        if (pattern.lookingAt())
        {
            return ValidationResult.TOO_LONG;
        } else
        {
            return ValidationResult.TOO_SHORT;
        }
    }

    public final boolean isValidNumber(Phonenumber.PhoneNumber phonenumber)
    {
        return isValidNumberForRegion(phonenumber, getRegionCodeForNumber(phonenumber));
    }

    public final Phonenumber.PhoneNumber parse(String s, String s1)
        throws NumberParseException
    {
        Phonenumber.PhoneNumber phonenumber = new Phonenumber.PhoneNumber();
        parse(s, s1, phonenumber);
        return phonenumber;
    }

    static 
    {
        Object obj = new HashMap();
        ((HashMap) (obj)).put(Integer.valueOf(52), "1");
        ((HashMap) (obj)).put(Integer.valueOf(54), "9");
        MOBILE_TOKEN_MAPPINGS = Collections.unmodifiableMap(((Map) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put(Character.valueOf('0'), Character.valueOf('0'));
        ((HashMap) (obj)).put(Character.valueOf('1'), Character.valueOf('1'));
        ((HashMap) (obj)).put(Character.valueOf('2'), Character.valueOf('2'));
        ((HashMap) (obj)).put(Character.valueOf('3'), Character.valueOf('3'));
        ((HashMap) (obj)).put(Character.valueOf('4'), Character.valueOf('4'));
        ((HashMap) (obj)).put(Character.valueOf('5'), Character.valueOf('5'));
        ((HashMap) (obj)).put(Character.valueOf('6'), Character.valueOf('6'));
        ((HashMap) (obj)).put(Character.valueOf('7'), Character.valueOf('7'));
        ((HashMap) (obj)).put(Character.valueOf('8'), Character.valueOf('8'));
        ((HashMap) (obj)).put(Character.valueOf('9'), Character.valueOf('9'));
        Object obj1 = new HashMap(40);
        ((HashMap) (obj1)).put(Character.valueOf('A'), Character.valueOf('2'));
        ((HashMap) (obj1)).put(Character.valueOf('B'), Character.valueOf('2'));
        ((HashMap) (obj1)).put(Character.valueOf('C'), Character.valueOf('2'));
        ((HashMap) (obj1)).put(Character.valueOf('D'), Character.valueOf('3'));
        ((HashMap) (obj1)).put(Character.valueOf('E'), Character.valueOf('3'));
        ((HashMap) (obj1)).put(Character.valueOf('F'), Character.valueOf('3'));
        ((HashMap) (obj1)).put(Character.valueOf('G'), Character.valueOf('4'));
        ((HashMap) (obj1)).put(Character.valueOf('H'), Character.valueOf('4'));
        ((HashMap) (obj1)).put(Character.valueOf('I'), Character.valueOf('4'));
        ((HashMap) (obj1)).put(Character.valueOf('J'), Character.valueOf('5'));
        ((HashMap) (obj1)).put(Character.valueOf('K'), Character.valueOf('5'));
        ((HashMap) (obj1)).put(Character.valueOf('L'), Character.valueOf('5'));
        ((HashMap) (obj1)).put(Character.valueOf('M'), Character.valueOf('6'));
        ((HashMap) (obj1)).put(Character.valueOf('N'), Character.valueOf('6'));
        ((HashMap) (obj1)).put(Character.valueOf('O'), Character.valueOf('6'));
        ((HashMap) (obj1)).put(Character.valueOf('P'), Character.valueOf('7'));
        ((HashMap) (obj1)).put(Character.valueOf('Q'), Character.valueOf('7'));
        ((HashMap) (obj1)).put(Character.valueOf('R'), Character.valueOf('7'));
        ((HashMap) (obj1)).put(Character.valueOf('S'), Character.valueOf('7'));
        ((HashMap) (obj1)).put(Character.valueOf('T'), Character.valueOf('8'));
        ((HashMap) (obj1)).put(Character.valueOf('U'), Character.valueOf('8'));
        ((HashMap) (obj1)).put(Character.valueOf('V'), Character.valueOf('8'));
        ((HashMap) (obj1)).put(Character.valueOf('W'), Character.valueOf('9'));
        ((HashMap) (obj1)).put(Character.valueOf('X'), Character.valueOf('9'));
        ((HashMap) (obj1)).put(Character.valueOf('Y'), Character.valueOf('9'));
        ((HashMap) (obj1)).put(Character.valueOf('Z'), Character.valueOf('9'));
        ALPHA_MAPPINGS = Collections.unmodifiableMap(((Map) (obj1)));
        obj1 = new HashMap(100);
        ((HashMap) (obj1)).putAll(ALPHA_MAPPINGS);
        ((HashMap) (obj1)).putAll(((Map) (obj)));
        ALPHA_PHONE_MAPPINGS = Collections.unmodifiableMap(((Map) (obj1)));
        obj1 = new HashMap();
        ((HashMap) (obj1)).putAll(((Map) (obj)));
        ((HashMap) (obj1)).put(Character.valueOf('+'), Character.valueOf('+'));
        ((HashMap) (obj1)).put(Character.valueOf('*'), Character.valueOf('*'));
        DIALLABLE_CHAR_MAPPINGS = Collections.unmodifiableMap(((Map) (obj1)));
        obj1 = new HashMap();
        char c;
        for (Iterator iterator = ALPHA_MAPPINGS.keySet().iterator(); iterator.hasNext(); ((HashMap) (obj1)).put(Character.valueOf(c), Character.valueOf(c)))
        {
            c = ((Character)iterator.next()).charValue();
            ((HashMap) (obj1)).put(Character.valueOf(Character.toLowerCase(c)), Character.valueOf(c));
        }

        ((HashMap) (obj1)).putAll(((Map) (obj)));
        ((HashMap) (obj1)).put(Character.valueOf('-'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\uFF0D'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2010'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2011'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2012'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2013'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2014'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2015'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2212'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('/'), Character.valueOf('/'));
        ((HashMap) (obj1)).put(Character.valueOf('\uFF0F'), Character.valueOf('/'));
        ((HashMap) (obj1)).put(Character.valueOf(' '), Character.valueOf(' '));
        ((HashMap) (obj1)).put(Character.valueOf('\u3000'), Character.valueOf(' '));
        ((HashMap) (obj1)).put(Character.valueOf('\u2060'), Character.valueOf(' '));
        ((HashMap) (obj1)).put(Character.valueOf('.'), Character.valueOf('.'));
        ((HashMap) (obj1)).put(Character.valueOf('\uFF0E'), Character.valueOf('.'));
        ALL_PLUS_NUMBER_GROUPING_SYMBOLS = Collections.unmodifiableMap(((Map) (obj1)));
        obj = String.valueOf(Arrays.toString(ALPHA_MAPPINGS.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        obj1 = String.valueOf(Arrays.toString(ALPHA_MAPPINGS.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String s;
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        VALID_ALPHA = ((String) (obj));
        obj = String.valueOf(String.valueOf("\\p{Nd}{2}|[+\uFF0B]*+(?:[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E*]*\\p{Nd}){3,}[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E*"));
        obj1 = String.valueOf(String.valueOf(VALID_ALPHA));
        s = String.valueOf(String.valueOf("\\p{Nd}"));
        VALID_PHONE_NUMBER = (new StringBuilder(((String) (obj)).length() + 2 + ((String) (obj1)).length() + s.length())).append(((String) (obj))).append(((String) (obj1))).append(s).append("]*").toString();
        obj = String.valueOf("x\uFF58#\uFF03~\uFF5E");
        if (((String) (obj)).length() != 0)
        {
            obj = ",".concat(((String) (obj)));
        } else
        {
            obj = new String(",");
        }
        EXTN_PATTERNS_FOR_PARSING = createExtnPattern(((String) (obj)));
        obj = String.valueOf(String.valueOf(EXTN_PATTERNS_FOR_PARSING));
        EXTN_PATTERN = Pattern.compile((new StringBuilder(((String) (obj)).length() + 5)).append("(?:").append(((String) (obj))).append(")$").toString(), 66);
        obj = String.valueOf(String.valueOf(VALID_PHONE_NUMBER));
        obj1 = String.valueOf(String.valueOf(EXTN_PATTERNS_FOR_PARSING));
        VALID_PHONE_NUMBER_PATTERN = Pattern.compile((new StringBuilder(((String) (obj)).length() + 5 + ((String) (obj1)).length())).append(((String) (obj))).append("(?:").append(((String) (obj1))).append(")?").toString(), 66);
    }
}
