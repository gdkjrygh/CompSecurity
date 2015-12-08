.class final Lcom/roidapp/photogrid/release/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/EffectsList;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/EffectsList;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bc;->a:Lcom/roidapp/photogrid/release/EffectsList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 71
    if-nez p3, :cond_2

    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bc;->a:Lcom/roidapp/photogrid/release/EffectsList;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/EffectsList;->b(Lcom/roidapp/photogrid/release/EffectsList;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bc;->a:Lcom/roidapp/photogrid/release/EffectsList;

    const-string v1, "exchange"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/EffectsList;->a(Lcom/roidapp/photogrid/release/EffectsList;Ljava/lang/String;)V

    .line 82
    :cond_0
    :goto_0
    return-void

    .line 75
    :cond_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bc;->a:Lcom/roidapp/photogrid/release/EffectsList;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bc;->a:Lcom/roidapp/photogrid/release/EffectsList;

    const v2, 0x7f070209

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/EffectsList;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 77
    :cond_2
    const/4 v0, 0x1

    if-ne p3, v0, :cond_3

    .line 78
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bc;->a:Lcom/roidapp/photogrid/release/EffectsList;

    const-string v1, "move_zoom_rotate"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/EffectsList;->a(Lcom/roidapp/photogrid/release/EffectsList;Ljava/lang/String;)V

    goto :goto_0

    .line 79
    :cond_3
    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bc;->a:Lcom/roidapp/photogrid/release/EffectsList;

    const-string v1, "sketch"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/EffectsList;->a(Lcom/roidapp/photogrid/release/EffectsList;Ljava/lang/String;)V

    goto :goto_0
.end method
