.class final Lcom/roidapp/baselib/b/m;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/b/k;

.field private b:Ljava/lang/Object;

.field private c:Lcom/roidapp/baselib/b/p;

.field private final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/ProgressBar;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/baselib/b/k;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Lcom/roidapp/baselib/b/p;)V
    .locals 1

    .prologue
    .line 151
    iput-object p1, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 152
    iput-object p4, p0, Lcom/roidapp/baselib/b/m;->c:Lcom/roidapp/baselib/b/p;

    .line 153
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/baselib/b/m;->d:Ljava/lang/ref/WeakReference;

    .line 154
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/baselib/b/m;->e:Ljava/lang/ref/WeakReference;

    .line 155
    return-void
.end method

.method private a()Landroid/widget/ImageView;
    .locals 2

    .prologue
    .line 377
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 378
    invoke-static {v0}, Lcom/roidapp/baselib/b/k;->b(Landroid/widget/ImageView;)Lcom/roidapp/baselib/b/m;

    move-result-object v1

    .line 380
    if-ne p0, v1, :cond_0

    .line 384
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/baselib/b/m;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->b:Ljava/lang/Object;

    return-object v0
.end method

.method private varargs a([Ljava/lang/Object;)Ljava/lang/String;
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v1, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 162
    aget-object v0, p1, v8

    iput-object v0, p0, Lcom/roidapp/baselib/b/m;->b:Ljava/lang/Object;

    .line 163
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->b:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    iget-object v2, v2, Lcom/roidapp/baselib/b/k;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".download_temp"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 166
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v0}, Lcom/roidapp/baselib/b/k;->a(Lcom/roidapp/baselib/b/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    iget-object v2, v2, Lcom/roidapp/baselib/b/k;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/baselib/d/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 178
    :goto_0
    iget-object v2, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v2}, Lcom/roidapp/baselib/b/k;->b(Lcom/roidapp/baselib/b/k;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 179
    :goto_1
    :try_start_0
    iget-object v5, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    iget-boolean v5, v5, Lcom/roidapp/baselib/b/k;->a:Z

    if-eqz v5, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/baselib/b/m;->isCancelled()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    if-nez v5, :cond_1

    .line 181
    :try_start_1
    iget-object v5, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v5}, Lcom/roidapp/baselib/b/k;->b(Lcom/roidapp/baselib/b/k;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 182
    :catch_0
    move-exception v5

    goto :goto_1

    .line 170
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    iget-object v2, v2, Lcom/roidapp/baselib/b/k;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lcom/roidapp/baselib/d/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 184
    :cond_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 186
    invoke-virtual {p0}, Lcom/roidapp/baselib/b/m;->isCancelled()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-direct {p0}, Lcom/roidapp/baselib/b/m;->a()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v2}, Lcom/roidapp/baselib/b/k;->c(Lcom/roidapp/baselib/b/k;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 188
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 189
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v6

    cmp-long v5, v6, v10

    if-lez v5, :cond_3

    .line 190
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 191
    iput-boolean v9, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 192
    invoke-static {v0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 193
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v6, :cond_2

    iget v5, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v5, :cond_2

    .line 195
    new-array v1, v9, [Ljava/lang/Integer;

    const/16 v2, 0x64

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v8

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/b/m;->publishProgress([Ljava/lang/Object;)V

    .line 254
    :goto_2
    return-object v0

    .line 184
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 198
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 203
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/baselib/b/m;->isCancelled()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-direct {p0}, Lcom/roidapp/baselib/b/m;->a()Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v2}, Lcom/roidapp/baselib/b/k;->c(Lcom/roidapp/baselib/b/k;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 207
    :try_start_4
    iget-object v2, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    iget-object v2, v2, Lcom/roidapp/baselib/b/k;->c:Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 208
    new-instance v2, Ljava/io/File;

    iget-object v5, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    iget-object v5, v5, Lcom/roidapp/baselib/b/k;->c:Ljava/lang/String;

    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 209
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_4

    .line 210
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 212
    :cond_4
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 213
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 214
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 216
    :cond_5
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 217
    :try_start_5
    invoke-direct {p0, v3, v2}, Lcom/roidapp/baselib/b/m;->a(Ljava/lang/String;Ljava/io/OutputStream;)Z

    move-result v3

    .line 218
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 219
    if-eqz v3, :cond_6

    .line 220
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v6

    cmp-long v3, v6, v10

    if-lez v3, :cond_7

    .line 221
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_8
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-result v3

    .line 222
    if-eqz v3, :cond_7

    .line 241
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    .line 242
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_2

    .line 244
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_2

    .line 228
    :cond_6
    :try_start_7
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 229
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 241
    :cond_7
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    .line 242
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    :cond_8
    :goto_3
    move-object v0, v1

    .line 254
    goto/16 :goto_2

    .line 244
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    .line 232
    :catch_3
    move-exception v0

    move-object v2, v1

    .line 233
    :goto_4
    :try_start_9
    const-string v3, "NetworkImageFetcher"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 234
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 239
    if-eqz v2, :cond_8

    .line 241
    :try_start_a
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    .line 242
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    goto :goto_3

    .line 244
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    .line 235
    :catch_5
    move-exception v0

    move-object v2, v1

    .line 236
    :goto_5
    :try_start_b
    const-string v3, "NetworkImageFetcher"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "doInBackground - "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 239
    if-eqz v2, :cond_8

    .line 241
    :try_start_c
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    .line 242
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    goto :goto_3

    .line 244
    :catch_6
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    .line 239
    :catchall_1
    move-exception v0

    move-object v2, v1

    :goto_6
    if-eqz v2, :cond_9

    .line 241
    :try_start_d
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    .line 242
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    .line 245
    :cond_9
    :goto_7
    throw v0

    .line 244
    :catch_7
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_7

    .line 239
    :catchall_2
    move-exception v0

    goto :goto_6

    .line 235
    :catch_8
    move-exception v0

    goto :goto_5

    .line 232
    :catch_9
    move-exception v0

    goto :goto_4
.end method

.method private a(Ljava/lang/String;Ljava/io/OutputStream;)Z
    .locals 13

    .prologue
    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 267
    .line 273
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 274
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    const/16 v3, 0x2710

    :try_start_1
    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 276
    const/16 v3, 0x2710

    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 277
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    const/16 v6, 0x2000

    invoke-direct {v3, v5, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 279
    :try_start_2
    new-instance v5, Ljava/io/BufferedOutputStream;

    const/16 v6, 0x2000

    invoke-direct {v5, p2, v6}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 282
    :try_start_3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v6

    move v4, v2

    .line 286
    :cond_0
    :goto_0
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->read()I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_5

    .line 287
    invoke-virtual {v5, v7}, Ljava/io/BufferedOutputStream;->write(I)V

    .line 289
    add-int/lit8 v4, v4, 0x1

    .line 290
    rem-int/lit16 v7, v4, 0x200

    if-nez v7, :cond_0

    .line 291
    int-to-double v8, v4

    int-to-double v10, v6

    div-double/2addr v8, v10

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    mul-double/2addr v8, v10

    double-to-int v7, v8

    .line 292
    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Integer;

    const/4 v9, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v8, v9

    invoke-virtual {p0, v8}, Lcom/roidapp/baselib/b/m;->publishProgress([Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_0

    .line 305
    :catch_0
    move-exception v1

    move-object v4, v5

    move-object v12, v3

    move-object v3, v0

    move-object v0, v1

    move-object v1, v12

    .line 306
    :goto_1
    :try_start_4
    iget-object v5, p0, Lcom/roidapp/baselib/b/m;->c:Lcom/roidapp/baselib/b/p;

    if-eqz v5, :cond_1

    .line 307
    iget-object v5, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v5}, Lcom/roidapp/baselib/b/k;->d(Lcom/roidapp/baselib/b/k;)Landroid/os/Handler;

    move-result-object v5

    new-instance v6, Lcom/roidapp/baselib/b/o;

    invoke-direct {v6, p0, p1, v0}, Lcom/roidapp/baselib/b/o;-><init>(Lcom/roidapp/baselib/b/m;Ljava/lang/String;Ljava/lang/Exception;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 315
    :cond_1
    if-eqz v3, :cond_2

    .line 316
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 319
    :cond_2
    if-eqz v4, :cond_3

    .line 320
    :try_start_5
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 322
    :cond_3
    if-eqz v1, :cond_4

    .line 323
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    :cond_4
    :goto_2
    move v0, v2

    .line 328
    :goto_3
    return v0

    .line 296
    :cond_5
    :try_start_6
    iget-object v4, p0, Lcom/roidapp/baselib/b/m;->c:Lcom/roidapp/baselib/b/p;

    if-eqz v4, :cond_6

    .line 297
    iget-object v4, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v4}, Lcom/roidapp/baselib/b/k;->d(Lcom/roidapp/baselib/b/k;)Landroid/os/Handler;

    move-result-object v4

    new-instance v6, Lcom/roidapp/baselib/b/n;

    invoke-direct {v6, p0, p1}, Lcom/roidapp/baselib/b/n;-><init>(Lcom/roidapp/baselib/b/m;Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 315
    :cond_6
    if-eqz v0, :cond_7

    .line 316
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 320
    :cond_7
    :try_start_7
    invoke-virtual {v5}, Ljava/io/BufferedOutputStream;->close()V

    .line 323
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    :goto_4
    move v0, v1

    .line 326
    goto :goto_3

    .line 315
    :catchall_0
    move-exception v0

    move-object v3, v4

    move-object v1, v4

    :goto_5
    if-eqz v1, :cond_8

    .line 316
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 319
    :cond_8
    if-eqz v4, :cond_9

    .line 320
    :try_start_8
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 322
    :cond_9
    if-eqz v3, :cond_a

    .line 323
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    .line 326
    :cond_a
    :goto_6
    throw v0

    :catch_1
    move-exception v1

    goto :goto_6

    .line 315
    :catchall_1
    move-exception v1

    move-object v3, v4

    move-object v12, v1

    move-object v1, v0

    move-object v0, v12

    goto :goto_5

    :catchall_2
    move-exception v1

    move-object v12, v1

    move-object v1, v0

    move-object v0, v12

    goto :goto_5

    :catchall_3
    move-exception v1

    move-object v4, v5

    move-object v12, v1

    move-object v1, v0

    move-object v0, v12

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v12, v1

    move-object v1, v3

    move-object v3, v12

    goto :goto_5

    .line 327
    :catch_2
    move-exception v0

    goto :goto_2

    .line 305
    :catch_3
    move-exception v0

    move-object v1, v4

    move-object v3, v4

    goto :goto_1

    :catch_4
    move-exception v1

    move-object v3, v0

    move-object v0, v1

    move-object v1, v4

    goto :goto_1

    :catch_5
    move-exception v1

    move-object v12, v1

    move-object v1, v3

    move-object v3, v0

    move-object v0, v12

    goto :goto_1

    :catch_6
    move-exception v0

    goto :goto_4
.end method

.method static synthetic b(Lcom/roidapp/baselib/b/m;)Lcom/roidapp/baselib/b/p;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->c:Lcom/roidapp/baselib/b/p;

    return-object v0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 144
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/b/m;->a([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onCancelled(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 144
    check-cast p1, Ljava/lang/String;

    .line 1361
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/c;->onCancelled(Ljava/lang/Object;)V

    .line 1362
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v0}, Lcom/roidapp/baselib/b/k;->b(Lcom/roidapp/baselib/b/k;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 1363
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v0}, Lcom/roidapp/baselib/b/k;->b(Lcom/roidapp/baselib/b/k;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 1364
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1365
    const-string v0, "NetworkImageFetcher"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cancel in downloadBitmap - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/baselib/b/m;->b:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    return-void

    .line 1364
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 144
    check-cast p1, Ljava/lang/String;

    .line 2350
    invoke-virtual {p0}, Lcom/roidapp/baselib/b/m;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->a:Lcom/roidapp/baselib/b/k;

    invoke-static {v0}, Lcom/roidapp/baselib/b/k;->c(Lcom/roidapp/baselib/b/k;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2351
    :cond_0
    const/4 p1, 0x0

    .line 2354
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->c:Lcom/roidapp/baselib/b/p;

    if-eqz v0, :cond_2

    .line 2355
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->c:Lcom/roidapp/baselib/b/p;

    iget-object v1, p0, Lcom/roidapp/baselib/b/m;->b:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/roidapp/baselib/b/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    :cond_2
    return-void
.end method

.method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 144
    check-cast p1, [Ljava/lang/Integer;

    .line 2333
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->d:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 2334
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    .line 2335
    if-eqz v0, :cond_0

    .line 2336
    aget-object v1, p1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 2338
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->c:Lcom/roidapp/baselib/b/p;

    if-eqz v0, :cond_1

    .line 2339
    iget-object v0, p0, Lcom/roidapp/baselib/b/m;->c:Lcom/roidapp/baselib/b/p;

    iget-object v1, p0, Lcom/roidapp/baselib/b/m;->b:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    aget-object v1, p1, v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/roidapp/baselib/b/p;->a(I)V

    .line 144
    :cond_1
    return-void
.end method
