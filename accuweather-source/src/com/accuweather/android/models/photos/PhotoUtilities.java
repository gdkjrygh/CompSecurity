// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;

import android.graphics.Bitmap;
import android.util.Log;
import com.accuweather.android.utilities.Logger;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

// Referenced classes of package com.accuweather.android.models.photos:
//            PhotoResults, PhotoResult

public class PhotoUtilities
{
    public static final class Condition extends Enum
    {

        private static final Condition $VALUES[];
        public static final Condition CLEAR;
        public static final Condition CLOUDY;
        public static final Condition COLD;
        public static final Condition FOGGY;
        public static final Condition HOT;
        public static final Condition MIX;
        public static final Condition PARTLY_CLOUDY;
        public static final Condition RAINY;
        public static final Condition SNOWY;
        public static final Condition THUNDERSTORM;
        public static final Condition WINDY;
        private final String conditionTag;

        public static Condition valueOf(String s)
        {
            return (Condition)Enum.valueOf(com/accuweather/android/models/photos/PhotoUtilities$Condition, s);
        }

        public static Condition[] values()
        {
            return (Condition[])$VALUES.clone();
        }

        public String getConditionCode()
        {
            return conditionTag;
        }

        static 
        {
            CLEAR = new Condition("CLEAR", 0, "1");
            PARTLY_CLOUDY = new Condition("PARTLY_CLOUDY", 1, "2");
            CLOUDY = new Condition("CLOUDY", 2, "6");
            FOGGY = new Condition("FOGGY", 3, "11");
            RAINY = new Condition("RAINY", 4, "12");
            THUNDERSTORM = new Condition("THUNDERSTORM", 5, "15");
            SNOWY = new Condition("SNOWY", 6, "22");
            MIX = new Condition("MIX", 7, "9");
            HOT = new Condition("HOT", 8, "30");
            COLD = new Condition("COLD", 9, "31");
            WINDY = new Condition("WINDY", 10, "32");
            $VALUES = (new Condition[] {
                CLEAR, PARTLY_CLOUDY, CLOUDY, FOGGY, RAINY, THUNDERSTORM, SNOWY, MIX, HOT, COLD, 
                WINDY
            });
        }

        private Condition(String s, int i, String s1)
        {
            super(s, i);
            conditionTag = s1;
        }
    }

    public static final class Season extends Enum
    {

        private static final Season $VALUES[];
        public static final Season Fall;
        public static final Season Spring;
        public static final Season Summer;
        public static final Season Winter;
        private final String seasonTag;

        public static Season valueOf(String s)
        {
            return (Season)Enum.valueOf(com/accuweather/android/models/photos/PhotoUtilities$Season, s);
        }

        public static Season[] values()
        {
            return (Season[])$VALUES.clone();
        }

        public String getSeasonTag()
        {
            return seasonTag;
        }

        static 
        {
            Winter = new Season("Winter", 0, "W");
            Spring = new Season("Spring", 1, "P");
            Summer = new Season("Summer", 2, "U");
            Fall = new Season("Fall", 3, "F");
            $VALUES = (new Season[] {
                Winter, Spring, Summer, Fall
            });
        }

        private Season(String s, int i, String s1)
        {
            super(s, i);
            seasonTag = s1;
        }
    }

    public static final class WeatherConditionCode extends Enum
    {

        private static final WeatherConditionCode $VALUES[];
        public static final WeatherConditionCode CLOUDY;
        public static final WeatherConditionCode COLD;
        public static final WeatherConditionCode DREARY;
        public static final WeatherConditionCode FLURRIES;
        public static final WeatherConditionCode FOG;
        public static final WeatherConditionCode FREEZINGRAIN;
        public static final WeatherConditionCode HAZYSUNSHINE;
        public static final WeatherConditionCode HOT;
        public static final WeatherConditionCode ICE;
        public static final WeatherConditionCode INTERMITTENTCLOUDS;
        public static final WeatherConditionCode MOONCLEAR;
        public static final WeatherConditionCode MOONHAZYMOONLIGHT;
        public static final WeatherConditionCode MOONINTERMITTENTCLOUDS;
        public static final WeatherConditionCode MOONMOSTLYCLEAR;
        public static final WeatherConditionCode MOONMOSTLYCLOUDY;
        public static final WeatherConditionCode MOONMOSTLYCLOUDYFLURRIES;
        public static final WeatherConditionCode MOONMOSTLYCLOUDYSHOWERS;
        public static final WeatherConditionCode MOONMOSTLYCLOUDYSNOW;
        public static final WeatherConditionCode MOONMOSTLYCLOUDYTSTORMS;
        public static final WeatherConditionCode MOONPARTLYCLOUDY;
        public static final WeatherConditionCode MOONPARTLYCLOUDYSHOWERS;
        public static final WeatherConditionCode MOONPARTLYCLOUDYTSTORMS;
        public static final WeatherConditionCode MOSTLYCLOUDY;
        public static final WeatherConditionCode MOSTLYCLOUDYFLURRIES;
        public static final WeatherConditionCode MOSTLYCLOUDYSHOWERS;
        public static final WeatherConditionCode MOSTLYCLOUDYSNOW;
        public static final WeatherConditionCode MOSTLYCLOUDYTSTORMS;
        public static final WeatherConditionCode MOSTLYSUNNY;
        public static final WeatherConditionCode PARTLYSUNNY;
        public static final WeatherConditionCode PARTLYSUNNYFLURRIES;
        public static final WeatherConditionCode PARTLYSUNNYSHOWERS;
        public static final WeatherConditionCode PARTLYSUNNYTSTORMS;
        public static final WeatherConditionCode RAIN;
        public static final WeatherConditionCode RAINSNOW;
        public static final WeatherConditionCode SHOWERS;
        public static final WeatherConditionCode SLEET;
        public static final WeatherConditionCode SNOW;
        public static final WeatherConditionCode SUNNY;
        public static final WeatherConditionCode THUNDERSTORMS;
        public static final WeatherConditionCode WINDY;
        private final String iconCodeTag;

        public static WeatherConditionCode valueOf(String s)
        {
            return (WeatherConditionCode)Enum.valueOf(com/accuweather/android/models/photos/PhotoUtilities$WeatherConditionCode, s);
        }

        public static WeatherConditionCode[] values()
        {
            return (WeatherConditionCode[])$VALUES.clone();
        }

        public String getWeatherConditionCode()
        {
            return iconCodeTag;
        }

        static 
        {
            SUNNY = new WeatherConditionCode("SUNNY", 0, "1");
            MOSTLYSUNNY = new WeatherConditionCode("MOSTLYSUNNY", 1, "2");
            PARTLYSUNNY = new WeatherConditionCode("PARTLYSUNNY", 2, "3");
            INTERMITTENTCLOUDS = new WeatherConditionCode("INTERMITTENTCLOUDS", 3, "4");
            HAZYSUNSHINE = new WeatherConditionCode("HAZYSUNSHINE", 4, "5");
            MOSTLYCLOUDY = new WeatherConditionCode("MOSTLYCLOUDY", 5, "6");
            CLOUDY = new WeatherConditionCode("CLOUDY", 6, "7");
            DREARY = new WeatherConditionCode("DREARY", 7, "8");
            FOG = new WeatherConditionCode("FOG", 8, "11");
            SHOWERS = new WeatherConditionCode("SHOWERS", 9, "12");
            MOSTLYCLOUDYSHOWERS = new WeatherConditionCode("MOSTLYCLOUDYSHOWERS", 10, "13");
            PARTLYSUNNYSHOWERS = new WeatherConditionCode("PARTLYSUNNYSHOWERS", 11, "14");
            THUNDERSTORMS = new WeatherConditionCode("THUNDERSTORMS", 12, "15");
            MOSTLYCLOUDYTSTORMS = new WeatherConditionCode("MOSTLYCLOUDYTSTORMS", 13, "16");
            PARTLYSUNNYTSTORMS = new WeatherConditionCode("PARTLYSUNNYTSTORMS", 14, "17");
            RAIN = new WeatherConditionCode("RAIN", 15, "18");
            FLURRIES = new WeatherConditionCode("FLURRIES", 16, "19");
            MOSTLYCLOUDYFLURRIES = new WeatherConditionCode("MOSTLYCLOUDYFLURRIES", 17, "20");
            PARTLYSUNNYFLURRIES = new WeatherConditionCode("PARTLYSUNNYFLURRIES", 18, "21");
            SNOW = new WeatherConditionCode("SNOW", 19, "22");
            MOSTLYCLOUDYSNOW = new WeatherConditionCode("MOSTLYCLOUDYSNOW", 20, "23");
            ICE = new WeatherConditionCode("ICE", 21, "24");
            SLEET = new WeatherConditionCode("SLEET", 22, "25");
            FREEZINGRAIN = new WeatherConditionCode("FREEZINGRAIN", 23, "26");
            RAINSNOW = new WeatherConditionCode("RAINSNOW", 24, "29");
            HOT = new WeatherConditionCode("HOT", 25, "30");
            COLD = new WeatherConditionCode("COLD", 26, "31");
            WINDY = new WeatherConditionCode("WINDY", 27, "32");
            MOONCLEAR = new WeatherConditionCode("MOONCLEAR", 28, "33");
            MOONMOSTLYCLEAR = new WeatherConditionCode("MOONMOSTLYCLEAR", 29, "34");
            MOONPARTLYCLOUDY = new WeatherConditionCode("MOONPARTLYCLOUDY", 30, "35");
            MOONINTERMITTENTCLOUDS = new WeatherConditionCode("MOONINTERMITTENTCLOUDS", 31, "36");
            MOONHAZYMOONLIGHT = new WeatherConditionCode("MOONHAZYMOONLIGHT", 32, "37");
            MOONMOSTLYCLOUDY = new WeatherConditionCode("MOONMOSTLYCLOUDY", 33, "38");
            MOONPARTLYCLOUDYSHOWERS = new WeatherConditionCode("MOONPARTLYCLOUDYSHOWERS", 34, "39");
            MOONMOSTLYCLOUDYSHOWERS = new WeatherConditionCode("MOONMOSTLYCLOUDYSHOWERS", 35, "40");
            MOONPARTLYCLOUDYTSTORMS = new WeatherConditionCode("MOONPARTLYCLOUDYTSTORMS", 36, "41");
            MOONMOSTLYCLOUDYTSTORMS = new WeatherConditionCode("MOONMOSTLYCLOUDYTSTORMS", 37, "42");
            MOONMOSTLYCLOUDYFLURRIES = new WeatherConditionCode("MOONMOSTLYCLOUDYFLURRIES", 38, "43");
            MOONMOSTLYCLOUDYSNOW = new WeatherConditionCode("MOONMOSTLYCLOUDYSNOW", 39, "44");
            $VALUES = (new WeatherConditionCode[] {
                SUNNY, MOSTLYSUNNY, PARTLYSUNNY, INTERMITTENTCLOUDS, HAZYSUNSHINE, MOSTLYCLOUDY, CLOUDY, DREARY, FOG, SHOWERS, 
                MOSTLYCLOUDYSHOWERS, PARTLYSUNNYSHOWERS, THUNDERSTORMS, MOSTLYCLOUDYTSTORMS, PARTLYSUNNYTSTORMS, RAIN, FLURRIES, MOSTLYCLOUDYFLURRIES, PARTLYSUNNYFLURRIES, SNOW, 
                MOSTLYCLOUDYSNOW, ICE, SLEET, FREEZINGRAIN, RAINSNOW, HOT, COLD, WINDY, MOONCLEAR, MOONMOSTLYCLEAR, 
                MOONPARTLYCLOUDY, MOONINTERMITTENTCLOUDS, MOONHAZYMOONLIGHT, MOONMOSTLYCLOUDY, MOONPARTLYCLOUDYSHOWERS, MOONMOSTLYCLOUDYSHOWERS, MOONPARTLYCLOUDYTSTORMS, MOONMOSTLYCLOUDYTSTORMS, MOONMOSTLYCLOUDYFLURRIES, MOONMOSTLYCLOUDYSNOW
            });
        }

        private WeatherConditionCode(String s, int i, String s1)
        {
            super(s, i);
            iconCodeTag = s1;
        }
    }


    private static final String DEBUG = "PhotoUtilities.class";
    private static int mCurrentIndexRandomPhoto;

    public PhotoUtilities()
    {
    }

    public static Bitmap fastblur(Bitmap bitmap, int i)
    {
        bitmap = bitmap.copy(bitmap.getConfig(), true);
        if (i < 1)
        {
            return null;
        }
        int j9 = bitmap.getWidth();
        int k9 = bitmap.getHeight();
        int ai[] = new int[j9 * k9];
        Log.e("pix", (new StringBuilder()).append(j9).append(" ").append(k9).append(" ").append(ai.length).toString());
        bitmap.getPixels(ai, 0, j9, 0, 0, j9, k9);
        int k10 = j9 - 1;
        int l9 = k9 - 1;
        int j = j9 * k9;
        int i10 = i + i + 1;
        int ai1[] = new int[j];
        int ai2[] = new int[j];
        int ai3[] = new int[j];
        int ai4[] = new int[Math.max(j9, k9)];
        j = i10 + 1 >> 1;
        int j1 = j * j;
        int ai5[] = new int[j1 * 256];
        for (int k = 0; k < j1 * 256; k++)
        {
            ai5[k] = k / j1;
        }

        int l6 = 0;
        int k5 = 0;
        int ai6[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i10, 3
        });
        int j10 = i + 1;
        for (int i6 = 0; i6 < k9; i6++)
        {
            int k3 = 0;
            int k4 = 0;
            int i5 = 0;
            int k1 = 0;
            int i3 = 0;
            int i4 = 0;
            int l = 0;
            int i2 = 0;
            int k2 = 0;
            int j7 = -i;
            while (j7 <= i) 
            {
                int j8 = ai[Math.min(k10, Math.max(j7, 0)) + l6];
                int ai7[] = ai6[j7 + i];
                ai7[0] = (0xff0000 & j8) >> 16;
                ai7[1] = (0xff00 & j8) >> 8;
                ai7[2] = j8 & 0xff;
                j8 = j10 - Math.abs(j7);
                i5 += ai7[0] * j8;
                k4 += ai7[1] * j8;
                k3 += ai7[2] * j8;
                if (j7 > 0)
                {
                    k2 += ai7[0];
                    i2 += ai7[1];
                    l += ai7[2];
                } else
                {
                    i4 += ai7[0];
                    i3 += ai7[1];
                    k1 += ai7[2];
                }
                j7++;
            }
            int k8 = i;
            for (int k7 = 0; k7 < j9; k7++)
            {
                ai1[l6] = ai5[i5];
                ai2[l6] = ai5[k4];
                ai3[l6] = ai5[k3];
                int ai8[] = ai6[((k8 - i) + i10) % i10];
                int i12 = ai8[0];
                int k11 = ai8[1];
                int i11 = ai8[2];
                if (i6 == 0)
                {
                    ai4[k7] = Math.min(k7 + i + 1, k10);
                }
                int j12 = ai[ai4[k7] + k5];
                ai8[0] = (0xff0000 & j12) >> 16;
                ai8[1] = (0xff00 & j12) >> 8;
                ai8[2] = j12 & 0xff;
                k2 += ai8[0];
                i2 += ai8[1];
                l += ai8[2];
                i5 = (i5 - i4) + k2;
                k4 = (k4 - i3) + i2;
                k3 = (k3 - k1) + l;
                k8 = (k8 + 1) % i10;
                ai8 = ai6[k8 % i10];
                i4 = (i4 - i12) + ai8[0];
                i3 = (i3 - k11) + ai8[1];
                k1 = (k1 - i11) + ai8[2];
                k2 -= ai8[0];
                i2 -= ai8[1];
                l -= ai8[2];
                l6++;
            }

            k5 += j9;
        }

        for (int i1 = 0; i1 < j9; i1++)
        {
            int j4 = 0;
            int j5 = 0;
            int l5 = 0;
            int j2 = 0;
            int l3 = 0;
            int l4 = 0;
            int l1 = 0;
            int l2 = 0;
            int j3 = 0;
            int j6 = -i * j9;
            int i7 = -i;
            while (i7 <= i) 
            {
                int l7 = Math.max(0, j6) + i1;
                int ai9[] = ai6[i7 + i];
                ai9[0] = ai1[l7];
                ai9[1] = ai2[l7];
                ai9[2] = ai3[l7];
                int l8 = j10 - Math.abs(i7);
                l5 += ai1[l7] * l8;
                j5 += ai2[l7] * l8;
                j4 += ai3[l7] * l8;
                if (i7 > 0)
                {
                    j3 += ai9[0];
                    l2 += ai9[1];
                    l1 += ai9[2];
                } else
                {
                    l4 += ai9[0];
                    l3 += ai9[1];
                    j2 += ai9[2];
                }
                l7 = j6;
                if (i7 < l9)
                {
                    l7 = j6 + j9;
                }
                i7++;
                j6 = l7;
            }
            i7 = i1;
            int i8 = i;
            for (int k6 = 0; k6 < k9; k6++)
            {
                ai[i7] = 0xff000000 & ai[i7] | ai5[l5] << 16 | ai5[j5] << 8 | ai5[j4];
                int ai10[] = ai6[((i8 - i) + i10) % i10];
                int j11 = ai10[0];
                int l10 = ai10[1];
                int i9 = ai10[2];
                if (i1 == 0)
                {
                    ai4[k6] = Math.min(k6 + j10, l9) * j9;
                }
                int l11 = i1 + ai4[k6];
                ai10[0] = ai1[l11];
                ai10[1] = ai2[l11];
                ai10[2] = ai3[l11];
                j3 += ai10[0];
                l2 += ai10[1];
                l1 += ai10[2];
                l5 = (l5 - l4) + j3;
                j5 = (j5 - l3) + l2;
                j4 = (j4 - j2) + l1;
                i8 = (i8 + 1) % i10;
                ai10 = ai6[i8];
                l4 = (l4 - j11) + ai10[0];
                l3 = (l3 - l10) + ai10[1];
                j2 = (j2 - i9) + ai10[2];
                j3 -= ai10[0];
                l2 -= ai10[1];
                l1 -= ai10[2];
                i7 += j9;
            }

        }

        Logger.d("PhotoUtilities.class", "pix", new Object[] {
            (new StringBuilder()).append(j9).append(" ").append(k9).append(" ").append(ai.length).toString()
        });
        bitmap.setPixels(ai, 0, j9, 0, 0, j9, k9);
        return bitmap;
    }

    public static int getCurrentIndexRandomPhoto()
    {
        return mCurrentIndexRandomPhoto;
    }

    public static ArrayList getDefaultPhotos(PhotoResults photoresults)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < photoresults.size(); i++)
        {
            if (!((PhotoResult)photoresults.get(i)).getIsDefault())
            {
                arraylist.add(photoresults.get(i));
            }
        }

        if (arraylist.size() == 0)
        {
            return photoresults;
        } else
        {
            return arraylist;
        }
    }

    public static PhotoResult getRandomPhoto(PhotoResults photoresults)
    {
        new ArrayList();
        new ArrayList();
        Random random = new Random();
        ArrayList arraylist = getDefaultPhotos(photoresults);
        photoresults = populateArrayWithPhotoResults(photoresults);
        if (!arraylist.isEmpty())
        {
            int i = random.nextInt(arraylist.size());
            setCurrentIndexRandomPhoto(i);
            return (PhotoResult)arraylist.get(i);
        } else
        {
            int j = random.nextInt(photoresults.size());
            setCurrentIndexRandomPhoto(j);
            return (PhotoResult)photoresults.get(j);
        }
    }

    public static String getSeason(Calendar calendar, double d)
        throws Exception
    {
        Object obj;
        int i;
        int j;
        i = calendar.get(2) + 1;
        j = calendar.get(5);
        obj = null;
        if (i != 1 && i != 2) goto _L2; else goto _L1
_L1:
        Logger.d("PhotoUtilities.class", "The season is Winter");
        calendar = Season.Winter;
_L4:
        if (d >= 0.0D)
        {
            return calendar.getSeasonTag();
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (i == 4 || i == 5)
        {
            Logger.d("PhotoUtilities.class", "The season is Spring");
            calendar = Season.Spring;
        } else
        if (i == 7 || i == 8)
        {
            Logger.d("PhotoUtilities.class", "The season is Summer");
            calendar = Season.Summer;
        } else
        if (i == 10 || i == 11)
        {
            Logger.d("PhotoUtilities.class", "The season is Fall");
            calendar = Season.Fall;
        } else
        if (i == 3 && j <= 19)
        {
            Logger.d("PhotoUtilities.class", "The season is Winter");
            calendar = Season.Winter;
        } else
        if (i == 3 && j >= 20)
        {
            Logger.d("PhotoUtilities.class", "The season is Spring");
            calendar = Season.Spring;
        } else
        if (i == 6 && j <= 20)
        {
            Logger.d("PhotoUtilities.class", "The season is Spring");
            calendar = Season.Winter;
        } else
        if (i == 6 && j >= 21)
        {
            Logger.d("PhotoUtilities.class", "The season is Summer");
            calendar = Season.Summer;
        } else
        if (i == 9 && j <= 20)
        {
            Logger.d("PhotoUtilities.class", "The season is Summer");
            calendar = Season.Summer;
        } else
        if (i == 9 && j >= 21)
        {
            Logger.d("PhotoUtilities.class", "The season is Fall");
            calendar = Season.Fall;
        } else
        if (i == 12 && j <= 21)
        {
            Logger.d("PhotoUtilities.class", "The season is Fall");
            calendar = Season.Fall;
        } else
        {
            calendar = obj;
            if (i == 12)
            {
                calendar = obj;
                if (j >= 22)
                {
                    Logger.d("PhotoUtilities.class", "The season is Winter");
                    calendar = Season.Winter;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        byte byte0 = 2;
        if (calendar.ordinal() > 1)
        {
            byte0 = -2;
        }
        int k = calendar.ordinal();
        return Season.values()[k + byte0].getSeasonTag();
    }

    public static ArrayList populateArrayWithPhotoResults(PhotoResults photoresults)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < photoresults.size(); i++)
        {
            arraylist.add(photoresults.get(i));
        }

        if (arraylist.size() == 0)
        {
            return photoresults;
        } else
        {
            return arraylist;
        }
    }

    private static void setCurrentIndexRandomPhoto(int i)
    {
        mCurrentIndexRandomPhoto = i;
    }

    public Condition getWeatherConditionTagFromIconCode(String s)
    {
        if (WeatherConditionCode.MOONCLEAR.toString().equals(s) || WeatherConditionCode.SUNNY.toString().equals(s))
        {
            return Condition.CLEAR;
        }
        if (WeatherConditionCode.COLD.toString().equals(s))
        {
            return Condition.COLD;
        }
        if (WeatherConditionCode.HOT.toString().equals(s))
        {
            return Condition.HOT;
        }
        if (WeatherConditionCode.WINDY.toString().equals(s))
        {
            return Condition.WINDY;
        }
        if (WeatherConditionCode.MOSTLYSUNNY.toString().equals(s) || WeatherConditionCode.MOONMOSTLYCLEAR.toString().equals(s) || WeatherConditionCode.HAZYSUNSHINE.toString().equals(s) || WeatherConditionCode.MOONHAZYMOONLIGHT.toString().equals(s) || WeatherConditionCode.PARTLYSUNNY.toString().equals(s) || WeatherConditionCode.MOONPARTLYCLOUDY.toString().equals(s))
        {
            return Condition.PARTLY_CLOUDY;
        }
        if (WeatherConditionCode.FOG.toString().equals(s))
        {
            return Condition.FOGGY;
        }
        if (WeatherConditionCode.INTERMITTENTCLOUDS.toString().equals(s) || WeatherConditionCode.MOONINTERMITTENTCLOUDS.toString().equals(s) || WeatherConditionCode.MOSTLYCLOUDY.toString().equals(s) || WeatherConditionCode.MOONMOSTLYCLOUDY.toString().equals(s) || WeatherConditionCode.CLOUDY.toString().equals(s) || WeatherConditionCode.DREARY.toString().equals(s))
        {
            return Condition.CLOUDY;
        }
        if (WeatherConditionCode.SHOWERS.toString().equals(s) || WeatherConditionCode.RAIN.toString().equals(s) || WeatherConditionCode.MOONMOSTLYCLOUDYSHOWERS.toString().equals(s) || WeatherConditionCode.MOONPARTLYCLOUDYSHOWERS.toString().equals(s) || WeatherConditionCode.MOSTLYCLOUDYSHOWERS.toString().equals(s) || WeatherConditionCode.PARTLYSUNNYSHOWERS.toString().equals(s))
        {
            return Condition.RAINY;
        }
        if (WeatherConditionCode.SNOW.toString().equals(s) || WeatherConditionCode.FLURRIES.toString().equals(s) || WeatherConditionCode.PARTLYSUNNYFLURRIES.toString().equals(s) || WeatherConditionCode.MOSTLYCLOUDYSNOW.toString().equals(s) || WeatherConditionCode.MOSTLYCLOUDYFLURRIES.toString().equals(s) || WeatherConditionCode.MOONMOSTLYCLOUDYSNOW.toString().equals(s) || WeatherConditionCode.MOONMOSTLYCLOUDYFLURRIES.toString().equals(s))
        {
            return Condition.SNOWY;
        }
        if (WeatherConditionCode.ICE.toString().equals(s) || WeatherConditionCode.SLEET.toString().equals(s) || WeatherConditionCode.RAINSNOW.toString().equals(s) || WeatherConditionCode.FREEZINGRAIN.toString().equals(s))
        {
            return Condition.MIX;
        }
        if (WeatherConditionCode.MOONMOSTLYCLOUDYTSTORMS.toString().equals(s) || WeatherConditionCode.MOONPARTLYCLOUDYTSTORMS.toString().equals(s) || WeatherConditionCode.MOSTLYCLOUDYTSTORMS.toString().equals(s) || WeatherConditionCode.PARTLYSUNNYTSTORMS.toString().equals(s) || WeatherConditionCode.THUNDERSTORMS.toString().equals(s))
        {
            return Condition.THUNDERSTORM;
        } else
        {
            return Condition.CLEAR;
        }
    }
}
