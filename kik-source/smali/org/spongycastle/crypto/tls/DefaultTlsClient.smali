.class public abstract Lorg/spongycastle/crypto/tls/DefaultTlsClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/tls/TlsClient;


# instance fields
.field protected a:Lorg/spongycastle/crypto/tls/TlsCipherFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    new-instance v0, Lorg/spongycastle/crypto/tls/DefaultTlsCipherFactory;

    invoke-direct {v0}, Lorg/spongycastle/crypto/tls/DefaultTlsCipherFactory;-><init>()V

    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/tls/DefaultTlsClient;-><init>(Lorg/spongycastle/crypto/tls/TlsCipherFactory;)V

    .line 18
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/crypto/tls/TlsCipherFactory;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lorg/spongycastle/crypto/tls/DefaultTlsClient;->a:Lorg/spongycastle/crypto/tls/TlsCipherFactory;

    .line 23
    return-void
.end method
