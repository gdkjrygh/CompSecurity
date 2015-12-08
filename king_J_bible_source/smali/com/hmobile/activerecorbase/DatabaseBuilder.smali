.class public Lcom/hmobile/activerecorbase/DatabaseBuilder;
.super Ljava/lang/Object;
.source "DatabaseBuilder.java"


# instance fields
.field _dbName:Ljava/lang/String;

.field classes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "dbName"    # Ljava/lang/String;

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/hmobile/activerecorbase/DatabaseBuilder;->classes:Ljava/util/Map;

    .line 33
    iput-object p1, p0, Lcom/hmobile/activerecorbase/DatabaseBuilder;->_dbName:Ljava/lang/String;

    .line 34
    return-void
.end method

.method private getClassBySqlName(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2
    .param p1, "table"    # Ljava/lang/String;

    .prologue
    .line 118
    invoke-static {p1}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toJavaClassName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 119
    .local v0, "jName":Ljava/lang/String;
    iget-object v1, p0, Lcom/hmobile/activerecorbase/DatabaseBuilder;->classes:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    return-object v1
.end method


# virtual methods
.method public addClass(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 46
    .local p1, "c":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/hmobile/activerecorbase/DatabaseBuilder;->classes:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/hmobile/activerecorbase/DatabaseBuilder;->_dbName:Ljava/lang/String;

    return-object v0
.end method

.method public getSQLCreate(Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .param p1, "table"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 76
    const/4 v8, 0x0

    .line 77
    .local v8, "sb":Ljava/lang/StringBuilder;
    invoke-direct {p0, p1}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->getClassBySqlName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 78
    .local v0, "c":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v2, 0x0

    .line 80
    .local v2, "e":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    .end local v2    # "e":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    check-cast v2, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 86
    .restart local v2    # "e":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    if-eqz v0, :cond_0

    .line 87
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "CREATE TABLE "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 88
    const-string v10, " (_id integer primary key"

    .line 87
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 89
    invoke-virtual {v2}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getColumnFieldsWithoutID()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_1

    .line 96
    const-string v9, ")"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    :cond_0
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    return-object v9

    .line 81
    .end local v2    # "e":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :catch_0
    move-exception v3

    .line 82
    .local v3, "e1":Ljava/lang/IllegalAccessException;
    new-instance v9, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v3}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 83
    .end local v3    # "e1":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v3

    .line 84
    .local v3, "e1":Ljava/lang/InstantiationException;
    new-instance v9, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v3}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 89
    .end local v3    # "e1":Ljava/lang/InstantiationException;
    .restart local v2    # "e":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    .line 90
    .local v1, "column":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    .line 91
    .local v4, "jname":Ljava/lang/String;
    invoke-static {v4}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 92
    .local v6, "qname":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    .line 93
    .local v5, "jtype":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {v5}, Lcom/hmobile/activerecorbase/Database;->getSQLiteTypeString(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    .line 94
    .local v7, "qtype":Ljava/lang/String;
    const-string v10, ", "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public getSQLDrop(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "table"    # Ljava/lang/String;

    .prologue
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DROP TABLE IF EXISTS "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTables()[Ljava/lang/String;
    .locals 5

    .prologue
    .line 56
    iget-object v4, p0, Lcom/hmobile/activerecorbase/DatabaseBuilder;->classes:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    new-array v3, v4, [Ljava/lang/String;

    .line 57
    .local v3, "ret":[Ljava/lang/String;
    iget-object v4, p0, Lcom/hmobile/activerecorbase/DatabaseBuilder;->classes:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    new-array v0, v4, [Ljava/lang/Class;

    .line 58
    .local v0, "arr":[Ljava/lang/Class;
    iget-object v4, p0, Lcom/hmobile/activerecorbase/DatabaseBuilder;->classes:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "arr":[Ljava/lang/Class;
    check-cast v0, [Ljava/lang/Class;

    .line 59
    .restart local v0    # "arr":[Ljava/lang/Class;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v4, v0

    if-lt v2, v4, :cond_0

    .line 63
    return-object v3

    .line 60
    :cond_0
    aget-object v1, v0, v2

    .line 61
    .local v1, "c":Ljava/lang/Class;
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    .line 59
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method
