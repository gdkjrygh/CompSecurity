.class abstract Lcom/cleanmaster/base/util/misc/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field b:Lcom/cleanmaster/base/util/misc/f;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 353
    return-void
.end method

.method public static a(Ljava/util/Set;Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 510
    if-ne p0, p1, :cond_1

    .line 524
    :cond_0
    :goto_0
    return v0

    .line 513
    :cond_1
    instance-of v2, p1, Ljava/util/Set;

    if-eqz v2, :cond_3

    .line 514
    check-cast p1, Ljava/util/Set;

    .line 517
    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v2

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0

    .line 519
    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 521
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 524
    goto :goto_0
.end method


# virtual methods
.method protected abstract a()I
.end method

.method protected abstract a(Ljava/lang/Object;)I
.end method

.method protected abstract a(I)Ljava/lang/Object;
.end method

.method public final a([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    .prologue
    .line 494
    invoke-virtual {p0}, Lcom/cleanmaster/base/util/misc/d;->a()I

    move-result v2

    .line 495
    array-length v0, p1

    if-ge v0, v2, :cond_2

    .line 496
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    .line 500
    :goto_0
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_0

    .line 501
    invoke-virtual {p0, v1}, Lcom/cleanmaster/base/util/misc/d;->a(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v0, v1

    .line 500
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 503
    :cond_0
    array-length v1, v0

    if-le v1, v2, :cond_1

    .line 504
    const/4 v1, 0x0

    aput-object v1, v0, v2

    .line 506
    :cond_1
    return-object v0

    :cond_2
    move-object v0, p1

    goto :goto_0
.end method

.method protected abstract b()Ljava/util/Map;
.end method

.method protected abstract b(I)V
.end method

.method protected abstract c()V
.end method

.method public final d()[Ljava/lang/Object;
    .locals 4

    .prologue
    .line 485
    invoke-virtual {p0}, Lcom/cleanmaster/base/util/misc/d;->a()I

    move-result v1

    .line 486
    new-array v2, v1, [Ljava/lang/Object;

    .line 487
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 488
    invoke-virtual {p0, v0}, Lcom/cleanmaster/base/util/misc/d;->a(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v0

    .line 487
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 490
    :cond_0
    return-object v2
.end method
