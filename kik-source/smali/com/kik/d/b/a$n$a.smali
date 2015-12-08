.class public final Lcom/kik/d/b/a$n$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a$n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field private c:Lcom/c/b/az;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 8208
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 8322
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$n$a;->b:Ljava/lang/Object;

    .line 8398
    sget-object v0, Lcom/c/b/ay;->a:Lcom/c/b/az;

    iput-object v0, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    .line 8209
    invoke-static {}, Lcom/kik/d/b/a$n;->k()Z

    .line 8210
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 8191
    invoke-direct {p0}, Lcom/kik/d/b/a$n$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 8214
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 8322
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$n$a;->b:Ljava/lang/Object;

    .line 8398
    sget-object v0, Lcom/c/b/ay;->a:Lcom/c/b/az;

    iput-object v0, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    .line 8215
    invoke-static {}, Lcom/kik/d/b/a$n;->k()Z

    .line 8216
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 8191
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$n$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/d/b/a$n$a;
    .locals 1

    .prologue
    .line 8266
    instance-of v0, p1, Lcom/kik/d/b/a$n;

    if-eqz v0, :cond_0

    .line 8267
    check-cast p1, Lcom/kik/d/b/a$n;

    invoke-virtual {p0, p1}, Lcom/kik/d/b/a$n$a;->a(Lcom/kik/d/b/a$n;)Lcom/kik/d/b/a$n$a;

    move-result-object p0

    .line 8270
    :goto_0
    return-object p0

    .line 8269
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$n$a;
    .locals 4

    .prologue
    .line 8307
    const/4 v2, 0x0

    .line 8309
    :try_start_0
    sget-object v0, Lcom/kik/d/b/a$n;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$n;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8314
    if-eqz v0, :cond_0

    .line 8315
    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$n$a;->a(Lcom/kik/d/b/a$n;)Lcom/kik/d/b/a$n$a;

    .line 8318
    :cond_0
    return-object p0

    .line 8310
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 8311
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 8312
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 8314
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 8315
    invoke-virtual {p0, v1}, Lcom/kik/d/b/a$n$a;->a(Lcom/kik/d/b/a$n;)Lcom/kik/d/b/a$n$a;

    :cond_1
    throw v0

    .line 8314
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private s()Lcom/kik/d/b/a$n;
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 8248
    new-instance v2, Lcom/kik/d/b/a$n;

    invoke-direct {v2, p0, v1}, Lcom/kik/d/b/a$n;-><init>(Lcom/c/b/as$a;B)V

    .line 8249
    iget v3, p0, Lcom/kik/d/b/a$n$a;->a:I

    .line 8251
    and-int/lit8 v3, v3, 0x1

    if-ne v3, v0, :cond_1

    .line 8254
    :goto_0
    iget-object v1, p0, Lcom/kik/d/b/a$n$a;->b:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$n;->a(Lcom/kik/d/b/a$n;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8255
    iget v1, p0, Lcom/kik/d/b/a$n$a;->a:I

    and-int/lit8 v1, v1, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 8256
    iget-object v1, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    invoke-interface {v1}, Lcom/c/b/az;->e()Lcom/c/b/az;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    .line 8257
    iget v1, p0, Lcom/kik/d/b/a$n$a;->a:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/kik/d/b/a$n$a;->a:I

    .line 8259
    :cond_0
    iget-object v1, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$n;->a(Lcom/kik/d/b/a$n;Lcom/c/b/az;)Lcom/c/b/az;

    .line 8260
    invoke-static {v2, v0}, Lcom/kik/d/b/a$n;->a(Lcom/kik/d/b/a$n;I)I

    .line 8261
    invoke-virtual {p0}, Lcom/kik/d/b/a$n$a;->l()V

    .line 8262
    return-object v2

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method private t()V
    .locals 2

    .prologue
    .line 8400
    iget v0, p0, Lcom/kik/d/b/a$n$a;->a:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 8401
    new-instance v0, Lcom/c/b/ay;

    iget-object v1, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    invoke-direct {v0, v1}, Lcom/c/b/ay;-><init>(Lcom/c/b/az;)V

    iput-object v0, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    .line 8402
    iget v0, p0, Lcom/kik/d/b/a$n$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/kik/d/b/a$n$a;->a:I

    .line 8404
    :cond_0
    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 8191
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$n$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$n$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 8191
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$n$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$n$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/d/b/a$n;)Lcom/kik/d/b/a$n$a;
    .locals 2

    .prologue
    .line 8275
    invoke-static {}, Lcom/kik/d/b/a$n;->j()Lcom/kik/d/b/a$n;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 8293
    :goto_0
    return-object p0

    .line 8276
    :cond_0
    invoke-virtual {p1}, Lcom/kik/d/b/a$n;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8277
    iget v0, p0, Lcom/kik/d/b/a$n$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/d/b/a$n$a;->a:I

    .line 8278
    invoke-static {p1}, Lcom/kik/d/b/a$n;->a(Lcom/kik/d/b/a$n;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$n$a;->b:Ljava/lang/Object;

    .line 8279
    invoke-virtual {p0}, Lcom/kik/d/b/a$n$a;->q()V

    .line 8281
    :cond_1
    invoke-static {p1}, Lcom/kik/d/b/a$n;->b(Lcom/kik/d/b/a$n;)Lcom/c/b/az;

    move-result-object v0

    invoke-interface {v0}, Lcom/c/b/az;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 8282
    iget-object v0, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8283
    invoke-static {p1}, Lcom/kik/d/b/a$n;->b(Lcom/kik/d/b/a$n;)Lcom/c/b/az;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    .line 8284
    iget v0, p0, Lcom/kik/d/b/a$n$a;->a:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/kik/d/b/a$n$a;->a:I

    .line 8289
    :goto_1
    invoke-virtual {p0}, Lcom/kik/d/b/a$n$a;->q()V

    .line 8291
    :cond_2
    invoke-static {p1}, Lcom/kik/d/b/a$n;->c(Lcom/kik/d/b/a$n;)Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$n$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 8292
    invoke-virtual {p0}, Lcom/kik/d/b/a$n$a;->q()V

    goto :goto_0

    .line 8286
    :cond_3
    invoke-direct {p0}, Lcom/kik/d/b/a$n$a;->t()V

    .line 8287
    iget-object v0, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    invoke-static {p1}, Lcom/kik/d/b/a$n;->b(Lcom/kik/d/b/a$n;)Lcom/c/b/az;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/c/b/az;->addAll(Ljava/util/Collection;)Z

    goto :goto_1
.end method

.method public final a(Ljava/lang/Iterable;)Lcom/kik/d/b/a$n$a;
    .locals 1

    .prologue
    .line 8462
    invoke-direct {p0}, Lcom/kik/d/b/a$n$a;->t()V

    .line 8463
    iget-object v0, p0, Lcom/kik/d/b/a$n$a;->c:Lcom/c/b/az;

    invoke-static {p1, v0}, Lcom/c/b/b$a;->a(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 8465
    invoke-virtual {p0}, Lcom/kik/d/b/a$n$a;->q()V

    .line 8466
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/d/b/a$n$a;
    .locals 1

    .prologue
    .line 8367
    if-nez p1, :cond_0

    .line 8368
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 8370
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$n$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/d/b/a$n$a;->a:I

    .line 8371
    iput-object p1, p0, Lcom/kik/d/b/a$n$a;->b:Ljava/lang/Object;

    .line 8372
    invoke-virtual {p0}, Lcom/kik/d/b/a$n$a;->q()V

    .line 8373
    return-object p0
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 8297
    iget v2, p0, Lcom/kik/d/b/a$n$a;->a:I

    and-int/lit8 v2, v2, 0x1

    if-ne v2, v1, :cond_0

    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    .line 8300
    :goto_1
    return v0

    :cond_0
    move v2, v0

    .line 8297
    goto :goto_0

    :cond_1
    move v0, v1

    .line 8300
    goto :goto_1
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 8191
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$n$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$n$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 8191
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$n$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$n$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 8191
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$n$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$n$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 8202
    invoke-static {}, Lcom/kik/d/b/a;->n()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$n;

    const-class v2, Lcom/kik/d/b/a$n$a;

    .line 8203
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 8232
    invoke-static {}, Lcom/kik/d/b/a;->m()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 8191
    invoke-direct {p0}, Lcom/kik/d/b/a$n$a;->s()Lcom/kik/d/b/a$n;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 8191
    invoke-virtual {p0}, Lcom/kik/d/b/a$n$a;->r()Lcom/kik/d/b/a$n;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 8191
    invoke-virtual {p0}, Lcom/kik/d/b/a$n$a;->r()Lcom/kik/d/b/a$n;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/d/b/a$n;
    .locals 2

    .prologue
    .line 8240
    invoke-direct {p0}, Lcom/kik/d/b/a$n$a;->s()Lcom/kik/d/b/a$n;

    move-result-object v0

    .line 8241
    invoke-virtual {v0}, Lcom/kik/d/b/a$n;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 8242
    invoke-static {v0}, Lcom/kik/d/b/a$n$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 8244
    :cond_0
    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 8191
    invoke-static {}, Lcom/kik/d/b/a$n;->j()Lcom/kik/d/b/a$n;

    move-result-object v0

    return-object v0
.end method
