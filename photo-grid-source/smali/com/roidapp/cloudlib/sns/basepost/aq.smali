.class final Lcom/roidapp/cloudlib/sns/basepost/aq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/upload/ab;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;)V
    .locals 0

    .prologue
    .line 682
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 727
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;Z)Z

    .line 729
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->o(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/upload/x;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->o(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/upload/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/x;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 738
    :cond_0
    :goto_0
    return-void

    .line 732
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->r(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/au;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->s(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/au;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/au;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->r(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/au;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/au;->a:Ljava/lang/String;

    if-eq v0, v1, :cond_0

    .line 733
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;Z)Z

    .line 734
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->o(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/upload/x;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->r(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/au;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/basepost/au;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/upload/x;->a(Ljava/lang/String;)V

    .line 735
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->r(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/au;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;Lcom/roidapp/cloudlib/sns/basepost/au;)Lcom/roidapp/cloudlib/sns/basepost/au;

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v1, -0x1

    .line 687
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->n(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionStart()I

    .line 688
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->n(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v2

    .line 690
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->n(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v3

    .line 692
    const/4 v0, 0x1

    if-le v2, v0, :cond_3

    .line 693
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 695
    add-int/lit8 v0, v2, -0x1

    :goto_0
    if-ltz v0, :cond_4

    .line 696
    invoke-interface {v3, v0}, Landroid/text/Editable;->charAt(I)C

    move-result v5

    .line 697
    const/16 v6, 0x20

    if-eq v5, v6, :cond_4

    .line 699
    const/16 v6, 0x40

    if-ne v5, v6, :cond_1

    .line 700
    add-int/lit8 v0, v0, 0x1

    .line 707
    :goto_1
    if-eq v0, v1, :cond_2

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_2

    .line 708
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v2, v1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 717
    :goto_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;Z)Z

    .line 719
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->o(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/upload/x;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 720
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aq;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->p(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 723
    :cond_0
    return-void

    .line 703
    :cond_1
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 695
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 710
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v2, v0}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    goto :goto_2

    .line 714
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v2, v0}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_1
.end method
