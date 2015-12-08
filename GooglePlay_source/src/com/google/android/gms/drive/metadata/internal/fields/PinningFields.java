// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal.fields;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.BooleanMetadataField;
import com.google.android.gms.drive.metadata.internal.IntegerMetadataField;

public final class PinningFields
{

    public static final MetadataField CONTENT_AVAILABILITY = new IntegerMetadataField("contentAvailability");
    public static final MetadataField IS_PINNABLE = new BooleanMetadataField("isPinnable", 0x419ce0);

}
