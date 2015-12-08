// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.galleries;

import java.util.Date;

public class Gallery
{

    private int commentsCount;
    private Date dateCreate;
    private Date dateUpdate;
    private String description;
    private String galleryId;
    private String galleryUrl;
    private String ownerId;
    private int photoCount;
    private String primaryPhotoId;
    private String title;
    private int videoCount;
    private int viewsCount;

    public Gallery()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof Gallery))
            {
                return false;
            }
            obj = (Gallery)obj;
            if (commentsCount != ((Gallery) (obj)).commentsCount)
            {
                return false;
            }
            if (dateCreate == null)
            {
                if (((Gallery) (obj)).dateCreate != null)
                {
                    return false;
                }
            } else
            if (!dateCreate.equals(((Gallery) (obj)).dateCreate))
            {
                return false;
            }
            if (dateUpdate == null)
            {
                if (((Gallery) (obj)).dateUpdate != null)
                {
                    return false;
                }
            } else
            if (!dateUpdate.equals(((Gallery) (obj)).dateUpdate))
            {
                return false;
            }
            if (description == null)
            {
                if (((Gallery) (obj)).description != null)
                {
                    return false;
                }
            } else
            if (!description.equals(((Gallery) (obj)).description))
            {
                return false;
            }
            if (galleryId == null)
            {
                if (((Gallery) (obj)).galleryId != null)
                {
                    return false;
                }
            } else
            if (!galleryId.equals(((Gallery) (obj)).galleryId))
            {
                return false;
            }
            if (galleryUrl == null)
            {
                if (((Gallery) (obj)).galleryUrl != null)
                {
                    return false;
                }
            } else
            if (!galleryUrl.equals(((Gallery) (obj)).galleryUrl))
            {
                return false;
            }
            if (ownerId == null)
            {
                if (((Gallery) (obj)).ownerId != null)
                {
                    return false;
                }
            } else
            if (!ownerId.equals(((Gallery) (obj)).ownerId))
            {
                return false;
            }
            if (photoCount != ((Gallery) (obj)).photoCount)
            {
                return false;
            }
            if (primaryPhotoId == null)
            {
                if (((Gallery) (obj)).primaryPhotoId != null)
                {
                    return false;
                }
            } else
            if (!primaryPhotoId.equals(((Gallery) (obj)).primaryPhotoId))
            {
                return false;
            }
            if (title == null)
            {
                if (((Gallery) (obj)).title != null)
                {
                    return false;
                }
            } else
            if (!title.equals(((Gallery) (obj)).title))
            {
                return false;
            }
            if (videoCount != ((Gallery) (obj)).videoCount)
            {
                return false;
            }
            if (viewsCount != ((Gallery) (obj)).viewsCount)
            {
                return false;
            }
        }
        return true;
    }

    public int getCommentsCount()
    {
        return commentsCount;
    }

    public Date getDateCreate()
    {
        return dateCreate;
    }

    public Date getDateUpdate()
    {
        return dateUpdate;
    }

    public String getDescription()
    {
        return description;
    }

    public String getGalleryId()
    {
        return galleryId;
    }

    public String getGalleryUrl()
    {
        return galleryUrl;
    }

    public String getOwnerId()
    {
        return ownerId;
    }

    public int getPhotoCount()
    {
        return photoCount;
    }

    public String getPrimaryPhotoId()
    {
        return primaryPhotoId;
    }

    public String getTitle()
    {
        return title;
    }

    public int getTotalCount()
    {
        return getPhotoCount() + getVideoCount();
    }

    public int getVideoCount()
    {
        return videoCount;
    }

    public int getViewsCount()
    {
        return viewsCount;
    }

    public int hashCode()
    {
        int l1 = 0;
        int i2 = commentsCount;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int j2;
        if (dateCreate == null)
        {
            i = 0;
        } else
        {
            i = dateCreate.hashCode();
        }
        if (dateUpdate == null)
        {
            j = 0;
        } else
        {
            j = dateUpdate.hashCode();
        }
        if (description == null)
        {
            k = 0;
        } else
        {
            k = description.hashCode();
        }
        if (galleryId == null)
        {
            l = 0;
        } else
        {
            l = galleryId.hashCode();
        }
        if (galleryUrl == null)
        {
            i1 = 0;
        } else
        {
            i1 = galleryUrl.hashCode();
        }
        if (ownerId == null)
        {
            j1 = 0;
        } else
        {
            j1 = ownerId.hashCode();
        }
        j2 = photoCount;
        if (primaryPhotoId == null)
        {
            k1 = 0;
        } else
        {
            k1 = primaryPhotoId.hashCode();
        }
        if (title != null)
        {
            l1 = title.hashCode();
        }
        return (((k1 + ((j1 + (i1 + (l + (k + (j + (i + (i2 + 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j2) * 31) * 31 + l1) * 31 + videoCount) * 31 + viewsCount;
    }

    public void setCommentsCount(int i)
    {
        commentsCount = i;
    }

    public void setDateCreate(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setDateCreate(new Date(Long.parseLong(s) * 1000L));
            return;
        }
    }

    public void setDateCreate(Date date)
    {
        dateCreate = date;
    }

    public void setDateUpdate(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setDateUpdate(new Date(Long.parseLong(s) * 1000L));
            return;
        }
    }

    public void setDateUpdate(Date date)
    {
        dateUpdate = date;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setGalleryId(String s)
    {
        galleryId = s;
    }

    public void setGalleryUrl(String s)
    {
        galleryUrl = s;
    }

    public void setOwnerId(String s)
    {
        ownerId = s;
    }

    public void setPhotoCount(int i)
    {
        photoCount = i;
    }

    public void setPrimaryPhotoId(String s)
    {
        primaryPhotoId = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setVideoCount(int i)
    {
        videoCount = i;
    }

    public void setViewsCount(int i)
    {
        viewsCount = i;
    }

    public String toString()
    {
        return (new StringBuilder("Gallery [galleryId=")).append(galleryId).append(", galleryUrl=").append(galleryUrl).append(", ownerId=").append(ownerId).append(", primaryPhotoId=").append(primaryPhotoId).append(", photoCount=").append(photoCount).append(", videoCount=").append(videoCount).append(", viewsCount=").append(viewsCount).append(", commentsCount=").append(commentsCount).append(", title=").append(title).append(", description=").append(description).append(", dateCreate=").append(dateCreate).append(", dateUpdate=").append(dateUpdate).append("]").toString();
    }
}
