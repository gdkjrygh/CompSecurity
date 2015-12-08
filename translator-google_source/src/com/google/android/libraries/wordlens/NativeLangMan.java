// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.wordlens:
//            WordLensSystem, LangPackInfo

public class NativeLangMan
{

    private static Context a = null;
    private static Map b = null;
    private static volatile LangPackInfo c = null;
    private static Set d = null;

    public NativeLangMan()
    {
    }

    private static native List GetAllAvailableLanguagesNative();

    private static native LangPackInfo GetClosestValidLangPackNative(LangPackInfo langpackinfo);

    private static native LangPackInfo GetCurrentLangInfoNative();

    private static native boolean LoadCurrentLangNative();

    private static native boolean SetCurrentLangNative(LangPackInfo langpackinfo);

    public static void a(Context context)
    {
        a = context;
    }

    public static boolean a(LangPackInfo langpackinfo)
    {
        Object obj = WordLensSystem.c();
        obj;
        JVM INSTR monitorenter ;
        boolean flag = SetCurrentLangNative(langpackinfo);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        langpackinfo = String.valueOf(langpackinfo.getDescription(a));
        if (langpackinfo.length() == 0) goto _L2; else goto _L1
_L1:
        "Language successfully set to: ".concat(langpackinfo);
_L3:
        obj;
        JVM INSTR monitorexit ;
        c = null;
        return flag;
_L2:
        new String("Language successfully set to: ");
          goto _L3
        langpackinfo;
        obj;
        JVM INSTR monitorexit ;
        throw langpackinfo;
        langpackinfo = String.valueOf(langpackinfo);
        (new StringBuilder(String.valueOf(langpackinfo).length() + 53)).append("Unable to set language pack?! Desired Language Pack: ").append(langpackinfo);
          goto _L3
    }

    public static boolean a(String s, String s1)
    {
        return !GetClosestValidLangPackNative(new LangPackInfo(s, s1)).isEmpty();
    }

}
