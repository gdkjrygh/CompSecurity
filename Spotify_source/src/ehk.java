// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Arrays;

public final class ehk
    implements egu, egw
{

    egx a;
    private final ehm b;
    private final egv c;
    private final SparseArray d = new SparseArray();
    private final ehl e = new ehl() {

        private ehk a;

        public final void a(ehn ehn1)
        {
            if (a.a != null)
            {
                String s = ehn1.a(1);
                ehn1 = (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails)ehn1.a(2, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$HelloDetails);
                a.a.a(s, ehn1);
            }
        }

            
            {
                a = ehk.this;
                super();
            }
    };
    private final ehl f = new ehl() {

        private ehk a;

        public final void a(ehn ehn1)
        {
            if (a.a != null)
            {
                ehn1 = ehn1.a(1);
                a.a.a(ehn1);
            }
        }

            
            {
                a = ehk.this;
                super();
            }
    };
    private final ehl g = new ehl() {

        private ehk a;

        public final void a(ehn ehn1)
        {
            if (a.a != null)
            {
                int j = ehn1.b();
                ehn1 = ehn1.a(3);
                a.a.a(j, ehn1);
            }
        }

            
            {
                a = ehk.this;
                super();
            }
    };
    private final ehl h = new ehl() {

        private ehk a;

        public final void a(ehn ehn1)
        {
            String s;
            int j;
label0:
            {
                if (a.a != null)
                {
                    j = ehn1.b();
                    s = ehn1.a(3);
                    if (!"com.spotify.get_image".equals(s))
                    {
                        break label0;
                    }
                    a.a.a(j);
                }
                return;
            }
            if ("com.spotify.get_thumbnail_image".equals(s))
            {
                a.a.a(j, (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$Identifier));
                return;
            }
            if ("com.spotify.get_current_track".equals(s))
            {
                a.a.b(j);
                return;
            }
            if ("com.spotify.set_playback_speed".equals(s))
            {
                ehn1 = (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$PlaybackSpeed);
                a.a.a(j, ehn1);
                return;
            }
            if ("com.spotify.get_playback_speed".equals(s))
            {
                a.a.j(j);
                return;
            }
            if ("com.spotify.skip_next".equals(s))
            {
                a.a.d(j);
                return;
            }
            if ("com.spotify.skip_previous".equals(s))
            {
                a.a.e(j);
                return;
            }
            if ("com.spotify.get_track_elapsed".equals(s))
            {
                a.a.c(j);
                return;
            }
            if ("com.spotify.get_shuffle".equals(s))
            {
                a.a.f(j);
                return;
            }
            if ("com.spotify.set_shuffle".equals(s))
            {
                a.a.a(j, (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$Shuffle));
                return;
            }
            if ("com.spotify.get_repeat".equals(s))
            {
                a.a.g(j);
                return;
            }
            if ("com.spotify.set_repeat".equals(s))
            {
                a.a.a(j, (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$Repeat));
                return;
            }
            if ("com.spotify.get_saved".equals(s))
            {
                a.a.i(j);
                return;
            }
            if ("com.spotify.set_saved".equals(s))
            {
                a.a.a(j, (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$Saved));
                return;
            }
            if ("com.spotify.get_rating".equals(s))
            {
                a.a.h(j);
                return;
            }
            if ("com.spotify.set_rating".equals(s))
            {
                a.a.a(j, (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$Rating));
                return;
            }
            if ("com.spotify.get_recommended_root_items".equals(s))
            {
                a.a.k(j);
                return;
            }
            if ("com.spotify.get_children_of_item".equals(s))
            {
                a.a.a(j, (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChildrenPageRequest)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$ChildrenPageRequest));
                return;
            }
            if ("com.spotify.get_current_context".equals(s))
            {
                a.a.l(j);
                return;
            }
            if ("com.spotify.play_item".equals(s))
            {
                a.a.b(j, (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$Identifier));
                return;
            }
            if ("com.spotify.play_spotify_track_uri".equals(s))
            {
                a.a.a(j, (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Uri)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$Uri));
                return;
            }
            if ("com.spotify.start_radio".equals(s))
            {
                a.a.c(j, (com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier)ehn1.a(5, com/spotify/mobile/android/spotlets/appprotocol/model/AppProtocol$Identifier));
                return;
            } else
            {
                Logger.a("Call not supported %s. Ignored", new Object[] {
                    s
                });
                return;
            }
        }

            
            {
                a = ehk.this;
                super();
            }
    };
    private ehl i;

    public ehk(ehm ehm1, egv egv1)
    {
        i = new ehl() {

            private ehk a;

            public final void a(ehn ehn1)
            {
                a.a.a();
            }

            
            {
                a = ehk.this;
                super();
            }
        };
        b = ehm1;
        c = egv1;
        d.put(1, e);
        d.put(5, f);
        d.put(32, g);
        d.put(48, h);
        d.put(6, i);
        egv1.a(this);
    }

    private static void a(Exception exception)
    {
        exception.getMessage();
        Assertion.a(exception.getMessage(), exception);
    }

    private void a(Object aobj[])
    {
        Arrays.toString(aobj);
        try
        {
            aobj = b.a(Arrays.asList(aobj));
            c.a(aobj.length, ((byte []) (aobj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            a(((Exception) (aobj)));
        }
    }

    public final void a()
    {
        c.a(null);
        c.close();
    }

    public final void a(int j)
    {
        a(new Object[] {
            Integer.valueOf(50), Integer.valueOf(j), AppProtocol.b, AppProtocol.b
        });
    }

    public final void a(int j, int k)
    {
        a(new Object[] {
            Integer.valueOf(33), Integer.valueOf(j), Integer.valueOf(k)
        });
    }

    public final void a(int j, int k, Object obj)
    {
        a(new Object[] {
            Integer.valueOf(36), Integer.valueOf(j), Integer.valueOf(k), AppProtocol.b, AppProtocol.c, obj
        });
    }

    public final void a(int j, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Image image)
    {
        a(new Object[] {
            Integer.valueOf(50), Integer.valueOf(j), new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Empty(), image
        });
    }

    public final void a(int j, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.WelcomeDetails welcomedetails)
    {
        a(new Object[] {
            Integer.valueOf(2), Integer.valueOf(j), welcomedetails
        });
    }

    public final void a(int j, Object obj)
    {
        a(new Object[] {
            Integer.valueOf(50), Integer.valueOf(j), AppProtocol.b, obj
        });
    }

    public final void a(int j, Object obj, String s)
    {
        a(new Object[] {
            Integer.valueOf(8), Integer.valueOf(32), Integer.valueOf(j), obj, s
        });
    }

    public final void a(com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message message)
    {
        a(new Object[] {
            Integer.valueOf(3), message, "wamp.error"
        });
    }

    public final void a(com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData trackdata, int j)
    {
        a(new Object[] {
            Integer.valueOf(50), Integer.valueOf(j), new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Empty(), trackdata
        });
    }

    public final void a(egx egx)
    {
        a = egx;
    }

    public final void a(String s, com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChallengeDetails challengedetails)
    {
        a(new Object[] {
            Integer.valueOf(4), s, challengedetails
        });
    }

    public final void a(byte abyte0[])
    {
        abyte0 = b.a(abyte0);
        ehl ehl1 = (ehl)d.get(abyte0.a());
        if (ehl1 != null)
        {
            try
            {
                ehl1.getClass().getSimpleName();
                abyte0.a();
                ehl1.a(abyte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
            break MISSING_BLOCK_LABEL_78;
        }
        Logger.a("Cannot handle action %d", new Object[] {
            Integer.valueOf(abyte0.a())
        });
        return;
        try
        {
            a(((Exception) (abyte0)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a(((Exception) (abyte0)));
        }
        return;
    }

    public final void b(com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message message)
    {
        a(new Object[] {
            Integer.valueOf(6), message, "wamp.error.system_shutdown"
        });
    }
}
