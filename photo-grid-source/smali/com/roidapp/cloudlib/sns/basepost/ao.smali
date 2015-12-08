.class final Lcom/roidapp/cloudlib/sns/basepost/ao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ad;

.field private b:Z


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;)V
    .locals 0

    .prologue
    .line 560
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 8

    .prologue
    const/16 v7, 0xfa

    const/4 v1, -0x1

    const/4 v6, 0x1

    .line 584
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->n(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    .line 585
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/basepost/ad;->n(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v2

    .line 586
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v3

    if-le v3, v7, :cond_1

    .line 587
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->v()Lcom/roidapp/cloudlib/sns/i;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/at;->r:I

    new-array v5, v6, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-virtual {v3, v4, v5}, Landroid/support/v4/app/FragmentActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/i;->a(Ljava/lang/String;)V

    .line 588
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->v()Lcom/roidapp/cloudlib/sns/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/i;->a()V

    .line 589
    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 590
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->n(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextKeepState(Ljava/lang/CharSequence;)V

    .line 622
    :cond_0
    :goto_0
    return-void

    .line 592
    :cond_1
    if-le v2, v6, :cond_4

    .line 593
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 595
    add-int/lit8 v0, v2, -0x1

    :goto_1
    if-ltz v0, :cond_5

    .line 596
    invoke-interface {p1, v0}, Landroid/text/Editable;->charAt(I)C

    move-result v4

    .line 597
    const/16 v5, 0x20

    if-eq v4, v5, :cond_5

    .line 599
    const/16 v5, 0x40

    if-ne v4, v5, :cond_2

    .line 600
    add-int/lit8 v0, v0, 0x1

    .line 607
    :goto_2
    if-eq v0, v1, :cond_3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v6, :cond_3

    .line 608
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;Ljava/lang/String;II)V

    goto :goto_0

    .line 603
    :cond_2
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 595
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 610
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->o(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/upload/x;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 611
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->p(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    goto :goto_0

    .line 616
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->o(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/upload/x;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 617
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->p(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_2
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 580
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .prologue
    .line 564
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 565
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->b:Z

    if-nez v0, :cond_0

    .line 566
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->m(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/aq;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 568
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->b:Z

    .line 575
    :goto_0
    return-void

    .line 570
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->b:Z

    if-eqz v0, :cond_2

    .line 571
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->m(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/aq;->m:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 573
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ao;->b:Z

    goto :goto_0
.end method
