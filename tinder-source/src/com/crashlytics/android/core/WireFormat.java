// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//            ByteString

final class WireFormat
{
    static class FieldType extends Enum
    {

        public static final FieldType a;
        public static final FieldType b;
        public static final FieldType c;
        public static final FieldType d;
        public static final FieldType e;
        public static final FieldType f;
        public static final FieldType g;
        public static final FieldType h;
        public static final FieldType i;
        public static final FieldType j;
        public static final FieldType k;
        public static final FieldType l;
        public static final FieldType m;
        public static final FieldType n;
        public static final FieldType o;
        public static final FieldType p;
        public static final FieldType q;
        public static final FieldType r;
        private static final FieldType u[];
        private final JavaType s;
        private final int t;

        public static FieldType valueOf(String s1)
        {
            return (FieldType)Enum.valueOf(com/crashlytics/android/core/WireFormat$FieldType, s1);
        }

        public static FieldType[] values()
        {
            return (FieldType[])u.clone();
        }

        static 
        {
            a = new FieldType("DOUBLE", 0, JavaType.d, 1);
            b = new FieldType("FLOAT", 1, JavaType.c, 5);
            c = new FieldType("INT64", 2, JavaType.b, 0);
            d = new FieldType("UINT64", 3, JavaType.b, 0);
            e = new FieldType("INT32", 4, JavaType.a, 0);
            f = new FieldType("FIXED64", 5, JavaType.b, 1);
            g = new FieldType("FIXED32", 6, JavaType.a, 5);
            h = new FieldType("BOOL", 7, JavaType.e, 0);
            i = new FieldType("STRING", JavaType.f) {

            };
            j = new FieldType("GROUP", JavaType.i) {

            };
            k = new FieldType("MESSAGE", JavaType.i) {

            };
            l = new FieldType("BYTES", JavaType.g) {

            };
            m = new FieldType("UINT32", 12, JavaType.a, 0);
            n = new FieldType("ENUM", 13, JavaType.h, 0);
            o = new FieldType("SFIXED32", 14, JavaType.a, 5);
            p = new FieldType("SFIXED64", 15, JavaType.b, 1);
            q = new FieldType("SINT32", 16, JavaType.a, 0);
            r = new FieldType("SINT64", 17, JavaType.b, 0);
            u = (new FieldType[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r
            });
        }

        private FieldType(String s1, int i1, JavaType javatype, int j1)
        {
            super(s1, i1);
            s = javatype;
            t = j1;
        }

        FieldType(String s1, int i1, JavaType javatype, int j1, byte byte0)
        {
            this(s1, i1, javatype, j1);
        }
    }

    static final class JavaType extends Enum
    {

        public static final JavaType a;
        public static final JavaType b;
        public static final JavaType c;
        public static final JavaType d;
        public static final JavaType e;
        public static final JavaType f;
        public static final JavaType g;
        public static final JavaType h;
        public static final JavaType i;
        private static final JavaType k[];
        private final Object j;

        public static JavaType valueOf(String s)
        {
            return (JavaType)Enum.valueOf(com/crashlytics/android/core/WireFormat$JavaType, s);
        }

        public static JavaType[] values()
        {
            return (JavaType[])k.clone();
        }

        static 
        {
            a = new JavaType("INT", 0, Integer.valueOf(0));
            b = new JavaType("LONG", 1, Long.valueOf(0L));
            c = new JavaType("FLOAT", 2, Float.valueOf(0.0F));
            d = new JavaType("DOUBLE", 3, Double.valueOf(0.0D));
            e = new JavaType("BOOLEAN", 4, Boolean.valueOf(false));
            f = new JavaType("STRING", 5, "");
            g = new JavaType("BYTE_STRING", 6, ByteString.b);
            h = new JavaType("ENUM", 7, null);
            i = new JavaType("MESSAGE", 8, null);
            k = (new JavaType[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private JavaType(String s, int l, Object obj)
        {
            super(s, l);
            j = obj;
        }
    }


    static final int a = 11;
    static final int b = 12;
    static final int c = 16;
    static final int d = 26;

    private WireFormat()
    {
    }

    static int a(int i, int j)
    {
        return i << 3 | j;
    }

}
