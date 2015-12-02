// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import android.os.Bundle;
import com.facebook.analytics.cn;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.s;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.i;
import com.facebook.http.protocol.j;
import com.facebook.http.protocol.y;
import com.facebook.http.protocol.z;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.SendError;
import com.facebook.messages.model.threads.d;
import com.facebook.orca.j.c;
import com.facebook.orca.photos.b.k;
import com.facebook.orca.photos.b.m;
import com.facebook.orca.photos.b.n;
import com.facebook.orca.protocol.methods.SendBroadcastMethod;
import com.facebook.orca.protocol.methods.SendWebrtcMessageMethod;
import com.facebook.orca.protocol.methods.ab;
import com.facebook.orca.protocol.methods.ac;
import com.facebook.orca.protocol.methods.ae;
import com.facebook.orca.protocol.methods.af;
import com.facebook.orca.protocol.methods.aj;
import com.facebook.orca.protocol.methods.al;
import com.facebook.orca.protocol.methods.am;
import com.facebook.orca.protocol.methods.ao;
import com.facebook.orca.protocol.methods.ar;
import com.facebook.orca.protocol.methods.au;
import com.facebook.orca.protocol.methods.aw;
import com.facebook.orca.protocol.methods.ax;
import com.facebook.orca.protocol.methods.ay;
import com.facebook.orca.protocol.methods.az;
import com.facebook.orca.protocol.methods.f;
import com.facebook.orca.protocol.methods.h;
import com.facebook.orca.protocol.methods.o;
import com.facebook.orca.protocol.methods.v;
import com.facebook.orca.protocol.methods.w;
import com.facebook.orca.server.AddMembersParams;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.DeleteThreadParams;
import com.facebook.orca.server.FetchGroupThreadsParams;
import com.facebook.orca.server.FetchGroupThreadsResult;
import com.facebook.orca.server.FetchMessageResult;
import com.facebook.orca.server.FetchMoreMessagesParams;
import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.server.FetchMoreThreadsParams;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.server.FetchMultipleThreadsParams;
import com.facebook.orca.server.FetchMultipleThreadsResult;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.ModifyThreadParams;
import com.facebook.orca.server.NewMessageResult;
import com.facebook.orca.server.RemoveMemberParams;
import com.facebook.orca.server.SendBroadcastResult;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.facebook.orca.server.SetSettingsParams;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.ai;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.push.mqtt.bu;
import com.facebook.push.mqtt.bw;
import com.facebook.push.mqtt.bx;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.hq;
import com.google.common.base.Objects;
import com.google.common.base.Throwables;
import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.protocol:
//            c, b

public class a extends com.facebook.orca.server.a
    implements e
{

    private static final Class a = com/facebook/orca/protocol/a;
    private static final l b = new l();
    private static final l c = new l();
    private final az A;
    private final ae B;
    private final cn C;
    private final bx D;
    private final javax.inject.a E;
    private final com.facebook.common.time.a F;
    private final com.facebook.ui.media.b.a G;
    private final c H;
    private final k I;
    private final javax.inject.a J;
    private final i d;
    private final com.facebook.orca.protocol.methods.n e;
    private final com.facebook.orca.protocol.methods.l f;
    private final com.facebook.orca.protocol.methods.j g;
    private final o h;
    private final com.facebook.orca.protocol.methods.s i;
    private final com.facebook.orca.protocol.methods.i j;
    private final al k;
    private final SendWebrtcMessageMethod l;
    private final com.facebook.orca.protocol.methods.k m;
    private final com.facebook.orca.protocol.methods.a n;
    private final com.facebook.orca.protocol.methods.e o;
    private final SendBroadcastMethod p;
    private final ab q;
    private final af r;
    private final w s;
    private final h t;
    private final com.facebook.orca.protocol.methods.g u;
    private final ay v;
    private final aw w;
    private final v x;
    private final ax y;
    private final ao z;

    public a(i i1, com.facebook.orca.protocol.methods.n n1, com.facebook.orca.protocol.methods.l l1, com.facebook.orca.protocol.methods.j j1, o o1, com.facebook.orca.protocol.methods.s s1, com.facebook.orca.protocol.methods.i k1, 
            al al, SendWebrtcMessageMethod sendwebrtcmessagemethod, com.facebook.orca.protocol.methods.k k2, com.facebook.orca.protocol.methods.a a1, com.facebook.orca.protocol.methods.e e1, SendBroadcastMethod sendbroadcastmethod, ab ab, 
            af af, w w1, h h1, com.facebook.orca.protocol.methods.g g1, ay ay, aw aw, v v1, 
            ax ax, ao ao1, az az, ae ae, cn cn1, bx bx1, javax.inject.a a2, 
            com.facebook.common.time.a a3, com.facebook.ui.media.b.a a4, c c1, k k3, javax.inject.a a5)
    {
        super("WebServiceHandler");
        d = i1;
        e = n1;
        f = l1;
        g = j1;
        h = o1;
        i = s1;
        j = k1;
        k = al;
        l = sendwebrtcmessagemethod;
        m = k2;
        n = a1;
        o = e1;
        p = sendbroadcastmethod;
        q = ab;
        r = af;
        s = w1;
        t = h1;
        u = g1;
        v = ay;
        w = aw;
        x = v1;
        y = ax;
        z = ao1;
        A = az;
        B = ae;
        C = cn1;
        D = bx1;
        E = a2;
        F = a3;
        G = a4;
        H = c1;
        I = k3;
        J = a5;
    }

    private int a(Message message, j j1, StringBuilder stringbuilder)
    {
        message = message.B().iterator();
        int i1 = 0;
        do
        {
            if (!message.hasNext())
            {
                break;
            }
            MediaResource mediaresource = (MediaResource)message.next();
            if (mediaresource.c() == g.PHOTO)
            {
                j1.a(com.facebook.http.protocol.y.a(q, new ac(mediaresource, i1)).a((new StringBuilder()).append("media-").append(i1).toString()).a());
                if (stringbuilder.length() != 0)
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append("{result=media-").append(i1).append(":$.id}");
                i1++;
            }
        } while (true);
        return i1;
    }

    private int a(Message message, StringBuilder stringbuilder)
    {
        message = message.B().iterator();
        int i1 = 0;
        while (message.hasNext()) 
        {
            Object obj = ((MediaResource)message.next()).j();
            obj = I.a(((String) (obj)));
            if (((m) (obj)).a != n.SUCCESS)
            {
                com.facebook.common.e.m.b("PhotoUpload", (new StringBuilder()).append("Photo upload state is: ").append(((m) (obj)).a.toString()).toString());
            } else
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(((m) (obj)).b);
                i1++;
            }
        }
        return i1;
    }

    private OperationResult a(Message message, d d1, String s1)
    {
        long l1 = F.a();
        Object obj;
        try
        {
            if (((Boolean)J.b()).booleanValue() && b(message))
            {
                com.facebook.orca.protocol.c c1 = a(message);
                if (c1 == c.IN_PROGRESS)
                {
                    C.b(message.e(), message.w(), message.h(), F.a() - l1, d1.b, s1, 0);
                    return OperationResult.a(t.PHOTO_UPLOAD_NOT_COMPLETE, "All photos not present yet");
                }
                if (c1 == c.FAILED)
                {
                    C.a(message.e(), message.w(), message.h(), F.a() - l1, d1.b, com.facebook.orca.photos.b.j.a, s1, 0);
                    return OperationResult.a(t.PHOTO_UPLOAD_FAILED, "One or more photos failed to upload");
                }
            }
            obj = d(message);
            C.a(message.e(), message.w(), message.h(), F.a() - l1, d1.b, s1, 0);
            obj = OperationResult.a(((android.os.Parcelable) (obj)));
        }
        catch (Throwable throwable)
        {
            C.a(message.e(), message.w(), message.h(), F.a() - l1, d1.b, throwable, s1, 0);
            Throwables.propagateIfPossible(throwable, java/lang/Exception);
            throw Throwables.propagate(throwable);
        }
        return ((OperationResult) (obj));
    }

    private com.facebook.orca.protocol.c a(Message message)
    {
        if (!message.C())
        {
            return c.NO_PHOTOS;
        }
        for (message = message.B().iterator(); message.hasNext();)
        {
            Object obj = ((MediaResource)message.next()).j();
            obj = I.a(((String) (obj)));
            if (((m) (obj)).a != n.SUCCESS)
            {
                if (((m) (obj)).a == n.IN_PROGRESS || ((m) (obj)).a == n.NOT_ACTIVE)
                {
                    return c.IN_PROGRESS;
                } else
                {
                    return c.FAILED;
                }
            }
        }

        return c.ALL_UPLOADED;
    }

    private ar a(Message message, UserKey userkey, d d1, com.facebook.orca.a.j j1)
    {
        ar ar1;
        bw bw1;
        int i1;
        ar1 = null;
        bw1 = D.a();
        i1 = 1;
_L8:
        if (i1 > j1.d) goto _L2; else goto _L1
_L1:
        long l1;
        if (i1 <= j1.f)
        {
            bw1.a(j1.e);
        }
        l1 = F.a();
        ar1 = z.a(message, userkey);
        b.a[ar1.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 251
    //                   1 108
    //                   2 156
    //                   3 185;
           goto _L3 _L4 _L5 _L6
_L3:
        break MISSING_BLOCK_LABEL_251;
_L4:
        C.a(message.e(), message.w(), message.h(), F.a() - l1, d1.b, "via_mqtt", i1);
        bw1.c();
        return ar1;
_L5:
        C.a(message.w(), ar1.c(), i1);
        break MISSING_BLOCK_LABEL_251;
        message;
        bw1.c();
        throw message;
_L6:
        C.a(message.e(), message.w(), message.h(), F.a() - l1, d1.b, ar1.d(), ar1.e(), bw1.b().toString(), i1);
        break MISSING_BLOCK_LABEL_251;
_L2:
        bw1.c();
        return ar1;
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(File file)
    {
        if (!file.delete())
        {
            com.facebook.debug.log.b.a(c, a, "Could not delete temp file after failed scaling");
        }
    }

    private boolean b(Message message)
    {
        for (message = message.B().iterator(); message.hasNext();)
        {
            if (((MediaResource)message.next()).c() != g.PHOTO)
            {
                return false;
            }
        }

        return true;
    }

    private List c(Message message)
    {
        Object obj = hq.a();
        Iterator iterator = message.B().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MediaResource mediaresource = (MediaResource)iterator.next();
            if (mediaresource.c() == g.PHOTO)
            {
                message = mediaresource.j();
                if (message == null)
                {
                    com.facebook.debug.log.b.a(b, a, "A mediaResource didn't have a filename");
                } else
                if (!H.c(message, true))
                {
                    message = H.a(message, true);
                    try
                    {
                        G.a(mediaresource, message);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        a(message);
                        throw obj;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        a(message);
                        throw obj;
                    }
                    ((List) (obj)).add(message);
                }
            }
        } while (true);
        return ((List) (obj));
    }

    private NewMessageResult d(Message message)
    {
        boolean flag = false;
        j j1 = d.a();
        Object obj;
        Object obj1;
        int i1;
        if (message.E() != null)
        {
            obj = message.E();
            i1 = 0;
            obj1 = null;
        } else
        if (message.C())
        {
            obj = new StringBuilder(50);
            if (((Boolean)J.b()).booleanValue())
            {
                i1 = a(message, ((StringBuilder) (obj)));
                Object obj2 = null;
                obj1 = obj;
                obj = obj2;
            } else
            {
                i1 = a(message, j1, ((StringBuilder) (obj)));
                Object obj3 = null;
                obj1 = obj;
                obj = obj3;
            }
        } else
        {
            i1 = 0;
            obj1 = null;
            obj = null;
        }
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            obj1 = ((StringBuilder) (obj1)).toString();
        }
        obj = new am(message, ((String) (obj)), ((String) (obj1)));
        obj = com.facebook.http.protocol.y.a(k, obj).a("send");
        if (!((Boolean)J.b()).booleanValue() && i1 > 0)
        {
            ((z) (obj)).b((new StringBuilder()).append("media-").append(i1 - 1).toString());
        }
        j1.a(((z) (obj)).a());
        j1.a(com.facebook.http.protocol.y.a(g, "{result=send:$.id}").a("fetch_sent").b("send").a());
        message = new FetchMoreMessagesParams(ThreadCriteria.a(message.e()), 0L, -1L, 2);
        j1.a(com.facebook.http.protocol.y.a(m, message).a("fetch").b("send").a());
        j1.b("sendMessage");
        message = (String)j1.a("send");
        message = (FetchMessageResult)j1.a("fetch_sent");
        obj1 = (FetchMoreMessagesResult)j1.a("fetch");
        obj = message.a();
        message = ((FetchMoreMessagesResult) (obj1)).a();
        obj1 = message.b().iterator();
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            if (!Objects.equal(((Message)((Iterator) (obj1)).next()).d(), ((Message) (obj)).d()))
            {
                continue;
            }
            i1 = 1;
            break;
        } while (true);
        if (i1 == 0)
        {
            message = null;
        }
        return new NewMessageResult(com.facebook.fbservice.c.b.FROM_SERVER, ((Message) (obj)).e(), ((Message) (obj)), message, System.currentTimeMillis());
    }

    public OperationResult a(ad ad1)
    {
        com.facebook.debug.d.e e1 = com.facebook.debug.d.e.a("WebServiceHandler");
        OperationType operationtype;
        operationtype = ad1.a();
        if (!aq.w.equals(operationtype))
        {
            break MISSING_BLOCK_LABEL_37;
        }
        ad1 = b(ad1);
        e1.a(10L);
        return ad1;
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        ad1;
        e1.a(10L);
        throw ad1;
    }

    protected OperationResult b(ad ad1)
    {
        ad1 = ad1.b();
        Message message = (Message)ad1.getParcelable("outgoingMessage");
        ad1 = UserKey.a(ad1.getString("userKeyInCanonicalThread"));
        if (!((Boolean)J.b()).booleanValue())
        {
            c(message);
        }
        d d1 = com.facebook.messages.model.threads.d.a(message);
        C.a(message.w(), d1.b, d1.c, d1.d, d1.e, ((Boolean)J.b()).booleanValue());
        ad1 = a(message, ad1, d1, (com.facebook.orca.a.j)E.b());
        if (ad1 != null && ad1.a() == au.SUCCEEDED)
        {
            return OperationResult.a(ad1.b());
        }
        if (ad1 != null && ad1.a() == au.FAILED)
        {
            ad1 = "via_graph_after_mqtt_failure";
        } else
        {
            ad1 = "via_graph";
        }
        return a(message, d1, ad1);
    }

    protected OperationResult b(ad ad1, e e1)
    {
        ad1 = (FetchThreadListParams)ad1.b().getParcelable("fetchThreadListParams");
        return OperationResult.a((FetchThreadListResult)d.a(e, ad1));
    }

    protected OperationResult c(ad ad1, e e1)
    {
        ad1 = (FetchMoreThreadsParams)ad1.b().getParcelable("fetchMoreThreadsParams");
        return OperationResult.a((FetchMoreThreadsResult)d.a(f, ad1));
    }

    protected OperationResult d(ad ad1, e e1)
    {
        ad1 = (FetchThreadParams)ad1.b().getParcelable("fetchThreadParams");
        e1 = d.a();
        if (ad1.d())
        {
            MarkThreadParams markthreadparams = new MarkThreadParams(ad1.a().a(), ai.READ, true, ad1.e());
            e1.a(com.facebook.http.protocol.y.a(s, markthreadparams).a("update-last-read").a());
        }
        z z1 = com.facebook.http.protocol.y.a(h, ad1).a("fetch-thread");
        if (ad1.d())
        {
            ad1 = "update-last-read";
        } else
        {
            ad1 = null;
        }
        e1.a(z1.b(ad1).a());
        e1.b("fetchThread");
        return OperationResult.a((FetchThreadResult)e1.a("fetch-thread"));
    }

    protected OperationResult e(ad ad1, e e1)
    {
        Message message;
        SendMessageByRecipientsParams sendmessagebyrecipientsparams;
        long l2;
        sendmessagebyrecipientsparams = (SendMessageByRecipientsParams)ad1.b().getParcelable("createThreadParams");
        message = sendmessagebyrecipientsparams.a();
        l2 = 0x7fffffffffffffffL;
        ad1 = d.a;
        d d1;
        if (!((Boolean)J.b()).booleanValue())
        {
            c(message);
        }
        d1 = com.facebook.messages.model.threads.d.a(message);
        long l1 = l2;
        C.b(message.w(), d1.b, d1.c, d1.d, d1.e, ((Boolean)J.b()).booleanValue());
        l1 = l2;
        j j1 = d.a();
        e1 = null;
        l1 = l2;
        if (message.E() == null) goto _L2; else goto _L1
_L1:
        l1 = l2;
        e1 = message.E();
        int i1;
        ad1 = null;
        i1 = 0;
_L10:
        if (ad1 != null) goto _L4; else goto _L3
_L3:
        ad1 = null;
_L8:
        l1 = l2;
        ad1 = new f(sendmessagebyrecipientsparams, e1, ad1);
        l1 = l2;
        ad1 = com.facebook.http.protocol.y.a(o, ad1).a("create-thread");
        l1 = l2;
        if (((Boolean)J.b()).booleanValue() || i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        l1 = l2;
        ad1.b((new StringBuilder()).append("media-").append(i1 - 1).toString());
        l1 = l2;
        j1.a(ad1.a());
        l1 = l2;
        ad1 = (new com.facebook.orca.server.ac()).a(s.CHECK_SERVER_FOR_NEW_DATA).a(ThreadCriteria.a("{result=create-thread:$.tid}")).a(3).h();
        l1 = l2;
        j1.a(com.facebook.http.protocol.y.a(h, ad1).a("fetch-thread").b("create-thread").a());
        l1 = l2;
        l2 = F.a();
        l1 = l2;
        j1.b("createThread");
        l1 = l2;
        ad1 = (FetchThreadResult)j1.a("fetch-thread");
        l1 = l2;
        C.a(ad1.a().a(), message.w(), message.h(), F.a() - l2, d1.b);
        l1 = l2;
        try
        {
            return OperationResult.a(ad1);
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            ad1 = d1;
        }
          goto _L5
_L2:
        l1 = l2;
        if (!message.C()) goto _L7; else goto _L6
_L6:
        l1 = l2;
        ad1 = new StringBuilder(20);
        l1 = l2;
        if (!((Boolean)J.b()).booleanValue())
        {
            break MISSING_BLOCK_LABEL_499;
        }
        l1 = l2;
        i1 = a(message, ad1);
        continue; /* Loop/switch isn't completed */
        l1 = l2;
        i1 = a(message, j1, ad1);
        continue; /* Loop/switch isn't completed */
_L4:
        l1 = l2;
        ad1 = ad1.toString();
          goto _L8
        e1;
        l1 = 0x7fffffffffffffffL;
_L5:
        C.a(message.w(), message.h(), F.a() - l1, ((d) (ad1)).b, e1);
        throw new com.facebook.orca.o.a(e1, (new com.facebook.messages.model.threads.e()).a(message).a(SendError.b).a(901).B());
_L7:
        ad1 = null;
        i1 = 0;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected OperationResult f(ad ad1, e e1)
    {
        Object obj;
        Object obj1;
        obj1 = (SendMessageByRecipientsParams)ad1.b().getParcelable("broadcastMessageParams");
        e1 = ((SendMessageByRecipientsParams) (obj1)).a();
        if (!((Boolean)J.b()).booleanValue())
        {
            c(e1);
        }
        try
        {
            obj = d.a();
            if (e1.E() != null)
            {
                throw new InvalidParameterException("Only images are supported by blast");
            }
        }
        // Misplaced declaration of an exception variable
        catch (ad ad1)
        {
            throw new com.facebook.orca.o.a(ad1, (new com.facebook.messages.model.threads.e()).a(e1).a(SendError.c).a(901).B());
        }
        if (!e1.C()) goto _L2; else goto _L1
_L1:
        ad1 = new StringBuilder();
        if (!((Boolean)J.b()).booleanValue()) goto _L4; else goto _L3
_L3:
        int i1 = a(e1, ad1);
_L10:
        if (ad1 != null) goto _L6; else goto _L5
_L5:
        ad1 = null;
_L8:
        ad1 = new aj(((SendMessageByRecipientsParams) (obj1)), ad1);
        ad1 = com.facebook.http.protocol.y.a(p, ad1);
        ad1.a("broadcast-thread");
        if (((Boolean)J.b()).booleanValue() || i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        ad1.b((new StringBuilder()).append("media-").append(i1 - 1).toString());
        ((j) (obj)).a(ad1.a());
        ad1 = ((SendMessageByRecipientsParams) (obj1)).d();
        obj1 = hq.a();
        for (Iterator iterator = ad1.iterator(); iterator.hasNext(); ((List) (obj1)).add(((RecipientInfo)iterator.next()).a().d())) { }
          goto _L7
_L4:
        i1 = a(e1, ((j) (obj)), ad1);
        continue; /* Loop/switch isn't completed */
_L6:
        ad1 = ad1.toString();
          goto _L8
_L7:
        obj1 = (new com.facebook.orca.server.ac()).a(s.CHECK_SERVER_FOR_NEW_DATA).a(ThreadCriteria.a(es.a(((java.util.Collection) (obj1))))).a(((List) (obj1)).size() * 3).h();
        ((j) (obj)).a(com.facebook.http.protocol.y.a(i, obj1).a("fetch-all").b("broadcast-thread").a());
        ((j) (obj)).b("createThread");
        obj1 = (ev)((j) (obj)).a("broadcast-thread");
        obj = (es)((j) (obj)).a("fetch-all");
        ad1 = OperationResult.a(new SendBroadcastResult(com.facebook.fbservice.c.b.FROM_SERVER, F.a(), ((ev) (obj1)), ((es) (obj)), (String)e1.J().get("broadcast_id"), ad1.size()));
        return ad1;
_L2:
        i1 = 0;
        ad1 = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected OperationResult h(ad ad1, e e1)
    {
        e1 = (AddMembersParams)ad1.b().getParcelable("addMembersParams");
        ad1 = d.a();
        ad1.a(com.facebook.http.protocol.y.a(n, e1).a("add-members").a());
        e1 = (new com.facebook.orca.server.ac()).a(s.CHECK_SERVER_FOR_NEW_DATA).a(ThreadCriteria.a(e1.a())).a(2).h();
        ad1.a(com.facebook.http.protocol.y.a(h, e1).a("fetch").b("add-members").a());
        ad1.b("addMembers");
        return OperationResult.a((FetchThreadResult)ad1.a(1));
    }

    protected OperationResult i(ad ad1, e e1)
    {
        e1 = (RemoveMemberParams)ad1.b().getParcelable("removeMemberParams");
        ad1 = d.a();
        ad1.a(com.facebook.http.protocol.y.a(r, e1).a("remove-members").a());
        e1 = (new com.facebook.orca.server.ac()).a(s.CHECK_SERVER_FOR_NEW_DATA).a(ThreadCriteria.a(e1.a())).a(2).h();
        ad1.a(com.facebook.http.protocol.y.a(h, e1).a("fetch").b("remove-members").a());
        ad1.b("removeMember");
        return OperationResult.a((FetchThreadResult)ad1.a(1));
    }

    protected OperationResult j(ad ad1, e e1)
    {
        ad1 = (MarkThreadParams)ad1.b().getParcelable("markThreadParams");
        d.a(s, ad1);
        return OperationResult.b();
    }

    protected OperationResult m(ad ad1, e e1)
    {
        ad1 = (DeleteThreadParams)ad1.b().getParcelable("deleteThreadParams");
        d.a(t, ad1);
        return OperationResult.b();
    }

    protected OperationResult n(ad ad1, e e1)
    {
        ad1 = (DeleteMessagesParams)ad1.b().getParcelable("deleteMessagesParams");
        d.a(u, ad1);
        return OperationResult.b();
    }

    protected OperationResult o(ad ad1, e e1)
    {
        ModifyThreadParams modifythreadparams = (ModifyThreadParams)ad1.b().getParcelable("modifyThreadParams");
        j j1 = d.a();
        e1 = null;
        if (modifythreadparams.b())
        {
            j1.a(com.facebook.http.protocol.y.a(v, modifythreadparams).a("setThreadName").a());
            e1 = "setThreadName";
        }
        ad1 = e1;
        if (modifythreadparams.d())
        {
            j1.a(com.facebook.http.protocol.y.a(w, modifythreadparams).a("setThreadImage").b(e1).a());
            ad1 = "setThreadImage";
        }
        e1 = ad1;
        if (modifythreadparams.f())
        {
            j1.a(com.facebook.http.protocol.y.a(y, modifythreadparams).a("muteThread").b(ad1).a());
            e1 = "muteThread";
        }
        ad1 = (new com.facebook.orca.server.ac()).a(s.CHECK_SERVER_FOR_NEW_DATA).a(ThreadCriteria.a(modifythreadparams.a())).a(2).h();
        j1.a(com.facebook.http.protocol.y.a(h, ad1).a("fetch").b(e1).a());
        j1.b("modifyThread");
        return OperationResult.a((FetchThreadResult)j1.a(1));
    }

    protected OperationResult q(ad ad1, e e1)
    {
        d.a(x, null);
        return OperationResult.b();
    }

    protected OperationResult s(ad ad1, e e1)
    {
        ad1 = (FetchGroupThreadsParams)ad1.b().getParcelable("fetchGroupThreadsParams");
        return OperationResult.a((FetchGroupThreadsResult)d.a(j, ad1));
    }

    protected OperationResult t(ad ad1, e e1)
    {
        ad1 = (FetchMoreMessagesParams)ad1.b().getParcelable("fetchMoreMessagesParams");
        return OperationResult.a((FetchMoreMessagesResult)d.a(m, ad1));
    }

    protected OperationResult u(ad ad1, e e1)
    {
        e1 = (FetchMultipleThreadsParams)ad1.b().getParcelable("fetchMultipleThreadsParams");
        ad1 = d.a();
        e1 = e1.b();
        FetchThreadParams fetchthreadparams;
        for (Iterator iterator = e1.iterator(); iterator.hasNext(); ad1.a(com.facebook.http.protocol.y.a(h, fetchthreadparams).a()))
        {
            fetchthreadparams = (FetchThreadParams)iterator.next();
        }

        ad1.b("fetchMultipleThreads");
        et et1 = es.e();
        for (int i1 = 0; i1 < e1.size(); i1++)
        {
            et1.b((FetchThreadResult)ad1.a(i1));
        }

        return OperationResult.a(new FetchMultipleThreadsResult(et1.b()));
    }

    protected OperationResult v(ad ad1, e e1)
    {
        ad1 = (SetSettingsParams)ad1.b().getParcelable("setSettingsParams");
        d.a(A, ad1);
        return OperationResult.b();
    }

    protected OperationResult w(ad ad1, e e1)
    {
        ad1 = ad1.b().getString("traceInfo");
        d.a(B, ad1);
        return OperationResult.b();
    }

    protected OperationResult x(ad ad1, e e1)
    {
        ad1 = (com.facebook.orca.protocol.methods.SendWebrtcMessageMethod.Params)ad1.b().getParcelable("sendWebrtcMessageParams");
        d.a(l, ad1);
        return OperationResult.b();
    }

}
