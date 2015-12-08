.class public Lorg/spongycastle/asn1/crmf/SubsequentMessage;
.super Lorg/spongycastle/asn1/ASN1Integer;
.source "SourceFile"


# static fields
.field public static final b:Lorg/spongycastle/asn1/crmf/SubsequentMessage;

.field public static final c:Lorg/spongycastle/asn1/crmf/SubsequentMessage;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 8
    new-instance v0, Lorg/spongycastle/asn1/crmf/SubsequentMessage;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/crmf/SubsequentMessage;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/crmf/SubsequentMessage;->b:Lorg/spongycastle/asn1/crmf/SubsequentMessage;

    .line 9
    new-instance v0, Lorg/spongycastle/asn1/crmf/SubsequentMessage;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/crmf/SubsequentMessage;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/crmf/SubsequentMessage;->c:Lorg/spongycastle/asn1/crmf/SubsequentMessage;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    .line 14
    return-void
.end method
