// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            POJOPropertyBuilder, AnnotatedMember, ObjectIdInfo

class this._cls0
    implements thMember
{

    final POJOPropertyBuilder this$0;

    public ObjectIdInfo withMember(AnnotatedMember annotatedmember)
    {
        ObjectIdInfo objectidinfo1 = _annotationIntrospector.findObjectIdInfo(annotatedmember);
        ObjectIdInfo objectidinfo = objectidinfo1;
        if (objectidinfo1 != null)
        {
            objectidinfo = _annotationIntrospector.findObjectReferenceInfo(annotatedmember, objectidinfo1);
        }
        return objectidinfo;
    }

    public volatile Object withMember(AnnotatedMember annotatedmember)
    {
        return withMember(annotatedmember);
    }

    thMember()
    {
        this$0 = POJOPropertyBuilder.this;
        super();
    }
}
