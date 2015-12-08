.class public Lcom/hmobile/activerecorbase/Database;
.super Ljava/lang/Object;
.source "Database.java"


# static fields
.field static final CNAME:Ljava/lang/String;

.field static _builders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/hmobile/activerecorbase/DatabaseBuilder;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private _context:Landroid/content/Context;

.field private _database:Landroid/database/sqlite/SQLiteDatabase;

.field private _dbHelper:Lcom/hmobile/activerecorbase/DatabaseOpenHelper;

.field private _path:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/hmobile/activerecorbase/Database;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/hmobile/activerecorbase/Database;->CNAME:Ljava/lang/String;

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/hmobile/activerecorbase/Database;->_builders:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;ILcom/hmobile/activerecorbase/DatabaseBuilder;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "dbName"    # Ljava/lang/String;
    .param p3, "dbVersion"    # I
    .param p4, "builder"    # Lcom/hmobile/activerecorbase/DatabaseBuilder;

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/hmobile/activerecorbase/Database;->_context:Landroid/content/Context;

    .line 58
    iput-object p2, p0, Lcom/hmobile/activerecorbase/Database;->_path:Ljava/lang/String;

    .line 61
    new-instance v0, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;

    iget-object v1, p0, Lcom/hmobile/activerecorbase/Database;->_path:Ljava/lang/String;

    invoke-direct {v0, p1, v1, p3, p4}, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;ILcom/hmobile/activerecorbase/DatabaseBuilder;)V

    iput-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_dbHelper:Lcom/hmobile/activerecorbase/DatabaseOpenHelper;

    .line 62
    iput-object p1, p0, Lcom/hmobile/activerecorbase/Database;->_context:Landroid/content/Context;

    .line 63
    return-void
.end method

.method public static createInstance(Landroid/content/Context;Ljava/lang/String;I)Lcom/hmobile/activerecorbase/Database;
    .locals 3
    .param p0, "ctx"    # Landroid/content/Context;
    .param p1, "dbName"    # Ljava/lang/String;
    .param p2, "dbVersion"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 81
    invoke-static {p1}, Lcom/hmobile/activerecorbase/Database;->getBuilder(Ljava/lang/String;)Lcom/hmobile/activerecorbase/DatabaseBuilder;

    move-result-object v0

    .line 82
    .local v0, "builder":Lcom/hmobile/activerecorbase/DatabaseBuilder;
    if-nez v0, :cond_0

    .line 83
    new-instance v1, Lcom/hmobile/activerecorbase/ActiveRecordException;

    .line 84
    const-string v2, "Schema wasn\'t initialized. Call Database.setBuilder() first"

    .line 83
    invoke-direct {v1, v2}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 85
    :cond_0
    new-instance v1, Lcom/hmobile/activerecorbase/Database;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/hmobile/activerecorbase/Database;-><init>(Landroid/content/Context;Ljava/lang/String;ILcom/hmobile/activerecorbase/DatabaseBuilder;)V

    return-object v1
.end method

.method public static createInstance(Landroid/content/Context;Ljava/lang/String;ILcom/hmobile/activerecorbase/DatabaseBuilder;)Lcom/hmobile/activerecorbase/Database;
    .locals 1
    .param p0, "ctx"    # Landroid/content/Context;
    .param p1, "dbName"    # Ljava/lang/String;
    .param p2, "dbVersion"    # I
    .param p3, "builder"    # Lcom/hmobile/activerecorbase/DatabaseBuilder;

    .prologue
    .line 130
    new-instance v0, Lcom/hmobile/activerecorbase/Database;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/hmobile/activerecorbase/Database;-><init>(Landroid/content/Context;Ljava/lang/String;ILcom/hmobile/activerecorbase/DatabaseBuilder;)V

    return-object v0
.end method

.method public static getBuilder(Ljava/lang/String;)Lcom/hmobile/activerecorbase/DatabaseBuilder;
    .locals 1
    .param p0, "dbName"    # Ljava/lang/String;

    .prologue
    .line 113
    sget-object v0, Lcom/hmobile/activerecorbase/Database;->_builders:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/activerecorbase/DatabaseBuilder;

    return-object v0
.end method

.method protected static getSQLiteTypeString(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 380
    .local p0, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 381
    .local v0, "name":Ljava/lang/String;
    const-string v1, "java.lang.String"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 382
    const-string v1, "text"

    .line 407
    :goto_0
    return-object v1

    .line 383
    :cond_0
    const-string v1, "short"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 384
    const-string v1, "int"

    goto :goto_0

    .line 385
    :cond_1
    const-string v1, "int"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 386
    const-string v1, "int"

    goto :goto_0

    .line 387
    :cond_2
    const-string v1, "long"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 388
    const-string v1, "int"

    goto :goto_0

    .line 389
    :cond_3
    const-string v1, "long"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 390
    const-string v1, "int"

    goto :goto_0

    .line 391
    :cond_4
    const-string v1, "java.sql.Timestamp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 392
    const-string v1, "int"

    goto :goto_0

    .line 393
    :cond_5
    const-string v1, "double"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 394
    const-string v1, "real"

    goto :goto_0

    .line 395
    :cond_6
    const-string v1, "float"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 396
    const-string v1, "real"

    goto :goto_0

    .line 397
    :cond_7
    const-string v1, "[B"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 398
    const-string v1, "blob"

    goto :goto_0

    .line 399
    :cond_8
    const-string v1, "boolean"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 400
    const-string v1, "bool"

    goto :goto_0

    .line 401
    :cond_9
    const-string v1, "java.util.Date"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 402
    const-string v1, "text"

    goto :goto_0

    .line 403
    :cond_a
    const-class v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 404
    const-string v1, "text"

    goto :goto_0

    .line 406
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    if-ne v1, v2, :cond_c

    .line 407
    const-string v1, "int"

    goto/16 :goto_0

    .line 408
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 409
    const-string v2, "Class cannot be stored in Sqlite3 database."

    .line 408
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static open(Landroid/content/Context;Ljava/lang/String;I)Lcom/hmobile/activerecorbase/Database;
    .locals 1
    .param p0, "ctx"    # Landroid/content/Context;
    .param p1, "dbName"    # Ljava/lang/String;
    .param p2, "dbVersion"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 100
    invoke-static {p0, p1, p2}, Lcom/hmobile/activerecorbase/Database;->createInstance(Landroid/content/Context;Ljava/lang/String;I)Lcom/hmobile/activerecorbase/Database;

    move-result-object v0

    .line 101
    .local v0, "db":Lcom/hmobile/activerecorbase/Database;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/Database;->open()V

    .line 102
    return-object v0
.end method

.method public static setBuilder(Lcom/hmobile/activerecorbase/DatabaseBuilder;)V
    .locals 2
    .param p0, "builder"    # Lcom/hmobile/activerecorbase/DatabaseBuilder;

    .prologue
    .line 125
    sget-object v0, Lcom/hmobile/activerecorbase/Database;->_builders:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->getDatabaseName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    return-void
.end method


# virtual methods
.method public beginTransaction()V
    .locals 1

    .prologue
    .line 360
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 361
    return-void
.end method

.method public close()V
    .locals 6

    .prologue
    .line 148
    iget-object v1, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->toString()Ljava/lang/String;

    move-result-object v0

    .line 149
    .local v0, "d":Ljava/lang/String;
    iget-object v1, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_0

    .line 150
    iget-object v1, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 151
    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    .line 152
    sget-object v1, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v2, "(%t) %s.close(): db obj %s set to null"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    sget-object v5, Lcom/hmobile/activerecorbase/Database;->CNAME:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/hmobile/activerecorbase/Logg;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 153
    return-void
.end method

.method public delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1
    .param p1, "table"    # Ljava/lang/String;
    .param p2, "whereClause"    # Ljava/lang/String;
    .param p3, "whereArgs"    # [Ljava/lang/String;

    .prologue
    .line 215
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public endTransaction()V
    .locals 1

    .prologue
    .line 364
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 365
    return-void
.end method

.method public execute(Ljava/lang/String;)V
    .locals 1
    .param p1, "sql"    # Ljava/lang/String;

    .prologue
    .line 169
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 170
    return-void
.end method

.method public getColumnsForTable(Ljava/lang/String;)[Ljava/lang/String;
    .locals 5
    .param p1, "table"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 325
    const-string v2, "PRAGMA table_info(%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/hmobile/activerecorbase/Database;->rawQuery(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 326
    .local v0, "c":Landroid/database/Cursor;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 328
    .local v1, "columns":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-nez v2, :cond_0

    .line 332
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 334
    new-array v2, v4, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    return-object v2

    .line 329
    :cond_0
    :try_start_1
    const-string v2, "name"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 331
    :catchall_0
    move-exception v2

    .line 332
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 333
    throw v2
.end method

.method public getSqlLiteDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method public getTables()[Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 304
    iget-object v2, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v2

    if-nez v2, :cond_1

    .line 305
    :cond_0
    sget-object v2, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    .line 306
    const-string v3, "(%t) %s.getTables(): ERROR - db object is null or closed"

    new-array v4, v5, [Ljava/lang/Object;

    .line 307
    sget-object v5, Lcom/hmobile/activerecorbase/Database;->CNAME:Ljava/lang/String;

    aput-object v5, v4, v7

    .line 305
    invoke-static {v2, v3, v4}, Lcom/hmobile/activerecorbase/Logg;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 308
    new-instance v2, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v3, "Database is closed. Did you forget to open database?"

    invoke-direct {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 311
    :cond_1
    const-string v2, "sqlite_master"

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "name"

    aput-object v4, v3, v7

    const-string v4, "type = ?"

    .line 312
    new-array v5, v5, [Ljava/lang/String;

    const-string v6, "table"

    aput-object v6, v5, v7

    .line 311
    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/hmobile/activerecorbase/Database;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 313
    .local v0, "c":Landroid/database/Cursor;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 315
    .local v1, "tables":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-nez v2, :cond_2

    .line 319
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 321
    new-array v2, v7, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    return-object v2

    .line 316
    :cond_2
    const/4 v2, 0x0

    :try_start_1
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 318
    :catchall_0
    move-exception v2

    .line 319
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 320
    throw v2
.end method

.method public getVersion()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 338
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_1

    .line 339
    :cond_0
    sget-object v0, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    .line 340
    const-string v1, "(%t) %s.getVersion(): ERROR - db object is null or closed"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 341
    sget-object v4, Lcom/hmobile/activerecorbase/Database;->CNAME:Ljava/lang/String;

    aput-object v4, v2, v3

    .line 339
    invoke-static {v0, v1, v2}, Lcom/hmobile/activerecorbase/Logg;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 342
    new-instance v0, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v1, "Database is closed. Did you forget to open database?"

    invoke-direct {v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 345
    :cond_1
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I

    move-result v0

    return v0
.end method

.method public insert(Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 2
    .param p1, "table"    # Ljava/lang/String;
    .param p2, "parameters"    # Landroid/content/ContentValues;

    .prologue
    .line 182
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public isOpen()Z
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    const/4 v0, 0x1

    .line 159
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public open()V
    .locals 5

    .prologue
    .line 138
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 140
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_dbHelper:Lcom/hmobile/activerecorbase/DatabaseOpenHelper;

    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    .line 143
    sget-object v0, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v1, "(%t) %s.open(): new db obj %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    sget-object v4, Lcom/hmobile/activerecorbase/Database;->CNAME:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    .line 144
    iget-object v4, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 143
    invoke-static {v0, v1, v2}, Lcom/hmobile/activerecorbase/Logg;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 145
    return-void
.end method

.method public query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 10
    .param p1, "table"    # Ljava/lang/String;
    .param p2, "selectColumns"    # [Ljava/lang/String;
    .param p3, "where"    # Ljava/lang/String;
    .param p4, "whereArgs"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 260
    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v7, v6

    move-object v8, v6

    move-object v9, v6

    invoke-virtual/range {v0 .. v9}, Lcom/hmobile/activerecorbase/Database;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 10
    .param p1, "distinct"    # Z
    .param p2, "table"    # Ljava/lang/String;
    .param p3, "selectColumns"    # [Ljava/lang/String;
    .param p4, "where"    # Ljava/lang/String;
    .param p5, "whereArgs"    # [Ljava/lang/String;
    .param p6, "groupBy"    # Ljava/lang/String;
    .param p7, "having"    # Ljava/lang/String;
    .param p8, "orderBy"    # Ljava/lang/String;
    .param p9, "limit"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 287
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_1

    .line 288
    :cond_0
    sget-object v0, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    .line 289
    const-string v1, "(%t) %s.query(): ERROR - db object is null or closed"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 290
    sget-object v4, Lcom/hmobile/activerecorbase/Database;->CNAME:Ljava/lang/String;

    aput-object v4, v2, v3

    .line 288
    invoke-static {v0, v1, v2}, Lcom/hmobile/activerecorbase/Logg;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 291
    new-instance v0, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v1, "Database is closed. Did you forget to open database?"

    invoke-direct {v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 294
    :cond_1
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-virtual/range {v0 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public rawQuery(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1
    .param p1, "sql"    # Ljava/lang/String;

    .prologue
    .line 226
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/hmobile/activerecorbase/Database;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1
    .param p1, "sql"    # Ljava/lang/String;
    .param p2, "params"    # [Ljava/lang/String;

    .prologue
    .line 239
    const-string v0, "rawQuery"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public setTransactionSuccessful()V
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 369
    return-void
.end method

.method public setVersion(I)V
    .locals 5
    .param p1, "version"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/hmobile/activerecorbase/ActiveRecordException;
        }
    .end annotation

    .prologue
    .line 349
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_1

    .line 350
    :cond_0
    sget-object v0, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    .line 351
    const-string v1, "(%t) %s.setVersion(): ERROR - db object is null or closed"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 352
    sget-object v4, Lcom/hmobile/activerecorbase/Database;->CNAME:Ljava/lang/String;

    aput-object v4, v2, v3

    .line 350
    invoke-static {v0, v1, v2}, Lcom/hmobile/activerecorbase/Logg;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 353
    new-instance v0, Lcom/hmobile/activerecorbase/ActiveRecordException;

    const-string v1, "Database is closed. Did you forget to open database?"

    invoke-direct {v0, v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 356
    :cond_1
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V

    .line 357
    return-void
.end method

.method public update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1
    .param p1, "table"    # Ljava/lang/String;
    .param p2, "values"    # Landroid/content/ContentValues;
    .param p3, "whereClause"    # Ljava/lang/String;
    .param p4, "whereArgs"    # [Ljava/lang/String;

    .prologue
    .line 200
    iget-object v0, p0, Lcom/hmobile/activerecorbase/Database;->_database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method
