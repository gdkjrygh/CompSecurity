// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.ui.caption.CaptionTypeEnums;
import java.util.HashMap;
import java.util.Map;

public final class Fx
{

    public final CaptionTypeEnums a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public Fx(CaptionTypeEnums captiontypeenums, boolean flag, boolean flag1, boolean flag2)
    {
        a = captiontypeenums;
        b = flag;
        c = flag1;
        d = flag2;
    }

    public final Map a()
    {
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        obj = a;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[CaptionTypeEnums.values().length];
                try
                {
                    a[CaptionTypeEnums.NON_FAT_VANILLA_CAPTION_TYPE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[CaptionTypeEnums.FAT_CAPTION_TYPE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CaptionTypeEnums.FAT_CENTER_CAPTION_TYPE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((CaptionTypeEnums) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 123
    //                   2 129
    //                   3 135;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_135;
_L1:
        obj = "";
_L5:
        hashmap.put("caption", obj);
        if (b)
        {
            obj = "true";
        } else
        {
            obj = "false";
        }
        hashmap.put("free_move_mode", obj);
        if (c)
        {
            obj = "true";
        } else
        {
            obj = "false";
        }
        hashmap.put("color_mode", obj);
        if (d)
        {
            obj = "true";
        } else
        {
            obj = "false";
        }
        hashmap.put("scale_edited", obj);
        return hashmap;
_L2:
        obj = "DEFAULT";
          goto _L5
_L3:
        obj = "BIG_TEXT";
          goto _L5
        obj = "BIG_TEXT_CENTER";
          goto _L5
    }
}
