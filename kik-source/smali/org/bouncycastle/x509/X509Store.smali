.class public Lorg/bouncycastle/x509/X509Store;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/util/Store;


# instance fields
.field private a:Ljava/security/Provider;

.field private b:Lorg/bouncycastle/x509/X509StoreSpi;


# direct methods
.method private constructor <init>(Ljava/security/Provider;Lorg/bouncycastle/x509/X509StoreSpi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/x509/X509Store;->a:Ljava/security/Provider;

    iput-object p2, p0, Lorg/bouncycastle/x509/X509Store;->b:Lorg/bouncycastle/x509/X509StoreSpi;

    return-void
.end method

.method public static a(Ljava/lang/String;Lorg/bouncycastle/x509/X509StoreParameters;Ljava/lang/String;)Lorg/bouncycastle/x509/X509Store;
    .locals 1

    invoke-static {p2}, Lorg/bouncycastle/x509/a;->a(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/bouncycastle/x509/X509Store;->a(Ljava/lang/String;Lorg/bouncycastle/x509/X509StoreParameters;Ljava/security/Provider;)Lorg/bouncycastle/x509/X509Store;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Lorg/bouncycastle/x509/X509StoreParameters;Ljava/security/Provider;)Lorg/bouncycastle/x509/X509Store;
    .locals 3

    :try_start_0
    const-string v0, "X509Store"

    invoke-static {v0, p0, p2}, Lorg/bouncycastle/x509/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/security/Provider;)Lorg/bouncycastle/x509/a$a;

    move-result-object v1

    iget-object v0, v1, Lorg/bouncycastle/x509/a$a;->a:Ljava/lang/Object;

    check-cast v0, Lorg/bouncycastle/x509/X509StoreSpi;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/x509/X509StoreSpi;->a(Lorg/bouncycastle/x509/X509StoreParameters;)V

    new-instance v2, Lorg/bouncycastle/x509/X509Store;

    iget-object v1, v1, Lorg/bouncycastle/x509/a$a;->b:Ljava/security/Provider;

    invoke-direct {v2, v1, v0}, Lorg/bouncycastle/x509/X509Store;-><init>(Ljava/security/Provider;Lorg/bouncycastle/x509/X509StoreSpi;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/x509/NoSuchStoreException;

    invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/x509/NoSuchStoreException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a(Lorg/bouncycastle/util/Selector;)Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/X509Store;->b:Lorg/bouncycastle/x509/X509StoreSpi;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/x509/X509StoreSpi;->a(Lorg/bouncycastle/util/Selector;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
