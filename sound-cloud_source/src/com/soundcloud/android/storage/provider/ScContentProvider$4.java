// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage.provider;

import android.content.ContentValues;
import android.net.Uri;

// Referenced classes of package com.soundcloud.android.storage.provider:
//            ScContentProvider

class val.whereArgs
    implements Operation
{

    final ScContentProvider this$0;
    final Uri val$uri;
    final ContentValues val$values;
    final String val$where;
    final String val$whereArgs[];

    public Integer execute()
    {
        return Integer.valueOf(ScContentProvider.access$300(ScContentProvider.this, val$uri, val$values, val$where, val$whereArgs));
    }

    public volatile Object execute()
    {
        return execute();
    }

    Operation()
    {
        this$0 = final_sccontentprovider;
        val$uri = uri1;
        val$values = contentvalues;
        val$where = s;
        val$whereArgs = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
