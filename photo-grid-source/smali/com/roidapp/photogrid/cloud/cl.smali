.class final Lcom/roidapp/photogrid/cloud/cl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/ch;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/ch;)V
    .locals 0

    .prologue
    .line 294
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cl;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 299
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cl;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 300
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "history_tag"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 301
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cl;->a:Lcom/roidapp/photogrid/cloud/ch;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/ch;->f(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/baselib/view/FlowLayout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FlowLayout;->removeAllViews()V

    .line 302
    return-void
.end method
