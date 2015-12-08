.class public Lcom/flurry/sdk/kl;
.super Lcom/flurry/sdk/ls;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Lcom/flurry/sdk/kl$a;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private j:Z

.field private final k:Lcom/flurry/sdk/jt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jt",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/flurry/sdk/kl$c;

.field private m:Ljava/net/HttpURLConnection;

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:J

.field private r:J

.field private s:Ljava/lang/Exception;

.field private t:I

.field private final u:Lcom/flurry/sdk/jt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jt",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final v:Ljava/lang/Object;

.field private w:Z

.field private x:I

.field private y:Lcom/flurry/sdk/kk;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/flurry/sdk/kl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/kl;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 129
    invoke-direct {p0}, Lcom/flurry/sdk/ls;-><init>()V

    .line 101
    const/16 v0, 0x2710

    iput v0, p0, Lcom/flurry/sdk/kl;->d:I

    .line 102
    const/16 v0, 0x3a98

    iput v0, p0, Lcom/flurry/sdk/kl;->e:I

    .line 105
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flurry/sdk/kl;->j:Z

    .line 106
    new-instance v0, Lcom/flurry/sdk/jt;

    invoke-direct {v0}, Lcom/flurry/sdk/jt;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/kl;->k:Lcom/flurry/sdk/jt;

    .line 113
    iput-wide v2, p0, Lcom/flurry/sdk/kl;->q:J

    .line 114
    iput-wide v2, p0, Lcom/flurry/sdk/kl;->r:J

    .line 118
    const/4 v0, -0x1

    iput v0, p0, Lcom/flurry/sdk/kl;->t:I

    .line 119
    new-instance v0, Lcom/flurry/sdk/jt;

    invoke-direct {v0}, Lcom/flurry/sdk/jt;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/kl;->u:Lcom/flurry/sdk/jt;

    .line 121
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/kl;->v:Ljava/lang/Object;

    .line 124
    const/16 v0, 0x61a8

    iput v0, p0, Lcom/flurry/sdk/kl;->x:I

    .line 130
    new-instance v0, Lcom/flurry/sdk/kk;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/kk;-><init>(Lcom/flurry/sdk/kl;)V

    iput-object v0, p0, Lcom/flurry/sdk/kl;->y:Lcom/flurry/sdk/kk;

    .line 131
    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/kl;)Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method private a(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Lcom/flurry/sdk/kl;->l:Lcom/flurry/sdk/kl$c;

    if-nez v0, :cond_1

    .line 456
    :cond_0
    :goto_0
    return-void

    .line 447
    :cond_1
    invoke-virtual {p0}, Lcom/flurry/sdk/kl;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 451
    if-eqz p1, :cond_0

    .line 455
    iget-object v0, p0, Lcom/flurry/sdk/kl;->l:Lcom/flurry/sdk/kl$c;

    invoke-interface {v0, p0, p1}, Lcom/flurry/sdk/kl$c;->a(Lcom/flurry/sdk/kl;Ljava/io/InputStream;)V

    goto :goto_0
.end method

.method private a(Ljava/io/OutputStream;)V
    .locals 1

    .prologue
    .line 427
    iget-object v0, p0, Lcom/flurry/sdk/kl;->l:Lcom/flurry/sdk/kl$c;

    if-nez v0, :cond_1

    .line 440
    :cond_0
    :goto_0
    return-void

    .line 431
    :cond_1
    invoke-virtual {p0}, Lcom/flurry/sdk/kl;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 435
    if-eqz p1, :cond_0

    .line 439
    iget-object v0, p0, Lcom/flurry/sdk/kl;->l:Lcom/flurry/sdk/kl$c;

    invoke-interface {v0, p0, p1}, Lcom/flurry/sdk/kl$c;->a(Lcom/flurry/sdk/kl;Ljava/io/OutputStream;)V

    goto :goto_0
.end method

.method private r()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 315
    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->o:Z

    if-eqz v0, :cond_0

    .line 423
    :goto_0
    return-void

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/flurry/sdk/lp;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    .line 321
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 325
    :try_start_0
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    .line 326
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    iget v1, p0, Lcom/flurry/sdk/kl;->d:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 327
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    iget v1, p0, Lcom/flurry/sdk/kl;->e:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 328
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    iget-object v1, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v1}, Lcom/flurry/sdk/kl$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 329
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    iget-boolean v1, p0, Lcom/flurry/sdk/kl;->j:Z

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 330
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    sget-object v1, Lcom/flurry/sdk/kl$a;->c:Lcom/flurry/sdk/kl$a;

    iget-object v3, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v1, v3}, Lcom/flurry/sdk/kl$a;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 331
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 334
    iget-object v0, p0, Lcom/flurry/sdk/kl;->k:Lcom/flurry/sdk/jt;

    invoke-virtual {v0}, Lcom/flurry/sdk/jt;->b()Ljava/util/Collection;

    move-result-object v0

    .line 335
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 336
    iget-object v4, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v1, v0}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 422
    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lcom/flurry/sdk/kl;->t()V

    throw v0

    .line 340
    :cond_1
    :try_start_1
    sget-object v0, Lcom/flurry/sdk/kl$a;->b:Lcom/flurry/sdk/kl$a;

    iget-object v1, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/kl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/flurry/sdk/kl$a;->c:Lcom/flurry/sdk/kl$a;

    iget-object v1, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/kl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 341
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    const-string v1, "Accept-Encoding"

    const-string v3, ""

    invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    :cond_2
    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    .line 422
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->t()V

    goto/16 :goto_0

    .line 350
    :cond_3
    :try_start_2
    sget-object v0, Lcom/flurry/sdk/kl$a;->c:Lcom/flurry/sdk/kl$a;

    iget-object v1, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/kl$a;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-eqz v0, :cond_4

    .line 356
    :try_start_3
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v3

    .line 357
    :try_start_4
    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-direct {v1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 360
    :try_start_5
    invoke-direct {p0, v1}, Lcom/flurry/sdk/kl;->a(Ljava/io/OutputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 363
    :try_start_6
    invoke-static {v1}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    .line 364
    invoke-static {v3}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    .line 369
    :cond_4
    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->p:Z

    if-eqz v0, :cond_5

    .line 370
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/flurry/sdk/kl;->q:J

    .line 374
    :cond_5
    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->w:Z

    if-eqz v0, :cond_6

    .line 375
    iget-object v0, p0, Lcom/flurry/sdk/kl;->y:Lcom/flurry/sdk/kk;

    iget v1, p0, Lcom/flurry/sdk/kl;->x:I

    int-to-long v4, v1

    invoke-virtual {v0, v4, v5}, Lcom/flurry/sdk/kk;->a(J)V

    .line 379
    :cond_6
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    iput v0, p0, Lcom/flurry/sdk/kl;->t:I

    .line 382
    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->p:Z

    if-eqz v0, :cond_7

    iget-wide v0, p0, Lcom/flurry/sdk/kl;->q:J

    const-wide/16 v4, -0x1

    cmp-long v0, v0, v4

    if-eqz v0, :cond_7

    .line 383
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/flurry/sdk/kl;->q:J

    sub-long/2addr v0, v4

    iput-wide v0, p0, Lcom/flurry/sdk/kl;->r:J

    .line 386
    :cond_7
    iget-object v0, p0, Lcom/flurry/sdk/kl;->y:Lcom/flurry/sdk/kk;

    invoke-virtual {v0}, Lcom/flurry/sdk/kk;->a()V

    .line 389
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    .line 390
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 391
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 392
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 393
    iget-object v5, p0, Lcom/flurry/sdk/kl;->u:Lcom/flurry/sdk/jt;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6, v1}, Lcom/flurry/sdk/jt;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 363
    :catchall_1
    move-exception v0

    move-object v1, v2

    :goto_3
    invoke-static {v1}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    .line 364
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    throw v0

    .line 398
    :cond_9
    sget-object v0, Lcom/flurry/sdk/kl$a;->b:Lcom/flurry/sdk/kl$a;

    iget-object v1, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/kl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/flurry/sdk/kl$a;->c:Lcom/flurry/sdk/kl$a;

    iget-object v1, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/kl$a;->equals(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result v0

    if-nez v0, :cond_a

    .line 422
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->t()V

    goto/16 :goto_0

    .line 403
    :cond_a
    :try_start_7
    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->o:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v0, :cond_b

    .line 422
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->t()V

    goto/16 :goto_0

    .line 412
    :cond_b
    :try_start_8
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move-result-object v1

    .line 413
    :try_start_9
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 416
    :try_start_a
    invoke-direct {p0, v3}, Lcom/flurry/sdk/kl;->a(Ljava/io/InputStream;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 418
    :try_start_b
    invoke-static {v3}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    .line 419
    invoke-static {v1}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 422
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->t()V

    goto/16 :goto_0

    .line 418
    :catchall_2
    move-exception v0

    move-object v1, v2

    :goto_4
    :try_start_c
    invoke-static {v1}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    .line 419
    invoke-static {v2}, Lcom/flurry/sdk/lp;->a(Ljava/io/Closeable;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 418
    :catchall_3
    move-exception v0

    move-object v7, v1

    move-object v1, v2

    move-object v2, v7

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object v2, v1

    move-object v1, v3

    goto :goto_4

    .line 363
    :catchall_5
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    goto :goto_3

    :catchall_6
    move-exception v0

    move-object v2, v3

    goto :goto_3
.end method

.method private s()V
    .locals 1

    .prologue
    .line 459
    iget-object v0, p0, Lcom/flurry/sdk/kl;->l:Lcom/flurry/sdk/kl$c;

    if-nez v0, :cond_1

    .line 468
    :cond_0
    :goto_0
    return-void

    .line 463
    :cond_1
    invoke-virtual {p0}, Lcom/flurry/sdk/kl;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 467
    iget-object v0, p0, Lcom/flurry/sdk/kl;->l:Lcom/flurry/sdk/kl$c;

    invoke-interface {v0, p0}, Lcom/flurry/sdk/kl$c;->a(Lcom/flurry/sdk/kl;)V

    goto :goto_0
.end method

.method private t()V
    .locals 1

    .prologue
    .line 471
    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->n:Z

    if-eqz v0, :cond_1

    .line 480
    :cond_0
    :goto_0
    return-void

    .line 475
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flurry/sdk/kl;->n:Z

    .line 477
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 478
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0
.end method

.method private u()V
    .locals 1

    .prologue
    .line 483
    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->n:Z

    if-eqz v0, :cond_1

    .line 504
    :cond_0
    :goto_0
    return-void

    .line 487
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flurry/sdk/kl;->n:Z

    .line 490
    iget-object v0, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 491
    new-instance v0, Lcom/flurry/sdk/kl$1;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/kl$1;-><init>(Lcom/flurry/sdk/kl;)V

    .line 502
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 275
    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/flurry/sdk/kl;->y:Lcom/flurry/sdk/kk;

    invoke-virtual {v0}, Lcom/flurry/sdk/kk;->a()V

    .line 304
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->s()V

    .line 305
    :goto_0
    return-void

    .line 279
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/flurry/sdk/ji;->a()Lcom/flurry/sdk/ji;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ji;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 280
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/kl;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Network not available, aborting http request: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 302
    iget-object v0, p0, Lcom/flurry/sdk/kl;->y:Lcom/flurry/sdk/kk;

    invoke-virtual {v0}, Lcom/flurry/sdk/kk;->a()V

    .line 304
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->s()V

    goto :goto_0

    .line 285
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/flurry/sdk/kl$a;->a:Lcom/flurry/sdk/kl$a;

    iget-object v1, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/kl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 286
    :cond_2
    sget-object v0, Lcom/flurry/sdk/kl$a;->b:Lcom/flurry/sdk/kl$a;

    iput-object v0, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    .line 291
    :cond_3
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->r()V

    .line 293
    const/4 v0, 0x4

    sget-object v1, Lcom/flurry/sdk/kl;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "HTTP status: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lcom/flurry/sdk/kl;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " for url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 302
    iget-object v0, p0, Lcom/flurry/sdk/kl;->y:Lcom/flurry/sdk/kk;

    invoke-virtual {v0}, Lcom/flurry/sdk/kk;->a()V

    .line 304
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->s()V

    goto :goto_0

    .line 294
    :catch_0
    move-exception v0

    .line 295
    const/4 v1, 0x4

    :try_start_3
    sget-object v2, Lcom/flurry/sdk/kl;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "HTTP status: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/flurry/sdk/kl;->t:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " for url: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 296
    const/4 v1, 0x3

    sget-object v2, Lcom/flurry/sdk/kl;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Exception during http request: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 297
    iget-object v1, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getReadTimeout()I

    move-result v1

    iput v1, p0, Lcom/flurry/sdk/kl;->g:I

    .line 298
    iget-object v1, p0, Lcom/flurry/sdk/kl;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getConnectTimeout()I

    move-result v1

    iput v1, p0, Lcom/flurry/sdk/kl;->f:I

    .line 299
    iput-object v0, p0, Lcom/flurry/sdk/kl;->s:Ljava/lang/Exception;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 302
    iget-object v0, p0, Lcom/flurry/sdk/kl;->y:Lcom/flurry/sdk/kk;

    invoke-virtual {v0}, Lcom/flurry/sdk/kk;->a()V

    .line 304
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->s()V

    goto/16 :goto_0

    .line 302
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/flurry/sdk/kl;->y:Lcom/flurry/sdk/kk;

    invoke-virtual {v1}, Lcom/flurry/sdk/kk;->a()V

    .line 304
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->s()V

    throw v0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 152
    iput p1, p0, Lcom/flurry/sdk/kl;->d:I

    .line 153
    return-void
.end method

.method public a(Lcom/flurry/sdk/kl$a;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/flurry/sdk/kl;->c:Lcom/flurry/sdk/kl$a;

    .line 143
    return-void
.end method

.method public a(Lcom/flurry/sdk/kl$c;)V
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lcom/flurry/sdk/kl;->l:Lcom/flurry/sdk/kl$c;

    .line 201
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    .line 135
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/flurry/sdk/kl;->k:Lcom/flurry/sdk/jt;

    invoke-virtual {v0, p1, p2}, Lcom/flurry/sdk/jt;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 197
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 162
    iput-boolean p1, p0, Lcom/flurry/sdk/kl;->w:Z

    .line 163
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 234
    if-nez p1, :cond_0

    .line 235
    const/4 v0, 0x0

    .line 238
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/flurry/sdk/kl;->u:Lcom/flurry/sdk/jt;

    invoke-virtual {v0, p1}, Lcom/flurry/sdk/jt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 158
    iput p1, p0, Lcom/flurry/sdk/kl;->e:I

    .line 159
    return-void
.end method

.method public b(Z)V
    .locals 0

    .prologue
    .line 191
    iput-boolean p1, p0, Lcom/flurry/sdk/kl;->j:Z

    return-void
.end method

.method public c()J
    .locals 2

    .prologue
    .line 149
    iget-wide v0, p0, Lcom/flurry/sdk/kl;->r:J

    return-wide v0
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 170
    iput p1, p0, Lcom/flurry/sdk/kl;->x:I

    .line 171
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/flurry/sdk/kl;->u:Lcom/flurry/sdk/jt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flurry/sdk/kl;->u:Lcom/flurry/sdk/jt;

    invoke-virtual {v0, p1}, Lcom/flurry/sdk/jt;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/flurry/sdk/kl;->u:Lcom/flurry/sdk/jt;

    invoke-virtual {v0, p1}, Lcom/flurry/sdk/jt;->b(Ljava/lang/Object;)Z

    .line 270
    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 0

    .prologue
    .line 193
    iput-boolean p1, p0, Lcom/flurry/sdk/kl;->p:Z

    return-void
.end method

.method public d()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 179
    .line 180
    iget-object v0, p0, Lcom/flurry/sdk/kl;->s:Ljava/lang/Exception;

    if-eqz v0, :cond_2

    .line 181
    iget-object v0, p0, Lcom/flurry/sdk/kl;->s:Ljava/lang/Exception;

    instance-of v0, v0, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_2

    move v0, v1

    .line 186
    :goto_0
    iget-boolean v3, p0, Lcom/flurry/sdk/kl;->z:Z

    if-nez v3, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    return v2

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method public e()Z
    .locals 2

    .prologue
    .line 204
    iget-object v1, p0, Lcom/flurry/sdk/kl;->v:Ljava/lang/Object;

    monitor-enter v1

    .line 205
    :try_start_0
    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->o:Z

    monitor-exit v1

    return v0

    .line 206
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 210
    invoke-virtual {p0}, Lcom/flurry/sdk/kl;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/flurry/sdk/kl;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Z
    .locals 2

    .prologue
    .line 214
    iget v0, p0, Lcom/flurry/sdk/kl;->t:I

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/flurry/sdk/kl;->t:I

    const/16 v1, 0x190

    if-ge v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/flurry/sdk/kl;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()I
    .locals 1

    .prologue
    .line 218
    iget v0, p0, Lcom/flurry/sdk/kl;->t:I

    return v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/flurry/sdk/kl;->s:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Ljava/lang/Exception;
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/flurry/sdk/kl;->s:Ljava/lang/Exception;

    return-object v0
.end method

.method public k()V
    .locals 6

    .prologue
    .line 242
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/flurry/sdk/kl;->q:J

    sub-long/2addr v0, v2

    .line 243
    const/4 v2, 0x3

    sget-object v3, Lcom/flurry/sdk/kl;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Timeout ("

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "MS) for url: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 245
    const/16 v0, 0x275

    iput v0, p0, Lcom/flurry/sdk/kl;->t:I

    .line 247
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flurry/sdk/kl;->z:Z

    .line 250
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->s()V

    .line 253
    invoke-virtual {p0}, Lcom/flurry/sdk/kl;->l()V

    .line 254
    return-void
.end method

.method public l()V
    .locals 4

    .prologue
    .line 257
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/kl;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cancelling http request: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/sdk/kl;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 258
    iget-object v1, p0, Lcom/flurry/sdk/kl;->v:Ljava/lang/Object;

    monitor-enter v1

    .line 259
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/flurry/sdk/kl;->o:Z

    .line 260
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    invoke-direct {p0}, Lcom/flurry/sdk/kl;->u()V

    .line 263
    return-void

    .line 260
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public m()V
    .locals 0

    .prologue
    .line 310
    invoke-virtual {p0}, Lcom/flurry/sdk/kl;->l()V

    .line 311
    return-void
.end method
