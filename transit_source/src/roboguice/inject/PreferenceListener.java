// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Application;
import android.preference.PreferenceActivity;
import com.google.inject.MembersInjector;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

// Referenced classes of package roboguice.inject:
//            InjectPreference, ContextScope, Nullable

public class PreferenceListener
    implements TypeListener
{
    class PreferenceMembersInjector
        implements MembersInjector
    {

        protected InjectPreference annotation;
        protected Provider contextProvider;
        protected Field field;
        protected WeakReference instanceRef;
        protected ContextScope scope;
        final PreferenceListener this$0;

        public void injectMembers(Object obj)
        {
            instanceRef = new WeakReference(obj);
            registerPreferenceForInjection(this);
        }

        public void reallyInjectMembers()
        {
            Object obj;
            Object obj2;
            obj2 = instanceRef.get();
            if (obj2 == null)
            {
                return;
            }
            obj = null;
            android.preference.Preference preference = ((PreferenceActivity)contextProvider.get()).findPreference(annotation.value());
            if (preference != null)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            obj = preference;
            if (Nullable.notNullable(field))
            {
                obj = preference;
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
                catch (IllegalArgumentException illegalargumentexception) { }
                break MISSING_BLOCK_LABEL_128;
            }
            obj = preference;
            field.setAccessible(true);
            obj = preference;
            field.set(obj2, preference);
            return;
            Object obj1;
            if (obj != null)
            {
                obj1 = obj.getClass();
            } else
            {
                obj1 = "(null)";
            }
            throw new IllegalArgumentException(String.format("Can't assign %s value %s to %s field %s", new Object[] {
                obj1, obj, field.getType(), field.getName()
            }));
        }

        public PreferenceMembersInjector(Field field1, Provider provider, InjectPreference injectpreference, ContextScope contextscope)
        {
            this$0 = PreferenceListener.this;
            super();
            field = field1;
            annotation = injectpreference;
            contextProvider = provider;
            scope = contextscope;
        }
    }


    protected Application application;
    protected Provider contextProvider;
    protected ArrayList preferencesForInjection;
    protected ContextScope scope;

    public PreferenceListener(Provider provider, Application application1, ContextScope contextscope)
    {
        preferencesForInjection = new ArrayList();
        contextProvider = provider;
        application = application1;
        scope = contextscope;
    }

    public void hear(TypeLiteral typeliteral, TypeEncounter typeencounter)
    {
        for (typeliteral = typeliteral.getRawType(); typeliteral != java/lang/Object; typeliteral = typeliteral.getSuperclass())
        {
            Field afield[] = typeliteral.getDeclaredFields();
            int j = afield.length;
            for (int i = 0; i < j; i++)
            {
                Field field = afield[i];
                if (!field.isAnnotationPresent(roboguice/inject/InjectPreference))
                {
                    continue;
                }
                if (Modifier.isStatic(field.getModifiers()))
                {
                    throw new UnsupportedOperationException("Preferences may not be statically injected");
                }
                typeencounter.register(new PreferenceMembersInjector(field, contextProvider, (InjectPreference)field.getAnnotation(roboguice/inject/InjectPreference), scope));
            }

        }

    }

    public void injectPreferenceViews()
    {
        for (int i = preferencesForInjection.size() - 1; i >= 0; i--)
        {
            ((PreferenceMembersInjector)preferencesForInjection.remove(i)).reallyInjectMembers();
        }

    }

    public void registerPreferenceForInjection(PreferenceMembersInjector preferencemembersinjector)
    {
        preferencesForInjection.add(preferencemembersinjector);
    }
}
