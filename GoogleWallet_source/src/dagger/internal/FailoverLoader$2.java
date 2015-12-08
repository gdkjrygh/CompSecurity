// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Memoizer, FailoverLoader

class this._cls0 extends Memoizer
{

    final FailoverLoader this$0;

    private InjectBindingInfo create(InjectBindingKey injectbindingkey)
    {
        return FailoverLoader.access$200(FailoverLoader.this, InjectBindingKey.access._mth000(injectbindingkey), InjectBindingKey.access._mth100(injectbindingkey));
    }

    protected final volatile Object create(Object obj)
    {
        return create((InjectBindingKey)obj);
    }

    InjectBindingInfo()
    {
        this$0 = FailoverLoader.this;
        super();
    }
}
