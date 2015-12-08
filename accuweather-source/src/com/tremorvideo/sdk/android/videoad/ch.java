// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, az, ci

public class ch
{
    private class a
    {

        public String a;
        public String b;
        public int c;
        public String d[];
        public long e;
        public int f;
        final ch g;

        public void a(az az1)
        {
            boolean flag = false;
            b = az1.i();
            f = 0;
            String as[] = az1.l();
            d = new String[as.length];
            for (int i = 0; i < d.length; i++)
            {
                d[i] = as[i];
            }

            e = 0L;
            for (int j = ((flag) ? 1 : 0); j < as.length; j++)
            {
                e = e + (long)az1.d(j);
            }

        }

        public void a(File file)
            throws Exception
        {
            int i = 0;
            file = new JSONObject(ct.a(file));
            c = file.getInt("views");
            a = file.getString("base-file");
            b = file.getString("expiration-date");
            e = file.getLong("total-size");
            f = file.getInt("priority");
            if (!file.has("files"))
            {
                d = new String[0];
            } else
            {
                file = file.getJSONArray("files");
                d = new String[file.length()];
                while (i < file.length()) 
                {
                    d[i] = file.getString(i);
                    i++;
                }
            }
        }

        public void a(String s)
        {
            JSONObject jsonobject;
            JSONArray jsonarray;
            jsonobject = new JSONObject();
            jsonarray = new JSONArray();
            int i = 0;
_L2:
            if (i >= d.length)
            {
                break; /* Loop/switch isn't completed */
            }
            jsonarray.put(d[i]);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            try
            {
                jsonobject.put("files", jsonarray);
                jsonobject.put("views", c);
                jsonobject.put("expiration-date", b);
                jsonobject.put("base-file", a);
                jsonobject.put("total-size", e);
                jsonobject.put("priority", f);
                s = new FileOutputStream(new File(s));
                s.write(jsonobject.toString().getBytes());
                s.flush();
                s.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ct.a(s);
            }
            return;
        }

        public a()
        {
            g = ch.this;
            super();
        }

        public a(az az1, File file)
        {
            boolean flag = false;
            g = ch.this;
            super();
            a = az1.j();
            c = 0;
            b = az1.i();
            f = 0;
            ch1 = az1.l();
            d = new String[ch.this.length];
            int i = 0;
            int j;
            do
            {
                j = ((flag) ? 1 : 0);
                if (i >= d.length)
                {
                    break;
                }
                d[i] = ch.this[i];
                i++;
            } while (true);
            for (; j < ch.this.length; j++)
            {
                e = e + (long)az1.d(j);
            }

        }
    }


    private static final String a[] = {
        ".theme", ".ad", ".cookies", ".savedata"
    };
    private static final String b[] = {
        ".dat", ".views"
    };
    private static List e = new ArrayList();
    private File c;
    private List d;

    public ch(File file)
    {
        c = file;
        d = new ArrayList();
        a();
        file = file.list();
        ct.d("Loading Cache...");
        int j = file.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            Object obj = file[i];
            if (((String) (obj)).startsWith("tremor-cache-1105352-") && ((String) (obj)).endsWith(".ad"))
            {
                ct.d((new StringBuilder()).append("Loading cache data: ").append(((String) (obj))).toString());
                a a1 = new a();
                obj = new File(c, ((String) (obj)));
                try
                {
                    a1.a(((File) (obj)));
                    d.add(a1);
                }
                catch (Exception exception)
                {
                    ct.a((new StringBuilder()).append("Error loading cache file: ").append(((File) (obj)).getAbsolutePath()).toString(), exception);
                    ((File) (obj)).delete();
                }
            }
            i++;
        } while (true);
        ct.d((new StringBuilder()).append("Cache Loaded: ").append(c() / 1024L).append("KB").toString());
    }

    public static File a(File file, String s)
    {
        return new File((new StringBuilder()).append(file.getAbsolutePath()).append(File.separator).append("tremor-cache-1105352-").append(s).toString());
    }

    public static void a(az az1)
    {
        e.add(az1);
    }

    private boolean a(String s)
    {
        boolean flag1 = false;
        String as[] = a;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    String s1 = as[i];
                    if (!s.toLowerCase().endsWith(s1))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static void b(az az1)
    {
        e.remove(az1);
    }

    private boolean b(String s)
    {
        boolean flag1 = false;
        String as[] = b;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!s.endsWith(as[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private boolean c(String s)
    {
        s = s.replace((new StringBuilder()).append(c.getAbsolutePath()).append(File.separator).toString(), "").replace("tremor-cache-1105352-", "");
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            int i = 0;
            while (i < a1.d.length) 
            {
                if (s.equals(a1.d[i]))
                {
                    return false;
                }
                i++;
            }
        }

        return true;
    }

    private String d(String s)
    {
        return (new StringBuilder()).append(c.getAbsolutePath()).append(File.separator).append("tremor-cache-1105352-").append(s).toString();
    }

    private File e(String s)
    {
        return new File(c.getAbsolutePath(), (new StringBuilder()).append("tremor-cache-1105352-").append(s).toString());
    }

    private void e(az az1)
    {
        long l;
        l = 0L;
        for (int i = 0; i < az1.k(); i++)
        {
            l += az1.d(i);
        }

        if (c() + l <= 0x1400000L) goto _L2; else goto _L1
_L1:
        ct.d((new StringBuilder()).append("Freeing space in cache: Current Size: ").append(c()).append(" Ad size: ").append(l).toString());
_L6:
        if (c() + l <= 0x1400000L || d.size() <= 0) goto _L2; else goto _L3
_L3:
        az1 = a((c() + l) - 0x1400000L);
        if (az1 != null) goto _L4; else goto _L2
_L2:
        return;
_L4:
        b(az1);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private File f(az az1)
    {
        return new File(c.getAbsolutePath(), (new StringBuilder()).append("tremor-cache-1105352-").append(az1.j()).append(".ad").toString());
    }

    private void f()
    {
        ct.d("Checking for expired files...");
        Object obj = new ArrayList();
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a2 = (a)iterator.next();
            if (!a(a2) && gregoriancalendar.after(az.a(a2.b)))
            {
                ((List) (obj)).add(a2);
            }
        } while (true);
        a a1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); d.remove(a1))
        {
            a1 = (a)((Iterator) (obj)).next();
            b(a1);
        }

        ct.d("Done checking for expired files.");
    }

    public a a(long l)
    {
        Iterator iterator = d.iterator();
        a a4 = null;
        a a1 = null;
        do
        {
            if (iterator.hasNext())
            {
                a a2 = (a)iterator.next();
                if (a(a2))
                {
                    continue;
                }
                a a3 = a4;
                if (a2.e >= l)
                {
                    if (a4 == null)
                    {
                        a3 = a2;
                    } else
                    {
                        a3 = a4;
                        if (a4.e > a2.e)
                        {
                            a3 = a2;
                        }
                    }
                }
                if (a1 == null)
                {
                    a4 = a2;
                } else
                {
                    a4 = a2;
                    if (a1.f <= a2.f)
                    {
                        a4 = a1;
                    }
                }
                a1 = a4;
                a4 = a3;
                continue;
            }
            if (a1 != null && a4 != null && a1.f == a4.f)
            {
                return a4;
            }
            return a1;
        } while (true);
    }

    public void a()
    {
        if (ct.d())
        {
            String as[] = c.list();
            ct.d("Displaing Cache...");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                if (s.startsWith("tremor-cache-1105352-"))
                {
                    ct.d((new StringBuilder()).append("File: ").append(s.replace("tremor-cache-1105352-", "")).toString());
                }
            }

        }
    }

    public boolean a(a a1)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext();)
        {
            az az1 = (az)iterator.next();
            if (a1.a.compareTo(az1.j()) == 0)
            {
                return true;
            }
        }

        return false;
    }

    public void b()
    {
        d();
        f();
        String as[] = c.list();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (s.startsWith("tremor-cache-1105352-"))
            {
                ct.d((new StringBuilder()).append("Cache file: ").append(s).toString());
            }
        }

    }

    public void b(a a1)
    {
        boolean flag = false;
        for (int i = 0; i < a1.d.length; i++)
        {
            File file = e(a1.d[i]);
            if (file.exists())
            {
                ct.d((new StringBuilder()).append("Removing Cache File: ").append(file.getAbsolutePath()).toString());
                file.delete();
            }
        }

        String as[] = a;
        int k = as.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            String s = as[j];
            s = d((new StringBuilder()).append(a1.a).append(s).toString());
            File file1 = new File(s);
            if (file1.exists())
            {
                ct.d((new StringBuilder()).append("Removing Cache File: ").append(s).toString());
                file1.delete();
            }
        }

        d.remove(a1);
    }

    public long c()
    {
        Iterator iterator = d.iterator();
        long l;
        for (l = 0L; iterator.hasNext(); l += ((a)iterator.next()).e) { }
        return l;
    }

    public void c(az az1)
    {
        File file = f(az1);
        if (!file.exists())
        {
            ct.d((new StringBuilder()).append("Error Cannot increment views for: ").append(az1.j()).toString());
            return;
        }
        try
        {
            a a1 = new a();
            a1.a(file);
            a1.c = a1.c + 1;
            a1.a(file.getAbsolutePath());
            ct.d((new StringBuilder()).append("Incrementing View Count For: ").append(az1.j()).append(": ").append(a1.c).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            ct.a(az1);
        }
    }

    public void d()
    {
        String as[];
        int i;
        int j;
        ct.d("Checking for orphaned files...");
        as = c.list();
        j = as.length;
        i = 0;
_L9:
        if (i >= j) goto _L2; else goto _L1
_L1:
        String s = as[i];
        if (!s.startsWith("transpera-cache-1105352")) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L7:
        if (flag)
        {
            (new File(c, s)).delete();
        }
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!s.startsWith("tremor-cache-1105352-") || a(s)) goto _L6; else goto _L5
_L5:
        if (b(s))
        {
            ct.d((new StringBuilder()).append("Removing legacy file: ").append(s).toString());
            flag = true;
        } else
        if (c(s))
        {
            ct.d((new StringBuilder()).append("Removing orphaned file: ").append(s).toString());
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L7; else goto _L2
_L2:
        ct.d("Done checking for orphaned files.");
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void d(az az1)
    {
        File file = f(az1);
        if (!file.exists())
        {
            ct.d((new StringBuilder()).append("Adding ad to cache: ").append(az1.j()).append("...").toString());
            e(az1);
            (new a(az1, c)).a(file.getAbsolutePath());
            return;
        }
        ct.d((new StringBuilder()).append("Updating cached ad: ").append(az1.j()).append("...").toString());
        try
        {
            a a1 = new a();
            a1.a(file);
            a1.a(az1);
            a1.a(file.getAbsolutePath());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (az az1)
        {
            ct.a(az1);
        }
    }

    public ci e()
    {
        ci ci1 = new ci();
        a a1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ci1.a(a1.a, a1.c))
        {
            a1 = (a)iterator.next();
        }

        return ci1;
    }

}
