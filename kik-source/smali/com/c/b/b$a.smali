.class public abstract Lcom/c/b/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/be$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 246
    return-void
.end method

.method private static a(Ljava/lang/Iterable;)V
    .locals 2

    .prologue
    .line 356
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 357
    if-nez v1, :cond_0

    .line 358
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 361
    :cond_1
    return-void
.end method

.method protected static a(Ljava/lang/Iterable;Ljava/util/Collection;)V
    .locals 2

    .prologue
    .line 334
    if-nez p0, :cond_0

    .line 335
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 337
    :cond_0
    instance-of v0, p0, Lcom/c/b/az;

    if-eqz v0, :cond_2

    move-object v0, p0

    .line 340
    check-cast v0, Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/b$a;->a(Ljava/lang/Iterable;)V

    .line 341
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p1, p0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 353
    :cond_1
    :goto_0
    return-void

    .line 342
    :cond_2
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_3

    .line 343
    invoke-static {p0}, Lcom/c/b/b$a;->a(Ljava/lang/Iterable;)V

    .line 344
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p1, p0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 346
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 347
    if-nez v1, :cond_4

    .line 348
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 350
    :cond_4
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 3

    .prologue
    .line 161
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/f;->h()Lcom/c/b/g;

    move-result-object v0

    .line 162
    invoke-virtual {p0, v0, p2}, Lcom/c/b/b$a;->b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;

    .line 163
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/c/b/g;->a(I)V
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 164
    return-object p0

    .line 165
    :catch_0
    move-exception v0

    throw v0

    .line 167
    :catch_1
    move-exception v0

    .line 168
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Reading from a ByteString threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public abstract b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
.end method

.method public abstract c()Lcom/c/b/b$a;
.end method

.method public synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 122
    invoke-virtual {p0, p1, p2}, Lcom/c/b/b$a;->b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 122
    invoke-virtual {p0}, Lcom/c/b/b$a;->c()Lcom/c/b/b$a;

    move-result-object v0

    return-object v0
.end method
