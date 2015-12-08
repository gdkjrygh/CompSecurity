// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.wire;

import gwx;
import gwy;
import gwz;
import gxa;
import gxb;
import gxc;
import gxd;
import gxg;
import gxi;
import gxj;
import gxk;
import gxn;
import gxo;
import gxt;
import gxu;
import gxv;
import hcj;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.ByteString;

// Referenced classes of package com.squareup.wire:
//            Message, ExtendableMessage, WireType

public final class MessageAdapter
{

    final Class a;
    final gxk b;
    private final gxt c;
    private final Class d;
    private final Map e;

    public MessageAdapter(gxt gxt1, Class class1)
    {
        LinkedHashMap linkedhashmap;
        int i;
        int j;
        e = new LinkedHashMap();
        c = gxt1;
        a = class1;
        d = a(class1);
        linkedhashmap = new LinkedHashMap();
        class1 = class1.getDeclaredFields();
        j = class1.length;
        i = 0;
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Field field;
        gxj gxj1;
        field = class1[i];
        gxj1 = (gxj)field.getAnnotation(gxj);
        if (gxj1 == null) goto _L4; else goto _L3
_L3:
        int k = gxj1.a();
        String s = field.getName();
        e.put(s, Integer.valueOf(k));
        Message.Datatype datatype = gxj1.b();
        if (datatype == Message.Datatype.ENUM)
        {
            gxt1 = field.getType();
            if (!java/lang/Enum.isAssignableFrom(gxt1))
            {
label0:
                {
                    if (!java/util/List.isAssignableFrom(gxt1))
                    {
                        break label0;
                    }
                    gxt1 = ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0];
                    if (!(gxt1 instanceof Class) || !java/lang/Enum.isAssignableFrom((Class)gxt1))
                    {
                        break label0;
                    }
                    gxt1 = (Class)gxt1;
                }
            }
        } else
        {
            if (datatype != Message.Datatype.MESSAGE)
            {
                break MISSING_BLOCK_LABEL_355;
            }
            gxt1 = field.getType();
            if (!com/squareup/wire/Message.isAssignableFrom(gxt1))
            {
label1:
                {
                    if (!java/util/List.isAssignableFrom(gxt1))
                    {
                        break label1;
                    }
                    gxt1 = ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0];
                    if (!(gxt1 instanceof Class) || !com/squareup/wire/Message.isAssignableFrom((Class)gxt1))
                    {
                        break label1;
                    }
                    gxt1 = (Class)gxt1;
                }
            }
        }
_L6:
        linkedhashmap.put(Integer.valueOf(k), new gxd(k, s, datatype, gxj1.c(), gxj1.d(), gxt1, field, a(s), (byte)0));
_L4:
        i++;
          goto _L5
        gxt1 = null;
        break MISSING_BLOCK_LABEL_148;
        gxt1 = null;
          goto _L6
_L2:
        b = gxk.a(linkedhashmap);
        return;
        gxt1 = null;
          goto _L6
    }

    private int a(int i, Object obj, Message.Datatype datatype)
    {
        return gxv.a(i) + a(obj, datatype);
    }

    private int a(Object obj, Message.Datatype datatype)
    {
        int i1 = 0;
        public final class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[WireType.values().length];
                try
                {
                    b[WireType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    b[WireType.f.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    b[WireType.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    b[WireType.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    b[WireType.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    b[WireType.e.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                a = new int[Message.Datatype.values().length];
                try
                {
                    a[Message.Datatype.INT32.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[Message.Datatype.INT64.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[Message.Datatype.UINT64.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[Message.Datatype.UINT32.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[Message.Datatype.SINT32.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[Message.Datatype.SINT64.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[Message.Datatype.BOOL.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[Message.Datatype.ENUM.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[Message.Datatype.STRING.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[Message.Datatype.BYTES.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[Message.Datatype.MESSAGE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Message.Datatype.FIXED32.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Message.Datatype.SFIXED32.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Message.Datatype.FLOAT.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Message.Datatype.FIXED64.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Message.Datatype.SFIXED64.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Message.Datatype.DOUBLE.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[datatype.ordinal()])
        {
        default:
            throw new RuntimeException();

        case 1: // '\001'
            int i = ((Integer)obj).intValue();
            if (i >= 0)
            {
                return gxv.b(i);
            } else
            {
                return 10;
            }

        case 2: // '\002'
        case 3: // '\003'
            return gxv.a(((Long)obj).longValue());

        case 4: // '\004'
            return gxv.b(((Integer)obj).intValue());

        case 5: // '\005'
            return gxv.b(gxv.f(((Integer)obj).intValue()));

        case 6: // '\006'
            return gxv.a(gxv.d(((Long)obj).longValue()));

        case 7: // '\007'
            return 1;

        case 8: // '\b'
            obj = (gxi)obj;
            c.c(obj.getClass());
            return gxv.b(gwx.a(((gxi) (obj))));

        case 9: // '\t'
            obj = (String)obj;
            int j1 = ((String) (obj)).length();
            int j = 0;
            while (i1 < j1) 
            {
                char c1 = ((String) (obj)).charAt(i1);
                if (c1 <= '\177')
                {
                    j++;
                } else
                if (c1 <= '\u07FF')
                {
                    j += 2;
                } else
                if (Character.isHighSurrogate(c1))
                {
                    j += 4;
                    i1++;
                } else
                {
                    j += 3;
                }
                i1++;
            }
            return gxv.b(j) + j;

        case 10: // '\n'
            int k = ((ByteString)obj).f();
            return k + gxv.b(k);

        case 11: // '\013'
            int l = ((Message)obj).b();
            return l + gxv.b(l);

        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            return 4;

        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
            return 8;
        }
    }

    private int a(List list, int i, Message.Datatype datatype)
    {
        int j = 0;
        for (list = list.iterator(); list.hasNext();)
        {
            j += a(i, list.next(), datatype);
        }

        return j;
    }

    private gwz a(int i)
    {
        Object obj = c.a;
        Class class1 = a;
        obj = (Map)((gxb) (obj)).a.get(class1);
        if (obj == null)
        {
            return null;
        } else
        {
            return (gwz)((Map) (obj)).get(Integer.valueOf(i));
        }
    }

    private static Class a(Class class1)
    {
        Class class2;
        try
        {
            class2 = Class.forName((new StringBuilder()).append(class1.getName()).append("$Builder").toString());
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new IllegalArgumentException((new StringBuilder("No builder class found for message type ")).append(class1.getName()).toString());
        }
        return class2;
    }

    static Object a(Message message, gxd gxd1)
    {
        if (gxd1.j == null)
        {
            throw new AssertionError("Field is not of type \"Message\"");
        }
        try
        {
            message = ((Message) (gxd1.j.get(message)));
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw new AssertionError(message);
        }
        return message;
    }

    private Object a(gxu gxu1, int i, Message.Datatype datatype)
    {
        switch (_cls1.a[datatype.ordinal()])
        {
        default:
            throw new RuntimeException();

        case 1: // '\001'
        case 4: // '\004'
            return Integer.valueOf(gxu1.b());

        case 2: // '\002'
        case 3: // '\003'
            return Long.valueOf(gxu1.c());

        case 5: // '\005'
            return Integer.valueOf(gxu.c(gxu1.b()));

        case 6: // '\006'
            return Long.valueOf(gxu.a(gxu1.c()));

        case 7: // '\007'
            boolean flag;
            if (gxu1.b() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);

        case 8: // '\b'
            gxd gxd1 = (gxd)b.a(i);
            if (gxd1 != null && gxd1.i != null)
            {
                datatype = gxd1.i;
            } else
            {
                gxt gxt1 = c;
                datatype = (gxd)b.a(i);
                Object obj;
                if (datatype == null)
                {
                    datatype = null;
                } else
                {
                    datatype = ((gxd) (datatype)).e;
                }
                obj = datatype;
                if (datatype == null)
                {
                    gwz gwz1 = a(i);
                    obj = datatype;
                    if (gwz1 != null)
                    {
                        obj = gwz1.c;
                    }
                }
                datatype = gxt1.c(((Class) (obj)));
                if (gxd1 != null)
                {
                    gxd1.i = datatype;
                }
            }
            i = gxu1.b();
            try
            {
                gxu1 = datatype.a(i);
            }
            // Misplaced declaration of an exception variable
            catch (gxu gxu1)
            {
                return Integer.valueOf(i);
            }
            return gxu1;

        case 9: // '\t'
            i = gxu1.b();
            gxu1.c = gxu1.c + i;
            return gxu1.b.a(i, gxu.a);

        case 10: // '\n'
            return gxu1.b(gxu1.b());

        case 11: // '\013'
            int j = gxu1.b();
            if (gxu1.e >= 64)
            {
                throw new IOException("Wire recursion limit exceeded");
            }
            j = gxu1.d(j);
            gxu1.e = gxu1.e + 1;
            gxd gxd2 = (gxd)b.a(i);
            if (gxd2 != null && gxd2.h != null)
            {
                datatype = gxd2.h;
            } else
            {
                gxt gxt2 = c;
                datatype = (gxd)b.a(i);
                Object obj1;
                if (datatype == null)
                {
                    datatype = null;
                } else
                {
                    datatype = ((gxd) (datatype)).f;
                }
                obj1 = datatype;
                if (datatype == null)
                {
                    gwz gwz2 = a(i);
                    obj1 = datatype;
                    if (gwz2 != null)
                    {
                        obj1 = gwz2.b;
                    }
                }
                datatype = gxt2.a(((Class) (obj1)));
                if (gxd2 != null)
                {
                    gxd2.h = datatype;
                }
            }
            datatype = datatype.a(gxu1);
            gxu1.a(0);
            gxu1.e = gxu1.e - 1;
            gxu1.d = j;
            return datatype;

        case 12: // '\f'
        case 13: // '\r'
            return Integer.valueOf(gxu1.d());

        case 15: // '\017'
        case 16: // '\020'
            return Long.valueOf(gxu1.e());

        case 14: // '\016'
            return Float.valueOf(Float.intBitsToFloat(gxu1.d()));

        case 17: // '\021'
            return Double.valueOf(Double.longBitsToDouble(gxu1.e()));
        }
    }

    private Field a(String s)
    {
        Field field;
        try
        {
            field = d.getField(s);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new AssertionError((new StringBuilder("No builder field ")).append(d.getName()).append(".").append(s).toString());
        }
        return field;
    }

    private void a(Message message, gxv gxv1)
    {
        Iterator iterator = b.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj4 = (gxd)iterator.next();
            Object obj2 = a(message, ((gxd) (obj4)));
            if (obj2 != null)
            {
                int i = ((gxd) (obj4)).a;
                Message.Datatype datatype = ((gxd) (obj4)).c;
                obj4 = ((gxd) (obj4)).d;
                if (((Message.Label) (obj4)).a())
                {
                    if (((Message.Label) (obj4)).b())
                    {
                        b(gxv1, (List)obj2, i, datatype);
                    } else
                    {
                        a(gxv1, (List)obj2, i, datatype);
                    }
                } else
                {
                    a(gxv1, i, obj2, datatype);
                }
            }
        } while (true);
        if (message instanceof ExtendableMessage)
        {
            Object obj = (ExtendableMessage)message;
            if (((ExtendableMessage) (obj)).extensionMap != null)
            {
                obj = ((ExtendableMessage) (obj)).extensionMap;
                int j = 0;
                while (j < ((gxa) (obj)).b) 
                {
                    Object obj5 = ((gxa) (obj)).a(j);
                    Object obj3 = ((gxa) (obj)).b(j);
                    int l = ((gwz) (obj5)).e;
                    Message.Datatype datatype1 = ((gwz) (obj5)).f;
                    obj5 = ((gwz) (obj5)).g;
                    if (((Message.Label) (obj5)).a())
                    {
                        if (((Message.Label) (obj5)).b())
                        {
                            b(gxv1, (List)obj3, l, datatype1);
                        } else
                        {
                            a(gxv1, (List)obj3, l, datatype1);
                        }
                    } else
                    {
                        a(gxv1, l, obj3, datatype1);
                    }
                    j++;
                }
            }
        }
        if (message.unknownFields != null)
        {
            message = message.unknownFields;
            if (((gxn) (message)).a != null)
            {
                for (message = ((gxn) (message)).a.entrySet().iterator(); message.hasNext();)
                {
                    Object obj1 = (java.util.Map.Entry)message.next();
                    int k = ((Integer)((java.util.Map.Entry) (obj1)).getKey()).intValue();
                    obj1 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator();
                    while (((Iterator) (obj1)).hasNext()) 
                    {
                        ((gxo)((Iterator) (obj1)).next()).a(k, gxv1);
                    }
                }

            }
        }
    }

    private static void a(gwy gwy1, gwz gwz1, Object obj)
    {
        if (gwy1.a == null)
        {
            gwy1.a = new gxa(gwz1, obj);
            return;
        }
        gxa gxa1 = gwy1.a;
        int i = Arrays.binarySearch(gxa1.a, 0, gxa1.b, gwz1);
        if (i >= 0)
        {
            gxa1.a[i + gxa1.b] = obj;
            return;
        }
        i = -(i + 1);
        gwy1 = ((gwy) (gxa1.a));
        if (gxa1.a.length < (gxa1.b + 1) * 2)
        {
            gwy1 = ((gwy) (new Object[gxa1.a.length * 2]));
            System.arraycopy(((Object) (gxa1.a)), 0, gwy1, 0, i);
        }
        if (i < gxa1.b)
        {
            System.arraycopy(((Object) (gxa1.a)), gxa1.b + i, gwy1, gxa1.b + i + 2, gxa1.b - i);
            System.arraycopy(((Object) (gxa1.a)), i, gwy1, i + 1, gxa1.b);
        } else
        {
            System.arraycopy(((Object) (gxa1.a)), gxa1.b, gwy1, gxa1.b + 1, gxa1.b);
        }
        gxa1.b = gxa1.b + 1;
        gxa1.a = gwy1;
        gxa1.a[i] = gwz1;
        gxa1.a[gxa1.b + i] = obj;
    }

    private void a(gxc gxc1, int i, Object obj)
    {
        try
        {
            ((gxd)b.a(i)).k.set(gxc1, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (gxc gxc1)
        {
            throw new AssertionError(gxc1);
        }
    }

    private void a(gxv gxv1, int i, Object obj, Message.Datatype datatype)
    {
        Message._cls1.a[datatype.ordinal()];
        JVM INSTR tableswitch 1 17: default 92
    //                   1 118
    //                   2 118
    //                   3 118
    //                   4 118
    //                   5 118
    //                   6 118
    //                   7 118
    //                   8 118
    //                   9 139
    //                   10 139
    //                   11 139
    //                   12 147
    //                   13 147
    //                   14 147
    //                   15 155
    //                   16 155
    //                   17 155;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L3 _L4 _L4 _L4 _L5 _L5 _L5
_L1:
        throw new AssertionError((new StringBuilder("No wiretype for datatype ")).append(datatype).toString());
_L2:
        WireType wiretype = WireType.a;
_L7:
        gxv1.b(i, wiretype);
        a(gxv1, obj, datatype);
        return;
_L3:
        wiretype = WireType.f;
        continue; /* Loop/switch isn't completed */
_L4:
        wiretype = WireType.b;
        continue; /* Loop/switch isn't completed */
_L5:
        wiretype = WireType.c;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(gxv gxv1, Object obj, Message.Datatype datatype)
    {
        switch (_cls1.a[datatype.ordinal()])
        {
        default:
            throw new RuntimeException();

        case 1: // '\001'
            int i = ((Integer)obj).intValue();
            if (i >= 0)
            {
                gxv1.d(i);
                return;
            } else
            {
                gxv1.b(i);
                return;
            }

        case 2: // '\002'
        case 3: // '\003'
            gxv1.b(((Long)obj).longValue());
            return;

        case 4: // '\004'
            gxv1.d(((Integer)obj).intValue());
            return;

        case 5: // '\005'
            gxv1.d(gxv.f(((Integer)obj).intValue()));
            return;

        case 6: // '\006'
            gxv1.b(gxv.d(((Long)obj).longValue()));
            return;

        case 7: // '\007'
            int j;
            if (((Boolean)obj).booleanValue())
            {
                j = 1;
            } else
            {
                j = 0;
            }
            gxv1.c(j);
            return;

        case 8: // '\b'
            obj = (gxi)obj;
            c.c(obj.getClass());
            gxv1.d(gwx.a(((gxi) (obj))));
            return;

        case 9: // '\t'
            obj = ((String)obj).getBytes("UTF-8");
            gxv1.d(obj.length);
            gxv1.a(((byte []) (obj)));
            return;

        case 10: // '\n'
            obj = (ByteString)obj;
            gxv1.d(((ByteString) (obj)).f());
            gxv1.a(((ByteString) (obj)).g());
            return;

        case 11: // '\013'
            obj = (Message)obj;
            gxv1.d(((Message) (obj)).b());
            c.a(obj.getClass()).a(((Message) (obj)), gxv1);
            return;

        case 12: // '\f'
        case 13: // '\r'
            gxv1.e(((Integer)obj).intValue());
            return;

        case 15: // '\017'
        case 16: // '\020'
            gxv1.c(((Long)obj).longValue());
            return;

        case 14: // '\016'
            gxv1.e(Float.floatToIntBits(((Float)obj).floatValue()));
            return;

        case 17: // '\021'
            gxv1.c(Double.doubleToLongBits(((Double)obj).doubleValue()));
            return;
        }
    }

    private void a(gxv gxv1, List list, int i, Message.Datatype datatype)
    {
        for (list = list.iterator(); list.hasNext(); a(gxv1, i, list.next(), datatype)) { }
    }

    private int b(List list, int i, Message.Datatype datatype)
    {
        int j = 0;
        for (list = list.iterator(); list.hasNext();)
        {
            j += a(list.next(), datatype);
        }

        return j + (gxv.b(gxv.a(i, WireType.c)) + gxv.b(j));
    }

    private void b(gxv gxv1, List list, int i, Message.Datatype datatype)
    {
        int j = 0;
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            j += a(iterator.next(), datatype);
        }

        gxv1.b(i, WireType.c);
        gxv1.d(j);
        for (list = list.iterator(); list.hasNext(); a(gxv1, list.next(), datatype)) { }
    }

    final int a(Message message)
    {
        int j1;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        Iterator iterator = b.a.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj4 = (gxd)iterator.next();
            Object obj2 = a(message, ((gxd) (obj4)));
            if (obj2 != null)
            {
                int k = ((gxd) (obj4)).a;
                Message.Datatype datatype = ((gxd) (obj4)).c;
                obj4 = ((gxd) (obj4)).d;
                if (((Message.Label) (obj4)).a())
                {
                    if (((Message.Label) (obj4)).b())
                    {
                        i = b((List)obj2, k, datatype) + i;
                    } else
                    {
                        i = a((List)obj2, k, datatype) + i;
                    }
                } else
                {
                    i = a(k, obj2, datatype) + i;
                }
            }
        } while (true);
        j1 = i;
        if (message instanceof ExtendableMessage)
        {
            Object obj = (ExtendableMessage)message;
            j1 = i;
            if (((ExtendableMessage) (obj)).extensionMap != null)
            {
                obj = ((ExtendableMessage) (obj)).extensionMap;
                j1 = 0;
                int l = 0;
                while (j1 < ((gxa) (obj)).b) 
                {
                    Object obj5 = ((gxa) (obj)).a(j1);
                    Object obj3 = ((gxa) (obj)).b(j1);
                    int k1 = ((gwz) (obj5)).e;
                    Message.Datatype datatype1 = ((gwz) (obj5)).f;
                    obj5 = ((gwz) (obj5)).g;
                    if (((Message.Label) (obj5)).a())
                    {
                        if (((Message.Label) (obj5)).b())
                        {
                            l += b((List)obj3, k1, datatype1);
                        } else
                        {
                            l += a((List)obj3, k1, datatype1);
                        }
                    } else
                    {
                        l += a(k1, obj3, datatype1);
                    }
                    j1++;
                }
                j1 = i + l;
            }
        }
        if (message.unknownFields != null) goto _L2; else goto _L1
_L1:
        int i1 = ((flag1) ? 1 : 0);
_L4:
        return j1 + i1;
_L2:
        message = message.unknownFields;
        i1 = ((flag1) ? 1 : 0);
        if (((gxn) (message)).a == null) goto _L4; else goto _L3
_L3:
        int j;
        message = ((gxn) (message)).a.entrySet().iterator();
        j = ((flag) ? 1 : 0);
_L7:
        i1 = j;
        if (!message.hasNext()) goto _L4; else goto _L5
_L5:
        Object obj1;
        obj1 = (java.util.Map.Entry)message.next();
        i1 = j + gxv.a(((Integer)((java.util.Map.Entry) (obj1)).getKey()).intValue());
        obj1 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator();
_L8:
        j = i1;
        if (!((Iterator) (obj1)).hasNext()) goto _L7; else goto _L6
_L6:
        i1 += ((gxo)((Iterator) (obj1)).next()).a();
          goto _L8
    }

    public final Message a(gxu gxu1)
    {
        gxc gxc1;
        gxg gxg1;
        gxc1 = (gxc)d.newInstance();
        gxg1 = new gxg((byte)0);
_L30:
        int j = gxu1.a();
        Object obj1;
        int i;
        i = j >> 3;
        try
        {
            obj1 = WireType.a(j);
        }
        // Misplaced declaration of an exception variable
        catch (gxu gxu1)
        {
            throw new RuntimeException(gxu1);
        }
        // Misplaced declaration of an exception variable
        catch (gxu gxu1)
        {
            throw new RuntimeException(gxu1);
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (gxg1.a != null) goto _L4; else goto _L3
_L3:
        gxu1 = Collections.emptySet();
_L10:
        gxu1 = gxu1.iterator();
_L9:
        if (!gxu1.hasNext()) goto _L6; else goto _L5
_L5:
        i = ((Integer)gxu1.next()).intValue();
        if (!b.b(i)) goto _L8; else goto _L7
_L7:
        a(gxc1, i, gxg1.a(i));
          goto _L9
_L4:
        gxu1 = gxg1.a.keySet();
        continue; /* Loop/switch isn't completed */
_L8:
        a((gwy)gxc1, a(i), gxg1.a(i));
          goto _L9
_L6:
        return gxc1.build();
        if (true) goto _L10; else goto _L2
_L2:
        Object obj = (gxd)b.a(i);
        if (obj == null) goto _L12; else goto _L11
_L11:
        Message.Datatype datatype;
        Message.Label label;
        datatype = ((gxd) (obj)).c;
        label = ((gxd) (obj)).d;
        obj = null;
_L31:
        if (!label.b() || obj1 != WireType.c) goto _L14; else goto _L13
_L13:
        int k;
        long l;
        j = gxu1.b();
        l = gxu1.c;
        k = gxu1.d(j);
_L19:
        if ((long)gxu1.c >= (long)j + l) goto _L16; else goto _L15
_L15:
        obj = a(gxu1, i, datatype);
        if (datatype != Message.Datatype.ENUM || !(obj instanceof Integer)) goto _L18; else goto _L17
_L17:
        gxc1.addVarint(i, ((Integer)obj).intValue());
          goto _L19
_L12:
        obj = a(i);
        if (obj != null) goto _L21; else goto _L20
_L20:
        _cls1.b[((WireType) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 6: default 609
    //                   1 390
    //                   2 404
    //                   3 418
    //                   4 432
    //                   5 450
    //                   6 22;
           goto _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L28:
        if (true) goto _L30; else goto _L29
_L29:
_L22:
        throw new RuntimeException((new StringBuilder("Unsupported wire type: ")).append(obj1).toString());
_L23:
        gxc1.addVarint(i, gxu1.c());
          goto _L30
_L24:
        gxc1.addFixed32(i, gxu1.d());
          goto _L30
_L25:
        gxc1.addFixed64(i, gxu1.e());
          goto _L30
_L26:
        gxc1.addLengthDelimited(i, gxu1.b(gxu1.b()));
          goto _L30
_L27:
        gxu1.f();
          goto _L30
_L21:
        datatype = ((gwz) (obj)).f;
        label = ((gwz) (obj)).g;
          goto _L31
_L18:
        gxg1.a(i, obj);
          goto _L19
_L16:
        gxu1.d = k;
        if ((long)gxu1.c != (long)j + l)
        {
            throw new IOException("Packed data had wrong length!");
        }
          goto _L30
_L14:
        obj1 = a(gxu1, i, datatype);
        if (datatype != Message.Datatype.ENUM || !(obj1 instanceof Integer)) goto _L33; else goto _L32
_L32:
        gxc1.addVarint(i, ((Integer)obj1).intValue());
          goto _L30
_L33:
        if (!label.a()) goto _L35; else goto _L34
_L34:
        gxg1.a(i, obj1);
          goto _L30
_L35:
        if (obj == null) goto _L37; else goto _L36
_L36:
        a((gwy)gxc1, ((gwz) (obj)), obj1);
          goto _L30
_L37:
        a(gxc1, i, obj1);
          goto _L30
    }

    final byte[] b(Message message)
    {
        byte abyte0[] = new byte[a(message)];
        try
        {
            a(message, new gxv(abyte0, abyte0.length));
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw new RuntimeException(message);
        }
        return abyte0;
    }
}
