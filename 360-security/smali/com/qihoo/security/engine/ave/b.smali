.class public Lcom/qihoo/security/engine/ave/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/ave/b$a;
    }
.end annotation


# static fields
.field public static a:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# instance fields
.field public b:I

.field private final d:Landroid/content/Context;

.field private e:Landroid/database/sqlite/SQLiteDatabase;

.field private f:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/qihoo/security/engine/ave/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/ave/b;->c:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/ave/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/ave/b;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static a(Ljava/io/File;)J
    .locals 5

    const-wide/16 v0, 0x0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "timestamp"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v0

    if-eqz v2, :cond_0

    :try_start_2
    invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_0

    :try_start_3
    invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    :catch_2
    move-exception v2

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_2
    if-eqz v3, :cond_2

    :try_start_4
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :cond_2
    :goto_3
    throw v0

    :catch_3
    move-exception v1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v3, v2

    goto :goto_2

    :catch_4
    move-exception v3

    goto :goto_1
.end method

.method private declared-synchronized a(Ljava/io/File;I)Landroid/database/sqlite/SQLiteDatabase;
    .locals 3

    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2, p2}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private a(I)Ljava/lang/String;
    .locals 3

    const/high16 v0, 0x1000000

    shl-int/lit8 v1, p1, 0x10

    or-int/2addr v0, v1

    iget v1, p0, Lcom/qihoo/security/engine/ave/b;->b:I

    const v2, 0xffff

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/qihoo/security/services/ScanResult;I)Z
    .locals 11

    const/4 v10, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->e:Landroid/database/sqlite/SQLiteDatabase;

    const-string/jumbo v1, "d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string/jumbo v4, "value"

    aput-object v4, v2, v3

    const-string/jumbo v3, "id=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_4

    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v1

    if-eqz v1, :cond_4

    array-length v2, v1

    const/4 v3, 0x3

    if-le v2, v3, :cond_4

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v3, 0x40

    new-array v3, v3, [B

    new-instance v4, Ljava/util/zip/Inflater;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ljava/util/zip/Inflater;-><init>(Z)V

    invoke-virtual {v4, v1}, Ljava/util/zip/Inflater;->setInput([B)V

    :goto_0
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->finished()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    new-instance v3, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const-string/jumbo v4, "UTF-8"

    invoke-direct {v3, v2, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    iput-object v3, v1, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_0
    move v0, v8

    :goto_1
    return v0

    :cond_1
    :try_start_2
    invoke-virtual {v4, v3}, Ljava/util/zip/Inflater;->inflate([B)I

    move-result v1

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v1

    :goto_2
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    :goto_3
    move v0, v9

    goto :goto_1

    :catchall_0
    move-exception v0

    :goto_4
    if-eqz v10, :cond_3

    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0

    :cond_4
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_3

    :catchall_1
    move-exception v1

    move-object v10, v0

    move-object v0, v1

    goto :goto_4

    :catch_1
    move-exception v0

    move-object v0, v10

    goto :goto_2
.end method

.method public static a(Ljava/io/File;J)Z
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    new-instance v0, Ljava/io/DataOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    :cond_0
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :catch_0
    move-exception v0

    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :cond_1
    :goto_3
    const/4 v0, 0x0

    goto :goto_1

    :catchall_0
    move-exception v0

    :goto_4
    if-eqz v1, :cond_2

    :try_start_4
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :cond_2
    :goto_5
    throw v0

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v1

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_4

    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method public static a(Ljava/io/File;Ljava/io/File;)Z
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v2, 0x0

    :try_start_0
    new-instance v1, Ljava/io/DataInputStream;

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v2

    if-eqz v1, :cond_2

    :try_start_2
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    :cond_2
    :goto_1
    invoke-static {p1, v2, v3}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v2, :cond_3

    :try_start_4
    invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :cond_3
    :goto_4
    throw v0

    :catch_2
    move-exception v1

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_3

    :catch_4
    move-exception v2

    goto :goto_2
.end method

.method private static b(Ljava/io/File;Ljava/io/File;)Z
    .locals 4

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v2, v0}, Lcom/qihoo360/common/utils/FileUtil;->copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v2, :cond_0

    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    :cond_1
    :goto_1
    const/4 v0, 0x1

    :goto_2
    return v0

    :catch_0
    move-exception v0

    move-object v0, v1

    :goto_3
    if-eqz v1, :cond_2

    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :cond_2
    :goto_4
    if-eqz v0, :cond_3

    :try_start_6
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    :cond_3
    :goto_5
    const/4 v0, 0x0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_6
    if-eqz v2, :cond_4

    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    :cond_4
    :goto_7
    if-eqz v1, :cond_5

    :try_start_8
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    :cond_5
    :goto_8
    throw v0

    :catch_1
    move-exception v1

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v2

    goto :goto_7

    :catch_4
    move-exception v1

    goto :goto_8

    :catch_5
    move-exception v1

    goto :goto_0

    :catch_6
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_6

    :catchall_2
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_6

    :catch_7
    move-exception v0

    move-object v0, v1

    move-object v1, v2

    goto :goto_3

    :catch_8
    move-exception v1

    move-object v1, v2

    goto :goto_3
.end method

.method private declared-synchronized e()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->e:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->e:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/qihoo/security/engine/ave/b;->e:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private declared-synchronized f()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 12

    const/4 v4, 0x2

    const/4 v1, 0x1

    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/engine/ave/b;->e()V

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v3, "ave"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v5, "v_avedb.zip"

    invoke-static {v2, v5}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v6

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v5, "v_avedb.zip"

    invoke-static {v2, v5}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v2, v8, v10

    if-lez v2, :cond_1c

    cmp-long v2, v8, v6

    if-lez v2, :cond_24

    move v6, v1

    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v5, "heurmod_v2.jar"

    invoke-static {v2, v5}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v5, "heurmod_v2.jar"

    invoke-static {v2, v5}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v10

    cmp-long v2, v10, v8

    if-lez v2, :cond_23

    move v5, v1

    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v7, "v_sig.db"

    invoke-static {v2, v7}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v7, "v_sig.db"

    invoke-static {v2, v7}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v10

    cmp-long v2, v10, v8

    if-lez v2, :cond_22

    move v2, v1

    :goto_2
    if-eq v6, v1, :cond_0

    if-eq v5, v1, :cond_0

    if-ne v2, v1, :cond_1

    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->exists()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v7

    if-eqz v7, :cond_1

    :try_start_1
    invoke-static {v3}, Lcom/qihoo360/common/utils/FileUtil;->deleteDirectory(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    :goto_3
    monitor-exit p0

    return v0

    :cond_3
    if-ne v6, v1, :cond_15

    :try_start_3
    new-instance v7, Ljava/io/File;

    iget-object v8, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    const-string/jumbo v9, "avedb.zip"

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    :cond_4
    new-instance v7, Ljava/io/File;

    iget-object v8, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    const-string/jumbo v9, "v_avedb.zip"

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    :cond_5
    new-instance v8, Ljava/io/File;

    iget-object v9, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v9

    const-string/jumbo v10, "v_avedb.zip.timestamp"

    invoke-direct {v8, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    :cond_6
    iget-object v8, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v9, "v_avedb.zip"

    const/4 v10, 0x1

    invoke-static {v8, v9, v7, v10}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v8

    if-eqz v8, :cond_2

    new-instance v8, Ljava/io/File;

    const-string/jumbo v9, "360ave.def"

    invoke-direct {v8, v3, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    new-instance v8, Ljava/io/File;

    const-string/jumbo v9, "360info.def"

    invoke-direct {v8, v3, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    const-string/jumbo v9, "360"

    invoke-static {v7, v8, v9}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->OpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    if-ltz v7, :cond_2

    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v8, "v_avedb.zip.timestamp"

    new-instance v9, Ljava/io/File;

    const-string/jumbo v10, "v_avedb.zip.timestamp"

    invoke-direct {v9, v3, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v10, 0x0

    invoke-static {v7, v8, v9, v10}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v7

    if-nez v7, :cond_7

    :cond_7
    :goto_4
    if-ne v5, v1, :cond_18

    new-instance v7, Ljava/io/File;

    iget-object v8, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    const-string/jumbo v9, "heurmod_v2.jar"

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    :cond_8
    new-instance v8, Ljava/io/File;

    iget-object v9, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v9

    const-string/jumbo v10, "heurmod_v2.jar.timestamp"

    invoke-direct {v8, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    :cond_9
    iget-object v8, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v9, "heurmod_v2.jar"

    const/4 v10, 0x1

    invoke-static {v8, v9, v7, v10}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v7, Ljava/io/File;

    const-string/jumbo v8, "heurmod_v2.jar"

    invoke-direct {v7, v3, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    :cond_a
    new-instance v8, Ljava/io/File;

    const-string/jumbo v9, "heurmod_v2.jar.timestamp"

    invoke-direct {v8, v3, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    :cond_b
    iget-object v8, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v9, "heurmod_v2.jar"

    const/4 v10, 0x1

    invoke-static {v8, v9, v7, v10}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v8, "heurmod_v2.jar.timestamp"

    new-instance v9, Ljava/io/File;

    const-string/jumbo v10, "heurmod_v2.jar.timestamp"

    invoke-direct {v9, v3, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v10, 0x0

    invoke-static {v7, v8, v9, v10}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v7

    if-eqz v7, :cond_c

    :cond_c
    :goto_5
    if-ne v2, v1, :cond_1a

    new-instance v4, Ljava/io/File;

    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    const-string/jumbo v8, "v_sig.db"

    invoke-direct {v4, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    :cond_d
    new-instance v7, Ljava/io/File;

    iget-object v8, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    const-string/jumbo v9, "v_sig.db.timestamp"

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    :cond_e
    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v8, "v_sig.db"

    const/4 v9, 0x1

    invoke-static {v7, v8, v4, v9}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v4, Ljava/io/File;

    const-string/jumbo v7, "v_sig.db"

    invoke-direct {v4, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    :cond_f
    new-instance v7, Ljava/io/File;

    const-string/jumbo v8, "v_sig.db.timestamp"

    invoke-direct {v7, v3, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    :cond_10
    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v8, "v_sig.db"

    const/4 v9, 0x1

    invoke-static {v7, v8, v4, v9}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v7, "v_sig.db.timestamp"

    new-instance v8, Ljava/io/File;

    const-string/jumbo v9, "v_sig.db.timestamp"

    invoke-direct {v8, v3, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v9, 0x0

    invoke-static {v4, v7, v8, v9}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v4

    if-eqz v4, :cond_11

    :cond_11
    :goto_6
    if-gtz v6, :cond_12

    if-gtz v5, :cond_12

    if-lez v2, :cond_13

    :cond_12
    new-instance v2, Ljava/io/File;

    const-string/jumbo v4, "vdb.cache"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "vdb.cache"

    new-instance v5, Ljava/io/File;

    const-string/jumbo v6, "vdb.cache"

    invoke-direct {v5, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-static {v2, v4, v5, v6}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    :cond_13
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "v_avedb.zip"

    invoke-static {v2, v4}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    long-to-int v2, v4

    iput v2, p0, Lcom/qihoo/security/engine/ave/b;->b:I

    :goto_7
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "ave_e"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iget-object v4, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v5, "avedb_e.zip"

    invoke-static {v4, v5}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    new-instance v6, Ljava/io/File;

    const-string/jumbo v7, "avedb_e.zip.timestamp"

    invoke-direct {v6, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-wide v6

    cmp-long v6, v4, v6

    if-lez v6, :cond_14

    :try_start_4
    invoke-static {v2}, Lcom/qihoo360/common/utils/FileUtil;->deleteDirectory(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_8
    :try_start_5
    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    new-instance v6, Ljava/io/File;

    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    const-string/jumbo v8, "avedb_e.zip"

    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    const-string/jumbo v8, "360"

    invoke-static {v6, v7, v8}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->OpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    iget-object v6, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v7, "vdb.cache"

    new-instance v8, Ljava/io/File;

    const-string/jumbo v9, "vdb.cache"

    invoke-direct {v8, v2, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    new-instance v6, Ljava/io/File;

    const-string/jumbo v7, "v_sig.db.timestamp"

    invoke-direct {v6, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6, v4, v5}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    new-instance v6, Ljava/io/File;

    const-string/jumbo v7, "heurmod_v2.jar.timestamp"

    invoke-direct {v6, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6, v4, v5}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    new-instance v6, Ljava/io/File;

    const-string/jumbo v7, "avedb_e.zip.timestamp"

    invoke-direct {v6, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6, v4, v5}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    move-result v2

    if-eqz v2, :cond_14

    :cond_14
    sget-boolean v2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v2, :cond_20

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "ave_e"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_20

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    array-length v4, v4

    if-lez v4, :cond_20

    iget-object v3, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "avedb_e.zip"

    invoke-static {v3, v4}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    long-to-int v3, v4

    iput v3, p0, Lcom/qihoo/security/engine/ave/b;->b:I

    :goto_9
    new-instance v3, Ljava/io/File;

    const-string/jumbo v4, "v_sig.db"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-direct {p0, v3, v2}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo/security/engine/ave/b;->e:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->e:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v2, :cond_2

    move v0, v1

    goto/16 :goto_3

    :cond_15
    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v8, "v_avedb.zip"

    invoke-static {v7, v8}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    new-instance v7, Ljava/io/File;

    const-string/jumbo v10, "v_avedb.zip.timestamp"

    invoke-direct {v7, v3, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v7}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;)J

    move-result-wide v10

    cmp-long v7, v8, v10

    if-lez v7, :cond_7

    new-instance v6, Ljava/io/File;

    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    const-string/jumbo v10, "avedb.zip"

    invoke-direct {v6, v7, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_16
    :goto_a
    move v6, v4

    goto/16 :goto_4

    :cond_17
    new-instance v6, Ljava/io/File;

    const-string/jumbo v7, "360ave.def"

    invoke-direct {v6, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    new-instance v6, Ljava/io/File;

    const-string/jumbo v7, "360info.def"

    invoke-direct {v6, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    new-instance v6, Ljava/io/File;

    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    const-string/jumbo v10, "v_avedb.zip"

    invoke-direct {v6, v7, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    const-string/jumbo v10, "360"

    invoke-static {v6, v7, v10}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->OpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    if-ltz v6, :cond_2

    new-instance v6, Ljava/io/File;

    const-string/jumbo v7, "v_avedb.zip.timestamp"

    invoke-direct {v6, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6, v8, v9}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    move-result v6

    if-eqz v6, :cond_16

    goto :goto_a

    :cond_18
    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v8, "heurmod_v2.jar"

    invoke-static {v7, v8}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    new-instance v7, Ljava/io/File;

    const-string/jumbo v10, "heurmod_v2.jar.timestamp"

    invoke-direct {v7, v3, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v7}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;)J

    move-result-wide v10

    cmp-long v7, v8, v10

    if-lez v7, :cond_c

    new-instance v5, Ljava/io/File;

    const-string/jumbo v7, "heurmod_v2.jar"

    invoke-direct {v5, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    :cond_19
    new-instance v7, Ljava/io/File;

    iget-object v10, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v10

    const-string/jumbo v11, "heurmod_v2.jar"

    invoke-direct {v7, v10, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v7, v5}, Lcom/qihoo/security/engine/ave/b;->b(Ljava/io/File;Ljava/io/File;)Z

    move-result v5

    if-eqz v5, :cond_2

    new-instance v5, Ljava/io/File;

    const-string/jumbo v7, "heurmod_v2.jar.timestamp"

    invoke-direct {v5, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v5, v8, v9}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    move v5, v4

    goto/16 :goto_5

    :cond_1a
    iget-object v7, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v8, "v_sig.db"

    invoke-static {v7, v8}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    new-instance v7, Ljava/io/File;

    const-string/jumbo v10, "v_sig.db.timestamp"

    invoke-direct {v7, v3, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v7}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;)J

    move-result-wide v10

    cmp-long v7, v8, v10

    if-lez v7, :cond_11

    new-instance v2, Ljava/io/File;

    const-string/jumbo v7, "v_sig.db"

    invoke-direct {v2, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_1b
    new-instance v7, Ljava/io/File;

    iget-object v10, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v10

    const-string/jumbo v11, "v_sig.db"

    invoke-direct {v7, v10, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v7, v2}, Lcom/qihoo/security/engine/ave/b;->b(Ljava/io/File;Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/io/File;

    const-string/jumbo v7, "v_sig.db.timestamp"

    invoke-direct {v2, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v8, v9}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    move v2, v4

    goto/16 :goto_6

    :cond_1c
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "avedb.zip"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance v2, Ljava/io/File;

    const-string/jumbo v5, "v_sig.db"

    invoke-direct {v2, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1e

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v5, "avedb.zip"

    invoke-static {v2, v5}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v6

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v5, "avedb.zip"

    invoke-static {v2, v5}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    cmp-long v2, v8, v6

    if-lez v2, :cond_21

    move v2, v1

    :goto_b
    if-eqz v2, :cond_1f

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v5, "avedb.zip"

    const/4 v6, 0x1

    invoke-static {v2, v5, v4, v6}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result v2

    if-eqz v2, :cond_1d

    :try_start_6
    invoke-static {v3}, Lcom/qihoo360/common/utils/FileUtil;->deleteDirectory(Ljava/io/File;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_c
    :try_start_7
    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "360"

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->OpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "vdb.cache"

    new-instance v5, Ljava/io/File;

    const-string/jumbo v6, "vdb.cache"

    invoke-direct {v5, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-static {v2, v4, v5, v6}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "avedb.zip"

    invoke-static {v2, v4}, Lcom/qihoo360/common/utils/FileUtil;->getAssetTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    new-instance v2, Ljava/io/File;

    const-string/jumbo v6, "v_sig.db.timestamp"

    invoke-direct {v2, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    new-instance v2, Ljava/io/File;

    const-string/jumbo v6, "heurmod_v2.jar.timestamp"

    invoke-direct {v2, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    new-instance v2, Ljava/io/File;

    const-string/jumbo v6, "avedb.zip.timestamp"

    invoke-direct {v2, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    move-result v2

    if-eqz v2, :cond_1d

    :cond_1d
    :goto_d
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "avedb.zip"

    invoke-static {v2, v4}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    long-to-int v2, v4

    iput v2, p0, Lcom/qihoo/security/engine/ave/b;->b:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1e
    move v2, v1

    goto :goto_b

    :cond_1f
    :try_start_8
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "avedb.zip"

    invoke-static {v2, v4}, Lcom/qihoo360/common/utils/FileUtil;->getFileTimestamp(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    new-instance v2, Ljava/io/File;

    const-string/jumbo v6, "avedb.zip.timestamp"

    invoke-direct {v2, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;)J
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-result-wide v6

    cmp-long v2, v4, v6

    if-lez v2, :cond_1d

    :try_start_9
    invoke-static {v3}, Lcom/qihoo360/common/utils/FileUtil;->deleteDirectory(Ljava/io/File;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_e
    :try_start_a
    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z

    new-instance v2, Ljava/io/File;

    iget-object v6, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v6

    const-string/jumbo v7, "avedb.zip"

    invoke-direct {v2, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    const-string/jumbo v7, "360"

    invoke-static {v2, v6, v7}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->OpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v6, "vdb.cache"

    new-instance v7, Ljava/io/File;

    const-string/jumbo v8, "vdb.cache"

    invoke-direct {v7, v3, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v8, 0x0

    invoke-static {v2, v6, v7, v8}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    new-instance v2, Ljava/io/File;

    const-string/jumbo v6, "v_sig.db.timestamp"

    invoke-direct {v2, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    new-instance v2, Ljava/io/File;

    const-string/jumbo v6, "heurmod_v2.jar.timestamp"

    invoke-direct {v2, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z

    new-instance v2, Ljava/io/File;

    const-string/jumbo v6, "avedb.zip.timestamp"

    invoke-direct {v2, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;J)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result v2

    if-eqz v2, :cond_1d

    goto/16 :goto_d

    :catch_0
    move-exception v1

    goto/16 :goto_3

    :catch_1
    move-exception v2

    goto/16 :goto_c

    :catch_2
    move-exception v2

    goto :goto_e

    :catch_3
    move-exception v6

    goto/16 :goto_8

    :cond_20
    move-object v2, v3

    goto/16 :goto_9

    :cond_21
    move v2, v0

    goto/16 :goto_b

    :cond_22
    move v2, v0

    goto/16 :goto_2

    :cond_23
    move v5, v0

    goto/16 :goto_1

    :cond_24
    move v6, v0

    goto/16 :goto_0
.end method

.method public a(Lcom/qihoo/security/services/ScanResult;)Z
    .locals 11

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_0

    move v0, v8

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    const-string/jumbo v1, "p"

    const/16 v2, 0xd

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string/jumbo v4, "key"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string/jumbo v4, "v"

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const-string/jumbo v4, "r"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string/jumbo v4, "b"

    aput-object v4, v2, v3

    const/4 v3, 0x4

    const-string/jumbo v4, "h"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    const-string/jumbo v4, "d"

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string/jumbo v4, "t"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    const-string/jumbo v4, "c"

    aput-object v4, v2, v3

    const/16 v3, 0x8

    const-string/jumbo v4, "l"

    aput-object v4, v2, v3

    const/16 v3, 0x9

    const-string/jumbo v4, "s"

    aput-object v4, v2, v3

    const/16 v3, 0xa

    const-string/jumbo v4, "m"

    aput-object v4, v2, v3

    const/16 v3, 0xb

    const-string/jumbo v4, "f"

    aput-object v4, v2, v3

    const/16 v3, 0xc

    const-string/jumbo v4, "x"

    aput-object v4, v2, v3

    const-string/jumbo v3, "key=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v6, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v6, v6, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v6, v6, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_c

    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_c

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    iget-object v2, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget v2, v2, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eq v2, v1, :cond_2

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    move v0, v8

    goto/16 :goto_0

    :cond_2
    const/4 v1, 0x4

    :try_start_2
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v1

    iget-object v2, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v2}, Lcom/qihoo/security/engine/ApkInfo;->getSigHash()[B

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result v1

    if-nez v1, :cond_4

    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_3
    move v0, v8

    goto/16 :goto_0

    :cond_4
    const/16 v1, 0x8

    :try_start_3
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    int-to-long v2, v1

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/ApkInfo;->getFileSize()J
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-wide v4

    cmp-long v1, v2, v4

    if-eqz v1, :cond_6

    if-eqz v0, :cond_5

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_5
    move v0, v8

    goto/16 :goto_0

    :cond_6
    :try_start_4
    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    iput v2, v1, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/4 v2, 0x3

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    iput v2, v1, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const/4 v2, 0x5

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const/4 v2, 0x6

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const/4 v2, 0x7

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->category:Ljava/lang/String;

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/16 v2, 0x9

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/16 v2, 0xa

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    iput v2, v1, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/16 v2, 0xb

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v2

    iput-object v2, v1, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    if-eqz v1, :cond_7

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    array-length v1, v1

    const/16 v2, 0x10

    if-eq v1, v2, :cond_7

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    :cond_7
    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/16 v2, 0xc

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v2

    iput-object v2, v1, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    if-eqz v1, :cond_8

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    array-length v1, v1

    const/16 v2, 0x10

    if-eq v1, v2, :cond_8

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_8
    if-eqz v0, :cond_9

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_9
    move v0, v9

    goto/16 :goto_0

    :catch_0
    move-exception v0

    move-object v0, v10

    :goto_1
    if-eqz v0, :cond_a

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_a
    :goto_2
    move v0, v8

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v10, :cond_b

    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    :cond_b
    throw v0

    :cond_c
    if-eqz v0, :cond_a

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_2

    :catchall_1
    move-exception v1

    move-object v10, v0

    move-object v0, v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method public a(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    const/4 v0, 0x1

    :goto_2
    return v0

    :cond_1
    :try_start_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    iget-object v2, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-boolean v2, v2, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/engine/ave/b;->b(Lcom/qihoo/security/services/ScanResult;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_4
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public declared-synchronized b()Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v3, "ave"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    sget-boolean v3, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "ave_e"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    array-length v3, v3

    if-lez v3, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v3, "ave_e"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    :cond_1
    new-instance v3, Ljava/io/File;

    const-string/jumbo v4, "vdb.cache"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-direct {p0}, Lcom/qihoo/security/engine/ave/b;->f()V

    const/4 v2, 0x0

    invoke-direct {p0, v3, v2}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    :cond_2
    :goto_0
    monitor-exit p0

    return v0

    :cond_3
    :try_start_1
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "vdb.cache"

    const/4 v5, 0x0

    invoke-static {v2, v4, v3, v5}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    const/4 v2, 0x0

    invoke-direct {p0, v3, v2}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->d:Landroid/content/Context;

    const-string/jumbo v4, "vdb.cache"

    const/4 v5, 0x0

    invoke-static {v2, v4, v3, v5}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    invoke-direct {p0}, Lcom/qihoo/security/engine/ave/b;->f()V

    const/4 v2, 0x0

    invoke-direct {p0, v3, v2}, Lcom/qihoo/security/engine/ave/b;->a(Ljava/io/File;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b(Lcom/qihoo/security/services/ScanResult;)Z
    .locals 6

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_0

    :try_start_0
    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string/jumbo v3, "key"

    iget-object v4, v1, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v3, "v"

    iget v4, v1, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string/jumbo v3, "r"

    iget v4, v1, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string/jumbo v3, "b"

    iget v4, v1, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string/jumbo v3, "h"

    invoke-virtual {v1}, Lcom/qihoo/security/engine/ApkInfo;->getSigHash()[B

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string/jumbo v3, "d"

    iget-object v4, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v4, v4, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v3, "t"

    iget-object v4, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v4, v4, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v3, "c"

    iget-object v4, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v4, v4, Lcom/qihoo/security/engine/FileInfo;->category:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v3, "s"

    iget-object v4, v1, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v3, "l"

    invoke-virtual {v1}, Lcom/qihoo/security/engine/ApkInfo;->getFileSize()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string/jumbo v3, "m"

    iget v4, v1, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string/jumbo v3, "f"

    iget-object v4, v1, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string/jumbo v3, "x"

    iget-object v1, v1, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    iget-object v1, p0, Lcom/qihoo/security/engine/ave/b;->f:Landroid/database/sqlite/SQLiteDatabase;

    const-string/jumbo v3, "p"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/qihoo/security/engine/ave/b;->e()V

    invoke-direct {p0}, Lcom/qihoo/security/engine/ave/b;->f()V

    return-void
.end method

.method public c(Lcom/qihoo/security/services/ScanResult;)Z
    .locals 14

    const/4 v12, 0x1

    const/4 v11, 0x0

    const/4 v13, 0x0

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->e:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_0

    move v0, v11

    :goto_0
    return v0

    :cond_0
    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ApkInfo;->getSigHash()[B

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/engine/ave/b$a;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/engine/ave/b$a;-><init>(Lcom/qihoo/security/engine/ave/b;[B)V

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->e:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v2, 0x0

    const-string/jumbo v3, "t"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string/jumbo v6, "r"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-string/jumbo v6, "d"

    aput-object v6, v4, v5

    const-string/jumbo v5, "key=?"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->queryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_5

    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    iput v2, v1, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    iget-object v2, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget v3, p0, Lcom/qihoo/security/engine/ave/b;->b:I

    iput v3, v2, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    iget-object v2, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const-string/jumbo v3, "ruleid"

    const/4 v4, 0x1

    invoke-direct {p0, v4}, Lcom/qihoo/security/engine/ave/b;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/engine/ApkInfo;->setExtra(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget v2, v2, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    if-lez v2, :cond_5

    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/engine/ave/b;->a(Lcom/qihoo/security/services/ScanResult;I)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v1

    if-eqz v1, :cond_2

    :goto_1
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    move v0, v12

    goto :goto_0

    :cond_2
    :try_start_2
    iget-object v1, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const-string/jumbo v2, "Android.HEUR/Variant"

    iput-object v2, v1, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catch_0
    move-exception v1

    :goto_2
    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_3
    :goto_3
    move v0, v11

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :goto_4
    if-eqz v13, :cond_4

    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0

    :cond_5
    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_3

    :catchall_1
    move-exception v1

    move-object v13, v0

    move-object v0, v1

    goto :goto_4

    :catch_1
    move-exception v0

    move-object v0, v13

    goto :goto_2
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/ave/b;->e:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
