// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.ix;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzi, zzp, zzh

public class zzc extends zzi
    implements android.media.AudioManager.OnAudioFocusChangeListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.TextureView.SurfaceTextureListener
{

    private static final Map zzAb;
    private final com.google.android.gms.ads.internal.overlay.zzp zzAc;
    private int zzAd;
    private int zzAe;
    private MediaPlayer zzAf;
    private Uri zzAg;
    private int zzAh;
    private int zzAi;
    private int zzAj;
    private int zzAk;
    private int zzAl;
    private float zzAm;
    private boolean zzAn;
    private boolean zzAo;
    private int zzAp;
    private zzh zzAq;

    public zzc(Context context, com.google.android.gms.ads.internal.overlay.zzp zzp1)
    {
        super(context);
        zzAd = 0;
        zzAe = 0;
        zzAm = 1.0F;
        setSurfaceTextureListener(this);
        zzAc = zzp1;
        zzAc.zza(this);
    }

    static zzh zza(zzc zzc1)
    {
        return zzc1.zzAq;
    }

    private void zzb(float f)
    {
        if (zzAf != null)
        {
            try
            {
                zzAf.setVolume(f, f);
                return;
            }
            catch (IllegalStateException illegalstateexception)
            {
                return;
            }
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("AdVideoView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
    }

    private void zzel()
    {
        SurfaceTexture surfacetexture;
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView init MediaPlayer");
        surfacetexture = getSurfaceTexture();
        if (zzAg == null || surfacetexture == null)
        {
            return;
        }
        zzt(false);
        zzAf = new MediaPlayer();
        zzAf.setOnBufferingUpdateListener(this);
        zzAf.setOnCompletionListener(this);
        zzAf.setOnErrorListener(this);
        zzAf.setOnInfoListener(this);
        zzAf.setOnPreparedListener(this);
        zzAf.setOnVideoSizeChangedListener(this);
        zzAj = 0;
        zzAf.setDataSource(getContext(), zzAg);
        zzAf.setSurface(new Surface(surfacetexture));
        zzAf.setAudioStreamType(3);
        zzAf.setScreenOnWhilePlaying(true);
        zzAf.prepareAsync();
        zzt(1);
        return;
        Object obj;
        obj;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Failed to initialize MediaPlayer at ").append(zzAg).toString(), ((Throwable) (obj)));
        onError(zzAf, 1, 0);
        return;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void zzem()
    {
        if (zzep() && zzAf.getCurrentPosition() > 0 && zzAe != 3)
        {
            com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView nudging MediaPlayer");
            zzb(0.0F);
            zzAf.start();
            int i = zzAf.getCurrentPosition();
            for (long l = zzp.zzbB().a(); zzep() && zzAf.getCurrentPosition() == i && zzp.zzbB().a() - l <= 250L;) { }
            zzAf.pause();
            zzeu();
        }
    }

    private void zzen()
    {
label0:
        {
            AudioManager audiomanager = zzev();
            if (audiomanager != null && !zzAo)
            {
                if (audiomanager.requestAudioFocus(this, 3, 2) != 1)
                {
                    break label0;
                }
                zzes();
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("AdVideoView audio focus request failed");
    }

    private void zzeo()
    {
label0:
        {
            com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView abandon audio focus");
            AudioManager audiomanager = zzev();
            if (audiomanager != null && zzAo)
            {
                if (audiomanager.abandonAudioFocus(this) != 1)
                {
                    break label0;
                }
                zzAo = false;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("AdVideoView abandon audio focus failed");
    }

    private boolean zzep()
    {
        return zzAf != null && zzAd != -1 && zzAd != 0 && zzAd != 1;
    }

    private void zzes()
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView audio focus gained");
        zzAo = true;
        zzeu();
    }

    private void zzet()
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView audio focus lost");
        zzAo = false;
        zzeu();
    }

    private void zzeu()
    {
        if (!zzAn && zzAo)
        {
            zzb(zzAm);
            return;
        } else
        {
            zzb(0.0F);
            return;
        }
    }

    private AudioManager zzev()
    {
        return (AudioManager)getContext().getSystemService("audio");
    }

    private void zzt(int i)
    {
        if (i != 3) goto _L2; else goto _L1
_L1:
        zzAc.zzeY();
_L4:
        zzAd = i;
        return;
_L2:
        if (zzAd == 3 && i != 3)
        {
            zzAc.zzeZ();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void zzt(boolean flag)
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView release");
        if (zzAf != null)
        {
            zzAf.reset();
            zzAf.release();
            zzAf = null;
            zzt(0);
            if (flag)
            {
                zzAe = 0;
                zzu(0);
            }
            zzeo();
        }
    }

    private void zzu(int i)
    {
        zzAe = i;
    }

    public int getCurrentPosition()
    {
        if (zzep())
        {
            return zzAf.getCurrentPosition();
        } else
        {
            return 0;
        }
    }

    public int getDuration()
    {
        if (zzep())
        {
            return zzAf.getDuration();
        } else
        {
            return -1;
        }
    }

    public int getVideoHeight()
    {
        if (zzAf != null)
        {
            return zzAf.getVideoHeight();
        } else
        {
            return 0;
        }
    }

    public int getVideoWidth()
    {
        if (zzAf != null)
        {
            return zzAf.getVideoWidth();
        } else
        {
            return 0;
        }
    }

    public void onAudioFocusChange(int i)
    {
        if (i > 0)
        {
            zzes();
        } else
        if (i < 0)
        {
            zzet();
            return;
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        zzAj = i;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView completion");
        zzt(5);
        zzu(5);
        gw.a.post(new Runnable() {

            final zzc zzAr;

            public void run()
            {
                if (zzc.zza(zzAr) != null)
                {
                    zzc.zza(zzAr).zzeN();
                }
            }

            
            {
                zzAr = zzc.this;
                super();
            }
        });
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        mediaplayer = (String)zzAb.get(Integer.valueOf(i));
        String s = (String)zzAb.get(Integer.valueOf(j));
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("AdVideoView MediaPlayer error: ").append(mediaplayer).append(":").append(s).toString());
        zzt(-1);
        zzu(-1);
        gw.a.post(new Runnable(mediaplayer, s) {

            final zzc zzAr;
            final String zzAs;
            final String zzAt;

            public void run()
            {
                if (zzc.zza(zzAr) != null)
                {
                    zzc.zza(zzAr).zzh(zzAs, zzAt);
                }
            }

            
            {
                zzAr = zzc.this;
                zzAs = s;
                zzAt = s1;
                super();
            }
        });
        return true;
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        mediaplayer = (String)zzAb.get(Integer.valueOf(i));
        String s = (String)zzAb.get(Integer.valueOf(j));
        com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("AdVideoView MediaPlayer info: ").append(mediaplayer).append(":").append(s).toString());
        return true;
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int k1;
        i1 = getDefaultSize(zzAh, i);
        k1 = getDefaultSize(zzAi, j);
        l = k1;
        k = i1;
        if (zzAh <= 0) goto _L2; else goto _L1
_L1:
        l = k1;
        k = i1;
        if (zzAi <= 0) goto _L2; else goto _L3
_L3:
        int l1;
        k1 = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        l1 = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        if (k1 != 0x40000000 || l1 != 0x40000000) goto _L5; else goto _L4
_L4:
        if (zzAh * j < zzAi * i)
        {
            k = (zzAh * j) / zzAi;
            l = j;
        } else
        if (zzAh * j > zzAi * i)
        {
            l = (zzAi * i) / zzAh;
            k = i;
        } else
        {
            l = j;
            k = i;
        }
_L2:
        setMeasuredDimension(k, l);
        if (android.os.Build.VERSION.SDK_INT == 16)
        {
            if (zzAk > 0 && zzAk != k || zzAl > 0 && zzAl != l)
            {
                zzem();
            }
            zzAk = k;
            zzAl = l;
        }
        return;
_L5:
        if (k1 == 0x40000000)
        {
            l = (zzAi * i) / zzAh;
            int j1;
            if (l1 == 0x80000000 && l > j)
            {
                l = j;
                k = i;
            } else
            {
                k = i;
            }
        } else
        if (l1 == 0x40000000)
        {
            j1 = (zzAh * j) / zzAi;
            l = j;
            k = j1;
            if (k1 == 0x80000000)
            {
                l = j;
                k = j1;
                if (j1 > i)
                {
                    l = j;
                    k = i;
                }
            }
        } else
        {
            j1 = zzAh;
            k = zzAi;
            if (l1 == 0x80000000 && k > j)
            {
                j1 = (zzAh * j) / zzAi;
            } else
            {
                j = k;
            }
            l = j;
            k = j1;
            if (k1 == 0x80000000)
            {
                l = j;
                k = j1;
                if (j1 > i)
                {
                    l = (zzAi * i) / zzAh;
                    k = i;
                }
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView prepared");
        zzt(2);
        zzAc.zzeL();
        gw.a.post(new Runnable() {

            final zzc zzAr;

            public void run()
            {
                if (zzc.zza(zzAr) != null)
                {
                    zzc.zza(zzAr).zzeL();
                }
            }

            
            {
                zzAr = zzc.this;
                super();
            }
        });
        zzAh = mediaplayer.getVideoWidth();
        zzAi = mediaplayer.getVideoHeight();
        if (zzAp != 0)
        {
            seekTo(zzAp);
        }
        zzem();
        com.google.android.gms.ads.internal.util.client.zzb.zzaD((new StringBuilder()).append("AdVideoView stream dimensions: ").append(zzAh).append(" x ").append(zzAi).toString());
        if (zzAe == 3)
        {
            play();
        }
        zzen();
        zzeu();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView surface created");
        zzel();
        gw.a.post(new Runnable() {

            final zzc zzAr;

            public void run()
            {
                if (zzc.zza(zzAr) != null)
                {
                    zzc.zza(zzAr).zzeK();
                }
            }

            
            {
                zzAr = zzc.this;
                super();
            }
        });
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView surface destroyed");
        if (zzAf != null && zzAp == 0)
        {
            zzAp = zzAf.getCurrentPosition();
        }
        gw.a.post(new Runnable() {

            final zzc zzAr;

            public void run()
            {
                if (zzc.zza(zzAr) != null)
                {
                    zzc.zza(zzAr).onPaused();
                    zzc.zza(zzAr).zzeO();
                }
            }

            
            {
                zzAr = zzc.this;
                super();
            }
        });
        zzt(true);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        boolean flag1 = true;
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView surface changed");
        boolean flag;
        if (zzAe == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (zzAh == i && zzAi == j)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (zzAf != null && flag && i != 0)
        {
            if (zzAp != 0)
            {
                seekTo(zzAp);
            }
            play();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        zzAc.zzb(this);
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("AdVideoView size changed: ").append(i).append(" x ").append(j).toString());
        zzAh = mediaplayer.getVideoWidth();
        zzAi = mediaplayer.getVideoHeight();
        if (zzAh != 0 && zzAi != 0)
        {
            requestLayout();
        }
    }

    public void pause()
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView pause");
        if (zzep() && zzAf.isPlaying())
        {
            zzAf.pause();
            zzt(4);
            gw.a.post(new Runnable() {

                final zzc zzAr;

                public void run()
                {
                    if (zzc.zza(zzAr) != null)
                    {
                        zzc.zza(zzAr).onPaused();
                    }
                }

            
            {
                zzAr = zzc.this;
                super();
            }
            });
        }
        zzu(4);
    }

    public void play()
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView play");
        if (zzep())
        {
            zzAf.start();
            zzt(3);
            gw.a.post(new Runnable() {

                final zzc zzAr;

                public void run()
                {
                    if (zzc.zza(zzAr) != null)
                    {
                        zzc.zza(zzAr).zzeM();
                    }
                }

            
            {
                zzAr = zzc.this;
                super();
            }
            });
        }
        zzu(3);
    }

    public void seekTo(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("AdVideoView seek ").append(i).toString());
        if (zzep())
        {
            zzAf.seekTo(i);
            zzAp = 0;
            return;
        } else
        {
            zzAp = i;
            return;
        }
    }

    public void setMimeType(String s)
    {
    }

    public void setVideoPath(String s)
    {
        setVideoURI(Uri.parse(s));
    }

    public void setVideoURI(Uri uri)
    {
        zzAg = uri;
        zzAp = 0;
        zzel();
        requestLayout();
        invalidate();
    }

    public void stop()
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("AdVideoView stop");
        if (zzAf != null)
        {
            zzAf.stop();
            zzAf.release();
            zzAf = null;
            zzt(0);
            zzu(0);
            zzeo();
        }
        zzAc.onStop();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).toString();
    }

    public void zza(float f)
    {
        zzAm = f;
        zzeu();
    }

    public void zza(zzh zzh)
    {
        zzAq = zzh;
    }

    public String zzek()
    {
        return "MediaPlayer";
    }

    public void zzeq()
    {
        zzAn = true;
        zzeu();
    }

    public void zzer()
    {
        zzAn = false;
        zzeu();
    }

    static 
    {
        zzAb = new HashMap();
        zzAb.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
        zzAb.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
        zzAb.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
        zzAb.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
        zzAb.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        zzAb.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        zzAb.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        zzAb.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzAb.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        zzAb.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        zzAb.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        zzAb.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        zzAb.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        zzAb.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        zzAb.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        zzAb.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }
}
