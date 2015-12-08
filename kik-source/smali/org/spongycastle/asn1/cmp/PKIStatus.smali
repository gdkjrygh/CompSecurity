.class public Lorg/spongycastle/asn1/cmp/PKIStatus;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# static fields
.field public static final a:Lorg/spongycastle/asn1/cmp/PKIStatus;

.field public static final b:Lorg/spongycastle/asn1/cmp/PKIStatus;

.field public static final c:Lorg/spongycastle/asn1/cmp/PKIStatus;

.field public static final d:Lorg/spongycastle/asn1/cmp/PKIStatus;

.field public static final e:Lorg/spongycastle/asn1/cmp/PKIStatus;

.field public static final f:Lorg/spongycastle/asn1/cmp/PKIStatus;

.field public static final g:Lorg/spongycastle/asn1/cmp/PKIStatus;


# instance fields
.field private h:Lorg/spongycastle/asn1/ASN1Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 20
    new-instance v0, Lorg/spongycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/cmp/PKIStatus;->a:Lorg/spongycastle/asn1/cmp/PKIStatus;

    .line 21
    new-instance v0, Lorg/spongycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/cmp/PKIStatus;->b:Lorg/spongycastle/asn1/cmp/PKIStatus;

    .line 22
    new-instance v0, Lorg/spongycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/cmp/PKIStatus;->c:Lorg/spongycastle/asn1/cmp/PKIStatus;

    .line 23
    new-instance v0, Lorg/spongycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/cmp/PKIStatus;->d:Lorg/spongycastle/asn1/cmp/PKIStatus;

    .line 24
    new-instance v0, Lorg/spongycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/cmp/PKIStatus;->e:Lorg/spongycastle/asn1/cmp/PKIStatus;

    .line 25
    new-instance v0, Lorg/spongycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/cmp/PKIStatus;->f:Lorg/spongycastle/asn1/cmp/PKIStatus;

    .line 26
    new-instance v0, Lorg/spongycastle/asn1/cmp/PKIStatus;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/cmp/PKIStatus;-><init>(I)V

    sput-object v0, Lorg/spongycastle/asn1/cmp/PKIStatus;->g:Lorg/spongycastle/asn1/cmp/PKIStatus;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-direct {p0, v0}, Lorg/spongycastle/asn1/cmp/PKIStatus;-><init>(Lorg/spongycastle/asn1/ASN1Integer;)V

    .line 33
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Integer;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 37
    iput-object p1, p0, Lorg/spongycastle/asn1/cmp/PKIStatus;->h:Lorg/spongycastle/asn1/ASN1Integer;

    .line 38
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lorg/spongycastle/asn1/cmp/PKIStatus;->h:Lorg/spongycastle/asn1/ASN1Integer;

    return-object v0
.end method
