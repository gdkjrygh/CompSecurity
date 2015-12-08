.class public Lorg/spongycastle/asn1/BERTaggedObjectParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1TaggedObjectParser;


# instance fields
.field private a:Z

.field private b:I

.field private c:Lorg/spongycastle/asn1/ASN1StreamParser;


# direct methods
.method constructor <init>(ZILorg/spongycastle/asn1/ASN1StreamParser;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-boolean p1, p0, Lorg/spongycastle/asn1/BERTaggedObjectParser;->a:Z

    .line 18
    iput p2, p0, Lorg/spongycastle/asn1/BERTaggedObjectParser;->b:I

    .line 19
    iput-object p3, p0, Lorg/spongycastle/asn1/BERTaggedObjectParser;->c:Lorg/spongycastle/asn1/ASN1StreamParser;

    .line 20
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 59
    :try_start_0
    invoke-virtual {p0}, Lorg/spongycastle/asn1/BERTaggedObjectParser;->e()Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 61
    :catch_0
    move-exception v0

    .line 63
    new-instance v1, Lorg/spongycastle/asn1/ASN1ParsingException;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final e()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 52
    iget-object v0, p0, Lorg/spongycastle/asn1/BERTaggedObjectParser;->c:Lorg/spongycastle/asn1/ASN1StreamParser;

    iget-boolean v1, p0, Lorg/spongycastle/asn1/BERTaggedObjectParser;->a:Z

    iget v2, p0, Lorg/spongycastle/asn1/BERTaggedObjectParser;->b:I

    invoke-virtual {v0, v1, v2}, Lorg/spongycastle/asn1/ASN1StreamParser;->a(ZI)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    return-object v0
.end method
