// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            MediaTypeParameter, MediaTypeCaseClasses

public class ImageType extends MediaTypeParameter
{

    public static final ImageType GIF = new ImageType("GIF", "image/gif", "gif");
    public static final ImageType JPEG = new ImageType("JPEG", "image/jpeg", "jpg");
    public static final ImageType PNG = new ImageType("PNG", "image/png", "png");
    private static final MediaTypeCaseClasses enums = new MediaTypeCaseClasses(ezvcard/parameter/ImageType);

    private ImageType(String s, String s1, String s2)
    {
        super(s, s1, s2);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static ImageType find(String s, String s1, String s2)
    {
        return (ImageType)enums.find(new String[] {
            s, s1, s2
        });
    }

    public static ImageType get(String s, String s1, String s2)
    {
        return (ImageType)enums.get(new String[] {
            s, s1, s2
        });
    }

}
