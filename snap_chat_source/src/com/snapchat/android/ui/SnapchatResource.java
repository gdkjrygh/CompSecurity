// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


public class SnapchatResource
{
    public static final class ResourceStatus extends Enum
    {

        private static final ResourceStatus $VALUES[];
        public static final ResourceStatus LOADED;
        public static final ResourceStatus LOADING;
        public static final ResourceStatus LOADING_FAILED;
        public static final ResourceStatus NOT_LOADED;
        public static final ResourceStatus UNINITIALIZED;

        public static ResourceStatus valueOf(String s)
        {
            return (ResourceStatus)Enum.valueOf(com/snapchat/android/ui/SnapchatResource$ResourceStatus, s);
        }

        public static ResourceStatus[] values()
        {
            return (ResourceStatus[])$VALUES.clone();
        }

        static 
        {
            UNINITIALIZED = new ResourceStatus("UNINITIALIZED", 0);
            NOT_LOADED = new ResourceStatus("NOT_LOADED", 1);
            LOADING = new ResourceStatus("LOADING", 2);
            LOADED = new ResourceStatus("LOADED", 3);
            LOADING_FAILED = new ResourceStatus("LOADING_FAILED", 4);
            $VALUES = (new ResourceStatus[] {
                UNINITIALIZED, NOT_LOADED, LOADING, LOADED, LOADING_FAILED
            });
        }

        private ResourceStatus(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a(ResourceStatus resourcestatus);
    }


    private ResourceStatus a;
    public a b;

    public SnapchatResource()
    {
        a = ResourceStatus.UNINITIALIZED;
    }

    public final void a(ResourceStatus resourcestatus)
    {
        ResourceStatus resourcestatus1 = resourcestatus;
        if (resourcestatus == ResourceStatus.UNINITIALIZED)
        {
            resourcestatus1 = ResourceStatus.NOT_LOADED;
        }
        if (resourcestatus1 != a)
        {
            a = resourcestatus1;
            if (b != null)
            {
                b.a(a);
            }
        }
    }

    public final ResourceStatus c()
    {
        if (a == ResourceStatus.UNINITIALIZED)
        {
            return ResourceStatus.NOT_LOADED;
        } else
        {
            return a;
        }
    }
}
