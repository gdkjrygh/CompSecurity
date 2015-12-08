// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMPolicy, DRMManager, DRMOperationErrorCallback, DRMMetadataCreatedCallback

public class DRMMetadata
{

    protected String licenseId;
    protected long peerObject;
    protected DRMPolicy policies[];
    protected String serverURL;

    private DRMMetadata()
    {
    }

    protected DRMMetadata(DRMManager drmmanager, byte abyte0[], DRMOperationErrorCallback drmoperationerrorcallback)
    {
        if (abyte0 == null || drmoperationerrorcallback == null || drmmanager == null)
        {
            throw new NullPointerException();
        } else
        {
            init(drmmanager, abyte0, drmoperationerrorcallback, new DRMMetadataCreatedCallback() {

                final DRMMetadata this$0;

                public void MetadataCreated(long l)
                {
                    peerObject = l;
                }

            
            {
                this$0 = DRMMetadata.this;
                super();
            }
            });
            return;
        }
    }

    protected static DRMMetadata createFromData(DRMManager drmmanager, byte abyte0[], DRMOperationErrorCallback drmoperationerrorcallback)
    {
        abyte0 = new DRMMetadata(drmmanager, abyte0, drmoperationerrorcallback);
        drmmanager = abyte0;
        if (((DRMMetadata) (abyte0)).peerObject == 0L)
        {
            drmmanager = null;
        }
        return drmmanager;
    }

    private native void init(DRMManager drmmanager, byte abyte0[], DRMOperationErrorCallback drmoperationerrorcallback, DRMMetadataCreatedCallback drmmetadatacreatedcallback);

    protected native void finalize();

    public native String getLicenseId();

    public native DRMPolicy[] getPolicies();

    public native String getServerURL();

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (getServerURL() != null)
        {
            stringbuffer.append((new StringBuilder()).append("License server URL: ").append(getServerURL()).append("\n").toString());
        }
        DRMPolicy adrmpolicy[];
        if (getLicenseId() != null)
        {
            stringbuffer.append((new StringBuilder()).append("License id: ").append(getLicenseId()).append("\n").toString());
        } else
        {
            stringbuffer.append("Invalid metadata file\n");
        }
        adrmpolicy = getPolicies();
        if (adrmpolicy != null)
        {
            for (int i = 0; i < adrmpolicy.length; i++)
            {
                stringbuffer.append((new StringBuilder()).append("Policy #: ").append(i).append("\n").toString());
                stringbuffer.append(adrmpolicy[i]);
            }

        }
        return stringbuffer.toString();
    }
}
