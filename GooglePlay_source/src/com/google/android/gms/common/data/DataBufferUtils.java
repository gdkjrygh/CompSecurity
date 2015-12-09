// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public final class DataBufferUtils
{

    public static boolean hasData(DataBuffer databuffer)
    {
        return databuffer != null && databuffer.getCount() > 0;
    }

    public static boolean hasNextPage(DataBuffer databuffer)
    {
        databuffer = databuffer.getMetadata();
        return databuffer != null && databuffer.getString("next_page_token") != null;
    }

    public static boolean hasPrevPage(DataBuffer databuffer)
    {
        databuffer = databuffer.getMetadata();
        return databuffer != null && databuffer.getString("prev_page_token") != null;
    }
}
