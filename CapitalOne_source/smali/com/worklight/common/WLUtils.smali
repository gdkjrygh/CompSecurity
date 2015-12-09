.class public Lcom/worklight/common/WLUtils;
.super Ljava/lang/Object;
.source "WLUtils.java"


# static fields
.field public static final ANDROID_BUFFER_8K:I = 0x2000

.field public static final LOG_CAT:Ljava/lang/String; = "WLDroidGap"

.field public static final WL_CHALLENGE_DATA:Ljava/lang/String; = "WL-Challenge-Data"

.field public static final WL_CHALLENGE_RESPONSE_DATA:Ljava/lang/String; = "WL-Challenge-Response-Data"

.field public static final WL_INSTANCE_AUTH_ID:Ljava/lang/String; = "WL-Instance-Id"

.field public static final WL_PREFS:Ljava/lang/String; = "WLPrefs"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static byteArrayToHexString([B)Ljava/lang/String;
    .locals 9
    .param p0, "bytes"    # [B

    .prologue
    const/4 v4, 0x0

    .line 495
    new-instance v2, Ljava/lang/StringBuilder;

    array-length v3, p0

    mul-int/lit8 v3, v3, 0x2

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 497
    .local v2, "sb":Ljava/lang/StringBuilder;
    new-instance v1, Ljava/util/Formatter;

    invoke-direct {v1, v2}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;)V

    .line 498
    .local v1, "formatter":Ljava/util/Formatter;
    array-length v5, p0

    move v3, v4

    :goto_0
    if-lt v3, v5, :cond_0

    .line 502
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 498
    :cond_0
    aget-byte v0, p0, v3

    .line 499
    .local v0, "b":B
    const-string v6, "%02x"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v8

    aput-object v8, v7, v4

    invoke-virtual {v1, v6, v7}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 498
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public static checkIfMediaFile(Ljava/io/File;)Z
    .locals 9
    .param p0, "file"    # Ljava/io/File;

    .prologue
    .line 428
    const/4 v2, 0x0

    .line 429
    .local v2, "isMedia":Z
    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v6

    invoke-virtual {v6}, Lcom/worklight/common/WLConfig;->getMediaExtensions()[Ljava/lang/String;

    move-result-object v4

    .line 431
    .local v4, "mediaExtensions":[Ljava/lang/String;
    if-eqz v4, :cond_0

    .line 432
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 433
    .local v1, "filePath":Ljava/lang/String;
    const-string v6, "."

    invoke-virtual {v1, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v5

    .line 434
    .local v5, "mid":I
    add-int/lit8 v6, v5, 0x1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 436
    .local v0, "fileExtension":Ljava/lang/String;
    array-length v7, v4

    const/4 v6, 0x0

    :goto_0
    if-lt v6, v7, :cond_1

    .line 443
    .end local v0    # "fileExtension":Ljava/lang/String;
    .end local v1    # "filePath":Ljava/lang/String;
    .end local v5    # "mid":I
    :cond_0
    :goto_1
    return v2

    .line 436
    .restart local v0    # "fileExtension":Ljava/lang/String;
    .restart local v1    # "filePath":Ljava/lang/String;
    .restart local v5    # "mid":I
    :cond_1
    aget-object v3, v4, v6

    .line 437
    .local v3, "mediaExt":Ljava/lang/String;
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 438
    const/4 v2, 0x1

    .line 439
    goto :goto_1

    .line 436
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0
.end method

.method public static checksumTestOnResources(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 6
    .param p0, "path"    # Ljava/lang/String;
    .param p1, "ctx"    # Landroid/content/Context;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 348
    invoke-static {p0}, Lcom/worklight/common/WLUtils;->computeChecksumOnResources(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    .line 349
    .local v0, "currentChecksum":Ljava/lang/String;
    const-string v4, "SHA-1"

    invoke-static {v0, v4}, Lcom/worklight/utils/SecurityUtils;->hashData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 351
    const-string v4, "wlResourcesChecksum"

    invoke-static {p1, v4}, Lcom/worklight/common/WLUtils;->readWLPref(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 353
    .local v1, "lastChecksum":Ljava/lang/String;
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 354
    const-string v4, "Checksomes are different, current checksum is %s, last checksum was %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    .line 355
    aput-object v0, v5, v2

    aput-object v1, v5, v3

    .line 354
    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 356
    if-nez v1, :cond_1

    .line 357
    const-string v2, "save web resources checksum on device"

    invoke-static {v2}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 358
    const-string v2, "wlResourcesChecksum"

    invoke-static {p1, v2, v0}, Lcom/worklight/common/WLUtils;->writeWLPref(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    move v2, v3

    .line 365
    :goto_0
    return v2

    .line 360
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "web resource checksum is different: old:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " new:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static clearWLPref(Landroid/content/Context;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 311
    const-string v2, "WLPrefs"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 312
    .local v1, "prefs":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 313
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 314
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 315
    return-void
.end method

.method public static computeChecksumOnResources(Ljava/lang/String;)J
    .locals 9
    .param p0, "targetDir"    # Ljava/lang/String;

    .prologue
    .line 369
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 370
    .local v5, "targetFile":Ljava/io/File;
    invoke-static {v5}, Lcom/worklight/common/WLUtils;->getTree(Ljava/io/File;)Ljava/util/List;

    move-result-object v4

    .line 371
    .local v4, "files":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 372
    .local v1, "checksum":Ljava/util/zip/Checksum;
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_1

    .line 385
    invoke-interface {v1}, Ljava/util/zip/Checksum;->getValue()J

    move-result-wide v6

    return-wide v6

    .line 372
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    .line 373
    .local v3, "file":Ljava/io/File;
    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v7

    invoke-virtual {v7}, Lcom/worklight/common/WLConfig;->getMediaExtensions()[Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-static {v3}, Lcom/worklight/common/WLUtils;->checkIfMediaFile(Ljava/io/File;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 376
    :cond_2
    const/4 v0, 0x0

    check-cast v0, [B

    .line 378
    .local v0, "bytes":[B
    :try_start_0
    invoke-static {v3}, Lcom/worklight/common/WLUtils;->read(Ljava/io/File;)[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 382
    :goto_1
    const/4 v7, 0x0

    array-length v8, v0

    invoke-interface {v1, v0, v7, v8}, Ljava/util/zip/Checksum;->update([BII)V

    goto :goto_0

    .line 379
    :catch_0
    move-exception v2

    .line 380
    .local v2, "e":Ljava/io/IOException;
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Problem when trying to read resource "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public static convertJSONArrayToList(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 4
    .param p0, "jsonArray"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 469
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 470
    .local v2, "listToReturn":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v1, v3, :cond_0

    .line 477
    return-object v2

    .line 472
    :cond_0
    :try_start_0
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 470
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 473
    :catch_0
    move-exception v0

    .line 474
    .local v0, "e":Lorg/json/JSONException;
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
.end method

.method public static convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 7
    .param p0, "is"    # Ljava/io/InputStream;

    .prologue
    .line 232
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 233
    .local v2, "reader":Ljava/io/BufferedReader;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .local v3, "sb":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .line 237
    .local v1, "line":Ljava/lang/String;
    :goto_0
    :try_start_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    if-nez v1, :cond_0

    .line 244
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 249
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4

    .line 238
    :cond_0
    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 240
    :catch_0
    move-exception v0

    .line 241
    .local v0, "e":Ljava/io/IOException;
    :try_start_3
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error reding input stream ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ")."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 242
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v4

    .line 244
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 248
    throw v4

    .line 245
    :catch_1
    move-exception v0

    .line 246
    .restart local v0    # "e":Ljava/io/IOException;
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error closing input stream ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    .line 245
    .end local v0    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v0

    .line 246
    .restart local v0    # "e":Ljava/io/IOException;
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error closing input stream ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
.end method

.method public static convertStringToJSON(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 4
    .param p0, "jsonString"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 458
    const-string v2, "{"

    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const-string v3, "}"

    invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 459
    .local v1, "secureJSONString":Ljava/lang/String;
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 460
    .local v0, "jsonObject":Lorg/json/JSONObject;
    return-object v0
.end method

.method public static copyFile(Ljava/io/File;Ljava/io/File;)V
    .locals 7
    .param p0, "in"    # Ljava/io/File;
    .param p1, "out"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 160
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 161
    .local v2, "fis":Ljava/io/FileInputStream;
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_0

    .line 162
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 163
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 172
    :cond_0
    :goto_0
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 174
    .local v3, "fos":Ljava/io/FileOutputStream;
    const/16 v6, 0x2000

    :try_start_0
    new-array v0, v6, [B

    .line 175
    .local v0, "buf":[B
    const/4 v4, 0x0

    .line 176
    .local v4, "i":I
    :goto_1
    invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_3

    .line 182
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 183
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 185
    return-void

    .line 165
    .end local v0    # "buf":[B
    .end local v3    # "fos":Ljava/io/FileOutputStream;
    .end local v4    # "i":I
    :cond_1
    new-instance v5, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 166
    .local v5, "parentDir":Ljava/io/File;
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_2

    .line 167
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 169
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    goto :goto_0

    .line 177
    .end local v5    # "parentDir":Ljava/io/File;
    .restart local v0    # "buf":[B
    .restart local v3    # "fos":Ljava/io/FileOutputStream;
    .restart local v4    # "i":I
    :cond_3
    const/4 v6, 0x0

    :try_start_1
    invoke-virtual {v3, v0, v6, v4}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 179
    .end local v0    # "buf":[B
    .end local v4    # "i":I
    :catch_0
    move-exception v1

    .line 180
    .local v1, "e":Ljava/io/IOException;
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 181
    .end local v1    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v6

    .line 182
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 183
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 184
    throw v6
.end method

.method public static copyFile(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 3
    .param p0, "in"    # Ljava/io/InputStream;
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 195
    const/16 v2, 0x2000

    new-array v0, v2, [B

    .line 197
    .local v0, "buffer":[B
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    .local v1, "read":I
    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 200
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 201
    return-void

    .line 198
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0
.end method

.method public static debug(Ljava/lang/String;)V
    .locals 1
    .param p0, "msg"    # Ljava/lang/String;

    .prologue
    .line 271
    const-string v0, "WLDroidGap"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 272
    return-void
.end method

.method public static debug(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p0, "msg"    # Ljava/lang/String;
    .param p1, "throwable"    # Ljava/lang/Throwable;

    .prologue
    .line 287
    const-string v0, "WLDroidGap"

    invoke-static {v0, p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 288
    return-void
.end method

.method public static deleteDirectory(Ljava/io/File;)Z
    .locals 6
    .param p0, "directory"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 210
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 211
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 212
    .local v1, "files":[Ljava/io/File;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v3, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-lt v2, v3, :cond_1

    .line 223
    .end local v1    # "files":[Ljava/io/File;
    .end local v2    # "i":I
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v3

    return v3

    .line 213
    .restart local v1    # "files":[Ljava/io/File;
    .restart local v2    # "i":I
    :cond_1
    :try_start_1
    aget-object v3, v1, v2

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 214
    aget-object v3, v1, v2

    invoke-static {v3}, Lcom/worklight/common/WLUtils;->deleteDirectory(Ljava/io/File;)Z

    .line 212
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 216
    :cond_2
    aget-object v3, v1, v2

    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 220
    .end local v1    # "files":[Ljava/io/File;
    .end local v2    # "i":I
    :catch_0
    move-exception v0

    .line 221
    .local v0, "e":Ljava/lang/Exception;
    new-instance v3, Ljava/lang/Exception;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error occurred while trying to delete directory "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method public static error(Ljava/lang/String;)V
    .locals 1
    .param p0, "msg"    # Ljava/lang/String;

    .prologue
    .line 275
    const-string v0, "WLDroidGap"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 276
    return-void
.end method

.method public static error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p0, "msg"    # Ljava/lang/String;
    .param p1, "throwable"    # Ljava/lang/Throwable;

    .prologue
    .line 291
    const-string v0, "WLDroidGap"

    invoke-static {v0, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 292
    return-void
.end method

.method public static findDrawableAsset(Lcom/worklight/androidgap/WLDroidGap;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 8
    .param p0, "wlDroidGap"    # Lcom/worklight/androidgap/WLDroidGap;
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    .line 68
    const/4 v1, 0x0

    .line 69
    .local v1, "d":Landroid/graphics/drawable/Drawable;
    const/4 v3, 0x0

    .line 70
    .local v3, "in":Ljava/io/InputStream;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageWebRoot()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 73
    .local v0, "absolutePath":Ljava/lang/String;
    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .end local v3    # "in":Ljava/io/InputStream;
    .local v4, "in":Ljava/io/InputStream;
    :try_start_1
    invoke-static {v4, p1}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v1

    .line 79
    if-eqz v4, :cond_2

    .line 80
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    move-object v3, v4

    .line 86
    .end local v4    # "in":Ljava/io/InputStream;
    .restart local v3    # "in":Ljava/io/InputStream;
    :cond_0
    :goto_0
    return-object v1

    .line 75
    :catch_0
    move-exception v2

    .line 76
    .local v2, "e":Ljava/io/IOException;
    :goto_1
    :try_start_3
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Failed to load icon from path "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    if-eqz v3, :cond_0

    .line 80
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 82
    :catch_1
    move-exception v2

    .line 83
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error closing icon stream for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 77
    .end local v2    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v5

    .line 79
    :goto_2
    if-eqz v3, :cond_1

    .line 80
    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 85
    :cond_1
    :goto_3
    throw v5

    .line 82
    :catch_2
    move-exception v2

    .line 83
    .restart local v2    # "e":Ljava/io/IOException;
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Error closing icon stream for "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 82
    .end local v2    # "e":Ljava/io/IOException;
    .end local v3    # "in":Ljava/io/InputStream;
    .restart local v4    # "in":Ljava/io/InputStream;
    :catch_3
    move-exception v2

    .line 83
    .restart local v2    # "e":Ljava/io/IOException;
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error closing icon stream for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .end local v2    # "e":Ljava/io/IOException;
    :cond_2
    move-object v3, v4

    .end local v4    # "in":Ljava/io/InputStream;
    .restart local v3    # "in":Ljava/io/InputStream;
    goto :goto_0

    .line 77
    .end local v3    # "in":Ljava/io/InputStream;
    .restart local v4    # "in":Ljava/io/InputStream;
    :catchall_1
    move-exception v5

    move-object v3, v4

    .end local v4    # "in":Ljava/io/InputStream;
    .restart local v3    # "in":Ljava/io/InputStream;
    goto :goto_2

    .line 75
    .end local v3    # "in":Ljava/io/InputStream;
    .restart local v4    # "in":Ljava/io/InputStream;
    :catch_4
    move-exception v2

    move-object v3, v4

    .end local v4    # "in":Ljava/io/InputStream;
    .restart local v3    # "in":Ljava/io/InputStream;
    goto :goto_1
.end method

.method public static getFreeSpaceOnDevice()J
    .locals 9

    .prologue
    .line 145
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v6

    .line 146
    .local v6, "path":Ljava/io/File;
    new-instance v7, Landroid/os/StatFs;

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 147
    .local v7, "stat":Landroid/os/StatFs;
    invoke-virtual {v7}, Landroid/os/StatFs;->getBlockSize()I

    move-result v8

    int-to-long v4, v8

    .line 148
    .local v4, "blockSize":J
    invoke-virtual {v7}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v8

    int-to-long v0, v8

    .line 149
    .local v0, "availableBlocks":J
    mul-long v2, v4, v0

    .line 150
    .local v2, "availableStorageInBytes":J
    return-wide v2
.end method

.method public static getFullAppName(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 448
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "app_name"

    invoke-static {p0, v1, v2}, Lcom/worklight/common/WLUtils;->getResourceId(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getResourceId(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "resourceCategory"    # Ljava/lang/String;
    .param p2, "resourceName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/worklight/androidgap/NoSuchResourceException;
        }
    .end annotation

    .prologue
    .line 107
    const/4 v3, -0x1

    .line 110
    .local v3, "resourceId":I
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, ".R"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    move-result-object v0

    .line 111
    .local v0, "classes":[Ljava/lang/Class;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v4, v0

    if-lt v2, v4, :cond_0

    .line 120
    :goto_1
    return v3

    .line 112
    :cond_0
    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 113
    aget-object v4, v0, v2

    invoke-virtual {v4, p2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    .line 114
    goto :goto_1

    .line 111
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 117
    .end local v0    # "classes":[Ljava/lang/Class;
    .end local v2    # "i":I
    :catch_0
    move-exception v1

    .line 118
    .local v1, "e":Ljava/lang/Exception;
    new-instance v4, Lcom/worklight/androidgap/NoSuchResourceException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Failed to find resource R."

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v1}, Lcom/worklight/androidgap/NoSuchResourceException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v4
.end method

.method public static getResourceString(Ljava/lang/String;Landroid/app/Activity;)Ljava/lang/String;
    .locals 5
    .param p0, "recourceName"    # Ljava/lang/String;
    .param p1, "context"    # Landroid/app/Activity;

    .prologue
    .line 126
    const/4 v1, 0x0

    .line 129
    .local v1, "rStringClass":Ljava/lang/Class;
    if-nez v1, :cond_0

    .line 130
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ".R$string"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 132
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v1, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 136
    :goto_0
    return-object v2

    .line 133
    :catch_0
    move-exception v0

    .line 134
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 135
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 136
    const-string v2, ""

    goto :goto_0
.end method

.method public static getTree(Ljava/io/File;)Ljava/util/List;
    .locals 2
    .param p0, "rootDir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    .line 389
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 390
    .local v0, "files":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    invoke-static {p0, v0}, Lcom/worklight/common/WLUtils;->getTree(Ljava/io/File;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method private static getTree(Ljava/io/File;Ljava/util/List;)Ljava/util/List;
    .locals 5
    .param p0, "rootDir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    .line 394
    .local p1, "files":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 395
    .local v1, "filesToIterate":[Ljava/io/File;
    array-length v3, v1

    const/4 v2, 0x0

    :goto_0
    if-lt v2, v3, :cond_0

    .line 403
    return-object p1

    .line 395
    :cond_0
    aget-object v0, v1, v2

    .line 396
    .local v0, "file":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 397
    invoke-static {v0, p1}, Lcom/worklight/common/WLUtils;->getTree(Ljava/io/File;Ljava/util/List;)Ljava/util/List;

    .line 395
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 399
    :cond_1
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public static hexStringToByteArray(Ljava/lang/String;)[B
    .locals 7
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    const/16 v6, 0x10

    .line 485
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 486
    .local v2, "len":I
    div-int/lit8 v3, v2, 0x2

    new-array v0, v3, [B

    .line 487
    .local v0, "data":[B
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-lt v1, v2, :cond_0

    .line 491
    return-object v0

    .line 488
    :cond_0
    div-int/lit8 v3, v1, 0x2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    .line 489
    add-int/lit8 v5, v1, 0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    add-int/2addr v4, v5

    int-to-byte v4, v4

    .line 488
    aput-byte v4, v0, v3

    .line 487
    add-int/lit8 v1, v1, 0x2

    goto :goto_0
.end method

.method public static info(Ljava/lang/String;)V
    .locals 1
    .param p0, "msg"    # Ljava/lang/String;

    .prologue
    .line 283
    const-string v0, "WLDroidGap"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 284
    return-void
.end method

.method public static isStringEmpty(Ljava/lang/String;)Z
    .locals 1
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 481
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static log(Ljava/lang/String;I)V
    .locals 1
    .param p0, "msg"    # Ljava/lang/String;
    .param p1, "logLevel"    # I

    .prologue
    .line 295
    const-string v0, "WLDroidGap"

    invoke-static {p1, v0, p0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 296
    return-void
.end method

.method public static read(Ljava/io/File;)[B
    .locals 6
    .param p0, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 408
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v4

    long-to-int v3, v4

    new-array v0, v3, [B

    .line 409
    .local v0, "buffer":[B
    const/4 v1, 0x0

    .line 411
    .local v1, "ios":Ljava/io/InputStream;
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 412
    .end local v1    # "ios":Ljava/io/InputStream;
    .local v2, "ios":Ljava/io/InputStream;
    :try_start_1
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 413
    new-instance v3, Ljava/io/IOException;

    const-string v4, "EOF reached while trying to read the whole file"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 415
    :catchall_0
    move-exception v3

    move-object v1, v2

    .line 417
    .end local v2    # "ios":Ljava/io/InputStream;
    .restart local v1    # "ios":Ljava/io/InputStream;
    :goto_0
    if-eqz v1, :cond_0

    .line 418
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 422
    :cond_0
    :goto_1
    throw v3

    .line 417
    .end local v1    # "ios":Ljava/io/InputStream;
    .restart local v2    # "ios":Ljava/io/InputStream;
    :cond_1
    if-eqz v2, :cond_2

    .line 418
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 424
    :cond_2
    :goto_2
    return-object v0

    .line 419
    .end local v2    # "ios":Ljava/io/InputStream;
    .restart local v1    # "ios":Ljava/io/InputStream;
    :catch_0
    move-exception v4

    goto :goto_1

    .end local v1    # "ios":Ljava/io/InputStream;
    .restart local v2    # "ios":Ljava/io/InputStream;
    :catch_1
    move-exception v3

    goto :goto_2

    .line 415
    .end local v2    # "ios":Ljava/io/InputStream;
    .restart local v1    # "ios":Ljava/io/InputStream;
    :catchall_1
    move-exception v3

    goto :goto_0
.end method

.method public static readWLPref(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "prefName"    # Ljava/lang/String;

    .prologue
    .line 306
    const-string v1, "WLPrefs"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 307
    .local v0, "prefs":Landroid/content/SharedPreferences;
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static scaleImage(Landroid/graphics/drawable/Drawable;FF)Landroid/graphics/drawable/Drawable;
    .locals 9
    .param p0, "drawable"    # Landroid/graphics/drawable/Drawable;
    .param p1, "scaleWidth"    # F
    .param p2, "scaleHeight"    # F

    .prologue
    const/4 v1, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    .local v8, "resizedDrawable":Landroid/graphics/drawable/Drawable;
    if-eqz p0, :cond_0

    .line 92
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .end local p0    # "drawable":Landroid/graphics/drawable/Drawable;
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 93
    .local v0, "bitmapOrg":Landroid/graphics/Bitmap;
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 94
    .local v3, "width":I
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 96
    .local v4, "height":I
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 98
    .local v5, "matrix":Landroid/graphics/Matrix;
    invoke-virtual {v5, p1, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 99
    const/4 v6, 0x1

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 101
    .local v7, "resizedBitmap":Landroid/graphics/Bitmap;
    new-instance v8, Landroid/graphics/drawable/BitmapDrawable;

    .end local v8    # "resizedDrawable":Landroid/graphics/drawable/Drawable;
    invoke-direct {v8, v7}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 103
    .end local v0    # "bitmapOrg":Landroid/graphics/Bitmap;
    .end local v3    # "width":I
    .end local v4    # "height":I
    .end local v5    # "matrix":Landroid/graphics/Matrix;
    .end local v7    # "resizedBitmap":Landroid/graphics/Bitmap;
    .restart local v8    # "resizedDrawable":Landroid/graphics/drawable/Drawable;
    :cond_0
    return-object v8
.end method

.method public static showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "buttonText"    # Ljava/lang/String;

    .prologue
    .line 253
    new-instance v0, Lcom/worklight/common/WLUtils$1;

    invoke-direct {v0}, Lcom/worklight/common/WLUtils$1;-><init>()V

    invoke-static {p0, p1, p2, p3, v0}, Lcom/worklight/common/WLUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 258
    return-void
.end method

.method public static showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "buttonText"    # Ljava/lang/String;
    .param p4, "buttonClickListener"    # Landroid/content/DialogInterface$OnClickListener;

    .prologue
    .line 261
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 262
    .local v0, "dlg":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 263
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 264
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 265
    invoke-virtual {v0, p3, p4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 266
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 267
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 268
    return-void
.end method

.method public static unpack(Ljava/io/InputStream;Ljava/io/File;)V
    .locals 8
    .param p0, "in"    # Ljava/io/InputStream;
    .param p1, "targetDir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 318
    new-instance v5, Ljava/util/zip/ZipInputStream;

    invoke-direct {v5, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 321
    .local v5, "zin":Ljava/util/zip/ZipInputStream;
    :cond_0
    :goto_0
    invoke-virtual {v5}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v0

    .local v0, "entry":Ljava/util/zip/ZipEntry;
    if-nez v0, :cond_1

    .line 345
    return-void

    .line 322
    :cond_1
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v2

    .line 323
    .local v2, "extractFilePath":Ljava/lang/String;
    const-string v6, "/"

    invoke-virtual {v2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "\\"

    invoke-virtual {v2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 324
    :cond_2
    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 326
    :cond_3
    new-instance v1, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 327
    .local v1, "extractFile":Ljava/io/File;
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 328
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_0

    .line 329
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    .line 333
    :cond_4
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    .line 334
    .local v4, "parent":Ljava/io/File;
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_5

    .line 335
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 340
    :cond_5
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 341
    .local v3, "os":Ljava/io/FileOutputStream;
    invoke-static {v5, v3}, Lcom/worklight/common/WLUtils;->copyFile(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 342
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V

    .line 343
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    goto :goto_0
.end method

.method public static warning(Ljava/lang/String;)V
    .locals 1
    .param p0, "msg"    # Ljava/lang/String;

    .prologue
    .line 279
    const-string v0, "WLDroidGap"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    return-void
.end method

.method public static writeWLPref(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "prefName"    # Ljava/lang/String;
    .param p2, "PrefValue"    # Ljava/lang/String;

    .prologue
    .line 299
    const-string v2, "WLPrefs"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 300
    .local v1, "prefs":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 301
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 302
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 303
    return-void
.end method
