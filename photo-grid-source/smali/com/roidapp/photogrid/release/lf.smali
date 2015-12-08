.class final Lcom/roidapp/photogrid/release/lf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ld;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ld;)V
    .locals 0

    .prologue
    .line 281
    iput-object p1, p0, Lcom/roidapp/photogrid/release/lf;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 284
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 285
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lf;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ld;->b()V

    .line 286
    const/4 v0, 0x1

    .line 288
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
