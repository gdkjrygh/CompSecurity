.class public Lorg/spongycastle/jce/exception/ExtIOException;
.super Ljava/io/IOException;
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
    iget-object v0, p0, Lorg/spongycastle/jce/exception/ExtIOException;->a:Ljava/lang/Throwable;

    return-object v0
.end method
