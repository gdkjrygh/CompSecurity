// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import java.util.ArrayList;
import java.util.List;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.providers:
//            ContactsProvider

public class <init>
{

    final List observables;
    final ContactsProvider this$0;

    public <init> companies()
    {
        observables.add(companyObservable);
        return this;
    }

    public bservable emails()
    {
        observables.add(emailsObservable);
        return this;
    }

    public Observable observe()
    {
        return Observable.merge(observables).toSortedList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public observables phones()
    {
        observables.add(phonesObservable);
        return this;
    }

    private ()
    {
        this$0 = ContactsProvider.this;
        super();
        observables = new ArrayList(4);
    }

    observables(observables observables1)
    {
        this();
    }
}
