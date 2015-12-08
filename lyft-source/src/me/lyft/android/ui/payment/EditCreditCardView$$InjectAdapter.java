// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.payment.IChargeAccountsProvider;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditCreditCardView

public final class  extends Binding
    implements MembersInjector
{

    private Binding chargeAccountsProvider;
    private Binding supertype;

    public void attach(Linker linker)
    {
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/ui/payment/EditCreditCardView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.payment.BaseCreditCardView", me/lyft/android/ui/payment/EditCreditCardView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(chargeAccountsProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EditCreditCardView)obj);
    }

    public void injectMembers(EditCreditCardView editcreditcardview)
    {
        editcreditcardview.chargeAccountsProvider = (IChargeAccountsProvider)chargeAccountsProvider.get();
        supertype.injectMembers(editcreditcardview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.EditCreditCardView", false, me/lyft/android/ui/payment/EditCreditCardView);
    }
}
