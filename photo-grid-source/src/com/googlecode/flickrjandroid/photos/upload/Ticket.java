// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos.upload;


public class Ticket
{

    public static final int COMPLETED = 1;
    public static final int FAILED = 2;
    public static final int UNCOMPLETED = 0;
    private boolean invalid;
    private String photoId;
    private int status;
    private String ticketId;

    public Ticket()
    {
    }

    public String getPhotoId()
    {
        return photoId;
    }

    public int getStatus()
    {
        return status;
    }

    public String getTicketId()
    {
        return ticketId;
    }

    public boolean hasCompleted()
    {
        return status == 1;
    }

    public boolean hasFailed()
    {
        return status == 2;
    }

    public boolean isBusy()
    {
        return status == 0;
    }

    public boolean isInvalid()
    {
        return invalid;
    }

    public void setInvalid(boolean flag)
    {
        invalid = flag;
    }

    public void setPhotoId(String s)
    {
        photoId = s;
    }

    public void setStatus(int i)
    {
        status = i;
    }

    public void setTicketId(String s)
    {
        ticketId = s;
    }
}
