.class final Lcom/roidapp/photogrid/release/hy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/Button;

.field final synthetic b:Lcom/roidapp/photogrid/release/hx;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/hx;Landroid/widget/Button;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hy;->b:Lcom/roidapp/photogrid/release/hx;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/hy;->a:Landroid/widget/Button;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hy;->b:Lcom/roidapp/photogrid/release/hx;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/hx;->b:Z

    .line 47
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hy;->a:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 48
    return-void
.end method
