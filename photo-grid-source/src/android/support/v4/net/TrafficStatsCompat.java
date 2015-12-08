// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;

import java.net.Socket;

public class TrafficStatsCompat
{

    private static final TrafficStatsCompatImpl IMPL;

    public TrafficStatsCompat()
    {
    }

    public static void clearThreadStatsTag()
    {
        IMPL.clearThreadStatsTag();
    }

    public static int getThreadStatsTag()
    {
        return IMPL.getThreadStatsTag();
    }

    public static void incrementOperationCount(int i)
    {
        IMPL.incrementOperationCount(i);
    }

    public static void incrementOperationCount(int i, int j)
    {
        IMPL.incrementOperationCount(i, j);
    }

    public static void setThreadStatsTag(int i)
    {
        IMPL.setThreadStatsTag(i);
    }

    public static void tagSocket(Socket socket)
    {
        IMPL.tagSocket(socket);
    }

    public static void untagSocket(Socket socket)
    {
        IMPL.untagSocket(socket);
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

    private class TrafficStatsCompatImpl
    {

        public abstract void clearThreadStatsTag();

        public abstract int getThreadStatsTag();

        public abstract void incrementOperationCount(int i);

        public abstract void incrementOperationCount(int i, int j);

        public abstract void setThreadStatsTag(int i);

        public abstract void tagSocket(Socket socket);

        public abstract void untagSocket(Socket socket);
    }


    private class IcsTrafficStatsCompatImpl
        implements TrafficStatsCompatImpl
    {

        public void clearThreadStatsTag()
        {
            TrafficStatsCompatIcs.clearThreadStatsTag();
        }

        public int getThreadStatsTag()
        {
            return TrafficStatsCompatIcs.getThreadStatsTag();
        }

        public void incrementOperationCount(int i)
        {
            TrafficStatsCompatIcs.incrementOperationCount(i);
        }

        public void incrementOperationCount(int i, int j)
        {
            TrafficStatsCompatIcs.incrementOperationCount(i, j);
        }

        public void setThreadStatsTag(int i)
        {
            TrafficStatsCompatIcs.setThreadStatsTag(i);
        }

        public void tagSocket(Socket socket)
        {
            TrafficStatsCompatIcs.tagSocket(socket);
        }

        public void untagSocket(Socket socket)
        {
            TrafficStatsCompatIcs.untagSocket(socket);
        }

        IcsTrafficStatsCompatImpl()
        {
        }
    }


    private class BaseTrafficStatsCompatImpl
        implements TrafficStatsCompatImpl
    {

        private ThreadLocal mThreadSocketTags;

        public void clearThreadStatsTag()
        {
            ((SocketTags)mThreadSocketTags.get()).statsTag = -1;
        }

        public int getThreadStatsTag()
        {
            return ((SocketTags)mThreadSocketTags.get()).statsTag;
        }

        public void incrementOperationCount(int i)
        {
        }

        public void incrementOperationCount(int i, int j)
        {
        }

        public void setThreadStatsTag(int i)
        {
            ((SocketTags)mThreadSocketTags.get()).statsTag = i;
        }

        public void tagSocket(Socket socket)
        {
        }

        public void untagSocket(Socket socket)
        {
        }

        BaseTrafficStatsCompatImpl()
        {
            class _cls1 extends ThreadLocal
            {

                final BaseTrafficStatsCompatImpl this$0;

                protected SocketTags initialValue()
                {
                    class SocketTags
                    {

                        public int statsTag;

                            private SocketTags()
                            {
                                statsTag = -1;
                            }

                            SocketTags(_cls1 _pcls1)
                            {
                                this();
                            }
                    }

                    return new SocketTags(null);
                }

                protected volatile Object initialValue()
                {
                    return initialValue();
                }

                _cls1()
                {
                    this$0 = BaseTrafficStatsCompatImpl.this;
                    super();
                }
            }

            mThreadSocketTags = new _cls1();
        }
    }

}
