.class Lcom/facebook/orca/compose/x;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Lcom/facebook/orca/stickers/u;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 1709
    iput-object p1, p0, Lcom/facebook/orca/compose/x;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 1712
    iget-object v0, p0, Lcom/facebook/orca/compose/x;->a:Lcom/facebook/orca/compose/ComposeFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->b(Lcom/facebook/orca/compose/ComposeFragment;Z)V

    .line 1713
    return-void
.end method

.method public a(Lcom/facebook/orca/stickers/Sticker;)V
    .locals 1

    .prologue
    .line 1717
    iget-object v0, p0, Lcom/facebook/orca/compose/x;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Lcom/facebook/orca/stickers/Sticker;)Lcom/facebook/orca/stickers/Sticker;

    .line 1718
    iget-object v0, p0, Lcom/facebook/orca/compose/x;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->I(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 1719
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 1723
    iget-object v0, p0, Lcom/facebook/orca/compose/x;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
