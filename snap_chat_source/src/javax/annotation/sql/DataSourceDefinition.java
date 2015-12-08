// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation.sql;

import java.lang.annotation.Annotation;

public interface DataSourceDefinition
    extends Annotation
{

    public abstract String className();

    public abstract String databaseName();

    public abstract String description();

    public abstract int initialPoolSize();

    public abstract int isolationLevel();

    public abstract int loginTimeout();

    public abstract int maxIdleTime();

    public abstract int maxPoolSize();

    public abstract int maxStatements();

    public abstract int minPoolSize();

    public abstract String name();

    public abstract String password();

    public abstract int portNumber();

    public abstract String[] properties();

    public abstract String serverName();

    public abstract boolean transactional();

    public abstract String url();

    public abstract String user();
}
