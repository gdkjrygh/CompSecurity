.class Lyong/powerfull/equalizer/Equize$4;
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

.field private final synthetic val$equizeBar:[Lyong/powerfull/equalizer/MySeekBar;


# direct methods
.method constructor <init>(Lyong/powerfull/equalizer/Equize;[Lyong/powerfull/equalizer/MySeekBar;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lyong/powerfull/equalizer/Equize$4;->this$0:Lyong/powerfull/equalizer/Equize;

    iput-object p2, p0, Lyong/powerfull/equalizer/Equize$4;->val$equizeBar:[Lyong/powerfull/equalizer/MySeekBar;

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Lyong/powerfull/equalizer/MySeekBar;IZ)V
    .locals 4
    .param p1, "VerticalSeekBar"    # Lyong/powerfull/equalizer/MySeekBar;
    .param p2, "val"    # I
    .param p3, "fromUser"    # Z

    .prologue
    .line 198
    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$4;->this$0:Lyong/powerfull/equalizer/Equize;

    # getter for: Lyong/powerfull/equalizer/Equize;->eqService:Lcom/arist/service/MusicPlayService;
    invoke-static {v1}, Lyong/powerfull/equalizer/Equize;->access$3(Lyong/powerfull/equalizer/Equize;)Lcom/arist/service/MusicPlayService;

    move-result-object v1

    iget-object v1, v1, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;

    if-eqz v1, :cond_0

    .line 199
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x5

    if-lt v0, v1, :cond_2

    .line 209
    .end local v0    # "i":I
    :cond_0
    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$4;->this$0:Lyong/powerfull/equalizer/Equize;

    iget-boolean v1, v1, Lyong/powerfull/equalizer/Equize;->choose:Z

    if-nez v1, :cond_1

    .line 210
    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$4;->this$0:Lyong/powerfull/equalizer/Equize;

    # getter for: Lyong/powerfull/equalizer/Equize;->equzechoosebtn:Landroid/widget/Button;
    invoke-static {v1}, Lyong/powerfull/equalizer/Equize;->access$4(Lyong/powerfull/equalizer/Equize;)Landroid/widget/Button;

    move-result-object v1

    const v2, 0x7f08009a

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(I)V

    .line 212
    :cond_1
    return-void

    .line 200
    .restart local v0    # "i":I
    :cond_2
    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$4;->val$equizeBar:[Lyong/powerfull/equalizer/MySeekBar;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 201
    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$4;->this$0:Lyong/powerfull/equalizer/Equize;

    # getter for: Lyong/powerfull/equalizer/Equize;->eqService:Lcom/arist/service/MusicPlayService;
    invoke-static {v1}, Lyong/powerfull/equalizer/Equize;->access$3(Lyong/powerfull/equalizer/Equize;)Lcom/arist/service/MusicPlayService;

    move-result-object v1

    iget-object v1, v1, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;

    .line 202
    int-to-short v2, v0

    .line 203
    iget-object v3, p0, Lyong/powerfull/equalizer/Equize$4;->this$0:Lyong/powerfull/equalizer/Equize;

    iget-short v3, v3, Lyong/powerfull/equalizer/Equize;->maxEQLevel:S

    sub-int v3, p2, v3

    int-to-short v3, v3

    .line 201
    invoke-virtual {v1, v2, v3}, Lyong/powerfull/equalizer/CompatEq;->setBandLevel(SS)V

    .line 199
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public onStartTrackingTouch(Lyong/powerfull/equalizer/MySeekBar;)V
    .locals 0
    .param p1, "VerticalSeekBar"    # Lyong/powerfull/equalizer/MySeekBar;

    .prologue
    .line 192
    return-void
.end method

.method public onStopTrackingTouch(Lyong/powerfull/equalizer/MySeekBar;)V
    .locals 0
    .param p1, "VerticalSeekBar"    # Lyong/powerfull/equalizer/MySeekBar;

    .prologue
    .line 187
    return-void
.end method
