// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.FieldRegistry;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class FilterUtilities
{

    static MetadataField getOnlyFieldOrThrow(MetadataBundle metadatabundle)
    {
        HashSet hashset = new HashSet();
        for (metadatabundle = metadatabundle.mValueBundle.keySet().iterator(); metadatabundle.hasNext(); hashset.add(FieldRegistry.getFieldByName((String)metadatabundle.next()))) { }
        if (hashset.size() != 1)
        {
            throw new IllegalArgumentException("bundle should have exactly 1 populated field");
        } else
        {
            return (MetadataField)hashset.iterator().next();
        }
    }
}
