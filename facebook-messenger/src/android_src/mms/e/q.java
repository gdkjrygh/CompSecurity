// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import android_src.mms.b;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package android_src.mms.e:
//            e

public class q
{

    private HashMap a;

    public q()
    {
        a = null;
        a = new HashMap();
    }

    protected int a(int i)
    {
        Integer integer = (Integer)a.get(Integer.valueOf(i));
        if (integer == null)
        {
            return 0;
        } else
        {
            return integer.intValue();
        }
    }

    protected void a(int i, int j)
    {
        j;
        JVM INSTR tableswitch 134 191: default 248
    //                   134 258
    //                   135 248
    //                   136 248
    //                   137 248
    //                   138 248
    //                   139 248
    //                   140 755
    //                   141 735
    //                   142 248
    //                   143 342
    //                   144 258
    //                   145 258
    //                   146 663
    //                   147 248
    //                   148 258
    //                   149 368
    //                   150 248
    //                   151 248
    //                   152 248
    //                   153 491
    //                   154 248
    //                   155 286
    //                   156 394
    //                   157 248
    //                   158 248
    //                   159 248
    //                   160 248
    //                   161 248
    //                   162 258
    //                   163 420
    //                   164 248
    //                   165 584
    //                   166 248
    //                   167 258
    //                   168 248
    //                   169 258
    //                   170 248
    //                   171 258
    //                   172 248
    //                   173 248
    //                   174 248
    //                   175 248
    //                   176 248
    //                   177 258
    //                   178 248
    //                   179 248
    //                   180 446
    //                   181 248
    //                   182 248
    //                   183 248
    //                   184 248
    //                   185 248
    //                   186 465
    //                   187 258
    //                   188 258
    //                   189 248
    //                   190 248
    //                   191 314;
           goto _L1 _L2 _L1 _L1 _L1 _L1 _L1 _L3 _L4 _L1 _L5 _L2 _L2 _L6 _L1 _L2 _L7 _L1 _L1 _L1 _L8 _L1 _L9 _L10 _L1 _L1 _L1 _L1 _L1 _L2 _L11 _L1 _L12 _L1 _L2 _L1 _L2 _L1 _L2 _L1 _L1 _L1 _L1 _L1 _L2 _L1 _L1 _L13 _L1 _L1 _L1 _L1 _L1 _L14 _L2 _L2 _L1 _L1 _L15
_L1:
        throw new RuntimeException("Invalid header field!");
_L2:
        int k;
        k = i;
        if (128 == i)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (129 != i)
        {
            throw new b("Invalid Octet value!");
        }
        break; /* Loop/switch isn't completed */
_L9:
        k = i;
        if (128 == i)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (129 != i)
        {
            throw new b("Invalid Octet value!");
        }
        break; /* Loop/switch isn't completed */
_L15:
        k = i;
        if (128 == i)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (129 != i)
        {
            throw new b("Invalid Octet value!");
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (i >= 128)
        {
            k = i;
            if (i <= 130)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        throw new b("Invalid Octet value!");
_L7:
        if (i >= 128)
        {
            k = i;
            if (i <= 135)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        throw new b("Invalid Octet value!");
_L10:
        if (i >= 128)
        {
            k = i;
            if (i <= 131)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        throw new b("Invalid Octet value!");
_L11:
        if (i >= 128)
        {
            k = i;
            if (i <= 132)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        throw new b("Invalid Octet value!");
_L13:
        k = i;
        if (128 != i)
        {
            throw new b("Invalid Octet value!");
        }
        break; /* Loop/switch isn't completed */
_L14:
        if (i >= 128)
        {
            k = i;
            if (i <= 135)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        throw new b("Invalid Octet value!");
_L8:
        if (i <= 194 || i >= 224) goto _L17; else goto _L16
_L16:
        k = 192;
_L18:
        a.put(Integer.valueOf(j), Integer.valueOf(k));
        return;
_L17:
        if (i > 227 && i <= 255)
        {
            k = 224;
            continue; /* Loop/switch isn't completed */
        }
        if (i >= 128 && (i <= 128 || i >= 192))
        {
            k = i;
            if (i <= 255)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        k = 224;
        continue; /* Loop/switch isn't completed */
_L12:
        if (i > 193 && i < 224)
        {
            k = 192;
            continue; /* Loop/switch isn't completed */
        }
        if (i > 228 && i <= 255)
        {
            k = 224;
            continue; /* Loop/switch isn't completed */
        }
        if (i >= 128 && (i <= 128 || i >= 192))
        {
            k = i;
            if (i <= 255)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        k = 224;
        continue; /* Loop/switch isn't completed */
_L6:
        if (i > 196 && i < 224)
        {
            k = 192;
            continue; /* Loop/switch isn't completed */
        }
        if ((i <= 235 || i > 255) && i >= 128 && (i <= 136 || i >= 192))
        {
            k = i;
            if (i <= 255)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        k = 224;
        continue; /* Loop/switch isn't completed */
_L4:
        if (i >= 16)
        {
            k = i;
            if (i <= 19)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        k = 18;
        if (true) goto _L18; else goto _L3
_L3:
        if (i < 128)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (i <= 151) goto _L18; else goto _L19
_L19:
        throw new b("Invalid Octet value!");
    }

    protected void a(long l, int i)
    {
        switch (i)
        {
        default:
            throw new RuntimeException("Invalid header field!");

        case 133: 
        case 135: 
        case 136: 
        case 142: 
        case 157: 
        case 159: 
        case 161: 
        case 173: 
        case 175: 
        case 179: 
            a.put(Integer.valueOf(i), Long.valueOf(l));
            break;
        }
    }

    protected void a(e e1, int i)
    {
        if (e1 == null)
        {
            throw new NullPointerException();
        }
        switch (i)
        {
        default:
            throw new RuntimeException("Invalid header field!");

        case 137: 
        case 147: 
        case 150: 
        case 154: 
        case 160: 
        case 164: 
        case 166: 
        case 181: 
        case 182: 
            a.put(Integer.valueOf(i), e1);
            break;
        }
    }

    protected void a(byte abyte0[], int i)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException();
        }
        switch (i)
        {
        default:
            throw new RuntimeException("Invalid header field!");

        case 131: 
        case 132: 
        case 138: 
        case 139: 
        case 152: 
        case 158: 
        case 183: 
        case 184: 
        case 185: 
        case 189: 
        case 190: 
            a.put(Integer.valueOf(i), abyte0);
            break;
        }
    }

    protected void a(e ae[], int i)
    {
        if (ae == null)
        {
            throw new NullPointerException();
        }
        ArrayList arraylist;
        switch (i)
        {
        default:
            throw new RuntimeException("Invalid header field!");

        case 129: 
        case 130: 
        case 151: 
            arraylist = new ArrayList();
            break;
        }
        for (int j = 0; j < ae.length; j++)
        {
            arraylist.add(ae[j]);
        }

        a.put(Integer.valueOf(i), arraylist);
    }

    protected void b(e e1, int i)
    {
        if (e1 == null)
        {
            throw new NullPointerException();
        }
        ArrayList arraylist1;
        switch (i)
        {
        default:
            throw new RuntimeException("Invalid header field!");

        case 129: 
        case 130: 
        case 151: 
            arraylist1 = (ArrayList)a.get(Integer.valueOf(i));
            break;
        }
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
        }
        arraylist.add(e1);
        a.put(Integer.valueOf(i), arraylist);
    }

    protected byte[] b(int i)
    {
        return (byte[])(byte[])a.get(Integer.valueOf(i));
    }

    protected e c(int i)
    {
        return (e)a.get(Integer.valueOf(i));
    }

    protected e[] d(int i)
    {
        ArrayList arraylist = (ArrayList)a.get(Integer.valueOf(i));
        if (arraylist == null)
        {
            return null;
        } else
        {
            return (e[])arraylist.toArray(new e[arraylist.size()]);
        }
    }

    protected long e(int i)
    {
        Long long1 = (Long)a.get(Integer.valueOf(i));
        if (long1 == null)
        {
            return -1L;
        } else
        {
            return long1.longValue();
        }
    }
}
