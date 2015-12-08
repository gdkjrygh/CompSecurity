// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.driver.ExpressPayAccountDTO;

public class ExpressPayAccount
    implements INullable
{

    private final boolean failed;
    private final String failedMessage;
    private final String id;
    private final String lastFour;
    private final String successMessage;
    private final String type;

    public ExpressPayAccount(String s, String s1, String s2, String s3, boolean flag, String s4)
    {
        id = Strings.nullOrEmptyToDefault(s, "");
        lastFour = Strings.nullOrEmptyToDefault(s1, "");
        type = Strings.nullOrEmptyToDefault(s2, "");
        successMessage = Strings.nullOrEmptyToDefault(s3, "");
        failed = flag;
        failedMessage = Strings.nullOrEmptyToDefault(s4, "");
    }

    public static ExpressPayAccount empty()
    {
        return NullExpressPayAccount.INSTANCE;
    }

    public static ExpressPayAccount fromDTO(ExpressPayAccountDTO expresspayaccountdto)
    {
        if (expresspayaccountdto == null)
        {
            return empty();
        } else
        {
            return new ExpressPayAccount(expresspayaccountdto.id, expresspayaccountdto.lastFour, expresspayaccountdto.type, expresspayaccountdto.successMessage, expresspayaccountdto.failed, expresspayaccountdto.failedMessage);
        }
    }

    public String getFailedMessage()
    {
        return failedMessage;
    }

    public String getId()
    {
        return id;
    }

    public String getLastFour()
    {
        return lastFour;
    }

    public String getSuccessMessage()
    {
        return successMessage;
    }

    public String getType()
    {
        return type;
    }

    public boolean isFailed()
    {
        return failed;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullExpressPayAccount extends ExpressPayAccount
    {

        private static final ExpressPayAccount INSTANCE = new NullExpressPayAccount();

        public boolean isNull()
        {
            return true;
        }



        public NullExpressPayAccount()
        {
            super("", "", "", "", false, "");
        }
    }

}
