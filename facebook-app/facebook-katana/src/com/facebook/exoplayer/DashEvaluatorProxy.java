// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer;

import android.os.RemoteException;
import com.facebook.exoplayer.ipc.VideoPlayerMediaChunk;
import com.facebook.exoplayer.ipc.VideoPlayerServiceListener;
import com.facebook.exoplayer.ipc.VideoPlayerSession;
import com.facebook.exoplayer.ipc.VideoPlayerStreamEvaluation;
import com.facebook.exoplayer.ipc.VideoPlayerStreamFormat;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.FormatEvaluator;
import com.google.android.exoplayer.chunk.MediaChunk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.exoplayer:
//            VideoPlayerService

public class DashEvaluatorProxy
    implements FormatEvaluator
{

    private static final String a = com/facebook/exoplayer/DashEvaluatorProxy.getSimpleName();
    private final boolean b = false;
    private final VideoPlayerService c;
    private final VideoPlayerSession d;

    public DashEvaluatorProxy(VideoPlayerService videoplayerservice, VideoPlayerSession videoplayersession)
    {
        c = videoplayerservice;
        d = videoplayersession;
    }

    public final void a()
    {
        VideoPlayerServiceListener videoplayerservicelistener;
        videoplayerservicelistener = c.a(d);
        if (videoplayerservicelistener == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        videoplayerservicelistener.a();
        return;
        RemoteException remoteexception;
        remoteexception;
        (new StringBuilder("Caught exception when enable evaluator: ")).append(remoteexception.getCause());
        return;
    }

    public final void a(List list, long l, Format aformat[], com.google.android.exoplayer.chunk.FormatEvaluator.Evaluation evaluation)
    {
        VideoPlayerStreamFormat avideoplayerstreamformat[];
        int i;
        i = 0;
        (new StringBuilder("DashEvaluatorProxy evaluate with ")).append(aformat.length).append(" formats");
        avideoplayerstreamformat = new VideoPlayerStreamFormat[aformat.length];
        if (aformat.length != 1) goto _L2; else goto _L1
_L1:
        evaluation.c = aformat[0];
_L4:
        return;
_L2:
        HashMap hashmap;
        VideoPlayerServiceListener videoplayerservicelistener;
        hashmap = new HashMap();
        for (; i < aformat.length; i++)
        {
            Format format = aformat[i];
            (new StringBuilder("Format [")).append(format.a).append("]: ").append(format.b).append(" bitrate ").append(format.c / 1000).append("kbps ").append(format.d).append("x").append(format.e);
            avideoplayerstreamformat[i] = new VideoPlayerStreamFormat(format);
            hashmap.put(format.a, format);
        }

        videoplayerservicelistener = c.a(d);
        if (videoplayerservicelistener == null) goto _L4; else goto _L3
_L3:
        ArrayList arraylist;
        try
        {
            arraylist = new ArrayList();
            for (list = list.iterator(); list.hasNext(); arraylist.add(new VideoPlayerMediaChunk((MediaChunk)list.next()))) { }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            (new StringBuilder("Caught exception when do dash evalution: ")).append(list.getCause());
            return;
        }
        (new StringBuilder("evaluation format before evaluate: ")).append(evaluation.c);
        (new StringBuilder("evaluation queueSize before evaluate: ")).append(evaluation.a);
        list = new VideoPlayerStreamEvaluation();
        list.a = evaluation.a;
        if (evaluation.c != null)
        {
            list.c = new VideoPlayerStreamFormat(evaluation.c);
        }
        videoplayerservicelistener.a(arraylist, l, avideoplayerstreamformat, list);
        if (((VideoPlayerStreamEvaluation) (list)).c == null)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        evaluation.a = ((VideoPlayerStreamEvaluation) (list)).a;
        evaluation.b = ((VideoPlayerStreamEvaluation) (list)).b;
        evaluation.c = (Format)hashmap.get(((VideoPlayerStreamEvaluation) (list)).c.a);
_L6:
        (new StringBuilder("DashEvaluatorProxy choose ")).append(evaluation.c.a).append(" ").append(evaluation.c.c / 1000).append("kbps");
        return;
        evaluation.c = aformat[0];
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void b()
    {
        VideoPlayerServiceListener videoplayerservicelistener;
        videoplayerservicelistener = c.a(d);
        if (videoplayerservicelistener == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        videoplayerservicelistener.b();
        return;
        RemoteException remoteexception;
        remoteexception;
        (new StringBuilder("Caught exception when disable evaluator: ")).append(remoteexception.getCause());
        return;
    }

}
