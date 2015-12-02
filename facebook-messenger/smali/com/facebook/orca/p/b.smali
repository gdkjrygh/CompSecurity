.class public Lcom/facebook/orca/p/b;
.super Ljava/lang/Object;
.source "CanonicalThreadPresenceHelper.java"


# instance fields
.field private final a:Lcom/facebook/l/k;

.field private final b:Lcom/facebook/orca/f/k;

.field private final c:Lcom/facebook/orca/f/z;

.field private final d:Lcom/facebook/orca/p/e;

.field private final e:Landroid/content/res/Resources;

.field private final f:Lcom/facebook/l/u;

.field private g:Z

.field private h:Lcom/facebook/orca/threadview/v;

.field private i:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private j:J

.field private k:Lcom/facebook/user/User;

.field private l:Lcom/facebook/user/UserKey;

.field private m:Lcom/facebook/l/x;

.field private n:J

.field private o:Lcom/facebook/orca/p/d;


# direct methods
.method public constructor <init>(Lcom/facebook/l/k;Lcom/facebook/orca/f/k;Lcom/facebook/orca/f/z;Lcom/facebook/orca/p/e;Landroid/content/res/Resources;)V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    sget-object v0, Lcom/facebook/l/x;->a:Lcom/facebook/l/x;

    iput-object v0, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    .line 69
    iput-object p1, p0, Lcom/facebook/orca/p/b;->a:Lcom/facebook/l/k;

    .line 70
    iput-object p2, p0, Lcom/facebook/orca/p/b;->b:Lcom/facebook/orca/f/k;

    .line 71
    iput-object p3, p0, Lcom/facebook/orca/p/b;->c:Lcom/facebook/orca/f/z;

    .line 72
    iput-object p4, p0, Lcom/facebook/orca/p/b;->d:Lcom/facebook/orca/p/e;

    .line 73
    iput-object p5, p0, Lcom/facebook/orca/p/b;->e:Landroid/content/res/Resources;

    .line 75
    new-instance v0, Lcom/facebook/orca/p/c;

    invoke-direct {v0, p0}, Lcom/facebook/orca/p/c;-><init>(Lcom/facebook/orca/p/b;)V

    iput-object v0, p0, Lcom/facebook/orca/p/b;->f:Lcom/facebook/l/u;

    .line 81
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/p/b;Lcom/facebook/user/UserKey;Lcom/facebook/l/x;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/user/UserKey;Lcom/facebook/l/x;)V

    return-void
.end method

.method private a(Lcom/facebook/user/UserKey;)V
    .locals 3
    .param p1    # Lcom/facebook/user/UserKey;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/orca/p/b;->l:Lcom/facebook/user/UserKey;

    invoke-static {p1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 206
    :cond_0
    :goto_0
    return-void

    .line 193
    :cond_1
    sget-object v0, Lcom/facebook/l/x;->a:Lcom/facebook/l/x;

    iput-object v0, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    .line 194
    iget-object v0, p0, Lcom/facebook/orca/p/b;->l:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_2

    .line 195
    iget-object v0, p0, Lcom/facebook/orca/p/b;->a:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/orca/p/b;->l:Lcom/facebook/user/UserKey;

    iget-object v2, p0, Lcom/facebook/orca/p/b;->f:Lcom/facebook/l/u;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/l/k;->b(Lcom/facebook/user/UserKey;Lcom/facebook/l/u;)V

    .line 199
    :cond_2
    iput-object p1, p0, Lcom/facebook/orca/p/b;->l:Lcom/facebook/user/UserKey;

    .line 201
    iget-object v0, p0, Lcom/facebook/orca/p/b;->l:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/facebook/orca/p/b;->a:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/orca/p/b;->l:Lcom/facebook/user/UserKey;

    iget-object v2, p0, Lcom/facebook/orca/p/b;->f:Lcom/facebook/l/u;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/l/k;->a(Lcom/facebook/user/UserKey;Lcom/facebook/l/u;)V

    .line 204
    iget-object v0, p0, Lcom/facebook/orca/p/b;->a:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/orca/p/b;->l:Lcom/facebook/user/UserKey;

    invoke-virtual {v0, v1}, Lcom/facebook/l/k;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/l/x;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    goto :goto_0
.end method

.method private a(Lcom/facebook/user/UserKey;Lcom/facebook/l/x;)V
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/orca/p/b;->l:Lcom/facebook/user/UserKey;

    if-nez v0, :cond_1

    .line 222
    :cond_0
    :goto_0
    return-void

    .line 212
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/p/b;->l:Lcom/facebook/user/UserKey;

    invoke-static {p1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    iget-object v0, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    if-eq v0, p2, :cond_0

    .line 218
    iput-object p2, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    .line 219
    iget-object v0, p0, Lcom/facebook/orca/p/b;->o:Lcom/facebook/orca/p/d;

    if-eqz v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/facebook/orca/p/b;->o:Lcom/facebook/orca/p/d;

    invoke-virtual {v0, p2}, Lcom/facebook/orca/p/d;->a(Lcom/facebook/l/x;)V

    goto :goto_0
.end method

.method private f()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 176
    iget-boolean v1, p0, Lcom/facebook/orca/p/b;->g:Z

    if-eqz v1, :cond_1

    .line 178
    iget-object v1, p0, Lcom/facebook/orca/p/b;->i:Lcom/facebook/messages/model/threads/ParticipantInfo;

    if-eqz v1, :cond_0

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/p/b;->i:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 181
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/user/UserKey;)V

    .line 185
    :goto_0
    return-void

    .line 183
    :cond_1
    invoke-direct {p0, v0}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/user/UserKey;)V

    goto :goto_0
.end method

.method private g()J
    .locals 5

    .prologue
    const-wide/16 v0, 0x0

    .line 231
    iget-object v2, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    invoke-virtual {v2}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v2

    if-nez v2, :cond_1

    .line 257
    :cond_0
    :goto_0
    return-wide v0

    .line 235
    :cond_1
    iget-wide v2, p0, Lcom/facebook/orca/p/b;->n:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_2

    .line 236
    iget-wide v0, p0, Lcom/facebook/orca/p/b;->n:J

    goto :goto_0

    .line 238
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    invoke-virtual {v0}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/LastActive;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/p/b;->n:J

    .line 241
    iget-wide v0, p0, Lcom/facebook/orca/p/b;->j:J

    iget-wide v2, p0, Lcom/facebook/orca/p/b;->n:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 242
    iget-wide v0, p0, Lcom/facebook/orca/p/b;->j:J

    iput-wide v0, p0, Lcom/facebook/orca/p/b;->n:J

    .line 246
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/p/b;->c:Lcom/facebook/orca/f/z;

    iget-object v1, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/z;->a(Lcom/facebook/user/UserKey;)Ljava/lang/Long;

    move-result-object v0

    .line 248
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/facebook/orca/p/b;->n:J

    cmp-long v1, v1, v3

    if-lez v1, :cond_4

    .line 249
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/p/b;->n:J

    .line 252
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/p/b;->d:Lcom/facebook/orca/p/e;

    iget-wide v1, p0, Lcom/facebook/orca/p/b;->n:J

    iget-object v3, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    invoke-virtual {v3}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/user/LastActive;->b()Z

    move-result v3

    iget-object v4, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    invoke-virtual {v4}, Lcom/facebook/l/x;->a()Lcom/facebook/l/a;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/orca/p/e;->a(JZLcom/facebook/l/a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/p/b;->n:J

    .line 257
    iget-wide v0, p0, Lcom/facebook/orca/p/b;->n:J

    goto :goto_0
.end method

.method private h()Z
    .locals 4

    .prologue
    .line 266
    iget-object v0, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    invoke-virtual {v0}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/p/b;->g()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    invoke-virtual {v0}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/LastActive;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private i()Ljava/lang/String;
    .locals 3

    .prologue
    .line 278
    iget-object v0, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    if-nez v0, :cond_0

    .line 279
    const-string v0, ""

    .line 282
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/p/b;->d:Lcom/facebook/orca/p/e;

    iget-wide v1, p0, Lcom/facebook/orca/p/b;->n:J

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/p/e;->a(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private j()Ljava/lang/String;
    .locals 3

    .prologue
    .line 291
    iget-object v0, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    if-nez v0, :cond_0

    .line 292
    const-string v0, ""

    .line 295
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/p/b;->d:Lcom/facebook/orca/p/e;

    iget-wide v1, p0, Lcom/facebook/orca/p/b;->n:J

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/p/e;->b(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/orca/p/b;->i:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public a(Lcom/facebook/orca/p/d;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/facebook/orca/p/b;->o:Lcom/facebook/orca/p/d;

    .line 142
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/v;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 100
    iput-object p1, p0, Lcom/facebook/orca/p/b;->h:Lcom/facebook/orca/threadview/v;

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/p/b;->h:Lcom/facebook/orca/threadview/v;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/p/b;->h:Lcom/facebook/orca/threadview/v;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/v;->d()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/p/b;->i:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/p/b;->h:Lcom/facebook/orca/threadview/v;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/v;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/p/b;->j:J

    .line 108
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/p/b;->i:Lcom/facebook/messages/model/threads/ParticipantInfo;

    if-eqz v0, :cond_1

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/p/b;->b:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/p/b;->i:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    .line 114
    :goto_1
    invoke-direct {p0}, Lcom/facebook/orca/p/b;->f()V

    .line 115
    return-void

    .line 105
    :cond_0
    iput-object v2, p0, Lcom/facebook/orca/p/b;->i:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 106
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/p/b;->j:J

    goto :goto_0

    .line 112
    :cond_1
    iput-object v2, p0, Lcom/facebook/orca/p/b;->k:Lcom/facebook/user/User;

    goto :goto_1
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 89
    iput-boolean p1, p0, Lcom/facebook/orca/p/b;->g:Z

    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/p/b;->f()V

    .line 91
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/orca/p/b;->i:Lcom/facebook/messages/model/threads/ParticipantInfo;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/facebook/l/x;
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 5

    .prologue
    .line 155
    const/4 v0, 0x0

    .line 156
    iget-object v1, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    invoke-virtual {v1}, Lcom/facebook/l/x;->a()Lcom/facebook/l/a;

    move-result-object v1

    sget-object v2, Lcom/facebook/l/a;->AVAILABLE:Lcom/facebook/l/a;

    if-eq v1, v2, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/p/b;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/p/b;->e:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->presence_active_now:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 163
    :cond_1
    :goto_0
    return-object v0

    .line 158
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/p/b;->g()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    .line 159
    invoke-direct {p0}, Lcom/facebook/orca/p/b;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 160
    :cond_3
    iget-object v1, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    invoke-virtual {v1}, Lcom/facebook/l/x;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/p/b;->e:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->presence_mobile:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public e()Ljava/lang/String;
    .locals 4

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/orca/p/b;->m:Lcom/facebook/l/x;

    invoke-virtual {v0}, Lcom/facebook/l/x;->a()Lcom/facebook/l/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/l/a;->AVAILABLE:Lcom/facebook/l/a;

    if-eq v0, v1, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/p/b;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/p/b;->g()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 169
    :cond_0
    const-string v0, ""

    .line 172
    :goto_0
    return-object v0

    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/p/b;->j()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
