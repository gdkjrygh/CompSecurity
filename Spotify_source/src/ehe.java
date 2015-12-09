// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.image.ImageFormat;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.model.MessageValidator;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class ehe
    implements egx
{

    private static AtomicInteger a = new AtomicInteger();
    private final egu b;
    private final MediaService c;
    private final boolean d;
    private final int e;
    private final Map f;
    private final ebe g;
    private com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails h;
    private Handler i;
    private String j;
    private ebz k;
    private ebz l;
    private final ObjectMapper m;

    public ehe(egu egu1, MediaService mediaservice, Handler handler)
    {
        this(egu1, mediaservice, handler, true);
    }

    public ehe(egu egu1, MediaService mediaservice, Handler handler, boolean flag)
    {
        e = a.incrementAndGet();
        f = new HashMap();
        b = egu1;
        c = mediaservice;
        d = flag;
        new MessageValidator();
        dmz.a(eca);
        j = (new StringBuilder()).append(e).append("_root").toString();
        g = new ebe(c, j);
        c.a.a(new ebi[] {
            g
        });
        b.a(this);
        i = handler;
        m = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    static com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItems a(List list, int i1, int j1)
    {
        int k1 = j1;
        if (j1 == 0)
        {
            k1 = 0x7fffffff;
        }
        if (i1 >= list.size() || k1 <= 0 || i1 < 0)
        {
            return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItems(k1, i1, list.size(), new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItem[0]);
        }
        ArrayList arraylist = new ArrayList();
        j1 = i1;
        while (j1 < i1 + k1 && j1 < list.size()) 
        {
            MediaBrowserItem mediabrowseritem = (MediaBrowserItem)list.get(j1);
            String s1 = mediabrowseritem.a;
            String s2 = mediabrowseritem.a;
            String s3 = String.valueOf(mediabrowseritem.e);
            String s4 = gei.a(mediabrowseritem.c, Locale.getDefault());
            String s;
            if (mediabrowseritem.d == null)
            {
                s = "";
            } else
            {
                s = gei.a(mediabrowseritem.d, Locale.getDefault());
            }
            arraylist.add(new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItem(s1, s2, s3, s4, s, mediabrowseritem.b.equals(com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a), mediabrowseritem.b.equals(com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b)));
            j1++;
        }
        return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItems(k1, i1, list.size(), (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItem[])arraylist.toArray(new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItem[arraylist.size()]));
    }

    static egu a(ehe ehe1)
    {
        return ehe1.b;
    }

    private void a(int i1, int j1, int k1, Uri uri, ebz ebz1)
    {
        if (uri == null)
        {
            return;
        } else
        {
            ebz1.a(uri, new eby(j1, k1, i1) {

                private int a;
                private int b;
                private int c;
                private ehe d;

                public final void a(Uri uri1)
                {
                    String.valueOf(uri1);
                    ehe.a(d).a(c, new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message(String.format("Failed to load image %s", new Object[] {
                        uri1.toString()
                    })), "wamp.error");
                }

                public final void a(Uri uri1, byte abyte0[])
                {
                    uri1 = new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Image(abyte0, a, b);
                    ehe.a(d).a(c, uri1);
                }

            
            {
                d = ehe.this;
                a = i1;
                b = j1;
                c = k1;
                super();
            }
            });
            return;
        }
    }

    static MediaService b(ehe ehe1)
    {
        return ehe1.c;
    }

    private void c()
    {
        Object obj = h.info;
        ehj ehj1;
        eha eha1;
        ehf ehf1;
        ehc ehc1;
        ehd ehd1;
        ehb ehb1;
        egy egy1;
        ehg ehg1;
        egt egt1;
        if ("car".equalsIgnoreCase(((com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Info) (obj)).category) || ((com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Info) (obj)).category == null)
        {
            c.a(new String[] {
                "car"
            });
        } else
        {
            obj = ((com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Info) (obj)).category;
        }
        obj = new egz(c, b);
        ehj1 = new ehj(c, b);
        eha1 = new eha(c, b);
        ehf1 = new ehf(c, b);
        ehc1 = new ehc(c, b);
        ehd1 = new ehd(c, b);
        ehb1 = new ehb(c, b);
        egy1 = new egy(c, b);
        ehg1 = new ehg(c, b);
        egt1 = new egt(c, b);
        f.put("com.spotify.current_track", obj);
        f.put("com.spotify.track_elapsed", ehj1);
        f.put("com.spotify.playback_speed", eha1);
        f.put("com.spotify.shuffle", ehf1);
        f.put("com.spotify.repeat", ehc1);
        f.put("com.spotify.saved", ehd1);
        f.put("com.spotify.rating", ehb1);
        f.put("com.spotify.current_context", egy1);
        f.put("com.spotify.status", ehg1);
        f.put("com.spotify.alert", egt1);
        ((egz) (obj)).e();
        ehj1.e();
        eha1.e();
        ehf1.e();
        ehc1.e();
        ehd1.e();
        ehb1.e();
        egy1.e();
        ehg1.e();
        b.a(e, AppProtocol.d);
    }

    private void d()
    {
        if (k != null)
        {
            k.f = true;
        }
        if (l != null)
        {
            l.f = true;
        }
        for (Iterator iterator = f.values().iterator(); iterator.hasNext(); ((ehi)iterator.next()).c()) { }
        if ("car".equalsIgnoreCase(h.info.category) || h.info.category == null)
        {
            c.b(new String[] {
                "car"
            });
            return;
        } else
        {
            String s = h.info.category;
            return;
        }
    }

    public final void a()
    {
        d();
    }

    public final void a(int i1)
    {
        Object obj = c.g;
        if (obj != null && ((PlayerState) (obj)).track() != null)
        {
            if (k != null)
            {
                k.f = true;
            }
            k = eca.a(ImageFormat.b, h.info.defaultImageWidth, h.info.defaultImageHeight);
            obj = (String)((PlayerState) (obj)).track().metadata().get("image_url");
            a(i1, h.info.defaultImageWidth, h.info.defaultImageHeight, dto.a(((String) (obj))), k);
        }
    }

    public final void a(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChildrenPageRequest childrenpagerequest)
    {
        i.post(new Runnable(childrenpagerequest, i1) {

            final com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChildrenPageRequest a;
            final int b;
            final ehe c;

            public final void run()
            {
                ehe.b(c).a.a(a.parentId, new ebg(this) {

                    private _cls3 a;

                    public final void a(Throwable throwable)
                    {
                        Logger.b(throwable, "Could not load %s", new Object[] {
                            a.a.parentId
                        });
                    }

                    public final void a(List list)
                    {
                        egu egu1 = ehe.a(a.c);
                        int j1 = a.b;
                        int k1 = a.a.offset;
                        int i1;
                        if (a.a.limit == null)
                        {
                            i1 = 20;
                        } else
                        {
                            i1 = a.a.limit.intValue();
                        }
                        egu1.a(j1, ehe.a(list, k1, i1));
                    }

            
            {
                a = _pcls3;
                super();
            }
                });
            }

            
            {
                c = ehe.this;
                a = childrenpagerequest;
                b = i1;
                super();
            }
        });
    }

    public final void a(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier identifier)
    {
        try
        {
            MessageValidator.a(identifier);
            if (l == null)
            {
                l = eca.a(ImageFormat.b, h.info.defaultThumbnailImageWidth, h.info.defaultThumbnailImageHeight);
            }
            identifier = identifier.id;
            a(i1, h.info.defaultThumbnailImageWidth, h.info.defaultThumbnailImageHeight, Uri.parse(identifier), l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier identifier)
        {
            b.a(i1, identifier.a(), "wamp.error.invalid_argument");
        }
    }

    public final void a(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed playbackspeed)
    {
        if (playbackspeed.playbackSpeed != 0) goto _L2; else goto _L1
_L1:
        c.g();
_L4:
        b.a(i1);
        return;
_L2:
        if (playbackspeed.playbackSpeed == 1)
        {
            c.f();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating rating)
    {
        rating.rating;
        JVM INSTR tableswitch -1 1: default 32
    //                   -1 60
    //                   0 32
    //                   1 43;
           goto _L1 _L2 _L1 _L3
_L1:
        b.a(i1);
        return;
_L3:
        c.a(MediaAction.g.name());
        continue; /* Loop/switch isn't completed */
_L2:
        c.a(MediaAction.i.name());
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat repeat)
    {
        repeat.repeat;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 66
    //                   1 76
    //                   2 86;
           goto _L1 _L2 _L3 _L4
_L1:
        Assertion.a((new StringBuilder("Unexpected repeat ")).append(repeat.repeat).toString());
_L6:
        b.a(i1);
        return;
_L2:
        c.l();
        continue; /* Loop/switch isn't completed */
_L3:
        c.m();
        continue; /* Loop/switch isn't completed */
_L4:
        c.n();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved saved)
    {
        if (saved.saved)
        {
            c.a(MediaAction.l.name());
        } else
        {
            c.a(MediaAction.m.name());
        }
        b.a(i1);
    }

    public final void a(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle shuffle)
    {
        if (shuffle.shuffle)
        {
            c.j();
        } else
        {
            c.k();
        }
        b.a(i1);
    }

    public final void a(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Uri uri)
    {
        c.a(com.spotify.mobile.android.provider.Metadata.Track.a(uri.uri));
        b.a(i1);
    }

    public final void a(int i1, String s)
    {
        MessageValidator.a(0x7fffffff, i1, "request id");
        MessageValidator.a(s, "uri");
        s = (ehi)f.get(s);
        if (s != null)
        {
            try
            {
                s.a(i1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                b.a(i1, s.a(), "wamp.error.invalid_argument");
            }
            break MISSING_BLOCK_LABEL_73;
        }
        b.a(i1, (int)System.currentTimeMillis());
        return;
    }

    public final void a(String s)
    {
        try
        {
            MessageValidator.a(s, "signature");
            c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a(s.a());
        }
    }

    public final void a(String s, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails hellodetails)
    {
        int j1;
        MessageValidator.a("spotify", s, "uri");
        MessageValidator.a(hellodetails, "info", "details");
        MessageValidator.a(Integer.valueOf(1), Integer.valueOf(hellodetails.info.protocolVersion), "protocol version");
        MessageValidator.a(hellodetails.info.name, "name");
        MessageValidator.a(hellodetails.info.id, "id");
        MessageValidator.a(10000, hellodetails.info.defaultImageWidth, "default image width");
        MessageValidator.a(10000, hellodetails.info.defaultImageHeight, "default image height");
        MessageValidator.a(10000, hellodetails.info.defaultThumbnailImageWidth, "default thumbnail image width");
        MessageValidator.a(10000, hellodetails.info.defaultThumbnailImageHeight, "default thumbnail image height");
        MessageValidator.a(hellodetails.roles, "subscriber", "roles");
        MessageValidator.a(hellodetails.roles, "caller", "roles");
        if (!d)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        MessageValidator.a(hellodetails.authid, "authid");
        MessageValidator.a(hellodetails.authmethods, "authmethods");
        s = hellodetails.authmethods;
        j1 = s.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                break;
            }
            String s1 = s[i1];
            try
            {
                MessageValidator.b(s1, s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Logger.c(s.getMessage(), new Object[0]);
                b.a(s.a());
                return;
            }
            i1++;
        } while (true);
        h = hellodetails;
        if (hellodetails.authmethods != null)
        {
            s = new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChallengeDetails();
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Challenge challenge = new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Challenge();
            challenge.nonce = "dummy_nonce";
            challenge.timestamp = gcy.a(Calendar.getInstance());
            challenge.authid = hellodetails.authid;
            challenge.authmethod = hellodetails.authmethods[0];
            try
            {
                s.challenge = m.writeValueAsString(challenge);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                b.a(new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message("could not create challenge"));
                return;
            }
            b.a(hellodetails.authmethods[0], s);
            return;
        } else
        {
            c();
            return;
        }
    }

    public final void b()
    {
        d();
        for (Iterator iterator = f.values().iterator(); iterator.hasNext(); ((ehi)iterator.next()).d()) { }
        c.a.b(new ebi[] {
            g
        });
        b.b(new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message("App service stopping"));
        b.a();
    }

    public final void b(int i1)
    {
        b.a(egz.a(c), i1);
    }

    public final void b(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier identifier)
    {
        c.a(Uri.parse(identifier.id));
        b.a(i1);
    }

    public final void c(int i1)
    {
        com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackElapsed trackelapsed = ehj.b(c.g);
        b.a(i1, trackelapsed);
    }

    public final void c(int i1, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier identifier)
    {
        if (identifier == null || TextUtils.isEmpty(identifier.id))
        {
            c.c();
        } else
        {
            c.b(identifier.id);
        }
        b.a(i1);
    }

    public final void d(int i1)
    {
        c.i();
        b.a(i1);
    }

    public final void e(int i1)
    {
        c.h();
        b.a(i1);
    }

    public final void f(int i1)
    {
        com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle shuffle = ehf.b(c.g);
        b.a(i1, shuffle);
    }

    public final void g(int i1)
    {
        com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat repeat = ehc.b(c.g);
        b.a(i1, repeat);
    }

    public final void h(int i1)
    {
        com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating rating = ehb.a(c.c);
        b.a(i1, rating);
    }

    public final void i(int i1)
    {
        com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved saved = ehd.a(c.d);
        b.a(i1, saved);
    }

    public final void j(int i1)
    {
        com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed playbackspeed = eha.b(c.g);
        b.a(i1, playbackspeed);
    }

    public final void k(int i1)
    {
        if (j == null)
        {
            Logger.b("Root not set", new Object[0]);
            return;
        } else
        {
            c.a.a(j, new ebg(i1) {

                private int a;
                private ehe b;

                public final void a(Throwable throwable)
                {
                }

                public final void a(List list)
                {
                    ehe.a(b).a(a, ehe.a(list, 0, list.size()));
                }

            
            {
                b = ehe.this;
                a = i1;
                super();
            }
            });
            return;
        }
    }

    public final void l(int i1)
    {
        c.a(new eat(i1) {

            private int a;
            private ehe b;

            public final void a(ezs ezs, PlayerState playerstate)
            {
                if (ezs == null)
                {
                    ehe.a(b).a(a, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Context.EMPTY);
                    return;
                } else
                {
                    ehe.a(b).a(a, egy.a(ezs, playerstate, ehe.b(b), ehe.b(b).b));
                    return;
                }
            }

            
            {
                b = ehe.this;
                a = i1;
                super();
            }
        });
    }

}
