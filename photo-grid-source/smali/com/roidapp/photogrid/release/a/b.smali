.class public final Lcom/roidapp/photogrid/release/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/.sticker/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/release/a/b;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Lcom/roidapp/photogrid/release/StickerInfo;Lcom/roidapp/baselib/g/b;)Lcom/roidapp/baselib/g/a;
    .locals 4

    .prologue
    .line 73
    iget-object v0, p0, Lcom/roidapp/photogrid/release/StickerInfo;->n:Ljava/lang/String;

    .line 2126
    iget-object v1, p0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 2150
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/roidapp/photogrid/release/a/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v1}, Lcom/roidapp/baselib/d/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 73
    invoke-static {v0, v1, p1}, Lcom/roidapp/baselib/g/a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/g/b;)Lcom/roidapp/baselib/g/a;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 161
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 168
    :cond_0
    :goto_0
    return-object v0

    .line 164
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 165
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 166
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    goto :goto_0
.end method

.method public static a(Lcom/roidapp/photogrid/release/StickerInfo;)Z
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 35
    if-nez p0, :cond_1

    .line 2064
    :cond_0
    :goto_0
    return v0

    .line 1126
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 39
    invoke-static {p0}, Lcom/roidapp/photogrid/release/a/b;->b(Lcom/roidapp/photogrid/release/StickerInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2047
    iget-object v3, p0, Lcom/roidapp/photogrid/release/StickerInfo;->k:[Ljava/lang/String;

    .line 2049
    if-eqz v3, :cond_2

    array-length v2, v3

    if-gtz v2, :cond_3

    .line 2050
    :cond_2
    invoke-static {p0}, Lcom/roidapp/photogrid/release/a/b;->c(Lcom/roidapp/photogrid/release/StickerInfo;)Z

    goto :goto_0

    .line 2053
    :cond_3
    invoke-static {p0}, Lcom/roidapp/photogrid/release/a/b;->b(Lcom/roidapp/photogrid/release/StickerInfo;)Ljava/lang/String;

    move-result-object v4

    .line 2056
    array-length v5, v3

    move v2, v0

    :goto_1
    if-ge v2, v5, :cond_6

    aget-object v6, v3, v2

    .line 2057
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 2058
    invoke-static {p0}, Lcom/roidapp/photogrid/release/a/b;->c(Lcom/roidapp/photogrid/release/StickerInfo;)Z

    goto :goto_0

    .line 2061
    :cond_4
    new-instance v7, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2062
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_5

    .line 2063
    invoke-static {p0}, Lcom/roidapp/photogrid/release/a/b;->c(Lcom/roidapp/photogrid/release/StickerInfo;)Z

    goto :goto_0

    .line 2056
    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    move v0, v1

    .line 42
    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 86
    const/4 v3, 0x0

    .line 88
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 89
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 90
    new-instance v2, Ljava/util/zip/ZipFile;

    invoke-direct {v2, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 91
    :try_start_1
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v3

    .line 92
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 93
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/zip/ZipEntry;

    .line 94
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v4

    .line 95
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 96
    new-instance v0, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 113
    :catch_0
    move-exception v0

    .line 115
    :goto_1
    :try_start_2
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V

    .line 116
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    if-eqz v2, :cond_0

    .line 121
    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 122
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :cond_0
    :goto_2
    move v0, v1

    .line 125
    :goto_3
    return v0

    .line 99
    :cond_1
    :try_start_4
    new-instance v5, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 100
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 102
    const/16 v5, 0x400

    new-array v5, v5, [B

    .line 103
    invoke-virtual {v2, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v0

    .line 104
    :goto_4
    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_3

    .line 105
    const/4 v7, 0x0

    invoke-virtual {v4, v5, v7, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 106
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    .line 119
    :catchall_0
    move-exception v0

    :goto_5
    if-eqz v2, :cond_2

    .line 121
    :try_start_5
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 122
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 125
    :cond_2
    :goto_6
    throw v0

    .line 108
    :cond_3
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 109
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto/16 :goto_0

    .line 121
    :cond_4
    :try_start_7
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 122
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 125
    :goto_7
    const/4 v0, 0x1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_6

    .line 119
    :catchall_1
    move-exception v0

    move-object v2, v3

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_2

    .line 113
    :catch_3
    move-exception v0

    move-object v2, v3

    goto :goto_1

    :catch_4
    move-exception v0

    goto :goto_7
.end method

.method public static b(Lcom/roidapp/photogrid/release/StickerInfo;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 137
    if-nez p0, :cond_0

    .line 138
    const-string v0, ""

    .line 140
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/photogrid/release/a/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3126
    iget-object v1, p0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/StickerInfo;->h:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static c(Lcom/roidapp/photogrid/release/StickerInfo;)Z
    .locals 2

    .prologue
    .line 178
    invoke-static {p0}, Lcom/roidapp/photogrid/release/a/b;->b(Lcom/roidapp/photogrid/release/StickerInfo;)Ljava/lang/String;

    move-result-object v0

    .line 179
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V

    .line 180
    const/4 v0, 0x1

    return v0
.end method
