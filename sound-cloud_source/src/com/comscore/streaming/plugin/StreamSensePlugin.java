// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming.plugin;

import com.comscore.analytics.Core;
import com.comscore.streaming.StreamSense;
import com.comscore.streaming.StreamSenseClip;
import com.comscore.streaming.StreamSenseEventType;
import com.comscore.streaming.StreamSensePlaylist;
import com.comscore.utils.task.TaskExecutor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.comscore.streaming.plugin:
//            a, StreamSensePluginListener, StreamSensePlayer

public class StreamSensePlugin extends StreamSense
{

    private static final float e[][];
    private HashMap A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final String E = "_all_";
    private String F[];
    private int G;
    private String H[];
    private int I;
    private HashMap J;
    private String b;
    private int c;
    private int d;
    private float f;
    private int g;
    private int h;
    private int i;
    private Runnable j;
    private List k;
    private List l;
    private long m;
    private boolean n;
    private List o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private StreamSensePlayer u;
    private boolean v;
    private boolean w;
    private boolean x;
    private HashMap y;
    private HashMap z;

    public StreamSensePlugin(HashMap hashmap, String s1, String s2, String s3)
    {
        b = "1.0.1";
        c = 10;
        d = 500;
        f = 1.25F;
        g = 2;
        h = 300;
        i = 6;
        k = new ArrayList();
        l = new ArrayList();
        m = 0L;
        n = false;
        o = new ArrayList();
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        v = false;
        w = false;
        x = false;
        y = new HashMap();
        z = new HashMap();
        A = new HashMap();
        B = false;
        C = false;
        D = false;
        F = null;
        G = -1;
        H = null;
        I = -1;
        J = new HashMap();
        if (hashmap != null && hashmap.size() > 0)
        {
            b(hashmap);
        }
        setLabel("ns_st_mp", s1, true);
        setLabel("ns_st_pv", s2, true);
        setLabel("ns_st_mv", s3, true);
    }

    private long a(int i1)
    {
        return ((Long)k.get(k.size() - 1 - i1)).longValue();
    }

    static long a(StreamSensePlugin streamsenseplugin, int i1)
    {
        return streamsenseplugin.a(i1);
    }

    private HashMap a(HashMap hashmap, HashMap hashmap1)
    {
        Object obj = new HashMap();
        boolean flag;
        if (hashmap1 != null && hashmap1.size() > 0)
        {
            hashmap1 = new HashMap(hashmap1);
        } else
        {
            hashmap1 = ((HashMap) (obj));
        }
        if (H != null && H.length == 1 && H[0].equals("_all_"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (hashmap.size() > 0)
        {
            Iterator iterator;
            if (!flag)
            {
                if (hashmap1.size() > 0)
                {
                    hashmap1.putAll(c((HashMap)hashmap.get("")));
                } else
                {
                    hashmap1 = c((HashMap)hashmap.get(""));
                }
            }
            iterator = ((HashMap)hashmap.get("")).keySet().iterator();
            do
            {
                obj = hashmap1;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (String)iterator.next();
                boolean flag1 = Pattern.compile("^([Cc][A-Da-d]_)?ns_st_.+").matcher(((CharSequence) (obj))).find();
                boolean flag2 = Pattern.compile("^[Cc][A-Da-d]?([1-9]|1[0-9]|20)$").matcher(((CharSequence) (obj))).find();
                if (flag1 || flag2)
                {
                    hashmap1.put(obj, ((HashMap)hashmap.get("")).get(obj));
                }
            } while (true);
        } else
        {
            obj = hashmap1;
        }
        return ((HashMap) (obj));
    }

    private void a(String s1)
    {
        if (s1 != null && s1.length() != 0)
        {
            Matcher matcher = Pattern.compile("([^=, ]+)\\s*=(\\s*('([^']+?)'|[a-z0-9\\._-]+)\\s*\\+?)+\\s*", 2).matcher(s1);
            while (matcher.find()) 
            {
                String as[] = s1.substring(matcher.start(), matcher.end()).split("=", 2);
                if (as != null && as.length == 2)
                {
                    String s2 = as[0].replace(" ", "");
                    if (s2 != null && s2.length() > 0)
                    {
                        J.put(s2, as[1]);
                    }
                }
            }
        }
    }

    private boolean a(long l1)
    {
        return Long.parseLong(getClip().getLabel("ns_st_cl")) > 0L && (l1 > Long.parseLong(getClip().getLabel("ns_st_cl")) || Math.abs(l1 - Long.parseLong(getClip().getLabel("ns_st_cl"))) < (long)d);
    }

    static boolean a(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.t;
    }

    static boolean a(StreamSensePlugin streamsenseplugin, long l1)
    {
        return streamsenseplugin.a(l1);
    }

    static boolean a(StreamSensePlugin streamsenseplugin, boolean flag)
    {
        streamsenseplugin.w = flag;
        return flag;
    }

    private long b(int i1)
    {
        return ((Long)l.get(l.size() - 1 - i1)).longValue();
    }

    static long b(StreamSensePlugin streamsenseplugin, int i1)
    {
        return streamsenseplugin.b(i1);
    }

    static long b(StreamSensePlugin streamsenseplugin, long l1)
    {
        streamsenseplugin.m = l1;
        return l1;
    }

    static StreamSensePlayer b(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.u;
    }

    private HashMap b(HashMap hashmap, HashMap hashmap1)
    {
        HashMap hashmap2;
        Iterator iterator;
        hashmap2 = new HashMap();
        if (hashmap1 != null && hashmap1.size() > 0)
        {
            hashmap2 = new HashMap(hashmap1);
        }
        iterator = J.keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s2;
        Matcher matcher;
        s2 = (String)iterator.next();
        hashmap1 = "";
        matcher = Pattern.compile("'([^']+?)'|[a-z0-9\\._-]+\\s*", 2).matcher((CharSequence)J.get(s2));
_L7:
        if (!matcher.find()) goto _L4; else goto _L3
_L3:
        String s1 = ((String)J.get(s2)).substring(matcher.start(), matcher.end()).replace(" ", "");
        if (!Pattern.compile("^'([^']+)'$", 2).matcher(s1).find()) goto _L6; else goto _L5
_L5:
        hashmap1 = s1.replaceFirst("^'+", "").replaceFirst("'+$", "");
_L9:
        hashmap2.put(s2, hashmap1);
          goto _L7
_L6:
        int i1 = s1.lastIndexOf('.');
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        Object obj;
        if (i1 >= s1.length() - 1)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        obj = s1.substring(0, i1);
        s1 = s1.substring(i1 + 1, s1.length());
_L14:
        Iterator iterator1 = hashmap.keySet().iterator();
_L11:
        if (!iterator1.hasNext()) goto _L9; else goto _L8
_L8:
        String s3;
        HashMap hashmap3;
        s3 = (String)iterator1.next();
        hashmap3 = (HashMap)hashmap.get(s3);
        if (!s3.equals(obj)) goto _L11; else goto _L10
_L10:
        if (hashmap3 == null) goto _L9; else goto _L12
_L12:
        if (!hashmap3.containsKey(s1)) goto _L9; else goto _L13
_L13:
        obj = (String)hashmap3.get(s1);
        hashmap1 = ((HashMap) (obj));
          goto _L9
        obj;
        log("Exception occurred while processing mapped labels");
          goto _L9
_L2:
        return hashmap2;
        obj = "";
          goto _L14
    }

    private void b(String s1)
    {
        if (s1 != null && s1.length() != 0)
        {
            s1 = s1.split(",");
            int j1 = s1.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                String as[] = s1[i1].split("=", 2);
                if (as.length == 2)
                {
                    String s2 = as[0].replace(" ", "");
                    if (s2 != null && s2.length() > 0)
                    {
                        String s3 = as[1].replaceFirst("^'+", "").replaceFirst("'+$", "");
                        setLabel(s2, s3);
                        A.put(s2, s3);
                    }
                }
                i1++;
            }
        }
    }

    private void b(HashMap hashmap)
    {
        String s1;
        D = Boolean.valueOf((String)hashmap.get("debug")).booleanValue();
        if (hashmap.containsKey("labelmapping"))
        {
            a((String)hashmap.get("labelmapping"));
        }
        if (hashmap.containsKey("persistentlabels"))
        {
            b((String)hashmap.get("persistentlabels"));
        }
        if (hashmap.containsKey("throttling") && Boolean.valueOf((String)hashmap.get("throttling")).booleanValue())
        {
            setPausePlaySwitchDelayEnabled(true);
        } else
        {
            setPausePlaySwitchDelayEnabled(false);
        }
        if (!hashmap.containsKey("include")) goto _L2; else goto _L1
_L1:
        s1 = (String)hashmap.get("include");
        if (s1 != "_all_") goto _L4; else goto _L3
_L3:
        F = new String[1];
        F[0] = "_all_";
_L2:
        if ((F == null || F.length == 0 || !F[0].equals("_all_")) && hashmap.containsKey("include_prefixes"))
        {
            s1 = (String)hashmap.get("include_prefixes");
            if (s1 != null && s1.length() > 0)
            {
                if (s1.equals("_all_"))
                {
                    F = new String[1];
                    F[0] = "_all_";
                } else
                {
                    if (F == null)
                    {
                        F = new String[0];
                    }
                    G = F.length;
                    ArrayList arraylist1 = new ArrayList(Arrays.asList(F));
                    arraylist1.addAll(Arrays.asList(s1.split(",")));
                    F = new String[arraylist1.size()];
                    F = (String[])arraylist1.toArray(F);
                }
            }
        }
        if (F != null) goto _L6; else goto _L5
_L5:
        H = new String[1];
        H[0] = "_all_";
_L8:
        return;
_L4:
        if (s1.length() > 0)
        {
            F = s1.split(",");
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (hashmap.containsKey("exclude"))
        {
            String s2 = (String)hashmap.get("exclude");
            if (s2.equals("_all_"))
            {
                H = new String[1];
                H[0] = "_all_";
            } else
            if (s2.length() > 0)
            {
                H = s2.split(",");
            }
        }
        if (H != null && H.length != 0 && H[0].equals("_all_") || !hashmap.containsKey("exclude_prefixes")) goto _L8; else goto _L7
_L7:
        hashmap = (String)hashmap.get("exclude_prefixes");
        if (hashmap.equals("_all_"))
        {
            H = new String[1];
            H[0] = "_all_";
            return;
        }
        if (H == null)
        {
            H = new String[0];
        }
        I = H.length;
        ArrayList arraylist = new ArrayList(Arrays.asList(H));
        arraylist.addAll(Arrays.asList(hashmap.split(",")));
        H = new String[arraylist.size()];
        H = (String[])arraylist.toArray(H);
        return;
        if (true) goto _L2; else goto _L9
_L9:
    }

    static boolean b(StreamSensePlugin streamsenseplugin, boolean flag)
    {
        streamsenseplugin.n = flag;
        return flag;
    }

    private HashMap c(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        Object obj = new HashMap();
        Object obj1;
        String s1;
        int i1;
        boolean flag;
        int j1;
        boolean flag1;
        if (hashmap != null && hashmap.size() > 0)
        {
            hashmap = new HashMap(hashmap);
        } else
        {
            hashmap = ((HashMap) (obj));
        }
        if (H == null || H.length != 1 || !H[0].equals("_all_")) goto _L2; else goto _L1
_L1:
        obj = new HashMap();
_L4:
        return ((HashMap) (obj));
_L2:
        if (F != null && F.length > 0 && !F[0].equals("_all_"))
        {
            j1 = F.length;
label0:
            for (i1 = 0; i1 < j1; i1++)
            {
                obj = F[i1];
                if (G >= 0 && i1 >= G)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = hashmap.keySet().iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        continue label0;
                    }
                    s1 = (String)((Iterator) (obj1)).next();
                    if (!hashmap1.containsKey(s1))
                    {
                        if (flag ? s1.indexOf(((String) (obj))) != 0 : !s1.equals(obj))
                        {
                            flag1 = false;
                        } else
                        {
                            flag1 = true;
                        }
                        hashmap1.put(s1, Boolean.valueOf(flag1));
                    }
                } while (true);
            }

            obj = hashmap1.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj1 = (String)((Iterator) (obj)).next();
                if (!((Boolean)hashmap1.get(obj1)).booleanValue())
                {
                    hashmap.remove(obj1);
                }
            } while (true);
            hashmap1 = new HashMap();
        }
        obj = hashmap;
        if (H == null)
        {
            continue;
        }
        obj = hashmap;
        if (H.length <= 0)
        {
            continue;
        }
        j1 = H.length;
        i1 = 0;
        do
        {
            obj = hashmap;
            if (i1 >= j1)
            {
                continue;
            }
            obj = H[i1];
            if (I >= 0 && i1 >= I)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = hashmap.keySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                s1 = (String)((Iterator) (obj1)).next();
                if (flag ? s1.indexOf(((String) (obj))) == 0 : s1.equals(obj))
                {
                    hashmap1.put(s1, Boolean.valueOf(true));
                }
            } while (true);
            obj = hashmap1.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj1 = (String)((Iterator) (obj)).next();
                if (hashmap1.containsKey(obj1) && hashmap.containsKey(obj1))
                {
                    hashmap.remove(obj1);
                }
            } while (true);
            hashmap1 = new HashMap();
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c()
    {
        if (j != null)
        {
            a.getTaskExecutor().removeEnqueuedTask(j);
            j = null;
        }
    }

    static void c(StreamSensePlugin streamsenseplugin)
    {
        streamsenseplugin.c();
    }

    static boolean c(StreamSensePlugin streamsenseplugin, boolean flag)
    {
        streamsenseplugin.v = flag;
        return flag;
    }

    private void d()
    {
        c();
        if (t && u != null)
        {
            j = e();
            a.getTaskExecutor().execute(j, 0L, true, h);
        }
    }

    static boolean d(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.w;
    }

    private Runnable e()
    {
        return new a(this);
    }

    static List e(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.k;
    }

    static List f(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.l;
    }

    private boolean f()
    {
        boolean flag = false;
        if (a(0) < a(1))
        {
            flag = true;
        } else
        {
            int j1 = h;
            int i1 = 0;
            float f1 = 0.0F;
            for (; i1 < k.size(); i1++)
            {
                float f2 = e[k.size() - 2][i1];
                f1 += (float)((Long)k.get(i1)).longValue() * f2;
            }

            if (f1 / (float)j1 > f)
            {
                return true;
            }
        }
        return flag;
    }

    static boolean g(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.p;
    }

    static int h(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.g;
    }

    static int i(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.i;
    }

    static boolean j(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.f();
    }

    static boolean k(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.r;
    }

    static long l(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.m;
    }

    static List m(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.o;
    }

    static boolean n(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.n;
    }

    static boolean o(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.v;
    }

    static boolean p(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.s;
    }

    static boolean q(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.q;
    }

    static int r(StreamSensePlugin streamsenseplugin)
    {
        return streamsenseplugin.c;
    }

    public void addListener(StreamSensePluginListener streamsensepluginlistener)
    {
        o.add(streamsensepluginlistener);
    }

    public void clearAllListeners()
    {
        o.clear();
    }

    public void clearListener(StreamSensePluginListener streamsensepluginlistener)
    {
        o.remove(streamsensepluginlistener);
    }

    public String getGenericPluginVersion()
    {
        return b;
    }

    public StreamSensePlayer getPlayer()
    {
        return u;
    }

    public void log(String s1)
    {
        if (D)
        {
            getClass().getSimpleName();
        }
    }

    public void notify(StreamSenseEventType streamsenseeventtype, HashMap hashmap, long l1)
    {
        if (B || C)
        {
            return;
        }
        HashMap hashmap1 = hashmap;
        if (hashmap == null)
        {
            hashmap1 = new HashMap();
        }
        for (hashmap = o.iterator(); hashmap.hasNext(); ((StreamSensePluginListener)hashmap.next()).onGetLabels(streamsenseeventtype, hashmap1)) { }
        long l2;
        if (l1 <= 0L)
        {
            if (u != null)
            {
                l1 = u.getPosition();
            } else
            {
                l1 = 0L;
            }
        }
        l2 = l1;
        if (l1 < 0L)
        {
            l2 = 0L;
        }
        if (streamsenseeventtype != StreamSenseEventType.END || !t) goto _L2; else goto _L1
_L1:
        k = new ArrayList();
        l = new ArrayList();
        n = false;
        v = true;
        w = true;
_L4:
        super.notify(streamsenseeventtype, hashmap1, l2);
        return;
_L2:
        if (streamsenseeventtype == StreamSenseEventType.PLAY)
        {
            x = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setBitRate(long l1)
    {
        String s1;
        if (l1 > 0L)
        {
            s1 = String.valueOf(l1);
        } else
        {
            s1 = "0";
        }
        setLabel("ns_st_br", s1);
    }

    public Boolean setClip(HashMap hashmap, boolean flag, HashMap hashmap1)
    {
        return setClip(hashmap, flag, hashmap1, false);
    }

    public Boolean setClip(HashMap hashmap, boolean flag, HashMap hashmap1, boolean flag1)
    {
        if (x && hashmap != null && hashmap.get("ns_st_ci") != getClip().getLabel("ns_st_ci"))
        {
            notify(StreamSenseEventType.END, u.getPosition());
            x = false;
        }
        HashMap hashmap2 = hashmap;
        if (hashmap1 != null)
        {
            hashmap2 = hashmap;
            if (hashmap1.size() > 0)
            {
                hashmap2 = b(hashmap1, new HashMap(a(hashmap1, new HashMap(hashmap))));
            }
        }
        if (flag1)
        {
            if (z != null && z.size() > 0)
            {
                for (hashmap = z.keySet().iterator(); hashmap.hasNext(); hashmap2.put(hashmap1, z.get(hashmap1)))
                {
                    hashmap1 = (String)hashmap.next();
                }

            }
        } else
        {
            z = new HashMap();
            if (hashmap2 != null && hashmap2.size() > 0)
            {
                for (hashmap = hashmap2.keySet().iterator(); hashmap.hasNext(); z.put(hashmap1, hashmap2.get(hashmap1)))
                {
                    hashmap1 = (String)hashmap.next();
                }

            }
        }
        if (hashmap2 != null && hashmap2.get("ns_st_skip") != null && Boolean.parseBoolean((String)hashmap2.get("ns_st_skip")))
        {
            B = true;
        } else
        {
            B = false;
        }
        return super.setClip(hashmap2, flag);
    }

    public void setClipLabel(String s1, String s2)
    {
        setClipLabel(s1, s2, false);
    }

    public void setClipLabel(String s1, String s2, boolean flag)
    {
        if (flag)
        {
            if (z.get(s1) == null && A.get(s1) == null)
            {
                getClip().setLabel(s1, s2);
            }
            return;
        } else
        {
            z.put(s1, s2);
            getClip().setLabel(s1, s2);
            return;
        }
    }

    public void setDetectEnd(boolean flag)
    {
        s = flag;
    }

    public void setDetectPause(boolean flag)
    {
        q = flag;
    }

    public void setDetectPlay(boolean flag)
    {
        r = flag;
    }

    public void setDetectSeek(boolean flag)
    {
        p = flag;
    }

    public void setDuration(long l1)
    {
        StreamSenseClip streamsenseclip = getClip();
        String s1;
        if (l1 >= 0L)
        {
            s1 = String.valueOf(l1);
        } else
        {
            s1 = "0";
        }
        streamsenseclip.setLabel("ns_st_cl", s1);
    }

    public void setEndDetectionErrorMargin(int i1)
    {
        d = i1;
    }

    public void setIsFullScreen(boolean flag)
    {
        String s1;
        if (flag)
        {
            s1 = "full";
        } else
        {
            s1 = "norm";
        }
        setLabel("ns_st_ws", s1);
    }

    public void setLabel(String s1, String s2)
    {
        setLabel(s1, s2, false);
    }

    public void setLabel(String s1, String s2, boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(s1, s2);
        setLabels(hashmap, flag);
    }

    public void setLabels(HashMap hashmap)
    {
        setLabels(hashmap, false);
    }

    public void setLabels(HashMap hashmap, boolean flag)
    {
        if (flag)
        {
            if (A != null && A.size() > 0)
            {
                String s1;
                for (Iterator iterator = A.keySet().iterator(); iterator.hasNext(); hashmap.put(s1, A.get(s1)))
                {
                    s1 = (String)iterator.next();
                }

            }
        } else
        {
            A = new HashMap();
            if (hashmap != null && hashmap.size() > 0)
            {
                String s2;
                for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); A.put(s2, hashmap.get(s2)))
                {
                    s2 = (String)iterator1.next();
                }

            }
        }
        super.setLabels(hashmap);
    }

    public void setMaximumNumberOfEntriesInHistory(int i1)
    {
        if (i1 >= 2 && i1 <= 13)
        {
            i = i1;
        }
    }

    public void setMinimumNumberOfTimeUpdateEventsBeforeSensingAnything(int i1)
    {
        if (i1 >= 2 && i1 <= 13)
        {
            g = i1;
        }
    }

    public void setPauseDetectionErrorMargin(int i1)
    {
        c = i1;
    }

    public void setPlayer(StreamSensePlayer streamsenseplayer)
    {
        u = streamsenseplayer;
    }

    public Boolean setPlaylist(HashMap hashmap)
    {
        return setPlaylist(hashmap, false);
    }

    public Boolean setPlaylist(HashMap hashmap, boolean flag)
    {
        if (flag)
        {
            if (y != null && y.size() > 0)
            {
                String s1;
                for (Iterator iterator = y.keySet().iterator(); iterator.hasNext(); hashmap.put(s1, y.get(s1)))
                {
                    s1 = (String)iterator.next();
                }

            }
        } else
        {
            y = new HashMap();
            if (hashmap != null && hashmap.size() > 0)
            {
                String s2;
                for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); y.put(s2, hashmap.get(s2)))
                {
                    s2 = (String)iterator1.next();
                }

            }
        }
        if (hashmap != null && hashmap.get("ns_st_skip") != null && Boolean.parseBoolean((String)hashmap.get("ns_st_skip")))
        {
            C = true;
        } else
        {
            C = false;
        }
        return super.setPlaylist(hashmap);
    }

    public void setPlaylistLabel(String s1, String s2)
    {
        setPlaylistLabel(s1, s2, false);
    }

    public void setPlaylistLabel(String s1, String s2, boolean flag)
    {
        if (flag && flag)
        {
            if (y.get(s1) == null && A.get(s1) == null)
            {
                getPlaylist().setLabel(s1, s2);
            }
            return;
        } else
        {
            y.put(s1, s2);
            getPlaylist().setLabel(s1, s2);
            return;
        }
    }

    public void setPulseSamplingInterval(int i1)
    {
        if (i1 > 0)
        {
            h = i1;
        }
    }

    public void setSeekDetectionMinQuotient(float f1)
    {
        if (f1 > 1.0F)
        {
            f = f1;
        }
    }

    public void setSmartStateDetection(boolean flag)
    {
        boolean flag1 = t;
        t = flag;
        if (!flag1 && flag)
        {
            d();
        } else
        if (flag1 && !flag)
        {
            c();
            return;
        }
    }

    public void setVideoSize(String s1)
    {
        StreamSenseClip streamsenseclip = getClip();
        if (s1 == null || s1.length() <= 0)
        {
            s1 = "0";
        }
        streamsenseclip.setLabel("ns_st_cs", s1);
    }

    public void setVolume(int i1)
    {
        String s1;
        if (i1 >= 0 && i1 <= 100)
        {
            s1 = String.valueOf(i1);
        } else
        {
            s1 = "100";
        }
        setLabel("ns_st_vo", s1);
    }

    static 
    {
        float af[] = {
            -1F, 1.0F
        };
        float af1[] = {
            -0.5F, 0.0F, 0.5F
        };
        float af2[] = {
            -0.3F, -0.1F, 0.1F, 0.3F
        };
        float af3[] = {
            -0.2F, -0.1F, 0.0F, 0.1F, 0.2F
        };
        float af4[] = {
            -0.14286F, -0.08571F, -0.02857F, 0.02857F, 0.08571F, 0.14286F
        };
        float af5[] = {
            -0.05455F, -0.04242F, -0.0303F, -0.01818F, -0.00606F, 0.00606F, 0.01818F, 0.0303F, 0.04242F, 0.05455F
        };
        float af6[] = {
            -0.04545F, -0.03636F, -0.02727F, -0.01818F, -0.00909F, 0.0F, 0.00909F, 0.01818F, 0.02727F, 0.03636F, 
            0.04545F
        };
        float af7[] = {
            -0.03846F, -0.03147F, -0.02448F, -0.01748F, -0.01049F, -0.0035F, 0.0035F, 0.01049F, 0.01748F, 0.02448F, 
            0.03147F, 0.03846F
        };
        float af8[] = {
            -0.03297F, -0.02747F, -0.02198F, -0.01648F, -0.01099F, -0.00549F, 0.0F, 0.00549F, 0.01099F, 0.01648F, 
            0.02198F, 0.02747F, 0.03297F
        };
        e = (new float[][] {
            af, af1, af2, af3, af4, new float[] {
                -0.10714F, -0.07143F, -0.03571F, 0.0F, 0.03571F, 0.07143F, 0.10714F
            }, new float[] {
                -0.08333F, -0.05952F, -0.03571F, -0.0119F, 0.0119F, 0.03571F, 0.05952F, 0.08333F
            }, new float[] {
                -0.06667F, -0.05F, -0.03333F, -0.01667F, 0.0F, 0.01667F, 0.03333F, 0.05F, 0.06667F
            }, af5, af6, 
            af7, af8
        });
    }
}
