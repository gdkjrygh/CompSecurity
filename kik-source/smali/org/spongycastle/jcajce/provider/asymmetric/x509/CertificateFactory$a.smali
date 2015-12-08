.class final Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory$a;
.super Ljava/security/cert/CertificateException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;

.field private b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 381
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory$a;->a:Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory;

    invoke-direct {p0}, Ljava/security/cert/CertificateException;-><init>()V

    .line 382
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory$a;->b:Ljava/lang/Throwable;

    .line 383
    return-void
.end method


# virtual methods
.method public final getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 394
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/x509/CertificateFactory$a;->b:Ljava/lang/Throwable;

    return-object v0
.end method
