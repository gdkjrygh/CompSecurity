// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.api2.cash.blockers.BlockerOrder;
import com.snapchat.android.model.CashTransaction;
import java.util.List;

public final class nF extends np
{

    protected sc mCashCardManager;

    public nF()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    public final void a(CashTransaction cashtransaction)
    {
        mCashCardManager.b();
        super.a(null, false);
    }

    protected final void a(List list, boolean flag)
    {
        super.a(list, flag);
    }

    public final BlockerOrder c()
    {
        return BlockerOrder.SQ_CONFLICT_BLOCKER;
    }

    public final boolean d()
    {
        return true;
    }
}
