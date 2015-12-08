.class final Lcom/roidapp/photogrid/release/hz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Landroid/widget/Button;

.field final synthetic b:Lcom/roidapp/photogrid/release/hx;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/hx;Landroid/widget/Button;)V
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hz;->b:Lcom/roidapp/photogrid/release/hx;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/hz;->a:Landroid/widget/Button;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 57
    const/4 v2, 0x4

    if-ne p2, v2, :cond_0

    .line 58
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hz;->b:Lcom/roidapp/photogrid/release/hx;

    iput-boolean v0, v2, Lcom/roidapp/photogrid/release/hx;->b:Z

    .line 59
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hz;->a:Landroid/widget/Button;

    invoke-virtual {v2, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 62
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method
