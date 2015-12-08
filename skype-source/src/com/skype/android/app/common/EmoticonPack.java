// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.skype.android.app.common:
//            Emoticon

public class EmoticonPack
    implements Comparable
{

    public static final String MEDIA_EMOTICON = "MEDIA_EMOTICON";
    private Uri bitmapsDataUri;
    private List emoticons;
    private String name;
    private String type;

    public EmoticonPack(String s, String s1)
    {
        emoticons = new ArrayList();
        name = s;
        type = s1;
    }

    public boolean add(Emoticon emoticon)
    {
        return emoticons.add(emoticon);
    }

    public int compareTo(EmoticonPack emoticonpack)
    {
        return name.compareTo(emoticonpack.name);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((EmoticonPack)obj);
    }

    public Uri getBitmapsDataUri()
    {
        return bitmapsDataUri;
    }

    public List getEmoticons()
    {
        return emoticons;
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public void setBitmapsDataUri(Uri uri)
    {
        bitmapsDataUri = uri;
    }

    public int size()
    {
        return emoticons.size();
    }

    public void sort()
    {
        Collections.sort(emoticons);
    }
}
