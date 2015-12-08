// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Vd extends Enum
{

    private static final Vd $VALUES[];
    public static final Vd BARCODE;
    public static final Vd QR_CODE;
    public static final Vd SNAPCODE;
    public static final Vd UNRECOGNIZED_VALUE;
    public final String value;

    private Vd(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static Vd valueOf(String s)
    {
        return (Vd)Enum.valueOf(Vd, s);
    }

    public static Vd[] values()
    {
        return (Vd[])$VALUES.clone();
    }

    public final String toString()
    {
        return value;
    }

    static 
    {
        SNAPCODE = new Vd("SNAPCODE", 0, "SNAPCODE");
        BARCODE = new Vd("BARCODE", 1, "BARCODE");
        QR_CODE = new Vd("QR_CODE", 2, "QR_CODE");
        UNRECOGNIZED_VALUE = new Vd("UNRECOGNIZED_VALUE", 3, "UNRECOGNIZED_VALUE");
        $VALUES = (new Vd[] {
            SNAPCODE, BARCODE, QR_CODE, UNRECOGNIZED_VALUE
        });
    }
}
