.class final Lcom/roidapp/photogrid/filter/selfiecam/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/filter/selfiecam/v;

.field final synthetic b:Landroid/widget/PopupWindow;

.field final synthetic c:Lcom/roidapp/photogrid/filter/selfiecam/o;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/o;Lcom/roidapp/photogrid/filter/selfiecam/v;Landroid/widget/PopupWindow;)V
    .locals 0

    .prologue
    .line 254
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/s;->c:Lcom/roidapp/photogrid/filter/selfiecam/o;

    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/s;->a:Lcom/roidapp/photogrid/filter/selfiecam/v;

    iput-object p3, p0, Lcom/roidapp/photogrid/filter/selfiecam/s;->b:Landroid/widget/PopupWindow;

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
    .line 259
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/s;->a:Lcom/roidapp/photogrid/filter/selfiecam/v;

    invoke-interface {v0, p3}, Lcom/roidapp/photogrid/filter/selfiecam/v;->b(I)V

    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/s;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 261
    return-void
.end method
