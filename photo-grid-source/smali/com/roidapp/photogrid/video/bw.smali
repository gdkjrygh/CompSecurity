.class final Lcom/roidapp/photogrid/video/bw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Landroid/content/SharedPreferences;

.field final synthetic c:Lcom/roidapp/photogrid/release/ig;

.field final synthetic d:I

.field final synthetic e:Lcom/roidapp/photogrid/video/bp;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/bp;Landroid/widget/CheckBox;Landroid/content/SharedPreferences;Lcom/roidapp/photogrid/release/ig;I)V
    .locals 0

    .prologue
    .line 405
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bw;->e:Lcom/roidapp/photogrid/video/bp;

    iput-object p2, p0, Lcom/roidapp/photogrid/video/bw;->a:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/roidapp/photogrid/video/bw;->b:Landroid/content/SharedPreferences;

    iput-object p4, p0, Lcom/roidapp/photogrid/video/bw;->c:Lcom/roidapp/photogrid/release/ig;

    iput p5, p0, Lcom/roidapp/photogrid/video/bw;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 408
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bw;->a:Landroid/widget/CheckBox;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/bw;->a:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bw;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 410
    const-string v1, "video_single_edit_tip"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 412
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 413
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bw;->e:Lcom/roidapp/photogrid/video/bp;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bw;->c:Lcom/roidapp/photogrid/release/ig;

    iget v2, p0, Lcom/roidapp/photogrid/video/bw;->d:I

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/video/bp;->a(Lcom/roidapp/photogrid/video/bp;Lcom/roidapp/photogrid/release/ig;I)V

    .line 414
    return-void
.end method
