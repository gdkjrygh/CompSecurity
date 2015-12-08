// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.translate.c.a;
import com.google.android.apps.translate.e.k;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.offline.o;
import com.google.android.libraries.translate.speech.c;
import com.google.android.libraries.wordlens.NativeLangMan;
import com.google.android.libraries.wordlens.WordLensSystem;

public class TranslateAPIReceiver extends BroadcastReceiver
{

    public TranslateAPIReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = true;
        if (!"android.intent.action.EDIT".equals(intent.getAction()) || intent.getData() == null) goto _L2; else goto _L1
_L1:
        String s = intent.getData().getPath();
        if (s == null) goto _L2; else goto _L3
_L3:
        boolean flag1 = s.startsWith("/lang_pair");
_L8:
        if (!flag1) goto _L5; else goto _L4
_L4:
        intent = k.a(intent, context);
        if (intent == null) goto _L7; else goto _L6
_L6:
        b.a(context, ((a) (intent)).a, ((a) (intent)).b);
        Singleton.b().a(Event.API_LANG_CHANGE, ((a) (intent)).a.getShortName(), ((a) (intent)).b.getShortName());
        if (isOrderedBroadcast())
        {
            setResultCode(-1);
        }
_L10:
        return;
_L2:
        flag1 = false;
          goto _L8
_L7:
        if (!isOrderedBroadcast()) goto _L10; else goto _L9
_L9:
        setResultCode(2);
        return;
_L5:
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null)
        {
            break MISSING_BLOCK_LABEL_392;
        }
        String s1 = intent.getData().getPath();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_392;
        }
        flag1 = s1.startsWith("/support_for_lang");
_L11:
        if (flag1 && isOrderedBroadcast())
        {
            {
                intent = k.a(intent, context);
                if (intent == null)
                {
                    break MISSING_BLOCK_LABEL_427;
                }
                Bundle bundle = new Bundle();
                Object obj = ((a) (intent)).a;
                Object obj1 = ((a) (intent)).b;
                bundle.putString("lang_support_query", intent.a());
                int i;
                if (((o)Singleton.c.b()).a(((Language) (obj)).getShortName(), ((Language) (obj1)).getShortName()))
                {
                    i = 2;
                } else
                {
                    i = 1;
                }
                bundle.putInt("text_support", i);
                if (WordLensSystem.a() != com.google.android.libraries.wordlens.WordLensSystem.WLSupportLevel.NONE)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0)
                {
                    break MISSING_BLOCK_LABEL_445;
                }
                obj = ((a) (intent)).a.getShortName();
                obj1 = ((a) (intent)).b.getShortName();
                if (WordLensSystem.a() == com.google.android.libraries.wordlens.WordLensSystem.WLSupportLevel.WORD_LENS && NativeLangMan.a(((String) (obj)), ((String) (obj1))))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i != 0)
                {
                    i = 4;
                } else
                {
                    if (!com.google.android.libraries.translate.a.a.a(context, ((a) (intent)).a))
                    {
                        break MISSING_BLOCK_LABEL_445;
                    }
                    i = 3;
                }
            }
            bundle.putInt("camera_support", i);
            if (((c)Singleton.e.b()).a(new Language[] {
    ((a) (intent)).a
}))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            bundle.putInt("voice_support", i);
            if (b.a(context, ((a) (intent)).a))
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            bundle.putInt("handwriting_support", i);
            setResult(-1, null, bundle);
            return;
        }
          goto _L10
        flag1 = false;
          goto _L11
        setResultCode(2);
        return;
        i = 0;
        break MISSING_BLOCK_LABEL_316;
    }
}
