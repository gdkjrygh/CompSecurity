.class public Lorg/spongycastle/asn1/BERConstructedOctetString;
.super Lorg/spongycastle/asn1/BEROctetString;
.source "SourceFile"


# instance fields
.field private b:Ljava/util/Vector;


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/BEROctetString;-><init>([B)V

    .line 54
    return-void
.end method


# virtual methods
.method public final d()[B
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lorg/spongycastle/asn1/BERConstructedOctetString;->a:[B

    return-object v0
.end method

.method public final j()Ljava/util/Enumeration;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 98
    iget-object v0, p0, Lorg/spongycastle/asn1/BERConstructedOctetString;->b:Ljava/util/Vector;

    if-nez v0, :cond_2

    .line 100
    new-instance v3, Ljava/util/Vector;

    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/asn1/BERConstructedOctetString;->a:[B

    array-length v2, v2

    if-ge v0, v2, :cond_1

    add-int/lit16 v2, v0, 0x3e8

    iget-object v4, p0, Lorg/spongycastle/asn1/BERConstructedOctetString;->a:[B

    array-length v4, v4

    if-le v2, v4, :cond_0

    iget-object v2, p0, Lorg/spongycastle/asn1/BERConstructedOctetString;->a:[B

    array-length v2, v2

    :goto_1
    sub-int/2addr v2, v0

    new-array v2, v2, [B

    iget-object v4, p0, Lorg/spongycastle/asn1/BERConstructedOctetString;->a:[B

    array-length v5, v2

    invoke-static {v4, v0, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v4, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v4, v2}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-virtual {v3, v4}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit16 v0, v0, 0x3e8

    goto :goto_0

    :cond_0
    add-int/lit16 v2, v0, 0x3e8

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    .line 103
    :goto_2
    return-object v0

    :cond_2
    iget-object v0, p0, Lorg/spongycastle/asn1/BERConstructedOctetString;->b:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    goto :goto_2
.end method
