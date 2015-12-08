.class final Lcom/roidapp/photogrid/release/ci;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/cg;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cg;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    if-nez v0, :cond_0

    .line 81
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/release/ih;->x(I)V

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0, p2}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;I)I

    .line 83
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;Z)Z

    .line 85
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cg;->b(Lcom/roidapp/photogrid/release/cg;)I

    move-result v1

    div-int/lit8 v1, v1, 0x5

    add-int/lit8 v1, v1, 0x5

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ng;->c(IZ)V

    .line 87
    :cond_1
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cg;->c(Lcom/roidapp/photogrid/release/cg;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f020365

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 92
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 96
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cg;->d(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ci;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cg;->b(Lcom/roidapp/photogrid/release/cg;)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IZ)V

    .line 99
    :cond_0
    return-void
.end method
