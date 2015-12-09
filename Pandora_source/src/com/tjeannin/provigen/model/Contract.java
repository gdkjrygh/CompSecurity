// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tjeannin.provigen.model;

import android.net.Uri;
import com.tjeannin.provigen.annotation.Column;
import com.tjeannin.provigen.annotation.ContentUri;
import com.tjeannin.provigen.annotation.Id;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tjeannin.provigen.model:
//            ContractField

public class Contract
{

    private String authority;
    private List contractFields;
    private String idField;
    private String tableName;

    public Contract(Class class1)
    {
        contractFields = new ArrayList();
        class1 = class1.getFields();
        int j = class1.length;
        int i = 0;
        while (i < j) 
        {
            Field field = class1[i];
            Column column;
            if ((ContentUri)field.getAnnotation(com/tjeannin/provigen/annotation/ContentUri) != null)
            {
                try
                {
                    Uri uri = (Uri)field.get(null);
                    authority = uri.getAuthority();
                    tableName = uri.getLastPathSegment();
                }
                catch (Exception exception1)
                {
                    exception1.printStackTrace();
                }
            }
            if ((Id)field.getAnnotation(com/tjeannin/provigen/annotation/Id) != null)
            {
                try
                {
                    idField = (String)field.get(null);
                }
                catch (Exception exception2)
                {
                    exception2.printStackTrace();
                }
            }
            column = (Column)field.getAnnotation(com/tjeannin/provigen/annotation/Column);
            if (column != null)
            {
                try
                {
                    contractFields.add(new ContractField((String)field.get(null), column.value()));
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }
            i++;
        }
    }

    public String getAuthority()
    {
        return authority;
    }

    public List getFields()
    {
        return contractFields;
    }

    public String getIdField()
    {
        return idField;
    }

    public String getTable()
    {
        return tableName;
    }
}
