.class public final Lcom/roidapp/photogrid/release/lm;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/roidapp/cloudlib/template/d;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/roidapp/photogrid/release/lo;

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/release/lo;I)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/roidapp/photogrid/release/lm;->a:Landroid/content/Context;

    .line 35
    iput-object p2, p0, Lcom/roidapp/photogrid/release/lm;->b:Lcom/roidapp/photogrid/release/lo;

    .line 36
    iput p3, p0, Lcom/roidapp/photogrid/release/lm;->c:I

    .line 37
    return-void
.end method

.method private static a(Landroid/content/Context;ILjava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    .locals 6

    .prologue
    .line 64
    invoke-static {p2}, Lcom/roidapp/baselib/d/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/.Template/content/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 66
    const/4 v0, 0x0

    .line 70
    const/4 v3, 0x0

    :try_start_0
    const-string v4, "/"

    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 71
    const-string v4, "/"

    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {p2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 72
    const-string v5, "shape"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 73
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v3

    invoke-virtual {v3, p0, v4, p1}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;I)Ljava/io/InputStream;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/roidapp/photogrid/release/lm;->a(Ljava/io/InputStream;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;

    move-result-object v0

    .line 81
    :goto_0
    return-object v0

    .line 74
    :cond_0
    const-string v1, "basic"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 78
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method private static a(Ljava/io/InputStream;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    .locals 8

    .prologue
    const/4 v7, -0x1

    const/4 v0, 0x0

    .line 93
    .line 95
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 96
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 97
    new-instance v2, Ljava/util/zip/ZipInputStream;

    invoke-direct {v2, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_b
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 99
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 100
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    .line 101
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 102
    new-instance v1, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 117
    :catch_0
    move-exception v1

    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    if-eqz v2, :cond_0

    .line 122
    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 123
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_a

    .line 151
    :cond_0
    :goto_2
    return-object v0

    .line 105
    :cond_1
    :try_start_4
    new-instance v1, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 106
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 108
    const/16 v1, 0x400

    new-array v1, v1, [B

    .line 109
    :goto_3
    invoke-virtual {v2, v1}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v4

    if-eq v4, v7, :cond_3

    .line 110
    const/4 v5, 0x0

    invoke-virtual {v3, v1, v5, v4}, Ljava/io/FileOutputStream;->write([BII)V

    .line 111
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    .line 120
    :catchall_0
    move-exception v0

    :goto_4
    if-eqz v2, :cond_2

    .line 122
    :try_start_5
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 123
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_9

    .line 125
    :cond_2
    :goto_5
    throw v0

    .line 113
    :cond_3
    :try_start_6
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0

    .line 122
    :cond_4
    :try_start_7
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 123
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_c

    .line 131
    :goto_6
    :try_start_8
    new-instance v2, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/data"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 133
    const/16 v1, 0x400

    :try_start_9
    new-array v1, v1, [B

    .line 134
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    :goto_7
    invoke-virtual {v2, v1}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v4

    if-eq v4, v7, :cond_5

    .line 136
    new-instance v5, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6, v4}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_7

    .line 141
    :catch_1
    move-exception v1

    :goto_8
    :try_start_a
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 145
    if-eqz v2, :cond_0

    .line 147
    :try_start_b
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2

    goto/16 :goto_2

    .line 148
    :catch_2
    move-exception v1

    goto/16 :goto_2

    .line 138
    :cond_5
    :try_start_c
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    .line 139
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/roidapp/photogrid/release/lm;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-result-object v0

    .line 147
    :try_start_d
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3

    goto/16 :goto_2

    :catch_3
    move-exception v1

    goto/16 :goto_2

    .line 143
    :catch_4
    move-exception v1

    move-object v2, v0

    :goto_9
    :try_start_e
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 145
    if-eqz v2, :cond_0

    .line 147
    :try_start_f
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_5

    goto/16 :goto_2

    .line 148
    :catch_5
    move-exception v1

    goto/16 :goto_2

    .line 145
    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_a
    if-eqz v2, :cond_6

    .line 147
    :try_start_10
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_6

    .line 148
    :cond_6
    :goto_b
    throw v0

    :catch_6
    move-exception v1

    goto :goto_b

    .line 145
    :catchall_2
    move-exception v0

    goto :goto_a

    .line 143
    :catch_7
    move-exception v1

    goto :goto_9

    .line 141
    :catch_8
    move-exception v1

    move-object v2, v0

    goto :goto_8

    :catch_9
    move-exception v1

    goto/16 :goto_5

    .line 120
    :catchall_3
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto/16 :goto_4

    :catch_a
    move-exception v1

    goto/16 :goto_2

    .line 117
    :catch_b
    move-exception v1

    move-object v2, v0

    goto/16 :goto_1

    .line 125
    :catch_c
    move-exception v1

    goto/16 :goto_6
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    .locals 23

    .prologue
    .line 172
    new-instance v8, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 174
    const-string v2, "templateName"

    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 196
    const-string v2, "innerBorder"

    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    double-to-float v13, v2

    .line 197
    const-string v2, "outerBorder"

    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    double-to-float v14, v2

    .line 198
    const-string v2, "cornerRadius"

    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    double-to-float v15, v2

    .line 199
    const-string v2, "scale"

    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    double-to-float v0, v2

    move/from16 v16, v0

    .line 204
    const/4 v7, 0x0

    .line 205
    const/4 v6, 0x0

    .line 206
    const/4 v5, 0x0

    .line 207
    const/4 v4, 0x0

    .line 208
    const/4 v3, 0x0

    .line 209
    const/4 v2, 0x0

    .line 212
    const-string v9, "grid"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, "grid"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    move-object v11, v8

    .line 213
    :goto_0
    if-eqz v11, :cond_0

    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-nez v8, :cond_2

    .line 214
    :cond_0
    const/16 v8, 0x9

    .line 377
    :goto_1
    new-instance v9, Lcom/roidapp/cloudlib/template/d;

    invoke-direct {v9}, Lcom/roidapp/cloudlib/template/d;-><init>()V

    .line 379
    iput-object v12, v9, Lcom/roidapp/cloudlib/template/d;->a:Ljava/lang/String;

    .line 380
    iput-object v6, v9, Lcom/roidapp/cloudlib/template/d;->l:Ljava/util/List;

    .line 381
    iput-object v7, v9, Lcom/roidapp/cloudlib/template/d;->m:Ljava/util/List;

    .line 382
    iput v8, v9, Lcom/roidapp/cloudlib/template/d;->c:I

    .line 383
    iput-object v2, v9, Lcom/roidapp/cloudlib/template/d;->s:Ljava/util/List;

    .line 384
    iput-object v4, v9, Lcom/roidapp/cloudlib/template/d;->r:Ljava/util/List;

    .line 385
    iput-object v5, v9, Lcom/roidapp/cloudlib/template/d;->q:Ljava/util/List;

    .line 386
    iput-object v3, v9, Lcom/roidapp/cloudlib/template/d;->t:Ljava/util/List;

    .line 387
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iput v2, v9, Lcom/roidapp/cloudlib/template/d;->k:F

    .line 388
    iput v13, v9, Lcom/roidapp/cloudlib/template/d;->h:F

    .line 389
    iput v14, v9, Lcom/roidapp/cloudlib/template/d;->i:F

    .line 390
    iput v15, v9, Lcom/roidapp/cloudlib/template/d;->j:F

    .line 407
    return-object v9

    .line 212
    :cond_1
    const/4 v8, 0x0

    move-object v11, v8

    goto :goto_0

    .line 216
    :cond_2
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v9

    .line 218
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 219
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 220
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 221
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 222
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 223
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 224
    const/4 v2, 0x0

    move v10, v2

    :goto_2
    if-ge v10, v9, :cond_d

    .line 225
    invoke-virtual {v11, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v17

    .line 227
    const-string v2, "mask"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "mask"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v18

    const-string v19, ""

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_3

    .line 228
    const-string v18, "null"

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_5

    .line 229
    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    :cond_3
    :goto_3
    const-string v2, "scale"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v18

    .line 237
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, 0x0

    :goto_4
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    const-string v2, "rotate"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v18

    .line 239
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, 0x0

    :goto_5
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    const/4 v2, 0x0

    .line 241
    const-string v18, "offset"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v18

    .line 242
    if-eqz v18, :cond_4

    invoke-virtual/range {v18 .. v18}, Lorg/json/JSONArray;->length()I

    move-result v19

    const/16 v20, 0x2

    move/from16 v0, v19

    move/from16 v1, v20

    if-lt v0, v1, :cond_4

    .line 243
    const/16 v19, 0x0

    invoke-virtual/range {v18 .. v19}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v20

    .line 244
    const/16 v19, 0x1

    invoke-virtual/range {v18 .. v19}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v18

    .line 245
    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->isNaN(D)Z

    move-result v22

    if-nez v22, :cond_4

    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->isNaN(D)Z

    move-result v22

    if-nez v22, :cond_4

    .line 246
    new-instance v2, Lcom/roidapp/cloudlib/template/f;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/template/f;-><init>()V

    .line 247
    move-wide/from16 v0, v20

    double-to-float v0, v0

    move/from16 v20, v0

    move/from16 v0, v20

    iput v0, v2, Lcom/roidapp/cloudlib/template/f;->a:F

    .line 248
    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    move/from16 v0, v18

    iput v0, v2, Lcom/roidapp/cloudlib/template/f;->b:F

    .line 251
    :cond_4
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 253
    const-string v2, "points"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v18

    .line 255
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 256
    const/4 v2, 0x0

    :goto_6
    invoke-virtual/range {v18 .. v18}, Lorg/json/JSONArray;->length()I

    move-result v20

    move/from16 v0, v20

    if-ge v2, v0, :cond_8

    .line 257
    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v20

    .line 258
    const/16 v21, 0x0

    invoke-virtual/range {v20 .. v21}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v21

    .line 259
    const/16 v22, 0x1

    move-object/from16 v0, v20

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v20

    .line 260
    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    const-string v22, "#"

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, v21

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-interface/range {v19 .. v20}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 231
    :cond_5
    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 237
    :cond_6
    move-wide/from16 v0, v18

    double-to-float v2, v0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto/16 :goto_4

    .line 239
    :cond_7
    move-wide/from16 v0, v18

    double-to-float v2, v0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto/16 :goto_5

    .line 262
    :cond_8
    move-object/from16 v0, v19

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    const/4 v2, 0x0

    .line 266
    const-string v18, "filter"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v18

    if-nez v18, :cond_c

    .line 267
    const-string v18, "filter"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v17

    .line 268
    if-eqz v17, :cond_c

    .line 269
    new-instance v2, Lcom/roidapp/cloudlib/template/e;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/template/e;-><init>()V

    .line 270
    const-string v18, "filter_name"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v18

    if-nez v18, :cond_9

    .line 271
    const-string v18, "filter_name"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    iput-object v0, v2, Lcom/roidapp/cloudlib/template/e;->a:Ljava/lang/String;

    .line 272
    :cond_9
    const-string v18, "acv"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v18

    if-nez v18, :cond_a

    .line 273
    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, "acv"

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    iput-object v0, v2, Lcom/roidapp/cloudlib/template/e;->b:Ljava/lang/String;

    .line 274
    :cond_a
    const-string v18, "material"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v18

    if-nez v18, :cond_b

    .line 275
    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, "material"

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    iput-object v0, v2, Lcom/roidapp/cloudlib/template/e;->c:Ljava/lang/String;

    .line 276
    :cond_b
    const-string v18, "screen"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v18

    if-nez v18, :cond_c

    .line 277
    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, "screen"

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    iput-object v0, v2, Lcom/roidapp/cloudlib/template/e;->d:Ljava/lang/String;

    .line 280
    :cond_c
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    add-int/lit8 v2, v10, 0x1

    move v10, v2

    goto/16 :goto_2

    :cond_d
    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move v8, v9

    goto/16 :goto_1
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 27
    check-cast p1, [Ljava/lang/String;

    .line 2041
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lm;->a:Landroid/content/Context;

    iget v1, p0, Lcom/roidapp/photogrid/release/lm;->c:I

    const/4 v2, 0x0

    aget-object v2, p1, v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/lm;->a(Landroid/content/Context;ILjava/lang/String;)Lcom/roidapp/cloudlib/template/d;

    move-result-object v0

    .line 27
    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 27
    check-cast p1, Lcom/roidapp/cloudlib/template/d;

    .line 1047
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/c;->onPostExecute(Ljava/lang/Object;)V

    .line 1048
    if-eqz p1, :cond_0

    .line 1049
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lm;->b:Lcom/roidapp/photogrid/release/lo;

    invoke-interface {v0, p1}, Lcom/roidapp/photogrid/release/lo;->a(Lcom/roidapp/cloudlib/template/d;)V

    :goto_0
    return-void

    .line 1051
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lm;->b:Lcom/roidapp/photogrid/release/lo;

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/lo;->b()V

    goto :goto_0
.end method
