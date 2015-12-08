.class final Lcom/roidapp/photogrid/common/au;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Landroid/app/AlertDialog;

.field final synthetic c:Lcom/roidapp/photogrid/common/ap;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/roidapp/photogrid/common/au;->c:Lcom/roidapp/photogrid/common/ap;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/au;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/roidapp/photogrid/common/au;->b:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 119
    iget-object v0, p0, Lcom/roidapp/photogrid/common/au;->a:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 120
    iget-object v0, p0, Lcom/roidapp/photogrid/common/au;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/au;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "REGISTER_COUNT"

    const/4 v2, -0x3

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/common/au;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 124
    return-void
.end method
