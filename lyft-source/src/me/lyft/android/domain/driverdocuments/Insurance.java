// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driverdocuments;

import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import me.lyft.android.common.DateUtils;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.domain.driverdocuments:
//            DriverDocument

public class Insurance extends DriverDocument
    implements INullable
{

    private static final DateFormat DATE_FORMAT = DateUtils.createDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    private static final long DAY_IN_MILLIS;
    public static final long POST_EXPIRATION_DAYS = 60L;
    public static final long PRE_EXPIRATION_DAYS = 30L;
    Date expirationDate;
    String state;
    DriverDocument.Status status;

    public Insurance()
    {
        super(null, null);
    }

    public Insurance(String s, String s1, String s2, String s3, String s4)
    {
        super(s, s1);
        if (!Strings.isNullOrEmpty(s2))
        {
            status = DriverDocument.Status.valueOf(s2);
        }
        state = s3;
        expirationDate = parseExpirationDate(s4);
    }

    public String expirationDateToString()
    {
        return DATE_FORMAT.format(expirationDate);
    }

    public Date getExpirationDate()
    {
        return expirationDate;
    }

    public String getPhotoUploadUrl()
    {
        return Strings.nullToEmpty(photoUploadUrl);
    }

    public String getPhotoUrl()
    {
        return Strings.nullToEmpty(photoUrl);
    }

    public String getState()
    {
        return state;
    }

    public DriverDocument.Status getStatus()
    {
        return status;
    }

    public boolean isApproved()
    {
        return status == DriverDocument.Status.APPROVED;
    }

    public boolean isApprovedButExpiringSoon()
    {
        if (getExpirationDate() != null)
        {
            Date date = getExpirationDate();
            long l = System.currentTimeMillis() - date.getTime();
            if (isApproved() && l < DAY_IN_MILLIS && TimeUnit.DAYS.convert(Math.abs(l), TimeUnit.MILLISECONDS) <= 30L)
            {
                return true;
            }
        }
        return false;
    }

    public boolean isExpired()
    {
        return status == DriverDocument.Status.EXPIRED;
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isPending()
    {
        return status == DriverDocument.Status.PENDING;
    }

    public boolean isRejected()
    {
        return status == DriverDocument.Status.REJECTED;
    }

    public Date parseExpirationDate(String s)
    {
        Date date = null;
        if (!Strings.isNullOrEmpty(s))
        {
            try
            {
                date = DATE_FORMAT.parse(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        return date;
    }

    public void setExpirationDate(Date date)
    {
        expirationDate = date;
    }

    public void setPhotoUploadUrl(String s)
    {
        photoUploadUrl = s;
    }

    public void setPhotoUrl(String s)
    {
        photoUrl = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public boolean shouldShowInsuranceExpirationDialog()
    {
        long l;
        if (expirationDate != null)
        {
            if ((l = System.currentTimeMillis() - expirationDate.getTime()) < 0L && TimeUnit.DAYS.convert(Math.abs(l), TimeUnit.MILLISECONDS) < 30L || l > 0L && TimeUnit.DAYS.convert(Math.abs(l), TimeUnit.MILLISECONDS) < 60L)
            {
                return true;
            }
        }
        return false;
    }

    static 
    {
        DAY_IN_MILLIS = TimeUnit.HOURS.toMillis(24L);
    }
}
