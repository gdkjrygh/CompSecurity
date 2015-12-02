// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.a;

import android.text.TextUtils;
import com.facebook.debug.log.b;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.facebook.user.a:
//            f

public class e
{

    private static final Class a = com/facebook/user/a/e;
    private static final char b[] = {
        '\u5416', '\u54CE', '\u5B89', '\u80AE', '\u51F9', '\u516B', '\u63B0', '\u6273', '\u90A6', '\u52F9', 
        '\u9642', '\u5954', '\u4F3B', '\u7680', '\u782D', '\u706C', '\u618B', '\u6C43', '\u51AB', '\u7676', 
        '\u5CEC', '\u5693', '\u5072', '\u53C2', '\u4ED3', '\u64A1', '\u518A', '\u5D7E', '\u564C', '\u6260', 
        '\u62C6', '\u8FBF', '\u4F25', '\u6284', '\u8F66', '\u62BB', '\u9637', '\u5403', '\u5145', '\u62BD', 
        '\u51FA', '\u640B', '\u5DDB', '\u5205', '\u5439', '\u65FE', '\u8E14', '\u5472', '\u4ECE', '\u51D1', 
        '\u7C97', '\u6C46', '\u5D14', '\u90A8', '\u6413', '\u5491', '\u5446', '\u4E39', '\u5F53', '\u5200', 
        '\u6074', '\u6265', '\u706F', '\u4EFE', '\u55F2', '\u6541', '\u5201', '\u7239', '\u4E01', '\u4E1F', 
        '\u4E1C', '\u543A', '\u5262', '\u8011', '\u5796', '\u5428', '\u591A', '\u59B8', '\u5940', '\u97A5', 
        '\u800C', '\u53D1', '\u5E06', '\u531A', '\u98DE', '\u5206', '\u4E30', '\u8985', '\u4ECF', '\u57BA', 
        '\u7D11', '\u592B', '\u7324', '\u65EE', '\u4F85', '\u5E72', '\u5188', '\u768B', '\u6208', '\u7ED9', 
        '\u6839', '\u63EF', '\u55BC', '\u55F0', '\u5DE5', '\u52FE', '\u4F30', '\u9E39', '\u4E56', '\u5173', 
        '\u5149', '\u5F52', '\u4E28', '\u8B34', '\u5459', '\u598E', '\u548D', '\u4F44', '\u592F', '\u8320', 
        '\u8BC3', '\u9ED2', '\u62EB', '\u4EA8', '\u53FF', '\u9F41', '\u4E4E', '\u82B1', '\u6000', '\u6B22', 
        '\u5DDF', '\u7070', '\u660F', '\u5419', '\u4E0C', '\u52A0', '\u620B', '\u6C5F', '\u827D', '\u9636', 
        '\u5DFE', '\u5755', '\u5182', '\u4E29', '\u51E5', '\u59E2', '\u5658', '\u519B', '\u5494', '\u5F00', 
        '\u938E', '\u5FFC', '\u5C3B', '\u533C', '\u808E', '\u52A5', '\u7A7A', '\u62A0', '\u625D', '\u5938', 
        '\u84AF', '\u5BBD', '\u5321', '\u4E8F', '\u5764', '\u6269', '\u62C9', '\u4F86', '\u5170', '\u5577', 
        '\u635E', '\u4EC2', '\u96F7', '\u8137', '\u68F1', '\u695E', '\u550E', '\u4FE9', '\u5AFE', '\u826F', 
        '\u8E7D', '\u57D3', '\u53B8', '\u62CE', '\u6E9C', '\u9F99', '\u5A04', '\u565C', '\u5B6A', '\u62A1', 
        '\u9831', '\u5988', '\u57CB', '\u989F', '\u7264', '\u732B', '\u5445', '\u95E8', '\u6C13', '\u54AA', 
        '\u5B80', '\u55B5', '\u4E5C', '\u6C11', '\u540D', '\u8C2C', '\u6478', '\u725F', '\u6BCD', '\u62CF', 
        '\u8149', '\u56E1', '\u56D4', '\u5B6C', '\u8BB7', '\u5A1E', '\u5AE9', '\u80FD', '\u92B0', '\u62C8', 
        '\u5A18', '\u9E1F', '\u634F', '\u56DC', '\u5B81', '\u599E', '\u519C', '\u7FBA', '\u5974', '\u597B', 
        '\u9EC1', '\u90CD', '\u5662', '\u8BB4', '\u5991', '\u62CD', '\u7705', '\u6C78', '\u629B', '\u5478', 
        '\u55B7', '\u5309', '\u4E76', '\u7247', '\u527D', '\u6C15', '\u59D8', '\u4E52', '\u948B', '\u5256', 
        '\u4EC6', '\u4E03', '\u6390', '\u5343', '\u545B', '\u6084', '\u5207', '\u4EB2', '\u9751', '\u5B86', 
        '\u74D7', '\u533A', '\u5CD1', '\u7094', '\u590B', '\u5465', '\u7A63', '\u835B', '\u60F9', '\u4EBA', 
        '\u6254', '\u65E5', '\u620E', '\u53B9', '\u909A', '\u5827', '\u6875', '\u95F0', '\u633C', '\u4EE8', 
        '\u6BE2', '\u4E09', '\u6852', '\u63BB', '\u8272', '\u68EE', '\u50E7', '\u6740', '\u7B5B', '\u5C71', 
        '\u4F24', '\u5F30', '\u5962', '\u7533', '\u5347', '\u5C38', '\u53CE', '\u4E66', '\u5237', '\u8870', 
        '\u95E9', '\u53CC', '\u8C01', '\u542E', '\u8BF4', '\u53B6', '\u5FEA', '\u51C1', '\u82CF', '\u72FB', 
        '\u590A', '\u5B59', '\u5506', '\u4ED6', '\u5B61', '\u574D', '\u6C64', '\u5932', '\u5FD1', '\u81AF', 
        '\u5254', '\u5929', '\u65EB', '\u6017', '\u5385', '\u70B5', '\u5077', '\u51F8', '\u6E4D', '\u63A8', 
        '\u541E', '\u8BAC', '\u52B8', '\u6B6A', '\u5F2F', '\u5C23', '\u5371', '\u6637', '\u7FC1', '\u631D', 
        '\u4E4C', '\u5915', '\u5477', '\u4ED9', '\u4E61', '\u7071', '\u4E9B', '\u5FC3', '\u5174', '\u51F6', 
        '\u4F11', '\u620C', '\u5405', '\u75B6', '\u7025', '\u4E2B', '\u54BD', '\u592E', '\u5E7A', '\u503B', 
        '\u4E00', '\u4E5A', '\u5E94', '\u5537', '\u4F63', '\u4F18', '\u7EA1', '\u56E6', '\u66F0', '\u8480', 
        '\u5E00', '\u707D', '\u5142', '\u7242', '\u50AE', '\u556B', '\u9C61', '\u600E', '\u66FD', '\u5412', 
        '\u635A', '\u6CBE', '\u5F20', '\u4F4B', '\u8707', '\u8D1E', '\u9EEE', '\u4E4B', '\u4E2D', '\u5DDE', 
        '\u6731', '\u6293', '\u62FD', '\u4E13', '\u5986', '\u96B9', '\u5B92', '\u5353', '\u4ED4', '\u5B97', 
        '\u90B9', '\u79DF', '\u5297', '\u55FA', '\u5C0A', '\u6628'
    };
    private static final byte c[][];
    private static final Collator d;
    private static e e;
    private final boolean f;

    protected e(boolean flag)
    {
        f = flag;
    }

    public static e a()
    {
        int i = 0;
        com/facebook/user/a/e;
        JVM INSTR monitorenter ;
        e e1;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        e1 = e;
        com/facebook/user/a/e;
        JVM INSTR monitorexit ;
        return e1;
        Locale alocale[] = Collator.getAvailableLocales();
_L1:
        if (i >= alocale.length)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (!alocale[i].equals(Locale.CHINA))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        e = new e(true);
        alocale = e;
        com/facebook/user/a/e;
        JVM INSTR monitorexit ;
        return alocale;
        Exception exception;
        exception;
        com/facebook/user/a/e;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
          goto _L1
        com.facebook.debug.log.b.d(a, "There is no Chinese collator, HanziToPinyin is disabled");
        e = new e(false);
        exception = e;
        com/facebook/user/a/e;
        JVM INSTR monitorexit ;
        return exception;
    }

    private f a(char c1)
    {
        f f1;
        Object obj;
        int i;
        int j;
        boolean flag;
        flag = false;
        f1 = new f();
        obj = Character.toString(c1);
        f1.b = ((String) (obj));
        i = -1;
        if (c1 < '\u0100')
        {
            f1.a = 1;
            f1.c = ((String) (obj));
            return f1;
        }
        if (c1 < '\u3400')
        {
            f1.a = 3;
            f1.c = ((String) (obj));
            return f1;
        }
        j = d.compare(((String) (obj)), "\u5416");
        if (j < 0)
        {
            f1.a = 3;
            f1.c = ((String) (obj));
            return f1;
        }
        if (j != 0) goto _L2; else goto _L1
_L1:
        f1.a = 2;
        i = 0;
_L10:
        f1.a = 2;
        if (i >= 0) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        l = b.length;
        k = 0;
        l--;
_L8:
        if (k > l) goto _L4; else goto _L5
_L5:
        i = (k + l) / 2;
        String s = Character.toString(b[i]);
        j = d.compare(((String) (obj)), s);
        if (j != 0) goto _L6; else goto _L4
_L4:
        k = i;
        if (j < 0)
        {
            k = i - 1;
        }
        obj = new StringBuilder();
        for (i = ((flag) ? 1 : 0); i < c[k].length && c[k][i] != 0; i++)
        {
            ((StringBuilder) (obj)).append((char)c[k][i]);
        }

        break; /* Loop/switch isn't completed */
_L2:
        k = d.compare(((String) (obj)), "\u5497");
        if (k > 0)
        {
            f1.a = 3;
            f1.c = ((String) (obj));
            return f1;
        }
        j = k;
        if (k == 0)
        {
            f1.a = 2;
            i = b.length - 1;
            j = k;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (j > 0)
        {
            k = i + 1;
        } else
        {
            l = i - 1;
        }
        if (true) goto _L8; else goto _L7
_L7:
        f1.c = ((StringBuilder) (obj)).toString();
        return f1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void a(StringBuilder stringbuilder, ArrayList arraylist, int i)
    {
        String s = stringbuilder.toString();
        arraylist.add(new f(i, s, s));
        stringbuilder.setLength(0);
    }

    public ArrayList a(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (!f || TextUtils.isEmpty(s))
        {
            return arraylist;
        }
        int l = s.length();
        StringBuilder stringbuilder = new StringBuilder();
        int j = 0;
        int k = 1;
        while (j < l) 
        {
            char c1 = s.charAt(j);
            int i;
            if (c1 == ' ')
            {
                i = k;
                if (stringbuilder.length() > 0)
                {
                    a(stringbuilder, arraylist, k);
                    i = k;
                }
            } else
            if (c1 < '\u0100')
            {
                if (k != 1 && stringbuilder.length() > 0)
                {
                    a(stringbuilder, arraylist, k);
                }
                stringbuilder.append(c1);
                i = 1;
            } else
            if (c1 < '\u3400')
            {
                if (k != 3 && stringbuilder.length() > 0)
                {
                    a(stringbuilder, arraylist, k);
                }
                stringbuilder.append(c1);
                i = 3;
            } else
            {
                f f1 = a(c1);
                if (f1.a == 2)
                {
                    if (stringbuilder.length() > 0)
                    {
                        a(stringbuilder, arraylist, k);
                    }
                    arraylist.add(f1);
                    i = 2;
                } else
                {
                    if (k != f1.a && stringbuilder.length() > 0)
                    {
                        a(stringbuilder, arraylist, k);
                    }
                    i = f1.a;
                    stringbuilder.append(c1);
                }
            }
            j++;
            k = i;
        }
        if (stringbuilder.length() > 0)
        {
            a(stringbuilder, arraylist, k);
        }
        return arraylist;
    }

    static 
    {
        byte abyte0[] = {
            65, 0, 0, 0, 0, 0
        };
        byte abyte1[] = {
            65, 73, 0, 0, 0, 0
        };
        byte abyte2[] = {
            66, 65, 0, 0, 0, 0
        };
        byte abyte3[] = {
            66, 65, 78, 71, 0, 0
        };
        byte abyte4[] = {
            66, 65, 79, 0, 0, 0
        };
        byte abyte5[] = {
            66, 69, 73, 0, 0, 0
        };
        byte abyte6[] = {
            66, 69, 78, 71, 0, 0
        };
        byte abyte7[] = {
            66, 73, 65, 78, 0, 0
        };
        byte abyte8[] = {
            66, 73, 65, 79, 0, 0
        };
        byte abyte9[] = {
            66, 73, 78, 71, 0, 0
        };
        byte abyte10[] = {
            67, 65, 0, 0, 0, 0
        };
        byte abyte11[] = {
            67, 65, 78, 0, 0, 0
        };
        byte abyte12[] = {
            67, 65, 79, 0, 0, 0
        };
        byte abyte13[] = {
            67, 69, 0, 0, 0, 0
        };
        byte abyte14[] = {
            67, 69, 78, 0, 0, 0
        };
        byte abyte15[] = {
            67, 69, 78, 71, 0, 0
        };
        byte abyte16[] = {
            67, 72, 65, 0, 0, 0
        };
        byte abyte17[] = {
            67, 72, 65, 73, 0, 0
        };
        byte abyte18[] = {
            67, 72, 65, 78, 0, 0
        };
        byte abyte19[] = {
            67, 72, 65, 79, 0, 0
        };
        byte abyte20[] = {
            67, 72, 69, 78, 0, 0
        };
        byte abyte21[] = {
            67, 72, 79, 78, 71, 0
        };
        byte abyte22[] = {
            67, 72, 85, 0, 0, 0
        };
        byte abyte23[] = {
            67, 72, 85, 65, 73, 0
        };
        byte abyte24[] = {
            67, 72, 85, 79, 0, 0
        };
        byte abyte25[] = {
            67, 79, 78, 71, 0, 0
        };
        byte abyte26[] = {
            67, 79, 85, 0, 0, 0
        };
        byte abyte27[] = {
            67, 85, 0, 0, 0, 0
        };
        byte abyte28[] = {
            67, 85, 78, 0, 0, 0
        };
        byte abyte29[] = {
            67, 85, 79, 0, 0, 0
        };
        byte abyte30[] = {
            68, 65, 0, 0, 0, 0
        };
        byte abyte31[] = {
            68, 65, 73, 0, 0, 0
        };
        byte abyte32[] = {
            68, 65, 78, 0, 0, 0
        };
        byte abyte33[] = {
            68, 65, 78, 71, 0, 0
        };
        byte abyte34[] = {
            68, 65, 79, 0, 0, 0
        };
        byte abyte35[] = {
            68, 69, 78, 0, 0, 0
        };
        byte abyte36[] = {
            68, 69, 78, 71, 0, 0
        };
        byte abyte37[] = {
            68, 73, 65, 78, 0, 0
        };
        byte abyte38[] = {
            68, 73, 65, 79, 0, 0
        };
        byte abyte39[] = {
            68, 73, 78, 71, 0, 0
        };
        byte abyte40[] = {
            68, 73, 85, 0, 0, 0
        };
        byte abyte41[] = {
            68, 85, 73, 0, 0, 0
        };
        byte abyte42[] = {
            68, 85, 79, 0, 0, 0
        };
        byte abyte43[] = {
            69, 0, 0, 0, 0, 0
        };
        byte abyte44[] = {
            69, 82, 0, 0, 0, 0
        };
        byte abyte45[] = {
            70, 65, 0, 0, 0, 0
        };
        byte abyte46[] = {
            70, 65, 78, 0, 0, 0
        };
        byte abyte47[] = {
            70, 69, 78, 0, 0, 0
        };
        byte abyte48[] = {
            70, 85, 0, 0, 0, 0
        };
        byte abyte49[] = {
            70, 79, 85, 0, 0, 0
        };
        byte abyte50[] = {
            71, 85, 73, 0, 0, 0
        };
        byte abyte51[] = {
            71, 65, 73, 0, 0, 0
        };
        byte abyte52[] = {
            71, 65, 78, 0, 0, 0
        };
        byte abyte53[] = {
            71, 65, 78, 71, 0, 0
        };
        byte abyte54[] = {
            71, 69, 0, 0, 0, 0
        };
        byte abyte55[] = {
            71, 69, 73, 0, 0, 0
        };
        byte abyte56[] = {
            71, 69, 78, 0, 0, 0
        };
        byte abyte57[] = {
            71, 69, 78, 71, 0, 0
        };
        byte abyte58[] = {
            74, 73, 69, 0, 0, 0
        };
        byte abyte59[] = {
            71, 79, 85, 0, 0, 0
        };
        byte abyte60[] = {
            71, 85, 0, 0, 0, 0
        };
        byte abyte61[] = {
            71, 85, 65, 0, 0, 0
        };
        byte abyte62[] = {
            71, 85, 65, 78, 71, 0
        };
        byte abyte63[] = {
            71, 85, 65, 78, 0, 0
        };
        byte abyte64[] = {
            71, 85, 79, 0, 0, 0
        };
        byte abyte65[] = {
            72, 65, 73, 0, 0, 0
        };
        byte abyte66[] = {
            72, 65, 78, 71, 0, 0
        };
        byte abyte67[] = {
            72, 65, 79, 0, 0, 0
        };
        byte abyte68[] = {
            72, 69, 73, 0, 0, 0
        };
        byte abyte69[] = {
            72, 69, 78, 0, 0, 0
        };
        byte abyte70[] = {
            72, 69, 78, 71, 0, 0
        };
        byte abyte71[] = {
            72, 79, 78, 71, 0, 0
        };
        byte abyte72[] = {
            72, 79, 85, 0, 0, 0
        };
        byte abyte73[] = {
            72, 85, 0, 0, 0, 0
        };
        byte abyte74[] = {
            72, 85, 65, 73, 0, 0
        };
        byte abyte75[] = {
            72, 85, 65, 78, 0, 0
        };
        byte abyte76[] = {
            72, 85, 78, 0, 0, 0
        };
        byte abyte77[] = {
            72, 85, 79, 0, 0, 0
        };
        byte abyte78[] = {
            74, 73, 65, 0, 0, 0
        };
        byte abyte79[] = {
            74, 73, 65, 78, 71, 0
        };
        byte abyte80[] = {
            74, 73, 65, 79, 0, 0
        };
        byte abyte81[] = {
            74, 73, 85, 0, 0, 0
        };
        byte abyte82[] = {
            74, 85, 0, 0, 0, 0
        };
        byte abyte83[] = {
            74, 85, 78, 0, 0, 0
        };
        byte abyte84[] = {
            75, 65, 78, 71, 0, 0
        };
        byte abyte85[] = {
            75, 65, 79, 0, 0, 0
        };
        byte abyte86[] = {
            75, 85, 65, 0, 0, 0
        };
        byte abyte87[] = {
            75, 85, 65, 73, 0, 0
        };
        byte abyte88[] = {
            75, 85, 65, 78, 0, 0
        };
        byte abyte89[] = {
            75, 85, 65, 78, 71, 0
        };
        byte abyte90[] = {
            75, 85, 78, 0, 0, 0
        };
        byte abyte91[] = {
            75, 85, 79, 0, 0, 0
        };
        byte abyte92[] = {
            76, 65, 78, 0, 0, 0
        };
        byte abyte93[] = {
            76, 65, 78, 71, 0, 0
        };
        byte abyte94[] = {
            76, 65, 79, 0, 0, 0
        };
        byte abyte95[] = {
            76, 69, 0, 0, 0, 0
        };
        byte abyte96[] = {
            76, 73, 78, 71, 0, 0
        };
        byte abyte97[] = {
            76, 73, 65, 0, 0, 0
        };
        byte abyte98[] = {
            76, 73, 65, 79, 0, 0
        };
        byte abyte99[] = {
            76, 73, 69, 0, 0, 0
        };
        byte abyte100[] = {
            76, 73, 78, 71, 0, 0
        };
        byte abyte101[] = {
            76, 79, 78, 71, 0, 0
        };
        byte abyte102[] = {
            76, 79, 85, 0, 0, 0
        };
        byte abyte103[] = {
            76, 85, 65, 78, 0, 0
        };
        byte abyte104[] = {
            76, 85, 79, 0, 0, 0
        };
        byte abyte105[] = {
            77, 65, 0, 0, 0, 0
        };
        byte abyte106[] = {
            77, 65, 73, 0, 0, 0
        };
        byte abyte107[] = {
            77, 65, 78, 0, 0, 0
        };
        byte abyte108[] = {
            77, 65, 78, 71, 0, 0
        };
        byte abyte109[] = {
            77, 69, 78, 71, 0, 0
        };
        byte abyte110[] = {
            77, 73, 78, 0, 0, 0
        };
        byte abyte111[] = {
            77, 73, 85, 0, 0, 0
        };
        byte abyte112[] = {
            77, 79, 0, 0, 0, 0
        };
        byte abyte113[] = {
            77, 79, 85, 0, 0, 0
        };
        byte abyte114[] = {
            78, 65, 0, 0, 0, 0
        };
        byte abyte115[] = {
            78, 65, 73, 0, 0, 0
        };
        byte abyte116[] = {
            78, 65, 78, 0, 0, 0
        };
        byte abyte117[] = {
            78, 65, 78, 71, 0, 0
        };
        byte abyte118[] = {
            78, 65, 79, 0, 0, 0
        };
        byte abyte119[] = {
            78, 69, 78, 0, 0, 0
        };
        byte abyte120[] = {
            78, 73, 65, 78, 71, 0
        };
        byte abyte121[] = {
            78, 73, 65, 79, 0, 0
        };
        byte abyte122[] = {
            78, 73, 78, 0, 0, 0
        };
        byte abyte123[] = {
            78, 73, 78, 71, 0, 0
        };
        byte abyte124[] = {
            78, 85, 0, 0, 0, 0
        };
        byte abyte125[] = {
            78, 85, 79, 0, 0, 0
        };
        byte abyte126[] = {
            79, 85, 0, 0, 0, 0
        };
        byte abyte127[] = {
            80, 65, 73, 0, 0, 0
        };
        byte abyte128[] = {
            80, 65, 78, 0, 0, 0
        };
        byte abyte129[] = {
            80, 65, 79, 0, 0, 0
        };
        byte abyte130[] = {
            80, 69, 78, 0, 0, 0
        };
        byte abyte131[] = {
            80, 69, 78, 71, 0, 0
        };
        byte abyte132[] = {
            80, 73, 0, 0, 0, 0
        };
        byte abyte133[] = {
            80, 73, 65, 79, 0, 0
        };
        byte abyte134[] = {
            80, 79, 85, 0, 0, 0
        };
        byte abyte135[] = {
            80, 85, 0, 0, 0, 0
        };
        byte abyte136[] = {
            81, 73, 65, 0, 0, 0
        };
        byte abyte137[] = {
            81, 73, 65, 78, 0, 0
        };
        byte abyte138[] = {
            81, 73, 65, 78, 71, 0
        };
        byte abyte139[] = {
            81, 73, 65, 79, 0, 0
        };
        byte abyte140[] = {
            81, 73, 85, 0, 0, 0
        };
        byte abyte141[] = {
            81, 85, 0, 0, 0, 0
        };
        byte abyte142[] = {
            81, 85, 65, 78, 0, 0
        };
        byte abyte143[] = {
            81, 85, 69, 0, 0, 0
        };
        byte abyte144[] = {
            81, 85, 78, 0, 0, 0
        };
        byte abyte145[] = {
            82, 65, 78, 0, 0, 0
        };
        byte abyte146[] = {
            82, 69, 0, 0, 0, 0
        };
        byte abyte147[] = {
            82, 69, 78, 71, 0, 0
        };
        byte abyte148[] = {
            82, 73, 0, 0, 0, 0
        };
        byte abyte149[] = {
            82, 79, 78, 71, 0, 0
        };
        byte abyte150[] = {
            82, 79, 85, 0, 0, 0
        };
        byte abyte151[] = {
            82, 85, 0, 0, 0, 0
        };
        byte abyte152[] = {
            82, 85, 65, 78, 0, 0
        };
        byte abyte153[] = {
            82, 85, 78, 0, 0, 0
        };
        byte abyte154[] = {
            82, 85, 79, 0, 0, 0
        };
        byte abyte155[] = {
            83, 65, 0, 0, 0, 0
        };
        byte abyte156[] = {
            83, 65, 78, 0, 0, 0
        };
        byte abyte157[] = {
            83, 65, 79, 0, 0, 0
        };
        byte abyte158[] = {
            83, 69, 0, 0, 0, 0
        };
        byte abyte159[] = {
            83, 69, 78, 0, 0, 0
        };
        byte abyte160[] = {
            83, 72, 65, 0, 0, 0
        };
        byte abyte161[] = {
            83, 72, 65, 79, 0, 0
        };
        byte abyte162[] = {
            83, 72, 69, 78, 0, 0
        };
        byte abyte163[] = {
            83, 72, 69, 78, 71, 0
        };
        byte abyte164[] = {
            83, 72, 73, 0, 0, 0
        };
        byte abyte165[] = {
            83, 72, 85, 0, 0, 0
        };
        byte abyte166[] = {
            83, 72, 85, 65, 73, 0
        };
        byte abyte167[] = {
            83, 72, 85, 73, 0, 0
        };
        byte abyte168[] = {
            83, 73, 0, 0, 0, 0
        };
        byte abyte169[] = {
            83, 79, 78, 71, 0, 0
        };
        byte abyte170[] = {
            83, 79, 85, 0, 0, 0
        };
        byte abyte171[] = {
            83, 85, 65, 78, 0, 0
        };
        byte abyte172[] = {
            83, 85, 78, 0, 0, 0
        };
        byte abyte173[] = {
            84, 65, 0, 0, 0, 0
        };
        byte abyte174[] = {
            84, 69, 0, 0, 0, 0
        };
        byte abyte175[] = {
            84, 69, 78, 71, 0, 0
        };
        byte abyte176[] = {
            84, 73, 65, 78, 0, 0
        };
        byte abyte177[] = {
            84, 73, 78, 71, 0, 0
        };
        byte abyte178[] = {
            84, 79, 78, 71, 0, 0
        };
        byte abyte179[] = {
            84, 79, 85, 0, 0, 0
        };
        byte abyte180[] = {
            84, 85, 0, 0, 0, 0
        };
        byte abyte181[] = {
            84, 85, 78, 0, 0, 0
        };
        byte abyte182[] = {
            87, 65, 73, 0, 0, 0
        };
        byte abyte183[] = {
            87, 65, 78, 71, 0, 0
        };
        byte abyte184[] = {
            87, 69, 73, 0, 0, 0
        };
        byte abyte185[] = {
            87, 69, 78, 71, 0, 0
        };
        byte abyte186[] = {
            87, 79, 0, 0, 0, 0
        };
        byte abyte187[] = {
            87, 85, 0, 0, 0, 0
        };
        byte abyte188[] = {
            88, 73, 0, 0, 0, 0
        };
        byte abyte189[] = {
            88, 73, 65, 0, 0, 0
        };
        byte abyte190[] = {
            88, 73, 65, 79, 0, 0
        };
        byte abyte191[] = {
            88, 73, 69, 0, 0, 0
        };
        byte abyte192[] = {
            88, 73, 79, 78, 71, 0
        };
        byte abyte193[] = {
            88, 85, 0, 0, 0, 0
        };
        byte abyte194[] = {
            88, 85, 65, 78, 0, 0
        };
        byte abyte195[] = {
            88, 85, 78, 0, 0, 0
        };
        byte abyte196[] = {
            89, 65, 0, 0, 0, 0
        };
        byte abyte197[] = {
            89, 65, 78, 71, 0, 0
        };
        byte abyte198[] = {
            89, 65, 79, 0, 0, 0
        };
        byte abyte199[] = {
            89, 73, 0, 0, 0, 0
        };
        byte abyte200[] = {
            89, 79, 0, 0, 0, 0
        };
        byte abyte201[] = {
            89, 79, 78, 71, 0, 0
        };
        byte abyte202[] = {
            89, 79, 85, 0, 0, 0
        };
        byte abyte203[] = {
            89, 85, 0, 0, 0, 0
        };
        byte abyte204[] = {
            89, 85, 65, 78, 0, 0
        };
        byte abyte205[] = {
            89, 85, 69, 0, 0, 0
        };
        byte abyte206[] = {
            90, 65, 0, 0, 0, 0
        };
        byte abyte207[] = {
            90, 65, 73, 0, 0, 0
        };
        byte abyte208[] = {
            90, 65, 78, 71, 0, 0
        };
        byte abyte209[] = {
            90, 69, 0, 0, 0, 0
        };
        byte abyte210[] = {
            90, 69, 78, 0, 0, 0
        };
        byte abyte211[] = {
            90, 69, 78, 71, 0, 0
        };
        byte abyte212[] = {
            90, 72, 65, 0, 0, 0
        };
        byte abyte213[] = {
            90, 72, 65, 73, 0, 0
        };
        byte abyte214[] = {
            90, 72, 65, 78, 71, 0
        };
        byte abyte215[] = {
            90, 72, 65, 79, 0, 0
        };
        byte abyte216[] = {
            90, 72, 79, 78, 71, 0
        };
        byte abyte217[] = {
            90, 72, 85, 65, 0, 0
        };
        byte abyte218[] = {
            90, 72, 85, 65, 73, 0
        };
        byte abyte219[] = {
            90, 72, 85, 65, 78, 0
        };
        byte abyte220[] = {
            90, 72, 85, 65, 78, 71
        };
        byte abyte221[] = {
            90, 79, 78, 71, 0, 0
        };
        byte abyte222[] = {
            90, 79, 85, 0, 0, 0
        };
        byte abyte223[] = {
            90, 85, 0, 0, 0, 0
        };
        byte abyte224[] = {
            90, 85, 65, 78, 0, 0
        };
        byte abyte225[] = {
            90, 85, 79, 0, 0, 0
        };
        c = (new byte[][] {
            abyte0, abyte1, new byte[] {
                65, 78, 0, 0, 0, 0
            }, new byte[] {
                65, 78, 71, 0, 0, 0
            }, new byte[] {
                65, 79, 0, 0, 0, 0
            }, abyte2, new byte[] {
                66, 65, 73, 0, 0, 0
            }, new byte[] {
                66, 65, 78, 0, 0, 0
            }, abyte3, abyte4, 
            abyte5, new byte[] {
                66, 69, 78, 0, 0, 0
            }, abyte6, new byte[] {
                66, 73, 0, 0, 0, 0
            }, abyte7, abyte8, new byte[] {
                66, 73, 69, 0, 0, 0
            }, new byte[] {
                66, 73, 78, 0, 0, 0
            }, abyte9, new byte[] {
                66, 79, 0, 0, 0, 0
            }, 
            new byte[] {
                66, 85, 0, 0, 0, 0
            }, abyte10, new byte[] {
                67, 65, 73, 0, 0, 0
            }, abyte11, new byte[] {
                67, 65, 78, 71, 0, 0
            }, abyte12, abyte13, abyte14, abyte15, abyte16, 
            abyte17, abyte18, new byte[] {
                67, 72, 65, 78, 71, 0
            }, abyte19, new byte[] {
                67, 72, 69, 0, 0, 0
            }, abyte20, new byte[] {
                67, 72, 69, 78, 71, 0
            }, new byte[] {
                67, 72, 73, 0, 0, 0
            }, abyte21, new byte[] {
                67, 72, 79, 85, 0, 0
            }, 
            abyte22, abyte23, new byte[] {
                67, 72, 85, 65, 78, 0
            }, new byte[] {
                67, 72, 85, 65, 78, 71
            }, new byte[] {
                67, 72, 85, 73, 0, 0
            }, new byte[] {
                67, 72, 85, 78, 0, 0
            }, abyte24, new byte[] {
                67, 73, 0, 0, 0, 0
            }, abyte25, abyte26, 
            abyte27, new byte[] {
                67, 85, 65, 78, 0, 0
            }, new byte[] {
                67, 85, 73, 0, 0, 0
            }, abyte28, abyte29, abyte30, abyte31, abyte32, abyte33, abyte34, 
            new byte[] {
                68, 69, 0, 0, 0, 0
            }, abyte35, abyte36, new byte[] {
                68, 73, 0, 0, 0, 0
            }, new byte[] {
                68, 73, 65, 0, 0, 0
            }, abyte37, abyte38, new byte[] {
                68, 73, 69, 0, 0, 0
            }, abyte39, abyte40, 
            new byte[] {
                68, 79, 78, 71, 0, 0
            }, new byte[] {
                68, 79, 85, 0, 0, 0
            }, new byte[] {
                68, 85, 0, 0, 0, 0
            }, new byte[] {
                68, 85, 65, 78, 0, 0
            }, abyte41, new byte[] {
                68, 85, 78, 0, 0, 0
            }, abyte42, abyte43, new byte[] {
                69, 78, 0, 0, 0, 0
            }, new byte[] {
                69, 78, 71, 0, 0, 0
            }, 
            abyte44, abyte45, abyte46, new byte[] {
                70, 65, 78, 71, 0, 0
            }, new byte[] {
                70, 69, 73, 0, 0, 0
            }, abyte47, new byte[] {
                70, 69, 78, 71, 0, 0
            }, new byte[] {
                70, 73, 65, 79, 0, 0
            }, new byte[] {
                70, 79, 0, 0, 0, 0
            }, abyte48, 
            abyte49, new byte[] {
                70, 85, 0, 0, 0, 0
            }, abyte50, new byte[] {
                71, 65, 0, 0, 0, 0
            }, abyte51, abyte52, abyte53, new byte[] {
                71, 65, 79, 0, 0, 0
            }, abyte54, abyte55, 
            abyte56, abyte57, abyte58, new byte[] {
                71, 69, 0, 0, 0, 0
            }, new byte[] {
                71, 79, 78, 71, 0, 0
            }, abyte59, abyte60, abyte61, new byte[] {
                71, 85, 65, 73, 0, 0
            }, new byte[] {
                71, 85, 65, 78, 0, 0
            }, 
            abyte62, new byte[] {
                71, 85, 73, 0, 0, 0
            }, new byte[] {
                71, 85, 78, 0, 0, 0
            }, abyte63, abyte64, new byte[] {
                72, 65, 0, 0, 0, 0
            }, abyte65, new byte[] {
                72, 65, 78, 0, 0, 0
            }, abyte66, abyte67, 
            new byte[] {
                72, 69, 0, 0, 0, 0
            }, abyte68, abyte69, abyte70, abyte71, abyte72, abyte73, new byte[] {
                72, 85, 65, 0, 0, 0
            }, abyte74, abyte75, 
            new byte[] {
                72, 85, 65, 78, 71, 0
            }, new byte[] {
                72, 85, 73, 0, 0, 0
            }, abyte76, abyte77, new byte[] {
                74, 73, 0, 0, 0, 0
            }, abyte78, new byte[] {
                74, 73, 65, 78, 0, 0
            }, abyte79, abyte80, new byte[] {
                74, 73, 69, 0, 0, 0
            }, 
            new byte[] {
                74, 73, 78, 0, 0, 0
            }, new byte[] {
                74, 73, 78, 71, 0, 0
            }, new byte[] {
                74, 73, 79, 78, 71, 0
            }, abyte81, abyte82, new byte[] {
                74, 85, 65, 78, 0, 0
            }, new byte[] {
                74, 85, 69, 0, 0, 0
            }, abyte83, new byte[] {
                75, 65, 0, 0, 0, 0
            }, new byte[] {
                75, 65, 73, 0, 0, 0
            }, 
            new byte[] {
                75, 65, 78, 0, 0, 0
            }, abyte84, abyte85, new byte[] {
                75, 69, 0, 0, 0, 0
            }, new byte[] {
                75, 69, 78, 0, 0, 0
            }, new byte[] {
                75, 69, 78, 71, 0, 0
            }, new byte[] {
                75, 79, 78, 71, 0, 0
            }, new byte[] {
                75, 79, 85, 0, 0, 0
            }, new byte[] {
                75, 85, 0, 0, 0, 0
            }, abyte86, 
            abyte87, abyte88, abyte89, new byte[] {
                75, 85, 73, 0, 0, 0
            }, abyte90, abyte91, new byte[] {
                76, 65, 0, 0, 0, 0
            }, new byte[] {
                76, 65, 73, 0, 0, 0
            }, abyte92, abyte93, 
            abyte94, abyte95, new byte[] {
                76, 69, 73, 0, 0, 0
            }, new byte[] {
                76, 73, 0, 0, 0, 0
            }, abyte96, new byte[] {
                76, 69, 78, 71, 0, 0
            }, new byte[] {
                76, 73, 0, 0, 0, 0
            }, abyte97, new byte[] {
                76, 73, 65, 78, 0, 0
            }, new byte[] {
                76, 73, 65, 78, 71, 0
            }, 
            abyte98, abyte99, new byte[] {
                76, 73, 78, 0, 0, 0
            }, abyte100, new byte[] {
                76, 73, 85, 0, 0, 0
            }, abyte101, abyte102, new byte[] {
                76, 85, 0, 0, 0, 0
            }, abyte103, new byte[] {
                76, 85, 78, 0, 0, 0
            }, 
            abyte104, abyte105, abyte106, abyte107, abyte108, new byte[] {
                77, 65, 79, 0, 0, 0
            }, new byte[] {
                77, 69, 73, 0, 0, 0
            }, new byte[] {
                77, 69, 78, 0, 0, 0
            }, abyte109, new byte[] {
                77, 73, 0, 0, 0, 0
            }, 
            new byte[] {
                77, 73, 65, 78, 0, 0
            }, new byte[] {
                77, 73, 65, 79, 0, 0
            }, new byte[] {
                77, 73, 69, 0, 0, 0
            }, abyte110, new byte[] {
                77, 73, 78, 71, 0, 0
            }, abyte111, abyte112, abyte113, new byte[] {
                77, 85, 0, 0, 0, 0
            }, abyte114, 
            abyte115, abyte116, abyte117, abyte118, new byte[] {
                78, 69, 0, 0, 0, 0
            }, new byte[] {
                78, 69, 73, 0, 0, 0
            }, abyte119, new byte[] {
                78, 69, 78, 71, 0, 0
            }, new byte[] {
                78, 73, 0, 0, 0, 0
            }, new byte[] {
                78, 73, 65, 78, 0, 0
            }, 
            abyte120, abyte121, new byte[] {
                78, 73, 69, 0, 0, 0
            }, abyte122, abyte123, new byte[] {
                78, 73, 85, 0, 0, 0
            }, new byte[] {
                78, 79, 78, 71, 0, 0
            }, new byte[] {
                78, 79, 85, 0, 0, 0
            }, abyte124, new byte[] {
                78, 85, 65, 78, 0, 0
            }, 
            new byte[] {
                78, 85, 78, 0, 0, 0
            }, abyte125, new byte[] {
                79, 0, 0, 0, 0, 0
            }, abyte126, new byte[] {
                80, 65, 0, 0, 0, 0
            }, abyte127, abyte128, new byte[] {
                80, 65, 78, 71, 0, 0
            }, abyte129, new byte[] {
                80, 69, 73, 0, 0, 0
            }, 
            abyte130, abyte131, abyte132, new byte[] {
                80, 73, 65, 78, 0, 0
            }, abyte133, new byte[] {
                80, 73, 69, 0, 0, 0
            }, new byte[] {
                80, 73, 78, 0, 0, 0
            }, new byte[] {
                80, 73, 78, 71, 0, 0
            }, new byte[] {
                80, 79, 0, 0, 0, 0
            }, abyte134, 
            abyte135, new byte[] {
                81, 73, 0, 0, 0, 0
            }, abyte136, abyte137, abyte138, abyte139, new byte[] {
                81, 73, 69, 0, 0, 0
            }, new byte[] {
                81, 73, 78, 0, 0, 0
            }, new byte[] {
                81, 73, 78, 71, 0, 0
            }, new byte[] {
                81, 73, 79, 78, 71, 0
            }, 
            abyte140, abyte141, abyte142, abyte143, abyte144, abyte145, new byte[] {
                82, 65, 78, 71, 0, 0
            }, new byte[] {
                82, 65, 79, 0, 0, 0
            }, abyte146, new byte[] {
                82, 69, 78, 0, 0, 0
            }, 
            abyte147, abyte148, abyte149, abyte150, abyte151, abyte152, new byte[] {
                82, 85, 73, 0, 0, 0
            }, abyte153, abyte154, abyte155, 
            new byte[] {
                83, 65, 73, 0, 0, 0
            }, abyte156, new byte[] {
                83, 65, 78, 71, 0, 0
            }, abyte157, abyte158, abyte159, new byte[] {
                83, 69, 78, 71, 0, 0
            }, abyte160, new byte[] {
                83, 72, 65, 73, 0, 0
            }, new byte[] {
                83, 72, 65, 78, 0, 0
            }, 
            new byte[] {
                83, 72, 65, 78, 71, 0
            }, abyte161, new byte[] {
                83, 72, 69, 0, 0, 0
            }, abyte162, abyte163, abyte164, new byte[] {
                83, 72, 79, 85, 0, 0
            }, abyte165, new byte[] {
                83, 72, 85, 65, 0, 0
            }, abyte166, 
            new byte[] {
                83, 72, 85, 65, 78, 0
            }, new byte[] {
                83, 72, 85, 65, 78, 71
            }, abyte167, new byte[] {
                83, 72, 85, 78, 0, 0
            }, new byte[] {
                83, 72, 85, 79, 0, 0
            }, abyte168, abyte169, abyte170, new byte[] {
                83, 85, 0, 0, 0, 0
            }, abyte171, 
            new byte[] {
                83, 85, 73, 0, 0, 0
            }, abyte172, new byte[] {
                83, 85, 79, 0, 0, 0
            }, abyte173, new byte[] {
                84, 65, 73, 0, 0, 0
            }, new byte[] {
                84, 65, 78, 0, 0, 0
            }, new byte[] {
                84, 65, 78, 71, 0, 0
            }, new byte[] {
                84, 65, 79, 0, 0, 0
            }, abyte174, abyte175, 
            new byte[] {
                84, 73, 0, 0, 0, 0
            }, abyte176, new byte[] {
                84, 73, 65, 79, 0, 0
            }, new byte[] {
                84, 73, 69, 0, 0, 0
            }, abyte177, abyte178, abyte179, abyte180, new byte[] {
                84, 85, 65, 78, 0, 0
            }, new byte[] {
                84, 85, 73, 0, 0, 0
            }, 
            abyte181, new byte[] {
                84, 85, 79, 0, 0, 0
            }, new byte[] {
                87, 65, 0, 0, 0, 0
            }, abyte182, new byte[] {
                87, 65, 78, 0, 0, 0
            }, abyte183, abyte184, new byte[] {
                87, 69, 78, 0, 0, 0
            }, abyte185, abyte186, 
            abyte187, abyte188, abyte189, new byte[] {
                88, 73, 65, 78, 0, 0
            }, new byte[] {
                88, 73, 65, 78, 71, 0
            }, abyte190, abyte191, new byte[] {
                88, 73, 78, 0, 0, 0
            }, new byte[] {
                88, 73, 78, 71, 0, 0
            }, abyte192, 
            new byte[] {
                88, 73, 85, 0, 0, 0
            }, abyte193, abyte194, new byte[] {
                88, 85, 69, 0, 0, 0
            }, abyte195, abyte196, new byte[] {
                89, 65, 78, 0, 0, 0
            }, abyte197, abyte198, new byte[] {
                89, 69, 0, 0, 0, 0
            }, 
            abyte199, new byte[] {
                89, 73, 78, 0, 0, 0
            }, new byte[] {
                89, 73, 78, 71, 0, 0
            }, abyte200, abyte201, abyte202, abyte203, abyte204, abyte205, new byte[] {
                89, 85, 78, 0, 0, 0
            }, 
            abyte206, abyte207, new byte[] {
                90, 65, 78, 0, 0, 0
            }, abyte208, new byte[] {
                90, 65, 79, 0, 0, 0
            }, abyte209, new byte[] {
                90, 69, 73, 0, 0, 0
            }, abyte210, abyte211, abyte212, 
            abyte213, new byte[] {
                90, 72, 65, 78, 0, 0
            }, abyte214, abyte215, new byte[] {
                90, 72, 69, 0, 0, 0
            }, new byte[] {
                90, 72, 69, 78, 0, 0
            }, new byte[] {
                90, 72, 69, 78, 71, 0
            }, new byte[] {
                90, 72, 73, 0, 0, 0
            }, abyte216, new byte[] {
                90, 72, 79, 85, 0, 0
            }, 
            new byte[] {
                90, 72, 85, 0, 0, 0
            }, abyte217, abyte218, abyte219, abyte220, new byte[] {
                90, 72, 85, 73, 0, 0
            }, new byte[] {
                90, 72, 85, 78, 0, 0
            }, new byte[] {
                90, 72, 85, 79, 0, 0
            }, new byte[] {
                90, 73, 0, 0, 0, 0
            }, abyte221, 
            abyte222, abyte223, abyte224, new byte[] {
                90, 85, 73, 0, 0, 0
            }, new byte[] {
                90, 85, 78, 0, 0, 0
            }, abyte225
        });
        d = Collator.getInstance(Locale.CHINA);
    }
}
