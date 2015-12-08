// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public class FraudDetails extends StripeObject
{

    public static final String USER_REPORT = "user_report";
    protected String stripeReport;
    protected String userReport;

    public FraudDetails()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FraudDetails)obj;
            if (stripeReport == null ? ((FraudDetails) (obj)).stripeReport != null : !stripeReport.equals(((FraudDetails) (obj)).stripeReport))
            {
                return false;
            }
            if (userReport == null ? ((FraudDetails) (obj)).userReport != null : !userReport.equals(((FraudDetails) (obj)).userReport))
            {
                return false;
            }
        }
        return true;
    }

    public String getStripeReport()
    {
        return stripeReport;
    }

    public String getUserReport()
    {
        return userReport;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (userReport != null)
        {
            i = userReport.hashCode();
        } else
        {
            i = 0;
        }
        if (stripeReport != null)
        {
            j = stripeReport.hashCode();
        }
        return i * 31 + j;
    }

    public void setStripeReport(String s)
    {
        stripeReport = s;
    }

    public void setUserReport(String s)
    {
        userReport = s;
    }
}
