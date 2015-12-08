// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.net.URL;
import java.util.Map;

// Referenced classes of package twitter4j:
//            URLEntity

public interface MediaEntity
    extends URLEntity
{
    public static interface Size
        extends Serializable
    {

        public static final int CROP = 101;
        public static final int FIT = 100;
        public static final Integer LARGE = new Integer(3);
        public static final Integer MEDIUM = new Integer(2);
        public static final Integer SMALL = new Integer(1);
        public static final Integer THUMB = new Integer(0);

        public abstract int getHeight();

        public abstract int getResize();

        public abstract int getWidth();

    }


    public abstract long getId();

    public abstract URL getMediaURL();

    public abstract URL getMediaURLHttps();

    public abstract Map getSizes();
}
