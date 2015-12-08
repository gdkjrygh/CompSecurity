// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.model.StoryCollection;
import com.snapchat.android.stories.analytics.StoryLoadingStatus;
import com.snapchat.android.stories.ui.ExplorerPageNavigationMethod;
import com.snapchat.android.stories.ui.ExplorerStorySnapView;
import com.snapchat.android.stories.ui.StorySnapView;
import com.snapchat.android.stories.ui.StorySnapViewGroup;
import com.snapchat.android.stories.ui.StoryThumbnailLayout;
import com.snapchat.android.ui.StoryTimerView;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.snapchat.android.util.debug.ReleaseManager;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class EP
    implements com.snapchat.android.stories.ui.StorySnapView.a, com.snapchat.android.stories.ui.StoryThumbnailLayout.a, com.snapchat.android.ui.VerticalSwipeLayout.a
{

    public final VerticalSwipeLayout a;
    public final StoryThumbnailLayout b;
    public final EE c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public Map i;
    private final Context j;
    private final StorySnapViewGroup k;
    private final StoryTimerView l;
    private final Bj m;
    private final ReleaseManager n;
    private final sX o;
    private final Bus p;
    private final Ch q;
    private final Ev r;
    private final Ew s;
    private int t;
    private ExplorerPageNavigationMethod u;

    private EP(Context context, VerticalSwipeLayout verticalswipelayout, StorySnapViewGroup storysnapviewgroup, StoryTimerView storytimerview, Bj bj, ReleaseManager releasemanager, sX sx, 
            StoryThumbnailLayout storythumbnaillayout, Bus bus, EE ee, Ch ch, Ev ev, Ew ew)
    {
        e = false;
        t = -1;
        f = 0;
        h = -1;
        i = new HashMap();
        u = null;
        j = context;
        a = verticalswipelayout;
        k = storysnapviewgroup;
        l = storytimerview;
        m = bj;
        n = releasemanager;
        o = sx;
        b = storythumbnaillayout;
        p = bus;
        c = ee;
        q = ch;
        r = ev;
        s = ew;
        p.c(this);
    }

    public EP(Context context, VerticalSwipeLayout verticalswipelayout, StorySnapViewGroup storysnapviewgroup, StoryTimerView storytimerview, StoryThumbnailLayout storythumbnaillayout)
    {
        Bj bj = Bj.a();
        new ta();
        ReleaseManager releasemanager = ReleaseManager.a();
        FeatureFlagManager.a();
        this(context, verticalswipelayout, storysnapviewgroup, storytimerview, bj, releasemanager, sX.a(), storythumbnaillayout, Mf.a(), new EE(), Ch.a(), Ev.a(), Ew.a());
    }

    private sZ a(Bk bk)
    {
        if (bk == null)
        {
            return null;
        }
        Object obj = m.b(bk);
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return null;
        }
        Object obj1 = k.c();
        if (!((Set) (obj1)).isEmpty())
        {
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((Set) (obj1)).contains(((Bk)iterator.next()).d()))
                {
                    iterator.remove();
                }
            } while (true);
        }
        if (((List) (obj)).size() < 3)
        {
            Timber.d("ExplorerStoryLevelsController", "Too few unviewed next level snaps for %s to allow exploration.", new Object[] {
                bk.d()
            });
            return null;
        }
        obj1 = new ArrayList(f);
        for (int i1 = 0; i1 < f; i1++)
        {
            ((List) (obj1)).add(((StorySnapView)a.getChildAt(i1)).g.h().d());
        }

        ((List) (obj1)).add(bk.d());
        bk = new ED();
        bk.a = (Hb)((List) (obj)).get(0);
        bk.b = ((List) (obj1));
        bk.c = true;
        bk = bk.a();
        for (Iterator iterator1 = ((List) (obj)).iterator(); iterator1.hasNext();)
        {
            Bk bk1 = (Bk)iterator1.next();
            bk1.mDownloadContext = bk;
            bk1.mParentIds = ((List) (obj1));
        }

        bk = new StoryCollection(((List) (obj)));
        obj = m.c(((StoryCollection) (bk)).mUsername);
        if (obj != null)
        {
            bk.mSharedId = ((StoryCollection) (obj)).mSharedId;
            bk.mIsLocal = ((StoryCollection) (obj)).mIsLocal;
            bk.mIsLiveAndExplorerEnabled = ((StoryCollection) (obj)).mIsLiveAndExplorerEnabled;
        }
        return ta.a(bk.i(), bk, false, MediaOpenOrigin.EXPLORER);
    }

    private void a(StorySnapView storysnapview, StorySnapView storysnapview1, int i1)
    {
        Object obj = storysnapview.g;
        if (i1 != t + 1)
        {
            ((EO) (obj)).a(null, null);
            return;
        }
        storysnapview.a(false);
        obj.o = storysnapview1.g.o;
        ((EO) (obj)).a(null, null);
        storysnapview = (StorySnapView)a.getChildAt(t);
        if (storysnapview != null)
        {
            storysnapview = storysnapview.g.h();
        } else
        {
            storysnapview = null;
        }
        obj = a(((Bk) (storysnapview)));
        if (obj != null)
        {
            storysnapview1 = ((sZ) (obj)).u_();
        } else
        {
            storysnapview1 = null;
        }
        if (storysnapview1 == null)
        {
            b.a(storysnapview, null, t);
            return;
        }
        ArrayList arraylist = new ArrayList();
        storysnapview1 = storysnapview1.e();
        for (Iterator iterator = storysnapview1.iterator(); iterator.hasNext(); arraylist.add(((Bk)iterator.next()).aL())) { }
        i.put(storysnapview.d(), arraylist);
        if (!storysnapview1.isEmpty())
        {
            storysnapview1 = (Bk)storysnapview1.get(0);
        } else
        {
            storysnapview1 = null;
        }
        b.a(storysnapview, storysnapview1, t);
        ((sZ) (obj)).a(o.b(), i1);
    }

    private void a(boolean flag, StorySnapView storysnapview)
    {
        a.setScrollableInDirection(2, flag);
        storysnapview.a(flag);
    }

    public final int a(String s1)
    {
        int i1 = 0;
        if (!i.containsKey(s1))
        {
            return 0;
        }
        Iterator iterator = ((List)i.get(s1)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            if (q.a(s2))
            {
                i1++;
            }
        } while (true);
        i.remove(s1);
        return i1;
    }

    public final void a(int i1, int j1, int k1)
    {
        if (!c())
        {
            return;
        }
        t = j1;
        if (i1 != 2) goto _L2; else goto _L1
_L1:
        Object obj2;
        f = k1;
        StorySnapView storysnapview = (StorySnapView)a.getChildAt(j1);
        if (!e && k1 < a.getChildCount())
        {
            a((StorySnapView)a.getChildAt(k1), storysnapview, k1);
        }
        obj2 = storysnapview.g.h();
        if (obj2 == null || j1 == k1) goto _L2; else goto _L3
_L3:
        Object obj1;
        String s1;
        hq hq1;
        obj1 = u;
        u = null;
        Object obj = obj1;
        long l1;
        long l2;
        if (obj1 == null)
        {
            if (e)
            {
                if (j1 < k1)
                {
                    obj = ExplorerPageNavigationMethod.SWIPE_UP;
                } else
                {
                    obj = ExplorerPageNavigationMethod.SWIPE_DOWN;
                }
            } else
            {
                obj = ExplorerPageNavigationMethod.TAP_CARET;
            }
        }
        obj1 = s;
        s1 = ((Bk) (obj2)).d();
        obj2 = ((Bk) (obj2)).aN();
        obj = ((ExplorerPageNavigationMethod) (obj)).getExplorerPageAction();
        l1 = j1;
        l2 = k1;
        hq1 = new hq();
        hq1.storySnapId = s1;
        if (obj2 != null)
        {
            hq1.storyRootSnapId = ((String) (obj2));
        }
        hq1.actionName = ((hp) (obj));
        hq1.sourceLevel = Long.valueOf(l1);
        hq1.destinationLevel = Long.valueOf(l2);
        if (obj2 == null && l1 > 0L)
        {
            Timber.d("StoryUsageAnalytics", "Story root snap id is null for snap %s at level %d", new Object[] {
                s1, Long.valueOf(l1)
            });
        }
        if (l1 >= l2) goto _L5; else goto _L4
_L4:
        if (((Ew) (obj1)).d != null) goto _L7; else goto _L6
_L6:
        Timber.d("StoryUsageAnalytics", "StoryStoryViewSession is null while user swiped up to go to an explorer snap.", new Object[0]);
_L2:
        b.a(i1, j1, k1);
        return;
_L7:
        ((Ew) (obj1)).d.d.add(s1);
_L5:
        ((Ew) (obj1)).a.a(hq1);
        if (true) goto _L2; else goto _L8
_L8:
    }

    public final void a(Bk bk, boolean flag)
    {
        int i1 = 0;
        StorySnapView storysnapview = (StorySnapView)a.getChildAt(f);
        for (Bk bk1 = storysnapview.g.h(); bk1 == null || !bk.Z() && (bk.d() == null || !TextUtils.equals(bk.d(), bk1.d()));)
        {
            return;
        }

        if (flag && f < g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            i1 = 1;
        }
        bk.mExplorableStatus = i1;
        a(flag, storysnapview);
    }

    public final void a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason endreason, int i1)
    {
        if (i1 < 0 || i1 >= a.getChildCount())
        {
            Timber.d("ExplorerStoryLevelsController", "Can't end out-of-bounds session %d", new Object[] {
                Integer.valueOf(i1)
            });
            return;
        }
        Timber.a("ExplorerStoryLevelsController", "Hide snap %d with reason %s", new Object[] {
            Integer.valueOf(i1), endreason
        });
        EO eo = ((StorySnapView)a.getChildAt(i1)).g;
        if (i1 == 0)
        {
            sZ sz = eo.g();
            Bk bk = eo.h();
            if (sz != null && sz.r_())
            {
                p.a(new NE(bk));
            } else
            {
                p.a(new NY(false));
            }
            if (bk != null)
            {
                p.a(new MV(bk.j()));
                a(bk.d());
            }
            i.clear();
            d = false;
        }
        eo.a(endreason);
    }

    public final boolean a()
    {
        return f == 0;
    }

    public final void b()
    {
        ExplorerStorySnapView explorerstorysnapview = new ExplorerStorySnapView(j, k);
        explorerstorysnapview.setTimerViews(l, null);
        explorerstorysnapview.setExplorerSnapsPresenceListener(this);
        a.addView(explorerstorysnapview);
    }

    public final void b(int i1)
    {
        u = ExplorerPageNavigationMethod.TAP_THUMBNAIL;
        k.a(i1);
    }

    public final void b(int i1, int j1, int k1)
    {
        if (!c())
        {
            return;
        }
        if (!e || h != k1)
        {
            e = true;
            h = k1;
            StorySnapView storysnapview = (StorySnapView)a.getChildAt(t);
            StorySnapView storysnapview1 = (StorySnapView)a.getChildAt(k1);
            EO eo = storysnapview.g;
            storysnapview1.g.b(true);
            eo.b(true);
            a(storysnapview1, storysnapview, k1);
        }
        b.b(i1, j1, k1);
    }

    public final void b_(int i1)
    {
        if (!c())
        {
            return;
        }
        int j1 = a.getChildCount();
        e = false;
        g = c.a();
        EO eo = ((StorySnapView)a.getChildAt(t)).g;
        if (i1 == t)
        {
            eo.b(false);
            if (h > t)
            {
                ((StorySnapView)a.getChildAt(h)).g.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.SWIPED_DOWN);
            }
        }
        if (i1 >= j1 || i1 == t || t == -1)
        {
            Timber.d("ExplorerStoryLevelsController", "Attempt to enter invalid panel or same panel. Doing nothing.", new Object[0]);
            return;
        }
        b.b_(i1);
        Object obj1 = (StorySnapView)a.getChildAt(i1);
        Object obj = ((StorySnapView) (obj1)).g;
        if (t > i1)
        {
            a(true, ((StorySnapView) (obj1)));
            if (((EO) (obj)).n != null)
            {
                ((EO) (obj)).a(((EO) (obj)).n.a(), (sZ)((EO) (obj)).n.b(), ((EO) (obj)).j);
            }
            if (eo != null)
            {
                eo.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.SWIPED_DOWN);
            }
        } else
        if (i1 == t + 1)
        {
            a(false, ((StorySnapView) (obj1)));
            obj1 = eo.h();
            boolean flag;
            if (obj1 == null)
            {
                flag = false;
            } else
            {
                obj1 = a(((Bk) (obj1)));
                if (obj1 == null)
                {
                    flag = false;
                } else
                {
                    ((EO) (obj)).a(((sZ) (obj1)).mFirstSnap, ((sZ) (obj1)), i1);
                    flag = true;
                }
            }
            ((EO) (obj)).b(false);
            if (!flag && n.c())
            {
                AlertDialogUtils.a((new StringBuilder("ALPHA-ONLY: Could not open story level ")).append(i1).toString(), j);
            }
            obj = eo.h();
            if (obj != null)
            {
                r.b(((Bk) (obj)).d(), StoryLoadingStatus.ABANDONED);
            }
            eo.a();
        } else
        {
            Timber.d("ExplorerStoryLevelsController", "Attempt to jump down more than one level.", new Object[0]);
        }
        if (j1 <= g && f == j1 - 1)
        {
            b();
        }
        t = -1;
    }

    public final boolean c()
    {
        return FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.STORY_EXPLORER) && d;
    }

    public final void onGetExplorerStorySnapsTaskCompletedEvent(MR mr)
    {
        if (!mr.mWasRequestSuccessful)
        {
            r.a(mr.mStoryId, StoryLoadingStatus.NETWORK_ERROR);
        } else
        {
            EO eo = ((StorySnapView)a.getChildAt(f)).g;
            Bk bk = eo.h();
            if (bk != null && TextUtils.equals(mr.mStoryId, bk.d()))
            {
                a(bk, eo.e());
                r.a(mr.mStoryId, StoryLoadingStatus.SUCCESS);
                return;
            }
        }
    }
}
