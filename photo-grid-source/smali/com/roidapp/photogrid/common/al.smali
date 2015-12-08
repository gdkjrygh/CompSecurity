.class public final Lcom/roidapp/photogrid/common/al;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z


# instance fields
.field private b:Landroid/app/Activity;

.field private c:Landroid/os/Handler;

.field private d:Ljava/util/Timer;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/al;->a:Z

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-boolean v1, p0, Lcom/roidapp/photogrid/common/al;->j:Z

    .line 40
    iput-object p1, p0, Lcom/roidapp/photogrid/common/al;->b:Landroid/app/Activity;

    .line 41
    iput-object p2, p0, Lcom/roidapp/photogrid/common/al;->c:Landroid/os/Handler;

    .line 42
    const v0, 0x7f0d0198

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/al;->e:Landroid/widget/LinearLayout;

    .line 43
    iget-object v0, p0, Lcom/roidapp/photogrid/common/al;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 44
    const v0, 0x7f0d0199

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/al;->f:Landroid/widget/TextView;

    .line 45
    const v0, 0x7f0d019a

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/al;->g:Landroid/widget/TextView;

    .line 46
    const v0, 0x7f0d019b

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/al;->h:Landroid/widget/TextView;

    .line 48
    const v0, 0x7f0d03a6

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/al;->i:Landroid/widget/TextView;

    .line 49
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/common/al;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/roidapp/photogrid/common/al;->c:Landroid/os/Handler;

    return-object v0
.end method

.method private static d()F
    .locals 3

    .prologue
    const/high16 v2, 0x44800000    # 1024.0f

    .line 52
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v0

    long-to-float v0, v0

    div-float/2addr v0, v2

    div-float/2addr v0, v2

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/high16 v6, 0x44800000    # 1024.0f

    .line 68
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v0

    .line 69
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 70
    iget-object v1, p0, Lcom/roidapp/photogrid/common/al;->f:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/photogrid/common/al;->d()F

    move-result v3

    float-to-double v4, v3

    invoke-virtual {v0, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "M   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    iget-object v1, p0, Lcom/roidapp/photogrid/common/al;->g:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1060
    invoke-static {}, Lcom/roidapp/photogrid/common/al;->d()F

    move-result v3

    .line 2056
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v4

    long-to-float v4, v4

    div-float/2addr v4, v6

    div-float/2addr v4, v6

    .line 1060
    sub-float/2addr v3, v4

    .line 71
    float-to-double v4, v3

    invoke-virtual {v0, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "M   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v1, p0, Lcom/roidapp/photogrid/common/al;->h:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2064
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v4

    long-to-float v3, v4

    div-float/2addr v3, v6

    div-float/2addr v3, v6

    .line 72
    float-to-double v4, v3

    invoke-virtual {v0, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "M   "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/al;->j:Z

    if-nez v0, :cond_0

    .line 74
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/common/ba;->d:Z

    if-nez v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/roidapp/photogrid/common/al;->i:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v2

    .line 3036
    iget-wide v4, v2, Lcom/roidapp/photogrid/common/ba;->c:J

    iget-wide v2, v2, Lcom/roidapp/photogrid/common/ba;->b:J

    sub-long v2, v4, v2

    long-to-float v2, v2

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "S"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/al;->j:Z

    .line 79
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    .prologue
    const-wide/16 v2, 0x1f4

    .line 112
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/common/al;->d:Ljava/util/Timer;

    .line 113
    iget-object v0, p0, Lcom/roidapp/photogrid/common/al;->d:Ljava/util/Timer;

    new-instance v1, Lcom/roidapp/photogrid/common/am;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/common/am;-><init>(Lcom/roidapp/photogrid/common/al;)V

    move-wide v4, v2

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    .line 114
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/roidapp/photogrid/common/al;->d:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/common/al;->d:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 120
    :cond_0
    return-void
.end method
