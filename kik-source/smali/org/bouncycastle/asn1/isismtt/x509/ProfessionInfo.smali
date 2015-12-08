.class public Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# static fields
.field public static final a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final d:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final e:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final f:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final g:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final h:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final i:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final j:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final k:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final l:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final m:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final n:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final o:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final p:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final q:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final r:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final s:Lorg/bouncycastle/asn1/DERObjectIdentifier;


# instance fields
.field private t:Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;

.field private u:Lorg/bouncycastle/asn1/ASN1Sequence;

.field private v:Lorg/bouncycastle/asn1/ASN1Sequence;

.field private w:Ljava/lang/String;

.field private x:Lorg/bouncycastle/asn1/ASN1OctetString;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".1"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".2"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".3"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".4"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->d:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".5"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->e:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".6"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->f:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".7"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->g:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".8"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->h:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".9"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->i:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".10"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->j:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".11"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->k:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".12"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->l:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".13"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->m:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".14"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->n:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".15"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->o:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".16"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->p:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".17"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->q:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".18"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->r:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".19"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->s:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 5

    const/4 v4, 0x1

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->t:Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;

    if-eqz v1, :cond_0

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->t:Lorg/bouncycastle/asn1/isismtt/x509/NamingAuthority;

    invoke-direct {v1, v4, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->u:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->v:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->v:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->w:Ljava/lang/String;

    if-eqz v1, :cond_2

    new-instance v1, Lorg/bouncycastle/asn1/DERPrintableString;

    iget-object v2, p0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->w:Ljava/lang/String;

    invoke-direct {v1, v2, v4}, Lorg/bouncycastle/asn1/DERPrintableString;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->x:Lorg/bouncycastle/asn1/ASN1OctetString;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lorg/bouncycastle/asn1/isismtt/x509/ProfessionInfo;->x:Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_3
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
