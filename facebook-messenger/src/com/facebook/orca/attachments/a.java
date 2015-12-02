// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.w.n;
import com.facebook.http.c.i;
import com.facebook.messages.model.share.ShareMedia;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.TitanAttachmentInfo;
import com.facebook.orca.d.d;
import com.facebook.orca.j.c;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.orca.attachments:
//            g, AudioAttachmentData, OtherAttachmentData, ImageAttachmentData

public class a
{

    private static final Pattern a = Pattern.compile("_[ts]\\.jpg$");
    private static final Pattern b = Pattern.compile("\\/[ts]([^/]+\\.jpg)$");
    private final javax.inject.a c;
    private final javax.inject.a d;
    private final Context e;
    private final c f;

    public a(javax.inject.a a1, javax.inject.a a2, Context context, c c1)
    {
        c = a1;
        d = a2;
        e = context;
        f = c1;
    }

    private Uri a(String s, TitanAttachmentInfo titanattachmentinfo)
    {
        android.net.Uri.Builder builder = ((i)c.b()).a();
        builder.appendEncodedPath("method/messaging.getAttachment");
        builder.appendQueryParameter("mid", s);
        if (titanattachmentinfo != null)
        {
            builder.appendQueryParameter("aid", titanattachmentinfo.a());
        } else
        {
            builder.appendQueryParameter("aid", "1");
        }
        a(builder);
        builder.appendQueryParameter("format", "binary");
        return builder.build();
    }

    private ImageAttachmentData a(Message message, TitanAttachmentInfo titanattachmentinfo)
    {
        if (message.B().isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj = (MediaResource)message.B().get(0);
        if (((MediaResource) (obj)).c() != g.PHOTO) goto _L2; else goto _L3
_L3:
        obj = ((MediaResource) (obj)).d();
_L5:
        message = a(message.d(), titanattachmentinfo);
        obj = (new com.facebook.orca.attachments.g()).b(message).a(message).c(((Uri) (obj)));
        message = ((Message) (obj));
        if (titanattachmentinfo != null)
        {
            message = ((Message) (obj));
            if (titanattachmentinfo.f() != null)
            {
                message = titanattachmentinfo.f();
                message = ((com.facebook.orca.attachments.g) (obj)).a(message.a()).b(message.b()).a(titanattachmentinfo.c());
            }
        }
        return message.g();
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private ImageAttachmentData a(MediaResource mediaresource)
    {
        if (!Objects.equal(mediaresource.d().getScheme(), "file")) goto _L2; else goto _L1
_L1:
        if (n.a(mediaresource.f())) goto _L4; else goto _L3
_L3:
        File file = new File(mediaresource.f());
        if (!file.exists() || file.length() == 0L) goto _L4; else goto _L5
_L5:
        Uri uri1 = Uri.fromFile(file);
_L8:
        Uri uri = uri1;
        if (uri1 == null)
        {
            File file1 = new File(mediaresource.d().getPath());
            uri = uri1;
            if (file1.exists())
            {
                uri = uri1;
                if (file1.length() != 0L)
                {
                    uri = mediaresource.d();
                }
            }
        }
        uri1 = uri;
        if (uri == null)
        {
            return null;
        }
          goto _L6
_L2:
        uri1 = mediaresource.d();
_L6:
        return (new com.facebook.orca.attachments.g()).a(uri1).b(uri1).a(mediaresource.h()).b(mediaresource.i()).g();
_L4:
        uri1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(android.net.Uri.Builder builder)
    {
        ViewerContext viewercontext = (ViewerContext)d.b();
        if (viewercontext != null)
        {
            builder.appendQueryParameter("access_token", viewercontext.b());
        }
    }

    private boolean a(TitanAttachmentInfo titanattachmentinfo)
    {
        String s = titanattachmentinfo.d();
        titanattachmentinfo = titanattachmentinfo.c();
        return !a(s, ((String) (titanattachmentinfo))) && !a(((String) (titanattachmentinfo)));
    }

    private boolean a(String s)
    {
        return s != null && s.startsWith("image/");
    }

    private boolean a(String s, String s1)
    {
        return s1 != null && s1.startsWith("audio/") && s != null && s.startsWith("audioclip-");
    }

    private AudioAttachmentData b(Message message, TitanAttachmentInfo titanattachmentinfo)
    {
        message = a(message.d(), titanattachmentinfo);
        return new AudioAttachmentData(com.facebook.orca.d.d.a(titanattachmentinfo.d()), message);
    }

    private ImageAttachmentData b(ShareMedia sharemedia)
    {
        Uri uri = c(sharemedia);
        sharemedia = d(sharemedia);
        return (new com.facebook.orca.attachments.g()).a(uri).b(sharemedia).g();
    }

    private OtherAttachmentData b(MediaResource mediaresource)
    {
        File file = f.a("mms_media", MimeTypeMap.getSingleton().getExtensionFromMimeType(mediaresource.e()), Boolean.valueOf(true));
        com.google.common.b.a.a(e.getContentResolver().openInputStream(mediaresource.d()), new FileOutputStream(file));
        return new OtherAttachmentData(mediaresource.f(), com.google.common.c.a.a(file.length()), mediaresource.e(), Uri.fromFile(file));
    }

    private boolean b(TitanAttachmentInfo titanattachmentinfo)
    {
        return a(titanattachmentinfo.d(), titanattachmentinfo.c());
    }

    private Uri c(ShareMedia sharemedia)
    {
        return Uri.parse(sharemedia.d());
    }

    private OtherAttachmentData c(Message message, TitanAttachmentInfo titanattachmentinfo)
    {
        message = a(message.d(), titanattachmentinfo);
        return new OtherAttachmentData(titanattachmentinfo.d(), titanattachmentinfo.e(), titanattachmentinfo.c(), message);
    }

    private boolean c(MediaResource mediaresource)
    {
        return !a(mediaresource.e());
    }

    private Uri d(ShareMedia sharemedia)
    {
        sharemedia = sharemedia.d();
        Matcher matcher = a.matcher(sharemedia);
        if (matcher.find())
        {
            sharemedia = matcher.replaceFirst("_n.jpg");
        }
        matcher = b.matcher(sharemedia);
        if (matcher.find())
        {
            sharemedia = matcher.replaceFirst((new StringBuilder()).append("/n").append(matcher.group(1)).toString());
        }
        return Uri.parse(sharemedia);
    }

    public Uri a(ThreadSummary threadsummary)
    {
        if (threadsummary.t())
        {
            return threadsummary.s();
        } else
        {
            android.net.Uri.Builder builder = ((i)c.b()).a();
            builder.appendEncodedPath("method/messaging.getAttachment");
            builder.appendQueryParameter("tid", threadsummary.a());
            builder.appendQueryParameter("hash", threadsummary.q());
            a(builder);
            builder.appendQueryParameter("format", "binary");
            return builder.build();
        }
    }

    public ImageAttachmentData a(ShareMedia sharemedia)
    {
        if ("photo".equals(sharemedia.c()))
        {
            return b(sharemedia);
        } else
        {
            return null;
        }
    }

    public boolean a(Message message)
    {
label0:
        {
            if (message.u() == 4)
            {
                return true;
            }
            if (message.p().isEmpty() && message.o().isEmpty() && message.q().isEmpty() && message.B().isEmpty())
            {
                return false;
            }
            for (Iterator iterator = message.p().iterator(); iterator.hasNext();)
            {
                String s = ((TitanAttachmentInfo)iterator.next()).c();
                if (s != null && s.startsWith("image/"))
                {
                    return true;
                }
            }

            for (Iterator iterator1 = message.o().iterator(); iterator1.hasNext();)
            {
                MediaResource mediaresource = (MediaResource)iterator1.next();
                if (g.PHOTO.equals(mediaresource.c()))
                {
                    return true;
                }
            }

            if (message.B().isEmpty())
            {
                break label0;
            }
            message = message.B().iterator();
            do
            {
                if (!message.hasNext())
                {
                    break label0;
                }
            } while (((MediaResource)message.next()).c() != g.PHOTO);
            return true;
        }
        return false;
    }

    public es b(Message message)
    {
        Object obj;
        Object obj1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        if (message.u() == 4)
        {
            return es.a(a(message, ((TitanAttachmentInfo) (null))));
        }
        if (message.p().isEmpty() && message.o().isEmpty() && message.q().isEmpty() && message.B().isEmpty())
        {
            return es.d();
        }
        obj1 = es.e();
        flag = flag1;
        obj = obj1;
        if (message.B().isEmpty()) goto _L2; else goto _L1
_L1:
        obj = message.B().iterator();
        flag = false;
_L7:
        Object obj2;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_284;
        }
        obj2 = a((MediaResource)((Iterator) (obj)).next());
        if (obj2 != null) goto _L4; else goto _L3
_L3:
        obj = es.e();
        flag = flag1;
          goto _L2
_L4:
        flag = true;
        ((et) (obj1)).b(obj2);
        continue; /* Loop/switch isn't completed */
_L2:
        if (!flag)
        {
            obj1 = message.p().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                obj2 = (TitanAttachmentInfo)((Iterator) (obj1)).next();
                String s = ((TitanAttachmentInfo) (obj2)).c();
                if (s != null && s.startsWith("image/"))
                {
                    ((et) (obj)).b(a(message, ((TitanAttachmentInfo) (obj2))));
                }
            } while (true);
            message = message.o().iterator();
            do
            {
                if (!message.hasNext())
                {
                    break;
                }
                obj1 = (MediaResource)message.next();
                if (g.PHOTO.equals(((MediaResource) (obj1)).c()))
                {
                    ((et) (obj)).b(a(((MediaResource) (obj1))));
                }
            } while (true);
        }
        return ((et) (obj)).b();
        obj = obj1;
        if (true) goto _L2; else goto _L5
_L5:
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean c(Message message)
    {
        message = message.p();
        if (message.size() != 1)
        {
            return false;
        } else
        {
            return b((TitanAttachmentInfo)message.get(0));
        }
    }

    public boolean d(Message message)
    {
        message = message.B();
        if (message.size() != 1)
        {
            return false;
        }
        boolean flag;
        if (((MediaResource)message.get(0)).c() == g.AUDIO)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public AudioAttachmentData e(Message message)
    {
        if (c(message))
        {
            return b(message, (TitanAttachmentInfo)message.p().get(0));
        }
        if (d(message))
        {
            return new AudioAttachmentData(((MediaResource)message.B().get(0)).g(), null);
        } else
        {
            return null;
        }
    }

    public boolean f(Message message)
    {
        if (message.p().isEmpty() && message.o().isEmpty())
        {
            return false;
        }
        for (Iterator iterator = message.p().iterator(); iterator.hasNext();)
        {
            if (a((TitanAttachmentInfo)iterator.next()))
            {
                return true;
            }
        }

        for (message = message.o().iterator(); message.hasNext();)
        {
            if (c((MediaResource)message.next()))
            {
                return true;
            }
        }

        return false;
    }

    public es g(Message message)
    {
        if (message.p().isEmpty() && message.o().isEmpty())
        {
            return es.d();
        }
        et et1 = es.e();
        Iterator iterator = message.p().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TitanAttachmentInfo titanattachmentinfo = (TitanAttachmentInfo)iterator.next();
            if (a(titanattachmentinfo))
            {
                et1.b(c(message, titanattachmentinfo));
            }
        } while (true);
        message = message.o().iterator();
        do
        {
            if (!message.hasNext())
            {
                break;
            }
            MediaResource mediaresource = (MediaResource)message.next();
            if (c(mediaresource))
            {
                try
                {
                    et1.b(b(mediaresource));
                }
                catch (IOException ioexception) { }
            }
        } while (true);
        return et1.b();
    }

}
