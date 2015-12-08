// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            ProgramCardInfo, Program, OcrResults

public interface ProgramCardsHandler
{

    public abstract ProgramCardInfo createProgramCard();

    public abstract Program fetchProgram(String s)
        throws RpcException, CallErrorException;

    public abstract Intent getImageCaptureIntent(Context context, int i, com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings imagecaptureanalyticsstrings);

    public abstract int getOcrType();

    public abstract int getOcrUserEventType();

    public abstract void loadCardInfoWithOcrResults(ProgramCardInfo programcardinfo, OcrResults ocrresults);

    public abstract com.google.wallet.proto.NanoWalletObjects.WobInstance makeWobInstance(ProgramCardInfo programcardinfo)
        throws RpcException, CallErrorException;

    public abstract void onEditCardInfoViewInflated(LayoutInflater layoutinflater, View view, int i, ProgramCardInfo programcardinfo);

    public abstract void placeUserDataPrompts(List list, ViewGroup viewgroup, LayoutInflater layoutinflater, ProgramCardInfo programcardinfo);

    public abstract boolean processCustomSection(ProgramCardInfo programcardinfo, int i);

    public abstract List search(String s)
        throws RpcException, CallErrorException;

    public abstract boolean setupProgram(ProgramCardInfo programcardinfo, Program program, String s);

    public abstract boolean showAddProgramCardWarningDialogIfNecessary(EditCardInfoFragment.EditCardInfoCallback editcardinfocallback, ProgramCardInfo programcardinfo);

    public abstract boolean supportsImageCapture();
}
