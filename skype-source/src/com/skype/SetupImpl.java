// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Setup, SkypeFactory, NativeStringConvert, ObjectInterfaceFactory

public class SetupImpl
    implements Setup
{

    protected int m_nativeObject;

    protected SetupImpl(int i)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), i);
    }

    protected SetupImpl(ObjectInterfaceFactory objectinterfacefactory, int i)
    {
        m_nativeObject = i;
    }

    private native boolean activateProfile(byte abyte0[], boolean flag);

    private native void delete(byte abyte0[]);

    private native byte[] getBin(byte abyte0[]);

    private native byte[] getBin(byte abyte0[], byte abyte1[]);

    private native int getInt(byte abyte0[], int i);

    private native long getInt64(byte abyte0[], long l);

    private native byte[] getStrNativeString(byte abyte0[]);

    private native byte[] getStrNativeString(byte abyte0[], byte abyte1[]);

    private native byte[] getSubKeyNativeString(byte abyte0[], int i);

    private native boolean isDefined(byte abyte0[]);

    private native void setBin(byte abyte0[], byte abyte1[]);

    private native void setInt(byte abyte0[], int i);

    private native void setInt64(byte abyte0[], long l);

    private native void setStr(byte abyte0[], byte abyte1[]);

    public boolean activateProfile(String s)
    {
        return activateProfile(s, true);
    }

    public boolean activateProfile(String s, boolean flag)
    {
        return activateProfile(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public void delete(String s)
    {
        delete(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public byte[] getBin(String s)
    {
        return getBin(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public byte[] getBin(String s, byte abyte0[])
    {
        return getBin(NativeStringConvert.ConvertToNativeBytes(s), abyte0);
    }

    public native Setup.GetExistingProfiles_Result getExistingProfiles();

    public int getInt(String s)
    {
        return getInt(s, 0);
    }

    public int getInt(String s, int i)
    {
        return getInt(NativeStringConvert.ConvertToNativeBytes(s), i);
    }

    public long getInt64(String s)
    {
        return getInt64(s, 0L);
    }

    public long getInt64(String s, long l)
    {
        return getInt64(NativeStringConvert.ConvertToNativeBytes(s), l);
    }

    public String getStr(String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getStrNativeString(NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public String getStr(String s, String s1)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getStrNativeString(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1)));
    }

    public String getSubKey(String s, int i)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getSubKeyNativeString(NativeStringConvert.ConvertToNativeBytes(s), i));
    }

    public boolean isDefined(String s)
    {
        return isDefined(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public void setBin(String s, byte abyte0[])
    {
        setBin(NativeStringConvert.ConvertToNativeBytes(s), abyte0);
    }

    public void setInt(String s, int i)
    {
        setInt(NativeStringConvert.ConvertToNativeBytes(s), i);
    }

    public void setInt64(String s, long l)
    {
        setInt64(NativeStringConvert.ConvertToNativeBytes(s), l);
    }

    public void setStr(String s, String s1)
    {
        setStr(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }
}
