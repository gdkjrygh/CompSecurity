.class final Lcom/roidapp/photogrid/release/ds;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Landroid/content/SharedPreferences;

.field final synthetic c:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/CheckBox;Landroid/content/SharedPreferences;)V
    .locals 0

    .prologue
    .line 757
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ds;->c:Lcom/roidapp/photogrid/release/dk;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ds;->a:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/ds;->b:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 760
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ds;->a:Landroid/widget/CheckBox;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ds;->a:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 761
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ds;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 762
    const-string v1, "video_single_edit_tip"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 764
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 765
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ds;->c:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->h(Lcom/roidapp/photogrid/release/dk;)V

    .line 766
    return-void
.end method
