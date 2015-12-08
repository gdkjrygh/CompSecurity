// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.info;


// Referenced classes of package com.adobe.mediacore.info:
//            Track

public class AudioTrack extends Track
{

    private final boolean _isAutoSelect;
    private final boolean _isForced;

    public AudioTrack(String s, String s1, boolean flag, boolean flag1, boolean flag2)
    {
        super(s, s1, flag);
        _isAutoSelect = flag1;
        _isForced = flag2;
    }

    public boolean isAutoSelect()
    {
        return _isAutoSelect;
    }

    public boolean isForced()
    {
        return _isForced;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Name: ").append(getName()).append(". Language: ").append(getLanguage()).toString();
    }
}
