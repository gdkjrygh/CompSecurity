// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

// Referenced classes of package com.google.android.gms.analytics:
//            zzr, zzan, zzi, zzab, 
//            zzac, zzae, zzaf, zzl, 
//            zzo

public class zzh
    implements zzr
{

    private final Context mContext;
    private final HttpClient zzBe;
    private URL zzBf;
    private int zzBg;
    private int zzBh;
    private int zzBi;
    private String zzBj;
    private String zzBk;
    private zzi zzBl;
    private zzl zzBm;
    private Set zzBn;
    private boolean zzBo;
    private long zzBp;
    private long zzBq;
    private zzo zzBr;
    private volatile boolean zzBs;
    private final String zzyW;

    zzh(HttpClient httpclient, Context context, zzo zzo1)
    {
        zzBn = new HashSet();
        zzBo = false;
        zzBs = false;
        mContext = context.getApplicationContext();
        zzBr = zzo1;
        zzyW = zza("GoogleAnalytics", "4.0.6", android.os.Build.VERSION.RELEASE, zzan.zza(Locale.getDefault()), Build.MODEL, Build.ID);
        zzBe = httpclient;
    }

    private String zza(zzab zzab1, List list, zzi zzi1)
    {
        if (zzi1 == zzi.zzBv)
        {
            long l;
            if (zzab1.zzgr() == null || zzab1.zzgr().length() == 0)
            {
                list = "";
            } else
            {
                list = zzab1.zzgr();
            }
            l = System.currentTimeMillis();
            if (TextUtils.isEmpty(list))
            {
                return "";
            } else
            {
                return zzac.zza(zzab1, l);
            }
        }
        zzab1 = "";
        zzi1 = list.iterator();
        do
        {
            if (!zzi1.hasNext())
            {
                break;
            }
            String s = (String)zzi1.next();
            if (s.length() != 0)
            {
                list = zzab1;
                if (zzab1.length() != 0)
                {
                    list = (new StringBuilder()).append(zzab1).append("\n").toString();
                }
                zzab1 = (new StringBuilder()).append(list).append(s).toString();
            }
        } while (true);
        return zzab1;
    }

    private URL zza(zzab zzab1)
    {
        if (zzBf != null)
        {
            return zzBf;
        }
        zzab1 = zzab1.zzgu();
        if ("http:".equals(zzab1))
        {
            zzab1 = "http://www.google-analytics.com/collect";
        } else
        {
            zzab1 = "https://ssl.google-analytics.com/collect";
        }
        try
        {
            zzab1 = new URL(zzab1);
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab1)
        {
            zzae.zzZ("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
        return zzab1;
    }

    private void zza(zzaf zzaf1, HttpHost httphost, zzi zzi1, zzl zzl1)
    {
        zzaf1.zzk("_bs", zzi1.toString());
        zzaf1.zzk("_cs", zzl1.toString());
        zzi1 = zzaf1.zzgx();
        if (TextUtils.isEmpty(zzi1))
        {
            return;
        }
        if (httphost == null)
        {
            try
            {
                httphost = new URL("https://ssl.google-analytics.com");
                httphost = new HttpHost(httphost.getHost(), httphost.getPort(), httphost.getProtocol());
            }
            // Misplaced declaration of an exception variable
            catch (zzaf zzaf1)
            {
                return;
            }
        }
        zza(((String) (zzi1)), httphost, 1, zzaf1, zzl.zzBF);
    }

    private void zza(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        org.apache.http.Header aheader[] = httpentityenclosingrequest.getAllHeaders();
        int k = aheader.length;
        for (int i = 0; i < k; i++)
        {
            stringbuffer.append(aheader[i].toString()).append("\n");
        }

        stringbuffer.append(httpentityenclosingrequest.getRequestLine().toString()).append("\n");
        if (httpentityenclosingrequest.getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        httpentityenclosingrequest = httpentityenclosingrequest.getEntity().getContent();
        if (httpentityenclosingrequest == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        int j = httpentityenclosingrequest.available();
        if (j > 0)
        {
            try
            {
                byte abyte0[] = new byte[j];
                httpentityenclosingrequest.read(abyte0);
                stringbuffer.append("POST:\n");
                stringbuffer.append(new String(abyte0)).append("\n");
            }
            // Misplaced declaration of an exception variable
            catch (HttpEntityEnclosingRequest httpentityenclosingrequest)
            {
                zzae.zzac("Error Writing hit to log...");
            }
        }
        zzae.zzaa(stringbuffer.toString());
        return;
    }

    private boolean zza(String s, HttpHost httphost, int i, zzaf zzaf1, zzl zzl1)
    {
        boolean flag;
        if (i > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s.getBytes().length <= zzBi && s.getBytes().length <= zzBh) goto _L2; else goto _L1
_L1:
        zzae.zzac((new StringBuilder("Request too long (> ")).append(Math.min(zzBh, zzBi)).append(" bytes)--not sent").toString());
_L4:
        return true;
_L2:
        HttpEntityEnclosingRequest httpentityenclosingrequest;
        if (zzBs)
        {
            zzae.zzaa("Dry run enabled. Hit not actually sent.");
            return true;
        }
        httpentityenclosingrequest = zzc(s, flag);
        if (httpentityenclosingrequest == null) goto _L4; else goto _L3
_L3:
        if (!httpentityenclosingrequest.getRequestLine().getMethod().equals("GET")) goto _L6; else goto _L5
_L5:
        int j;
        j = s.getBytes().length;
        i = s.getBytes().length;
_L8:
        httpentityenclosingrequest.addHeader("Host", httphost.toHostString());
        if (zzae.zzgw())
        {
            zza(httpentityenclosingrequest);
        }
        static class _cls1
        {

            static final int zzBt[];
            static final int zzBu[];

            static 
            {
                zzBu = new int[zzi.values().length];
                try
                {
                    zzBu[zzi.zzBz.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    zzBu[zzi.zzBx.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    zzBu[zzi.zzBw.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    zzBu[zzi.zzBA.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    zzBu[zzi.zzBy.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                zzBt = new int[zzl.values().length];
                try
                {
                    zzBt[zzl.zzBG.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzBt[zzl.zzBF.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        GZIPOutputStream gzipoutputstream;
        try
        {
            s = zzBe.execute(httphost, httpentityenclosingrequest);
            zzaf1.zze("_td", j);
            zzaf1.zze("_cd", i);
            i = s.getStatusLine().getStatusCode();
            httphost = s.getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzae.zzac("ClientProtocolException sending hit; discarding hit...");
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzae.zzac((new StringBuilder("Exception sending hit: ")).append(s.getClass().getSimpleName()).toString());
            zzae.zzac(s.getMessage());
            return false;
        }
        if (httphost == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        httphost.consumeContent();
        if (i == 200) goto _L4; else goto _L7
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        if (!zzBn.contains(Integer.valueOf(i)))
        {
            break MISSING_BLOCK_LABEL_451;
        }
        zzae.zzaa("Falling back to single hit per request mode.");
        zzBo = true;
        zzBp = System.currentTimeMillis();
        return false;
_L6:
        switch (_cls1.zzBt[zzl1.ordinal()])
        {
        default:
            i = s.getBytes().length;
            httpentityenclosingrequest.setEntity(new StringEntity(s));
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_331;
        }
_L9:
        j = s.getBytes().length;
          goto _L8
        try
        {
            zzl1 = new ByteArrayOutputStream();
            gzipoutputstream = new GZIPOutputStream(zzl1);
            gzipoutputstream.write(s.getBytes());
            gzipoutputstream.close();
            zzl1 = zzl1.toByteArray();
            i = zzl1.length + 0;
            httpentityenclosingrequest.setEntity(new ByteArrayEntity(zzl1));
            httpentityenclosingrequest.addHeader("Content-Encoding", "gzip");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzae.zzZ("Encoding error, hit will be discarded");
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzae.zzZ((new StringBuilder("Unexpected IOException: ")).append(s.getMessage()).toString());
            zzae.zzZ("Request will be discarded");
            return true;
        }
          goto _L9
        zzae.zzac((new StringBuilder("Bad response: ")).append(s.getStatusLine().getStatusCode()).toString());
        return true;
    }

    private HttpEntityEnclosingRequest zzc(String s, boolean flag)
    {
        if (TextUtils.isEmpty(s))
        {
            System.out.println("Empty hit, discarding.");
            return null;
        }
        s = (new StringBuilder()).append(zzBj).append("?").append(s).toString();
        if (s.length() < zzBg && !flag)
        {
            s = new BasicHttpEntityEnclosingRequest("GET", s);
        } else
        if (flag)
        {
            s = new BasicHttpEntityEnclosingRequest("POST", zzBk);
        } else
        {
            s = new BasicHttpEntityEnclosingRequest("POST", zzBj);
        }
        s.addHeader("User-Agent", zzyW);
        return s;
    }

    public void setDryRun(boolean flag)
    {
        zzBs = flag;
    }

    int zza(List list, int i)
    {
        if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        int j = i;
        if (i > list.size())
        {
            j = list.size();
        }
        k = j - 1;
        long l = 0L;
        i = j;
        j = k;
        do
        {
            k = i;
            if (j <= 0)
            {
                continue;
            }
            zzab zzab1 = (zzab)list.get(j - 1);
            zzab zzab2 = (zzab)list.get(j);
            long l1 = zzab1.zzgt();
            long l2 = zzab2.zzgt();
            if (l1 != 0L && l2 != 0L && l2 - l1 > l)
            {
                l = l2 - l1;
                i = j;
            }
            j--;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int zza(List list, zzaf zzaf1, boolean flag)
    {
        zzl zzl1;
        zzi zzi1;
        Object obj2;
        Object obj3;
        int k;
        int l;
        int k1;
        long l1;
        long l3;
        zzBg = zzBr.zzfl();
        zzBh = zzBr.zzfm();
        zzBi = zzBr.zzfn();
        int i = zzBr.zzfo();
        zzBj = zzBr.zzfq();
        zzBk = zzBr.zzfr();
        zzBl = zzBr.zzfs();
        zzBm = zzBr.zzft();
        zzBn.clear();
        zzBn.addAll(zzBr.zzfu());
        zzBq = zzBr.zzfp();
        if (!zzBo && zzBn.isEmpty())
        {
            zzBo = true;
            zzBp = System.currentTimeMillis();
        }
        if (zzBo && System.currentTimeMillis() - zzBp > 1000L * zzBq)
        {
            zzBo = false;
        }
        Object obj1;
        Iterator iterator;
        int i1;
        if (zzBo)
        {
            zzi1 = zzi.zzBv;
            zzl1 = zzl.zzBF;
        } else
        {
            zzi1 = zzBl;
            zzl1 = zzBm;
        }
        k1 = 0;
        l = Math.min(list.size(), i);
        zzaf1.zze("_hr", list.size());
        l3 = System.currentTimeMillis();
        obj2 = new ArrayList();
        obj3 = new ArrayList();
        l1 = 0L;
        if (zzi1 == zzi.zzBv) goto _L2; else goto _L1
_L1:
        iterator = list.iterator();
        k = 0;
_L18:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj = (zzab)iterator.next();
        int j;
        long l2;
        if (TextUtils.isEmpty(((zzab) (obj)).zzgr()))
        {
            obj = "";
        } else
        {
            obj = zzac.zza(((zzab) (obj)), l3);
        }
        obj1 = obj;
        if (((String) (obj)).getBytes().length > zzBh)
        {
            obj1 = "";
        }
        ((List) (obj2)).add(obj1);
        l2 = l1;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            i1 = ((String) (obj1)).getBytes().length;
            if (k == 0)
            {
                j = 0;
            } else
            {
                j = 1;
            }
            l2 = l1 + (long)(j + i1);
        }
        ((List) (obj3)).add(Long.valueOf(l2));
        HttpHost httphost;
        int j1;
        if (l2 <= (long)zzBi)
        {
            j = k + 1;
        } else
        {
            j = k;
        }
        if (j != l) goto _L6; else goto _L5
_L5:
        l = 1;
        l1 = l2;
_L19:
        for (k = j; k > 1 && ((Long)((List) (obj3)).get(k - 1)).longValue() > (long)zzBi; k--) { }
        if (l1 <= (long)zzBi) goto _L8; else goto _L7
_L7:
        _cls1.zzBu[zzi1.ordinal()];
        JVM INSTR tableswitch 1 5: default 580
    //                   1 731
    //                   2 760
    //                   3 772
    //                   4 784
    //                   5 857;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L9:
        zzae.zzac("Unexpected batching strategy encountered; sending a single hit.");
        obj = (String)((List) (obj2)).get(0);
        ((List) (obj2)).clear();
        ((List) (obj2)).add(obj);
        j = 1;
_L17:
        if (j >= ((List) (obj2)).size()) goto _L8; else goto _L15
_L15:
        obj = ((List) (obj2)).subList(0, j);
          goto _L16
_L10:
        j1 = ((List) (obj2)).size() / 2;
        j = j1;
        if (k <= j1)
        {
            j = k;
        }
          goto _L17
_L11:
        j = zza(list, k);
          goto _L17
_L12:
        j = zzb(list, k);
          goto _L17
_L13:
        if (l1 < (long)(zzBi << 1))
        {
            j = ((List) (obj3)).size() - 1;
            while (j > 0 && ((Long)((List) (obj3)).get(j)).longValue() > l1 / 2L) 
            {
                j--;
            }
        } else
        {
            j = k;
        }
          goto _L17
_L14:
        j = k;
          goto _L17
_L16:
        j = 0;
        httphost = null;
        j1 = 0;
        k = k1;
        while (j1 < l) 
        {
            obj2 = (zzab)list.get(j1);
            obj3 = zza(((zzab) (obj2)));
            k1 = Math.max(1, ((List) (obj)).size());
            if (obj3 == null)
            {
                zzae.zzac("No destination: discarding hit.");
                j += k1;
                k += k1;
            } else
            {
                httphost = new HttpHost(((URL) (obj3)).getHost(), ((URL) (obj3)).getPort(), ((URL) (obj3)).getProtocol());
                if (!zza(zza(((zzab) (obj2)), ((List) (obj)), zzi1), httphost, k1, zzaf1, zzl1))
                {
                    zzaf1.zze("_de", 1);
                    zzaf1.zze("_hd", j);
                    zzaf1.zze("_hs", k);
                    zza(zzaf1, httphost, zzi1, zzl1);
                    return k;
                }
                obj2 = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    if (TextUtils.isEmpty((String)((Iterator) (obj2)).next()))
                    {
                        j++;
                    }
                } while (true);
                zzaf1.zze("_rs", 1);
                k += k1;
            }
            j1++;
        }
        zzaf1.zze("_hd", j);
        zzaf1.zze("_hs", k);
        if (flag)
        {
            zza(zzaf1, httphost, zzi1, zzl1);
        }
        return k;
_L8:
        obj = obj2;
        if (true) goto _L16; else goto _L6
_L6:
        k = j;
        l1 = l2;
          goto _L18
_L4:
        l = 1;
          goto _L19
_L2:
        k = 0;
          goto _L19
    }

    String zza(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s, s1, s2, s3, s4, s5
        });
    }

    public void zzak(String s)
    {
        try
        {
            zzBf = new URL(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzBf = null;
        }
    }

    int zzb(List list, int i)
    {
        if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int k = i - 1;
        do
        {
            j = i;
            if (k <= 0)
            {
                continue;
            }
            String s = ((zzab)list.get(k)).zzgr();
            if (!TextUtils.isEmpty(s))
            {
                if (s.contains("sc=start"))
                {
                    return k;
                }
                if (s.contains("sc=end"))
                {
                    return k + 1;
                }
            }
            k--;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean zzfk()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzae.zzab("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }
}
