// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            p, br, aq, s, 
//            bo

class n
{
    static final class a
        implements Serializable
    {

        private final Map a;
        private Date b;
        private long c;

        static Date a(a a1, Date date)
        {
            a1.b = date;
            return date;
        }

        public br a(String s1)
        {
            this;
            JVM INSTR monitorenter ;
            s1 = (br)a.get(s1);
            this;
            JVM INSTR monitorexit ;
            return s1;
            s1;
            throw s1;
        }

        public void a(String s1, br br1)
        {
            this;
            JVM INSTR monitorenter ;
            a.put(s1, br1);
            this;
            JVM INSTR monitorexit ;
            return;
            s1;
            throw s1;
        }

        public boolean a()
        {
            if ((new Date()).getTime() - b.getTime() >= c)
            {
                a.clear();
                p.c("PopoverCacheManager", "Expiring popover data.");
                return true;
            } else
            {
                return false;
            }
        }

        private a()
        {
            a = new HashMap();
            b = new Date();
            c = 0x5265c00L;
        }

    }


    private static volatile a a = null;
    private static final StringBuilder b = new StringBuilder();

    n()
    {
    }

    public static br a(String s1)
    {
        if (a != null && s1 != null)
        {
            if (a.a(s1) == null)
            {
                try
                {
                    AsyncTask asynctask = new AsyncTask(s1) {

                        final String a;

                        protected transient Void a(Void avoid[])
                        {
                            if (a != null && !a.trim().equals(""))
                            {
                                n.a(n.a(), new String[] {
                                    a
                                });
                            }
                            return null;
                        }

                        protected volatile Object doInBackground(Object aobj[])
                        {
                            return a((Void[])aobj);
                        }

            
            {
                a = s1;
                super();
            }
                    };
                    asynctask.execute(new Void[0]);
                    asynctask.get();
                }
                catch (Exception exception)
                {
                    p.b("PopoverCacheManager", (new StringBuilder()).append("Fetching Product info from Service for ").append(s1).append(" failed").toString(), new Object[] {
                        exception
                    });
                    exception.printStackTrace();
                }
            }
            return a.a(s1);
        } else
        {
            return null;
        }
    }

    static a a()
    {
        return a;
    }

    private static String a(List list)
    {
        b.setLength(0);
        String s1;
        for (list = list.iterator(); list.hasNext(); b.append(s1).append(","))
        {
            s1 = (String)list.next();
        }

        if (b.length() > 1)
        {
            return b.substring(0, b.length() - 1);
        } else
        {
            return "";
        }
    }

    static void a(Context context, String as[])
    {
        b(context, as);
    }

    private static void a(a a1, String s1)
        throws JSONException
    {
        if (s1.length() >= "asinDetails".length() + 1)
        {
            s1 = (new JSONObject(s1.substring("asinDetails".length() + 1))).getJSONArray("results");
            int i = 0;
            while (i < s1.length()) 
            {
                JSONObject jsonobject = s1.getJSONObject(i);
                Object obj = jsonobject.getString("LargeImageUrl");
                obj = new br(jsonobject.getString("ASIN"), ((String) (obj)), jsonobject.getString("Title"), jsonobject.getString("Price"), jsonobject.getString("Rating"), jsonobject.getString("TotalReviews"), jsonobject.getString("DetailPageURL"), jsonobject.getString("category"));
                a1.a(jsonobject.getString("ASIN"), ((br) (obj)));
                i++;
            }
        }
    }

    private static void a(String s1, a a1)
        throws FileNotFoundException, IOException
    {
        s1 = new File(s1);
        if (s1.exists())
        {
            s1.delete();
        }
        s1 = new ObjectOutputStream(new FileOutputStream(s1));
        s1.writeObject(a1);
        s1.close();
        return;
        a1;
        s1.close();
        throw a1;
    }

    public static void a(String as[])
    {
        (new AsyncTask(as) {

            final String a[];

            protected transient Void a(Void avoid[])
            {
                n.a(bo.a(), a);
                return null;
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            
            {
                a = as;
                super();
            }
        }).execute(new Void[0]);
    }

    static boolean a(a a1, String as[])
    {
        return b(a1, as);
    }

    private static a b(String s1)
        throws StreamCorruptedException, IOException, ClassNotFoundException
    {
        s1 = new File(s1);
        if (!s1.exists())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        p.c("PopoverCacheManager", "Reading cache file....");
        s1 = new ObjectInputStream(new FileInputStream(s1));
        a a1 = (a)s1.readObject();
        s1.close();
        Exception exception;
        if (a1 != null)
        {
            return a1;
        } else
        {
            return new a();
        }
        exception;
        s1.close();
        throw exception;
        p.c("PopoverCacheManager", "Cache file not found, creating object manually.");
        return new a();
    }

    private static void b(Context context, String as[])
    {
        String as1[] = as;
        if (as != null)
        {
            as1 = as;
            if (as.length > 20)
            {
                p.d("PopoverCacheManager", (new StringBuilder()).append("The asin list for prefetching has exceeded limit. ").append(as.length).append(", trimming it down to first 20. ").toString());
                as1 = new String[20];
                System.arraycopy(as, 0, as1, 0, 20);
            }
        }
        as = new StringBuilder();
        if (context.getCacheDir() != null)
        {
            context = (new StringBuilder()).append(context.getCacheDir().getAbsolutePath()).append("/").toString();
        } else
        {
            context = "/";
        }
        context = as.append(context).append("POD.db").toString();
        as = b(((String) (context)));
        boolean flag;
        if (!as.a() && !b(((a) (as)), as1))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        a(context, as);
        a = as;
        if (a == null)
        {
            p.a("PopoverCacheManager", "Failed to initialize cache, so constructing it using default constructor");
            a = new a();
        }
_L2:
        return;
        as;
        p.a("PopoverCacheManager", "Error initializing cache manager", new Object[] {
            as
        });
        p.c("PopoverCacheManager", "As cache file must have been corrupted, deleting it.");
        context = new File(context);
        if (context.exists())
        {
            context.delete();
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        p.a("PopoverCacheManager", "Failed to initialize cache, so constructing it using default constructor");
        a = new a();
        return;
        context;
        if (a == null)
        {
            p.a("PopoverCacheManager", "Failed to initialize cache, so constructing it using default constructor");
            a = new a();
        }
        throw context;
    }

    private static boolean b(a a1, String as[])
    {
        ArrayList arraylist;
        arraylist = new ArrayList(as.length);
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s1 = as[i];
            if (s1 != null && !s1.trim().equals("") && a1.a(s1) == null)
            {
                arraylist.add(s1);
            }
        }

        if (arraylist.size() <= 0) goto _L2; else goto _L1
_L1:
        int j;
        boolean flag;
        p.c("PopoverCacheManager", (new StringBuilder()).append("Quering service to get popover data for: ").append(arraylist).toString());
        j = 0;
        flag = false;
_L8:
        if (j >= arraylist.size()) goto _L4; else goto _L3
_L3:
        aq aq1;
        int l;
        if (j + 5 < arraylist.size())
        {
            l = j + 5;
        } else
        {
            l = arraylist.size();
        }
        as = arraylist.subList(j, l);
        aq1 = new aq("http://ws-na.amazon-adsystem.com/widgets/q");
        aq1.a("TemplateId", "MobileAssociates");
        aq1.a("ServiceVersion", "20070822");
        aq1.a("MarketPlace", "US");
        aq1.a("Operation", "GetDetails");
        aq1.a("InstanceId", "1367560449185");
        aq1.a("ItemId", a(as));
        aq1.a(s.a);
        if (aq1.b() != 200) goto _L6; else goto _L5
_L5:
        a(a1, aq1.a());
        flag = true;
_L7:
        j += 5;
        continue; /* Loop/switch isn't completed */
_L6:
        try
        {
            p.a("PopoverCacheManager", (new StringBuilder()).append("Widget Server didn't return data, error code: ").append(aq1.b()).toString());
        }
        catch (Exception exception)
        {
            p.b("PopoverCacheManager", (new StringBuilder()).append("Error loading Popover Preview data for ").append(as).toString(), new Object[] {
                exception
            });
        }
        if (true) goto _L7; else goto _L4
_L4:
        a.a(a1, new Date());
        return flag;
        if (true) goto _L8; else goto _L2
_L2:
        return false;
    }

}
