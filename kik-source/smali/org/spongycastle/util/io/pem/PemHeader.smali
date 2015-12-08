.class public Lorg/spongycastle/util/io/pem/PemHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method private static a(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 43
    if-nez p0, :cond_0

    .line 45
    const/4 v0, 0x1

    .line 48
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 53
    if-ne p0, p1, :cond_0

    .line 55
    const/4 v0, 0x1

    .line 63
    :goto_0
    return v0

    .line 58
    :cond_0
    if-eqz p0, :cond_1

    if-nez p1, :cond_2

    .line 60
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lorg/spongycastle/util/io/pem/PemHeader;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lorg/spongycastle/util/io/pem/PemHeader;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 31
    instance-of v1, p1, Lorg/spongycastle/util/io/pem/PemHeader;

    if-nez v1, :cond_1

    .line 38
    :cond_0
    :goto_0
    return v0

    .line 36
    :cond_1
    check-cast p1, Lorg/spongycastle/util/io/pem/PemHeader;

    .line 38
    if-eq p1, p0, :cond_2

    iget-object v1, p0, Lorg/spongycastle/util/io/pem/PemHeader;->a:Ljava/lang/String;

    iget-object v2, p1, Lorg/spongycastle/util/io/pem/PemHeader;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lorg/spongycastle/util/io/pem/PemHeader;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/spongycastle/util/io/pem/PemHeader;->b:Ljava/lang/String;

    iget-object v2, p1, Lorg/spongycastle/util/io/pem/PemHeader;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lorg/spongycastle/util/io/pem/PemHeader;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lorg/spongycastle/util/io/pem/PemHeader;->a:Ljava/lang/String;

    invoke-static {v0}, Lorg/spongycastle/util/io/pem/PemHeader;->a(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/util/io/pem/PemHeader;->b:Ljava/lang/String;

    invoke-static {v1}, Lorg/spongycastle/util/io/pem/PemHeader;->a(Ljava/lang/String;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method
