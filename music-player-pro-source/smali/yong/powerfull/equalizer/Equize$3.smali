.class Lyong/powerfull/equalizer/Equize$3;
.super Ljava/lang/Object;
.source "Equize.java"

# interfaces
.implements Lyong/powerfull/equalizer/MySeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyong/powerfull/equalizer/Equize;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lyong/powerfull/equalizer/Equize;


# direct methods
.method constructor <init>(Lyong/powerfull/equalizer/Equize;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lyong/powerfull/equalizer/Equize$3;->this$0:Lyong/powerfull/equalizer/Equize;

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Lyong/powerfull/equalizer/MySeekBar;IZ)V
    .locals 3
    .param p1, "VerticalSeekBar"    # Lyong/powerfull/equalizer/MySeekBar;
    .param p2, "progress"    # I
    .param p3, "fromUser"    # Z

    .prologue
    .line 175
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize$3;->this$0:Lyong/powerfull/equalizer/Equize;

    # getter for: Lyong/powerfull/equalizer/Equize;->audioManager:Landroid/media/AudioManager;
    invoke-static {v0}, Lyong/powerfull/equalizer/Equize;->access$0(Lyong/powerfull/equalizer/Equize;)Landroid/media/AudioManager;

    move-result-object v0

    const/4 v1, 0x3

    .line 176
    const/4 v2, 0x2

    .line 175
    invoke-virtual {v0, v1, p2, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 177
    return-void
.end method

.method public onStartTrackingTouch(Lyong/powerfull/equalizer/MySeekBar;)V
    .locals 0
    .param p1, "VerticalSeekBar"    # Lyong/powerfull/equalizer/MySeekBar;

    .prologue
    .line 170
    return-void
.end method

.method public onStopTrackingTouch(Lyong/powerfull/equalizer/MySeekBar;)V
    .locals 0
    .param p1, "VerticalSeekBar"    # Lyong/powerfull/equalizer/MySeekBar;

    .prologue
    .line 166
    return-void
.end method
