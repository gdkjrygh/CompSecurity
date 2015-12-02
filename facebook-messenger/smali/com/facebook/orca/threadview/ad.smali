.class public Lcom/facebook/orca/threadview/ad;
.super Lcom/facebook/orca/threadview/ac;
.source "RowMessageItem.java"


# instance fields
.field private final a:Lcom/facebook/messages/model/threads/Message;

.field private final b:Lcom/facebook/orca/threadview/ae;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/attachments/ImageAttachmentData;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/orca/attachments/AudioAttachmentData;

.field private e:Z

.field private f:Lcom/facebook/messages/model/threads/f;


# direct methods
.method public constructor <init>(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/f;Ljava/util/List;Lcom/facebook/orca/attachments/AudioAttachmentData;)V
    .locals 6
    .param p3    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/facebook/orca/attachments/AudioAttachmentData;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/model/threads/Message;",
            "Lcom/facebook/messages/model/threads/f;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/attachments/ImageAttachmentData;",
            ">;",
            "Lcom/facebook/orca/attachments/AudioAttachmentData;",
            ")V"
        }
    .end annotation

    .prologue
    .line 34
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/threadview/ad;-><init>(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/f;Ljava/util/List;Lcom/facebook/orca/attachments/AudioAttachmentData;Lcom/facebook/orca/threadview/ae;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/f;Ljava/util/List;Lcom/facebook/orca/attachments/AudioAttachmentData;Lcom/facebook/orca/threadview/ae;)V
    .locals 0
    .param p3    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/facebook/orca/attachments/AudioAttachmentData;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/facebook/orca/threadview/ae;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/model/threads/Message;",
            "Lcom/facebook/messages/model/threads/f;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/attachments/ImageAttachmentData;",
            ">;",
            "Lcom/facebook/orca/attachments/AudioAttachmentData;",
            "Lcom/facebook/orca/threadview/ae;",
            ")V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ac;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/orca/threadview/ad;->a:Lcom/facebook/messages/model/threads/Message;

    .line 44
    iput-object p3, p0, Lcom/facebook/orca/threadview/ad;->c:Ljava/util/List;

    .line 45
    iput-object p4, p0, Lcom/facebook/orca/threadview/ad;->d:Lcom/facebook/orca/attachments/AudioAttachmentData;

    .line 46
    iput-object p5, p0, Lcom/facebook/orca/threadview/ad;->b:Lcom/facebook/orca/threadview/ae;

    .line 47
    iput-object p2, p0, Lcom/facebook/orca/threadview/ad;->f:Lcom/facebook/messages/model/threads/f;

    .line 48
    return-void
.end method

.method private e()I
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/orca/threadview/ad;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/ImageAttachmentData;

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->g()Lcom/facebook/orca/attachments/f;

    move-result-object v0

    .line 91
    sget-object v1, Lcom/facebook/orca/attachments/f;->PORTRAIT:Lcom/facebook/orca/attachments/f;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/facebook/orca/attachments/f;->SQUARE:Lcom/facebook/orca/attachments/f;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/facebook/orca/attachments/f;->UNKNOWN:Lcom/facebook/orca/attachments/f;

    if-ne v0, v1, :cond_2

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ad;->f:Lcom/facebook/messages/model/threads/f;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/f;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x10

    .line 98
    :goto_0
    return v0

    .line 94
    :cond_1
    const/4 v0, 0x7

    goto :goto_0

    .line 98
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ad;->f:Lcom/facebook/messages/model/threads/f;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/f;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x11

    goto :goto_0

    :cond_3
    const/16 v0, 0x8

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 3

    .prologue
    const/4 v0, 0x6

    .line 60
    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 61
    const/4 v0, 0x0

    .line 81
    :cond_0
    :goto_0
    return v0

    .line 63
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->d:Lcom/facebook/orca/attachments/AudioAttachmentData;

    if-eqz v1, :cond_3

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/threadview/ad;->f:Lcom/facebook/messages/model/threads/f;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/f;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x17

    goto :goto_0

    :cond_2
    const/16 v0, 0xe

    goto :goto_0

    .line 68
    :cond_3
    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->c:Ljava/util/List;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 69
    :cond_4
    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->f:Lcom/facebook/messages/model/threads/f;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ad;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/f;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v0, 0xf

    goto :goto_0

    .line 72
    :cond_5
    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_6

    .line 73
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ad;->e()I

    move-result v0

    goto :goto_0

    .line 80
    :cond_6
    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    .line 81
    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->f:Lcom/facebook/messages/model/threads/f;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ad;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/f;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v1

    if-eqz v1, :cond_7

    add-int/lit8 v0, v0, 0x12

    goto :goto_0

    :cond_7
    add-int/lit8 v0, v0, 0x9

    goto :goto_0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 156
    iput-boolean p1, p0, Lcom/facebook/orca/threadview/ad;->e:Z

    .line 157
    return-void
.end method

.method public b()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/orca/threadview/ad;->a:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 152
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ad;->e:Z

    return v0
.end method

.method public d()Lcom/facebook/orca/threadview/ae;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/orca/threadview/ad;->b:Lcom/facebook/orca/threadview/ae;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 106
    instance-of v0, p1, Lcom/facebook/orca/threadview/ad;

    if-nez v0, :cond_0

    .line 132
    :goto_0
    return v2

    .line 109
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v5

    move-object v0, p1

    .line 110
    check-cast v0, Lcom/facebook/orca/threadview/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v6

    .line 112
    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    .line 122
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v3

    .line 123
    check-cast p1, Lcom/facebook/orca/threadview/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v4

    .line 124
    if-nez v3, :cond_1

    if-eqz v4, :cond_2

    :cond_1
    if-eqz v3, :cond_6

    if-eqz v4, :cond_6

    invoke-virtual {v3, v4}, Lcom/facebook/orca/threadview/ae;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    :cond_2
    move v3, v1

    .line 128
    :goto_2
    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v4

    if-eqz v4, :cond_4

    :cond_3
    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/common/a/es;->size()I

    move-result v4

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/common/a/es;->size()I

    move-result v7

    if-ne v4, v7, :cond_7

    :cond_4
    move v4, v1

    .line 132
    :goto_3
    if-eqz v0, :cond_8

    if-eqz v3, :cond_8

    if-eqz v4, :cond_8

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v3

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v7

    cmp-long v0, v3, v7

    if-nez v0, :cond_8

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v3

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v7

    cmp-long v0, v3, v7

    if-nez v0, :cond_8

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v3

    if-ne v0, v3, :cond_8

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v0

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v3

    if-ne v0, v3, :cond_8

    :goto_4
    move v2, v1

    goto/16 :goto_0

    .line 116
    :cond_5
    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 118
    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto/16 :goto_1

    :cond_6
    move v3, v2

    .line 124
    goto :goto_2

    :cond_7
    move v4, v2

    .line 128
    goto :goto_3

    :cond_8
    move v1, v2

    .line 132
    goto :goto_4

    :cond_9
    move v0, v2

    goto/16 :goto_1
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 144
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 145
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 148
    return v0

    :cond_1
    move v0, v1

    .line 144
    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RowMessageItem{message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ad;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rowReceiptItem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ad;->b:Lcom/facebook/orca/threadview/ae;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ad;->b:Lcom/facebook/orca/threadview/ae;

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method
