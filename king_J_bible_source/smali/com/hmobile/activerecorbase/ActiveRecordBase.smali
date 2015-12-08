.class public Lcom/hmobile/activerecorbase/ActiveRecordBase;
.super Ljava/lang/Object;
.source "ActiveRecordBase.java"


# static fields
.field static s_EntitiesMap:Lcom/hmobile/activerecorbase/EntitiesMap;


# instance fields
.field protected _id:J

.field m_Database:Lcom/hmobile/activerecorbase/Database;

.field m_NeedsInsert:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Lcom/hmobile/activerecorbase/EntitiesMap;

    invoke-direct {v0}, Lcom/hmobile/activerecorbase/EntitiesMap;-><init>()V

    sput-object v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->s_EntitiesMap:Lcom/hmobile/activerecorbase/EntitiesMap;

    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_NeedsInsert:Z

    .line 171
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    .line 106
    return-void
.end method

.method protected constructor <init>(Lcom/hmobile/activerecorbase/Database;)V
    .locals 2
    .param p1, "db"    # Lcom/hmobile/activerecorbase/Database;

    .prologue
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_NeedsInsert:Z

    .line 171
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    .line 102
    iput-object p1, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    .line 103
    return-void
.end method

.method public static createInstance(Lcom/hmobile/activerecorbase/Database;)Lcom/hmobile/activerecorbase/ActiveRecordBase;
    .locals 1
    .param p0, "db"    # Lcom/hmobile/activerecorbase/Database;

    .prologue
    .line 53
    new-instance v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    invoke-direct {v0, p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;-><init>(Lcom/hmobile/activerecorbase/Database;)V

    return-object v0
.end method

.method private getDateFormat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    const-string v0, "dd/MM/yyyy hh:mm"

    return-object v0
.end method

.method public static open(Landroid/content/Context;Ljava/lang/String;I)Lcom/hmobile/activerecorbase/ActiveRecordBase;
    .locals 2
    .param p0, "ctx"    # Landroid/content/Context;
    .param p1, "dbName"    # Ljava/lang/String;
    .param p2, "dbVersion"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 67
    invoke-static {p0, p1, p2}, Lcom/hmobile/activerecorbase/Database;->createInstance(Landroid/content/Context;Ljava/lang/String;I)Lcom/hmobile/activerecorbase/Database;

    move-result-object v0

    .line 68
    .local v0, "db":Lcom/hmobile/activerecorbase/Database;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/Database;->open()V

    .line 69
    invoke-static {v0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->createInstance(Lcom/hmobile/activerecorbase/Database;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public beginTransaction()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 338
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v0, :cond_0

    .line 339
    new-instance v0, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v1, "Set database first"

    invoke-direct {v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 340
    :cond_0
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/Database;->beginTransaction()V

    .line 341
    return-void
.end method

.method public close()V
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/Database;->close()V

    .line 95
    return-void
.end method

.method public copyFrom(Ljava/lang/Object;)V
    .locals 5
    .param p1, "src"    # Ljava/lang/Object;

    .prologue
    .line 146
    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getColumnFieldsWithoutID()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 158
    return-void

    .line 146
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    .line 148
    .local v0, "dstField":Ljava/lang/reflect/Field;
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 149
    .local v1, "srcField":Ljava/lang/reflect/Field;
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 151
    .end local v1    # "srcField":Ljava/lang/reflect/Field;
    :catch_0
    move-exception v3

    goto :goto_0

    .line 154
    :catch_1
    move-exception v3

    goto :goto_0

    .line 153
    :catch_2
    move-exception v3

    goto :goto_0

    .line 152
    :catch_3
    move-exception v3

    goto :goto_0
.end method

.method public delete(Ljava/lang/Class;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 455
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v2, :cond_0

    .line 456
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v3, "Set database first"

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 459
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 465
    .local v1, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "_id >0 "

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/hmobile/activerecorbase/Database;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    return v2

    .line 460
    .end local v1    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :catch_0
    move-exception v0

    .line 461
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 462
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v0

    .line 463
    .local v0, "e":Ljava/lang/InstantiationException;
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v0}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public delete(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 4
    .param p2, "whereClause"    # Ljava/lang/String;
    .param p3, "whereArgs"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 628
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v2, :cond_0

    .line 629
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v3, "Set database first"

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 632
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 638
    .local v1, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, p2, p3}, Lcom/hmobile/activerecorbase/Database;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    return v2

    .line 633
    .end local v1    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :catch_0
    move-exception v0

    .line 634
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 635
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v0

    .line 636
    .local v0, "e":Ljava/lang/InstantiationException;
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v0}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public delete()Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 428
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v2, :cond_0

    .line 429
    new-instance v1, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v2, "Set database first"

    invoke-direct {v1, v2}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 430
    :cond_0
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "_id = ?"

    .line 431
    new-array v5, v1, [Ljava/lang/String;

    iget-wide v6, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    .line 430
    invoke-virtual {v2, v3, v4, v5}, Lcom/hmobile/activerecorbase/Database;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_1

    move v0, v1

    .line 432
    .local v0, "toRet":Z
    :cond_1
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    .line 433
    iput-boolean v1, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_NeedsInsert:Z

    .line 434
    return v0
.end method

.method public deleteByColumn(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)I
    .locals 4
    .param p2, "column"    # Ljava/lang/String;
    .param p3, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 658
    const-string v0, "%s = ?"

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 659
    new-array v1, v3, [Ljava/lang/String;

    aput-object p3, v1, v2

    .line 658
    invoke-virtual {p0, p1, v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->delete(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public deleterecord(Ljava/lang/Class;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 470
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v2, :cond_0

    .line 471
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v3, "Set database first"

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 474
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 480
    .local v1, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "_id >0 "

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/hmobile/activerecorbase/Database;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    return v2

    .line 475
    .end local v1    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :catch_0
    move-exception v0

    .line 476
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 477
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v0

    .line 478
    .local v0, "e":Ljava/lang/InstantiationException;
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v0}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public endTransaction()V
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/Database;->endTransaction()V

    .line 349
    return-void
.end method

.method public excecuteRawQuery(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .param p2, "query"    # Ljava/lang/String;
    .param p3, "params"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 817
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v7, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v7, :cond_0

    .line 818
    new-instance v7, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v8, "Set database first"

    invoke-direct {v7, v8}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 821
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 827
    .local v5, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 828
    .local v6, "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    const/4 v2, 0x0

    .line 830
    .local v2, "c":Landroid/database/Cursor;
    if-nez p3, :cond_2

    .line 831
    :try_start_1
    iget-object v7, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v7, p2}, Lcom/hmobile/activerecorbase/Database;->rawQuery(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 835
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v7

    if-nez v7, :cond_3

    .line 849
    if-eqz v2, :cond_1

    .line 850
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 852
    :cond_1
    return-object v6

    .line 822
    .end local v2    # "c":Landroid/database/Cursor;
    .end local v5    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .end local v6    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :catch_0
    move-exception v3

    .line 823
    .local v3, "e":Ljava/lang/IllegalAccessException;
    new-instance v7, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v3}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 824
    .end local v3    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v3

    .line 825
    .local v3, "e":Ljava/lang/InstantiationException;
    new-instance v7, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v3}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 833
    .end local v3    # "e":Ljava/lang/InstantiationException;
    .restart local v2    # "c":Landroid/database/Cursor;
    .restart local v5    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .restart local v6    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :cond_2
    :try_start_2
    iget-object v7, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v7, p2, p3}, Lcom/hmobile/activerecorbase/Database;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 835
    goto :goto_0

    .line 836
    :cond_3
    sget-object v7, Lcom/hmobile/activerecorbase/ActiveRecordBase;->s_EntitiesMap:Lcom/hmobile/activerecorbase/EntitiesMap;

    .line 837
    const-string v8, "_id"

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    .line 836
    invoke-virtual {v7, p1, v8, v9}, Lcom/hmobile/activerecorbase/EntitiesMap;->get(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    .line 838
    if-nez v5, :cond_4

    .line 839
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v7

    move-object v0, v7

    check-cast v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-object v5, v0

    .line 840
    const/4 v7, 0x0

    iput-boolean v7, v5, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_NeedsInsert:Z

    .line 841
    invoke-virtual {v5, v2}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->inflate(Landroid/database/Cursor;)V

    .line 842
    iget-object v7, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    iput-object v7, v5, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    .line 844
    :cond_4
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 846
    :catch_2
    move-exception v4

    .line 847
    .local v4, "e1":Ljava/lang/Exception;
    :try_start_3
    new-instance v7, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v4}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 848
    .end local v4    # "e1":Ljava/lang/Exception;
    :catchall_0
    move-exception v7

    .line 849
    if-eqz v2, :cond_5

    .line 850
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 851
    :cond_5
    throw v7
.end method

.method public executeRawQuery(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4
    .param p1, "query"    # Ljava/lang/String;
    .param p2, "params"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 1020
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v2, :cond_0

    .line 1021
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v3, "Set database first"

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1022
    :cond_0
    const/4 v0, 0x0

    .line 1024
    .local v0, "c":Landroid/database/Cursor;
    if-nez p2, :cond_2

    .line 1025
    :try_start_0
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v2, p1}, Lcom/hmobile/activerecorbase/Database;->execute(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1032
    :goto_0
    if-eqz v0, :cond_1

    .line 1033
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 1035
    :cond_1
    return-void

    .line 1027
    :cond_2
    :try_start_1
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v2, p1, p2}, Lcom/hmobile/activerecorbase/Database;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 1029
    :catch_0
    move-exception v1

    .line 1030
    .local v1, "e1":Ljava/lang/Exception;
    :try_start_2
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1031
    .end local v1    # "e1":Ljava/lang/Exception;
    :catchall_0
    move-exception v2

    .line 1032
    if-eqz v0, :cond_3

    .line 1033
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 1034
    :cond_3
    throw v2
.end method

.method public find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 12
    .param p2, "whereClause"    # Ljava/lang/String;
    .param p3, "whereArgs"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v8, 0x0

    .line 681
    iget-object v9, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v9, :cond_0

    .line 682
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v9, "Set database first"

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 683
    :cond_0
    const/4 v5, 0x0

    .line 685
    .local v5, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    .end local v5    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    check-cast v5, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 691
    .restart local v5    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 692
    .local v7, "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    if-eqz p3, :cond_1

    .line 693
    array-length v9, p3

    :goto_0
    if-lt v8, v9, :cond_2

    .line 699
    :cond_1
    iget-object v8, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10, p2, p3}, Lcom/hmobile/activerecorbase/Database;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 702
    .local v2, "c":Landroid/database/Cursor;
    :goto_1
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v8

    if-nez v8, :cond_4

    .line 719
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 721
    return-object v7

    .line 686
    .end local v2    # "c":Landroid/database/Cursor;
    .end local v5    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .end local v7    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :catch_0
    move-exception v4

    .line 687
    .local v4, "e1":Ljava/lang/IllegalAccessException;
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v4}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 688
    .end local v4    # "e1":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v4

    .line 689
    .local v4, "e1":Ljava/lang/InstantiationException;
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v4}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 693
    .end local v4    # "e1":Ljava/lang/InstantiationException;
    .restart local v5    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .restart local v7    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :cond_2
    aget-object v6, p3, v8

    .line 694
    .local v6, "s":Ljava/lang/String;
    const-string v10, "\'"

    invoke-virtual {v6, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 695
    const-string v10, "\'"

    const-string v11, "\'\'"

    invoke-virtual {v6, v10, v11}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 693
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 703
    .end local v6    # "s":Ljava/lang/String;
    .restart local v2    # "c":Landroid/database/Cursor;
    :cond_4
    :try_start_2
    sget-object v8, Lcom/hmobile/activerecorbase/ActiveRecordBase;->s_EntitiesMap:Lcom/hmobile/activerecorbase/EntitiesMap;

    .line 704
    const-string v9, "_id"

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    .line 703
    invoke-virtual {v8, p1, v10, v11}, Lcom/hmobile/activerecorbase/EntitiesMap;->get(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    .line 705
    if-nez v5, :cond_5

    .line 706
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v8

    move-object v0, v8

    check-cast v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-object v5, v0

    .line 707
    const/4 v8, 0x0

    iput-boolean v8, v5, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_NeedsInsert:Z

    .line 708
    invoke-virtual {v5, v2}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->inflate(Landroid/database/Cursor;)V

    .line 709
    iget-object v8, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    iput-object v8, v5, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    .line 712
    :cond_5
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 714
    :catch_2
    move-exception v3

    .line 715
    .local v3, "e":Ljava/lang/IllegalAccessException;
    :try_start_3
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v3}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 718
    .end local v3    # "e":Ljava/lang/IllegalAccessException;
    :catchall_0
    move-exception v8

    .line 719
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 720
    throw v8

    .line 716
    :catch_3
    move-exception v3

    .line 717
    .local v3, "e":Ljava/lang/InstantiationException;
    :try_start_4
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v3}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method public find(Ljava/lang/Class;ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 16
    .param p2, "distinct"    # Z
    .param p3, "whereClause"    # Ljava/lang/String;
    .param p4, "whereArgs"    # [Ljava/lang/String;
    .param p5, "groupBy"    # Ljava/lang/String;
    .param p6, "having"    # Ljava/lang/String;
    .param p7, "orderBy"    # Ljava/lang/String;
    .param p8, "limit"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;Z",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 778
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v2, :cond_0

    .line 779
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v3, "Set database first"

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 782
    :cond_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 788
    .local v14, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 789
    .local v15, "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v14}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move/from16 v3, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-virtual/range {v2 .. v11}, Lcom/hmobile/activerecorbase/Database;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v12

    .line 792
    .local v12, "c":Landroid/database/Cursor;
    :goto_0
    :try_start_1
    invoke-interface {v12}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-nez v2, :cond_1

    .line 809
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 811
    return-object v15

    .line 783
    .end local v12    # "c":Landroid/database/Cursor;
    .end local v14    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .end local v15    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :catch_0
    move-exception v13

    .line 784
    .local v13, "e":Ljava/lang/IllegalAccessException;
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v13}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 785
    .end local v13    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v13

    .line 786
    .local v13, "e":Ljava/lang/InstantiationException;
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v13}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 793
    .end local v13    # "e":Ljava/lang/InstantiationException;
    .restart local v12    # "c":Landroid/database/Cursor;
    .restart local v14    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .restart local v15    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :cond_1
    :try_start_2
    sget-object v2, Lcom/hmobile/activerecorbase/ActiveRecordBase;->s_EntitiesMap:Lcom/hmobile/activerecorbase/EntitiesMap;

    .line 794
    const-string v3, "_id"

    invoke-interface {v12, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v12, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 793
    move-object/from16 v0, p1

    invoke-virtual {v2, v0, v4, v5}, Lcom/hmobile/activerecorbase/EntitiesMap;->get(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v14

    .line 795
    if-nez v14, :cond_2

    .line 796
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-object v14, v0

    .line 797
    const/4 v2, 0x0

    iput-boolean v2, v14, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_NeedsInsert:Z

    .line 798
    invoke-virtual {v14, v12}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->inflate(Landroid/database/Cursor;)V

    .line 799
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    iput-object v2, v14, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    .line 802
    :cond_2
    invoke-interface {v15, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 804
    :catch_2
    move-exception v13

    .line 805
    .local v13, "e":Ljava/lang/IllegalAccessException;
    :try_start_3
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v13}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 808
    .end local v13    # "e":Ljava/lang/IllegalAccessException;
    :catchall_0
    move-exception v2

    .line 809
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 810
    throw v2

    .line 806
    :catch_3
    move-exception v13

    .line 807
    .local v13, "e":Ljava/lang/InstantiationException;
    :try_start_4
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v13}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method public findAll(Ljava/lang/Class;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v0, 0x0

    .line 969
    invoke-virtual {p0, p1, v0, v0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public findAll(Ljava/lang/Class;II)Ljava/util/List;
    .locals 12
    .param p2, "startIndex"    # I
    .param p3, "count"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;II)",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v10, 0x0

    .line 1054
    iget-object v8, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v8, :cond_0

    .line 1055
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v9, "Set database first"

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 1056
    :cond_0
    const/4 v6, 0x0

    .line 1058
    .local v6, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v6

    .end local v6    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    check-cast v6, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1064
    .restart local v6    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1065
    .local v7, "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    iget-object v8, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9, v10, v10, v10}, Lcom/hmobile/activerecorbase/Database;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 1068
    .local v2, "c":Landroid/database/Cursor;
    add-int v5, p2, p3

    .line 1069
    .local v5, "endIndex":I
    :try_start_1
    invoke-interface {v2, p2}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 1070
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v8

    if-nez v8, :cond_2

    .line 1090
    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 1092
    return-object v7

    .line 1059
    .end local v2    # "c":Landroid/database/Cursor;
    .end local v5    # "endIndex":I
    .end local v6    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .end local v7    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :catch_0
    move-exception v4

    .line 1060
    .local v4, "e1":Ljava/lang/IllegalAccessException;
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v4}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 1061
    .end local v4    # "e1":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v4

    .line 1062
    .local v4, "e1":Ljava/lang/InstantiationException;
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v4}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 1071
    .end local v4    # "e1":Ljava/lang/InstantiationException;
    .restart local v2    # "c":Landroid/database/Cursor;
    .restart local v5    # "endIndex":I
    .restart local v6    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .restart local v7    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :cond_2
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->getPosition()I

    move-result v8

    if-gt v8, v5, :cond_1

    .line 1074
    sget-object v8, Lcom/hmobile/activerecorbase/ActiveRecordBase;->s_EntitiesMap:Lcom/hmobile/activerecorbase/EntitiesMap;

    .line 1075
    const-string v9, "_id"

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    .line 1074
    invoke-virtual {v8, p1, v10, v11}, Lcom/hmobile/activerecorbase/EntitiesMap;->get(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v6

    .line 1076
    if-nez v6, :cond_3

    .line 1077
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v8

    move-object v0, v8

    check-cast v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-object v6, v0

    .line 1078
    const/4 v8, 0x0

    iput-boolean v8, v6, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_NeedsInsert:Z

    .line 1079
    invoke-virtual {v6, v2}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->inflate(Landroid/database/Cursor;)V

    .line 1080
    iget-object v8, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    iput-object v8, v6, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    .line 1083
    :cond_3
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 1085
    :catch_2
    move-exception v3

    .line 1086
    .local v3, "e":Ljava/lang/IllegalAccessException;
    :try_start_3
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v3}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1089
    .end local v3    # "e":Ljava/lang/IllegalAccessException;
    :catchall_0
    move-exception v8

    .line 1090
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 1091
    throw v8

    .line 1087
    :catch_3
    move-exception v3

    .line 1088
    .local v3, "e":Ljava/lang/InstantiationException;
    :try_start_4
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v3}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method public findByColumn(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .param p2, "column"    # Ljava/lang/String;
    .param p3, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 909
    const-string v0, "%s = ?"

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 910
    new-array v1, v3, [Ljava/lang/String;

    aput-object p3, v1, v2

    .line 909
    invoke-virtual {p0, p1, v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;
    .locals 10
    .param p2, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;J)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v3, 0x0

    const/4 v9, 0x0

    .line 927
    iget-object v4, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v4, :cond_0

    .line 928
    new-instance v3, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v4, "Set database first"

    invoke-direct {v3, v4}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 929
    :cond_0
    sget-object v4, Lcom/hmobile/activerecorbase/ActiveRecordBase;->s_EntitiesMap:Lcom/hmobile/activerecorbase/EntitiesMap;

    invoke-virtual {v4, p1, p2, p3}, Lcom/hmobile/activerecorbase/EntitiesMap;->get(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 930
    .local v2, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    if-eqz v2, :cond_1

    move-object v3, v2

    .line 954
    :goto_0
    return-object v3

    .line 934
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    .end local v2    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    check-cast v2, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 941
    .restart local v2    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    iget-object v4, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v2}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "_id = ?"

    .line 942
    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/String;

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v9

    .line 941
    invoke-virtual {v4, v5, v3, v6, v7}, Lcom/hmobile/activerecorbase/Database;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 944
    .local v0, "c":Landroid/database/Cursor;
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v4

    if-nez v4, :cond_2

    .line 952
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 935
    .end local v0    # "c":Landroid/database/Cursor;
    .end local v2    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :catch_0
    move-exception v1

    .line 936
    .local v1, "e":Ljava/lang/IllegalAccessException;
    new-instance v3, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 937
    .end local v1    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v1

    .line 938
    .local v1, "e":Ljava/lang/InstantiationException;
    new-instance v3, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v1}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 947
    .end local v1    # "e":Ljava/lang/InstantiationException;
    .restart local v0    # "c":Landroid/database/Cursor;
    .restart local v2    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :cond_2
    :try_start_2
    invoke-virtual {v2, v0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->inflate(Landroid/database/Cursor;)V

    .line 948
    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_NeedsInsert:Z

    .line 949
    iget-object v3, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    iput-object v3, v2, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 952
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    move-object v3, v2

    .line 954
    goto :goto_0

    .line 951
    :catchall_0
    move-exception v3

    .line 952
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 953
    throw v3
.end method

.method public findDistinctColumn(Ljava/lang/Class;ZLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 15
    .param p2, "distinct"    # Z
    .param p3, "columnName"    # Ljava/lang/String;
    .param p4, "whereClause"    # Ljava/lang/String;
    .param p5, "whereArgs"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 860
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v0, :cond_0

    .line 861
    new-instance v0, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v1, "Set database first"

    invoke-direct {v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 864
    :cond_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 870
    .local v12, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 871
    .local v14, "toRet":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v12}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v2

    .line 872
    const/4 v1, 0x1

    new-array v3, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static/range {p3 .. p3}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    .line 873
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v1, p2

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    .line 871
    invoke-virtual/range {v0 .. v9}, Lcom/hmobile/activerecorbase/Database;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 875
    .local v10, "c":Landroid/database/Cursor;
    :goto_0
    :try_start_1
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 886
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 888
    return-object v14

    .line 865
    .end local v10    # "c":Landroid/database/Cursor;
    .end local v12    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .end local v14    # "toRet":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :catch_0
    move-exception v11

    .line 866
    .local v11, "e":Ljava/lang/IllegalAccessException;
    new-instance v0, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v11}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 867
    .end local v11    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v11

    .line 868
    .local v11, "e":Ljava/lang/InstantiationException;
    new-instance v0, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v11}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 878
    .end local v11    # "e":Ljava/lang/InstantiationException;
    .restart local v10    # "c":Landroid/database/Cursor;
    .restart local v12    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .restart local v14    # "toRet":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_1
    :try_start_2
    invoke-static/range {p3 .. p3}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 877
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 879
    .local v13, "o":Ljava/lang/String;
    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 883
    .end local v13    # "o":Ljava/lang/String;
    :catch_2
    move-exception v11

    .line 884
    .local v11, "e":Ljava/lang/Exception;
    :try_start_3
    new-instance v0, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v11}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 885
    .end local v11    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v0

    .line 886
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 887
    throw v0
.end method

.method protected getColumnFields()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 253
    .local v2, "fields":[Ljava/lang/reflect/Field;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 254
    .local v0, "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/reflect/Field;>;"
    array-length v5, v2

    move v4, v3

    :goto_0
    if-lt v4, v5, :cond_1

    .line 260
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 261
    const-class v4, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 262
    array-length v4, v2

    :goto_1
    if-lt v3, v4, :cond_3

    .line 269
    :cond_0
    return-object v0

    .line 254
    :cond_1
    aget-object v1, v2, v4

    .line 255
    .local v1, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "m_"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 256
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "s_"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 257
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 262
    .end local v1    # "field":Ljava/lang/reflect/Field;
    :cond_3
    aget-object v1, v2, v3

    .line 263
    .restart local v1    # "field":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "m_"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 264
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "s_"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 265
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1
.end method

.method protected getColumnFieldsWithoutID()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation

    .prologue
    .line 236
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 237
    .local v2, "fields":[Ljava/lang/reflect/Field;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 238
    .local v0, "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/reflect/Field;>;"
    array-length v4, v2

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v4, :cond_0

    .line 243
    return-object v0

    .line 238
    :cond_0
    aget-object v1, v2, v3

    .line 239
    .local v1, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "m_"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 240
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "s_"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 241
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method protected getColumns()[Ljava/lang/String;
    .locals 4

    .prologue
    .line 210
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .local v0, "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getColumnFields()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 214
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    return-object v2

    .line 211
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    .line 212
    .local v1, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method protected getColumnsWithoutID()[Ljava/lang/String;
    .locals 4

    .prologue
    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .local v0, "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getColumnFieldsWithoutID()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 201
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    return-object v2

    .line 198
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    .line 199
    .local v1, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getDatabase()Lcom/hmobile/activerecorbase/Database;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    return-object v0
.end method

.method protected getDatabaseColumns()[Ljava/lang/String;
    .locals 4

    .prologue
    .line 223
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .local v0, "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getColumnFieldsWithoutID()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 227
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    return-object v2

    .line 224
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    .line 225
    .local v1, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getID()J
    .locals 2

    .prologue
    .line 179
    iget-wide v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    return-wide v0
.end method

.method public getRandom(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 1039
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-virtual {p0, p1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getRecordCount(Ljava/lang/Class;)I

    move-result v0

    .line 1040
    .local v0, "count":I
    const/4 v2, 0x0

    .line 1041
    .local v2, "idx":I
    :goto_0
    if-lez v2, :cond_0

    if-gt v2, v0, :cond_0

    .line 1049
    int-to-long v4, v2

    invoke-virtual {p0, p1, v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    return-object v4

    .line 1043
    :cond_0
    :try_start_0
    new-instance v3, Ljava/util/Random;

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Random;-><init>(J)V

    .line 1044
    .local v3, "rnd":Ljava/util/Random;
    invoke-virtual {v3, v0}, Ljava/util/Random;->nextInt(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    goto :goto_0

    .line 1045
    .end local v3    # "rnd":Ljava/util/Random;
    :catch_0
    move-exception v1

    .line 1046
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public getRecordCount(Ljava/lang/Class;)I
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 974
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v8, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v8, :cond_0

    .line 975
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v9, "Set database first"

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 976
    :cond_0
    const/4 v3, 0x0

    .line 978
    .local v3, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    .end local v3    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    check-cast v3, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 984
    .restart local v3    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    const/4 v1, 0x0

    .line 985
    .local v1, "count":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 988
    .local v5, "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :try_start_1
    iget-object v8, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    .line 989
    invoke-virtual {v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual {v8, v9, v10, v11, v12}, Lcom/hmobile/activerecorbase/Database;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 990
    .local v0, "c":Landroid/database/Cursor;
    const/4 v4, 0x0

    .line 994
    .local v4, "i":I
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    if-nez v8, :cond_1

    .line 999
    iget-object v8, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v8}, Lcom/hmobile/activerecorbase/Database;->getSqlLiteDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    invoke-virtual {v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v9

    .line 998
    invoke-static {v8, v9}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-wide v6

    .line 1001
    .local v6, "num":J
    long-to-int v8, v6

    add-int/lit8 v1, v8, -0x1

    .line 1015
    .end local v0    # "c":Landroid/database/Cursor;
    .end local v4    # "i":I
    .end local v6    # "num":J
    :goto_1
    return v1

    .line 979
    .end local v1    # "count":I
    .end local v3    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .end local v5    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :catch_0
    move-exception v2

    .line 980
    .local v2, "e1":Ljava/lang/IllegalAccessException;
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v2}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 981
    .end local v2    # "e1":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v2

    .line 982
    .local v2, "e1":Ljava/lang/InstantiationException;
    new-instance v8, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v2}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 995
    .end local v2    # "e1":Ljava/lang/InstantiationException;
    .restart local v0    # "c":Landroid/database/Cursor;
    .restart local v1    # "count":I
    .restart local v3    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    .restart local v4    # "i":I
    .restart local v5    # "toRet":Ljava/util/List;, "Ljava/util/List<TT;>;"
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1002
    .end local v0    # "c":Landroid/database/Cursor;
    .end local v4    # "i":I
    :catch_2
    move-exception v8

    goto :goto_1
.end method

.method protected getTableName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method inflate(Landroid/database/Cursor;)V
    .locals 28
    .param p1, "cursor"    # Landroid/database/Cursor;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 515
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 516
    .local v11, "entities":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/reflect/Field;Ljava/lang/Long;>;"
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getColumnFields()Ljava/util/List;

    move-result-object v22

    invoke-interface/range {v22 .. v22}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_0
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-nez v22, :cond_0

    .line 594
    sget-object v22, Lcom/hmobile/activerecorbase/ActiveRecordBase;->s_EntitiesMap:Lcom/hmobile/activerecorbase/EntitiesMap;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lcom/hmobile/activerecorbase/EntitiesMap;->set(Lcom/hmobile/activerecorbase/ActiveRecordBase;)V

    .line 595
    invoke-virtual {v11}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v22

    invoke-interface/range {v22 .. v22}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_1
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-nez v22, :cond_12

    .line 608
    return-void

    .line 516
    :cond_0
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/reflect/Field;

    .line 518
    .local v13, "field":Ljava/lang/reflect/Field;
    :try_start_0
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v20

    .line 519
    .local v20, "typeString":Ljava/lang/String;
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 520
    .local v5, "colName":Ljava/lang/String;
    const-string v22, "long"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1

    .line 522
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v24

    .line 521
    move-object/from16 v0, p0

    move-wide/from16 v1, v24

    invoke-virtual {v13, v0, v1, v2}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 586
    .end local v5    # "colName":Ljava/lang/String;
    .end local v20    # "typeString":Ljava/lang/String;
    :catch_0
    move-exception v10

    .line 587
    .local v10, "e":Ljava/lang/IllegalArgumentException;
    new-instance v22, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v10}, Ljava/lang/IllegalArgumentException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v23

    invoke-direct/range {v22 .. v23}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v22

    .line 523
    .end local v10    # "e":Ljava/lang/IllegalArgumentException;
    .restart local v5    # "colName":Ljava/lang/String;
    .restart local v20    # "typeString":Ljava/lang/String;
    :cond_1
    :try_start_1
    const-string v22, "java.lang.String"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_3

    .line 525
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 524
    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v21

    .line 526
    .local v21, "val":Ljava/lang/String;
    const-string v22, "null"

    invoke-virtual/range {v21 .. v22}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_2

    const/16 v21, 0x0

    .end local v21    # "val":Ljava/lang/String;
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-virtual {v13, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    .line 588
    .end local v5    # "colName":Ljava/lang/String;
    .end local v20    # "typeString":Ljava/lang/String;
    :catch_1
    move-exception v10

    .line 589
    .local v10, "e":Ljava/lang/IllegalAccessException;
    new-instance v22, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v10}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v23

    invoke-direct/range {v22 .. v23}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v22

    .line 527
    .end local v10    # "e":Ljava/lang/IllegalAccessException;
    .restart local v5    # "colName":Ljava/lang/String;
    .restart local v20    # "typeString":Ljava/lang/String;
    :cond_3
    :try_start_2
    const-string v22, "double"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_4

    .line 529
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v24

    .line 528
    move-object/from16 v0, p0

    move-wide/from16 v1, v24

    invoke-virtual {v13, v0, v1, v2}, Ljava/lang/reflect/Field;->setDouble(Ljava/lang/Object;D)V

    goto/16 :goto_0

    .line 530
    :cond_4
    const-string v22, "boolean"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_5

    .line 532
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v22

    .line 533
    const-string v24, "true"

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    .line 531
    move-object/from16 v0, p0

    move/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    .line 534
    :cond_5
    const-string v22, "[B"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_6

    .line 536
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v22

    .line 535
    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 537
    :cond_6
    const-string v22, "int"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_7

    .line 539
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v22

    .line 538
    move-object/from16 v0, p0

    move/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    goto/16 :goto_0

    .line 540
    :cond_7
    const-string v22, "float"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_8

    .line 542
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getFloat(I)F

    move-result v22

    .line 541
    move-object/from16 v0, p0

    move/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Ljava/lang/reflect/Field;->setFloat(Ljava/lang/Object;F)V

    goto/16 :goto_0

    .line 543
    :cond_8
    const-string v22, "short"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_9

    .line 545
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getShort(I)S

    move-result v22

    .line 544
    move-object/from16 v0, p0

    move/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Ljava/lang/reflect/Field;->setShort(Ljava/lang/Object;S)V

    goto/16 :goto_0

    .line 546
    :cond_9
    const-string v22, "java.sql.Timestamp"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_a

    .line 547
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v16

    .line 548
    .local v16, "l":J
    new-instance v22, Ljava/sql/Timestamp;

    move-object/from16 v0, v22

    move-wide/from16 v1, v16

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 549
    .end local v16    # "l":J
    :cond_a
    const-class v22, Ljava/util/ArrayList;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_c

    .line 552
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 551
    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v21

    .line 553
    .restart local v21    # "val":Ljava/lang/String;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 554
    .local v4, "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v22, "##"

    invoke-virtual/range {v21 .. v22}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v18

    .line 555
    .local v18, "sarr":[Ljava/lang/String;
    move-object/from16 v0, v18

    array-length v0, v0

    move/from16 v24, v0

    const/16 v22, 0x0

    :goto_2
    move/from16 v0, v22

    move/from16 v1, v24

    if-lt v0, v1, :cond_b

    .line 558
    move-object/from16 v0, p0

    invoke-virtual {v13, v0, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 555
    :cond_b
    aget-object v19, v18, v22

    .line 556
    .local v19, "string":Ljava/lang/String;
    move-object/from16 v0, v19

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 555
    add-int/lit8 v22, v22, 0x1

    goto :goto_2

    .line 559
    .end local v4    # "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v18    # "sarr":[Ljava/lang/String;
    .end local v19    # "string":Ljava/lang/String;
    .end local v21    # "val":Ljava/lang/String;
    :cond_c
    const-string v22, "java.util.Date"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1

    move-result v22

    if-eqz v22, :cond_f

    .line 560
    const/4 v9, 0x0

    .line 563
    .local v9, "dt":Ljava/util/Date;
    :try_start_3
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 562
    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 564
    .local v8, "dd":Ljava/lang/String;
    if-eqz v8, :cond_e

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v22

    if-lez v22, :cond_e

    .line 565
    invoke-direct/range {p0 .. p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getDateFormat()Ljava/lang/String;

    move-result-object v6

    .line 566
    .local v6, "dFormat":Ljava/lang/String;
    const-string v22, ":"

    move-object/from16 v0, v22

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v22

    if-nez v22, :cond_d

    .line 567
    const-string v6, "dd/MM/yyyy"

    .line 569
    :cond_d
    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-direct {v7, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 571
    .local v7, "dateformat":Ljava/text/SimpleDateFormat;
    invoke-virtual {v7, v8}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v9

    .line 576
    .end local v6    # "dFormat":Ljava/lang/String;
    .end local v7    # "dateformat":Ljava/text/SimpleDateFormat;
    .end local v8    # "dd":Ljava/lang/String;
    :cond_e
    :goto_3
    :try_start_4
    move-object/from16 v0, p0

    invoke-virtual {v13, v0, v9}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 573
    :catch_2
    move-exception v10

    .line 574
    .local v10, "e":Ljava/text/ParseException;
    invoke-virtual {v10}, Ljava/text/ParseException;->printStackTrace()V

    goto :goto_3

    .line 577
    .end local v9    # "dt":Ljava/util/Date;
    .end local v10    # "e":Ljava/text/ParseException;
    :cond_f
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v22

    const-class v24, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    if-ne v0, v1, :cond_11

    .line 578
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    .line 579
    .local v14, "id":J
    const-wide/16 v24, 0x0

    cmp-long v22, v14, v24

    if-lez v22, :cond_10

    .line 580
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v11, v13, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 582
    :cond_10
    const/16 v22, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 584
    .end local v14    # "id":J
    :cond_11
    new-instance v22, Lcom/hmobile/activerecorbase/ActiveRecordException;

    .line 585
    const-string v23, "Class cannot be read from Sqlite3 database."

    .line 584
    invoke-direct/range {v22 .. v23}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v22
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_1

    .line 595
    .end local v5    # "colName":Ljava/lang/String;
    .end local v13    # "field":Ljava/lang/reflect/Field;
    .end local v20    # "typeString":Ljava/lang/String;
    :cond_12
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/reflect/Field;

    .line 598
    .local v12, "f":Ljava/lang/reflect/Field;
    :try_start_5
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v24

    .line 599
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ljava/lang/Long;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Long;->longValue()J

    move-result-wide v26

    .line 597
    move-object/from16 v0, p0

    move-object/from16 v1, v24

    move-wide/from16 v2, v26

    invoke-virtual {v0, v1, v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v22

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-virtual {v12, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_5

    goto/16 :goto_1

    .line 600
    :catch_3
    move-exception v10

    .line 601
    .local v10, "e":Landroid/database/sqlite/SQLiteException;
    new-instance v22, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v23

    invoke-direct/range {v22 .. v23}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v22

    .line 602
    .end local v10    # "e":Landroid/database/sqlite/SQLiteException;
    :catch_4
    move-exception v10

    .line 603
    .local v10, "e":Ljava/lang/IllegalArgumentException;
    new-instance v22, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v10}, Ljava/lang/IllegalArgumentException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v23

    invoke-direct/range {v22 .. v23}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v22

    .line 604
    .end local v10    # "e":Ljava/lang/IllegalArgumentException;
    :catch_5
    move-exception v10

    .line 605
    .local v10, "e":Ljava/lang/IllegalAccessException;
    new-instance v22, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v10}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v23

    invoke-direct/range {v22 .. v23}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v22
.end method

.method public insert()J
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 279
    iget-wide v10, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    const-wide/16 v12, 0x0

    cmp-long v9, v10, v12

    if-lez v9, :cond_1

    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getColumnFields()Ljava/util/List;

    move-result-object v3

    .line 281
    .local v3, "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/reflect/Field;>;"
    :goto_0
    new-instance v8, Landroid/content/ContentValues;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v8, v9}, Landroid/content/ContentValues;-><init>(I)V

    .line 282
    .local v8, "values":Landroid/content/ContentValues;
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    .line 330
    iget-object v9, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10, v8}, Lcom/hmobile/activerecorbase/Database;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v10

    iput-wide v10, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    .line 331
    const-wide/16 v10, -0x1

    iget-wide v12, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    cmp-long v9, v10, v12

    if-eqz v9, :cond_0

    .line 332
    const/4 v9, 0x0

    iput-boolean v9, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_NeedsInsert:Z

    .line 334
    :cond_0
    iget-wide v10, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    return-wide v10

    .line 280
    .end local v3    # "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/reflect/Field;>;"
    .end local v8    # "values":Landroid/content/ContentValues;
    :cond_1
    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getColumnFieldsWithoutID()Ljava/util/List;

    move-result-object v3

    goto :goto_0

    .line 282
    .restart local v3    # "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/reflect/Field;>;"
    .restart local v8    # "values":Landroid/content/ContentValues;
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Field;

    .line 284
    .local v2, "column":Ljava/lang/reflect/Field;
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v9

    const-class v11, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    if-ne v9, v11, :cond_4

    .line 286
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 287
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_3

    .line 289
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 288
    check-cast v9, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .line 289
    iget-wide v12, v9, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    .line 288
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    .line 285
    :goto_2
    invoke-virtual {v8, v11, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 326
    :catch_0
    move-exception v6

    .line 327
    .local v6, "e":Ljava/lang/IllegalAccessException;
    new-instance v9, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v6}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 289
    .end local v6    # "e":Ljava/lang/IllegalAccessException;
    :cond_3
    :try_start_1
    const-string v9, "0"

    goto :goto_2

    .line 291
    :cond_4
    const-string v7, ""

    .line 292
    .local v7, "val":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    const-class v11, Ljava/util/Date;

    if-ne v9, v11, :cond_6

    .line 293
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Date;

    .line 294
    .local v5, "dt":Ljava/util/Date;
    if-eqz v5, :cond_5

    .line 295
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 296
    invoke-direct {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getDateFormat()Ljava/lang/String;

    move-result-object v9

    .line 295
    invoke-direct {v4, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 297
    .local v4, "dateformat":Ljava/text/SimpleDateFormat;
    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 300
    .end local v4    # "dateformat":Ljava/text/SimpleDateFormat;
    :cond_5
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 301
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 299
    invoke-virtual {v8, v9, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 302
    .end local v5    # "dt":Ljava/util/Date;
    :cond_6
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    .line 303
    const-string v11, "[B"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 304
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 306
    .local v1, "b":[B
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 305
    invoke-virtual {v8, v9, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    goto/16 :goto_1

    .line 308
    .end local v1    # "b":[B
    :cond_7
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    .line 309
    const-class v11, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 312
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 311
    check-cast v0, Ljava/util/ArrayList;

    .line 313
    .local v0, "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-static {}, Lcom/hmobile/common/Utils;->Instance()Lcom/hmobile/common/Utils;

    move-result-object v9

    const-string v11, "##"

    invoke-virtual {v9, v0, v11}, Lcom/hmobile/common/Utils;->join(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 315
    .local v1, "b":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 314
    invoke-virtual {v8, v9, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 318
    .end local v0    # "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v1    # "b":Ljava/lang/String;
    :cond_8
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 320
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 321
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 319
    invoke-virtual {v8, v9, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1
.end method

.method public isExist(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 8
    .param p2, "whereClause"    # Ljava/lang/String;
    .param p3, "whereArgs"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 727
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v4, 0x0

    .line 728
    .local v4, "exist":Z
    iget-object v5, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v5, :cond_0

    .line 729
    new-instance v5, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v6, "Set database first"

    invoke-direct {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 730
    :cond_0
    const/4 v3, 0x0

    .line 732
    .local v3, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    .end local v3    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    check-cast v3, Lcom/hmobile/activerecorbase/ActiveRecordBase;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 739
    .restart local v3    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    iget-object v5, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7, p2, p3}, Lcom/hmobile/activerecorbase/Database;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 742
    .local v0, "c":Landroid/database/Cursor;
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v5

    if-lez v5, :cond_1

    .line 743
    const/4 v4, 0x1

    .line 748
    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 750
    return v4

    .line 733
    .end local v0    # "c":Landroid/database/Cursor;
    .end local v3    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :catch_0
    move-exception v2

    .line 734
    .local v2, "e1":Ljava/lang/IllegalAccessException;
    new-instance v5, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v2}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 735
    .end local v2    # "e1":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v2

    .line 736
    .local v2, "e1":Ljava/lang/InstantiationException;
    new-instance v5, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v2}, Ljava/lang/InstantiationException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 745
    .end local v2    # "e1":Ljava/lang/InstantiationException;
    .restart local v0    # "c":Landroid/database/Cursor;
    .restart local v3    # "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :catch_2
    move-exception v1

    .line 746
    .local v1, "e":Ljava/lang/Exception;
    :try_start_2
    new-instance v5, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-virtual {v1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 747
    .end local v1    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v5

    .line 748
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 749
    throw v5
.end method

.method public isOpen()Z
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/Database;->isOpen()Z

    move-result v0

    return v0
.end method

.method public newEntity(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 122
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v2, 0x0

    .line 124
    .local v2, "entity":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-object v2, v0

    .line 125
    iget-object v3, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->setDatabase(Lcom/hmobile/activerecorbase/Database;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 133
    return-object v2

    .line 126
    :catch_0
    move-exception v1

    .line 127
    .local v1, "e":Ljava/lang/IllegalAccessException;
    new-instance v3, Lcom/hmobile/activerecorbase/ActiveRecordException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Can\'t instantiate "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 127
    invoke-direct {v3, v4}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 129
    .end local v1    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v1

    .line 130
    .local v1, "e":Ljava/lang/InstantiationException;
    new-instance v3, Lcom/hmobile/activerecorbase/ActiveRecordException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Can\'t instantiate "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 130
    invoke-direct {v3, v4}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method public open()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 78
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/Database;->open()V

    .line 79
    return-void
.end method

.method public save()J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 490
    const-wide/16 v0, -0x1

    .line 492
    .local v0, "r":J
    iget-object v2, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v2, :cond_0

    .line 493
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v3, "Set database first"

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 495
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iget-wide v4, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    invoke-virtual {p0, v2, v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    if-nez v2, :cond_1

    .line 496
    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->insert()J

    move-result-wide v0

    .line 499
    :goto_0
    sget-object v2, Lcom/hmobile/activerecorbase/ActiveRecordBase;->s_EntitiesMap:Lcom/hmobile/activerecorbase/EntitiesMap;

    invoke-virtual {v2, p0}, Lcom/hmobile/activerecorbase/EntitiesMap;->set(Lcom/hmobile/activerecorbase/ActiveRecordBase;)V

    .line 501
    return-wide v0

    .line 498
    :cond_1
    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->update()I

    move-result v2

    int-to-long v0, v2

    goto :goto_0
.end method

.method public saveBatch(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/hmobile/activerecorbase/ActiveRecordBase;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/util/ArrayList",
            "<TT;>;)",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 353
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<TT;>;"
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 354
    .local v2, "ids":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Long;>;"
    iget-object v4, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    if-nez v4, :cond_0

    .line 355
    new-instance v4, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v5, "Set database first"

    invoke-direct {v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 357
    :cond_0
    :try_start_0
    iget-object v4, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v4}, Lcom/hmobile/activerecorbase/Database;->beginTransaction()V

    .line 358
    const/4 v0, 0x0

    .line 360
    .local v0, "cnt":I
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 365
    iget-object v4, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v4}, Lcom/hmobile/activerecorbase/Database;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 369
    iget-object v4, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v4}, Lcom/hmobile/activerecorbase/Database;->endTransaction()V

    .line 372
    return-object v2

    .line 360
    :cond_1
    :try_start_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .line 361
    .local v3, "obj":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    const-string v5, "ACTIVERECORDS--"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "saveBatch : current count : "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 362
    invoke-virtual {v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->save()J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 363
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 366
    .end local v0    # "cnt":I
    .end local v3    # "obj":Lcom/hmobile/activerecorbase/ActiveRecordBase;, "TT;"
    :catch_0
    move-exception v1

    .line 367
    .local v1, "e":Ljava/lang/Exception;
    :try_start_2
    new-instance v4, Lcom/hmobile/activerecorbase/ActiveRecordException;

    invoke-direct {v4, v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/Throwable;)V

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 368
    .end local v1    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v4

    .line 369
    iget-object v5, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v5}, Lcom/hmobile/activerecorbase/Database;->endTransaction()V

    .line 370
    throw v4
.end method

.method public setDatabase(Lcom/hmobile/activerecorbase/Database;)V
    .locals 0
    .param p1, "database"    # Lcom/hmobile/activerecorbase/Database;

    .prologue
    .line 168
    iput-object p1, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    .line 169
    return-void
.end method

.method public setTransactionSuccessful()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 344
    iget-object v0, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/Database;->setTransactionSuccessful()V

    .line 345
    return-void
.end method

.method public update()I
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 382
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getColumnFieldsWithoutID()Ljava/util/List;

    move-result-object v3

    .line 383
    .local v3, "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/reflect/Field;>;"
    new-instance v9, Landroid/content/ContentValues;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    invoke-direct {v9, v10}, Landroid/content/ContentValues;-><init>(I)V

    .line 384
    .local v9, "values":Landroid/content/ContentValues;
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_0

    .line 415
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->m_Database:Lcom/hmobile/activerecorbase/Database;

    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getTableName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "_id = ?"

    .line 416
    const/4 v13, 0x1

    new-array v13, v13, [Ljava/lang/String;

    const/4 v14, 0x0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    move-wide/from16 v16, v0

    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v15

    aput-object v15, v13, v14

    .line 415
    invoke-virtual {v10, v11, v9, v12, v13}, Lcom/hmobile/activerecorbase/Database;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 417
    .local v7, "r":I
    return v7

    .line 384
    .end local v7    # "r":I
    :cond_0
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Field;

    .line 386
    .local v2, "column":Ljava/lang/reflect/Field;
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v10

    const-class v12, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    if-ne v10, v12, :cond_2

    .line 388
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 389
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_1

    .line 391
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .line 390
    check-cast v10, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .line 391
    iget-wide v14, v10, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    .line 390
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    .line 387
    :goto_1
    invoke-virtual {v9, v12, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 409
    :catch_0
    move-exception v6

    .line 410
    .local v6, "e":Ljava/lang/IllegalArgumentException;
    new-instance v10, Lcom/hmobile/activerecorbase/ActiveRecordException;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "No column "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 391
    .end local v6    # "e":Ljava/lang/IllegalArgumentException;
    :cond_1
    :try_start_1
    const-string v10, "0"

    goto :goto_1

    .line 393
    :cond_2
    const-string v8, ""

    .line 394
    .local v8, "val":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    const-class v12, Ljava/util/Date;

    if-ne v10, v12, :cond_4

    .line 395
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Date;

    .line 396
    .local v5, "dt":Ljava/util/Date;
    if-eqz v5, :cond_3

    .line 397
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 398
    invoke-direct/range {p0 .. p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getDateFormat()Ljava/lang/String;

    move-result-object v10

    .line 397
    invoke-direct {v4, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 399
    .local v4, "dateformat":Ljava/text/SimpleDateFormat;
    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 404
    .end local v4    # "dateformat":Ljava/text/SimpleDateFormat;
    .end local v5    # "dt":Ljava/util/Date;
    :cond_3
    :goto_2
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 405
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 404
    invoke-virtual {v9, v10, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    .line 411
    .end local v8    # "val":Ljava/lang/String;
    :catch_1
    move-exception v6

    .line 412
    .local v6, "e":Ljava/lang/IllegalAccessException;
    new-instance v10, Lcom/hmobile/activerecorbase/ActiveRecordException;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "No column "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 402
    .end local v6    # "e":Ljava/lang/IllegalAccessException;
    .restart local v8    # "val":Ljava/lang/String;
    :cond_4
    :try_start_2
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v8

    goto :goto_2
.end method
