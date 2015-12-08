// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import AV;
import Bk;
import IJ;
import Pl;
import QW;
import QX;
import SM;
import SV;
import Tw;
import android.content.Context;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;
import ds;
import dv;
import en;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sX;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager

public class StoryCollection
    implements Comparable
{
    public static final class StoriesFragmentRecentsPriority extends Enum
    {

        private static final StoriesFragmentRecentsPriority $VALUES[];
        public static final StoriesFragmentRecentsPriority LIVE;
        public static final StoriesFragmentRecentsPriority RECENT_UPDATES;

        public static StoriesFragmentRecentsPriority valueOf(String s)
        {
            return (StoriesFragmentRecentsPriority)Enum.valueOf(com/snapchat/android/model/StoryCollection$StoriesFragmentRecentsPriority, s);
        }

        public static StoriesFragmentRecentsPriority[] values()
        {
            return (StoriesFragmentRecentsPriority[])$VALUES.clone();
        }

        static 
        {
            RECENT_UPDATES = new StoriesFragmentRecentsPriority("RECENT_UPDATES", 0);
            LIVE = new StoriesFragmentRecentsPriority("LIVE", 1);
            $VALUES = (new StoriesFragmentRecentsPriority[] {
                RECENT_UPDATES, LIVE
            });
        }

        private StoriesFragmentRecentsPriority(String s, int i1)
        {
            super(s, i1);
        }
    }


    private static final String TAG = "StoryCollection";
    public int mAdIntervalIndex;
    public Tw mAdMetadata;
    private final FriendManager mFriendManager;
    public boolean mHasCustomDescription;
    public boolean mIsDeepLinkOnly;
    public boolean mIsLiveAndExplorerEnabled;
    public boolean mIsLocal;
    public String mLiveDisplayName;
    public int mNextAdOpportunityPosition;
    public int mNumSnapsSinceLastAdOpportunity;
    public String mSharedId;
    protected final List mStorySnaps;
    private final Object mStorySnapsMutex;
    public SV mThumbnails;
    protected final List mUnviewedStorySnaps;
    public boolean mUserHasSeenInFeed;
    public String mUsername;

    public StoryCollection()
    {
        this(((List) (new ArrayList())));
    }

    public StoryCollection(QW qw)
    {
        mUserHasSeenInFeed = true;
        mAdIntervalIndex = 0;
        mNumSnapsSinceLastAdOpportunity = 0;
        mNextAdOpportunityPosition = -1;
        mIsDeepLinkOnly = false;
        mLiveDisplayName = "";
        mIsLiveAndExplorerEnabled = false;
        a(qw);
        mUserHasSeenInFeed = false;
        mStorySnaps = en.a(qw.b().size());
        mUnviewedStorySnaps = new ArrayList();
        mStorySnapsMutex = new Object();
        for (Iterator iterator = qw.b().iterator(); iterator.hasNext();)
        {
            QX qx = (QX)iterator.next();
            Bk bk = new Bk(qx.a());
            if (bk.aK())
            {
                Timber.c("StoryCollection", "Ignoring legacy ad slot %s from server response.", new Object[] {
                    bk
                });
            } else
            {
                bk.mHasBeenViewed = IJ.a(qx.b());
                bk.aH();
                mStorySnaps.add(bk);
            }
        }

        mAdMetadata = qw.h();
        mThumbnails = qw.i();
        mFriendManager = FriendManager.e();
        mUsername = ((Bk)mStorySnaps.get(0)).j();
        p();
    }

    public StoryCollection(List list)
    {
        this(list, FriendManager.e());
    }

    private StoryCollection(List list, FriendManager friendmanager)
    {
        this(list, friendmanager, ((List) (new ArrayList())));
    }

    private StoryCollection(List list, FriendManager friendmanager, List list1)
    {
        this(list, friendmanager, list1, new Object());
    }

    private StoryCollection(List list, FriendManager friendmanager, List list1, Object obj)
    {
        mUserHasSeenInFeed = true;
        mAdIntervalIndex = 0;
        mNumSnapsSinceLastAdOpportunity = 0;
        mNextAdOpportunityPosition = -1;
        mIsDeepLinkOnly = false;
        mLiveDisplayName = "";
        mIsLiveAndExplorerEnabled = false;
        mStorySnaps = (List)dv.a(list);
        mFriendManager = friendmanager;
        mUnviewedStorySnaps = list1;
        mStorySnapsMutex = obj;
        mAdMetadata = null;
        mThumbnails = null;
        if (!mStorySnaps.isEmpty())
        {
            mUsername = ((Bk)mStorySnaps.get(0)).j();
            p();
        }
    }

    private Bk a(List list, Bk bk)
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = list.iterator();
        list = null;
_L2:
        Bk bk1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        bk1 = (Bk)iterator.next();
        if (bk1.d().equals(bk.d()))
        {
            break; /* Loop/switch isn't completed */
        }
        list = bk1;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return list;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    private static LinkedHashMap a(List list)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap(list.size());
        Bk bk;
        for (list = list.iterator(); list.hasNext(); linkedhashmap.put(bk.d(), bk))
        {
            bk = (Bk)list.next();
        }

        return linkedhashmap;
    }

    private void a(QW qw)
    {
        mUsername = qw.a();
        mLiveDisplayName = qw.d();
        mSharedId = qw.g();
        mIsLocal = IJ.a(qw.e());
        mHasCustomDescription = IJ.a(qw.f());
        mThumbnails = qw.i();
        boolean flag;
        if (mSharedId != null && qw.k() && qw.j().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsLiveAndExplorerEnabled = flag;
    }

    private int b(List list, Bk bk)
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        list = list.iterator();
        double d1 = 0.0D;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Bk bk1 = (Bk)list.next();
            if (TextUtils.equals(bk1.d(), bk.d()))
            {
                break;
            }
            d1 = bk1.G() + d1;
        } while (true);
        obj;
        JVM INSTR monitorexit ;
        return (int)Math.ceil(d1);
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    private int c(List list, Bk bk)
    {
        int i1;
        synchronized (mStorySnapsMutex)
        {
            i1 = list.indexOf(bk);
        }
        if (i1 == -1)
        {
            return 0;
        } else
        {
            return i1;
        }
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    private Bk j(Bk bk)
    {
        return a(mStorySnaps, bk);
    }

    private void p()
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        mUnviewedStorySnaps.clear();
        Iterator iterator = mStorySnaps.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Bk bk = (Bk)iterator.next();
            if (!bk.D())
            {
                mUnviewedStorySnaps.add(bk);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_71;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    private int q()
    {
        int i1;
        synchronized (mStorySnapsMutex)
        {
            i1 = mStorySnaps.size();
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Bk a(String s)
    {
label0:
        {
            Bk bk;
            synchronized (mStorySnapsMutex)
            {
                Iterator iterator = mStorySnaps.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    bk = (Bk)iterator.next();
                } while (!TextUtils.equals(bk.d(), s));
            }
            return bk;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final String a(Context context)
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        if (mStorySnaps.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        context = ((Bk)mStorySnaps.get(0)).b(context);
        return context;
        obj;
        JVM INSTR monitorexit ;
        return "";
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(Bk bk)
    {
        synchronized (mStorySnapsMutex)
        {
            mStorySnaps.add(bk);
            if (!bk.D())
            {
                mUserHasSeenInFeed = false;
                mUnviewedStorySnaps.add(bk);
            }
        }
        return;
        bk;
        obj;
        JVM INSTR monitorexit ;
        throw bk;
    }

    public final void a(QW qw, boolean flag)
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        Object obj2;
        a(qw);
        obj1 = qw.h();
        obj2 = qw.a();
        Object obj3;
        String s;
        boolean flag2;
        if (obj1 != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Timber.c("StoryCollection", "Updating story %s with result from server (delta:%s, ads:%b)", new Object[] {
            obj2, Boolean.valueOf(flag), Boolean.valueOf(flag2)
        });
        if (flag && obj1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        mAdMetadata = ((Tw) (obj1));
        obj1 = a(mStorySnaps);
        obj2 = a(mUnviewedStorySnaps);
        mStorySnaps.clear();
        mUnviewedStorySnaps.clear();
        obj3 = qw.b();
        qw = new HashMap(((List) (obj3)).size());
        obj3 = ((List) (obj3)).iterator();
_L1:
        do
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break MISSING_BLOCK_LABEL_233;
            }
            QX qx = (QX)((Iterator) (obj3)).next();
            s = qx.a().a();
            if (qw.containsKey(s))
            {
                break MISSING_BLOCK_LABEL_213;
            }
            qw.put(s, qx);
        } while (true);
        qw;
        obj;
        JVM INSTR monitorexit ;
        throw qw;
        Timber.d("StoryCollection", "Found duplicated story ID in server response: %s", new Object[] {
            s
        });
          goto _L1
        obj3 = qw.values().iterator();
_L6:
        if (!((Iterator) (obj3)).hasNext()) goto _L3; else goto _L2
_L2:
        QX qx1;
        qx1 = (QX)((Iterator) (obj3)).next();
        qw = new Bk(qx1.a());
        if (!qw.aK()) goto _L5; else goto _L4
_L4:
        Timber.c("StoryCollection", "Ignoring legacy ad slot %s from server response.", new Object[] {
            qw
        });
          goto _L6
_L5:
        flag2 = ((LinkedHashMap) (obj1)).containsKey(qw.d());
        if (!flag2) goto _L8; else goto _L7
_L7:
        qw = (Bk)((LinkedHashMap) (obj1)).get(qw.d());
          goto _L9
_L13:
        mStorySnaps.add(qw);
_L14:
        if (!flag) goto _L11; else goto _L10
_L10:
        if (((LinkedHashMap) (obj2)).containsKey(qw.d()))
        {
            break MISSING_BLOCK_LABEL_496;
        }
          goto _L11
_L15:
        boolean flag1;
        if (IJ.a(qx1.b()) || qw.D())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        qw.mHasBeenViewed = flag2;
        if (flag2 || !flag1) goto _L6; else goto _L12
_L12:
        mUnviewedStorySnaps.add(qw);
          goto _L6
_L8:
        mUserHasSeenInFeed = false;
        qw.aH();
        continue; /* Loop/switch isn't completed */
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_465;
        }
        mStorySnaps.addAll(((LinkedHashMap) (obj1)).values());
        mUnviewedStorySnaps.addAll(((LinkedHashMap) (obj2)).values());
        b();
        obj;
        JVM INSTR monitorexit ;
        return;
_L9:
        if (flag && flag2) goto _L14; else goto _L13
_L11:
        flag1 = true;
          goto _L15
        flag1 = false;
          goto _L15
    }

    public final boolean a()
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        if (mUnviewedStorySnaps.isEmpty())
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return mUserHasSeenInFeed;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (mStorySnapsMutex)
        {
            Collections.sort(mStorySnaps, new AV());
            Collections.sort(mUnviewedStorySnaps, new AV());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(Bk bk)
    {
        synchronized (mStorySnapsMutex)
        {
            Timber.c("StoryCollection", "Removing %s from unviewed story snaps, %s", new Object[] {
                bk, Boolean.valueOf(mUnviewedStorySnaps.remove(bk))
            });
        }
        return;
        bk;
        obj;
        JVM INSTR monitorexit ;
        throw bk;
    }

    public final int c()
    {
        int i1;
        synchronized (mStorySnapsMutex)
        {
            i1 = mStorySnaps.size();
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Bk c(Bk bk)
    {
        obj = j(bk);
        Timber.c("StoryCollection", "getNextSnapToView returning %s. Supplied current snap is %s", new Object[] {
            obj, bk
        });
        if (ReleaseManager.f())
        {
            synchronized (mStorySnapsMutex)
            {
                Timber.c("StoryCollection", "Collection for %s - unviewed:%d, total:%d", new Object[] {
                    mUsername, Integer.valueOf(mUnviewedStorySnaps.size()), Integer.valueOf(mStorySnaps.size())
                });
            }
            return ((Bk) (obj));
        } else
        {
            return ((Bk) (obj));
        }
        obj;
        bk;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public int compareTo(Object obj)
    {
        return Pl.a(((StoryCollection)obj).m(), m());
    }

    public final int d()
    {
        int i1;
        synchronized (mStorySnapsMutex)
        {
            i1 = mUnviewedStorySnaps.size();
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Bk d(Bk bk)
    {
        return j(bk);
    }

    public final List e()
    {
        ArrayList arraylist;
        synchronized (mStorySnapsMutex)
        {
            arraylist = en.a(mStorySnaps);
        }
        return arraylist;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean e(Bk bk)
    {
        return j(bk) != null;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass().equals(com/snapchat/android/model/StoryCollection))
        {
            obj = (StoryCollection)obj;
            if (mUsername != null && ((StoryCollection) (obj)).mUsername != null)
            {
                return mUsername.equals(((StoryCollection) (obj)).mUsername);
            }
        }
        return false;
    }

    public final int f(Bk bk)
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = mStorySnaps.iterator();
        int i1 = 0;
        while (iterator.hasNext() && !((Bk)iterator.next()).d().equals(bk.d())) 
        {
            i1++;
        }
        obj;
        JVM INSTR monitorexit ;
        return i1;
        bk;
        obj;
        JVM INSTR monitorexit ;
        throw bk;
    }

    public final List f()
    {
        ArrayList arraylist;
        synchronized (mStorySnapsMutex)
        {
            arraylist = en.a(mUnviewedStorySnaps);
        }
        return arraylist;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int g(Bk bk)
    {
        return b(mStorySnaps, bk);
    }

    public final boolean g()
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = mStorySnaps.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Bk bk = (Bk)iterator.next();
            if (bk.aG() || bk.mWas404ResponseReceived)
            {
                Timber.c("StoryCollection", "Removing story snap %s from %s, expired:%b 404ed:%b", new Object[] {
                    bk, this, Boolean.valueOf(bk.aG()), Boolean.valueOf(bk.mWas404ResponseReceived)
                });
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_104;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag;
        p();
        flag = mStorySnaps.isEmpty();
        obj;
        JVM INSTR monitorexit ;
        return flag;
    }

    public final int h(Bk bk)
    {
        return c(mStorySnaps, bk);
    }

    public final String h()
    {
        if (!TextUtils.isEmpty(mLiveDisplayName))
        {
            return mLiveDisplayName;
        } else
        {
            return mFriendManager.k(mUsername);
        }
    }

    public int hashCode()
    {
        return (mUsername.hashCode() + 589) * 31 + "StoryCollection".hashCode();
    }

    public final int i(Bk bk)
    {
        double d1 = 0.0D;
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = mStorySnaps.iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Bk bk1 = (Bk)iterator.next();
        if (bk == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (!TextUtils.equals(bk.d(), bk1.d()))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        d1 = bk1.G() + d1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return (int)Math.ceil(d1);
        d1 += bk1.G();
          goto _L3
        bk;
        obj;
        JVM INSTR monitorexit ;
        throw bk;
    }

    public final Bk i()
    {
label0:
        {
            synchronized (mStorySnapsMutex)
            {
                if (!mStorySnaps.isEmpty())
                {
                    break label0;
                }
            }
            return null;
        }
        Bk bk = (Bk)mStorySnaps.get(q() - 1);
        obj;
        JVM INSTR monitorexit ;
        return bk;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int j()
    {
        int i1;
        synchronized (mStorySnapsMutex)
        {
            i1 = Math.max(0, mStorySnaps.size() - mUnviewedStorySnaps.size());
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Bk k()
    {
label0:
        {
            synchronized (mStorySnapsMutex)
            {
                if (!mUnviewedStorySnaps.isEmpty())
                {
                    break label0;
                }
            }
            return null;
        }
        Bk bk;
        bk = (Bk)mUnviewedStorySnaps.get(mUnviewedStorySnaps.size() - 1);
        Timber.c("StoryCollection", "Returning story snap %s", new Object[] {
            bk
        });
        obj;
        JVM INSTR monitorexit ;
        return bk;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean l()
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        List list;
        int i1;
        int j1;
        list = mUnviewedStorySnaps;
        i1 = list.size() - 1;
        j1 = Math.max(0, (i1 - sX.a().b()) + 1);
_L4:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        Bk bk = (Bk)list.get(i1);
        if (bk.P() || bk.O() && !bk.U()) goto _L2; else goto _L1
_L3:
        obj;
        JVM INSTR monitorexit ;
        boolean flag;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        flag = false;
          goto _L3
_L2:
        i1--;
          goto _L4
        flag = true;
          goto _L3
    }

    public final long m()
    {
        Object obj = mStorySnapsMutex;
        obj;
        JVM INSTR monitorenter ;
        long l1;
        if (mStorySnaps.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        l1 = ((Bk)mStorySnaps.get(0)).W();
        return l1;
        obj;
        JVM INSTR monitorexit ;
        return -1L;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean n()
    {
        return mSharedId != null;
    }

    public final StoriesFragmentRecentsPriority o()
    {
        if (n())
        {
            return StoriesFragmentRecentsPriority.LIVE;
        } else
        {
            return StoriesFragmentRecentsPriority.RECENT_UPDATES;
        }
    }

    public String toString()
    {
        String s;
        synchronized (mStorySnapsMutex)
        {
            s = ds.a("StoryCollection").a("username", mUsername).a("count", mStorySnaps.size()).a("unviewedCount", mUnviewedStorySnaps.size()).toString();
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
