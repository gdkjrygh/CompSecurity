// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.java.optional.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            ApiPostHolder

final class 
    implements f
{

    public final ModelCollection call(ModelCollection modelcollection)
    {
        Object obj = modelcollection.getCollection();
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Optional optional = ((ApiPostHolder)((Iterator) (obj)).next()).getPost();
            if (optional.isPresent())
            {
                arraylist.add(optional.get());
            }
        } while (true);
        return new ModelCollection(arraylist, modelcollection.getLinks());
    }

    public final volatile Object call(Object obj)
    {
        return call((ModelCollection)obj);
    }

    ()
    {
    }
}
