// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public static interface Type
    extends Freezable
{
    public static final class Type
    {

        public static final int CONTRIBUTOR = 6;
        public static final int OTHER = 4;
        public static final int OTHER_PROFILE = 5;
        public static final int WEBSITE = 7;

        private Type()
        {
        }
    }


    public abstract String getLabel();

    public abstract int getType();

    public abstract String getValue();

    public abstract boolean hasLabel();

    public abstract boolean hasType();

    public abstract boolean hasValue();
}
