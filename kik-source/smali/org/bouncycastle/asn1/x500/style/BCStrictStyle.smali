.class public Lorg/bouncycastle/asn1/x500/style/BCStrictStyle;
.super Lorg/bouncycastle/asn1/x500/style/BCStyle;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/x500/style/BCStyle;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/bouncycastle/asn1/x500/X500Name;Lorg/bouncycastle/asn1/x500/X500Name;)Z
    .locals 6

    const/4 v1, 0x0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/X500Name;->e()[Lorg/bouncycastle/asn1/x500/RDN;

    move-result-object v2

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/x500/X500Name;->e()[Lorg/bouncycastle/asn1/x500/RDN;

    move-result-object v3

    array-length v0, v2

    array-length v4, v3

    if-eq v0, v4, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    move v0, v1

    :goto_1
    array-length v4, v2

    if-eq v0, v4, :cond_2

    aget-object v4, v2, v0

    aget-object v5, v3, v0

    invoke-static {v4, v5}, Lorg/bouncycastle/asn1/x500/style/BCStrictStyle;->a(Lorg/bouncycastle/asn1/x500/RDN;Lorg/bouncycastle/asn1/x500/RDN;)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    goto :goto_0
.end method
