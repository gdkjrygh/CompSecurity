// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.b.a.d;
import com.tinder.a.f;
import com.tinder.a.h;
import com.tinder.b.g;
import com.tinder.b.j;
import com.tinder.b.l;
import com.tinder.b.m;
import com.tinder.d.a;
import com.tinder.e.n;
import com.tinder.enums.ReportCause;
import com.tinder.events.match.EventMatchNewMessage;
import com.tinder.events.match.EventMatchRemoved;
import com.tinder.events.match.EventMatchTouched;
import com.tinder.events.match.EventMatchesLoaded;
import com.tinder.events.match.EventMatchesUpdateCallComplete;
import com.tinder.f.ak;
import com.tinder.fragments.o;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.Person;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.parse.e;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ah, ManagerApp, ManagerNotifications, ae, 
//            d, m, j, o, 
//            p, q, r, s, 
//            t, u, v, k, 
//            z

public final class i
    implements Runnable
{
    final class a extends AsyncTask
    {

        final i a;
        private final List b;
        private final Date c;

        static List a(a a1)
        {
            return a1.b;
        }

        protected final Object doInBackground(Object aobj[])
        {
            new g();
            aobj = b;
            int k1 = ((List) (aobj)).size();
            int l1 = (int)Math.ceil((float)k1 / 50F);
            boolean flag2 = true;
            boolean flag3 = true;
            boolean flag1 = true;
            boolean flag = true;
            for (int i1 = 0; i1 < l1;)
            {
                Object obj = ((List) (aobj)).subList(i1 * 50, Math.min((i1 + 1) * 50, k1));
                ArrayList arraylist = new ArrayList(((List) (obj)).size());
                ArrayList arraylist1 = new ArrayList(((List) (obj)).size());
                ArrayList arraylist2 = new ArrayList(((List) (obj)).size());
                ArrayList arraylist3 = new ArrayList(((List) (obj)).size());
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Object obj1 = (Match)((Iterator) (obj)).next();
                    arraylist.add(com.tinder.b.g.a(((Match) (obj1))));
                    if (((Match) (obj1)).hasMessages())
                    {
                        for (Iterator iterator = ((Match) (obj1)).getMessages().iterator(); iterator.hasNext(); arraylist1.add(com.tinder.b.h.a((Message)iterator.next()))) { }
                    }
                    if (((Match) (obj1)).getPerson() != null)
                    {
                        obj1 = ((Match) (obj1)).getPerson();
                        List list = ((Person) (obj1)).profilePhotos;
                        int j1 = 0;
                        while (j1 < list.size()) 
                        {
                            Object obj2 = (ProfilePhoto)list.get(j1);
                            arraylist2.add(com.tinder.b.m.a(((ProfilePhoto) (obj2)), ((Person) (obj1)).userId, j1));
                            for (obj2 = ((ProfilePhoto) (obj2)).processedPhotos.iterator(); ((Iterator) (obj2)).hasNext(); arraylist3.add(com.tinder.b.j.a((ProcessedPhoto)((Iterator) (obj2)).next()))) { }
                            j1++;
                        }
                    }
                } while (true);
                flag3 &= com.tinder.b.l.a().a("matches", arraylist, "id");
                flag2 &= com.tinder.b.l.a().a("messages", arraylist1);
                flag1 &= com.tinder.b.l.a().a("photos", arraylist2);
                boolean flag4 = com.tinder.b.l.a().a("photos_processed", arraylist3);
                i1++;
                flag &= flag4;
            }

            if (flag3 && flag2 && flag1 && flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Collections.sort(b);
            if (flag && c != null)
            {
                (new StringBuilder("INSERTION SUCCESSFUL, last activity date: ")).append(c);
                i.i(a);
                com.tinder.managers.ae.a(c.getTime());
                return Boolean.TRUE;
            } else
            {
                return Boolean.FALSE;
            }
        }

        public final void onPostExecute(Object obj)
        {
            if (((Boolean)obj).booleanValue())
            {
                a.a(b, new c(this) {

                    final a a;

                    public final void a()
                    {
                        com.tinder.managers.i.g(a.a);
                        if (com.tinder.managers.i.l())
                        {
                            i.b(false);
                        }
                        com.tinder.managers.i.h(a.a).c(new EventMatchesLoaded(com.tinder.managers.a.a(a)));
                    }

            
            {
                a = a1;
                super();
            }
                });
            }
        }

        public a(List list, Date date)
        {
            a = i.this;
            super();
            b = list;
            c = date;
        }
    }

    static final class b extends Thread
    {

        private final Match a;

        public final void run()
        {
            new g();
            com.tinder.b.g.b(a);
        }

        public b(Match match)
        {
            a = match;
        }
    }

    public static interface c
    {

        public abstract void a();
    }

    public static final class d
    {

        public List a;
        public List b;

        public d()
        {
            a = new ArrayList();
            b = new ArrayList();
        }
    }


    private static final Boolean e;
    private static Date f;
    public final Set a = new HashSet(150);
    boolean b;
    public f c;
    Set d;
    private final g g = new g();
    private boolean h;
    private String i;
    private Handler j;
    private long k;
    private ae l;
    private z m;
    private de.greenrobot.event.c n;
    private com.tinder.d.a o;

    public i(ah ah1, ae ae1, z z1, de.greenrobot.event.c c1, f f1, com.tinder.d.a a1)
    {
        i = "";
        m = z1;
        l = ae1;
        n = c1;
        c = f1;
        o = a1;
        k = ah1.a;
        j = new Handler();
        (new StringBuilder("first load is: ")).append(l());
        (new StringBuilder("Update interval is set to ")).append(k).append(" microseconds");
        h = true;
        (new AsyncTask() {

            final i a;

            protected final Object doInBackground(Object aobj[])
            {
                com.tinder.managers.i.a(a);
                aobj = com.tinder.b.g.e();
                Collections.sort(((List) (aobj)));
                return ((Object) (aobj));
            }

            public final void onPostExecute(Object obj)
            {
                obj = (List)obj;
                a.a(((List) (obj)), new c(this) {

                    final _cls1 a;

                    public final void a()
                    {
                        i.b(a.a);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            
            {
                a = i.this;
                super();
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    static g a(i i1)
    {
        return i1.g;
    }

    static void a(i i1, String s1)
    {
        if (s1 != null)
        {
            com.tinder.managers.ManagerApp.h().o().b(s1);
            Match match = i1.a(s1);
            if (i1.a.remove(match))
            {
                com.tinder.d.a a1 = i1.o;
                i1.a.size();
                a1.a();
            }
            (i1. new AsyncTask(match) {

                final Match a;
                final i b;

                protected final Object doInBackground(Object aobj[])
                {
                    aobj = ((String[])aobj)[0];
                    com.tinder.b.l.a().a("matches", "id", ((String) (aobj)));
                    return null;
                }

                protected final void onPostExecute(Object obj)
                {
                    if (a != null)
                    {
                        com.tinder.managers.i.h(b).d(new EventMatchRemoved(a));
                    }
                }

            
            {
                b = i.this;
                a = match;
                super();
            }
            }).execute(new String[] {
                s1
            });
        }
    }

    public static void a(Date date)
    {
        f = date;
        com.tinder.managers.ManagerApp.h().j();
        com.tinder.managers.ae.a(date.getTime());
    }

    static boolean a(String s1, Match match)
    {
        return match.getId().equals(s1);
    }

    public static void b(Date date)
    {
        if (f == null)
        {
            a(date);
        } else
        if (f.compareTo(date) < 0)
        {
            (new StringBuilder()).append(date).append(" is before the saved activity date (").append(f).append("), resetting saved date");
            a(date);
            return;
        }
    }

    public static void b(boolean flag)
    {
        ae.b.putBoolean("IS_FIRST_LOAD", flag);
        ae.b.commit();
    }

    static boolean b(i i1)
    {
        i1.h = false;
        return false;
    }

    static boolean b(Match match)
    {
        return match.hasMessages();
    }

    static boolean b(String s1, Match match)
    {
        return match.getPerson() != null && match.getPerson().userId.equals(s1);
    }

    static Set c(i i1)
    {
        return i1.d;
    }

    static boolean c(Match match)
    {
        return match.hasMessages();
    }

    static Set d(i i1)
    {
        i1.d = null;
        return null;
    }

    static boolean d(Match match)
    {
        return match.hasMessages();
    }

    static z e(i i1)
    {
        return i1.m;
    }

    static boolean e(Match match)
    {
        return !((Message)match.getMessages().last()).isFromMe();
    }

    static String f(i i1)
    {
        return i1.i;
    }

    static boolean f(Match match)
    {
        return !match.isTouched();
    }

    static boolean g(i i1)
    {
        i1.b = false;
        return false;
    }

    static boolean g(Match match)
    {
        return match.hasMessages();
    }

    static de.greenrobot.event.c h(i i1)
    {
        return i1.n;
    }

    static boolean h(Match match)
    {
        return !match.hasMessages();
    }

    static ae i(i i1)
    {
        return i1.l;
    }

    static boolean i(Match match)
    {
        return !match.hasMessages();
    }

    static boolean j(Match match)
    {
        return !match.isTouched();
    }

    static boolean k(Match match)
    {
        return !match.hasMessages();
    }

    public static boolean l()
    {
        return com.tinder.managers.ae.a.getBoolean("IS_FIRST_LOAD", true);
    }

    static boolean l(Match match)
    {
        return !match.isTouched();
    }

    private boolean m(Match match)
    {
        Object obj;
        boolean flag1;
        flag1 = false;
        obj = match.getId();
        if (!((String) (obj)).equals(com.tinder.fragments.o.b())) goto _L2; else goto _L1
_L1:
        match.setTouched(true);
        obj = a(((String) (obj)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((Match) (obj)).getMessages().iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L5
_L5:
        Object obj1 = (Message)((Iterator) (obj)).next();
        if (match.getMessages().contains(obj1)) goto _L7; else goto _L6
_L6:
        boolean flag = true;
_L23:
        if (a.contains(match)) goto _L9; else goto _L8
_L8:
        Message message;
        boolean flag2;
        if (match.getPerson() != null && match.getPerson().userId != null)
        {
            if (!a.add(match))
            {
                a.remove(match);
                a.add(match);
            }
            flag2 = true;
        } else
        {
            v.a("New match, but no person, so not doing anything with it");
            flag2 = flag1;
        }
_L21:
        if (flag)
        {
            n.c(new EventMatchNewMessage(match.clone()));
        }
        return flag2;
_L4:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        if (match.isTouched() || match.isLastMsgFromMe()) goto _L11; else goto _L10
_L10:
        obj = a(((String) (obj)));
        if (obj != null) goto _L13; else goto _L12
_L12:
        flag = false;
        flag1 = true;
_L18:
        if (flag1 || ((Match) (obj)).getParsedActivityDate() < match.getParsedActivityDate())
        {
            (new AsyncTask() {

                final i a;

                protected final Object doInBackground(Object aobj[])
                {
                    com.tinder.b.g.a(((String[])aobj)[0], false);
                    return null;
                }

            
            {
                a = i.this;
                super();
            }
            }).execute(new String[] {
                match.getId()
            });
            match.setTouched(false);
        }
        continue; /* Loop/switch isn't completed */
_L13:
        obj1 = ((Match) (obj)).getMessages().iterator();
_L17:
        if (!((Iterator) (obj1)).hasNext()) goto _L15; else goto _L14
_L14:
        message = (Message)((Iterator) (obj1)).next();
        if (match.getMessages().contains(message)) goto _L17; else goto _L16
_L16:
        flag = true;
        flag1 = false;
          goto _L18
_L9:
        obj = a(match.getId());
        if (obj == null) goto _L20; else goto _L19
_L19:
        flag2 = flag1;
        if (((Match) (obj)).getLastActivityDate().equals(match.getLastActivityDate())) goto _L21; else goto _L20
_L20:
        if (obj != null && ((Match) (obj)).hasMessages())
        {
            match.addPreviousMessages(((Match) (obj)).getMessages());
        }
        if (obj != null)
        {
            match.setPerson(((Match) (obj)).getPerson());
        }
        a.remove(obj);
        a.add(match);
        flag2 = flag1;
          goto _L21
_L15:
        flag = false;
        flag1 = false;
          goto _L18
_L11:
        flag = false;
        if (true) goto _L23; else goto _L22
_L22:
    }

    static Date n()
    {
        return f;
    }

    private h o()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = c.l;
        com.tinder.managers.ManagerApp.h().g();
        obj = new h(((String) (obj)), com.tinder.managers.d.b(), new com.android.volley.b() {

            final i a;

            public final void a(Object obj1)
            {
                d d1 = (d)obj1;
                if (com.tinder.managers.i.c(a) == null) goto _L2; else goto _L1
_L1:
                obj1 = new HashSet(com.tinder.managers.i.c(a).size());
                ((Set) (obj1)).addAll(com.tinder.managers.i.c(a));
                com.tinder.managers.i.d(a);
_L7:
                String s1 = "";
                User user = com.tinder.managers.i.e(a).b();
                if (user == null)
                {
                    break MISSING_BLOCK_LABEL_83;
                }
                s1 = user.getId();
                if (d1 == null)
                {
                    break MISSING_BLOCK_LABEL_355;
                }
                if (d1.b.isEmpty() && d1.a.isEmpty() || !s1.equals(com.tinder.managers.i.f(a)) || !com.tinder.managers.ManagerApp.h().g().f())
                {
                    break MISSING_BLOCK_LABEL_355;
                }
                String s2;
                for (Iterator iterator = d1.b.iterator(); iterator.hasNext(); com.tinder.managers.i.a(a, s2))
                {
                    s2 = (String)iterator.next();
                }

                break MISSING_BLOCK_LABEL_192;
                obj1;
                a.k();
                throw obj1;
                if (d1.a.size() > 0)
                {
                    (a. new a(d1.a, com.tinder.managers.i.n())).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
                if (d1.b.size() <= 0) goto _L4; else goto _L3
_L3:
                if (com.tinder.managers.i.n() != null)
                {
                    com.tinder.managers.i.a(com.tinder.managers.i.n());
                    com.tinder.managers.i.g(a);
                    if (com.tinder.managers.i.l())
                    {
                        i.b(false);
                    }
                }
_L5:
                if (obj1 == null)
                {
                    break MISSING_BLOCK_LABEL_386;
                }
                Runnable runnable;
                for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); runnable.run())
                {
                    runnable = (Runnable)((Iterator) (obj1)).next();
                    ((Iterator) (obj1)).remove();
                    (new StringBuilder("Running post updates action: ")).append(runnable);
                }

                break MISSING_BLOCK_LABEL_386;
_L4:
                com.tinder.managers.i.g(a);
                if (com.tinder.managers.i.l())
                {
                    i.b(false);
                }
                  goto _L5
                com.tinder.managers.i.g(a);
                com.tinder.managers.i.h(a).c(new EventMatchesLoaded(Collections.EMPTY_LIST));
                  goto _L5
                com.tinder.managers.i.h(a).c(new EventMatchesUpdateCallComplete());
                a.k();
                return;
_L2:
                obj1 = null;
                if (true) goto _L7; else goto _L6
_L6:
            }

            
            {
                a = i.this;
                super();
            }
        }, new com.android.volley.a() {

            final i a;

            private void a(int i1)
            {
                if (i1 == 401)
                {
                    com.tinder.managers.ManagerApp.h().g().a(String.valueOf(i1), new n(this) {

                        final _cls8 a;

                        public final void a()
                        {
                            com.tinder.managers.i.g(a.a);
                        }

                        public final void b()
                        {
                            com.tinder.managers.i.g(a.a);
                        }

                        public final void c()
                        {
                            com.tinder.managers.i.g(a.a);
                        }

            
            {
                a = _pcls8;
                super();
            }
                    });
                }
            }

            public final void a(VolleyError volleyerror)
            {
                v.a("Volley request to /updates failed! ", volleyerror);
                com.tinder.managers.i.g(a);
                if (volleyerror == null)
                {
                    break MISSING_BLOCK_LABEL_25;
                }
                if (volleyerror.a != null)
                {
                    break MISSING_BLOCK_LABEL_41;
                }
                a(500);
                a.k();
                return;
                int i1 = volleyerror.a.a;
                i1;
                JVM INSTR lookupswitch 4: default 335
            //                           400: 131
            //                           401: 156
            //                           404: 193
            //                           500: 219;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                v.b((new StringBuilder("Failed to run /updates call, unexpected response code: ")).append(i1).toString());
                a(i1);
_L6:
                a.k();
                return;
_L2:
                a(i1);
                  goto _L6
                volleyerror;
                v.a("Failed to parse /update response", volleyerror);
                a.k();
                return;
_L3:
                (new StringBuilder("reason=")).append(volleyerror.getMessage());
                a(i1);
                  goto _L6
                volleyerror;
                a.k();
                throw volleyerror;
_L4:
                (new StringBuilder("reason=")).append(volleyerror.getMessage());
                a(i1);
                  goto _L6
_L5:
                (new StringBuilder("reason=")).append(volleyerror.getMessage());
                BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(volleyerror.a.b)));
                volleyerror = new StringBuilder();
_L9:
                String s1 = bufferedreader.readLine();
                if (s1 == null) goto _L8; else goto _L7
_L7:
                volleyerror.append(s1);
                  goto _L9
                volleyerror;
_L10:
                if (bufferedreader == null)
                {
                    break MISSING_BLOCK_LABEL_300;
                }
                bufferedreader.close();
                throw volleyerror;
_L8:
                (new StringBuilder("total response =")).append(volleyerror);
                bufferedreader.close();
                a(i1);
                  goto _L6
                volleyerror;
                bufferedreader = null;
                  goto _L10
            }

            
            {
                a = i.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return ((h) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public final Match a(String s1)
    {
        if (s1 != null && s1.length() != 0)
        {
            if ((s1 = com.b.a.d.a(a).a(new com.tinder.managers.m(s1)).b()) != null && s1.c())
            {
                return (Match)s1.b();
            }
        }
        return null;
    }

    public final void a(Match match)
    {
        while (match == null || match.isTouched()) 
        {
            return;
        }
        if (match.hasNewMessage())
        {
            o.d();
        }
        match.setTouched(true);
        Match match1 = a(match.getId());
        if (match1 != null)
        {
            match1.setTouched(true);
        }
        (new AsyncTask(match1) {

            final Match a;
            final i b;

            protected final Object doInBackground(Object aobj[])
            {
                com.tinder.b.g.a(((String[])aobj)[0], true);
                return null;
            }

            protected final void onPostExecute(Object obj)
            {
                if (a != null)
                {
                    com.tinder.managers.i.h(b).c(new EventMatchTouched(a));
                }
            }

            
            {
                b = i.this;
                a = match;
                super();
            }
        }).execute(new String[] {
            match.getId()
        });
    }

    public final void a(List list, c c1)
    {
        if (list != null && list.size() != 0) goto _L2; else goto _L1
_L1:
        if (c1 != null)
        {
            c1.a();
        }
_L12:
        return;
_L2:
        if (a.size() <= 0) goto _L4; else goto _L3
_L3:
        Match match;
        Match match1;
        match = (Match)a.iterator().next();
        match1 = (Match)list.get(0);
        if (match.getParsedActivityDate() <= match1.getParsedActivityDate()) goto _L6; else goto _L5
_L5:
        int i1 = -1;
_L10:
        if (i1 != -1) goto _L4; else goto _L7
_L7:
        list.addAll(0, a);
_L4:
        i1 = list.size() - 1;
_L8:
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        m((Match)list.get(i1));
        i1--;
        if (true) goto _L8; else goto _L6
_L6:
        long l1;
        long l2;
        l1 = match.getParsedActivityDate();
        l2 = match1.getParsedActivityDate();
        if (l1 == l2)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (true) goto _L10; else goto _L9
_L9:
        if (c1 == null) goto _L12; else goto _L11
_L11:
        c1.a();
        return;
        list;
        if (c1 != null)
        {
            c1.a();
        }
        throw list;
    }

    public final boolean a()
    {
        return !a.isEmpty();
    }

    public final boolean a(boolean flag)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        e.booleanValue();
        if (j == null)
        {
            j = new Handler();
        }
        if (b) goto _L2; else goto _L1
_L1:
        j.removeCallbacks(this);
        if (!flag) goto _L4; else goto _L3
_L3:
        e.booleanValue();
        j.postAtFrontOfQueue(this);
        flag = flag1;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        e.booleanValue();
        j.postDelayed(this, k);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        throw exception;
_L2:
        e.booleanValue();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        j.postAtFrontOfQueue(this);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        e.booleanValue();
        j.postDelayed(new Runnable() {

            final i a;

            public final void run()
            {
                a.k();
            }

            
            {
                a = i.this;
                super();
            }
        }, k);
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final Set b()
    {
        return (Set)((HashSet)a).clone();
    }

    public final Set c()
    {
        return (Set)com.b.a.d.a(a).a(com.tinder.managers.j.a()).a(new com.b.a.b._cls2());
    }

    public final long d()
    {
        return com.b.a.d.a(a).a(com.tinder.managers.o.a()).a();
    }

    public final long e()
    {
        return com.b.a.d.a(a).a(com.tinder.managers.p.a()).a(com.tinder.managers.q.a()).a(com.tinder.managers.r.a()).a();
    }

    public final boolean f()
    {
        return com.b.a.d.a(a).b(com.tinder.managers.s.a());
    }

    public final Set g()
    {
        return (Set)com.b.a.d.a(a).a(com.tinder.managers.t.a()).a(new com.b.a.b._cls2());
    }

    public final long h()
    {
        return com.b.a.d.a(a).a(com.tinder.managers.u.a()).a(com.tinder.managers.v.a()).a();
    }

    public final boolean i()
    {
        return com.b.a.d.a(a).b(com.tinder.managers.k.a());
    }

    public final int j()
    {
        return a.size();
    }

    public final boolean k()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a(false);
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void m()
    {
        if (j != null)
        {
            j.removeCallbacks(this);
        }
    }

    public final void run()
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        e.booleanValue();
        User user = m.b();
        if (user == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        i = user.getId();
        if (!com.tinder.managers.ManagerApp.h().g().f() || b || h || !com.tinder.managers.ManagerApp.f()) goto _L2; else goto _L1
_L1:
        b = true;
        if (l())
        {
            b(true);
        }
        h h1 = o();
        h1.j = new com.android.volley.c(20000, 0, 0.0F);
        ManagerApp.b().a(h1);
        boolean flag = flag1;
_L7:
        if (flag)
        {
            k();
        }
        return;
_L2:
        boolean flag3;
        (new StringBuilder("Not logged in, already running, loadingMatchesFromDB, or app backgrounded -- running=")).append(b);
        flag3 = com.tinder.managers.ManagerApp.f();
        if (flag3) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (j == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j.removeCallbacks(this);
        j = null;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        System.gc();
        v.a("Failed to run matches task due to limited memory. Dumped caches, trying again.", ((Throwable) (obj)));
        k();
        return;
        obj;
        v.a("Failed to run matches task to do random exception being thrown. Trying again.", ((Throwable) (obj)));
        k();
        return;
        obj;
        flag = flag2;
_L5:
        if (flag)
        {
            k();
        }
        throw obj;
        obj;
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        e = Boolean.FALSE;
    }

    // Unreferenced inner class com/tinder/managers/i$13

/* anonymous class */
    public final class _cls13
        implements com.android.volley.b
    {

        final com.tinder.e.c a;
        final Match b;
        final String c;
        final ReportCause d;
        final String e;
        final i f;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            (new StringBuilder("response=")).append(obj);
            a.a(b, d);
            com.tinder.managers.i.a(f, e);
        }

            public 
            {
                f = i.this;
                a = c1;
                b = match;
                c = s1;
                d = reportcause;
                e = s2;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/i$2

/* anonymous class */
    public final class _cls2
        implements com.android.volley.a
    {

        final String a;
        final com.tinder.e.c b;
        final Match c;
        final i d;

        public final void a(VolleyError volleyerror)
        {
            b.b();
        }

            public 
            {
                d = i.this;
                a = s1;
                b = c1;
                c = match;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/i$3

/* anonymous class */
    final class _cls3
        implements com.android.volley.b
    {

        final com.tinder.e.h a;
        final i b;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            (new StringBuilder("response=")).append(obj);
            obj = com.tinder.parse.e.a(((JSONObject) (obj)).getJSONObject("results"), com.tinder.managers.i.l());
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_71;
            }
            try
            {
                throw new JSONException("Unknown error parsing match");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                com.tinder.managers.i.g(b);
            }
            v.a("Failed to parse match", ((Throwable) (obj)));
            a.a();
            com.tinder.managers.i.g(b);
            return;
            a.a(((Match) (obj)));
            com.tinder.managers.i.g(b);
            return;
            throw obj;
        }

            
            {
                b = i.this;
                a = h1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/i$4

/* anonymous class */
    final class _cls4
        implements com.android.volley.a
    {

        final com.tinder.e.h a;
        final i b;

        public final void a(VolleyError volleyerror)
        {
            (new StringBuilder("error=")).append(volleyerror);
            com.tinder.managers.ManagerApp.h().g().a(volleyerror.getMessage(), new n(this) {

                final _cls4 a;

                public final void a()
                {
                }

                public final void b()
                {
                }

                public final void c()
                {
                }

            
            {
                a = _pcls4;
                super();
            }
            });
            v.b((new StringBuilder("error loading matches: ")).append(volleyerror).append(", ").append(volleyerror.getMessage()).toString());
            a.a();
            com.tinder.managers.i.g(b);
            return;
            volleyerror;
            a.a();
            com.tinder.managers.i.g(b);
            throw volleyerror;
        }

            
            {
                b = i.this;
                a = h1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/i$5

/* anonymous class */
    public static final class _cls5
    {

        public static final int a[];

        static 
        {
            a = new int[ReportCause.values().length];
            try
            {
                a[ReportCause.ABUSIVE_CONTENT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[ReportCause.SPAM.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[ReportCause.INAPPROPRIATE_PHOTOS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[ReportCause.OTHER.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[ReportCause.OFFLINE_BEHAVIOR.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    // Unreferenced inner class com/tinder/managers/i$9

/* anonymous class */
    public final class _cls9 extends AsyncTask
    {

        final i a;

        protected final Object doInBackground(Object aobj[])
        {
            String as[] = (String[])aobj;
            aobj = as[0];
            String s1 = as[1];
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("draft_msg", s1);
            com.tinder.b.l.a().a("matches", contentvalues, (new StringBuilder("id='")).append(((String) (aobj))).append('\'').toString());
            return null;
        }

            public 
            {
                a = i.this;
                super();
            }
    }

}
