.class public Lorg/spongycastle/asn1/DERPrintableString;
.super Lorg/spongycastle/asn1/ASN1Primitive;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1String;


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/asn1/DERPrintableString;-><init>(Ljava/lang/String;Z)V

    .line 74
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 87
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 88
    if-eqz p2, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_5

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7f

    if-le v2, v3, :cond_0

    :goto_1
    if-nez v0, :cond_6

    .line 90
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "string contains illegal characters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 88
    :cond_0
    const/16 v3, 0x61

    if-gt v3, v2, :cond_1

    const/16 v3, 0x7a

    if-le v2, v3, :cond_4

    :cond_1
    const/16 v3, 0x41

    if-gt v3, v2, :cond_2

    const/16 v3, 0x5a

    if-le v2, v3, :cond_4

    :cond_2
    const/16 v3, 0x30

    if-gt v3, v2, :cond_3

    const/16 v3, 0x39

    if-le v2, v3, :cond_4

    :cond_3
    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :cond_4
    :sswitch_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    goto :goto_1

    .line 93
    :cond_6
    invoke-static {p1}, Lorg/spongycastle/util/Strings;->d(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/DERPrintableString;->a:[B

    .line 94
    return-void

    .line 88
    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_0
        0x27 -> :sswitch_0
        0x28 -> :sswitch_0
        0x29 -> :sswitch_0
        0x2b -> :sswitch_0
        0x2c -> :sswitch_0
        0x2d -> :sswitch_0
        0x2e -> :sswitch_0
        0x2f -> :sswitch_0
        0x3a -> :sswitch_0
        0x3d -> :sswitch_0
        0x3f -> :sswitch_0
    .end sparse-switch
.end method

.method constructor <init>([B)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Primitive;-><init>()V

    .line 64
    iput-object p1, p0, Lorg/spongycastle/asn1/DERPrintableString;->a:[B

    .line 65
    return-void
.end method


# virtual methods
.method final a(Lorg/spongycastle/asn1/ASN1OutputStream;)V
    .locals 2

    .prologue
    .line 120
    const/16 v0, 0x13

    iget-object v1, p0, Lorg/spongycastle/asn1/DERPrintableString;->a:[B

    invoke-virtual {p1, v0, v1}, Lorg/spongycastle/asn1/ASN1OutputStream;->a(I[B)V

    .line 121
    return-void
.end method

.method final a(Lorg/spongycastle/asn1/ASN1Primitive;)Z
    .locals 2

    .prologue
    .line 131
    instance-of v0, p1, Lorg/spongycastle/asn1/DERPrintableString;

    if-nez v0, :cond_0

    .line 133
    const/4 v0, 0x0

    .line 138
    :goto_0
    return v0

    .line 136
    :cond_0
    check-cast p1, Lorg/spongycastle/asn1/DERPrintableString;

    .line 138
    iget-object v0, p0, Lorg/spongycastle/asn1/DERPrintableString;->a:[B

    iget-object v1, p1, Lorg/spongycastle/asn1/DERPrintableString;->a:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method final h()Z
    .locals 1

    .prologue
    .line 108
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lorg/spongycastle/asn1/DERPrintableString;->a:[B

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v0

    return v0
.end method

.method final i()I
    .locals 2

    .prologue
    .line 113
    iget-object v0, p0, Lorg/spongycastle/asn1/DERPrintableString;->a:[B

    array-length v0, v0

    invoke-static {v0}, Lorg/spongycastle/asn1/j;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lorg/spongycastle/asn1/DERPrintableString;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final o_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lorg/spongycastle/asn1/DERPrintableString;->a:[B

    invoke-static {v0}, Lorg/spongycastle/util/Strings;->b([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 143
    invoke-virtual {p0}, Lorg/spongycastle/asn1/DERPrintableString;->o_()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
