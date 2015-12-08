.class final Lcom/roidapp/photogrid/release/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/c;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/c;)V
    .locals 0

    .prologue
    .line 254
    iput-object p1, p0, Lcom/roidapp/photogrid/release/i;->a:Lcom/roidapp/photogrid/release/c;

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
    .line 258
    iget-object v0, p0, Lcom/roidapp/photogrid/release/i;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0, p3}, Lcom/roidapp/photogrid/release/c;->a(Lcom/roidapp/photogrid/release/c;I)I

    .line 259
    iget-object v1, p0, Lcom/roidapp/photogrid/release/i;->a:Lcom/roidapp/photogrid/release/c;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/i;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->h(Lcom/roidapp/photogrid/release/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 1126
    iget-object v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 259
    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/c;->b(Lcom/roidapp/photogrid/release/c;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    iget-object v0, p0, Lcom/roidapp/photogrid/release/i;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->c(Lcom/roidapp/photogrid/release/c;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/i;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/c;->b(Lcom/roidapp/photogrid/release/c;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    .line 262
    return-void
.end method
