// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage.provider;

import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package com.soundcloud.android.storage.provider:
//            ScContentProvider

class eryOperation extends eryOperation
{

    final ScContentProvider this$0;
    final String val$columns[];
    final String val$selection;
    final String val$selectionArgs[];
    final String val$sortOrder;
    final Uri val$uri;

    public Cursor execute()
    {
        return ScContentProvider.access$000(ScContentProvider.this, val$uri, val$columns, val$selection, val$selectionArgs, val$sortOrder);
    }

    public volatile Object execute()
    {
        return execute();
    }

    eryOperation(Uri uri2, 
            String as2[], String s2, String as3[], String s3)
    {
        this$0 = final_sccontentprovider;
        val$uri = uri2;
        val$columns = as2;
        val$selection = s2;
        val$selectionArgs = as3;
        val$sortOrder = s3;
        super(final_sccontentprovider, final_uri1, final_as, final_s, final_as1, String.this);
    }
}
