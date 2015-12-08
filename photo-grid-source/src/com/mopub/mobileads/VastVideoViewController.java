// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.mopub.common.DownloadResponse;
import com.mopub.common.DownloadTask;
import com.mopub.common.HttpClient;
import com.mopub.common.HttpResponses;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Drawables;
import com.mopub.common.util.Intents;
import com.mopub.common.util.Streams;
import com.mopub.common.util.Strings;
import com.mopub.common.util.VersionCode;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.exceptions.UrlParseException;
import com.mopub.mobileads.util.vast.VastCompanionAd;
import com.mopub.mobileads.util.vast.VastVideoConfiguration;
import com.mopub.network.TrackingRequest;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.mopub.mobileads:
//            BaseVideoViewController, as, aw, ax, 
//            ay, aq, av, au, 
//            VastAbsoluteProgressTracker, VastFractionalProgressTracker, az, at

public class VastVideoViewController extends BaseVideoViewController
    implements com.mopub.common.DownloadTask.DownloadTaskListener
{

    private final VastVideoConfiguration a;
    private final VastCompanionAd b;
    private final aq c;
    private final VideoView d;
    private final ImageView e;
    private final android.view.View.OnTouchListener f = new as(this);
    private final Handler g = new Handler();
    private final Runnable h = new au(this);
    private boolean i;
    private int j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;

    VastVideoViewController(Context context, Bundle bundle, long l1, BaseVideoViewController.BaseVideoViewControllerListener basevideoviewcontrollerlistener)
    {
        super(context, Long.valueOf(l1), basevideoviewcontrollerlistener);
        j = 5000;
        q = false;
        i = false;
        l = -1;
        n = 0;
        bundle = bundle.getSerializable("vast_video_configuration");
        if (bundle != null && (bundle instanceof VastVideoConfiguration))
        {
            a = (VastVideoConfiguration)bundle;
            if (a.getDiskMediaFileUrl() == null)
            {
                throw new IllegalStateException("VastVideoConfiguration does not have a video disk path");
            }
        } else
        {
            throw new IllegalStateException("VastVideoConfiguration is invalid");
        }
        b = a.getVastCompanionAd();
        bundle = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            Color.argb(0, 0, 0, 0), Color.argb(255, 0, 0, 0)
        });
        bundle = new LayerDrawable(new Drawable[] {
            Drawables.THATCHED_BACKGROUND.createDrawable(context), bundle
        });
        getLayout().setBackgroundDrawable(bundle);
        bundle = new VideoView(context);
        bundle.setOnPreparedListener(new aw(this));
        bundle.setOnTouchListener(f);
        bundle.setOnCompletionListener(new ax(this, context, bundle));
        bundle.setOnErrorListener(new ay(this));
        bundle.setVideoPath(a.getDiskMediaFileUrl());
        d = bundle;
        d.requestFocus();
        bundle = new aq(context);
        bundle.a(new av(this, context));
        bundle.b(f);
        basevideoviewcontrollerlistener = a.getCustomCtaText();
        if (basevideoviewcontrollerlistener != null)
        {
            bundle.a(basevideoviewcontrollerlistener);
        }
        basevideoviewcontrollerlistener = a.getCustomSkipText();
        if (basevideoviewcontrollerlistener != null)
        {
            bundle.b(basevideoviewcontrollerlistener);
        }
        basevideoviewcontrollerlistener = a.getCustomCloseIconUrl();
        if (basevideoviewcontrollerlistener != null)
        {
            bundle.c(basevideoviewcontrollerlistener);
        }
        c = bundle;
        getLayout().addView(c);
        bundle = new RelativeLayout(context);
        bundle.setGravity(17);
        basevideoviewcontrollerlistener = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        basevideoviewcontrollerlistener.addRule(3, c.getId());
        getLayout().addView(bundle, basevideoviewcontrollerlistener);
        context = new ImageView(context);
        context.setVisibility(4);
        bundle.addView(context, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        e = context;
    }

    static List a(VastVideoViewController vastvideoviewcontroller, int i1, int j1)
    {
        return vastvideoviewcontroller.b(i1, j1);
    }

    static boolean a(int i1)
    {
        return i1 >= 16000;
    }

    static boolean a(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.k;
    }

    static VastVideoConfiguration b(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.a;
    }

    private List b(int i1, int j1)
    {
        boolean flag = false;
        boolean flag1;
        if (j1 > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (com.mopub.common.Preconditions.NoThrow.checkArgument(flag1))
        {
            float f1 = (float)i1 / (float)j1;
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = a.getAbsoluteTrackers();
            Object obj = new VastAbsoluteProgressTracker("", i1);
            j1 = arraylist1.size();
            for (i1 = 0; i1 < j1; i1++)
            {
                VastAbsoluteProgressTracker vastabsoluteprogresstracker = (VastAbsoluteProgressTracker)arraylist1.get(i1);
                if (vastabsoluteprogresstracker.compareTo(((VastAbsoluteProgressTracker) (obj))) > 0)
                {
                    break;
                }
                if (!vastabsoluteprogresstracker.isTracked())
                {
                    arraylist.add(vastabsoluteprogresstracker);
                }
            }

            arraylist1 = a.getFractionalTrackers();
            obj = new VastFractionalProgressTracker("", f1);
            j1 = arraylist1.size();
            for (i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
            {
                VastFractionalProgressTracker vastfractionalprogresstracker = (VastFractionalProgressTracker)arraylist1.get(i1);
                if (vastfractionalprogresstracker.compareTo(((VastFractionalProgressTracker) (obj))) > 0)
                {
                    break;
                }
                if (!vastfractionalprogresstracker.isTracked())
                {
                    arraylist.add(vastfractionalprogresstracker);
                }
            }

            return arraylist;
        } else
        {
            return Collections.emptyList();
        }
    }

    static VastCompanionAd c(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.b;
    }

    static VideoView d(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.d;
    }

    static boolean e(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.q;
    }

    static int f(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.j;
    }

    static aq g(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.c;
    }

    static boolean h(VastVideoViewController vastvideoviewcontroller)
    {
        return !vastvideoviewcontroller.k && vastvideoviewcontroller.d.getCurrentPosition() >= vastvideoviewcontroller.j;
    }

    private void i()
    {
        if (i)
        {
            i = false;
            g.removeCallbacks(h);
        }
    }

    static void i(VastVideoViewController vastvideoviewcontroller)
    {
        vastvideoviewcontroller.k = true;
        vastvideoviewcontroller.c.a();
    }

    static boolean j(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.i;
    }

    static Runnable k(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.h;
    }

    static Handler l(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.g;
    }

    static void m(VastVideoViewController vastvideoviewcontroller)
    {
        String s1;
        int i1;
        i1 = vastvideoviewcontroller.d.getDuration();
        if (i1 < 16000)
        {
            vastvideoviewcontroller.j = i1;
        }
        s1 = vastvideoviewcontroller.a.getSkipOffset();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        Integer integer;
        if (!Strings.isAbsoluteTracker(s1))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        integer = Strings.parseAbsoluteOffset(s1);
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        if (integer.intValue() < i1)
        {
            vastvideoviewcontroller.j = integer.intValue();
            vastvideoviewcontroller.q = true;
            return;
        }
        break MISSING_BLOCK_LABEL_156;
        int j1;
        if (!Strings.isPercentageTracker(s1))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        j1 = Math.round((Float.parseFloat(s1.replace("%", "")) / 100F) * (float)i1);
        if (j1 < i1)
        {
            try
            {
                vastvideoviewcontroller.j = j1;
                vastvideoviewcontroller.q = true;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (VastVideoViewController vastvideoviewcontroller)
            {
                MoPubLog.d(String.format("Failed to parse skipoffset %s", new Object[] {
                    s1
                }));
            }
            return;
        }
        break MISSING_BLOCK_LABEL_156;
        MoPubLog.d(String.format("Invalid VAST skipoffset format: %s", new Object[] {
            s1
        }));
    }

    static void n(VastVideoViewController vastvideoviewcontroller)
    {
        vastvideoviewcontroller.i();
    }

    static boolean o(VastVideoViewController vastvideoviewcontroller)
    {
        vastvideoviewcontroller.m = true;
        return true;
    }

    static boolean p(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.o;
    }

    static int q(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.b(0x7fffffff, 0x7fffffff).size();
    }

    static boolean r(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.p;
    }

    static boolean s(VastVideoViewController vastvideoviewcontroller)
    {
        vastvideoviewcontroller.p = true;
        return true;
    }

    static ImageView t(VastVideoViewController vastvideoviewcontroller)
    {
        return vastvideoviewcontroller.e;
    }

    static boolean u(VastVideoViewController vastvideoviewcontroller)
    {
        vastvideoviewcontroller.o = true;
        return true;
    }

    protected final void a()
    {
        super.a();
        az.a[a.getCustomForceOrientation().ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 106
    //                   2 119;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_119;
_L4:
        if (b != null)
        {
            try
            {
                org.apache.http.client.methods.HttpGet httpget = HttpClient.initializeHttpGet(b.getImageUrl(), g());
                AsyncTasks.safeExecuteOnExecutor(new DownloadTask(this), new HttpUriRequest[] {
                    httpget
                });
            }
            catch (Exception exception)
            {
                MoPubLog.d("Failed to download companion ad", exception);
            }
        }
        TrackingRequest.makeTrackingHttpRequest(a.getImpressionTrackers(), g(), com.mopub.common.event.BaseEvent.Name.IMPRESSION_REQUEST);
        a("com.mopub.action.interstitial.show");
        return;
_L2:
        f().onSetRequestedOrientation(1);
          goto _L4
        f().onSetRequestedOrientation(0);
          goto _L4
    }

    final void a(int i1, int j1)
    {
        if (i1 == 1 && j1 == -1)
        {
            f().onFinish();
        }
    }

    final void a(List list, String s1)
    {
        TrackingRequest.makeTrackingHttpRequest(list, g(), com.mopub.common.event.BaseEvent.Name.CLICK_REQUEST);
        if (TextUtils.isEmpty(s1))
        {
            return;
        }
        a("com.mopub.action.interstitial.click");
        if (Intents.isAboutScheme(s1))
        {
            MoPubLog.d("Link to about page ignored.");
            return;
        }
        if (Intents.isNativeBrowserScheme(s1))
        {
            try
            {
                list = Intents.intentForNativeBrowserScheme(s1);
                Intents.startActivity(g(), list);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                MoPubLog.d(list.getMessage());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                MoPubLog.d((new StringBuilder("Could not handle intent for URI: ")).append(s1).append(". ").append(list.getMessage()).toString());
            }
            return;
        }
        if (Intents.isHttpUrl(s1))
        {
            list = new Bundle();
            list.putString("URL", s1);
            f().onStartActivityForResult(com/mopub/common/MoPubBrowser, 1, list);
            return;
        } else
        {
            MoPubLog.d((new StringBuilder("Link ignored. Unable to handle url: ")).append(s1).toString());
            return;
        }
    }

    final boolean a(MediaPlayer mediaplayer, int i1, int j1)
    {
        if (!VersionCode.currentApiLevel().isBelow(VersionCode.JELLY_BEAN) || i1 != 1 || j1 != 0x80000000 || n > 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
        FileInputStream fileinputstream;
        mediaplayer.reset();
        fileinputstream = new FileInputStream(new File(a.getDiskMediaFileUrl()));
        mediaplayer.setDataSource(fileinputstream.getFD());
        mediaplayer.prepareAsync();
        d.start();
        Streams.closeStream(fileinputstream);
        n = n + 1;
        return true;
        mediaplayer;
        mediaplayer = null;
_L6:
        Streams.closeStream(mediaplayer);
        n = n + 1;
        return false;
        mediaplayer;
        fileinputstream = obj;
_L4:
        Streams.closeStream(fileinputstream);
        n = n + 1;
        throw mediaplayer;
_L2:
        return false;
        mediaplayer;
        if (true) goto _L4; else goto _L3
_L3:
        mediaplayer;
        mediaplayer = fileinputstream;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final VideoView b()
    {
        return d;
    }

    public boolean backButtonEnabled()
    {
        return k;
    }

    protected final void c()
    {
        i();
        l = d.getCurrentPosition();
        d.pause();
    }

    protected final void d()
    {
        n = 0;
        if (!i)
        {
            i = true;
            g.post(h);
        }
        d.seekTo(l);
        if (!m)
        {
            d.start();
        }
    }

    protected final void e()
    {
        i();
        a("com.mopub.action.interstitial.dismiss");
    }

    public void onComplete(String s1, DownloadResponse downloadresponse)
    {
        if (downloadresponse != null && downloadresponse.getStatusCode() == 200)
        {
            s1 = HttpResponses.asBitmap(downloadresponse);
            if (s1 != null)
            {
                int i1 = Dips.dipsToIntPixels(s1.getWidth(), g());
                int j1 = Dips.dipsToIntPixels(s1.getHeight(), g());
                int k1 = e.getMeasuredWidth();
                int l1 = e.getMeasuredHeight();
                if (i1 < k1 && j1 < l1)
                {
                    e.getLayoutParams().width = i1;
                    e.getLayoutParams().height = j1;
                }
                e.setImageBitmap(s1);
                e.setOnClickListener(new at(this));
            }
        }
    }
}
