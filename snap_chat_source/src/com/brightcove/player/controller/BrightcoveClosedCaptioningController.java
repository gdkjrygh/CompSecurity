// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.BrightcoveCaptionPropertiesActivity;
import com.brightcove.player.captioning.LoadCaptionsService;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import com.brightcove.player.view.BaseVideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class BrightcoveClosedCaptioningController extends AbstractComponent
{

    private static final String b = com/brightcove/player/controller/BrightcoveClosedCaptioningController.getSimpleName();
    protected Context a;
    private CaptioningManager c;
    private int d;
    private LoadCaptionsService e;
    private boolean f;
    private Video g;
    private EventListener h;

    public BrightcoveClosedCaptioningController(BaseVideoView basevideoview, Context context)
    {
        super(basevideoview.getEventEmitter(), com/brightcove/player/controller/BrightcoveClosedCaptioningController);
        d = 0;
        h = new EventListener() {

            private BrightcoveClosedCaptioningController a;

            public final void processEvent(Event event)
            {
label0:
                {
                    BrightcoveClosedCaptioningController.a(a, (Video)event.properties.get("video"));
                    event = PreferenceManager.getDefaultSharedPreferences(a.a).getString("captioning_locale", Locale.getDefault().getLanguage());
                    Object obj = BrightcoveClosedCaptioningController.b(a, BrightcoveClosedCaptioningController.a(a));
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
                    } while (pair.first == null || !((BrightcoveCaptionFormat)pair.second).language().equals(event));
                    BrightcoveClosedCaptioningController.b(a).loadCaptions((Uri)pair.first, ((BrightcoveCaptionFormat)pair.second).type());
                }
                if (android.os.Build.VERSION.SDK_INT >= 19 && BrightcoveClosedCaptioningController.c(a))
                {
                    BrightcoveClosedCaptioningController.d(a);
                }
            }

            
            {
                a = BrightcoveClosedCaptioningController.this;
                super();
            }
        };
        a = context;
        f = true;
        addListener("didSetVideo", h);
        e = new LoadCaptionsService(eventEmitter, context.getContentResolver());
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            c = (CaptioningManager)a.getSystemService("captioning");
            if (c != null)
            {
                saveClosedCaptioningState(c.isEnabled());
            }
        }
    }

    static int a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, int i)
    {
        brightcoveclosedcaptioningcontroller.d = i;
        return i;
    }

    static Pair a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, String s)
    {
label0:
        {
            brightcoveclosedcaptioningcontroller = brightcoveclosedcaptioningcontroller.a(brightcoveclosedcaptioningcontroller.g);
            if (brightcoveclosedcaptioningcontroller == null)
            {
                break label0;
            }
            brightcoveclosedcaptioningcontroller = brightcoveclosedcaptioningcontroller.iterator();
            Pair pair;
            do
            {
                if (!brightcoveclosedcaptioningcontroller.hasNext())
                {
                    break label0;
                }
                pair = (Pair)brightcoveclosedcaptioningcontroller.next();
            } while (!((BrightcoveCaptionFormat)pair.second).language().equals(s));
            return pair;
        }
        return null;
    }

    static Video a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.g;
    }

    static Video a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, Video video)
    {
        brightcoveclosedcaptioningcontroller.g = video;
        return video;
    }

    static String a()
    {
        return b;
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

    static LoadCaptionsService b(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.e;
    }

    static List b(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, Video video)
    {
        return brightcoveclosedcaptioningcontroller.a(video);
    }

    static boolean c(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.f;
    }

    static void d(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(brightcoveclosedcaptioningcontroller.a);
        android.view.accessibility.CaptioningManager.CaptionStyle captionstyle = brightcoveclosedcaptioningcontroller.c.getUserStyle();
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putInt("captioning_preset", -1);
        editor.putString("captioning_font_size", Float.toString(brightcoveclosedcaptioningcontroller.c.getFontScale()));
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
        if (brightcoveclosedcaptioningcontroller.c.getLocale() != null)
        {
            editor.putString("captioning_locale", brightcoveclosedcaptioningcontroller.c.getLocale().getDisplayLanguage());
        }
        editor.apply();
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            brightcoveclosedcaptioningcontroller = sharedpreferences.edit();
            if (Color.alpha(captionstyle.windowColor) == 0)
            {
                brightcoveclosedcaptioningcontroller.putInt("captioning_window_color", 0);
                brightcoveclosedcaptioningcontroller.putInt("captioning_window_opacity", 0);
            } else
            {
                brightcoveclosedcaptioningcontroller.putInt("captioning_window_color", Color.rgb(Color.red(captionstyle.windowColor), Color.green(captionstyle.windowColor), Color.blue(captionstyle.windowColor)));
                brightcoveclosedcaptioningcontroller.putInt("captioning_window_opacity", Color.argb(Color.alpha(captionstyle.windowColor), 255, 255, 255));
            }
            brightcoveclosedcaptioningcontroller.putInt("captioning_foreground_opacity", Color.argb(Color.alpha(captionstyle.foregroundColor), 255, 255, 255));
            brightcoveclosedcaptioningcontroller.apply();
        }
    }

    static EventEmitter e(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.eventEmitter;
    }

    static EventEmitter f(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.eventEmitter;
    }

    static EventEmitter g(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        return brightcoveclosedcaptioningcontroller.eventEmitter;
    }

    public boolean checkIfCaptionsExist(Video video)
    {
        if (video == null)
        {
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
        return e;
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
        eventEmitter.emit("toggleClosedCaptions", hashmap);
        PreferenceManager.getDefaultSharedPreferences(a).edit().putBoolean("captions_master_switch", flag).apply();
    }

    public void setShouldImportSystemSettings(boolean flag)
    {
        f = flag;
    }

    public void showCaptionsDialog()
    {
        ArrayList arraylist;
        CharSequence acharsequence[];
        arraylist = new ArrayList();
        Iterator iterator = a(g).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Pair pair = (Pair)iterator.next();
            if (pair.second != null)
            {
                arraylist.add(((BrightcoveCaptionFormat)pair.second).language());
            }
        } while (true);
        acharsequence = new CharSequence[arraylist.size() + 1];
        acharsequence[0] = a.getString(com.brightcove.player.R.string.color_none);
        for (int i = 0; i < arraylist.size(); i++)
        {
            acharsequence[i + 1] = (new Locale((String)arraylist.get(i))).getDisplayLanguage();
        }

        if (isCaptioningEnabled()) goto _L2; else goto _L1
_L1:
        d = 0;
_L4:
        (new android.app.AlertDialog.Builder(a)).setTitle(com.brightcove.player.R.string.brightcove_caption_selection).setSingleChoiceItems(acharsequence, d, new android.content.DialogInterface.OnClickListener(arraylist) {

            private List a;
            private BrightcoveClosedCaptioningController b;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                BrightcoveClosedCaptioningController.a(b, k);
                if (k == 0)
                {
                    b.saveClosedCaptioningState(false);
                } else
                {
                    b.saveClosedCaptioningState(true);
                    dialoginterface = (String)a.get(k - 1);
                    PreferenceManager.getDefaultSharedPreferences(b.a).edit().putString("captioning_locale", dialoginterface).apply();
                    if (BrightcoveClosedCaptioningController.b(b) != null)
                    {
                        dialoginterface = BrightcoveClosedCaptioningController.a(b, dialoginterface);
                        if (((Pair) (dialoginterface)).first != null)
                        {
                            BrightcoveClosedCaptioningController.b(b).loadCaptions((Uri)((Pair) (dialoginterface)).first, ((BrightcoveCaptionFormat)((Pair) (dialoginterface)).second).type());
                            return;
                        } else
                        {
                            dialoginterface = new HashMap();
                            dialoginterface.put("boolean", Boolean.valueOf(true));
                            BrightcoveClosedCaptioningController.g(b).emit("toggleClosedCaptions", dialoginterface);
                            return;
                        }
                    }
                }
            }

            
            {
                b = BrightcoveClosedCaptioningController.this;
                a = list;
                super();
            }
        }).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            private BrightcoveClosedCaptioningController a;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                BrightcoveClosedCaptioningController.f(a).emit("captionsDialogOk");
                dialoginterface.dismiss();
            }

            
            {
                a = BrightcoveClosedCaptioningController.this;
                super();
            }
        }).setNeutralButton(com.brightcove.player.R.string.brightcove_settings, new android.content.DialogInterface.OnClickListener() {

            private BrightcoveClosedCaptioningController a;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                BrightcoveClosedCaptioningController.a();
                a.a.startActivity(new Intent(a.a, com/brightcove/player/captioning/BrightcoveCaptionPropertiesActivity));
                BrightcoveClosedCaptioningController.e(a).emit("captionsDialogSettings");
            }

            
            {
                a = BrightcoveClosedCaptioningController.this;
                super();
            }
        }).show();
        return;
_L2:
        String s = PreferenceManager.getDefaultSharedPreferences(a).getString("captioning_locale", Locale.getDefault().getDisplayLanguage());
        int j = 1;
        do
        {
            if (j < acharsequence.length)
            {
label0:
                {
                    if (!acharsequence[j].toString().equals(s))
                    {
                        break label0;
                    }
                    d = j;
                }
            }
            if (true)
            {
                continue;
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean validateCaptionSourcesField(Object obj)
    {
        boolean flag = false;
        int j;
        if (obj instanceof List)
        {
            obj = ((List)obj).iterator();
            int i = 0;
            do
            {
                j = i;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                if (!(((Iterator) (obj)).next() instanceof Pair))
                {
                    i++;
                }
            } while (true);
        } else
        {
            j = 0;
        }
        if (j == 0)
        {
            flag = true;
        }
        return flag;
    }

}
