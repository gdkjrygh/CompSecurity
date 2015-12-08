// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import com.worklight.androidgap.jsonstore.dispatchers.AdvancedFindActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.AllDirtyActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.ChangeActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.ChangePasswordActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.ClearActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.CloseDatabaseActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.CommitTransactionActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.CountActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.DestroyDBFileAndKeychainActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.DropTableActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.FileInfoActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.FindActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.FindByIdActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.IsDirtyActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.IsKeyGenRequiredActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.LocalCountActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.MarkCleanActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.ProvisionActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.RemoveActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.ReplaceActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.RollbackTransactionActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.StartTransactionActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.StoreActionDispatcher;
import com.worklight.androidgap.jsonstore.dispatchers.StoreDPKActionDispatcher;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

// Referenced classes of package com.worklight.androidgap.plugin:
//            DispatchingPlugin

public class StoragePlugin extends DispatchingPlugin
{

    public StoragePlugin()
    {
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        cordovainterface = cordova.getActivity().getBaseContext();
        addDispatcher(new AllDirtyActionDispatcher(cordovainterface));
        addDispatcher(new ChangePasswordActionDispatcher(cordovainterface));
        addDispatcher(new CloseDatabaseActionDispatcher(cordovainterface));
        addDispatcher(new DestroyDBFileAndKeychainActionDispatcher(cordovainterface));
        addDispatcher(new DropTableActionDispatcher(cordovainterface));
        addDispatcher(new CountActionDispatcher(cordovainterface));
        addDispatcher(new FindActionDispatcher(cordovainterface));
        addDispatcher(new AdvancedFindActionDispatcher(cordovainterface));
        addDispatcher(new FindByIdActionDispatcher(cordovainterface));
        addDispatcher(new IsDirtyActionDispatcher(cordovainterface));
        addDispatcher(new IsKeyGenRequiredActionDispatcher(cordovainterface));
        addDispatcher(new LocalCountActionDispatcher(cordovainterface));
        addDispatcher(new MarkCleanActionDispatcher(cordovainterface));
        addDispatcher(new ProvisionActionDispatcher(cordovainterface));
        addDispatcher(new RemoveActionDispatcher(cordovainterface));
        addDispatcher(new ReplaceActionDispatcher(cordovainterface));
        addDispatcher(new StoreActionDispatcher(cordovainterface));
        addDispatcher(new StoreDPKActionDispatcher(cordovainterface));
        addDispatcher(new ClearActionDispatcher(cordovainterface));
        addDispatcher(new ChangeActionDispatcher(cordovainterface));
        addDispatcher(new FileInfoActionDispatcher(cordovainterface));
        addDispatcher(new StartTransactionActionDispatcher(cordovainterface));
        addDispatcher(new CommitTransactionActionDispatcher(cordovainterface));
        addDispatcher(new RollbackTransactionActionDispatcher(cordovainterface));
    }
}
