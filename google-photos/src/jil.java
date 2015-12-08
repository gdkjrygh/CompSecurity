// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class jil
    implements jjl, jjm
{

    private final Context a;
    private final Uri b;
    private final Map c = null;
    private final FileDescriptor d = null;
    private final long e = 0L;
    private final long f = 0L;
    private IOException g;
    private MediaExtractor h;
    private jjh i[];
    private boolean j;
    private int k;
    private int l[];
    private boolean m[];
    private long n;

    public jil(Context context, Uri uri, Map map)
    {
        boolean flag;
        if (jno.a >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        a = (Context)c.a(context);
        b = (Uri)c.a(uri);
    }

    private static final int a(MediaFormat mediaformat, String s)
    {
        if (mediaformat.containsKey(s))
        {
            return mediaformat.getInteger(s);
        } else
        {
            return -1;
        }
    }

    private static jjh a(MediaFormat mediaformat)
    {
        String s = mediaformat.getString("mime");
        Object obj;
        ArrayList arraylist;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (mediaformat.containsKey("language"))
        {
            obj = mediaformat.getString("language");
        } else
        {
            obj = null;
        }
        j1 = a(mediaformat, "max-input-size");
        k1 = a(mediaformat, "width");
        l1 = a(mediaformat, "height");
        i2 = a(mediaformat, "rotation-degrees");
        j2 = a(mediaformat, "channel-count");
        k2 = a(mediaformat, "sample-rate");
        arraylist = new ArrayList();
        for (int i1 = 0; mediaformat.containsKey((new StringBuilder(15)).append("csd-").append(i1).toString()); i1++)
        {
            ByteBuffer bytebuffer = mediaformat.getByteBuffer((new StringBuilder(15)).append("csd-").append(i1).toString());
            byte abyte0[] = new byte[bytebuffer.limit()];
            bytebuffer.get(abyte0);
            arraylist.add(abyte0);
            bytebuffer.flip();
        }

        long l2;
        if (mediaformat.containsKey("durationUs"))
        {
            l2 = mediaformat.getLong("durationUs");
        } else
        {
            l2 = -1L;
        }
        obj = new jjh(-1, s, -1, j1, l2, k1, l1, i2, -1F, j2, k2, ((String) (obj)), 0x7fffffffffffffffL, arraylist, false, -1, -1);
        obj.q = mediaformat;
        return ((jjh) (obj));
    }

    private void a(long l1, boolean flag)
    {
        int i1 = 0;
        if (flag || n != l1)
        {
            n = l1;
            h.seekTo(l1, 0);
            for (; i1 < l.length; i1++)
            {
                if (l[i1] != 0)
                {
                    m[i1] = true;
                }
            }

        }
    }

    public final int a(int i1, long l1, jji jji1, jjk jjk1, boolean flag)
    {
        c.b(j);
        boolean flag1;
        if (l[i1] != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c.b(flag1);
        if (m[i1])
        {
            m[i1] = false;
            return -5;
        }
        if (flag)
        {
            return -2;
        }
        if (l[i1] != 2)
        {
            jji1.a = i[i1];
            if (jno.a >= 18)
            {
                Map map = h.getPsshInfo();
                if (map == null || map.isEmpty())
                {
                    jjk1 = null;
                } else
                {
                    jjk1 = new jjz("video/mp4");
                    Iterator iterator = map.keySet().iterator();
                    while (iterator.hasNext()) 
                    {
                        UUID uuid = (UUID)iterator.next();
                        byte abyte0[] = (byte[])map.get(uuid);
                        int j1 = abyte0.length + 32;
                        ByteBuffer bytebuffer = ByteBuffer.allocate(j1);
                        bytebuffer.putInt(j1);
                        bytebuffer.putInt(jkx.N);
                        bytebuffer.putInt(0);
                        bytebuffer.putLong(uuid.getMostSignificantBits());
                        bytebuffer.putLong(uuid.getLeastSignificantBits());
                        bytebuffer.putInt(abyte0.length);
                        bytebuffer.put(abyte0);
                        jjk1.a(uuid, bytebuffer.array());
                    }
                }
            } else
            {
                jjk1 = null;
            }
            jji1.b = jjk1;
            l[i1] = 2;
            return -4;
        }
        int k1 = h.getSampleTrackIndex();
        if (k1 == i1)
        {
            if (jjk1.b != null)
            {
                i1 = jjk1.b.position();
                jjk1.c = h.readSampleData(jjk1.b, i1);
                jjk1.b.position(i1 + jjk1.c);
            } else
            {
                jjk1.c = 0;
            }
            jjk1.e = h.getSampleTime();
            jjk1.d = h.getSampleFlags() & 3;
            if (jjk1.a())
            {
                jji1 = jjk1.a;
                h.getSampleCryptoInfo(((jic) (jji1)).g);
                jji1.f = ((jic) (jji1)).g.numSubSamples;
                jji1.d = ((jic) (jji1)).g.numBytesOfClearData;
                jji1.e = ((jic) (jji1)).g.numBytesOfEncryptedData;
                jji1.b = ((jic) (jji1)).g.key;
                jji1.a = ((jic) (jji1)).g.iv;
                jji1.c = ((jic) (jji1)).g.mode;
            }
            n = -1L;
            h.advance();
            return -3;
        }
        return k1 >= 0 ? -2 : -1;
    }

    public final jjh a(int i1)
    {
        c.b(j);
        return i[i1];
    }

    public final jjm a()
    {
        k = k + 1;
        return this;
    }

    public final void a(int i1, long l1)
    {
        boolean flag1 = true;
        c.b(j);
        boolean flag;
        if (l[i1] == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        l[i1] = 1;
        h.selectTrack(i1);
        if (l1 != 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(l1, flag);
    }

    public final void a(long l1)
    {
        c.b(j);
        a(l1, false);
    }

    public final void b(int i1)
    {
        c.b(j);
        boolean flag;
        if (l[i1] != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        h.unselectTrack(i1);
        m[i1] = false;
        l[i1] = 0;
    }

    public final boolean b()
    {
        if (j)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        if (g != null)
        {
            return false;
        }
        h = new MediaExtractor();
        if (a == null) goto _L2; else goto _L1
_L1:
        h.setDataSource(a, b, c);
_L4:
        l = new int[h.getTrackCount()];
        m = new boolean[l.length];
        i = new jjh[l.length];
        for (int i1 = 0; i1 < l.length; i1++)
        {
            i[i1] = a(h.getTrackFormat(i1));
        }

        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            h.setDataSource(null, 0L, 0L);
        }
        catch (IOException ioexception)
        {
            g = ioexception;
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        j = true;
        return true;
    }

    public final boolean b(int i1, long l1)
    {
        return true;
    }

    public final int c()
    {
        c.b(j);
        return l.length;
    }

    public final void d()
    {
        if (g != null)
        {
            throw g;
        } else
        {
            return;
        }
    }

    public final long e()
    {
        c.b(j);
        long l1 = h.getCachedDuration();
        if (l1 == -1L)
        {
            return -1L;
        }
        long l2 = h.getSampleTime();
        if (l2 == -1L)
        {
            return -3L;
        } else
        {
            return l2 + l1;
        }
    }

    public final void f()
    {
        int i1;
        boolean flag;
        if (k > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        i1 = k - 1;
        k = i1;
        if (i1 == 0 && h != null)
        {
            h.release();
            h = null;
        }
    }
}
