.class public final Lcom/roidapp/cloudlib/template/b/h;
.super Lcom/roidapp/cloudlib/template/b/j;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/template/b/c;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Landroid/widget/ProgressBar;

.field private f:Landroid/widget/TextView;

.field private g:Ljava/net/HttpURLConnection;

.field private h:Lcom/roidapp/cloudlib/template/TemplateInfo;

.field private i:J


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/template/b/c;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 74
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/b/j;-><init>()V

    .line 67
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/cloudlib/template/b/h;->i:J

    .line 75
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/b/h;->b:Ljava/lang/ref/WeakReference;

    .line 76
    iput-object p2, p0, Lcom/roidapp/cloudlib/template/b/h;->c:Ljava/lang/ref/WeakReference;

    .line 77
    return-void
.end method

.method private static a(Ljava/io/InputStream;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    .locals 8

    .prologue
    const/4 v7, -0x1

    const/4 v0, 0x0

    .line 159
    .line 161
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 163
    new-instance v2, Ljava/util/zip/ZipInputStream;

    invoke-direct {v2, p0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_b
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 165
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 166
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    .line 167
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 168
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

    .line 169
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 183
    :catch_0
    move-exception v1

    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 186
    if-eqz v2, :cond_0

    .line 188
    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 189
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_a

    .line 217
    :cond_0
    :goto_2
    return-object v0

    .line 171
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

    .line 172
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 174
    const/16 v1, 0x400

    new-array v1, v1, [B

    .line 175
    :goto_3
    invoke-virtual {v2, v1}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v4

    if-eq v4, v7, :cond_3

    .line 176
    const/4 v5, 0x0

    invoke-virtual {v3, v1, v5, v4}, Ljava/io/FileOutputStream;->write([BII)V

    .line 177
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    .line 186
    :catchall_0
    move-exception v0

    :goto_4
    if-eqz v2, :cond_2

    .line 188
    :try_start_5
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 189
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_9

    .line 191
    :cond_2
    :goto_5
    throw v0

    .line 179
    :cond_3
    :try_start_6
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0

    .line 188
    :cond_4
    :try_start_7
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 189
    invoke-virtual {v2}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_c

    .line 197
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

    .line 199
    const/16 v1, 0x400

    :try_start_9
    new-array v1, v1, [B

    .line 200
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    :goto_7
    invoke-virtual {v2, v1}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v4

    if-eq v4, v7, :cond_5

    .line 202
    new-instance v5, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6, v4}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_7

    .line 207
    :catch_1
    move-exception v1

    :goto_8
    :try_start_a
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 211
    if-eqz v2, :cond_0

    .line 213
    :try_start_b
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2

    goto/16 :goto_2

    .line 214
    :catch_2
    move-exception v1

    goto/16 :goto_2

    .line 204
    :cond_5
    :try_start_c
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    .line 205
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/roidapp/cloudlib/template/b/h;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-result-object v0

    .line 213
    :try_start_d
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3

    goto/16 :goto_2

    :catch_3
    move-exception v1

    goto/16 :goto_2

    .line 209
    :catch_4
    move-exception v1

    move-object v2, v0

    :goto_9
    :try_start_e
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 211
    if-eqz v2, :cond_0

    .line 213
    :try_start_f
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_5

    goto/16 :goto_2

    .line 214
    :catch_5
    move-exception v1

    goto/16 :goto_2

    .line 211
    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_a
    if-eqz v2, :cond_6

    .line 213
    :try_start_10
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_6

    .line 214
    :cond_6
    :goto_b
    throw v0

    :catch_6
    move-exception v1

    goto :goto_b

    .line 211
    :catchall_2
    move-exception v0

    goto :goto_a

    .line 209
    :catch_7
    move-exception v1

    goto :goto_9

    .line 207
    :catch_8
    move-exception v1

    move-object v2, v0

    goto :goto_8

    :catch_9
    move-exception v1

    goto/16 :goto_5

    .line 186
    :catchall_3
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto/16 :goto_4

    :catch_a
    move-exception v1

    goto/16 :goto_2

    .line 183
    :catch_b
    move-exception v1

    move-object v2, v0

    goto/16 :goto_1

    .line 191
    :catch_c
    move-exception v1

    goto/16 :goto_6
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    .locals 9

    .prologue
    const/4 v8, -0x1

    const/4 v1, 0x0

    .line 86
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
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_c
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

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

    .line 112
    :catch_0
    move-exception v0

    .line 113
    :goto_1
    :try_start_2
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V

    .line 114
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 117
    if-eqz v2, :cond_0

    .line 119
    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6

    :cond_0
    :goto_2
    move-object v0, v1

    .line 149
    :goto_3
    return-object v0

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

    if-eq v6, v8, :cond_3

    .line 105
    const/4 v7, 0x0

    invoke-virtual {v4, v5, v7, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 106
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    .line 117
    :catchall_0
    move-exception v0

    :goto_5
    if-eqz v2, :cond_2

    .line 119
    :try_start_5
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_7

    .line 121
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

    .line 119
    :cond_4
    :try_start_7
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 127
    :goto_7
    :try_start_8
    new-instance v2, Ljava/io/BufferedInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/data"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_b
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 129
    const/16 v0, 0x400

    :try_start_9
    new-array v0, v0, [B

    .line 130
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    :goto_8
    invoke-virtual {v2, v0}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v4

    if-eq v4, v8, :cond_6

    .line 132
    new-instance v5, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v5, v0, v6, v4}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_a
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_8

    .line 137
    :catch_1
    move-exception v0

    :goto_9
    :try_start_a
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 143
    if-eqz v2, :cond_5

    .line 145
    :try_start_b
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8

    :cond_5
    :goto_a
    move-object v0, v1

    .line 149
    goto/16 :goto_3

    .line 134
    :cond_6
    :try_start_c
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    .line 135
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/template/b/h;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_1
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_a
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-result-object v0

    .line 145
    :try_start_d
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_2

    goto/16 :goto_3

    :catch_2
    move-exception v1

    goto/16 :goto_3

    .line 139
    :catch_3
    move-exception v0

    move-object v2, v1

    :goto_b
    :try_start_e
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 141
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 143
    if-eqz v2, :cond_5

    .line 145
    :try_start_f
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_4

    goto :goto_a

    .line 146
    :catch_4
    move-exception v0

    goto :goto_a

    .line 143
    :catchall_1
    move-exception v0

    move-object v2, v1

    :goto_c
    if-eqz v2, :cond_7

    .line 145
    :try_start_10
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_9

    .line 146
    :cond_7
    :goto_d
    throw v0

    .line 121
    :catch_5
    move-exception v0

    goto :goto_7

    :catch_6
    move-exception v0

    goto/16 :goto_2

    :catch_7
    move-exception v1

    goto/16 :goto_6

    .line 146
    :catch_8
    move-exception v0

    goto :goto_a

    :catch_9
    move-exception v1

    goto :goto_d

    .line 143
    :catchall_2
    move-exception v0

    goto :goto_c

    .line 139
    :catch_a
    move-exception v0

    goto :goto_b

    .line 137
    :catch_b
    move-exception v0

    move-object v2, v1

    goto :goto_9

    .line 117
    :catchall_3
    move-exception v0

    move-object v2, v1

    goto/16 :goto_5

    .line 112
    :catch_c
    move-exception v0

    move-object v2, v1

    goto/16 :goto_1
.end method

.method private varargs a([Lcom/roidapp/cloudlib/template/b/l;)Ljava/lang/Object;
    .locals 12

    .prologue
    const/4 v11, 0x0

    const/4 v3, 0x0

    .line 612
    aget-object v0, p1, v11

    check-cast v0, Lcom/roidapp/cloudlib/template/b/g;

    .line 613
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/h;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    .line 614
    iget-object v2, p0, Lcom/roidapp/cloudlib/template/b/h;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/cloudlib/template/b/c;

    .line 616
    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/b/c;->b()Z

    move-result v4

    if-nez v4, :cond_0

    if-eqz v0, :cond_0

    iget-object v4, v0, Lcom/roidapp/cloudlib/template/b/g;->d:Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-nez v4, :cond_1

    .line 645
    :cond_0
    :goto_0
    return-object v3

    .line 620
    :cond_1
    monitor-enter v1

    .line 1030
    :try_start_0
    invoke-static {}, Lcom/roidapp/cloudlib/common/c;->a()Z

    move-result v4

    .line 621
    if-nez v4, :cond_2

    .line 622
    const/16 v0, 0x1102

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/template/b/c;->sendEmptyMessage(I)Z

    .line 623
    monitor-exit v1

    goto :goto_0

    .line 629
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 625
    :cond_2
    :try_start_1
    invoke-static {}, Lcom/roidapp/cloudlib/template/b/h;->b()Z

    move-result v4

    if-nez v4, :cond_3

    .line 626
    const/16 v0, 0x1101

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/template/b/c;->sendEmptyMessage(I)Z

    .line 627
    monitor-exit v1

    goto :goto_0

    .line 629
    :cond_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 630
    iget-boolean v4, v0, Lcom/roidapp/cloudlib/template/b/g;->a:Z

    if-eqz v4, :cond_4

    .line 631
    iget-object v0, v0, Lcom/roidapp/cloudlib/template/b/g;->d:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 1464
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/roidapp/cloudlib/template/b/h;->a:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "/download/"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/baselib/d/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1465
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1466
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 1467
    const/16 v1, 0x2323

    invoke-static {v2, v1, v0}, Lcom/roidapp/cloudlib/template/b/h;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto :goto_0

    .line 634
    :cond_4
    new-instance v4, Ljava/io/File;

    sget-object v5, Lcom/roidapp/cloudlib/template/b/h;->a:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lcom/roidapp/baselib/d/a;->b(Ljava/io/File;)J

    move-result-wide v4

    const-wide/32 v6, 0xa00000

    cmp-long v4, v4, v6

    if-gez v4, :cond_5

    .line 635
    const/16 v1, 0x1100

    invoke-static {v2, v1, v3}, Lcom/roidapp/cloudlib/template/b/h;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 636
    iget-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/g;->c:Z

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Lcom/roidapp/cloudlib/template/b/g;->b:Z

    if-nez v1, :cond_0

    .line 637
    iget-object v0, v0, Lcom/roidapp/cloudlib/template/b/g;->d:Lcom/roidapp/cloudlib/template/TemplateInfo;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 638
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->c()Landroid/widget/ProgressBar;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    goto :goto_0

    .line 640
    :cond_5
    iget-boolean v4, v0, Lcom/roidapp/cloudlib/template/b/g;->c:Z

    if-eqz v4, :cond_6

    iget-boolean v4, v0, Lcom/roidapp/cloudlib/template/b/g;->b:Z

    if-nez v4, :cond_6

    .line 641
    iget-object v0, v0, Lcom/roidapp/cloudlib/template/b/g;->d:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-direct {p0, v1, v2, v0}, Lcom/roidapp/cloudlib/template/b/h;->a(Landroid/content/Context;Landroid/os/Handler;Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    goto/16 :goto_0

    .line 642
    :cond_6
    iget-boolean v4, v0, Lcom/roidapp/cloudlib/template/b/g;->b:Z

    if-eqz v4, :cond_0

    .line 643
    iget-object v4, v0, Lcom/roidapp/cloudlib/template/b/g;->d:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 1573
    invoke-virtual {v4}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v6

    .line 1574
    invoke-virtual {v4}, Lcom/roidapp/cloudlib/template/TemplateInfo;->g()Ljava/lang/String;

    move-result-object v0

    .line 1575
    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1576
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/roidapp/cloudlib/template/b/h;->a:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "/download/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1577
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/roidapp/cloudlib/template/b/h;->a:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "/content/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 1581
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v11}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 1582
    const-string v0, "TemplateDownloadTask"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Zip file was existed! "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1583
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lcom/roidapp/cloudlib/template/b/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;

    move-result-object v0

    .line 1597
    :goto_1
    if-eqz v0, :cond_9

    .line 1598
    const/16 v1, 0x2325

    invoke-static {v2, v1, v0}, Lcom/roidapp/cloudlib/template/b/h;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 1587
    :cond_7
    invoke-static {v6, v7}, Lcom/roidapp/cloudlib/template/j;->a(J)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 1589
    :try_start_2
    const-string v6, "/"

    invoke-virtual {v0, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 1590
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v6

    invoke-virtual {v6, v1, v0}, Lcom/roidapp/cloudlib/al;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lcom/roidapp/cloudlib/template/b/h;->a(Ljava/io/InputStream;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    goto :goto_1

    .line 1592
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :cond_8
    move-object v0, v3

    goto :goto_1

    .line 1601
    :cond_9
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1602
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v5, Lcom/roidapp/cloudlib/at;->aW:I

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v11

    .line 1603
    const/4 v1, 0x1

    aput-object v4, v0, v1

    .line 1604
    const/16 v1, 0x2328

    invoke-static {v2, v1, v0}, Lcom/roidapp/cloudlib/template/b/h;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto/16 :goto_0
.end method

.method private a(Landroid/content/Context;Landroid/os/Handler;Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 10

    .prologue
    .line 478
    invoke-virtual {p3}, Lcom/roidapp/cloudlib/template/TemplateInfo;->g()Ljava/lang/String;

    move-result-object v0

    .line 479
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/roidapp/cloudlib/template/b/h;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/download/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 480
    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 482
    iput-object p3, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 483
    invoke-virtual {p3}, Lcom/roidapp/cloudlib/template/TemplateInfo;->c()Landroid/widget/ProgressBar;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    .line 484
    invoke-virtual {p3}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/cloudlib/template/b/h;->i:J

    .line 485
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 486
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    sget v1, Lcom/roidapp/cloudlib/ar;->cC:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->f:Landroid/widget/TextView;

    .line 487
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/aq;->q:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->d:Landroid/graphics/drawable/Drawable;

    .line 488
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->d:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v5, p0, Lcom/roidapp/cloudlib/template/b/h;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/cloudlib/template/b/h;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v6

    invoke-virtual {v0, v1, v2, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 491
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 492
    const/16 v0, 0x2320

    invoke-static {p2, v0, p3}, Lcom/roidapp/cloudlib/template/b/h;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 562
    :cond_1
    :goto_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    const/16 v2, 0x64

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/template/b/h;->publishProgress([Ljava/lang/Object;)V

    .line 563
    return-void

    .line 494
    :cond_2
    invoke-static {p1}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 495
    const/16 v0, 0x2400

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Lcom/roidapp/cloudlib/template/b/h;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto :goto_0

    .line 498
    :cond_3
    invoke-static {}, Lcom/roidapp/baselib/e/l;->a()V

    .line 499
    const/4 v2, 0x0

    .line 500
    const/4 v1, 0x0

    .line 501
    new-instance v5, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 503
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 504
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_4

    .line 505
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 507
    :cond_4
    new-instance v0, Ljava/net/URL;

    invoke-virtual {p3}, Lcom/roidapp/cloudlib/template/TemplateInfo;->g()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 508
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    .line 509
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    const v3, 0xea60

    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 510
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    const v3, 0xea60

    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 511
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 512
    new-instance v3, Ljava/io/BufferedInputStream;

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 513
    :try_start_1
    new-instance v2, Ljava/io/BufferedOutputStream;

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 516
    const/4 v0, 0x0

    .line 517
    :try_start_2
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v1

    .line 518
    const/16 v4, 0x400

    new-array v4, v4, [B

    .line 519
    :goto_1
    invoke-virtual {v3, v4}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_9

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/b/h;->isCancelled()Z

    move-result v7

    if-nez v7, :cond_9

    .line 520
    const/4 v7, 0x0

    invoke-virtual {v2, v4, v7, v6}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 522
    add-int/2addr v0, v6

    .line 523
    int-to-double v6, v0

    int-to-double v8, v1

    div-double/2addr v6, v8

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    mul-double/2addr v6, v8

    double-to-int v6, v6

    .line 524
    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Integer;

    const/4 v8, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v7, v8

    invoke-virtual {p0, v7}, Lcom/roidapp/cloudlib/template/b/h;->publishProgress([Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    .line 530
    :catch_0
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    .line 531
    :goto_2
    :try_start_3
    const-string v3, "TemplateDownloadTask"

    const-string v4, "Error in downloadTemplate - "

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 532
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 534
    invoke-static {v5}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V

    .line 535
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/b/h;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 536
    const/16 v0, 0x2321

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/at;->c:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p2, v0, v3}, Lcom/roidapp/cloudlib/template/b/h;->a(Landroid/os/Handler;ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 539
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/b/h;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 540
    invoke-static {v5}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V

    .line 542
    :cond_6
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_7

    .line 543
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 544
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    .line 547
    :cond_7
    if-eqz v2, :cond_8

    .line 548
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 554
    :cond_8
    :goto_3
    if-eqz v1, :cond_1

    .line 555
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_0

    .line 560
    :catch_1
    move-exception v0

    goto/16 :goto_0

    .line 526
    :cond_9
    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->flush()V

    .line 527
    const-string v0, "Download/end"

    invoke-virtual {p3}, Lcom/roidapp/cloudlib/template/TemplateInfo;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    const/16 v0, 0x2320

    invoke-static {p2, v0, p3}, Lcom/roidapp/cloudlib/template/b/h;->a(Landroid/os/Handler;ILjava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 539
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/b/h;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 540
    invoke-static {v5}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V

    .line 542
    :cond_a
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_b

    .line 543
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 544
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    .line 548
    :cond_b
    :try_start_7
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 555
    :goto_4
    :try_start_8
    invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    goto/16 :goto_0

    .line 560
    :catch_2
    move-exception v0

    goto/16 :goto_0

    .line 539
    :catchall_0
    move-exception v0

    :goto_5
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/b/h;->isCancelled()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 540
    invoke-static {v5}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;)V

    .line 542
    :cond_c
    iget-object v3, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_d

    .line 543
    iget-object v3, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 544
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    .line 547
    :cond_d
    if-eqz v2, :cond_e

    .line 548
    :try_start_9
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    .line 554
    :cond_e
    :goto_6
    if-eqz v1, :cond_f

    .line 555
    :try_start_a
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_6

    .line 559
    :cond_f
    :goto_7
    throw v0

    :catch_3
    move-exception v0

    goto :goto_4

    :catch_4
    move-exception v0

    goto :goto_3

    :catch_5
    move-exception v2

    goto :goto_6

    :catch_6
    move-exception v1

    goto :goto_7

    .line 539
    :catchall_1
    move-exception v0

    move-object v2, v3

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    goto :goto_5

    .line 530
    :catch_7
    move-exception v0

    goto/16 :goto_2

    :catch_8
    move-exception v0

    move-object v2, v3

    goto/16 :goto_2
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 733
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/template/b/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/download/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/baselib/d/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/template/d;
    .locals 32

    .prologue
    .line 237
    new-instance v18, Lorg/json/JSONObject;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 239
    const-string v4, "templateName"

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 241
    const/4 v5, 0x0

    .line 242
    const/4 v4, 0x0

    .line 244
    const-string v6, "background"

    move-object/from16 v0, v18

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 245
    const-string v4, "background"

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 246
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "name"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 247
    const-string v6, "repeat"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 253
    :cond_0
    const-string v6, "toCameraPreview"

    move-object/from16 v0, v18

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "toCameraPreview"

    move-object/from16 v0, v18

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    .line 254
    :goto_0
    const-string v7, "innerBorder"

    move-object/from16 v0, v18

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    double-to-float v0, v8

    move/from16 v21, v0

    .line 255
    const-string v7, "outerBorder"

    move-object/from16 v0, v18

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    double-to-float v0, v8

    move/from16 v22, v0

    .line 256
    const-string v7, "cornerRadius"

    move-object/from16 v0, v18

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    double-to-float v0, v8

    move/from16 v23, v0

    .line 257
    const-string v7, "scale"

    move-object/from16 v0, v18

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    double-to-float v0, v8

    move/from16 v24, v0

    .line 261
    const/4 v13, 0x1

    .line 262
    const/4 v12, 0x0

    .line 263
    const/4 v11, 0x0

    .line 264
    const/4 v10, 0x0

    .line 265
    const/4 v9, 0x0

    .line 266
    const/4 v8, 0x0

    .line 267
    const/4 v7, 0x0

    .line 268
    const-string v14, "grid"

    move-object/from16 v0, v18

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_3

    const-string v14, "grid"

    move-object/from16 v0, v18

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v14

    move-object/from16 v17, v14

    .line 269
    :goto_1
    if-eqz v17, :cond_1

    invoke-virtual/range {v17 .. v17}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-nez v14, :cond_4

    .line 270
    :cond_1
    const/16 v14, 0xf

    .line 342
    :goto_2
    const/16 v16, 0x0

    .line 343
    const/4 v15, 0x0

    .line 344
    const-string v17, "sticker"

    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v17

    if-nez v17, :cond_10

    .line 345
    const-string v15, "sticker"

    move-object/from16 v0, v18

    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v19

    .line 346
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 347
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 348
    const/4 v15, 0x0

    :goto_3
    invoke-virtual/range {v19 .. v19}, Lorg/json/JSONArray;->length()I

    move-result v25

    move/from16 v0, v25

    if-ge v15, v0, :cond_f

    .line 349
    move-object/from16 v0, v19

    invoke-virtual {v0, v15}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v25

    .line 350
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v26

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "name"

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v17

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    new-instance v26, Ljava/util/HashMap;

    invoke-direct/range {v26 .. v26}, Ljava/util/HashMap;-><init>()V

    .line 352
    const-string v27, "position"

    move-object/from16 v0, v25

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v25

    .line 353
    const-string v27, "x"

    const-string v28, "x"

    move-object/from16 v0, v25

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v28

    move-wide/from16 v0, v28

    double-to-float v0, v0

    move/from16 v28, v0

    invoke-static/range {v28 .. v28}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v28

    invoke-interface/range {v26 .. v28}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    const-string v27, "y"

    const-string v28, "y"

    move-object/from16 v0, v25

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v28

    move-wide/from16 v0, v28

    double-to-float v0, v0

    move/from16 v28, v0

    invoke-static/range {v28 .. v28}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v28

    invoke-interface/range {v26 .. v28}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    const-string v27, "scale"

    const-string v28, "scale"

    move-object/from16 v0, v25

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v28

    move-wide/from16 v0, v28

    double-to-float v0, v0

    move/from16 v28, v0

    invoke-static/range {v28 .. v28}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v28

    invoke-interface/range {v26 .. v28}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    const-string v27, "angle"

    const-string v28, "angle"

    move-object/from16 v0, v25

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v28

    move-wide/from16 v0, v28

    double-to-float v0, v0

    move/from16 v25, v0

    invoke-static/range {v25 .. v25}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    move-object/from16 v2, v25

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    move-object/from16 v0, v16

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 348
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_3

    .line 253
    :cond_2
    const/4 v6, 0x0

    goto/16 :goto_0

    .line 268
    :cond_3
    const/4 v14, 0x0

    move-object/from16 v17, v14

    goto/16 :goto_1

    .line 273
    :cond_4
    invoke-virtual/range {v17 .. v17}, Lorg/json/JSONArray;->length()I

    move-result v15

    .line 274
    const/4 v14, 0x0

    .line 275
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 277
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 278
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 279
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 280
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 281
    const/4 v7, 0x0

    move/from16 v16, v7

    :goto_4
    move/from16 v0, v16

    if-ge v0, v15, :cond_1e

    .line 282
    move-object/from16 v0, v17

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v19

    .line 284
    const-string v7, "mask"

    move-object/from16 v0, v19

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5

    const-string v7, "mask"

    move-object/from16 v0, v19

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v25

    const-string v26, ""

    invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25

    if-nez v25, :cond_5

    .line 285
    const-string v25, "null"

    move-object/from16 v0, v25

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_7

    .line 286
    invoke-interface {v13, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    :cond_5
    :goto_5
    const-string v7, "scale"

    move-object/from16 v0, v19

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v26

    .line 294
    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->isNaN(D)Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v7, 0x0

    :goto_6
    invoke-interface {v11, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 295
    const-string v7, "rotate"

    move-object/from16 v0, v19

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v26

    .line 296
    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->isNaN(D)Z

    move-result v7

    if-eqz v7, :cond_9

    const/4 v7, 0x0

    :goto_7
    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    const/4 v7, 0x0

    .line 298
    const-string v25, "offset"

    move-object/from16 v0, v19

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v25

    .line 299
    if-eqz v25, :cond_6

    invoke-virtual/range {v25 .. v25}, Lorg/json/JSONArray;->length()I

    move-result v26

    const/16 v27, 0x2

    move/from16 v0, v26

    move/from16 v1, v27

    if-lt v0, v1, :cond_6

    .line 300
    const/16 v26, 0x0

    invoke-virtual/range {v25 .. v26}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v26

    .line 301
    const/16 v28, 0x1

    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optDouble(I)D

    move-result-wide v28

    .line 302
    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->isNaN(D)Z

    move-result v25

    if-nez v25, :cond_6

    invoke-static/range {v28 .. v29}, Ljava/lang/Double;->isNaN(D)Z

    move-result v25

    if-nez v25, :cond_6

    .line 303
    new-instance v7, Lcom/roidapp/cloudlib/template/f;

    invoke-direct {v7}, Lcom/roidapp/cloudlib/template/f;-><init>()V

    .line 304
    move-wide/from16 v0, v26

    double-to-float v0, v0

    move/from16 v25, v0

    move/from16 v0, v25

    iput v0, v7, Lcom/roidapp/cloudlib/template/f;->a:F

    .line 305
    move-wide/from16 v0, v28

    double-to-float v0, v0

    move/from16 v25, v0

    move/from16 v0, v25

    iput v0, v7, Lcom/roidapp/cloudlib/template/f;->b:F

    .line 308
    :cond_6
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    const-string v7, "points"

    move-object/from16 v0, v19

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v25

    .line 312
    new-instance v26, Ljava/util/ArrayList;

    invoke-direct/range {v26 .. v26}, Ljava/util/ArrayList;-><init>()V

    .line 313
    const/4 v7, 0x0

    :goto_8
    invoke-virtual/range {v25 .. v25}, Lorg/json/JSONArray;->length()I

    move-result v27

    move/from16 v0, v27

    if-ge v7, v0, :cond_a

    .line 314
    move-object/from16 v0, v25

    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v27

    .line 315
    const/16 v28, 0x0

    invoke-virtual/range {v27 .. v28}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v28

    .line 316
    const/16 v29, 0x1

    move-object/from16 v0, v27

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v27

    .line 317
    new-instance v29, Ljava/lang/StringBuilder;

    invoke-direct/range {v29 .. v29}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v29

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    const-string v29, "#"

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    move-object/from16 v0, v28

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v27

    invoke-virtual/range {v27 .. v27}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    invoke-interface/range {v26 .. v27}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 313
    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    .line 288
    :cond_7
    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v25

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v25

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v13, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 294
    :cond_8
    move-wide/from16 v0, v26

    double-to-float v7, v0

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    goto/16 :goto_6

    .line 296
    :cond_9
    move-wide/from16 v0, v26

    double-to-float v7, v0

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    goto/16 :goto_7

    .line 319
    :cond_a
    move-object/from16 v0, v26

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 322
    const/4 v7, 0x0

    .line 323
    const-string v25, "filter"

    move-object/from16 v0, v19

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v25

    if-nez v25, :cond_e

    .line 324
    const-string v25, "filter"

    move-object/from16 v0, v19

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v19

    .line 325
    if-eqz v19, :cond_e

    .line 326
    new-instance v7, Lcom/roidapp/cloudlib/template/e;

    invoke-direct {v7}, Lcom/roidapp/cloudlib/template/e;-><init>()V

    .line 327
    const-string v25, "filter_name"

    move-object/from16 v0, v19

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v25

    if-nez v25, :cond_b

    .line 328
    const-string v25, "filter_name"

    move-object/from16 v0, v19

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    move-object/from16 v0, v25

    iput-object v0, v7, Lcom/roidapp/cloudlib/template/e;->a:Ljava/lang/String;

    .line 329
    :cond_b
    const-string v25, "acv"

    move-object/from16 v0, v19

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v25

    if-nez v25, :cond_c

    .line 330
    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v25

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, "acv"

    move-object/from16 v0, v19

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    move-object/from16 v0, v25

    iput-object v0, v7, Lcom/roidapp/cloudlib/template/e;->b:Ljava/lang/String;

    .line 331
    :cond_c
    const-string v25, "material"

    move-object/from16 v0, v19

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v25

    if-nez v25, :cond_d

    .line 332
    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v25

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, "material"

    move-object/from16 v0, v19

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    move-object/from16 v0, v25

    iput-object v0, v7, Lcom/roidapp/cloudlib/template/e;->c:Ljava/lang/String;

    .line 333
    :cond_d
    const-string v25, "screen"

    move-object/from16 v0, v19

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v25

    if-nez v25, :cond_e

    .line 334
    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v25

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, "screen"

    move-object/from16 v0, v19

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v25

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v0, v19

    iput-object v0, v7, Lcom/roidapp/cloudlib/template/e;->d:Ljava/lang/String;

    .line 337
    :cond_e
    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 281
    add-int/lit8 v7, v16, 0x1

    move/from16 v16, v7

    goto/16 :goto_4

    :cond_f
    move-object/from16 v15, v16

    move-object/from16 v16, v17

    .line 362
    :cond_10
    const/16 v17, 0x0

    .line 363
    const-string v19, "text"

    invoke-virtual/range {v18 .. v19}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v19

    if-nez v19, :cond_1b

    .line 364
    const-string v17, "text"

    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v25

    .line 365
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 366
    invoke-virtual/range {v25 .. v25}, Lorg/json/JSONArray;->length()I

    move-result v26

    .line 367
    const/16 v17, 0x0

    move/from16 v19, v17

    :goto_9
    move/from16 v0, v19

    move/from16 v1, v26

    if-ge v0, v1, :cond_1a

    .line 368
    new-instance v27, Lcom/roidapp/cloudlib/template/m;

    invoke-direct/range {v27 .. v27}, Lcom/roidapp/cloudlib/template/m;-><init>()V

    .line 369
    move-object/from16 v0, v25

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v28

    .line 370
    const-string v17, "content"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    move-object/from16 v1, v27

    iput-object v0, v1, Lcom/roidapp/cloudlib/template/m;->a:Ljava/lang/String;

    .line 371
    const-string v17, "fontIndex"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->f:I

    .line 373
    const-string v17, "textColor"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->g:I

    .line 374
    const-string v17, "strokeColor"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const-string v29, ""

    move-object/from16 v0, v17

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    .line 375
    const/16 v17, -0x15

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->h:I

    .line 379
    :goto_a
    const-string v17, "strokeScale"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v30

    move-wide/from16 v0, v30

    double-to-float v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->i:F

    .line 380
    const-string v17, "textSize"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->j:I

    .line 381
    const-string v17, "alpha"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->k:I

    .line 382
    const-string v17, "alignType"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->o:I

    .line 383
    const-string v17, "fixedWidth"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->p:I

    .line 385
    const-string v17, "position"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v29

    .line 386
    const-string v17, "left"

    move-object/from16 v0, v29

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_14

    .line 387
    const-string v17, "left"

    move-object/from16 v0, v29

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    const/16 v30, 0x1

    move/from16 v0, v17

    move/from16 v1, v30

    if-ne v0, v1, :cond_13

    const/16 v17, 0x1

    :goto_b
    move/from16 v0, v17

    move-object/from16 v1, v27

    iput-boolean v0, v1, Lcom/roidapp/cloudlib/template/m;->v:Z

    .line 391
    :goto_c
    const-string v17, "x"

    move-object/from16 v0, v29

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v30

    move-wide/from16 v0, v30

    double-to-float v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->b:F

    .line 392
    const-string v17, "y"

    move-object/from16 v0, v29

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v30

    move-wide/from16 v0, v30

    double-to-float v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->c:F

    .line 393
    const-string v17, "scale"

    move-object/from16 v0, v29

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v30

    move-wide/from16 v0, v30

    double-to-float v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->d:F

    .line 394
    const-string v17, "angle"

    move-object/from16 v0, v29

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v30

    move-wide/from16 v0, v30

    double-to-float v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->e:F

    .line 396
    const-string v17, "background"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v17

    .line 397
    const-string v29, "bgName"

    move-object/from16 v0, v17

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    const-string v30, ""

    invoke-virtual/range {v29 .. v30}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-nez v29, :cond_15

    .line 398
    new-instance v29, Ljava/lang/StringBuilder;

    invoke-direct/range {v29 .. v29}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v29

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v29

    const-string v30, "bgName"

    move-object/from16 v0, v17

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {v29 .. v30}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    move-object/from16 v0, v29

    move-object/from16 v1, v27

    iput-object v0, v1, Lcom/roidapp/cloudlib/template/m;->l:Ljava/lang/String;

    .line 402
    :goto_d
    const-string v29, "bgRepeat"

    move-object/from16 v0, v17

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    const-string v30, ""

    invoke-virtual/range {v29 .. v30}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_16

    .line 403
    const/16 v29, 0x0

    move/from16 v0, v29

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->m:I

    .line 408
    :goto_e
    const-string v29, "bgColor"

    move-object/from16 v0, v17

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    const-string v30, ""

    invoke-virtual/range {v29 .. v30}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_17

    .line 409
    const/16 v17, 0x1

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->n:I

    .line 414
    :goto_f
    const-string v17, "shadow"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v28

    .line 415
    const-string v17, "sdShow"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    const/16 v29, 0x1

    move/from16 v0, v17

    move/from16 v1, v29

    if-ne v0, v1, :cond_18

    const/16 v17, 0x1

    .line 416
    :goto_10
    move/from16 v0, v17

    move-object/from16 v1, v27

    iput-boolean v0, v1, Lcom/roidapp/cloudlib/template/m;->u:Z

    .line 417
    if-eqz v17, :cond_11

    .line 418
    const-string v17, "sdRadius"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v30

    move-wide/from16 v0, v30

    double-to-float v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->q:F

    .line 419
    const-string v17, "sdDx"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v30

    move-wide/from16 v0, v30

    double-to-float v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->r:F

    .line 420
    const-string v17, "sdDy"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v30

    move-wide/from16 v0, v30

    double-to-float v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->s:F

    .line 421
    const-string v17, "sdColor"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 422
    const-string v28, ""

    move-object/from16 v0, v17

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_19

    .line 423
    const/high16 v17, -0x1000000

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->t:I

    .line 429
    :cond_11
    :goto_11
    move-object/from16 v0, v18

    move-object/from16 v1, v27

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 367
    add-int/lit8 v17, v19, 0x1

    move/from16 v19, v17

    goto/16 :goto_9

    .line 377
    :cond_12
    const-string v17, "strokeColor"

    move-object/from16 v0, v28

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->h:I

    goto/16 :goto_a

    .line 387
    :cond_13
    const/16 v17, 0x0

    goto/16 :goto_b

    .line 389
    :cond_14
    const/16 v17, 0x0

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput-boolean v0, v1, Lcom/roidapp/cloudlib/template/m;->v:Z

    goto/16 :goto_c

    .line 400
    :cond_15
    const-string v29, ""

    move-object/from16 v0, v29

    move-object/from16 v1, v27

    iput-object v0, v1, Lcom/roidapp/cloudlib/template/m;->l:Ljava/lang/String;

    goto/16 :goto_d

    .line 405
    :cond_16
    const-string v29, "bgRepeat"

    move-object/from16 v0, v17

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v29

    move/from16 v0, v29

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->m:I

    goto/16 :goto_e

    .line 411
    :cond_17
    const-string v29, "bgColor"

    move-object/from16 v0, v17

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->n:I

    goto/16 :goto_f

    .line 415
    :cond_18
    const/16 v17, 0x0

    goto/16 :goto_10

    .line 425
    :cond_19
    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, v27

    iput v0, v1, Lcom/roidapp/cloudlib/template/m;->t:I

    goto :goto_11

    :cond_1a
    move-object/from16 v17, v18

    .line 433
    :cond_1b
    new-instance v18, Lcom/roidapp/cloudlib/template/d;

    invoke-direct/range {v18 .. v18}, Lcom/roidapp/cloudlib/template/d;-><init>()V

    .line 434
    move-object/from16 v0, v20

    move-object/from16 v1, v18

    iput-object v0, v1, Lcom/roidapp/cloudlib/template/d;->a:Ljava/lang/String;

    .line 435
    move-object/from16 v0, v18

    iput-object v5, v0, Lcom/roidapp/cloudlib/template/d;->b:Ljava/lang/String;

    .line 436
    if-nez v4, :cond_1c

    const/4 v4, 0x0

    :goto_12
    move-object/from16 v0, v18

    iput-boolean v4, v0, Lcom/roidapp/cloudlib/template/d;->e:Z

    .line 437
    move/from16 v0, v21

    move-object/from16 v1, v18

    iput v0, v1, Lcom/roidapp/cloudlib/template/d;->h:F

    .line 438
    move/from16 v0, v22

    move-object/from16 v1, v18

    iput v0, v1, Lcom/roidapp/cloudlib/template/d;->i:F

    .line 439
    move/from16 v0, v23

    move-object/from16 v1, v18

    iput v0, v1, Lcom/roidapp/cloudlib/template/d;->j:F

    .line 440
    const/4 v4, 0x0

    cmpg-float v4, v24, v4

    if-gtz v4, :cond_1d

    const/4 v4, 0x0

    :goto_13
    move-object/from16 v0, v18

    iput-boolean v4, v0, Lcom/roidapp/cloudlib/template/d;->f:Z

    .line 441
    move-object/from16 v0, v18

    iput-boolean v13, v0, Lcom/roidapp/cloudlib/template/d;->g:Z

    .line 442
    invoke-static/range {v24 .. v24}, Ljava/lang/Math;->abs(F)F

    move-result v4

    move-object/from16 v0, v18

    iput v4, v0, Lcom/roidapp/cloudlib/template/d;->k:F

    .line 443
    move-object/from16 v0, v18

    iput-boolean v6, v0, Lcom/roidapp/cloudlib/template/d;->d:Z

    .line 444
    move-object/from16 v0, v18

    iput v14, v0, Lcom/roidapp/cloudlib/template/d;->c:I

    .line 445
    move-object/from16 v0, v18

    iput-object v11, v0, Lcom/roidapp/cloudlib/template/d;->l:Ljava/util/List;

    .line 446
    move-object/from16 v0, v18

    iput-object v12, v0, Lcom/roidapp/cloudlib/template/d;->m:Ljava/util/List;

    .line 447
    move-object/from16 v0, v16

    move-object/from16 v1, v18

    iput-object v0, v1, Lcom/roidapp/cloudlib/template/d;->n:Ljava/util/List;

    .line 448
    move-object/from16 v0, v18

    iput-object v15, v0, Lcom/roidapp/cloudlib/template/d;->o:Ljava/util/List;

    .line 449
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    iput-object v0, v1, Lcom/roidapp/cloudlib/template/d;->p:Ljava/util/List;

    .line 450
    move-object/from16 v0, v18

    iput-object v7, v0, Lcom/roidapp/cloudlib/template/d;->s:Ljava/util/List;

    .line 451
    move-object/from16 v0, v18

    iput-object v9, v0, Lcom/roidapp/cloudlib/template/d;->r:Ljava/util/List;

    .line 452
    move-object/from16 v0, v18

    iput-object v10, v0, Lcom/roidapp/cloudlib/template/d;->q:Ljava/util/List;

    .line 453
    move-object/from16 v0, v18

    iput-object v8, v0, Lcom/roidapp/cloudlib/template/d;->t:Ljava/util/List;

    .line 455
    return-object v18

    .line 436
    :cond_1c
    const/4 v4, 0x1

    goto :goto_12

    .line 440
    :cond_1d
    const/4 v4, 0x1

    goto :goto_13

    :cond_1e
    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move v13, v14

    move v14, v15

    goto/16 :goto_2
.end method


# virtual methods
.method final a()V
    .locals 2

    .prologue
    .line 699
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/b/h;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 700
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/template/b/h;->cancel(Z)Z

    .line 702
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    .line 703
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/h;->g:Ljava/net/HttpURLConnection;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 704
    new-instance v1, Lcom/roidapp/cloudlib/template/b/i;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/cloudlib/template/b/i;-><init>(Lcom/roidapp/cloudlib/template/b/h;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/b/i;->start()V

    .line 717
    :cond_1
    return-void
.end method

.method final a(Lcom/roidapp/cloudlib/template/b/l;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 721
    instance-of v0, p1, Lcom/roidapp/cloudlib/template/b/g;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 722
    check-cast v0, Lcom/roidapp/cloudlib/template/b/g;

    .line 723
    iget-boolean v0, v0, Lcom/roidapp/cloudlib/template/b/g;->c:Z

    if-eqz v0, :cond_1

    .line 724
    sget-object v0, Lcom/roidapp/baselib/c/c;->SINGLE_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v1, [Lcom/roidapp/cloudlib/template/b/l;

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/template/b/h;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 730
    :cond_0
    :goto_0
    return-void

    .line 727
    :cond_1
    sget-object v0, Lcom/roidapp/baselib/c/c;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v1, [Lcom/roidapp/cloudlib/template/b/l;

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/template/b/h;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_0
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 58
    check-cast p1, [Lcom/roidapp/cloudlib/template/b/l;

    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/template/b/h;->a([Lcom/roidapp/cloudlib/template/b/l;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final onPostExecute(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 682
    .line 2022
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/template/b/j;->cancel(Z)Z

    .line 683
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 684
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a(I)V

    .line 685
    iput-object v2, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 687
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_2

    .line 688
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 689
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 691
    :cond_1
    iput-object v2, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    .line 692
    iput-object v2, p0, Lcom/roidapp/cloudlib/template/b/h;->f:Landroid/widget/TextView;

    .line 693
    iput-object v2, p0, Lcom/roidapp/cloudlib/template/b/h;->d:Landroid/graphics/drawable/Drawable;

    .line 695
    :cond_2
    return-void
.end method

.method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/16 v5, 0x64

    const/4 v0, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 58
    check-cast p1, [Ljava/lang/Integer;

    .line 2650
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v1, :cond_2

    .line 2651
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    aget-object v2, p1, v4

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-le v2, v0, :cond_0

    aget-object v0, p1, v4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_0
    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a(I)V

    .line 2652
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2653
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->c()Landroid/widget/ProgressBar;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    .line 2654
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->b()V

    .line 2655
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2656
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    sget v1, Lcom/roidapp/cloudlib/ar;->cC:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->f:Landroid/widget/TextView;

    .line 2657
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->f:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 2658
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/h;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2662
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_2

    .line 2663
    iget-wide v2, p0, Lcom/roidapp/cloudlib/template/b/h;->i:J

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-nez v0, :cond_2

    .line 2664
    aget-object v0, p1, v4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ge v0, v5, :cond_3

    .line 2665
    aget-object v0, p1, v4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2666
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 2667
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/h;->f:Landroid/widget/TextView;

    if-eqz v1, :cond_2

    .line 2668
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/h;->f:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "%"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2670
    :cond_2
    :goto_0
    return-void

    .line 2672
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0, v5}, Lcom/roidapp/cloudlib/template/TemplateInfo;->a(I)V

    .line 2673
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/h;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method
