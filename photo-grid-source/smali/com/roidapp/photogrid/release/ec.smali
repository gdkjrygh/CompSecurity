.class final Lcom/roidapp/photogrid/release/ec;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 602
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ec;->b:Lcom/roidapp/photogrid/release/dk;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ec;->a:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 607
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ec;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 608
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ec;->b:Lcom/roidapp/photogrid/release/dk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dk;->b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 609
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ec;->a:Landroid/widget/EditText;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 611
    :cond_0
    return-void
.end method
