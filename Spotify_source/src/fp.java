// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class fp
    implements fo
{

    private final Object a;
    private final android.support.v4.media.session.MediaSessionCompat.Token b;

    public fp(Context context, String s)
    {
        a = new MediaSession(context, s);
        b = new android.support.v4.media.session.MediaSessionCompat.Token(((MediaSession)a).getSessionToken());
    }

    public fp(Object obj)
    {
        if (obj instanceof MediaSession)
        {
            a = obj;
            b = new android.support.v4.media.session.MediaSessionCompat.Token(((MediaSession)a).getSessionToken());
            return;
        } else
        {
            throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
        }
    }

    public final void a()
    {
        ((MediaSession)a).setFlags(3);
    }

    public final void a(int i)
    {
        Object obj = a;
        android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((MediaSession)obj).setPlaybackToLocal(builder.build());
    }

    public final void a(PendingIntent pendingintent)
    {
        ((MediaSession)a).setMediaButtonReceiver(pendingintent);
    }

    public final void a(Bundle bundle)
    {
        ((MediaSession)a).setExtras(bundle);
    }

    public final void a(MediaMetadataCompat mediametadatacompat)
    {
        Object obj1 = a;
        if (mediametadatacompat != null) goto _L2; else goto _L1
_L1:
        mediametadatacompat = null;
_L26:
        ((MediaSession)obj1).setMetadata((MediaMetadata)mediametadatacompat);
        return;
_L2:
        android.media.MediaMetadata.Builder builder;
        Iterator iterator;
        if (mediametadatacompat.c != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.c));
            continue; /* Loop/switch isn't completed */
        }
        builder = new android.media.MediaMetadata.Builder();
        iterator = mediametadatacompat.b.keySet().iterator();
_L24:
        Object obj;
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        obj = (Integer)MediaMetadataCompat.a.get(s);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Integer) (obj)).intValue();
        JVM INSTR tableswitch 0 3: default 144
    //                   0 147
    //                   1 495
    //                   2 171
    //                   3 193;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        long l = mediametadatacompat.c(s);
        ((android.media.MediaMetadata.Builder)builder).putLong(s, l);
        break; /* Loop/switch isn't completed */
_L6:
        obj = mediametadatacompat.e(s);
        ((android.media.MediaMetadata.Builder)builder).putBitmap(s, ((android.graphics.Bitmap) (obj)));
        break; /* Loop/switch isn't completed */
_L7:
        obj = mediametadatacompat.d(s);
        if (((RatingCompat) (obj)).c == null && android.os.Build.VERSION.SDK_INT >= 21) goto _L9; else goto _L8
_L8:
        obj = ((RatingCompat) (obj)).c;
_L17:
        ((android.media.MediaMetadata.Builder)builder).putRating(s, (Rating)obj);
        break; /* Loop/switch isn't completed */
_L9:
        if (!((RatingCompat) (obj)).a()) goto _L11; else goto _L10
_L10:
        ((RatingCompat) (obj)).a;
        JVM INSTR tableswitch 1 6: default 288
    //                   1 293
    //                   2 336
    //                   3 374
    //                   4 374
    //                   5 374
    //                   6 443;
           goto _L12 _L13 _L14 _L15 _L15 _L15 _L16
_L12:
        obj = null;
          goto _L17
_L13:
        boolean flag;
        if (((RatingCompat) (obj)).a == 1 && ((RatingCompat) (obj)).b == 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.c = Rating.newHeartRating(flag);
_L18:
        obj = ((RatingCompat) (obj)).c;
          goto _L17
_L14:
        boolean flag1;
        if (((RatingCompat) (obj)).a == 2 && ((RatingCompat) (obj)).b == 1.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj.c = Rating.newThumbRating(flag1);
          goto _L18
_L15:
        int i = ((RatingCompat) (obj)).a;
        ((RatingCompat) (obj)).a;
        JVM INSTR tableswitch 3 5: default 412
    //                   3 428
    //                   4 428
    //                   5 428;
           goto _L19 _L20 _L20 _L20
_L19:
        float f1 = -1F;
_L22:
        obj.c = Rating.newStarRating(i, f1);
          goto _L18
_L20:
        if (!((RatingCompat) (obj)).a()) goto _L19; else goto _L21
_L21:
        f1 = ((RatingCompat) (obj)).b;
          goto _L22
_L16:
        float f2;
        if (((RatingCompat) (obj)).a != 6 || !((RatingCompat) (obj)).a())
        {
            f2 = -1F;
        } else
        {
            f2 = ((RatingCompat) (obj)).b;
        }
        obj.c = Rating.newPercentageRating(f2);
          goto _L12
_L11:
        obj.c = Rating.newUnratedRating(((RatingCompat) (obj)).a);
          goto _L18
_L5:
        CharSequence charsequence = mediametadatacompat.a(s);
        ((android.media.MediaMetadata.Builder)builder).putText(s, charsequence);
        if (true) goto _L24; else goto _L23
_L23:
        mediametadatacompat.c = ((android.media.MediaMetadata.Builder)builder).build();
        mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.c));
        if (true) goto _L26; else goto _L25
_L25:
    }

    public final void a(PlaybackStateCompat playbackstatecompat)
    {
        Object obj1 = a;
        if (playbackstatecompat == null)
        {
            playbackstatecompat = null;
        } else
        if (playbackstatecompat.k != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            playbackstatecompat = ((PlaybackStateCompat) (playbackstatecompat.k));
        } else
        {
            Object obj = null;
            if (playbackstatecompat.h != null)
            {
                ArrayList arraylist = new ArrayList(playbackstatecompat.h.size());
                Iterator iterator = playbackstatecompat.h.iterator();
                do
                {
                    obj = arraylist;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    obj = (android.support.v4.media.session.PlaybackStateCompat.CustomAction)iterator.next();
                    if (((android.support.v4.media.session.PlaybackStateCompat.CustomAction) (obj)).e != null || android.os.Build.VERSION.SDK_INT < 21)
                    {
                        obj = ((android.support.v4.media.session.PlaybackStateCompat.CustomAction) (obj)).e;
                    } else
                    {
                        Object obj2 = ((android.support.v4.media.session.PlaybackStateCompat.CustomAction) (obj)).a;
                        CharSequence charsequence = ((android.support.v4.media.session.PlaybackStateCompat.CustomAction) (obj)).b;
                        int i = ((android.support.v4.media.session.PlaybackStateCompat.CustomAction) (obj)).c;
                        Bundle bundle = ((android.support.v4.media.session.PlaybackStateCompat.CustomAction) (obj)).d;
                        obj2 = new android.media.session.PlaybackState.CustomAction.Builder(((String) (obj2)), charsequence, i);
                        ((android.media.session.PlaybackState.CustomAction.Builder) (obj2)).setExtras(bundle);
                        obj.e = ((android.media.session.PlaybackState.CustomAction.Builder) (obj2)).build();
                        obj = ((android.support.v4.media.session.PlaybackStateCompat.CustomAction) (obj)).e;
                    }
                    arraylist.add(obj);
                } while (true);
            }
            if (android.os.Build.VERSION.SDK_INT >= 22)
            {
                playbackstatecompat.k = gk.a(playbackstatecompat.a, playbackstatecompat.b, playbackstatecompat.c, playbackstatecompat.d, playbackstatecompat.e, playbackstatecompat.f, playbackstatecompat.g, ((List) (obj)), playbackstatecompat.i, playbackstatecompat.j);
            } else
            {
                playbackstatecompat.k = gj.a(playbackstatecompat.a, playbackstatecompat.b, playbackstatecompat.c, playbackstatecompat.d, playbackstatecompat.e, playbackstatecompat.f, playbackstatecompat.g, ((List) (obj)), playbackstatecompat.i);
            }
            playbackstatecompat = ((PlaybackStateCompat) (playbackstatecompat.k));
        }
        ((MediaSession)obj1).setPlaybackState((PlaybackState)playbackstatecompat);
    }

    public final void a(ek ek1)
    {
        Object obj = a;
        ek1 = ((ek) (ek1.a()));
        ((MediaSession)obj).setPlaybackToRemote((VolumeProvider)ek1);
    }

    public final void a(fl fl1, Handler handler)
    {
        Object obj = a;
        if (fl1 == null)
        {
            fl1 = null;
        } else
        {
            fl1 = ((fl) (fl1.a));
        }
        ((MediaSession)obj).setCallback((android.media.session.MediaSession.Callback)fl1, handler);
    }

    public final void a(boolean flag)
    {
        ((MediaSession)a).setActive(flag);
    }

    public final boolean b()
    {
        return ((MediaSession)a).isActive();
    }

    public final void c()
    {
        ((MediaSession)a).release();
    }

    public final android.support.v4.media.session.MediaSessionCompat.Token d()
    {
        return b;
    }

    public final Object e()
    {
        return a;
    }

    public final Object f()
    {
        return null;
    }
}
