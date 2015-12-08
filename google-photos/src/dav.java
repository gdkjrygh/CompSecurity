// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import com.google.android.apps.moviemaker.ui.StoryboardVideoPosterView;

public final class dav extends Property
{

    public dav(Class class1, String s)
    {
        super(class1, s);
    }

    public final Object get(Object obj)
    {
        return Float.valueOf(StoryboardVideoPosterView.a((StoryboardVideoPosterView)obj));
    }

    public final void set(Object obj, Object obj1)
    {
        obj = (StoryboardVideoPosterView)obj;
        obj1 = (Float)obj1;
        StoryboardVideoPosterView.a(((StoryboardVideoPosterView) (obj)), ((Float) (obj1)).floatValue());
        obj.i = (int)(255F * ddl.c(0.7F, 1.0F, ((Float) (obj1)).floatValue()));
        ((StoryboardVideoPosterView) (obj)).c();
        ((StoryboardVideoPosterView) (obj)).invalidate();
    }
}
