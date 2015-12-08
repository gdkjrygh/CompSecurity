.class public Lorg/spongycastle/asn1/BEROctetStringParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/ASN1OctetStringParser;


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1StreamParser;


# direct methods
.method constructor <init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lorg/spongycastle/asn1/BEROctetStringParser;->a:Lorg/spongycastle/asn1/ASN1StreamParser;

    .line 17
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 4

    .prologue
    .line 34
    :try_start_0
    invoke-virtual {p0}, Lorg/spongycastle/asn1/BEROctetStringParser;->e()Lorg/spongycastle/asn1/ASN1Primitive;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 36
    :catch_0
    move-exception v0

    .line 38
    new-instance v1, Lorg/spongycastle/asn1/ASN1ParsingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IOException converting stream to byte array: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 21
    new-instance v0, Lorg/spongycastle/asn1/c;

    iget-object v1, p0, Lorg/spongycastle/asn1/BEROctetStringParser;->a:Lorg/spongycastle/asn1/ASN1StreamParser;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/c;-><init>(Lorg/spongycastle/asn1/ASN1StreamParser;)V

    return-object v0
.end method

.method public final e()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 27
    new-instance v0, Lorg/spongycastle/asn1/BEROctetString;

    invoke-virtual {p0}, Lorg/spongycastle/asn1/BEROctetStringParser;->c()Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/util/io/Streams;->a(Ljava/io/InputStream;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/BEROctetString;-><init>([B)V

    return-object v0
.end method
