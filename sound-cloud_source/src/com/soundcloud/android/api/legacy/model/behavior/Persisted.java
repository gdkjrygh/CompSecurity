// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.behavior;

import android.content.ContentValues;
import android.net.Uri;
import com.soundcloud.android.storage.provider.BulkInsertMap;

public interface Persisted
{

    public abstract ContentValues buildContentValues();

    public abstract Uri getBulkInsertUri();

    public abstract void putDependencyValues(BulkInsertMap bulkinsertmap);

    public abstract void putFullContentValues(BulkInsertMap bulkinsertmap);

    public abstract Uri toUri();
}
