// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class dub
    implements dua
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        ".jpg", ".png", ".jpeg"
    })));
    private final ContentResolver b;
    private final amy c;
    private final Context d;
    private final noz e;
    private final duc f;

    public dub(Context context)
    {
        this(context, context.getContentResolver(), new amy(), new duc());
    }

    private dub(Context context, ContentResolver contentresolver, amy amy1, duc duc1)
    {
        b = contentresolver;
        c = amy1;
        d = context;
        e = noz.a(context, "AnimationDetector", new String[0]);
        f = duc1;
    }

    private boolean b(Uri uri)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        obj = null;
        flag2 = false;
        flag1 = false;
        flag = false;
        uri = b.openInputStream(uri);
        if (uri != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        flag1 = flag;
        if (uri != null)
        {
            byte abyte0[];
            int i;
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return false;
            }
            flag1 = flag;
        }
_L6:
        return flag1;
_L2:
        obj2 = new ByteArrayOutputStream(16384);
        abyte0 = new byte[16384];
_L5:
        i = uri.read(abyte0);
        if (i == -1) goto _L4; else goto _L3
_L3:
        ((ByteArrayOutputStream) (obj2)).write(abyte0, 0, i);
          goto _L5
        obj2;
        flag = flag2;
_L11:
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri) { }
        }
        flag1 = flag;
        if (obj != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return flag;
            }
            return flag;
        }
        if (true) goto _L6; else goto _L4
_L4:
        flag = flag1;
        obj = c;
        flag = flag1;
        abyte0 = ((ByteArrayOutputStream) (obj2)).toByteArray();
        if (abyte0 == null) goto _L8; else goto _L7
_L7:
        flag = flag1;
        ((amy) (obj)).a(ByteBuffer.wrap(abyte0));
_L10:
        flag = flag1;
        flag1 = c.a();
        flag = flag1;
        uri.close();
        flag = flag1;
        ((ByteArrayOutputStream) (obj2)).close();
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri) { }
        }
        try
        {
            ((ByteArrayOutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return flag1;
        }
        return flag1;
_L8:
        flag = flag1;
        obj.a = null;
        flag = flag1;
        ((amy) (obj)).b.b = 2;
        if (true) goto _L10; else goto _L9
_L9:
        obj1;
        obj1 = obj2;
          goto _L11
        obj1;
        obj2 = null;
        uri = null;
_L13:
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri) { }
        }
        throw obj1;
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L13; else goto _L12
_L12:
        uri;
        uri = null;
        flag = flag2;
          goto _L11
    }

    private com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType c(Uri uri)
    {
label0:
        {
label1:
            {
                Object obj1 = null;
                Object obj = null;
                com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType imagetype = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.UNKNOWN;
                try
                {
                    uri = b.openInputStream(uri);
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    obj1 = imagetype;
                    if (obj != null)
                    {
                        try
                        {
                            ((InputStream) (obj)).close();
                        }
                        // Misplaced declaration of an exception variable
                        catch (Uri uri)
                        {
                            return imagetype;
                        }
                        return imagetype;
                    } else
                    {
                        break label1;
                    }
                }
                finally
                {
                    if (obj1 != null)
                    {
                        try
                        {
                            ((InputStream) (obj1)).close();
                        }
                        catch (IOException ioexception) { }
                    }
                    throw uri;
                }
                if (uri != null)
                {
                    break label0;
                }
                obj1 = imagetype;
                if (uri != null)
                {
                    com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType imagetype1;
                    try
                    {
                        uri.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri uri)
                    {
                        return imagetype;
                    }
                    obj1 = imagetype;
                }
            }
            return ((com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType) (obj1));
        }
        obj = uri;
        obj1 = uri;
        imagetype1 = (new ImageHeaderParser(uri, aly.b(d).c)).a();
        obj = imagetype1;
        obj1 = obj;
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return ((com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType) (obj));
            }
            return ((com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType) (obj));
        }
        break label1;
    }

    public final boolean a(Uri uri)
    {
        String s = uri.getPath();
        int i = s.lastIndexOf(".");
        if (i > 0 && a.contains(s.substring(i).toLowerCase(Locale.US)) || c(uri) != com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.GIF)
        {
            return false;
        } else
        {
            return b(uri);
        }
    }

}
