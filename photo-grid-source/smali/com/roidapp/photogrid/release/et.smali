.class final Lcom/roidapp/photogrid/release/et;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/el;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/el;)V
    .locals 0

    .prologue
    .line 304
    iput-object p1, p0, Lcom/roidapp/photogrid/release/et;->a:Lcom/roidapp/photogrid/release/el;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 308
    iget-object v0, p0, Lcom/roidapp/photogrid/release/et;->a:Lcom/roidapp/photogrid/release/el;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/el;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 309
    if-nez v0, :cond_0

    .line 315
    :goto_0
    return-void

    .line 310
    :cond_0
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "music_policy"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 311
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 312
    iget-object v0, p0, Lcom/roidapp/photogrid/release/et;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->m(Lcom/roidapp/photogrid/release/el;)Z

    .line 313
    iget-object v0, p0, Lcom/roidapp/photogrid/release/et;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->l(Lcom/roidapp/photogrid/release/el;)V

    goto :goto_0
.end method
