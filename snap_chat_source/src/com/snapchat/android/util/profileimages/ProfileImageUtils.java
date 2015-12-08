// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.profileimages;

import Bt;
import JY;
import Kd;
import PG;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import com.snapchat.android.Timber;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public final class ProfileImageUtils
{
    public static final class ProfileImageSize extends Enum
    {

        private static final ProfileImageSize $VALUES[];
        public static final ProfileImageSize BIG;
        public static final ProfileImageSize MEDIUM;
        public static final ProfileImageSize THUMBNAIL;

        public static ProfileImageSize valueOf(String s)
        {
            return (ProfileImageSize)Enum.valueOf(com/snapchat/android/util/profileimages/ProfileImageUtils$ProfileImageSize, s);
        }

        public static ProfileImageSize[] values()
        {
            return (ProfileImageSize[])$VALUES.clone();
        }

        static 
        {
            BIG = new ProfileImageSize("BIG", 0);
            MEDIUM = new ProfileImageSize("MEDIUM", 1);
            THUMBNAIL = new ProfileImageSize("THUMBNAIL", 2);
            $VALUES = (new ProfileImageSize[] {
                BIG, MEDIUM, THUMBNAIL
            });
        }

        private ProfileImageSize(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ProfileImageType extends Enum
    {

        private static final ProfileImageType $VALUES[];
        public static final ProfileImageType PROFILE_IMAGE_0;
        public static final ProfileImageType PROFILE_IMAGE_1;
        public static final ProfileImageType PROFILE_IMAGE_2;
        public static final ProfileImageType PROFILE_IMAGE_3;
        public static final ProfileImageType PROFILE_IMAGE_4;

        public static ProfileImageType valueOf(String s)
        {
            return (ProfileImageType)Enum.valueOf(com/snapchat/android/util/profileimages/ProfileImageUtils$ProfileImageType, s);
        }

        public static ProfileImageType[] values()
        {
            return (ProfileImageType[])$VALUES.clone();
        }

        static 
        {
            PROFILE_IMAGE_0 = new ProfileImageType("PROFILE_IMAGE_0", 0);
            PROFILE_IMAGE_1 = new ProfileImageType("PROFILE_IMAGE_1", 1);
            PROFILE_IMAGE_2 = new ProfileImageType("PROFILE_IMAGE_2", 2);
            PROFILE_IMAGE_3 = new ProfileImageType("PROFILE_IMAGE_3", 3);
            PROFILE_IMAGE_4 = new ProfileImageType("PROFILE_IMAGE_4", 4);
            $VALUES = (new ProfileImageType[] {
                PROFILE_IMAGE_0, PROFILE_IMAGE_1, PROFILE_IMAGE_2, PROFILE_IMAGE_3, PROFILE_IMAGE_4
            });
        }

        private ProfileImageType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int COMPRESSION_QUALITY = 90;
    private static final int IMAGE_CHECKSUM_BUFFER_LENGTH = 8;
    private static final int IMAGE_LAST_UPDATED_BUFFER_LENGTH = 8;
    private static final int IMAGE_SIZE_BUFFER_LENGTH = 4;
    private static final int IMAGE_USERNAME_BUFFER_LENGTH = 15;
    public static final int NUMBER_OF_PROFILE_IMAGES = 5;
    public static final int PROFILE_IMAGES_EXPIRATION_IN_MILLIS = 0x36ee80;
    public static final int PROFILE_PICTURE_ANIMATION_DURATION_IN_MILLIS = 200;
    public static final double PROFILE_PICTURE_SCALE_FACTOR = 0.73599999999999999D;
    private static final String TAG = "ProfileImageUtils";
    private static final ProfileImageUtils sInstance = new ProfileImageUtils();

    public ProfileImageUtils()
    {
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap1)
    {
        Canvas canvas;
        Paint paint;
        if (!bitmap.isMutable())
        {
            Bitmap bitmap2 = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
            bitmap.recycle();
            bitmap = bitmap2;
        }
        canvas = new Canvas(bitmap);
        paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(bitmap1, 0.0F, 0.0F, paint);
        bitmap1.recycle();
        return bitmap;
    }

    public static ProfileImageUtils a()
    {
        return sInstance;
    }

    public static String a(String s, ProfileImageSize profileimagesize)
    {
        return (new StringBuilder()).append(s).append(profileimagesize.toString()).toString();
    }

    public static List a(JY jy, String s)
    {
        jy = jy.b(s);
        if (jy == null)
        {
            Timber.c("ProfileImageUtils", (new StringBuilder("friends profile images - no data for cacheKey: ")).append(s).toString(), new Object[0]);
            return null;
        } else
        {
            return b((List)a(((byte []) (jy))).getRight());
        }
    }

    public static List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            Bitmap bitmap = (Bitmap)list.get(i);
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, bytearrayoutputstream);
            arraylist.add(bytearrayoutputstream.toByteArray());
        }

        return arraylist;
    }

    private static Pair a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            Timber.e("ProfileImageUtils", "profile images - exception deserializing profile media byte array: data is null", new Object[0]);
            throw new IllegalArgumentException("Exception deserializing profile media byte array: data is null");
        }
        abyte0 = new ByteArrayInputStream(abyte0);
        int j = abyte0.read();
        if (j != 5)
        {
            Timber.e("ProfileImageUtils", (new StringBuilder("profile images - exception deserializing profile media byte array: invalid pics number ")).append(j).toString(), new Object[0]);
            throw new IllegalArgumentException("profile images - exception deserializing profile media byte array: invalid pics number");
        }
        byte abyte1[] = new byte[8];
        abyte0.read(abyte1, 0, 8);
        long l = (new BigInteger(abyte1)).longValue();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < j; i++)
        {
            byte abyte2[] = new byte[4];
            abyte0.read(abyte2, 0, 4);
            int k = (new BigInteger(abyte2)).intValue();
            abyte2 = new byte[k];
            if (abyte0.read(abyte2, 0, k) != k)
            {
                Timber.e("ProfileImageUtils", "profile images - exception deserializing profile media byte array: data corruption", new Object[0]);
                throw new IllegalArgumentException("profile images - exception deserializing profile media byte array: data corruption");
            }
            byte abyte3[] = new byte[8];
            abyte0.read(abyte3, 0, 8);
            CRC32 crc32 = new CRC32();
            crc32.update(abyte2);
            if (crc32.getValue() != (new BigInteger(abyte3)).longValue())
            {
                Timber.e("ProfileImageUtils", (new StringBuilder("profile images - exception deserializing profile media byte array: data corruption, checksum : ")).append(crc32.getValue()).append(" image index: ").append(i).toString(), new Object[0]);
                throw new IllegalArgumentException((new StringBuilder("profile images - exception deserializing profile media byte array: data corruption, checksum : ")).append(crc32.getValue()).append(" image index: ").append(i).toString());
            }
            arraylist.add(abyte2);
        }

        return ImmutablePair.of(Long.valueOf(l), arraylist);
    }

    public static void a(long l, JY jy)
    {
        int i;
        i = 0;
        PG.b();
        jy;
        JVM INSTR monitorenter ;
        if (l > Bt.M())
        {
            break MISSING_BLOCK_LABEL_19;
        }
        jy;
        JVM INSTR monitorexit ;
        return;
        Timber.c("ProfileImageUtils", (new StringBuilder("profile images - removing images from cache with delete timestamp: ")).append(l).toString(), new Object[0]);
        Bt.b(l);
_L2:
        if (i >= 5)
        {
            break; /* Loop/switch isn't completed */
        }
        ProfileImageType profileimagetype = ProfileImageType.values()[i];
        jy.e(profileimagetype.toString());
        Timber.c("ProfileImageUtils", "profile images - %s removed with delete timestamp: %d ", new Object[] {
            profileimagetype.toString(), Long.valueOf(l)
        });
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        jy;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        jy;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(List list, long l, JY jy)
    {
        PG.b();
        jy;
        JVM INSTR monitorenter ;
        if (l >= Bt.M())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        jy;
        JVM INSTR monitorexit ;
        return;
        Bt.b(l);
        int i = 0;
_L1:
        ProfileImageType profileimagetype;
        if (i >= list.size())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        profileimagetype = ProfileImageType.values()[i];
        jy.a(profileimagetype.toString(), (byte[])list.get(i));
        Timber.c("ProfileImageUtils", "profile images - %s caching succeeded with picture taken timestamp: %d", new Object[] {
            profileimagetype.toString(), Long.valueOf(l)
        });
_L2:
        i++;
          goto _L1
        Kd kd;
        kd;
        Timber.e("ProfileImageUtils", "profile images - %s caching failed with timestamp %d and error: %s", new Object[] {
            profileimagetype.toString(), Long.valueOf(l), kd
        });
          goto _L2
        list;
        jy;
        JVM INSTR monitorexit ;
        throw list;
        jy;
        JVM INSTR monitorexit ;
    }

    public static void a(byte abyte0[], JY jy)
    {
        abyte0 = a(abyte0);
        a((List)abyte0.getRight(), ((Long)abyte0.getLeft()).longValue(), jy);
    }

    public static boolean a(long l)
    {
        return System.currentTimeMillis() - l >= 0x36ee80L;
    }

    public static boolean a(JY jy)
    {
        for (int i = 0; i < 5; i++)
        {
            if (!jy.f(ProfileImageType.values()[i].toString()))
            {
                return false;
            }
        }

        return true;
    }

    public static byte[] a(List list, long l)
    {
        if (list == null || list.size() != 5)
        {
            throw new IllegalArgumentException("profile images - exception serializing profile media byte array with invalid total number of profile pics.");
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bytearrayoutputstream.write((byte)list.size());
        bytearrayoutputstream.write(ByteBuffer.allocate(8).putLong(l).array());
        for (int i = 0; i < 5; i++)
        {
            byte abyte0[] = (byte[])list.get(i);
            int j = abyte0.length;
            bytearrayoutputstream.write(ByteBuffer.allocate(4).putInt(j).array());
            bytearrayoutputstream.write(abyte0);
            CRC32 crc32 = new CRC32();
            crc32.update(abyte0);
            bytearrayoutputstream.write(ByteBuffer.allocate(8).putLong(crc32.getValue()).array());
        }

        bytearrayoutputstream.flush();
        list = bytearrayoutputstream.toByteArray();
        bytearrayoutputstream.close();
        return list;
    }

    public static List b(JY jy)
    {
        PG.b();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < 5; i++)
        {
            ProfileImageType profileimagetype = ProfileImageType.values()[i];
            byte abyte0[] = jy.b(profileimagetype.toString());
            Bitmap bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
            arraylist.add(bitmap);
            Timber.c("ProfileImageUtils", "profile images - loading %s with size %s ", new Object[] {
                profileimagetype.toString(), Integer.valueOf(bitmap.getByteCount())
            });
        }

        Timber.c("ProfileImageUtils", "profile images - loading success, number of bitmaps : %s", new Object[] {
            Integer.valueOf(arraylist.size())
        });
        return arraylist;
    }

    private static List b(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            arraylist.add(BitmapFactory.decodeByteArray((byte[])list.get(i), 0, ((byte[])list.get(i)).length));
        }

        return arraylist;
    }

    public static List c(JY jy)
    {
        PG.b();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < 5; i++)
        {
            ProfileImageType profileimagetype = ProfileImageType.values()[i];
            byte abyte0[] = jy.b(profileimagetype.toString());
            Timber.c("ProfileImageUtils", "profile images - loading %s with size %s ", new Object[] {
                profileimagetype.toString(), Integer.valueOf(abyte0.length)
            });
            arraylist.add(abyte0);
        }

        Timber.c("ProfileImageUtils", "profile images - loading success, number of images : %s", new Object[] {
            Integer.valueOf(arraylist.size())
        });
        return arraylist;
    }

}
