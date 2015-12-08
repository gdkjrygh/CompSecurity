// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import java.util.HashMap;
import java.util.Map;
import me.lyft.android.common.DateUtils;
import me.lyft.android.common.Preconditions;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.domain.payment:
//            ICard

public class Card
    implements ICard
{

    private static Map localeFormats = initFormats();
    private String addressCity;
    private String addressCountry;
    private String addressLine1;
    private String addressLine2;
    private String addressState;
    private String addressZip;
    private String cvc;
    private Integer expMonth;
    private Integer expYear;
    private String locale;
    private String name;
    private String number;
    private String type;

    private Card()
    {
    }

    public static ICard create(String s, Integer integer, Integer integer1, String s1, String s2)
    {
        return create(s, integer, integer1, s1, s2, "en_US");
    }

    public static ICard create(String s, Integer integer, Integer integer1, String s1, String s2, String s3)
    {
        Card card;
        boolean flag;
        if (s3.equals("en_US") || s3.equals("en_CA"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        card = new Card();
        card.number = normalizeCardNumber(s);
        card.expMonth = integer;
        if (integer1 == null)
        {
            s = null;
        } else
        {
            s = Integer.valueOf(DateUtils.normalizeYear(integer1.intValue()));
        }
        card.expYear = s;
        card.cvc = s1;
        card.addressZip = s2;
        card.type = card.getType();
        card.locale = s3;
        return card;
    }

    private static Map initFormats()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("en_US", Integer.valueOf(5));
        hashmap.put("en_CA", Integer.valueOf(6));
        return hashmap;
    }

    static boolean isValidLuhnNumber(String s)
    {
        if (!Strings.isNullOrBlank(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        int j;
        int k;
        j = s.length() - 1;
        k = 0;
        flag = true;
_L6:
        if (j < 0) goto _L4; else goto _L3
_L3:
        char c = s.charAt(j);
        if (!Character.isDigit(c)) goto _L1; else goto _L5
_L5:
        int l = Integer.parseInt((new StringBuilder()).append("").append(c).toString());
        int i;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = l;
        if (flag)
        {
            i = l * 2;
        }
        l = i;
        if (i > 9)
        {
            l = i - 9;
        }
        k += l;
        j--;
          goto _L6
_L4:
        boolean flag1;
        if (k % 10 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1;
    }

    static boolean isWholePositiveNumber(String s)
    {
        if (!Strings.isNullOrBlank(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        s = s.toCharArray();
        int j = s.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (!Character.isDigit(s[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    static String normalizeCardNumber(String s)
    {
        if (Strings.isNullOrBlank(s))
        {
            return null;
        } else
        {
            return Strings.emptyToNull(s.replaceAll("\\s+|-", "").trim());
        }
    }

    public String getAddressCountry()
    {
        return addressCountry;
    }

    public String getAddressLine1()
    {
        return addressLine1;
    }

    public String getAddressLine2()
    {
        return addressLine2;
    }

    public String getAddressZip()
    {
        return addressZip;
    }

    public String getCity()
    {
        return addressCity;
    }

    public String getCvc()
    {
        return cvc;
    }

    public Integer getExpMonth()
    {
        return expMonth;
    }

    public Integer getExpYear()
    {
        return expYear;
    }

    public String getLast4()
    {
        if (number != null && number.length() > 4)
        {
            return number.substring(number.length() - 4, number.length());
        } else
        {
            return null;
        }
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }

    public String getState()
    {
        return addressState;
    }

    public String getType()
    {
        if (Strings.isNullOrBlank(type) && !Strings.isNullOrBlank(number))
        {
            if (Strings.hasAnyPrefix(number, PREFIXES_AMERICAN_EXPRESS))
            {
                return "American Express";
            }
            if (Strings.hasAnyPrefix(number, PREFIXES_DISCOVER))
            {
                return "Discover";
            }
            if (Strings.hasAnyPrefix(number, PREFIXES_JCB))
            {
                return "JCB";
            }
            if (Strings.hasAnyPrefix(number, PREFIXES_DINERS_CLUB))
            {
                return "Diners Club";
            }
            if (Strings.hasAnyPrefix(number, PREFIXES_VISA))
            {
                return "Visa";
            }
            if (Strings.hasAnyPrefix(number, PREFIXES_MASTERCARD))
            {
                return "MasterCard";
            } else
            {
                return "Unknown";
            }
        } else
        {
            return type;
        }
    }

    public boolean isBillingAddressEmpty()
    {
        boolean flag = Strings.isNullOrBlank(getAddressLine1());
        boolean flag1 = Strings.isNullOrBlank(getCity());
        boolean flag2 = Strings.isNullOrBlank(getState());
        return flag && flag1 && flag2;
    }

    public boolean isEmpty()
    {
        boolean flag1 = Strings.isNullOrEmpty(getNumber());
        boolean flag;
        boolean flag2;
        boolean flag3;
        if (getExpMonth() == null && getExpYear() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = Strings.isNullOrEmpty(getCvc());
        flag3 = Strings.isNullOrEmpty(getAddressZip());
        return flag1 && flag && flag2 && flag3;
    }

    public boolean isInvalidBillingAddress()
    {
        boolean flag = Strings.isNullOrBlank(getAddressLine1());
        boolean flag1 = Strings.isNullOrBlank(getCity());
        boolean flag2 = Strings.isNullOrBlank(getState());
        return flag || flag1 || flag2;
    }

    public void setAddressLine1(String s)
    {
        addressLine1 = s;
    }

    public void setAddressLine2(String s)
    {
        addressLine2 = s;
    }

    public void setCity(String s)
    {
        addressCity = s;
    }

    public void setState(String s)
    {
        addressState = s;
    }

    public boolean validateCVC()
    {
        if (!Strings.isNullOrBlank(cvc))
        {
            String s = cvc.trim();
            boolean flag;
            if (type == null && s.length() >= 3 && s.length() <= 4 || "American Express".equals(type) && s.length() == 4 || !"American Express".equals(type) && s.length() == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (isWholePositiveNumber(s) && flag)
            {
                return true;
            }
        }
        return false;
    }

    public boolean validateCard()
    {
        if (cvc != null) goto _L2; else goto _L1
_L1:
        if (!validateNumber() || !validateExpiryDate()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (!validateNumber() || !validateExpiryDate() || !validateCVC())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    boolean validateExpMonth()
    {
        boolean flag = true;
        if (expMonth == null)
        {
            return false;
        }
        if (expMonth.intValue() < 1 || expMonth.intValue() > 12)
        {
            flag = false;
        }
        return flag;
    }

    boolean validateExpYear()
    {
        while (expYear == null || DateUtils.hasYearPassed(expYear.intValue())) 
        {
            return false;
        }
        return true;
    }

    public boolean validateExpiryDate()
    {
        while (!validateExpMonth() || !validateExpYear() || DateUtils.hasMonthPassed(expYear.intValue(), expMonth.intValue())) 
        {
            return false;
        }
        return true;
    }

    public boolean validateNumber()
    {
        String s;
        boolean flag;
        flag = true;
        s = normalizeCardNumber(number);
        if (!Strings.isNullOrBlank(s) && isWholePositiveNumber(s) && isValidLuhnNumber(s)) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (!"American Express".equals(type))
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.length() != 15)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"Diners Club".equals(type))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s.length() == 14) goto _L4; else goto _L5
_L5:
        return false;
        if (s.length() == 16) goto _L4; else goto _L6
_L6:
        return false;
    }

    public boolean validateZip()
    {
        return !Strings.isNullOrEmpty(addressZip) && addressZip.length() == ((Integer)localeFormats.get(locale)).intValue();
    }

}
