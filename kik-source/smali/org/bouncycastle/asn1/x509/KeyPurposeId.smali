.class public Lorg/bouncycastle/asn1/x509/KeyPurposeId;
.super Lorg/bouncycastle/asn1/DERObjectIdentifier;


# static fields
.field public static final b:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final c:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final d:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final e:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final f:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final g:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final h:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final i:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final j:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final k:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final l:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final m:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final n:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final o:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final p:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final q:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final r:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final s:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final t:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final u:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

.field public static final v:Lorg/bouncycastle/asn1/x509/KeyPurposeId;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Extensions;->u:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->b:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.1"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->c:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.2"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->d:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.3"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->e:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.4"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->f:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.5"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->g:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.6"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->h:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.7"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->i:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.8"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->j:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.9"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->k:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.10"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->l:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.11"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->m:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.12"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->n:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.13"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->o:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.14"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->p:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.15"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->q:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.16"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->r:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.17"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->s:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.18"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->t:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.5.5.7.3.19"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->u:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    new-instance v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    const-string v1, "1.3.6.1.4.1.311.20.2.2"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/KeyPurposeId;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/KeyPurposeId;->v:Lorg/bouncycastle/asn1/x509/KeyPurposeId;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    return-void
.end method
