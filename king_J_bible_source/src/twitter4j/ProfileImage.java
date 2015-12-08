// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package twitter4j:
//            TwitterResponse

public interface ProfileImage
    extends TwitterResponse, Serializable
{
    public static class ImageSize
        implements Serializable
    {

        private static final Map instances = new HashMap();
        private static final long serialVersionUID = 0x2eabdece0fdb075bL;
        private final String name;

        private static ImageSize getInstance(String s)
        {
            return (ImageSize)instances.get(s);
        }

        private Object readResolve()
            throws ObjectStreamException
        {
            return getInstance(name);
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (ImageSize)obj;
                if (!name.equals(((ImageSize) (obj)).name))
                {
                    return false;
                }
            }
            return true;
        }

        public String getName()
        {
            return name;
        }

        public int hashCode()
        {
            return name.hashCode();
        }

        public String toString()
        {
            return name;
        }


        private ImageSize()
        {
            throw new AssertionError();
        }

        private ImageSize(String s)
        {
            name = s;
            instances.put(s, this);
        }

    }


    public static final ImageSize BIGGER = new ImageSize("bigger");
    public static final ImageSize MINI = new ImageSize("mini");
    public static final ImageSize NORMAL = new ImageSize("normal");
    public static final ImageSize ORIGINAL = new ImageSize("original");

    public abstract String getURL();

}
