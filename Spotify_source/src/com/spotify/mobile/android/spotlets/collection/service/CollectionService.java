// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import android.app.IntentService;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.collection.model.ModificationModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dfi;
import dfj;
import dmz;
import fiy;
import fop;
import fyw;
import ggc;
import gng;
import gni;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.service:
//            Items

public class CollectionService extends IntentService
{

    private ObjectMapper a;

    public CollectionService()
    {
        super("CollectionService");
        a = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public static void a(Context context, Intent intent)
    {
        Assertion.a(intent);
        Assertion.a("com.spotify.mobile.android.spotlets.collection.cosmos.service.COLLECTION_ERROR".equals(intent.getAction()), "handleError() can only be called with an intent containing the com.spotify.mobile.android.spotlets.collection.cosmos.service.COLLECTION_ERROR action.");
        Object obj = Result.values()[intent.getIntExtra("result", Result.d.ordinal())];
        Assertion.a(Result.c.equals(obj), (new StringBuilder("handleError() does not support the ")).append(obj).append(" error.").toString());
        intent = fyw.a(intent);
        dmz.a(fop);
        obj = new dfj(context, 0x7f0b017f);
        ((dfj) (obj)).a(0x7f08019d);
        int i;
        if (fiy.a(intent))
        {
            i = 0x7f08019b;
        } else
        {
            i = 0x7f08019a;
        }
        ((dfj) (obj)).b(i);
        ((dfj) (obj)).a(0x7f08019c, new android.content.DialogInterface.OnClickListener(context) {

            private Context a;

            public final void onClick(DialogInterface dialoginterface, int j)
            {
                fop.a(a, ViewUri.bj, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.T));
                dialoginterface.dismiss();
            }

            
            {
                a = context;
                super();
            }
        });
        ((dfj) (obj)).a(true);
        ((dfj) (obj)).b().show();
        fop.a(context, ViewUri.bj, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.T));
    }

    public static void a(Context context, String s, String s1, Flags flags, Messaging messaging)
    {
        String as[] = new String[1];
        as[0] = s;
        if (!a(as))
        {
            Assertion.a("Unsupported link type to add(), or no uris at all.");
            return;
        } else
        {
            a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD", as, s1, flags, messaging);
            return;
        }
    }

    private static void a(Context context, String s, String as[], String s1, Flags flags, Messaging messaging)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/spotlets/collection/service/CollectionService);
        intent.putExtra("uris", as);
        intent.putExtra("source", s1);
        intent.putExtra("messaging", messaging.ordinal());
        intent.setAction(s);
        if (flags == null)
        {
            boolean flag;
            if (messaging == Messaging.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertion.a(flag, "You can only supply a null flags object if you don't want to show any message.");
        } else
        {
            fyw.a(intent, flags);
        }
        context.startService(intent);
    }

    static void a(CollectionService collectionservice, Messaging messaging, Result result, Flags flags, com.spotify.mobile.android.util.SpotifyLink.LinkType linktype)
    {
        if (messaging != Messaging.a)
        {
            if (result == Result.a && messaging == Messaging.c)
            {
                if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ)
                {
                    ((ggc)dmz.a(ggc)).a(collectionservice, true);
                } else
                {
                    ggc ggc1 = (ggc)dmz.a(ggc);
                    SpotifyIcon spotifyicon = SpotifyIcon.i;
                    int i;
                    if (fiy.a(flags))
                    {
                        i = 0x7f08056a;
                    } else
                    {
                        i = 0x7f080569;
                    }
                    ggc1.a(collectionservice, spotifyicon, i);
                }
            }
            if (result == Result.b && messaging == Messaging.c)
            {
                if (linktype == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ)
                {
                    ((ggc)dmz.a(ggc)).a(collectionservice, false);
                } else
                {
                    ((ggc)dmz.a(ggc)).a(collectionservice, flags);
                }
            }
            if (result == Result.c && (messaging == Messaging.c || messaging == Messaging.b))
            {
                messaging = new Intent();
                messaging.setAction("com.spotify.mobile.android.spotlets.collection.cosmos.service.COLLECTION_ERROR");
                messaging.putExtra("result", result.ordinal());
                fyw.a(messaging, flags);
                collectionservice.sendBroadcast(messaging);
            }
        }
    }

    private static boolean a(String as[])
    {
        for (int i = 0; i <= 0; i++)
        {
            com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(as[0])).c;
            if (linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.aT && linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.c && linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ && linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
            {
                return false;
            }
        }

        return true;
    }

    public static void b(Context context, String s, String s1, Flags flags, Messaging messaging)
    {
        String as[] = new String[1];
        as[0] = s;
        if (!a(as))
        {
            Assertion.a("Unsupported link type to remove(), or no uris at all.");
            return;
        } else
        {
            a(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE", as, s1, flags, messaging);
            return;
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        boolean flag = false;
        setTheme(0x7f0b017e);
        Assertion.a(intent);
        String s1 = intent.getAction();
        Items items = new Items();
        items.items = intent.getStringArrayExtra("uris");
        Assertion.a(items.items);
        if (items.items.length > 0)
        {
            flag = true;
        }
        Assertion.a(flag, "You must add/remove at least one item.");
        items.source = intent.getStringExtra("source");
        Messaging messaging = Messaging.values()[intent.getIntExtra("messaging", Messaging.a.ordinal())];
        String s;
        com.spotify.cosmos.android.DeferredResolver deferredresolver;
        if (messaging != Messaging.a)
        {
            intent = fyw.a(intent);
        } else
        {
            intent = null;
        }
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD".equals(s1))
        {
            s = "POST";
        } else
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE".equals(s1))
        {
            s = "DELETE";
        } else
        {
            Assertion.a((new StringBuilder("Unsupported action ")).append(s1).append(" in CollectionService.").toString());
            return;
        }
        deferredresolver = Cosmos.getResolver(this);
        deferredresolver.connect();
        try
        {
            Semaphore semaphore = new Semaphore(0);
            Handler handler = new Handler(getMainLooper());
            com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(items.items[0])).c;
            deferredresolver.resolve(new Request(s, "sp://core-collection/v1/items", new HashMap(), a.writeValueAsString(items).getBytes()), new JsonCallbackReceiver(handler, com/spotify/mobile/android/spotlets/collection/model/ModificationModel, messaging, s1, intent, linktype, semaphore) {

                private Messaging a;
                private String b;
                private Flags c;
                private com.spotify.mobile.android.util.SpotifyLink.LinkType d;
                private Semaphore e;
                private CollectionService f;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    CollectionService.a(f, a, Result.d, c, d);
                    e.release();
                }

                protected final void onResolved(Response response, Object obj)
                {
                    int i = response.getStatus();
                    if (i >= 200 && i <= 299)
                    {
                        obj = f;
                        Messaging messaging1 = a;
                        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD".equals(b))
                        {
                            response = Result.a;
                        } else
                        {
                            response = Result.b;
                        }
                        CollectionService.a(((CollectionService) (obj)), messaging1, response, c, d);
                    } else
                    {
                        obj = f;
                        Messaging messaging2 = a;
                        if (i == 507)
                        {
                            response = Result.c;
                        } else
                        {
                            response = Result.d;
                        }
                        CollectionService.a(((CollectionService) (obj)), messaging2, response, c, d);
                    }
                    e.release();
                }

            
            {
                f = CollectionService.this;
                a = messaging;
                b = s;
                c = flags;
                d = linktype;
                e = semaphore;
                super(handler, class1);
            }
            });
            semaphore.acquire();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Assertion.a("Failed to serialize item request.");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Assertion.a("Wait was interrupted.");
        }
        deferredresolver.destroy();
    }

    private class Result extends Enum
    {

        public static final Result a;
        public static final Result b;
        public static final Result c;
        public static final Result d;
        private static final Result e[];

        public static Result valueOf(String s)
        {
            return (Result)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/service/CollectionService$Result, s);
        }

        public static Result[] values()
        {
            return (Result[])e.clone();
        }

        static 
        {
            a = new Result("SUCCESS_ADDED", 0);
            b = new Result("SUCCESS_REMOVED", 1);
            c = new Result("ERROR_INSUFFICIENT_STORAGE", 2);
            d = new Result("UNKNOWN", 3);
            e = (new Result[] {
                a, b, c, d
            });
        }

        private Result(String s, int i)
        {
            super(s, i);
        }
    }


    private class Messaging extends Enum
    {

        public static final Messaging a;
        public static final Messaging b;
        public static final Messaging c;
        private static final Messaging d[];

        public static Messaging valueOf(String s)
        {
            return (Messaging)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/service/CollectionService$Messaging, s);
        }

        public static Messaging[] values()
        {
            return (Messaging[])d.clone();
        }

        static 
        {
            a = new Messaging("NONE", 0);
            b = new Messaging("ONLY_ERROR_DIALOG", 1);
            c = new Messaging("ALL", 2);
            d = (new Messaging[] {
                a, b, c
            });
        }

        private Messaging(String s, int i)
        {
            super(s, i);
        }
    }

}
