// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

// Referenced classes of package com.facebook:
//            Response

static interface 
    extends GraphObject
{

    public abstract GraphObjectList getData();

    public abstract  getPaging();
}
