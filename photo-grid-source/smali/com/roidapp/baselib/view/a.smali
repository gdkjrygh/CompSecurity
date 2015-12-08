.class final Lcom/roidapp/baselib/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/view/DraggableGridView;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/view/DraggableGridView;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/roidapp/baselib/view/a;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 117
    iget-object v0, p0, Lcom/roidapp/baselib/view/a;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->a(Lcom/roidapp/baselib/view/DraggableGridView;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/a;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/a;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/roidapp/baselib/view/a;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->b(Lcom/roidapp/baselib/view/DraggableGridView;)Z

    .line 119
    iget-object v0, p0, Lcom/roidapp/baselib/view/a;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->c(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/os/Vibrator;

    move-result-object v0

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v2, v3}, Landroid/os/Vibrator;->vibrate(J)V

    .line 122
    iget-object v0, p0, Lcom/roidapp/baselib/view/a;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 123
    const/4 v1, 0x1

    new-array v1, v1, [I

    aput v4, v1, v4

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 124
    iget-object v0, p0, Lcom/roidapp/baselib/view/a;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->invalidate()V

    .line 125
    iget-object v0, p0, Lcom/roidapp/baselib/view/a;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->d(Lcom/roidapp/baselib/view/DraggableGridView;)V

    .line 127
    :cond_0
    return-void
.end method
