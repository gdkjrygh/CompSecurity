.class final Lcom/roidapp/photogrid/filter/selfiecam/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Landroid/content/SharedPreferences;

.field final synthetic c:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Landroid/widget/CheckBox;Landroid/content/SharedPreferences;)V
    .locals 0

    .prologue
    .line 344
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/i;->c:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/i;->a:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/roidapp/photogrid/filter/selfiecam/i;->b:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 347
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/i;->a:Landroid/widget/CheckBox;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/i;->a:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 348
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/i;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 349
    const-string v1, "selfie_camera_edit_tip"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 351
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 352
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/i;->c:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->d(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)V

    .line 353
    return-void
.end method
