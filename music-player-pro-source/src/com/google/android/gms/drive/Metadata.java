// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import com.google.android.gms.internal.lr;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

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
        return (String)a(ln.Rk);
    }

    public int getContentAvailability()
    {
        Integer integer = (Integer)a(lr.RW);
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
        return (Date)a(lp.RQ);
    }

    public Map getCustomProperties()
    {
        AppVisibleCustomProperties appvisiblecustomproperties = (AppVisibleCustomProperties)a(ln.Rl);
        if (appvisiblecustomproperties == null)
        {
            return Collections.emptyMap();
        } else
        {
            return appvisiblecustomproperties.iV();
        }
    }

    public String getDescription()
    {
        return (String)a(ln.Rm);
    }

    public DriveId getDriveId()
    {
        return (DriveId)a(ln.Rj);
    }

    public String getEmbedLink()
    {
        return (String)a(ln.Rn);
    }

    public String getFileExtension()
    {
        return (String)a(ln.Ro);
    }

    public long getFileSize()
    {
        return ((Long)a(ln.Rp)).longValue();
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)a(lp.RR);
    }

    public String getMimeType()
    {
        return (String)a(ln.RA);
    }

    public Date getModifiedByMeDate()
    {
        return (Date)a(lp.RT);
    }

    public Date getModifiedDate()
    {
        return (Date)a(lp.RS);
    }

    public String getOriginalFilename()
    {
        return (String)a(ln.RB);
    }

    public long getQuotaBytesUsed()
    {
        return ((Long)a(ln.RG)).longValue();
    }

    public Date getSharedWithMeDate()
    {
        return (Date)a(lp.RU);
    }

    public String getTitle()
    {
        return (String)a(ln.RJ);
    }

    public String getWebContentLink()
    {
        return (String)a(ln.RL);
    }

    public String getWebViewLink()
    {
        return (String)a(ln.RM);
    }

    public boolean isEditable()
    {
        Boolean boolean1 = (Boolean)a(ln.Ru);
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
        Boolean boolean1 = (Boolean)a(ln.Rs);
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
        Boolean boolean1 = (Boolean)a(lr.RX);
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
        Boolean boolean1 = (Boolean)a(ln.Rv);
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
        Boolean boolean1 = (Boolean)a(ln.Rw);
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
        Boolean boolean1 = (Boolean)a(ln.Rx);
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
        Boolean boolean1 = (Boolean)a(ln.RH);
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
        Boolean boolean1 = (Boolean)a(ln.RK);
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
        Boolean boolean1 = (Boolean)a(ln.Rz);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }
}
