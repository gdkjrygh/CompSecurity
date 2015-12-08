// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.ParticipantImpl;
import com.skype.SkyLib;
import com.skype.Video;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.calling:
//            b, a, d, ViewCallback, 
//            c, CameraControl

public class VideoCall
    implements android.os.Handler.Callback
{

    static final Logger a = Logger.getLogger("SKV");
    private static final Map b = new ConcurrentHashMap();
    private SkyLib c;
    private Conversation d;
    private b e;
    private List f;
    private Handler g;
    private c h;
    private ViewCallback i;

    private VideoCall(SkyLib skylib, Conversation conversation)
    {
        c = skylib;
        d = conversation;
        e = new b(this);
        conversation.addListener(e);
        conversation.addListener(e);
        g = new Handler(Looper.getMainLooper(), this);
        f = new CopyOnWriteArrayList();
        h = h();
        f.add(h);
        i();
    }

    static Conversation a(VideoCall videocall)
    {
        return videocall.d;
    }

    public static VideoCall a(SkyLib skylib, Conversation conversation)
    {
        VideoCall videocall1 = (VideoCall)b.get(Integer.valueOf(conversation.getObjectID()));
        VideoCall videocall = videocall1;
        if (videocall1 == null)
        {
            videocall = new VideoCall(skylib, conversation);
            b.put(Integer.valueOf(conversation.getObjectID()), videocall);
        }
        return videocall;
    }

    private a a(int i1)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.a().getObjectID() == i1)
            {
                return a1;
            }
        }

        return null;
    }

    private a b(Video video)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.b().contains(video))
            {
                return a1;
            }
        }

        return null;
    }

    static b b(VideoCall videocall)
    {
        return videocall.e;
    }

    static List c(VideoCall videocall)
    {
        return videocall.f;
    }

    static Map l()
    {
        return b;
    }

    final Conversation a()
    {
        return d;
    }

    final void a(Participant participant)
    {
        participant = a(participant.getObjectID());
        if (participant != null && (participant instanceof d))
        {
            ((d)participant).k();
        }
    }

    final void a(Video video)
    {
        a a1 = b(video);
        if (a1 != null)
        {
            a.info((new StringBuilder()).append(a1).append(" status change: ").append(video.getStatusProp()).toString());
            a1.a(video);
        }
        g.removeMessages(1);
        g.sendMessage(g.obtainMessage(1, video));
    }

    public final void a(ViewCallback viewcallback)
    {
        if (i != null && i != viewcallback && viewcallback != null)
        {
            i.c();
        }
        i = viewcallback;
    }

    final SkyLib b()
    {
        return c;
    }

    final void b(Participant participant)
    {
        participant = a(participant.getObjectID());
        if (participant != null && (participant instanceof d))
        {
            participant.c();
            g.sendMessage(g.obtainMessage(2, participant));
        }
    }

    final b c()
    {
        return e;
    }

    final void c(Participant participant)
    {
        participant = a(participant.getObjectID());
        if (participant != null && (participant instanceof d))
        {
            ((d)participant).l();
        }
    }

    final Handler d()
    {
        return g;
    }

    public final boolean e()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            if (((a)iterator.next()).h())
            {
                return true;
            }
        }

        return false;
    }

    final Collection f()
    {
        return f;
    }

    final boolean g()
    {
        return d.getTypeProp() == com.skype.Conversation.TYPE.DIALOG;
    }

    public final c h()
    {
        if (h == null)
        {
            int ai[] = d.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.MYSELF).m_participantObjectIDList;
            int j1 = ai.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                int k1 = ai[i1];
                ParticipantImpl participantimpl = new ParticipantImpl();
                c.getParticipant(k1, participantimpl);
                participantimpl.addListener(e);
                participantimpl.addListener(e);
                boolean flag;
                if (d.getLiveCallTechnologyProp() == com.skype.Conversation.CALL_TECHNOLOGY.CALL_NGC)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                h = new c(this, participantimpl, flag);
                i1++;
            }
        }
        return h;
    }

    public boolean handleMessage(Message message)
    {
        if (message == null)
        {
            return false;
        }
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            message = (Video)message.obj;
            Object obj = b(message);
            if (i != null && obj != null)
            {
                obj = ((a) (obj)).a();
                i.a(((Participant) (obj)).getIdentityProp(), message.getStatusProp());
            }
            return true;

        case 2: // '\002'
            message = (a)message.obj;
            break;
        }
        if (i != null)
        {
            i.a(message);
        }
        return true;
    }

    final void i()
    {
        com.skype.Conversation.GetParticipants_Result getparticipants_result = d.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS);
        int ai[] = getparticipants_result.m_participantObjectIDList;
        int k1 = ai.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            int i2 = ai[i1];
            if (a(i2) == null)
            {
                Object obj1 = new ParticipantImpl();
                c.getParticipant(i2, ((Participant) (obj1)));
                ((Participant) (obj1)).addListener(e);
                ((Participant) (obj1)).addListener(e);
                obj1 = new d(this, ((Participant) (obj1)));
                f.add(obj1);
            }
        }

        Object obj = new ArrayList();
        Iterator iterator1 = f.iterator();
label0:
        do
        {
            if (iterator1.hasNext())
            {
                a a1 = (a)iterator1.next();
                boolean flag = false;
                int ai1[] = getparticipants_result.m_participantObjectIDList;
                int j2 = ai1.length;
                int j1 = 0;
                do
                {
label1:
                    {
                        int l1 = ((flag) ? 1 : 0);
                        if (j1 < j2)
                        {
                            l1 = ai1[j1];
                            if (a1.a().getObjectID() != l1)
                            {
                                break label1;
                            }
                            l1 = 1;
                        }
                        if (l1 == 0)
                        {
                            ((List) (obj)).add(a1);
                        }
                        continue label0;
                    }
                    j1++;
                } while (true);
            }
            for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); ((Participant) (obj)).removeListener(e))
            {
                obj = ((a)iterator.next()).a();
                ((Participant) (obj)).removeListener(e);
            }

            return;
        } while (true);
    }

    public final CameraControl j()
    {
        return h;
    }

    final void k()
    {
        if (d.getLocalLiveStatusProp() == com.skype.Conversation.LOCAL_LIVESTATUS.NONE)
        {
            g.post(new Runnable() {

                final VideoCall a;

                public final void run()
                {
                    VideoCall.l().remove(Integer.valueOf(VideoCall.a(a).getObjectID()));
                    VideoCall.a(a).removeListener(VideoCall.b(a));
                    VideoCall.a(a).removeListener(VideoCall.b(a));
                    Participant participant;
                    for (Iterator iterator1 = VideoCall.c(a).iterator(); iterator1.hasNext(); participant.removeListener(VideoCall.b(a)))
                    {
                        participant = ((a)iterator1.next()).a();
                        participant.removeListener(VideoCall.b(a));
                    }

                }

            
            {
                a = VideoCall.this;
                super();
            }
            });
        }
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((a)iterator.next()).a(d)) { }
    }

}
