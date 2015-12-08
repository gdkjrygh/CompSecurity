// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.results;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.unveil.env.af;
import com.google.b.b;
import com.google.b.f;
import com.google.b.h;
import com.google.b.s;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.results:
//            ResultModel

public class ResultItem extends ResultModel
    implements Serializable
{

    public static final String LOCAL_BARCODE_RESULT_ID_PREFIX = "local_barcode";
    public static final int UNKNOWN_SEQUENCE_NUMBER = -1;
    private static final af a = new af();
    static final long serialVersionUID = 1L;
    public final b annotation;
    private transient Rect b;
    private final f boundingBox;
    private final String directUrl;
    private final com.google.android.apps.unveil.protocol.QueryResponseFactory.QueryType queryType;
    private final int resultPosition;
    private final String subtitle;
    private final String thumbnailUrl;
    private final String title;
    private final String type;
    private final String webSearchUrl;

    public ResultItem(s s1, com.google.android.apps.unveil.protocol.QueryResponseFactory.QueryType querytype, int i)
    {
        Object obj = null;
        super();
        b b1 = (b)s1.getExtension(b.a);
        String s2;
        if (b1.f != null)
        {
            boundingBox = b1.f;
            b = a(boundingBox);
        } else
        {
            boundingBox = null;
        }
        s2 = obj;
        if (b1.g != null)
        {
            h h1 = b1.g;
            boolean flag;
            if ((h1.a & 2) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s2 = obj;
            if (flag)
            {
                s2 = h1.c;
            }
        }
        title = b1.b;
        a.a("Got result %s", new Object[] {
            title
        });
        subtitle = b1.c;
        type = b1.d;
        directUrl = b1.e;
        webSearchUrl = b1.j;
        thumbnailUrl = s2;
        queryType = querytype;
        annotation = (b)s1.getExtension(b.a);
        resultPosition = i;
        if (annotation == null)
        {
            throw new IllegalArgumentException("No annotation result found.");
        } else
        {
            return;
        }
    }

    private static Rect a(f f1)
    {
        return new Rect(f1.a, f1.c, f1.a + f1.b, f1.c + f1.d);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        accessibilityevent.getText().add(getTtsDescription());
        return true;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (ResultItem)obj;
        if (isAdvertisement() != ((ResultItem) (obj)).isAdvertisement())
        {
            return false;
        }
        if (subtitle == null)
        {
            if (((ResultItem) (obj)).subtitle != null)
            {
                return false;
            }
        } else
        if (!subtitle.equals(((ResultItem) (obj)).subtitle))
        {
            return false;
        }
        if (thumbnailUrl == null)
        {
            if (((ResultItem) (obj)).thumbnailUrl != null)
            {
                return false;
            }
        } else
        if (!thumbnailUrl.equals(((ResultItem) (obj)).thumbnailUrl))
        {
            return false;
        }
        if (title == null)
        {
            if (((ResultItem) (obj)).title != null)
            {
                return false;
            }
        } else
        if (!title.equals(((ResultItem) (obj)).title))
        {
            return false;
        }
        if (type != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ResultItem) (obj)).type == null) goto _L1; else goto _L3
_L3:
        return false;
        if (type.equals(((ResultItem) (obj)).type)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public b getAnnotationResult()
    {
        return annotation;
    }

    public Rect getBoundingBox()
    {
        this;
        JVM INSTR monitorenter ;
        Rect rect;
        if (b == null && boundingBox != null)
        {
            b = a(boundingBox);
        }
        rect = b;
        this;
        JVM INSTR monitorexit ;
        return rect;
        Exception exception;
        exception;
        throw exception;
    }

    public String getDirectUrl()
    {
        return directUrl;
    }

    public String getImageUrl()
    {
        if (!hasAnnotationResult())
        {
            return "";
        } else
        {
            return getAnnotationResult().g.b;
        }
    }

    public String getKeyFromHashCode()
    {
        return String.valueOf(hashCode());
    }

    public com.google.android.apps.unveil.protocol.QueryResponseFactory.QueryType getQueryType()
    {
        return queryType;
    }

    public String getReferrerUrl()
    {
        if (!hasAnnotationResult())
        {
            return "";
        } else
        {
            return getAnnotationResult().g.d;
        }
    }

    public int getResultPosition()
    {
        return resultPosition;
    }

    public String getSubtitle()
    {
        if (TextUtils.isEmpty(subtitle))
        {
            return subtitle;
        }
        String s1 = String.valueOf(subtitle);
        if (s1.length() != 0)
        {
            return " - ".concat(s1);
        } else
        {
            return new String(" - ");
        }
    }

    public String getThumbnailUrl()
    {
        return thumbnailUrl;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTtsDescription()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(type))
        {
            stringbuilder.append(type);
            stringbuilder.append(". ");
        }
        if (!TextUtils.isEmpty(title))
        {
            stringbuilder.append(title);
            stringbuilder.append(". ");
        }
        if (!TextUtils.isEmpty(subtitle))
        {
            stringbuilder.append(subtitle);
            stringbuilder.append(". ");
        }
        return stringbuilder.toString();
    }

    public String getType()
    {
        return type;
    }

    public String getWebSearchUrl()
    {
        return webSearchUrl;
    }

    public boolean hasAnnotationResult()
    {
        return annotation != null;
    }

    public boolean hasImageUrl()
    {
        while (!hasAnnotationResult() || (getAnnotationResult().g.a & 1) == 0) 
        {
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (subtitle == null)
        {
            i = 0;
        } else
        {
            i = subtitle.hashCode();
        }
        if (thumbnailUrl == null)
        {
            j = 0;
        } else
        {
            j = thumbnailUrl.hashCode();
        }
        if (title == null)
        {
            k = 0;
        } else
        {
            k = title.hashCode();
        }
        if (type == null)
        {
            l = 0;
        } else
        {
            l = type.hashCode();
        }
        if (directUrl == null)
        {
            i1 = 0;
        } else
        {
            i1 = directUrl.hashCode();
        }
        if (webSearchUrl != null)
        {
            j1 = webSearchUrl.hashCode();
        }
        return (i1 + (l + (k + (j + (i + 31) * 31) * 31) * 31) * 31) * 31 + j1;
    }

    public boolean isAdvertisement()
    {
        return annotation.m;
    }

    public boolean isProduct()
    {
        return annotation.k != null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ResultItem [directUrl=");
        stringbuilder.append(directUrl);
        stringbuilder.append(", webSearchUrl=");
        stringbuilder.append(webSearchUrl);
        stringbuilder.append(", title=");
        stringbuilder.append(title);
        stringbuilder.append(", subtitle=");
        stringbuilder.append(subtitle);
        stringbuilder.append(", type=");
        stringbuilder.append(type);
        stringbuilder.append(", thumbnailUrl=");
        stringbuilder.append(thumbnailUrl);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

}
