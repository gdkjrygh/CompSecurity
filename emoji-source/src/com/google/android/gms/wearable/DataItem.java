// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.data.Freezable;
import java.util.Map;

public interface DataItem
    extends Freezable
{

    public abstract Map getAssets();

    public abstract byte[] getData();

    public abstract Uri getUri();

    public abstract DataItem setData(byte abyte0[]);
}
