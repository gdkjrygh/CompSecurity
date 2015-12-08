// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.a;

import android.util.SparseArray;

// Referenced classes of package com.google.android.apps.gsa.speech.a:
//            b

public final class a
    implements b
{

    private static final SparseArray a = new SparseArray();

    public a()
    {
    }

    private static void a(int i, int j)
    {
        a.put(i, Integer.valueOf(j));
    }

    private static void a(int i, boolean flag)
    {
        a.put(i, Boolean.valueOf(flag));
    }

    private static void a(int i, String as[])
    {
        a.put(i, as);
    }

    public final int a(int i)
    {
        Object obj = a.get(i);
        if (obj != null)
        {
            if (obj instanceof Integer)
            {
                return ((Integer)obj).intValue();
            } else
            {
                obj = String.valueOf(obj.getClass().getName());
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 47)).append("Expected int type for flag ").append(i).append(" but got ").append(((String) (obj))).toString());
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(32)).append("Unknown speech flag: ").append(i).toString());
        }
    }

    static 
    {
        a(194, false);
        a(673, false);
        a(740, false);
        a(199, false);
        a(272, true);
        a(494, true);
        a(195, 2);
        a(193, new String[] {
            "XT1049", "XT1050", "XT1052", "XT1053", "XT1055", "XT1056", "XT1058", "XT1060", "XT912A"
        });
        String as[] = new String[110];
        as[0] = "ar-EG";
        as[1] = "http://www.gstatic.com/android-search/hotword/okgoogle/721e4518274f1e314f4d0163d74afd28/hotword.data";
        as[2] = "cmn-Hans-CN";
        as[3] = "http://www.gstatic.com/android-search/hotword/okgoogle/aa5d68996c73c333236e51d71388ed7f/hotword.data";
        as[4] = "cmn-Hant-TW";
        as[5] = "http://www.gstatic.com/android-search/hotword/okgoogle/f8aab00e599afef32991a745e2015588/hotword.data";
        as[6] = "cs-CZ";
        as[7] = "http://www.gstatic.com/android-search/hotword/okgoogle/10806d91135a5728bc75b0609a57050f/hotword.data";
        as[8] = "da-DK";
        as[9] = "http://www.gstatic.com/android-search/hotword/okgoogle/fe7c1ca666ffd2b05278e2edd05b6dcb/hotword.data";
        as[10] = "de-AT";
        as[11] = "de-DE/hotword.data";
        as[12] = "de-DE";
        as[13] = "de-DE/hotword.data";
        as[14] = "en-AU";
        as[15] = "en-GB/hotword.data";
        as[16] = "en-CA";
        as[17] = "en-US/hotword.data";
        as[18] = "en-GB";
        as[19] = "en-GB/hotword.data";
        as[20] = "en-IN";
        as[21] = "http://www.gstatic.com/android-search/hotword/okgoogle/82c87ce4d71bde7e83b9b95eff01419d/hotword.data";
        as[22] = "en-IE";
        as[23] = "http://www.gstatic.com/android-search/hotword/okgoogle/e098e28f2873a5fdd5368d40b4b9eb1f/hotword.data";
        as[24] = "en-NZ";
        as[25] = "en-GB/hotword.data";
        as[26] = "en-PH";
        as[27] = "http://www.gstatic.com/android-search/hotword/okgoogle/33d9d144a207e8890348ed64eb5de774/hotword.data";
        as[28] = "en-US";
        as[29] = "en-US/hotword.data";
        as[30] = "en-ZA";
        as[31] = "en-GB/hotword.data";
        as[32] = "en-001";
        as[33] = "en-US/hotword.data";
        as[34] = "es-AR";
        as[35] = "http://www.gstatic.com/android-search/hotword/okgoogle/f2c0d2bc5e3e478489fc24a6ceffa013/hotword.data";
        as[36] = "es-BO";
        as[37] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[38] = "es-CL";
        as[39] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[40] = "es-CO";
        as[41] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[42] = "es-CR";
        as[43] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[44] = "es-DO";
        as[45] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[46] = "es-EC";
        as[47] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[48] = "es-ES";
        as[49] = "http://www.gstatic.com/android-search/hotword/okgoogle/2dfca48706596ca60274f6c6a3fd783b/hotword.data";
        as[50] = "es-GT";
        as[51] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[52] = "es-HN";
        as[53] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[54] = "es-MX";
        as[55] = "http://www.gstatic.com/android-search/hotword/okgoogle/2dfca48706596ca60274f6c6a3fd783b/hotword.data";
        as[56] = "es-NI";
        as[57] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[58] = "es-PA";
        as[59] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[60] = "es-PE";
        as[61] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[62] = "es-PY";
        as[63] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[64] = "es-PR";
        as[65] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[66] = "es-SV";
        as[67] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[68] = "es-US";
        as[69] = "http://www.gstatic.com/android-search/hotword/okgoogle/6ca45d5f074c023b2f34c82ca4606e9a/hotword.data";
        as[70] = "es-UY";
        as[71] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[72] = "es-VE";
        as[73] = "http://www.gstatic.com/android-search/hotword/okgoogle/9adddb00b7d5c074f9d2e579874517e0/hotword.data";
        as[74] = "fa-IR";
        as[75] = "http://www.gstatic.com/android-search/hotword/okgoogle/545891226e40319932a3959b6e66de38/hotword.data";
        as[76] = "fi-FI";
        as[77] = "http://www.gstatic.com/android-search/hotword/okgoogle/ff0d35d82f98a3b4780f7ba99da57760/hotword.data";
        as[78] = "fil-PH";
        as[79] = "http://www.gstatic.com/android-search/hotword/okgoogle/737ea2f07683a47e935fd7a043aaf99f/hotword.data";
        as[80] = "fr-FR";
        as[81] = "fr-FR/hotword.data";
        as[82] = "hi-IN";
        as[83] = "http://www.gstatic.com/android-search/hotword/okgoogle/05311e395e2bdd3706dfa50bf0c3c9f6/hotword.data";
        as[84] = "id-ID";
        as[85] = "http://www.gstatic.com/android-search/hotword/okgoogle/a4ce22163e2328b8a5562e8d1dfc1ba3/hotword.data";
        as[86] = "it-IT";
        as[87] = "http://www.gstatic.com/android-search/hotword/okgoogle/af9000b84f068edb1f10c5f975ac8817/hotword.data";
        as[88] = "ja-JP";
        as[89] = "http://www.gstatic.com/android-search/hotword/okgoogle/53d4c1ed902a3364279e5709020e86bd/hotword.data";
        as[90] = "ko-KR";
        as[91] = "http://www.gstatic.com/android-search/hotword/okgoogle/7eeb2ef552b004b54ea87d66b3a34258/hotword.data";
        as[92] = "ms-MY";
        as[93] = "http://www.gstatic.com/android-search/hotword/okgoogle/a0d8ba8fb3daf1388ba6cf75a5fddda4/hotword.data";
        as[94] = "nl-NL";
        as[95] = "http://www.gstatic.com/android-search/hotword/okgoogle/3ecee92b44cd1d6ca5643ea5328c679f/hotword.data";
        as[96] = "pl-PL";
        as[97] = "http://www.gstatic.com/android-search/hotword/okgoogle/66b61b35a9a187317c88603f89ef76bb/hotword.data";
        as[98] = "pt-BR";
        as[99] = "http://www.gstatic.com/android-search/hotword/okgoogle/52e4c1581c963baec56d72d94aaf11d6/hotword.data";
        as[100] = "ru-RU";
        as[101] = "ru-RU/hotword.data";
        as[102] = "sv-SE";
        as[103] = "http://www.gstatic.com/android-search/hotword/okgoogle/76672080a0d9437a6e200d3cdb96b986/hotword.data";
        as[104] = "th-TH";
        as[105] = "http://www.gstatic.com/android-search/hotword/okgoogle/e55f8eba8d593916a2b284658dcb9e39/hotword.data";
        as[106] = "vi-VN";
        as[107] = "http://www.gstatic.com/android-search/hotword/okgoogle/2006299bdab85852f1603c0faab0da52/hotword.data";
        as[108] = "yue-Hant-HK";
        as[109] = "http://www.gstatic.com/android-search/hotword/okgoogle/c3da6ae44ad53638911e435551641d74/hotword.data";
        a(192, as);
        String as1[] = new String[55];
        for (int i = 0; i < 55; i++)
        {
            as1[i] = as[i * 2];
        }

        a(190, as1);
        a(252, false);
        a(863, false);
        a(435, 384);
        a(456, 224);
        a(189, new String[] {
            "en-US", "en-US/hotword.data", "Ok Google", "en-GB", "en-GB/hotword.data", "Ok Google", "en-CA", "en-US/hotword.data", "Ok Google", "en-AU", 
            "en-GB/hotword.data", "Ok Google", "en-001", "en-US/hotword.data", "Ok Google", "fr-FR", "fr-FR/hotword.data", "Ok Google", "de-DE", "de-DE/hotword.data", 
            "Ok Google", "de-AT", "de-DE/hotword.data", "Ok Google", "ru-RU", "ru-RU/hotword.data", "Ok Google"
        });
        a(785, false);
        a(862, false);
        a(196, 0x5f5e100);
        a(28, new String[0]);
        a(645, false);
        a(842, false);
        a(487, false);
        a(533, false);
        a(527, false);
        a(690, false);
        a(518, false);
        a(655, 10000);
        a(788, false);
        a(689, false);
        a(197, 7);
        a(582, false);
        a(580, 1500);
        a(703, false);
        a(191, new String[] {
            "de-AT", "de-DE", "en-AU", "en-CA,", "en-GB", "en-IN", "en-NZ", "en-US", "en-ZA", "en-001", 
            "es-ES", "es-MX", "fr-FR", "it-IT", "ja-JP", "ko-KR", "pt-BR", "ru-RU"
        });
        a(693, false);
        a(719, false);
    }
}
