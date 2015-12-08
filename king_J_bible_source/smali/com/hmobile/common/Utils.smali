.class public Lcom/hmobile/common/Utils;
.super Ljava/lang/Object;
.source "Utils.java"


# static fields
.field private static volatile _instance:Lcom/hmobile/common/Utils;


# instance fields
.field private m_density:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    sput-object v0, Lcom/hmobile/common/Utils;->_instance:Lcom/hmobile/common/Utils;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lcom/hmobile/common/Utils;->m_density:F

    .line 41
    return-void
.end method

.method public static ConvertToBoolean(Ljava/lang/String;Z)Z
    .locals 3
    .param p0, "val"    # Ljava/lang/String;
    .param p1, "defaultval"    # Z

    .prologue
    .line 187
    move v1, p1

    .line 189
    .local v1, "flag":Z
    :try_start_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 193
    :goto_0
    return v1

    .line 190
    :catch_0
    move-exception v0

    .line 191
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static ConvertToDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 5
    .param p0, "val"    # Ljava/lang/String;

    .prologue
    .line 219
    const/4 v2, 0x0

    .line 221
    .local v2, "retval":Ljava/util/Date;
    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_1

    :cond_0
    move-object v3, v2

    .line 231
    .end local v2    # "retval":Ljava/util/Date;
    .local v3, "retval":Ljava/util/Date;
    :goto_0
    return-object v3

    .line 224
    .end local v3    # "retval":Ljava/util/Date;
    .restart local v2    # "retval":Ljava/util/Date;
    :cond_1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 225
    const-string v4, "yyyy/MM/dd hh:mm a"

    .line 224
    invoke-direct {v0, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 226
    .local v0, "dateformat":Ljava/text/SimpleDateFormat;
    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .end local v0    # "dateformat":Ljava/text/SimpleDateFormat;
    :goto_1
    move-object v3, v2

    .line 231
    .end local v2    # "retval":Ljava/util/Date;
    .restart local v3    # "retval":Ljava/util/Date;
    goto :goto_0

    .line 227
    .end local v3    # "retval":Ljava/util/Date;
    .restart local v2    # "retval":Ljava/util/Date;
    :catch_0
    move-exception v1

    .line 228
    .local v1, "e":Ljava/lang/Exception;
    invoke-static {v1}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_1
.end method

.method public static ConvertToDate(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;
    .locals 5
    .param p0, "val"    # Ljava/lang/String;
    .param p1, "format"    # Ljava/lang/String;

    .prologue
    .line 235
    const/4 v2, 0x0

    .line 237
    .local v2, "retval":Ljava/util/Date;
    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_1

    :cond_0
    move-object v3, v2

    .line 246
    .end local v2    # "retval":Ljava/util/Date;
    .local v3, "retval":Ljava/util/Date;
    :goto_0
    return-object v3

    .line 240
    .end local v3    # "retval":Ljava/util/Date;
    .restart local v2    # "retval":Ljava/util/Date;
    :cond_1
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 241
    .local v0, "dateformat":Ljava/text/SimpleDateFormat;
    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .end local v0    # "dateformat":Ljava/text/SimpleDateFormat;
    :goto_1
    move-object v3, v2

    .line 246
    .end local v2    # "retval":Ljava/util/Date;
    .restart local v3    # "retval":Ljava/util/Date;
    goto :goto_0

    .line 242
    .end local v3    # "retval":Ljava/util/Date;
    .restart local v2    # "retval":Ljava/util/Date;
    :catch_0
    move-exception v1

    .line 243
    .local v1, "e":Ljava/lang/Exception;
    invoke-static {v1}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_1
.end method

.method public static ConvertToDateComarator(Ljava/lang/String;)Ljava/util/Date;
    .locals 5
    .param p0, "val"    # Ljava/lang/String;

    .prologue
    .line 250
    const/4 v2, 0x0

    .line 252
    .local v2, "retval":Ljava/util/Date;
    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_1

    :cond_0
    move-object v3, v2

    .line 261
    .end local v2    # "retval":Ljava/util/Date;
    .local v3, "retval":Ljava/util/Date;
    :goto_0
    return-object v3

    .line 255
    .end local v3    # "retval":Ljava/util/Date;
    .restart local v2    # "retval":Ljava/util/Date;
    :cond_1
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy/MM/dd"

    invoke-direct {v0, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 256
    .local v0, "dateformat":Ljava/text/SimpleDateFormat;
    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .end local v0    # "dateformat":Ljava/text/SimpleDateFormat;
    :goto_1
    move-object v3, v2

    .line 261
    .end local v2    # "retval":Ljava/util/Date;
    .restart local v3    # "retval":Ljava/util/Date;
    goto :goto_0

    .line 257
    .end local v3    # "retval":Ljava/util/Date;
    .restart local v2    # "retval":Ljava/util/Date;
    :catch_0
    move-exception v1

    .line 258
    .local v1, "e":Ljava/lang/Exception;
    invoke-static {v1}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_1
.end method

.method public static ConvertToDouble(Ljava/lang/String;)D
    .locals 3
    .param p0, "val"    # Ljava/lang/String;

    .prologue
    .line 167
    const-wide/16 v0, 0x0

    .line 169
    .local v0, "d":D
    :try_start_0
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 173
    :goto_0
    return-wide v0

    .line 170
    :catch_0
    move-exception v2

    .line 171
    .local v2, "e":Ljava/lang/Exception;
    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static ConvertToFloat(Ljava/lang/String;)F
    .locals 2
    .param p0, "val"    # Ljava/lang/String;

    .prologue
    .line 203
    const/4 v1, 0x0

    .line 205
    .local v1, "intval":F
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 209
    :goto_0
    return v1

    .line 206
    :catch_0
    move-exception v0

    .line 207
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static ConvertToInt(Ljava/lang/String;)I
    .locals 2
    .param p0, "val"    # Ljava/lang/String;

    .prologue
    .line 157
    const/4 v1, 0x0

    .line 159
    .local v1, "intval":I
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 163
    :goto_0
    return v1

    .line 160
    :catch_0
    move-exception v0

    .line 161
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static ConvertToLong(Ljava/lang/String;)J
    .locals 3
    .param p0, "val"    # Ljava/lang/String;

    .prologue
    .line 177
    const-wide/16 v0, 0x0

    .line 179
    .local v0, "d":J
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 183
    :goto_0
    return-wide v0

    .line 180
    :catch_0
    move-exception v2

    .line 181
    .local v2, "e":Ljava/lang/Exception;
    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public static Instance()Lcom/hmobile/common/Utils;
    .locals 2

    .prologue
    .line 50
    sget-object v0, Lcom/hmobile/common/Utils;->_instance:Lcom/hmobile/common/Utils;

    if-nez v0, :cond_0

    .line 51
    const-class v1, Lcom/hmobile/common/Utils;

    monitor-enter v1

    .line 52
    :try_start_0
    new-instance v0, Lcom/hmobile/common/Utils;

    invoke-direct {v0}, Lcom/hmobile/common/Utils;-><init>()V

    sput-object v0, Lcom/hmobile/common/Utils;->_instance:Lcom/hmobile/common/Utils;

    .line 51
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :cond_0
    sget-object v0, Lcom/hmobile/common/Utils;->_instance:Lcom/hmobile/common/Utils;

    return-object v0

    .line 51
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static LogException(Ljava/lang/Exception;)V
    .locals 3
    .param p0, "ex"    # Ljava/lang/Exception;

    .prologue
    .line 105
    const-string v0, "HOLYBIBLE Exception"

    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HOLYBIBLE Exception -- > "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 105
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    return-void
.end method

.method public static LogInfo(Ljava/lang/String;)V
    .locals 3
    .param p0, "message"    # Ljava/lang/String;

    .prologue
    .line 116
    const-string v0, "HOLYBIBLE"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HOLYBIBLE -- >"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    return-void
.end method

.method public static ParseBoolean(Ljava/lang/String;)Z
    .locals 3
    .param p0, "val"    # Ljava/lang/String;

    .prologue
    .line 127
    :try_start_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 130
    :goto_0
    return v0

    .line 129
    :catch_0
    move-exception v1

    .line 130
    .local v1, "e":Ljava/lang/Exception;
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static ReadFromfile(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 13
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .local v0, "ReturnString":Ljava/lang/StringBuilder;
    const/4 v3, 0x0

    .line 276
    .local v3, "fIn":Ljava/io/InputStream;
    const/4 v6, 0x0

    .line 277
    .local v6, "isr":Ljava/io/InputStreamReader;
    const/4 v4, 0x0

    .line 278
    .local v4, "input":Ljava/io/BufferedReader;
    const/4 v8, 0x0

    .line 280
    .local v8, "length":I
    :try_start_0
    new-instance v10, Ljava/io/File;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    .line 281
    const-string v12, "/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 280
    invoke-direct {v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 282
    .local v10, "newFile":Ljava/io/File;
    invoke-virtual {v10}, Ljava/io/File;->createNewFile()Z

    .line 283
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v11

    .line 284
    const/4 v12, 0x1

    invoke-virtual {v11, p0, v12}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;

    move-result-object v3

    .line 285
    new-instance v7, Ljava/io/InputStreamReader;

    invoke-direct {v7, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    .end local v6    # "isr":Ljava/io/InputStreamReader;
    .local v7, "isr":Ljava/io/InputStreamReader;
    :try_start_1
    new-instance v5, Ljava/io/BufferedReader;

    invoke-direct {v5, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 296
    .end local v4    # "input":Ljava/io/BufferedReader;
    .local v5, "input":Ljava/io/BufferedReader;
    :try_start_2
    const-string v9, ""

    .line 297
    .local v9, "line":Ljava/lang/String;
    :goto_0
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v9

    if-nez v9, :cond_3

    .line 304
    if-eqz v7, :cond_0

    .line 305
    :try_start_3
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V

    .line 306
    :cond_0
    if-eqz v3, :cond_1

    .line 307
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 308
    :cond_1
    if-eqz v5, :cond_9

    .line 309
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-object v4, v5

    .end local v5    # "input":Ljava/io/BufferedReader;
    .restart local v4    # "input":Ljava/io/BufferedReader;
    move-object v6, v7

    .line 315
    .end local v7    # "isr":Ljava/io/InputStreamReader;
    .end local v9    # "line":Ljava/lang/String;
    .end local v10    # "newFile":Ljava/io/File;
    .restart local v6    # "isr":Ljava/io/InputStreamReader;
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    return-object v11

    .line 298
    .end local v4    # "input":Ljava/io/BufferedReader;
    .end local v6    # "isr":Ljava/io/InputStreamReader;
    .restart local v5    # "input":Ljava/io/BufferedReader;
    .restart local v7    # "isr":Ljava/io/InputStreamReader;
    .restart local v9    # "line":Ljava/lang/String;
    .restart local v10    # "newFile":Ljava/io/File;
    :cond_3
    :try_start_4
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    .line 300
    .end local v9    # "line":Ljava/lang/String;
    :catch_0
    move-exception v1

    move-object v4, v5

    .end local v5    # "input":Ljava/io/BufferedReader;
    .restart local v4    # "input":Ljava/io/BufferedReader;
    move-object v6, v7

    .line 301
    .end local v7    # "isr":Ljava/io/InputStreamReader;
    .end local v10    # "newFile":Ljava/io/File;
    .local v1, "e":Ljava/lang/Exception;
    .restart local v6    # "isr":Ljava/io/InputStreamReader;
    :goto_2
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 304
    if-eqz v6, :cond_4

    .line 305
    :try_start_6
    invoke-virtual {v6}, Ljava/io/InputStreamReader;->close()V

    .line 306
    :cond_4
    if-eqz v3, :cond_5

    .line 307
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 308
    :cond_5
    if-eqz v4, :cond_2

    .line 309
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_1

    .line 311
    :catch_1
    move-exception v2

    .line 312
    .local v2, "e2":Ljava/lang/Exception;
    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    goto :goto_1

    .line 302
    .end local v1    # "e":Ljava/lang/Exception;
    .end local v2    # "e2":Ljava/lang/Exception;
    :catchall_0
    move-exception v11

    .line 304
    :goto_3
    if-eqz v6, :cond_6

    .line 305
    :try_start_7
    invoke-virtual {v6}, Ljava/io/InputStreamReader;->close()V

    .line 306
    :cond_6
    if-eqz v3, :cond_7

    .line 307
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 308
    :cond_7
    if-eqz v4, :cond_8

    .line 309
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 314
    :cond_8
    :goto_4
    throw v11

    .line 311
    :catch_2
    move-exception v2

    .line 312
    .restart local v2    # "e2":Ljava/lang/Exception;
    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    goto :goto_4

    .line 311
    .end local v2    # "e2":Ljava/lang/Exception;
    .end local v4    # "input":Ljava/io/BufferedReader;
    .end local v6    # "isr":Ljava/io/InputStreamReader;
    .restart local v5    # "input":Ljava/io/BufferedReader;
    .restart local v7    # "isr":Ljava/io/InputStreamReader;
    .restart local v9    # "line":Ljava/lang/String;
    .restart local v10    # "newFile":Ljava/io/File;
    :catch_3
    move-exception v2

    .line 312
    .restart local v2    # "e2":Ljava/lang/Exception;
    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    .end local v2    # "e2":Ljava/lang/Exception;
    :cond_9
    move-object v4, v5

    .end local v5    # "input":Ljava/io/BufferedReader;
    .restart local v4    # "input":Ljava/io/BufferedReader;
    move-object v6, v7

    .end local v7    # "isr":Ljava/io/InputStreamReader;
    .restart local v6    # "isr":Ljava/io/InputStreamReader;
    goto :goto_1

    .line 302
    .end local v6    # "isr":Ljava/io/InputStreamReader;
    .end local v9    # "line":Ljava/lang/String;
    .restart local v7    # "isr":Ljava/io/InputStreamReader;
    :catchall_1
    move-exception v11

    move-object v6, v7

    .end local v7    # "isr":Ljava/io/InputStreamReader;
    .restart local v6    # "isr":Ljava/io/InputStreamReader;
    goto :goto_3

    .end local v4    # "input":Ljava/io/BufferedReader;
    .end local v6    # "isr":Ljava/io/InputStreamReader;
    .restart local v5    # "input":Ljava/io/BufferedReader;
    .restart local v7    # "isr":Ljava/io/InputStreamReader;
    :catchall_2
    move-exception v11

    move-object v4, v5

    .end local v5    # "input":Ljava/io/BufferedReader;
    .restart local v4    # "input":Ljava/io/BufferedReader;
    move-object v6, v7

    .end local v7    # "isr":Ljava/io/InputStreamReader;
    .restart local v6    # "isr":Ljava/io/InputStreamReader;
    goto :goto_3

    .line 300
    .end local v10    # "newFile":Ljava/io/File;
    :catch_4
    move-exception v1

    goto :goto_2

    .end local v6    # "isr":Ljava/io/InputStreamReader;
    .restart local v7    # "isr":Ljava/io/InputStreamReader;
    .restart local v10    # "newFile":Ljava/io/File;
    :catch_5
    move-exception v1

    move-object v6, v7

    .end local v7    # "isr":Ljava/io/InputStreamReader;
    .restart local v6    # "isr":Ljava/io/InputStreamReader;
    goto :goto_2
.end method

.method public static RenameFileToNewPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "oldpath"    # Ljava/lang/String;

    .prologue
    .line 380
    move-object v2, p0

    .line 381
    .local v2, "path":Ljava/lang/String;
    const-string v5, "/mnt/sdcard/"

    const-string v6, ""

    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 382
    const-string v5, ".ck"

    const-string v6, ""

    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 383
    .local v1, "new_path":Ljava/lang/String;
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    .line 384
    .local v3, "sdcard":Ljava/io/File;
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 385
    .local v0, "from":Ljava/io/File;
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 386
    .local v4, "to":Ljava/io/File;
    invoke-virtual {v0, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 387
    invoke-virtual {v4}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5
.end method

.method public static RenameFileToOldPath(Ljava/lang/String;)V
    .locals 7
    .param p0, "newpath"    # Ljava/lang/String;

    .prologue
    .line 391
    move-object v2, p0

    .line 392
    .local v2, "path":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, ".ck"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 393
    .local v1, "old":Ljava/lang/String;
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    .line 394
    .local v3, "sdcard":Ljava/io/File;
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 395
    .local v0, "from":Ljava/io/File;
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 396
    .local v4, "to":Ljava/io/File;
    invoke-virtual {v0, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 397
    return-void
.end method

.method public static adjustTimezoneOffset(J)J
    .locals 6
    .param p0, "utcMillies"    # J

    .prologue
    .line 350
    const-string v3, "CET"

    invoke-static {v3}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    .line 351
    .local v2, "tz":Ljava/util/TimeZone;
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v3

    int-to-long v0, v3

    .line 352
    .local v0, "offset":J
    add-long v4, p0, v0

    return-wide v4
.end method

.method public static convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6
    .param p0, "is"    # Ljava/io/InputStream;

    .prologue
    .line 320
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 321
    .local v2, "reader":Ljava/io/BufferedReader;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 323
    .local v3, "sb":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .line 325
    .local v1, "line":Ljava/lang/String;
    :goto_0
    :try_start_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    if-nez v1, :cond_0

    .line 332
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 337
    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4

    .line 326
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

    .line 328
    :catch_0
    move-exception v0

    .line 329
    .local v0, "e":Ljava/io/IOException;
    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 332
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 333
    :catch_1
    move-exception v0

    .line 334
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 330
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v4

    .line 332
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 336
    :goto_2
    throw v4

    .line 333
    :catch_2
    move-exception v0

    .line 334
    .restart local v0    # "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 333
    .end local v0    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v0

    .line 334
    .restart local v0    # "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method

.method public static downloadDrawableImage(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 12
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    const/4 v8, 0x0

    .line 415
    const-string v9, "Android"

    invoke-static {v9}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v1

    .line 416
    .local v1, "client":Landroid/net/http/AndroidHttpClient;
    new-instance v4, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v4, p0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 419
    .local v4, "getRequest":Lorg/apache/http/client/methods/HttpGet;
    :try_start_0
    invoke-virtual {v1, v4}, Landroid/net/http/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    .line 420
    .local v6, "response":Lorg/apache/http/HttpResponse;
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v9

    invoke-interface {v9}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v7

    .line 421
    .local v7, "statusCode":I
    const/16 v9, 0xc8

    if-eq v7, v9, :cond_2

    .line 422
    const-string v9, "HISTORY MAP "

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "HISTORY : Error "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 423
    const-string v11, " while retrieving bitmap from "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 422
    invoke-static {v9, v10}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 450
    if-eqz v1, :cond_0

    .line 451
    invoke-virtual {v1}, Landroid/net/http/AndroidHttpClient;->close()V

    :cond_0
    move-object v0, v8

    .line 454
    .end local v6    # "response":Lorg/apache/http/HttpResponse;
    .end local v7    # "statusCode":I
    :cond_1
    :goto_0
    return-object v0

    .line 427
    .restart local v6    # "response":Lorg/apache/http/HttpResponse;
    .restart local v7    # "statusCode":I
    :cond_2
    :try_start_1
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v3

    .line 428
    .local v3, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v3, :cond_7

    .line 429
    const/4 v5, 0x0

    .line 431
    .local v5, "inputStream":Ljava/io/InputStream;
    :try_start_2
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v5

    .line 433
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 439
    .local v0, "bitmap":Landroid/graphics/Bitmap;
    if-eqz v5, :cond_3

    .line 440
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 442
    :cond_3
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 450
    if-eqz v1, :cond_1

    .line 451
    invoke-virtual {v1}, Landroid/net/http/AndroidHttpClient;->close()V

    goto :goto_0

    .line 438
    .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    :catchall_0
    move-exception v9

    .line 439
    if-eqz v5, :cond_4

    .line 440
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 442
    :cond_4
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->consumeContent()V

    .line 443
    throw v9
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 445
    .end local v3    # "entity":Lorg/apache/http/HttpEntity;
    .end local v5    # "inputStream":Ljava/io/InputStream;
    .end local v6    # "response":Lorg/apache/http/HttpResponse;
    .end local v7    # "statusCode":I
    :catch_0
    move-exception v2

    .line 446
    .local v2, "e":Ljava/lang/Exception;
    :try_start_5
    invoke-virtual {v4}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 447
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 448
    const-string v9, "HISTORY MAP"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Error while retrieving bitmap from "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 450
    if-eqz v1, :cond_5

    .line 451
    invoke-virtual {v1}, Landroid/net/http/AndroidHttpClient;->close()V

    .end local v2    # "e":Ljava/lang/Exception;
    :cond_5
    :goto_1
    move-object v0, v8

    .line 454
    goto :goto_0

    .line 449
    :catchall_1
    move-exception v8

    .line 450
    if-eqz v1, :cond_6

    .line 451
    invoke-virtual {v1}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 453
    :cond_6
    throw v8

    .line 450
    .restart local v3    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v6    # "response":Lorg/apache/http/HttpResponse;
    .restart local v7    # "statusCode":I
    :cond_7
    if-eqz v1, :cond_5

    .line 451
    invoke-virtual {v1}, Landroid/net/http/AndroidHttpClient;->close()V

    goto :goto_1
.end method

.method public static formatMin(I)Ljava/lang/String;
    .locals 3
    .param p0, "minutes"    # I

    .prologue
    .line 487
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "00"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 488
    .local v0, "newtime":Ljava/lang/String;
    return-object v0
.end method

.method public static getIMEINO(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 492
    .line 493
    const-string v2, "phone"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 492
    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 494
    .local v1, "tManager":Landroid/telephony/TelephonyManager;
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    .line 495
    .local v0, "imeiid":Ljava/lang/String;
    return-object v0
.end method

.method public static getRandomInt(I)I
    .locals 4
    .param p0, "max"    # I

    .prologue
    .line 477
    const/4 v1, 0x1

    .line 478
    .local v1, "min":I
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 479
    .local v2, "r":Ljava/util/Random;
    sub-int v3, p0, v1

    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    add-int v0, v3, v1

    .line 480
    .local v0, "i":I
    return v0
.end method

.method public static getUTCForCSharp(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "javaUtc"    # Ljava/lang/String;

    .prologue
    .line 343
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/hmobile/common/Utils;->adjustTimezoneOffset(J)J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    mul-long/2addr v0, v2

    const-wide v2, 0x89f7ff5f7b58000L

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 346
    :goto_0
    return-object v0

    .line 344
    :catch_0
    move-exception v0

    .line 346
    const-string v0, ""

    goto :goto_0
.end method

.method public static setListViewHeightBasedOnChildren(Landroid/widget/ListView;)V
    .locals 8
    .param p0, "listView"    # Landroid/widget/ListView;

    .prologue
    const/4 v7, 0x0

    const/4 v6, -0x2

    .line 356
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    .line 357
    .local v1, "listAdapter":Landroid/widget/ListAdapter;
    if-nez v1, :cond_0

    .line 377
    :goto_0
    return-void

    .line 362
    :cond_0
    const/4 v4, 0x0

    .line 363
    .local v4, "totalHeight":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v5

    if-lt v0, v5, :cond_1

    .line 372
    invoke-virtual {p0}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 374
    .local v3, "params":Landroid/view/ViewGroup$LayoutParams;
    invoke-virtual {p0}, Landroid/widget/ListView;->getDividerHeight()I

    move-result v5

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    mul-int/2addr v5, v6

    add-int/2addr v5, v4

    .line 375
    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    mul-int/lit8 v6, v6, 0x14

    add-int/2addr v5, v6

    .line 373
    iput v5, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 376
    invoke-virtual {p0, v3}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 364
    .end local v3    # "params":Landroid/view/ViewGroup$LayoutParams;
    :cond_1
    const/4 v5, 0x0

    invoke-interface {v1, v0, v5, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 365
    .local v2, "listItem":Landroid/view/View;
    instance-of v5, v2, Landroid/view/ViewGroup;

    if-eqz v5, :cond_2

    .line 366
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 367
    invoke-direct {v5, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 366
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 368
    :cond_2
    invoke-virtual {v2, v7, v7}, Landroid/view/View;->measure(II)V

    .line 369
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v4, v5

    .line 363
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method


# virtual methods
.method public getColorArrayForGraph(I)Ljava/util/ArrayList;
    .locals 3
    .param p1, "count"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 458
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 459
    .local v0, "colors":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-lt v1, p1, :cond_0

    .line 468
    return-object v0

    .line 461
    :cond_0
    rem-int/lit8 v2, v1, 0x2

    if-nez v2, :cond_1

    .line 462
    const-string v2, "#4863A0"

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 464
    :cond_1
    const-string v2, "#EE9A4D"

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public getDensity()F
    .locals 1

    .prologue
    .line 94
    iget v0, p0, Lcom/hmobile/common/Utils;->m_density:F

    return v0
.end method

.method public getDipFromPixel(I)I
    .locals 4
    .param p1, "pixel"    # I

    .prologue
    .line 142
    iget v2, p0, Lcom/hmobile/common/Utils;->m_density:F

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_0

    .line 147
    .end local p1    # "pixel":I
    :goto_0
    return p1

    .line 145
    .restart local p1    # "pixel":I
    :cond_0
    iget v0, p0, Lcom/hmobile/common/Utils;->m_density:F

    .line 146
    .local v0, "density":F
    int-to-float v2, p1

    mul-float/2addr v2, v0

    float-to-int v1, v2

    .local v1, "dip":I
    move p1, v1

    .line 147
    goto :goto_0
.end method

.method public getFormatedDate(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "date"    # Ljava/lang/String;

    .prologue
    .line 400
    const-string v2, ""

    .line 401
    .local v2, "newDateStr":Ljava/lang/String;
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v5, "yyyy-MM-dd hh:mm:ss"

    invoke-direct {v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 403
    .local v4, "sdf":Ljava/text/SimpleDateFormat;
    :try_start_0
    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 404
    .local v0, "dateObj":Ljava/util/Date;
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 405
    const-string v5, "dd MMM, yyyy hh:mm a"

    .line 404
    invoke-direct {v3, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 406
    .local v3, "postFormater":Ljava/text/SimpleDateFormat;
    invoke-virtual {v3, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 410
    .end local v0    # "dateObj":Ljava/util/Date;
    .end local v3    # "postFormater":Ljava/text/SimpleDateFormat;
    :goto_0
    return-object v2

    .line 407
    :catch_0
    move-exception v1

    .line 408
    .local v1, "e1":Ljava/text/ParseException;
    invoke-virtual {v1}, Ljava/text/ParseException;->printStackTrace()V

    goto :goto_0
.end method

.method public join(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p2, "delimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Ljava/lang/CharSequence;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 68
    .local p1, "s":Ljava/util/List;, "Ljava/util/List<+Ljava/lang/CharSequence;>;"
    const/4 v1, 0x0

    .line 69
    .local v1, "capacity":I
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    .line 70
    .local v2, "delimLength":I
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 71
    .local v3, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<+Ljava/lang/CharSequence;>;"
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 72
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    add-int/2addr v4, v2

    add-int/2addr v1, v4

    .line 75
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 76
    .local v0, "buffer":Ljava/lang/StringBuilder;
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 77
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 78
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 79
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    .line 84
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4

    .line 80
    :cond_2
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public setDensity(F)V
    .locals 0
    .param p1, "density"    # F

    .prologue
    .line 90
    iput p1, p0, Lcom/hmobile/common/Utils;->m_density:F

    .line 91
    return-void
.end method
