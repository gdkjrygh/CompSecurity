.class final Lcom/roidapp/photogrid/release/fa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ez;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ez;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fa;->a:Lcom/roidapp/photogrid/release/ez;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fa;->a:Lcom/roidapp/photogrid/release/ez;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ez;->a()V

    .line 110
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fa;->a:Lcom/roidapp/photogrid/release/ez;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ez;->a(Lcom/roidapp/photogrid/release/ez;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 112
    return-void
.end method
