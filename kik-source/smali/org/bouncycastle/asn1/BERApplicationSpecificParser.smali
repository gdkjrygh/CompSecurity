.class public Lorg/bouncycastle/asn1/BERApplicationSpecificParser;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1ApplicationSpecificParser;


# instance fields
.field private final a:I

.field private final b:Lorg/bouncycastle/asn1/ASN1StreamParser;


# direct methods
.method constructor <init>(ILorg/bouncycastle/asn1/ASN1StreamParser;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;->a:I

    iput-object p2, p0, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;->b:Lorg/bouncycastle/asn1/ASN1StreamParser;

    return-void
.end method


# virtual methods
.method public final c()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;->g()Lorg/bouncycastle/asn1/DERObject;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/asn1/ASN1ParsingException;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final g()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/BERApplicationSpecific;

    iget v1, p0, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;->a:I

    iget-object v2, p0, Lorg/bouncycastle/asn1/BERApplicationSpecificParser;->b:Lorg/bouncycastle/asn1/ASN1StreamParser;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1StreamParser;->b()Lorg/bouncycastle/asn1/ASN1EncodableVector;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/BERApplicationSpecific;-><init>(ILorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v0
.end method
