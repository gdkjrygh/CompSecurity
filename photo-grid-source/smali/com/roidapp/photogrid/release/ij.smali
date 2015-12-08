.class final Lcom/roidapp/photogrid/release/ij;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ij;->b:Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ij;->a:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ij;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 218
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ij;->b:Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a(Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;)V

    .line 219
    return-void
.end method
