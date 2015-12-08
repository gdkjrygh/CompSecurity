.class final Lorg/spongycastle/asn1/h;
.super Lorg/spongycastle/asn1/ASN1Sequence;
.source "SourceFile"


# instance fields
.field private b:[B


# direct methods
.method constructor <init>([B)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Sequence;-><init>()V

    .line 18
    iput-object p1, p0, Lorg/spongycastle/asn1/h;->b:[B

    .line 19
    return-void
.end method

.method private j()V
    .locals 3

    .prologue
    .line 23
    new-instance v0, Lorg/spongycastle/asn1/g;

    iget-object v1, p0, Lorg/spongycastle/asn1/h;->b:[B

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/g;-><init>([B)V

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 27
    iget-object v1, p0, Lorg/spongycastle/asn1/h;->a:Ljava/util/Vector;

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/asn1/h;->b:[B

    .line 31
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(I)Lorg/spongycastle/asn1/ASN1Encodable;
    .locals 1

    .prologue
    .line 35
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/asn1/h;->b:[B

    if-eqz v0, :cond_0

    .line 37
    invoke-direct {p0}, Lorg/spongycastle/asn1/h;->j()V

    .line 40
    :cond_0
    invoke-super {p0, p1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 2

    .prologue
    .line 100
    iget-object v0, p0, Lorg/spongycastle/asn1/h;->b:[B

    if-eqz v0, :cond_0

    .line 102
    const/16 v0, 0x30

    iget-object v1, p0, Lorg/spongycastle/asn1/h;->b:[B

    invoke-virtual {p1, v0, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I[B)V

    .line 108
    :goto_0
    return-void

    .line 106
    :cond_0
    invoke-super {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->g()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/spongycastle/asn1/ASN1Primitive;->a(Lorg/spongycastle/asn1/ASN1OutputStream;)V

    goto :goto_0
.end method

.method public final declared-synchronized d()Ljava/util/Enumeration;
    .locals 2

    .prologue
    .line 45
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/asn1/h;->b:[B

    if-nez v0, :cond_0

    .line 47
    invoke-super {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 50
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    new-instance v0, Lorg/spongycastle/asn1/g;

    iget-object v1, p0, Lorg/spongycastle/asn1/h;->b:[B

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/g;-><init>([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized e()I
    .locals 1

    .prologue
    .line 55
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/asn1/h;->b:[B

    if-eqz v0, :cond_0

    .line 57
    invoke-direct {p0}, Lorg/spongycastle/asn1/h;->j()V

    .line 60
    :cond_0
    invoke-super {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    .line 55
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final f()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lorg/spongycastle/asn1/h;->b:[B

    if-eqz v0, :cond_0

    .line 67
    invoke-direct {p0}, Lorg/spongycastle/asn1/h;->j()V

    .line 70
    :cond_0
    invoke-super {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->f()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    return-object v0
.end method

.method final g()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lorg/spongycastle/asn1/h;->b:[B

    if-eqz v0, :cond_0

    .line 77
    invoke-direct {p0}, Lorg/spongycastle/asn1/h;->j()V

    .line 80
    :cond_0
    invoke-super {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->g()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    return-object v0
.end method

.method final i()I
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lorg/spongycastle/asn1/h;->b:[B

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lorg/spongycastle/asn1/h;->b:[B

    array-length v0, v0

    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lorg/spongycastle/asn1/h;->b:[B

    array-length v1, v1

    add-int/2addr v0, v1

    .line 92
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->g()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->i()I

    move-result v0

    goto :goto_0
.end method
