// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.Date;
import com.comscore.utils.Utils;
import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//            p, StreamSense, StreamSenseState, StreamSenseEventType, 
//            StreamSenseClip, AdType, ContentType

public class StreamingTag
{

    private String a[] = {
        "ns_st_ci", "c3", "c4", "c6", "ns_st_st", "ns_st_pu", "ns_st_pr", "ns_st_ep", "ns_st_sn", "ns_st_en", 
        "ns_st_ct"
    };
    private StreamSense b;
    private long c;
    private long d;
    private int e;
    private HashMap f;
    private p g;
    private boolean h;

    public StreamingTag()
    {
        e = 0;
        c = 0L;
        d = 0L;
        f = null;
        h = false;
        g = p.None;
        b = new StreamSense();
        b.setLabel("ns_st_it", "r");
    }

    private HashMap a(HashMap hashmap)
    {
        hashmap = Utils.mapOfStrings(hashmap);
        String as[] = a;
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s = as[i];
            if (!hashmap.containsKey(s))
            {
                if (s == "ns_st_ci")
                {
                    hashmap.put(s, "0");
                } else
                {
                    hashmap.put(s, "*null");
                }
            }
            i++;
        }
        return hashmap;
    }

    private void a(long l)
    {
        if (b.getState() != StreamSenseState.IDLE && b.getState() != StreamSenseState.PAUSED)
        {
            b.notify(StreamSenseEventType.END, b(l));
        } else
        if (b.getState() == StreamSenseState.PAUSED)
        {
            b.notify(StreamSenseEventType.END, d);
            return;
        }
    }

    private void a(long l, HashMap hashmap)
    {
        a(l);
        e = e + 1;
        if (!hashmap.containsKey("ns_st_cn"))
        {
            hashmap.put("ns_st_cn", String.valueOf(e));
        }
        if (!hashmap.containsKey("ns_st_pn"))
        {
            hashmap.put("ns_st_pn", "1");
        }
        if (!hashmap.containsKey("ns_st_tp"))
        {
            hashmap.put("ns_st_tp", "0");
        }
        b.setClip(hashmap);
        f = hashmap;
        c = l;
        d = 0L;
        b.notify(StreamSenseEventType.PLAY, d);
    }

    private void a(HashMap hashmap, p p1)
    {
        long l = Date.unixTime();
        hashmap = a(Utils.mapOfStrings(hashmap));
        if (g == p.None)
        {
            g = p1;
        }
        if (h && g == p1 && c(hashmap))
        {
            b.getClip().setLabels(hashmap);
            if (b.getState() != StreamSenseState.PLAYING)
            {
                c = l;
                b.notify(StreamSenseEventType.PLAY, d);
            }
        } else
        {
            a(l, hashmap);
        }
        h = true;
        g = p1;
    }

    private boolean a(String s, HashMap hashmap, HashMap hashmap1)
    {
        boolean flag1 = true;
        if (s != null)
        {
            boolean flag;
            if (hashmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (hashmap1 == null)
            {
                flag1 = false;
            }
            if (flag1 & flag)
            {
                hashmap = (String)hashmap.get(s);
                s = (String)hashmap1.get(s);
                if (hashmap != null && s != null)
                {
                    return hashmap.equals(s);
                }
            }
        }
        return false;
    }

    private long b(long l)
    {
        if (c > 0L && l >= c)
        {
            d = d + (l - c);
        } else
        {
            d = 0L;
        }
        return d;
    }

    private void b(HashMap hashmap)
    {
        long l = Date.unixTime();
        a(l);
        e = e + 1;
        hashmap = a(Utils.mapOfStrings(hashmap));
        if (!hashmap.containsKey("ns_st_cn"))
        {
            hashmap.put("ns_st_cn", String.valueOf(e));
        }
        if (!hashmap.containsKey("ns_st_pn"))
        {
            hashmap.put("ns_st_pn", "1");
        }
        if (!hashmap.containsKey("ns_st_tp"))
        {
            hashmap.put("ns_st_tp", "1");
        }
        if (!hashmap.containsKey("ns_st_ad"))
        {
            hashmap.put("ns_st_ad", "1");
        }
        b.setClip(hashmap);
        d = 0L;
        b.notify(StreamSenseEventType.PLAY, d);
        c = l;
        h = false;
    }

    private boolean c(HashMap hashmap)
    {
        hashmap = a(Utils.mapOfStrings(hashmap));
        String as[] = a;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (!a(as[i], f, hashmap))
            {
                return false;
            }
        }

        return true;
    }

    public void playAdvertisement()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ns_st_ct", "va");
        b(hashmap);
    }

    public void playAudioAdvertisement()
    {
        playAudioAdvertisement(new HashMap());
    }

    public void playAudioAdvertisement(HashMap hashmap)
    {
        playAudioAdvertisement(hashmap, null);
    }

    public void playAudioAdvertisement(HashMap hashmap, AdType adtype)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            if (adtype == null)
            {
                hashmap = (new StringBuilder()).append("a").append("a").toString();
            } else
            {
                hashmap = (new StringBuilder()).append("a").append(adtype.a()).toString();
            }
            hashmap1.put("ns_st_ct", hashmap);
        }
        b(hashmap1);
    }

    public void playAudioContentPart(HashMap hashmap)
    {
        playAudioContentPart(hashmap, null);
    }

    public void playAudioContentPart(HashMap hashmap, ContentType contenttype)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            if (contenttype == null)
            {
                hashmap = (new StringBuilder()).append("a").append("c").toString();
            } else
            {
                hashmap = (new StringBuilder()).append("a").append(contenttype.a()).toString();
            }
            hashmap1.put("ns_st_ct", hashmap);
        }
        a(hashmap1, p.AudioContent);
    }

    public void playContentPart(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            hashmap1.put("ns_st_ct", "vc");
        }
        a(hashmap1, p.VideoContent);
    }

    public void playVideoAdvertisement()
    {
        playVideoAdvertisement(new HashMap());
    }

    public void playVideoAdvertisement(HashMap hashmap)
    {
        playVideoAdvertisement(hashmap, null);
    }

    public void playVideoAdvertisement(HashMap hashmap, AdType adtype)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            if (adtype == null)
            {
                hashmap = (new StringBuilder()).append("v").append("a").toString();
            } else
            {
                hashmap = (new StringBuilder()).append("v").append(adtype.a()).toString();
            }
            hashmap1.put("ns_st_ct", hashmap);
        }
        b(hashmap1);
    }

    public void playVideoContentPart(HashMap hashmap)
    {
        playVideoContentPart(hashmap, null);
    }

    public void playVideoContentPart(HashMap hashmap, ContentType contenttype)
    {
        HashMap hashmap1 = new HashMap();
        if (hashmap != null)
        {
            hashmap1.putAll(hashmap);
        }
        if (!hashmap1.containsKey("ns_st_ct"))
        {
            if (contenttype == null)
            {
                hashmap = (new StringBuilder()).append("v").append("c").toString();
            } else
            {
                hashmap = (new StringBuilder()).append("v").append(contenttype.a()).toString();
            }
            hashmap1.put("ns_st_ct", hashmap);
        }
        a(hashmap1, p.VideoContent);
    }

    public void stop()
    {
        long l = Date.unixTime();
        b.notify(StreamSenseEventType.PAUSE, b(l));
    }
}
