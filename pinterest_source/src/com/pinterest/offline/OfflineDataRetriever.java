// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.offline;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.SyncJob;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.networking.events.ConnectivityChanged;
import com.pinterest.schemas.event.EventType;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.offline:
//            OfflineDataInfo

public class OfflineDataRetriever
{

    private static OfflineDataRetriever f;
    private AtomicBoolean a;
    private SyncJob b;
    private int c;
    private List d;
    private com.pinterest.base.Events.EventsSubscriber e;

    public OfflineDataRetriever()
    {
        a = new AtomicBoolean(false);
        e = new _cls2();
        d = new ArrayList();
    }

    public static SyncJob a(int i, String s)
    {
        SyncJob syncjob = new SyncJob();
        syncjob.setKey((new StringBuilder()).append(i).append(s).toString());
        syncjob.setAction(Integer.valueOf(0));
        syncjob.setType(Integer.valueOf(i));
        syncjob.setGroupUid(s);
        return syncjob;
    }

    public static SyncJob a(int i, String s, String s1)
    {
        SyncJob syncjob = new SyncJob();
        syncjob.setKey((new StringBuilder()).append(i).append(s).append(s1).toString());
        syncjob.setAction(Integer.valueOf(1));
        syncjob.setType(Integer.valueOf(i));
        syncjob.setUid(s);
        syncjob.setGroupUid(s1);
        return syncjob;
    }

    private static List a(Board board, String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(a(2, board.getImageCoverUrl(), s));
        arraylist.add(a(2, board.getImagePreviewUrl(), s));
        User user = board.getUser();
        if (user != null)
        {
            arraylist.add(a(2, user.getImageMediumUrl(), s));
        }
        board = board.getImageThumbnailsList();
        for (int i = 0; i < board.size() && i <= 2; i++)
        {
            arraylist.add(a(2, (String)board.get(i), s));
        }

        return arraylist;
    }

    static void a(Board board, List list)
    {
        b(board, list);
    }

    private void a(SyncJob syncjob)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.get();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        obj = syncjob;
        if (syncjob != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj = ModelHelper.getNextSyncJob();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        b = null;
        PLog.log("OfflineDataRetriever", "No more jobs.", new Object[0]);
        a(true);
          goto _L1
        syncjob;
        throw syncjob;
        b = ((SyncJob) (obj));
        Events.post(new com.pinterest.api.model.SyncJob.CurrentEvent(b));
        if (b.getAction().intValue() != 1) goto _L4; else goto _L3
_L3:
        OfflineDataInfo.g();
        if (OfflineDataInfo.c()) goto _L6; else goto _L5
_L5:
        a(false);
          goto _L1
_L6:
        b.getType().intValue();
        JVM INSTR tableswitch 0 2: default 532
    //                   0 148
    //                   1 191
    //                   2 241;
           goto _L1 _L7 _L8 _L9
_L7:
        syncjob = new _cls3();
        obj = b.getUid();
        if (!StringUtils.isNotBlank(((CharSequence) (obj)))) goto _L11; else goto _L10
_L10:
        BaseApi.e(((String) (obj)), syncjob, "OfflineDataRetriever");
          goto _L1
_L11:
        MyUserApi.b(syncjob, "OfflineDataRetriever");
          goto _L1
_L8:
        syncjob = new _cls4();
        obj = b.getUid();
        if (!StringUtils.isNotBlank(((CharSequence) (obj)))) goto _L13; else goto _L12
_L12:
        BaseApi.e(((String) (obj)), syncjob, "OfflineDataRetriever");
          goto _L1
_L13:
        BoardApi.a(b.getGroupUid(), syncjob, "OfflineDataRetriever");
          goto _L1
_L9:
        syncjob = b.getUid();
        if (!StringUtils.isEmpty(syncjob)) goto _L15; else goto _L14
_L14:
        e();
        a(((SyncJob) (null)));
          goto _L1
_L15:
        ImageCache.getPersistent().preloadImage(syncjob, new _cls5(syncjob), true, "OfflineDataRetriever");
          goto _L1
_L4:
        if (b.getType().intValue() != 1)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        syncjob = ModelHelper.getBoardPins(b.getGroupUid());
        PLog.log("OfflineDataRetriever", (new StringBuilder("Deleting ")).append(syncjob.size()).append(" pins").toString(), new Object[0]);
        if (syncjob.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        obj = new HashMap();
        int i = 0;
_L17:
        if (i >= syncjob.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((HashMap) (obj)).put(((Pin)syncjob.get(i)).getImageMediumUrl(), null);
        i++;
        if (true) goto _L17; else goto _L16
_L16:
        PLog.log("OfflineDataRetriever", (new StringBuilder("Deleting ")).append(((HashMap) (obj)).keySet().size()).append(" pin images").toString(), new Object[0]);
        ImageCache.getPersistent().removeImages(((HashMap) (obj)));
        syncjob = ModelHelper.getBoard(b.getUid());
        if (syncjob == null) goto _L19; else goto _L18
_L18:
        syncjob.setSyncedAt(null);
        ModelHelper.setBoard(syncjob);
_L19:
        ModelHelper.deleteSyncJobGroup(b.getGroupUid());
        PLog.log("OfflineDataRetriever", (new StringBuilder("Deleted job group ")).append(String.valueOf(b.getGroupUid())).toString(), new Object[0]);
        e();
        a(((SyncJob) (null)));
          goto _L1
    }

    static void a(OfflineDataRetriever offlinedataretriever)
    {
        Experiments.a("android_offline_access");
        OfflineDataInfo.g();
        if (!OfflineDataInfo.a())
        {
            Pinalytics.a(EventType.OFFLINE_SYNC_UP_TO_DATE, null);
            PLog.log("OfflineDataRetriever", "No updates needed!", new Object[0]);
            return;
        }
        OfflineDataInfo.g();
        if (!OfflineDataInfo.b())
        {
            OfflineDataInfo.g();
            OfflineDataInfo.a(0L);
        }
        Pinalytics.a(EventType.OFFLINE_SYNC_START, null);
        PLog.log("OfflineDataRetriever", "Starting updates...", new Object[0]);
        Events.register(offlinedataretriever.e, com/pinterest/networking/events/ConnectivityChanged, new Class[0]);
        offlinedataretriever.a.set(true);
        SyncJob syncjob = a(0, null, MyUser.getUid());
        ModelHelper.setSyncJob(syncjob);
        offlinedataretriever.a(syncjob);
    }

    static void a(OfflineDataRetriever offlinedataretriever, BoardFeed boardfeed)
    {
        offlinedataretriever.d.addAll(boardfeed.getItems());
        boardfeed = boardfeed.getNextUrl();
        if (StringUtils.isNotBlank(boardfeed))
        {
            boardfeed = a(0, ((String) (boardfeed)), MyUser.getUid());
            ModelHelper.setSyncJob(boardfeed);
        } else
        {
            Object obj = ModelHelper.getUserBoards(MyUser.getUid());
            boardfeed = OfflineDataInfo.g().a(((List) (obj)));
            ArrayList arraylist = new ArrayList();
            List list = offlinedataretriever.d;
            ArrayList arraylist1 = new ArrayList(((java.util.Collection) (obj)));
            arraylist1.removeAll(list);
            if (arraylist1.size() > 0)
            {
                PLog.log("OfflineDataRetriever", (new StringBuilder()).append(arraylist1.size()).append(" boards were removed since last sync").toString(), new Object[0]);
                ((List) (obj)).removeAll(arraylist1);
                for (obj = arraylist1.iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(a(0, ((Board)((Iterator) (obj)).next()).getUid()))) { }
            }
            obj = offlinedataretriever.d.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Board board = (Board)((Iterator) (obj)).next();
                if (boardfeed.contains(board.getUid()))
                {
                    Object obj1 = board.getSyncedAt();
                    Date date = board.getLastModifiedAt();
                    if (obj1 == null || date == null || date.after(((Date) (obj1))))
                    {
                        obj1 = new ArrayList();
                        ((List) (obj1)).add(a(1, null, board.getUid()));
                        ((List) (obj1)).addAll(a(board, board.getUid()));
                        arraylist.addAll(((java.util.Collection) (obj1)));
                        PLog.log("OfflineDataRetriever", (new StringBuilder("Scheduling ")).append(board.getName()).append(", it has changes.").toString(), new Object[0]);
                    } else
                    {
                        board.setSyncedAt(((Date) (obj1)));
                        b(board, ModelHelper.getBoardPins(board.getUid()));
                    }
                }
            } while (true);
            if (arraylist.size() <= 1)
            {
                PLog.log("OfflineDataRetriever", "No changes to boards.", new Object[0]);
            }
            ModelHelper.setSyncJobs(arraylist);
            ModelHelper.setBoards(offlinedataretriever.d);
            offlinedataretriever.d.clear();
            OfflineDataInfo.g();
            OfflineDataInfo.a(System.currentTimeMillis());
            boardfeed = null;
        }
        offlinedataretriever.e();
        offlinedataretriever.a(((SyncJob) (boardfeed)));
    }

    static void a(OfflineDataRetriever offlinedataretriever, SyncJob syncjob)
    {
        offlinedataretriever.a(syncjob);
    }

    static AtomicBoolean b(OfflineDataRetriever offlinedataretriever)
    {
        return offlinedataretriever.a;
    }

    private static void b(Board board, List list)
    {
        String s = (new StringBuilder()).append(board.getUid()).append(" ensure").toString();
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(a(board, s));
        for (int i = 0; i < list.size(); i++)
        {
            board = (Pin)list.get(i);
            if (board != null)
            {
                arraylist.add(a(2, board.getImageMediumUrl(), s));
            }
        }

        ModelHelper.setSyncJobs(arraylist);
    }

    static void c(OfflineDataRetriever offlinedataretriever)
    {
        offlinedataretriever.e();
    }

    static SyncJob d(OfflineDataRetriever offlinedataretriever)
    {
        return offlinedataretriever.b;
    }

    public static OfflineDataRetriever d()
    {
        if (f == null)
        {
            f = new OfflineDataRetriever();
        }
        return f;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        SyncJob syncjob = b;
        if (syncjob != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ModelHelper.deleteSyncJob(b);
        b = null;
        Events.post(new com.pinterest.api.model.SyncJob.CurrentEvent(b));
        c = c + 1;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        if (a.get())
        {
            return;
        }
        if (!NetworkUtils.getInstance().isOnWifiNetwork())
        {
            PLog.log("OfflineDataRetriever", "Not on Wifi so we are not updating", new Object[0]);
            return;
        } else
        {
            c = 0;
            _cls1 _lcls1 = new _cls1();
            _lcls1.setPriority(1);
            _lcls1.start();
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (!a.get())
        {
            return;
        }
        EventType eventtype;
        if (flag)
        {
            eventtype = EventType.OFFLINE_SYNC_COMPLETE;
        } else
        {
            eventtype = EventType.OFFLINE_SYNC_CANCELLED;
        }
        Pinalytics.a(eventtype, null);
        PLog.log("OfflineDataRetriever", "Stopping updates...", new Object[0]);
        Events.unregister(e);
        a.set(false);
    }

    public final void b()
    {
        a(false);
        ImageCache.getPersistent().clearAllCache();
    }

    public final boolean c()
    {
        return a.get();
    }

    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final OfflineDataRetriever a;

        _cls2()
        {
            a = OfflineDataRetriever.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.BoardApi.BoardFeedApiResponse
    {

        final OfflineDataRetriever a;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Object obj = null;
            super.onFailure(throwable, apiresponse);
            throwable = obj;
            if (apiresponse.getCode() == 10)
            {
                PLog.log("OfflineDataRetriever", "User Board bookmark not found", new Object[0]);
                throwable = OfflineDataRetriever.a(0, null, MyUser.getUid());
                ModelHelper.setSyncJob(throwable);
                OfflineDataRetriever.c(a);
            }
            OfflineDataRetriever.a(a, throwable);
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            PLog.log("OfflineDataRetriever", (new StringBuilder("Grabbed ")).append(feed.getCount()).append(" boards").toString(), new Object[0]);
            OfflineDataRetriever.a(a, (BoardFeed)feed);
        }

        _cls3()
        {
            a = OfflineDataRetriever.this;
            super();
        }
    }


    private class _cls4 extends com.pinterest.api.remote.PinApi.PinFeedApiResponse
    {

        public List a;
        final OfflineDataRetriever b;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            if (apiresponse != null && apiresponse.getCode() == 10)
            {
                throwable = OfflineDataRetriever.a(1, null, OfflineDataRetriever.d(b).getGroupUid());
                ModelHelper.setSyncJob(throwable);
                OfflineDataRetriever.c(b);
                OfflineDataRetriever.a(b, throwable);
                return;
            } else
            {
                OfflineDataRetriever.a(b, null);
                return;
            }
        }

        public void onStart()
        {
            super.onStart();
            a = ModelHelper.getBoardPins(OfflineDataRetriever.d(b).getGroupUid());
            Object obj;
            if (a != null)
            {
                obj = a;
            } else
            {
                obj = new ArrayList();
            }
            a = ((List) (obj));
        }

        public void onSuccess(Feed feed)
        {
            boolean flag2 = false;
            Board board = ModelHelper.getBoard(OfflineDataRetriever.d(b).getGroupUid());
            if (board == null)
            {
                OfflineDataRetriever.c(b);
                onFailure(null, new ApiResponse(null));
                return;
            }
            Object obj = board.getSyncedAt();
            Object obj1 = board.getLastModifiedAt();
            boolean flag;
            int i;
            if (obj == null || obj1 == null || ((Date) (obj1)).after(((Date) (obj))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            PLog.log("OfflineDataRetriever", (new StringBuilder("Grabbed ")).append(feed.getCount()).append(" pins of ").append(board.getPinCount()).append(" for board \"").append(board.getName()).append("\"").toString(), new Object[0]);
            obj1 = (PinFeed)feed;
            obj = new ArrayList();
            obj1 = ((PinFeed) (obj1)).getItems();
            i = 0;
            do
            {
label0:
                {
label1:
                    {
                        boolean flag1 = flag2;
                        Pin pin;
                        if (i < ((List) (obj1)).size())
                        {
                            pin = (Pin)((List) (obj1)).get(i);
                            if (pin == null)
                            {
                                break label0;
                            }
                            if (flag || !a.contains(pin))
                            {
                                break label1;
                            }
                            PLog.log("OfflineDataRetriever", (new StringBuilder("Found previously synced pin at index ")).append(i).append(" no need to update the rest of this board.").toString(), new Object[0]);
                            OfflineDataRetriever.a(board, ((List) (obj1)));
                            OfflineDataRetriever.a(board, a);
                            flag1 = true;
                        }
                        feed = feed.getNextUrl();
                        if (!flag1 && StringUtils.isNotBlank(feed))
                        {
                            feed = OfflineDataRetriever.a(1, feed, OfflineDataRetriever.d(b).getGroupUid());
                            ((List) (obj)).add(feed);
                        } else
                        {
                            board.setSyncedAt(Calendar.getInstance().getTime());
                            ModelHelper.setBoard(board);
                            feed = null;
                        }
                        ModelHelper.setSyncJobs(((List) (obj)));
                        OfflineDataRetriever.c(b);
                        OfflineDataRetriever.a(b, feed);
                        return;
                    }
                    ((List) (obj)).add(OfflineDataRetriever.a(2, pin.getImageMediumUrl(), board.getUid()));
                }
                i++;
            } while (true);
        }

        _cls4()
        {
            b = OfflineDataRetriever.this;
            super();
        }
    }


    private class _cls5
        implements Callback
    {

        final String a;
        final OfflineDataRetriever b;

        private void a()
        {
            OfflineDataRetriever.c(b);
            OfflineDataRetriever.a(b, null);
        }

        public void onError()
        {
            PLog.log("OfflineDataRetriever", (new StringBuilder("Failed ")).append(a).toString(), new Object[0]);
            a();
        }

        public void onSuccess()
        {
            PLog.log("OfflineDataRetriever", (new StringBuilder("Grabbed ")).append(a).toString(), new Object[0]);
            a();
        }

        _cls5(String s)
        {
            b = OfflineDataRetriever.this;
            a = s;
            super();
        }
    }


    private class _cls1 extends Thread
    {

        final OfflineDataRetriever a;

        public void run()
        {
            PLog.log("OfflineDataRetriever", "Thread started up.", new Object[0]);
            OfflineDataRetriever.a(a);
            while (OfflineDataRetriever.b(a).get()) ;
            PLog.log("OfflineDataRetriever", "Thread shut down.", new Object[0]);
        }

        _cls1()
        {
            a = OfflineDataRetriever.this;
            super();
        }
    }

}
