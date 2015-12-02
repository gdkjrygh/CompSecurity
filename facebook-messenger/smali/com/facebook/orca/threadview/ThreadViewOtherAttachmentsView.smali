.class public Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;
.super Landroid/widget/LinearLayout;
.source "ThreadViewOtherAttachmentsView.java"


# instance fields
.field private a:Lcom/facebook/orca/attachments/a;

.field private b:Lcom/facebook/messages/model/threads/Message;

.field private c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/attachments/OtherAttachmentData;",
            ">;"
        }
    .end annotation
.end field

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 34
    const-class v1, Lcom/facebook/orca/attachments/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->a:Lcom/facebook/orca/attachments/a;

    .line 35
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->setOrientation(I)V

    .line 36
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 49
    :goto_0
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->d:I

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->c:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 50
    new-instance v0, Lcom/facebook/orca/threadview/dl;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/threadview/dl;-><init>(Landroid/content/Context;)V

    .line 51
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->d:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->addView(Landroid/view/View;I)V

    .line 52
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->d:I

    goto :goto_0

    .line 55
    :cond_0
    const/4 v0, 0x0

    .line 56
    :goto_1
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->d:I

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->c:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 57
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->a(I)V

    .line 58
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 60
    :goto_2
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->d:I

    if-ge v1, v0, :cond_1

    .line 61
    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/dl;

    .line 62
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/dl;->setVisibility(I)V

    .line 63
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    return-void

    :cond_2
    move v1, v0

    goto :goto_2
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/dl;

    .line 69
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->c:Lcom/google/common/a/es;

    invoke-virtual {v1, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/dl;->setAttachmentInfo(Lcom/facebook/orca/attachments/OtherAttachmentData;)V

    .line 70
    return-void
.end method


# virtual methods
.method public getMessage()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->b:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public setMessage(Lcom/facebook/messages/model/threads/Message;)V
    .locals 1

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->b:Lcom/facebook/messages/model/threads/Message;

    .line 44
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->a:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/attachments/a;->g(Lcom/facebook/messages/model/threads/Message;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->c:Lcom/google/common/a/es;

    .line 45
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->a()V

    .line 46
    return-void
.end method
