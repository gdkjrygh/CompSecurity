// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.IBinder;
import android.speech.tts.TextToSpeech;
import com.fitbit.e.a;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import java.util.Queue;

// Referenced classes of package com.fitbit.runtrack:
//            h

public class SpeechService extends Service
    implements android.speech.tts.TextToSpeech.OnInitListener, Observer
{

    private static final String b = "locale";
    private static final String c = "utterance";
    private static final String d = "stream";
    private static final String e = "volume";
    private TextToSpeech a;
    private Queue f;
    private boolean g;

    public SpeechService()
    {
    }

    public static Intent a(Context context, Locale locale, String s, int i, float f1)
    {
        context = new Intent(context, com/fitbit/runtrack/SpeechService);
        context.putExtra("locale", locale);
        context.putExtra("utterance", s);
        context.putExtra("stream", i);
        context.putExtra("volume", f1);
        return context;
    }

    public void a(Intent intent)
    {
        String s = intent.getStringExtra("utterance");
        Locale locale = (Locale)intent.getSerializableExtra("locale");
        int i = intent.getIntExtra("stream", 0x80000000);
        float f1 = intent.getFloatExtra("volume", 0.75F);
        com.fitbit.e.a.d("SpeechService", "waiting for audioFocus", new Object[0]);
        a.setLanguage(locale);
        intent = new h(a, s);
        intent.a(i);
        intent.a(f1);
        intent.addObserver(new Observer() {

            final SpeechService a;

            public void update(Observable observable, Object obj)
            {
                observable = (h)observable;
                ((AudioManager)a.getSystemService("audio")).abandonAudioFocus(observable);
                observable.deleteObservers();
            }

            
            {
                a = SpeechService.this;
                super();
            }
        });
        if (((AudioManager)getSystemService("audio")).requestAudioFocus(intent, i, 3) == 1)
        {
            a.setOnUtteranceCompletedListener(intent);
            intent.a();
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        f = new LinkedList();
        g = false;
        a = new TextToSpeech(this, this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        a.shutdown();
    }

    public void onInit(int i)
    {
        g = true;
        if (-1 == i || -1 == i || i == -2)
        {
            stopSelf();
            f.clear();
        } else
        {
            while (!f.isEmpty()) 
            {
                a((Intent)f.remove());
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (!g || a.isSpeaking()) goto _L2; else goto _L1
_L1:
        a(intent);
_L4:
        return 2;
_L2:
        if (!a.isSpeaking())
        {
            f.add(intent);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void update(Observable observable, Object obj)
    {
        if (!(observable instanceof h));
    }
}
