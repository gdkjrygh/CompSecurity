// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.messaging;

import com.google.android.libraries.wordlens.WordLensSystem;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.wordlens.messaging:
//            a, b, c, e, 
//            d

public class MessageManager
{

    private static Map a;

    public MessageManager()
    {
    }

    public static void a()
    {
        if (a == null)
        {
            a = new HashMap();
            synchronized (WordLensSystem.c())
            {
                subscribeAllMessagesNative();
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(GUITouchPhase guitouchphase, float f, float f1, float f2)
    {
        synchronized (WordLensSystem.c())
        {
            createAndPostGUIInputMessageNative(guitouchphase.ordinal(), f / f2, f1 / f2);
        }
        return;
        guitouchphase;
        obj;
        JVM INSTR monitorexit ;
        throw guitouchphase;
    }

    public static void a(GUITouchPhase guitouchphase, float f, float f1, float f2, float f3)
    {
        synchronized (WordLensSystem.c())
        {
            createAndPostGUIScrollMessageNative(guitouchphase.ordinal(), f, f1 / f3, f2 / f3);
        }
        return;
        guitouchphase;
        obj;
        JVM INSTR monitorexit ;
        throw guitouchphase;
    }

    private static void a(a a1)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        int i = a1.a;
        obj = (Set)a.get(Integer.valueOf(i));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((b)((Iterator) (obj)).next()).a(a1)) { }
        break MISSING_BLOCK_LABEL_70;
        a1;
        map;
        JVM INSTR monitorexit ;
        throw a1;
        map;
        JVM INSTR monitorexit ;
    }

    public static void a(b b1)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = a.values().iterator();
_L2:
        Set set;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_59;
            }
            set = (Set)iterator.next();
        } while (set == null);
        set.remove(b1);
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        map;
        JVM INSTR monitorexit ;
        throw b1;
        map;
        JVM INSTR monitorexit ;
    }

    public static void a(b b1, int ai[])
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        int j;
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        j = ai[i];
        Set set = (Set)a.get(Integer.valueOf(j));
        Object obj;
        obj = set;
        if (set != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = new HashSet();
        a.put(Integer.valueOf(j), obj);
        ((Set) (obj)).add(b1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        map;
        JVM INSTR monitorexit ;
        return;
        b1;
        map;
        JVM INSTR monitorexit ;
        throw b1;
    }

    private static native void createAndPostGUIInputMessageNative(int i, float f, float f1);

    private static native void createAndPostGUIScrollMessageNative(int i, float f, float f1, float f2);

    private static void postMessageFromNative(int i, byte abyte0[])
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        abyte0 = String.valueOf(Integer.toHexString(i));
        if (abyte0.length() == 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        "MessageManager dropping message for unknown native enum value: 0x".concat(abyte0);
_L2:
        map;
        JVM INSTR monitorexit ;
        return;
        new String("MessageManager dropping message for unknown native enum value: 0x");
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        map;
        JVM INSTR monitorexit ;
        throw abyte0;
        Set set = (Set)a.get(Integer.valueOf(i));
        if (set == null) goto _L4; else goto _L3
_L3:
        if (set.size() <= 0) goto _L4; else goto _L5
_L5:
        i;
        JVM INSTR lookupswitch 9: default 261
    //                   -2004548300: 175
    //                   -1535809389: 175
    //                   -1267402254: 213
    //                   -603581814: 175
    //                   -567724074: 175
    //                   -335762703: 175
    //                   578285198: 200
    //                   712001877: 187
    //                   1025864080: 175;
           goto _L6 _L7 _L7 _L8 _L7 _L7 _L7 _L9 _L10 _L7
_L16:
        if (abyte0 == null) goto _L12; else goto _L11
_L11:
        a(abyte0);
_L4:
        map;
        JVM INSTR monitorexit ;
        return;
_L7:
        abyte0 = new a(i);
        continue; /* Loop/switch isn't completed */
_L10:
        abyte0 = new c(i, abyte0);
        continue; /* Loop/switch isn't completed */
_L9:
        abyte0 = new e(i, abyte0);
        continue; /* Loop/switch isn't completed */
_L8:
        abyte0 = new d(i, abyte0);
        continue; /* Loop/switch isn't completed */
_L12:
        abyte0 = String.valueOf(null);
        if (abyte0.length() == 0) goto _L14; else goto _L13
_L13:
        "MessageManager not configured to handle msgType: ".concat(abyte0);
          goto _L4
_L14:
        new String("MessageManager not configured to handle msgType: ");
          goto _L4
_L6:
        abyte0 = null;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private static native void subscribeAllMessagesNative();

    private class GUITouchPhase extends Enum
    {

        public static final GUITouchPhase BEGAN;
        public static final GUITouchPhase CANCELLED;
        public static final GUITouchPhase ENDED;
        public static final GUITouchPhase INVALID;
        public static final GUITouchPhase MOVED;
        public static final GUITouchPhase STATIONARY;
        private static final GUITouchPhase a[];

        public static GUITouchPhase valueOf(String s)
        {
            return (GUITouchPhase)Enum.valueOf(com/google/android/libraries/wordlens/messaging/MessageManager$GUITouchPhase, s);
        }

        public static GUITouchPhase[] values()
        {
            return (GUITouchPhase[])a.clone();
        }

        static 
        {
            INVALID = new GUITouchPhase("INVALID", 0);
            BEGAN = new GUITouchPhase("BEGAN", 1);
            MOVED = new GUITouchPhase("MOVED", 2);
            STATIONARY = new GUITouchPhase("STATIONARY", 3);
            ENDED = new GUITouchPhase("ENDED", 4);
            CANCELLED = new GUITouchPhase("CANCELLED", 5);
            a = (new GUITouchPhase[] {
                INVALID, BEGAN, MOVED, STATIONARY, ENDED, CANCELLED
            });
        }

        private GUITouchPhase(String s, int i)
        {
            super(s, i);
        }
    }

}
