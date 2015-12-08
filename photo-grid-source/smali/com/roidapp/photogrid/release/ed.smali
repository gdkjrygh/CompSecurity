.class final Lcom/roidapp/photogrid/release/ed;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Landroid/widget/EditText;

.field final synthetic c:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/CheckBox;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 617
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ed;->c:Lcom/roidapp/photogrid/release/dk;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ed;->a:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/ed;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/16 v3, 0xc

    const/4 v2, 0x0

    .line 620
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ed;->a:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 621
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ed;->b:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 622
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ed;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 623
    if-eqz v0, :cond_0

    const-string v1, "Directed by "

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_0

    .line 624
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ed;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v3, v0}, Landroid/widget/EditText;->setSelection(II)V

    .line 626
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ed;->c:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 627
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ed;->b:Landroid/widget/EditText;

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 634
    :goto_0
    return-void

    .line 629
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ed;->b:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 630
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ed;->b:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 631
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ed;->c:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 632
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ed;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    goto :goto_0
.end method
