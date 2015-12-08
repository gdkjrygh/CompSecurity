// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.graphics.Bitmap;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.android.util.cache.CompositeBitmapCache;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.util:
//            ImageCache, ImageSource

final class d
    implements Callable
{

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
            bitmap1 = ImageCache.a(new articipantsUtil._cls1(ImageCache.d(e), d), new ImageCache.a() {

                final ImageCache._cls3 a;

                public final Bitmap a(Object obj)
                {
                    Participant participant = (Participant)obj;
                    Bitmap bitmap2 = ImageCache.b(a.e).a((new StringBuilder("profile://")).append(participant.getIdentityProp()).append("/MyAvatar").toString());
                    obj = bitmap2;
                    if (bitmap2 == null)
                    {
                        obj = ImageCache.b(a.e).a(participant.getIdentityProp());
                    }
                    return ((Bitmap) (obj));
                }

            
            {
                a = ImageCache._cls3.this;
                super();
            }
            });
            Bitmap bitmap = bitmap1;
            if (bitmap1 == null)
            {
                bitmap = ImageCache.a(new articipantsUtil._cls2(ImageCache.d(e), d), new ImageCache.a() {

                    final ImageCache._cls3 a;

                    public final Bitmap a(Object obj)
                    {
                        obj = (Contact)obj;
                        return a.e.b(((Contact) (obj)));
                    }

            
            {
                a = ImageCache._cls3.this;
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

    _cls2.a(ImageCache imagecache, ImageSource imagesource, String s, long l, Conversation conversation)
    {
        e = imagecache;
        a = imagesource;
        b = s;
        c = l;
        d = conversation;
        super();
    }
}
