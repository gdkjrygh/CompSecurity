// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Function;
import com.google.inject.internal.util.$ImmutableMap;
import com.google.inject.internal.util.$MapMaker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Map;
import java.util.logging.Logger;

public final class BytecodeGen
{
    private static class BridgeClassLoader extends ClassLoader
    {

        Class classicLoadClass(String s, boolean flag)
            throws ClassNotFoundException
        {
            return super.loadClass(s, flag);
        }

        protected Class loadClass(String s, boolean flag)
            throws ClassNotFoundException
        {
            if (!s.startsWith("sun.reflect")) goto _L2; else goto _L1
_L1:
            Class class1 = SystemBridgeHolder.SYSTEM_BRIDGE.classicLoadClass(s, flag);
_L4:
            return class1;
_L2:
            if (!s.startsWith(BytecodeGen.GUICE_INTERNAL_PACKAGE) && !s.startsWith(" "))
            {
                break MISSING_BLOCK_LABEL_80;
            }
            if (BytecodeGen.GUICE_CLASS_LOADER == null)
            {
                return SystemBridgeHolder.SYSTEM_BRIDGE.classicLoadClass(s, flag);
            }
            Class class2 = BytecodeGen.GUICE_CLASS_LOADER.loadClass(s);
            class1 = class2;
            if (!flag) goto _L4; else goto _L3
_L3:
            resolveClass(class2);
            return class2;
            Throwable throwable;
            throwable;
            return classicLoadClass(s, flag);
        }

        BridgeClassLoader()
        {
        }

        BridgeClassLoader(ClassLoader classloader)
        {
            super(classloader);
        }
    }

    private static class SystemBridgeHolder
    {

        static final BridgeClassLoader SYSTEM_BRIDGE = new BridgeClassLoader();


        private SystemBridgeHolder()
        {
        }
    }

    public static abstract class Visibility extends Enum
    {

        private static final Visibility $VALUES[];
        public static final Visibility PUBLIC;
        public static final Visibility SAME_PACKAGE;

        public static Visibility forMember(Member member)
        {
            if ((member.getModifiers() & 5) == 0)
            {
                return SAME_PACKAGE;
            }
            int j;
            if (member instanceof Constructor)
            {
                member = ((Constructor)member).getParameterTypes();
            } else
            {
                member = (Method)member;
                if (forType(member.getReturnType()) == SAME_PACKAGE)
                {
                    return SAME_PACKAGE;
                }
                member = member.getParameterTypes();
            }
            j = member.length;
            for (int i = 0; i < j; i++)
            {
                if (forType(member[i]) == SAME_PACKAGE)
                {
                    return SAME_PACKAGE;
                }
            }

            return PUBLIC;
        }

        public static Visibility forType(Class class1)
        {
            if ((class1.getModifiers() & 5) != 0)
            {
                return PUBLIC;
            } else
            {
                return SAME_PACKAGE;
            }
        }

        public static Visibility valueOf(String s)
        {
            return (Visibility)Enum.valueOf(com/google/inject/internal/BytecodeGen$Visibility, s);
        }

        public static Visibility[] values()
        {
            return (Visibility[])$VALUES.clone();
        }

        public abstract Visibility and(Visibility visibility);

        static 
        {
            PUBLIC = new Visibility("PUBLIC", 0) {

                public Visibility and(Visibility visibility)
                {
                    return visibility;
                }

            };
            SAME_PACKAGE = new Visibility("SAME_PACKAGE", 1) {

                public Visibility and(Visibility visibility)
                {
                    return this;
                }

            };
            $VALUES = (new Visibility[] {
                PUBLIC, SAME_PACKAGE
            });
        }

        private Visibility(String s, int i)
        {
            super(s, i);
        }

    }


    private static final String CGLIB_PACKAGE = " ";
    private static final Map CLASS_LOADER_CACHE;
    private static final boolean CUSTOM_LOADER_ENABLED;
    static final ClassLoader GUICE_CLASS_LOADER = canonicalize(com/google/inject/internal/BytecodeGen.getClassLoader());
    static final String GUICE_INTERNAL_PACKAGE = com/google/inject/internal/BytecodeGen.getName().replaceFirst("\\.internal\\..*$", ".internal");
    static final Logger logger = Logger.getLogger(com/google/inject/internal/BytecodeGen.getName());

    public BytecodeGen()
    {
    }

    private static ClassLoader canonicalize(ClassLoader classloader)
    {
        if (classloader != null)
        {
            return classloader;
        } else
        {
            return SystemBridgeHolder.SYSTEM_BRIDGE.getParent();
        }
    }

    public static ClassLoader getClassLoader(Class class1)
    {
        return getClassLoader(class1, class1.getClassLoader());
    }

    private static ClassLoader getClassLoader(Class class1, ClassLoader classloader)
    {
        if (!CUSTOM_LOADER_ENABLED)
        {
            return classloader;
        }
        if (class1.getName().startsWith("java."))
        {
            return GUICE_CLASS_LOADER;
        }
        classloader = canonicalize(classloader);
        if (classloader == GUICE_CLASS_LOADER || (classloader instanceof BridgeClassLoader))
        {
            return classloader;
        }
        if (Visibility.forType(class1) == Visibility.PUBLIC)
        {
            if (classloader != SystemBridgeHolder.SYSTEM_BRIDGE.getParent())
            {
                return (ClassLoader)CLASS_LOADER_CACHE.get(classloader);
            } else
            {
                return SystemBridgeHolder.SYSTEM_BRIDGE;
            }
        } else
        {
            return classloader;
        }
    }

    static 
    {
        CUSTOM_LOADER_ENABLED = Boolean.parseBoolean(System.getProperty("guice.custom.loader", "true"));
        if (CUSTOM_LOADER_ENABLED)
        {
            CLASS_LOADER_CACHE = (new $MapMaker()).weakKeys().weakValues().makeComputingMap(new $Function() {

                public ClassLoader apply(ClassLoader classloader)
                {
                    BytecodeGen.logger.fine((new StringBuilder()).append("Creating a bridge ClassLoader for ").append(classloader).toString());
                    return (ClassLoader)AccessController.doPrivileged(classloader. new PrivilegedAction() {

                        final _cls1 this$0;
                        final ClassLoader val$typeClassLoader;

                        public ClassLoader run()
                        {
                            return new BridgeClassLoader(typeClassLoader);
                        }

                        public volatile Object run()
                        {
                            return run();
                        }

            
            {
                this$0 = final__pcls1;
                typeClassLoader = ClassLoader.this;
                super();
            }
                    });
                }

                public volatile Object apply(Object obj)
                {
                    return apply((ClassLoader)obj);
                }

            });
        } else
        {
            CLASS_LOADER_CACHE = $ImmutableMap.of();
        }
    }
}
