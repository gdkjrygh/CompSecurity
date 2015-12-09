// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.gs;
import com.google.android.gms.internal.gt;
import com.google.android.gms.internal.gv;
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
        return (String)a(gs.FS);
    }

    public int getContentAvailability()
    {
        Integer integer = (Integer)a(gv.Gy);
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
        return (Date)a(gt.Gs);
    }

    public String getDescription()
    {
        return (String)a(gs.FT);
    }

    public DriveId getDriveId()
    {
        return (DriveId)a(gs.FR);
    }

    public String getEmbedLink()
    {
        return (String)a(gs.FU);
    }

    public String getFileExtension()
    {
        return (String)a(gs.FV);
    }

    public long getFileSize()
    {
        return ((Long)a(gs.FW)).longValue();
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)a(gt.Gt);
    }

    public String getMimeType()
    {
        return (String)a(gs.Gh);
    }

    public Date getModifiedByMeDate()
    {
        return (Date)a(gt.Gv);
    }

    public Date getModifiedDate()
    {
        return (Date)a(gt.Gu);
    }

    public String getOriginalFilename()
    {
        return (String)a(gs.Gi);
    }

    public long getQuotaBytesUsed()
    {
        return ((Long)a(gs.Gl)).longValue();
    }

    public Date getSharedWithMeDate()
    {
        return (Date)a(gt.Gw);
    }

    public String getTitle()
    {
        return (String)a(gs.Go);
    }

    public String getWebContentLink()
    {
        return (String)a(gs.Gq);
    }

    public String getWebViewLink()
    {
        return (String)a(gs.Gr);
    }

    public boolean isEditable()
    {
        Boolean boolean1 = (Boolean)a(gs.Gb);
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
        Boolean boolean1 = (Boolean)a(gs.FZ);
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
        Boolean boolean1 = (Boolean)a(gv.Gz);
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
        Boolean boolean1 = (Boolean)a(gs.Gc);
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
        Boolean boolean1 = (Boolean)a(gs.Gd);
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
        Boolean boolean1 = (Boolean)a(gs.Ge);
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
        Boolean boolean1 = (Boolean)a(gs.Gm);
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
        Boolean boolean1 = (Boolean)a(gs.Gp);
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
        Boolean boolean1 = (Boolean)a(gs.Gg);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }
}
