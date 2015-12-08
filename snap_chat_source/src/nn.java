// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nn extends oC
    implements oS.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i);
    }


    private final a mCallback;
    private final String mConversationId;
    private final Boolean mSaved;
    private final String mTransactionId;
    private final Integer mVersion;

    public nn(String s, String s1, Boolean boolean1, Integer integer, a a1)
    {
        super(oC.EXPONENTIAL_STRATEGY);
        mTransactionId = s;
        mConversationId = s1;
        mSaved = boolean1;
        mVersion = integer;
        mCallback = a1;
        registerCallback(java/lang/Boolean, this);
    }

    protected final String getPath()
    {
        return "/cash/update_transaction";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new TK()).a(mTransactionId).b(mConversationId).a(mSaved).a(mVersion)));
    }

    public final void onJsonResult(Object obj, pi pi1)
    {
        obj = (Boolean)obj;
        if (pi1.c() && IJ.a(((Boolean) (obj))))
        {
            mCallback.a();
            return;
        } else
        {
            mCallback.a(pi1.mResponseCode);
            return;
        }
    }
}
