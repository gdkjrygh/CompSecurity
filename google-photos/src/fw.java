// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

public final class fw
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fx();
    private static final jk b;
    private static final String c[] = {
        "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"
    };
    private static final String d[] = {
        "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"
    };
    private static final String e[] = {
        "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"
    };
    public final Bundle a;
    private ft f;

    fw(Bundle bundle)
    {
        a = new Bundle(bundle);
    }

    fw(Parcel parcel)
    {
        a = parcel.readBundle();
    }

    public static fw a(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        }
        fy fy1 = new fy();
        Iterator iterator = ((MediaMetadata)obj).keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Integer integer = (Integer)b.get(s);
            if (integer == null)
            {
                continue;
            }
            switch (integer.intValue())
            {
            default:
                break;

            case 0: // '\0'
                long l = ((MediaMetadata)obj).getLong(s);
                Bitmap bitmap;
                if (b.containsKey(s) && ((Integer)b.get(s)).intValue() != 0)
                {
                    throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a long").toString());
                }
                fy1.a.putLong(s, l);
                break;

            case 2: // '\002'
                bitmap = ((MediaMetadata)obj).getBitmap(s);
                if (b.containsKey(s) && ((Integer)b.get(s)).intValue() != 2)
                {
                    throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a Bitmap").toString());
                }
                fy1.a.putParcelable(s, bitmap);
                break;

            case 3: // '\003'
                fz fz1 = fz.a(((MediaMetadata)obj).getRating(s));
                if (b.containsKey(s) && ((Integer)b.get(s)).intValue() != 3)
                {
                    throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a Rating").toString());
                }
                fy1.a.putParcelable(s, fz1);
                break;

            case 1: // '\001'
                CharSequence charsequence = ((MediaMetadata)obj).getText(s);
                if (b.containsKey(s) && ((Integer)b.get(s)).intValue() != 1)
                {
                    throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a CharSequence").toString());
                }
                fy1.a.putCharSequence(s, charsequence);
                break;
            }
        } while (true);
        return new fw(fy1.a);
    }

    private CharSequence a(String s)
    {
        return a.getCharSequence(s);
    }

    private String b(String s)
    {
        s = a.getCharSequence(s);
        if (s != null)
        {
            return s.toString();
        } else
        {
            return null;
        }
    }

    private Bitmap c(String s)
    {
        try
        {
            s = (Bitmap)a.getParcelable(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", s);
            return null;
        }
        return s;
    }

    public final ft a()
    {
        Object obj;
        int i;
        fv fv1 = null;
        if (f != null)
        {
            return f;
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
            while (i < 3 && j < c.length) 
            {
                obj = a(c[j]);
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
        if (i >= d.length)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        obj = c(d[i]);
        if (obj == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L8:
        obj1 = fv1;
        if (i >= e.length) goto _L4; else goto _L3
_L3:
        obj1 = b(e[i]);
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L6; else goto _L5
_L5:
        obj1 = Uri.parse(((String) (obj1)));
_L4:
        fv1 = new fv();
        fv1.a = s;
        fv1.b = acharsequence[0];
        fv1.c = acharsequence[1];
        fv1.d = acharsequence[2];
        fv1.e = ((Bitmap) (obj));
        fv1.f = ((Uri) (obj1));
        f = fv1.a();
        return f;
_L2:
        i++;
          goto _L7
_L6:
        i++;
          goto _L8
        obj = null;
          goto _L1
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(a);
    }

    static 
    {
        jk jk1 = new jk();
        b = jk1;
        jk1.put("android.media.metadata.TITLE", Integer.valueOf(1));
        b.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        b.put("android.media.metadata.DURATION", Integer.valueOf(0));
        b.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        b.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        b.put("android.media.metadata.WRITER", Integer.valueOf(1));
        b.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        b.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        b.put("android.media.metadata.DATE", Integer.valueOf(1));
        b.put("android.media.metadata.YEAR", Integer.valueOf(0));
        b.put("android.media.metadata.GENRE", Integer.valueOf(1));
        b.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        b.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        b.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        b.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        b.put("android.media.metadata.ART", Integer.valueOf(2));
        b.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        b.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        b.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        b.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        b.put("android.media.metadata.RATING", Integer.valueOf(3));
        b.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        b.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        b.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        b.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        b.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        b.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
    }
}
