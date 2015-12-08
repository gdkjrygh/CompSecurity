// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Iterator;
import java.util.Set;

final class d
{

    static b a(MetadataBundle metadatabundle)
    {
        metadatabundle = metadatabundle.a();
        if (metadatabundle.size() != 1)
        {
            throw new IllegalArgumentException("bundle should have exactly 1 populated field");
        } else
        {
            return (b)metadatabundle.iterator().next();
        }
    }
}
