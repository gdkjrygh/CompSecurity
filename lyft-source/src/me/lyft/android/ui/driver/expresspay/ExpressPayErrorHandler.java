// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.content.res.Resources;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.expresspay.ExpressPayException;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            IExpressPayErrorHandler

public class ExpressPayErrorHandler
    implements IExpressPayErrorHandler
{

    private IConstantsProvider constantsProvider;
    private DialogFlow dialogFlow;
    private Resources resources;
    private IViewErrorHandler viewErrorHandler;

    public ExpressPayErrorHandler(IViewErrorHandler iviewerrorhandler, Resources resources1, DialogFlow dialogflow, IConstantsProvider iconstantsprovider)
    {
        viewErrorHandler = iviewerrorhandler;
        resources = resources1;
        dialogFlow = dialogflow;
        constantsProvider = iconstantsprovider;
    }

    private void showErrorDialog(ExpressPayException expresspayexception)
    {
        Constants constants;
        String s;
        byte byte0;
        constants = constantsProvider.getConstants();
        s = expresspayexception.getReason();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 56
    //                   -2119319195: 126
    //                   -309833220: 111
    //                   374793904: 96;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_126;
_L5:
        switch (byte0)
        {
        default:
            viewErrorHandler.handle(expresspayexception);
            return;

        case 0: // '\0'
            dialogFlow.show(new ExpressPayDialogs.ExpressPayErrorDialog(expresspayexception.getMessage(), 0x7f0200f4, resources.getString(0x7f0701ee), constants.getExpressPayAccountIncompleteLink()));
            return;

        case 1: // '\001'
            dialogFlow.show(new ExpressPayDialogs.ExpressPayErrorDialog(expresspayexception.getMessage(), 0x7f0200f4, resources.getString(0x7f0701ee), constants.getExpressPayIneligibleLink()));
            return;

        case 2: // '\002'
            dialogFlow.show(new ExpressPayDialogs.InsufficientEarningsExpressPayDialog(expresspayexception.getMessage(), 0x7f0200f2, resources.getString(0x7f070172), resources.getString(0x7f0701ee), constants.getExpressPayInsufficientEarningsLink()));
            break;
        }
        break MISSING_BLOCK_LABEL_251;
_L4:
        if (s.equals("account_incomplete"))
        {
            byte0 = 0;
        }
          goto _L5
_L3:
        if (s.equals("ineligible"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("insufficient_earnings"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    public void handleExpressPayError(Throwable throwable)
    {
        if (throwable instanceof ExpressPayException)
        {
            showErrorDialog((ExpressPayException)throwable);
            return;
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }
}
