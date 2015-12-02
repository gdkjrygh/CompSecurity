// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.ParserException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.hls:
//            HlsParserUtil, Subtitle, Variant, HlsMasterPlaylist, 
//            HlsMediaPlaylist, HlsPlaylist

public final class HlsPlaylistParser
    implements com.google.android.exoplayer.upstream.UriLoadable.Parser
{

    private static final Pattern a = Pattern.compile("BANDWIDTH=(\\d+)\\b");
    private static final Pattern b = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern c = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern d = Pattern.compile("#EXTINF:([\\d.]+)\\b");
    private static final Pattern e = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern f = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern g = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern h = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern i = Pattern.compile("METHOD=(NONE|AES-128)");
    private static final Pattern j = Pattern.compile("URI=\"(.+)\"");
    private static final Pattern k = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern l = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern m = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern n = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern o = HlsParserUtil.a("AUTOSELECT");
    private static final Pattern p = HlsParserUtil.a("DEFAULT");

    public HlsPlaylistParser()
    {
    }

    private static HlsMasterPlaylist a(LineIterator lineiterator, String s)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        int i1 = -1;
        int j1 = 0;
        int k1 = -1;
        String s1 = null;
        int l1 = 0;
        do
        {
            if (!lineiterator.a())
            {
                break;
            }
            Object obj = lineiterator.b();
            if (((String) (obj)).startsWith("#EXT-X-MEDIA"))
            {
                if ("SUBTITLES".equals(HlsParserUtil.a(((String) (obj)), l, "TYPE")))
                {
                    arraylist1.add(new Subtitle(HlsParserUtil.a(((String) (obj)), n, "NAME"), HlsParserUtil.a(((String) (obj)), j, "URI"), HlsParserUtil.a(((String) (obj)), m), HlsParserUtil.b(((String) (obj)), p), HlsParserUtil.b(((String) (obj)), o)));
                }
            } else
            if (((String) (obj)).startsWith("#EXT-X-STREAM-INF"))
            {
                l1 = HlsParserUtil.b(((String) (obj)), a, "BANDWIDTH");
                s1 = HlsParserUtil.a(((String) (obj)), b);
                obj = HlsParserUtil.a(((String) (obj)), c);
                boolean flag;
                if (obj != null)
                {
                    obj = ((String) (obj)).split("x");
                    i1 = Integer.parseInt(obj[0]);
                    k1 = i1;
                    if (i1 <= 0)
                    {
                        k1 = -1;
                    }
                    int i2 = Integer.parseInt(obj[1]);
                    j1 = k1;
                    i1 = i2;
                    if (i2 <= 0)
                    {
                        i1 = -1;
                        j1 = k1;
                    }
                } else
                {
                    j1 = -1;
                    i1 = -1;
                }
                flag = true;
                k1 = j1;
                j1 = ((flag) ? 1 : 0);
            } else
            if (!((String) (obj)).startsWith("#") && j1 != 0)
            {
                arraylist.add(new Variant(arraylist.size(), ((String) (obj)), l1, s1, k1, i1));
                i1 = -1;
                j1 = 0;
                k1 = -1;
                s1 = null;
                l1 = 0;
            }
        } while (true);
        return new HlsMasterPlaylist(s, Collections.unmodifiableList(arraylist), Collections.unmodifiableList(arraylist1));
    }

    public static HlsPlaylist a(String s, InputStream inputstream)
    {
        LinkedList linkedlist;
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
        linkedlist = new LinkedList();
_L2:
        String s1 = inputstream.readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        s1 = s1.trim();
        if (s1.isEmpty()) goto _L2; else goto _L1
_L1:
        if (!s1.startsWith("#EXT-X-STREAM-INF"))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        linkedlist.add(s1);
        s = a(new LineIterator(linkedlist, inputstream), s);
        inputstream.close();
        return s;
        if (!s1.startsWith("#EXT-X-TARGETDURATION") && !s1.startsWith("#EXT-X-MEDIA-SEQUENCE") && !s1.startsWith("#EXTINF") && !s1.startsWith("#EXT-X-KEY") && !s1.startsWith("#EXT-X-BYTERANGE") && !s1.equals("#EXT-X-DISCONTINUITY") && !s1.equals("#EXT-X-ENDLIST"))
        {
            break MISSING_BLOCK_LABEL_173;
        }
        linkedlist.add(s1);
        s = b(new LineIterator(linkedlist, inputstream), s);
        inputstream.close();
        return s;
        linkedlist.add(s1);
          goto _L2
        s;
        inputstream.close();
        throw s;
        inputstream.close();
        throw new ParserException("Failed to parse the playlist, could not identify any tags.");
    }

    private static HlsMediaPlaylist b(LineIterator lineiterator, String s)
    {
        double d1;
        String s1;
        String s2;
        ArrayList arraylist;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        long l2;
        boolean flag;
        boolean flag1;
        arraylist = new ArrayList();
        flag = false;
        l2 = 0L;
        k1 = -1;
        flag1 = false;
        s2 = null;
        i1 = 0;
        i2 = 1;
        l1 = 0;
        j2 = 0;
        j1 = 0;
        d1 = 0.0D;
        s1 = null;
_L3:
        String s4;
        while (lineiterator.a()) 
        {
            s4 = lineiterator.b();
            if (s4.startsWith("#EXT-X-TARGETDURATION"))
            {
                l1 = HlsParserUtil.b(s4, f, "#EXT-X-TARGETDURATION");
            } else
            if (s4.startsWith("#EXT-X-MEDIA-SEQUENCE"))
            {
                j2 = HlsParserUtil.b(s4, e, "#EXT-X-MEDIA-SEQUENCE");
                j1 = j2;
            } else
            if (s4.startsWith("#EXT-X-VERSION"))
            {
                i2 = HlsParserUtil.b(s4, g, "#EXT-X-VERSION");
            } else
            if (s4.startsWith("#EXTINF"))
            {
                d1 = HlsParserUtil.c(s4, d, "#EXTINF");
            } else
            if (s4.startsWith("#EXT-X-KEY"))
            {
                flag1 = "AES-128".equals(HlsParserUtil.a(s4, i, "METHOD"));
                if (flag1)
                {
                    s2 = HlsParserUtil.a(s4, j, "URI");
                    s1 = HlsParserUtil.a(s4, k);
                } else
                {
                    s2 = null;
                    s1 = null;
                }
            } else
            if (s4.startsWith("#EXT-X-BYTERANGE"))
            {
                String as[] = HlsParserUtil.a(s4, h, "#EXT-X-BYTERANGE").split("@");
                k1 = Integer.parseInt(as[0]);
                if (as.length > 1)
                {
                    i1 = Integer.parseInt(as[1]);
                }
            } else
            if (s4.equals("#EXT-X-DISCONTINUITY"))
            {
                flag = true;
            } else
            {
                if (s4.startsWith("#"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                String s3;
                if (!flag1)
                {
                    s3 = null;
                } else
                if (s1 != null)
                {
                    s3 = s1;
                } else
                {
                    s3 = Integer.toHexString(j1);
                }
                if (k1 == -1)
                {
                    i1 = 0;
                }
                arraylist.add(new HlsMediaPlaylist.Segment(s4, d1, flag, l2, flag1, s2, s3, i1, k1));
                l2 += (long)(1000000D * d1);
                flag = false;
                d1 = 0.0D;
                if (k1 != -1)
                {
                    i1 += k1;
                }
                k1 = -1;
                j1++;
            }
        }
        flag = true;
          goto _L1
        if (!s4.equals("#EXT-X-ENDLIST")) goto _L3; else goto _L2
_L2:
        flag = false;
_L5:
        return new HlsMediaPlaylist(s, j2, l1, i2, flag, Collections.unmodifiableList(arraylist));
_L1:
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final Object b(String s, InputStream inputstream)
    {
        return a(s, inputstream);
    }


    private class LineIterator
    {

        private final BufferedReader a;
        private final Queue b;
        private String c;

        public final boolean a()
        {
            if (c != null)
            {
                return true;
            }
            if (!b.isEmpty())
            {
                c = (String)b.poll();
                return true;
            }
            do
            {
                String s = a.readLine();
                c = s;
                if (s != null)
                {
                    c = c.trim();
                    if (!c.isEmpty())
                    {
                        return true;
                    }
                } else
                {
                    return false;
                }
            } while (true);
        }

        public final String b()
        {
            if (a())
            {
                String s = c;
                c = null;
                return s;
            } else
            {
                return null;
            }
        }

        public LineIterator(Queue queue, BufferedReader bufferedreader)
        {
            b = queue;
            a = bufferedreader;
        }
    }

}
