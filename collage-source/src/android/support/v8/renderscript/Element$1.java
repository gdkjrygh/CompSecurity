// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Element

static class taType
{

    static final int $SwitchMap$android$support$v8$renderscript$Element$DataKind[];
    static final int $SwitchMap$android$support$v8$renderscript$Element$DataType[];

    static 
    {
        $SwitchMap$android$support$v8$renderscript$Element$DataKind = new int[taKind.values().length];
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataKind[taKind.PIXEL_LA.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataKind[taKind.PIXEL_RGB.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataKind[taKind.PIXEL_RGBA.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        $SwitchMap$android$support$v8$renderscript$Element$DataType = new int[taType.values().length];
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.FLOAT_32.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.FLOAT_64.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.SIGNED_8.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.SIGNED_16.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.SIGNED_32.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.SIGNED_64.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.UNSIGNED_8.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.UNSIGNED_16.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.UNSIGNED_32.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.UNSIGNED_64.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$android$support$v8$renderscript$Element$DataType[taType.BOOLEAN.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
