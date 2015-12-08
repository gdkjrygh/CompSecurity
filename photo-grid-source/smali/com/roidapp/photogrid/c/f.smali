.class final Lcom/roidapp/photogrid/c/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/c/d;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/c/d;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1159
    iput-object p2, p0, Lcom/roidapp/photogrid/c/f;->b:Ljava/lang/String;

    .line 154
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->d()Z

    .line 155
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->e()Z

    .line 156
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v12, 0x5

    .line 165
    .line 167
    iget-object v1, p0, Lcom/roidapp/photogrid/c/f;->b:Ljava/lang/String;

    .line 176
    const/16 v0, 0x2f

    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 177
    iget-object v3, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v3}, Lcom/roidapp/photogrid/c/d;->d(Lcom/roidapp/photogrid/c/d;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "size"

    const/16 v6, 0x2766

    invoke-interface {v3, v4, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v7

    .line 179
    new-instance v8, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v4}, Lcom/roidapp/photogrid/c/d;->e(Lcom/roidapp/photogrid/c/d;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 181
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    invoke-static {v0}, Lcom/roidapp/photogrid/c/d;->f(Lcom/roidapp/photogrid/c/d;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 186
    const/16 v0, 0x5000

    new-array v0, v0, [B

    move-object v6, v0

    .line 193
    :goto_0
    new-instance v9, Ljava/net/URL;

    invoke-direct {v9, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 194
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_12
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 195
    :try_start_1
    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 196
    const/16 v1, 0x4e20

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 197
    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 198
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_13
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_d
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 199
    :try_start_2
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_14
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_e
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-result-object v2

    move-object v1, v3

    move-object v4, v0

    move-object v3, v2

    move v0, v5

    .line 200
    :goto_1
    :try_start_3
    invoke-virtual {v3, v6}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v10, -0x1

    if-eq v2, v10, :cond_1

    .line 201
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->f()Z

    move-result v10

    if-eqz v10, :cond_5

    .line 202
    iget-object v0, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    const/4 v2, 0x7

    const/4 v5, 0x0

    invoke-static {v0, v2, v5}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V
    :try_end_3
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_15
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_f
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 241
    :cond_1
    :goto_2
    if-eqz v3, :cond_2

    .line 242
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 245
    :cond_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 247
    if-eqz v4, :cond_3

    .line 248
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 254
    :cond_3
    :goto_3
    return-void

    .line 188
    :cond_4
    const/16 v0, 0x800

    :try_start_5
    new-array v0, v0, [B
    :try_end_5
    .catch Ljava/net/MalformedURLException; {:try_start_5 .. :try_end_5} :catch_12
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-object v6, v0

    goto :goto_0

    .line 205
    :cond_5
    :try_start_6
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->g()Z

    move-result v10

    if-eqz v10, :cond_10

    .line 206
    monitor-enter p0
    :try_end_6
    .catch Ljava/net/MalformedURLException; {:try_start_6 .. :try_end_6} :catch_15
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_f
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_a
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 207
    :try_start_7
    iget-object v0, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;I)I

    .line 210
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 211
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 212
    :try_start_8
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 214
    :try_start_9
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    .line 215
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->e()Z

    .line 216
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    move-object v1, v2

    move-object v4, v0

    move-object v2, v3

    move v0, v5

    move v3, v5

    .line 219
    :goto_4
    const/4 v10, 0x0

    :try_start_a
    invoke-virtual {v1, v6, v10, v0}, Ljava/io/FileOutputStream;->write([BII)V

    .line 220
    add-int/2addr v0, v3

    .line 221
    if-ne v0, v7, :cond_8

    .line 222
    iget-object v0, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    const/4 v3, 0x3

    invoke-static {v8}, Lcom/roidapp/photogrid/c/a;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v3, v5}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    const/4 v3, 0x4

    const/4 v5, 0x0

    invoke-static {v0, v3, v5}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V
    :try_end_a
    .catch Ljava/net/MalformedURLException; {:try_start_a .. :try_end_a} :catch_16
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_11
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_c
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    move-object v3, v2

    .line 225
    goto :goto_2

    .line 216
    :catchall_0
    move-exception v0

    move-object v2, v3

    move-object v3, v4

    :goto_5
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    :try_start_c
    throw v0
    :try_end_c
    .catch Ljava/net/MalformedURLException; {:try_start_c .. :try_end_c} :catch_0
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_10
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_b
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 230
    :catch_0
    move-exception v0

    move-object v4, v3

    .line 231
    :goto_6
    :try_start_d
    const-string v3, "DownloadMainLite"

    invoke-virtual {v0}, Ljava/net/MalformedURLException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    iget-object v3, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    const/4 v5, 0x5

    invoke-virtual {v0}, Ljava/net/MalformedURLException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v5, v0}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 241
    if-eqz v2, :cond_6

    .line 242
    :try_start_e
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 244
    :cond_6
    if-eqz v1, :cond_7

    .line 245
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 247
    :cond_7
    if-eqz v4, :cond_3

    .line 248
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_1

    goto :goto_3

    .line 250
    :catch_1
    move-exception v0

    .line 251
    const-string v1, "DownloadMainLite"

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    iget-object v1, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v12, v0}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 227
    :cond_8
    :try_start_f
    iget-object v3, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    int-to-float v10, v0

    const/high16 v11, 0x42c80000    # 100.0f

    mul-float/2addr v10, v11

    int-to-float v11, v7

    div-float/2addr v10, v11

    float-to-int v10, v10

    invoke-static {v3, v10}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;I)I

    .line 228
    iget-object v3, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static {v3, v10, v11}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V
    :try_end_f
    .catch Ljava/net/MalformedURLException; {:try_start_f .. :try_end_f} :catch_16
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_11
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_c
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    move-object v3, v2

    goto/16 :goto_1

    .line 250
    :catch_2
    move-exception v0

    .line 251
    const-string v1, "DownloadMainLite"

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    iget-object v1, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v12, v0}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 233
    :catch_3
    move-exception v0

    move-object v3, v2

    move-object v4, v2

    .line 234
    :goto_7
    :try_start_10
    const-string v1, "DownloadMainLite"

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    iget-object v1, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    const/4 v5, 0x5

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v5, v0}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 241
    if-eqz v3, :cond_9

    .line 242
    :try_start_11
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 244
    :cond_9
    if-eqz v2, :cond_a

    .line 245
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 247
    :cond_a
    if-eqz v4, :cond_3

    .line 248
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_4

    goto/16 :goto_3

    .line 250
    :catch_4
    move-exception v0

    .line 251
    const-string v1, "DownloadMainLite"

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    iget-object v1, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v12, v0}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 236
    :catch_5
    move-exception v0

    move-object v3, v2

    move-object v4, v2

    .line 237
    :goto_8
    :try_start_12
    const-string v1, "DownloadMainLite"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    iget-object v1, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    const/4 v5, 0x5

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v5, v0}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 241
    if-eqz v3, :cond_b

    .line 242
    :try_start_13
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 244
    :cond_b
    if-eqz v2, :cond_c

    .line 245
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 247
    :cond_c
    if-eqz v4, :cond_3

    .line 248
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_6

    goto/16 :goto_3

    .line 250
    :catch_6
    move-exception v0

    .line 251
    const-string v1, "DownloadMainLite"

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    iget-object v1, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v12, v0}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 240
    :catchall_1
    move-exception v0

    move-object v3, v2

    move-object v4, v2

    .line 241
    :goto_9
    if-eqz v3, :cond_d

    .line 242
    :try_start_14
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 244
    :cond_d
    if-eqz v2, :cond_e

    .line 245
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 247
    :cond_e
    if-eqz v4, :cond_f

    .line 248
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_7

    .line 253
    :cond_f
    :goto_a
    throw v0

    .line 250
    :catch_7
    move-exception v1

    .line 251
    const-string v2, "DownloadMainLite"

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    iget-object v2, p0, Lcom/roidapp/photogrid/c/f;->a:Lcom/roidapp/photogrid/c/d;

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v12, v1}, Lcom/roidapp/photogrid/c/d;->a(Lcom/roidapp/photogrid/c/d;ILjava/lang/Object;)V

    goto :goto_a

    .line 240
    :catchall_2
    move-exception v1

    move-object v3, v2

    move-object v4, v0

    move-object v0, v1

    goto :goto_9

    :catchall_3
    move-exception v1

    move-object v4, v0

    move-object v0, v1

    move-object v13, v2

    move-object v2, v3

    move-object v3, v13

    goto :goto_9

    :catchall_4
    move-exception v0

    move-object v2, v1

    goto :goto_9

    :catchall_5
    move-exception v0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto :goto_9

    :catchall_6
    move-exception v0

    move-object v3, v2

    move-object v2, v1

    goto :goto_9

    :catchall_7
    move-exception v0

    goto :goto_9

    .line 236
    :catch_8
    move-exception v1

    move-object v3, v2

    move-object v4, v0

    move-object v0, v1

    goto :goto_8

    :catch_9
    move-exception v1

    move-object v4, v0

    move-object v0, v1

    move-object v13, v2

    move-object v2, v3

    move-object v3, v13

    goto/16 :goto_8

    :catch_a
    move-exception v0

    move-object v2, v1

    goto/16 :goto_8

    :catch_b
    move-exception v0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto/16 :goto_8

    :catch_c
    move-exception v0

    move-object v3, v2

    move-object v2, v1

    goto/16 :goto_8

    .line 233
    :catch_d
    move-exception v1

    move-object v3, v2

    move-object v4, v0

    move-object v0, v1

    goto/16 :goto_7

    :catch_e
    move-exception v1

    move-object v4, v0

    move-object v0, v1

    move-object v13, v2

    move-object v2, v3

    move-object v3, v13

    goto/16 :goto_7

    :catch_f
    move-exception v0

    move-object v2, v1

    goto/16 :goto_7

    :catch_10
    move-exception v0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto/16 :goto_7

    :catch_11
    move-exception v0

    move-object v3, v2

    move-object v2, v1

    goto/16 :goto_7

    .line 230
    :catch_12
    move-exception v0

    move-object v1, v2

    move-object v4, v2

    goto/16 :goto_6

    :catch_13
    move-exception v1

    move-object v4, v0

    move-object v0, v1

    move-object v1, v2

    goto/16 :goto_6

    :catch_14
    move-exception v1

    move-object v4, v0

    move-object v0, v1

    move-object v1, v3

    goto/16 :goto_6

    :catch_15
    move-exception v0

    move-object v2, v3

    goto/16 :goto_6

    :catch_16
    move-exception v0

    goto/16 :goto_6

    .line 216
    :catchall_8
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    goto/16 :goto_5

    :catchall_9
    move-exception v1

    move-object v13, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v0

    move-object v0, v13

    goto/16 :goto_5

    :catchall_a
    move-exception v0

    goto/16 :goto_5

    :cond_10
    move-object v13, v3

    move v3, v0

    move v0, v2

    move-object v2, v13

    goto/16 :goto_4
.end method
