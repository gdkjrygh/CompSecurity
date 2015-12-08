// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


final class  extends Enum
{

    private static final FORM_URL_ENCODED $VALUES[];
    public static final FORM_URL_ENCODED FORM_URL_ENCODED;
    public static final FORM_URL_ENCODED MULTIPART;
    public static final FORM_URL_ENCODED SIMPLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(retrofit/RestMethodInfo$RequestType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SIMPLE = new <init>("SIMPLE", 0);
        MULTIPART = new <init>("MULTIPART", 1);
        FORM_URL_ENCODED = new <init>("FORM_URL_ENCODED", 2);
        $VALUES = (new .VALUES[] {
            SIMPLE, MULTIPART, FORM_URL_ENCODED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
