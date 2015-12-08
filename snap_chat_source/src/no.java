// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class no extends mW
{

    private final int mAmount;
    private final com.snapchat.android.util.CashUtils.CurrencyCode mCurrencyCode;
    private final boolean mIsRain;
    private final String mMessage;
    private final String mRecipient;

    public no(String s, int i, com.snapchat.android.util.CashUtils.CurrencyCode currencycode, String s1, boolean flag, mW.a a)
    {
        super(a);
        mRecipient = s;
        mAmount = i;
        mCurrencyCode = currencycode;
        mMessage = s1;
        mIsRain = flag;
        registerCallback(TM, this);
    }

    protected final String getPath()
    {
        return "/cash/validate_transaction";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new TL()).a(mRecipient).a(Integer.valueOf(mAmount)).b(mCurrencyCode.name()).c(mMessage).a(Boolean.valueOf(mIsRain))));
    }
}
