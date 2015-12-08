// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.app.feature.messaging.feed.model.FeedIconChangeType;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatMedia;
import com.snapchat.android.model.chat.StatefulChatFeedItem;
import com.snapchat.android.notification.AndroidNotificationManager;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.snapchat.videochat.view.LocalPreview;
import com.squareup.otto.Bus;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class sA
{

    private static sA b;
    protected sl a;
    private final sD c;
    private final AndroidNotificationManager d;
    private final ss e;
    private final oy f;
    private final lw g;
    private final FriendManager h;

    private sA(sD sd, AndroidNotificationManager androidnotificationmanager, ss ss1, oy oy1, lw lw1, FriendManager friendmanager)
    {
        SnapchatApplication.getDIComponent().a(this);
        c = sd;
        d = androidnotificationmanager;
        e = ss1;
        f = oy1;
        g = lw1;
        h = friendmanager;
    }

    public static sA a()
    {
        sA;
        JVM INSTR monitorenter ;
        sA sa;
        if (b == null)
        {
            sD sd = sD.a();
            AndroidNotificationManager androidnotificationmanager = AndroidNotificationManager.a();
            sw.a();
            ss ss1 = ss.a();
            oy oy1 = oy.a();
            lo.a();
            lw lw1 = lw.a();
            FriendManager friendmanager = FriendManager.e();
            FeatureFlagManager.a();
            b = new sA(sd, androidnotificationmanager, ss1, oy1, lw1, friendmanager);
        }
        sa = b;
        sA;
        JVM INSTR monitorexit ;
        return sa;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        sA;
        JVM INSTR monitorenter ;
        b = null;
        sA;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(RO ro)
    {
        Object obj2 = ro.k();
        if (!(ro instanceof Qu)) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj = (Qu)ro;
        if (IJ.a(((Qu) (obj)).a()))
        {
            for (obj = By.c().f().iterator(); ((Iterator) (obj)).hasNext();)
            {
                ((ChatConversation)((Iterator) (obj)).next()).mMyLastConnSeqNum = 0L;
            }

            Timber.f("ReceivingMailman", "[SCCP] Connected to SCCP gateway.", new Object[0]);
            obj1 = null;
            obj = null;
        } else
        {
            Timber.f("ReceivingMailman", "[SCCP] Failed to connect to SCCP gateway. Failure reason: %s.", new Object[] {
                ((Qu) (obj)).b()
            });
            obj1 = null;
            obj = null;
        }
_L59:
        ChatConversation chatconversation;
        if (obj != null)
        {
            if (obj1 != null && !h.m(((String) (obj1))))
            {
                Timber.f("ReceivingMailman", "[SCCP] Ignoring message id %s because the user can't chat with %s.", new Object[] {
                    ro.l(), obj1
                });
            } else
            {
label0:
                {
                    chatconversation = sz.a(((String) (obj)));
                    if (chatconversation != null)
                    {
                        break label0;
                    }
                    if (ro instanceof Qm)
                    {
                        f.a(((String) (obj)), false);
                        return;
                    }
                }
            }
        }
_L18:
        return;
_L2:
        if (ro instanceof Qy)
        {
            obj1 = (Qy)ro;
            Timber.f("ReceivingMailman", "[SCCP] Received conversation message %s.", new Object[] {
                Ks.a(((Qy) (obj1)))
            });
            obj = ((Qy) (obj1)).h().c();
            obj1 = ((Qy) (obj1)).h().a();
            continue; /* Loop/switch isn't completed */
        }
        if (obj2 != RO.a.CONVERSATION_MESSAGE_RESPONSE) goto _L4; else goto _L3
_L3:
        obj = ((Qz)ro).c();
        if (obj != null)
        {
            obj1 = sz.a(((String) (obj)));
            if (obj1 != null)
            {
                obj1 = ((ChatConversation) (obj1)).mTheirUsername;
                continue; /* Loop/switch isn't completed */
            }
        }
        if (false) goto _L6; else goto _L5
_L6:
        static final class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[RP.a.values().length];
                try
                {
                    b[RP.a.TEXT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    b[RP.a.MEDIA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    b[RP.a.STORY_REPLY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    b[RP.a.DISCOVER_SHARE_V2.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    b[RP.a.STICKER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[RP.a.HERE_SCREENSHOT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[RP.a.SCREENSHOT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[RP.a.WELCOME_MESSAGE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                a = new int[RO.a.values().length];
                try
                {
                    a[RO.a.CHAT_MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[RO.a.CONVERSATION_MESSAGE_RESPONSE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[RO.a.MESSAGE_STATE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[RO.a.MESSAGE_PRESERVATION.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[RO.a.PRESENCE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[RO.a.RECEIVED_SNAP.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[RO.a.MESSAGE_RELEASE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[RO.a.SNAP_STATE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[RO.a.CASH_RAIN.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[RO.a.CASH_STATE.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[((RO.a) (obj2)).ordinal()];
        JVM INSTR tableswitch 1 10: default 324
    //                   1 425
    //                   2 1355
    //                   3 2056
    //                   4 2148
    //                   5 2240
    //                   6 2457
    //                   7 2777
    //                   8 2943
    //                   9 3160
    //                   10 3222;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L7:
        byte byte0;
        boolean flag;
        byte0 = 1;
        flag = false;
_L21:
        if (flag)
        {
            chatconversation.D();
        }
        if ((ro instanceof Qy) && byte0 != 0)
        {
            ro = (Qy)ro;
            if (ro.h().f())
            {
                ro = ro.h().e();
                Timber.f("ReceivingMailman", "[seqNum] Updating %s mTheirLastConnSeqNum to %d.", new Object[] {
                    obj1, Long.valueOf(IJ.a(ro))
                });
                long l = ro.longValue();
                if (l > chatconversation.mTheirLastConnSeqNum)
                {
                    chatconversation.mTheirLastConnSeqNum = l;
                    return;
                }
            }
        }
          goto _L18
_L8:
        obj2 = (Qm)ro;
        if (!chatconversation.a(((Qm) (obj2))) && ((Qm) (obj2)).f().longValue() > chatconversation.mLastSeqNumOfTheirChatIReleased) goto _L20; else goto _L19
_L19:
        Timber.f("ReceivingMailman", "[SCCP] Ignoring chat %s because we already read it or got it from HTTP.", new Object[] {
            Ks.a(((Qy) (obj2)))
        });
_L31:
        flag = true;
        byte0 = 1;
          goto _L21
_L20:
        boolean flag1;
        AnalyticsEvents.a(true, System.currentTimeMillis() - ((Qm) (obj2)).g().longValue());
        e.a(chatconversation, ((Qm) (obj2)).h().e().longValue());
        obj = e;
        long l4 = ((Qm) (obj2)).f().longValue();
        Object obj4 = chatconversation.mId;
        long l5 = chatconversation.mTheirLastSeqNum;
        if (l4 > l5 && l4 - l5 > 1L)
        {
            for (long l1 = 1L + l5; l1 < l4; l1++)
            {
                ss.a(((String) (obj4)), ((ss) (obj)).b, l1);
            }

            Timber.f("ChatGapDetector", "[Conversation] Detected a chat gap of %d chats starting from seqNum %d.", new Object[] {
                Long.valueOf(l4 - l5 - 1L), Long.valueOf(l5 + 1L)
            });
            long l2;
            if (!((ss) (obj)).d.containsKey(obj4))
            {
                ((ss) (obj)).d.put(obj4, Boolean.valueOf(true));
                ((ss) (obj)).e.postDelayed(new ss._cls1(((ss) (obj)), ((String) (obj4))), 8000L);
            } else
            {
                Timber.f("ChatGapDetector", "[Conversation] Conversation %s is being loaded from the server.", new Object[] {
                    obj4
                });
            }
        }
        chatconversation.d(((Qm) (obj2)).f().longValue());
        if (obj2 != null && ((Qm) (obj2)).b())
        {
            obj = ((Qm) (obj2)).a().f();
        } else
        {
            obj = RP.a.UNRECOGNIZED_VALUE;
        }
        _cls2.b[((RP.a) (obj)).ordinal()];
        JVM INSTR tableswitch 1 8: default 776
    //                   1 1052
    //                   2 1065
    //                   3 1078
    //                   4 1113
    //                   5 1126
    //                   6 1139
    //                   7 1139
    //                   8 1152;
           goto _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L28 _L29
_L29:
        break MISSING_BLOCK_LABEL_1152;
_L22:
        obj = new BH(((Qm) (obj2)));
_L30:
        flag1 = chatconversation.mAmIPresent;
        d.a(SnapchatApplication.get(), null, ((Chat) (obj)).W(), h.k(((Chat) (obj)).j()), ((Chat) (obj)).j(), null, ((Chat) (obj)).d(), ((Chat) (obj)).w(), com.snapchat.android.notification.AndroidNotificationManager.Type.CHAT, false, null);
        if (flag1)
        {
            ((Chat) (obj)).c(Bt.bC());
        }
        obj2 = chatconversation.mId;
        l2 = ((Chat) (obj)).w();
        if (!e.a(((String) (obj2)), l2))
        {
            break MISSING_BLOCK_LABEL_1268;
        }
        chatconversation.a(((com.snapchat.android.model.chat.ChatFeedItem) (obj)));
        if (chatconversation.mPendingReceivedChats.size() > 0)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 == 0 || !e.b(((String) (obj2)), l2) || !e.a(((String) (obj2)), l2))
        {
            break MISSING_BLOCK_LABEL_1176;
        }
        l2 = e.a(((String) (obj2)));
        Timber.f("ReceivingMailman", "[SCCP] Chat gap filled. Delivering chats up to seqNum %d.", new Object[] {
            Long.valueOf(l2)
        });
        obj2 = chatconversation.mPendingReceivedChats.iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            obj4 = (Chat)((Iterator) (obj2)).next();
            if (((Chat) (obj4)).w() < l2)
            {
                chatconversation.a(((com.snapchat.android.model.chat.ChatFeedItem) (obj4)));
                ((Iterator) (obj2)).remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_1171;
_L23:
        obj = new BG(((Qm) (obj2)));
          goto _L30
_L24:
        obj = new ChatMedia(((Qm) (obj2)));
          goto _L30
_L25:
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.REPLY_STORY_TO_CHAT))
        {
            obj = new BF(((Qm) (obj2)));
        } else
        {
            obj = new BH(((Qm) (obj2)));
        }
          goto _L30
_L26:
        obj = new BD(((Qm) (obj2)));
          goto _L30
_L27:
        obj = new BE(((Qm) (obj2)));
          goto _L30
_L28:
        obj = new BC(((Qm) (obj2)));
          goto _L30
        obj = new BK(((Qm) (obj2)));
          goto _L30
        chatconversation.v();
        chatconversation.B();
        if (!flag1)
        {
            chatconversation.d(true);
            d.b(SnapchatApplication.get(), com.snapchat.android.notification.AndroidNotificationManager.Type.CHAT);
        }
        chatconversation.a(((com.snapchat.android.model.chat.ChatFeedItem) (obj)), FeedIconChangeType.RECEIVED);
        chatconversation.G();
        Mf.a().a(new NG());
_L32:
        if (chatconversation.mIsStub)
        {
            chatconversation.mIsStub = false;
        }
        Mf.a().a(new Mp(chatconversation.mId, true));
          goto _L31
        Timber.f("ReceivingMailman", "[SCCP] Detected chat gap. Adding chat %s to pending received chats.", new Object[] {
            Ks.a(((Chat) (obj)).t())
        });
        chatconversation.mPendingReceivedChats.add(obj);
        (new EasyMetric("INCOMING_CHAT_DELAYED_OF_SEQUENCE_NUMBER_GAP")).a("pending-received-chats", Integer.valueOf(chatconversation.mPendingReceivedChats.size())).a(false);
        Collections.sort(chatconversation.mPendingReceivedChats, new com.snapchat.android.model.chat.ChatConversation._cls3(chatconversation));
          goto _L32
_L9:
        Object obj5;
        obj5 = (Qz)ro;
        obj2 = chatconversation.h(((Qz) (obj5)).b());
        if (obj2 == null) goto _L34; else goto _L33
_L33:
        Object obj7;
        obj = c.a;
        ld ld1;
        long l3;
        if (obj2 instanceof Qm)
        {
            if (IJ.a(((Qz) (obj5)).a()))
            {
                ((lt) (obj)).a((Qm)obj2);
            } else
            {
                ((lt) (obj)).b((Qm)obj2);
            }
        }
        if (!(obj2 instanceof Qm)) goto _L36; else goto _L35
_L35:
        ld1 = ld.a();
        obj7 = (Qm)obj2;
        obj = null;
        obj7 = ((Qm) (obj7)).a().e();
        byte0 = -1;
        ((String) (obj7)).hashCode();
        JVM INSTR lookupswitch 3: default 1488
    //                   -916839648: 1797
    //                   -416447130: 1814
    //                   3556653: 1780;
           goto _L37 _L38 _L39 _L40
_L37:
        byte0;
        JVM INSTR tableswitch 0 2: default 1516
    //                   0 1831
    //                   1 1842
    //                   2 1863;
           goto _L41 _L42 _L43 _L44
_L41:
        if (obj != null)
        {
            ld1.mBlizzardEventLogger.a(((kl) (obj)));
        }
_L36:
        chatconversation.a(((Qy) (obj2)));
        obj = ((Qy) (obj2)).k();
        if (!IJ.a(((Qz) (obj5)).a())) goto _L46; else goto _L45
_L45:
        if (obj == RO.a.CHAT_MESSAGE)
        {
            l3 = ((Qz) (obj5)).f().longValue();
            obj = (Qm)obj2;
            ((Qm) (obj)).b(Long.valueOf(l3));
            chatconversation.mTimestamp = l3;
            chatconversation.k(((Qm) (obj)).c());
            Timber.f("ReceivingMailman", "[seqNum] Message %s sent successfully. Updating MyLastAckedSeqNum to %d.", new Object[] {
                ((Qm) (obj)).c(), ((Qm) (obj)).f()
            });
            chatconversation.a(((Qm) (obj)).f().longValue(), false);
            obj = chatconversation.g(((Qz) (obj5)).b());
            if (obj != null)
            {
                obj.mSendReceiveStatus = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.SENT;
                ((Chat) (obj)).d(l3);
                chatconversation.B();
                chatconversation.a(((com.snapchat.android.model.chat.ChatFeedItem) (obj)), FeedIconChangeType.SENT);
                if (((Chat) (obj)).t() != null && IJ.a(((Chat) (obj)).t().i()))
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                if (byte0 != 0)
                {
                    Mf.a().a(new Mp(chatconversation.mId));
                } else
                {
                    Mf.a().a(new Mp(chatconversation.mId, ((Chat) (obj)).d()));
                }
            }
            d.a(SnapchatApplication.get(), true);
        } else
        if (obj == RO.a.MESSAGE_STATE)
        {
            Ks.a(chatconversation, (RR)obj2, true);
        } else
        if (obj == RO.a.MESSAGE_PRESERVATION)
        {
            Ks.a(chatconversation, (RQ)obj2, true);
        } else
        if (obj == RO.a.MESSAGE_RELEASE)
        {
            chatconversation.a((Sk)obj2);
        }
        Timber.f("ReceivingMailman", "[SCCP] Successfully sent message %s.", new Object[] {
            Ks.a(((Qy) (obj2)))
        });
_L34:
        byte0 = 0;
        flag = false;
          goto _L21
_L40:
        if (((String) (obj7)).equals("text"))
        {
            byte0 = 0;
        }
          goto _L37
_L38:
        if (((String) (obj7)).equals("story_reply"))
        {
            byte0 = 1;
        }
          goto _L37
_L39:
        if (((String) (obj7)).equals("screenshot"))
        {
            byte0 = 2;
        }
          goto _L37
_L42:
        obj = new gn();
          goto _L41
_L43:
        obj = new gn();
        ((gn)obj).source = jQ.STORY;
          goto _L41
_L44:
        obj = new gm();
          goto _L41
_L46:
        if (obj2 instanceof Qm)
        {
            chatconversation.o();
        }
        if (((Qz) (obj5)).e() != Qz.a.NEED_AUTHENTICATION) goto _L48; else goto _L47
_L47:
        obj = chatconversation.mMessagingAuthToken;
        if (obj == null) goto _L50; else goto _L49
_L49:
        ((Qy) (obj2)).h().a(((Su) (obj)));
_L48:
        Timber.f("ReceivingMailman", "[SCCP] Failed to send message %s with reason %s.", new Object[] {
            Ks.a(((Qy) (obj2))), ((Qz) (obj5)).d()
        });
          goto _L34
_L50:
        sD.a(chatconversation, ((Qy) (obj2)), com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.FAILED);
          goto _L34
_L10:
        obj = (RR)ro;
        obj2 = Ks.a(chatconversation, ((RR) (obj)), true);
        e.a(chatconversation, ((RR) (obj)).h().e().longValue());
        if (obj2 == null)
        {
            Timber.f("ReceivingMailman", "[Conversation] Unable to find chat associated with state message %s.", new Object[] {
                Ks.a(((Qy) (obj)))
            });
        } else
        {
            Mf.a().a(new Mp(chatconversation.mId, ((Chat) (obj2)).d()));
        }
        flag = true;
        byte0 = 1;
          goto _L21
_L11:
        obj = (RQ)ro;
        obj2 = Ks.a(chatconversation, ((RQ) (obj)), true);
        e.a(chatconversation, ((RQ) (obj)).h().e().longValue());
        if (obj2 == null)
        {
            Timber.f("ReceivingMailman", "[Conversation] Unable to find chat associated with state message %s.", new Object[] {
                Ks.a(((Qy) (obj)))
            });
        } else
        {
            Mf.a().a(new Mp(chatconversation.mId, ((Chat) (obj2)).d()));
        }
        flag = true;
        byte0 = 1;
          goto _L21
_L12:
        obj = (Sd)ro;
        obj2 = chatconversation.mMyUsername;
        obj5 = chatconversation.mTheirUsername;
        Map map = ((Sd) (obj)).a();
        boolean flag2 = IJ.a((Boolean)map.get(obj5));
        boolean flag4 = IJ.a(((Sd) (obj)).b());
        chatconversation.c(flag2);
        chatconversation.mRecipientSupportsHere = flag4;
        if (flag2 && flag4 && Ic.b() && LocalPreview.a())
        {
            chatconversation.mHereAuth = ((Sd) (obj)).d();
        } else
        {
            chatconversation.mHereAuth = null;
        }
        if (map.containsKey(obj2) && chatconversation.mAmIPresent != IJ.a((Boolean)map.get(obj2)))
        {
            c.a(chatconversation, chatconversation.mAmIPresent, flag2, chatconversation.mIsDisplayingVideo);
        }
        e.a(chatconversation, ((Sd) (obj)).h().e().longValue());
        Mf.a().a(new Nv(com.snapchat.android.livechat.AdlHelper.PresenceSource.CHAT_GATEWAY, ((String) (obj5)), IJ.a(((Sd) (obj)).c()), "Received presence message."));
        flag = true;
        byte0 = 1;
          goto _L21
_L13:
        Object obj6 = (Sj)ro;
        obj5 = chatconversation.u();
        obj5;
        JVM INSTR monitorenter ;
        obj2 = ((Sj) (obj6)).d();
        obj = obj2;
        if (obj2 == null) goto _L52; else goto _L51
_L51:
        obj = obj2;
        if (!((String) (obj2)).endsWith("r"))
        {
            obj = (new StringBuilder()).append(((String) (obj2))).append("r").toString();
        }
_L52:
        if (chatconversation.d(((String) (obj))) != null) goto _L54; else goto _L53
_L53:
        obj = new AT(((String) (obj)), ((Sj) (obj6)).b().longValue(), ((Sj) (obj6)).a().longValue(), 0L, ((Sj) (obj6)).g().intValue(), ((Sj) (obj6)).e().booleanValue(), IY.a(((Sj) (obj6)).c().intValue()), ((Sj) (obj6)).h().a(), ((Sj) (obj6)).m().doubleValue(), ((Sj) (obj6)).f(), false, ((Sj) (obj6)).n(), null, false, false, ((Sj) (obj6)).o());
        chatconversation.a(((com.snapchat.android.model.chat.ChatFeedItem) (obj)));
        chatconversation.B();
        Timber.f("ReceivingMailman", "[SCCP] Received snap over SCCP and added to conversation, id: %s, sender: %s.", new Object[] {
            ((AT) (obj)).d(), ((AT) (obj)).j()
        });
        lo.a(((AT) (obj)), "sccp");
        g.a(((AT) (obj)));
        chatconversation.a(((com.snapchat.android.model.chat.ChatFeedItem) (obj)), FeedIconChangeType.RECEIVED);
        PG.b(new Runnable(chatconversation) {

            private ChatConversation a;

            public final void run()
            {
                a.a(1);
            }

            
            {
                a = chatconversation;
                super();
            }
        });
        Mf.a().a(new Mp(chatconversation.mId));
        Mf.a().a(new NG());
_L55:
        obj5;
        JVM INSTR monitorexit ;
        byte0 = 0;
        flag = false;
          goto _L21
_L54:
        Timber.f("ReceivingMailman", "[SCCP] Received snap over SCCP but already in conversation, id: %s, sender: %s.", new Object[] {
            ((Sj) (obj6)).l(), ((Sj) (obj6)).h().a()
        });
          goto _L55
        ro;
        obj5;
        JVM INSTR monitorexit ;
        throw ro;
_L14:
        obj6 = (Sk)ro;
        obj5 = chatconversation.u();
        obj2 = null;
        obj5;
        JVM INSTR monitorenter ;
        obj7 = ((Sk) (obj6)).b();
        obj = obj2;
        if (obj7 == null) goto _L57; else goto _L56
_L56:
        obj = obj2;
        if (((Map) (obj7)).containsKey(chatconversation.mMyUsername))
        {
            obj = chatconversation.b(((Long)((Map) (obj7)).get(chatconversation.mMyUsername)).longValue());
        }
_L57:
        sw.a(chatconversation, ((Sk) (obj6)));
        if (!chatconversation.mIsUserInConversation)
        {
            sw.d(chatconversation);
        }
        obj5;
        JVM INSTR monitorexit ;
        if (((Sk) (obj6)).h().f())
        {
            e.a(chatconversation, ((Sk) (obj6)).h().e().longValue());
        }
        if (obj != null)
        {
            chatconversation.a(((com.snapchat.android.model.chat.ChatFeedItem) (obj)), FeedIconChangeType.VIEWED);
        } else
        {
            chatconversation.x();
        }
        flag = true;
        byte0 = 1;
          goto _L21
        ro;
        obj5;
        JVM INSTR monitorexit ;
        throw ro;
_L15:
        obj = (SB)ro;
        AY ay = chatconversation.i(((SB) (obj)).b());
        e.a(chatconversation, ((SB) (obj)).h().e().longValue());
        if (ay != null && IJ.a(((SB) (obj)).c()))
        {
            boolean flag3;
            if (((SB) (obj)).e().longValue() > 0L)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            ay.d(flag3);
            if (((SB) (obj)).e().longValue() > 0L && IJ.a(((SB) (obj)).d()))
            {
                ay.a(com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_REPLAYED_AND_SCREENSHOTTED);
            } else
            if (((SB) (obj)).e().longValue() > 0L)
            {
                ay.a(com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_SCREENSHOTTED);
            } else
            if (IJ.a(((SB) (obj)).d()))
            {
                ay.a(com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_REPLAYED);
            } else
            {
                ay.a(com.snapchat.android.model.Snap.ClientSnapStatus.SENT_AND_OPENED);
            }
            ay.b(((SB) (obj)).a().longValue());
            chatconversation.a(ay, FeedIconChangeType.VIEWED);
            Mf.a().a(new Mp(chatconversation.mId, ay.d()));
        }
        byte0 = 1;
        flag = false;
          goto _L21
_L16:
        obj = (Qf)ro;
        e.a(chatconversation, ((Qf) (obj)).h().e().longValue());
        Mf.a().a(new Mm(chatconversation, ((Qf) (obj)).a().longValue(), ((Qf) (obj)).b().longValue()));
        flag = true;
        byte0 = 1;
          goto _L21
_L17:
        Object obj3 = (Qg)ro;
        Timber.f("ReceivingMailman", "[SCCP] Got a cash state message %s.", new Object[] {
            Ks.a(((Qy) (obj3)))
        });
        if (chatconversation.mIsStub)
        {
            chatconversation.mIsStub = false;
        }
        obj = a;
        obj3 = ((Qg) (obj3)).a();
        String s = chatconversation.mId;
        obj = new sl._cls8(((sl) (obj)), chatconversation, ((String) (obj3)));
        obj3 = new nl(((String) (obj3)), s);
        ((nl) (obj3)).registerCallback(Qh, ((oS.a) (obj)));
        ((nl) (obj3)).execute();
        byte0 = 0;
        flag = false;
          goto _L21
_L5:
        obj1 = null;
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = null;
        obj = null;
        if (true) goto _L59; else goto _L58
_L58:
    }
}
