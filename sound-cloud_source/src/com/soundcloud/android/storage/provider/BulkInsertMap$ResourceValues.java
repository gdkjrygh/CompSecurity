// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage.provider;

import android.content.ContentValues;

// Referenced classes of package com.soundcloud.android.storage.provider:
//            BulkInsertMap

public class <init>
{

    ContentValues contentValues;
    final BulkInsertMap this$0;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (<init>)obj;
            if (contentValues != null ? !contentValues.containsKey("_id") || !((contentValues) (obj)).contentValues.containsKey("_id") || contentValues.get("_id") != ((contentValues) (obj)).contentValues.get("_id") : ((contentValues) (obj)).contentValues != null)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (contentValues != null)
        {
            if (contentValues.containsKey("_id"))
            {
                return contentValues.getAsLong("_id").hashCode();
            } else
            {
                return contentValues.hashCode();
            }
        } else
        {
            return 0;
        }
    }

    private (ContentValues contentvalues)
    {
        this$0 = BulkInsertMap.this;
        super();
        contentValues = contentvalues;
    }

    contentValues(ContentValues contentvalues, contentValues contentvalues1)
    {
        this(contentvalues);
    }
}
