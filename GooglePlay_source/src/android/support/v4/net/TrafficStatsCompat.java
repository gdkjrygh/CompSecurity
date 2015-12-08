// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;

import android.net.TrafficStats;

public final class TrafficStatsCompat
{
    static final class BaseTrafficStatsCompatImpl
        implements TrafficStatsCompatImpl
    {

        private ThreadLocal mThreadSocketTags;

        public final void clearThreadStatsTag()
        {
            ((SocketTags)mThreadSocketTags.get()).statsTag = -1;
        }

        public final void setThreadStatsTag(int i)
        {
            ((SocketTags)mThreadSocketTags.get()).statsTag = i;
        }

        BaseTrafficStatsCompatImpl()
        {
            mThreadSocketTags = new _cls1();
        }
    }

    private static final class BaseTrafficStatsCompatImpl.SocketTags
    {

        public int statsTag;

        private BaseTrafficStatsCompatImpl.SocketTags()
        {
            statsTag = -1;
        }

        BaseTrafficStatsCompatImpl.SocketTags(byte byte0)
        {
            this();
        }
    }

    static final class IcsTrafficStatsCompatImpl
        implements TrafficStatsCompatImpl
    {

        public final void clearThreadStatsTag()
        {
            TrafficStats.clearThreadStatsTag();
        }

        public final void setThreadStatsTag(int i)
        {
            TrafficStats.setThreadStatsTag(i);
        }

        IcsTrafficStatsCompatImpl()
        {
        }
    }

    static interface TrafficStatsCompatImpl
    {

        public abstract void clearThreadStatsTag();

        public abstract void setThreadStatsTag(int i);
    }


    private static final TrafficStatsCompatImpl IMPL;

    public static void clearThreadStatsTag()
    {
        IMPL.clearThreadStatsTag();
    }

    public static void setThreadStatsTag(int i)
    {
        IMPL.setThreadStatsTag(i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new IcsTrafficStatsCompatImpl();
        } else
        {
            IMPL = new BaseTrafficStatsCompatImpl();
        }
    }

    // Unreferenced inner class android/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$1

/* anonymous class */
    final class BaseTrafficStatsCompatImpl._cls1 extends ThreadLocal
    {

        final BaseTrafficStatsCompatImpl this$0;

        protected final volatile Object initialValue()
        {
            return new BaseTrafficStatsCompatImpl.SocketTags((byte)0);
        }

            
            {
                this$0 = BaseTrafficStatsCompatImpl.this;
                super();
            }
    }

}
