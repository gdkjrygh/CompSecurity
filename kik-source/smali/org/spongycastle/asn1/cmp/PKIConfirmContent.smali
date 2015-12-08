.class public Lorg/spongycastle/asn1/cmp/PKIConfirmContent;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Null;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 35
    sget-object v0, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    iput-object v0, p0, Lorg/spongycastle/asn1/cmp/PKIConfirmContent;->a:Lorg/spongycastle/asn1/ASN1Null;

    .line 36
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lorg/spongycastle/asn1/cmp/PKIConfirmContent;->a:Lorg/spongycastle/asn1/ASN1Null;

    return-object v0
.end method
