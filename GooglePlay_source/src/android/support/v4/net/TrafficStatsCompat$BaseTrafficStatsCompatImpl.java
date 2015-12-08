// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;


// Referenced classes of package android.support.v4.net:
//            TrafficStatsCompat

static final class SocketTags
    implements SocketTags
{
    private static final class SocketTags
    {

        public int statsTag;

        private SocketTags()
        {
            statsTag = -1;
        }

        SocketTags(byte byte0)
        {
            this();
        }
    }


    private ThreadLocal mThreadSocketTags;

    public final void clearThreadStatsTag()
    {
        ((SocketTags)mThreadSocketTags.get()).statsTag = -1;
    }

    public final void setThreadStatsTag(int i)
    {
        ((SocketTags)mThreadSocketTags.get()).statsTag = i;
    }

    _cls1.this._cls0()
    {
        mThreadSocketTags = new ThreadLocal() {

            final TrafficStatsCompat.BaseTrafficStatsCompatImpl this$0;

            protected final volatile Object initialValue()
            {
                return new SocketTags((byte)0);
            }

            
            {
                this$0 = TrafficStatsCompat.BaseTrafficStatsCompatImpl.this;
                super();
            }
        };
    }
}
