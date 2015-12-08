.class public Lorg/spongycastle/asn1/OIDTokenizer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lorg/spongycastle/asn1/OIDTokenizer;->a:Ljava/lang/String;

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/asn1/OIDTokenizer;->b:I

    .line 19
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .prologue
    .line 23
    iget v0, p0, Lorg/spongycastle/asn1/OIDTokenizer;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 28
    iget v0, p0, Lorg/spongycastle/asn1/OIDTokenizer;->b:I

    if-ne v0, v3, :cond_0

    .line 30
    const/4 v0, 0x0

    .line 46
    :goto_0
    return-object v0

    .line 34
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/asn1/OIDTokenizer;->a:Ljava/lang/String;

    const/16 v1, 0x2e

    iget v2, p0, Lorg/spongycastle/asn1/OIDTokenizer;->b:I

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    .line 36
    if-ne v1, v3, :cond_1

    .line 38
    iget-object v0, p0, Lorg/spongycastle/asn1/OIDTokenizer;->a:Ljava/lang/String;

    iget v1, p0, Lorg/spongycastle/asn1/OIDTokenizer;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 39
    iput v3, p0, Lorg/spongycastle/asn1/OIDTokenizer;->b:I

    goto :goto_0

    .line 43
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/asn1/OIDTokenizer;->a:Ljava/lang/String;

    iget v2, p0, Lorg/spongycastle/asn1/OIDTokenizer;->b:I

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 45
    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/spongycastle/asn1/OIDTokenizer;->b:I

    goto :goto_0
.end method
