// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.text.CharacterIterator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package io.card.payment:
//            StringHelper, CardType

class CreditCardNumber
{

    private static String formatFifteenString(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < 15; i++)
        {
            if (i == 4 || i == 10)
            {
                stringbuilder.append(' ');
            }
            stringbuilder.append(s.charAt(i));
        }

        return stringbuilder.toString();
    }

    private static String formatSixteenString(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < 16; i++)
        {
            if (i != 0 && i % 4 == 0)
            {
                stringbuilder.append(' ');
            }
            stringbuilder.append(s.charAt(i));
        }

        return stringbuilder.toString();
    }

    public static String formatString(String s)
    {
        return formatString(s, true, null);
    }

    public static String formatString(String s, boolean flag, CardType cardtype)
    {
        String s1;
        CardType cardtype1;
        int i;
        if (flag)
        {
            s1 = StringHelper.getDigitsOnlyString(s);
        } else
        {
            s1 = s;
        }
        cardtype1 = cardtype;
        if (cardtype == null)
        {
            cardtype1 = CardType.fromCardNumber(s1);
        }
        i = cardtype1.numberLength();
        cardtype = s;
        if (s1.length() == i)
        {
            if (i == 16)
            {
                cardtype = formatSixteenString(s1);
            } else
            {
                cardtype = s;
                if (i == 15)
                {
                    return formatFifteenString(s1);
                }
            }
        }
        return cardtype;
    }

    public static Date getDateForString(String s)
    {
        Object obj = null;
        String s1 = StringHelper.getDigitsOnlyString(s);
        SimpleDateFormat simpledateformat = getDateFormatForLength(s1.length());
        s = obj;
        if (simpledateformat != null)
        {
            try
            {
                simpledateformat.setLenient(false);
                s = simpledateformat.parse(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        return s;
    }

    public static SimpleDateFormat getDateFormatForLength(int i)
    {
        if (i == 4)
        {
            return new SimpleDateFormat("MMyy");
        }
        if (i == 6)
        {
            return new SimpleDateFormat("MMyyyy");
        } else
        {
            return null;
        }
    }

    public static boolean isDateValid(int i, int j)
    {
        if (i >= 1 && 12 >= i)
        {
            Calendar calendar = Calendar.getInstance();
            int k = calendar.get(1);
            int l = calendar.get(2);
            if (j >= k && (j != k || i >= l + 1) && j <= k + 15)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean passesLuhnChecksum(String s)
    {
        boolean flag = true;
        s = new StringCharacterIterator(s);
        char c = s.last();
        int j = 0;
        for (int i = 0; c != '\uFFFF'; i++)
        {
            if (!Character.isDigit(c))
            {
                return false;
            }
            j += (new int[][] {
                new int[] {
                    0, 1, 2, 3, 4, 5, 6, 7, 8, 9
                }, new int[] {
                    0, 2, 4, 6, 8, 1, 3, 5, 7, 9
                }
            })[i & 1][c - 48];
            c = s.previous();
        }

        if (j % 10 != 0)
        {
            flag = false;
        }
        return flag;
    }
}
