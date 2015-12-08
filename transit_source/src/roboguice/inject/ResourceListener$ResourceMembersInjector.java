// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Application;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.inject.MembersInjector;
import java.lang.reflect.Field;

// Referenced classes of package roboguice.inject:
//            ResourceListener, InjectResource, Nullable

protected static class annotation
    implements MembersInjector
{

    protected InjectResource annotation;
    protected Application application;
    protected Field field;

    protected int getId(Resources resources, InjectResource injectresource)
    {
        int i = injectresource.value();
        if (i >= 0)
        {
            return i;
        } else
        {
            return resources.getIdentifier(injectresource.name(), null, null);
        }
    }

    public void injectMembers(Object obj)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        obj3 = null;
        obj1 = null;
        obj2 = obj3;
        Resources resources = application.getResources();
        obj2 = obj3;
        int i = getId(resources, annotation);
        obj2 = obj3;
        Class class1 = field.getType();
        obj2 = obj3;
        if (!java/lang/String.isAssignableFrom(class1)) goto _L2; else goto _L1
_L1:
        obj2 = obj3;
        obj1 = resources.getString(i);
_L4:
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        if (!Nullable.notNullable(field))
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        try
        {
            throw new NullPointerException(String.format("Can't inject null value into %s.%s when field is not @Nullable", new Object[] {
                field.getDeclaringClass(), field.getName()
            }));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        break MISSING_BLOCK_LABEL_421;
_L2:
        obj2 = obj3;
        if (Boolean.TYPE.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        obj2 = obj3;
        if (!java/lang/Boolean.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_177;
        }
        obj2 = obj3;
        obj1 = Boolean.valueOf(resources.getBoolean(i));
        continue; /* Loop/switch isn't completed */
        obj2 = obj3;
        if (!android/content/res/ColorStateList.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_204;
        }
        obj2 = obj3;
        obj1 = resources.getColorStateList(i);
        continue; /* Loop/switch isn't completed */
        obj2 = obj3;
        if (Integer.TYPE.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj2 = obj3;
        if (!java/lang/Integer.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_248;
        }
        obj2 = obj3;
        obj1 = Integer.valueOf(resources.getInteger(i));
        continue; /* Loop/switch isn't completed */
        obj2 = obj3;
        if (!android/graphics/drawable/Drawable.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_275;
        }
        obj2 = obj3;
        obj1 = resources.getDrawable(i);
        continue; /* Loop/switch isn't completed */
        obj2 = obj3;
        if (![Ljava/lang/String;.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_302;
        }
        obj2 = obj3;
        obj1 = resources.getStringArray(i);
        continue; /* Loop/switch isn't completed */
        obj2 = obj3;
        if ([I.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_328;
        }
        obj2 = obj3;
        if (![Ljava/lang/Integer;.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_342;
        }
        obj2 = obj3;
        obj1 = resources.getIntArray(i);
        continue; /* Loop/switch isn't completed */
        obj2 = obj3;
        if (!android/view/animation/Animation.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_371;
        }
        obj2 = obj3;
        obj1 = AnimationUtils.loadAnimation(application, i);
        continue; /* Loop/switch isn't completed */
        obj2 = obj3;
        if (!android/graphics/Movie.isAssignableFrom(class1))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj3;
        obj1 = resources.getMovie(i);
        if (true) goto _L4; else goto _L3
_L3:
        obj2 = obj1;
        field.setAccessible(true);
        obj2 = obj1;
        field.set(obj, obj1);
        return;
        if (obj2 != null)
        {
            obj = obj2.getClass();
        } else
        {
            obj = "(null)";
        }
        throw new IllegalArgumentException(String.format("Can't assign %s value %s to %s field %s", new Object[] {
            obj, obj2, field.getType(), field.getName()
        }));
    }

    public (Field field1, Application application1, InjectResource injectresource)
    {
        field = field1;
        application = application1;
        annotation = injectresource;
    }
}
