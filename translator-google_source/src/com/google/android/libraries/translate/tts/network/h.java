// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.media.MediaPlayer;
import android.text.TextUtils;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.languages.Language;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.tts.network:
//            a

public abstract class h extends k
    implements android.media.MediaPlayer.OnPreparedListener
{

    private final List a = new ArrayList();
    private final List b;
    private final Language c;
    private final String d;
    private final a e;
    private int g;
    private int h;

    public h(List list, Language language, String s, a a1)
    {
        g = 0;
        h = -1;
        b = new ArrayList(list);
        c = language;
        e = a1;
        d = s;
    }

    private transient Void b()
    {
        Iterator iterator;
        int j;
        j = b.size();
        iterator = b.iterator();
        int i = 0;
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        s = (String)iterator.next();
        if (isCancelled())
        {
            return null;
        }
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        publishProgress(new File[] {
            e.a(s, c, d, j, i)
        });
        i++;
          goto _L2
        Object obj;
        obj;
        h = 1;
        return null;
        obj;
        h = 0;
        return null;
    }

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            MediaPlayer mediaplayer = (MediaPlayer)iterator.next();
            try
            {
                mediaplayer.release();
            }
            catch (IllegalStateException illegalstateexception) { }
        }

        g = 0;
    }

    public abstract void a(int i);

    public abstract void a(List list);

    protected Object doInBackground(Object aobj[])
    {
        return b();
    }

    protected final void onCancelled()
    {
        a();
        if (h != -1)
        {
            a(h);
        }
    }

    protected void onPostExecute(Object obj)
    {
        if (h != -1)
        {
            a();
            a(h);
        }
        a.size();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        g = g + 1;
        if (g == b.size())
        {
            a(a);
        }
    }

    protected void onProgressUpdate(Object aobj[])
    {
        aobj = ((File[])aobj)[0];
        ((File) (aobj)).getName();
        try
        {
            aobj = new FileInputStream(((File) (aobj)));
            MediaPlayer mediaplayer = new MediaPlayer();
            a.add(mediaplayer);
            mediaplayer.setOnPreparedListener(this);
            mediaplayer.setAudioStreamType(3);
            mediaplayer.setDataSource(((FileInputStream) (aobj)).getFD());
            mediaplayer.prepareAsync();
            ((FileInputStream) (aobj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[]) { }
        if (!cancel(true))
        {
            a();
        }
        a(0);
    }
}
