// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import com.soundcloud.java.objects.MoreObjects;
import java.io.File;

// Referenced classes of package com.soundcloud.android.api:
//            FormPart

public final class FilePart extends FormPart
{

    public static final String BLOB_MEDIA_TYPE = "application/octet-stream";
    private final File file;
    private final String fileName;

    FilePart(String s, File file1, String s1)
    {
        this(s, file1, file1.getName(), s1);
    }

    FilePart(String s, File file1, String s1, String s2)
    {
        super(s, s2);
        file = file1;
        fileName = s1;
    }

    public static FilePart from(String s, File file1, String s1)
    {
        return new FilePart(s, file1, s1);
    }

    public static FilePart from(String s, File file1, String s1, String s2)
    {
        return new FilePart(s, file1, s1, s2);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof FilePart)
        {
            if (MoreObjects.equal(file, ((FilePart) (obj = (FilePart)obj)).file) && MoreObjects.equal(partName, ((FilePart) (obj)).partName) && MoreObjects.equal(fileName, ((FilePart) (obj)).fileName) && MoreObjects.equal(contentType, ((FilePart) (obj)).contentType))
            {
                return true;
            }
        }
        return false;
    }

    public final File getFile()
    {
        return file;
    }

    public final String getFileName()
    {
        return fileName;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            file, partName, fileName, contentType
        });
    }

    public final String toString()
    {
        return MoreObjects.toStringHelper(this).add("partName", partName).add("file", file).add("fileName", fileName).toString();
    }
}
