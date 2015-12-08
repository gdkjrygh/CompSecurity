// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.transfer.TransferType;
import com.skype.android.app.transfer.TransferUtil;
import java.io.File;

// Referenced classes of package com.skype.android.app.chat:
//            AppNotInstalledActivity

public class OfficeNotInstalledActivity extends AppNotInstalledActivity
{

    public static final String EXTRA_FILE_PATH = "path";
    private String transferPath;
    private TransferType transferType;
    TransferUtil transferUtil;

    public OfficeNotInstalledActivity()
    {
    }

    protected int getAppColor()
    {
        return transferType.getAppinfo().color;
    }

    protected String getDescription()
    {
        Resources resources = getResources();
        return resources.getString(0x7f080463, new Object[] {
            resources.getString(transferType.getAppinfo().title)
        });
    }

    protected String getGoToStoreText()
    {
        Resources resources = getResources();
        return resources.getString(0x7f080464, new Object[] {
            resources.getString(transferType.getAppinfo().title)
        });
    }

    protected String getPackageUri()
    {
        return (new StringBuilder("market://details?id=")).append(transferType.getAppinfo().appPackage).toString();
    }

    protected com.skype.android.widget.SymbolElement.SymbolCode getSymbol()
    {
        return transferType.getSymbolCode();
    }

    protected int getTitleText()
    {
        return transferType.getAppinfo().title;
    }

    protected void onCancel()
    {
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri uri = Uri.fromFile(new File(transferPath));
            String s = transferPath.substring(transferPath.lastIndexOf(".") + 1, transferPath.length());
            intent.setDataAndType(uri, MimeTypeMap.getSingleton().getMimeTypeFromExtension(s));
            intent.addFlags(0x10000000);
            startActivity(intent);
            finish();
            return;
        }
        catch (Exception exception)
        {
            transferUtil.showFileNotRecognizedDialog(this, true);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        transferPath = getIntent().getStringExtra("path");
        transferType = TransferType.getDocType(transferPath);
    }
}
