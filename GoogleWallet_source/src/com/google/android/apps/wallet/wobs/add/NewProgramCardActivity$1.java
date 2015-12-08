// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.android.apps.wallet.logging.WLog;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            NewProgramCardActivity, ProgramCardsHandler, Program

final class val.discoverableId
    implements Callable
{

    final NewProgramCardActivity this$0;
    final String val$discoverableId;

    private Program call()
        throws Exception
    {
        WLog.ifmt(NewProgramCardActivity.access$000(), "Fetching program form, discoverableId=%s", new Object[] {
            val$discoverableId
        });
        return getProgramCardsHandler().fetchProgram(val$discoverableId);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_newprogramcardactivity;
        val$discoverableId = String.this;
        super();
    }
}
