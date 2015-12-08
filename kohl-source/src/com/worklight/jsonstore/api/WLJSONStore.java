// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;

import android.content.Context;
import android.content.SharedPreferences;
import com.worklight.androidgap.jsonstore.security.SecurityManager;
import com.worklight.jsonstore.database.DatabaseAccessor;
import com.worklight.jsonstore.database.DatabaseManager;
import com.worklight.jsonstore.database.DatabaseSchema;
import com.worklight.jsonstore.exceptions.JSONStoreChangePasswordException;
import com.worklight.jsonstore.exceptions.JSONStoreCloseAllException;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreDestroyFailureException;
import com.worklight.jsonstore.exceptions.JSONStoreDestroyFileError;
import com.worklight.jsonstore.exceptions.JSONStoreFileAccessException;
import com.worklight.jsonstore.exceptions.JSONStoreInvalidPasswordException;
import com.worklight.jsonstore.exceptions.JSONStoreInvalidSchemaException;
import com.worklight.jsonstore.exceptions.JSONStoreMetadataRemovalFailure;
import com.worklight.jsonstore.exceptions.JSONStoreMigrationException;
import com.worklight.jsonstore.exceptions.JSONStoreNoTransactionInProgressException;
import com.worklight.jsonstore.exceptions.JSONStoreSchemaMismatchException;
import com.worklight.jsonstore.exceptions.JSONStoreTransactionDuringInitException;
import com.worklight.jsonstore.exceptions.JSONStoreTransactionFailureException;
import com.worklight.jsonstore.exceptions.JSONStoreTransactionInProgressException;
import com.worklight.jsonstore.util.JSONStoreLogger;
import com.worklight.jsonstore.util.JSONStoreUtil;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.api.SecurityUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.sqlcipher.database.SQLiteDatabase;

// Referenced classes of package com.worklight.jsonstore.api:
//            JSONStoreCollection, JSONStoreFileInfo, JSONStoreInitOptions

public class WLJSONStore
{

    private static final String LIBCRYPTO_FILE_NAME = "libcrypto.so.1.0.0";
    private static final int NUM_BYTES_FOR_SALT = 32;
    private static WLJSONStore instance;
    private static boolean transactionInProgress = false;
    private Map collectionMap;
    private Context context;
    private JSONStoreLogger logger;
    private String username;

    private WLJSONStore(Context context1)
    {
        context = null;
        logger = JSONStoreUtil.getCoreLogger();
        collectionMap = new HashMap();
        context = context1;
        WLUtils.loadLib(context1, "libcrypto.so.1.0.0");
    }

    private void checkVersionMigration(Context context1)
        throws JSONStoreFileAccessException, JSONStoreMigrationException
    {
label0:
        {
            JSONStoreLogger.logFileInfo(getFileInfo());
            SharedPreferences sharedpreferences = context1.getSharedPreferences("JsonstorePrefs", 0);
            if (sharedpreferences.getString("JsonstoreVer", null) == null)
            {
                logger.logTrace("Performing migration to JSONStore 2.0");
                File file = context1.getDatabasePath("wljsonstore");
                if (!file.exists() && !file.mkdirs())
                {
                    context1 = new JSONStoreFileAccessException("Unable to create jsonstore directory.");
                    logger.logTrace("Unable to create jsonstore directory.");
                    throw context1;
                }
                context1 = context1.getDatabasePath("com.ibm.worklight.database");
                if (context1.exists())
                {
                    if (!context1.renameTo(new File(file, "jsonstore.sqlite")))
                    {
                        break label0;
                    }
                    logger.logTrace("Migration to JSONStore 2.0 successful.");
                }
                context1 = sharedpreferences.edit();
                context1.putString("JsonstoreVer", "2.0");
                context1.commit();
            }
            return;
        }
        context1 = new JSONStoreMigrationException("Unable to migrate existing JSONStore database to version 2.0");
        logger.logTrace("Unable to migrate existing JSONStore database to version 2.0");
        throw context1;
    }

    private void disownAllCollections()
    {
        disownAllCollections(null);
    }

    private void disownAllCollections(String s)
    {
        for (Iterator iterator = collectionMap.values().iterator(); iterator.hasNext(); ((JSONStoreCollection)iterator.next()).disown(s)) { }
        collectionMap.clear();
    }

    private Context getContext()
    {
        return context;
    }

    public static WLJSONStore getInstance(Context context1)
    {
        if (instance == null)
        {
            WLUtils.loadLib(context1, "libcrypto.so.1.0.0");
            instance = new WLJSONStore(context1);
        }
        return instance;
    }

    private void handleUsernameAndPassword(DatabaseManager databasemanager, String s, String s1, String s2)
        throws JSONStoreCloseAllException, JSONStoreInvalidPasswordException
    {
        String s3;
        if (s == null)
        {
            if (databasemanager.getDbPath() == null)
            {
                databasemanager.setDbPath("jsonstore.sqlite");
            }
            if (!databasemanager.getDbPath().equalsIgnoreCase("jsonstore.sqlite"))
            {
                databasemanager = new JSONStoreCloseAllException("You tried to login with a user that is not the default user that is currently logged in. Call closeAll first.");
                logger.logTrace("You tried to login with a user that is not the default user that is currently logged in. Call closeAll first.");
                throw databasemanager;
            }
        } else
        if (databasemanager.getDbPath() == null)
        {
            databasemanager.setDbPath(s);
        } else
        if (!databasemanager.getDbPath().equals((new StringBuilder()).append(s).append(".sqlite").toString()))
        {
            databasemanager = (new StringBuilder()).append("You tried to login with a user that is not ").append(databasemanager.getDbPath()).append(". Call closeAll first.").toString();
            s = new JSONStoreCloseAllException(databasemanager);
            logger.logTrace(databasemanager);
            throw s;
        }
        if (s1 == null || s1.equals(""))
        {
            break MISSING_BLOCK_LABEL_124;
        }
        s3 = SecurityUtils.getRandomString(32);
        if (!SecurityManager.getInstance(getContext()).isDPKAvailable(s))
        {
            SecurityManager.getInstance(getContext()).storeDPK(s1, s, s2, s3, false);
        }
        databasemanager.setDatabaseKey(getContext(), s1, s);
        return;
        databasemanager;
        databasemanager = new JSONStoreInvalidPasswordException("Error setting key.", databasemanager);
        logger.logTrace("Error setting key.");
        throw databasemanager;
    }

    private boolean provisionDatabase(JSONStoreCollection jsonstorecollection, DatabaseSchema databaseschema, String s, String s1, boolean flag, String s2)
        throws JSONStoreFileAccessException, JSONStoreMigrationException, JSONStoreCloseAllException, JSONStoreInvalidPasswordException, JSONStoreSchemaMismatchException
    {
        checkVersionMigration(getContext());
        DatabaseManager databasemanager = DatabaseManager.getInstance();
        handleUsernameAndPassword(databasemanager, s, s1, s2);
        if (!flag && databaseschema.isSchemaMismatched(jsonstorecollection.getName(), databaseschema, getContext()))
        {
            jsonstorecollection = new JSONStoreSchemaMismatchException("Table schema mismatch for existing collection.");
            logger.logTrace("Table schema mismatch for existing collection.");
            throw jsonstorecollection;
        }
        if (!databasemanager.provisionDatabase(getContext(), databaseschema, flag))
        {
            try
            {
                databasemanager.getDatabase(jsonstorecollection.getName()).getReadableDatabase();
            }
            // Misplaced declaration of an exception variable
            catch (JSONStoreCollection jsonstorecollection)
            {
                jsonstorecollection = new JSONStoreFileAccessException("Could not retreive a database accessor.", jsonstorecollection);
                logger.logTrace("Could not retreive a database accessor.");
                throw jsonstorecollection;
            }
            return false;
        } else
        {
            return true;
        }
    }

    public void changePassword(String s, String s1, String s2)
        throws JSONStoreDatabaseClosedException, JSONStoreChangePasswordException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance;
label0:
        {
            jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(s, "", JSONStoreLogger.OPERATION_CHANGE_PASSWORD);
            try
            {
                DatabaseManager.getInstance().getDatabase();
                if (!DatabaseManager.getInstance().isDatabaseOpen())
                {
                    throw new JSONStoreDatabaseClosedException();
                }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            finally
            {
                jsonstoreanalyticsloginstance.end();
                throw s;
            }
        }
        throw new JSONStoreDatabaseClosedException();
        SecurityManager securitymanager = SecurityManager.getInstance(context);
        securitymanager.storeDPK(s2, s, securitymanager.getDPK(s1, s), securitymanager.getSalt(s), true);
        jsonstoreanalyticsloginstance.end();
        return;
        s;
        throw new JSONStoreChangePasswordException(s);
    }

    public void closeAll()
        throws JSONStoreCloseAllException, JSONStoreDatabaseClosedException, JSONStoreTransactionFailureException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(username, "", JSONStoreLogger.OPERATION_CLOSE_ALL);
        if (transactionInProgress)
        {
            throw new JSONStoreTransactionFailureException("Cannot close collections while executing a transaction.");
        }
        break MISSING_BLOCK_LABEL_37;
        Object obj;
        obj;
        jsonstoreanalyticsloginstance.end();
        throw obj;
        Object obj1;
        obj1 = DatabaseManager.getInstance();
        if (!((DatabaseManager) (obj1)).isDatabaseOpen())
        {
            obj1 = new JSONStoreDatabaseClosedException("Could not close all collections. The database is not open.");
            logger.logTrace("Could not close all collections. The database is not open.");
            throw obj1;
        }
        ((DatabaseManager) (obj1)).clearDbPath();
        ((DatabaseManager) (obj1)).clearDatabaseKey();
        ((DatabaseManager) (obj1)).closeDatabase();
        disownAllCollections();
        jsonstoreanalyticsloginstance.end();
        return;
        obj1;
        JSONStoreCloseAllException jsonstorecloseallexception = new JSONStoreCloseAllException("Could not close the database. An exception occurred.", ((Throwable) (obj1)));
        logger.logTrace("Could not close the database. An exception occurred.");
        throw jsonstorecloseallexception;
    }

    public boolean commitTransaction()
        throws JSONStoreNoTransactionInProgressException, JSONStoreTransactionFailureException, JSONStoreDatabaseClosedException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = JSONStoreLogger.startAnalyticsInstance(username, "", JSONStoreLogger.OPERATION_COMMIT_TRANSACTION);
        Object obj1 = DatabaseManager.getInstance().getDatabase();
        if (!isTransactionInProgress())
        {
            throw new JSONStoreNoTransactionInProgressException("No transaction in progress; cannot commit transaction.");
        }
        break MISSING_BLOCK_LABEL_61;
        obj1;
        ((com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance) (obj)).end();
        throw obj1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        throw new JSONStoreDatabaseClosedException();
        ((DatabaseAccessor) (obj1)).getRawDatabase().setTransactionSuccessful();
        ((DatabaseAccessor) (obj1)).getRawDatabase().endTransaction();
        transactionInProgress = false;
        ((com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance) (obj)).end();
        this;
        JVM INSTR monitorexit ;
        return true;
        Throwable throwable;
        throwable;
        throw new JSONStoreTransactionFailureException(throwable);
    }

    public void destroy()
        throws JSONStoreDestroyFailureException, JSONStoreTransactionFailureException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(username, "", JSONStoreLogger.OPERATION_DESTROY);
        if (transactionInProgress)
        {
            throw new JSONStoreTransactionFailureException("Cannot destroy store while executing a transaction.");
        }
        break MISSING_BLOCK_LABEL_37;
        Exception exception;
        exception;
        jsonstoreanalyticsloginstance.end();
        throw exception;
        DatabaseManager databasemanager = DatabaseManager.getInstance();
        databasemanager.destroyKeychain(getContext());
        databasemanager.destroyPreferences(getContext());
        databasemanager.clearDbPath();
        databasemanager.clearDatabaseKey();
        if (databasemanager.isDatabaseOpen())
        {
            databasemanager.closeDatabase();
        }
        disownAllCollections();
        transactionInProgress = false;
        if (databasemanager.destroyDatabase(getContext()) != 0)
        {
            JSONStoreDestroyFailureException jsonstoredestroyfailureexception = new JSONStoreDestroyFailureException("There was an error when destroying the JSONStore. The destroyDatabase failed.");
            logger.logTrace("There was an error when destroying the JSONStore. The destroyDatabase failed.");
            throw jsonstoredestroyfailureexception;
        }
        jsonstoreanalyticsloginstance.end();
        return;
    }

    public void destroy(String s)
        throws JSONStoreTransactionFailureException, JSONStoreDestroyFailureException, JSONStoreDestroyFileError, JSONStoreMetadataRemovalFailure
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance;
label0:
        {
            jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(s, "", JSONStoreLogger.OPERATION_DESTROY);
            try
            {
                if (transactionInProgress)
                {
                    throw new JSONStoreTransactionFailureException("Cannot destroy store while executing a transaction.");
                }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            finally
            {
                jsonstoreanalyticsloginstance.end();
                throw s;
            }
        }
        throw new JSONStoreDestroyFailureException(s.getMessage());
        Object obj;
        Object obj2;
        obj = DatabaseManager.getInstance();
        if (((DatabaseManager) (obj)).isDatabaseOpen())
        {
            ((DatabaseManager) (obj)).closeDatabase();
        }
        ((DatabaseManager) (obj)).clearDbPath();
        ((DatabaseManager) (obj)).clearDatabaseKey();
        obj = (new StringBuilder()).append("dpk-").append(s).toString();
        obj2 = context.getSharedPreferences("dpkPrefs", 0);
        ((SharedPreferences) (obj2)).edit().remove(((String) (obj))).commit();
        obj2 = ((SharedPreferences) (obj2)).getString(((String) (obj)), null);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        s = (new StringBuilder()).append("Failed to remove the following DPK Key: ").append(((String) (obj))).append(" with content: ").append(((String) (obj2))).toString();
        obj = new JSONStoreMetadataRemovalFailure(s);
        logger.logTrace(s);
        throw obj;
        Object obj1 = context.getDatabasePath("wljsonstore").getPath();
        obj1 = new File((new StringBuilder()).append(((String) (obj1))).append(File.separator).append(s).append(".sqlite").toString());
        if (((File) (obj1)).exists() && !((File) (obj1)).delete())
        {
            s = (new StringBuilder()).append("Failed to remove the following file: ").append(obj1).toString();
            obj1 = new JSONStoreDestroyFileError(s);
            logger.logTrace(s);
            throw obj1;
        }
        transactionInProgress = false;
        disownAllCollections(s);
        jsonstoreanalyticsloginstance.end();
        return;
    }

    public JSONStoreCollection getCollectionByName(String s)
    {
        JSONStoreCollection jsonstorecollection = (JSONStoreCollection)collectionMap.get(s);
        if (jsonstorecollection == null)
        {
            return null;
        }
        try
        {
            DatabaseManager.getInstance().getDatabase(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            removeCollectionReference(jsonstorecollection);
            return null;
        }
        return jsonstorecollection;
    }

    public List getFileInfo()
    {
        Object obj;
        TreeMap treemap;
        treemap = new TreeMap();
        obj = context.getDatabasePath("wljsonstore");
        if (!((File) (obj)).exists() || !((File) (obj)).isDirectory()) goto _L2; else goto _L1
_L1:
        File afile[];
        int i;
        int j;
        afile = ((File) (obj)).listFiles();
        j = afile.length;
        i = 0;
        obj = null;
_L4:
        if (i >= j) goto _L2; else goto _L3
_L3:
        Object obj1;
        String s1;
        long l;
        boolean flag;
        boolean flag1;
        obj1 = afile[i];
        if (obj1 == null || !((File) (obj1)).isFile() || !((File) (obj1)).getName().endsWith(".sqlite"))
        {
            break MISSING_BLOCK_LABEL_341;
        }
        String s = ((File) (obj1)).getName();
        s1 = s.substring(0, s.length() - ".sqlite".length());
        l = ((File) (obj1)).length();
        flag = true;
        flag1 = true;
        obj1 = new FileInputStream(((File) (obj1)));
        Object obj2 = obj1;
        obj = new byte[6];
        obj2 = obj1;
        ((FileInputStream) (obj1)).read(((byte []) (obj)), 0, 6);
        obj2 = obj1;
        boolean flag2 = (new String(((byte []) (obj)))).equalsIgnoreCase("SQLite");
        flag = flag1;
        if (flag2)
        {
            flag = false;
        }
        obj2 = obj1;
        flag1 = flag;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        ((FileInputStream) (obj1)).close();
        flag1 = flag;
        obj2 = obj1;
_L5:
        treemap.put(s1, new JSONStoreFileInfo(s1, l, flag1));
_L10:
        i++;
        obj = obj2;
          goto _L4
        obj;
        ((IOException) (obj)).printStackTrace();
        obj2 = obj1;
        flag1 = flag;
          goto _L5
        IOException ioexception;
        ioexception;
_L9:
        obj2 = obj;
        ioexception.printStackTrace();
        obj2 = obj;
        flag1 = flag;
        if (obj == null) goto _L5; else goto _L6
_L6:
        ((FileInputStream) (obj)).close();
        obj2 = obj;
        flag1 = flag;
          goto _L5
        obj1;
        ((IOException) (obj1)).printStackTrace();
        obj2 = obj;
        flag1 = flag;
          goto _L5
        obj2;
        obj1 = obj;
        obj = obj2;
_L8:
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        throw obj;
_L2:
        return new ArrayList(treemap.values());
        obj;
        obj1 = obj2;
        if (true) goto _L8; else goto _L7
_L7:
        ioexception;
        obj = obj1;
          goto _L9
        obj2 = obj;
          goto _L10
    }

    String getUsername()
    {
        return username;
    }

    public boolean isTransactionInProgress()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = transactionInProgress;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void openCollections(List list)
        throws JSONStoreInvalidSchemaException, JSONStoreFileAccessException, JSONStoreMigrationException, JSONStoreCloseAllException, JSONStoreInvalidPasswordException, JSONStoreSchemaMismatchException, JSONStoreTransactionDuringInitException
    {
        openCollections(list, null);
    }

    public void openCollections(List list, JSONStoreInitOptions jsonstoreinitoptions)
        throws JSONStoreInvalidSchemaException, JSONStoreFileAccessException, JSONStoreMigrationException, JSONStoreCloseAllException, JSONStoreInvalidPasswordException, JSONStoreSchemaMismatchException, JSONStoreTransactionDuringInitException
    {
        if (transactionInProgress)
        {
            throw new JSONStoreTransactionDuringInitException("Cannot open collections while executing a transaction.");
        }
        if (list != null)
        {
            JSONStoreInitOptions jsonstoreinitoptions1 = jsonstoreinitoptions;
            if (jsonstoreinitoptions == null)
            {
                jsonstoreinitoptions1 = new JSONStoreInitOptions();
            }
            boolean flag = jsonstoreinitoptions1.isClear();
            jsonstoreinitoptions = jsonstoreinitoptions1.getPassword();
            username = jsonstoreinitoptions1.getUsername();
            String s = jsonstoreinitoptions1.getSecureRandom();
            JSONStoreLogger.setAnalyticsEnabled(jsonstoreinitoptions1.isAnalyticsEnabled());
            list = list.iterator();
            while (list.hasNext()) 
            {
                JSONStoreCollection jsonstorecollection = (JSONStoreCollection)list.next();
                if (jsonstorecollection != null)
                {
                    com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(username, jsonstorecollection.getName(), JSONStoreLogger.OPERATION_OPEN);
                    DatabaseSchema databaseschema;
                    boolean flag1;
                    try
                    {
                        databaseschema = new DatabaseSchema(jsonstorecollection.getName(), jsonstorecollection.getAllSearchFields());
                    }
                    // Misplaced declaration of an exception variable
                    catch (List list)
                    {
                        list = new JSONStoreInvalidSchemaException("Error when validating schema.", list);
                        logger.logTrace("Error when validating schema.");
                        throw list;
                    }
                    flag1 = provisionDatabase(jsonstorecollection, databaseschema, username, jsonstoreinitoptions, flag, s);
                    collectionMap.put(jsonstorecollection.getName(), jsonstorecollection);
                    jsonstorecollection.initialize(this, databaseschema, flag1);
                    jsonstoreanalyticsloginstance.end();
                }
            }
        }
    }

    void removeCollectionReference(JSONStoreCollection jsonstorecollection)
    {
        jsonstorecollection.disown();
        collectionMap.remove(jsonstorecollection);
    }

    public boolean rollbackTransaction()
        throws JSONStoreNoTransactionInProgressException, JSONStoreDatabaseClosedException, JSONStoreTransactionFailureException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = JSONStoreLogger.startAnalyticsInstance(username, "", JSONStoreLogger.OPERATION_ROLLBACK_TRANSACTION);
        Object obj1 = DatabaseManager.getInstance().getDatabase();
        if (!isTransactionInProgress())
        {
            throw new JSONStoreNoTransactionInProgressException("No transaction in progress; cannot roll back transaction.");
        }
        break MISSING_BLOCK_LABEL_61;
        obj1;
        ((com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance) (obj)).end();
        throw obj1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        throw new JSONStoreDatabaseClosedException();
        ((DatabaseAccessor) (obj1)).getRawDatabase().endTransaction();
        transactionInProgress = false;
        ((com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance) (obj)).end();
        this;
        JVM INSTR monitorexit ;
        return true;
        Throwable throwable;
        throwable;
        throw new JSONStoreTransactionFailureException(throwable);
    }

    public void setAnalyticsEnabled(boolean flag)
    {
        JSONStoreLogger.setAnalyticsEnabled(flag);
    }

    public void startTransaction()
        throws JSONStoreTransactionInProgressException, JSONStoreTransactionFailureException, JSONStoreDatabaseClosedException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = JSONStoreLogger.startAnalyticsInstance(username, "", JSONStoreLogger.OPERATION_START_TRANSACTION);
        Object obj1 = DatabaseManager.getInstance().getDatabase();
        if (isTransactionInProgress())
        {
            throw new JSONStoreTransactionInProgressException("Cannot start a new transaction; a transaction is already in progress.");
        }
        break MISSING_BLOCK_LABEL_61;
        obj1;
        ((com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance) (obj)).end();
        throw obj1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        throw new JSONStoreDatabaseClosedException();
        ((DatabaseAccessor) (obj1)).getRawDatabase().beginTransaction();
        transactionInProgress = true;
        ((com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance) (obj)).end();
        this;
        JVM INSTR monitorexit ;
        return;
        Throwable throwable;
        throwable;
        throw new JSONStoreTransactionFailureException(throwable);
    }

}
