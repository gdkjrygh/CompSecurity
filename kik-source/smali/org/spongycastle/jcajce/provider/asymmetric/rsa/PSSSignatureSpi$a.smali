.class final Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/Digest;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;

.field private b:Ljava/io/ByteArrayOutputStream;

.field private c:Lorg/spongycastle/crypto/Digest;

.field private d:Z


# direct methods
.method public constructor <init>(Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;Lorg/spongycastle/crypto/Digest;)V
    .locals 1

    .prologue
    .line 337
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->a:Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 332
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->b:Ljava/io/ByteArrayOutputStream;

    .line 334
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->d:Z

    .line 338
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->c:Lorg/spongycastle/crypto/Digest;

    .line 339
    return-void
.end method


# virtual methods
.method public final a([BI)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 363
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 365
    iget-boolean v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->d:Z

    if-eqz v2, :cond_1

    .line 367
    array-length v2, v1

    invoke-static {v1, v0, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 376
    :goto_0
    invoke-virtual {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->c()V

    .line 378
    iget-boolean v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->d:Z

    if-nez v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->d:Z

    .line 380
    array-length v0, v1

    return v0

    .line 371
    :cond_1
    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->c:Lorg/spongycastle/crypto/Digest;

    array-length v3, v1

    invoke-interface {v2, v1, v0, v3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 373
    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v2, p1, p2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 343
    const-string v0, "NULL"

    return-object v0
.end method

.method public final a(B)V
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 354
    return-void
.end method

.method public final a([BII)V
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 359
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 385
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->b:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 386
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 387
    return-void
.end method
