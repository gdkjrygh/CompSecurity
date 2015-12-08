// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


class 
{

    static final int $SwitchMap$retrofit$RestMethodInfo$RequestType[];

    static 
    {
        $SwitchMap$retrofit$RestMethodInfo$RequestType = new int[questType.values().length];
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$RequestType[questType.FORM_URL_ENCODED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$RequestType[questType.MULTIPART.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$retrofit$RestMethodInfo$RequestType[questType.SIMPLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
