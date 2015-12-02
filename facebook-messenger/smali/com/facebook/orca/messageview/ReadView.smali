.class public Lcom/facebook/orca/messageview/ReadView;
.super Lcom/facebook/widget/f;
.source "ReadView.java"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/orca/messageview/ReadView;->a(Landroid/content/Context;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    invoke-direct {p0, p1}, Lcom/facebook/orca/messageview/ReadView;->a(Landroid/content/Context;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/orca/messageview/ReadView;->a(Landroid/content/Context;)V

    .line 35
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 38
    sget v0, Lcom/facebook/k;->orca_message_read_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/ReadView;->setContentView(I)V

    .line 39
    sget v0, Lcom/facebook/i;->receipt_icon:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/ReadView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/ReadView;->b:Landroid/widget/ImageView;

    .line 40
    sget v0, Lcom/facebook/i;->receipt_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/messageview/ReadView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/ReadView;->a:Landroid/widget/TextView;

    .line 41
    return-void
.end method


# virtual methods
.method public setShowReadReceiptIcon(Z)V
    .locals 2

    .prologue
    .line 48
    iget-object v1, p0, Lcom/facebook/orca/messageview/ReadView;->b:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 49
    return-void

    .line 48
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/orca/messageview/ReadView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    return-void
.end method
