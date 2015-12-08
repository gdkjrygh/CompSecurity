.class public Lyong/powerfull/equalizer/Equize$Audiachange;
.super Landroid/content/BroadcastReceiver;
.source "Equize.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyong/powerfull/equalizer/Equize;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Audiachange"
.end annotation


# instance fields
.field final synthetic this$0:Lyong/powerfull/equalizer/Equize;


# direct methods
.method public constructor <init>(Lyong/powerfull/equalizer/Equize;)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lyong/powerfull/equalizer/Equize$Audiachange;->this$0:Lyong/powerfull/equalizer/Equize;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 290
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize$Audiachange;->this$0:Lyong/powerfull/equalizer/Equize;

    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$Audiachange;->this$0:Lyong/powerfull/equalizer/Equize;

    # getter for: Lyong/powerfull/equalizer/Equize;->audioManager:Landroid/media/AudioManager;
    invoke-static {v1}, Lyong/powerfull/equalizer/Equize;->access$0(Lyong/powerfull/equalizer/Equize;)Landroid/media/AudioManager;

    move-result-object v1

    .line 291
    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v1

    .line 290
    invoke-static {v0, v1}, Lyong/powerfull/equalizer/Equize;->access$1(Lyong/powerfull/equalizer/Equize;I)V

    .line 292
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize$Audiachange;->this$0:Lyong/powerfull/equalizer/Equize;

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->bar1:Lyong/powerfull/equalizer/MySeekBar;

    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$Audiachange;->this$0:Lyong/powerfull/equalizer/Equize;

    # getter for: Lyong/powerfull/equalizer/Equize;->currentVolume:I
    invoke-static {v1}, Lyong/powerfull/equalizer/Equize;->access$2(Lyong/powerfull/equalizer/Equize;)I

    move-result v1

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/MySeekBar;->setProgress(I)V

    .line 293
    return-void
.end method
