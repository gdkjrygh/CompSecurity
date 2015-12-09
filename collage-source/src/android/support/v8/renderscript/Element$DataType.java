// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Element, RenderScript

public static final class mSize extends Enum
{

    private static final RS_SCRIPT $VALUES[];
    public static final RS_SCRIPT BOOLEAN;
    public static final RS_SCRIPT FLOAT_32;
    public static final RS_SCRIPT FLOAT_64;
    public static final RS_SCRIPT MATRIX_2X2;
    public static final RS_SCRIPT MATRIX_3X3;
    public static final RS_SCRIPT MATRIX_4X4;
    public static final RS_SCRIPT NONE;
    public static final RS_SCRIPT RS_ALLOCATION;
    public static final RS_SCRIPT RS_ELEMENT;
    public static final RS_SCRIPT RS_SAMPLER;
    public static final RS_SCRIPT RS_SCRIPT;
    public static final RS_SCRIPT RS_TYPE;
    public static final RS_SCRIPT SIGNED_16;
    public static final RS_SCRIPT SIGNED_32;
    public static final RS_SCRIPT SIGNED_64;
    public static final RS_SCRIPT SIGNED_8;
    public static final RS_SCRIPT UNSIGNED_16;
    public static final RS_SCRIPT UNSIGNED_32;
    public static final RS_SCRIPT UNSIGNED_4_4_4_4;
    public static final RS_SCRIPT UNSIGNED_5_5_5_1;
    public static final RS_SCRIPT UNSIGNED_5_6_5;
    public static final RS_SCRIPT UNSIGNED_64;
    public static final RS_SCRIPT UNSIGNED_8;
    int mID;
    int mSize;

    public static mSize valueOf(String s)
    {
        return (mSize)Enum.valueOf(android/support/v8/renderscript/Element$DataType, s);
    }

    public static mSize[] values()
    {
        return (mSize[])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0, 0, 0);
        FLOAT_32 = new <init>("FLOAT_32", 1, 2, 4);
        FLOAT_64 = new <init>("FLOAT_64", 2, 3, 8);
        SIGNED_8 = new <init>("SIGNED_8", 3, 4, 1);
        SIGNED_16 = new <init>("SIGNED_16", 4, 5, 2);
        SIGNED_32 = new <init>("SIGNED_32", 5, 6, 4);
        SIGNED_64 = new <init>("SIGNED_64", 6, 7, 8);
        UNSIGNED_8 = new <init>("UNSIGNED_8", 7, 8, 1);
        UNSIGNED_16 = new <init>("UNSIGNED_16", 8, 9, 2);
        UNSIGNED_32 = new <init>("UNSIGNED_32", 9, 10, 4);
        UNSIGNED_64 = new <init>("UNSIGNED_64", 10, 11, 8);
        BOOLEAN = new <init>("BOOLEAN", 11, 12, 1);
        UNSIGNED_5_6_5 = new <init>("UNSIGNED_5_6_5", 12, 13, 2);
        UNSIGNED_5_5_5_1 = new <init>("UNSIGNED_5_5_5_1", 13, 14, 2);
        UNSIGNED_4_4_4_4 = new <init>("UNSIGNED_4_4_4_4", 14, 15, 2);
        MATRIX_4X4 = new <init>("MATRIX_4X4", 15, 16, 64);
        MATRIX_3X3 = new <init>("MATRIX_3X3", 16, 17, 36);
        MATRIX_2X2 = new <init>("MATRIX_2X2", 17, 18, 16);
        RS_ELEMENT = new <init>("RS_ELEMENT", 18, 1000);
        RS_TYPE = new <init>("RS_TYPE", 19, 1001);
        RS_ALLOCATION = new <init>("RS_ALLOCATION", 20, 1002);
        RS_SAMPLER = new <init>("RS_SAMPLER", 21, 1003);
        RS_SCRIPT = new <init>("RS_SCRIPT", 22, 1004);
        $VALUES = (new .VALUES[] {
            NONE, FLOAT_32, FLOAT_64, SIGNED_8, SIGNED_16, SIGNED_32, SIGNED_64, UNSIGNED_8, UNSIGNED_16, UNSIGNED_32, 
            UNSIGNED_64, BOOLEAN, UNSIGNED_5_6_5, UNSIGNED_5_5_5_1, UNSIGNED_4_4_4_4, MATRIX_4X4, MATRIX_3X3, MATRIX_2X2, RS_ELEMENT, RS_TYPE, 
            RS_ALLOCATION, RS_SAMPLER, RS_SCRIPT
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mID = j;
        mSize = 4;
        if (RenderScript.sPointerSize == 8)
        {
            mSize = 32;
        }
    }

    private mSize(String s, int i, int j, int k)
    {
        super(s, i);
        mID = j;
        mSize = k;
    }
}
