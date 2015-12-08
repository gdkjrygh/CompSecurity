// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.util.RandomPercentageGenerator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.calling:
//            CallQualityFeedbackManager, CallQualityFeedbackRating

private static final class te extends RandomPercentageGenerator
{

    public final com.skype.android.util.ult getOrAdd(Integer integer)
    {
        com.skype.android.util.ult ult = super.getOrAdd(integer);
        if (ult.a())
        {
            return ult;
        } else
        {
            remove(integer);
            return null;
        }
    }

    public final volatile com.skype.android.util.ult getOrAdd(Object obj)
    {
        return getOrAdd((Integer)obj);
    }

    public final Collection getPendingUpload()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getValues().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.skype.android.util.ult ult = (com.skype.android.util.ult)iterator.next();
            CallQualityFeedbackRating callqualityfeedbackrating = (CallQualityFeedbackRating)ult.b();
            if (ult.a() && callqualityfeedbackrating.getState() != te.UPLOADED)
            {
                arraylist.add(callqualityfeedbackrating);
            }
        } while (true);
        return arraylist;
    }

    public final void remove(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext(); remove(Integer.valueOf(((Integer)collection.next()).intValue()))) { }
    }

    public te()
    {
        super(10);
    }
}
