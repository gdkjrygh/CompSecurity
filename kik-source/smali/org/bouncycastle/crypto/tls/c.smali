.class final Lorg/bouncycastle/crypto/tls/c;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsClientContext;


# instance fields
.field private a:Ljava/security/SecureRandom;

.field private b:Lorg/bouncycastle/crypto/tls/SecurityParameters;

.field private c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/tls/SecurityParameters;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/c;->c:Ljava/lang/Object;

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/c;->a:Ljava/security/SecureRandom;

    iput-object p2, p0, Lorg/bouncycastle/crypto/tls/c;->b:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    return-void
.end method


# virtual methods
.method public final getSecureRandom()Ljava/security/SecureRandom;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/c;->a:Ljava/security/SecureRandom;

    return-object v0
.end method

.method public final getSecurityParameters()Lorg/bouncycastle/crypto/tls/SecurityParameters;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/c;->b:Lorg/bouncycastle/crypto/tls/SecurityParameters;

    return-object v0
.end method

.method public final getUserObject()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/c;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final setUserObject(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/c;->c:Ljava/lang/Object;

    return-void
.end method
