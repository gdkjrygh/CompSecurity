// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.data.ConcatenatedDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui:
//            MultiColumnDataBufferAdapter

public abstract class MultiColumnMergedDataBufferAdapter extends MultiColumnDataBufferAdapter
{

    public MultiColumnMergedDataBufferAdapter(Context context)
    {
        super(context, 0x7f0e0013);
    }

    public void notifyDataSetChanged()
    {
        DataBuffer databuffer = getDataBuffer();
        if (databuffer != null && (databuffer instanceof ConcatenatedDataBuffer))
        {
            ((ConcatenatedDataBuffer)databuffer).computeCounts();
        }
        super.notifyDataSetChanged();
    }

    public transient void setDataBuffers(DataBuffer adatabuffer[])
    {
        ConcatenatedDataBuffer concatenateddatabuffer;
        int i;
        int j;
        concatenateddatabuffer = new ConcatenatedDataBuffer();
        i = 0;
        j = adatabuffer.length;
_L3:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        obj = adatabuffer[i];
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        concatenateddatabuffer;
        JVM INSTR monitorenter ;
        Bundle bundle;
        if (!concatenateddatabuffer.mDataBufferList.isEmpty())
        {
            break MISSING_BLOCK_LABEL_83;
        }
        concatenateddatabuffer.mBundle = new Bundle();
        bundle = ((DataBuffer) (obj)).getMetadata();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        concatenateddatabuffer.mBundle.putString("prev_page_token", bundle.getString("prev_page_token"));
        concatenateddatabuffer.mDataBufferList.add(obj);
        concatenateddatabuffer.computeCounts();
        obj = ((DataBuffer) (obj)).getMetadata();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        concatenateddatabuffer.mBundle.putString("next_page_token", ((Bundle) (obj)).getString("next_page_token"));
_L1:
        concatenateddatabuffer;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_150;
        concatenateddatabuffer.mBundle.remove("next_page_token");
          goto _L1
        adatabuffer;
        concatenateddatabuffer;
        JVM INSTR monitorexit ;
        throw adatabuffer;
        super.setDataBuffer(concatenateddatabuffer);
        return;
        i++;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
