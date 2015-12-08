// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import com.comscore.analytics.Core;
import com.comscore.applications.ApplicationMeasurement;
import com.comscore.applications.EventType;
import com.comscore.measurement.Measurement;
import com.comscore.measurement.MeasurementDispatcher;
import com.comscore.utils.task.TaskExecutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.comscore.utils:
//            Storage, FileUtils, Date, Connectivity, 
//            CSLog, Utils, XMLBuilder, Permissions, 
//            e, TransmissionMode

public class OfflineMeasurementsCache
{

    protected final Core a;
    private int b;
    private int c;
    private int d;
    private long e;
    private long f;
    private String g;
    private final String h;
    private ArrayList i;
    private String j;
    private int k;
    private long l;
    private long m;

    public OfflineMeasurementsCache(Core core)
    {
        this(core, "cs_cache_");
    }

    protected OfflineMeasurementsCache(Core core, String s)
    {
        g = null;
        i = null;
        j = null;
        k = 0;
        l = 0L;
        m = 0L;
        a = core;
        h = s;
        setCacheMaxMeasurements(2000);
        setCacheMaxBatchFiles(100);
        setCacheMaxPosts(10);
        setCacheWaitMinutes(30);
        setCacheMeasurementExpiry(31);
        e();
    }

    private void a(int i1)
    {
        Storage storage = a.getStorage();
        int j1 = i1;
        if (storage.has("CACHE_DROPPED_MEASUREMENTS").booleanValue())
        {
            j1 = i1 + Integer.valueOf(storage.get("CACHE_DROPPED_MEASUREMENTS")).intValue();
        }
        storage.set("CACHE_DROPPED_MEASUREMENTS", String.valueOf(j1));
    }

    private void a(String s)
    {
        Storage storage = a.getStorage();
        if (storage.has(s).booleanValue())
        {
            a(Integer.valueOf(storage.get(s)).intValue());
        }
    }

    private void a(String s, boolean flag)
    {
        if (s != null)
        {
            if (flag)
            {
                a(s);
            }
            FileUtils.deleteFile(a, s);
            i.remove(s);
        }
    }

    private boolean a(long l1)
    {
        long l2 = Date.unixTime();
        return f * 24L * 60L * 60L * 1000L - (l2 - l1) <= 0L;
    }

    private boolean a(String s, String s1)
    {
        HttpClient httpclient;
        httpclient = Connectivity.getHttpClient();
        s1 = new HttpPost(s1);
        int i1;
        s = new StringEntity(s, "UTF-8");
        s.setContentType("text/xml");
        s1.setHeader("User-Agent", System.getProperty("http.agent"));
        s1.setEntity(s);
        CSLog.d(this, "Sending POST request");
        a.getStorage().set("lastTransmission", String.valueOf(System.currentTimeMillis()));
        s = httpclient.execute(s1);
        i1 = s.getStatusLine().getStatusCode();
        CSLog.d(this, (new StringBuilder()).append("Response:").append(i1).toString());
        CSLog.d(this, "Cache flushed");
        s = EntityUtils.toString(s.getEntity());
        if (i1 != 200)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        boolean flag;
        if (!Utils.isNotEmpty(s))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        flag = s.startsWith("OK");
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_192;
        s;
        CSLog.e(this, (new StringBuilder()).append("Exception in flush:").append(s.getLocalizedMessage()).toString());
        CSLog.printStackTrace(s);
        return false;
    }

    private static String[] a(String as[], int i1, int j1)
    {
        if (i1 > j1)
        {
            throw new IllegalArgumentException();
        }
        int k1 = as.length;
        if (i1 < 0 || i1 > k1)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            j1 -= i1;
            k1 = Math.min(j1, k1 - i1);
            String as1[] = new String[j1];
            System.arraycopy(as, i1, as1, 0, k1);
            return as1;
        }
    }

    private void b(String s)
    {
        CSLog.d(this, "Creating new cache batch file");
        String s1 = (new StringBuilder()).append(h).append(XMLBuilder.getLabelFromEvent(s, "ns_ts")).toString();
        FileUtils.writeEvent(a, s1, 0, s);
        if (i == null)
        {
            i = new ArrayList();
        }
        i.add(s1);
        c();
    }

    private boolean b()
    {
label0:
        {
            long l1;
label1:
            {
                if (!d().booleanValue() || isEmpty() || a.getCustomerC2() == null)
                {
                    break label0;
                }
                if (k >= d)
                {
                    l1 = e * 1000L * 60L - (Date.unixTime() - m);
                    if (l1 > 0L)
                    {
                        break label1;
                    }
                    k = 0;
                    m = 0L;
                }
                return true;
            }
            CSLog.d(this, (new StringBuilder()).append("Max flushes in a row (").append(d).append(") reached. Waiting ").append((double)l1 / 1000D / 60D).append(" minutes").toString());
        }
        return false;
    }

    private int c(String s)
    {
label0:
        {
            Storage storage = a.getStorage();
            int i1 = 0;
            if (s != null)
            {
                if (!storage.has(s).booleanValue())
                {
                    break label0;
                }
                i1 = Integer.valueOf(storage.get(s)).intValue();
            }
            return i1;
        }
        return FileUtils.readCachedEvents(a.getAppContext(), s).length;
    }

    private void c()
    {
        l = 0L;
        if (j != null)
        {
            j = null;
        }
    }

    private Boolean d()
    {
        android.content.Context context = a.getAppContext();
        if (Connectivity.isEmulator())
        {
            return Boolean.valueOf(true);
        }
        if (!Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue())
        {
            return Boolean.valueOf(true);
        }
        if (Connectivity.isConnectedWiFi(context))
        {
            return Boolean.valueOf(true);
        }
        if (Connectivity.isConnectedMobile(context))
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    private String[] d(String s)
    {
        String as[];
        boolean flag;
        int i1;
        as = FileUtils.readCachedEvents(a.getAppContext(), s);
        flag = false;
        i1 = 0;
_L2:
        boolean flag1;
        flag1 = flag;
        if (i1 >= as.length)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        flag1 = flag;
        long l1 = Long.parseLong(XMLBuilder.getLabelFromEvent(as[i1], "ns_ts"));
        flag1 = flag;
        if (!a(l1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        flag1 = flag;
        CSLog.d(this, (new StringBuilder()).append("Valid timestamp found: ").append(l1).toString());
        flag1 = flag;
        NumberFormatException numberformatexception;
        if (!flag1)
        {
            CSLog.d(this, (new StringBuilder()).append("All events in the file ").append(s).append(" are expired").toString());
            a(s, true);
            return null;
        } else
        {
            a(i1);
            return a(as, i1, as.length);
        }
        numberformatexception;
        i1++;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private long e(String s)
    {
        return Long.valueOf(s.substring(h.length())).longValue();
    }

    private void e()
    {
        List list = f();
        boolean flag = false;
        int i1 = list.size();
        while (i1 > 0) 
        {
            long l1 = e((String)list.get(i1 - 1));
            if (!flag)
            {
                flag = a(l1);
            } else
            {
                CSLog.d(this, (new StringBuilder()).append("Deleting expired cache file ").append((String)list.get(i1 - 1)).toString());
                a((String)list.get(i1 - 1), true);
            }
            i1--;
        }
    }

    private List f()
    {
        if (i == null)
        {
            i = FileUtils.getFileList(a.getAppContext());
        }
        return i;
    }

    private String g()
    {
        if (i != null && i.size() > 0)
        {
            return (String)i.get(0);
        } else
        {
            return null;
        }
    }

    private String h()
    {
        if (i != null && i.size() > 0)
        {
            return (String)i.get(i.size() - 1);
        } else
        {
            return null;
        }
    }

    protected String a()
    {
        Object obj;
        String s;
        boolean flag;
        boolean flag1;
        if (g != null)
        {
            obj = new StringBuilder(g);
        } else
        {
            if (a.isSecure())
            {
                obj = "https://udm.scorecardresearch.com/offline";
            } else
            {
                obj = "http://udm.scorecardresearch.com/offline";
            }
            obj = new StringBuilder(((String) (obj)));
        }
        if (((StringBuilder) (obj)).indexOf("?") == -1)
        {
            ((StringBuilder) (obj)).append("?");
            flag = false;
        } else
        {
            flag = true;
        }
        s = a.getCustomerC2();
        flag1 = flag;
        if (s != null)
        {
            flag1 = flag;
            if (!s.equals(""))
            {
                if (flag)
                {
                    ((StringBuilder) (obj)).append("&");
                }
                ((StringBuilder) (obj)).append("c2=");
                ((StringBuilder) (obj)).append(s);
                flag1 = true;
            }
        }
        s = Utils.md5(String.format("JetportGotAMaskOfThe%sS.D_K-", new Object[] {
            a.getPublisherSecret()
        }));
        if (s != null && !s.equals(""))
        {
            if (flag1)
            {
                ((StringBuilder) (obj)).append("&");
            }
            ((StringBuilder) (obj)).append("s=");
            ((StringBuilder) (obj)).append(s);
        }
        return ((StringBuilder) (obj)).toString().toLowerCase(new Locale("en", "US"));
    }

    public void clear()
    {
        if (a.isEnabled())
        {
            List list = f();
            int i1 = list.size();
            while (i1 > 0) 
            {
                a((String)list.get(i1 - 1), true);
                i1--;
            }
        }
    }

    public boolean flush()
    {
        boolean flag1 = false;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag2 = a.isEnabled();
        if (flag2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Storage storage;
        long l1;
        storage = a.getStorage();
        e();
        l1 = e * 1000L * 60L - (Date.unixTime() - l);
        if (l1 > 0L)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        l = 0L;
_L9:
        flag = flag1;
        if (!b()) goto _L1; else goto _L3
_L3:
        Object obj = null;
        CSLog.d(this, (new StringBuilder()).append("Cache is not empty, contains ").append(i.size()).append(" files").toString());
        if (j != null) goto _L5; else goto _L4
_L4:
        String s;
        String as[];
        s = h();
        CSLog.d(this, (new StringBuilder()).append("reading events from the file ").append(s).toString());
        as = d(s);
        obj = s;
        if (as == null) goto _L5; else goto _L6
_L6:
        obj = s;
        if (as.length <= 0) goto _L5; else goto _L7
_L7:
        if (!storage.has("CACHE_DROPPED_MEASUREMENTS").booleanValue())
        {
            break MISSING_BLOCK_LABEL_293;
        }
        obj = storage.get("CACHE_DROPPED_MEASUREMENTS");
_L10:
        j = XMLBuilder.generateXMLRequestString(as, ((String) (obj)));
        obj = s;
_L5:
        if (j == null || j.length() <= 0) goto _L9; else goto _L8
_L8:
        flag = a(j, a());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        k = k + 1;
        a(((String) (obj)), false);
        c();
        m = Date.unixTime();
        storage.remove("CACHE_DROPPED_MEASUREMENTS");
        flag1 = flag;
          goto _L9
        obj;
        throw obj;
        obj = "0";
          goto _L10
        l = Date.unixTime();
          goto _L1
        CSLog.d(this, (new StringBuilder()).append("Waiting ").append((double)l1 / 1000D / 60D).append(" minutes").toString());
          goto _L1
    }

    public int getCacheMaxBatchFiles()
    {
        return c;
    }

    public int getCacheMaxMeasurements()
    {
        return b;
    }

    public int getCacheMaxPosts()
    {
        return d;
    }

    public long getCacheMeasurementExpiry()
    {
        return f;
    }

    public long getCacheWaitMinutes()
    {
        return e;
    }

    public int getEventCount()
    {
        int j1 = c(h());
        List list = f();
        int i1 = j1;
        if (list.size() > 0)
        {
            i1 = j1 + (list.size() - 1) * getCacheMaxBatchFiles();
        }
        return i1;
    }

    public boolean isEmpty()
    {
        return getEventCount() == 0;
    }

    public void saveApplicationMeasurement(EventType eventtype, HashMap hashmap)
    {
        saveApplicationMeasurement(eventtype, hashmap, false);
    }

    public void saveApplicationMeasurement(EventType eventtype, HashMap hashmap, boolean flag)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            eventtype = ApplicationMeasurement.newApplicationMeasurement(a, eventtype, hashmap, null);
            a.getMeasurementDispatcher().addAggregateData(eventtype);
            a.getMeasurementDispatcher().addEventCounter(eventtype);
            saveEvent(eventtype, flag);
            return;
        }
    }

    public void saveEvent(Measurement measurement)
    {
        saveEvent(measurement, false);
    }

    public void saveEvent(Measurement measurement, boolean flag)
    {
        if (!a.isEnabled())
        {
            return;
        }
        if (flag)
        {
            a.getTaskExecutor().execute(new e(this, measurement), true);
            return;
        } else
        {
            saveEvent(measurement.retrieveLabelsAsString(a.getMeasurementLabelOrder()));
            return;
        }
    }

    public void saveEvent(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.isEnabled();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a.getOfflineTransmissionMode() == TransmissionMode.DISABLED || a.getCustomerC2() == null || !Utils.isNotEmpty(XMLBuilder.getLabelFromEvent(s, "ns_ts"))) goto _L1; else goto _L3
_L3:
        String s1 = h();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        if (c(s1) >= getCacheMaxBatchFiles())
        {
            break MISSING_BLOCK_LABEL_119;
        }
        s = (new StringBuilder()).append("\n").append(s).toString();
        FileUtils.writeEvent(a, s1, 32768, s);
        c();
          goto _L1
        s;
        throw s;
        CSLog.d(this, "The newest cache batch file is full");
        if (f().size() >= getCacheMaxMeasurements() / getCacheMaxBatchFiles())
        {
            CSLog.d(this, (new StringBuilder()).append("reached the cache max (").append(getCacheMaxMeasurements()).append(") size").toString());
            a(g(), true);
        }
        b(s);
          goto _L1
        b(s);
          goto _L1
    }

    public void setCacheMaxBatchFiles(int i1)
    {
        while (!a.isEnabled() || i1 <= 0) 
        {
            return;
        }
        c = i1;
    }

    public void setCacheMaxMeasurements(int i1)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            b = i1;
            return;
        }
    }

    public void setCacheMaxPosts(int i1)
    {
        d = i1;
    }

    public void setCacheMeasurementExpiry(int i1)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            f = i1;
            return;
        }
    }

    public void setCacheWaitMinutes(int i1)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            e = i1;
            return;
        }
    }

    public void setUrl(String s)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            g = s;
            return;
        }
    }
}
