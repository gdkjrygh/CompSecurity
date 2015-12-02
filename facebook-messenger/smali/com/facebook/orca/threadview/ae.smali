.class public Lcom/facebook/orca/threadview/ae;
.super Lcom/facebook/orca/threadview/ac;
.source "RowReceiptItem.java"


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/facebook/orca/threadview/af;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:J

.field private final h:J

.field private final i:J

.field private final j:Lcom/facebook/location/Coordinates;

.field private final k:Z

.field private final l:I


# direct methods
.method private constructor <init>(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 44
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ac;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/facebook/orca/threadview/ae;->b:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 46
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->c:Ljava/lang/String;

    .line 47
    iput-object p2, p0, Lcom/facebook/orca/threadview/ae;->d:Lcom/facebook/orca/threadview/af;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->a:Ljava/util/List;

    .line 49
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->e:Ljava/lang/String;

    .line 50
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->f:Ljava/lang/String;

    .line 51
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threadview/ae;->g:J

    .line 52
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threadview/ae;->h:J

    .line 53
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/orca/threadview/ae;->i:J

    .line 54
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->j:Lcom/facebook/location/Coordinates;

    .line 55
    iput-boolean v2, p0, Lcom/facebook/orca/threadview/ae;->k:Z

    .line 56
    iput v2, p0, Lcom/facebook/orca/threadview/ae;->l:I

    .line 57
    return-void
.end method

.method private constructor <init>(Ljava/util/List;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;",
            "Lcom/facebook/orca/threadview/af;",
            "Lcom/facebook/messages/model/threads/Message;",
            "J)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 79
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    move v7, v6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/ae;-><init>(Ljava/util/List;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;JZI)V

    .line 80
    return-void
.end method

.method private constructor <init>(Ljava/util/List;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;JZI)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;",
            "Lcom/facebook/orca/threadview/af;",
            "Lcom/facebook/messages/model/threads/Message;",
            "JZI)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 88
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ac;-><init>()V

    .line 89
    iput-object p1, p0, Lcom/facebook/orca/threadview/ae;->a:Ljava/util/List;

    .line 90
    iput-object p2, p0, Lcom/facebook/orca/threadview/ae;->d:Lcom/facebook/orca/threadview/af;

    .line 91
    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->b:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 92
    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->c:Ljava/lang/String;

    .line 93
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->e:Ljava/lang/String;

    .line 94
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->f:Ljava/lang/String;

    .line 95
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threadview/ae;->g:J

    .line 96
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threadview/ae;->h:J

    .line 97
    iput-wide p4, p0, Lcom/facebook/orca/threadview/ae;->i:J

    .line 98
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ae;->j:Lcom/facebook/location/Coordinates;

    .line 99
    iput-boolean p6, p0, Lcom/facebook/orca/threadview/ae;->k:Z

    .line 100
    iput p7, p0, Lcom/facebook/orca/threadview/ae;->l:I

    .line 101
    return-void
.end method

.method private constructor <init>(Ljava/util/List;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;ZI)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;",
            "Lcom/facebook/orca/threadview/af;",
            "Lcom/facebook/messages/model/threads/Message;",
            "ZI)V"
        }
    .end annotation

    .prologue
    .line 65
    const-wide/16 v4, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/ae;-><init>(Ljava/util/List;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;JZI)V

    .line 72
    return-void
.end method

.method public static a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;
    .locals 3

    .prologue
    .line 136
    new-instance v0, Lcom/facebook/orca/threadview/ae;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/orca/threadview/af;->PENDING:Lcom/facebook/orca/threadview/af;

    invoke-direct {v0, v1, v2, p0}, Lcom/facebook/orca/threadview/ae;-><init>(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;
    .locals 2

    .prologue
    .line 126
    new-instance v0, Lcom/facebook/orca/threadview/ae;

    sget-object v1, Lcom/facebook/orca/threadview/af;->SENT_FROM_RECEIPT:Lcom/facebook/orca/threadview/af;

    invoke-direct {v0, p0, v1, p1}, Lcom/facebook/orca/threadview/ae;-><init>(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;)V

    return-object v0
.end method

.method public static a(Ljava/util/List;Lcom/facebook/messages/model/threads/Message;J)Lcom/facebook/orca/threadview/ae;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;",
            "Lcom/facebook/messages/model/threads/Message;",
            "J)",
            "Lcom/facebook/orca/threadview/ae;"
        }
    .end annotation

    .prologue
    .line 107
    new-instance v0, Lcom/facebook/orca/threadview/ae;

    sget-object v2, Lcom/facebook/orca/threadview/af;->READ:Lcom/facebook/orca/threadview/af;

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/threadview/ae;-><init>(Ljava/util/List;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;J)V

    return-object v0
.end method

.method public static a(Ljava/util/List;Lcom/facebook/messages/model/threads/Message;ZI)Lcom/facebook/orca/threadview/ae;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;",
            "Lcom/facebook/messages/model/threads/Message;",
            "ZI)",
            "Lcom/facebook/orca/threadview/ae;"
        }
    .end annotation

    .prologue
    .line 115
    new-instance v0, Lcom/facebook/orca/threadview/ae;

    sget-object v2, Lcom/facebook/orca/threadview/af;->GROUP_READ:Lcom/facebook/orca/threadview/af;

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/threadview/ae;-><init>(Ljava/util/List;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;ZI)V

    return-object v0
.end method

.method public static b(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;
    .locals 3

    .prologue
    .line 140
    new-instance v0, Lcom/facebook/orca/threadview/ae;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/orca/threadview/af;->SENT_BY_ME_TO_SERVER:Lcom/facebook/orca/threadview/af;

    invoke-direct {v0, v1, v2, p0}, Lcom/facebook/orca/threadview/ae;-><init>(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;)V

    return-object v0
.end method

.method public static b(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;
    .locals 2

    .prologue
    .line 132
    new-instance v0, Lcom/facebook/orca/threadview/ae;

    sget-object v1, Lcom/facebook/orca/threadview/af;->DELIVERED:Lcom/facebook/orca/threadview/af;

    invoke-direct {v0, p0, v1, p1}, Lcom/facebook/orca/threadview/ae;-><init>(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;)V

    return-object v0
.end method

.method public static c(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;
    .locals 3

    .prologue
    .line 144
    new-instance v0, Lcom/facebook/orca/threadview/ae;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/orca/threadview/af;->FAILED_TO_SEND:Lcom/facebook/orca/threadview/af;

    invoke-direct {v0, v1, v2, p0}, Lcom/facebook/orca/threadview/ae;-><init>(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/orca/threadview/af;Lcom/facebook/messages/model/threads/Message;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 197
    const/4 v0, 0x4

    return v0
.end method

.method public a(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/messages/model/threads/ParticipantInfo;)Z
    .locals 2

    .prologue
    .line 252
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threadview/ae;)Z
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 232
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v4

    .line 233
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    if-nez v4, :cond_1

    move v2, v3

    .line 248
    :cond_0
    :goto_0
    return v2

    .line 237
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    move v1, v2

    .line 242
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 243
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v5

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {p0, v5, v0}, Lcom/facebook/orca/threadview/ae;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/messages/model/threads/ParticipantInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    move v2, v3

    .line 248
    goto :goto_0
.end method

.method public b()Lcom/facebook/orca/threadview/af;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->d:Lcom/facebook/orca/threadview/af;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->a:Ljava/util/List;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 202
    instance-of v2, p1, Lcom/facebook/orca/threadview/ae;

    if-nez v2, :cond_0

    .line 217
    :goto_0
    return v1

    .line 205
    :cond_0
    check-cast p1, Lcom/facebook/orca/threadview/ae;

    .line 207
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v0

    .line 217
    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/threadview/af;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/ae;->a(Lcom/facebook/orca/threadview/ae;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_2
    move v1, v0

    goto :goto_0

    .line 211
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 213
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1

    :cond_2
    move v0, v1

    .line 217
    goto :goto_2

    :cond_3
    move v2, v1

    goto :goto_1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 172
    iget-wide v0, p0, Lcom/facebook/orca/threadview/ae;->g:J

    return-wide v0
.end method

.method public h()J
    .locals 2

    .prologue
    .line 180
    iget-wide v0, p0, Lcom/facebook/orca/threadview/ae;->i:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 225
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 226
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->f()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ae;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 228
    return v0

    :cond_1
    move v0, v1

    .line 225
    goto :goto_0
.end method

.method public i()Lcom/facebook/location/Coordinates;
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->j:Lcom/facebook/location/Coordinates;

    return-object v0
.end method

.method public j()Z
    .locals 1

    .prologue
    .line 188
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ae;->k:Z

    return v0
.end method

.method public k()I
    .locals 1

    .prologue
    .line 192
    iget v0, p0, Lcom/facebook/orca/threadview/ae;->l:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    const/16 v2, 0x27

    .line 260
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RowReceiptItem{, readers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->a:Ljava/util/List;

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", senderOrDeliveree="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->b:Lcom/facebook/messages/model/threads/ParticipantInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->b:Lcom/facebook/messages/model/threads/ParticipantInfo;

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", messageSource=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->c:Ljava/lang/String;

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ae;->d:Lcom/facebook/orca/threadview/af;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", messageId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->e:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->e:Ljava/lang/String;

    :goto_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", offlineThreadingId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->f:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/orca/threadview/ae;->f:Ljava/lang/String;

    :goto_4
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestampMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/facebook/orca/threadview/ae;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sentTimestampMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/facebook/orca/threadview/ae;->h:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", receiptTimestampMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/facebook/orca/threadview/ae;->i:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    goto/16 :goto_0

    :cond_1
    const-string v0, ""

    goto/16 :goto_1

    :cond_2
    const-string v0, ""

    goto :goto_2

    :cond_3
    const-string v0, ""

    goto :goto_3

    :cond_4
    const-string v0, ""

    goto :goto_4
.end method
