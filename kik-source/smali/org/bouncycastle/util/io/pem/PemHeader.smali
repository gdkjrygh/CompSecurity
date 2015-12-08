.class public Lorg/bouncycastle/util/io/pem/PemHeader;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/util/io/pem/PemHeader;->a:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/util/io/pem/PemHeader;->b:Ljava/lang/String;

    return-void
.end method

.method private static a(Ljava/lang/String;)I
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    if-eqz p0, :cond_1

    if-nez p1, :cond_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/util/io/pem/PemHeader;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/util/io/pem/PemHeader;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/util/io/pem/PemHeader;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/util/io/pem/PemHeader;

    if-eq p1, p0, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/util/io/pem/PemHeader;->a:Ljava/lang/String;

    iget-object v2, p1, Lorg/bouncycastle/util/io/pem/PemHeader;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lorg/bouncycastle/util/io/pem/PemHeader;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/util/io/pem/PemHeader;->b:Ljava/lang/String;

    iget-object v2, p1, Lorg/bouncycastle/util/io/pem/PemHeader;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lorg/bouncycastle/util/io/pem/PemHeader;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/util/io/pem/PemHeader;->a:Ljava/lang/String;

    invoke-static {v0}, Lorg/bouncycastle/util/io/pem/PemHeader;->a(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/util/io/pem/PemHeader;->b:Ljava/lang/String;

    invoke-static {v1}, Lorg/bouncycastle/util/io/pem/PemHeader;->a(Ljava/lang/String;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method
