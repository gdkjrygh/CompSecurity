// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.internal.IGamesClient;
import com.google.android.gms.games.internal.PopupLocationInfoParcelable;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class GameEventListenerRegistry
{
    private static final class CacheKey
    {

        final String mAccountName;
        final String mExternalGameId;

        public final boolean equals(Object obj)
        {
            if (obj instanceof CacheKey)
            {
                if (Objects.equal(mAccountName, ((CacheKey) (obj = (CacheKey)obj)).mAccountName) && Objects.equal(mExternalGameId, ((CacheKey) (obj)).mExternalGameId))
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                mAccountName, mExternalGameId
            });
        }

        public final String toString()
        {
            return Objects.toStringHelper(this).add("Account", mAccountName).add("GameId", mExternalGameId).toString();
        }

        public CacheKey(String s, String s1)
        {
            mAccountName = s;
            mExternalGameId = s1;
        }
    }

    private static abstract class GameEventDeliverable
    {

        protected final DataHolder mDataHolder;
        protected final String mEventId;
        protected final String mExternalGameId;
        protected final boolean mIsTombstone;

        protected abstract void deliver(IInterface iinterface)
            throws RemoteException;

        protected final WrappedGamesCallbacks getGamesCallbacks(IInterface iinterface)
        {
            Preconditions.checkState(iinterface instanceof IGamesCallbacks, "The AIDL interface was not IGamesCallbacks");
            return new WrappedGamesCallbacks((IGamesCallbacks)iinterface, mExternalGameId);
        }

        public GameEventDeliverable(String s, DataHolder dataholder, String s1, boolean flag)
        {
            mExternalGameId = s;
            mDataHolder = dataholder;
            mEventId = s1;
            mIsTombstone = flag;
        }
    }

    private static final class ListenerStackEntry
    {

        final long mClientId;
        final IInterface mListener;

        public ListenerStackEntry(long l, IInterface iinterface)
        {
            boolean flag;
            if ((iinterface instanceof IGamesClient) || (iinterface instanceof IGamesCallbacks))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "The callbacks must be IGamesClient or IGamesCallbacks");
            mClientId = l;
            mListener = iinterface;
        }
    }


    private static final int EVENT_TYPES[] = {
        0, 1, 2, 3, 4, 5
    };
    private static final Object INSTANCE_LOCK = new Object();
    private static GameEventListenerRegistry sInstance;
    private final ArrayList mHistory = new ArrayList();
    private final ArrayList mListenerMaps = new ArrayList();

    private GameEventListenerRegistry()
    {
        for (int i = 0; i < 6; i++)
        {
            mListenerMaps.add(new HashMap());
        }

    }

    private boolean deliverEvent(String s, String s1, GameEventDeliverable gameeventdeliverable, int i)
    {
        boolean flag1 = deliverEventData(s, s1, gameeventdeliverable, i);
        boolean flag = flag1;
        if (!flag1)
        {
            flag = deliverEventData(s, null, gameeventdeliverable, i);
        }
        return flag;
    }

    private boolean deliverEventData(String s, String s1, GameEventDeliverable gameeventdeliverable, int i)
    {
        s = (ArrayList)getListenerCache(i).get(new CacheKey(s, s1));
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i = s.size() - 1;
_L6:
        if (i < 0) goto _L1; else goto _L3
_L3:
        IInterface iinterface;
        s1 = (ListenerStackEntry)s.get(i);
        iinterface = ((ListenerStackEntry) (s1)).mListener;
        if (iinterface != null) goto _L5; else goto _L4
_L4:
        s.remove(i);
_L7:
        i--;
          goto _L6
_L5:
        GamesLog.d("GameEventRegistry", (new StringBuilder("Delivering to: ")).append(((ListenerStackEntry) (s1)).mClientId).toString());
        gameeventdeliverable.deliver(iinterface);
        GamesLog.d("GameEventRegistry", (new StringBuilder("Delivered to: ")).append(((ListenerStackEntry) (s1)).mClientId).toString());
        return true;
        RemoteException remoteexception;
        remoteexception;
        s.remove(i);
        GamesLog.d("GameEventRegistry", (new StringBuilder("Remote exception delivering to: ")).append(((ListenerStackEntry) (s1)).mClientId).toString());
          goto _L7
    }

    private void dumpListeners(int i, String s, PrintWriter printwriter)
    {
        Iterator iterator = getListenerCache(i).keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            CacheKey cachekey = (CacheKey)iterator.next();
            ArrayList arraylist = (ArrayList)getListenerCache(i).get(cachekey);
            if (arraylist != null)
            {
                printwriter.println(String.format((new StringBuilder("  ")).append(s).append(" for %s [%d]:").toString(), new Object[] {
                    cachekey.mExternalGameId, Integer.valueOf(arraylist.size())
                }));
                int j = arraylist.size() - 1;
                while (j >= 0) 
                {
                    ListenerStackEntry listenerstackentry = (ListenerStackEntry)arraylist.get(j);
                    printwriter.println((new StringBuilder("    Listener ")).append(j).append(" ").append(listenerstackentry.mClientId).toString());
                    j--;
                }
            }
        } while (true);
    }

    public static GameEventListenerRegistry getInstance()
    {
        AndroidUtils.assertMainGmsProcess();
        synchronized (INSTANCE_LOCK)
        {
            if (sInstance == null)
            {
                sInstance = new GameEventListenerRegistry();
            }
        }
        return sInstance;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private HashMap getListenerCache(int i)
    {
        if (i < 0 || i >= 6)
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown event type ")).append(i).toString());
        } else
        {
            return (HashMap)mListenerMaps.get(i);
        }
    }

    private boolean hasListener(String s, String s1, int i)
    {
        HashMap hashmap = getListenerCache(i);
        s1 = (ArrayList)hashmap.get(new CacheKey(s, s1));
        if (s1 == null || s1.size() <= 0)
        {
            if ((s = (ArrayList)hashmap.get(new CacheKey(s, null))) == null || s.size() <= 0)
            {
                return false;
            }
        }
        return true;
    }

    private void register(String s, String s1, long l, IInterface iinterface, int i)
    {
        HashMap hashmap = getListenerCache(i);
        CacheKey cachekey = new CacheKey(s, s1);
        s1 = (ArrayList)hashmap.get(cachekey);
        s = s1;
        if (s1 == null)
        {
            s = new ArrayList();
            hashmap.put(cachekey, s);
        }
        i = 0;
        int j = s.size();
        do
        {
label0:
            {
                if (i < j)
                {
                    if (((ListenerStackEntry)s.get(i)).mClientId != l)
                    {
                        break label0;
                    }
                    GamesLog.d("GameEventRegistry", (new StringBuilder("Removing listener ")).append(l).append(" from key ").append(cachekey).toString());
                    s.remove(i);
                }
                GamesLog.d("GameEventRegistry", (new StringBuilder("Added listener ")).append(l).append(" for key ").append(cachekey).toString());
                s.add(new ListenerStackEntry(l, iinterface));
                return;
            }
            i++;
        } while (true);
    }

    private void unregister(String s, String s1, long l, int i)
    {
        unregisterClientForKey(l, new CacheKey(s, s1), i);
    }

    private void unregisterClientForKey(long l, CacheKey cachekey, int i)
    {
        HashMap hashmap;
        ArrayList arraylist;
        hashmap = getListenerCache(i);
        arraylist = (ArrayList)hashmap.get(cachekey);
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        int k;
        j = 0;
        k = arraylist.size();
_L4:
        if (j >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ListenerStackEntry)arraylist.get(j)).mClientId != l)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        GamesLog.d("GameEventRegistry", (new StringBuilder("Unregistering ")).append(l).append(" for ").append(cachekey.mExternalGameId).toString());
        arraylist.remove(j);
        if (arraylist.size() != 0) goto _L1; else goto _L3
_L3:
        GamesLog.d("GameEventRegistry", (new StringBuilder("All type ")).append(i).append(" listeners removed for ").append(cachekey.mExternalGameId).toString());
        hashmap.remove(cachekey);
        return;
        j++;
          goto _L4
    }

    public final void clear(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int i = 0;
_L5:
        if (i >= 6)
        {
            break; /* Loop/switch isn't completed */
        }
        HashMap hashmap;
        ArrayList arraylist;
        hashmap = getListenerCache(EVENT_TYPES[i]);
        arraylist = new ArrayList();
        Iterator iterator = hashmap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            CacheKey cachekey1 = (CacheKey)iterator.next();
            if (cachekey1.mAccountName.equals(s))
            {
                arraylist.add(cachekey1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_91;
        s;
        throw s;
        int k = arraylist.size();
        int j = 0;
_L3:
        if (j >= k) goto _L2; else goto _L1
_L1:
        CacheKey cachekey = (CacheKey)arraylist.get(j);
        if (hashmap.containsKey(cachekey))
        {
            GamesLog.d("GameEventRegistry", (new StringBuilder("Clearing  listeners for ")).append(cachekey.mExternalGameId).toString());
            hashmap.remove(cachekey);
        }
        j++;
          goto _L3
_L2:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void clearClient(long l)
    {
        this;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= 6)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = EVENT_TYPES[i];
        for (Iterator iterator = (new HashSet(getListenerCache(j).keySet())).iterator(); iterator.hasNext(); unregisterClientForKey(l, (CacheKey)iterator.next(), j)) { }
        break MISSING_BLOCK_LABEL_75;
        Exception exception;
        exception;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean deliverInvitation(String s, String s1, String s2, DataHolder dataholder, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        flag = deliverEvent(s, s1, new GameEventDeliverable(s1, dataholder, s2, flag) {

            final GameEventListenerRegistry this$0;

            protected final void deliver(IInterface iinterface)
                throws RemoteException
            {
                iinterface = getGamesCallbacks(iinterface);
                if (mIsTombstone)
                {
                    String s3 = mEventId;
                    ((WrappedGamesCallbacks) (iinterface)).mCallbacks.onInvitationRemoved(s3);
                    return;
                } else
                {
                    DataHolder dataholder1 = mDataHolder;
                    iinterface.audit(new DataHolder[] {
                        dataholder1
                    });
                    ((WrappedGamesCallbacks) (iinterface)).mCallbacks.onInvitationReceived(dataholder1);
                    return;
                }
            }

            
            {
                this$0 = GameEventListenerRegistry.this;
                super(s, dataholder, s1, flag);
            }
        }, 0);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final boolean deliverMatchUpdate(String s, String s1, String s2, DataHolder dataholder, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        flag = deliverEvent(s, s1, new GameEventDeliverable(s1, dataholder, s2, flag) {

            final GameEventListenerRegistry this$0;

            protected final void deliver(IInterface iinterface)
                throws RemoteException
            {
                iinterface = getGamesCallbacks(iinterface);
                if (mIsTombstone)
                {
                    String s3 = mEventId;
                    ((WrappedGamesCallbacks) (iinterface)).mCallbacks.onTurnBasedMatchRemoved(s3);
                    return;
                } else
                {
                    DataHolder dataholder1 = mDataHolder;
                    iinterface.audit(new DataHolder[] {
                        dataholder1
                    });
                    ((WrappedGamesCallbacks) (iinterface)).mCallbacks.onTurnBasedMatchReceived(dataholder1);
                    return;
                }
            }

            
            {
                this$0 = GameEventListenerRegistry.this;
                super(s, dataholder, s1, flag);
            }
        }, 1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final boolean deliverQuestComplete(String s, String s1, String s2, DataHolder dataholder)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = deliverEvent(s, s1, new GameEventDeliverable(s1, dataholder, s2) {

            final GameEventListenerRegistry this$0;

            protected final void deliver(IInterface iinterface)
                throws RemoteException
            {
                iinterface = getGamesCallbacks(iinterface);
                DataHolder dataholder1 = mDataHolder;
                iinterface.audit(new DataHolder[] {
                    dataholder1
                });
                ((WrappedGamesCallbacks) (iinterface)).mCallbacks.onQuestCompleted(dataholder1);
            }

            
            {
                this$0 = GameEventListenerRegistry.this;
                super(s, dataholder, s1, false);
            }
        }, 3);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final boolean deliverRequest(String s, String s1, String s2, DataHolder dataholder, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        flag = deliverEvent(s, s1, new GameEventDeliverable(s1, dataholder, s2, flag) {

            final GameEventListenerRegistry this$0;

            protected final void deliver(IInterface iinterface)
                throws RemoteException
            {
                iinterface = getGamesCallbacks(iinterface);
                if (mIsTombstone)
                {
                    String s3 = mEventId;
                    ((WrappedGamesCallbacks) (iinterface)).mCallbacks.onRequestRemoved(s3);
                    return;
                } else
                {
                    DataHolder dataholder1 = mDataHolder;
                    iinterface.audit(new DataHolder[] {
                        dataholder1
                    });
                    ((WrappedGamesCallbacks) (iinterface)).mCallbacks.onRequestReceived(dataholder1);
                    return;
                }
            }

            
            {
                this$0 = GameEventListenerRegistry.this;
                super(s, dataholder, s1, flag);
            }
        }, 2);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final void dump(PrintWriter printwriter)
    {
        this;
        JVM INSTR monitorenter ;
        dumpListeners(0, "Invitation listeners", printwriter);
        dumpListeners(1, "Match update listeners", printwriter);
        dumpListeners(5, "Popup info listeners", printwriter);
        dumpListeners(3, "Quest update listeners", printwriter);
        dumpListeners(2, "Request listeners", printwriter);
        dumpListeners(4, "Nearby player listeners", printwriter);
        this;
        JVM INSTR monitorexit ;
        return;
        printwriter;
        throw printwriter;
    }

    public final com.google.android.gms.games.internal.PopupManager.PopupLocationInfo getPopupLocationInfo(String s, final String final_s)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.gms.games.internal.PopupManager.PopupLocationInfo apopuplocationinfo[] = new com.google.android.gms.games.internal.PopupManager.PopupLocationInfo[1];
        apopuplocationinfo[0] = null;
        deliverEventData(s, final_s, new GameEventDeliverable(apopuplocationinfo) {

            final GameEventListenerRegistry this$0;
            final com.google.android.gms.games.internal.PopupManager.PopupLocationInfo val$holderObject[];

            protected final void deliver(IInterface iinterface)
                throws RemoteException
            {
                Preconditions.checkState(iinterface instanceof IGamesClient, "The AIDL interface was not IGamesClient");
                iinterface = ((IGamesClient)iinterface).getPopupLocationInfo();
                com.google.android.gms.games.internal.PopupManager.PopupLocationInfo apopuplocationinfo1[] = holderObject;
                if (iinterface == null)
                {
                    iinterface = null;
                } else
                {
                    iinterface = new com.google.android.gms.games.internal.PopupManager.PopupLocationInfo(((PopupLocationInfoParcelable) (iinterface)).mInfoBundle, ((PopupLocationInfoParcelable) (iinterface)).mWindowToken);
                }
                apopuplocationinfo1[0] = iinterface;
            }

            
            {
                this$0 = GameEventListenerRegistry.this;
                holderObject = apopuplocationinfo;
                super(final_s, null, null, false);
            }
        }, 5);
        s = apopuplocationinfo[0];
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final boolean hasInvitationListener(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = hasListener(s, s1, 0);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final boolean hasMatchUpdateListener(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = hasListener(s, s1, 1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final boolean hasQuestUpdateListener(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = hasListener(s, s1, 3);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final boolean hasRequestListener(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = hasListener(s, s1, 2);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final void registerInvitationListener(String s, String s1, long l, IInterface iinterface)
    {
        this;
        JVM INSTR monitorenter ;
        GamesLog.d("GameEventRegistry", (new StringBuilder("Registering invitation listener ")).append(l).append(" for ").append(s1).toString());
        register(s, s1, l, iinterface, 0);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void registerMatchUpdateListener(String s, String s1, long l, IInterface iinterface)
    {
        this;
        JVM INSTR monitorenter ;
        GamesLog.d("GameEventRegistry", (new StringBuilder("Registering match update listener")).append(l).append(" for ").append(s1).toString());
        register(s, s1, l, iinterface, 1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void registerPopupLocationInfoListener(String s, String s1, long l, IInterface iinterface)
    {
        this;
        JVM INSTR monitorenter ;
        GamesLog.d("GameEventRegistry", (new StringBuilder("Registering popup location info listener ")).append(l).append(" for ").append(s1).toString());
        register(s, s1, l, iinterface, 5);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void registerQuestUpdateListener(String s, String s1, long l, IInterface iinterface)
    {
        this;
        JVM INSTR monitorenter ;
        GamesLog.d("GameEventRegistry", (new StringBuilder("Registering quest update listener ")).append(l).append(" for ").append(s1).toString());
        register(s, s1, l, iinterface, 3);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void registerRequestListener(String s, String s1, long l, IInterface iinterface)
    {
        this;
        JVM INSTR monitorenter ;
        GamesLog.d("GameEventRegistry", (new StringBuilder("Registering request listener ")).append(l).append(" for ").append(s1).toString());
        register(s, s1, l, iinterface, 2);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void unregisterInvitationListener(String s, String s1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        unregister(s, s1, l, 0);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void unregisterMatchUpdateListener(String s, String s1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        unregister(s, s1, l, 1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void unregisterQuestUpdateListener(String s, String s1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        unregister(s, s1, l, 3);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void unregisterRequestListener(String s, String s1, long l)
    {
        this;
        JVM INSTR monitorenter ;
        unregister(s, s1, l, 2);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

}
