.class public Lcom/hmobile/biblekjv/DataBaseHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "DataBaseHelper.java"


# static fields
.field private static DB_NAME:Ljava/lang/String;


# instance fields
.field private DB_PATH:Ljava/lang/String;

.field isOpen:Z

.field mDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

.field public myDataBase:Landroid/database/sqlite/SQLiteDatabase;

.field private mycontext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    const-string v0, "hmobile.db"

    sput-object v0, Lcom/hmobile/biblekjv/DataBaseHelper;->DB_NAME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 47
    sget-object v1, Lcom/hmobile/biblekjv/DataBaseHelper;->DB_NAME:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {p0, p1, v1, v2, v3}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 30
    const-string v1, "/data/data/com.hmobile.biblekjv/databases/"

    iput-object v1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->DB_PATH:Ljava/lang/String;

    .line 39
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->isOpen:Z

    .line 48
    iput-object p1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->mycontext:Landroid/content/Context;

    .line 49
    invoke-direct {p0}, Lcom/hmobile/biblekjv/DataBaseHelper;->checkdatabase()Z

    move-result v0

    .line 50
    .local v0, "dbexist":Z
    if-nez v0, :cond_0

    .line 54
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "Database doesn\'t exist"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/DataBaseHelper;->createdatabase()V

    .line 58
    :cond_0
    return-void
.end method

.method private checkdatabase()Z
    .locals 6

    .prologue
    .line 78
    const/4 v0, 0x0

    .line 80
    .local v0, "checkdb":Z
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->DB_PATH:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v5, Lcom/hmobile/biblekjv/DataBaseHelper;->DB_NAME:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 81
    .local v3, "myPath":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    .local v1, "dbfile":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 89
    .end local v1    # "dbfile":Ljava/io/File;
    .end local v3    # "myPath":Ljava/lang/String;
    :goto_0
    return v0

    .line 85
    :catch_0
    move-exception v2

    .line 86
    .local v2, "e":Landroid/database/sqlite/SQLiteException;
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v5, "Database doesn\'t exist"

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private copydatabase()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 110
    new-instance v6, Ljava/util/zip/ZipInputStream;

    .line 111
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const/high16 v8, 0x7f060000

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v7

    .line 110
    invoke-direct {v6, v7}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 113
    .local v6, "zip":Ljava/util/zip/ZipInputStream;
    const/4 v5, 0x0

    .line 115
    .local v5, "ze":Ljava/util/zip/ZipEntry;
    :cond_0
    :goto_0
    invoke-virtual {v6}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v5

    if-nez v5, :cond_1

    .line 152
    invoke-virtual {v6}, Ljava/util/zip/ZipInputStream;->close()V

    .line 153
    return-void

    .line 117
    :cond_1
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "hmobile.db"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 119
    new-instance v1, Lcom/hmobile/activerecorbase/DatabaseBuilder;

    .line 120
    const-string v7, "hmobile.db"

    .line 119
    invoke-direct {v1, v7}, Lcom/hmobile/activerecorbase/DatabaseBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .local v1, "builder":Lcom/hmobile/activerecorbase/DatabaseBuilder;
    const-class v7, Lcom/hmobile/model/BookInfo;

    invoke-virtual {v1, v7}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 122
    const-class v7, Lcom/hmobile/model/VerseInfo;

    invoke-virtual {v1, v7}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 123
    const-class v7, Lcom/hmobile/model/BookMarkInfo;

    invoke-virtual {v1, v7}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 124
    const-class v7, Lcom/hmobile/model/FavoriteInfo;

    invoke-virtual {v1, v7}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 127
    const-class v7, Lcom/hmobile/model/WidgetSettingInfo;

    invoke-virtual {v1, v7}, Lcom/hmobile/activerecorbase/DatabaseBuilder;->addClass(Ljava/lang/Class;)V

    .line 128
    invoke-static {v1}, Lcom/hmobile/activerecorbase/Database;->setBuilder(Lcom/hmobile/activerecorbase/DatabaseBuilder;)V

    .line 130
    :try_start_0
    iget-object v7, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->mycontext:Landroid/content/Context;

    .line 131
    const-string v8, "hmobile.db"

    const/4 v9, 0x3

    .line 130
    invoke-static {v7, v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->open(Landroid/content/Context;Ljava/lang/String;I)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v7

    iput-object v7, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->mDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .line 132
    const/4 v7, 0x1

    iput-boolean v7, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->isOpen:Z
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 139
    :goto_1
    new-instance v3, Ljava/io/FileOutputStream;

    new-instance v7, Ljava/lang/StringBuilder;

    iget-object v8, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->DB_PATH:Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 139
    invoke-direct {v3, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 141
    .local v3, "fout":Ljava/io/FileOutputStream;
    const/16 v7, 0x400

    new-array v0, v7, [B

    .line 142
    .local v0, "buffer":[B
    const/4 v4, 0x0

    .line 144
    .local v4, "length":I
    :goto_2
    invoke-virtual {v6, v0}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v4

    if-gtz v4, :cond_2

    .line 147
    invoke-virtual {v6}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 148
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V

    .line 149
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    goto :goto_0

    .line 133
    .end local v0    # "buffer":[B
    .end local v3    # "fout":Ljava/io/FileOutputStream;
    .end local v4    # "length":I
    :catch_0
    move-exception v2

    .line 134
    .local v2, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v2}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_1

    .line 135
    .end local v2    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :catch_1
    move-exception v2

    .line 136
    .local v2, "e":Ljava/lang/Exception;
    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_1

    .line 145
    .end local v2    # "e":Ljava/lang/Exception;
    .restart local v0    # "buffer":[B
    .restart local v3    # "fout":Ljava/io/FileOutputStream;
    .restart local v4    # "length":I
    :cond_2
    const/4 v7, 0x0

    invoke-virtual {v3, v0, v7, v4}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_2
.end method


# virtual methods
.method public Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;
    .locals 4

    .prologue
    .line 93
    iget-boolean v1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->isOpen:Z

    if-eqz v1, :cond_0

    .line 94
    iget-object v1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->mDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .line 105
    :goto_0
    return-object v1

    .line 97
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->mycontext:Landroid/content/Context;

    .line 98
    const-string v2, "hmobile.db"

    const/4 v3, 0x3

    .line 97
    invoke-static {v1, v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->open(Landroid/content/Context;Ljava/lang/String;I)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->mDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .line 99
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->isOpen:Z
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 105
    :goto_1
    iget-object v1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->mDatabase:Lcom/hmobile/activerecorbase/ActiveRecordBase;

    goto :goto_0

    .line 100
    :catch_0
    move-exception v0

    .line 101
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_1

    .line 102
    .end local v0    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :catch_1
    move-exception v0

    .line 103
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_1
.end method

.method public declared-synchronized close()V
    .locals 1

    .prologue
    .line 172
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->myDataBase:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->myDataBase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 175
    :cond_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    monitor-exit p0

    return-void

    .line 172
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public createdatabase()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/hmobile/biblekjv/DataBaseHelper;->checkdatabase()Z

    move-result v0

    .line 62
    .local v0, "dbexist":Z
    if-eqz v0, :cond_0

    .line 63
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v3, " Database exists."

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 74
    :goto_0
    return-void

    .line 69
    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/hmobile/biblekjv/DataBaseHelper;->copydatabase()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 70
    :catch_0
    move-exception v1

    .line 71
    .local v1, "e":Ljava/io/IOException;
    new-instance v2, Ljava/lang/Error;

    const-string v3, "Error copying database"

    invoke-direct {v2, v3}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0
    .param p1, "arg0"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 182
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0
    .param p1, "arg0"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "arg1"    # I
    .param p3, "arg2"    # I

    .prologue
    .line 188
    return-void
.end method

.method public opendatabase()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    .prologue
    .line 157
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->DB_PATH:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/hmobile/biblekjv/DataBaseHelper;->DB_NAME:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 158
    .local v0, "mypath":Ljava/lang/String;
    const/4 v1, 0x0

    .line 159
    const/4 v2, 0x0

    .line 158
    invoke-static {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/DataBaseHelper;->myDataBase:Landroid/database/sqlite/SQLiteDatabase;

    .line 169
    return-void
.end method
