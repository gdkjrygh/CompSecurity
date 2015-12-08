// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.data;


public class ContactsTable
{

    protected static final String TABLE_CREATE = "CREATE TABLE Contacts ( _id integer primary key autoincrement, name varchar default '', phone varchar default '', times_splitted integer default 0, last_time_splitted integer default 0)";
    public static final String TABLE_NAME = "Contacts";

    public ContactsTable()
    {
    }
}
