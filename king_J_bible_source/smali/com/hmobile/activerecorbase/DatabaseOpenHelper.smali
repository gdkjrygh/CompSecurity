.class Lcom/hmobile/activerecorbase/DatabaseOpenHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "DatabaseOpenHelper.java"


# instance fields
.field _builder:Lcom/hmobile/activerecorbase/DatabaseBuilder;

.field _version:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ILcom/hmobile/activerecorbase/DatabaseBuilder;)V
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "dbPath"    # Ljava/lang/String;
    .param p3, "dbVersion"    # I
    .param p4, "builder"    # Lcom/hmobile/activerecorbase/DatabaseBuilder;

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 36
    iput-object p4, p0, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;->_builder:Lcom/hmobile/activerecorbase/DatabaseBuilder;

    .line 37
    iput p3, p0, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;->_version:I

    .line 38
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 8
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 42
    iget-object v3, p0, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;->_builder:Lcom/hmobile/activerecorbase/DatabaseBuilder;

    invoke-virtual {v3}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->getTables()[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v5, :cond_0

    .line 52
    iget v3, p0, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;->_version:I

    invoke-virtual {p1, v3}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V

    .line 53
    return-void

    .line 42
    :cond_0
    aget-object v2, v4, v3

    .line 43
    .local v2, "table":Ljava/lang/String;
    const/4 v1, 0x0

    .line 45
    .local v1, "sqlStr":Ljava/lang/String;
    :try_start_0
    iget-object v6, p0, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;->_builder:Lcom/hmobile/activerecorbase/DatabaseBuilder;

    invoke-virtual {v6, v2}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->getSQLCreate(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 49
    :goto_1
    if-eqz v1, :cond_1

    .line 50
    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 42
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 6
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .prologue
    .line 57
    iget-object v2, p0, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;->_builder:Lcom/hmobile/activerecorbase/DatabaseBuilder;

    invoke-virtual {v2}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->getTables()[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/4 v2, 0x0

    :goto_0
    if-lt v2, v4, :cond_0

    .line 61
    invoke-virtual {p0, p1}, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 62
    return-void

    .line 57
    :cond_0
    aget-object v1, v3, v2

    .line 58
    .local v1, "table":Ljava/lang/String;
    iget-object v5, p0, Lcom/hmobile/activerecorbase/DatabaseOpenHelper;->_builder:Lcom/hmobile/activerecorbase/DatabaseBuilder;

    invoke-virtual {v5, v1}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->getSQLDrop(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 59
    .local v0, "sqlStr":Ljava/lang/String;
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 57
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method
