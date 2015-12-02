.class public Lcom/facebook/orca/d/ae;
.super Ljava/lang/Object;
.source "AudioPlaybackTimer.java"


# instance fields
.field private final a:Lcom/facebook/common/time/a;

.field private b:Landroid/media/MediaPlayer;

.field private c:J

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/orca/d/ae;->a:Lcom/facebook/common/time/a;

    .line 35
    return-void
.end method


# virtual methods
.method public a()I
    .locals 4

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/orca/d/ae;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_0

    .line 46
    iget v0, p0, Lcom/facebook/orca/d/ae;->e:I

    .line 63
    :goto_0
    return v0

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/d/ae;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    .line 50
    if-lez v0, :cond_1

    .line 51
    :goto_1
    iget v1, p0, Lcom/facebook/orca/d/ae;->e:I

    if-le v0, v1, :cond_2

    .line 52
    iput v0, p0, Lcom/facebook/orca/d/ae;->d:I

    .line 53
    iget-object v1, p0, Lcom/facebook/orca/d/ae;->a:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/orca/d/ae;->c:J

    .line 54
    iget v1, p0, Lcom/facebook/orca/d/ae;->d:I

    iput v1, p0, Lcom/facebook/orca/d/ae;->e:I

    goto :goto_0

    .line 50
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 58
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/d/ae;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/d/ae;->c:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    iget v1, p0, Lcom/facebook/orca/d/ae;->d:I

    add-int/2addr v0, v1

    .line 59
    iget-object v1, p0, Lcom/facebook/orca/d/ae;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    if-le v0, v1, :cond_3

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/d/ae;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    goto :goto_0

    .line 62
    :cond_3
    iput v0, p0, Lcom/facebook/orca/d/ae;->e:I

    goto :goto_0
.end method

.method public a(Landroid/media/MediaPlayer;)V
    .locals 1

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/orca/d/ae;->b:Landroid/media/MediaPlayer;

    .line 40
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/orca/d/ae;->e:I

    .line 41
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 67
    iget v0, p0, Lcom/facebook/orca/d/ae;->e:I

    iput v0, p0, Lcom/facebook/orca/d/ae;->d:I

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/d/ae;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/d/ae;->c:J

    .line 69
    return-void
.end method
