.class public Lorg/spongycastle/asn1/x500/style/BCStrictStyle;
.super Lorg/spongycastle/asn1/x500/style/BCStyle;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Lorg/spongycastle/asn1/x500/style/BCStyle;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/asn1/x500/X500Name;Lorg/spongycastle/asn1/x500/X500Name;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/X500Name;->c()[Lorg/spongycastle/asn1/x500/RDN;

    move-result-object v2

    .line 16
    invoke-virtual {p2}, Lorg/spongycastle/asn1/x500/X500Name;->c()[Lorg/spongycastle/asn1/x500/RDN;

    move-result-object v3

    .line 18
    array-length v0, v2

    array-length v4, v3

    if-eq v0, v4, :cond_1

    .line 31
    :cond_0
    :goto_0
    return v1

    :cond_1
    move v0, v1

    .line 23
    :goto_1
    array-length v4, v2

    if-eq v0, v4, :cond_2

    .line 25
    aget-object v4, v2, v0

    aget-object v5, v3, v0

    invoke-static {v4, v5}, Lorg/spongycastle/asn1/x500/style/BCStrictStyle;->a(Lorg/spongycastle/asn1/x500/RDN;Lorg/spongycastle/asn1/x500/RDN;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 23
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 31
    :cond_2
    const/4 v1, 0x1

    goto :goto_0
.end method
