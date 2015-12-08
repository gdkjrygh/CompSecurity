// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ConditionVariable;
import android.support.v4.util.g;
import com.skype.Account;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.concurrent.CompletableFuture;
import com.skype.android.concurrent.CompletedAsyncResult;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.util.cache.CompositeBitmapCache;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.util:
//            AccountLifetimeObject, ImageSource, GroupAvatarUtil, a, 
//            ConversationParticipantsUtil, HttpUtil

public class ImageCache extends AccountLifetimeObject
{
    static interface a
    {

        public abstract Bitmap a(Object obj);
    }


    private static final Logger a = Logger.getLogger("ImageCache");
    private AsyncService b;
    private Context c;
    private ConditionVariable d;
    private CompositeBitmapCache e;
    private int f;
    private ConversationParticipantsUtil g;
    private ObjectIdMap h;
    private Analytics i;

    public ImageCache(Application application, AsyncService asyncservice, HttpUtil httputil, ConversationParticipantsUtil conversationparticipantsutil, ObjectIdMap objectidmap, Analytics analytics)
    {
        b = asyncservice;
        c = application;
        g = conversationparticipantsutil;
        h = objectidmap;
        i = analytics;
        f = (((ActivityManager)application.getSystemService("activity")).getMemoryClass() / 4) * 1024 * 1024;
        e = new CompositeBitmapCache(f, httputil);
        d = new ConditionVariable();
    }

    static int a(ImageCache imagecache)
    {
        return imagecache.f;
    }

    static Bitmap a(ImageCache imagecache, String s, long l, byte abyte0[], int j)
    {
        return imagecache.a(s, l, abyte0, j);
    }

    private Bitmap a(ImageSource imagesource)
    {
        Bitmap bitmap = e.a(imagesource.getIdentity(), imagesource.getImageTimestamp());
        if (bitmap != null)
        {
            return bitmap;
        } else
        {
            return e.a(imagesource.getIdentity(), imagesource.getImageTimestamp(), imagesource.getImageData(), 0);
        }
    }

    private Bitmap a(String s, long l, byte abyte0[], int j)
    {
        Bitmap bitmap = e.a(s, l);
        if (bitmap != null)
        {
            return bitmap;
        } else
        {
            return e.a(s, l, abyte0, j);
        }
    }

    static Bitmap a(Iterator iterator, a a1)
    {
        ArrayList arraylist = new ArrayList();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Bitmap bitmap = a1.a(iterator.next());
            if (bitmap != null)
            {
                arraylist.add(bitmap);
            }
        } while (arraylist.size() != 3);
        if (arraylist.size() > 1)
        {
            return GroupAvatarUtil.a(arraylist);
        } else
        {
            return null;
        }
    }

    public static g a(Contact contact)
    {
        String s = contact.getIdentity();
        String s1 = (new StringBuilder("profile://")).append(s).append("/MyAvatar").toString();
        com.skype.Contact.GetProfileAttachment_Result getprofileattachment_result = contact.getProfileAttachment(s1);
        if (getprofileattachment_result.m_return)
        {
            return new g(s1, getprofileattachment_result.m_attachment);
        } else
        {
            return new g(s, contact.getAvatarImageProp());
        }
    }

    private Future a(Contact contact, long l, Object obj, AsyncCallback asynccallback, boolean flag)
    {
        contact = new Callable(flag, contact, l) {

            final boolean a;
            final Contact b;
            final long c;
            final int d = 1;
            final ImageCache e;

            public final Object call()
                throws Exception
            {
                g g1;
                byte abyte0[];
                if (a)
                {
                    g1 = ImageCache.a(b);
                } else
                {
                    g1 = new g(b.getIdentity(), b.getAvatarImageProp());
                }
                abyte0 = (byte[])g1.b;
                if (abyte0 == null || abyte0.length == 0)
                {
                    return null;
                } else
                {
                    return ImageCache.a(e, (String)g1.a, c, abyte0, d);
                }
            }

            
            {
                e = ImageCache.this;
                a = flag;
                b = contact;
                c = l;
                super();
            }
        };
        return b.a(contact, obj, asynccallback);
    }

    private static Future a(Object obj, Bitmap bitmap, AsyncCallback asynccallback)
    {
        if (asynccallback != null)
        {
            asynccallback.done(new CompletedAsyncResult(bitmap, obj));
        }
        return CompletableFuture.completedFuture(bitmap);
    }

    static CompositeBitmapCache b(ImageCache imagecache)
    {
        return imagecache.e;
    }

    private Future b(String s, long l, Object obj, AsyncCallback asynccallback)
    {
        if (e.b(s, l))
        {
            return a(obj, e.a(s), asynccallback);
        } else
        {
            return null;
        }
    }

    static ConditionVariable c(ImageCache imagecache)
    {
        return imagecache.d;
    }

    static ConversationParticipantsUtil d(ImageCache imagecache)
    {
        return imagecache.g;
    }

    public final Bitmap a()
    {
        Bitmap bitmap1 = e.a("default");
        Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            bitmap = BitmapFactory.decodeResource(c.getResources(), 0x7f0201c1);
            a("default", bitmap, 0L);
        }
        return bitmap;
    }

    public final Bitmap a(Account account)
    {
        return a(account.getSkypenameProp(), account.getAvatarTimestampProp(), account.getAvatarImageProp(), 1);
    }

    public final Bitmap a(Conversation conversation)
    {
        com.skype.android.util.a a1 = new com.skype.android.util.a(conversation);
        String s = a1.getIdentity();
        Bitmap bitmap = e.a(s);
        if (bitmap != null)
        {
            return bitmap;
        }
        boolean flag;
        if (conversation.getTypeProp() != com.skype.Conversation.TYPE.DIALOG)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            conversation = a(((ImageSource) (a1)));
        } else
        {
            conversation = a(s);
        }
        if (conversation != null)
        {
            a(s, ((Bitmap) (conversation)), 0L);
            return conversation;
        } else
        {
            return null;
        }
    }

    public final Bitmap a(Conversation conversation, Boolean boolean1)
    {
        com.skype.android.util.a a1 = new com.skype.android.util.a(conversation);
        String s = a1.getIdentity();
        Bitmap bitmap = e.a((new StringBuilder()).append(s).append("/notification").toString());
        if (bitmap != null)
        {
            return bitmap;
        }
        boolean flag;
        if (conversation.getTypeProp() != com.skype.Conversation.TYPE.DIALOG)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            conversation = a(((ImageSource) (a1)));
        } else
        {
            conversation = a(s);
        }
        if (conversation != null)
        {
            conversation = Bitmap.createScaledBitmap(conversation, c.getResources().getDimensionPixelSize(0x1050005), c.getResources().getDimensionPixelSize(0x1050006), true);
            a((new StringBuilder()).append(s).append("/notification").toString(), ((Bitmap) (conversation)), 0L);
            return conversation;
        }
        if (boolean1.booleanValue())
        {
            return a();
        } else
        {
            return conversation;
        }
    }

    public final Bitmap a(String s)
    {
        return e.a(s);
    }

    public final Future a(Account account, Object obj, AsyncCallback asynccallback)
    {
        Object obj1 = account.getSkypenameProp();
        long l = account.getAvatarTimestampProp();
        Future future = b(((String) (obj1)), l, obj, asynccallback);
        obj1 = future;
        if (future == null)
        {
            int j = account.getContactObjectID();
            obj1 = a((Contact)h.a(j, com/skype/Contact), l, obj, asynccallback, false);
        }
        return ((Future) (obj1));
    }

    public final Future a(Contact contact, Object obj, AsyncCallback asynccallback)
    {
        Object obj1 = contact.getIdentity();
        long l = contact.getAvatarTimestampProp();
        Future future = b(((String) (obj1)), l, obj, asynccallback);
        obj1 = future;
        if (future == null)
        {
            obj1 = a(contact, l, obj, asynccallback, false);
        }
        return ((Future) (obj1));
    }

    public final Future a(Conversation conversation, Object obj, AsyncCallback asynccallback)
    {
        return a(((ImageSource) (new com.skype.android.util.a(conversation))), obj, asynccallback);
    }

    public final Future a(ContactItem contactitem, Object obj, AsyncCallback asynccallback)
    {
        Object obj1 = contactitem.getIdentity();
        int j = contactitem.getAvatarTimestamp();
        Future future = b(((String) (obj1)), j, obj, asynccallback);
        obj1 = future;
        if (future == null)
        {
            int k = contactitem.getContactObjectId();
            try
            {
                contactitem = (Contact)h.a(k, com/skype/Contact);
            }
            // Misplaced declaration of an exception variable
            catch (ContactItem contactitem)
            {
                a.log(Level.WARNING, "Object not found", contactitem);
                contactitem = new AnalyticsParameterContainer();
                obj = (new StringBuilder()).append(getClass().getSimpleName()).append("-").append("getAvatarAsync").toString();
                contactitem.a(AnalyticsParameter.T, obj);
                i.a(AnalyticsEvent.df, contactitem);
                return null;
            }
            obj1 = a(((Contact) (contactitem)), j, obj, asynccallback, false);
        }
        return ((Future) (obj1));
    }

    public final Future a(ImageSource imagesource, Object obj, AsyncCallback asynccallback)
    {
        Future future1 = b(imagesource.getIdentity(), imagesource.getImageTimestamp(), obj, asynccallback);
        Future future = future1;
        if (future1 == null)
        {
            imagesource = new Callable(imagesource) {

                final ImageSource a;
                final int b = 0;
                final ImageCache c;

                public final Object call()
                    throws Exception
                {
                    byte abyte0[] = a.getImageData();
                    if (abyte0 == null || abyte0.length == 0)
                    {
                        return null;
                    } else
                    {
                        long l = a.getImageTimestamp();
                        String s = a.getIdentity();
                        return ImageCache.a(c, s, l, abyte0, b);
                    }
                }

            
            {
                c = ImageCache.this;
                a = imagesource;
                super();
            }
            };
            future = b.a(imagesource, obj, asynccallback);
        }
        return future;
    }

    public final Future a(String s, long l, Object obj, AsyncCallback asynccallback)
    {
        return b(s, l, obj, asynccallback);
    }

    public final Future a(String s, Object obj, AsyncCallback asynccallback)
    {
        Bitmap bitmap = e.a(s);
        if (bitmap != null)
        {
            return a(obj, bitmap, asynccallback);
        } else
        {
            s = new Callable(s) {

                final String a;
                final ImageCache b;

                public final Object call()
                    throws Exception
                {
                    return ImageCache.b(b).c(a);
                }

            
            {
                b = ImageCache.this;
                a = s;
                super();
            }
            };
            return b.a(s, obj, asynccallback);
        }
    }

    public final void a(String s, Bitmap bitmap)
    {
        a(s, bitmap, 0L);
    }

    public final void a(String s, Bitmap bitmap, long l)
    {
        e.a(s, bitmap, null, l, false);
    }

    public final Bitmap b(Contact contact)
    {
        long l = contact.getAvatarTimestampProp();
        contact = a(contact);
        return a((String)((g) (contact)).a, l, (byte[])((g) (contact)).b, 1);
    }

    public final Future b(Contact contact, Object obj, AsyncCallback asynccallback)
    {
        Object obj1 = (new StringBuilder()).append(contact.getIdentity()).append("/MyAvatar").toString();
        long l = contact.getAvatarTimestampProp();
        Future future = b(((String) (obj1)), l, obj, asynccallback);
        obj1 = future;
        if (future == null)
        {
            obj1 = a(contact, l, obj, asynccallback, true);
        }
        return ((Future) (obj1));
    }

    public final Future b(Conversation conversation, Object obj, AsyncCallback asynccallback)
    {
        com.skype.android.util.a a1 = new com.skype.android.util.a(conversation);
        String s = a1.getIdentity();
        long l = a1.getImageTimestamp();
        Future future = b(s, l, obj, asynccallback);
        if (future != null)
        {
            return future;
        } else
        {
            conversation = new Callable(a1, s, l, conversation) {

                final ImageSource a;
                final String b;
                final long c;
                final Conversation d;
                final ImageCache e;

                public final Object call()
                    throws Exception
                {
                    byte abyte0[] = a.getImageData();
                    Bitmap bitmap1;
                    if (abyte0 != null && abyte0.length != 0)
                    {
                        bitmap1 = ImageCache.a(e, b, c, abyte0, 0);
                    } else
                    {
                        bitmap1 = ImageCache.a(new ConversationParticipantsUtil._cls1(ImageCache.d(e), d), new a(this) {

                            final _cls3 a;

                            public final Bitmap a(Object obj)
                            {
                                Participant participant = (Participant)obj;
                                Bitmap bitmap = ImageCache.b(a.e).a((new StringBuilder("profile://")).append(participant.getIdentityProp()).append("/MyAvatar").toString());
                                obj = bitmap;
                                if (bitmap == null)
                                {
                                    obj = ImageCache.b(a.e).a(participant.getIdentityProp());
                                }
                                return ((Bitmap) (obj));
                            }

            
            {
                a = _pcls3;
                super();
            }
                        });
                        Bitmap bitmap = bitmap1;
                        if (bitmap1 == null)
                        {
                            bitmap = ImageCache.a(new ConversationParticipantsUtil._cls2(ImageCache.d(e), d), new a(this) {

                                final _cls3 a;

                                public final Bitmap a(Object obj)
                                {
                                    obj = (Contact)obj;
                                    return a.e.b(((Contact) (obj)));
                                }

            
            {
                a = _pcls3;
                super();
            }
                            });
                        }
                        bitmap1 = bitmap;
                        if (bitmap != null)
                        {
                            e.a(a.getIdentity(), bitmap, a.getImageTimestamp());
                            return bitmap;
                        }
                    }
                    return bitmap1;
                }

            
            {
                e = ImageCache.this;
                a = imagesource;
                b = s;
                c = l;
                d = conversation;
                super();
            }
            };
            return b.a(conversation, obj, asynccallback);
        }
    }

    public final void b(String s)
    {
        e.b(s);
        e.b((new StringBuilder()).append(s).append("/notification").toString());
    }

    public final Bitmap c(Contact contact)
    {
        String s = contact.getIdentity();
        Bitmap bitmap = null;
        Object obj = (new StringBuilder("profile://")).append(s).append("/MyAvatar").toString();
        if (e.b(((String) (obj)), contact.getAvatarTimestampProp()))
        {
            bitmap = e.a(((String) (obj)));
        }
        obj = bitmap;
        if (bitmap == null)
        {
            obj = bitmap;
            if (e.b(s, contact.getAvatarTimestampProp()))
            {
                obj = e.a(s);
            }
        }
        return ((Bitmap) (obj));
    }

    public void onLogin()
    {
        Callable callable = new Callable(c) {

            final Context a;
            final ImageCache b;

            public final Object call()
                throws Exception
            {
                File file = new File(a.getCacheDir(), "images");
                ImageCache.b(b).a(file, ImageCache.a(b) * 4);
                return ImageCache.b(b);
            }

            
            {
                b = ImageCache.this;
                a = context;
                super();
            }
        };
        b.a(callable, new AsyncCallback() {

            final ImageCache a;

            public final void done(AsyncResult asyncresult)
            {
                ImageCache.c(a).open();
            }

            
            {
                a = ImageCache.this;
                super();
            }
        });
    }

    public void onLogout()
    {
        CompositeBitmapCache compositebitmapcache = e;
        try
        {
            compositebitmapcache.close();
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

}
