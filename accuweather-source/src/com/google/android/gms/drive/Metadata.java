// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.it;
import com.google.android.gms.internal.iv;
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
        return (String)a(ir.JR);
    }

    public int getContentAvailability()
    {
        Integer integer = (Integer)a(iv.Kz);
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
        return (Date)a(it.Kt);
    }

    public String getDescription()
    {
        return (String)a(ir.JT);
    }

    public DriveId getDriveId()
    {
        return (DriveId)a(ir.JQ);
    }

    public String getEmbedLink()
    {
        return (String)a(ir.JU);
    }

    public String getFileExtension()
    {
        return (String)a(ir.JV);
    }

    public long getFileSize()
    {
        return ((Long)a(ir.JW)).longValue();
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)a(it.Ku);
    }

    public String getMimeType()
    {
        return (String)a(ir.Kh);
    }

    public Date getModifiedByMeDate()
    {
        return (Date)a(it.Kw);
    }

    public Date getModifiedDate()
    {
        return (Date)a(it.Kv);
    }

    public String getOriginalFilename()
    {
        return (String)a(ir.Ki);
    }

    public long getQuotaBytesUsed()
    {
        return ((Long)a(ir.Kl)).longValue();
    }

    public Date getSharedWithMeDate()
    {
        return (Date)a(it.Kx);
    }

    public String getTitle()
    {
        return (String)a(ir.Ko);
    }

    public String getWebContentLink()
    {
        return (String)a(ir.Kq);
    }

    public String getWebViewLink()
    {
        return (String)a(ir.Kr);
    }

    public boolean isEditable()
    {
        Boolean boolean1 = (Boolean)a(ir.Kb);
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
        Boolean boolean1 = (Boolean)a(ir.JZ);
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
        Boolean boolean1 = (Boolean)a(iv.KA);
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
        Boolean boolean1 = (Boolean)a(ir.Kc);
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
        Boolean boolean1 = (Boolean)a(ir.Kd);
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
        Boolean boolean1 = (Boolean)a(ir.Ke);
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
        Boolean boolean1 = (Boolean)a(ir.Km);
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
        Boolean boolean1 = (Boolean)a(ir.Kp);
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
        Boolean boolean1 = (Boolean)a(ir.Kg);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }
}
