.class public Lcom/google/inject/a/g;
.super Ljava/lang/Object;
.source "MoreTypes.java"

# interfaces
.implements Lcom/google/inject/a/e;
.implements Ljava/io/Serializable;
.implements Ljava/lang/reflect/ParameterizedType;


# instance fields
.field private final a:Ljava/lang/reflect/Type;

.field private final b:Ljava/lang/reflect/Type;

.field private final c:[Ljava/lang/reflect/Type;


# direct methods
.method public varargs constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 330
    instance-of v0, p2, Ljava/lang/Class;

    if-eqz v0, :cond_2

    move-object v0, p2

    .line 331
    check-cast v0, Ljava/lang/Class;

    .line 332
    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_0
    move v1, v3

    :goto_0
    const-string v4, "No owner type for enclosed %s"

    new-array v5, v3, [Ljava/lang/Object;

    aput-object p2, v5, v2

    invoke-static {v1, v4, v5}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 334
    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_4

    :cond_1
    move v0, v3

    :goto_1
    const-string v1, "Owner type for unenclosed %s"

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p2, v3, v2

    invoke-static {v0, v1, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 338
    :cond_2
    if-nez p1, :cond_5

    const/4 v0, 0x0

    :goto_2
    iput-object v0, p0, Lcom/google/inject/a/g;->a:Ljava/lang/reflect/Type;

    .line 339
    invoke-static {p2}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/a/g;->b:Ljava/lang/reflect/Type;

    .line 340
    invoke-virtual {p3}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    iput-object v0, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    .line 341
    :goto_3
    iget-object v0, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    array-length v0, v0

    if-ge v2, v0, :cond_6

    .line 342
    iget-object v0, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    aget-object v0, v0, v2

    const-string v1, "type parameter"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    iget-object v0, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    aget-object v0, v0, v2

    const-string v1, "type parameters"

    invoke-static {v0, v1}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;Ljava/lang/String;)V

    .line 344
    iget-object v0, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    iget-object v1, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    aput-object v1, v0, v2

    .line 341
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    move v1, v2

    .line 332
    goto :goto_0

    :cond_4
    move v0, v2

    .line 334
    goto :goto_1

    .line 338
    :cond_5
    invoke-static {p1}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    goto :goto_2

    .line 346
    :cond_6
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 361
    iget-object v1, p0, Lcom/google/inject/a/g;->a:Ljava/lang/reflect/Type;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/inject/a/g;->a:Ljava/lang/reflect/Type;

    invoke-static {v1}, Lcom/google/inject/a/d;->d(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 375
    :cond_0
    :goto_0
    return v0

    .line 365
    :cond_1
    iget-object v1, p0, Lcom/google/inject/a/g;->b:Ljava/lang/reflect/Type;

    invoke-static {v1}, Lcom/google/inject/a/d;->d(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 369
    iget-object v2, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    array-length v3, v2

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_2

    aget-object v4, v2, v1

    .line 370
    invoke-static {v4}, Lcom/google/inject/a/d;->d(Ljava/lang/reflect/Type;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 369
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 375
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 379
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

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

.method public getActualTypeArguments()[Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    .line 349
    iget-object v0, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    invoke-virtual {v0}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public getOwnerType()Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    .line 357
    iget-object v0, p0, Lcom/google/inject/a/g;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public getRawType()Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Lcom/google/inject/a/g;->b:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 384
    iget-object v0, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lcom/google/inject/a/g;->b:Ljava/lang/reflect/Type;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/inject/a/g;->a:Ljava/lang/reflect/Type;

    invoke-static {v1}, Lcom/google/inject/a/d;->a(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 390
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x1e

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 391
    iget-object v0, p0, Lcom/google/inject/a/g;->b:Ljava/lang/reflect/Type;

    invoke-static {v0}, Lcom/google/inject/a/d;->c(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    iget-object v0, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    array-length v0, v0

    if-nez v0, :cond_0

    .line 394
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 401
    :goto_0
    return-object v0

    .line 397
    :cond_0
    const-string v0, "<"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-static {v2}, Lcom/google/inject/a/d;->c(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    const/4 v0, 0x1

    :goto_1
    iget-object v2, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 399
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/a/g;->c:[Ljava/lang/reflect/Type;

    aget-object v3, v3, v0

    invoke-static {v3}, Lcom/google/inject/a/d;->c(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 401
    :cond_1
    const-string v0, ">"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
