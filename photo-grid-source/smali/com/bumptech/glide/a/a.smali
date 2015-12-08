.class public final Lcom/bumptech/glide/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field final a:Ljava/util/concurrent/ThreadPoolExecutor;

.field private final b:Ljava/io/File;

.field private final c:Ljava/io/File;

.field private final d:Ljava/io/File;

.field private final e:Ljava/io/File;

.field private final f:I

.field private g:J

.field private final h:I

.field private i:J

.field private j:Ljava/io/Writer;

.field private final k:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/bumptech/glide/a/d;",
            ">;"
        }
    .end annotation
.end field

.field private l:I

.field private m:J

.field private final n:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/io/File;J)V
    .locals 8

    .prologue
    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    iput-wide v4, p0, Lcom/bumptech/glide/a/a;->i:J

    .line 146
    new-instance v0, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-direct {v0, v2, v1, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    .line 155
    iput-wide v4, p0, Lcom/bumptech/glide/a/a;->m:J

    .line 158
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, Lcom/bumptech/glide/a/a;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 160
    new-instance v0, Lcom/bumptech/glide/a/b;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/a/b;-><init>(Lcom/bumptech/glide/a/a;)V

    iput-object v0, p0, Lcom/bumptech/glide/a/a;->n:Ljava/util/concurrent/Callable;

    .line 177
    iput-object p1, p0, Lcom/bumptech/glide/a/a;->b:Ljava/io/File;

    .line 178
    iput v3, p0, Lcom/bumptech/glide/a/a;->f:I

    .line 179
    new-instance v0, Ljava/io/File;

    const-string v1, "journal"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bumptech/glide/a/a;->c:Ljava/io/File;

    .line 180
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.tmp"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bumptech/glide/a/a;->d:Ljava/io/File;

    .line 181
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.bkp"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bumptech/glide/a/a;->e:Ljava/io/File;

    .line 182
    iput v3, p0, Lcom/bumptech/glide/a/a;->h:I

    .line 183
    iput-wide p2, p0, Lcom/bumptech/glide/a/a;->g:J

    .line 184
    return-void
.end method

.method public static a(Ljava/io/File;J)Lcom/bumptech/glide/a/a;
    .locals 5

    .prologue
    .line 197
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 198
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxSize <= 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, "journal.bkp"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 206
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 207
    new-instance v1, Ljava/io/File;

    const-string v2, "journal"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 209
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 210
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 217
    :cond_1
    :goto_0
    new-instance v0, Lcom/bumptech/glide/a/a;

    invoke-direct {v0, p0, p1, p2}, Lcom/bumptech/glide/a/a;-><init>(Ljava/io/File;J)V

    .line 218
    iget-object v1, v0, Lcom/bumptech/glide/a/a;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 220
    :try_start_0
    invoke-direct {v0}, Lcom/bumptech/glide/a/a;->a()V

    .line 221
    invoke-direct {v0}, Lcom/bumptech/glide/a/a;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 238
    :goto_1
    return-object v0

    .line 212
    :cond_2
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/a/a;->a(Ljava/io/File;Ljava/io/File;Z)V

    goto :goto_0

    .line 223
    :catch_0
    move-exception v1

    .line 224
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DiskLruCache "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " is corrupt: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", removing"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 1657
    invoke-virtual {v0}, Lcom/bumptech/glide/a/a;->close()V

    .line 1658
    iget-object v0, v0, Lcom/bumptech/glide/a/a;->b:Ljava/io/File;

    invoke-static {v0}, Lcom/bumptech/glide/a/h;->a(Ljava/io/File;)V

    .line 235
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 236
    new-instance v0, Lcom/bumptech/glide/a/a;

    invoke-direct {v0, p0, p1, p2}, Lcom/bumptech/glide/a/a;-><init>(Ljava/io/File;J)V

    .line 237
    invoke-direct {v0}, Lcom/bumptech/glide/a/a;->c()V

    goto :goto_1
.end method

.method static synthetic a(Lcom/bumptech/glide/a/a;)Ljava/io/Writer;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    return-object v0
.end method

.method private a()V
    .locals 10

    .prologue
    const/4 v9, 0x5

    const/4 v0, 0x0

    const/4 v8, -0x1

    .line 242
    new-instance v3, Lcom/bumptech/glide/a/f;

    new-instance v1, Ljava/io/FileInputStream;

    iget-object v2, p0, Lcom/bumptech/glide/a/a;->c:Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    sget-object v2, Lcom/bumptech/glide/a/h;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, v1, v2}, Lcom/bumptech/glide/a/f;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 244
    :try_start_0
    invoke-virtual {v3}, Lcom/bumptech/glide/a/f;->a()Ljava/lang/String;

    move-result-object v1

    .line 245
    invoke-virtual {v3}, Lcom/bumptech/glide/a/f;->a()Ljava/lang/String;

    move-result-object v2

    .line 246
    invoke-virtual {v3}, Lcom/bumptech/glide/a/f;->a()Ljava/lang/String;

    move-result-object v4

    .line 247
    invoke-virtual {v3}, Lcom/bumptech/glide/a/f;->a()Ljava/lang/String;

    move-result-object v5

    .line 248
    invoke-virtual {v3}, Lcom/bumptech/glide/a/f;->a()Ljava/lang/String;

    move-result-object v6

    .line 249
    const-string v7, "libcore.io.DiskLruCache"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "1"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    iget v7, p0, Lcom/bumptech/glide/a/a;->f:I

    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget v4, p0, Lcom/bumptech/glide/a/a;->h:I

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, ""

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 254
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "unexpected journal header: ["

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ", "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    :catchall_0
    move-exception v0

    invoke-static {v3}, Lcom/bumptech/glide/a/h;->a(Ljava/io/Closeable;)V

    throw v0

    :cond_1
    move v1, v0

    .line 261
    :goto_0
    :try_start_1
    invoke-virtual {v3}, Lcom/bumptech/glide/a/f;->a()Ljava/lang/String;

    move-result-object v4

    .line 2282
    const/16 v0, 0x20

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    .line 2283
    if-ne v5, v8, :cond_2

    .line 2284
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "unexpected journal line: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 267
    :catch_0
    move-exception v0

    :try_start_2
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    sub-int v0, v1, v0

    iput v0, p0, Lcom/bumptech/glide/a/a;->l:I

    .line 270
    invoke-virtual {v3}, Lcom/bumptech/glide/a/f;->b()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 271
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 277
    :goto_1
    invoke-static {v3}, Lcom/bumptech/glide/a/h;->a(Ljava/io/Closeable;)V

    .line 278
    return-void

    .line 2287
    :cond_2
    add-int/lit8 v0, v5, 0x1

    .line 2288
    const/16 v2, 0x20

    :try_start_3
    invoke-virtual {v4, v2, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    .line 2290
    if-ne v6, v8, :cond_4

    .line 2291
    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 2292
    const/4 v2, 0x6

    if-ne v5, v2, :cond_a

    const-string v2, "REMOVE"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 2293
    iget-object v2, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    :cond_3
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 265
    goto :goto_0

    .line 2297
    :cond_4
    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 2300
    :goto_3
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/a/d;

    .line 2301
    if-nez v0, :cond_5

    .line 2302
    new-instance v0, Lcom/bumptech/glide/a/d;

    const/4 v7, 0x0

    invoke-direct {v0, p0, v2, v7}, Lcom/bumptech/glide/a/d;-><init>(Lcom/bumptech/glide/a/a;Ljava/lang/String;B)V

    .line 2303
    iget-object v7, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2306
    :cond_5
    if-eq v6, v8, :cond_6

    if-ne v5, v9, :cond_6

    const-string v2, "CLEAN"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2307
    add-int/lit8 v2, v6, 0x1

    invoke-virtual {v4, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 2308
    invoke-static {v0}, Lcom/bumptech/glide/a/d;->a(Lcom/bumptech/glide/a/d;)Z

    .line 2309
    const/4 v4, 0x0

    invoke-static {v0, v4}, Lcom/bumptech/glide/a/d;->a(Lcom/bumptech/glide/a/d;Lcom/bumptech/glide/a/c;)Lcom/bumptech/glide/a/c;

    .line 2310
    invoke-static {v0, v2}, Lcom/bumptech/glide/a/d;->a(Lcom/bumptech/glide/a/d;[Ljava/lang/String;)V

    goto :goto_2

    .line 2311
    :cond_6
    if-ne v6, v8, :cond_7

    if-ne v5, v9, :cond_7

    const-string v2, "DIRTY"

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 2312
    new-instance v2, Lcom/bumptech/glide/a/c;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v0, v4}, Lcom/bumptech/glide/a/c;-><init>(Lcom/bumptech/glide/a/a;Lcom/bumptech/glide/a/d;B)V

    invoke-static {v0, v2}, Lcom/bumptech/glide/a/d;->a(Lcom/bumptech/glide/a/d;Lcom/bumptech/glide/a/c;)Lcom/bumptech/glide/a/c;

    goto :goto_2

    .line 2313
    :cond_7
    if-ne v6, v8, :cond_8

    const/4 v0, 0x4

    if-ne v5, v0, :cond_8

    const-string v0, "READ"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2316
    :cond_8
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "unexpected journal line: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/io/EOFException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 273
    :cond_9
    :try_start_4
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v4, p0, Lcom/bumptech/glide/a/a;->c:Ljava/io/File;

    const/4 v5, 0x1

    invoke-direct {v2, v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    sget-object v4, Lcom/bumptech/glide/a/h;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_1

    :cond_a
    move-object v2, v0

    goto/16 :goto_3
.end method

.method static synthetic a(Lcom/bumptech/glide/a/a;Lcom/bumptech/glide/a/c;Z)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/a/a;->a(Lcom/bumptech/glide/a/c;Z)V

    return-void
.end method

.method private declared-synchronized a(Lcom/bumptech/glide/a/c;Z)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    .line 502
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/bumptech/glide/a/c;->a(Lcom/bumptech/glide/a/c;)Lcom/bumptech/glide/a/d;

    move-result-object v2

    .line 503
    invoke-static {v2}, Lcom/bumptech/glide/a/d;->b(Lcom/bumptech/glide/a/d;)Lcom/bumptech/glide/a/c;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 504
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 502
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 508
    :cond_0
    if-eqz p2, :cond_4

    :try_start_1
    invoke-static {v2}, Lcom/bumptech/glide/a/d;->e(Lcom/bumptech/glide/a/d;)Z

    move-result v1

    if-nez v1, :cond_4

    move v1, v0

    .line 509
    :goto_0
    iget v3, p0, Lcom/bumptech/glide/a/a;->h:I

    if-ge v1, v3, :cond_4

    .line 510
    invoke-static {p1}, Lcom/bumptech/glide/a/c;->b(Lcom/bumptech/glide/a/c;)[Z

    move-result-object v3

    aget-boolean v3, v3, v1

    if-nez v3, :cond_1

    .line 511
    invoke-virtual {p1}, Lcom/bumptech/glide/a/c;->c()V

    .line 512
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Newly created entry didn\'t create value for index "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3872
    :cond_1
    iget-object v3, v2, Lcom/bumptech/glide/a/d;->b:[Ljava/io/File;

    aget-object v3, v3, v1

    .line 514
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_3

    .line 515
    invoke-virtual {p1}, Lcom/bumptech/glide/a/c;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 562
    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    .line 509
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 521
    :cond_4
    :goto_2
    :try_start_2
    iget v1, p0, Lcom/bumptech/glide/a/a;->h:I

    if-ge v0, v1, :cond_7

    .line 4872
    iget-object v1, v2, Lcom/bumptech/glide/a/d;->b:[Ljava/io/File;

    aget-object v1, v1, v0

    .line 523
    if-eqz p2, :cond_6

    .line 524
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 5868
    iget-object v3, v2, Lcom/bumptech/glide/a/d;->a:[Ljava/io/File;

    aget-object v3, v3, v0

    .line 526
    invoke-virtual {v1, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 527
    invoke-static {v2}, Lcom/bumptech/glide/a/d;->c(Lcom/bumptech/glide/a/d;)[J

    move-result-object v1

    aget-wide v4, v1, v0

    .line 528
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 529
    invoke-static {v2}, Lcom/bumptech/glide/a/d;->c(Lcom/bumptech/glide/a/d;)[J

    move-result-object v1

    aput-wide v6, v1, v0

    .line 530
    iget-wide v8, p0, Lcom/bumptech/glide/a/a;->i:J

    sub-long v4, v8, v4

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/bumptech/glide/a/a;->i:J

    .line 521
    :cond_5
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 533
    :cond_6
    invoke-static {v1}, Lcom/bumptech/glide/a/a;->a(Ljava/io/File;)V

    goto :goto_3

    .line 537
    :cond_7
    iget v0, p0, Lcom/bumptech/glide/a/a;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/bumptech/glide/a/a;->l:I

    .line 538
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/bumptech/glide/a/d;->a(Lcom/bumptech/glide/a/d;Lcom/bumptech/glide/a/c;)Lcom/bumptech/glide/a/c;

    .line 539
    invoke-static {v2}, Lcom/bumptech/glide/a/d;->e(Lcom/bumptech/glide/a/d;)Z

    move-result v0

    or-int/2addr v0, p2

    if-eqz v0, :cond_a

    .line 540
    invoke-static {v2}, Lcom/bumptech/glide/a/d;->a(Lcom/bumptech/glide/a/d;)Z

    .line 541
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const-string v1, "CLEAN"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 542
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 543
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-static {v2}, Lcom/bumptech/glide/a/d;->d(Lcom/bumptech/glide/a/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 544
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-virtual {v2}, Lcom/bumptech/glide/a/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 545
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 547
    if-eqz p2, :cond_8

    .line 548
    iget-wide v0, p0, Lcom/bumptech/glide/a/a;->m:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v0

    iput-wide v4, p0, Lcom/bumptech/glide/a/a;->m:J

    invoke-static {v2, v0, v1}, Lcom/bumptech/glide/a/d;->a(Lcom/bumptech/glide/a/d;J)J

    .line 557
    :cond_8
    :goto_4
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 559
    iget-wide v0, p0, Lcom/bumptech/glide/a/a;->i:J

    iget-wide v2, p0, Lcom/bumptech/glide/a/a;->g:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_9

    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 560
    :cond_9
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Lcom/bumptech/glide/a/a;->n:Ljava/util/concurrent/Callable;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    goto/16 :goto_1

    .line 551
    :cond_a
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Lcom/bumptech/glide/a/d;->d(Lcom/bumptech/glide/a/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const-string v1, "REMOVE"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 553
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 554
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-static {v2}, Lcom/bumptech/glide/a/d;->d(Lcom/bumptech/glide/a/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 555
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4
.end method

.method private static a(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 387
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 388
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 390
    :cond_0
    return-void
.end method

.method private static a(Ljava/io/File;Ljava/io/File;Z)V
    .locals 1

    .prologue
    .line 393
    if-eqz p2, :cond_0

    .line 394
    invoke-static {p1}, Lcom/bumptech/glide/a/a;->a(Ljava/io/File;)V

    .line 396
    :cond_0
    invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 397
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 399
    :cond_1
    return-void
.end method

.method private b()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 325
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->d:Ljava/io/File;

    invoke-static {v0}, Lcom/bumptech/glide/a/a;->a(Ljava/io/File;)V

    .line 326
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 327
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/a/d;

    .line 328
    invoke-static {v0}, Lcom/bumptech/glide/a/d;->b(Lcom/bumptech/glide/a/d;)Lcom/bumptech/glide/a/c;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, v2

    .line 329
    :goto_1
    iget v4, p0, Lcom/bumptech/glide/a/a;->h:I

    if-ge v1, v4, :cond_0

    .line 330
    iget-wide v4, p0, Lcom/bumptech/glide/a/a;->i:J

    invoke-static {v0}, Lcom/bumptech/glide/a/d;->c(Lcom/bumptech/glide/a/d;)[J

    move-result-object v6

    aget-wide v6, v6, v1

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/bumptech/glide/a/a;->i:J

    .line 329
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 333
    :cond_1
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/bumptech/glide/a/d;->a(Lcom/bumptech/glide/a/d;Lcom/bumptech/glide/a/c;)Lcom/bumptech/glide/a/c;

    move v1, v2

    .line 334
    :goto_2
    iget v4, p0, Lcom/bumptech/glide/a/a;->h:I

    if-ge v1, v4, :cond_2

    .line 2868
    iget-object v4, v0, Lcom/bumptech/glide/a/d;->a:[Ljava/io/File;

    aget-object v4, v4, v1

    .line 335
    invoke-static {v4}, Lcom/bumptech/glide/a/a;->a(Ljava/io/File;)V

    .line 2872
    iget-object v4, v0, Lcom/bumptech/glide/a/d;->b:[Ljava/io/File;

    aget-object v4, v4, v1

    .line 336
    invoke-static {v4}, Lcom/bumptech/glide/a/a;->a(Ljava/io/File;)V

    .line 334
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 338
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 341
    :cond_3
    return-void
.end method

.method static synthetic b(Lcom/bumptech/glide/a/a;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->f()V

    return-void
.end method

.method private declared-synchronized c()V
    .locals 5

    .prologue
    .line 348
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    if-eqz v0, :cond_0

    .line 349
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 352
    :cond_0
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v0, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/bumptech/glide/a/a;->d:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sget-object v3, Lcom/bumptech/glide/a/h;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 355
    :try_start_1
    const-string v0, "libcore.io.DiskLruCache"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 356
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 357
    const-string v0, "1"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 358
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 359
    iget v0, p0, Lcom/bumptech/glide/a/a;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 360
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 361
    iget v0, p0, Lcom/bumptech/glide/a/a;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 362
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 363
    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/a/d;

    .line 366
    invoke-static {v0}, Lcom/bumptech/glide/a/d;->b(Lcom/bumptech/glide/a/d;)Lcom/bumptech/glide/a/c;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 367
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DIRTY "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/bumptech/glide/a/d;->d(Lcom/bumptech/glide/a/d;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 373
    :catchall_0
    move-exception v0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 348
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 369
    :cond_1
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CLEAN "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/bumptech/glide/a/d;->d(Lcom/bumptech/glide/a/d;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/bumptech/glide/a/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 373
    :cond_2
    :try_start_4
    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    .line 376
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 377
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->c:Ljava/io/File;

    iget-object v1, p0, Lcom/bumptech/glide/a/a;->e:Ljava/io/File;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/a/a;->a(Ljava/io/File;Ljava/io/File;Z)V

    .line 379
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->d:Ljava/io/File;

    iget-object v1, p0, Lcom/bumptech/glide/a/a;->c:Ljava/io/File;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/a/a;->a(Ljava/io/File;Ljava/io/File;Z)V

    .line 380
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 382
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/bumptech/glide/a/a;->c:Ljava/io/File;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    sget-object v3, Lcom/bumptech/glide/a/h;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 384
    monitor-exit p0

    return-void
.end method

.method static synthetic c(Lcom/bumptech/glide/a/a;)Z
    .locals 1

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->d()Z

    move-result v0

    return v0
.end method

.method private declared-synchronized d(Ljava/lang/String;)Lcom/bumptech/glide/a/c;
    .locals 6

    .prologue
    const/4 v1, 0x0

    const-wide/16 v4, -0x1

    .line 445
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->e()V

    .line 446
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/a/d;

    .line 447
    cmp-long v2, v4, v4

    if-eqz v2, :cond_1

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/bumptech/glide/a/d;->f(Lcom/bumptech/glide/a/d;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v2

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    :cond_0
    move-object v0, v1

    .line 467
    :goto_0
    monitor-exit p0

    return-object v0

    .line 451
    :cond_1
    if-nez v0, :cond_2

    .line 452
    :try_start_1
    new-instance v0, Lcom/bumptech/glide/a/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/bumptech/glide/a/d;-><init>(Lcom/bumptech/glide/a/a;Ljava/lang/String;B)V

    .line 453
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    .line 458
    :goto_1
    new-instance v0, Lcom/bumptech/glide/a/c;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/bumptech/glide/a/c;-><init>(Lcom/bumptech/glide/a/a;Lcom/bumptech/glide/a/d;B)V

    .line 459
    invoke-static {v1, v0}, Lcom/bumptech/glide/a/d;->a(Lcom/bumptech/glide/a/d;Lcom/bumptech/glide/a/c;)Lcom/bumptech/glide/a/c;

    .line 462
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const-string v2, "DIRTY"

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 463
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 464
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-virtual {v1, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 465
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 466
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-virtual {v1}, Ljava/io/Writer;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 445
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 454
    :cond_2
    :try_start_2
    invoke-static {v0}, Lcom/bumptech/glide/a/d;->b(Lcom/bumptech/glide/a/d;)Lcom/bumptech/glide/a/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    if-eqz v2, :cond_3

    move-object v0, v1

    .line 455
    goto :goto_0

    :cond_3
    move-object v1, v0

    goto :goto_1
.end method

.method static synthetic d(Lcom/bumptech/glide/a/a;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->c()V

    return-void
.end method

.method private d()Z
    .locals 2

    .prologue
    .line 570
    iget v0, p0, Lcom/bumptech/glide/a/a;->l:I

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/bumptech/glide/a/a;->l:I

    iget-object v1, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic e(Lcom/bumptech/glide/a/a;)I
    .locals 1

    .prologue
    .line 85
    const/4 v0, 0x0

    iput v0, p0, Lcom/bumptech/glide/a/a;->l:I

    return v0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 617
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    if-nez v0, :cond_0

    .line 618
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cache is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 620
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/bumptech/glide/a/a;)I
    .locals 1

    .prologue
    .line 85
    iget v0, p0, Lcom/bumptech/glide/a/a;->h:I

    return v0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 645
    :goto_0
    iget-wide v0, p0, Lcom/bumptech/glide/a/a;->i:J

    iget-wide v2, p0, Lcom/bumptech/glide/a/a;->g:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 646
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 647
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/a/a;->c(Ljava/lang/String;)Z

    goto :goto_0

    .line 649
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/bumptech/glide/a/a;)Ljava/io/File;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->b:Ljava/io/File;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)Lcom/bumptech/glide/a/e;
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 407
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->e()V

    .line 408
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/a/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 409
    if-nez v0, :cond_1

    .line 433
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v1

    .line 413
    :cond_1
    :try_start_1
    invoke-static {v0}, Lcom/bumptech/glide/a/d;->e(Lcom/bumptech/glide/a/d;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 417
    iget-object v3, v0, Lcom/bumptech/glide/a/d;->a:[Ljava/io/File;

    array-length v4, v3

    :goto_1
    if-ge v2, v4, :cond_2

    aget-object v5, v3, v2

    .line 419
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 417
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 424
    :cond_2
    iget v1, p0, Lcom/bumptech/glide/a/a;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/bumptech/glide/a/a;->l:I

    .line 425
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const-string v2, "READ"

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 426
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 427
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-virtual {v1, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 428
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 429
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 430
    iget-object v1, p0, Lcom/bumptech/glide/a/a;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v2, p0, Lcom/bumptech/glide/a/a;->n:Ljava/util/concurrent/Callable;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 433
    :cond_3
    new-instance v1, Lcom/bumptech/glide/a/e;

    invoke-static {v0}, Lcom/bumptech/glide/a/d;->f(Lcom/bumptech/glide/a/d;)J

    move-result-wide v4

    iget-object v6, v0, Lcom/bumptech/glide/a/d;->a:[Ljava/io/File;

    invoke-static {v0}, Lcom/bumptech/glide/a/d;->c(Lcom/bumptech/glide/a/d;)[J

    move-result-object v7

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lcom/bumptech/glide/a/e;-><init>(Lcom/bumptech/glide/a/a;Ljava/lang/String;J[Ljava/io/File;[JB)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 407
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Ljava/lang/String;)Lcom/bumptech/glide/a/c;
    .locals 1

    .prologue
    .line 441
    invoke-direct {p0, p1}, Lcom/bumptech/glide/a/a;->d(Ljava/lang/String;)Lcom/bumptech/glide/a/c;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized c(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 581
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->e()V

    .line 582
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/a/d;

    .line 583
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/bumptech/glide/a/d;->b(Lcom/bumptech/glide/a/d;)Lcom/bumptech/glide/a/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    if-eqz v2, :cond_2

    :cond_0
    move v0, v1

    .line 608
    :goto_0
    monitor-exit p0

    return v0

    .line 592
    :cond_1
    :try_start_1
    iget-wide v2, p0, Lcom/bumptech/glide/a/a;->i:J

    invoke-static {v0}, Lcom/bumptech/glide/a/d;->c(Lcom/bumptech/glide/a/d;)[J

    move-result-object v4

    aget-wide v4, v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/bumptech/glide/a/a;->i:J

    .line 593
    invoke-static {v0}, Lcom/bumptech/glide/a/d;->c(Lcom/bumptech/glide/a/d;)[J

    move-result-object v2

    const-wide/16 v4, 0x0

    aput-wide v4, v2, v1

    .line 587
    add-int/lit8 v1, v1, 0x1

    :cond_2
    iget v2, p0, Lcom/bumptech/glide/a/a;->h:I

    if-ge v1, v2, :cond_3

    .line 6868
    iget-object v2, v0, Lcom/bumptech/glide/a/d;->a:[Ljava/io/File;

    aget-object v2, v2, v1

    .line 589
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    if-nez v3, :cond_1

    .line 590
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "failed to delete "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 581
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 596
    :cond_3
    :try_start_2
    iget v0, p0, Lcom/bumptech/glide/a/a;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/bumptech/glide/a/a;->l:I

    .line 597
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const-string v1, "REMOVE"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 598
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 599
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 600
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 602
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 605
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-object v1, p0, Lcom/bumptech/glide/a/a;->n:Ljava/util/concurrent/Callable;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 608
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final declared-synchronized close()V
    .locals 3

    .prologue
    .line 631
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 642
    :goto_0
    monitor-exit p0

    return-void

    .line 634
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/bumptech/glide/a/a;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/a/d;

    .line 635
    invoke-static {v0}, Lcom/bumptech/glide/a/d;->b(Lcom/bumptech/glide/a/d;)Lcom/bumptech/glide/a/c;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 636
    invoke-static {v0}, Lcom/bumptech/glide/a/d;->b(Lcom/bumptech/glide/a/d;)Lcom/bumptech/glide/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/a/c;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 631
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 639
    :cond_2
    :try_start_2
    invoke-direct {p0}, Lcom/bumptech/glide/a/a;->f()V

    .line 640
    iget-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 641
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/a/a;->j:Ljava/io/Writer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method
