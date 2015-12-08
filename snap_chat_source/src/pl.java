// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pl extends XB
{

    private ahZ mBufferedSource;
    final pC mProgressListeners[];
    final XB mResponseBody;

    public transient pl(XB xb, pC apc[])
    {
        mResponseBody = xb;
        mProgressListeners = apc;
    }

    public final long a()
    {
        return mResponseBody.a();
    }

    public final ahZ b()
    {
        if (mBufferedSource == null)
        {
            mBufferedSource = aii.a(new aid(mResponseBody.b()) {

                final pl this$0;

                public final long a(ahX ahx, long l)
                {
                    l = super.a(ahx, l);
                    ahx = mProgressListeners;
                    int j = ahx.length;
                    for (int i = 0; i < j; i++)
                    {
                        ahx[i].a(l, mResponseBody.a());
                    }

                    return l;
                }

            
            {
                this$0 = pl.this;
                super(aio);
            }
            });
        }
        return mBufferedSource;
    }
}
