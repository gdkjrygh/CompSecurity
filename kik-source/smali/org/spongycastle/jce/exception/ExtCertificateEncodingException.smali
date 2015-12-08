.class public Lorg/spongycastle/jce/exception/ExtCertificateEncodingException;
.super Ljava/security/cert/CertificateEncodingException;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jce/exception/ExtException;


# instance fields
.field private a:Ljava/lang/Throwable;


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lorg/spongycastle/jce/exception/ExtCertificateEncodingException;->a:Ljava/lang/Throwable;

    return-object v0
.end method
