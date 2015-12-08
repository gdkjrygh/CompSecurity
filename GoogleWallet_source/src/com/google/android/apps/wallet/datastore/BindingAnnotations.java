// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.apps.wallet.datastore:
//            Table

public interface BindingAnnotations
    extends Annotation
{
    public static interface DatabaseName
        extends Annotation
    {
    }

    public static interface DatabaseTable
        extends Annotation
    {

        public abstract Table value();
    }

    public static interface DatabaseVersion
        extends Annotation
    {
    }

}
