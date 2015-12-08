.class final Lcom/roidapp/photogrid/release/do;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;)V
    .locals 0

    .prologue
    .line 705
    iput-object p1, p0, Lcom/roidapp/photogrid/release/do;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 709
    iget-object v0, p0, Lcom/roidapp/photogrid/release/do;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "music_policy"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 710
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 711
    iget-object v0, p0, Lcom/roidapp/photogrid/release/do;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/dk;->a(Lcom/roidapp/photogrid/release/dk;Z)Z

    .line 712
    iget-object v0, p0, Lcom/roidapp/photogrid/release/do;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->l(Lcom/roidapp/photogrid/release/dk;)V

    .line 714
    return-void
.end method
