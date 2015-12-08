.class public Lorg/bouncycastle/asn1/x509/X509Name;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# static fields
.field public static final A:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final B:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final C:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final D:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final E:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final F:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final G:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final H:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final I:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static J:Z

.field public static final K:Ljava/util/Hashtable;

.field public static final L:Ljava/util/Hashtable;

.field public static final M:Ljava/util/Hashtable;

.field public static final N:Ljava/util/Hashtable;

.field public static final O:Ljava/util/Hashtable;

.field public static final P:Ljava/util/Hashtable;

.field private static final Q:Ljava/lang/Boolean;

.field private static final R:Ljava/lang/Boolean;

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

.field public static final t:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final u:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final v:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final w:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final x:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final y:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field public static final z:Lorg/bouncycastle/asn1/DERObjectIdentifier;


# instance fields
.field private S:Lorg/bouncycastle/asn1/x509/X509NameEntryConverter;

.field private T:Ljava/util/Vector;

.field private U:Ljava/util/Vector;

.field private V:Ljava/util/Vector;

.field private W:Lorg/bouncycastle/asn1/ASN1Sequence;

.field private X:Z

.field private Y:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.6"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.10"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.11"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.12"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->d:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.3"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->e:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.5"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->f:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.9"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->g:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->f:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->h:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.7"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->i:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.8"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->j:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.4"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->k:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.42"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->l:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.43"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->m:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.44"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->n:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.45"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->o:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.15"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->p:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.17"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->q:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.46"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->r:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.65"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->s:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.1"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->t:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.2"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->u:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.3"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->v:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.4"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->w:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.5"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->x:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "1.3.36.8.3.14"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->y:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.16"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->z:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "2.5.4.54"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->A:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;->g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->B:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;->c_:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->C:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->T:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->D:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->U:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->E:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->aa:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->F:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->D:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->G:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "0.9.2342.19200300.100.1.25"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->H:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v1, "0.9.2342.19200300.100.1.1"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->I:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sput-boolean v2, Lorg/bouncycastle/asn1/x509/X509Name;->J:Z

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->M:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->O:Ljava/util/Hashtable;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->P:Ljava/util/Hashtable;

    new-instance v0, Ljava/lang/Boolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/lang/Boolean;-><init>(Z)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->Q:Ljava/lang/Boolean;

    new-instance v0, Ljava/lang/Boolean;

    invoke-direct {v0, v2}, Ljava/lang/Boolean;-><init>(Z)V

    sput-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->R:Ljava/lang/Boolean;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "C"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "O"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->d:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "T"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "OU"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->e:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "CN"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->i:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "L"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->j:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "ST"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->f:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "SERIALNUMBER"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->D:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "E"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->H:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "DC"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->I:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "UID"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->g:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "STREET"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->k:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "SURNAME"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->l:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "GIVENNAME"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->m:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "INITIALS"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->n:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "GENERATION"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->F:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "unstructuredAddress"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->E:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "unstructuredName"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->o:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "UniqueIdentifier"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->r:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "DN"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->s:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "Pseudonym"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->z:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "PostalAddress"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->y:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "NameAtBirth"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->w:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "CountryOfCitizenship"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->x:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "CountryOfResidence"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->v:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "Gender"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->u:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "PlaceOfBirth"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->t:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "DateOfBirth"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->q:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "PostalCode"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->p:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "BusinessCategory"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->B:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "TelephoneNumber"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->C:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "Name"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "C"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "O"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "OU"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->e:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "CN"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->i:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "L"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->j:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "ST"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->g:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "STREET"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->H:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "DC"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->L:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->I:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "UID"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->M:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "C"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->M:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "O"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->M:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "OU"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->M:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->e:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "CN"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->M:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->i:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "L"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->M:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->j:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "ST"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->M:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x509/X509Name;->g:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const-string v2, "STREET"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "c"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->a:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "o"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "t"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->d:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "ou"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->c:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "cn"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->e:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "l"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->i:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "st"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->j:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "sn"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->f:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "serialnumber"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->f:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "street"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->g:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "emailaddress"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->G:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "dc"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->H:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "e"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->G:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "uid"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->I:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "surname"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->k:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "givenname"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->l:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "initials"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->m:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "generation"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->n:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "unstructuredaddress"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->F:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "unstructuredname"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->E:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "uniqueidentifier"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->o:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "dn"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->r:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "pseudonym"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->s:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "postaladdress"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->z:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "nameofbirth"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->y:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "countryofcitizenship"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->w:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "countryofresidence"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->x:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "gender"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->v:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "placeofbirth"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->u:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "dateofbirth"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->t:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "postalcode"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->q:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "businesscategory"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->p:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "telephonenumber"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->B:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->N:Ljava/util/Hashtable;

    const-string v1, "name"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Name;->C:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->S:Lorg/bouncycastle/asn1/x509/X509NameEntryConverter;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->V:Ljava/util/Vector;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 8

    const/4 v2, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->S:Lorg/bouncycastle/asn1/x509/X509NameEntryConverter;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->V:Ljava/util/Vector;

    iput-object p1, p0, Lorg/bouncycastle/asn1/x509/X509Name;->W:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->e()Ljava/util/Enumeration;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DEREncodable;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Set;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-virtual {v4, v1}, Lorg/bouncycastle/asn1/ASN1Set;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "badly sized pair"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v5, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v6

    invoke-static {v6}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    instance-of v5, v0, Lorg/bouncycastle/asn1/DERString;

    if-eqz v5, :cond_3

    instance-of v5, v0, Lorg/bouncycastle/asn1/DERUniversalString;

    if-nez v5, :cond_3

    check-cast v0, Lorg/bouncycastle/asn1/DERString;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/DERString;->n_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x23

    if-ne v5, v6, :cond_2

    iget-object v5, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "\\"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :goto_1
    iget-object v5, p0, Lorg/bouncycastle/asn1/x509/X509Name;->V:Ljava/util/Vector;

    if-eqz v1, :cond_4

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->Q:Ljava/lang/Boolean;

    :goto_2
    invoke-virtual {v5, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    iget-object v5, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    invoke-virtual {v5, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget-object v5, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "#"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERObject;->b()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/encoders/Hex;->a([B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509Name;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    sget-object v0, Lorg/bouncycastle/asn1/x509/X509Name;->R:Ljava/lang/Boolean;

    goto :goto_2

    :cond_5
    return-void
.end method

.method private static a([B)Ljava/lang/String;
    .locals 3

    array-length v0, p0

    new-array v1, v0, [C

    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-eq v0, v2, :cond_0

    aget-byte v2, p0, v0

    and-int/lit16 v2, v2, 0xff

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;
    .locals 2

    if-eqz p0, :cond_0

    instance-of v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, Lorg/bouncycastle/asn1/x509/X509Name;

    :goto_0
    return-object p0

    :cond_1
    instance-of v0, p0, Lorg/bouncycastle/asn1/x500/X500Name;

    if-eqz v0, :cond_2

    new-instance v0, Lorg/bouncycastle/asn1/x509/X509Name;

    check-cast p0, Lorg/bouncycastle/asn1/x500/X500Name;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x500/X500Name;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/X509Name;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    :cond_2
    if-eqz p0, :cond_3

    new-instance v0, Lorg/bouncycastle/asn1/x509/X509Name;

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/X509Name;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/bouncycastle/asn1/ASN1TaggedObject;)Lorg/bouncycastle/asn1/x509/X509Name;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/StringBuffer;Ljava/util/Hashtable;Lorg/bouncycastle/asn1/DERObjectIdentifier;Ljava/lang/String;)V
    .locals 6

    const/16 v5, 0x5c

    const/16 v4, 0x3d

    invoke-virtual {p1, p2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_0
    invoke-virtual {p0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    invoke-virtual {p0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x2

    if-lt v2, v3, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v5, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x23

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x2

    :cond_0
    :goto_1
    if-eq v1, v0, :cond_4

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v2

    const/16 v3, 0x2c

    if-eq v2, v3, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v2

    if-eq v2, v5, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v2

    const/16 v3, 0x2b

    if-eq v2, v3, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v2

    if-eq v2, v4, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v2

    const/16 v3, 0x3c

    if-eq v2, v3, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v2

    const/16 v3, 0x3e

    if-eq v2, v3, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v2

    const/16 v3, 0x3b

    if-ne v2, v3, :cond_2

    :cond_1
    const-string v2, "\\"

    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_4
    return-void
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/Strings;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x23

    if-ne v0, v2, :cond_0

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/X509Name;->c(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    instance-of v2, v0, Lorg/bouncycastle/asn1/DERString;

    if-eqz v2, :cond_0

    check-cast v0, Lorg/bouncycastle/asn1/DERString;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/DERString;->n_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/Strings;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1Object;
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/encoders/Hex;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown encoding in name: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/16 v4, 0x20

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v1, v4, :cond_0

    if-eq v2, v4, :cond_1

    :cond_0
    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_1
    add-int/lit8 v0, v0, 0x1

    move v1, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Ljava/util/Vector;
    .locals 7

    const/4 v6, 0x1

    const/4 v2, 0x0

    new-instance v3, Ljava/util/Vector;

    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    move v1, v2

    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x2

    if-le v4, v5, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x5c

    if-ne v4, v5, :cond_1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x23

    if-ne v4, v5, :cond_1

    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-virtual {v3, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    return-object v3
.end method

.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 8

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->W:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-nez v0, :cond_3

    new-instance v5, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v2, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    const/4 v1, 0x0

    const/4 v0, 0x0

    move-object v3, v1

    move-object v4, v2

    move v2, v0

    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-eq v2, v0, :cond_2

    new-instance v6, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v6}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v6, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    invoke-virtual {v1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v7, p0, Lorg/bouncycastle/asn1/x509/X509Name;->S:Lorg/bouncycastle/asn1/x509/X509NameEntryConverter;

    invoke-virtual {v7, v0, v1}, Lorg/bouncycastle/asn1/x509/X509NameEntryConverter;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Ljava/lang/String;)Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v6, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    if-eqz v3, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/X509Name;->V:Ljava/util/Vector;

    invoke-virtual {v1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v6}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v4, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    move-object v3, v4

    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v4, v3

    move-object v3, v0

    goto :goto_0

    :cond_1
    new-instance v1, Lorg/bouncycastle/asn1/DERSet;

    invoke-direct {v1, v4}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v5, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v6}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v3, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_1

    :cond_2
    new-instance v0, Lorg/bouncycastle/asn1/DERSet;

    invoke-direct {v0, v4}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v5, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v0, v5}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->W:Lorg/bouncycastle/asn1/ASN1Sequence;

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->W:Lorg/bouncycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 14

    const/4 v1, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne p1, p0, :cond_0

    move v0, v3

    :goto_0
    return v0

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/asn1/x509/X509Name;

    if-nez v0, :cond_1

    instance-of v0, p1, Lorg/bouncycastle/asn1/ASN1Sequence;

    if-nez v0, :cond_1

    move v0, v4

    goto :goto_0

    :cond_1
    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/asn1/DEREncodable;

    invoke-interface {v0}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/X509Name;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    invoke-virtual {v2, v0}, Lorg/bouncycastle/asn1/DERObject;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v3

    goto :goto_0

    :cond_2
    :try_start_0
    invoke-static {p1}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v8

    iget-object v0, v10, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-eq v8, v0, :cond_3

    move v0, v4

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v4

    goto :goto_0

    :cond_3
    new-array v11, v8, [Z

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, v10, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v2, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v6, v3

    move v7, v8

    move v9, v4

    :goto_1
    if-eq v9, v7, :cond_8

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0, v9}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    invoke-virtual {v1, v9}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move v5, v4

    :goto_2
    if-ge v5, v8, :cond_9

    aget-boolean v2, v11, v5

    if-nez v2, :cond_6

    iget-object v2, v10, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v2, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v10, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    invoke-virtual {v2, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/X509Name;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v2}, Lorg/bouncycastle/asn1/x509/X509Name;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    invoke-static {v12}, Lorg/bouncycastle/asn1/x509/X509Name;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v2}, Lorg/bouncycastle/asn1/x509/X509Name;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v2, v4

    :goto_3
    if-eqz v2, :cond_6

    aput-boolean v3, v11, v5

    move v0, v3

    :goto_4
    if-nez v0, :cond_7

    move v0, v4

    goto/16 :goto_0

    :cond_4
    add-int/lit8 v0, v8, -0x1

    move v6, v1

    move v7, v1

    move v9, v0

    goto :goto_1

    :cond_5
    move v2, v3

    goto :goto_3

    :cond_6
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    goto :goto_2

    :cond_7
    add-int v0, v9, v6

    move v9, v0

    goto :goto_1

    :cond_8
    move v0, v3

    goto/16 :goto_0

    :cond_9
    move v0, v4

    goto :goto_4
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->X:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->Y:I

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->X:Z

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509Name;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/X509Name;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget v2, p0, Lorg/bouncycastle/asn1/x509/X509Name;->Y:I

    iget-object v3, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    xor-int/2addr v2, v3

    iput v2, p0, Lorg/bouncycastle/asn1/x509/X509Name;->Y:I

    iget v2, p0, Lorg/bouncycastle/asn1/x509/X509Name;->Y:I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    xor-int/2addr v0, v2

    iput v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->Y:I

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_1
    iget v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->Y:I

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    const/16 v10, 0x2c

    const/4 v4, 0x0

    sget-boolean v6, Lorg/bouncycastle/asn1/x509/X509Name;->J:Z

    sget-object v7, Lorg/bouncycastle/asn1/x509/X509Name;->K:Ljava/util/Hashtable;

    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v9, Ljava/util/Vector;

    invoke-direct {v9}, Ljava/util/Vector;-><init>()V

    const/4 v5, 0x1

    const/4 v2, 0x0

    move v3, v4

    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->V:Ljava/util/Vector;

    invoke-virtual {v0, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x2b

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    invoke-virtual {v1, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v7, v0, v1}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Ljava/lang/StringBuffer;Ljava/util/Hashtable;Lorg/bouncycastle/asn1/DERObjectIdentifier;Ljava/lang/String;)V

    move-object v0, v2

    :goto_1
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move-object v2, v0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/asn1/x509/X509Name;->T:Ljava/util/Vector;

    invoke-virtual {v0, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v1, p0, Lorg/bouncycastle/asn1/x509/X509Name;->U:Ljava/util/Vector;

    invoke-virtual {v1, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v7, v0, v1}, Lorg/bouncycastle/asn1/x509/X509Name;->a(Ljava/lang/StringBuffer;Ljava/util/Hashtable;Lorg/bouncycastle/asn1/DERObjectIdentifier;Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    move-object v0, v2

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_3

    invoke-virtual {v9}, Ljava/util/Vector;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    move v0, v5

    :goto_2
    if-ltz v1, :cond_5

    if-eqz v0, :cond_2

    move v0, v4

    :goto_3
    invoke-virtual {v9, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v8, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_3

    :cond_3
    move v0, v4

    move v1, v5

    :goto_4
    invoke-virtual {v9}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v0, v2, :cond_5

    if-eqz v1, :cond_4

    move v1, v4

    :goto_5
    invoke-virtual {v9, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_4
    invoke-virtual {v8, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_5

    :cond_5
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
