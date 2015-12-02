.class public Lcom/facebook/contacts/models/b;
.super Ljava/lang/Object;
.source "ContactBuilder.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/facebook/user/Name;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Lcom/facebook/user/Name;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:F

.field private m:Ljava/lang/String;

.field private n:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/ContactPhone;",
            ">;"
        }
    .end annotation
.end field

.field private o:Z

.field private p:Lcom/facebook/common/w/q;

.field private q:Z

.field private r:Lcom/facebook/contacts/models/a/a;

.field private s:Ljava/lang/String;

.field private t:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    iput-object v0, p0, Lcom/facebook/contacts/models/b;->p:Lcom/facebook/common/w/q;

    .line 39
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/b;->n:Lcom/google/common/a/es;

    .line 40
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/models/b;->t:Lcom/google/common/a/es;

    .line 41
    return-void
.end method


# virtual methods
.method public a(F)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 168
    iput p1, p0, Lcom/facebook/contacts/models/b;->l:F

    .line 169
    return-object p0
.end method

.method public a(Lcom/facebook/common/w/q;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->p:Lcom/facebook/common/w/q;

    .line 205
    return-object p0
.end method

.method public a(Lcom/facebook/contacts/models/a/a;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->r:Lcom/facebook/contacts/models/a/a;

    .line 227
    return-object p0
.end method

.method public a(Lcom/facebook/user/Name;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->d:Lcom/facebook/user/Name;

    .line 97
    return-object p0
.end method

.method public a(Lcom/google/common/a/es;)Lcom/facebook/contacts/models/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/ContactPhone;",
            ">;)",
            "Lcom/facebook/contacts/models/b;"
        }
    .end annotation

    .prologue
    .line 186
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->n:Lcom/google/common/a/es;

    .line 187
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->a:Ljava/lang/String;

    .line 70
    return-object p0
.end method

.method public a(Z)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 195
    iput-boolean p1, p0, Lcom/facebook/contacts/models/b;->o:Z

    .line 196
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Lcom/facebook/user/Name;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->h:Lcom/facebook/user/Name;

    .line 106
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->b:Ljava/lang/String;

    .line 79
    return-object p0
.end method

.method public b(Z)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 213
    iput-boolean p1, p0, Lcom/facebook/contacts/models/b;->q:Z

    .line 214
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 246
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->t:Lcom/google/common/a/es;

    .line 247
    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->c:Ljava/lang/String;

    .line 88
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->e:Ljava/lang/String;

    .line 115
    return-object p0
.end method

.method public d()Lcom/facebook/user/Name;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->d:Lcom/facebook/user/Name;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->i:Ljava/lang/String;

    .line 142
    return-object p0
.end method

.method public e()Lcom/facebook/user/Name;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->h:Lcom/facebook/user/Name;

    return-object v0
.end method

.method public f(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->j:Ljava/lang/String;

    .line 151
    return-object p0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 159
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->k:Ljava/lang/String;

    .line 160
    return-object p0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->m:Ljava/lang/String;

    .line 178
    return-object p0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->g:Ljava/lang/String;

    return-object v0
.end method

.method public i(Ljava/lang/String;)Lcom/facebook/contacts/models/b;
    .locals 0

    .prologue
    .line 237
    iput-object p1, p0, Lcom/facebook/contacts/models/b;->s:Ljava/lang/String;

    .line 238
    return-object p0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->i:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->j:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->k:Ljava/lang/String;

    return-object v0
.end method

.method public l()F
    .locals 1

    .prologue
    .line 173
    iget v0, p0, Lcom/facebook/contacts/models/b;->l:F

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->m:Ljava/lang/String;

    return-object v0
.end method

.method public n()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/ContactPhone;",
            ">;"
        }
    .end annotation

    .prologue
    .line 191
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->n:Lcom/google/common/a/es;

    return-object v0
.end method

.method public o()Z
    .locals 1

    .prologue
    .line 200
    iget-boolean v0, p0, Lcom/facebook/contacts/models/b;->o:Z

    return v0
.end method

.method public p()Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->p:Lcom/facebook/common/w/q;

    return-object v0
.end method

.method public q()Z
    .locals 1

    .prologue
    .line 218
    iget-boolean v0, p0, Lcom/facebook/contacts/models/b;->q:Z

    return v0
.end method

.method public r()Lcom/facebook/contacts/models/a/a;
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->r:Lcom/facebook/contacts/models/a/a;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->s:Ljava/lang/String;

    return-object v0
.end method

.method public t()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 242
    iget-object v0, p0, Lcom/facebook/contacts/models/b;->t:Lcom/google/common/a/es;

    return-object v0
.end method

.method public u()Lcom/facebook/contacts/models/Contact;
    .locals 1

    .prologue
    .line 250
    new-instance v0, Lcom/facebook/contacts/models/Contact;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/models/Contact;-><init>(Lcom/facebook/contacts/models/b;)V

    return-object v0
.end method
