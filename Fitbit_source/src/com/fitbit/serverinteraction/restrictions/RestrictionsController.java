// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.restrictions;

import android.content.Context;
import com.fitbit.data.bl.exceptions.BlockerRestrictionException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.o;
import com.fitbit.serverinteraction.t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction.restrictions:
//            RestrictionInfo, a

public class RestrictionsController
{
    public static interface PresenceListener
    {

        public abstract void a();

        public abstract void a(OfflineReason offlinereason);
    }

    public static final class PresenceListener.OfflineReason extends Enum
    {

        public static final PresenceListener.OfflineReason a;
        public static final PresenceListener.OfflineReason b;
        public static final PresenceListener.OfflineReason c;
        public static final PresenceListener.OfflineReason d;
        public static final PresenceListener.OfflineReason e;
        private static final PresenceListener.OfflineReason f[];

        public static PresenceListener.OfflineReason valueOf(String s)
        {
            return (PresenceListener.OfflineReason)Enum.valueOf(com/fitbit/serverinteraction/restrictions/RestrictionsController$PresenceListener$OfflineReason, s);
        }

        public static PresenceListener.OfflineReason[] values()
        {
            return (PresenceListener.OfflineReason[])f.clone();
        }

        public String a(Context context, RestrictionsController restrictionscontroller)
        {
            int i = 0x7f08018e;
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[PresenceListener.OfflineReason.values().length];
                    try
                    {
                        a[com.fitbit.serverinteraction.restrictions.PresenceListener.OfflineReason.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[PresenceListener.OfflineReason.e.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[PresenceListener.OfflineReason.d.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            com.fitbit.serverinteraction.restrictions._cls1.a[ordinal()];
            JVM INSTR tableswitch 1 3: default 36
        //                       1 42
        //                       2 48
        //                       3 66;
               goto _L1 _L2 _L3 _L4
_L1:
            return context.getString(i);
_L2:
            i = 0x7f08053d;
            continue; /* Loop/switch isn't completed */
_L3:
            if (!ServerSavedState.l().equals(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a))
            {
                i = 0x7f08018d;
            }
            if (true) goto _L1; else goto _L4
_L4:
            restrictionscontroller = restrictionscontroller.c();
            if (restrictionscontroller != null)
            {
                return restrictionscontroller.d();
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        static 
        {
            a = new PresenceListener.OfflineReason("NO_NETWORK_CONNECTION", 0);
            b = new PresenceListener.OfflineReason("SERVER_UNAVAILABLE", 1);
            c = new PresenceListener.OfflineReason("INTERNAL_SERVER_ERROR", 2);
            d = new PresenceListener.OfflineReason("BLOCKED_BY_RESTRICTION", 3);
            e = new PresenceListener.OfflineReason("BACKOFF", 4);
            f = (new PresenceListener.OfflineReason[] {
                a, b, c, d, e
            });
        }

        private PresenceListener.OfflineReason(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a(RestrictionInfo restrictioninfo);

        public abstract void a(List list);

        public abstract void b(RestrictionInfo restrictioninfo);
    }


    private static final String a = "RestrictionsController";
    private PresenceListener.OfflineReason b;
    private Object c;
    private Set d;
    private Set e;
    private AtomicBoolean f;

    public RestrictionsController()
    {
        c = new Object();
        f = new AtomicBoolean(false);
        d = new HashSet();
        e = new HashSet();
    }

    private void a(RestrictionInfo restrictioninfo)
    {
        Set set = e;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((a)iterator.next()).a(restrictioninfo)) { }
        break MISSING_BLOCK_LABEL_49;
        restrictioninfo;
        set;
        JVM INSTR monitorexit ;
        throw restrictioninfo;
        set;
        JVM INSTR monitorexit ;
    }

    private void a(PresenceListener.OfflineReason offlinereason)
    {
        b = offlinereason;
    }

    private void a(PresenceListener presencelistener, boolean flag)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        d.add(presencelistener);
        if (flag) goto _L2; else goto _L1
_L1:
        if (!f()) goto _L4; else goto _L3
_L3:
        presencelistener.a();
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        PresenceListener.OfflineReason offlinereason;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        offlinereason = PresenceListener.OfflineReason.b;
_L6:
        presencelistener.a(offlinereason);
        if (true) goto _L2; else goto _L5
_L5:
        presencelistener;
        obj;
        JVM INSTR monitorexit ;
        throw presencelistener;
        offlinereason = b;
          goto _L6
    }

    private void a(a a1, boolean flag)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        Set set = e;
        set;
        JVM INSTR monitorenter ;
        e.add(a1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        a1.a(c());
        a1.b(d());
        set;
        JVM INSTR monitorexit ;
        return;
        a1;
        set;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private void a(List list)
    {
        Set set = e;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((a)iterator.next()).a(list)) { }
        break MISSING_BLOCK_LABEL_49;
        list;
        set;
        JVM INSTR monitorexit ;
        throw list;
        set;
        JVM INSTR monitorexit ;
    }

    private void a(RestrictionInfo arestrictioninfo[], boolean flag)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (!f.compareAndSet(false, true)) goto _L2; else goto _L1
_L1:
        RestrictionInfo arestrictioninfo1[];
        arestrictioninfo1 = arestrictioninfo;
        if (arestrictioninfo != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        arestrictioninfo1 = arestrictioninfo;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        arestrictioninfo1 = e();
        ArrayList arraylist = new ArrayList();
        if (arestrictioninfo1 == null)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        int j = arestrictioninfo1.length;
        int i;
        i = 0;
        obj = null;
        arestrictioninfo = ((RestrictionInfo []) (obj1));
_L18:
        Object obj2;
        obj1 = arestrictioninfo;
        obj2 = obj;
        if (i >= j) goto _L4; else goto _L3
_L3:
        obj1 = arestrictioninfo1[i];
        obj2 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj2 = obj;
        if (((RestrictionInfo) (obj1)).b())
        {
            obj2 = obj1;
        }
        if (!((RestrictionInfo) (obj1)).a()) goto _L6; else goto _L5
_L5:
        if (arestrictioninfo == null) goto _L8; else goto _L7
_L7:
        if (arestrictioninfo.b() || !((RestrictionInfo) (obj1)).b()) goto _L6; else goto _L8
_L6:
        if (((RestrictionInfo) (obj1)).c())
        {
            arraylist.add(obj1);
        }
          goto _L9
_L4:
        boolean flag1;
        flag = com.fitbit.serverinteraction.restrictions.a.a(((RestrictionInfo) (obj2)));
        flag1 = com.fitbit.serverinteraction.restrictions.a.b(((RestrictionInfo) (obj1)));
        arestrictioninfo = com.fitbit.serverinteraction.restrictions.a.a();
        if (arestrictioninfo == null) goto _L11; else goto _L10
_L10:
        ServerSavedState.a(ServerGateway.a().c().a(), com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a);
_L15:
        if (arestrictioninfo != null) goto _L13; else goto _L12
_L12:
        if (!f()) goto _L13; else goto _L14
_L14:
        a(true, ((PresenceListener.OfflineReason) (null)));
_L17:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        a(((RestrictionInfo) (obj2)));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        b(((RestrictionInfo) (obj1)));
        a(((List) (arraylist)));
_L2:
        f.set(false);
        return;
_L11:
        ServerSavedState.m();
          goto _L15
        arestrictioninfo;
        com.fitbit.e.a.e("RestrictionsController", arestrictioninfo);
        f.set(false);
        return;
_L13:
        if (arestrictioninfo == null) goto _L17; else goto _L16
_L16:
        a(false, PresenceListener.OfflineReason.d);
          goto _L17
        arestrictioninfo;
        com.fitbit.e.a.e("RestrictionsController", arestrictioninfo);
        f.set(false);
        return;
        arestrictioninfo;
        com.fitbit.e.a.e("RestrictionsController", arestrictioninfo);
        f.set(false);
        return;
        arestrictioninfo;
        f.set(false);
        throw arestrictioninfo;
_L8:
        arestrictioninfo = ((RestrictionInfo []) (obj1));
          goto _L6
_L9:
        i++;
        obj = obj2;
          goto _L18
        obj2 = null;
        obj1 = obj;
          goto _L4
    }

    private static RestrictionInfo[] a(JSONObject jsonobject)
    {
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        if (!jsonobject.has("restrictions")) goto _L2; else goto _L3
_L3:
        JSONArray jsonarray = jsonobject.getJSONArray("restrictions");
        if (jsonarray == null) goto _L2; else goto _L4
_L4:
        if (jsonarray.length() <= 0) goto _L2; else goto _L5
_L5:
        RestrictionInfo arestrictioninfo[] = new RestrictionInfo[jsonarray.length()];
        int i = 0;
_L7:
        jsonobject = arestrictioninfo;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i);
        arestrictioninfo[i] = new RestrictionInfo(jsonobject.getString("type"), jsonobject.getString("message"));
        i++;
        if (true) goto _L7; else goto _L6
        jsonobject;
        com.fitbit.e.a.e("RestrictionsController", jsonobject);
_L2:
        jsonobject = null;
_L6:
        return jsonobject;
    }

    private void b(RestrictionInfo restrictioninfo)
    {
        Set set = e;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((a)iterator.next()).b(restrictioninfo)) { }
        break MISSING_BLOCK_LABEL_49;
        restrictioninfo;
        set;
        JVM INSTR monitorexit ;
        throw restrictioninfo;
        set;
        JVM INSTR monitorexit ;
    }

    private RestrictionInfo[] e()
        throws JSONException, ServerCommunicationException
    {
        return a((new PublicAPI(ServerGateway.a())).B());
    }

    private boolean f()
    {
        return ServerGateway.a().d();
    }

    public PresenceListener.OfflineReason a()
    {
        return b;
    }

    public void a(PresenceListener presencelistener)
    {
        synchronized (c)
        {
            d.remove(presencelistener);
        }
        return;
        presencelistener;
        obj;
        JVM INSTR monitorexit ;
        throw presencelistener;
    }

    public void a(a a1)
    {
        if (a1 != null)
        {
            synchronized (e)
            {
                e.remove(a1);
            }
            return;
        } else
        {
            return;
        }
        a1;
        set;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void a(HttpURLConnection httpurlconnection)
        throws BlockerRestrictionException, ServerCommunicationException
    {
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i <= 299) goto _L2; else goto _L1
_L1:
        java.io.InputStream inputstream = httpurlconnection.getErrorStream();
        httpurlconnection = null;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        httpurlconnection = t.a(inputstream);
        if (i != 413) goto _L4; else goto _L3
_L3:
        try
        {
            throw new ServerCommunicationException(i, httpurlconnection);
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            com.fitbit.e.a.e("RestrictionsController", (new StringBuilder()).append("Unable to check restrictions in response: ").append(httpurlconnection.toString()).toString(), httpurlconnection, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            com.fitbit.e.a.e("RestrictionsController", (new StringBuilder()).append("Unable to check restrictions in response: ").append(httpurlconnection.toString()).toString(), httpurlconnection, new Object[0]);
            return;
        }
_L2:
        return;
_L4:
        if (inputstream == null) goto _L2; else goto _L5
_L5:
        httpurlconnection = a(new JSONObject(httpurlconnection));
        if (httpurlconnection == null) goto _L2; else goto _L6
_L6:
        a(((RestrictionInfo []) (httpurlconnection)), false);
        throw new BlockerRestrictionException();
    }

    public void a(boolean flag, int i)
    {
        PresenceListener.OfflineReason offlinereason;
        if (com.fitbit.serverinteraction.restrictions.a.a() != null)
        {
            offlinereason = PresenceListener.OfflineReason.d;
        } else
        if (i == 409)
        {
            offlinereason = PresenceListener.OfflineReason.e;
        } else
        if (i / 100 == 5)
        {
            offlinereason = PresenceListener.OfflineReason.c;
        } else
        {
            offlinereason = PresenceListener.OfflineReason.b;
        }
        a(flag, offlinereason);
    }

    public void a(boolean flag, PresenceListener.OfflineReason offlinereason)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = d.iterator();
_L1:
        PresenceListener presencelistener;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        presencelistener = (PresenceListener)iterator.next();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        presencelistener.a();
          goto _L1
        offlinereason;
        obj;
        JVM INSTR monitorexit ;
        throw offlinereason;
        a(offlinereason);
        presencelistener.a(offlinereason);
          goto _L1
        obj;
        JVM INSTR monitorexit ;
    }

    public void b()
    {
        a(((RestrictionInfo []) (null)), true);
    }

    public void b(PresenceListener presencelistener)
    {
        a(presencelistener, false);
    }

    public void b(a a1)
    {
        a(a1, false);
    }

    public RestrictionInfo c()
    {
        return com.fitbit.serverinteraction.restrictions.a.a();
    }

    public void c(PresenceListener presencelistener)
    {
        a(presencelistener, true);
    }

    public void c(a a1)
    {
        a(a1, true);
    }

    public RestrictionInfo d()
    {
        return com.fitbit.serverinteraction.restrictions.a.b();
    }
}
