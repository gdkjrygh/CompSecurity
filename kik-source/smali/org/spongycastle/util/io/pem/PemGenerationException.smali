.class public Lorg/spongycastle/util/io/pem/PemGenerationException;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Throwable;


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lorg/spongycastle/util/io/pem/PemGenerationException;->a:Ljava/lang/Throwable;

    return-object v0
.end method
