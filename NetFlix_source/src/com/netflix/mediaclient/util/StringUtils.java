// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.netflix.mediaclient.util:
//            TimeUtils

public final class StringUtils
{

    private static final String DETAILS_TEXT_SPACER = "   ";
    public static final String EMPTY_STRING = "";
    private static final char HEX_CHAR[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private static final Pattern PERCENTAGE_PATTERN = Pattern.compile("^[0-9]+%$");
    private static final Pattern PIXEL_PATTERN = Pattern.compile("^[0-9]+px$", 2);
    public static final String SPACE_SPLIT_REG_EXP = " ";
    private static final Pattern STARTS_WITH_DIGIT_PATTERN = Pattern.compile("^[0-9]");
    private static final String TAG = "StringUtils";
    public static final String UTF_8 = "utf-8";
    public static final String WHITE_SPACE_SPLIT_REG_EXP = "\\s+";

    private StringUtils()
    {
    }

    public static String buildUnencodedUrlParam(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder("&");
        stringbuilder.append(s);
        stringbuilder.append("=");
        stringbuilder.append(s1);
        return stringbuilder.toString();
    }

    public static String capitalizeFirstLetter(String s)
    {
        if (isEmpty(s))
        {
            return s;
        }
        s = s.toCharArray();
        StringBuilder stringbuilder = (new StringBuilder()).append(Character.toUpperCase(s[0]));
        for (int i = 1; i < s.length; i++)
        {
            stringbuilder.append(s[i]);
        }

        return stringbuilder.toString();
    }

    public static CharSequence createBoldLabeledText(Context context, int i, String s)
    {
        if (context == null)
        {
            return "";
        }
        String s1 = context.getString(i);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s1);
        spannablestringbuilder.setSpan(new StyleSpan(1), 0, s1.length(), 0);
        s1 = s;
        if (isEmpty(s))
        {
            s1 = context.getString(0x7f0c0136);
        }
        spannablestringbuilder.append(" ");
        spannablestringbuilder.append(s1);
        return spannablestringbuilder;
    }

    public static String decodeHtmlEntities(String s)
    {
        if (isEmpty(s))
        {
            return s;
        } else
        {
            return Html.fromHtml(s).toString();
        }
    }

    public static String escapeJsonChars(String s)
    {
        StringBuilder stringbuilder;
        int i;
        int j;
        if (s == null || s.length() == 0)
        {
            return "";
        }
        j = s.length();
        stringbuilder = new StringBuilder(j + 4);
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        char c = s.charAt(i);
        c;
        JVM INSTR lookupswitch 3: default 80
    //                   34: 93
    //                   39: 93
    //                   92: 93;
           goto _L3 _L4 _L4 _L4
_L3:
        stringbuilder.append(c);
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append('\\');
        stringbuilder.append(c);
        if (true) goto _L5; else goto _L2
_L2:
        return stringbuilder.toString();
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static Pair extractNumberPair(String s)
    {
        s = safeSplit(s, "\\s+");
        if (s.length >= 2)
        {
            return new Pair(Integer.valueOf(Integer.parseInt(s[0])), Integer.valueOf(Integer.parseInt(s[1])));
        } else
        {
            return null;
        }
    }

    public static String[] extractTokens(String s, String s1)
    {
        if (s != null && !"".equals(s.trim())) goto _L2; else goto _L1
_L1:
        s = new String[0];
_L4:
        return s;
_L2:
        if (s1 == null)
        {
            return (new String[] {
                s
            });
        }
        StringTokenizer stringtokenizer = new StringTokenizer(s, s1);
        s1 = new String[stringtokenizer.countTokens()];
        int i = 0;
        do
        {
            s = s1;
            if (!stringtokenizer.hasMoreTokens())
            {
                continue;
            }
            s1[i] = stringtokenizer.nextToken();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static CharSequence getBasicInfoString(Context context, ShowDetails showdetails)
    {
        if (context == null)
        {
            return "";
        }
        context = context.getResources();
        if (context == null)
        {
            return "";
        } else
        {
            context = context.getQuantityString(0x7f0e0000, showdetails.getNumOfSeasons(), new Object[] {
                Integer.valueOf(showdetails.getNumOfSeasons())
            });
            return (new StringBuilder()).append(showdetails.getYear()).append("   ").append(showdetails.getCertification()).append("   ").append(context).toString();
        }
    }

    public static CharSequence getBasicInfoString(Context context, VideoDetails videodetails)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (videodetails.getYear() > 0)
        {
            stringbuilder.append(videodetails.getYear()).append("   ");
        }
        if (videodetails.getCertification() != null)
        {
            stringbuilder.append(videodetails.getCertification()).append("   ");
        }
        stringbuilder.append(String.format(context.getResources().getString(0x7f0c013b), new Object[] {
            Integer.valueOf(TimeUtils.convertSecondsToMinutes(videodetails.getRuntime()))
        }));
        return stringbuilder.toString();
    }

    public static String getFileAsString(File file)
        throws Exception
    {
        Object obj;
        Object obj1;
        ByteArrayOutputStream bytearrayoutputstream;
        obj = null;
        obj1 = null;
        bytearrayoutputstream = new ByteArrayOutputStream();
        file = new FileInputStream(file);
        obj = new byte[1024];
_L3:
        int i = file.read(((byte []) (obj)));
        if (i == -1) goto _L2; else goto _L1
_L1:
        bytearrayoutputstream.write(((byte []) (obj)), 0, i);
          goto _L3
        obj1;
        obj = file;
        file = ((File) (obj1));
_L7:
        throw new Exception("Problem while trying to read file", file);
        file;
_L5:
        try
        {
            bytearrayoutputstream.close();
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw file;
_L2:
        bytearrayoutputstream.flush();
        obj = new String(bytearrayoutputstream.toByteArray());
        try
        {
            bytearrayoutputstream.close();
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return ((String) (obj));
        }
        return ((String) (obj));
        obj1;
        obj = file;
        file = ((File) (obj1));
        if (true) goto _L5; else goto _L4
_L4:
        file;
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String getFilenameFromUri(String s)
    {
        if (isEmpty(s))
        {
            throw new IllegalArgumentException("Empty uri string");
        }
        int i = s.lastIndexOf("/");
        String s1;
        if (i > 0 && i < s.length() - 1)
        {
            s1 = s.substring(i + 1);
        } else
        {
            Log.w("StringUtils", (new StringBuilder()).append("No filename found in URI - using hashcode: ").append(s).toString());
            s1 = String.valueOf(s.hashCode());
        }
        if (Log.isLoggable("StringUtils", 2))
        {
            Log.v("StringUtils", (new StringBuilder()).append("Generating uri from: ").append(s).append(", file name: ").append(s1).toString());
        }
        return s1;
    }

    public static String getPathFromUri(String s)
    {
        if (isEmpty(s))
        {
            throw new IllegalArgumentException("Empty uri string");
        }
        Object obj = Uri.parse(s);
        if (obj == null)
        {
            obj = String.valueOf(s.hashCode());
            Log.w("StringUtils", (new StringBuilder()).append("Could not parse uri: ").append(s).append(", returning hash: ").append(((String) (obj))).toString());
            return ((String) (obj));
        } else
        {
            return ((Uri) (obj)).getPath();
        }
    }

    public static String getRawString(Resources resources, int i)
        throws Exception
    {
        Resources resources1;
        Resources resources2;
        resources2 = null;
        resources1 = null;
        resources = resources.openRawResource(i);
        resources1 = resources;
        resources2 = resources;
        byte abyte0[] = new byte[resources.available()];
        resources1 = resources;
        resources2 = resources;
        resources.read(abyte0);
        resources1 = resources;
        resources2 = resources;
        String s = new String(abyte0);
        try
        {
            resources.close();
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            return s;
        }
        return s;
        resources;
        resources2 = resources1;
        throw new Exception("Problem while trying to read raw", resources);
        resources;
        try
        {
            resources2.close();
        }
        catch (Exception exception) { }
        throw resources;
    }

    public static String getRemoteDataAsString(String s)
        throws IOException
    {
        String s1;
        InputStream inputstream;
        InputStream inputstream1;
        ByteArrayOutputStream bytearrayoutputstream;
        inputstream1 = null;
        bytearrayoutputstream = new ByteArrayOutputStream();
        s1 = null;
        inputstream = inputstream1;
        s = (new URL(s)).openConnection();
        s1 = s;
        inputstream = inputstream1;
        s.setConnectTimeout(5000);
        s1 = s;
        inputstream = inputstream1;
        s.setReadTimeout(5000);
        s1 = s;
        inputstream = inputstream1;
        s.connect();
        s1 = s;
        inputstream = inputstream1;
        inputstream1 = s.getInputStream();
        s1 = s;
        inputstream = inputstream1;
        byte abyte0[] = new byte[1024];
_L2:
        s1 = s;
        inputstream = inputstream1;
        int i = inputstream1.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s;
        inputstream = inputstream1;
        bytearrayoutputstream.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
        s;
        if (bytearrayoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        bytearrayoutputstream.close();
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        inputstream.close();
        String s2;
        if (s1 != null)
        {
            try
            {
                if (s1 instanceof HttpURLConnection)
                {
                    ((HttpURLConnection)s1).disconnect();
                }
            }
            catch (Exception exception) { }
        }
        throw s;
_L1:
        s1 = s;
        inputstream = inputstream1;
        bytearrayoutputstream.flush();
        s1 = s;
        inputstream = inputstream1;
        s2 = new String(bytearrayoutputstream.toByteArray());
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return s2;
            }
        }
        if (inputstream1 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        inputstream1.close();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        if (s instanceof HttpURLConnection)
        {
            ((HttpURLConnection)s).disconnect();
        }
        return s2;
    }

    public static boolean isEmpty(CharSequence charsequence)
    {
        return charsequence == null || "".equals(charsequence);
    }

    public static boolean isEmpty(String s)
    {
        return s == null || "".equals(s.trim());
    }

    public static boolean isInteger(String s)
    {
        return isInteger(s, 10);
    }

    public static boolean isInteger(String s, int i)
    {
        if (!isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j;
        s = s.trim();
        j = 0;
_L6:
        if (j >= s.length())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (j != 0 || s.charAt(j) != '-') goto _L4; else goto _L3
_L3:
        if (s.length() == 1) goto _L1; else goto _L5
_L5:
        j++;
          goto _L6
_L4:
        if (Character.digit(s.charAt(j), i) >= 0) goto _L5; else goto _L7
_L7:
        return false;
        return true;
    }

    public static boolean isNotEmpty(CharSequence charsequence)
    {
        return !isEmpty(charsequence);
    }

    public static boolean isNotEmpty(String s)
    {
        return !isEmpty(s);
    }

    public static String joinArray(String as[])
    {
        return joinArray(as, null);
    }

    public static String joinArray(String as[], String s)
    {
        if (as == null || as.length < 1)
        {
            return "";
        }
        String s1 = s;
        if (s == null)
        {
            s1 = ",";
        }
        boolean flag = true;
        s = new StringBuilder();
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s2 = as[i];
            if (s2 != null)
            {
                if (flag)
                {
                    flag = false;
                } else
                {
                    s.append(s1);
                }
                s.append(s2);
            }
            i++;
        }
        return s.toString();
    }

    public static String modifyByEsnRules(String s)
    {
        if (s == null || "".equals(s.trim()))
        {
            return "";
        }
        s = s.toUpperCase(Locale.ENGLISH);
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '-' || c == '=')
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append('=');
            }
            i++;
        }
        return stringbuilder.toString();
    }

    public static String notEmpty(String s, String s1)
    {
        if (isEmpty(s))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public static String notNull(String s, String s1)
        throws IllegalArgumentException
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" can not be null!").toString());
        } else
        {
            return s1;
        }
    }

    public static String replaceWhiteSpace(String s, String s1)
    {
        return replaceWhiteSpace(s, s1, true);
    }

    public static String replaceWhiteSpace(String s, String s1, boolean flag)
    {
        if (s == null)
        {
            return "";
        }
        if (flag)
        {
            return s.trim().replaceAll("\\s", s1);
        } else
        {
            return s.replaceAll("\\s", s1);
        }
    }

    public static boolean safeEquals(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equals(s1);
        }
    }

    public static Integer safeParsePercentage(String s)
    {
        if (isEmpty(s))
        {
            return null;
        }
        s = PERCENTAGE_PATTERN.matcher(s);
        if (!s.find())
        {
            return null;
        }
        try
        {
            s = Integer.valueOf(s.group().replaceAll("%", ""));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("StringUtils", "Failed to parse percentage ", s);
            return null;
        }
        return s;
    }

    public static Integer safeParsePercentage(String s, int i, int j, boolean flag)
    {
        s = safeParsePercentage(s);
        if (s != null)
        {
            if (s.intValue() < i)
            {
                if (flag)
                {
                    return null;
                } else
                {
                    return Integer.valueOf(i);
                }
            }
            if (s.intValue() > j)
            {
                if (flag)
                {
                    return null;
                } else
                {
                    return Integer.valueOf(j);
                }
            }
        }
        return s;
    }

    public static Integer safeParsePixelSize(String s)
    {
        if (isEmpty(s))
        {
            return null;
        }
        s = PIXEL_PATTERN.matcher(s.toLowerCase(Locale.US));
        if (!s.find())
        {
            return null;
        }
        try
        {
            s = Integer.valueOf(s.group().replaceAll("px", ""));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("StringUtils", "Failed to parse pixel size ", s);
            return null;
        }
        return s;
    }

    public static Integer safeParsePixelSize(String s, int i, int j, boolean flag)
    {
        s = safeParsePixelSize(s);
        if (s != null)
        {
            if (s.intValue() < i)
            {
                if (flag)
                {
                    return null;
                } else
                {
                    return Integer.valueOf(i);
                }
            }
            if (s.intValue() > j)
            {
                if (flag)
                {
                    return null;
                } else
                {
                    return Integer.valueOf(j);
                }
            }
        }
        return s;
    }

    public static String[] safeSplit(String s, String s1)
    {
        if (isEmpty(s))
        {
            return new String[0];
        } else
        {
            return s.split(s1);
        }
    }

    public static boolean startsWithDigit(String s)
    {
        if (isEmpty(s))
        {
            return false;
        } else
        {
            return STARTS_WITH_DIGIT_PATTERN.matcher(s).find();
        }
    }

    public static String toHex(byte abyte0[])
    {
        char ac[] = new char[abyte0.length * 2];
        for (int i = 0; i < 20; i++)
        {
            int j = abyte0[i] & 0xff;
            ac[i * 2] = HEX_CHAR[j >> 4];
            ac[i * 2 + 1] = HEX_CHAR[j & 0xf];
        }

        return new String(ac);
    }

    public static String toUnicode(char c)
    {
        return String.format("\\u%04x", new Object[] {
            Integer.valueOf(c)
        });
    }

    public static String trimWhiteSpace(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return s.trim().replaceAll("\\s+", " ");
        }
    }

}
