.class final Lcom/roidapp/photogrid/release/js;
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
    .line 2240
    iput-object p1, p0, Lcom/roidapp/photogrid/release/js;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
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
    .line 2242
    iget-object v0, p0, Lcom/roidapp/photogrid/release/js;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0, p2}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;Landroid/view/View;)V

    .line 2243
    return-void
.end method
