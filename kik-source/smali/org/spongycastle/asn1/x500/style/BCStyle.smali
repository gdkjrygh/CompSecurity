.class public Lorg/spongycastle/asn1/x500/style/BCStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/x500/X500NameStyle;


# static fields
.field public static final A:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final B:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final C:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final E:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final F:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final G:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final H:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final I:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final J:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private static final K:Ljava/util/Hashtable;

.field private static final L:Ljava/util/Hashtable;

.field public static final a:Lorg/spongycastle/asn1/x500/X500NameStyle;

.field public static final b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final j:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final t:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final u:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final v:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final w:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final x:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final y:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field public static final z:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 22
    new-instance v0, Lorg/spongycastle/asn1/x500/style/BCStyle;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x500/style/BCStyle;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->a:Lorg/spongycastle/asn1/x500/X500NameStyle;

    .line 27
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.6"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 32
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.10"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 37
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.11"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 42
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.12"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 47
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.3"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 52
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.5"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 57
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.9"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 62
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 67
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.7"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->j:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 72
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.8"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 77
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.4"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 78
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.42"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 79
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.43"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 80
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.44"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 81
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.45"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 86
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.15"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 92
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.17"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 98
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.46"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 104
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.65"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->t:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 111
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.1"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->u:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 117
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.2"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->v:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 123
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.3"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->w:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 130
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.4"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->x:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 137
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.5.5.7.9.5"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->y:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 144
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.36.8.3.14"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->z:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 150
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.16"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->A:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 155
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "2.5.4.54"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->B:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 160
    sget-object v0, Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->C:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 165
    sget-object v0, Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;->y_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 171
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->T:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->E:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 176
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->U:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->F:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 177
    sget-object v0, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->aa:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->G:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 182
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->E:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->H:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 187
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "0.9.2342.19200300.100.1.25"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->I:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 192
    new-instance v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "0.9.2342.19200300.100.1.1"

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->J:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 198
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    .line 203
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    .line 207
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "C"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "O"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "T"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "OU"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "CN"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->j:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "L"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "ST"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SERIALNUMBER"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->E:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "E"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->I:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "DC"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->J:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "UID"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "STREET"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "SURNAME"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GIVENNAME"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "INITIALS"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "GENERATION"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->G:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "unstructuredAddress"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->F:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "unstructuredName"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "UniqueIdentifier"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "DN"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->t:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "Pseudonym"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->A:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "PostalAddress"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->z:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "NameAtBirth"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->x:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "CountryOfCitizenship"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->y:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "CountryOfResidence"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->w:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "Gender"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->v:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "PlaceOfBirth"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->u:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "DateOfBirth"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "PostalCode"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "BusinessCategory"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->C:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "TelephoneNumber"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    sget-object v1, Lorg/spongycastle/asn1/x500/style/BCStyle;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const-string v2, "Name"

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "c"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "o"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "t"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->e:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "ou"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "cn"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "l"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->j:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "st"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "sn"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "serialnumber"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "street"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "emailaddress"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->H:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "dc"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->I:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "e"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->H:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "uid"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->J:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "surname"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "givenname"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->m:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "initials"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->n:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "generation"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->o:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "unstructuredaddress"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->G:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "unstructuredname"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->F:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "uniqueidentifier"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->p:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "dn"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "pseudonym"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->t:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "postaladdress"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->A:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "nameofbirth"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->z:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "countryofcitizenship"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->x:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "countryofresidence"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->y:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "gender"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->w:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "placeofbirth"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->v:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "dateofbirth"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->u:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "postalcode"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->r:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "businesscategory"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "telephonenumber"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->C:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    sget-object v0, Lorg/spongycastle/asn1/x500/style/BCStyle;->L:Ljava/util/Hashtable;

    const-string v1, "name"

    sget-object v2, Lorg/spongycastle/asn1/x500/style/BCStyle;->D:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 277
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    return-void
.end method

.method private static a(Lorg/spongycastle/asn1/ASN1Encodable;)I
    .locals 1

    .prologue
    .line 492
    invoke-static {p0}, Lorg/spongycastle/asn1/x500/style/IETFUtils;->a(Lorg/spongycastle/asn1/ASN1Encodable;)Ljava/lang/String;

    move-result-object v0

    .line 494
    invoke-static {v0}, Lorg/spongycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 496
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method private static a(Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 423
    if-ne p0, p1, :cond_1

    .line 454
    :cond_0
    :goto_0
    return v0

    .line 428
    :cond_1
    if-nez p0, :cond_2

    move v0, v1

    .line 430
    goto :goto_0

    .line 433
    :cond_2
    if-nez p1, :cond_3

    move v0, v1

    .line 435
    goto :goto_0

    .line 438
    :cond_3
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    .line 439
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    .line 441
    invoke-virtual {v2, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    .line 443
    goto :goto_0

    .line 446
    :cond_4
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x500/style/IETFUtils;->a(Lorg/spongycastle/asn1/ASN1Encodable;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 447
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/asn1/x500/style/IETFUtils;->a(Lorg/spongycastle/asn1/ASN1Encodable;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 449
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 451
    goto :goto_0
.end method

.method protected static a(Lorg/spongycastle/asn1/x500/RDN;Lorg/spongycastle/asn1/x500/RDN;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 381
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x500/RDN;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 383
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/RDN;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 385
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x500/RDN;->e()[Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v2

    .line 386
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/RDN;->e()[Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v3

    .line 388
    array-length v0, v2

    array-length v4, v3

    if-eq v0, v4, :cond_1

    .line 418
    :cond_0
    :goto_0
    return v1

    :cond_1
    move v0, v1

    .line 393
    :goto_1
    array-length v4, v2

    if-eq v0, v4, :cond_3

    .line 395
    aget-object v4, v2, v0

    aget-object v5, v3, v0

    invoke-static {v4, v5}, Lorg/spongycastle/asn1/x500/style/BCStyle;->a(Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 393
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 408
    :cond_2
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/RDN;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 410
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x500/RDN;->d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/RDN;->d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/spongycastle/asn1/x500/style/BCStyle;->a(Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;)Z

    move-result v1

    goto :goto_0

    .line 418
    :cond_3
    const/4 v1, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final a(Lorg/spongycastle/asn1/x500/X500Name;)I
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 464
    .line 465
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/X500Name;->c()[Lorg/spongycastle/asn1/x500/RDN;

    move-result-object v4

    move v0, v1

    move v2, v1

    .line 468
    :goto_0
    array-length v3, v4

    if-eq v0, v3, :cond_2

    .line 470
    aget-object v3, v4, v0

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x500/RDN;->c()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 472
    aget-object v3, v4, v0

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x500/RDN;->e()[Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v5

    move v3, v2

    move v2, v1

    .line 474
    :goto_1
    array-length v6, v5

    if-eq v2, v6, :cond_0

    .line 476
    aget-object v6, v5, v2

    invoke-virtual {v6}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v6

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->hashCode()I

    move-result v6

    xor-int/2addr v3, v6

    .line 477
    aget-object v6, v5, v2

    invoke-virtual {v6}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v6

    invoke-static {v6}, Lorg/spongycastle/asn1/x500/style/BCStyle;->a(Lorg/spongycastle/asn1/ASN1Encodable;)I

    move-result v6

    xor-int/2addr v3, v6

    .line 474
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    move v2, v3

    .line 468
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 482
    :cond_1
    aget-object v3, v4, v0

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x500/RDN;->d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->hashCode()I

    move-result v3

    xor-int/2addr v2, v3

    .line 483
    aget-object v3, v4, v0

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x500/RDN;->d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/asn1/x500/style/BCStyle;->a(Lorg/spongycastle/asn1/ASN1Encodable;)I

    move-result v3

    xor-int/2addr v2, v3

    goto :goto_2

    .line 487
    :cond_2
    return v2
.end method

.method public a(Lorg/spongycastle/asn1/x500/X500Name;Lorg/spongycastle/asn1/x500/X500Name;)Z
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 325
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/X500Name;->c()[Lorg/spongycastle/asn1/x500/RDN;

    move-result-object v5

    .line 326
    invoke-virtual {p2}, Lorg/spongycastle/asn1/x500/X500Name;->c()[Lorg/spongycastle/asn1/x500/RDN;

    move-result-object v6

    .line 328
    array-length v0, v5

    array-length v3, v6

    if-eq v0, v3, :cond_1

    .line 348
    :cond_0
    :goto_0
    return v2

    .line 335
    :cond_1
    aget-object v0, v5, v2

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x500/RDN;->d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    if-eqz v0, :cond_8

    aget-object v0, v6, v2

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x500/RDN;->d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 337
    aget-object v0, v5, v2

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x500/RDN;->d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    aget-object v3, v6, v2

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x500/RDN;->d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    move v3, v2

    .line 340
    :goto_2
    array-length v4, v5

    if-eq v3, v4, :cond_7

    .line 342
    aget-object v7, v5, v3

    if-eqz v0, :cond_4

    array-length v4, v6

    add-int/lit8 v4, v4, -0x1

    :goto_3
    if-ltz v4, :cond_6

    aget-object v8, v6, v4

    if-eqz v8, :cond_3

    aget-object v8, v6, v4

    invoke-static {v7, v8}, Lorg/spongycastle/asn1/x500/style/BCStyle;->a(Lorg/spongycastle/asn1/x500/RDN;Lorg/spongycastle/asn1/x500/RDN;)Z

    move-result v8

    if-eqz v8, :cond_3

    aput-object v9, v6, v4

    move v4, v1

    :goto_4
    if-eqz v4, :cond_0

    .line 340
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    move v0, v2

    .line 337
    goto :goto_1

    .line 342
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

    invoke-static {v7, v8}, Lorg/spongycastle/asn1/x500/style/BCStyle;->a(Lorg/spongycastle/asn1/x500/RDN;Lorg/spongycastle/asn1/x500/RDN;)Z

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

    .line 348
    goto :goto_0

    :cond_8
    move v0, v2

    goto :goto_1
.end method

.method public final b(Lorg/spongycastle/asn1/x500/X500Name;)Ljava/lang/String;
    .locals 11

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 501
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 504
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x500/X500Name;->c()[Lorg/spongycastle/asn1/x500/RDN;

    move-result-object v7

    move v0, v1

    move v2, v3

    .line 506
    :goto_0
    array-length v4, v7

    if-ge v0, v4, :cond_4

    .line 508
    if-eqz v2, :cond_0

    move v2, v1

    .line 517
    :goto_1
    aget-object v4, v7, v0

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x500/RDN;->c()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 519
    aget-object v4, v7, v0

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x500/RDN;->e()[Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v8

    move v4, v1

    move v5, v3

    .line 522
    :goto_2
    array-length v9, v8

    if-eq v4, v9, :cond_3

    .line 524
    if-eqz v5, :cond_1

    move v5, v1

    .line 533
    :goto_3
    aget-object v9, v8, v4

    sget-object v10, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    invoke-static {v6, v9, v10}, Lorg/spongycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/StringBuffer;Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;Ljava/util/Hashtable;)V

    .line 522
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 514
    :cond_0
    const/16 v4, 0x2c

    invoke-virtual {v6, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 530
    :cond_1
    const/16 v9, 0x2b

    invoke-virtual {v6, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_3

    .line 538
    :cond_2
    aget-object v4, v7, v0

    invoke-virtual {v4}, Lorg/spongycastle/asn1/x500/RDN;->d()Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;

    move-result-object v4

    sget-object v5, Lorg/spongycastle/asn1/x500/style/BCStyle;->K:Ljava/util/Hashtable;

    invoke-static {v6, v4, v5}, Lorg/spongycastle/asn1/x500/style/IETFUtils;->a(Ljava/lang/StringBuffer;Lorg/spongycastle/asn1/x500/AttributeTypeAndValue;Ljava/util/Hashtable;)V

    .line 506
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 542
    :cond_4
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
