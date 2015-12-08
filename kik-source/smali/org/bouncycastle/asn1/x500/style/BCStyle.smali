.class public Lorg/bouncycastle/asn1/x500/style/BCStyle;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/asn1/x500/X500NameStyle;


# static fields
.field public static final A:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final C:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final D:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final E:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final F:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final G:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final H:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final I:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final J:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field private static final K:Ljava/util/Hashtable;

.field private static final L:Ljava/util/Hashtable;

.field public static final a:Lorg/bouncycastle/asn1/x500/X500NameStyle;

.field public static final b:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final d:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final i:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final j:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final m:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final n:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final p:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final q:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final r:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final t:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final u:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final w:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final x:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final y:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final z:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/x500/style/BCStyle;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->a:Lorg/bouncycastle/asn1/x500/X500NameStyle;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.6"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->b:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.10"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.11"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->d:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.12"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.3"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.5"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.9"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->i:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.7"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->j:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.8"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.4"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.42"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->m:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.43"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->n:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.44"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.45"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->p:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.15"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->q:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.17"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->r:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.46"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.65"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->t:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.1"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->u:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.2"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.3"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->w:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.4"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->x:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.5"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->y:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.36.8.3.14"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->z:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.16"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->A:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.54"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;->g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->C:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;->c_:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->D:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->T:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->E:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->U:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->F:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->aa:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->G:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->E:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->H:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "0.9.2342.19200300.100.1.25"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->I:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "0.9.2342.19200300.100.1.1"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->J:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->b:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "C"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "O"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "T"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->d:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "OU"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "CN"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->j:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "L"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "ST"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SERIALNUMBER"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->E:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "E"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->I:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "DC"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->J:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "UID"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "STREET"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SURNAME"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->m:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GIVENNAME"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->n:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "INITIALS"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GENERATION"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->G:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "unstructuredAddress"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->F:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "unstructuredName"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->p:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "UniqueIdentifier"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "DN"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->t:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "Pseudonym"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->A:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "PostalAddress"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->z:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "NameAtBirth"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->x:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "CountryOfCitizenship"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->y:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "CountryOfResidence"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->w:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "Gender"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "PlaceOfBirth"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->u:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "DateOfBirth"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->r:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "PostalCode"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->q:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "BusinessCategory"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->C:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "TelephoneNumber"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/bouncycastle/asn1/x500/style/BCStyle;->D:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "Name"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "c"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->b:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "o"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "t"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "ou"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->d:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "cn"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->f:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "l"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->j:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "st"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "sn"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "serialnumber"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->g:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "street"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "emailaddress"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->H:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "dc"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->I:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "e"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->H:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "uid"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->J:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "surname"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "givenname"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->m:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "initials"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->n:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "generation"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "unstructuredaddress"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->G:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "unstructuredname"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->F:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "uniqueidentifier"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->p:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "dn"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "pseudonym"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->t:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "postaladdress"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->A:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "nameofbirth"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->z:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "countryofcitizenship"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->x:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "countryofresidence"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->y:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "gender"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->w:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "placeofbirth"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "dateofbirth"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->u:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "postalcode"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->r:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "businesscategory"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->q:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "telephonenumber"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->C:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "name"

    sget-object v2, Lorg/bouncycastle/asn1/x500/style/BCStyle;->D:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lorg/bouncycastle/asn1/ASN1Encodable;)I
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/asn1/x500/style/IETFUtils;->a(Lorg/bouncycastle/asn1/ASN1Encodable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method private static a(Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-nez p0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->e()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->e()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->f()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/x500/style/IETFUtils;->a(Lorg/bouncycastle/asn1/ASN1Encodable;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->f()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/x500/style/IETFUtils;->a(Lorg/bouncycastle/asn1/ASN1Encodable;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method protected static a(Lorg/bouncycastle/asn1/x500/RDN;Lorg/bouncycastle/asn1/x500/RDN;)Z
    .locals 6

    const/4 v1, 0x0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x500/RDN;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/RDN;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x500/RDN;->g()[Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v2

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/RDN;->g()[Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

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

    if-eq v0, v4, :cond_3

    aget-object v4, v2, v0

    aget-object v5, v3, v0

    invoke-static {v4, v5}, Lorg/bouncycastle/asn1/x500/style/BCStyle;->a(Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/RDN;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x500/RDN;->f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/RDN;->f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/bouncycastle/asn1/x500/style/BCStyle;->a(Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;)Z

    move-result v1

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final a(Lorg/bouncycastle/asn1/x500/X500Name;)I
    .locals 7

    const/4 v1, 0x0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/X500Name;->e()[Lorg/bouncycastle/asn1/x500/RDN;

    move-result-object v4

    move v0, v1

    move v2, v1

    :goto_0
    array-length v3, v4

    if-eq v0, v3, :cond_2

    aget-object v3, v4, v0

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x500/RDN;->e()Z

    move-result v3

    if-eqz v3, :cond_1

    aget-object v3, v4, v0

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x500/RDN;->g()[Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v5

    move v3, v2

    move v2, v1

    :goto_1
    array-length v6, v5

    if-eq v2, v6, :cond_0

    aget-object v6, v5, v2

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->e()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->hashCode()I

    move-result v6

    xor-int/2addr v3, v6

    aget-object v6, v5, v2

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->f()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v6

    invoke-static {v6}, Lorg/bouncycastle/asn1/x500/style/BCStyle;->a(Lorg/bouncycastle/asn1/ASN1Encodable;)I

    move-result v6

    xor-int/2addr v3, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    move v2, v3

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    aget-object v3, v4, v0

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x500/RDN;->f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->e()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->hashCode()I

    move-result v3

    xor-int/2addr v2, v3

    aget-object v3, v4, v0

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x500/RDN;->f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->f()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/x500/style/BCStyle;->a(Lorg/bouncycastle/asn1/ASN1Encodable;)I

    move-result v3

    xor-int/2addr v2, v3

    goto :goto_2

    :cond_2
    return v2
.end method

.method public a(Lorg/bouncycastle/asn1/x500/X500Name;Lorg/bouncycastle/asn1/x500/X500Name;)Z
    .locals 10

    const/4 v9, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/X500Name;->e()[Lorg/bouncycastle/asn1/x500/RDN;

    move-result-object v5

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/x500/X500Name;->e()[Lorg/bouncycastle/asn1/x500/RDN;

    move-result-object v6

    array-length v0, v5

    array-length v3, v6

    if-eq v0, v3, :cond_1

    :cond_0
    :goto_0
    return v2

    :cond_1
    aget-object v0, v5, v2

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x500/RDN;->f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    if-eqz v0, :cond_8

    aget-object v0, v6, v2

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x500/RDN;->f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    if-eqz v0, :cond_8

    aget-object v0, v5, v2

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x500/RDN;->f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->e()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    aget-object v3, v6, v2

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x500/RDN;->f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;->e()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    move v3, v2

    :goto_2
    array-length v4, v5

    if-eq v3, v4, :cond_7

    aget-object v7, v5, v3

    if-eqz v0, :cond_4

    array-length v4, v6

    add-int/lit8 v4, v4, -0x1

    :goto_3
    if-ltz v4, :cond_6

    aget-object v8, v6, v4

    if-eqz v8, :cond_3

    aget-object v8, v6, v4

    invoke-static {v7, v8}, Lorg/bouncycastle/asn1/x500/style/BCStyle;->a(Lorg/bouncycastle/asn1/x500/RDN;Lorg/bouncycastle/asn1/x500/RDN;)Z

    move-result v8

    if-eqz v8, :cond_3

    aput-object v9, v6, v4

    move v4, v1

    :goto_4
    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, -0x1

    goto :goto_3

    :cond_4
    move v4, v2

    :goto_5
    array-length v8, v6

    if-eq v4, v8, :cond_6

    aget-object v8, v6, v4

    if-eqz v8, :cond_5

    aget-object v8, v6, v4

    invoke-static {v7, v8}, Lorg/bouncycastle/asn1/x500/style/BCStyle;->a(Lorg/bouncycastle/asn1/x500/RDN;Lorg/bouncycastle/asn1/x500/RDN;)Z

    move-result v8

    if-eqz v8, :cond_5

    aput-object v9, v6, v4

    move v4, v1

    goto :goto_4

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_6
    move v4, v2

    goto :goto_4

    :cond_7
    move v2, v1

    goto :goto_0

    :cond_8
    move v0, v2

    goto :goto_1
.end method

.method public final b(Lorg/bouncycastle/asn1/x500/X500Name;)Ljava/lang/String;
    .locals 11

    const/4 v3, 0x1

    const/4 v1, 0x0

    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x500/X500Name;->e()[Lorg/bouncycastle/asn1/x500/RDN;

    move-result-object v7

    move v0, v1

    move v2, v3

    :goto_0
    array-length v4, v7

    if-ge v0, v4, :cond_4

    if-eqz v2, :cond_0

    move v2, v1

    :goto_1
    aget-object v4, v7, v0

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x500/RDN;->e()Z

    move-result v4

    if-eqz v4, :cond_2

    aget-object v4, v7, v0

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x500/RDN;->g()[Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v8

    move v4, v1

    move v5, v3

    :goto_2
    array-length v9, v8

    if-eq v4, v9, :cond_3

    if-eqz v5, :cond_1

    move v5, v1

    :goto_3
    aget-object v9, v8, v4

    sget-object v10, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    invoke-static {v6, v9, v10}, Lorg/bouncycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/StringBuffer;Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;Ljava/util/Hashtable;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_0
    const/16 v4, 0x2c

    invoke-virtual {v6, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_1
    const/16 v9, 0x2b

    invoke-virtual {v6, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_3

    :cond_2
    aget-object v4, v7, v0

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x500/RDN;->f()Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v4

    sget-object v5, Lorg/bouncycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    invoke-static {v6, v4, v5}, Lorg/bouncycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/StringBuffer;Lorg/bouncycastle/asn1/x500/AttributeTypeAndValue;Ljava/util/Hashtable;)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
