// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.branches;


// Referenced classes of package com.netflix.mediaclient.service.webclient.model.branches:
//            Video

public static class 
{

    private int bookmarkPosition;
    private long lastModified;

    public int getBookmarkPosition()
    {
        return bookmarkPosition;
    }

    public long getLastModified()
    {
        return lastModified;
    }

    public void setBookmarkPosition(int i)
    {
        bookmarkPosition = i;
    }

    public void setLastModified(long l)
    {
        lastModified = l;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Bookmark [bookmarkPosition=").append(bookmarkPosition).append(", lastModified=").append(lastModified).append("]").toString();
    }

    public ()
    {
    }
}
