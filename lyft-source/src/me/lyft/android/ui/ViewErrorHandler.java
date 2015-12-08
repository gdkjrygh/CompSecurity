// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.res.Resources;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.ExceptionUtils;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.User;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.events.GeneralErrorDialogResultEvent;
import me.lyft.android.infrastructure.lyft.LyftApiException;

// Referenced classes of package me.lyft.android.ui:
//            IViewErrorHandler

public class ViewErrorHandler
    implements IViewErrorHandler
{

    private final IDefaultErrorHandler defaultErrorHandler;
    private final DialogFlow dialogFlow;
    private final Resources resources;
    private final IUserProvider userProvider;

    public ViewErrorHandler(IDefaultErrorHandler idefaulterrorhandler, DialogFlow dialogflow, Resources resources1, IUserProvider iuserprovider)
    {
        defaultErrorHandler = idefaulterrorhandler;
        dialogFlow = dialogflow;
        resources = resources1;
        userProvider = iuserprovider;
    }

    public boolean handle(Throwable throwable)
    {
        if (defaultErrorHandler.handle(throwable))
        {
            return true;
        }
        Object obj;
        if (throwable instanceof LyftApiException)
        {
            obj = ((LyftApiException)throwable).getLyftErrorMessage();
            throwable = ((Throwable) (obj));
            if (Strings.isNullOrEmpty(((String) (obj))))
            {
                throwable = resources.getString(0x7f07020b);
            }
            Object obj1 = null;
            obj = throwable;
            throwable = obj1;
        } else
        if (ExceptionUtils.isNetworkException(throwable))
        {
            throwable = resources.getString(0x7f0700c3);
            obj = resources.getString(0x7f0700c2);
        } else
        {
            obj = resources.getString(0x7f07037b);
            String s = resources.getString(0x7f07037a, new Object[] {
                throwable.getClass().getSimpleName()
            });
            throwable = ((Throwable) (obj));
            obj = s;
        }
        showErrorDialog(throwable, ((String) (obj)));
        return true;
    }

    protected void showErrorDialog(String s, String s1)
    {
        s = (new Dialogs.AlertDialog((new StringBuilder()).append("generic_error_dialog_").append((String)Objects.firstNonNull(new String[] {
            s, s1, "null"
        })).toString())).setDialogEventClass(me/lyft/android/events/GeneralErrorDialogResultEvent).setTitle(s).addPositiveButton(resources.getString(0x7f070212)).setMessage(s1);
        if (userProvider.getUser().isInDriverMode())
        {
            s.setSound(2);
        }
        dialogFlow.show(s);
    }
}
