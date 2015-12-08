.class final Lcom/roidapp/photogrid/release/gd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ga;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ga;)V
    .locals 0

    .prologue
    .line 193
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gd;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gd;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->a(Lcom/roidapp/photogrid/release/ga;)Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/gd;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->f(Lcom/roidapp/photogrid/release/ga;)Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gd;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->g(Lcom/roidapp/photogrid/release/ga;)V

    .line 198
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gd;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->a(Lcom/roidapp/photogrid/release/ga;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 200
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
