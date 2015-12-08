// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.api2.LoadAllStorySnapsTask;
import com.snapchat.android.database.OnboardingTooltip;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.StoryGroup;
import com.snapchat.android.model.StorySnapLogbook;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.save.SaveImageToGalleryTask;
import com.snapchat.android.util.save.SaveMediaNotificationsToShow;
import com.snapchat.android.util.save.SaveStoryToGalleryTask;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class FU
{

    public final Context a;
    public final StoryGroup b;
    final Pt c;

    public FU(Context context, StoryGroup storygroup)
    {
        ls.a();
        this(context, storygroup, Pt.a());
    }

    private FU(Context context, StoryGroup storygroup, Pt pt)
    {
        a = context;
        b = storygroup;
        c = pt;
    }

    public final void a()
    {
        Object obj;
        obj = b.mActionState;
        if (obj == com.snapchat.android.model.StoryGroup.ActionState.SAVING || obj == com.snapchat.android.model.StoryGroup.ActionState.SAVED)
        {
            throw new IllegalStateException("Can only save one story at a time.");
        }
        b.a(com.snapchat.android.model.StoryGroup.ActionState.SAVING);
        obj = new LoadAllStorySnapsTask(b.n()) {

            private FU a;

            public final void a()
            {
                FU fu = a;
                List list = fu.b.a(false);
                if (list.size() == 1)
                {
                    Bk bk = ((StorySnapLogbook)list.get(0)).mStorySnap;
                    if (bk.am() == 0)
                    {
                        (fu. new SaveImageToGalleryTask(fu.a, bk, com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext.STORY, SaveMediaNotificationsToShow.FAIL_ONLY) {

                            private FU a;

                            protected final void a()
                            {
                                super.a();
                                a.c.d();
                                a.b.a(com.snapchat.android.model.StoryGroup.ActionState.READY);
                            }

                            protected final void a(String s)
                            {
                                super.a(s);
                                a.b.a(com.snapchat.android.model.StoryGroup.ActionState.SAVED);
                            }

                            protected final void onPreExecute()
                            {
                                super.onPreExecute();
                                a.b.a(com.snapchat.android.model.StoryGroup.ActionState.SAVING);
                            }

            
            {
                a = FU.this;
                super(context, bk, savesnapcontext, savemedianotificationstoshow);
            }
                        }).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
                        return;
                    }
                }
                (new SaveStoryToGalleryTask(fu.a, fu.b, list, SaveMediaNotificationsToShow.FAIL_ONLY)).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
            }

            public final void b()
            {
                Object obj4 = a.c;
                AlertDialogUtils.a();
                AlertDialogUtils.a(((Pt) (obj4)).mContext.getResources().getString(0x7f080226), ((Pt) (obj4)).mContext);
                a.b.a(com.snapchat.android.model.StoryGroup.ActionState.READY);
                obj4 = a.b.a(false).iterator();
                int j = 0;
                int i = 0;
                while (((Iterator) (obj4)).hasNext()) 
                {
                    Bk bk = ((StorySnapLogbook)((Iterator) (obj4)).next()).mStorySnap;
                    if (bk.ak())
                    {
                        j++;
                    } else
                    {
                        bk.am();
                        i++;
                    }
                }
                com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("SAVE_ENTIRE_STORY").a("success", Boolean.valueOf(false)).a("reason", com.snapchat.android.util.save.SaveStoryToGalleryTask.Result.FAILED_SNAPS_DID_NOT_LOAD_IN_TIME).a("count", Integer.valueOf(j + i)).a("video_count", Integer.valueOf(j)).a("image_count", Integer.valueOf(i)).a(false);
            }

            
            {
                a = FU.this;
                super(collection);
            }
        };
        Object obj1 = ((LoadAllStorySnapsTask) (obj)).mMutex;
        obj1;
        JVM INSTR monitorenter ;
        if (((LoadAllStorySnapsTask) (obj)).mStatus != com.snapchat.android.api2.LoadAllStorySnapsTask.Status.INITIALIZED)
        {
            throw new IllegalStateException((new StringBuilder("Already executed this task. Status: ")).append(((LoadAllStorySnapsTask) (obj)).mStatus).toString());
        }
        break MISSING_BLOCK_LABEL_107;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj.mStatus = com.snapchat.android.api2.LoadAllStorySnapsTask.Status.RUNNING;
        obj1;
        JVM INSTR monitorexit ;
        if (((LoadAllStorySnapsTask) (obj)).mTimeoutMs != 0L)
        {
            synchronized (((LoadAllStorySnapsTask) (obj)).mMutex)
            {
                obj.mTimeoutFuture = ((LoadAllStorySnapsTask) (obj)).mTimeoutExecutor.schedule(new com.snapchat.android.api2.LoadAllStorySnapsTask._cls1(((LoadAllStorySnapsTask) (obj))), ((LoadAllStorySnapsTask) (obj)).mTimeoutMs, TimeUnit.MILLISECONDS);
            }
        }
        ((LoadAllStorySnapsTask) (obj)).c();
        ((LoadAllStorySnapsTask) (obj)).d();
        obj2 = ((LoadAllStorySnapsTask) (obj)).mMutex;
        obj2;
        JVM INSTR monitorenter ;
        if (((LoadAllStorySnapsTask) (obj)).mStatus == com.snapchat.android.api2.LoadAllStorySnapsTask.Status.RUNNING && ((LoadAllStorySnapsTask) (obj)).mPollFrequencyMs != 0L)
        {
            synchronized (((LoadAllStorySnapsTask) (obj)).mMutex)
            {
                obj.mPollingTask = new com.snapchat.android.api2.LoadAllStorySnapsTask._cls2(((LoadAllStorySnapsTask) (obj)));
                obj.mPollingTimer = new Timer();
                ((LoadAllStorySnapsTask) (obj)).mPollingTimer.scheduleAtFixedRate(((LoadAllStorySnapsTask) (obj)).mPollingTask, ((LoadAllStorySnapsTask) (obj)).mPollFrequencyMs, ((LoadAllStorySnapsTask) (obj)).mPollFrequencyMs);
            }
        }
        obj2;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj3;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception2;
        exception2;
        obj2;
        JVM INSTR monitorexit ;
        throw exception2;
    }

    // Unreferenced inner class FU$1

/* anonymous class */
    public final class _cls1
        implements com.snapchat.android.util.AlertDialogUtils.a
    {

        private FU a;

        public final void a(com.snapchat.android.util.AlertDialogUtils.YesNoOption yesnooption)
        {
            static final class _cls4
            {

                static final int a[];

                static 
                {
                    a = new int[com.snapchat.android.util.AlertDialogUtils.YesNoOption.values().length];
                    try
                    {
                        a[com.snapchat.android.util.AlertDialogUtils.YesNoOption.YES_DONT_ASK_AGAIN.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.snapchat.android.util.AlertDialogUtils.YesNoOption.YES.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.snapchat.android.util.AlertDialogUtils.YesNoOption.NO.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls4.a[yesnooption.ordinal()])
            {
            default:
                throw new IllegalStateException("Illegal dialog option");

            case 1: // '\001'
                Bt.a();
                if (Bt.aU())
                {
                    Bt.a(OnboardingTooltip.SAVE_TO_GALLERY);
                }
                SharedPreferenceKey.DISABLED_SAVE_STORY_TO_GALLERY_CONFIRMATION.putBoolean(true);
                a.a();
                return;

            case 2: // '\002'
                a.a();
                return;

            case 3: // '\003'
                a.b.a(com.snapchat.android.model.StoryGroup.ActionState.READY);
                return;
            }
        }

            public 
            {
                a = FU.this;
                super();
            }
    }

}
