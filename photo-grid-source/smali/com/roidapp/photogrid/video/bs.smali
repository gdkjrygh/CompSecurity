.class final Lcom/roidapp/photogrid/video/bs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/content/SharedPreferences;

.field final synthetic b:Landroid/widget/CheckBox;

.field final synthetic c:Lcom/roidapp/photogrid/video/bp;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/bp;Landroid/content/SharedPreferences;Landroid/widget/CheckBox;)V
    .locals 0

    .prologue
    .line 366
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bs;->c:Lcom/roidapp/photogrid/video/bp;

    iput-object p2, p0, Lcom/roidapp/photogrid/video/bs;->a:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lcom/roidapp/photogrid/video/bs;->b:Landroid/widget/CheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 369
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bs;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 370
    const-string v2, "video_exit_tip"

    iget-object v0, p0, Lcom/roidapp/photogrid/video/bs;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 371
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 372
    return-void

    .line 370
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
