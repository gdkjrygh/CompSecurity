.class public Lcom/facebook/orca/threadview/ReceiptItemView;
.super Lcom/facebook/widget/f;
.source "ReceiptItemView.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

.field private c:Landroid/widget/ImageView;

.field private d:Lcom/facebook/orca/threads/s;

.field private e:Lcom/facebook/orca/threads/n;

.field private f:Lcom/facebook/common/executors/a;

.field private g:Lcom/facebook/orca/k/b;

.field private h:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/orca/k/d;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/facebook/orca/common/ui/a/b;

.field private j:Lcom/facebook/location/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/orca/threadview/ReceiptItemView;

    sput-object v0, Lcom/facebook/orca/threadview/ReceiptItemView;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 45
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ReceiptItemView;->a(Landroid/content/Context;)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 50
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ReceiptItemView;->a(Landroid/content/Context;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ReceiptItemView;->a(Landroid/content/Context;)V

    .line 56
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ReceiptItemView;)Lcom/facebook/orca/common/ui/a/b;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->i:Lcom/facebook/orca/common/ui/a/b;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ReceiptItemView;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->h:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a()V
    .locals 1

    .prologue
    .line 204
    sget v0, Lcom/facebook/o;->message_sending_receipt:I

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ReceiptItemView;->setTextAndHideImage(I)V

    .line 205
    return-void
.end method

.method private a(ILjava/lang/String;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 228
    new-array v0, v2, [Ljava/lang/CharSequence;

    aput-object p2, v0, v3

    invoke-static {v0}, Lcom/facebook/common/w/n;->a([Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setText(Ljava/lang/String;)V

    .line 234
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 235
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setVisibility(I)V

    .line 236
    return-void

    .line 231
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v3

    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setText(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 59
    sget v0, Lcom/facebook/k;->orca_receipt_message_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ReceiptItemView;->setContentView(I)V

    .line 61
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 62
    const-class v0, Lcom/facebook/orca/threads/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/s;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->d:Lcom/facebook/orca/threads/s;

    .line 63
    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->f:Lcom/facebook/common/executors/a;

    .line 64
    const-class v0, Lcom/facebook/orca/threads/n;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/n;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->e:Lcom/facebook/orca/threads/n;

    .line 65
    const-class v0, Lcom/facebook/orca/k/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/k/b;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->g:Lcom/facebook/orca/k/b;

    .line 67
    const-class v0, Lcom/facebook/orca/common/ui/a/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/a/b;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->i:Lcom/facebook/orca/common/ui/a/b;

    .line 68
    const-class v0, Lcom/facebook/location/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/location/c;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->j:Lcom/facebook/location/c;

    .line 70
    sget v0, Lcom/facebook/i;->receipt_icon:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    .line 71
    sget v0, Lcom/facebook/i;->receipt_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    .line 72
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ReceiptItemView;)Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    return-object v0
.end method

.method private b()V
    .locals 1

    .prologue
    .line 208
    sget v0, Lcom/facebook/o;->send_failed_error:I

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ReceiptItemView;->setTextAndHideImage(I)V

    .line 209
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/threadview/ReceiptItemView;)Lcom/facebook/location/c;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->j:Lcom/facebook/location/c;

    return-object v0
.end method

.method private setDeliveredReceipt(Lcom/facebook/orca/threadview/ae;)V
    .locals 4

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    new-instance v1, Lcom/facebook/orca/common/ui/widgets/text/e;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->message_delivered_receipt:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/orca/common/ui/widgets/text/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setData(Ljava/lang/Object;)V

    .line 167
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->d:Lcom/facebook/orca/threads/s;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/threads/s;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 173
    :goto_0
    return-void

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private setGroupReadReceipt(Lcom/facebook/orca/threadview/ae;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 176
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_receipt_checkmark_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 178
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 179
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->j()Z

    move-result v1

    if-nez v1, :cond_0

    .line 180
    add-int/lit8 v0, v0, 0x1

    .line 182
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v1, v0, :cond_2

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->k()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v7, :cond_2

    .line 185
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    .line 186
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1e

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 187
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b()J

    move-result-wide v2

    .line 189
    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    .line 190
    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->e:Lcom/facebook/orca/threads/n;

    invoke-virtual {v4, v2, v3}, Lcom/facebook/orca/threads/n;->c(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    new-instance v2, Lcom/facebook/orca/common/ui/widgets/text/e;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/facebook/o;->message_seen_receipt_group_single:I

    new-array v5, v7, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v6

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/facebook/orca/common/ui/widgets/text/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setData(Ljava/lang/Object;)V

    .line 201
    :goto_0
    return-void

    .line 195
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v1, v0, :cond_3

    .line 196
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    new-instance v1, Lcom/facebook/orca/common/ui/widgets/text/e;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->message_seen_receipt_group_everyone:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/orca/common/ui/widgets/text/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setData(Ljava/lang/Object;)V

    goto :goto_0

    .line 199
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    new-instance v1, Lcom/facebook/orca/common/ui/widgets/text/e;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/orca/common/ui/widgets/text/e;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setData(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private setReadReceipt(Lcom/facebook/orca/threadview/ae;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_receipt_checkmark_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 154
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->h()J

    move-result-wide v1

    .line 155
    const-string v0, ""

    .line 156
    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_0

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->e:Lcom/facebook/orca/threads/n;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/threads/n;->c(J)Ljava/lang/String;

    move-result-object v0

    .line 159
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    new-instance v2, Lcom/facebook/orca/common/ui/widgets/text/e;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lcom/facebook/o;->message_seen_receipt:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v6

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/facebook/orca/common/ui/widgets/text/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setData(Ljava/lang/Object;)V

    .line 161
    return-void
.end method

.method private setSentReceipt(Lcom/facebook/orca/threadview/ae;)V
    .locals 5

    .prologue
    .line 106
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->i()Lcom/facebook/location/Coordinates;

    move-result-object v1

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->c:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 108
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    new-instance v2, Lcom/facebook/orca/common/ui/widgets/text/e;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->d:Lcom/facebook/orca/threads/s;

    const-string v4, "chat"

    invoke-virtual {v3, v4}, Lcom/facebook/orca/threads/s;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/facebook/orca/common/ui/widgets/text/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setData(Ljava/lang/Object;)V

    .line 123
    :goto_0
    if-nez v1, :cond_3

    .line 149
    :goto_1
    return-void

    .line 113
    :cond_0
    const/4 v0, 0x0

    .line 114
    if-eqz v1, :cond_1

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->j:Lcom/facebook/location/c;

    invoke-virtual {v0, v1}, Lcom/facebook/location/c;->c(Lcom/facebook/location/Coordinates;)Ljava/lang/String;

    move-result-object v0

    .line 117
    :cond_1
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->d:Lcom/facebook/orca/threads/s;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threads/s;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 120
    :cond_2
    iget-object v2, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->b:Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;

    new-instance v3, Lcom/facebook/orca/common/ui/widgets/text/e;

    invoke-direct {v3, v0}, Lcom/facebook/orca/common/ui/widgets/text/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/facebook/orca/common/ui/widgets/text/RowReceiptTextView;->setData(Ljava/lang/Object;)V

    goto :goto_0

    .line 127
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->g:Lcom/facebook/orca/k/b;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/k/b;->a(Lcom/facebook/location/Coordinates;)Lcom/google/common/d/a/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->h:Lcom/google/common/d/a/s;

    .line 128
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->f:Lcom/facebook/common/executors/a;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->h:Lcom/google/common/d/a/s;

    new-instance v3, Lcom/facebook/orca/threadview/aa;

    invoke-direct {v3, p0, v1}, Lcom/facebook/orca/threadview/aa;-><init>(Lcom/facebook/orca/threadview/ReceiptItemView;Lcom/facebook/location/Coordinates;)V

    invoke-interface {v0, v2, v3}, Lcom/facebook/common/executors/a;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_1
.end method

.method private setSentToServerReceipt(Lcom/facebook/orca/threadview/ae;)V
    .locals 5

    .prologue
    .line 212
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->g()J

    move-result-wide v1

    .line 213
    const-string v0, ""

    .line 215
    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_0

    .line 216
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->e:Lcom/facebook/orca/threads/n;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/threads/n;->c(J)Ljava/lang/String;

    move-result-object v0

    .line 219
    :cond_0
    sget v1, Lcom/facebook/o;->message_sent_receipt:I

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/threadview/ReceiptItemView;->a(ILjava/lang/String;)V

    .line 220
    return-void
.end method

.method private setTextAndHideImage(I)V
    .locals 1

    .prologue
    .line 223
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadview/ReceiptItemView;->a(ILjava/lang/String;)V

    .line 224
    return-void
.end method


# virtual methods
.method public setRowReceiptItem(Lcom/facebook/orca/threadview/ae;)V
    .locals 2

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->h:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->h:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ReceiptItemView;->h:Lcom/google/common/d/a/s;

    .line 79
    :cond_0
    sget-object v0, Lcom/facebook/orca/threadview/ab;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/af;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 103
    :goto_0
    return-void

    .line 82
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ReceiptItemView;->setSentReceipt(Lcom/facebook/orca/threadview/ae;)V

    goto :goto_0

    .line 85
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ReceiptItemView;->setReadReceipt(Lcom/facebook/orca/threadview/ae;)V

    goto :goto_0

    .line 88
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ReceiptItemView;->setDeliveredReceipt(Lcom/facebook/orca/threadview/ae;)V

    goto :goto_0

    .line 92
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ReceiptItemView;->setGroupReadReceipt(Lcom/facebook/orca/threadview/ae;)V

    goto :goto_0

    .line 95
    :pswitch_4
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ReceiptItemView;->a()V

    goto :goto_0

    .line 98
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ReceiptItemView;->setSentToServerReceipt(Lcom/facebook/orca/threadview/ae;)V

    goto :goto_0

    .line 101
    :pswitch_6
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ReceiptItemView;->b()V

    goto :goto_0

    .line 79
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
