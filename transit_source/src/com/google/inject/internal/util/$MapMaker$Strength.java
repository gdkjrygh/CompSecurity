// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $MapMaker

private static abstract class <init> extends Enum
{

    private static final STRONG $VALUES[];
    public static final STRONG SOFT;
    public static final STRONG STRONG;
    public static final STRONG WEAK;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/inject/internal/util/$MapMaker$Strength, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract Entry copyEntry(Object obj, Entry entry, Entry entry1);

    abstract boolean equal(Object obj, Object obj1);

    abstract int hash(Object obj);

    abstract Entry newEntry(shMap.Internals internals, Object obj, int i, Entry entry);

    abstract rence referenceValue(Entry entry, Object obj);

    static 
    {
        WEAK = new .MapMaker.Strength("WEAK", 0) {

            .MapMaker.ReferenceEntry copyEntry(Object obj, .MapMaker.ReferenceEntry referenceentry, .MapMaker.ReferenceEntry referenceentry1)
            {
                referenceentry = (.MapMaker.WeakEntry)referenceentry;
                if (referenceentry1 == null)
                {
                    return new .MapMaker.WeakEntry(((.MapMaker.WeakEntry) (referenceentry)).internals, obj, ((.MapMaker.WeakEntry) (referenceentry)).hash);
                } else
                {
                    return new .MapMaker.LinkedWeakEntry(((.MapMaker.WeakEntry) (referenceentry)).internals, obj, ((.MapMaker.WeakEntry) (referenceentry)).hash, referenceentry1);
                }
            }

            boolean equal(Object obj, Object obj1)
            {
                return obj == obj1;
            }

            int hash(Object obj)
            {
                return System.identityHashCode(obj);
            }

            .MapMaker.ReferenceEntry newEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, .MapMaker.ReferenceEntry referenceentry)
            {
                if (referenceentry == null)
                {
                    return new .MapMaker.WeakEntry(internals, obj, i);
                } else
                {
                    return new .MapMaker.LinkedWeakEntry(internals, obj, i, referenceentry);
                }
            }

            .MapMaker.ValueReference referenceValue(.MapMaker.ReferenceEntry referenceentry, Object obj)
            {
                return new .MapMaker.WeakValueReference(obj, referenceentry);
            }

        };
        SOFT = new .MapMaker.Strength("SOFT", 1) {

            .MapMaker.ReferenceEntry copyEntry(Object obj, .MapMaker.ReferenceEntry referenceentry, .MapMaker.ReferenceEntry referenceentry1)
            {
                referenceentry = (.MapMaker.SoftEntry)referenceentry;
                if (referenceentry1 == null)
                {
                    return new .MapMaker.SoftEntry(((.MapMaker.SoftEntry) (referenceentry)).internals, obj, ((.MapMaker.SoftEntry) (referenceentry)).hash);
                } else
                {
                    return new .MapMaker.LinkedSoftEntry(((.MapMaker.SoftEntry) (referenceentry)).internals, obj, ((.MapMaker.SoftEntry) (referenceentry)).hash, referenceentry1);
                }
            }

            boolean equal(Object obj, Object obj1)
            {
                return obj == obj1;
            }

            int hash(Object obj)
            {
                return System.identityHashCode(obj);
            }

            .MapMaker.ReferenceEntry newEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, .MapMaker.ReferenceEntry referenceentry)
            {
                if (referenceentry == null)
                {
                    return new .MapMaker.SoftEntry(internals, obj, i);
                } else
                {
                    return new .MapMaker.LinkedSoftEntry(internals, obj, i, referenceentry);
                }
            }

            .MapMaker.ValueReference referenceValue(.MapMaker.ReferenceEntry referenceentry, Object obj)
            {
                return new .MapMaker.SoftValueReference(obj, referenceentry);
            }

        };
        STRONG = new .MapMaker.Strength("STRONG", 2) {

            .MapMaker.ReferenceEntry copyEntry(Object obj, .MapMaker.ReferenceEntry referenceentry, .MapMaker.ReferenceEntry referenceentry1)
            {
                referenceentry = (.MapMaker.StrongEntry)referenceentry;
                if (referenceentry1 == null)
                {
                    return new .MapMaker.StrongEntry(((.MapMaker.StrongEntry) (referenceentry)).internals, obj, ((.MapMaker.StrongEntry) (referenceentry)).hash);
                } else
                {
                    return new .MapMaker.LinkedStrongEntry(((.MapMaker.StrongEntry) (referenceentry)).internals, obj, ((.MapMaker.StrongEntry) (referenceentry)).hash, referenceentry1);
                }
            }

            boolean equal(Object obj, Object obj1)
            {
                return obj.equals(obj1);
            }

            int hash(Object obj)
            {
                return obj.hashCode();
            }

            .MapMaker.ReferenceEntry newEntry(.CustomConcurrentHashMap.Internals internals, Object obj, int i, .MapMaker.ReferenceEntry referenceentry)
            {
                if (referenceentry == null)
                {
                    return new .MapMaker.StrongEntry(internals, obj, i);
                } else
                {
                    return new .MapMaker.LinkedStrongEntry(internals, obj, i, referenceentry);
                }
            }

            .MapMaker.ValueReference referenceValue(.MapMaker.ReferenceEntry referenceentry, Object obj)
            {
                return new .MapMaker.StrongValueReference(obj);
            }

        };
        $VALUES = (new .VALUES[] {
            WEAK, SOFT, STRONG
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
