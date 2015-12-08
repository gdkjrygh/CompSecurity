// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

final class aoj
{

    private static final aoe a = new aoe();
    private final aoe b;
    private final aoi c;
    private final aqp d;

    private aoj(aoe aoe1, aoi aoi1, aqp aqp)
    {
        b = aoe1;
        c = aoi1;
        d = aqp;
    }

    public aoj(aoi aoi1, aqp aqp)
    {
        this(a, aoi1, aqp);
    }

    public final int a(Context context, Uri uri)
    {
        Context context1;
        Context context2;
        int j;
        j = -1;
        context2 = null;
        context1 = null;
        context = context.getContentResolver().openInputStream(uri);
        context1 = context;
        context2 = context;
        int i = (new ImageHeaderParser(context, d)).b();
        j = i;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return i;
            }
            j = i;
        }
        return j;
        context;
        context2 = context1;
        if (!Log.isLoggable("ThumbStreamOpener", 3))
        {
            continue; /* Loop/switch isn't completed */
        }
        context2 = context1;
        context = String.valueOf(uri);
        context2 = context1;
        (new StringBuilder(String.valueOf(context).length() + 20)).append("Failed to open uri: ").append(context);
        if (context1 == null) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_113;
_L2:
        break MISSING_BLOCK_LABEL_55;
        try
        {
            context1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return -1;
        context;
        if (context2 != null)
        {
            try
            {
                context2.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri) { }
        }
        throw context;
    }

    public final InputStream b(Context context, Uri uri)
    {
        Cursor cursor = c.a(context, uri);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        boolean flag = cursor.moveToFirst();
        if (flag) goto _L3; else goto _L2
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
_L5:
        return null;
_L3:
        uri = cursor.getString(0);
        flag = TextUtils.isEmpty(uri);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return null;
        uri = new File(uri);
        if (!uri.exists() || uri.length() <= 0L)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        uri = Uri.fromFile(uri);
_L7:
        if (cursor != null)
        {
            cursor.close();
        }
        if (uri == null) goto _L5; else goto _L6
_L6:
        return context.getContentResolver().openInputStream(uri);
        context;
        if (cursor != null)
        {
            cursor.close();
        }
        throw context;
        uri = null;
          goto _L7
    }

}
