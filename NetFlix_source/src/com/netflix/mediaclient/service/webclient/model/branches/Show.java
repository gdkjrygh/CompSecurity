// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.branches;

import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.branches:
//            Video

public class Show extends Video
{

    public Video.Bookmark bookmark;
    public Video.BookmarkStill bookmarkStill;
    public Video.Detail detail;
    public Video.InQueue inQueue;
    public Video.Rating rating;
    public SocialEvidence socialEvidence;
    public Video.Summary summary;

    public Show()
    {
    }
}
