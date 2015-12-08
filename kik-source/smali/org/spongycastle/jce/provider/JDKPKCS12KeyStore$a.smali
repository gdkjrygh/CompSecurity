.class final Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:[B

.field final synthetic b:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;


# direct methods
.method constructor <init>(Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V
    .locals 1

    .prologue
    .line 124
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;->b:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    invoke-static {p2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;->c()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    .line 126
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;[B)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;->b:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput-object p2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    .line 132
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 142
    if-ne p1, p0, :cond_0

    .line 144
    const/4 v0, 0x1

    .line 154
    :goto_0
    return v0

    .line 147
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;

    if-nez v0, :cond_1

    .line 149
    const/4 v0, 0x0

    goto :goto_0

    .line 152
    :cond_1
    check-cast p1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;

    .line 154
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    iget-object v1, p1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;->a:[B

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v0

    return v0
.end method
