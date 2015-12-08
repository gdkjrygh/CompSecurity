.class public Lorg/bouncycastle/asn1/BERTaggedObjectParser;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1TaggedObjectParser;


# instance fields
.field private a:Z

.field private b:I

.field private c:Lorg/bouncycastle/asn1/ASN1StreamParser;


# direct methods
.method constructor <init>(ZILorg/bouncycastle/asn1/ASN1StreamParser;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lorg/bouncycastle/asn1/BERTaggedObjectParser;->a:Z

    iput p2, p0, Lorg/bouncycastle/asn1/BERTaggedObjectParser;->b:I

    iput-object p3, p0, Lorg/bouncycastle/asn1/BERTaggedObjectParser;->c:Lorg/bouncycastle/asn1/ASN1StreamParser;

    return-void
.end method


# virtual methods
.method public final c()Lorg/bouncycastle/asn1/DERObject;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/BERTaggedObjectParser;->g()Lorg/bouncycastle/asn1/DERObject;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1ParsingException;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final g()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/asn1/BERTaggedObjectParser;->c:Lorg/bouncycastle/asn1/ASN1StreamParser;

    iget-boolean v1, p0, Lorg/bouncycastle/asn1/BERTaggedObjectParser;->a:Z

    iget v2, p0, Lorg/bouncycastle/asn1/BERTaggedObjectParser;->b:I

    invoke-virtual {v0, v1, v2}, Lorg/bouncycastle/asn1/ASN1StreamParser;->a(ZI)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    return-object v0
.end method
