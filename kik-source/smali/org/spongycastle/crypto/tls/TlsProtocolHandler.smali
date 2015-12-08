.class public Lorg/spongycastle/crypto/tls/TlsProtocolHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Integer;

.field private static final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 23
    new-instance v0, Ljava/lang/Integer;

    const v1, 0xff01

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    sput-object v0, Lorg/spongycastle/crypto/tls/TlsProtocolHandler;->a:Ljava/lang/Integer;

    .line 41
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lorg/spongycastle/crypto/tls/TlsProtocolHandler;->b:[B

    return-void
.end method
