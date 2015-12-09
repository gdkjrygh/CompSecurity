// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite;


// Referenced classes of package ly.kite:
//            KiteSDK

public static final class mEnvironment extends Enum
    implements mEnvironment
{

    private static final STAGING $VALUES[];
    public static final STAGING LIVE;
    public static final STAGING STAGING;
    public static final STAGING TEST;
    private STAGING mEnvironment;

    public static mEnvironment valueOf(String s)
    {
        return (mEnvironment)Enum.valueOf(ly/kite/KiteSDK$DefaultEnvironment, s);
    }

    public static mEnvironment[] values()
    {
        return (mEnvironment[])$VALUES.clone();
    }

    public String getAPIEndpoint()
    {
        return mEnvironment.ndpoint();
    }

    public String getName()
    {
        return mEnvironment.();
    }

    public String getPayPalAPIEndpoint()
    {
        return mEnvironment.alAPIEndpoint();
    }

    public String getPayPalClientId()
    {
        return mEnvironment.alClientId();
    }

    public String getPayPalEnvironment()
    {
        return mEnvironment.alEnvironment();
    }

    public String getPayPalPassword()
    {
        return mEnvironment.alPassword();
    }

    public String getPaymentActivityEnvironment()
    {
        return mEnvironment.entActivityEnvironment();
    }

    public void writeTo(android.content.ityEnvironment ityenvironment)
    {
        mEnvironment.(ityenvironment);
    }

    static 
    {
        LIVE = new <init>("LIVE", 0, "Live", "https://api.kite.ly/v1.4", "ly.kite.ENVIRONMENT_LIVE", "live", "api.paypal.com", "ASYVBBCHF_KwVUstugKy4qvpQaPlUeE_5beKRJHpIP2d3SA_jZrsaUDTmLQY", "");
        TEST = new <init>("TEST", 1, "Test", "https://api.kite.ly/v1.4", "ly.kite.ENVIRONMENT_TEST", "sandbox", "api.sandbox.paypal.com", "AcEcBRDxqcCKiikjm05FyD4Sfi4pkNP98AYN67sr3_yZdBe23xEk0qhdhZLM", "");
        STAGING = new <init>("STAGING", 2, "Staging", "http://staging.api.kite.ly", "ly.kite.ENVIRONMENT_STAGING", "sandbox", "api.sandbox.paypal.com", "AcEcBRDxqcCKiikjm05FyD4Sfi4pkNP98AYN67sr3_yZdBe23xEk0qhdhZLM", "");
        $VALUES = (new .VALUES[] {
            LIVE, TEST, STAGING
        });
    }

    private ditor(String s, int i, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7)
    {
        super(s, i);
        mEnvironment = new mEnvironment(s1, s2, s3, s4, s5, s6, s7);
    }
}
