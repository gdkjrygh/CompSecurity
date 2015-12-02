.class public Lcom/google/inject/a/h;
.super Ljava/lang/Object;
.source "MoreTypes.java"

# interfaces
.implements Lcom/google/inject/a/e;
.implements Ljava/io/Serializable;
.implements Ljava/lang/reflect/WildcardType;


# instance fields
.field private final a:Ljava/lang/reflect/Type;

.field private final b:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 448
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 449
    array-length v0, p2

    if-gt v0, v1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Must have at most one lower bound."

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 450
    array-length v0, p1

    if-ne v0, v1, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Must have exactly one upper bound."

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 452
    array-length v0, p2

    if-ne v0, v1, :cond_3

    .line 453
    aget-object v0, p2, v2

    const-string v3, "lowerBound"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    aget-object v0, p2, v2

    const-string v3, "wildcard bounds"

    invoke-static {v0, v3}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;Ljava/lang/String;)V

    .line 455
    aget-object v0, p1, v2

    const-class v3, Ljava/lang/Object;

    if-ne v0, v3, :cond_2

    :goto_2
    const-string v0, "bounded both ways"

    invoke-static {v1, v0}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 456
    aget-object v0, p2, v2

    invoke-static {v0}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    .line 457
    const-class v0, Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/inject/a/h;->a:Ljava/lang/reflect/Type;

    .line 465
    :goto_3
    return-void

    :cond_0
    move v0, v2

    .line 449
    goto :goto_0

    :cond_1
    move v0, v2

    .line 450
    goto :goto_1

    :cond_2
    move v1, v2

    .line 455
    goto :goto_2

    .line 460
    :cond_3
    aget-object v0, p1, v2

    const-string v1, "upperBound"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    aget-object v0, p1, v2

    const-string v1, "wildcard bounds"

    invoke-static {v0, v1}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;Ljava/lang/String;)V

    .line 462
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    .line 463
    aget-object v0, p1, v2

    invoke-static {v0}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/a/h;->a:Ljava/lang/reflect/Type;

    goto :goto_3
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 476
    iget-object v0, p0, Lcom/google/inject/a/h;->a:Ljava/lang/reflect/Type;

    invoke-static {v0}, Lcom/google/inject/a/d;->d(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    invoke-static {v0}, Lcom/google/inject/a/d;->d(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 481
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/reflect/WildcardType;

    invoke-static {p0, p1}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getLowerBounds()[Ljava/lang/reflect/Type;
    .locals 3

    .prologue
    .line 472
    iget-object v0, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    aput-object v2, v0, v1

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/inject/a/d;->a:[Ljava/lang/reflect/Type;

    goto :goto_0
.end method

.method public getUpperBounds()[Ljava/lang/reflect/Type;
    .locals 3

    .prologue
    .line 468
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/inject/a/h;->a:Ljava/lang/reflect/Type;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 487
    iget-object v0, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    :goto_0
    iget-object v1, p0, Lcom/google/inject/a/h;->a:Ljava/lang/reflect/Type;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/lit8 v1, v1, 0x1f

    xor-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 492
    iget-object v0, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    if-eqz v0, :cond_0

    .line 493
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "? super "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/a/h;->b:Ljava/lang/reflect/Type;

    invoke-static {v1}, Lcom/google/inject/a/d;->c(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 497
    :goto_0
    return-object v0

    .line 494
    :cond_0
    iget-object v0, p0, Lcom/google/inject/a/h;->a:Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    .line 495
    const-string v0, "?"

    goto :goto_0

    .line 497
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "? extends "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/a/h;->a:Ljava/lang/reflect/Type;

    invoke-static {v1}, Lcom/google/inject/a/d;->c(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
