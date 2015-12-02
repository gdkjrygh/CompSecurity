.class public Lcom/facebook/orca/d/as;
.super Lcom/facebook/widget/f;
.source "AudioRecorderTooltipView.java"


# instance fields
.field private final a:Lcom/facebook/common/time/a;

.field private final b:Landroid/os/Handler;

.field private final c:Landroid/widget/TextView;

.field private final d:Landroid/view/View;

.field private final e:Landroid/view/View;

.field private f:J

.field private g:Lcom/facebook/orca/d/av;

.field private final h:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/d/as;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/d/as;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 58
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    new-instance v0, Lcom/facebook/orca/d/at;

    invoke-direct {v0, p0}, Lcom/facebook/orca/d/at;-><init>(Lcom/facebook/orca/d/as;)V

    iput-object v0, p0, Lcom/facebook/orca/d/as;->h:Ljava/lang/Runnable;

    .line 60
    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 61
    const-class v1, Lcom/facebook/common/time/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/orca/d/as;->a:Lcom/facebook/common/time/a;

    .line 62
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/d/as;->b:Landroid/os/Handler;

    .line 64
    sget v0, Lcom/facebook/k;->orca_audio_recorder_tooltip:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/as;->setContentView(I)V

    .line 65
    sget v0, Lcom/facebook/i;->audio_tooltip_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/as;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/d/as;->c:Landroid/widget/TextView;

    .line 66
    sget v0, Lcom/facebook/i;->audio_tooltip_left_bg:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/as;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/d/as;->d:Landroid/view/View;

    .line 67
    sget v0, Lcom/facebook/i;->audio_tooltip_right_bg:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/as;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/d/as;->e:Landroid/view/View;

    .line 71
    iget-object v0, p0, Lcom/facebook/orca/d/as;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->bringToFront()V

    .line 72
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/d/as;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/facebook/orca/d/as;->a:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/d/as;J)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/d/as;->setTimerText(J)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/d/as;)J
    .locals 2

    .prologue
    .line 20
    iget-wide v0, p0, Lcom/facebook/orca/d/as;->f:J

    return-wide v0
.end method

.method static synthetic c(Lcom/facebook/orca/d/as;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/facebook/orca/d/as;->h:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/d/as;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/facebook/orca/d/as;->b:Landroid/os/Handler;

    return-object v0
.end method

.method private setTimerText(J)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x3e8

    .line 139
    iget-object v0, p0, Lcom/facebook/orca/d/as;->c:Landroid/widget/TextView;

    const-string v1, "%d.%d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    div-long v4, p1, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    rem-long v4, p1, v6

    const-wide/16 v6, 0x64

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 111
    sget-object v0, Lcom/facebook/orca/d/av;->TOOLTIP:Lcom/facebook/orca/d/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/as;->setStyle(Lcom/facebook/orca/d/av;)V

    .line 112
    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->d()V

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/d/as;->c:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->audio_record_tooltip_hint:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 114
    return-void
.end method

.method public a(I)V
    .locals 2

    .prologue
    .line 132
    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->d()V

    .line 133
    int-to-long v0, p1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/d/as;->setTimerText(J)V

    .line 134
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 117
    sget-object v0, Lcom/facebook/orca/d/av;->NUX:Lcom/facebook/orca/d/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/as;->setStyle(Lcom/facebook/orca/d/av;)V

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/d/as;->c:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->audio_record_nux:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 119
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 122
    sget-object v0, Lcom/facebook/orca/d/av;->TOOLTIP:Lcom/facebook/orca/d/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/d/as;->setStyle(Lcom/facebook/orca/d/av;)V

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/d/as;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/d/as;->f:J

    .line 124
    iget-object v0, p0, Lcom/facebook/orca/d/as;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/d/as;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 125
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/orca/d/as;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/d/as;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 129
    return-void
.end method

.method public getViewStyle()Lcom/facebook/orca/d/av;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/orca/d/as;->g:Lcom/facebook/orca/d/av;

    return-object v0
.end method

.method public setStyle(Lcom/facebook/orca/d/av;)V
    .locals 3

    .prologue
    .line 75
    iput-object p1, p0, Lcom/facebook/orca/d/as;->g:Lcom/facebook/orca/d/av;

    .line 76
    sget-object v0, Lcom/facebook/orca/d/au;->a:[I

    iget-object v1, p0, Lcom/facebook/orca/d/as;->g:Lcom/facebook/orca/d/av;

    invoke-virtual {v1}, Lcom/facebook/orca/d/av;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 102
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ViewStyle in Tooltip doesn\'t have a layout defined"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/d/as;->d:Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_recorder_popup_white_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/d/as;->e:Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_recorder_popup_white_right:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 82
    iget-object v0, p0, Lcom/facebook/orca/d/as;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/p;->OrcaVoiceClipsTooltipNuxText:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 104
    :goto_0
    return-void

    .line 86
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/d/as;->d:Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_recorder_popup_red_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 88
    iget-object v0, p0, Lcom/facebook/orca/d/as;->e:Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_recorder_popup_red_right:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/d/as;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/p;->OrcaVoiceClipsTooltipText:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_0

    .line 94
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/d/as;->d:Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_recorder_popup_white_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/d/as;->e:Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_recorder_popup_white_right:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/d/as;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/d/as;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/p;->OrcaVoiceClipsTooltipTextHoverOff:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_0

    .line 76
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
