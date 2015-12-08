.class public Lorg/spongycastle/jce/MultiCertStoreParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/cert/CertStoreParameters;


# instance fields
.field private a:Ljava/util/Collection;

.field private b:Z


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lorg/spongycastle/jce/MultiCertStoreParameters;->a:Ljava/util/Collection;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 44
    iget-boolean v0, p0, Lorg/spongycastle/jce/MultiCertStoreParameters;->b:Z

    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 0

    .prologue
    .line 49
    return-object p0
.end method
