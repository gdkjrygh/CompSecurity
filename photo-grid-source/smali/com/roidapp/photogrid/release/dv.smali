.class final Lcom/roidapp/photogrid/release/dv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 856
    iput-object p1, p0, Lcom/roidapp/photogrid/release/dv;->b:Lcom/roidapp/photogrid/release/dk;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/dv;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 860
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dv;->a:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 861
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dv;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 863
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dv;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/dv;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/dv;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dk;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 873
    :cond_1
    :goto_0
    return-void

    .line 866
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dv;->b:Lcom/roidapp/photogrid/release/dk;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dv;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "music_policy"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;Z)Z

    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dv;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->n(Lcom/roidapp/photogrid/release/dk;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 868
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dv;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->o(Lcom/roidapp/photogrid/release/dk;)V

    goto :goto_0

    .line 870
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dv;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->l(Lcom/roidapp/photogrid/release/dk;)V

    goto :goto_0
.end method
