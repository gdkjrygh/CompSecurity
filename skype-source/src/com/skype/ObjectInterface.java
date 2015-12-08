// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            PROPKEY, Metatag, NativeStringConvert

public interface ObjectInterface
{
    public static class GetFilenameProperty_Result
    {

        public boolean m_return;
        public String m_value;

        public void init(byte abyte0[], boolean flag)
        {
            m_value = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public GetFilenameProperty_Result()
        {
        }
    }

    public static interface ObjectInterfaceIListener
    {

        public abstract void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey);
    }


    public abstract void addListener(ObjectInterfaceIListener objectinterfaceilistener);

    public abstract byte[] getBinProperty(PROPKEY propkey);

    public abstract int getDbID();

    public abstract GetFilenameProperty_Result getFilenameProperty(PROPKEY propkey);

    public abstract long getInt64Property(PROPKEY propkey);

    public abstract long getInt64Property(PROPKEY propkey, int i);

    public abstract int getIntProperty(PROPKEY propkey);

    public abstract int getIntProperty(PROPKEY propkey, int i);

    public abstract int getObjectID();

    public abstract boolean getProperty(PROPKEY propkey, Metatag metatag);

    public abstract boolean getPropertyOrDefault(PROPKEY propkey, Metatag metatag);

    public abstract String getStrProperty(PROPKEY propkey);

    public abstract String getStrProperty(PROPKEY propkey, String s);

    public abstract String getStrPropertyWithXmlStripped(PROPKEY propkey, String s);

    public abstract void removeListener(ObjectInterfaceIListener objectinterfaceilistener);

    public abstract boolean setExtendedProperty(Metatag metatag);

    public abstract boolean setExtendedProperty(PROPKEY propkey, int i);

    public abstract boolean setExtendedProperty(PROPKEY propkey, String s);

    public abstract void unlink();
}
