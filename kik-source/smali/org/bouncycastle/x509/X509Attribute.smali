.class public Lorg/bouncycastle/x509/X509Attribute;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field a:Lorg/bouncycastle/asn1/x509/Attribute;


# direct methods
.method constructor <init>(Lorg/bouncycastle/asn1/ASN1Encodable;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/Attribute;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Attribute;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/x509/X509Attribute;->a:Lorg/bouncycastle/asn1/x509/Attribute;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/x509/X509Attribute;->a:Lorg/bouncycastle/asn1/x509/Attribute;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/Attribute;->d()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    return-object v0
.end method
