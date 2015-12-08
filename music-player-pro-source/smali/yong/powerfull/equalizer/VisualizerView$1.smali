.class Lyong/powerfull/equalizer/VisualizerView$1;
.super Ljava/lang/Object;
.source "VisualizerView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyong/powerfull/equalizer/VisualizerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lyong/powerfull/equalizer/VisualizerView;


# direct methods
.method constructor <init>(Lyong/powerfull/equalizer/VisualizerView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lyong/powerfull/equalizer/VisualizerView$1;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 204
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView$1;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    invoke-virtual {v0}, Lyong/powerfull/equalizer/VisualizerView;->invalidate()V

    .line 205
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView$1;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    # getter for: Lyong/powerfull/equalizer/VisualizerView;->times:I
    invoke-static {v0}, Lyong/powerfull/equalizer/VisualizerView;->access$0(Lyong/powerfull/equalizer/VisualizerView;)I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    .line 206
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView$1;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    # getter for: Lyong/powerfull/equalizer/VisualizerView;->times:I
    invoke-static {v0}, Lyong/powerfull/equalizer/VisualizerView;->access$0(Lyong/powerfull/equalizer/VisualizerView;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 207
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView$1;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    # invokes: Lyong/powerfull/equalizer/VisualizerView;->initByte()V
    invoke-static {v0}, Lyong/powerfull/equalizer/VisualizerView;->access$1(Lyong/powerfull/equalizer/VisualizerView;)V

    .line 209
    :cond_0
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView$1;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    # getter for: Lyong/powerfull/equalizer/VisualizerView;->mHandler:Landroid/os/Handler;
    invoke-static {v0}, Lyong/powerfull/equalizer/VisualizerView;->access$2(Lyong/powerfull/equalizer/VisualizerView;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x64

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 211
    :cond_1
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView$1;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    # getter for: Lyong/powerfull/equalizer/VisualizerView;->times:I
    invoke-static {v0}, Lyong/powerfull/equalizer/VisualizerView;->access$0(Lyong/powerfull/equalizer/VisualizerView;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lyong/powerfull/equalizer/VisualizerView;->access$3(Lyong/powerfull/equalizer/VisualizerView;I)V

    .line 212
    return-void
.end method
