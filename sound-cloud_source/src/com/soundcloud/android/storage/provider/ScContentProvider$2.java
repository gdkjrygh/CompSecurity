// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage.provider;

import android.content.ContentValues;
import android.net.Uri;

// Referenced classes of package com.soundcloud.android.storage.provider:
//            ScContentProvider

class val.values
    implements Operation
{

    final ScContentProvider this$0;
    final Uri val$uri;
    final ContentValues val$values;

    public Uri execute()
    {
        return ScContentProvider.access$100(ScContentProvider.this, val$uri, val$values);
    }

    public volatile Object execute()
    {
        return execute();
    }

    Operation()
    {
        this$0 = final_sccontentprovider;
        val$uri = uri1;
        val$values = ContentValues.this;
        super();
    }
}
