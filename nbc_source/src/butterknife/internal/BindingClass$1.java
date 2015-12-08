// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//            BindingClass

static class ViewBinding.Kind
{

    static final int $SwitchMap$butterknife$internal$FieldCollectionViewBinding$Kind[];

    static 
    {
        $SwitchMap$butterknife$internal$FieldCollectionViewBinding$Kind = new int[ViewBinding.Kind.values().length];
        try
        {
            $SwitchMap$butterknife$internal$FieldCollectionViewBinding$Kind[ViewBinding.Kind.ARRAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$butterknife$internal$FieldCollectionViewBinding$Kind[ViewBinding.Kind.LIST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
