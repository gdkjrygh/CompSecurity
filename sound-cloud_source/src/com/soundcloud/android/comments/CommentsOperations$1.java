// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.api.legacy.model.PublicApiComment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.comments:
//            Comment

final class mmentsCollection
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((mmentsCollection)obj);
    }

    public final List call(mmentsCollection mmentscollection)
    {
        ArrayList arraylist = new ArrayList(50);
        for (mmentscollection = mmentscollection.iterator(); mmentscollection.hasNext(); arraylist.add(new Comment((PublicApiComment)mmentscollection.next()))) { }
        return arraylist;
    }

    mmentsCollection()
    {
    }
}
