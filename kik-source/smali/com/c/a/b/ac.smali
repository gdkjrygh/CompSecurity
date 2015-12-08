.class public final Lcom/c/a/b/ac;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lcom/c/a/a/r$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 3458
    sget-object v0, Lcom/c/a/b/e;->a:Lcom/c/a/a/r;

    const-string v1, "="

    invoke-virtual {v0, v1}, Lcom/c/a/a/r;->c(Ljava/lang/String;)Lcom/c/a/a/r$a;

    move-result-object v0

    sput-object v0, Lcom/c/a/b/ac;->a:Lcom/c/a/a/r$a;

    return-void
.end method

.method static a()I
    .locals 2

    .prologue
    .line 204
    const/4 v0, 0x1

    const-string v1, "expectedSize"

    invoke-static {v0, v1}, Lcom/c/a/b/d;->a(ILjava/lang/String;)I

    .line 206
    const/4 v0, 0x2

    return v0
.end method

.method static a(Lcom/c/a/b/ao;)Lcom/c/a/b/ao;
    .locals 1

    .prologue
    .line 122
    new-instance v0, Lcom/c/a/b/ad;

    invoke-direct {v0, p0}, Lcom/c/a/b/ad;-><init>(Lcom/c/a/b/ao;)V

    return-object v0
.end method

.method static a(Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 3465
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Lcom/c/a/b/e;->a(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3467
    sget-object v1, Lcom/c/a/b/ac;->a:Lcom/c/a/a/r$a;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/c/a/a/r$a;->a(Ljava/lang/StringBuilder;Ljava/util/Iterator;)Ljava/lang/StringBuilder;

    .line 3468
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 1207
    new-instance v0, Lcom/c/a/b/l;

    invoke-direct {v0, p0, p1}, Lcom/c/a/b/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method static a(Ljava/util/Map;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 3449
    if-ne p0, p1, :cond_0

    .line 3450
    const/4 v0, 0x1

    .line 3455
    :goto_0
    return v0

    .line 3451
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 3452
    check-cast p1, Ljava/util/Map;

    .line 3453
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 3455
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
