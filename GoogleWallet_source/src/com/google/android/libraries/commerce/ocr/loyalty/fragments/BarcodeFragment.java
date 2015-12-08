// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo;
import com.google.android.libraries.commerce.ocr.loyalty.ui.OcrViewPresenterImpl;
import com.google.android.libraries.commerce.ocr.util.NativeLibraryLoader;
import com.google.common.collect.Lists;
import dagger.ObjectGraph;
import java.util.List;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            FragmentModule, BarcodeModule, BarcodeBundleModule, OcrStateManager

public class BarcodeFragment extends Fragment
{

    public static Object overrideModule;
    private boolean isProcessingEnabled;
    private boolean isViewAttached;
    private ObjectGraph objectGraph;

    public BarcodeFragment()
    {
    }

    private void enableFrameProcessors()
    {
        if (isViewAttached && isProcessingEnabled)
        {
            ((com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.Presenter)objectGraph.get(com/google/android/libraries/commerce/ocr/ui/CameraPreviewView$Presenter)).enableImageProcessing();
        }
    }

    private List getModules()
    {
        java.util.ArrayList arraylist = Lists.newArrayList(new Object[] {
            new FragmentModule(this), new BarcodeModule(this), new BarcodeBundleModule(getArguments())
        });
        if (overrideModule != null)
        {
            arraylist.add(overrideModule);
        }
        return arraylist;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        objectGraph = ObjectGraph.create(getModules().toArray());
        ((OcrViewPresenterImpl)objectGraph.get(com/google/android/libraries/commerce/ocr/loyalty/ui/OcrViewPresenterImpl)).attachView();
        isViewAttached = true;
        enableFrameProcessors();
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        NativeLibraryLoader.loadOcrClientLibrary();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.google.android.libraries.commerce.ocr.R.layout.ocr, viewgroup, false);
    }

    public final void onPause()
    {
        super.onPause();
        ((OcrStateManager)objectGraph.get(com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrStateManager)).exit(0, null, new DebugInfo());
    }

    public final void onResume()
    {
        super.onResume();
        ((OcrStateManager)objectGraph.get(com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrStateManager)).reset();
    }

    public final void startProcessing()
    {
        this;
        JVM INSTR monitorenter ;
        isProcessingEnabled = true;
        enableFrameProcessors();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
