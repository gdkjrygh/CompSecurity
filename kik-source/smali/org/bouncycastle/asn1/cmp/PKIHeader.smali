.class public Lorg/bouncycastle/asn1/cmp/PKIHeader;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# static fields
.field public static final a:Lorg/bouncycastle/asn1/x509/GeneralName;


# instance fields
.field private b:Lorg/bouncycastle/asn1/DERInteger;

.field private c:Lorg/bouncycastle/asn1/x509/GeneralName;

.field private d:Lorg/bouncycastle/asn1/x509/GeneralName;

.field private e:Lorg/bouncycastle/asn1/DERGeneralizedTime;

.field private f:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field private g:Lorg/bouncycastle/asn1/ASN1OctetString;

.field private h:Lorg/bouncycastle/asn1/ASN1OctetString;

.field private i:Lorg/bouncycastle/asn1/ASN1OctetString;

.field private j:Lorg/bouncycastle/asn1/ASN1OctetString;

.field private k:Lorg/bouncycastle/asn1/ASN1OctetString;

.field private l:Lorg/bouncycastle/asn1/cmp/PKIFreeText;

.field private m:Lorg/bouncycastle/asn1/ASN1Sequence;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/x509/GeneralName;

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>()V

    invoke-static {v1}, Lorg/bouncycastle/asn1/x500/X500Name;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x500/X500Name;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/GeneralName;-><init>(Lorg/bouncycastle/asn1/x500/X500Name;)V

    sput-object v0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a:Lorg/bouncycastle/asn1/x509/GeneralName;

    return-void
.end method

.method private static a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V
    .locals 2

    if-eqz p2, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->b:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->c:Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->d:Lorg/bouncycastle/asn1/x509/GeneralName;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    const/4 v1, 0x0

    iget-object v2, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->e:Lorg/bouncycastle/asn1/DERGeneralizedTime;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->f:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->g:Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->h:Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->i:Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->j:Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->k:Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->l:Lorg/bouncycastle/asn1/cmp/PKIFreeText;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lorg/bouncycastle/asn1/cmp/PKIHeader;->m:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/cmp/PKIHeader;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
