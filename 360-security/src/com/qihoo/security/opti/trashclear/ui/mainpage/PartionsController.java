// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.opti.b.d;
import com.qihoo360.mobilesafe.b.s;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PartionsController extends CleanupFragment.l
{
    public static final class PartionType extends Enum
    {

        public static final PartionType EXTERNAL;
        public static final PartionType INTERNAL;
        public static final PartionType SYSTEM;
        private static final PartionType a[];

        public static PartionType valueOf(String s1)
        {
            return (PartionType)Enum.valueOf(com/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType, s1);
        }

        public static PartionType[] values()
        {
            return (PartionType[])a.clone();
        }

        static 
        {
            SYSTEM = new PartionType("SYSTEM", 0);
            INTERNAL = new PartionType("INTERNAL", 1);
            EXTERNAL = new PartionType("EXTERNAL", 2);
            a = (new PartionType[] {
                SYSTEM, INTERNAL, EXTERNAL
            });
        }

        private PartionType(String s1, int i)
        {
            super(s1, i);
        }
    }

    public static final class StorageState extends Enum
    {

        public static final StorageState INTERNAL;
        public static final StorageState INTERNAL_EXTERNAL;
        public static final StorageState INTERNAL_SYSTEM;
        public static final StorageState SYSTEM_INTERNAL_EXTERNAL;
        private static final StorageState a[];

        public static StorageState valueOf(String s1)
        {
            return (StorageState)Enum.valueOf(com/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState, s1);
        }

        public static StorageState[] values()
        {
            return (StorageState[])a.clone();
        }

        static 
        {
            SYSTEM_INTERNAL_EXTERNAL = new StorageState("SYSTEM_INTERNAL_EXTERNAL", 0);
            INTERNAL_SYSTEM = new StorageState("INTERNAL_SYSTEM", 1);
            INTERNAL = new StorageState("INTERNAL", 2);
            INTERNAL_EXTERNAL = new StorageState("INTERNAL_EXTERNAL", 3);
            a = (new StorageState[] {
                SYSTEM_INTERNAL_EXTERNAL, INTERNAL_SYSTEM, INTERNAL, INTERNAL_EXTERNAL
            });
        }

        private StorageState(String s1, int i)
        {
            super(s1, i);
        }
    }

    public static class a
    {

        public PartionType a;
        public long b;
        public long c;

        public float a()
        {
            if (c == 0L)
            {
                return 0.0F;
            } else
            {
                return (float)b / (float)c;
            }
        }

        public float b()
        {
            return 1.0F - a();
        }

        public long c()
        {
            return c - b;
        }

        public a(PartionType partiontype)
        {
            b = 0L;
            c = 0L;
            a = partiontype;
        }
    }

    static class b extends CleanupFragment.l
    {

        View a;
        LocaleTextView b;
        LocaleTextView c;
        ProgressBar d;

        private Drawable b()
        {
            return a().getResources().getDrawable(0x7f0200eb);
        }

        private Drawable c()
        {
            return a().getResources().getDrawable(0x7f0200ea);
        }

        private Drawable d()
        {
            return a().getResources().getDrawable(0x7f0200ee);
        }

        public void a(View view)
        {
            a = view;
            b = (LocaleTextView)a.findViewById(0x7f0b00ca);
            c = (LocaleTextView)a.findViewById(0x7f0b00cb);
            d = (ProgressBar)a.findViewById(0x7f0b00cc);
        }

        public void a(a a1)
        {
            int j;
            int l = 0x7f0c0058;
            d.setMax(100);
            int i = (int)(a1.b() * 100F);
            int k = i;
            if (i <= 1)
            {
                k = 1;
            }
            static class _cls1
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[StorageState.values().length];
                    try
                    {
                        b[StorageState.INTERNAL.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        b[StorageState.INTERNAL_SYSTEM.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        b[StorageState.INTERNAL_EXTERNAL.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        b[StorageState.SYSTEM_INTERNAL_EXTERNAL.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    a = new int[PartionType.values().length];
                    try
                    {
                        a[PartionType.SYSTEM.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[PartionType.INTERNAL.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[PartionType.EXTERNAL.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            SpannableStringBuilder spannablestringbuilder;
            Object obj;
            if (a1.b() < 0.8F)
            {
                i = a().getResources().getColor(0x7f080056);
                d.setProgressDrawable(b());
            } else
            if (a1.b() < 0.9F)
            {
                i = a().getResources().getColor(0x7f080057);
                d.setProgressDrawable(d());
            } else
            {
                i = a().getResources().getColor(0x7f080058);
                d.setProgressDrawable(c());
            }
            j = l;
            _cls1.a[a1.a.ordinal()];
            JVM INSTR tableswitch 1 3: default 112
        //                       1 116
        //                       2 327
        //                       3 334;
               goto _L1 _L2 _L3 _L4
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            j = l;
_L6:
            d.setProgress(k);
            b.setLocalText(j);
            obj = com.qihoo.security.opti.b.d.a(SecurityApplication.a(), a1.c(), true);
            spannablestringbuilder = new SpannableStringBuilder(((CharSequence) (obj)));
            spannablestringbuilder.setSpan(new ForegroundColorSpan(i), 0, ((String) (obj)).length(), 33);
            a1 = com.qihoo.security.locale.d.a().a(0x7f0c01ef, new Object[] {
                "", com.qihoo.security.opti.b.d.a(SecurityApplication.a(), a1.c, true)
            });
            obj = new SpannableStringBuilder(a1);
            ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(a().getResources().getColor(0x7f080055)), 0, a1.length(), 33);
            a1 = spannablestringbuilder.append(((CharSequence) (obj)));
            c.setLocalText(a1);
            return;
_L3:
            j = 0x7f0c0059;
            continue; /* Loop/switch isn't completed */
_L4:
            j = 0x7f0c005a;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public b(Context context)
        {
            super(context);
        }
    }


    ViewGroup a;
    int b;
    View c;
    private boolean d;
    private List e;

    public PartionsController(ViewGroup viewgroup)
    {
        super(viewgroup.getContext());
        d = false;
        e = null;
        a = viewgroup;
    }

    public static long a(String s1)
    {
        if (s1 == null)
        {
            return 0L;
        }
        int i;
        long l;
        try
        {
            s1 = new StatFs(s1);
            l = s1.getBlockSize();
            i = s1.getBlockCount();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return 0L;
        }
        return (long)i * l;
    }

    private View a(StorageState storagestate, PartionType partiontype)
    {
        if (c == null)
        {
            return null;
        }
        switch (_cls1.b[storagestate.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return c.findViewById(0x7f0b00c8);

        case 2: // '\002'
            if (partiontype == PartionType.SYSTEM)
            {
                return c.findViewById(0x7f0b00c8);
            } else
            {
                return c.findViewById(0x7f0b00c9);
            }

        case 3: // '\003'
            if (partiontype == PartionType.EXTERNAL)
            {
                return c.findViewById(0x7f0b00c9);
            } else
            {
                return c.findViewById(0x7f0b00c8);
            }

        case 4: // '\004'
            switch (_cls1.a[partiontype.ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return c.findViewById(0x7f0b00c8);

            case 2: // '\002'
                return c.findViewById(0x7f0b00c9);
            }
        }
    }

    public static List a(Context context)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = s.a(context);
        if (b(context) || arraylist1.size() <= 0)
        {
            a a1 = new a(PartionType.SYSTEM);
            a1.b = e(context);
            a1.c = f(context);
            arraylist.add(a1);
        }
        if (arraylist1.size() <= 0)
        {
            return arraylist;
        }
        a a3 = new a(PartionType.INTERNAL);
        String s1 = (String)arraylist1.get(0);
        if (arraylist1.size() > 1 && c((String)arraylist1.get(1)))
        {
            s1 = (String)arraylist1.get(1);
            context = (String)arraylist1.get(0);
        } else
        {
            context = null;
        }
        a3.b = b(s1);
        a3.c = a(s1);
        arraylist.add(a3);
        if (arraylist1.size() > 1)
        {
            a a2 = new a(PartionType.EXTERNAL);
            if (context == null)
            {
                context = (String)arraylist1.get(1);
            }
            a2.b = b(context);
            a2.c = a(((String) (context)));
            arraylist.add(a2);
        }
        return arraylist;
    }

    public static Map a(Context context, List list)
    {
        HashMap hashmap;
        PartionType apartiontype[];
        int i;
        hashmap = new HashMap();
        apartiontype = d();
        i = 0;
_L2:
        PartionType partiontype;
        if (i >= apartiontype.length)
        {
            break; /* Loop/switch isn't completed */
        }
        partiontype = apartiontype[i];
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_85;
            }
            context = (a)iterator.next();
        } while (((a) (context)).a != partiontype);
_L3:
        hashmap.put(partiontype, context);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return hashmap;
        context = null;
          goto _L3
    }

    private void a(View view)
    {
        if (c != null)
        {
            a.removeView(c);
        }
        android.view.ViewGroup.LayoutParams layoutparams = e();
        a.addView(view, layoutparams);
        c = view;
    }

    public static boolean a(long l, long l1)
    {
        while (l == l1 || l < 0xf4240L && l1 < 0xf4240L || l / 0xf4240L == l1 / 0xf4240L) 
        {
            return true;
        }
        return false;
    }

    public static long b(String s1)
    {
        if (s1 == null)
        {
            return 0L;
        }
        int i;
        long l;
        try
        {
            s1 = new StatFs(s1);
            l = s1.getBlockSize();
            i = s1.getAvailableBlocks();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return 0L;
        }
        return (long)i * l;
    }

    private View b(int i)
    {
        return View.inflate(a(), i, null);
    }

    public static StorageState b(Context context, List list)
    {
        int i = list.size();
        if (i > 2)
        {
            return StorageState.SYSTEM_INTERNAL_EXTERNAL;
        }
        if (i <= 1)
        {
            return StorageState.INTERNAL;
        }
        for (context = list.iterator(); context.hasNext();)
        {
            if (((a)context.next()).a == PartionType.EXTERNAL)
            {
                return StorageState.INTERNAL_EXTERNAL;
            }
        }

        return StorageState.INTERNAL_SYSTEM;
    }

    public static boolean b(Context context)
    {
        a a1 = c(context);
        context = d(context);
        boolean flag;
        if (a(a1.c, ((a) (context)).c) || a(a1.b, ((a) (context)).b) || a(a1.c(), context.c()))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        return flag;
    }

    public static a c(Context context)
    {
        a a1 = new a(PartionType.SYSTEM);
        a1.b = e(context);
        a1.c = f(context);
        return a1;
    }

    private static boolean c(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/self/mountinfo"))));
_L2:
        String s2 = bufferedreader.readLine();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (!s2.contains("uid=1000") || !s2.contains("gid=1015") || s2.contains("asec")) goto _L2; else goto _L1
_L1:
        String as[] = s2.split(" ");
        if (as == null) goto _L2; else goto _L3
_L3:
        if (as.length < 4 || !as[4].equals(s1)) goto _L2; else goto _L4
_L4:
        String as1[] = as[2].split(":");
        String s3;
        as = as1[0];
        s3 = as1[1];
        BufferedReader bufferedreader1 = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/partitions"))));
_L5:
        String s4 = bufferedreader1.readLine();
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        String as2[] = s4.trim().split("\\s+");
        if (as2.length >= 4 && as2[0].equals(as) && as2[1].equals(s3) && as2[3].contains("mmcblk0"))
        {
            return true;
        }
          goto _L5
        try
        {
            bufferedreader1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return false;
        }
          goto _L2
        bufferedreader.close();
        return false;
    }

    public static a d(Context context)
    {
        Object obj = s.a(context);
        if (((ArrayList) (obj)).size() <= 0)
        {
            return c(context);
        } else
        {
            context = new a(PartionType.INTERNAL);
            obj = (String)((ArrayList) (obj)).get(0);
            context.b = b(((String) (obj)));
            context.c = a(((String) (obj)));
            return context;
        }
    }

    public static PartionType[] d()
    {
        return (new PartionType[] {
            PartionType.SYSTEM, PartionType.INTERNAL, PartionType.EXTERNAL
        });
    }

    private static long e(Context context)
    {
        context = new StatFs(Environment.getDataDirectory().getPath());
        long l = context.getBlockSize();
        return (long)context.getAvailableBlocks() * l;
    }

    private android.view.ViewGroup.LayoutParams e()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -1);
    }

    private static long f(Context context)
    {
        context = new StatFs(Environment.getDataDirectory().getPath());
        long l = context.getBlockSize();
        return (long)context.getBlockCount() * l;
    }

    private List f()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        if (e == null || d)
        {
            e = a(a());
            d = false;
        }
        list = e;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(int i)
    {
        if (android.os.Build.VERSION.SDK_INT > 11 && b == i)
        {
            return;
        } else
        {
            b = i;
            a(b(i));
            return;
        }
    }

    public void a(List list)
    {
        Map map;
        PartionType apartiontype[];
        int i;
        map = a(a(), list);
        apartiontype = d();
        list = b(a(), list);
        i = 0;
_L5:
        if (i >= apartiontype.length) goto _L2; else goto _L1
_L1:
        a a1;
        Object obj;
        obj = apartiontype[i];
        a1 = (a)map.get(obj);
        if (a1 != null) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
_L4:
        if (StorageState.SYSTEM_INTERNAL_EXTERNAL != list) goto _L7; else goto _L6
_L6:
        if (obj != PartionType.INTERNAL) goto _L9; else goto _L8
_L8:
        a a2 = (a)map.get(PartionType.EXTERNAL);
        a1.b = a1.b + a2.b;
        a1.c = a1.c + a2.c;
_L7:
        obj = a(((StorageState) (list)), ((PartionType) (obj)));
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b b1 = new b(a());
        ((View) (obj)).setVisibility(0);
        b1.a(((View) (obj)));
        b1.a(a1);
        break; /* Loop/switch isn't completed */
_L9:
        if (obj != PartionType.EXTERNAL) goto _L7; else goto _L3
_L2:
    }

    public void b()
    {
        d = true;
    }

    public void c()
    {
        List list;
        int i;
        int j;
        i = 0x7f030038;
        list = f();
        j = list.size();
        break MISSING_BLOCK_LABEL_16;
        if (j != 3 && j != 2)
        {
            i = 0x7f030037;
        }
        a(i);
        if (j == 2 || j == 1)
        {
            ((a)list.get(0)).a = PartionType.SYSTEM;
        }
        a(list);
        return;
    }
}
