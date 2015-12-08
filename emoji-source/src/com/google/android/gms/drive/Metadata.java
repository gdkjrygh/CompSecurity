// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.iq;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.iu;
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
        return (String)a(iq.JU);
    }

    public int getContentAvailability()
    {
        Integer integer = (Integer)a(iu.KC);
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
        return (Date)a(is.Kw);
    }

    public String getDescription()
    {
        return (String)a(iq.JW);
    }

    public DriveId getDriveId()
    {
        return (DriveId)a(iq.JT);
    }

    public String getEmbedLink()
    {
        return (String)a(iq.JX);
    }

    public String getFileExtension()
    {
        return (String)a(iq.JY);
    }

    public long getFileSize()
    {
        return ((Long)a(iq.JZ)).longValue();
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)a(is.Kx);
    }

    public String getMimeType()
    {
        return (String)a(iq.Kk);
    }

    public Date getModifiedByMeDate()
    {
        return (Date)a(is.Kz);
    }

    public Date getModifiedDate()
    {
        return (Date)a(is.Ky);
    }

    public String getOriginalFilename()
    {
        return (String)a(iq.Kl);
    }

    public long getQuotaBytesUsed()
    {
        return ((Long)a(iq.Ko)).longValue();
    }

    public Date getSharedWithMeDate()
    {
        return (Date)a(is.KA);
    }

    public String getTitle()
    {
        return (String)a(iq.Kr);
    }

    public String getWebContentLink()
    {
        return (String)a(iq.Kt);
    }

    public String getWebViewLink()
    {
        return (String)a(iq.Ku);
    }

    public boolean isEditable()
    {
        Boolean boolean1 = (Boolean)a(iq.Ke);
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
        Boolean boolean1 = (Boolean)a(iq.Kc);
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
        Boolean boolean1 = (Boolean)a(iu.KD);
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
        Boolean boolean1 = (Boolean)a(iq.Kf);
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
        Boolean boolean1 = (Boolean)a(iq.Kg);
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
        Boolean boolean1 = (Boolean)a(iq.Kh);
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
        Boolean boolean1 = (Boolean)a(iq.Kp);
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
        Boolean boolean1 = (Boolean)a(iq.Ks);
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
        Boolean boolean1 = (Boolean)a(iq.Kj);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }
}
