.class public Lcom/facebook/messages/model/threads/e;
.super Ljava/lang/Object;
.source "MessageBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private A:Lcom/facebook/messages/model/threads/SendError;

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:J

.field private e:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:J

.field private j:Lcom/facebook/location/Coordinates;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/TitanAttachmentInfo;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation
.end field

.field private n:I

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private p:Ljava/lang/String;

.field private q:Z

.field private r:Ljava/lang/String;

.field private s:Lcom/facebook/messages/model/threads/c;

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation
.end field

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation
.end field

.field private v:Ljava/lang/String;

.field private w:J

.field private x:Lcom/facebook/user/RecipientInfo;

.field private y:Lcom/facebook/messages/model/threads/GroupMessageInfo;

.field private z:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->k:Ljava/util/List;

    .line 37
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->l:Ljava/util/List;

    .line 38
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->m:Ljava/util/List;

    .line 40
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->o:Ljava/util/List;

    .line 44
    sget-object v0, Lcom/facebook/messages/model/threads/c;->API:Lcom/facebook/messages/model/threads/c;

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->s:Lcom/facebook/messages/model/threads/c;

    .line 46
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->u:Ljava/util/List;

    .line 51
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->z:Ljava/util/Map;

    .line 52
    sget-object v0, Lcom/facebook/messages/model/threads/SendError;->a:Lcom/facebook/messages/model/threads/SendError;

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->A:Lcom/facebook/messages/model/threads/SendError;

    return-void
.end method


# virtual methods
.method public A()Lcom/facebook/messages/model/threads/SendError;
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->A:Lcom/facebook/messages/model/threads/SendError;

    return-object v0
.end method

.method public B()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 350
    new-instance v0, Lcom/facebook/messages/model/threads/Message;

    invoke-direct {v0, p0}, Lcom/facebook/messages/model/threads/Message;-><init>(Lcom/facebook/messages/model/threads/e;)V

    return-object v0
.end method

.method public a(I)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 207
    iput p1, p0, Lcom/facebook/messages/model/threads/e;->n:I

    .line 208
    return-object p0
.end method

.method public a(J)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 108
    iput-wide p1, p0, Lcom/facebook/messages/model/threads/e;->c:J

    .line 109
    return-object p0
.end method

.method public a(Lcom/facebook/location/Coordinates;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->j:Lcom/facebook/location/Coordinates;

    .line 172
    return-object p0
.end method

.method public a(Lcom/facebook/messages/model/threads/GroupMessageInfo;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->y:Lcom/facebook/messages/model/threads/GroupMessageInfo;

    .line 318
    return-object p0
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;
    .locals 2

    .prologue
    .line 55
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->a:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->b:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/messages/model/threads/e;->c:J

    .line 58
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/messages/model/threads/e;->d:J

    .line 59
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->e:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 60
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->f:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->g:Ljava/lang/String;

    .line 62
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->h:Ljava/lang/String;

    .line 63
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->s()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/messages/model/threads/e;->i:J

    .line 64
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->j:Lcom/facebook/location/Coordinates;

    .line 65
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->k:Ljava/util/List;

    .line 66
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->l:Ljava/util/List;

    .line 67
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->q()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->m:Ljava/util/List;

    .line 68
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    iput v0, p0, Lcom/facebook/messages/model/threads/e;->n:I

    .line 69
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->v()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->o:Ljava/util/List;

    .line 70
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->p:Ljava/lang/String;

    .line 71
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/messages/model/threads/e;->q:Z

    .line 72
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->r:Ljava/lang/String;

    .line 73
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->s:Lcom/facebook/messages/model/threads/c;

    .line 74
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->t:Ljava/util/List;

    .line 75
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->D()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->u:Ljava/util/List;

    .line 76
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->v:Ljava/lang/String;

    .line 77
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->F()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/messages/model/threads/e;->w:J

    .line 78
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->G()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->x:Lcom/facebook/user/RecipientInfo;

    .line 79
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->H()Lcom/facebook/messages/model/threads/GroupMessageInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->y:Lcom/facebook/messages/model/threads/GroupMessageInfo;

    .line 80
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->J()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ik;->a(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->z:Ljava/util/Map;

    .line 81
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->K()Lcom/facebook/messages/model/threads/SendError;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->A:Lcom/facebook/messages/model/threads/SendError;

    .line 82
    return-object p0
.end method

.method public a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->e:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 127
    return-object p0
.end method

.method public a(Lcom/facebook/messages/model/threads/SendError;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 341
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->A:Lcom/facebook/messages/model/threads/SendError;

    .line 342
    return-object p0
.end method

.method public a(Lcom/facebook/messages/model/threads/c;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 252
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->s:Lcom/facebook/messages/model/threads/c;

    .line 253
    return-object p0
.end method

.method public a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 308
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->x:Lcom/facebook/user/RecipientInfo;

    .line 309
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->a:Ljava/lang/String;

    .line 91
    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->z:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;)",
            "Lcom/facebook/messages/model/threads/e;"
        }
    .end annotation

    .prologue
    .line 180
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->k:Ljava/util/List;

    .line 181
    return-object p0
.end method

.method public a(Ljava/util/Map;)Lcom/facebook/messages/model/threads/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/messages/model/threads/e;"
        }
    .end annotation

    .prologue
    .line 326
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    invoke-static {p1}, Lcom/google/common/a/ik;->a(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/e;->z:Ljava/util/Map;

    .line 328
    return-object p0
.end method

.method public a(Z)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 234
    iput-boolean p1, p0, Lcom/facebook/messages/model/threads/e;->q:Z

    .line 235
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(J)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 117
    iput-wide p1, p0, Lcom/facebook/messages/model/threads/e;->d:J

    .line 118
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->b:Ljava/lang/String;

    .line 100
    return-object p0
.end method

.method public b(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/TitanAttachmentInfo;",
            ">;)",
            "Lcom/facebook/messages/model/threads/e;"
        }
    .end annotation

    .prologue
    .line 189
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->l:Ljava/util/List;

    .line 190
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 104
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/e;->c:J

    return-wide v0
.end method

.method public c(J)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 162
    iput-wide p1, p0, Lcom/facebook/messages/model/threads/e;->i:J

    .line 163
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->f:Ljava/lang/String;

    .line 136
    return-object p0
.end method

.method public c(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;)",
            "Lcom/facebook/messages/model/threads/e;"
        }
    .end annotation

    .prologue
    .line 198
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->m:Ljava/util/List;

    .line 199
    return-object p0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 113
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/e;->d:J

    return-wide v0
.end method

.method public d(J)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 299
    iput-wide p1, p0, Lcom/facebook/messages/model/threads/e;->w:J

    .line 300
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->g:Ljava/lang/String;

    .line 145
    return-object p0
.end method

.method public d(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;)",
            "Lcom/facebook/messages/model/threads/e;"
        }
    .end annotation

    .prologue
    .line 216
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->o:Ljava/util/List;

    .line 217
    return-object p0
.end method

.method public e()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->e:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 225
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->p:Ljava/lang/String;

    .line 226
    return-object p0
.end method

.method public e(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;)",
            "Lcom/facebook/messages/model/threads/e;"
        }
    .end annotation

    .prologue
    .line 264
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->t:Ljava/util/List;

    .line 265
    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 243
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->r:Ljava/lang/String;

    .line 244
    return-object p0
.end method

.method public f(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;)",
            "Lcom/facebook/messages/model/threads/e;"
        }
    .end annotation

    .prologue
    .line 279
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->u:Ljava/util/List;

    .line 280
    return-object p0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;
    .locals 0

    .prologue
    .line 294
    iput-object p1, p0, Lcom/facebook/messages/model/threads/e;->v:Ljava/lang/String;

    .line 295
    return-object p0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->g:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()J
    .locals 2

    .prologue
    .line 158
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/e;->i:J

    return-wide v0
.end method

.method public j()Lcom/facebook/location/Coordinates;
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->j:Lcom/facebook/location/Coordinates;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->k:Ljava/util/List;

    return-object v0
.end method

.method public l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/TitanAttachmentInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->l:Ljava/util/List;

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation

    .prologue
    .line 194
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->m:Ljava/util/List;

    return-object v0
.end method

.method public n()I
    .locals 1

    .prologue
    .line 203
    iget v0, p0, Lcom/facebook/messages/model/threads/e;->n:I

    return v0
.end method

.method public o()Ljava/util/List;
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
    .line 212
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->o:Ljava/util/List;

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->p:Ljava/lang/String;

    return-object v0
.end method

.method public q()Z
    .locals 1

    .prologue
    .line 230
    iget-boolean v0, p0, Lcom/facebook/messages/model/threads/e;->q:Z

    return v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->r:Ljava/lang/String;

    return-object v0
.end method

.method public s()Lcom/facebook/messages/model/threads/c;
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->s:Lcom/facebook/messages/model/threads/c;

    return-object v0
.end method

.method public t()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation

    .prologue
    .line 257
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->t:Ljava/util/List;

    if-nez v0, :cond_0

    .line 258
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 260
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->t:Ljava/util/List;

    goto :goto_0
.end method

.method public u()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation

    .prologue
    .line 272
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->u:Ljava/util/List;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    .prologue
    .line 287
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->v:Ljava/lang/String;

    return-object v0
.end method

.method public w()J
    .locals 2

    .prologue
    .line 304
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/e;->w:J

    return-wide v0
.end method

.method public x()Lcom/facebook/user/RecipientInfo;
    .locals 1

    .prologue
    .line 313
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->x:Lcom/facebook/user/RecipientInfo;

    return-object v0
.end method

.method public y()Lcom/facebook/messages/model/threads/GroupMessageInfo;
    .locals 1

    .prologue
    .line 322
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->y:Lcom/facebook/messages/model/threads/GroupMessageInfo;

    return-object v0
.end method

.method public z()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 337
    iget-object v0, p0, Lcom/facebook/messages/model/threads/e;->z:Ljava/util/Map;

    return-object v0
.end method
