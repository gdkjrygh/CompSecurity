// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.protocol;

import android.text.TextUtils;
import com.google.android.apps.unveil.env.af;

// Referenced classes of package com.google.android.apps.unveil.protocol:
//            QueryResponseFactory

public final class id extends Enum
{

    public static final FELIX_TEXT_IMAGE FELIX_TEXT_IMAGE;
    public static final FELIX_TEXT_IMAGE IMAGE;
    public static final FELIX_TEXT_IMAGE LOCAL_BARCODE;
    public static final FELIX_TEXT_IMAGE REPLAY;
    public static final FELIX_TEXT_IMAGE SHARE;
    private static final FELIX_TEXT_IMAGE a[];
    private static final FELIX_TEXT_IMAGE b[];
    public final int id;

    public static final id safeValueOf(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return IMAGE;
        }
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return IMAGE;
        }
        return s;
    }

    public static final IMAGE valueOf(int i)
    {
        if (i < 0 || i >= a.length)
        {
            QueryResponseFactory.a().e("QueryType id out of range.", new Object[0]);
            return IMAGE;
        } else
        {
            return a[i];
        }
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/google/android/apps/unveil/protocol/QueryResponseFactory$QueryType, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    static 
    {
        IMAGE = new <init>("IMAGE", 0, 0);
        LOCAL_BARCODE = new <init>("LOCAL_BARCODE", 1, 1);
        REPLAY = new <init>("REPLAY", 2, 2);
        SHARE = new <init>("SHARE", 3, 3);
        FELIX_TEXT_IMAGE = new <init>("FELIX_TEXT_IMAGE", 4, 4);
        b = (new b[] {
            IMAGE, LOCAL_BARCODE, REPLAY, SHARE, FELIX_TEXT_IMAGE
        });
        a = (new a[] {
            IMAGE, LOCAL_BARCODE, REPLAY, SHARE, FELIX_TEXT_IMAGE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        id = j;
    }
}
