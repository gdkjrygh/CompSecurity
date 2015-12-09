// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import ei;
import ej;
import hc;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.media:
//            RatingCompat, MediaDescriptionCompat

public final class MediaMetadataCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MediaMetadataCompat(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new MediaMetadataCompat[i];
        }

    };
    public static final hc a;
    private static final String d[] = {
        "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"
    };
    private static final String e[] = {
        "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"
    };
    private static final String f[] = {
        "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"
    };
    public final Bundle b;
    public Object c;
    private MediaDescriptionCompat g;

    private MediaMetadataCompat(Bundle bundle)
    {
        b = new Bundle(bundle);
    }

    public MediaMetadataCompat(Bundle bundle, byte byte0)
    {
        this(bundle);
    }

    private MediaMetadataCompat(Parcel parcel)
    {
        b = parcel.readBundle();
    }

    MediaMetadataCompat(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public static MediaMetadataCompat a(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        Object obj1 = new ej();
label0:
        do
        {
            for (Iterator iterator = ((MediaMetadata)obj).keySet().iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                Integer integer = (Integer)a.get(s);
                if (integer != null)
                {
                    switch (integer.intValue())
                    {
                    case 0: // '\0'
                        ((ej) (obj1)).a(s, ((MediaMetadata)obj).getLong(s));
                        break;

                    case 2: // '\002'
                        ((ej) (obj1)).a(s, ((MediaMetadata)obj).getBitmap(s));
                        break;

                    case 3: // '\003'
                        RatingCompat ratingcompat = RatingCompat.a(((MediaMetadata)obj).getRating(s));
                        if (a.containsKey(s) && ((Integer)a.get(s)).intValue() != 3)
                        {
                            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a Rating").toString());
                        }
                        ((ej) (obj1)).a.putParcelable(s, ratingcompat);
                        break;

                    case 1: // '\001'
                        CharSequence charsequence = ((MediaMetadata)obj).getText(s);
                        if (a.containsKey(s) && ((Integer)a.get(s)).intValue() != 1)
                        {
                            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a CharSequence").toString());
                        }
                        ((ej) (obj1)).a.putCharSequence(s, charsequence);
                        break;
                    }
                    continue label0;
                }
            }

            obj1 = ((ej) (obj1)).a();
            obj1.c = obj;
            return ((MediaMetadataCompat) (obj1));
        } while (true);
    }

    public static hc b()
    {
        return a;
    }

    public final MediaDescriptionCompat a()
    {
        Object obj;
        int i;
        ei ei1 = null;
        if (g != null)
        {
            return g;
        }
        String s = b("android.media.metadata.MEDIA_ID");
        CharSequence acharsequence[] = new CharSequence[3];
        obj = a("android.media.metadata.DISPLAY_TITLE");
        Object obj1;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            acharsequence[0] = ((CharSequence) (obj));
            acharsequence[1] = a("android.media.metadata.DISPLAY_SUBTITLE");
            acharsequence[2] = a("android.media.metadata.DISPLAY_DESCRIPTION");
        } else
        {
            int j = 0;
            i = 0;
            while (i < 3 && j < 7) 
            {
                obj = a(d[j]);
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    int k = i + 1;
                    acharsequence[i] = ((CharSequence) (obj));
                    i = k;
                }
                j++;
            }
        }
        i = 0;
_L7:
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        obj = e(e[i]);
        if (obj == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L8:
        obj1 = ei1;
        if (i >= 3) goto _L4; else goto _L3
_L3:
        obj1 = b(f[i]);
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L6; else goto _L5
_L5:
        obj1 = Uri.parse(((String) (obj1)));
_L4:
        ei1 = new ei();
        ei1.a = s;
        ei1.b = acharsequence[0];
        ei1.c = acharsequence[1];
        ei1.d = acharsequence[2];
        ei1.e = ((Bitmap) (obj));
        ei1.f = ((Uri) (obj1));
        g = ei1.a();
        return g;
_L2:
        i++;
          goto _L7
_L6:
        i++;
          goto _L8
        obj = null;
          goto _L1
    }

    public final CharSequence a(String s)
    {
        return b.getCharSequence(s);
    }

    public final String b(String s)
    {
        s = b.getCharSequence(s);
        if (s != null)
        {
            return s.toString();
        } else
        {
            return null;
        }
    }

    public final long c(String s)
    {
        return b.getLong(s, 0L);
    }

    public final RatingCompat d(String s)
    {
        try
        {
            s = (RatingCompat)b.getParcelable(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", s);
            return null;
        }
        return s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Bitmap e(String s)
    {
        try
        {
            s = (Bitmap)b.getParcelable(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", s);
            return null;
        }
        return s;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(b);
    }

    static 
    {
        hc hc1 = new hc();
        a = hc1;
        hc1.put("android.media.metadata.TITLE", Integer.valueOf(1));
        a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        a.put("android.media.metadata.DURATION", Integer.valueOf(0));
        a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        a.put("android.media.metadata.WRITER", Integer.valueOf(1));
        a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        a.put("android.media.metadata.DATE", Integer.valueOf(1));
        a.put("android.media.metadata.YEAR", Integer.valueOf(0));
        a.put("android.media.metadata.GENRE", Integer.valueOf(1));
        a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        a.put("android.media.metadata.ART", Integer.valueOf(2));
        a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        a.put("android.media.metadata.RATING", Integer.valueOf(3));
        a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
    }
}
