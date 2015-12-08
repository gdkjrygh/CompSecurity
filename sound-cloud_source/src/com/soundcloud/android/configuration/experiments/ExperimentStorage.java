// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;

import android.content.Context;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.java.reflect.TypeToken;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.configuration.experiments:
//            Assignment

class ExperimentStorage
{

    private static final String ASSIGNMENT_FILE_NAME = ".assignment";
    private final File file;
    private final JsonTransformer jsonTransformer;
    private final R scheduler;

    ExperimentStorage(R r, Context context, JsonTransformer jsontransformer)
    {
        scheduler = r;
        jsonTransformer = jsontransformer;
        file = new File(context.getFilesDir(), ".assignment");
    }

    private b loadAssignment()
    {
        return b.create(new _cls1());
    }

    private Assignment readAssignmentFile(File file1)
    {
        String s = "";
        Object obj;
        try
        {
            obj = IOUtils.readInputStream(new FileInputStream(file1));
        }
        // Misplaced declaration of an exception variable
        catch (File file1)
        {
            ErrorUtils.handleSilentException(file1);
            return Assignment.empty();
        }
        catch (ApiMapperException apimapperexception)
        {
            ErrorUtils.handleSilentException(new IllegalStateException((new StringBuilder("Failed parsing assignment; json = ")).append(s).toString(), apimapperexception));
            IOUtils.deleteFile(file1);
            return Assignment.empty();
        }
        s = ((String) (obj));
        obj = (Assignment)jsonTransformer.fromJson(((String) (obj)), TypeToken.of(com/soundcloud/android/configuration/experiments/Assignment));
        return ((Assignment) (obj));
    }

    public b readAssignment()
    {
        return loadAssignment().subscribeOn(scheduler);
    }

    public void storeAssignment(Assignment assignment)
    {
        try
        {
            assignment = jsonTransformer.toJson(assignment);
            IOUtils.writeFileFromString(file, assignment);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Assignment assignment)
        {
            ErrorUtils.handleThrowable(assignment, getClass());
        }
    }



    private class _cls1
        implements rx.b.f
    {

        final ExperimentStorage this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            Assignment assignment;
            if (file.exists())
            {
                assignment = readAssignmentFile(file);
            } else
            {
                assignment = Assignment.empty();
            }
            x.onNext(assignment);
            x.onCompleted();
        }

        _cls1()
        {
            this$0 = ExperimentStorage.this;
            super();
        }
    }

}
