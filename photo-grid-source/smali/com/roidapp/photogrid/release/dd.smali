.class final Lcom/roidapp/photogrid/release/dd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dc;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dc;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/roidapp/photogrid/release/dd;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dd;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dc;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    :goto_0
    return-void

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dd;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dc;->a(Lcom/roidapp/photogrid/release/dc;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 96
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dd;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dc;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 98
    const-string v1, "SHOW_NEW_GRID"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 99
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "SHOW_NEW_GRID"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 100
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dd;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dc;->b(Lcom/roidapp/photogrid/release/dc;)V

    goto :goto_0

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dd;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dc;->c(Lcom/roidapp/photogrid/release/dc;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dc;->a(Landroid/view/View;)V

    goto :goto_0
.end method
