.class public Lorg/spongycastle/asn1/x509/KeyPurposeId;
.super Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
.source "SourceFile"


# static fields
.field public static final b:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final c:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final d:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final e:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final f:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final g:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final h:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final i:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final j:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final k:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final l:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final m:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final n:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final o:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final p:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final q:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final r:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final s:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final t:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final u:Lorg/spongycastle/asn1/x509/KeyPurposeId;

.field public static final v:Lorg/spongycastle/asn1/x509/KeyPurposeId;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 34
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/spongycastle/asn1/x509/X509Extensions;->u:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->b:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 38
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.1"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->c:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 42
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.2"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->d:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 46
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.3"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->e:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 50
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.4"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->f:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 54
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.5"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->g:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 58
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.6"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->h:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 62
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.7"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->i:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 66
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.8"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->j:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 70
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.9"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->k:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 74
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.10"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->l:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 78
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.11"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->m:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 82
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.12"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->n:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 86
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.13"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->o:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 90
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.14"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->p:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 94
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.15"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->q:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 98
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.16"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->r:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 102
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.17"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->s:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 106
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.18"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->t:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 110
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.19"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->u:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    .line 118
    new-instance v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.4.1.311.20.2.2"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x509/KeyPurposeId;->v:Lorg/spongycastle/asn1/x509/KeyPurposeId;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    .line 29
    return-void
.end method
