.class public final Lcom/kik/o/c$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/o/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/o/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 244
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 329
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/o/c$a;->a:Ljava/lang/Object;

    .line 245
    invoke-static {}, Lcom/kik/o/c;->l()Z

    .line 246
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 227
    invoke-direct {p0}, Lcom/kik/o/c$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 250
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 329
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/o/c$a;->a:Ljava/lang/Object;

    .line 251
    invoke-static {}, Lcom/kik/o/c;->l()Z

    .line 252
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 227
    invoke-direct {p0, p1}, Lcom/kik/o/c$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/o/c$a;
    .locals 1

    .prologue
    .line 289
    instance-of v0, p1, Lcom/kik/o/c;

    if-eqz v0, :cond_0

    .line 290
    check-cast p1, Lcom/kik/o/c;

    invoke-virtual {p0, p1}, Lcom/kik/o/c$a;->a(Lcom/kik/o/c;)Lcom/kik/o/c$a;

    move-result-object p0

    .line 293
    :goto_0
    return-object p0

    .line 292
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/o/c$a;
    .locals 4

    .prologue
    .line 315
    const/4 v2, 0x0

    .line 317
    :try_start_0
    sget-object v0, Lcom/kik/o/c;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/o/c;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 322
    if-eqz v0, :cond_0

    .line 323
    invoke-virtual {p0, v0}, Lcom/kik/o/c$a;->a(Lcom/kik/o/c;)Lcom/kik/o/c$a;

    .line 326
    :cond_0
    return-object p0

    .line 318
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 319
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/o/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 320
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 322
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 323
    invoke-virtual {p0, v1}, Lcom/kik/o/c$a;->a(Lcom/kik/o/c;)Lcom/kik/o/c$a;

    :cond_1
    throw v0

    .line 322
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 227
    invoke-direct {p0, p1}, Lcom/kik/o/c$a;->d(Lcom/c/b/bd;)Lcom/kik/o/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Lcom/c/b/by;)Lcom/c/b/a$a;
    .locals 0

    .prologue
    .line 227
    return-object p0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 227
    invoke-direct {p0, p1, p2}, Lcom/kik/o/c$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/o/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/o/c;)Lcom/kik/o/c$a;
    .locals 1

    .prologue
    .line 298
    invoke-static {}, Lcom/kik/o/c;->k()Lcom/kik/o/c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 304
    :goto_0
    return-object p0

    .line 299
    :cond_0
    invoke-virtual {p1}, Lcom/kik/o/c;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 300
    invoke-static {p1}, Lcom/kik/o/c;->b(Lcom/kik/o/c;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/o/c$a;->a:Ljava/lang/Object;

    .line 301
    invoke-virtual {p0}, Lcom/kik/o/c$a;->q()V

    .line 303
    :cond_1
    invoke-virtual {p0}, Lcom/kik/o/c$a;->q()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/o/c$a;
    .locals 1

    .prologue
    .line 368
    if-nez p1, :cond_0

    .line 369
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 372
    :cond_0
    iput-object p1, p0, Lcom/kik/o/c$a;->a:Ljava/lang/Object;

    .line 373
    invoke-virtual {p0}, Lcom/kik/o/c$a;->q()V

    .line 374
    return-object p0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 308
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 227
    invoke-direct {p0, p1, p2}, Lcom/kik/o/c$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/o/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/c/b/by;)Lcom/c/b/bd$a;
    .locals 0

    .prologue
    .line 227
    return-object p0
.end method

.method public final bridge synthetic c(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 0

    .prologue
    .line 227
    return-object p0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 227
    invoke-direct {p0, p1}, Lcom/kik/o/c$a;->d(Lcom/c/b/bd;)Lcom/kik/o/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 227
    invoke-direct {p0, p1, p2}, Lcom/kik/o/c$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/o/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 0

    .prologue
    .line 227
    return-object p0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 238
    sget-object v0, Lcom/kik/o/a;->d:Lcom/c/b/as$g;

    const-class v1, Lcom/kik/o/c;

    const-class v2, Lcom/kik/o/c$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 266
    sget-object v0, Lcom/kik/o/a;->c:Lcom/c/b/ak$a;

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 227
    invoke-virtual {p0}, Lcom/kik/o/c$a;->s()Lcom/kik/o/c;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 227
    invoke-virtual {p0}, Lcom/kik/o/c$a;->r()Lcom/kik/o/c;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 227
    invoke-virtual {p0}, Lcom/kik/o/c$a;->r()Lcom/kik/o/c;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/o/c;
    .locals 2

    .prologue
    .line 274
    invoke-virtual {p0}, Lcom/kik/o/c$a;->s()Lcom/kik/o/c;

    move-result-object v0

    .line 275
    invoke-virtual {v0}, Lcom/kik/o/c;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 276
    invoke-static {v0}, Lcom/kik/o/c$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 278
    :cond_0
    return-object v0
.end method

.method public final s()Lcom/kik/o/c;
    .locals 2

    .prologue
    .line 282
    new-instance v0, Lcom/kik/o/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kik/o/c;-><init>(Lcom/c/b/as$a;B)V

    .line 283
    iget-object v1, p0, Lcom/kik/o/c$a;->a:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/kik/o/c;->a(Lcom/kik/o/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    invoke-virtual {p0}, Lcom/kik/o/c$a;->l()V

    .line 285
    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 227
    invoke-static {}, Lcom/kik/o/c;->k()Lcom/kik/o/c;

    move-result-object v0

    return-object v0
.end method
