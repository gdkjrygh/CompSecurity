// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aliexpress.api.manage.pojo;


public class HotPatchUpdateResult
{
    public static class HotPatchUpdateInfo
    {

        public String fileName;
        public String md5;
        public String newFeature;
        public int pri;
        public long size;
        public String url;
        public String version;

        public HotPatchUpdateInfo()
        {
        }
    }


    public boolean available;
    public HotPatchUpdateInfo patchInfo;

    public HotPatchUpdateResult()
    {
    }
}
