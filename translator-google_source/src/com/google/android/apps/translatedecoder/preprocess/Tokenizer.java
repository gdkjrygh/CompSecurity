// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.preprocess;

import com.google.android.apps.translatedecoder.decoder.g;
import com.google.android.apps.translatedecoder.util.DecoderRuntimeException;
import com.google.android.apps.translatedecoder.util.StringMap;
import com.google.android.apps.translatedecoder.util.StringSet;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.translatedecoder.preprocess:
//            a, b, CharNormalizer

public class Tokenizer
    implements Serializable
{

    public static final Pattern CJ_PUNCTUATION_REGEX = Pattern.compile("^(\\p{Punct}|\uFF0C|\u3001|\u3002)$");
    public static final Pattern NUMBER_REGEX = Pattern.compile("-*[\\d]+\\.[\\d]+");
    public static final Pattern PUNCTUATION_REGEX = Pattern.compile("^\\p{Punct}$");
    public static final Pattern SPACE_REGEX = Pattern.compile("^\\p{Space}$");
    private static a a = null;
    private static final Map b;
    private static final Logger c = Logger.getLogger("translate");
    private static final List d;
    private static final long serialVersionUID = 0xd0483a13058fbbbdL;
    private final CharNormalizer charNormalizer;
    private final boolean handleSpecialPuncts = true;
    private final StringSet preprocAbbrData;
    private final StringMap preprocMapData;

    public Tokenizer(StringSet stringset, StringMap stringmap, CharNormalizer charnormalizer)
    {
        preprocAbbrData = stringset;
        preprocMapData = stringmap;
        charNormalizer = charnormalizer;
    }

    public static String deTokenize(String s, String s1)
    {
        if (isCJKT(s))
        {
            return deTokenizeCjkt(s, s1);
        }
        s = new StringBuilder();
        int i = 0;
        boolean flag = false;
        while (i < s1.length()) 
        {
            int j = s1.codePointAt(i);
            String s2 = new String(Character.toChars(j));
            if (flag && !PUNCTUATION_REGEX.matcher(s2).find())
            {
                s.append(" ");
            }
            if (SPACE_REGEX.matcher(s2).find())
            {
                flag = true;
            } else
            {
                s.append(s2);
                flag = false;
            }
            i += Character.charCount(j);
        }
        return s.toString();
    }

    public static String deTokenizeCjkt(String s, String s1)
    {
        if (s1 == null)
        {
            s = "";
        } else
        if (g.b(s) && a != null)
        {
            s = s1;
            if (a.c != null)
            {
                s = new StringBuilder();
                int i = 0;
                boolean flag7 = false;
                int j = 0;
                boolean flag1 = false;
                while (i < s1.length()) 
                {
                    int k = s1.codePointAt(i);
                    String s3 = new String(Character.toChars(k));
                    if (com.google.android.apps.translatedecoder.preprocess.a.b(s3))
                    {
                        StringBuilder stringbuilder = new StringBuilder();
                        stringbuilder.append(s3);
                        i += Character.charCount(k);
                        do
                        {
                            if (i >= s1.length())
                            {
                                break;
                            }
                            j = s1.codePointAt(i);
                            s3 = new String(Character.toChars(j));
                            if (!com.google.android.apps.translatedecoder.preprocess.a.b(s3))
                            {
                                break;
                            }
                            stringbuilder.append(s3);
                            i += Character.charCount(j);
                        } while (true);
                        if (flag7 || !flag1 && s.length() > 0)
                        {
                            s.append(" ");
                        }
                        if (flag1 && !a.c.contains(stringbuilder.toString()))
                        {
                            s.append(" ");
                        }
                        s.append(stringbuilder);
                        flag7 = false;
                        j = 0;
                        flag1 = true;
                    } else
                    {
                        if (a.b.matcher(s3).find())
                        {
                            j = 1;
                        } else
                        {
                            boolean flag8 = a.a.matcher(s3).find();
                            if (flag1 && !flag8)
                            {
                                s.append(" ");
                            }
                            if (!flag1 && !flag8 && (j != 0 || flag7))
                            {
                                s.append(" ");
                            }
                            s.append(s3);
                            flag7 = flag8;
                            j = 0;
                            flag1 = false;
                        }
                        i += Character.charCount(k);
                    }
                }
                return s.toString();
            }
        } else
        {
            if (s1.split("\\s+").length == 0)
            {
                return "";
            }
            StringBuilder stringbuilder1 = new StringBuilder();
            int l = 0;
            boolean flag = true;
            boolean flag2 = true;
            boolean flag4 = false;
            boolean flag3 = false;
            do
            {
                if (l < s1.length())
                {
                    int i1 = s1.codePointAt(l);
                    String s2 = new String(Character.toChars(i1));
                    if (SPACE_REGEX.matcher(s2).find())
                    {
                        String s4;
                        boolean flag5;
                        boolean flag6;
                        if (!flag3)
                        {
                            flag3 = flag;
                        } else
                        {
                            flag3 = flag2;
                        }
                        if (flag4)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        flag5 = flag3;
                        flag4 = true;
                        flag3 = false;
                        flag6 = flag2;
                        flag2 = flag5;
                        flag5 = flag6;
                    } else
                    if (CJ_PUNCTUATION_REGEX.matcher(s2).find())
                    {
                        flag3 = true;
                        flag4 = false;
                        flag5 = true;
                    } else
                    {
                        if (!com.google.android.apps.translatedecoder.preprocess.b.a(s2, d).isEmpty())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag3 && !flag2 && !flag)
                        {
                            stringbuilder1.append(" ");
                        }
                        flag2 = flag;
                        flag3 = flag;
                        flag6 = false;
                        flag4 = false;
                        flag5 = true;
                        flag = flag2;
                        flag2 = flag3;
                        flag3 = flag6;
                    }
                } else
                {
                    return stringbuilder1.toString();
                }
                if (flag5)
                {
                    if (s.startsWith("ja") || s.startsWith("zh"))
                    {
                        s4 = (String)b.get(s2);
                        if (s4 != null)
                        {
                            s2 = s4;
                        }
                    }
                    stringbuilder1.append(s2);
                }
                l = Character.charCount(i1) + l;
                flag5 = flag4;
                flag4 = flag3;
                flag3 = flag5;
            } while (true);
        }
        return s;
    }

    public static String getAbbrSignature(String s, String s1)
    {
        s = String.valueOf(s);
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public static String getMapSignature(String s, String s1)
    {
        s = String.valueOf(s);
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public static boolean isCJKT(String s)
    {
        return s.equalsIgnoreCase("chinese") || s.toLowerCase(Locale.ENGLISH).startsWith("zh") || s.equalsIgnoreCase("japanese") || s.equalsIgnoreCase("ja") || s.equalsIgnoreCase("korean") || s.equalsIgnoreCase("ko") || s.equalsIgnoreCase("thai") || s.equalsIgnoreCase("th");
    }

    public static boolean isCjkt(String s)
    {
        return s.equalsIgnoreCase("chinese") || s.toLowerCase(Locale.ENGLISH).startsWith("zh") || s.equalsIgnoreCase("japanese") || s.equalsIgnoreCase("ja") || s.equalsIgnoreCase("thai") || s.equalsIgnoreCase("th");
    }

    public static Tokenizer readFromByteBuffer(ByteBuffer bytebuffer)
    {
        return new Tokenizer(StringSet.readFromByteBuffer(bytebuffer), StringMap.readFromByteBuffer(bytebuffer), CharNormalizer.readFromByteBuffer(bytebuffer));
    }

    public static Tokenizer readFromFile(String s, String s1)
    {
        if (s == null || s.isEmpty())
        {
            throw new DecoderRuntimeException("TknRffNullFile");
        }
        FileChannel filechannel;
        Object obj;
        filechannel = (new RandomAccessFile(s, "r")).getChannel();
        obj = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, (int)filechannel.size());
        if (((ByteBuffer) (obj)).getInt() != 0x49950a81)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj = readFromByteBuffer(((ByteBuffer) (obj)));
        ((Tokenizer) (obj)).initKoreanPostProcessing(s1);
        filechannel.close();
        return ((Tokenizer) (obj));
        Tokenizer tokenizer;
        obj = new ObjectInputStream(new FileInputStream(s));
        tokenizer = (Tokenizer)((ObjectInputStream) (obj)).readObject();
        tokenizer.initKoreanPostProcessing(s1);
        ((ObjectInputStream) (obj)).close();
        filechannel.close();
        return tokenizer;
        Exception exception;
        exception;
        s = s1;
        s1 = exception;
_L2:
        throw new DecoderRuntimeException("TknRffFailed", s1, s);
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean getWordMap(String s, String s1, List list)
    {
        s = preprocMapData.get(getMapSignature(s, s1));
        if (s != null)
        {
            list.clear();
            list.addAll(Arrays.asList(s.split("\\s+")));
            return true;
        } else
        {
            return false;
        }
    }

    public void initKoreanPostProcessing(String s)
    {
        if (s != null && a == null)
        {
            a = new a();
            com.google.android.apps.translatedecoder.preprocess.a.a(s);
        }
    }

    public boolean isAbbrev(String s, String s1)
    {
        return preprocAbbrData.contains(getAbbrSignature(s, s1));
    }

    public boolean isNumber(String s)
    {
        return NUMBER_REGEX.matcher(s).matches();
    }

    public boolean isSpecialPunct(String s)
    {
        return s.matches("&apos;") || s.matches("&quot;");
    }

    public String replaceSpecialPuncts(String s)
    {
        return s.replace("&apos;", " &apos; ").replace("&quot;", " &quot; ");
    }

    public List tokenize(String s, String s1)
    {
        if (isCJKT(s))
        {
            return tokenizeForCJK(s, s1);
        }
        String as[] = charNormalizer.normalizeChars(s1).split("\\s+");
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        int l = as.length;
        int i = 0;
        while (i < l) 
        {
            String s3 = as[i];
            if (isAbbrev(s, s3) || isNumber(s3) || isSpecialPunct(s3))
            {
                arraylist.add(s3);
            } else
            if (getWordMap(s, s3, arraylist1))
            {
                arraylist.addAll(arraylist1);
            } else
            {
                s1 = null;
                int j = 0;
                while (j < s3.length()) 
                {
                    int i1 = s3.codePointAt(j);
                    String s4 = new String(Character.toChars(i1));
                    if (PUNCTUATION_REGEX.matcher(s4).find())
                    {
                        if (s4.compareTo("'") == 0)
                        {
                            char c1;
                            int k;
                            if (s1 != null)
                            {
                                c1 = s1.charAt(s1.length() - 1);
                            } else
                            {
                                c1 = '\0';
                            }
                            if (Character.charCount(i1) + j < s3.length())
                            {
                                k = s3.codePointAt(Character.charCount(i1) + j);
                            } else
                            {
                                k = 0;
                            }
                            if (c1 == 'l' || c1 == 'L' || c1 == 'd' || c1 == 'D')
                            {
                                s1.append(s4);
                                arraylist.add(s1.toString());
                                s1 = null;
                            } else
                            {
                                String s2 = s1;
                                if (k == 115)
                                {
                                    s2 = s1;
                                    if (s1 != null)
                                    {
                                        arraylist.add(s1.toString());
                                        s2 = null;
                                    }
                                }
                                s1 = s2;
                                if (s2 == null)
                                {
                                    s1 = new StringBuilder();
                                }
                                s1.append(s4);
                            }
                        } else
                        {
                            if (s1 != null)
                            {
                                arraylist.add(s1.toString());
                            }
                            arraylist.add(s4);
                            s1 = null;
                        }
                    } else
                    {
                        Object obj = s1;
                        if (s1 == null)
                        {
                            obj = new StringBuilder();
                        }
                        ((StringBuilder) (obj)).append(s4);
                        s1 = ((String) (obj));
                    }
                    j += Character.charCount(i1);
                }
                if (s1 != null)
                {
                    arraylist.add(s1.toString());
                }
            }
            i++;
        }
        return arraylist;
    }

    public List tokenizeForCJK(String s, String s1)
    {
        String as[] = charNormalizer.normalizeChars(s1).split("\\s+");
        ArrayList arraylist;
        int i;
        boolean flag;
        boolean flag1;
        if (s.equalsIgnoreCase("THAI") || s.toLowerCase().startsWith("th"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        arraylist = new ArrayList();
        flag1 = false;
        flag = i;
        for (i = ((flag1) ? 1 : 0); i < as.length; i++)
        {
            String s2 = as[i];
            int j = 0;
            s = null;
            do
            {
                if (j >= s2.length())
                {
                    break;
                }
                int k = s2.codePointAt(j);
                String s3 = String.valueOf(Character.toChars(k));
                if (k > 127)
                {
                    if (s != null)
                    {
                        arraylist.add(s.toString());
                    }
                    arraylist.add(s3);
                    s1 = null;
                } else
                {
                    s1 = s;
                    if (s == null)
                    {
                        s1 = new StringBuilder();
                    }
                    s1.append(s3);
                }
                k = j + Character.charCount(k);
                s = s1;
                j = k;
                if (!flag)
                {
                    continue;
                }
                s = s1;
                j = k;
                if (i != as.length - 1)
                {
                    continue;
                }
                s = s1;
                j = k;
                if (k < s2.length())
                {
                    continue;
                }
                s = s1;
                j = k;
                if (s3.length() != 1)
                {
                    continue;
                }
                if (!s3.equals(".") && !s3.equals("!") && !s3.equals("?"))
                {
                    s = s1;
                    j = k;
                    if (!s3.equals(";"))
                    {
                        continue;
                    }
                }
                flag = false;
                s = s1;
                j = k;
            } while (true);
            if (s != null)
            {
                arraylist.add(s.toString());
            }
        }

        if (flag)
        {
            arraylist.add(".");
        }
        return arraylist;
    }

    public String tokenizeWithJoin(String s, String s1)
    {
        s = tokenize(s, replaceSpecialPuncts(s1));
        s1 = new StringBuilder();
        for (int i = 0; i < s.size(); i++)
        {
            s1.append((String)s.get(i));
            if (i < s.size() - 1)
            {
                s1.append(" ");
            }
        }

        return s1.toString();
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        preprocAbbrData.writeToByteBuffer(bytebuffer);
        preprocMapData.writeToByteBuffer(bytebuffer);
        charNormalizer.writeToByteBuffer(bytebuffer);
    }

    public void writeToFile(String s)
    {
        writeToFile(s, false);
    }

    public void writeToFile(String s, boolean flag)
    {
        if (flag)
        {
            try
            {
                s = new RandomAccessFile(s, "rw");
                FileChannel filechannel = s.getChannel();
                java.nio.MappedByteBuffer mappedbytebuffer = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, 0x5f5e100L);
                mappedbytebuffer.putInt(0x49950a81);
                writeToByteBuffer(mappedbytebuffer);
                filechannel.truncate(mappedbytebuffer.position());
                s.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }
        s = new ObjectOutputStream(new FileOutputStream(s));
        s.writeObject(this);
        s.close();
        return;
    }

    static 
    {
        Object obj = new HashMap();
        b = ((Map) (obj));
        ((Map) (obj)).put("!", "\uFF01");
        b.put("?", "\uFF1F");
        b.put(",", "\u3001");
        b.put(".", "\u3002");
        b.put(":", "\uFF1A");
        b.put("%", "\uFF05");
        b.put("#", "\uFF03");
        b.put("&", "\uFF06");
        b.put("(", "\uFF08");
        b.put(")", "\uFF09");
        b.put("~", "\u301C");
        obj = new ArrayList();
        d = ((List) (obj));
        ((List) (obj)).add("zh");
        d.add("ja");
        d.add("th");
        d.add("ko");
    }
}
