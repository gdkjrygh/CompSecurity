.class public Lorg/spongycastle/asn1/DERT61String;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1String;


# instance fields
.field private a:[B


# direct methods
.method constructor <init>([B)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 64
    iput-object p1, p0, Lorg/spongycastle/asn1/DERT61String;->a:[B

    .line 65
    return-void
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 2

    .prologue
    .line 100
    const/16 v0, 0x14

    iget-object v1, p0, Lorg/spongycastle/asn1/DERT61String;->a:[B

    invoke-virtual {p1, v0, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I[B)V

    .line 101
    return-void
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 2

    .prologue
    .line 111
    instance-of v0, p1, Lorg/spongycastle/asn1/DERT61String;

    if-nez v0, :cond_0

    .line 113
    const/4 v0, 0x0

    .line 116
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/DERT61String;->a:[B

    check-cast p1, Lorg/spongycastle/asn1/DERT61String;

    iget-object v1, p1, Lorg/spongycastle/asn1/DERT61String;->a:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lorg/spongycastle/asn1/DERT61String;->a:[B

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v0

    return v0
.end method

.method final i()I
    .locals 2

    .prologue
    .line 93
    iget-object v0, p0, Lorg/spongycastle/asn1/DERT61String;->a:[B

    array-length v0, v0

    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lorg/spongycastle/asn1/DERT61String;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final o_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lorg/spongycastle/asn1/DERT61String;->a:[B

    invoke-static {v0}, Lorg/spongycastle/util/Strings;->b([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERT61String;->o_()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
