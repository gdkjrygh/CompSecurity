.class public Lorg/spongycastle/asn1/DLTaggedObject;
.super Lorg/spongycastle/asn1/ASN1TaggedObject;
.source "SourceFile"


# static fields
.field private static final e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lorg/spongycastle/asn1/DLTaggedObject;->e:[B

    return-void
.end method

.method public constructor <init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Lorg/spongycastle/asn1/ASN1TaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 26
    return-void
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 3

    .prologue
    const/16 v0, 0xa0

    .line 78
    iget-boolean v1, p0, Lorg/spongycastle/asn1/DLTaggedObject;->b:Z

    if-nez v1, :cond_2

    .line 80
    iget-object v1, p0, Lorg/spongycastle/asn1/DLTaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v1}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Primitive;->g()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    .line 82
    iget-boolean v2, p0, Lorg/spongycastle/asn1/DLTaggedObject;->c:Z

    if-eqz v2, :cond_0

    .line 84
    iget v2, p0, Lorg/spongycastle/asn1/DLTaggedObject;->a:I

    invoke-virtual {p1, v0, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(II)V

    .line 85
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Primitive;->i()I

    move-result v0

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I)V

    .line 86
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 111
    :goto_0
    return-void

    .line 94
    :cond_0
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Primitive;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 103
    :goto_1
    iget v2, p0, Lorg/spongycastle/asn1/DLTaggedObject;->a:I

    invoke-virtual {p1, v0, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(II)V

    .line 104
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(Lorg/spongycastle/asn1/ASN1Primitive;)V

    goto :goto_0

    .line 100
    :cond_1
    const/16 v0, 0x80

    goto :goto_1

    .line 109
    :cond_2
    iget v1, p0, Lorg/spongycastle/asn1/DLTaggedObject;->a:I

    sget-object v2, Lorg/spongycastle/asn1/DLTaggedObject;->e:[B

    invoke-virtual {p1, v0, v1, v2}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(II[B)V

    goto :goto_0
.end method

.method final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 30
    iget-boolean v1, p0, Lorg/spongycastle/asn1/DLTaggedObject;->b:Z

    if-nez v1, :cond_0

    .line 32
    iget-boolean v1, p0, Lorg/spongycastle/asn1/DLTaggedObject;->c:Z

    if-eqz v1, :cond_1

    .line 45
    :cond_0
    :goto_0
    return v0

    .line 38
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/asn1/DLTaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->g()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->h()Z

    move-result v0

    goto :goto_0
.end method

.method final i()I
    .locals 3

    .prologue
    .line 52
    iget-boolean v0, p0, Lorg/spongycastle/asn1/DLTaggedObject;->b:Z

    if-nez v0, :cond_1

    .line 54
    iget-object v0, p0, Lorg/spongycastle/asn1/DLTaggedObject;->d:Lorg/spongycastle/asn1/ASN1Encodable;

    invoke-interface {v0}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->g()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->i()I

    move-result v0

    .line 56
    iget-boolean v1, p0, Lorg/spongycastle/asn1/DLTaggedObject;->c:Z

    if-eqz v1, :cond_0

    .line 58
    iget v1, p0, Lorg/spongycastle/asn1/DLTaggedObject;->a:I

    invoke-static {v1}, Lorg/spongycastle/asn1/j;->b(I)I

    move-result v1

    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 70
    :goto_0
    return v0

    .line 63
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 65
    iget v1, p0, Lorg/spongycastle/asn1/DLTaggedObject;->a:I

    invoke-static {v1}, Lorg/spongycastle/asn1/j;->b(I)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    .line 70
    :cond_1
    iget v0, p0, Lorg/spongycastle/asn1/DLTaggedObject;->a:I

    invoke-static {v0}, Lorg/spongycastle/asn1/j;->b(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
