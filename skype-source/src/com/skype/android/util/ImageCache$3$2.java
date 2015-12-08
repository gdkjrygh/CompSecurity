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

final class a
    implements a
{

    final a a;

    public final Bitmap a(Object obj)
    {
        obj = (Contact)obj;
        return a.a.b(((Contact) (obj)));
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/skype/android/util/ImageCache$3

/* anonymous class */
    final class ImageCache._cls3
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
                bitmap1 = ImageCache.a(new ConversationParticipantsUtil._cls1(ImageCache.d(e), d), new ImageCache._cls3._cls1());
                Bitmap bitmap = bitmap1;
                if (bitmap1 == null)
                {
                    bitmap = ImageCache.a(new ConversationParticipantsUtil._cls2(ImageCache.d(e), d), new ImageCache._cls3._cls2(this));
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
                e = imagecache;
                a = imagesource;
                b = s;
                c = l;
                d = conversation;
                super();
            }

        // Unreferenced inner class com/skype/android/util/ImageCache$3$1

/* anonymous class */
        final class ImageCache._cls3._cls1
            implements ImageCache.a
        {

            final ImageCache._cls3 a;

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
                        a = ImageCache._cls3.this;
                        super();
                    }
        }

    }

}
