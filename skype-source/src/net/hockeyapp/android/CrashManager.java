// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package net.hockeyapp.android:
//            Constants, CrashManagerListener, ExceptionHandler

public class CrashManager
{

    private static String BASE_URL = "https://rink.hockeyapp.net/";
    private static String identifier = null;
    private static String urlString = null;

    public CrashManager()
    {
    }

    private static String contentsOfFile(Context context, String s)
    {
        Context context1;
        Object obj;
        Object obj1;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        obj = null;
        context1 = null;
        obj1 = null;
        context = new BufferedReader(new InputStreamReader(context.openFileInput(s)));
_L3:
        s = context.readLine();
        if (s == null) goto _L2; else goto _L1
_L1:
        stringbuilder.append(s);
        stringbuilder.append(System.getProperty("line.separator"));
          goto _L3
        s;
_L9:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
_L4:
        return stringbuilder.toString();
_L2:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
          goto _L4
        s;
        context = obj;
_L7:
        context1 = context;
        s.printStackTrace();
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
          goto _L4
        context;
_L6:
        if (context1 != null)
        {
            try
            {
                context1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw context;
        s;
        context1 = context;
        context = s;
        if (true) goto _L6; else goto _L5
_L5:
        s;
          goto _L7
        context;
        context = obj1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static void deleteStackTrace(Context context, String s)
    {
        context.deleteFile(s);
        context.deleteFile(s.replace(".stacktrace", ".user"));
        context.deleteFile(s.replace(".stacktrace", ".contact"));
        context.deleteFile(s.replace(".stacktrace", ".description"));
    }

    public static void deleteStackTraces(Context context)
    {
        String s = Constants.TAG;
        (new StringBuilder("Looking for exceptions in: ")).append(Constants.FILES_PATH);
        String as[] = searchForStackTraces();
        if (as != null && as.length > 0)
        {
            String s1 = Constants.TAG;
            (new StringBuilder("Found ")).append(as.length).append(" stacktrace(s).");
            int i = 0;
            while (i < as.length) 
            {
                try
                {
                    String s2 = Constants.TAG;
                    (new StringBuilder("Delete stacktrace ")).append(as[i]).append(".");
                    deleteStackTrace(context, as[i]);
                    context.deleteFile(as[i]);
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
                i++;
            }
        }
    }

    private static String getURLString()
    {
        return (new StringBuilder()).append(urlString).append("api/2/apps/").append(identifier).append("/crashes/").toString();
    }

    public static boolean hasStackTraces()
    {
        return searchForStackTraces().length > 0;
    }

    public static void register(Context context, String s, String s1, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        urlString = s;
        identifier = s1;
        Constants.loadFromContext(context);
        if (identifier == null)
        {
            identifier = Constants.APP_PACKAGE;
        }
        boolean flag1;
        if (crashmanagerlistener != null && crashmanagerlistener.ignoreDefaultHandler().booleanValue())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s1 = Boolean.valueOf(flag1);
        if (!hasStackTraces() || !flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        s = CrashManagerListener.CrashHandlingPolicy.SEND_SILENTLY;
        if (crashmanagerlistener != null)
        {
            s = crashmanagerlistener.onCrashesFound();
        }
        if (s != CrashManagerListener.CrashHandlingPolicy.ASK_USER) goto _L2; else goto _L1
_L1:
        showDialog(context, crashmanagerlistener, s1.booleanValue());
_L4:
        return;
_L2:
        if (s != CrashManagerListener.CrashHandlingPolicy.SEND_SILENTLY) goto _L4; else goto _L3
_L3:
        sendCrashes(context, crashmanagerlistener, s1.booleanValue());
        return;
        registerHandler(crashmanagerlistener, s1.booleanValue());
        return;
    }

    public static void register(Context context, String s, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        register(context, BASE_URL, s, crashmanagerlistener, flag);
    }

    public static void register(Context context, String s, boolean flag)
    {
        register(context, BASE_URL, s, null, flag);
    }

    public static void registerHandler(CrashManagerListener crashmanagerlistener, boolean flag)
    {
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = Thread.getDefaultUncaughtExceptionHandler();
        if (uncaughtexceptionhandler != null)
        {
            String s = Constants.TAG;
            (new StringBuilder("Current handler class = ")).append(uncaughtexceptionhandler.getClass().getName());
        }
        if (!(uncaughtexceptionhandler instanceof ExceptionHandler))
        {
            Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(uncaughtexceptionhandler, crashmanagerlistener, flag));
        }
    }

    private static String[] searchForStackTraces()
    {
        File file = new File((new StringBuilder()).append(Constants.FILES_PATH).append("/").toString());
        file.mkdir();
        String as1[] = file.list(new FilenameFilter() {

            public final boolean accept(File file1, String s)
            {
                return s.endsWith(".stacktrace");
            }

        });
        String as[] = as1;
        if (as1 == null)
        {
            as = new String[0];
        }
        return as;
    }

    private static void sendCrashes(Context context, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        (new Thread(context, crashmanagerlistener, flag) {

            final Context val$context;
            final boolean val$ignoreDefaultHandler;
            final CrashManagerListener val$listener;

            public final void run()
            {
                CrashManager.submitStackTraces(context, listener);
                CrashManager.registerHandler(listener, ignoreDefaultHandler);
            }

            
            {
                context = context1;
                listener = crashmanagerlistener;
                ignoreDefaultHandler = flag;
                super();
            }
        }).start();
    }

    private static void showDialog(Context context, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        if (context == null)
        {
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setTitle(R.string.crash_dialog_title);
            builder.setMessage(R.string.crash_dialog_message);
            builder.setNegativeButton(R.string.crash_dialog_negative_button, new android.content.DialogInterface.OnClickListener(context, crashmanagerlistener, flag) {

                final Context val$context;
                final boolean val$ignoreDefaultHandler;
                final CrashManagerListener val$listener;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    CrashManager.deleteStackTraces(context);
                    CrashManager.registerHandler(listener, ignoreDefaultHandler);
                }

            
            {
                context = context1;
                listener = crashmanagerlistener;
                ignoreDefaultHandler = flag;
                super();
            }
            });
            builder.setPositiveButton(R.string.crash_dialog_positive_button, new android.content.DialogInterface.OnClickListener(context, crashmanagerlistener, flag) {

                final Context val$context;
                final boolean val$ignoreDefaultHandler;
                final CrashManagerListener val$listener;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    CrashManager.sendCrashes(context, listener, ignoreDefaultHandler);
                }

            
            {
                context = context1;
                listener = crashmanagerlistener;
                ignoreDefaultHandler = flag;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }

    public static void submitStackTraces(Context context, CrashManagerListener crashmanagerlistener)
    {
        Object obj;
        String as[];
        obj = Constants.TAG;
        (new StringBuilder("Looking for exceptions in: ")).append(Constants.FILES_PATH);
        as = searchForStackTraces();
        obj = Boolean.valueOf(false);
        if (as == null || as.length <= 0) goto _L2; else goto _L1
_L1:
        int i;
        String s = Constants.TAG;
        (new StringBuilder("Found ")).append(as.length).append(" stacktrace(s).");
        i = 0;
_L3:
        Object obj3;
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = as[i];
        String s1 = contentsOfFile(context, ((String) (obj3)));
        Object obj1 = obj;
        if (s1.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        obj1 = Constants.TAG;
        obj1 = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(getURLString());
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("raw", s1));
        arraylist.add(new BasicNameValuePair("userID", contentsOfFile(context, ((String) (obj3)).replace(".stacktrace", ".user"))));
        arraylist.add(new BasicNameValuePair("contact", contentsOfFile(context, ((String) (obj3)).replace(".stacktrace", ".contact"))));
        arraylist.add(new BasicNameValuePair("description", contentsOfFile(context, ((String) (obj3)).replace(".stacktrace", ".description"))));
        httppost.setEntity(new UrlEncodedFormEntity(arraylist, "UTF-8"));
        ((DefaultHttpClient) (obj1)).execute(httppost);
        obj1 = Boolean.valueOf(true);
        if (((Boolean) (obj1)).booleanValue())
        {
            deleteStackTrace(context, as[i]);
            obj3 = obj1;
            if (crashmanagerlistener != null)
            {
                crashmanagerlistener.onCrashesSent();
                obj3 = obj1;
            }
        } else
        {
            obj3 = obj1;
            if (crashmanagerlistener != null)
            {
                crashmanagerlistener.onCrashesNotSent();
                obj3 = obj1;
            }
        }
_L4:
        i++;
        obj = obj3;
        if (true) goto _L3; else goto _L2
        Object obj2;
        obj2;
        ((Exception) (obj2)).printStackTrace();
        if (((Boolean) (obj)).booleanValue())
        {
            deleteStackTrace(context, as[i]);
            obj3 = obj;
            if (crashmanagerlistener != null)
            {
                crashmanagerlistener.onCrashesSent();
                obj3 = obj;
            }
        } else
        {
            obj3 = obj;
            if (crashmanagerlistener != null)
            {
                crashmanagerlistener.onCrashesNotSent();
                obj3 = obj;
            }
        }
          goto _L4
        obj2;
        if (!((Boolean) (obj)).booleanValue()) goto _L6; else goto _L5
_L5:
        deleteStackTrace(context, as[i]);
        if (crashmanagerlistener != null)
        {
            crashmanagerlistener.onCrashesSent();
        }
_L7:
        throw obj2;
_L6:
        if (crashmanagerlistener != null)
        {
            crashmanagerlistener.onCrashesNotSent();
        }
        if (true) goto _L7; else goto _L2
_L2:
    }


}
