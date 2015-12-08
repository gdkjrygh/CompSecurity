.class public Lorg/bouncycastle/jce/X509KeyUsage;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:I


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyUsage;

    iget v1, p0, Lorg/bouncycastle/jce/X509KeyUsage;->a:I

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyUsage;-><init>(I)V

    return-object v0
.end method
