// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentUtils, AppContentTupleRef, AppContentTuple

static final class val.bundle
    implements pContentRunner
{

    final Bundle val$bundle;
    final DataHolder val$childHolder;

    public final void append(ArrayList arraylist, int i)
    {
        arraylist = new AppContentTupleRef(val$childHolder, i);
        val$bundle.putString(arraylist.getName(), arraylist.getValue());
    }

    (DataHolder dataholder, Bundle bundle1)
    {
        val$childHolder = dataholder;
        val$bundle = bundle1;
        super();
    }
}
