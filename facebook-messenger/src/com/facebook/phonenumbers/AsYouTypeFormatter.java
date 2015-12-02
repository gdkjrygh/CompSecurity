// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.phonenumbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.phonenumbers:
//            PhoneNumberUtil, RegexCache

public class AsYouTypeFormatter
{

    private static final Pattern CHARACTER_CLASS_PATTERN = Pattern.compile("\\[([^\\[\\]])*\\]");
    private static final Pattern DIGIT_PATTERN = Pattern.compile("\u2008");
    private static final Pattern ELIGIBLE_FORMAT_PATTERN = Pattern.compile("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*(\\$\\d[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*)+");
    private static final Phonemetadata.PhoneMetadata EMPTY_METADATA = (new Phonemetadata.PhoneMetadata()).setInternationalPrefix("NA");
    private static final Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN = Pattern.compile("[- ]");
    private static final Pattern STANDALONE_DIGIT_PATTERN = Pattern.compile("\\d(?=[^,}][^,}])");
    private boolean ableToFormat;
    private StringBuilder accruedInput;
    private StringBuilder accruedInputWithoutFormatting;
    private String currentFormattingPattern;
    private Phonemetadata.PhoneMetadata currentMetaData;
    private String currentOutput;
    private String defaultCountry;
    private Phonemetadata.PhoneMetadata defaultMetaData;
    private StringBuilder formattingTemplate;
    private boolean inputHasFormatting;
    private boolean isCompleteNumber;
    private boolean isExpectingCountryCallingCode;
    private int lastMatchPosition;
    private StringBuilder nationalNumber;
    private String nationalPrefixExtracted;
    private int originalPosition;
    private final PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
    private int positionToRemember;
    private List possibleFormats;
    private StringBuilder prefixBeforeNationalNumber;
    private RegexCache regexCache;
    private boolean shouldAddSpaceAfterNationalPrefix;

    AsYouTypeFormatter(String s)
    {
        currentOutput = "";
        formattingTemplate = new StringBuilder();
        currentFormattingPattern = "";
        accruedInput = new StringBuilder();
        accruedInputWithoutFormatting = new StringBuilder();
        ableToFormat = true;
        inputHasFormatting = false;
        isCompleteNumber = false;
        isExpectingCountryCallingCode = false;
        lastMatchPosition = 0;
        originalPosition = 0;
        positionToRemember = 0;
        prefixBeforeNationalNumber = new StringBuilder();
        shouldAddSpaceAfterNationalPrefix = false;
        nationalPrefixExtracted = "";
        nationalNumber = new StringBuilder();
        possibleFormats = new ArrayList();
        regexCache = new RegexCache(64);
        defaultCountry = s;
        currentMetaData = getMetadataForRegion(defaultCountry);
        defaultMetaData = currentMetaData;
    }

    private boolean ableToExtractLongerNdd()
    {
        boolean flag = false;
        if (nationalPrefixExtracted.length() > 0)
        {
            nationalNumber.insert(0, nationalPrefixExtracted);
            int i = prefixBeforeNationalNumber.lastIndexOf(nationalPrefixExtracted);
            prefixBeforeNationalNumber.setLength(i);
        }
        if (!nationalPrefixExtracted.equals(removeNationalPrefixFromNationalNumber()))
        {
            flag = true;
        }
        return flag;
    }

    private String appendNationalNumber(String s)
    {
        int i = prefixBeforeNationalNumber.length();
        if (shouldAddSpaceAfterNationalPrefix && i > 0 && prefixBeforeNationalNumber.charAt(i - 1) != ' ')
        {
            return (new StringBuilder()).append(new String(prefixBeforeNationalNumber)).append(' ').append(s).toString();
        } else
        {
            return (new StringBuilder()).append(prefixBeforeNationalNumber).append(s).toString();
        }
    }

    private String attemptToChooseFormattingPattern()
    {
        if (nationalNumber.length() >= 3)
        {
            getAvailableFormats(nationalNumber.substring(0, 3));
            if (maybeCreateNewTemplate())
            {
                return inputAccruedNationalNumber();
            } else
            {
                return accruedInput.toString();
            }
        } else
        {
            return appendNationalNumber(nationalNumber.toString());
        }
    }

    private String attemptToChoosePatternWithPrefixExtracted()
    {
        ableToFormat = true;
        isExpectingCountryCallingCode = false;
        possibleFormats.clear();
        return attemptToChooseFormattingPattern();
    }

    private boolean attemptToExtractCountryCallingCode()
    {
        if (nationalNumber.length() != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        int i;
        obj = new StringBuilder();
        i = phoneUtil.extractCountryCode(nationalNumber, ((StringBuilder) (obj)));
        if (i == 0) goto _L1; else goto _L3
_L3:
        nationalNumber.setLength(0);
        nationalNumber.append(((CharSequence) (obj)));
        obj = phoneUtil.getRegionCodeForCountryCode(i);
        if (!"001".equals(obj)) goto _L5; else goto _L4
_L4:
        currentMetaData = phoneUtil.getMetadataForNonGeographicalRegion(i);
_L7:
        obj = Integer.toString(i);
        prefixBeforeNationalNumber.append(((String) (obj))).append(' ');
        return true;
_L5:
        if (!((String) (obj)).equals(defaultCountry))
        {
            currentMetaData = getMetadataForRegion(((String) (obj)));
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean attemptToExtractIdd()
    {
        Matcher matcher = regexCache.getPatternForRegex((new StringBuilder()).append("\\+|").append(currentMetaData.getInternationalPrefix()).toString()).matcher(accruedInputWithoutFormatting);
        if (matcher.lookingAt())
        {
            isCompleteNumber = true;
            int i = matcher.end();
            nationalNumber.setLength(0);
            nationalNumber.append(accruedInputWithoutFormatting.substring(i));
            prefixBeforeNationalNumber.setLength(0);
            prefixBeforeNationalNumber.append(accruedInputWithoutFormatting.substring(0, i));
            if (accruedInputWithoutFormatting.charAt(0) != '+')
            {
                prefixBeforeNationalNumber.append(' ');
            }
            return true;
        } else
        {
            return false;
        }
    }

    private boolean createFormattingTemplate(Phonemetadata.NumberFormat numberformat)
    {
        String s = numberformat.getPattern();
        if (s.indexOf('|') == -1)
        {
            s = CHARACTER_CLASS_PATTERN.matcher(s).replaceAll("\\\\d");
            s = STANDALONE_DIGIT_PATTERN.matcher(s).replaceAll("\\\\d");
            formattingTemplate.setLength(0);
            numberformat = getFormattingTemplate(s, numberformat.getFormat());
            if (numberformat.length() > 0)
            {
                formattingTemplate.append(numberformat);
                return true;
            }
        }
        return false;
    }

    private void getAvailableFormats(String s)
    {
        Object obj;
        boolean flag;
        if (isCompleteNumber && currentMetaData.intlNumberFormatSize() > 0)
        {
            obj = currentMetaData.intlNumberFormats();
        } else
        {
            obj = currentMetaData.numberFormats();
        }
        flag = currentMetaData.hasNationalPrefix();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)((Iterator) (obj)).next();
            if (flag && !isCompleteNumber && !numberformat.isNationalPrefixOptionalWhenFormatting())
            {
                PhoneNumberUtil phonenumberutil = phoneUtil;
                if (!PhoneNumberUtil.formattingRuleHasFirstGroupOnly(numberformat.getNationalPrefixFormattingRule()))
                {
                    continue;
                }
            }
            if (isFormatEligible(numberformat.getFormat()))
            {
                possibleFormats.add(numberformat);
            }
        } while (true);
        narrowDownPossibleFormats(s);
    }

    private String getFormattingTemplate(String s, String s1)
    {
        Object obj = regexCache.getPatternForRegex(s).matcher("999999999999999");
        ((Matcher) (obj)).find();
        obj = ((Matcher) (obj)).group();
        if (((String) (obj)).length() < nationalNumber.length())
        {
            return "";
        } else
        {
            return ((String) (obj)).replaceAll(s, s1).replaceAll("9", "\u2008");
        }
    }

    private Phonemetadata.PhoneMetadata getMetadataForRegion(String s)
    {
        int i = phoneUtil.getCountryCodeForRegion(s);
        s = phoneUtil.getRegionCodeForCountryCode(i);
        s = phoneUtil.getMetadataForRegion(s);
        if (s != null)
        {
            return s;
        } else
        {
            return EMPTY_METADATA;
        }
    }

    private String inputAccruedNationalNumber()
    {
        int j = nationalNumber.length();
        if (j > 0)
        {
            String s = "";
            for (int i = 0; i < j; i++)
            {
                s = inputDigitHelper(nationalNumber.charAt(i));
            }

            if (ableToFormat)
            {
                return appendNationalNumber(s);
            } else
            {
                return accruedInput.toString();
            }
        } else
        {
            return prefixBeforeNationalNumber.toString();
        }
    }

    private String inputDigitHelper(char c)
    {
        Matcher matcher = DIGIT_PATTERN.matcher(formattingTemplate);
        if (matcher.find(lastMatchPosition))
        {
            String s = matcher.replaceFirst(Character.toString(c));
            formattingTemplate.replace(0, s.length(), s);
            lastMatchPosition = matcher.start();
            return formattingTemplate.substring(0, lastMatchPosition + 1);
        }
        if (possibleFormats.size() == 1)
        {
            ableToFormat = false;
        }
        currentFormattingPattern = "";
        return accruedInput.toString();
    }

    private String inputDigitWithOptionToRememberPosition(char c, boolean flag)
    {
        String s;
        accruedInput.append(c);
        if (flag)
        {
            originalPosition = accruedInput.length();
        }
        if (!isDigitOrLeadingPlusSign(c))
        {
            ableToFormat = false;
            inputHasFormatting = true;
        } else
        {
            c = normalizeAndAccrueDigitsAndPlusSign(c, flag);
        }
        if (ableToFormat) goto _L2; else goto _L1
_L1:
        if (!inputHasFormatting) goto _L4; else goto _L3
_L3:
        s = accruedInput.toString();
_L10:
        return s;
_L4:
        if (attemptToExtractIdd())
        {
            if (attemptToExtractCountryCallingCode())
            {
                return attemptToChoosePatternWithPrefixExtracted();
            }
        } else
        if (ableToExtractLongerNdd())
        {
            prefixBeforeNationalNumber.append(' ');
            return attemptToChoosePatternWithPrefixExtracted();
        }
        return accruedInput.toString();
_L2:
        accruedInputWithoutFormatting.length();
        JVM INSTR tableswitch 0 3: default 164
    //                   0 211
    //                   1 211
    //                   2 211
    //                   3 219;
           goto _L5 _L6 _L6 _L6 _L7
_L5:
        if (isExpectingCountryCallingCode)
        {
            if (attemptToExtractCountryCallingCode())
            {
                isExpectingCountryCallingCode = false;
            }
            return (new StringBuilder()).append(prefixBeforeNationalNumber).append(nationalNumber.toString()).toString();
        }
        break; /* Loop/switch isn't completed */
_L6:
        return accruedInput.toString();
_L7:
        if (attemptToExtractIdd())
        {
            isExpectingCountryCallingCode = true;
        } else
        {
            nationalPrefixExtracted = removeNationalPrefixFromNationalNumber();
            return attemptToChooseFormattingPattern();
        }
        if (true) goto _L5; else goto _L8
_L8:
        if (possibleFormats.size() > 0)
        {
            String s2 = inputDigitHelper(c);
            String s1 = attemptToFormatAccruedDigits();
            s = s1;
            if (s1.length() <= 0)
            {
                narrowDownPossibleFormats(nationalNumber.toString());
                if (maybeCreateNewTemplate())
                {
                    return inputAccruedNationalNumber();
                }
                if (ableToFormat)
                {
                    return appendNationalNumber(s2);
                } else
                {
                    return accruedInput.toString();
                }
            }
        } else
        {
            return attemptToChooseFormattingPattern();
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    private boolean isDigitOrLeadingPlusSign(char c)
    {
        return Character.isDigit(c) || accruedInput.length() == 1 && PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(Character.toString(c)).matches();
    }

    private boolean isFormatEligible(String s)
    {
        return ELIGIBLE_FORMAT_PATTERN.matcher(s).matches();
    }

    private boolean isNanpaNumberWithNationalPrefix()
    {
        return currentMetaData.getCountryCode() == 1 && nationalNumber.charAt(0) == '1' && nationalNumber.charAt(1) != '0' && nationalNumber.charAt(1) != '1';
    }

    private boolean maybeCreateNewTemplate()
    {
        for (Iterator iterator = possibleFormats.iterator(); iterator.hasNext(); iterator.remove())
        {
            Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)iterator.next();
            String s = numberformat.getPattern();
            if (currentFormattingPattern.equals(s))
            {
                return false;
            }
            if (createFormattingTemplate(numberformat))
            {
                currentFormattingPattern = s;
                shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(numberformat.getNationalPrefixFormattingRule()).find();
                lastMatchPosition = 0;
                return true;
            }
        }

        ableToFormat = false;
        return false;
    }

    private void narrowDownPossibleFormats(String s)
    {
        int i = s.length() - 3;
        Iterator iterator = possibleFormats.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)iterator.next();
            if (numberformat.leadingDigitsPatternSize() > i && !regexCache.getPatternForRegex(numberformat.getLeadingDigitsPattern(i)).matcher(s).lookingAt())
            {
                iterator.remove();
            }
        } while (true);
    }

    private char normalizeAndAccrueDigitsAndPlusSign(char c, boolean flag)
    {
        if (c == '+')
        {
            accruedInputWithoutFormatting.append(c);
        } else
        {
            c = Character.forDigit(Character.digit(c, 10), 10);
            accruedInputWithoutFormatting.append(c);
            nationalNumber.append(c);
        }
        if (flag)
        {
            positionToRemember = accruedInputWithoutFormatting.length();
        }
        return c;
    }

    private String removeNationalPrefixFromNationalNumber()
    {
        int i = 1;
        if (!isNanpaNumberWithNationalPrefix()) goto _L2; else goto _L1
_L1:
        prefixBeforeNationalNumber.append('1').append(' ');
        isCompleteNumber = true;
_L4:
        String s = nationalNumber.substring(0, i);
        nationalNumber.delete(0, i);
        return s;
_L2:
        if (currentMetaData.hasNationalPrefixForParsing())
        {
            Matcher matcher = regexCache.getPatternForRegex(currentMetaData.getNationalPrefixForParsing()).matcher(nationalNumber);
            if (matcher.lookingAt())
            {
                isCompleteNumber = true;
                i = matcher.end();
                prefixBeforeNationalNumber.append(nationalNumber.substring(0, i));
                continue; /* Loop/switch isn't completed */
            }
        }
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    String attemptToFormatAccruedDigits()
    {
        for (Iterator iterator = possibleFormats.iterator(); iterator.hasNext();)
        {
            Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)iterator.next();
            Matcher matcher = regexCache.getPatternForRegex(numberformat.getPattern()).matcher(nationalNumber);
            if (matcher.matches())
            {
                shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(numberformat.getNationalPrefixFormattingRule()).find();
                return appendNationalNumber(matcher.replaceAll(numberformat.getFormat()));
            }
        }

        return "";
    }

    public void clear()
    {
        currentOutput = "";
        accruedInput.setLength(0);
        accruedInputWithoutFormatting.setLength(0);
        formattingTemplate.setLength(0);
        lastMatchPosition = 0;
        currentFormattingPattern = "";
        prefixBeforeNationalNumber.setLength(0);
        nationalPrefixExtracted = "";
        nationalNumber.setLength(0);
        ableToFormat = true;
        inputHasFormatting = false;
        positionToRemember = 0;
        originalPosition = 0;
        isCompleteNumber = false;
        isExpectingCountryCallingCode = false;
        possibleFormats.clear();
        shouldAddSpaceAfterNationalPrefix = false;
        if (!currentMetaData.equals(defaultMetaData))
        {
            currentMetaData = getMetadataForRegion(defaultCountry);
        }
    }

    public int getRememberedPosition()
    {
        int i = 0;
        if (ableToFormat) goto _L2; else goto _L1
_L1:
        int k = originalPosition;
_L4:
        return k;
_L2:
        int j = 0;
_L6:
        k = i;
        if (j >= positionToRemember) goto _L4; else goto _L3
_L3:
        k = i;
        if (i >= currentOutput.length()) goto _L4; else goto _L5
_L5:
        int l = j;
        if (accruedInputWithoutFormatting.charAt(j) == currentOutput.charAt(i))
        {
            l = j + 1;
        }
        i++;
        j = l;
          goto _L6
    }

    public String inputDigit(char c)
    {
        currentOutput = inputDigitWithOptionToRememberPosition(c, false);
        return currentOutput;
    }

    public String inputDigitAndRememberPosition(char c)
    {
        currentOutput = inputDigitWithOptionToRememberPosition(c, true);
        return currentOutput;
    }

}
