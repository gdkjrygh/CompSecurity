// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage.provider;

import android.net.Uri;
import java.util.Arrays;

// Referenced classes of package com.soundcloud.android.storage.provider:
//            ScContentProvider

private abstract class sortOrder
    implements sortOrder
{

    private final String columns[];
    private final String selection;
    private final String selectionArgs[];
    private final String sortOrder;
    final ScContentProvider this$0;
    private final Uri uri;

    public String toString()
    {
        return (new StringBuilder("DbOperation{uri=")).append(uri).append(", columns=").append(Arrays.toString(columns)).append(", selection='").append(selection).append('\'').append(", selectionArgs=").append(Arrays.toString(selectionArgs)).append(", sortOrder='").append(sortOrder).append('\'').append('}').toString();
    }

    public (Uri uri1, String as[], String s, String as1[], String s1)
    {
        this$0 = ScContentProvider.this;
        super();
        uri = uri1;
        columns = as;
        selection = s;
        selectionArgs = as1;
        sortOrder = s1;
    }
}
