.class public final Lcom/roidapp/photogrid/common/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# instance fields
.field private final a:Ljava/io/File;

.field private final b:Landroid/content/ContentResolver;

.field private final c:Landroid/net/Uri;

.field private final d:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Ljava/io/File;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p2, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    .line 27
    iput-object p1, p0, Lcom/roidapp/photogrid/common/ae;->b:Landroid/content/ContentResolver;

    .line 28
    const-string v0, "external"

    invoke-static {v0}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/ae;->c:Landroid/net/Uri;

    .line 29
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/ae;->d:Landroid/net/Uri;

    .line 30
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v0, 0x0

    .line 95
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 96
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 97
    new-instance v4, Lcom/roidapp/photogrid/common/ae;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-direct {v4, v5, v2}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 101
    :try_start_0
    invoke-virtual {v4}, Lcom/roidapp/photogrid/common/ae;->b()Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 102
    :try_start_1
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    const/16 v3, 0x2000

    :try_start_2
    new-array v3, v3, [B

    .line 105
    :goto_0
    invoke-virtual {v2, v3}, Ljava/io/FileInputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_2

    .line 106
    const/4 v6, 0x0

    invoke-virtual {v4, v3, v6, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    .line 109
    :catch_0
    move-exception v1

    move-object v3, v4

    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 113
    if-eqz v3, :cond_0

    .line 114
    :try_start_4
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 115
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 117
    :cond_0
    if-eqz v2, :cond_1

    .line 118
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 126
    :cond_1
    :goto_2
    return v0

    .line 113
    :cond_2
    if-eqz v4, :cond_3

    .line 114
    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 115
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 118
    :cond_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 125
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 126
    const/4 v0, 0x1

    goto :goto_2

    .line 121
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 112
    :catchall_0
    move-exception v1

    move-object v2, v3

    move-object v4, v3

    .line 113
    :goto_3
    if-eqz v4, :cond_4

    .line 114
    :try_start_6
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 115
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 117
    :cond_4
    if-eqz v2, :cond_5

    .line 118
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 122
    :cond_5
    throw v1

    .line 121
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 112
    :catchall_1
    move-exception v1

    move-object v2, v3

    goto :goto_3

    :catchall_2
    move-exception v1

    goto :goto_3

    :catchall_3
    move-exception v1

    move-object v4, v3

    goto :goto_3

    .line 109
    :catch_4
    move-exception v1

    move-object v2, v3

    goto :goto_1

    :catch_5
    move-exception v1

    move-object v2, v3

    move-object v3, v4

    goto :goto_1
.end method


# virtual methods
.method public final a()Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    .line 70
    :goto_0
    return v0

    .line 63
    :cond_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 64
    const-string v1, "_data"

    iget-object v2, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    iget-object v1, p0, Lcom/roidapp/photogrid/common/ae;->b:Landroid/content/ContentResolver;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/ae;->c:Landroid/net/Uri;

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 66
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 67
    const-string v1, "_data"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/temp.jpg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    iget-object v1, p0, Lcom/roidapp/photogrid/common/ae;->b:Landroid/content/ContentResolver;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/ae;->d:Landroid/net/Uri;

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/roidapp/photogrid/common/ae;->b:Landroid/content/ContentResolver;

    invoke-virtual {v1, v0, v4, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    goto :goto_0
.end method

.method public final b()Ljava/io/OutputStream;
    .locals 4

    .prologue
    .line 74
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    new-instance v0, Ljava/io/IOException;

    const-string v1, "File exists and is a directory."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :cond_0
    const-string v0, "_data=?"

    .line 78
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 79
    iget-object v2, p0, Lcom/roidapp/photogrid/common/ae;->b:Landroid/content/ContentResolver;

    iget-object v3, p0, Lcom/roidapp/photogrid/common/ae;->c:Landroid/net/Uri;

    invoke-virtual {v2, v3, v0, v1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 80
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 81
    const-string v1, "_data"

    iget-object v2, p0, Lcom/roidapp/photogrid/common/ae;->a:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v1, p0, Lcom/roidapp/photogrid/common/ae;->b:Landroid/content/ContentResolver;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/ae;->c:Landroid/net/Uri;

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    .line 83
    if-nez v0, :cond_1

    .line 84
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Internal error."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/common/ae;->b:Landroid/content/ContentResolver;

    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method
