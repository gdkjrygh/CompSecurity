// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            RetrofitError

public static final class  extends Enum
{

    private static final UNEXPECTED $VALUES[];
    public static final UNEXPECTED CONVERSION;
    public static final UNEXPECTED HTTP;
    public static final UNEXPECTED NETWORK;
    public static final UNEXPECTED UNEXPECTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(retrofit/RetrofitError$Kind, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NETWORK = new <init>("NETWORK", 0);
        CONVERSION = new <init>("CONVERSION", 1);
        HTTP = new <init>("HTTP", 2);
        UNEXPECTED = new <init>("UNEXPECTED", 3);
        $VALUES = (new .VALUES[] {
            NETWORK, CONVERSION, HTTP, UNEXPECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
