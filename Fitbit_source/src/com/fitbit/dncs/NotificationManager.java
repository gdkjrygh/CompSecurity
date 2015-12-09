// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.content.Intent;
import android.os.SystemClock;
import com.fitbit.bluetooth.connection.BluetoothConnectionController;
import com.fitbit.bluetooth.e;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.dncs.domain.EventID;
import com.fitbit.dncs.domain.TrackerBondState;
import com.fitbit.dncs.service.DncsSendNotificationService;
import com.fitbit.e.a;
import com.fitbit.galileo.a.f;
import com.fitbit.galileo.tasks.ConnectAndSendNotificationTask;
import com.fitbit.util.p;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.fitbit.dncs:
//            Notification, DncsHelper

public class NotificationManager
{
    public static final class DncsNotificationDisplayType extends Enum
    {

        public static final DncsNotificationDisplayType a;
        public static final DncsNotificationDisplayType b;
        private static final DncsNotificationDisplayType c[];

        public static DncsNotificationDisplayType valueOf(String s)
        {
            return (DncsNotificationDisplayType)Enum.valueOf(com/fitbit/dncs/NotificationManager$DncsNotificationDisplayType, s);
        }

        public static DncsNotificationDisplayType[] values()
        {
            return (DncsNotificationDisplayType[])c.clone();
        }

        static 
        {
            a = new DncsNotificationDisplayType("TEMPORARY", 0);
            b = new DncsNotificationDisplayType("PERMANENT", 1);
            c = (new DncsNotificationDisplayType[] {
                a, b
            });
        }

        private DncsNotificationDisplayType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class NotificationsStatus extends Enum
    {

        public static final NotificationsStatus a;
        public static final NotificationsStatus b;
        public static final NotificationsStatus c;
        public static final NotificationsStatus d;
        private static final NotificationsStatus e[];

        public static NotificationsStatus valueOf(String s)
        {
            return (NotificationsStatus)Enum.valueOf(com/fitbit/dncs/NotificationManager$NotificationsStatus, s);
        }

        public static NotificationsStatus[] values()
        {
            return (NotificationsStatus[])e.clone();
        }

        public boolean a()
        {
            return this != a;
        }

        public boolean b()
        {
            return this == c || this == d;
        }

        static 
        {
            a = new NotificationsStatus("NOT_SUPPORTED", 0);
            b = new NotificationsStatus("NOT_BONDED", 1);
            c = new NotificationsStatus("BONDED", 2);
            d = new NotificationsStatus("ENABLED", 3);
            e = (new NotificationsStatus[] {
                a, b, c, d
            });
        }

        private NotificationsStatus(String s, int i)
        {
            super(s, i);
        }
    }

    private static interface a
    {

        public abstract com.fitbit.galileo.bluetooth.f a();

        public abstract void a(c c1, com.fitbit.galileo.bluetooth.f f1);

        public abstract boolean b(c c1, com.fitbit.galileo.bluetooth.f f1);
    }

    private static class b
        implements Comparable
    {

        final Notification a;
        final long b = SystemClock.elapsedRealtime();
        final DncsNotificationDisplayType c;
        boolean d;
        String e;
        EventID f;

        public int a(b b1)
        {
            int i;
            int j;
            boolean flag;
            flag = true;
            j = 0;
            if (a.e() == b1.a.e())
            {
                break MISSING_BLOCK_LABEL_172;
            }
            if (c == com.fitbit.dncs.DncsNotificationDisplayType.a)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (b1.c == com.fitbit.dncs.DncsNotificationDisplayType.a)
            {
                j = 1;
            }
            if (i == 0 || j == 0) goto _L2; else goto _L1
_L1:
            j = (int)(b1.b - b);
            i = j;
            if (j == 0)
            {
                i = ((Integer)b1.a.e()).intValue() - ((Integer)a.e()).intValue();
            }
_L4:
            return i;
_L2:
            if (i != 0 && j == 0)
            {
                return -1;
            }
            if (i != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            i = ((flag) ? 1 : 0);
            if (j != 0) goto _L4; else goto _L3
_L3:
            j = (int)(b - b1.b);
            i = j;
            if (j != 0) goto _L4; else goto _L5
_L5:
            return ((Integer)a.e()).intValue() - ((Integer)b1.a.e()).intValue();
            return 0;
        }

        public int compareTo(Object obj)
        {
            return a((b)obj);
        }

        public boolean equals(Object obj)
        {
            return (obj instanceof b) && ((b)obj).a.e() == a.e();
        }

        b(Notification notification, DncsNotificationDisplayType dncsnotificationdisplaytype)
        {
            d = false;
            f = EventID.a;
            a = notification;
            if (dncsnotificationdisplaytype == null)
            {
                dncsnotificationdisplaytype = DncsNotificationDisplayType.b;
            }
            c = dncsnotificationdisplaytype;
        }
    }

    private class c extends com.fitbit.galileo.bluetooth.e
    {

        private static final String b = "NotificationManager.ProcessDncsNotificationsTask";
        final NotificationManager a;
        private String c;
        private a d;

        static String a(c c1, String s)
        {
            c1.c = s;
            return s;
        }

        protected com.fitbit.galileo.bluetooth.f a()
        {
            if (!l())
            {
                d = com.fitbit.dncs.NotificationManager.a(a, c);
                if (d == null && c != null)
                {
                    c = null;
                    d = com.fitbit.dncs.NotificationManager.a(a, c);
                }
                if (d != null)
                {
                    return d.a();
                }
            }
            return null;
        }

        protected void a(com.fitbit.galileo.bluetooth.f f1)
        {
            if (d != null)
            {
                d.a(this, f1);
            } else
            {
                com.fitbit.e.a.a("NotificationManager.ProcessDncsNotificationsTask", "Invalid helper!", new Object[0]);
                c = null;
            }
            super.a(f1);
        }

        protected void b()
        {
            super.b();
            BluetoothConnectionController.a().b(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.d);
        }

        protected void b(com.fitbit.galileo.bluetooth.f f1)
        {
            if (d != null)
            {
                if (d.b(this, f1))
                {
                    f();
                    return;
                }
            } else
            {
                com.fitbit.e.a.a("NotificationManager.ProcessDncsNotificationsTask", "Invalid helper!", new Object[0]);
                c = null;
            }
            super.b(f1);
        }

        protected String c()
        {
            return "NotificationManager.ProcessDncsNotificationsTask";
        }

        private c()
        {
            a = NotificationManager.this;
            super();
            c = null;
            d = null;
        }

    }

    private class d
        implements a
    {

        final NotificationManager a;
        private final List b;
        private final String c;
        private final int d;
        private final EventID e;

        public com.fitbit.galileo.bluetooth.f a()
        {
            com.fitbit.e.a.a("NotificationManager", "Creating ConnectAndSendNotificationTask: %s, %s, %s, %s", new Object[] {
                b, c, Integer.valueOf(d), e
            });
            return new ConnectAndSendNotificationTask(b, c, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.d, d, e);
        }

        public void a(c c1, com.fitbit.galileo.bluetooth.f f1)
        {
            if (f1 instanceof ConnectAndSendNotificationTask)
            {
                f1 = (ConnectAndSendNotificationTask)f1;
                String s = com.fitbit.galileo.a.f.a(f1.x());
                com.fitbit.dncs.c.a(c1, s);
                com.fitbit.dncs.NotificationManager.a(a, f1.t(), f1.u(), s, true);
            }
        }

        public boolean b(c c1, com.fitbit.galileo.bluetooth.f f1)
        {
            Object obj;
            if (!(f1 instanceof ConnectAndSendNotificationTask))
            {
                break MISSING_BLOCK_LABEL_141;
            }
            f1 = (ConnectAndSendNotificationTask)f1;
            obj = com.fitbit.galileo.a.f.a(f1.x());
            com.fitbit.dncs.NotificationManager.a(a, f1.t(), f1.u(), ((String) (obj)), false);
            obj = f1.s();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            obj = ((Intent) (obj)).getStringExtra(ConnectAndSendNotificationTask.a);
            if (!"ERROR_TRACKER_NOT_FOUND".equals(obj)) goto _L2; else goto _L1
_L1:
            com.fitbit.dncs.NotificationManager.a(a, f1.w(), true);
            com.fitbit.dncs.c.a(c1, null);
_L4:
            return true;
_L2:
            if ("ERROR_CONNECTION_FAILED".equals(obj))
            {
                com.fitbit.dncs.NotificationManager.a(a, com.fitbit.galileo.a.f.a(f1.x()), true);
                com.fitbit.dncs.c.a(c1, null);
                return true;
            }
            if ("ERROR_NOT_SENT".equals(obj)) goto _L4; else goto _L3
_L3:
            com.fitbit.dncs.NotificationManager.a(a, null, true);
            com.fitbit.dncs.c.a(c1, null);
            return true;
            return false;
        }

        public d(String s, int i, EventID eventid)
        {
            List list;
            if (s != null)
            {
                list = Collections.singletonList(s);
            } else
            {
                list = null;
            }
            this(list, s, i, eventid);
        }

        public d(List list, String s, int i, EventID eventid)
        {
            a = NotificationManager.this;
            super();
            b = new ArrayList();
            if (list != null)
            {
                b.addAll(list);
            }
            c = s;
            d = i;
            e = eventid;
        }
    }

    private static class e
    {

        public static NotificationManager a = new NotificationManager();


        private e()
        {
        }
    }

    private class f
        implements a
    {

        final NotificationManager a;
        private final int b;

        static int a(f f1)
        {
            return f1.b;
        }

        public com.fitbit.galileo.bluetooth.f a()
        {
            com.fitbit.e.a.a("NotificationManager", "Creating GalileoTimeoutTask: %s", new Object[] {
                Integer.valueOf(b)
            });
        /* block-local class not found */
        class _cls1 {}

            return new _cls1(20000L);
        }

        public void a(c c1, com.fitbit.galileo.bluetooth.f f1)
        {
            com.fitbit.dncs.c.a(c1, NotificationManager.b(a, b));
        }

        public boolean b(c c1, com.fitbit.galileo.bluetooth.f f1)
        {
            com.fitbit.dncs.c.a(c1, NotificationManager.b(a, b));
            return true;
        }

        public f(int i)
        {
            a = NotificationManager.this;
            super();
            b = i;
        }
    }


    private static final String b = "NotificationManager";
    private static final String c = (new StringBuilder()).append(com/fitbit/dncs/NotificationManager.getCanonicalName()).append(".ACTION_NOTIFICATION_REMOVED").toString();
    private static final String d = "EXTRA_NOTIFICATION_ID";
    private static final long e = 0x1d4c0L;
    private static final long f = 20000L;
    com.fitbit.bluetooth.e a;
    private final TreeSet g = new TreeSet();

    public NotificationManager()
    {
        a = new com.fitbit.bluetooth.e() {

            final NotificationManager a;

            protected void a()
            {
                com.fitbit.dncs.NotificationManager.a(a, a.c());
            }

            protected void b()
            {
                com.fitbit.dncs.NotificationManager.a(a, a.c());
                DncsSendNotificationService.b();
            }

            
            {
                a = NotificationManager.this;
                super();
            }
        };
        a.c();
    }

    static a a(NotificationManager notificationmanager, String s)
    {
        return notificationmanager.c(s);
    }

    public static NotificationManager a()
    {
        return com.fitbit.dncs.e.a;
    }

    private void a(int i, EventID eventid, String s, boolean flag)
    {
        com.fitbit.e.a.a("NotificationManager", "onNotificationEventProcessed: %s, %s, %s, %s", new Object[] {
            Integer.valueOf(i), eventid, s, Boolean.valueOf(flag)
        });
        TreeSet treeset = g;
        treeset;
        JVM INSTR monitorenter ;
        b b1 = e(i);
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (s == null) goto _L4; else goto _L3
_L3:
        b1.e = s;
        if (b1.f != eventid) goto _L6; else goto _L5
_L5:
        if (b1.c != com.fitbit.dncs.DncsNotificationDisplayType.a || eventid != EventID.a) goto _L8; else goto _L7
_L7:
        b1.d = true;
_L9:
        treeset;
        JVM INSTR monitorexit ;
        return;
_L8:
        com.fitbit.e.a.a("NotificationManager", "Notification is fully processed: %s", new Object[] {
            b1.a
        });
        g.remove(b1);
          goto _L9
        eventid;
        treeset;
        JVM INSTR monitorexit ;
        throw eventid;
_L6:
        com.fitbit.e.a.a("NotificationManager", "Expected eventId = %s", new Object[] {
            b1.f
        });
          goto _L9
_L4:
        com.fitbit.e.a.a("NotificationManager", "Invalid tracker address", new Object[0]);
          goto _L9
_L2:
label0:
        {
            if (b1.f != eventid)
            {
                break label0;
            }
            com.fitbit.e.a.a("NotificationManager", "Removing notification from list: %s", new Object[] {
                b1.a
            });
            g.remove(b1);
        }
          goto _L9
        com.fitbit.e.a.a("NotificationManager", "Expected eventId = %s", new Object[] {
            b1.f
        });
          goto _L9
        com.fitbit.e.a.a("NotificationManager", "There is not notification with id = %s", new Object[] {
            Integer.valueOf(i)
        });
          goto _L9
    }

    static void a(NotificationManager notificationmanager, int i, EventID eventid, String s, boolean flag)
    {
        notificationmanager.a(i, eventid, s, flag);
    }

    static void a(NotificationManager notificationmanager, String s, boolean flag)
    {
        notificationmanager.a(s, flag);
    }

    static void a(NotificationManager notificationmanager, List list)
    {
        notificationmanager.a(list);
    }

    private void a(String s, boolean flag)
    {
        com.fitbit.e.a.a("NotificationManager", "allNotificationsFailed(). trackerId = %s; ignoreWaitingNotifications = %s", new Object[] {
            s, Boolean.valueOf(flag)
        });
        TreeSet treeset = g;
        treeset;
        JVM INSTR monitorenter ;
        List list;
        Iterator iterator;
        list = c();
        a(list);
        iterator = g.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        b b1 = (b)iterator.next();
        if (!flag) goto _L4; else goto _L3
_L3:
        if (b1.d) goto _L5; else goto _L4
_L11:
        boolean flag1;
        if (!flag1) goto _L5; else goto _L6
_L6:
        com.fitbit.e.a.a("NotificationManager", "Removing notification from list: %s", new Object[] {
            b1.a
        });
        if (b1.d)
        {
            f(((Integer)b1.a.e()).intValue());
        }
        iterator.remove();
          goto _L5
        s;
        treeset;
        JVM INSTR monitorexit ;
        throw s;
_L14:
        if (b1.e != null) goto _L8; else goto _L7
_L7:
        if (list.size() != 1 || !list.contains(s)) goto _L10; else goto _L9
_L9:
        flag1 = true;
          goto _L11
_L8:
        if (!com.fitbit.galileo.a.f.a(b1.e, s)) goto _L10; else goto _L12
_L12:
        flag1 = true;
          goto _L11
_L2:
        treeset;
        JVM INSTR monitorexit ;
        return;
_L10:
        flag1 = false;
          goto _L11
_L4:
        if (s != null) goto _L14; else goto _L13
_L13:
        flag1 = true;
          goto _L11
    }

    private void a(List list)
    {
label0:
        {
            synchronized (g)
            {
                if (g.size() != 0)
                {
                    break label0;
                }
            }
            return;
        }
        Iterator iterator = g.iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        b b1 = (b)iterator.next();
        if (SystemClock.elapsedRealtime() - b1.b < 0x1d4c0L) goto _L4; else goto _L3
_L3:
        com.fitbit.e.a.a("NotificationManager", "Notification expired: %s", new Object[] {
            b1.a.e()
        });
        boolean flag = true;
_L7:
        if (!flag) goto _L6; else goto _L5
_L5:
        com.fitbit.e.a.a("NotificationManager", "Removing: %s", new Object[] {
            b1.a
        });
        if (b1.d)
        {
            f(((Integer)b1.a.e()).intValue());
        }
        iterator.remove();
          goto _L6
        list;
        treeset;
        JVM INSTR monitorexit ;
        throw list;
_L4:
        if (!list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_179;
        }
        com.fitbit.e.a.a("NotificationManager", "There is no trackers with enabled notifications.", new Object[0]);
        flag = true;
          goto _L7
        if (b1.e == null || list.contains(b1.e))
        {
            break MISSING_BLOCK_LABEL_253;
        }
        com.fitbit.e.a.a("NotificationManager", "Notifications are disabled for tracker: %s", new Object[] {
            b1.e
        });
        flag = true;
          goto _L7
_L2:
        com.fitbit.e.a.a("NotificationManager", "End cleaning notifications. Total count = %s", new Object[] {
            Integer.valueOf(g.size())
        });
        treeset;
        JVM INSTR monitorexit ;
        return;
        flag = false;
          goto _L7
    }

    static boolean a(NotificationManager notificationmanager, int i)
    {
        return notificationmanager.c(i);
    }

    static String b(NotificationManager notificationmanager, int i)
    {
        return notificationmanager.d(i);
    }

    private a c(String s)
    {
        TreeSet treeset = g;
        treeset;
        JVM INSTR monitorenter ;
        List list;
        list = c();
        a(list);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (list.contains(s))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        treeset;
        JVM INSTR monitorexit ;
        return null;
        Iterator iterator = g.iterator();
_L2:
        b b1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_231;
        }
        b1 = (b)iterator.next();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b1.e != null && !com.fitbit.galileo.a.f.a(s, b1.e)) goto _L2; else goto _L1
_L1:
        if (!b1.d)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s = new f(((Integer)b1.a.e()).intValue());
        treeset;
        JVM INSTR monitorexit ;
        return s;
        if (b1.f != EventID.a)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b1.e != null) goto _L2; else goto _L3
_L3:
        s = new d(list, s, ((Integer)b1.a.e()).intValue(), b1.f);
        treeset;
        JVM INSTR monitorexit ;
        return s;
        s;
        treeset;
        JVM INSTR monitorexit ;
        throw s;
        if (b1.f != EventID.c) goto _L2; else goto _L4
_L4:
        s = new d(b1.e, ((Integer)b1.a.e()).intValue(), b1.f);
        treeset;
        JVM INSTR monitorexit ;
        return s;
        treeset;
        JVM INSTR monitorexit ;
        return null;
    }

    private boolean c(int i)
    {
        TreeSet treeset = g;
        treeset;
        JVM INSTR monitorenter ;
        b b1 = e(i);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        if (!b1.d) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        treeset;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        treeset;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private String d(int i)
    {
        TreeSet treeset = g;
        treeset;
        JVM INSTR monitorenter ;
        Object obj = e(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        obj = ((b) (obj)).e;
_L1:
        treeset;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        obj;
        treeset;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L1
    }

    private b e(int i)
    {
label0:
        {
            b b1;
            synchronized (g)
            {
                Iterator iterator = g.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    b1 = (b)iterator.next();
                } while (((Integer)b1.a.e()).intValue() != i);
            }
            return b1;
        }
        treeset;
        JVM INSTR monitorexit ;
        return null;
        exception;
        treeset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static String f()
    {
        return c;
    }

    private void f(int i)
    {
        Intent intent = new Intent(c);
        intent.putExtra("EXTRA_NOTIFICATION_ID", i);
        z.a(intent);
    }

    public void a(int i)
    {
        com.fitbit.e.a.a("NotificationManager", "Removing notification: id = %s", new Object[] {
            Integer.valueOf(i)
        });
        if (!com.fitbit.dncs.DncsHelper.a())
        {
            return;
        }
        TreeSet treeset = g;
        treeset;
        JVM INSTR monitorenter ;
        Object obj = e(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (((b) (obj)).c != DncsNotificationDisplayType.b)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        com.fitbit.e.a.a("NotificationManager", "Unable to remove a permanent notification", new Object[0]);
        treeset;
        JVM INSTR monitorexit ;
        return;
        obj;
        treeset;
        JVM INSTR monitorexit ;
        throw obj;
        obj.f = EventID.c;
        com.fitbit.e.a.a("NotificationManager", "Removing notification from tracker: %s", new Object[] {
            ((b) (obj)).a
        });
        if (((b) (obj)).d)
        {
            obj.d = false;
            f(((Integer)((b) (obj)).a.e()).intValue());
        }
        DncsSendNotificationService.b();
_L2:
        treeset;
        JVM INSTR monitorexit ;
        return;
        com.fitbit.e.a.a("NotificationManager", "There is no active notifications with id = %s", new Object[] {
            Integer.valueOf(i)
        });
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean a(Device device)
    {
        return b(device) == NotificationsStatus.d;
    }

    public boolean a(Notification notification, DncsNotificationDisplayType dncsnotificationdisplaytype)
    {
label0:
        {
            boolean flag = com.fitbit.dncs.DncsHelper.a();
            com.fitbit.e.a.a("NotificationManager", "Adding notification: %s, displayType = %s, dncsSupported = %s", new Object[] {
                notification, dncsnotificationdisplaytype, Boolean.valueOf(flag)
            });
            while (!flag || notification == null) 
            {
                return false;
            }
            List list = c();
            a(list);
            if (list.isEmpty())
            {
                com.fitbit.e.a.a("NotificationManager", "Could not add notification: there is no trackers with enabled notifications", new Object[0]);
                return false;
            }
            if (com.fitbit.bluetooth.g.h())
            {
                com.fitbit.e.a.a("NotificationManager", "Could not add notification: bluetooth access is restricted", new Object[0]);
                return false;
            }
            if (!com.fitbit.bluetooth.g.f())
            {
                com.fitbit.e.a.a("NotificationManager", "Could not add notification: bluetooth LE is not supported", new Object[0]);
                return false;
            }
            synchronized (g)
            {
                dncsnotificationdisplaytype = new b(notification, dncsnotificationdisplaytype);
                if (!g.contains(dncsnotificationdisplaytype))
                {
                    break label0;
                }
                com.fitbit.e.a.a("NotificationManager", "Notification is already added", new Object[0]);
            }
            return true;
        }
        g.add(dncsnotificationdisplaytype);
        com.fitbit.e.a.a("NotificationManager", "Sending notification to tracker: %s", new Object[] {
            notification
        });
        DncsSendNotificationService.b();
        treeset;
        JVM INSTR monitorexit ;
        return true;
        notification;
        treeset;
        JVM INSTR monitorexit ;
        throw notification;
    }

    public boolean a(String s)
    {
        return b(s) == NotificationsStatus.d;
    }

    public Notification b(int i)
    {
        b b1 = e(i);
        if (b1 != null)
        {
            return b1.a;
        } else
        {
            return null;
        }
    }

    public NotificationsStatus b()
    {
        return b(p.h());
    }

    public NotificationsStatus b(Device device)
    {
label0:
        {
label1:
            {
                NotificationsStatus notificationsstatus = com.fitbit.dncs.NotificationsStatus.a;
                Object obj = notificationsstatus;
                if (device != null)
                {
                    obj = notificationsstatus;
                    if (com.fitbit.bluetooth.g.f())
                    {
                        obj = notificationsstatus;
                        if (device.a(DeviceFeature.NOTIFICATIONS))
                        {
                            obj = notificationsstatus;
                            if (com.fitbit.dncs.DncsHelper.a())
                            {
                                obj = com.fitbit.dncs.DncsHelper.a(device.d());
                                DncsHelper.AndroidBondStatus androidbondstatus = DncsHelper.c(device.d());
                                if (obj != TrackerBondState.b || androidbondstatus != DncsHelper.AndroidBondStatus.b)
                                {
                                    break label0;
                                }
                                if (!p.f(device))
                                {
                                    break label1;
                                }
                                obj = NotificationsStatus.d;
                            }
                        }
                    }
                }
                return ((NotificationsStatus) (obj));
            }
            return NotificationsStatus.c;
        }
        return NotificationsStatus.b;
    }

    public NotificationsStatus b(String s)
    {
        return b(p.c(s));
    }

    public String c(Device device)
    {
        NotificationsStatus notificationsstatus = b(device);
        device = notificationsstatus;
        if (NotificationsStatus.d.equals(notificationsstatus))
        {
            device = NotificationsStatus.c;
        }
        return device.name();
    }

    public List c()
    {
        Object obj = d();
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((Device)((Iterator) (obj)).next()).d())) { }
        return arraylist;
    }

    public List d()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = p.b(DeviceFeature.NOTIFICATIONS).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Device device = (Device)iterator.next();
            if (a(device))
            {
                arraylist.add(device);
            }
        } while (true);
        return arraylist;
    }

    public com.fitbit.galileo.bluetooth.f e()
    {
        if (c(((String) (null))) != null)
        {
            return new c();
        } else
        {
            return null;
        }
    }

}
