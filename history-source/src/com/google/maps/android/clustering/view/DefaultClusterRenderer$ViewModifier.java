// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.view;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Set;

// Referenced classes of package com.google.maps.android.clustering.view:
//            DefaultClusterRenderer

private class <init> extends Handler
{

    private static final int RUN_TASK = 0;
    private static final int TASK_FINISHED = 1;
    private sendEmptyMessage mNextClusters;
    private boolean mViewModificationInProgress;
    final DefaultClusterRenderer this$0;

    public void handleMessage(Message message)
    {
        if (message.what != 1) goto _L2; else goto _L1
_L1:
        mViewModificationInProgress = false;
        if (mNextClusters != null)
        {
            sendEmptyMessage(0);
        }
_L4:
        return;
_L2:
        removeMessages(0);
        if (mViewModificationInProgress || mNextClusters == null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
        message = mNextClusters;
        mNextClusters = null;
        mViewModificationInProgress = true;
        this;
        JVM INSTR monitorexit ;
        message.tCallback(new Runnable() {

            final DefaultClusterRenderer.ViewModifier this$1;

            public void run()
            {
                sendEmptyMessage(1);
            }

            
            {
                this$1 = DefaultClusterRenderer.ViewModifier.this;
                super();
            }
        });
        message.tProjection(DefaultClusterRenderer.access$800(DefaultClusterRenderer.this).getProjection());
        message.tMapZoom(DefaultClusterRenderer.access$800(DefaultClusterRenderer.this).getCameraPosition().zoom);
        (new Thread(message)).start();
        return;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
    }

    public void queue(Set set)
    {
        this;
        JVM INSTR monitorenter ;
        mNextClusters = new nit>(DefaultClusterRenderer.this, set, null);
        this;
        JVM INSTR monitorexit ;
        sendEmptyMessage(0);
        return;
        set;
        this;
        JVM INSTR monitorexit ;
        throw set;
    }

    private _cls1.this._cls1()
    {
        this$0 = DefaultClusterRenderer.this;
        super();
        mViewModificationInProgress = false;
        mNextClusters = null;
    }

    mNextClusters(mNextClusters mnextclusters)
    {
        this();
    }
}
