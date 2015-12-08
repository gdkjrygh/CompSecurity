// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

final class Typefaces
{

    private static final String LOGTAG = "DominosNinaPersona";
    private static final Map customFontCache = new HashMap();
    private static final Map fontCache = new EnumMap(com/dominos/nina/persona/Typefaces$Id);

    Typefaces()
    {
    }

    static Typeface get(Context context, Id id)
    {
        com/dominos/nina/persona/Typefaces;
        JVM INSTR monitorenter ;
        if (!fontCache.containsKey(id)) goto _L2; else goto _L1
_L1:
        context = (Typeface)fontCache.get(id);
_L8:
        com/dominos/nina/persona/Typefaces;
        JVM INSTR monitorexit ;
        return context;
_L2:
        _cls1..SwitchMap.com.dominos.nina.persona.Typefaces.Id[id.ordinal()];
        JVM INSTR tableswitch 1 3: default 158
    //                   1 110
    //                   2 124
    //                   3 138;
           goto _L3 _L4 _L5 _L6
_L3:
        break MISSING_BLOCK_LABEL_158;
_L9:
        id = getCustomTypeface(context, null);
        context = id;
        if (id != null) goto _L8; else goto _L7
_L7:
        int i;
        Log.d("DominosNinaPersona", (new StringBuilder("Typefaces -- Created default font family with style: ")).append(i).toString());
        context = Typeface.defaultFromStyle(i);
          goto _L8
_L4:
        i = context.getResources().getInteger(R.integer.nina_bar_text_style);
          goto _L9
_L5:
        i = context.getResources().getInteger(R.integer.nina_edit_text_style_hint);
          goto _L9
_L6:
        i = context.getResources().getInteger(R.integer.nina_edit_text_style_editing);
          goto _L9
        context;
        throw context;
        i = 0;
          goto _L9
    }

    private static Typeface getCustomTypeface(Context context, String s)
    {
        if (s == null)
        {
            return null;
        }
        if (customFontCache.containsKey(s))
        {
            Log.d("DominosNinaPersona", (new StringBuilder("Typefaces -- Found typeface '")).append(s).append("' in cache").toString());
            return (Typeface)customFontCache.get(s);
        }
        try
        {
            context = Typeface.createFromAsset(context.getAssets(), s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("DominosNinaPersona", (new StringBuilder("Typefaces -- Could not create typeface '")).append(s).append("' because: ").append(context.toString()).toString());
            return null;
        }
        Log.d("DominosNinaPersona", (new StringBuilder("Typefaces -- Created typeface '")).append(s).append("'").toString());
        customFontCache.put(s, context);
        return context;
    }

    static void recycle()
    {
        com/dominos/nina/persona/Typefaces;
        JVM INSTR monitorenter ;
        customFontCache.clear();
        fontCache.clear();
        com/dominos/nina/persona/Typefaces;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }


    private class _cls1
    {

        static final int $SwitchMap$com$dominos$nina$persona$Typefaces$Id[];

        static 
        {
            $SwitchMap$com$dominos$nina$persona$Typefaces$Id = new int[Id.values().length];
            try
            {
                $SwitchMap$com$dominos$nina$persona$Typefaces$Id[Id.TEXT_VIEW.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$nina$persona$Typefaces$Id[Id.EDIT_TEXT_HINT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$nina$persona$Typefaces$Id[Id.EDIT_TEXT_EDITING.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$nina$persona$Typefaces$Id[Id.HINT_TEXT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class Id extends Enum
    {

        private static final Id $VALUES[];
        public static final Id EDIT_TEXT_EDITING;
        public static final Id EDIT_TEXT_HINT;
        public static final Id HINT_TEXT;
        public static final Id TEXT_VIEW;

        public static Id valueOf(String s)
        {
            return (Id)Enum.valueOf(com/dominos/nina/persona/Typefaces$Id, s);
        }

        public static Id[] values()
        {
            return (Id[])$VALUES.clone();
        }

        static 
        {
            TEXT_VIEW = new Id("TEXT_VIEW", 0);
            EDIT_TEXT_HINT = new Id("EDIT_TEXT_HINT", 1);
            EDIT_TEXT_EDITING = new Id("EDIT_TEXT_EDITING", 2);
            HINT_TEXT = new Id("HINT_TEXT", 3);
            $VALUES = (new Id[] {
                TEXT_VIEW, EDIT_TEXT_HINT, EDIT_TEXT_EDITING, HINT_TEXT
            });
        }

        private Id(String s, int i)
        {
            super(s, i);
        }
    }

}
