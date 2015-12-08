// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence;

import com.google.gson.Gson;
import me.lyft.android.LyftApplication;
import me.lyft.android.persistence.checkout.CheckoutStateStorage;
import me.lyft.android.persistence.checkout.ICheckoutStateStorage;
import me.lyft.android.persistence.driverdocuments.DriverDocumentsStorage;
import me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage;
import me.lyft.android.persistence.expensenote.ExpenseNoteStorage;
import me.lyft.android.persistence.expensenotes.IExpenseNoteStorage;
import me.lyft.android.persistence.landing.ISignUpUserRepository;
import me.lyft.android.persistence.landing.SignUpUserRepository;
import me.lyft.android.persistence.rating.IRatingStateStorage;
import me.lyft.android.persistence.rating.RatingStateStorage;

// Referenced classes of package me.lyft.android.persistence:
//            PreferencesSimpleStorage, ISimpleStorage

public class PersistenceModule
{

    public PersistenceModule()
    {
    }

    public ICheckoutStateStorage provideCheckoutStateStorage(LyftApplication lyftapplication)
    {
        return new CheckoutStateStorage(lyftapplication);
    }

    public IDriverDocumentsStorage provideDriverDocumentsStorage(LyftApplication lyftapplication, Gson gson)
    {
        return new DriverDocumentsStorage(lyftapplication, gson);
    }

    public IExpenseNoteStorage provideExpenseNoteStorage(LyftApplication lyftapplication)
    {
        return new ExpenseNoteStorage(lyftapplication);
    }

    public IRatingStateStorage provideRatingStateStorage(LyftApplication lyftapplication)
    {
        return new RatingStateStorage(lyftapplication);
    }

    public ISignUpUserRepository provideSignUpUserRepository(ISimpleStorage isimplestorage)
    {
        return new SignUpUserRepository(isimplestorage);
    }

    public ISimpleStorage provideSimpleStorage(LyftApplication lyftapplication, Gson gson)
    {
        return new PreferencesSimpleStorage(lyftapplication, gson);
    }
}
