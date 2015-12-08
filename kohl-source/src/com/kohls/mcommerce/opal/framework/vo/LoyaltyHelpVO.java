// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;


// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            IValueObject

public class LoyaltyHelpVO
    implements IValueObject
{
    public static class Properties
    {

        private String faq;
        private String program_details_content;
        private String program_details_image;
        private String terms_and_conditions;

        public String getFaq()
        {
            return faq;
        }

        public String getProgramDetails()
        {
            return program_details_content;
        }

        public String getProgram_details_content()
        {
            return program_details_content;
        }

        public String getProgram_details_image()
        {
            return program_details_image;
        }

        public String getTerms_and_conditions()
        {
            return terms_and_conditions;
        }

        public void setFaq(String s)
        {
            faq = s;
        }

        public void setProgram_details_content(String s)
        {
            program_details_content = s;
        }

        public void setProgram_details_image(String s)
        {
            program_details_image = s;
        }

        public void setTerms_and_conditions(String s)
        {
            terms_and_conditions = s;
        }

        public Properties()
        {
        }
    }


    private String expiryTime;
    private Payload payload;

    public LoyaltyHelpVO()
    {
    }

    public String getExpiryTime()
    {
        return expiryTime;
    }

    public Payload getPayload()
    {
        return payload;
    }

    public void setExpiryTime(String s)
    {
        expiryTime = s;
    }

    public void setPayload(Payload payload1)
    {
        payload = payload1;
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/LoyaltyHelpVO$Entry
    /* block-local class not found */
    class Entry {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/LoyaltyHelpVO$EntryResponse
    /* block-local class not found */
    class EntryResponse {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/LoyaltyHelpVO$Payload
    /* block-local class not found */
    class Payload {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/LoyaltyHelpVO$ResponseHeaders
    /* block-local class not found */
    class ResponseHeaders {}

}
