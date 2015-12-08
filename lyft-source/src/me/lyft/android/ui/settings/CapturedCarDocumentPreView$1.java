// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;


// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedCarDocumentPreView

class this._cls0
    implements me.lyft.android.ui.camera.ner
{

    final CapturedCarDocumentPreView this$0;

    public void onSave()
    {
        switch (.SwitchMap.me.lyft.android.ui.settings.SettingsScreens.CapturedCarDocumentScreen.DocumentType[CapturedCarDocumentPreView.access$000(CapturedCarDocumentPreView.this).getDocumentType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            CapturedCarDocumentPreView.access$100(CapturedCarDocumentPreView.this);
            return;

        case 2: // '\002'
            CapturedCarDocumentPreView.access$200(CapturedCarDocumentPreView.this);
            break;
        }
    }

    cumentScreen.DocumentType()
    {
        this$0 = CapturedCarDocumentPreView.this;
        super();
    }
}
