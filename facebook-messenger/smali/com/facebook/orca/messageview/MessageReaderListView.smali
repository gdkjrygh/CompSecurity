.class public Lcom/facebook/orca/messageview/MessageReaderListView;
.super Lcom/facebook/widget/f;
.source "MessageReaderListView.java"


# instance fields
.field private a:Lcom/facebook/orca/threads/n;

.field private b:Lcom/facebook/orca/messageview/ReadView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Lcom/facebook/orca/messageview/ReadView;

.field private e:Lcom/facebook/orca/messageview/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 81
    invoke-direct {p0, p1}, Lcom/facebook/orca/messageview/MessageReaderListView;->a(Landroid/content/Context;)V

    .line 82
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 86
    invoke-direct {p0, p1}, Lcom/facebook/orca/messageview/MessageReaderListView;->a(Landroid/content/Context;)V

    .line 87
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 91
    invoke-direct {p0, p1}, Lcom/facebook/orca/messageview/MessageReaderListView;->a(Landroid/content/Context;)V

    .line 92
    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/RowReceiptParticipant;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 216
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    const-string v1, " \u00b7 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->a:Lcom/facebook/orca/threads/n;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/facebook/orca/threads/n;->c(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 122
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 124
    :goto_0
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v2}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v2}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    .line 126
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/messageview/ReadView;->setVisibility(I)V

    .line 128
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v1}, Lcom/facebook/orca/messageview/a;->c()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v1, v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 130
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/o;->message_seen_receipt_group_everyone:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/ReadView;->setText(Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/ReadView;->setShowReadReceiptIcon(Z)V

    .line 145
    :cond_0
    :goto_2
    return-void

    :cond_1
    move v0, v1

    .line 122
    goto :goto_0

    :cond_2
    move v2, v1

    .line 124
    goto :goto_1

    .line 137
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->b(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 138
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->b()V

    .line 142
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->b(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->c()V

    goto :goto_2
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 95
    sget v0, Lcom/facebook/k;->orca_message_reader_list:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->setContentView(I)V

    .line 97
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 98
    const-class v1, Lcom/facebook/orca/threads/n;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/n;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->a:Lcom/facebook/orca/threads/n;

    .line 100
    sget v0, Lcom/facebook/i;->message_read_header:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/messageview/ReadView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    .line 101
    sget v0, Lcom/facebook/i;->message_read_timestamp:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->c:Landroid/widget/LinearLayout;

    .line 102
    sget v0, Lcom/facebook/i;->message_read_without_timestamp:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/messageview/ReadView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->d:Lcom/facebook/orca/messageview/ReadView;

    .line 103
    return-void
.end method

.method private a(Ljava/util/List;)Z
    .locals 1

    .prologue
    .line 228
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/util/List;Ljava/util/List;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 224
    invoke-direct {p0, p1}, Lcom/facebook/orca/messageview/MessageReaderListView;->a(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/o;->message_seen_receipt_group_header:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/ReadView;->setText(Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/messageview/ReadView;->setShowReadReceiptIcon(Z)V

    .line 150
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v1}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/messageview/MessageReaderListView;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->message_seen_receipt_group_single:I

    new-array v4, v6, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->a(Lcom/facebook/orca/threadview/RowReceiptParticipant;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/messageview/ReadView;->setText(Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v0, v6}, Lcom/facebook/orca/messageview/ReadView;->setShowReadReceiptIcon(Z)V

    .line 165
    :goto_0
    return-void

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    .line 160
    new-instance v2, Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/facebook/orca/messageview/ReadView;-><init>(Landroid/content/Context;)V

    .line 161
    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->a(Lcom/facebook/orca/threadview/RowReceiptParticipant;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/messageview/ReadView;->setText(Ljava/lang/String;)V

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method private b(Ljava/util/List;)Z
    .locals 1

    .prologue
    .line 232
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 169
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/ReadView;->setVisibility(I)V

    .line 211
    :cond_0
    :goto_0
    return-void

    .line 175
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v1}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/messageview/MessageReaderListView;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/facebook/o;->message_seen_receipt_group_single:I

    new-array v6, v2, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v3

    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/messageview/ReadView;->setText(Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/messageview/ReadView;->setShowReadReceiptIcon(Z)V

    goto :goto_0

    .line 184
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x32

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 186
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v2

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 188
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v6

    iget-object v7, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v7}, Lcom/facebook/orca/messageview/a;->d()Lcom/facebook/messages/model/threads/Message;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 193
    if-nez v1, :cond_4

    .line 194
    const-string v6, ", "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    :goto_2
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    move v1, v3

    .line 196
    goto :goto_2

    .line 201
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->b(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 202
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/messageview/ReadView;->setShowReadReceiptIcon(Z)V

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->d:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/ReadView;->setText(Ljava/lang/String;)V

    .line 204
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->d:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/messageview/ReadView;->setVisibility(I)V

    goto/16 :goto_0

    .line 206
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v5, Lcom/facebook/o;->message_seen_receipt_group_multiple:I

    new-array v6, v2, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v6, v3

    invoke-virtual {v1, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/ReadView;->setText(Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/messageview/ReadView;->setShowReadReceiptIcon(Z)V

    goto/16 :goto_0
.end method

.method private d()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 236
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    iget-object v3, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    invoke-virtual {v3}, Lcom/facebook/orca/messageview/a;->d()Lcom/facebook/messages/model/threads/Message;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    move v0, v2

    goto :goto_0
.end method


# virtual methods
.method public setParameters(Lcom/facebook/orca/messageview/a;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 107
    const-string v0, "Message cannot be null"

    invoke-virtual {p1}, Lcom/facebook/orca/messageview/a;->d()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    const-string v0, "ThreadSummary cannot be null"

    invoke-virtual {p1}, Lcom/facebook/orca/messageview/a;->c()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->b:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/messageview/ReadView;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->d:Lcom/facebook/orca/messageview/ReadView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/messageview/ReadView;->setVisibility(I)V

    .line 113
    invoke-virtual {p1}, Lcom/facebook/orca/messageview/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/orca/messageview/a;->b()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->b(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/messageview/MessageReaderListView;->e:Lcom/facebook/orca/messageview/a;

    .line 116
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageReaderListView;->a()V

    .line 118
    :cond_1
    return-void
.end method
