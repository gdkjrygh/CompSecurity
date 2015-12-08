.class public abstract Lorg/bouncycastle/asn1/ASN1Object;
.super Lorg/bouncycastle/asn1/DERObject;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/DERObject;-><init>()V

    return-void
.end method

.method public static a([B)Lorg/bouncycastle/asn1/ASN1Object;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    :try_start_0
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Object;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "cannot recognise object in stream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method abstract a(Lorg/bouncycastle/asn1/DEROutputStream;)V
.end method

.method abstract a(Lorg/bouncycastle/asn1/DERObject;)Z
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lorg/bouncycastle/asn1/DEREncodable;

    if-eqz v1, :cond_2

    check-cast p1, Lorg/bouncycastle/asn1/DEREncodable;

    invoke-interface {p1}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/bouncycastle/asn1/ASN1Object;->a(Lorg/bouncycastle/asn1/DERObject;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public abstract hashCode()I
.end method
