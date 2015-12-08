.class public Lorg/spongycastle/jce/X509KeyUsage;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:I


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 55
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyUsage;

    iget v1, p0, Lorg/spongycastle/jce/X509KeyUsage;->a:I

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyUsage;-><init>(I)V

    return-object v0
.end method
