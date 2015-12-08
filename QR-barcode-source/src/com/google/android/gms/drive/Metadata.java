// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.kd;
import com.google.android.gms.internal.kf;
import com.google.android.gms.internal.kh;
import java.util.Date;

// Referenced classes of package com.google.android.gms.drive:
//            DriveId

public abstract class Metadata
    implements Freezable
{

    public static final int CONTENT_AVAILABLE_LOCALLY = 1;
    public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;

    public Metadata()
    {
    }

    protected abstract Object a(MetadataField metadatafield);

    public String getAlternateLink()
    {
        return (String)a(kd.PN);
    }

    public int getContentAvailability()
    {
        Integer integer = (Integer)a(kh.Qz);
        if (integer == null)
        {
            return 0;
        } else
        {
            return integer.intValue();
        }
    }

    public Date getCreatedDate()
    {
        return (Date)a(kf.Qt);
    }

    public String getDescription()
    {
        return (String)a(kd.PP);
    }

    public DriveId getDriveId()
    {
        return (DriveId)a(kd.PM);
    }

    public String getEmbedLink()
    {
        return (String)a(kd.PQ);
    }

    public String getFileExtension()
    {
        return (String)a(kd.PR);
    }

    public long getFileSize()
    {
        return ((Long)a(kd.PS)).longValue();
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)a(kf.Qu);
    }

    public String getMimeType()
    {
        return (String)a(kd.Qd);
    }

    public Date getModifiedByMeDate()
    {
        return (Date)a(kf.Qw);
    }

    public Date getModifiedDate()
    {
        return (Date)a(kf.Qv);
    }

    public String getOriginalFilename()
    {
        return (String)a(kd.Qe);
    }

    public long getQuotaBytesUsed()
    {
        return ((Long)a(kd.Qj)).longValue();
    }

    public Date getSharedWithMeDate()
    {
        return (Date)a(kf.Qx);
    }

    public String getTitle()
    {
        return (String)a(kd.Qm);
    }

    public String getWebContentLink()
    {
        return (String)a(kd.Qo);
    }

    public String getWebViewLink()
    {
        return (String)a(kd.Qp);
    }

    public boolean isEditable()
    {
        Boolean boolean1 = (Boolean)a(kd.PX);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isFolder()
    {
        return "application/vnd.google-apps.folder".equals(getMimeType());
    }

    public boolean isInAppFolder()
    {
        Boolean boolean1 = (Boolean)a(kd.PV);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isPinnable()
    {
        Boolean boolean1 = (Boolean)a(kh.QA);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isPinned()
    {
        Boolean boolean1 = (Boolean)a(kd.PY);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isRestricted()
    {
        Boolean boolean1 = (Boolean)a(kd.PZ);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isShared()
    {
        Boolean boolean1 = (Boolean)a(kd.Qa);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isStarred()
    {
        Boolean boolean1 = (Boolean)a(kd.Qk);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isTrashed()
    {
        Boolean boolean1 = (Boolean)a(kd.Qn);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isViewed()
    {
        Boolean boolean1 = (Boolean)a(kd.Qc);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }
}
