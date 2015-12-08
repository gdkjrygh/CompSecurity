// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.util.Pair;
import com.skype.android.util.Charsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AttributeContainer
{
    private static final class a
    {

        Integer a;
        Integer b;
        Object c;

        a(int i, int j, Object obj)
        {
            a = Integer.valueOf(i);
            b = Integer.valueOf(j);
            c = obj;
        }
    }


    private static final int TYPE_CONTAINER = 5;
    private static final int TYPE_INT = 0;
    private static final int TYPE_INT64 = 1;
    private static final int TYPE_INT_ARRAY = 6;
    private static final int TYPE_STR = 3;
    private static HashMap attrClassMap = new HashMap() {

            
            {
                put(java/lang/Integer, Pair.create(Integer.valueOf(0), AttributeContainer.getMethod(Integer.TYPE)));
                put(java/lang/String, Pair.create(Integer.valueOf(3), AttributeContainer.getMethod(java/lang/String)));
                put(java/lang/Long, Pair.create(Integer.valueOf(1), AttributeContainer.getMethod(java/lang/Long)));
                put(com/skype/android/analytics/AttributeContainer, Pair.create(Integer.valueOf(5), AttributeContainer.getMethod(com/skype/android/analytics/AttributeContainer)));
                put([I, Pair.create(Integer.valueOf(6), AttributeContainer.getMethod([I)));
            }
    };
    private ArrayList attrs;

    public AttributeContainer()
    {
        attrs = new ArrayList();
    }

    private int encode(byte abyte0[], int i, int j)
    {
        while (j > 127) 
        {
            abyte0[i] = (byte)(j & 0x7f | 0x80);
            j >>= 7;
            i++;
        }
        abyte0[i] = (byte)(j & 0x7f);
        return i + 1;
    }

    private int encode(byte abyte0[], int i, AttributeContainer attributecontainer)
    {
        attributecontainer = attributecontainer.serialize();
        for (int j = 0; j < attributecontainer.length;)
        {
            abyte0[i] = attributecontainer[j];
            j++;
            i++;
        }

        return i;
    }

    private int encode(byte abyte0[], int i, Long long1)
    {
        for (int j = 56; j >= 0;)
        {
            abyte0[i] = (byte)(int)(long1.longValue() >> j);
            j -= 8;
            i++;
        }

        return i;
    }

    private int encode(byte abyte0[], int i, String s)
    {
        s = s.getBytes(Charsets.a);
        for (int j = 0; j < s.length;)
        {
            abyte0[i] = s[j];
            j++;
            i++;
        }

        abyte0[i] = 0;
        return i + 1;
    }

    private int encode(byte abyte0[], int i, int ai[])
    {
        int j = encode(abyte0, i, ai.length);
        for (i = 0; i < ai.length; i++)
        {
            j = encode(abyte0, j, ai[i]);
        }

        return j;
    }

    private int encodedSize()
    {
        int i = encodedUnitSize(Integer.valueOf(attrs.size())) + 1;
        for (Iterator iterator = attrs.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            i = encodedUnitSize(a1.b) + (i + 1) + encodedUnitSize(a1.c);
        }

        return i;
    }

    private int encodedUnitSize(Object obj)
    {
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        int i1 = ((String)obj).getBytes(Charsets.a).length + 1;
_L4:
        return i1;
_L2:
label0:
        {
            if (obj instanceof Integer)
            {
                int k = 0;
                for (int i = ((Integer)obj).intValue(); i > 127; i >>= 7)
                {
                    k++;
                }

                return k + 1;
            }
            if (!(obj instanceof int[]))
            {
                break label0;
            }
            obj = (int[])obj;
            int j = encodedUnitSize(Integer.valueOf(obj.length));
            int l = 0;
            do
            {
                i1 = j;
                if (l >= obj.length)
                {
                    break;
                }
                j += encodedUnitSize(Integer.valueOf(obj[l]));
                l++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (obj instanceof AttributeContainer)
        {
            return ((AttributeContainer)obj).encodedSize();
        }
        return !(obj instanceof Long) ? 0 : 8;
    }

    private static Method getMethod(Class class1)
    {
        try
        {
            class1 = com/skype/android/analytics/AttributeContainer.getDeclaredMethod("encode", new Class[] {
                [B, Integer.TYPE, class1
            });
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public a put(int i, Object obj)
    {
        Pair pair = (Pair)attrClassMap.get(obj.getClass());
        if (pair != null && pair.second != null)
        {
            obj = new a(((Integer)pair.first).intValue(), i, obj);
            attrs.add(obj);
            return ((a) (obj));
        } else
        {
            return null;
        }
    }

    public byte[] serialize()
    {
        byte abyte0[] = new byte[encodedSize()];
        abyte0[0] = 65;
        int i = encode(abyte0, 1, attrs.size());
        Iterator iterator = attrs.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            abyte0[i] = (byte)a1.a.intValue();
            int j = encode(abyte0, i + 1, a1.b.intValue());
            Object obj = (Pair)attrClassMap.get(a1.c.getClass());
            i = j;
            if (obj != null)
            {
                i = j;
                if (((Pair) (obj)).second != null)
                {
                    obj = (Method)((Pair) (obj)).second;
                    try
                    {
                        i = ((Integer)((Method) (obj)).invoke(this, new Object[] {
                            abyte0, Integer.valueOf(j), a1.c
                        })).intValue();
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        illegalargumentexception.printStackTrace();
                        i = j;
                    }
                    catch (IllegalAccessException illegalaccessexception)
                    {
                        illegalaccessexception.printStackTrace();
                        i = j;
                    }
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        invocationtargetexception.printStackTrace();
                        i = j;
                    }
                }
            }
        } while (true);
        return abyte0;
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        int i;
        stringbuffer = new StringBuffer();
        i = 0;
_L8:
        Object obj;
        if (i >= attrs.size())
        {
            break MISSING_BLOCK_LABEL_382;
        }
        obj = (a)attrs.get(i);
        ((a) (obj)).a.intValue();
        JVM INSTR tableswitch 0 6: default 84
    //                   0 132
    //                   1 166
    //                   2 84
    //                   3 200
    //                   4 84
    //                   5 339
    //                   6 234;
           goto _L1 _L2 _L3 _L1 _L4 _L1 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_339;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuffer.append(String.format("%d=UNKNOWN", new Object[] {
            ((a) (obj)).b
        }));
_L9:
        if (i < attrs.size() - 1)
        {
            stringbuffer.append(",");
        }
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        stringbuffer.append(String.format("%d=%d", new Object[] {
            ((a) (obj)).b, (Integer)((a) (obj)).c
        }));
          goto _L9
_L3:
        stringbuffer.append(String.format("%d=%d", new Object[] {
            ((a) (obj)).b, (Long)((a) (obj)).c
        }));
          goto _L9
_L4:
        stringbuffer.append(String.format("%d=%s", new Object[] {
            ((a) (obj)).b, (String)((a) (obj)).c
        }));
          goto _L9
_L6:
        stringbuffer.append(String.format("%d=(", new Object[] {
            ((a) (obj)).b
        }));
        obj = (int[])((a) (obj)).c;
        for (int j = 0; j < obj.length; j++)
        {
            stringbuffer.append(String.format("%d", new Object[] {
                Integer.valueOf(obj[j])
            }));
            if (j != obj.length - 1)
            {
                stringbuffer.append(",");
            }
        }

        stringbuffer.append(String.format(")", new Object[0]));
          goto _L9
        stringbuffer.append(String.format("%d={ ", new Object[] {
            ((a) (obj)).b
        }));
        stringbuffer.append(((a) (obj)).c.toString());
        stringbuffer.append("}");
          goto _L9
        return stringbuffer.toString();
    }


}
