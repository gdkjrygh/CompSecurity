// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Message, NativeStringConvert

public static class 
{

    public String m_address;
    public int m_altitude;
    public int m_course;
    public int m_horizontalAccuracy;
    public int m_latitude;
    public int m_longitude;
    public String m_pointOfInterest;
    public boolean m_return;
    public int m_speed;
    public int m_timeStamp;
    public int m_verticalAccuracy;

    public void init(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, byte abyte0[], byte abyte1[], boolean flag)
    {
        m_latitude = i;
        m_longitude = j;
        m_altitude = k;
        m_horizontalAccuracy = l;
        m_verticalAccuracy = i1;
        m_speed = j1;
        m_course = k1;
        m_timeStamp = l1;
        m_address = NativeStringConvert.ConvertFromNativeBytes(abyte0);
        m_pointOfInterest = NativeStringConvert.ConvertFromNativeBytes(abyte1);
        m_return = flag;
    }

    public ()
    {
    }
}
