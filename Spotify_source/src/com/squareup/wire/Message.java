// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.wire;

import gxa;
import gxc;
import gxd;
import gxk;
import gxn;
import gxt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.squareup.wire:
//            MessageAdapter, ExtendableMessage

public abstract class Message
{

    private static final gxt WIRE = new gxt(new Class[0]);
    private transient int cachedSerializedSize;
    public transient int hashCode;
    private transient boolean haveCachedSerializedSize;
    transient gxn unknownFields;

    public Message(gxc gxc1)
    {
        hashCode = 0;
        if (gxc1.unknownFieldMap != null)
        {
            unknownFields = new gxn(gxc1.unknownFieldMap);
        }
    }

    public static gxn a(Message message)
    {
        return message.unknownFields;
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static boolean a(List list, List list1)
    {
        List list2 = list;
        if (list != null)
        {
            list2 = list;
            if (list.isEmpty())
            {
                list2 = null;
            }
        }
        list = list1;
        if (list1 != null)
        {
            list = list1;
            if (list1.isEmpty())
            {
                list = null;
            }
        }
        return list2 == list || list2 != null && list2.equals(list);
    }

    public static gxt c()
    {
        return WIRE;
    }

    public static List d(List list)
    {
        if (list == null)
        {
            return null;
        } else
        {
            return new ArrayList(list);
        }
    }

    public static List e(List list)
    {
        List list1;
        if (list == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = list;
            if (!(list instanceof MessageAdapter.ImmutableList))
            {
                return Collections.unmodifiableList(new ArrayList(list));
            }
        }
        return list1;
    }

    public final byte[] a()
    {
        return WIRE.a(getClass()).b(this);
    }

    public final int b()
    {
        if (!haveCachedSerializedSize)
        {
            cachedSerializedSize = WIRE.a(getClass()).a(this);
            haveCachedSerializedSize = true;
        }
        return cachedSerializedSize;
    }

    public String toString()
    {
        Object obj = WIRE.a(getClass());
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(((MessageAdapter) (obj)).a.getSimpleName());
        stringbuilder.append("{");
        Iterator iterator = ((MessageAdapter) (obj)).b.a.iterator();
        obj = "";
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            gxd gxd1 = (gxd)iterator.next();
            Object obj1 = MessageAdapter.a(this, gxd1);
            if (obj1 != null && !gxd1.g)
            {
                stringbuilder.append(((String) (obj)));
                obj = ", ";
                stringbuilder.append(gxd1.b);
                stringbuilder.append("=");
                stringbuilder.append(obj1);
            }
        } while (true);
        if (this instanceof ExtendableMessage)
        {
            ExtendableMessage extendablemessage = (ExtendableMessage)this;
            stringbuilder.append(((String) (obj)));
            stringbuilder.append("{extensions=");
            if (extendablemessage.extensionMap == null)
            {
                obj = "{}";
            } else
            {
                obj = extendablemessage.extensionMap.toString();
            }
            stringbuilder.append(((String) (obj)));
            stringbuilder.append("}");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }


    // Unreferenced inner class com/squareup/wire/Message$1

/* anonymous class */
    final class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[Datatype.values().length];
            try
            {
                a[Datatype.INT32.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror16) { }
            try
            {
                a[Datatype.INT64.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror15) { }
            try
            {
                a[Datatype.UINT32.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                a[Datatype.UINT64.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                a[Datatype.SINT32.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                a[Datatype.SINT64.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                a[Datatype.BOOL.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                a[Datatype.ENUM.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                a[Datatype.FIXED32.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[Datatype.SFIXED32.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[Datatype.FLOAT.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[Datatype.FIXED64.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[Datatype.SFIXED64.ordinal()] = 13;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[Datatype.DOUBLE.ordinal()] = 14;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[Datatype.STRING.ordinal()] = 15;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[Datatype.BYTES.ordinal()] = 16;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Datatype.MESSAGE.ordinal()] = 17;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }

        private class Datatype extends Enum
        {

            private static final Datatype $VALUES[];
            public static final Datatype BOOL;
            public static final Datatype BYTES;
            public static final Datatype DOUBLE;
            public static final Datatype ENUM;
            public static final Datatype FIXED32;
            public static final Datatype FIXED64;
            public static final Datatype FLOAT;
            public static final Datatype INT32;
            public static final Datatype INT64;
            public static final Datatype MESSAGE;
            public static final Comparator ORDER_BY_NAME = new Comparator() {

                public final int compare(Object obj, Object obj1)
                {
                    obj = (Datatype)obj;
                    obj1 = (Datatype)obj1;
                    return ((Datatype) (obj)).name().compareTo(((Datatype) (obj1)).name());
                }

            };
            public static final Datatype SFIXED32;
            public static final Datatype SFIXED64;
            public static final Datatype SINT32;
            public static final Datatype SINT64;
            public static final Datatype STRING;
            private static final Map TYPES_BY_NAME;
            public static final Datatype UINT32;
            public static final Datatype UINT64;
            public final int value;

            public static Datatype valueOf(String s)
            {
                return (Datatype)Enum.valueOf(com/squareup/wire/Message$Datatype, s);
            }

            public static Datatype[] values()
            {
                return (Datatype[])$VALUES.clone();
            }

            static 
            {
                INT32 = new Datatype("INT32", 0, 1);
                INT64 = new Datatype("INT64", 1, 2);
                UINT32 = new Datatype("UINT32", 2, 3);
                UINT64 = new Datatype("UINT64", 3, 4);
                SINT32 = new Datatype("SINT32", 4, 5);
                SINT64 = new Datatype("SINT64", 5, 6);
                BOOL = new Datatype("BOOL", 6, 7);
                ENUM = new Datatype("ENUM", 7, 8);
                STRING = new Datatype("STRING", 8, 9);
                BYTES = new Datatype("BYTES", 9, 10);
                MESSAGE = new Datatype("MESSAGE", 10, 11);
                FIXED32 = new Datatype("FIXED32", 11, 12);
                SFIXED32 = new Datatype("SFIXED32", 12, 13);
                FIXED64 = new Datatype("FIXED64", 13, 14);
                SFIXED64 = new Datatype("SFIXED64", 14, 15);
                FLOAT = new Datatype("FLOAT", 15, 16);
                DOUBLE = new Datatype("DOUBLE", 16, 17);
                $VALUES = (new Datatype[] {
                    INT32, INT64, UINT32, UINT64, SINT32, SINT64, BOOL, ENUM, STRING, BYTES, 
                    MESSAGE, FIXED32, SFIXED32, FIXED64, SFIXED64, FLOAT, DOUBLE
                });
                LinkedHashMap linkedhashmap = new LinkedHashMap();
                TYPES_BY_NAME = linkedhashmap;
                linkedhashmap.put("int32", INT32);
                TYPES_BY_NAME.put("int64", INT64);
                TYPES_BY_NAME.put("uint32", UINT32);
                TYPES_BY_NAME.put("uint64", UINT64);
                TYPES_BY_NAME.put("sint32", SINT32);
                TYPES_BY_NAME.put("sint64", SINT64);
                TYPES_BY_NAME.put("bool", BOOL);
                TYPES_BY_NAME.put("enum", ENUM);
                TYPES_BY_NAME.put("string", STRING);
                TYPES_BY_NAME.put("bytes", BYTES);
                TYPES_BY_NAME.put("message", MESSAGE);
                TYPES_BY_NAME.put("fixed32", FIXED32);
                TYPES_BY_NAME.put("sfixed32", SFIXED32);
                TYPES_BY_NAME.put("fixed64", FIXED64);
                TYPES_BY_NAME.put("sfixed64", SFIXED64);
                TYPES_BY_NAME.put("float", FLOAT);
                TYPES_BY_NAME.put("double", DOUBLE);
            }

            private Datatype(String s, int i, int j)
            {
                super(s, i);
                value = j;
            }
        }

    }

}
