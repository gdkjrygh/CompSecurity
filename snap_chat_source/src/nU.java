// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nU extends ob
{
    final class a
    {

        final String passcode;
        final nU this$0;

        a()
        {
            this$0 = nU.this;
            super();
            passcode = nU.a(nU.this);
        }
    }


    private final String mPasscode;
    private final String mPaymentId;

    public nU(String s, String s1, ob.a a1)
    {
        super(a1);
        mPaymentId = s;
        mPasscode = s1;
        registerCallback(oc, this);
    }

    static String a(nU nu)
    {
        return nu.mPasscode;
    }

    public final String a()
    {
        return (new StringBuilder("cash/payments/")).append(mPaymentId).append("/confirm").toString();
    }

    public final pn getRequestPayload()
    {
        return new oZ(new a());
    }
}
