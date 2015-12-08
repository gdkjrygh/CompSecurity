// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.ThumbnailUtils;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.AppendTrack;
import com.googlecode.mp4parser.authoring.tracks.CroppedTrack;
import com.googlecode.mp4parser.util.Path;
import com.kik.sdkutils.y;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kik.a.e.i;
import kik.a.e.v;
import kik.android.VideoContentProvider;
import kik.android.chat.KikApplication;
import kik.android.widget.GalleryWidget;

// Referenced classes of package kik.android.util:
//            bx, ak

public final class ct
{

    private static StringBuilder a;
    private static Formatter b;

    private static double a(Track track, double d, boolean flag)
    {
        double ad[] = new double[track.getSyncSamples().length];
        long l1 = 0L;
        double d1 = 0.0D;
        for (int j = 0; j < track.getSampleDurations().length; j++)
        {
            long l2 = track.getSampleDurations()[j];
            if (Arrays.binarySearch(track.getSyncSamples(), 1L + l1) >= 0)
            {
                ad[Arrays.binarySearch(track.getSyncSamples(), 1L + l1)] = d1;
            }
            d1 += (double)l2 / (double)track.getTrackMetaData().getTimescale();
            l1++;
        }

        d1 = 0.0D;
        int l = ad.length;
        for (int k = 0; k < l;)
        {
            double d2 = ad[k];
            if (d2 > d)
            {
                if (flag)
                {
                    return d2;
                } else
                {
                    return d1;
                }
            }
            k++;
            d1 = d2;
        }

        return ad[l - 1];
    }

    public static int a(MediaMetadataRetriever mediametadataretriever, int j)
    {
        mediametadataretriever = mediametadataretriever.extractMetadata(j);
        try
        {
            j = Integer.parseInt(mediametadataretriever);
        }
        // Misplaced declaration of an exception variable
        catch (MediaMetadataRetriever mediametadataretriever)
        {
            return -1;
        }
        return j;
    }

    public static long a(Context context, Uri uri)
    {
        if (uri != null)
        {
            if (y.a(10))
            {
                MediaMetadataRetriever mediametadataretriever = new MediaMetadataRetriever();
                long l;
                try
                {
                    mediametadataretriever.setDataSource(context, uri);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return -1L;
                }
                l = b(mediametadataretriever, 9);
                mediametadataretriever.release();
                return l;
            }
            context = MediaPlayer.create(context, uri);
            if (context != null)
            {
                l = context.getDuration();
                context.release();
                return l;
            }
        }
        return -1L;
    }

    private static Bitmap a(int j, int k)
    {
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(j, k, android.graphics.Bitmap.Config.RGB_565);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            return null;
        }
        return bitmap;
    }

    public static Bitmap a(Context context, String s)
    {
        int k;
        k = 96;
        if (s == null)
        {
            return null;
        }
        if (!y.a(10)) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        MediaMetadataRetriever mediametadataretriever = new MediaMetadataRetriever();
        Bitmap bitmap;
        try
        {
            mediametadataretriever.setDataSource(context, VideoContentProvider.a(s));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            bx.a(context);
            return a(s, true);
        }
        bitmap = a(mediametadataretriever);
        context = bitmap;
        if (bitmap == null)
        {
            context = a(s, false);
        }
        s = context;
        if (context != null) goto _L4; else goto _L3
_L3:
        if (!y.a(14))
        {
            break MISSING_BLOCK_LABEL_157;
        }
        j = a(mediametadataretriever, 19);
        l = a(mediametadataretriever, 18);
        if (j <= l) goto _L6; else goto _L5
_L5:
        j = (l * 96) / j;
_L7:
        s = a(j, k);
_L4:
        mediametadataretriever.release();
        return s;
_L6:
        k = (j * 96) / l;
        j = 96;
          goto _L7
        s;
        bx.a(s);
        s = context;
          goto _L4
_L2:
        return a(s, true);
        j = 96;
          goto _L7
    }

    private static Bitmap a(MediaMetadataRetriever mediametadataretriever)
    {
        try
        {
            mediametadataretriever = mediametadataretriever.getFrameAtTime(0L);
        }
        // Misplaced declaration of an exception variable
        catch (MediaMetadataRetriever mediametadataretriever)
        {
            return null;
        }
        return mediametadataretriever;
    }

    private static Bitmap a(String s, boolean flag)
    {
        Object obj = null;
        try
        {
            s = ThumbnailUtils.createVideoThumbnail(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bx.a(s);
            s = ((String) (obj));
        }
        obj = s;
        if (s == null)
        {
            obj = s;
            if (flag)
            {
                try
                {
                    obj = a(96, 96);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    bx.a(outofmemoryerror);
                    return s;
                }
            }
        }
        return ((Bitmap) (obj));
    }

    public static String a(int j)
    {
        j /= 1000;
        int k = j % 60;
        int l = (j / 60) % 60;
        int i1 = j / 3600;
        j = k;
        if (k == 0)
        {
            j = k;
            if (l == 0)
            {
                j = k;
                if (i1 == 0)
                {
                    j = k + 1;
                }
            }
        }
        a.setLength(0);
        if (i1 > 0)
        {
            return b.format("%d:%02d:%02d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(l), Integer.valueOf(j)
            }).toString();
        } else
        {
            return b.format("%d:%02d", new Object[] {
                Integer.valueOf(l), Integer.valueOf(j)
            }).toString();
        }
    }

    public static String a(String s, String s1, float f, float f1)
    {
        Object obj;
        s = MovieCreator.build(s);
        obj = s.getTracks();
        s.setTracks(new LinkedList());
        double d;
        double d1;
        boolean flag;
        d1 = f;
        d = (double)f1 - 1.0D;
        flag = false;
        Iterator iterator = ((List) (obj)).iterator();
_L11:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Track track = (Track)iterator.next();
        if (track.getSyncSamples() == null || track.getSyncSamples().length <= 0) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            double d2;
            double d3;
            double d4;
            Object obj1;
            int j;
            long l;
            long l1;
            long l2;
            long l3;
            long l4;
            long l5;
            try
            {
                throw new RuntimeException("The startTime has already been corrected by another track with SyncSample. Not Supported.");
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            bx.a(s);
            return null;
        }
        d2 = a(track, d1, false);
        d1 = a(track, d, true);
        flag = true;
        d = d2;
          goto _L5
_L2:
        obj = ((List) (obj)).iterator();
_L10:
        if (!((Iterator) (obj)).hasNext()) goto _L7; else goto _L6
_L6:
        obj1 = (Track)((Iterator) (obj)).next();
        d2 = 0.0D;
        l3 = -1L;
        l1 = -1L;
        j = 0;
        l = 0L;
        d3 = -1D;
_L9:
        if (j < ((Track) (obj1)).getSampleDurations().length)
        {
            l5 = ((Track) (obj1)).getSampleDurations()[j];
            break MISSING_BLOCK_LABEL_219;
        }
          goto _L8
_L12:
        d3 = (double)l5 / (double)((Track) (obj1)).getTrackMetaData().getTimescale();
        l++;
        j++;
        d4 = d3 + d2;
        l3 = l2;
        l1 = l4;
        d3 = d2;
        d2 = d4;
          goto _L9
_L8:
        s.addTrack(new AppendTrack(new Track[] {
            new CroppedTrack(((Track) (obj1)), l3, l1)
        }));
          goto _L10
_L7:
        s = (new DefaultMp4Builder()).build(s);
        if (Path.getPath(s, "/moov/") == null || Path.getPath(s, "/moov/") != null && ((MovieBox)Path.getPath(s, "/moov/")).getMovieHeaderBox().getDuration() == 0L)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        obj = new FileOutputStream(s1);
        obj1 = ((FileOutputStream) (obj)).getChannel();
        s.writeContainer(((java.nio.channels.WritableByteChannel) (obj1)));
        ((FileChannel) (obj1)).close();
        ((FileOutputStream) (obj)).close();
        return s1;
_L4:
        d2 = d;
        d = d1;
        d1 = d2;
_L5:
        d2 = d;
        d = d1;
        d1 = d2;
          goto _L11
        l2 = l3;
        if (d2 > d3)
        {
            l2 = l3;
            if (d2 <= d1)
            {
                l2 = l;
            }
        }
        l4 = l1;
        if (d2 > d3)
        {
            l4 = l1;
            if (d2 <= d)
            {
                l4 = l;
            }
        }
          goto _L12
        return null;
          goto _L9
    }

    public static boolean a(Context context, String s, i j, v v1)
    {
        if (context == null || s == null || j == null)
        {
            return false;
        }
        s = j.a(s);
        if (s == null || j.a(s) != 1)
        {
            return false;
        }
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null || !context.isConnected())
        {
            return false;
        }
        s = KikApplication.f(0x7f090368);
        j = v1.b("kik.chat.video.prefetch", s);
        if (j.equals(s))
        {
            if (context.getType() == 1)
            {
                return true;
            }
        } else
        if (j.equals(KikApplication.f(0x7f090367)))
        {
            return true;
        }
        return false;
    }

    public static boolean a(String s)
    {
        int j;
        if (s != null)
        {
            if ((j = s.lastIndexOf(".")) >= 0)
            {
                return GalleryWidget.a.contains(s.substring(j));
            }
        }
        return false;
    }

    public static boolean a(String s, long l)
    {
        long l1;
        if (y.a(18))
        {
            l1 = ak.a(s);
        } else
        {
            l1 = (new File(s)).length();
        }
        return l1 > 0xf00000L || l > 0x1d4c0L;
    }

    public static long b(MediaMetadataRetriever mediametadataretriever, int j)
    {
        mediametadataretriever = mediametadataretriever.extractMetadata(j);
        long l;
        try
        {
            l = Long.parseLong(mediametadataretriever);
        }
        // Misplaced declaration of an exception variable
        catch (MediaMetadataRetriever mediametadataretriever)
        {
            return -1L;
        }
        return l;
    }

    public static Bitmap b(String s)
    {
        if (s == null)
        {
            return null;
        }
        MediaMetadataRetriever mediametadataretriever = new MediaMetadataRetriever();
        try
        {
            mediametadataretriever.setDataSource(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return a(mediametadataretriever);
    }

    public static int c(String s)
    {
        if (s == null)
        {
            return -1;
        }
        if (y.a(10))
        {
            Object obj = new MediaMetadataRetriever();
            int j;
            try
            {
                ((MediaMetadataRetriever) (obj)).setDataSource(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return -1;
            }
            j = a(((MediaMetadataRetriever) (obj)), 9);
            ((MediaMetadataRetriever) (obj)).release();
            return j;
        }
        try
        {
            obj = new MediaPlayer();
            ((MediaPlayer) (obj)).setDataSource(s);
            j = ((MediaPlayer) (obj)).getDuration();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return j;
    }

    static 
    {
        a = new StringBuilder();
        b = new Formatter(a, Locale.getDefault());
    }
}
