// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import com.lyft.scoop.IHaveParent;
import com.lyft.scoop.Screen;

// Referenced classes of package me.lyft.android.ui.settings:
//            SettingsScreens

public class documentType extends SettingsScreens
    implements IHaveParent
{

    private DocumentType documentType;

    public DocumentType getDocumentType()
    {
        return documentType;
    }

    public Screen getParent()
    {
        return new documentType();
    }

    public DocumentType(DocumentType documenttype)
    {
        documentType = documenttype;
    }
}
