.class final Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:[B

.field final synthetic b:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;


# direct methods
.method constructor <init>(Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V
    .locals 1

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;->b:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;->e()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;[B)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;->b:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    check-cast p1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    iget-object v1, p1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->b([B)I

    move-result v0

    return v0
.end method
