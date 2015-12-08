// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            NativeStringConvert

public interface Setup
{
    public static class GetExistingProfiles_Result
    {

        public String m_list[];

        public void init(byte abyte0[][])
        {
            m_list = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        }

        public GetExistingProfiles_Result()
        {
        }
    }


    public abstract boolean activateProfile(String s);

    public abstract boolean activateProfile(String s, boolean flag);

    public abstract void delete(String s);

    public abstract byte[] getBin(String s);

    public abstract byte[] getBin(String s, byte abyte0[]);

    public abstract GetExistingProfiles_Result getExistingProfiles();

    public abstract int getInt(String s);

    public abstract int getInt(String s, int i);

    public abstract long getInt64(String s);

    public abstract long getInt64(String s, long l);

    public abstract String getStr(String s);

    public abstract String getStr(String s, String s1);

    public abstract String getSubKey(String s, int i);

    public abstract boolean isDefined(String s);

    public abstract void setBin(String s, byte abyte0[]);

    public abstract void setInt(String s, int i);

    public abstract void setInt64(String s, long l);

    public abstract void setStr(String s, String s1);
}
