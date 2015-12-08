// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util.vast;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.mopub.common.CacheService;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.mobileads.VastVideoDownloadTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.mopub.mobileads.util.vast:
//            e, d, c, VastCompanionAd, 
//            VastVideoConfiguration, VastXmlManagerAggregator, b, a

public class VastManager
    implements e
{

    private static final List a = Arrays.asList(new String[] {
        "video/mp4", "video/3gpp"
    });
    private static final List b = Arrays.asList(new String[] {
        "image/jpeg", "image/png", "image/bmp", "image/gif"
    });
    private VastManagerListener c;
    private VastXmlManagerAggregator d;
    private double e;
    private int f;

    public VastManager(Context context)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        int j = context.getWidth();
        int k = context.getHeight();
        int i = Math.max(j, k);
        j = Math.min(j, k);
        e = (double)i / (double)j;
        f = j * i;
    }

    private double a(int i, int j)
    {
        double d1 = (double)i / (double)j / e;
        double d2 = (double)(i * j) / (double)f;
        return Math.abs(Math.log(d1)) * 40D + Math.abs(Math.log(d2)) * 60D;
    }

    static VastManagerListener a(VastManager vastmanager)
    {
        return vastmanager.c;
    }

    private String a(List list)
    {
        ArrayList arraylist = new ArrayList(list);
        double d1 = (1.0D / 0.0D);
        list = null;
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (d)iterator.next();
            String s1 = ((d) (obj1)).c();
            String s = ((d) (obj1)).d();
            if (!a.contains(s1) || s == null)
            {
                iterator.remove();
            } else
            {
                Integer integer = ((d) (obj1)).a();
                obj1 = ((d) (obj1)).b();
                if (integer != null && integer.intValue() > 0 && obj1 != null && ((Integer) (obj1)).intValue() > 0)
                {
                    double d2 = a(integer.intValue(), ((Integer) (obj1)).intValue());
                    if (d2 < d1)
                    {
                        list = s;
                        d1 = d2;
                    }
                }
            }
        } while (true);
        Object obj = list;
        if (list == null)
        {
            obj = list;
            if (!arraylist.isEmpty())
            {
                obj = ((d)arraylist.get(0)).d();
            }
        }
        return ((String) (obj));
    }

    static boolean a(VastVideoConfiguration vastvideoconfiguration)
    {
        return b(vastvideoconfiguration);
    }

    private VastCompanionAd b(List list)
    {
        ArrayList arraylist = new ArrayList(list);
        double d1 = (1.0D / 0.0D);
        Iterator iterator = arraylist.iterator();
        list = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            String s = c1.c();
            String s1 = c1.d();
            if (!b.contains(s) || s1 == null)
            {
                iterator.remove();
            } else
            {
                Integer integer = c1.a();
                Integer integer1 = c1.b();
                if (integer != null && integer.intValue() > 0 && integer1 != null && integer1.intValue() > 0)
                {
                    double d2 = a(integer.intValue(), integer1.intValue());
                    if (d2 < d1)
                    {
                        list = c1;
                        d1 = d2;
                    }
                }
            }
        } while (true);
        if (list == null && !arraylist.isEmpty())
        {
            list = (c)arraylist.get(0);
        }
        if (list != null)
        {
            return new VastCompanionAd(list.a(), list.b(), list.d(), list.e(), new ArrayList(list.f()));
        } else
        {
            return null;
        }
    }

    private static boolean b(VastVideoConfiguration vastvideoconfiguration)
    {
        String s = vastvideoconfiguration.getNetworkMediaFileUrl();
        if (CacheService.containsKeyDiskCache(s))
        {
            vastvideoconfiguration.setDiskMediaFileUrl(CacheService.getFilePathDiskCache(s));
            return true;
        } else
        {
            return false;
        }
    }

    public void cancel()
    {
        if (d != null)
        {
            d.cancel(true);
            d = null;
        }
    }

    public void onAggregationComplete(List list)
    {
        d = null;
        if (list == null)
        {
            c.onVastVideoConfigurationPrepared(null);
            return;
        }
        VastVideoConfiguration vastvideoconfiguration = new VastVideoConfiguration();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        b b1;
        for (list = list.iterator(); list.hasNext(); vastvideoconfiguration.setSkipOffset(b1.n()))
        {
            b1 = (b)list.next();
            vastvideoconfiguration.addImpressionTrackers(b1.b());
            vastvideoconfiguration.addAbsoluteTrackers(b1.d());
            vastvideoconfiguration.addFractionalTrackers(b1.c());
            vastvideoconfiguration.addCompleteTrackers(b1.e());
            vastvideoconfiguration.addCloseTrackers(b1.f());
            vastvideoconfiguration.addSkipTrackers(b1.g());
            vastvideoconfiguration.addClickTrackers(b1.i());
            if (vastvideoconfiguration.getClickThroughUrl() == null)
            {
                vastvideoconfiguration.setClickThroughUrl(b1.h());
            }
            arraylist.addAll(b1.o());
            arraylist1.addAll(b1.p());
            vastvideoconfiguration.setCustomCtaText(b1.j());
            vastvideoconfiguration.setCustomSkipText(b1.k());
            vastvideoconfiguration.setCustomCloseIconUrl(b1.l());
            vastvideoconfiguration.setCustomForceOrientation(b1.m());
        }

        vastvideoconfiguration.setNetworkMediaFileUrl(a(arraylist));
        vastvideoconfiguration.setVastCompanionAd(b(arraylist1));
        if (b(vastvideoconfiguration))
        {
            c.onVastVideoConfigurationPrepared(vastvideoconfiguration);
            return;
        }
        list = new VastVideoDownloadTask(new a(this, vastvideoconfiguration));
        try
        {
            AsyncTasks.safeExecuteOnExecutor(list, new String[] {
                vastvideoconfiguration.getNetworkMediaFileUrl()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            MoPubLog.d("Failed to download vast video", list);
        }
        c.onVastVideoConfigurationPrepared(null);
    }

    public void prepareVastVideoConfiguration(String s, VastManagerListener vastmanagerlistener)
    {
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        c = vastmanagerlistener;
        d = new VastXmlManagerAggregator(this);
        AsyncTasks.safeExecuteOnExecutor(d, new String[] {
            s
        });
        return;
        s;
        MoPubLog.d("Failed to aggregate vast xml", s);
        c.onVastVideoConfigurationPrepared(null);
        return;
    }


    private class VastManagerListener
    {

        public abstract void onVastVideoConfigurationPrepared(VastVideoConfiguration vastvideoconfiguration);
    }

}
