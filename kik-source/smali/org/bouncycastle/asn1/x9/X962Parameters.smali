.class public Lorg/bouncycastle/asn1/x9/X962Parameters;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field private a:Lorg/bouncycastle/asn1/DERObject;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/DERObject;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    iput-object p1, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    iput-object p1, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/x9/X9ECParameters;)V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    instance-of v0, v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    instance-of v0, v0, Lorg/bouncycastle/asn1/ASN1Null;

    return v0
.end method

.method public final g()Lorg/bouncycastle/asn1/DERObject;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x9/X962Parameters;->a:Lorg/bouncycastle/asn1/DERObject;

    return-object v0
.end method
