.class Lyong/powerfull/equalizer/VisualizerView$2;
.super Ljava/lang/Object;
.source "VisualizerView.java"

# interfaces
.implements Landroid/media/audiofx/Visualizer$OnDataCaptureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyong/powerfull/equalizer/VisualizerView;->setupVisualizerFx(I)V
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
    iput-object p1, p0, Lyong/powerfull/equalizer/VisualizerView$2;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFftDataCapture(Landroid/media/audiofx/Visualizer;[BI)V
    .locals 1
    .param p1, "visualizer"    # Landroid/media/audiofx/Visualizer;
    .param p2, "fft"    # [B
    .param p3, "samplingRate"    # I

    .prologue
    .line 118
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView$2;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    # invokes: Lyong/powerfull/equalizer/VisualizerView;->updateVisualizer([B)V
    invoke-static {v0, p2}, Lyong/powerfull/equalizer/VisualizerView;->access$4(Lyong/powerfull/equalizer/VisualizerView;[B)V

    .line 119
    return-void
.end method

.method public onWaveFormDataCapture(Landroid/media/audiofx/Visualizer;[BI)V
    .locals 1
    .param p1, "visualizer"    # Landroid/media/audiofx/Visualizer;
    .param p2, "waveform"    # [B
    .param p3, "samplingRate"    # I

    .prologue
    .line 111
    iget-object v0, p0, Lyong/powerfull/equalizer/VisualizerView$2;->this$0:Lyong/powerfull/equalizer/VisualizerView;

    # invokes: Lyong/powerfull/equalizer/VisualizerView;->updateVisualizer([B)V
    invoke-static {v0, p2}, Lyong/powerfull/equalizer/VisualizerView;->access$4(Lyong/powerfull/equalizer/VisualizerView;[B)V

    .line 112
    return-void
.end method
