.class public abstract Lcom/roidapp/baselib/e/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field protected a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Ljava/net/HttpURLConnection;",
            ">;"
        }
    .end annotation
.end field

.field protected b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Lcom/roidapp/baselib/e/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/baselib/e/j",
            "<TT;>;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/String;

.field private i:Lcom/roidapp/baselib/e/e;

.field private j:Lcom/roidapp/baselib/e/i;

.field private k:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/roidapp/baselib/e/j",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 47
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/baselib/e/g;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;B)V

    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;B)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/roidapp/baselib/e/j",
            "<TT;>;B)V"
        }
    .end annotation

    .prologue
    const v0, 0xea60

    const/4 v1, 0x0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput v0, p0, Lcom/roidapp/baselib/e/g;->e:I

    .line 24
    iput v0, p0, Lcom/roidapp/baselib/e/g;->f:I

    .line 40
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/e/g;->k:I

    .line 51
    iput-object p1, p0, Lcom/roidapp/baselib/e/g;->d:Ljava/lang/String;

    .line 52
    iput-object p2, p0, Lcom/roidapp/baselib/e/g;->g:Lcom/roidapp/baselib/e/j;

    .line 1323
    const/4 v0, 0x0

    .line 53
    iput-object v0, p0, Lcom/roidapp/baselib/e/g;->h:Ljava/lang/String;

    .line 54
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, Lcom/roidapp/baselib/e/i;->a:Lcom/roidapp/baselib/e/i;

    :goto_0
    iput-object v0, p0, Lcom/roidapp/baselib/e/g;->j:Lcom/roidapp/baselib/e/i;

    .line 55
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roidapp/baselib/e/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roidapp/baselib/e/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    return-void

    .line 54
    :cond_0
    sget-object v0, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    goto :goto_0
.end method

.method private static a(Ljava/net/URLConnection;[Lcom/roidapp/baselib/c/x;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URLConnection;",
            "[",
            "Lcom/roidapp/baselib/c/x",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 299
    if-eqz p1, :cond_0

    .line 300
    array-length v3, p1

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v1, p1, v2

    .line 301
    iget-object v0, v1, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v1, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 304
    :cond_0
    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/net/HttpURLConnection;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            ")TT;"
        }
    .end annotation
.end method

.method protected a()V
    .locals 0

    .prologue
    .line 169
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 119
    iput p1, p0, Lcom/roidapp/baselib/e/g;->k:I

    .line 120
    return-void
.end method

.method protected final a(Lcom/roidapp/baselib/e/i;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/roidapp/baselib/e/g;->j:Lcom/roidapp/baselib/e/i;

    .line 102
    return-void
.end method

.method protected a(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/roidapp/baselib/e/f;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 83
    if-eqz p1, :cond_0

    .line 84
    new-instance v0, Lcom/roidapp/baselib/e/e;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/e/e;-><init>(Ljava/lang/Iterable;)V

    iput-object v0, p0, Lcom/roidapp/baselib/e/g;->i:Lcom/roidapp/baselib/e/e;

    .line 85
    sget-object v0, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    .line 3101
    iput-object v0, p0, Lcom/roidapp/baselib/e/g;->j:Lcom/roidapp/baselib/e/i;

    .line 87
    :cond_0
    return-void
.end method

.method protected final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 77
    iput-object p1, p0, Lcom/roidapp/baselib/e/g;->h:Ljava/lang/String;

    .line 78
    if-eqz p1, :cond_0

    .line 79
    sget-object v0, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    .line 2101
    iput-object v0, p0, Lcom/roidapp/baselib/e/g;->j:Lcom/roidapp/baselib/e/i;

    .line 80
    :cond_0
    return-void
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 172
    return-void
.end method

.method protected final c()V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/e/g;->g:Lcom/roidapp/baselib/e/j;

    .line 61
    return-void
.end method

.method protected d()Lcom/roidapp/baselib/e/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/roidapp/baselib/e/j",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 64
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->g:Lcom/roidapp/baselib/e/j;

    return-object v0
.end method

.method protected e()[Lcom/roidapp/baselib/c/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lcom/roidapp/baselib/c/x",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 97
    const/4 v0, 0x0

    return-object v0
.end method

.method public f()V
    .locals 2

    .prologue
    .line 126
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 129
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 131
    new-instance v0, Lcom/roidapp/baselib/e/h;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/e/h;-><init>(Lcom/roidapp/baselib/e/g;)V

    invoke-virtual {v0}, Lcom/roidapp/baselib/e/h;->start()V

    .line 143
    :cond_0
    return-void
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 176
    const/16 v0, 0x4e20

    iput v0, p0, Lcom/roidapp/baselib/e/g;->e:I

    .line 179
    return-void
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 183
    const/16 v0, 0x4e20

    iput v0, p0, Lcom/roidapp/baselib/e/g;->f:I

    .line 185
    return-void
.end method

.method public run()V
    .locals 9

    .prologue
    const/4 v1, -0x1

    const/4 v7, 0x1

    const/4 v3, 0x0

    .line 106
    const/16 v0, 0x13

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 108
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    :goto_0
    return-void

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->g:Lcom/roidapp/baselib/e/j;

    if-eqz v0, :cond_4

    .line 3191
    invoke-virtual {p0}, Lcom/roidapp/baselib/e/g;->a()V

    .line 3195
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->d:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3196
    :try_start_1
    iget v2, p0, Lcom/roidapp/baselib/e/g;->e:I

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 3197
    iget v2, p0, Lcom/roidapp/baselib/e/g;->f:I

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 3198
    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->j:Lcom/roidapp/baselib/e/i;

    invoke-virtual {v2}, Lcom/roidapp/baselib/e/i;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 3199
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 3200
    iget v2, p0, Lcom/roidapp/baselib/e/g;->k:I

    if-eq v2, v1, :cond_1

    .line 3201
    iget v2, p0, Lcom/roidapp/baselib/e/g;->k:I

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 3202
    :cond_1
    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    iget-object v4, p0, Lcom/roidapp/baselib/e/g;->j:Lcom/roidapp/baselib/e/i;

    invoke-virtual {v2, v4}, Lcom/roidapp/baselib/e/i;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 3203
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 3204
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/baselib/e/g;->e()[Lcom/roidapp/baselib/c/x;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/roidapp/baselib/e/g;->a(Ljava/net/URLConnection;[Lcom/roidapp/baselib/c/x;)V

    .line 3205
    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->i:Lcom/roidapp/baselib/e/e;

    if-eqz v2, :cond_3

    .line 3206
    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->i:Lcom/roidapp/baselib/e/e;

    invoke-virtual {v2}, Lcom/roidapp/baselib/e/e;->a()[Lcom/roidapp/baselib/c/x;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/roidapp/baselib/e/g;->a(Ljava/net/URLConnection;[Lcom/roidapp/baselib/c/x;)V

    .line 3209
    :cond_3
    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8

    move-result v2

    if-eqz v2, :cond_5

    .line 115
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 3212
    :cond_5
    :try_start_2
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/roidapp/baselib/e/g;->a:Ljava/lang/ref/WeakReference;

    .line 3213
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8

    move-object v4, v0

    move-object v0, v3

    .line 3219
    :goto_2
    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/roidapp/baselib/e/g;->b()V

    .line 3221
    :cond_6
    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_4

    .line 3225
    if-eqz v4, :cond_9

    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->h:Ljava/lang/String;

    if-nez v2, :cond_7

    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->i:Lcom/roidapp/baselib/e/e;

    if-eqz v2, :cond_9

    .line 3228
    :cond_7
    :try_start_3
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v2

    .line 3229
    :try_start_4
    iget-object v5, p0, Lcom/roidapp/baselib/e/g;->h:Ljava/lang/String;

    if-eqz v5, :cond_a

    .line 3230
    iget-object v5, p0, Lcom/roidapp/baselib/e/g;->h:Ljava/lang/String;

    const-string v6, "utf-8"

    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/io/OutputStream;->write([B)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 3242
    :cond_8
    :goto_3
    if-eqz v2, :cond_9

    .line 3244
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 3251
    :cond_9
    :goto_4
    if-nez v0, :cond_c

    if-eqz v4, :cond_c

    .line 3253
    :try_start_6
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    move-result v1

    move v8, v1

    move-object v1, v0

    move v0, v8

    .line 3259
    :goto_5
    const/16 v2, 0xc8

    if-ne v0, v2, :cond_d

    .line 3261
    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_4

    .line 3266
    :try_start_7
    invoke-virtual {p0, v4}, Lcom/roidapp/baselib/e/g;->a(Ljava/net/HttpURLConnection;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    move-result-object v3

    .line 3271
    :goto_6
    if-nez v1, :cond_d

    .line 3273
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_4

    .line 3276
    iget-object v0, p0, Lcom/roidapp/baselib/e/g;->g:Lcom/roidapp/baselib/e/j;

    .line 3277
    if-eqz v0, :cond_4

    .line 3278
    invoke-interface {v0, v3}, Lcom/roidapp/baselib/e/j;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 3214
    :catch_0
    move-exception v0

    move-object v2, v3

    .line 3216
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v4, v2

    goto :goto_2

    .line 3232
    :cond_a
    :try_start_8
    iget-object v5, p0, Lcom/roidapp/baselib/e/g;->i:Lcom/roidapp/baselib/e/e;

    if-eqz v5, :cond_8

    .line 3233
    iget-object v5, p0, Lcom/roidapp/baselib/e/g;->i:Lcom/roidapp/baselib/e/e;

    invoke-virtual {v5, v2}, Lcom/roidapp/baselib/e/e;->a(Ljava/io/OutputStream;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_3

    .line 3238
    :catch_1
    move-exception v0

    .line 3240
    :goto_8
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 3242
    if-eqz v2, :cond_9

    .line 3244
    :try_start_a
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2

    goto :goto_4

    .line 3246
    :catch_2
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    :catch_3
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 3242
    :catchall_0
    move-exception v0

    move-object v2, v3

    :goto_9
    if-eqz v2, :cond_b

    .line 3244
    :try_start_b
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4

    .line 3247
    :cond_b
    :goto_a
    throw v0

    .line 3246
    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_a

    .line 3254
    :catch_5
    move-exception v0

    .line 3256
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v8, v1

    move-object v1, v0

    move v0, v8

    goto :goto_5

    .line 3267
    :catch_6
    move-exception v1

    .line 3269
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_6

    :cond_c
    move v8, v1

    move-object v1, v0

    move v0, v8

    .line 3286
    :cond_d
    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_4

    .line 3288
    iget-object v2, p0, Lcom/roidapp/baselib/e/g;->g:Lcom/roidapp/baselib/e/j;

    .line 3289
    if-eqz v2, :cond_4

    .line 3290
    if-nez v1, :cond_e

    .line 3291
    new-instance v1, Ljava/lang/Exception;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "server response code:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 3292
    :cond_e
    invoke-interface {v2, v0, v1}, Lcom/roidapp/baselib/e/j;->a(ILjava/lang/Exception;)V

    goto/16 :goto_1

    .line 3242
    :catchall_1
    move-exception v0

    goto :goto_9

    .line 3238
    :catch_7
    move-exception v0

    move-object v2, v3

    goto :goto_8

    .line 3214
    :catch_8
    move-exception v2

    move-object v8, v2

    move-object v2, v0

    move-object v0, v8

    goto :goto_7
.end method
