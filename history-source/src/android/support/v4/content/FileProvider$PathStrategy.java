// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.net.Uri;
import java.io.File;

// Referenced classes of package android.support.v4.content:
//            FileProvider

static interface 
{

    public abstract File getFileForUri(Uri uri);

    public abstract Uri getUriForFile(File file);
}
