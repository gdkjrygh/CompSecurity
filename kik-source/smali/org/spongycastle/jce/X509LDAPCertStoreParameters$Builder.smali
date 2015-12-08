.class public Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/X509LDAPCertStoreParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:Ljava/lang/String;

.field private J:Ljava/lang/String;

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 177
    const-string v0, "ldap://localhost:389"

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    iput-object p1, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->a:Ljava/lang/String;

    .line 183
    if-nez p2, :cond_0

    .line 185
    const-string v0, ""

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->b:Ljava/lang/String;

    .line 192
    :goto_0
    const-string v0, "userCertificate"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->c:Ljava/lang/String;

    .line 193
    const-string v0, "cACertificate"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->d:Ljava/lang/String;

    .line 194
    const-string v0, "crossCertificatePair"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->e:Ljava/lang/String;

    .line 195
    const-string v0, "certificateRevocationList"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->f:Ljava/lang/String;

    .line 196
    const-string v0, "deltaRevocationList"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->g:Ljava/lang/String;

    .line 197
    const-string v0, "authorityRevocationList"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->h:Ljava/lang/String;

    .line 198
    const-string v0, "attributeCertificateAttribute"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->i:Ljava/lang/String;

    .line 199
    const-string v0, "aACertificate"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->j:Ljava/lang/String;

    .line 200
    const-string v0, "attributeDescriptorCertificate"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->k:Ljava/lang/String;

    .line 201
    const-string v0, "attributeCertificateRevocationList"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->l:Ljava/lang/String;

    .line 202
    const-string v0, "attributeAuthorityRevocationList"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->m:Ljava/lang/String;

    .line 203
    const-string v0, "cn"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->n:Ljava/lang/String;

    .line 204
    const-string v0, "cn ou o"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->o:Ljava/lang/String;

    .line 205
    const-string v0, "cn ou o"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->p:Ljava/lang/String;

    .line 206
    const-string v0, "cn ou o"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->q:Ljava/lang/String;

    .line 207
    const-string v0, "cn ou o"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->r:Ljava/lang/String;

    .line 208
    const-string v0, "cn ou o"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->s:Ljava/lang/String;

    .line 209
    const-string v0, "cn"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->t:Ljava/lang/String;

    .line 210
    const-string v0, "cn o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->u:Ljava/lang/String;

    .line 211
    const-string v0, "cn o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->v:Ljava/lang/String;

    .line 212
    const-string v0, "cn o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->w:Ljava/lang/String;

    .line 213
    const-string v0, "cn o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->x:Ljava/lang/String;

    .line 214
    const-string v0, "cn"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->y:Ljava/lang/String;

    .line 215
    const-string v0, "o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->z:Ljava/lang/String;

    .line 216
    const-string v0, "o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->A:Ljava/lang/String;

    .line 217
    const-string v0, "o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->B:Ljava/lang/String;

    .line 218
    const-string v0, "o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->C:Ljava/lang/String;

    .line 219
    const-string v0, "o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->D:Ljava/lang/String;

    .line 220
    const-string v0, "cn"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->E:Ljava/lang/String;

    .line 221
    const-string v0, "o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->F:Ljava/lang/String;

    .line 222
    const-string v0, "o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->G:Ljava/lang/String;

    .line 223
    const-string v0, "o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->H:Ljava/lang/String;

    .line 224
    const-string v0, "o ou"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->I:Ljava/lang/String;

    .line 225
    const-string v0, "uid serialNumber cn"

    iput-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->J:Ljava/lang/String;

    .line 226
    return-void

    .line 189
    :cond_0
    iput-object p2, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->b:Ljava/lang/String;

    goto/16 :goto_0
.end method

.method static synthetic A(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->A:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic B(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->B:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic C(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->C:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic D(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->D:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic E(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->E:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic F(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->F:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic G(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->G:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic H(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->H:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic I(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->I:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic J(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->J:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->i:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->j:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->k:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic l(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->l:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic n(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic p(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->p:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic q(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->q:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic r(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->r:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic s(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->s:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic t(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->t:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic u(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->u:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic v(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->v:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic w(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->w:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic x(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->x:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic y(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->y:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic z(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->z:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/jce/X509LDAPCertStoreParameters;
    .locals 2

    .prologue
    .line 770
    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->q:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->r:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->s:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->t:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->u:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->v:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->y:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->z:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->A:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->B:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->C:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->D:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->E:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->F:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->G:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->H:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;->I:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 793
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Necessary parameters not specified."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 796
    :cond_1
    new-instance v0, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/spongycastle/jce/X509LDAPCertStoreParameters;-><init>(Lorg/spongycastle/jce/X509LDAPCertStoreParameters$Builder;B)V

    return-object v0
.end method
