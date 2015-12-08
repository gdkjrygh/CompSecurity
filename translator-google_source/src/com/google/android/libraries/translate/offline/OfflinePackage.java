// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.c;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import com.google.common.base.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            j, x, m, PackageType, 
//            am, ac

public final class OfflinePackage
{

    public String a;
    public final PackageType b;
    public Status c;
    public Set d;
    public String e;
    public final boolean f;
    public final int g;
    public int h;
    int i;
    final ac j;
    int k;
    int l;

    public OfflinePackage(ac ac1, String s, int i1, int j1, Status status, boolean flag, PackageType packagetype)
    {
        d = new HashSet();
        k = -1;
        l = -1;
        j = ac1;
        i = 2;
        g = i1;
        a = s;
        h = j1;
        c = status;
        f = flag;
        b = packagetype;
    }

    public static Map a(Collection collection)
    {
        HashMap hashmap = new HashMap();
        if (collection != null)
        {
            collection = collection.iterator();
            do
            {
                if (!collection.hasNext())
                {
                    break;
                }
                j j1 = (j)collection.next();
                if (j1.b())
                {
                    hashmap.put(Long.valueOf(j1.j), j1);
                }
            } while (true);
        }
        return hashmap;
    }

    public final x a()
    {
        return new x(g, h, i, b);
    }

    public final String a(Context context, boolean flag)
    {
        m.a[b.ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 46;
           goto _L1 _L2
_L1:
        String s = a;
        context = com.google.android.libraries.translate.languages.e.a(context);
        Object obj;
        Language language1;
        String as[];
        if (context == null)
        {
            context = s;
        } else
        {
            Language language = context.b(s);
            context = s;
            if (language != null)
            {
                return language.getLongName();
            }
        }
_L4:
        return context;
_L2:
        s = a;
        obj = com.google.android.libraries.translate.languages.e.a(context);
        context = s;
        if (obj != null)
        {
            as = com.google.android.libraries.translate.offline.am.c(s);
            context = s;
            if (as != null)
            {
                as[0] = com.google.android.libraries.translate.languages.c.d(as[0]);
                as[1] = com.google.android.libraries.translate.languages.c.d(as[1]);
                language1 = ((d) (obj)).a(as[0]);
                obj = ((d) (obj)).c(as[1]);
                context = s;
                if (language1 != null)
                {
                    context = s;
                    if (obj != null)
                    {
                        s = language1.getLongName();
                        if (flag)
                        {
                            context = " \u2194 ";
                        } else
                        {
                            context = " \u2192 ";
                        }
                        obj = ((Language) (obj)).getLongName();
                        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(context).length() + String.valueOf(obj).length())).append(s).append(context).append(((String) (obj))).toString();
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(j j1)
    {
        d.add(j1);
    }

    public final void a(boolean flag)
    {
        j.a(this, flag);
    }

    public final boolean a(OfflinePackage offlinepackage)
    {
        if (!f)
        {
            if (offlinepackage == null)
            {
                return true;
            }
            if (TextUtils.equals(a, offlinepackage.a))
            {
                if (g > offlinepackage.g)
                {
                    return true;
                }
                if (g == offlinepackage.g && h > offlinepackage.h)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final long b()
    {
        Iterator iterator = d.iterator();
        long l1 = 0L;
        do
        {
            long l2;
label0:
            {
                l2 = l1;
                if (iterator.hasNext())
                {
                    j j1 = (j)iterator.next();
                    if (j.c(j1))
                    {
                        continue;
                    }
                    l2 = j1.k;
                    if (l2 >= 0L)
                    {
                        break label0;
                    }
                    l2 = -1L;
                }
                return l2;
            }
            l1 = l2 + l1;
        } while (true);
    }

    public final long c()
    {
        Iterator iterator = d.iterator();
        long l1 = 0L;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            j j1 = (j)iterator.next();
            if (!j.c(j1))
            {
                long l2 = j1.l;
                if (l2 != -1L)
                {
                    l1 = l2 + l1;
                }
            }
        } while (true);
        return l1;
    }

    public final boolean d()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            j j1 = (j)iterator.next();
            if (j.c(j1) && j1.e == Status.ERROR)
            {
                return true;
            }
        }

        return false;
    }

    public final void e()
    {
        if (!f) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (m.b[c.ordinal()])
        {
        default:
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        Object obj1;
        int i1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (d == null || d.isEmpty())
        {
            c = Status.AVAILABLE;
            e = "";
            return;
        }
        obj1 = d.iterator();
        obj = "";
        l2 = 0;
        k1 = 0;
        k2 = 0;
        j2 = 0;
        i1 = 0;
        i2 = 0;
        l1 = 0;
_L14:
        j j1;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = (j)((Iterator) (obj1)).next();
        m.b[j1.e.ordinal()];
        JVM INSTR tableswitch 1 8: default 184
    //                   1 107
    //                   2 209
    //                   3 191
    //                   4 200
    //                   5 238
    //                   6 247
    //                   7 512
    //                   8 262;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L5:
        continue; /* Loop/switch isn't completed */
_L4:
        p.a(false);
        continue; /* Loop/switch isn't completed */
_L7:
        l1++;
        continue; /* Loop/switch isn't completed */
_L8:
        i2++;
        continue; /* Loop/switch isn't completed */
_L6:
        int i3 = i1 + 1;
        i1 = i3;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = j1.a();
            i1 = i3;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        l2++;
        continue; /* Loop/switch isn't completed */
_L10:
        k1++;
_L11:
        k2++;
        continue; /* Loop/switch isn't completed */
_L12:
        j2++;
        if (true) goto _L14; else goto _L13
_L13:
        obj1 = j;
        obj1;
        JVM INSTR monitorenter ;
        if (l2 <= 0) goto _L16; else goto _L15
_L15:
        c = Status.REMOVED;
        e = "";
_L21:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L16:
        if (i1 <= 0) goto _L18; else goto _L17
_L17:
        m.b[c.ordinal()];
        JVM INSTR tableswitch 1 8: default 515
    //                   1 383
    //                   2 368
    //                   3 368
    //                   4 383
    //                   5 368
    //                   6 383
    //                   7 383
    //                   8 383;
           goto _L19 _L20 _L19 _L19 _L20 _L19 _L20 _L20 _L20
_L19:
        c = Status.ERROR;
        e = ((String) (obj));
          goto _L21
_L20:
        Singleton.b().a("error", this, null);
          goto _L19
_L18:
        if (l1 <= 0) goto _L23; else goto _L22
_L22:
        c = Status.AVAILABLE;
        e = "";
          goto _L21
_L23:
        if (k2 <= 0) goto _L25; else goto _L24
_L24:
        if (k1 != k2) goto _L27; else goto _L26
_L26:
        obj = Status.PAUSED;
_L28:
        c = ((Status) (obj));
        e = "";
          goto _L21
_L27:
        obj = Status.INPROGRESS;
          goto _L28
_L25:
        if (j2 <= 0) goto _L30; else goto _L29
_L29:
        c = Status.DOWNLOAD_NOT_STARTED;
        e = "";
          goto _L21
_L30:
        if (i2 <= 0) goto _L32; else goto _L31
_L31:
        c = Status.DOWNLOADED;
        e = "";
          goto _L21
_L32:
        c = Status.DOWNLOADED_POST_PROCESSED;
        e = "";
          goto _L21
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (OfflinePackage)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((OfflinePackage) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((OfflinePackage) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final boolean f()
    {
        switch (m.b[c.ordinal()])
        {
        case 5: // '\005'
        default:
            return false;

        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return true;
        }
    }

    public final String g()
    {
        if (e == null)
        {
            return "";
        } else
        {
            return e;
        }
    }

    public final boolean h()
    {
        return k != -1 && l != -1;
    }

    public final int hashCode()
    {
        int i1;
        if (a == null)
        {
            i1 = 0;
        } else
        {
            i1 = a.hashCode();
        }
        return i1 + 31;
    }

    public final String i()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            j j1 = (j)iterator.next();
            if (!j.h(j1))
            {
                return j1.c;
            }
        }

        return null;
    }

    public final String j()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("pkgId=");
        stringbuilder.append(a);
        stringbuilder.append(",olmv=");
        stringbuilder.append(g);
        stringbuilder.append(",olrv=");
        stringbuilder.append(h);
        stringbuilder.append(",status=");
        stringbuilder.append(c);
        stringbuilder.append(",upmv=");
        stringbuilder.append(k);
        stringbuilder.append(",uprv=");
        stringbuilder.append(l);
        return stringbuilder.toString();
    }

    private class Status extends Enum
    {

        public static final Status AVAILABLE;
        public static final Status DOWNLOADED;
        public static final Status DOWNLOADED_POST_PROCESSED;
        public static final Status DOWNLOAD_NOT_STARTED;
        public static final Status ERROR;
        public static final Status INPROGRESS;
        public static final Status PAUSED;
        public static final Status REMOVED;
        private static final Status a[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/google/android/libraries/translate/offline/OfflinePackage$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])a.clone();
        }

        static 
        {
            DOWNLOADED = new Status("DOWNLOADED", 0);
            DOWNLOADED_POST_PROCESSED = new Status("DOWNLOADED_POST_PROCESSED", 1);
            ERROR = new Status("ERROR", 2);
            INPROGRESS = new Status("INPROGRESS", 3);
            AVAILABLE = new Status("AVAILABLE", 4);
            DOWNLOAD_NOT_STARTED = new Status("DOWNLOAD_NOT_STARTED", 5);
            REMOVED = new Status("REMOVED", 6);
            PAUSED = new Status("PAUSED", 7);
            a = (new Status[] {
                DOWNLOADED, DOWNLOADED_POST_PROCESSED, ERROR, INPROGRESS, AVAILABLE, DOWNLOAD_NOT_STARTED, REMOVED, PAUSED
            });
        }

        private Status(String s, int i1)
        {
            super(s, i1);
        }
    }

}
