// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.b;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            Operator

public interface f
{

    public abstract Object b(b b1, Object obj);

    public abstract Object b(Operator operator, MetadataField metadatafield, Object obj);

    public abstract Object b(Operator operator, List list);

    public abstract Object d(MetadataField metadatafield);

    public abstract Object d(MetadataField metadatafield, Object obj);

    public abstract Object j(Object obj);

    public abstract Object jd();
}
