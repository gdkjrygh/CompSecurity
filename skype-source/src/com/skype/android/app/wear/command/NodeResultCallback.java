// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.l;
import java.util.Collections;
import java.util.List;

public interface NodeResultCallback
    extends h
{
    public static abstract class NodeResult
        implements g
    {

        private final List failedNodes;

        public List getFailedNodes()
        {
            return Collections.unmodifiableList(failedNodes);
        }

        public NodeResult(List list)
        {
            failedNodes = list;
        }
    }


    public abstract void onNodeResult(NodeWearCommand.NodeMessageResult nodemessageresult, l l);
}
