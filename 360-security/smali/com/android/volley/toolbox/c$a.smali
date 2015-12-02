.class Lcom/android/volley/toolbox/c$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/volley/toolbox/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:J

.field public f:J

.field public g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 375
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 376
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/android/volley/a$a;)V
    .locals 2

    .prologue
    .line 386
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 387
    iput-object p1, p0, Lcom/android/volley/toolbox/c$a;->b:Ljava/lang/String;

    .line 388
    iget-object v0, p2, Lcom/android/volley/a$a;->a:[B

    array-length v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/android/volley/toolbox/c$a;->a:J

    .line 389
    iget-object v0, p2, Lcom/android/volley/a$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/android/volley/toolbox/c$a;->c:Ljava/lang/String;

    .line 390
    iget-wide v0, p2, Lcom/android/volley/a$a;->c:J

    iput-wide v0, p0, Lcom/android/volley/toolbox/c$a;->d:J

    .line 391
    iget-wide v0, p2, Lcom/android/volley/a$a;->d:J

    iput-wide v0, p0, Lcom/android/volley/toolbox/c$a;->e:J

    .line 392
    iget-wide v0, p2, Lcom/android/volley/a$a;->e:J

    iput-wide v0, p0, Lcom/android/volley/toolbox/c$a;->f:J

    .line 393
    iget-object v0, p2, Lcom/android/volley/a$a;->f:Ljava/util/Map;

    iput-object v0, p0, Lcom/android/volley/toolbox/c$a;->g:Ljava/util/Map;

    .line 394
    return-void
.end method

.method public static a(Ljava/io/InputStream;)Lcom/android/volley/toolbox/c$a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 404
    new-instance v0, Lcom/android/volley/toolbox/c$a;

    invoke-direct {v0}, Lcom/android/volley/toolbox/c$a;-><init>()V

    .line 405
    invoke-static {p0}, Lcom/android/volley/toolbox/c;->a(Ljava/io/InputStream;)I

    move-result v1

    .line 406
    const v2, 0x20120504

    if-eq v1, v2, :cond_0

    .line 408
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 410
    :cond_0
    invoke-static {p0}, Lcom/android/volley/toolbox/c;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/android/volley/toolbox/c$a;->b:Ljava/lang/String;

    .line 411
    invoke-static {p0}, Lcom/android/volley/toolbox/c;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/android/volley/toolbox/c$a;->c:Ljava/lang/String;

    .line 412
    iget-object v1, v0, Lcom/android/volley/toolbox/c$a;->c:Ljava/lang/String;

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 413
    const/4 v1, 0x0

    iput-object v1, v0, Lcom/android/volley/toolbox/c$a;->c:Ljava/lang/String;

    .line 415
    :cond_1
    invoke-static {p0}, Lcom/android/volley/toolbox/c;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/android/volley/toolbox/c$a;->d:J

    .line 416
    invoke-static {p0}, Lcom/android/volley/toolbox/c;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/android/volley/toolbox/c$a;->e:J

    .line 417
    invoke-static {p0}, Lcom/android/volley/toolbox/c;->b(Ljava/io/InputStream;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/android/volley/toolbox/c$a;->f:J

    .line 418
    invoke-static {p0}, Lcom/android/volley/toolbox/c;->d(Ljava/io/InputStream;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/android/volley/toolbox/c$a;->g:Ljava/util/Map;

    .line 419
    return-object v0
.end method


# virtual methods
.method public a([B)Lcom/android/volley/a$a;
    .locals 4

    .prologue
    .line 426
    new-instance v0, Lcom/android/volley/a$a;

    invoke-direct {v0}, Lcom/android/volley/a$a;-><init>()V

    .line 427
    iput-object p1, v0, Lcom/android/volley/a$a;->a:[B

    .line 428
    iget-object v1, p0, Lcom/android/volley/toolbox/c$a;->c:Ljava/lang/String;

    iput-object v1, v0, Lcom/android/volley/a$a;->b:Ljava/lang/String;

    .line 429
    iget-wide v2, p0, Lcom/android/volley/toolbox/c$a;->d:J

    iput-wide v2, v0, Lcom/android/volley/a$a;->c:J

    .line 430
    iget-wide v2, p0, Lcom/android/volley/toolbox/c$a;->e:J

    iput-wide v2, v0, Lcom/android/volley/a$a;->d:J

    .line 431
    iget-wide v2, p0, Lcom/android/volley/toolbox/c$a;->f:J

    iput-wide v2, v0, Lcom/android/volley/a$a;->e:J

    .line 432
    iget-object v1, p0, Lcom/android/volley/toolbox/c$a;->g:Ljava/util/Map;

    iput-object v1, v0, Lcom/android/volley/a$a;->f:Ljava/util/Map;

    .line 433
    return-object v0
.end method

.method public a(Ljava/io/OutputStream;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 441
    const v2, 0x20120504

    :try_start_0
    invoke-static {p1, v2}, Lcom/android/volley/toolbox/c;->a(Ljava/io/OutputStream;I)V

    .line 442
    iget-object v2, p0, Lcom/android/volley/toolbox/c$a;->b:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/android/volley/toolbox/c;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 443
    iget-object v2, p0, Lcom/android/volley/toolbox/c$a;->c:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string/jumbo v2, ""

    :goto_0
    invoke-static {p1, v2}, Lcom/android/volley/toolbox/c;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 444
    iget-wide v2, p0, Lcom/android/volley/toolbox/c$a;->d:J

    invoke-static {p1, v2, v3}, Lcom/android/volley/toolbox/c;->a(Ljava/io/OutputStream;J)V

    .line 445
    iget-wide v2, p0, Lcom/android/volley/toolbox/c$a;->e:J

    invoke-static {p1, v2, v3}, Lcom/android/volley/toolbox/c;->a(Ljava/io/OutputStream;J)V

    .line 446
    iget-wide v2, p0, Lcom/android/volley/toolbox/c$a;->f:J

    invoke-static {p1, v2, v3}, Lcom/android/volley/toolbox/c;->a(Ljava/io/OutputStream;J)V

    .line 447
    iget-object v2, p0, Lcom/android/volley/toolbox/c$a;->g:Ljava/util/Map;

    invoke-static {v2, p1}, Lcom/android/volley/toolbox/c;->a(Ljava/util/Map;Ljava/io/OutputStream;)V

    .line 448
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 452
    :goto_1
    return v0

    .line 443
    :cond_0
    iget-object v2, p0, Lcom/android/volley/toolbox/c$a;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 450
    :catch_0
    move-exception v2

    .line 451
    const-string/jumbo v3, "%s"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v3, v0}, Lcom/android/volley/n;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v1

    .line 452
    goto :goto_1
.end method
