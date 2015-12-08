// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.media;

import java.io.File;
import java.io.InputStream;

public interface ImageUpload
{

    public abstract String upload(File file);

    public abstract String upload(File file, String s);

    public abstract String upload(String s, InputStream inputstream);

    public abstract String upload(String s, InputStream inputstream, String s1);
}
