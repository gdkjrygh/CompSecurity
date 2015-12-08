.class public abstract Lorg/spongycastle/crypto/tls/SRPTlsClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/tls/TlsClient;


# static fields
.field public static final a:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 11
    new-instance v0, Ljava/lang/Integer;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    sput-object v0, Lorg/spongycastle/crypto/tls/SRPTlsClient;->a:Ljava/lang/Integer;

    return-void
.end method
