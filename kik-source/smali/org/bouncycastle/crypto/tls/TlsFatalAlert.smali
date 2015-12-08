.class public Lorg/bouncycastle/crypto/tls/TlsFatalAlert;
.super Ljava/io/IOException;


# instance fields
.field private a:S


# direct methods
.method public constructor <init>(S)V
    .locals 0

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    iput-short p1, p0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;->a:S

    return-void
.end method


# virtual methods
.method public getAlertDescription()S
    .locals 1

    iget-short v0, p0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;->a:S

    return v0
.end method
