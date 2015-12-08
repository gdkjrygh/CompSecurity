.class final Lcom/roidapp/photogrid/release/pz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PickFolder;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PickFolder;)V
    .locals 0

    .prologue
    .line 277
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pz;->a:Lcom/roidapp/photogrid/release/PickFolder;

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
    .line 281
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pz;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PickFolder;->b(Lcom/roidapp/photogrid/release/PickFolder;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pz;->a:Lcom/roidapp/photogrid/release/PickFolder;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/pz;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PickFolder;->d(Lcom/roidapp/photogrid/release/PickFolder;)Landroid/widget/ArrayAdapter;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/PickFolder;->a(Lcom/roidapp/photogrid/release/PickFolder;Ljava/lang/Object;)Ljava/lang/String;

    .line 286
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pz;->a:Lcom/roidapp/photogrid/release/PickFolder;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pz;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/PickFolder;->b(Lcom/roidapp/photogrid/release/PickFolder;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/PickFolder;->b(Lcom/roidapp/photogrid/release/PickFolder;Ljava/lang/String;)V

    .line 287
    return-void

    .line 284
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pz;->a:Lcom/roidapp/photogrid/release/PickFolder;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roidapp/photogrid/release/pz;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PickFolder;->d(Lcom/roidapp/photogrid/release/PickFolder;)Landroid/widget/ArrayAdapter;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/PickFolder;->a(Lcom/roidapp/photogrid/release/PickFolder;Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_0
.end method
