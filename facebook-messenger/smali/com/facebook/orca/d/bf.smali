.class public Lcom/facebook/orca/d/bf;
.super Ljava/lang/Object;
.source "VolumeControlStreamManager.java"


# instance fields
.field private final a:Landroid/media/AudioManager;

.field private b:I

.field private c:J


# direct methods
.method public constructor <init>(Landroid/media/AudioManager;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/facebook/orca/d/bf;->b:I

    .line 35
    iput-object p1, p0, Lcom/facebook/orca/d/bf;->a:Landroid/media/AudioManager;

    .line 36
    return-void
.end method

.method private b(Landroid/view/KeyEvent;)V
    .locals 4

    .prologue
    .line 84
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 85
    sparse-switch v0, :sswitch_data_0

    .line 106
    :cond_0
    :goto_0
    return-void

    .line 92
    :sswitch_0
    const/16 v1, 0x11

    .line 93
    iget-object v2, p0, Lcom/facebook/orca/d/bf;->a:Landroid/media/AudioManager;

    const/16 v3, 0x18

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    :goto_1
    iget v3, p0, Lcom/facebook/orca/d/bf;->b:I

    invoke-virtual {v2, v0, v3, v1}, Landroid/media/AudioManager;->adjustSuggestedStreamVolume(III)V

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_1

    .line 101
    :sswitch_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 85
    :sswitch_data_0
    .sparse-switch
        0x18 -> :sswitch_0
        0x19 -> :sswitch_0
        0xa4 -> :sswitch_1
    .end sparse-switch
.end method

.method private c(Landroid/view/KeyEvent;)V
    .locals 4

    .prologue
    .line 112
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 113
    packed-switch v0, :pswitch_data_0

    .line 129
    :goto_0
    return-void

    .line 120
    :pswitch_0
    const/4 v0, 0x4

    .line 121
    iget-object v1, p0, Lcom/facebook/orca/d/bf;->a:Landroid/media/AudioManager;

    const/4 v2, 0x0

    iget v3, p0, Lcom/facebook/orca/d/bf;->b:I

    invoke-virtual {v1, v2, v3, v0}, Landroid/media/AudioManager;->adjustSuggestedStreamVolume(III)V

    .line 126
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/d/bf;->c:J

    goto :goto_0

    .line 113
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 43
    iput p1, p0, Lcom/facebook/orca/d/bf;->b:I

    .line 44
    return-void
.end method

.method public a(Landroid/view/KeyEvent;)Z
    .locals 8

    .prologue
    const/16 v7, 0x19

    const/16 v6, 0x18

    const/4 v0, 0x0

    .line 53
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    .line 54
    if-eq v1, v7, :cond_0

    if-eq v1, v6, :cond_0

    const/16 v2, 0xa4

    if-eq v1, v2, :cond_0

    iget-wide v2, p0, Lcom/facebook/orca/d/bf;->c:J

    const-wide/16 v4, 0x12c

    add-long/2addr v2, v4

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 62
    iget-object v2, p0, Lcom/facebook/orca/d/bf;->a:Landroid/media/AudioManager;

    iget v3, p0, Lcom/facebook/orca/d/bf;->b:I

    const/16 v4, 0x8

    invoke-virtual {v2, v0, v3, v4}, Landroid/media/AudioManager;->adjustSuggestedStreamVolume(III)V

    .line 67
    :cond_0
    if-eq v1, v7, :cond_1

    if-ne v1, v6, :cond_2

    .line 69
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    .line 70
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/bf;->b(Landroid/view/KeyEvent;)V

    .line 74
    :goto_0
    const/4 v0, 0x1

    .line 77
    :cond_2
    return v0

    .line 72
    :cond_3
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/bf;->c(Landroid/view/KeyEvent;)V

    goto :goto_0
.end method
