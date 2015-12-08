.class public final Lkik/a/j/o;
.super Lkik/a/j/u;
.source "SourceFile"

# interfaces
.implements Lkik/a/j/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/j/o$a;
    }
.end annotation


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private b:Lkik/a/z;

.field private c:Ljava/lang/String;

.field private d:Ljava/security/SecureRandom;

.field private e:Lcom/kik/g/p;

.field private f:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-string v0, "SecureXDataManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/j/o;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Lkik/a/j/u;-><init>()V

    .line 43
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lkik/a/j/o;->d:Ljava/security/SecureRandom;

    .line 44
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/a/j/o;->f:Ljava/util/concurrent/ExecutorService;

    .line 45
    return-void
.end method

.method static synthetic a(Lkik/a/j/o;Lkik/a/d/ab;[B[B)Lkik/a/d/ab;
    .locals 4

    .prologue
    .line 30
    invoke-virtual {p1}, Lkik/a/d/ab;->c()[B

    move-result-object v0

    const-class v1, Lcom/kik/n/a/e/a;

    invoke-static {v0, v1}, Lkik/a/h/g;->a([BLjava/lang/Class;)Lcom/b/a/n;

    move-result-object v0

    check-cast v0, Lcom/kik/n/a/e/a;

    invoke-static {v0, p2}, Lkik/a/h/o;->a(Lcom/kik/n/a/e/a;[B)[B

    move-result-object v0

    const/16 v1, 0x10

    new-array v1, v1, [B

    iget-object v2, p0, Lkik/a/j/o;->d:Ljava/security/SecureRandom;

    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-static {v0, p3, v1}, Lkik/a/h/o;->a([B[B[B)Lcom/kik/n/a/e/a;

    move-result-object v0

    invoke-static {v0}, Lkik/a/h/g;->a(Lcom/b/a/n;)[B

    move-result-object v0

    new-instance v1, Lkik/a/d/ab;

    invoke-virtual {p1}, Lkik/a/d/ab;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkik/a/d/ab;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, v0}, Lkik/a/d/ab;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    return-object v1
.end method

.method private e()Lcom/kik/g/p;
    .locals 5

    .prologue
    .line 75
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 77
    iget-object v1, p0, Lkik/a/j/o;->e:Lcom/kik/g/p;

    if-nez v1, :cond_0

    .line 78
    iput-object v0, p0, Lkik/a/j/o;->e:Lcom/kik/g/p;

    .line 80
    iget-object v1, p0, Lkik/a/j/o;->b:Lkik/a/z;

    invoke-virtual {v1}, Lkik/a/z;->d()Ljava/lang/String;

    move-result-object v1

    .line 81
    iget-object v2, p0, Lkik/a/j/o;->c:Ljava/lang/String;

    .line 83
    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lkik/a/j/p;

    invoke-direct {v4, p0, v1, v2, v0}, Lkik/a/j/p;-><init>(Lkik/a/j/o;Ljava/lang/String;Ljava/lang/String;Lcom/kik/g/p;)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 94
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 97
    :cond_0
    iget-object v0, p0, Lkik/a/j/o;->e:Lcom/kik/g/p;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 200
    const-class v0, Lcom/kik/n/a/e/a;

    invoke-virtual {p0, p1, v0}, Lkik/a/j/o;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    .line 201
    new-instance v1, Lkik/a/j/o$a;

    invoke-direct {v1, p0, p2}, Lkik/a/j/o$a;-><init>(Lkik/a/j/o;Ljava/lang/Class;)V

    invoke-static {v1}, Lcom/kik/g/s;->a(Lcom/kik/g/as;)Lcom/kik/g/as;

    move-result-object v1

    .line 203
    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    .line 205
    sget-object v1, Lkik/a/j/o;->a:Lorg/c/b;

    invoke-interface {v1}, Lorg/c/b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 206
    new-instance v1, Lkik/a/j/s;

    invoke-direct {v1, p0, p1}, Lkik/a/j/s;-><init>(Lkik/a/j/o;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 240
    :cond_0
    iget-object v1, p0, Lkik/a/j/o;->f:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Ljava/util/concurrent/ExecutorService;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 287
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lkik/a/j/o;->a(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Long;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Long;)Lcom/kik/g/p;
    .locals 9

    .prologue
    .line 301
    invoke-direct {p0}, Lkik/a/j/o;->e()Lcom/kik/g/p;

    move-result-object v8

    .line 302
    new-instance v7, Lcom/kik/g/p;

    invoke-direct {v7}, Lcom/kik/g/p;-><init>()V

    .line 304
    invoke-static {p3}, Lkik/a/h/g;->a(Lcom/b/a/n;)[B

    move-result-object v2

    .line 305
    const/16 v0, 0x10

    new-array v3, v0, [B

    .line 307
    iget-object v0, p0, Lkik/a/j/o;->d:Ljava/security/SecureRandom;

    invoke-virtual {v0, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 309
    new-instance v0, Lkik/a/j/t;

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v7}, Lkik/a/j/t;-><init>(Lkik/a/j/o;[B[BLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/kik/g/p;)V

    invoke-virtual {v8, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 325
    return-object v7
.end method

.method public final a(Lkik/a/z;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 102
    iget-object v0, p0, Lkik/a/j/o;->b:Lkik/a/z;

    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {p0}, Lkik/a/j/o;->d()Lkik/a/e/x;

    move-result-object v0

    .line 105
    invoke-virtual {p0}, Lkik/a/j/o;->a()[B

    move-result-object v1

    .line 107
    const/4 v2, 0x0

    iput-object v2, p0, Lkik/a/j/o;->e:Lcom/kik/g/p;

    .line 108
    iput-object p1, p0, Lkik/a/j/o;->b:Lkik/a/z;

    .line 110
    invoke-virtual {p0}, Lkik/a/j/o;->a()[B

    move-result-object v2

    .line 112
    invoke-interface {v0}, Lkik/a/e/x;->a()Lcom/kik/g/p;

    move-result-object v3

    new-instance v4, Lkik/a/j/q;

    invoke-direct {v4, p0, v0, v1, v2}, Lkik/a/j/q;-><init>(Lkik/a/j/o;Lkik/a/e/x;[B[B)V

    invoke-virtual {v3, v4}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 157
    :goto_0
    return-void

    .line 151
    :cond_0
    iput-object p1, p0, Lkik/a/j/o;->b:Lkik/a/z;

    .line 152
    iput-object p2, p0, Lkik/a/j/o;->c:Ljava/lang/String;

    .line 155
    invoke-direct {p0}, Lkik/a/j/o;->e()Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final a()[B
    .locals 4

    .prologue
    .line 64
    :try_start_0
    invoke-direct {p0}, Lkik/a/j/o;->e()Lcom/kik/g/p;

    move-result-object v0

    const-wide/32 v2, 0xc350

    invoke-static {v0, v2, v3}, Lcom/kik/g/s;->b(Lcom/kik/g/p;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 253
    const-class v0, Lcom/kik/n/a/e/a;

    invoke-virtual {p0, p1, v0}, Lkik/a/j/o;->d(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    .line 254
    new-instance v1, Lkik/a/j/o$a;

    invoke-direct {v1, p0, p2}, Lkik/a/j/o$a;-><init>(Lkik/a/j/o;Ljava/lang/Class;)V

    .line 256
    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    iget-object v1, p0, Lkik/a/j/o;->f:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Ljava/util/concurrent/ExecutorService;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 184
    invoke-super {p0}, Lkik/a/j/u;->c()V

    .line 186
    iput-object v0, p0, Lkik/a/j/o;->b:Lkik/a/z;

    .line 187
    iput-object v0, p0, Lkik/a/j/o;->c:Ljava/lang/String;

    .line 188
    return-void
.end method
