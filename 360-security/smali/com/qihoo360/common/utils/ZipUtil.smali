.class public Lcom/qihoo360/common/utils/ZipUtil;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/common/utils/ZipUtil$a;,
        Lcom/qihoo360/common/utils/ZipUtil$b;,
        Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;,
        Lcom/qihoo360/common/utils/ZipUtil$ZipTraversalCallback;
    }
.end annotation


# static fields
.field public static final bDebug:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static GZip([B)[B
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 271
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 275
    :try_start_0
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v3, v4}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    :try_start_1
    new-instance v2, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const v5, 0x8000

    invoke-direct {v2, v1, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 278
    const/16 v1, 0x1000

    :try_start_2
    new-array v1, v1, [B

    .line 279
    :goto_0
    invoke-virtual {v2, v1}, Ljava/io/InputStream;->read([B)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_2

    .line 287
    if-eqz v2, :cond_0

    .line 288
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 289
    :cond_0
    if-eqz v3, :cond_1

    .line 290
    invoke-virtual {v3}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 291
    :cond_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 296
    :goto_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    :goto_2
    return-object v0

    .line 280
    :cond_2
    const/4 v6, 0x0

    :try_start_4
    invoke-virtual {v3, v1, v6, v5}, Ljava/util/zip/GZIPOutputStream;->write([BII)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    .line 282
    :catch_0
    move-exception v1

    .line 283
    :goto_3
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 287
    if-eqz v2, :cond_3

    .line 288
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 289
    :cond_3
    if-eqz v3, :cond_4

    .line 290
    invoke-virtual {v3}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 291
    :cond_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_2

    .line 292
    :catch_1
    move-exception v1

    goto :goto_2

    .line 285
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    move-object v0, v1

    .line 287
    :goto_4
    if-eqz v2, :cond_5

    .line 288
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 289
    :cond_5
    if-eqz v3, :cond_6

    .line 290
    invoke-virtual {v3}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 291
    :cond_6
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 295
    :goto_5
    throw v0

    .line 292
    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_5

    .line 285
    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_4

    .line 282
    :catch_4
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    goto :goto_3

    :catch_5
    move-exception v1

    move-object v2, v0

    goto :goto_3
.end method

.method public static GzipOneFile(Ljava/io/File;Ljava/io/File;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 92
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    new-instance v1, Ljava/io/BufferedOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 94
    const v3, 0x8000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 93
    invoke-direct {v0, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 95
    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/ZipUtil;->a(Ljava/io/File;Ljava/util/zip/GZIPOutputStream;)V

    .line 96
    invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 98
    :cond_0
    return-void
.end method

.method public static ZipDir(Ljava/io/File;Ljava/io/File;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 55
    .line 59
    new-instance v1, Ljava/util/zip/ZipOutputStream;

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v0}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 60
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 64
    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-lt v0, v3, :cond_1

    .line 79
    :cond_0
    invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->close()V

    .line 80
    return-void

    .line 68
    :cond_1
    aget-object v3, v2, v0

    .line 69
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 70
    new-instance v5, Ljava/util/zip/ZipEntry;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 73
    :goto_1
    invoke-virtual {v4}, Ljava/io/InputStream;->read()I

    move-result v3

    const/4 v5, -0x1

    if-ne v3, v5, :cond_2

    .line 76
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 64
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 74
    :cond_2
    invoke-virtual {v1, v3}, Ljava/util/zip/ZipOutputStream;->write(I)V

    goto :goto_1
.end method

.method public static ZipDirGzip(Ljava/io/File;Ljava/io/File;II)Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, ".tmp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 115
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 120
    int-to-long v2, p2

    int-to-long v4, p3

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/qihoo360/common/utils/ZipUtil;->a(Ljava/io/File;Ljava/io/File;JJ)Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;

    move-result-object v0

    .line 122
    sget-object v2, Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;->SizeLimitZipResult_NotFound:Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;

    if-ne v0, v2, :cond_0

    .line 136
    :goto_0
    return-object v0

    .line 129
    :cond_0
    invoke-static {v1, p1}, Lcom/qihoo360/common/utils/ZipUtil;->GzipOneFile(Ljava/io/File;Ljava/io/File;)V

    .line 131
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0
.end method

.method private static a(Ljava/io/File;Ljava/io/File;JJ)Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 182
    sget-object v5, Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;->SizeLimitZipResult_OK:Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;

    .line 184
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 185
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v8

    .line 186
    array-length v2, v8

    if-lez v2, :cond_3

    const/4 v2, 0x1

    move v7, v2

    .line 187
    :goto_0
    if-eqz v7, :cond_a

    .line 191
    new-instance v9, Ljava/io/FileOutputStream;

    move-object/from16 v0, p1

    invoke-direct {v9, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 192
    new-instance v10, Ljava/util/zip/ZipOutputStream;

    invoke-direct {v10, v9}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 194
    const/4 v2, 0x0

    .line 195
    const-wide/16 v12, 0x0

    cmp-long v3, p4, v12

    if-gtz v3, :cond_4

    const-wide/16 v12, 0x0

    cmp-long v3, p2, v12

    if-gtz v3, :cond_4

    const/4 v3, 0x0

    move v6, v3

    .line 197
    :goto_1
    if-eqz v6, :cond_0

    .line 198
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    :cond_0
    const/4 v4, 0x0

    .line 204
    const/4 v3, 0x0

    move/from16 v16, v3

    move v3, v4

    move-object v4, v5

    move/from16 v5, v16

    :goto_2
    array-length v11, v8

    if-lt v5, v11, :cond_5

    .line 239
    if-eqz v6, :cond_2

    .line 240
    if-nez v3, :cond_1

    if-eqz v7, :cond_1

    .line 241
    new-instance v3, Ljava/util/zip/ZipEntry;

    const-string/jumbo v5, "common.txt"

    invoke-direct {v3, v5}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 242
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/util/zip/ZipOutputStream;->write([B)V

    .line 243
    invoke-virtual {v10}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 245
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/util/zip/ZipOutputStream;->setComment(Ljava/lang/String;)V

    .line 250
    :cond_2
    invoke-virtual {v10}, Ljava/util/zip/ZipOutputStream;->close()V

    .line 251
    invoke-virtual {v9}, Ljava/io/FileOutputStream;->close()V

    .line 260
    :goto_3
    return-object v4

    .line 186
    :cond_3
    const/4 v2, 0x0

    move v7, v2

    goto :goto_0

    .line 195
    :cond_4
    const/4 v3, 0x1

    move v6, v3

    goto :goto_1

    .line 205
    :cond_5
    aget-object v11, v8, v5

    .line 206
    new-instance v12, Ljava/io/FileInputStream;

    invoke-direct {v12, v11}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 207
    if-eqz v6, :cond_7

    .line 208
    invoke-virtual {v12}, Ljava/io/InputStream;->available()I

    move-result v13

    .line 209
    const-string/jumbo v14, "["

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string/jumbo v15, "/"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    array-length v15, v8

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string/jumbo v15, "]"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    const-string/jumbo v14, "("

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string/jumbo v15, ")"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    int-to-long v14, v13

    cmp-long v14, v14, p2

    if-lez v14, :cond_6

    .line 214
    const-string/jumbo v4, "[TOO BIG !!!]\n"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    sget-object v4, Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;->SizeLimitZipResult_TooBig:Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;

    .line 204
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    .line 218
    :cond_6
    add-int v14, v3, v13

    int-to-long v14, v14

    cmp-long v14, v14, p4

    if-gez v14, :cond_8

    .line 219
    add-int/2addr v3, v13

    .line 220
    const/16 v13, 0xa

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 229
    :cond_7
    new-instance v13, Ljava/util/zip/ZipEntry;

    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v13, v11}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v13}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 232
    const/16 v11, 0x400

    new-array v11, v11, [B

    .line 233
    :goto_5
    const/4 v13, 0x0

    const/16 v14, 0x400

    invoke-virtual {v12, v11, v13, v14}, Ljava/io/InputStream;->read([BII)I

    move-result v13

    const/4 v14, -0x1

    if-ne v13, v14, :cond_9

    .line 236
    invoke-virtual {v10}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 237
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V

    goto :goto_4

    .line 222
    :cond_8
    const-string/jumbo v4, "[Tatol BIG !!!]\n"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    sget-object v4, Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;->SizeLimitZipResult_TooBig:Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;

    goto :goto_4

    .line 234
    :cond_9
    const/4 v14, 0x0

    invoke-virtual {v10, v11, v14, v13}, Ljava/util/zip/ZipOutputStream;->write([BII)V

    goto :goto_5

    .line 253
    :cond_a
    sget-object v4, Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;->SizeLimitZipResult_NotFound:Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;

    goto/16 :goto_3

    .line 257
    :cond_b
    sget-object v4, Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;->SizeLimitZipResult_NotFound:Lcom/qihoo360/common/utils/ZipUtil$SizeLimitZipResult;

    goto/16 :goto_3
.end method

.method private static a(Ljava/io/File;Ljava/util/zip/GZIPOutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const v3, 0x8000

    .line 153
    new-array v0, v3, [B

    .line 154
    new-instance v1, Ljava/io/BufferedInputStream;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 157
    :goto_0
    invoke-virtual {v1, v0}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 160
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V

    .line 161
    invoke-virtual {p1}, Ljava/util/zip/GZIPOutputStream;->flush()V

    .line 162
    return-void

    .line 158
    :cond_0
    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3, v2}, Ljava/util/zip/GZIPOutputStream;->write([BII)V

    goto :goto_0
.end method

.method private static a(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V
    .locals 7

    .prologue
    .line 564
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 565
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 566
    if-eqz v1, :cond_0

    .line 567
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_1

    .line 597
    :cond_0
    :goto_1
    return-void

    .line 567
    :cond_1
    aget-object v3, v1, v0

    .line 568
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v3, v4}, Lcom/qihoo360/common/utils/ZipUtil;->a(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V

    .line 567
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 573
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 574
    const/4 v1, 0x0

    .line 576
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 577
    :try_start_1
    new-instance v1, Ljava/util/zip/ZipEntry;

    invoke-direct {v1, p2}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 578
    invoke-virtual {p0, v1}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 579
    invoke-static {v0, p0}, Lcom/qihoo360/common/utils/FileUtil;->copyStream(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 580
    invoke-virtual {p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 588
    if-eqz v0, :cond_0

    .line 590
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    .line 591
    :catch_0
    move-exception v0

    goto :goto_1

    .line 582
    :catch_1
    move-exception v0

    move-object v0, v1

    .line 588
    :goto_2
    if-eqz v0, :cond_0

    .line 590
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    .line 591
    :catch_2
    move-exception v0

    goto :goto_1

    .line 587
    :catchall_0
    move-exception v0

    .line 588
    :goto_3
    if-eqz v1, :cond_3

    .line 590
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 594
    :cond_3
    :goto_4
    throw v0

    .line 591
    :catch_3
    move-exception v1

    goto :goto_4

    .line 587
    :catchall_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_3

    .line 582
    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method public static createZipFile(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 530
    const/4 v1, 0x0

    .line 532
    :try_start_0
    new-instance v0, Ljava/util/zip/ZipOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v2}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 533
    :try_start_1
    invoke-static {v0, p1, p2}, Lcom/qihoo360/common/utils/ZipUtil;->a(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V

    .line 534
    invoke-virtual {v0}, Ljava/util/zip/ZipOutputStream;->finish()V

    .line 535
    invoke-virtual {v0}, Ljava/util/zip/ZipOutputStream;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 543
    if-eqz v0, :cond_0

    .line 545
    :try_start_2
    invoke-virtual {v0}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 536
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 550
    :goto_1
    return v0

    .line 537
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 543
    :goto_2
    if-eqz v0, :cond_1

    .line 545
    :try_start_3
    invoke-virtual {v0}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 550
    :cond_1
    :goto_3
    const/4 v0, 0x0

    goto :goto_1

    .line 542
    :catchall_0
    move-exception v0

    .line 543
    :goto_4
    if-eqz v1, :cond_2

    .line 545
    :try_start_4
    invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 549
    :cond_2
    :goto_5
    throw v0

    .line 546
    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v1

    goto :goto_5

    .line 542
    :catchall_1
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_4

    .line 537
    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method public static extract(Ljava/lang/String;Ljava/io/File;)Z
    .locals 1

    .prologue
    .line 409
    new-instance v0, Lcom/qihoo360/common/utils/ZipUtil$a;

    invoke-direct {v0}, Lcom/qihoo360/common/utils/ZipUtil$a;-><init>()V

    .line 410
    iput-object p1, v0, Lcom/qihoo360/common/utils/ZipUtil$a;->b:Ljava/io/File;

    .line 411
    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/ZipUtil;->traverseZipFile(Ljava/lang/String;Lcom/qihoo360/common/utils/ZipUtil$ZipTraversalCallback;)V

    .line 412
    iget-boolean v0, v0, Lcom/qihoo360/common/utils/ZipUtil$a;->a:Z

    return v0
.end method

.method public static extract(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Z
    .locals 1

    .prologue
    .line 361
    new-instance v0, Lcom/qihoo360/common/utils/ZipUtil$b;

    invoke-direct {v0}, Lcom/qihoo360/common/utils/ZipUtil$b;-><init>()V

    .line 362
    iput-object p1, v0, Lcom/qihoo360/common/utils/ZipUtil$b;->b:Ljava/lang/String;

    .line 363
    iput-object p2, v0, Lcom/qihoo360/common/utils/ZipUtil$b;->c:Ljava/io/File;

    .line 365
    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/ZipUtil;->traverseZipFile(Ljava/lang/String;Lcom/qihoo360/common/utils/ZipUtil$ZipTraversalCallback;)V

    .line 366
    iget-boolean v0, v0, Lcom/qihoo360/common/utils/ZipUtil$b;->a:Z

    return v0
.end method

.method public static traverseZipFile(Ljava/lang/String;Lcom/qihoo360/common/utils/ZipUtil$ZipTraversalCallback;)V
    .locals 4

    .prologue
    .line 497
    const/4 v0, 0x0

    .line 499
    :try_start_0
    new-instance v1, Ljava/util/zip/ZipFile;

    invoke-direct {v1, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 500
    :try_start_1
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v2

    .line 501
    :cond_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    if-nez v0, :cond_2

    .line 511
    :goto_0
    if-eqz v1, :cond_1

    .line 513
    :try_start_2
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 520
    :cond_1
    :goto_1
    return-void

    .line 502
    :cond_2
    :try_start_3
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/zip/ZipEntry;

    .line 503
    invoke-interface {p1, v1, v0}, Lcom/qihoo360/common/utils/ZipUtil$ZipTraversalCallback;->onProgress(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 506
    :catch_0
    move-exception v1

    .line 511
    :goto_2
    if-eqz v0, :cond_1

    .line 513
    :try_start_4
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 514
    :catch_1
    move-exception v0

    goto :goto_1

    .line 510
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    .line 511
    :goto_3
    if-eqz v1, :cond_3

    .line 513
    :try_start_5
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 519
    :cond_3
    :goto_4
    throw v0

    .line 514
    :catch_2
    move-exception v1

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_1

    .line 510
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 506
    :catch_4
    move-exception v0

    move-object v0, v1

    goto :goto_2
.end method

.method public static unGzipFile(Ljava/io/File;Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 307
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-static {v0, p1}, Lcom/qihoo360/common/utils/ZipUtil;->unGzipFile(Ljava/io/InputStream;Ljava/io/File;)V

    .line 308
    return-void
.end method

.method public static unGzipFile(Ljava/io/InputStream;Ljava/io/File;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 318
    .line 321
    :try_start_0
    new-instance v3, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v3, p0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 322
    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 324
    const/16 v0, 0x400

    :try_start_2
    new-array v0, v0, [B

    .line 326
    :goto_0
    invoke-virtual {v3, v0}, Ljava/util/zip/GZIPInputStream;->read([B)I

    move-result v2

    if-gtz v2, :cond_2

    .line 329
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 331
    if-eqz v3, :cond_0

    .line 333
    :try_start_3
    invoke-virtual {v3}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 338
    :cond_0
    :goto_1
    if-eqz v1, :cond_1

    .line 340
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 345
    :cond_1
    :goto_2
    return-void

    .line 327
    :cond_2
    const/4 v4, 0x0

    :try_start_5
    invoke-virtual {v1, v0, v4, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    .line 330
    :catchall_0
    move-exception v0

    move-object v2, v3

    .line 331
    :goto_3
    if-eqz v2, :cond_3

    .line 333
    :try_start_6
    invoke-virtual {v2}, Ljava/util/zip/GZIPInputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 338
    :cond_3
    :goto_4
    if-eqz v1, :cond_4

    .line 340
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 344
    :cond_4
    :goto_5
    throw v0

    .line 334
    :catch_0
    move-exception v2

    goto :goto_4

    .line 341
    :catch_1
    move-exception v1

    goto :goto_5

    .line 334
    :catch_2
    move-exception v0

    goto :goto_1

    .line 341
    :catch_3
    move-exception v0

    goto :goto_2

    .line 330
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    goto :goto_3
.end method
