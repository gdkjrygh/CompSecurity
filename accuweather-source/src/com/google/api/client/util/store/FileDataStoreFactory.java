// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Maps;
import com.google.api.client.util.Throwables;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Logger;

// Referenced classes of package com.google.api.client.util.store:
//            AbstractDataStoreFactory, DataStore, AbstractMemoryDataStore, DataStoreFactory

public class FileDataStoreFactory extends AbstractDataStoreFactory
{
    static class FileDataStore extends AbstractMemoryDataStore
    {

        private final File dataFile;

        public volatile DataStoreFactory getDataStoreFactory()
        {
            return getDataStoreFactory();
        }

        public FileDataStoreFactory getDataStoreFactory()
        {
            return (FileDataStoreFactory)super.getDataStoreFactory();
        }

        void save()
            throws IOException
        {
            IOUtils.serialize(keyValueMap, new FileOutputStream(dataFile));
        }

        FileDataStore(FileDataStoreFactory filedatastorefactory, File file, String s)
            throws IOException
        {
            super(filedatastorefactory, s);
            dataFile = new File(file, s);
            if (IOUtils.isSymbolicLink(dataFile))
            {
                throw new IOException((new StringBuilder()).append("unable to use a symbolic link: ").append(dataFile).toString());
            }
            if (dataFile.createNewFile())
            {
                keyValueMap = Maps.newHashMap();
                save();
                return;
            } else
            {
                keyValueMap = (HashMap)IOUtils.deserialize(new FileInputStream(dataFile));
                return;
            }
        }
    }


    private static final Logger LOGGER = Logger.getLogger(com/google/api/client/util/store/FileDataStoreFactory.getName());
    private final File dataDirectory;

    public FileDataStoreFactory(File file)
        throws IOException
    {
        file = file.getCanonicalFile();
        dataDirectory = file;
        if (IOUtils.isSymbolicLink(file))
        {
            throw new IOException((new StringBuilder()).append("unable to use a symbolic link: ").append(file).toString());
        }
        if (!file.exists() && !file.mkdirs())
        {
            throw new IOException((new StringBuilder()).append("unable to create directory: ").append(file).toString());
        } else
        {
            setPermissionsToOwnerOnly(file);
            return;
        }
    }

    static void setPermissionsToOwnerOnly(File file)
        throws IOException
    {
        try
        {
            Method method = java/io/File.getMethod("setReadable", new Class[] {
                Boolean.TYPE, Boolean.TYPE
            });
            Method method1 = java/io/File.getMethod("setWritable", new Class[] {
                Boolean.TYPE, Boolean.TYPE
            });
            Method method2 = java/io/File.getMethod("setExecutable", new Class[] {
                Boolean.TYPE, Boolean.TYPE
            });
            if (!((Boolean)method.invoke(file, new Object[] {
    Boolean.valueOf(false), Boolean.valueOf(false)
})).booleanValue() || !((Boolean)method1.invoke(file, new Object[] {
    Boolean.valueOf(false), Boolean.valueOf(false)
})).booleanValue() || !((Boolean)method2.invoke(file, new Object[] {
    Boolean.valueOf(false), Boolean.valueOf(false)
})).booleanValue())
            {
                LOGGER.warning((new StringBuilder()).append("unable to change permissions for everybody: ").append(file).toString());
            }
            if (!((Boolean)method.invoke(file, new Object[] {
    Boolean.valueOf(true), Boolean.valueOf(true)
})).booleanValue() || !((Boolean)method1.invoke(file, new Object[] {
    Boolean.valueOf(true), Boolean.valueOf(true)
})).booleanValue() || !((Boolean)method2.invoke(file, new Object[] {
    Boolean.valueOf(true), Boolean.valueOf(true)
})).booleanValue())
            {
                LOGGER.warning((new StringBuilder()).append("unable to change permissions for owner: ").append(file).toString());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file = file.getCause();
            Throwables.propagateIfPossible(file, java/io/IOException);
            throw new RuntimeException(file);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            LOGGER.warning((new StringBuilder()).append("Unable to set permissions for ").append(file).append(", likely because you are running a version of Java prior to 1.6").toString());
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    protected DataStore createDataStore(String s)
        throws IOException
    {
        return new FileDataStore(this, dataDirectory, s);
    }

    public final File getDataDirectory()
    {
        return dataDirectory;
    }

}
