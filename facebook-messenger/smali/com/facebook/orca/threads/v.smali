.class public Lcom/facebook/orca/threads/v;
.super Ljava/lang/Object;
.source "ThreadSummaryBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:J

.field private e:J

.field private f:Ljava/lang/String;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:Lcom/facebook/user/UserKey;

.field private l:J

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/lang/String;

.field private o:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Landroid/net/Uri;

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Lcom/facebook/orca/threads/FolderName;

.field private x:Lcom/facebook/orca/compose/MessageDraft;

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->g:Ljava/util/List;

    .line 31
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->h:Ljava/util/List;

    .line 32
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->i:Ljava/util/List;

    .line 36
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->m:Ljava/util/List;

    .line 48
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->y:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(J)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 102
    iput-wide p1, p0, Lcom/facebook/orca/threads/v;->d:J

    .line 103
    return-object p0
.end method

.method public a(Landroid/net/Uri;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 238
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->r:Landroid/net/Uri;

    .line 239
    return-object p0
.end method

.method public a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->o:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 203
    return-object p0
.end method

.method public a(Lcom/facebook/orca/compose/MessageDraft;)Lcom/facebook/orca/threads/v;
    .locals 0
    .param p1    # Lcom/facebook/orca/compose/MessageDraft;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 292
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->x:Lcom/facebook/orca/compose/MessageDraft;

    .line 293
    return-object p0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 283
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->w:Lcom/facebook/orca/threads/FolderName;

    .line 284
    return-object p0
.end method

.method public a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/v;
    .locals 2

    .prologue
    .line 51
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->a:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->b:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/v;->c:J

    .line 54
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/v;->d:J

    .line 55
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/v;->e:J

    .line 56
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->f:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->g:Ljava/util/List;

    .line 58
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->B()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->h:Ljava/util/List;

    .line 59
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->k()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->i:Ljava/util/List;

    .line 60
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/v;->j:Z

    .line 61
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->k:Lcom/facebook/user/UserKey;

    .line 62
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/v;->l:J

    .line 63
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->m()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->m:Ljava/util/List;

    .line 64
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->n:Ljava/lang/String;

    .line 65
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->p()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->o:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 66
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->p:Ljava/lang/String;

    .line 67
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->q()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->q:Ljava/lang/String;

    .line 68
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->s()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->r:Landroid/net/Uri;

    .line 69
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->u()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/v;->s:Z

    .line 70
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->v()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/v;->t:Z

    .line 71
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->w()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/v;->u:Z

    .line 72
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->x()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/v;->v:Z

    .line 73
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->w:Lcom/facebook/orca/threads/FolderName;

    .line 74
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->z()Lcom/facebook/orca/compose/MessageDraft;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->x:Lcom/facebook/orca/compose/MessageDraft;

    .line 75
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->A()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/v;->y:Ljava/util/List;

    .line 76
    return-object p0
.end method

.method public a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->k:Lcom/facebook/user/UserKey;

    .line 149
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->a:Ljava/lang/String;

    .line 85
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/facebook/orca/threads/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;)",
            "Lcom/facebook/orca/threads/v;"
        }
    .end annotation

    .prologue
    .line 157
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->g:Ljava/util/List;

    .line 158
    return-object p0
.end method

.method public a(Z)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 139
    iput-boolean p1, p0, Lcom/facebook/orca/threads/v;->j:Z

    .line 140
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(J)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 111
    iput-wide p1, p0, Lcom/facebook/orca/threads/v;->e:J

    .line 112
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->b:Ljava/lang/String;

    .line 94
    return-object p0
.end method

.method public b(Ljava/util/List;)Lcom/facebook/orca/threads/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;)",
            "Lcom/facebook/orca/threads/v;"
        }
    .end annotation

    .prologue
    .line 166
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->h:Ljava/util/List;

    .line 167
    return-object p0
.end method

.method public b(Z)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 247
    iput-boolean p1, p0, Lcom/facebook/orca/threads/v;->s:Z

    .line 248
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 98
    iget-wide v0, p0, Lcom/facebook/orca/threads/v;->d:J

    return-wide v0
.end method

.method public c(J)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 124
    iput-wide p1, p0, Lcom/facebook/orca/threads/v;->c:J

    .line 125
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->f:Ljava/lang/String;

    .line 130
    return-object p0
.end method

.method public c(Ljava/util/List;)Lcom/facebook/orca/threads/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;)",
            "Lcom/facebook/orca/threads/v;"
        }
    .end annotation

    .prologue
    .line 175
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->i:Ljava/util/List;

    .line 176
    return-object p0
.end method

.method public c(Z)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 256
    iput-boolean p1, p0, Lcom/facebook/orca/threads/v;->t:Z

    .line 257
    return-object p0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 107
    iget-wide v0, p0, Lcom/facebook/orca/threads/v;->e:J

    return-wide v0
.end method

.method public d(J)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 184
    iput-wide p1, p0, Lcom/facebook/orca/threads/v;->l:J

    .line 185
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 193
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->n:Ljava/lang/String;

    .line 194
    return-object p0
.end method

.method public d(Ljava/util/List;)Lcom/facebook/orca/threads/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;)",
            "Lcom/facebook/orca/threads/v;"
        }
    .end annotation

    .prologue
    .line 220
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->m:Ljava/util/List;

    .line 221
    return-object p0
.end method

.method public d(Z)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 265
    iput-boolean p1, p0, Lcom/facebook/orca/threads/v;->u:Z

    .line 266
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->p:Ljava/lang/String;

    .line 212
    return-object p0
.end method

.method public e(Ljava/util/List;)Lcom/facebook/orca/threads/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)",
            "Lcom/facebook/orca/threads/v;"
        }
    .end annotation

    .prologue
    .line 318
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->y:Ljava/util/List;

    .line 319
    return-object p0
.end method

.method public e(Z)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 274
    iput-boolean p1, p0, Lcom/facebook/orca/threads/v;->v:Z

    .line 275
    return-object p0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 120
    iget-wide v0, p0, Lcom/facebook/orca/threads/v;->c:J

    return-wide v0
.end method

.method public f(Ljava/lang/String;)Lcom/facebook/orca/threads/v;
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lcom/facebook/orca/threads/v;->q:Ljava/lang/String;

    .line 230
    return-object p0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 134
    iget-boolean v0, p0, Lcom/facebook/orca/threads/v;->j:Z

    return v0
.end method

.method public h()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->k:Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 153
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->g:Ljava/util/List;

    return-object v0
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->h:Ljava/util/List;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->i:Ljava/util/List;

    return-object v0
.end method

.method public l()J
    .locals 2

    .prologue
    .line 180
    iget-wide v0, p0, Lcom/facebook/orca/threads/v;->l:J

    return-wide v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->n:Ljava/lang/String;

    return-object v0
.end method

.method public n()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->o:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->p:Ljava/lang/String;

    return-object v0
.end method

.method public p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->m:Ljava/util/List;

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->q:Ljava/lang/String;

    return-object v0
.end method

.method public r()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->r:Landroid/net/Uri;

    return-object v0
.end method

.method public s()Z
    .locals 1

    .prologue
    .line 243
    iget-boolean v0, p0, Lcom/facebook/orca/threads/v;->s:Z

    return v0
.end method

.method public t()Z
    .locals 1

    .prologue
    .line 252
    iget-boolean v0, p0, Lcom/facebook/orca/threads/v;->t:Z

    return v0
.end method

.method public u()Z
    .locals 1

    .prologue
    .line 261
    iget-boolean v0, p0, Lcom/facebook/orca/threads/v;->u:Z

    return v0
.end method

.method public v()Z
    .locals 1

    .prologue
    .line 270
    iget-boolean v0, p0, Lcom/facebook/orca/threads/v;->v:Z

    return v0
.end method

.method public w()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->w:Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public x()Lcom/facebook/orca/compose/MessageDraft;
    .locals 1

    .prologue
    .line 288
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->x:Lcom/facebook/orca/compose/MessageDraft;

    return-object v0
.end method

.method public y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 305
    iget-object v0, p0, Lcom/facebook/orca/threads/v;->y:Ljava/util/List;

    return-object v0
.end method

.method public z()Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 323
    new-instance v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threads/ThreadSummary;-><init>(Lcom/facebook/orca/threads/v;)V

    return-object v0
.end method
