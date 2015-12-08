// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.util;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.b;
import com.google.android.gms.wearable.j;
import com.google.android.gms.wearable.l;
import com.google.android.gms.wearable.o;
import com.skype.android.app.wear.command.NodeResultCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.skype.android.app.wear.util:
//            WearMessageApiUtils

final class Result extends com.skype.android.app.wear.command.ult
{

    final Result this$1;

    public final Status getStatus()
    {
        return new Status(13, "Failed execution on some nodes.");
    }

    essedNodes(List list)
    {
        this$1 = this._cls1.this;
        super(list);
    }

    // Unreferenced inner class com/skype/android/app/wear/util/WearMessageApiUtils$1

/* anonymous class */
    static final class WearMessageApiUtils._cls1
        implements h
    {

        final List failedNodes = new ArrayList();
        int processedNodes;
        final c val$googleApiClient;
        final String val$messagePath;
        final NodeResultCallback val$resultCallback;

        public final volatile void onResult(g g)
        {
            onResult((com.google.android.gms.wearable.a.b)g);
        }

        public final void onResult(com.google.android.gms.wearable.a.b b1)
        {
            if (b1.getStatus().d())
            {
                b1 = b1.a().b();
                final l node;
                for (Iterator iterator = b1.iterator(); iterator.hasNext(); o.c.a(googleApiClient, node.a(), messagePath).a(b1. new WearMessageApiUtils._cls1._cls1()))
                {
                    node = (l)iterator.next();
                }

                if (b1.size() == 0)
                {
                    resultCallback.onResult(new WearMessageApiUtils._cls1._cls2(failedNodes));
                }
                return;
            } else
            {
                resultCallback.onResult(new WearMessageApiUtils._cls1._cls3(b1));
                return;
            }
        }

            
            {
                googleApiClient = c;
                messagePath = s;
                resultCallback = noderesultcallback;
                super();
                processedNodes = 0;
            }

        // Unreferenced inner class com/skype/android/app/wear/util/WearMessageApiUtils$1$2

/* anonymous class */
        final class WearMessageApiUtils._cls1._cls2 extends com.skype.android.app.wear.command.NodeResultCallback.NodeResult
        {

            final WearMessageApiUtils._cls1 this$0;

            public final Status getStatus()
            {
                return new Status(13, "No reachable nodes.");
            }

                    
                    {
                        this$0 = WearMessageApiUtils._cls1.this;
                        super(list);
                    }
        }


        // Unreferenced inner class com/skype/android/app/wear/util/WearMessageApiUtils$1$3

/* anonymous class */
        final class WearMessageApiUtils._cls1._cls3 extends com.skype.android.app.wear.command.NodeResultCallback.NodeResult
        {

            final WearMessageApiUtils._cls1 this$0;
            final com.google.android.gms.wearable.a.b val$getCapabilityResult;

            public final Status getStatus()
            {
                return getCapabilityResult.getStatus();
            }

                    
                    {
                        this$0 = WearMessageApiUtils._cls1.this;
                        getCapabilityResult = b1;
                        super(final_list);
                    }
        }

    }


    // Unreferenced inner class com/skype/android/app/wear/util/WearMessageApiUtils$1$1

/* anonymous class */
    final class WearMessageApiUtils._cls1._cls1
        implements h
    {

        final WearMessageApiUtils._cls1 this$0;
        final Set val$connectedNodes;
        final l val$node;

        private void notifyCompletion()
        {
            if (failedNodes.size() == 0)
            {
                resultCallback.onResult(new WearMessageApiUtils._cls1._cls1._cls1(failedNodes));
                return;
            } else
            {
                resultCallback.onResult(new WearMessageApiUtils._cls1._cls1._cls2(failedNodes));
                return;
            }
        }

        public final volatile void onResult(g g)
        {
            onResult((com.google.android.gms.wearable.j.b)g);
        }

        public final void onResult(com.google.android.gms.wearable.j.b b)
        {
            if (!b.getStatus().d())
            {
                failedNodes.add(node);
            }
            resultCallback.onNodeResult(new com.skype.android.app.wear.command.NodeWearCommand.NodeMessageResult(b, node), node);
            b = WearMessageApiUtils._cls1.this;
            b.processedNodes = ((WearMessageApiUtils._cls1) (b)).processedNodes + 1;
            if (processedNodes == connectedNodes.size())
            {
                notifyCompletion();
            }
            return;
            b;
            WearMessageApiUtils._cls1 _lcls1 = WearMessageApiUtils._cls1.this;
            _lcls1.processedNodes = _lcls1.processedNodes + 1;
            if (processedNodes == connectedNodes.size())
            {
                notifyCompletion();
            }
            throw b;
        }

            
            {
                this$0 = final__pcls1;
                node = l;
                connectedNodes = Set.this;
                super();
            }

        // Unreferenced inner class com/skype/android/app/wear/util/WearMessageApiUtils$1$1$1

/* anonymous class */
        final class WearMessageApiUtils._cls1._cls1._cls1 extends com.skype.android.app.wear.command.NodeResultCallback.NodeResult
        {

            final WearMessageApiUtils._cls1._cls1 this$1;

            public final Status getStatus()
            {
                return new Status(0);
            }

                    
                    {
                        this$1 = WearMessageApiUtils._cls1._cls1.this;
                        super(list);
                    }
        }

    }

}
