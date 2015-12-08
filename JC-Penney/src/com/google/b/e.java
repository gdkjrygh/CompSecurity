// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import java.util.List;

// Referenced classes of package com.google.b:
//            t

public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    private static final e m[];
    private final Class l;

    private e(String s, int i1, Class class1)
    {
        super(s, i1);
        l = class1;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/google/b/e, s);
    }

    public static e[] values()
    {
        return (e[])m.clone();
    }

    static 
    {
        a = new e("OTHER", 0, java/lang/Object);
        b = new e("PURE_BARCODE", 1, java/lang/Void);
        c = new e("POSSIBLE_FORMATS", 2, java/util/List);
        d = new e("TRY_HARDER", 3, java/lang/Void);
        e = new e("CHARACTER_SET", 4, java/lang/String);
        f = new e("ALLOWED_LENGTHS", 5, [I);
        g = new e("ASSUME_CODE_39_CHECK_DIGIT", 6, java/lang/Void);
        h = new e("ASSUME_GS1", 7, java/lang/Void);
        i = new e("RETURN_CODABAR_START_END", 8, java/lang/Void);
        j = new e("NEED_RESULT_POINT_CALLBACK", 9, com/google/b/t);
        k = new e("ALLOWED_EAN_EXTENSIONS", 10, [I);
        m = (new e[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
