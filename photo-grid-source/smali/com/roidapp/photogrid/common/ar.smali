.class final Lcom/roidapp/photogrid/common/ar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Landroid/app/AlertDialog;

.field final synthetic c:Lcom/roidapp/photogrid/common/ap;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/roidapp/photogrid/common/ar;->c:Lcom/roidapp/photogrid/common/ap;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/ar;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/roidapp/photogrid/common/ar;->b:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 73
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ar;->a:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 75
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ar;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/ar;->a:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "REGISTER_COUNT"

    const/4 v2, -0x3

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ar;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 78
    const/4 v0, 0x1

    .line 80
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method
