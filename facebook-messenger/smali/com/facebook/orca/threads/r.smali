.class public Lcom/facebook/orca/threads/r;
.super Ljava/lang/Object;
.source "ThreadSnippetUtil.java"


# instance fields
.field a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/orca/threads/r;->a:Landroid/content/res/Resources;

    .line 23
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 26
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->z()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->z()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mms"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 28
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_4

    .line 31
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v2, :cond_2

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/threads/r;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->attachments_multiple:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 57
    :cond_1
    :goto_0
    return-object v0

    .line 38
    :cond_2
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 39
    sget-object v1, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/ui/media/attachments/g;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 41
    iget-object v0, p0, Lcom/facebook/orca/threads/r;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->attachments_single_image:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 47
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threads/r;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->attachments_single_nonimage:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 56
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->j()Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
