.class final Lcom/roidapp/photogrid/common/av;
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
    .line 146
    iput-object p1, p0, Lcom/roidapp/photogrid/common/av;->c:Lcom/roidapp/photogrid/common/ap;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/av;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/roidapp/photogrid/common/av;->b:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 151
    const/4 v1, 0x4

    if-ne p2, v1, :cond_0

    .line 152
    iget-object v1, p0, Lcom/roidapp/photogrid/common/av;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/av;->a:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "REGISTER_COUNT"

    const/4 v2, -0x3

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 154
    iget-object v0, p0, Lcom/roidapp/photogrid/common/av;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 155
    const/4 v0, 0x1

    .line 157
    :cond_0
    return v0
.end method
