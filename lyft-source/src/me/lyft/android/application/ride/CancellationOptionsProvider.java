// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.ReactiveProperty;
import rx.Observable;

// Referenced classes of package me.lyft.android.application.ride:
//            ICancellationOptionsProvider

public class CancellationOptionsProvider
    implements ICancellationOptionsProvider
{

    private Map cancellationIdDisplayMap;
    private IConstantsProvider constantsProvider;
    private ReactiveProperty currentCancellationOptionsSubject;

    public CancellationOptionsProvider(IConstantsProvider iconstantsprovider)
    {
        cancellationIdDisplayMap = new HashMap();
        currentCancellationOptionsSubject = ReactiveProperty.create();
        constantsProvider = iconstantsprovider;
    }

    private void updateOptions(List list)
    {
        CancellationOption cancellationoption;
        for (Iterator iterator = constantsProvider.getConstants().getCancellationOptions().iterator(); iterator.hasNext(); cancellationIdDisplayMap.put(cancellationoption.getId(), cancellationoption))
        {
            cancellationoption = (CancellationOption)iterator.next();
        }

        ArrayList arraylist = new ArrayList(list.size());
        String s;
        for (list = list.iterator(); list.hasNext(); arraylist.add(cancellationIdDisplayMap.get(s)))
        {
            s = (String)list.next();
        }

        if (arraylist.isEmpty())
        {
            arraylist.add(CancellationOption.DEFAULT_CANCEL_OPTION);
        }
        currentCancellationOptionsSubject.onNext(arraylist);
    }

    public List getCancellationOptions()
    {
        return (List)currentCancellationOptionsSubject.get();
    }

    public Observable observeCancellationOptionChange()
    {
        return currentCancellationOptionsSubject.asObservable().map(Unit.func1());
    }

    public void updateCancellationOptions(List list)
    {
        updateOptions(list);
    }
}
