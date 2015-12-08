// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Referenced classes of package com.aviary.android.feather.common.utils:
//            d, f

public class i
{
    private static final class a
    {

        protected static String a;
        protected static final Object b = new Object();
        private static final List c = new ArrayList();

        static String a(int j, String s)
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            if (c.size() <= j)
            {
                break MISSING_BLOCK_LABEL_35;
            }
            s = (String)c.get(j);
            return s;
            obj;
            JVM INSTR monitorexit ;
            return s;
            s;
            obj;
            JVM INSTR monitorexit ;
            throw s;
        }

        private static void a(Context context, List list)
        {
            context = context.getContentResolver().query(Uri.parse("content://com.aviary.android.providers.devicedefault/v1/getkeys"), new String[] {
                "ak"
            }, null, null, null);
            if (context == null)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            if (context.moveToFirst() && context.getColumnCount() == 2)
            {
                String s = context.getString(0);
                String s1 = context.getString(1);
                Log.d("SDKUtils", "from content provider");
                if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
                {
                    list.add(s);
                    list.add(s1);
                }
            }
            com.aviary.android.feather.common.utils.d.a(context);
            return;
            list;
            com.aviary.android.feather.common.utils.d.a(context);
            throw list;
        }

        private static boolean a(Context context, boolean flag)
        {
            context = com.aviary.android.feather.common.utils.f.a(context).metaData;
            boolean flag1 = flag;
            if (context != null)
            {
                flag1 = context.getBoolean("com.aviary.android.feather.v1.CDS_DEBUG", flag);
            }
            return flag1;
        }

        static String[] a(Context context)
        {
            return (new String[] {
                b(context), c(context), d(context)
            });
        }

        static String b(Context context)
        {
            if (c.size() == 0)
            {
                synchronized (b)
                {
                    if (c.size() == 0)
                    {
                        b(context, c);
                    }
                }
            }
            return a(0, "");
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
        }

        private static void b(Context context, List list)
        {
            String s1;
            String s2;
            String as[];
label0:
            {
                s2 = "";
                String s3 = "";
                as = i(context);
                s1 = s2;
                String s = s3;
                if (com.aviary.android.feather.common.utils.f.c(context))
                {
                    ArrayList arraylist = new ArrayList();
                    a(context, arraylist);
                    s1 = s2;
                    s = s3;
                    if (arraylist.size() >= 2)
                    {
                        s1 = (String)arraylist.get(0);
                        s = (String)arraylist.get(1);
                    }
                }
                if (!TextUtils.isEmpty(s1))
                {
                    s2 = s1;
                    s1 = s;
                    if (!TextUtils.isEmpty(s))
                    {
                        break label0;
                    }
                }
                Log.d("SDKUtils", "using standalone api/secret");
                s2 = g(context);
                s1 = as[0];
            }
            context = as[1];
            list.add(s2);
            list.add(s1);
            list.add(context);
        }

        static String c(Context context)
        {
            if (c.size() == 0)
            {
                synchronized (b)
                {
                    if (c.size() == 0)
                    {
                        b(context, c);
                    }
                }
            }
            return a(1, "");
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
        }

        static String d(Context context)
        {
            if (c.size() == 0)
            {
                synchronized (b)
                {
                    if (c.size() == 0)
                    {
                        b(context, c);
                    }
                }
            }
            return a(2, "");
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
        }

        static String e(Context context)
        {
            if (a == null)
            {
                synchronized (b)
                {
                    if (a == null)
                    {
                        a = h(context);
                    }
                }
            }
            return a;
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
        }

        static boolean f(Context context)
        {
            return a(context, false);
        }

        private static String g(Context context)
        {
            context = com.aviary.android.feather.common.utils.f.a(context).metaData;
            if (context != null && context.containsKey("com.aviary.android.feather.v1.API_KEY"))
            {
                return context.getString("com.aviary.android.feather.v1.API_KEY");
            } else
            {
                return null;
            }
        }

        private static String h(Context context)
        {
            context = com.aviary.android.feather.common.utils.f.a(context).metaData;
            if (context != null && context.containsKey("com.aviary.android.feather.v1.LOCALYTICS_API_KEY"))
            {
                return context.getString("com.aviary.android.feather.v1.LOCALYTICS_API_KEY");
            } else
            {
                return "ff159f6cc04d5010ac6461e-fc511f5e-b6ff-11e0-049a-007f58cb3154";
            }
        }

        private static String[] i(Context context)
        {
            String as[] = new String[2];
            as[0] = "";
            as[1] = "";
            String s;
            String s1;
            try
            {
                context = new Scanner(context.getAssets().open("aviary/aviary.txt"));
                s = context.nextLine();
                s1 = context.nextLine();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return as;
            }
            as[0] = s;
            as[1] = s1;
            com.aviary.android.feather.common.utils.d.a(context);
            return as;
        }


        private a()
        {
        }
    }


    public i()
    {
    }

    public static String a(Context context)
    {
        return a.b(context);
    }

    public static String[] b(Context context)
    {
        return a.a(context);
    }

    public static String c(Context context)
    {
        return a.e(context);
    }

    public static boolean d(Context context)
    {
        return a.f(context);
    }
}
