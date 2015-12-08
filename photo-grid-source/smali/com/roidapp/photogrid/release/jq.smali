.class final Lcom/roidapp/photogrid/release/jq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 0

    .prologue
    .line 1960
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jq;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
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
    .line 1965
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ib;

    .line 1966
    iget-object v0, v0, Lcom/roidapp/photogrid/release/ib;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/GridImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1967
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jq;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;)V

    .line 1968
    return-void
.end method
