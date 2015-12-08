.class public Lorg/bouncycastle/openssl/PEMWriter;
.super Lorg/bouncycastle/util/io/pem/PemWriter;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    const-string v0, "BC"

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/openssl/PEMWriter;-><init>(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/bouncycastle/util/io/pem/PemWriter;-><init>(Ljava/io/Writer;)V

    iput-object p2, p0, Lorg/bouncycastle/openssl/PEMWriter;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    :try_start_0
    new-instance v0, Lorg/bouncycastle/openssl/MiscPEMGenerator;

    invoke-direct {v0, p1}, Lorg/bouncycastle/openssl/MiscPEMGenerator;-><init>(Ljava/lang/Object;)V

    invoke-super {p0, v0}, Lorg/bouncycastle/util/io/pem/PemWriter;->a(Lorg/bouncycastle/util/io/pem/PemObjectGenerator;)V
    :try_end_0
    .catch Lorg/bouncycastle/util/io/pem/PemGenerationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/bouncycastle/util/io/pem/PemGenerationException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/io/IOException;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/util/io/pem/PemGenerationException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    throw v0

    :cond_0
    throw v0
.end method

.method public final a(Lorg/bouncycastle/util/io/pem/PemObjectGenerator;)V
    .locals 0

    invoke-super {p0, p1}, Lorg/bouncycastle/util/io/pem/PemWriter;->a(Lorg/bouncycastle/util/io/pem/PemObjectGenerator;)V

    return-void
.end method
