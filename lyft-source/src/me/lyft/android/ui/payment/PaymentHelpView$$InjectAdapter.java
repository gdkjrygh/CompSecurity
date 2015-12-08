// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentHelpView

public final class  extends Binding
    implements MembersInjector
{

    private Binding lyftPreferences;
    private Binding userSession;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/payment/PaymentHelpView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/payment/PaymentHelpView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(lyftPreferences);
        set1.add(userSession);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PaymentHelpView)obj);
    }

    public void injectMembers(PaymentHelpView paymenthelpview)
    {
        paymenthelpview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        paymenthelpview.userSession = (IUserSession)userSession.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.PaymentHelpView", false, me/lyft/android/ui/payment/PaymentHelpView);
    }
}
