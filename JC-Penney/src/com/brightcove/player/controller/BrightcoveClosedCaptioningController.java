// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.LoadCaptionsService;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            a, d, c, b

public class BrightcoveClosedCaptioningController extends AbstractComponent
{

    private static final String c = com/brightcove/player/controller/BrightcoveClosedCaptioningController.getSimpleName();
    protected Context a;
    protected EventListener b;
    private CaptioningManager d;
    private List e;
    private int f;
    private LoadCaptionsService g;
    private boolean h;
    private Video i;

    public BrightcoveClosedCaptioningController(BaseVideoView basevideoview, Context context)
    {
        super(basevideoview.getEventEmitter(), com/brightcove/player/controller/BrightcoveClosedCaptioningController);
        f = 0;
        b = new a(this);
        a = context;
        h = true;
        addListener("didSetVideo", b);
        g = new LoadCaptionsService(F, context.getContentResolver());
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            c();
        }
    }

    static int a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, int j)
    {
        brightcoveclosedcaptioningcontroller.f = j;
        return j;
    }

    static Pair a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, String s)
    {
        return brightcoveclosedcaptioningcontroller.a(s);
    }

    private Pair a(String s)
    {
label0:
        {
            Object obj = a(i);
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            Pair pair;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                pair = (Pair)((Iterator) (obj)).next();
            } while (!((BrightcoveCaptionFormat)pair.second).language().equals(s));
            return pair;
        }
        return null;
    }

    static Video a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.i;
    }

    static Video a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, Video video)
    {
        brightcoveclosedcaptioningcontroller.i = video;
        return video;
    }

    static String a()
    {
        return c;
    }

    static List a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, List list)
    {
        brightcoveclosedcaptioningcontroller.e = list;
        return list;
    }

    private List a(Video video)
    {
        video = ((Video) (video.getProperties().get("captionSources")));
        if (validateCaptionSourcesField(video))
        {
            return (List)video;
        } else
        {
            return null;
        }
    }

    private void a(SharedPreferences sharedpreferences, android.view.accessibility.CaptioningManager.CaptionStyle captionstyle)
    {
        sharedpreferences = sharedpreferences.edit();
        if (Color.alpha(captionstyle.windowColor) == 0)
        {
            sharedpreferences.putInt("captioning_window_color", 0);
            sharedpreferences.putInt("captioning_window_opacity", 0);
        } else
        {
            sharedpreferences.putInt("captioning_window_color", Color.rgb(Color.red(captionstyle.windowColor), Color.green(captionstyle.windowColor), Color.blue(captionstyle.windowColor)));
            sharedpreferences.putInt("captioning_window_opacity", Color.argb(Color.alpha(captionstyle.windowColor), 255, 255, 255));
        }
        sharedpreferences.putInt("captioning_foreground_opacity", Color.argb(Color.alpha(captionstyle.foregroundColor), 255, 255, 255));
        sharedpreferences.apply();
    }

    static List b(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.e;
    }

    static List b(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, Video video)
    {
        return brightcoveclosedcaptioningcontroller.a(video);
    }

    private void b()
    {
        Log.d(c, "Importing and saving caption settings from the system.");
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(a);
        android.view.accessibility.CaptioningManager.CaptionStyle captionstyle = d.getUserStyle();
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putInt("captioning_preset", -1);
        editor.putString("captioning_font_size", Float.toString(d.getFontScale()));
        editor.putInt("captioning_foreground_color", Color.rgb(Color.red(captionstyle.foregroundColor), Color.green(captionstyle.foregroundColor), Color.blue(captionstyle.foregroundColor)));
        editor.putInt("captioning_edge_type", captionstyle.edgeType).putInt("captioning_edge_color", captionstyle.edgeColor);
        if (Color.alpha(captionstyle.backgroundColor) == 0)
        {
            editor.putInt("captioning_background_color", 0);
            editor.putInt("captioning_background_opacity", 0);
        } else
        {
            editor.putInt("captioning_background_color", Color.rgb(Color.red(captionstyle.backgroundColor), Color.green(captionstyle.backgroundColor), Color.blue(captionstyle.backgroundColor)));
            editor.putInt("captioning_background_opacity", Color.argb(Color.alpha(captionstyle.backgroundColor), 255, 255, 255));
        }
        if (d.getLocale() != null)
        {
            editor.putString("captioning_locale", d.getLocale().getDisplayLanguage());
        }
        editor.apply();
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a(sharedpreferences, captionstyle);
        }
    }

    static LoadCaptionsService c(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.g;
    }

    private void c()
    {
        d = (CaptioningManager)a.getSystemService("captioning");
        if (d != null)
        {
            saveClosedCaptioningState(d.isEnabled());
        }
    }

    static boolean d(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.h;
    }

    static void e(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        brightcoveclosedcaptioningcontroller.b();
    }

    static EventEmitter f(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.F;
    }

    public boolean checkIfCaptionsExist(Video video)
    {
        if (video == null)
        {
            Log.e(c, "Got null video, cannot load captions.");
            return false;
        }
        video = ((Video) (video.getProperties().get("captionSources")));
        if (validateCaptionSourcesField(video))
        {
            video = (List)video;
            if (video != null && video.size() > 0)
            {
                return true;
            }
        }
        return false;
    }

    public LoadCaptionsService getLoadCaptionsService()
    {
        return g;
    }

    public boolean isCaptioningEnabled()
    {
        return PreferenceManager.getDefaultSharedPreferences(a).getBoolean("captions_master_switch", false);
    }

    public boolean readClosedCaptioningState()
    {
        return isCaptioningEnabled();
    }

    public void saveClosedCaptioningState(boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("boolean", Boolean.valueOf(flag));
        F.emit("toggleClosedCaptions", hashmap);
        PreferenceManager.getDefaultSharedPreferences(a).edit().putBoolean("captions_master_switch", flag).apply();
    }

    public void setShouldImportSystemSettings(boolean flag)
    {
        h = flag;
    }

    public void showCaptionsDialog()
    {
        CharSequence acharsequence[];
        acharsequence = new CharSequence[e.size() + 1];
        acharsequence[0] = a.getString(com.brightcove.player.R.string.color_none);
        for (int j = 0; j < e.size(); j++)
        {
            acharsequence[j + 1] = (new Locale((String)e.get(j))).getDisplayLanguage();
        }

        if (isCaptioningEnabled()) goto _L2; else goto _L1
_L1:
        f = 0;
_L4:
        (new android.app.AlertDialog.Builder(a)).setTitle(com.brightcove.player.R.string.caption_selection).setSingleChoiceItems(acharsequence, f, new d(this)).setPositiveButton(0x104000a, new c(this)).setNeutralButton(com.brightcove.player.R.string.settings, new b(this)).show();
        return;
_L2:
        String s = PreferenceManager.getDefaultSharedPreferences(a).getString("captioning_locale", Locale.getDefault().getDisplayLanguage());
        int k = 1;
        do
        {
            if (k < acharsequence.length)
            {
label0:
                {
                    if (!acharsequence[k].toString().equals(s))
                    {
                        break label0;
                    }
                    f = k;
                }
            }
            if (true)
            {
                continue;
            }
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean validateCaptionSourcesField(Object obj)
    {
        boolean flag = false;
        int k;
        if (obj instanceof List)
        {
            obj = ((List)obj).iterator();
            int j = 0;
            do
            {
                k = j;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                if (!(((Iterator) (obj)).next() instanceof Pair))
                {
                    j++;
                }
            } while (true);
        } else
        {
            k = 0;
        }
        if (k == 0)
        {
            flag = true;
        }
        return flag;
    }

}
