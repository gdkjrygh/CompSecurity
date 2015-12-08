// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import com.skype.MediaDocument;
import com.skype.SkyLib;
import com.skype.android.app.BackgroundMode;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.wakeup:
//            BackgroundLogger, MediaWakeupEvent

public class DreamKeeper
{
    private static final class a
    {

        private final long a;
        private final MediaWakeupEvent b;

        public final long a()
        {
            return a;
        }

        public final MediaWakeupEvent b()
        {
            return b;
        }

        a(long l, MediaWakeupEvent mediawakeupevent)
        {
            a = SystemClock.uptimeMillis() + l;
            b = mediawakeupevent;
        }
    }


    private static final Logger a;
    private BackgroundMode b;
    private SkyLib c;
    private Handler d;
    private final AtomicInteger e = new AtomicInteger(0);
    private final List f = new LinkedList();
    private final SparseArray g = new SparseArray();
    private final SparseArray h = new SparseArray();
    private com.skype.SkyLib.INTENT i;

    DreamKeeper(BackgroundMode backgroundmode, SkyLib skylib, EventBus eventbus)
    {
        b = backgroundmode;
        c = skylib;
        (new EventSubscriberBinder(eventbus, this)).bind();
        i = com.skype.SkyLib.INTENT.I_UNKNOWN;
        d = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

            final DreamKeeper a;

            public final boolean handleMessage(Message message)
            {
                long l;
                long l1;
                if (1 != message.what)
                {
                    break MISSING_BLOCK_LABEL_199;
                }
                l1 = SystemClock.uptimeMillis();
                l = 0L;
                message = DreamKeeper.a(a);
                message;
                JVM INSTR monitorenter ;
                Object obj = DreamKeeper.a(a).iterator();
_L1:
                a a1;
                int j;
                if (!((Iterator) (obj)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_146;
                }
                j = ((Integer)((Iterator) (obj)).next()).intValue();
                a1 = (a)DreamKeeper.b(a).get(j);
                if (a1 != null)
                {
                    break MISSING_BLOCK_LABEL_96;
                }
                ((Iterator) (obj)).remove();
                  goto _L1
                obj;
                message;
                JVM INSTR monitorexit ;
                throw obj;
                long l2 = a1.a();
                if (l1 < l2)
                {
                    break MISSING_BLOCK_LABEL_131;
                }
                ((Iterator) (obj)).remove();
                DreamKeeper.b(a).remove(j);
                  goto _L1
                l = Math.max(l, l1 - l2);
                  goto _L1
                if (l != 0L)
                {
                    break MISSING_BLOCK_LABEL_182;
                }
                DreamKeeper.g().info("no intrusive wakeup items. Moving to background");
                DreamKeeper.c(a).clear();
                a.e();
_L2:
                message;
                JVM INSTR monitorexit ;
                return true;
                DreamKeeper.d(a).sendEmptyMessageDelayed(1, l);
                  goto _L2
                DreamKeeper.g().warning((new StringBuilder("Ignored event: ")).append(message.what).toString());
                return false;
            }

            
            {
                a = DreamKeeper.this;
                super();
            }
        });
    }

    static List a(DreamKeeper dreamkeeper)
    {
        return dreamkeeper.f;
    }

    private void a(long l, boolean flag, MediaWakeupEvent mediawakeupevent)
    {
        int j;
        j = 0;
        a.info((new StringBuilder("intrusiveWakeUp: ")).append(l).toString());
        if (mediawakeupevent == null) goto _L2; else goto _L1
_L1:
        Object obj;
        MediaDocument mediadocument;
        String s;
        obj = mediawakeupevent.d();
        mediadocument = mediawakeupevent.a();
        s = mediawakeupevent.b();
        if (obj != MediaWakeupEvent.Type.b) goto _L4; else goto _L3
_L3:
        if (a(mediadocument.getMediaLink(s, com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY).m_return)) goto _L2; else goto _L5
_L5:
        a.info((new StringBuilder("dropping wakeup event as MediaDocument: ")).append(mediadocument.getObjectID()).append(" already uploaded").toString());
_L7:
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        j = e.incrementAndGet();
        if (mediawakeupevent == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        h.put(mediawakeupevent.a().getObjectID(), Integer.valueOf(j));
        f.add(Integer.valueOf(j));
        g.put(j, new a(l, mediawakeupevent));
        obj;
        JVM INSTR monitorexit ;
        b.foreground(flag);
        d.sendEmptyMessageDelayed(1, l);
        return;
_L4:
        if (obj == MediaWakeupEvent.Type.a)
        {
            if (!a(mediadocument.getUploadStatus(s)))
            {
                a.info((new StringBuilder("dropping wakeup event as MediaDocument: ")).append(mediadocument.getObjectID()).append(" already downloaded").toString());
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            a.info((new StringBuilder("Not supported type: ")).append(obj).toString());
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
        mediawakeupevent;
        obj;
        JVM INSTR monitorexit ;
        throw mediawakeupevent;
_L2:
        j = 1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(com.skype.SkyLib.INTENT intent)
    {
        i = intent;
        a.info((new StringBuilder("fireIntent: ")).append(intent).toString());
        c.fireIntent(intent);
    }

    private static boolean a(com.skype.MediaDocument.MEDIA_STATUS media_status)
    {
        return media_status == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING;
    }

    private static boolean a(com.skype.MediaDocument.UPLOAD_STATUS upload_status)
    {
        return upload_status == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_QUEUED || upload_status == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_IN_PROGRESS;
    }

    static SparseArray b(DreamKeeper dreamkeeper)
    {
        return dreamkeeper.g;
    }

    static SparseArray c(DreamKeeper dreamkeeper)
    {
        return dreamkeeper.h;
    }

    static Handler d(DreamKeeper dreamkeeper)
    {
        return dreamkeeper.d;
    }

    static Logger g()
    {
        return a;
    }

    public final void a()
    {
        a(com.skype.SkyLib.INTENT.I_CHAT_SYNC);
        e();
    }

    public final void a(long l)
    {
        a(l, false, null);
    }

    public final void a(Activity activity)
    {
        a.info((new StringBuilder("User left application: ")).append(activity.getClass().getCanonicalName()).toString());
        e();
    }

    final void a(com.skype.android.gen.MediaDocumentListener.OnMediaLinkStatusChange onmedialinkstatuschange)
    {
        List list = f;
        list;
        JVM INSTR monitorenter ;
        Integer integer;
        int j = onmedialinkstatuschange.getSender().getObjectID();
        integer = (Integer)h.get(j);
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        a a1 = (a)g.get(integer.intValue());
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (a1.b().d() == MediaWakeupEvent.Type.b)
        {
            onmedialinkstatuschange = onmedialinkstatuschange.getStatus();
            if (!a(((com.skype.MediaDocument.MEDIA_STATUS) (onmedialinkstatuschange))))
            {
                a.info((new StringBuilder("Download status: ")).append(onmedialinkstatuschange).append(" trying to move to background mode").toString());
                g.remove(integer.intValue());
                d.sendEmptyMessage(1);
            }
        }
        list;
        JVM INSTR monitorexit ;
        return;
        onmedialinkstatuschange;
        list;
        JVM INSTR monitorexit ;
        throw onmedialinkstatuschange;
    }

    final void a(com.skype.android.gen.MediaDocumentListener.OnUploadStatusChanged onuploadstatuschanged)
    {
        List list = f;
        list;
        JVM INSTR monitorenter ;
        Integer integer;
        int j = onuploadstatuschanged.getSender().getObjectID();
        integer = (Integer)h.get(j);
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        a a1 = (a)g.get(integer.intValue());
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (a1.b().d() == MediaWakeupEvent.Type.a)
        {
            onuploadstatuschanged = onuploadstatuschanged.getStatus();
            if (!a(((com.skype.MediaDocument.UPLOAD_STATUS) (onuploadstatuschanged))))
            {
                a.info((new StringBuilder("Upload status is: ")).append(onuploadstatuschanged).append(" trying to move to background mode").toString());
                g.remove(integer.intValue());
                d.sendEmptyMessage(1);
            }
        }
        list;
        JVM INSTR monitorexit ;
        return;
        onuploadstatuschanged;
        list;
        JVM INSTR monitorexit ;
        throw onuploadstatuschanged;
    }

    final void a(MediaWakeupEvent mediawakeupevent)
    {
        a(mediawakeupevent.c(), true, mediawakeupevent);
    }

    public final void b()
    {
        a(com.skype.SkyLib.INTENT.I_CALL_USER);
    }

    public final void b(Activity activity)
    {
        a.info((new StringBuilder("User open application: ")).append(activity.getClass().getCanonicalName()).toString());
        if (com.skype.SkyLib.INTENT.I_UNKNOWN == i)
        {
            a(com.skype.SkyLib.INTENT.I_REGULAR);
        } else
        {
            a.info((new StringBuilder("Move to regular intent is not required as we are in: ")).append(i).toString());
        }
        b.foreground();
    }

    public final void c()
    {
        b.handleIncommingCall();
        a(com.skype.SkyLib.INTENT.I_CALL_PUSH);
    }

    public final void d()
    {
        a(com.skype.SkyLib.INTENT.I_REGULAR);
        e();
    }

    public final void e()
    {
        List list = f;
        list;
        JVM INSTR monitorenter ;
        if (!f.isEmpty())
        {
            break MISSING_BLOCK_LABEL_29;
        }
        b.background();
_L2:
        return;
        a.info("IntrusiveWakeUpList is not empty. Background impossible");
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean f()
    {
        return b.isBackgrounded();
    }

    static 
    {
        a = BackgroundLogger.a;
    }
}
