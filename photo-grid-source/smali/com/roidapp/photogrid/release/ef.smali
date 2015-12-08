.class final Lcom/roidapp/photogrid/release/ef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Landroid/widget/EditText;

.field final synthetic c:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/CheckBox;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 640
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ef;->c:Lcom/roidapp/photogrid/release/dk;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ef;->a:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/ef;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 643
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ef;->c:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 644
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ef;->a:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ef;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 645
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ef;->c:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->f(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ef;->b:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ng;->a(Ljava/lang/String;)V

    .line 646
    const-string v1, "sign_text"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ef;->b:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 650
    :goto_0
    const-string v1, "show_sign"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ef;->a:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 651
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 652
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 653
    return-void

    .line 648
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ef;->c:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->f(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ng;->r()V

    goto :goto_0
.end method
