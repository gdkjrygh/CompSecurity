.class public Lorg/spongycastle/ocsp/OCSPException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/Exception;


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lorg/spongycastle/ocsp/OCSPException;->a:Ljava/lang/Exception;

    return-object v0
.end method
