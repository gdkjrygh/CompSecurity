.class public Lyong/powerfull/equalizer/CompatEq;
.super Ljava/lang/Object;
.source "CompatEq.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# instance fields
.field public final mEq:Landroid/media/audiofx/Equalizer;


# direct methods
.method public constructor <init>(Landroid/media/MediaPlayer;)V
    .locals 3
    .param p1, "player"    # Landroid/media/MediaPlayer;

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Landroid/media/audiofx/Equalizer;

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/media/audiofx/Equalizer;-><init>(II)V

    .line 45
    .local v0, "eq":Landroid/media/audiofx/Equalizer;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Equalizer;->setEnabled(Z)I

    .line 46
    iput-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    .line 47
    return-void
.end method


# virtual methods
.method public getBandMaxLevel()I
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v0

    const/4 v1, 0x1

    aget-short v0, v0, v1

    return v0
.end method

.method public getNumberOfBands()S
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getNumberOfBands()S

    move-result v0

    return v0
.end method

.method public setBandLevel(SS)V
    .locals 4
    .param p1, "band"    # S
    .param p2, "level"    # S

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 64
    iget-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v0

    aget-short v0, v0, v2

    if-le v0, p2, :cond_0

    .line 65
    iget-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v0

    aget-short v0, v0, v2

    invoke-static {p1, v0}, Lyong/powerfull/equalizer/EquzeHelper;->setEe(II)V

    .line 66
    iget-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    iget-object v1, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v1}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v1

    aget-short v1, v1, v2

    invoke-virtual {v0, p1, v1}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

    .line 77
    :goto_0
    return-void

    .line 67
    :cond_0
    iget-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v0

    aget-short v0, v0, v3

    if-ge v0, p2, :cond_1

    .line 68
    iget-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v0

    aget-short v0, v0, v3

    invoke-static {p1, v0}, Lyong/powerfull/equalizer/EquzeHelper;->setEe(II)V

    .line 69
    iget-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    iget-object v1, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v1}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    move-result-object v1

    aget-short v1, v1, v3

    invoke-virtual {v0, p1, v1}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

    goto :goto_0

    .line 71
    :cond_1
    invoke-static {p1, p2}, Lyong/powerfull/equalizer/EquzeHelper;->setEe(II)V

    .line 72
    iget-object v0, p0, Lyong/powerfull/equalizer/CompatEq;->mEq:Landroid/media/audiofx/Equalizer;

    invoke-virtual {v0, p1, p2}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

    goto :goto_0
.end method
