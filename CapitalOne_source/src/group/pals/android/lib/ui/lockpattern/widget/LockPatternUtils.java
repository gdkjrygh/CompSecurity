// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern.widget;

import group.pals.android.lib.ui.lockpattern.collect.Lists;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;

public class LockPatternUtils
{

    public static final String _Sha1 = "sha-1";
    public static final String _Utf8 = "utf-8";

    public LockPatternUtils()
    {
    }

    public static String patternToSha1(List list)
    {
        try
        {
            Object obj = MessageDigest.getInstance("sha-1");
            ((MessageDigest) (obj)).update(patternToString(list).getBytes("utf-8"));
            list = ((MessageDigest) (obj)).digest();
            obj = new BigInteger(1, list);
            list = String.format((Locale)null, (new StringBuilder()).append("%0").append(list.length * 2).append("x").toString(), new Object[] {
                obj
            }).toLowerCase();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return "";
        }
        return list;
    }

    public static String patternToString(List list)
    {
        if (list == null)
        {
            return "";
        }
        int j = list.size();
        byte abyte0[] = new byte[j];
        for (int i = 0; i < j; i++)
        {
            LockPatternView.Cell cell = (LockPatternView.Cell)list.get(i);
            abyte0[i] = (byte)(cell.getRow() * 3 + cell.getColumn());
        }

        try
        {
            list = new String(abyte0, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return "";
        }
        return list;
    }

    public static String patternToStringValue(List list)
    {
        String s = "";
        if (list == null)
        {
            return "";
        }
        for (int i = 0; i < list.size(); i++)
        {
            LockPatternView.Cell cell = (LockPatternView.Cell)list.get(i);
            s = (new StringBuilder()).append(s).append(cell.getRow() * 3 + cell.getColumn() + 1).toString();
        }

        return s;
    }

    public static List stringToPattern(String s)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        s = s.getBytes("utf-8");
        int i = 0;
_L1:
        if (i >= s.length)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        byte byte0 = (byte)(s[i] - 49);
        arraylist.add(LockPatternView.Cell.of(byte0 / 3, byte0 % 3));
        i++;
          goto _L1
        s;
        return arraylist;
    }
}
