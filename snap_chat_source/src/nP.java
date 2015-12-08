// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.api2.cash.blockers.BlockerOrder;
import com.snapchat.android.model.CashTransaction;
import java.util.List;

public final class nP extends np
{

    protected rZ mCashAuthManager;
    private boolean mRetriedAfter401;

    public nP()
    {
        mRetriedAfter401 = false;
        SnapchatApplication.getDIComponent().a(this);
    }

    protected static ok a(om.a a1)
    {
        return new om(a1);
    }

    static boolean a(nP np1)
    {
        return np1.mRetriedAfter401;
    }

    static boolean b(nP np1)
    {
        np1.mRetriedAfter401 = true;
        return true;
    }

    static void c(nP np1)
    {
        np1.a();
    }

    static void d(nP np1)
    {
        np1.b();
    }

    public final void a(CashTransaction cashtransaction)
    {
        cashtransaction = new nz();
        cashtransaction.mListener = new np.a() {

            final nP this$0;

            public final void a(np np1)
            {
                nP.c(nP.this);
            }

            public final void a(np np1, List list, boolean flag)
            {
                if (list == null || list.isEmpty())
                {
                    nP.a(new om.a() {

                        final _cls1 this$1;

                        public final void a()
                        {
                            nP.this.a(null, true);
                        }

                        public final void a(int i)
                        {
                            if (i == 401 && !nP.a(_fld0))
                            {
                                nP.b(_fld0);
                                mCashAuthManager.a(null);
                                nP.this.a(null);
                                return;
                            } else
                            {
                                b(null, false);
                                return;
                            }
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    }).execute();
                    return;
                } else
                {
                    nP.this.b(null, false);
                    return;
                }
            }

            public final void b(np np1)
            {
                nP.d(nP.this);
            }

            public final void b(np np1, List list, boolean flag)
            {
                nP.this.b(null, false);
            }

            
            {
                this$0 = nP.this;
                super();
            }
        };
        cashtransaction.a(null);
    }

    protected final void a(List list, boolean flag)
    {
        super.a(list, flag);
    }

    protected final void b(List list, boolean flag)
    {
        super.b(list, flag);
    }

    public final BlockerOrder c()
    {
        return BlockerOrder.SQ_UNLINK_CARD_BLOCKER;
    }
}
