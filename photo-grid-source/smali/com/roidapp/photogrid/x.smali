.class final Lcom/roidapp/photogrid/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 1455
    iput-object p1, p0, Lcom/roidapp/photogrid/x;->b:Lcom/roidapp/photogrid/MainPage;

    iput-object p2, p0, Lcom/roidapp/photogrid/x;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 1459
    iget-object v0, p0, Lcom/roidapp/photogrid/x;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0, v1, v1}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V

    .line 1461
    iget-object v0, p0, Lcom/roidapp/photogrid/x;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "hideVideo"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1462
    iget-object v0, p0, Lcom/roidapp/photogrid/x;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 1463
    return-void
.end method
