// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.util.SparseArray;

// Referenced classes of package com.skype.android.app.chat:
//            MessageHolder

public final class SyntheticTypes extends Enum
{

    private static final SyntheticTypes $VALUES[];
    public static final SyntheticTypes CONTACT_REQUEST;
    public static final SyntheticTypes HEADER;
    public static final SyntheticTypes PUSH;
    public static final SyntheticTypes TWITTER_URL_PREVIEW;
    public static final SyntheticTypes WEB_URL_PREVIEW;
    private static SparseArray typeMap;
    private int type;

    private SyntheticTypes(String s, int i, int j)
    {
        super(s, i);
        type = j;
    }

    public static SyntheticTypes fromType(int i)
    {
        return (SyntheticTypes)typeMap.get(i);
    }

    public static boolean isSynthetic(int i)
    {
        return typeMap.get(i) != null;
    }

    public static boolean isSynthetic(MessageHolder messageholder)
    {
        return messageholder != null && isSynthetic(messageholder.getTypeOrdinal());
    }

    public static SyntheticTypes valueOf(String s)
    {
        return (SyntheticTypes)Enum.valueOf(com/skype/android/app/chat/SyntheticTypes, s);
    }

    public static SyntheticTypes[] values()
    {
        return (SyntheticTypes[])$VALUES.clone();
    }

    public final int getType()
    {
        return type;
    }

    static 
    {
        PUSH = new SyntheticTypes("PUSH", 0, -1);
        CONTACT_REQUEST = new SyntheticTypes("CONTACT_REQUEST", 1, -2);
        HEADER = new SyntheticTypes("HEADER", 2, -3);
        TWITTER_URL_PREVIEW = new SyntheticTypes("TWITTER_URL_PREVIEW", 3, -4);
        WEB_URL_PREVIEW = new SyntheticTypes("WEB_URL_PREVIEW", 4, -5);
        $VALUES = (new SyntheticTypes[] {
            PUSH, CONTACT_REQUEST, HEADER, TWITTER_URL_PREVIEW, WEB_URL_PREVIEW
        });
        typeMap = new SparseArray();
        SyntheticTypes asynthetictypes[] = values();
        int j = asynthetictypes.length;
        for (int i = 0; i < j; i++)
        {
            SyntheticTypes synthetictypes = asynthetictypes[i];
            typeMap.put(synthetictypes.getType(), synthetictypes);
        }

    }
}
