.class final Lcom/roidapp/photogrid/release/dm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Landroid/app/AlertDialog;

.field final synthetic c:Landroid/widget/EditText;

.field final synthetic d:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/TextView;Landroid/app/AlertDialog;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 672
    iput-object p1, p0, Lcom/roidapp/photogrid/release/dm;->d:Lcom/roidapp/photogrid/release/dk;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/dm;->a:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/dm;->b:Landroid/app/AlertDialog;

    iput-object p4, p0, Lcom/roidapp/photogrid/release/dm;->c:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .prologue
    .line 690
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dm;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dm;->c:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    rsub-int v1, v1, 0x8c

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 691
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 675
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/16 v1, 0x8c

    .line 679
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-le v0, v1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/2addr v0, p3

    sub-int/2addr v0, p4

    if-gt v0, v1, :cond_1

    .line 680
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dm;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dm;->d:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c008b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 681
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dm;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 686
    :cond_0
    :goto_0
    return-void

    .line 682
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt v0, v1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/2addr v0, p3

    sub-int/2addr v0, p4

    if-le v0, v1, :cond_0

    .line 683
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dm;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dm;->d:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00cf

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 684
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dm;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0
.end method
