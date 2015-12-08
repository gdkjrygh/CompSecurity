.class public Lorg/spongycastle/crypto/tls/TlsRuntimeException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/Throwable;


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lorg/spongycastle/crypto/tls/TlsRuntimeException;->a:Ljava/lang/Throwable;

    return-object v0
.end method
