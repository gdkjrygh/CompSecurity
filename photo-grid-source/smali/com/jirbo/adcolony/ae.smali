.class Lcom/jirbo/adcolony/ae;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;


# static fields
.field static ay:[F


# instance fields
.field A:Z

.field B:Z

.field C:Z

.field D:Z

.field E:Z

.field F:Z

.field G:Z

.field H:Z

.field I:Z

.field J:Z

.field K:Z

.field L:Z

.field M:Z

.field N:Z

.field O:Z

.field P:Z

.field Q:Z

.field R:Z

.field S:Z

.field T:Z

.field U:Z

.field V:Landroid/graphics/Canvas;

.field W:Ljava/lang/String;

.field Z:Ljava/lang/String;

.field a:Landroid/webkit/WebView;

.field aA:F

.field aB:F

.field aC:F

.field aD:F

.field aE:F

.field aF:F

.field aG:Landroid/graphics/Paint;

.field aH:Landroid/graphics/RectF;

.field aI:Lcom/jirbo/adcolony/ae$b;

.field aJ:Landroid/os/Handler;

.field aa:Ljava/lang/String;

.field ab:Ljava/lang/String;

.field ac:Ljava/lang/String;

.field ad:Lcom/jirbo/adcolony/ab$b;

.field ae:Landroid/graphics/Paint;

.field af:Landroid/graphics/Paint;

.field ag:Landroid/graphics/Paint;

.field ah:Landroid/graphics/Paint;

.field ai:Landroid/graphics/Rect;

.field aj:Lcom/jirbo/adcolony/ADCImage;

.field ak:Lcom/jirbo/adcolony/ADCImage;

.field al:Lcom/jirbo/adcolony/ADCImage;

.field am:Lcom/jirbo/adcolony/ADCImage;

.field an:Lcom/jirbo/adcolony/ADCImage;

.field ao:Lcom/jirbo/adcolony/ADCImage;

.field ap:Lcom/jirbo/adcolony/ADCImage;

.field aq:Lcom/jirbo/adcolony/ADCImage;

.field ar:Lcom/jirbo/adcolony/ADCImage;

.field as:Lcom/jirbo/adcolony/ADCImage;

.field at:Lcom/jirbo/adcolony/ADCImage;

.field au:[Lcom/jirbo/adcolony/ADCImage;

.field av:[Lcom/jirbo/adcolony/ADCImage;

.field aw:Lcom/jirbo/adcolony/m;

.field ax:[Ljava/lang/String;

.field az:F

.field b:Landroid/webkit/WebView;

.field c:Landroid/view/View;

.field d:Lcom/jirbo/adcolony/ADCVideo;

.field e:D

.field f:D

.field g:I

.field h:I

.field i:I

.field j:I

.field k:I

.field l:I

.field m:I

.field n:I

.field o:I

.field p:I

.field q:I

.field r:I

.field s:I

.field t:I

.field u:I

.field v:J

.field w:J

.field x:F

.field y:Z

.field z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 125
    const/16 v0, 0x50

    new-array v0, v0, [F

    sput-object v0, Lcom/jirbo/adcolony/ae;->ay:[F

    return-void
.end method

.method constructor <init>(Lcom/jirbo/adcolony/ADCVideo;)V
    .locals 10

    .prologue
    const/4 v7, 0x3

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    const/4 v6, 0x2

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 134
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 39
    iput-wide v8, p0, Lcom/jirbo/adcolony/ae;->e:D

    .line 40
    iput-wide v8, p0, Lcom/jirbo/adcolony/ae;->f:D

    .line 42
    const/16 v0, 0x63

    iput v0, p0, Lcom/jirbo/adcolony/ae;->g:I

    .line 43
    iput v2, p0, Lcom/jirbo/adcolony/ae;->h:I

    .line 63
    iput-boolean v1, p0, Lcom/jirbo/adcolony/ae;->y:Z

    .line 64
    iput-boolean v1, p0, Lcom/jirbo/adcolony/ae;->z:Z

    .line 65
    iput-boolean v1, p0, Lcom/jirbo/adcolony/ae;->A:Z

    .line 66
    iput-boolean v1, p0, Lcom/jirbo/adcolony/ae;->B:Z

    .line 67
    iput-boolean v1, p0, Lcom/jirbo/adcolony/ae;->C:Z

    .line 68
    iput-boolean v1, p0, Lcom/jirbo/adcolony/ae;->D:Z

    .line 91
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->W:Ljava/lang/String;

    .line 99
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ae:Landroid/graphics/Paint;

    .line 100
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    .line 101
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ag:Landroid/graphics/Paint;

    .line 102
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ah:Landroid/graphics/Paint;

    .line 104
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ai:Landroid/graphics/Rect;

    .line 118
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/jirbo/adcolony/ADCImage;

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    .line 119
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/jirbo/adcolony/ADCImage;

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->av:[Lcom/jirbo/adcolony/ADCImage;

    .line 123
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ax:[Ljava/lang/String;

    .line 129
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->aG:Landroid/graphics/Paint;

    .line 130
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->aH:Landroid/graphics/RectF;

    .line 584
    new-instance v0, Lcom/jirbo/adcolony/ae$b;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/ae$b;-><init>(Lcom/jirbo/adcolony/ae;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->aI:Lcom/jirbo/adcolony/ae$b;

    .line 586
    new-instance v0, Lcom/jirbo/adcolony/ae$2;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/ae$2;-><init>(Lcom/jirbo/adcolony/ae;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->aJ:Landroid/os/Handler;

    .line 136
    iput-object p1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    .line 138
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/c;->s:Z

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->M:Z

    .line 139
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    if-eqz v0, :cond_0

    .line 141
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->M:Z

    sget-object v3, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v3, v3, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    iget-object v3, v3, Lcom/jirbo/adcolony/n$aa;->l:Lcom/jirbo/adcolony/n$g;

    iget-boolean v3, v3, Lcom/jirbo/adcolony/n$g;->a:Z

    or-int/2addr v0, v3

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->M:Z

    .line 142
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    sget-object v3, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-wide v4, v3, Lcom/jirbo/adcolony/AdColonyAd;->o:D

    iput-wide v4, v0, Lcom/jirbo/adcolony/AdColonyAd;->n:D

    .line 145
    :cond_0
    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCVideo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/jirbo/adcolony/ae;->x:F

    .line 147
    sget-boolean v0, Lcom/jirbo/adcolony/a;->O:Z

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    .line 149
    sget-object v0, Lcom/jirbo/adcolony/a;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/jirbo/adcolony/a;->e:Ljava/lang/String;

    sput-object v0, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    .line 151
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->u:Lcom/jirbo/adcolony/n$h;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/n$h;->d:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-nez v0, :cond_f

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->N:Z

    .line 154
    :cond_2
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->N:Z

    if-eqz v0, :cond_10

    .line 157
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "end_card_filepath"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    .line 158
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    iget v0, v0, Lcom/jirbo/adcolony/ADCImage;->f:I

    iput v0, p0, Lcom/jirbo/adcolony/ae;->n:I

    .line 159
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    iget v0, v0, Lcom/jirbo/adcolony/ADCImage;->g:I

    iput v0, p0, Lcom/jirbo/adcolony/ae;->o:I

    .line 162
    iget v0, p0, Lcom/jirbo/adcolony/ae;->n:I

    if-nez v0, :cond_3

    const/16 v0, 0x1e0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->n:I

    .line 163
    :cond_3
    iget v0, p0, Lcom/jirbo/adcolony/ae;->o:I

    if-nez v0, :cond_4

    const/16 v0, 0x140

    iput v0, p0, Lcom/jirbo/adcolony/ae;->o:I

    .line 166
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    new-instance v3, Lcom/jirbo/adcolony/ADCImage;

    const-string v4, "info_image_normal"

    invoke-static {v4}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    aput-object v3, v0, v2

    .line 167
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    new-instance v3, Lcom/jirbo/adcolony/ADCImage;

    const-string v4, "download_image_normal"

    invoke-static {v4}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    aput-object v3, v0, v1

    .line 168
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    new-instance v3, Lcom/jirbo/adcolony/ADCImage;

    const-string v4, "replay_image_normal"

    invoke-static {v4}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    aput-object v3, v0, v6

    .line 169
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    new-instance v3, Lcom/jirbo/adcolony/ADCImage;

    const-string v4, "continue_image_normal"

    invoke-static {v4}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    aput-object v3, v0, v7

    .line 172
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->av:[Lcom/jirbo/adcolony/ADCImage;

    new-instance v3, Lcom/jirbo/adcolony/ADCImage;

    const-string v4, "info_image_down"

    invoke-static {v4}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;Z)V

    aput-object v3, v0, v2

    .line 173
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->av:[Lcom/jirbo/adcolony/ADCImage;

    new-instance v3, Lcom/jirbo/adcolony/ADCImage;

    const-string v4, "download_image_down"

    invoke-static {v4}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;Z)V

    aput-object v3, v0, v1

    .line 174
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->av:[Lcom/jirbo/adcolony/ADCImage;

    new-instance v3, Lcom/jirbo/adcolony/ADCImage;

    const-string v4, "replay_image_down"

    invoke-static {v4}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;Z)V

    aput-object v3, v0, v6

    .line 175
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->av:[Lcom/jirbo/adcolony/ADCImage;

    new-instance v3, Lcom/jirbo/adcolony/ADCImage;

    const-string v4, "continue_image_down"

    invoke-static {v4}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;Z)V

    aput-object v3, v0, v7

    .line 177
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ax:[Ljava/lang/String;

    const-string v3, "Info"

    aput-object v3, v0, v2

    .line 178
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ax:[Ljava/lang/String;

    const-string v3, "Download"

    aput-object v3, v0, v1

    .line 179
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ax:[Ljava/lang/String;

    const-string v3, "Replay"

    aput-object v3, v0, v6

    .line 180
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ax:[Ljava/lang/String;

    const-string v3, "Continue"

    aput-object v3, v0, v7

    .line 199
    :cond_5
    :goto_1
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->M:Z

    if-eqz v0, :cond_6

    .line 202
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "skip_video_image_normal"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ak:Lcom/jirbo/adcolony/ADCImage;

    .line 203
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "skip_video_image_down"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->al:Lcom/jirbo/adcolony/ADCImage;

    .line 204
    const-string v0, "skip_delay"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->h(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    iput v0, p0, Lcom/jirbo/adcolony/ae;->p:I

    .line 208
    :cond_6
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aG:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 209
    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCVideo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 212
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aG:Landroid/graphics/Paint;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCVideo;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v3, v4

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 213
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aG:Landroid/graphics/Paint;

    const v3, -0x333334

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 214
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->S:Z

    .line 217
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->L:Z

    .line 218
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->T:Z

    .line 219
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    if-eqz v0, :cond_7

    .line 221
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$aa;->m:Lcom/jirbo/adcolony/n$g;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/n$g;->a:Z

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->L:Z

    .line 222
    const-string v0, "image_overlay_enabled"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->i(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->T:Z

    .line 224
    :cond_7
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->L:Z

    if-eqz v0, :cond_c

    .line 227
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "engagement_image_normal"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    .line 228
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "engagement_image_down"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    .line 229
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$aa;->m:Lcom/jirbo/adcolony/n$g;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$g;->j:Ljava/lang/String;

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ab:Ljava/lang/String;

    .line 230
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$aa;->m:Lcom/jirbo/adcolony/n$g;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$g;->l:Ljava/lang/String;

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->Z:Ljava/lang/String;

    .line 231
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$aa;->m:Lcom/jirbo/adcolony/n$g;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$g;->o:Ljava/lang/String;

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->aa:Ljava/lang/String;

    .line 232
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$aa;->m:Lcom/jirbo/adcolony/n$g;

    iget v0, v0, Lcom/jirbo/adcolony/n$g;->c:I

    iput v0, p0, Lcom/jirbo/adcolony/ae;->r:I

    .line 233
    const-string v0, "engagement_delay"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->h(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    iput v0, p0, Lcom/jirbo/adcolony/ae;->q:I

    .line 234
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->Z:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "Learn More"

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->Z:Ljava/lang/String;

    .line 235
    :cond_8
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aa:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    iput-boolean v1, p0, Lcom/jirbo/adcolony/ae;->G:Z

    .line 237
    :cond_9
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->G:Z

    if-eqz v0, :cond_a

    .line 239
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->b:Landroid/webkit/WebView;

    .line 240
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->b:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 243
    :cond_a
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    if-nez v0, :cond_c

    :cond_b
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->L:Z

    .line 245
    :cond_c
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->T:Z

    if-eqz v0, :cond_d

    .line 247
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "image_overlay_filepath"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    .line 248
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->isTablet()Z

    move-result v0

    if-eqz v0, :cond_11

    iget v0, p0, Lcom/jirbo/adcolony/ae;->r:I

    int-to-double v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/ae;->x:F

    float-to-double v2, v2

    div-double/2addr v2, v8

    mul-double/2addr v0, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    .line 250
    :goto_2
    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 253
    :cond_d
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->e()V

    .line 256
    :cond_e
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ae:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 257
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ag:Landroid/graphics/Paint;

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 258
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ag:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 259
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    const v1, -0x333334

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 260
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 261
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 262
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ah:Landroid/graphics/Paint;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 263
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ah:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 268
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setLayerType"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Landroid/graphics/Paint;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 269
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 275
    :goto_3
    return-void

    :cond_f
    move v0, v2

    .line 151
    goto/16 :goto_0

    .line 182
    :cond_10
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_5

    .line 185
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "reload_image_normal"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ao:Lcom/jirbo/adcolony/ADCImage;

    .line 186
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "close_image_normal"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->am:Lcom/jirbo/adcolony/ADCImage;

    .line 189
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "close_image_down"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->an:Lcom/jirbo/adcolony/ADCImage;

    .line 190
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "reload_image_down"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ap:Lcom/jirbo/adcolony/ADCImage;

    .line 193
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v3, "browser_icon"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->as:Lcom/jirbo/adcolony/ADCImage;

    .line 195
    new-instance v0, Lcom/jirbo/adcolony/ae$a;

    invoke-direct {v0, p0, p1}, Lcom/jirbo/adcolony/ae$a;-><init>(Lcom/jirbo/adcolony/ae;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->c:Landroid/view/View;

    .line 196
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->b()V

    goto/16 :goto_1

    .line 248
    :cond_11
    iget v0, p0, Lcom/jirbo/adcolony/ae;->r:I

    int-to-double v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/ae;->x:F

    float-to-double v2, v2

    const-wide/high16 v4, 0x3fe8000000000000L    # 0.75

    div-double/2addr v2, v4

    mul-double/2addr v0, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    goto/16 :goto_2

    .line 275
    :catch_0
    move-exception v0

    goto :goto_3
.end method


# virtual methods
.method a(II)I
    .locals 3

    .prologue
    .line 798
    const/4 v0, 0x0

    .line 800
    iget v1, p0, Lcom/jirbo/adcolony/ae;->g:I

    if-lt p1, v1, :cond_1

    iget v1, p0, Lcom/jirbo/adcolony/ae;->g:I

    add-int/lit8 v1, v1, 0x3e

    if-ge p1, v1, :cond_1

    const/4 v0, 0x1

    .line 806
    :cond_0
    :goto_0
    return v0

    .line 801
    :cond_1
    iget v1, p0, Lcom/jirbo/adcolony/ae;->g:I

    add-int/lit8 v1, v1, 0x4e

    if-lt p1, v1, :cond_2

    iget v1, p0, Lcom/jirbo/adcolony/ae;->g:I

    add-int/lit8 v1, v1, 0x4e

    add-int/lit8 v1, v1, 0x3e

    if-ge p1, v1, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    .line 802
    :cond_2
    iget v1, p0, Lcom/jirbo/adcolony/ae;->g:I

    add-int/lit8 v1, v1, 0x4e

    add-int/lit8 v1, v1, 0x4e

    if-lt p1, v1, :cond_3

    iget v1, p0, Lcom/jirbo/adcolony/ae;->g:I

    add-int/lit8 v1, v1, 0x4e

    add-int/lit8 v1, v1, 0x4e

    add-int/lit8 v1, v1, 0x3e

    if-ge p1, v1, :cond_3

    const/4 v0, 0x3

    goto :goto_0

    .line 803
    :cond_3
    iget v1, p0, Lcom/jirbo/adcolony/ae;->g:I

    add-int/lit8 v1, v1, 0x4e

    add-int/lit8 v1, v1, 0x4e

    add-int/lit8 v1, v1, 0x4e

    if-lt p1, v1, :cond_4

    iget v1, p0, Lcom/jirbo/adcolony/ae;->g:I

    add-int/lit8 v1, v1, 0x4e

    add-int/lit8 v1, v1, 0x4e

    add-int/lit8 v1, v1, 0x4e

    add-int/lit8 v1, v1, 0x3e

    if-ge p1, v1, :cond_4

    const/4 v0, 0x4

    goto :goto_0

    .line 804
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/jirbo/adcolony/ae;->M:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/e;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->ak:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v1, v2

    if-lt p1, v1, :cond_0

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->ak:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->g:I

    if-gt p2, v1, :cond_0

    const/16 v0, 0xa

    goto :goto_0
.end method

.method public a()V
    .locals 8

    .prologue
    .line 827
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCVideo;->b()Z

    move-result v2

    .line 828
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->y:Z

    or-int/2addr v0, v2

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->y:Z

    .line 830
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v0, :cond_1

    .line 832
    iget v0, p0, Lcom/jirbo/adcolony/ae;->s:I

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getDuration()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->s:I

    .line 834
    :cond_0
    if-eqz v2, :cond_1

    .line 836
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v3, v3, Lcom/jirbo/adcolony/ADCVideo;->u:I

    const/16 v4, 0x11

    invoke-direct {v0, v1, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 837
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v3, v3, Lcom/jirbo/adcolony/ADCVideo;->x:I

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v4, v4, Lcom/jirbo/adcolony/ADCVideo;->y:I

    const/16 v5, 0x11

    invoke-direct {v1, v3, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/e;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 838
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->y:Z

    .line 842
    :cond_1
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->y:Z

    if-eqz v0, :cond_9

    .line 844
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->y:Z

    .line 847
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->z:Z

    if-eqz v0, :cond_4

    .line 849
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 850
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    iget v3, v0, Landroid/util/DisplayMetrics;->xdpi:F

    div-float/2addr v1, v3

    .line 851
    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v3, v3

    iget v4, v0, Landroid/util/DisplayMetrics;->ydpi:F

    div-float/2addr v3, v4

    .line 852
    mul-float/2addr v1, v1

    mul-float/2addr v3, v3

    add-float/2addr v1, v3

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    .line 853
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/2addr v1, v3

    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/2addr v0, v3

    add-int/2addr v0, v1

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    .line 854
    div-double/2addr v0, v4

    .line 856
    const-wide v4, 0x4071800000000000L    # 280.0

    div-double v4, v0, v4

    const-wide v6, 0x3fe6666666666666L    # 0.7

    cmpg-double v3, v4, v6

    if-gez v3, :cond_a

    const-wide v0, 0x3fe6666666666666L    # 0.7

    :goto_0
    iput-wide v0, p0, Lcom/jirbo/adcolony/ae;->f:D

    .line 857
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->isTablet()Z

    move-result v0

    if-nez v0, :cond_2

    iget-wide v0, p0, Lcom/jirbo/adcolony/ae;->f:D

    const-wide v4, 0x3fe6666666666666L    # 0.7

    cmpl-double v0, v0, v4

    if-nez v0, :cond_2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lcom/jirbo/adcolony/ae;->f:D

    .line 860
    :cond_2
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->f:D

    mul-double/2addr v0, v4

    const-wide/high16 v4, 0x4032000000000000L    # 18.0

    cmpg-double v0, v0, v4

    if-gez v0, :cond_b

    const/high16 v0, 0x41900000    # 18.0f

    .line 861
    :goto_1
    const-wide/high16 v4, 0x4034000000000000L    # 20.0

    iget-wide v6, p0, Lcom/jirbo/adcolony/ae;->f:D

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x4032000000000000L    # 18.0

    cmpg-double v1, v4, v6

    if-gez v1, :cond_c

    const/high16 v1, 0x41900000    # 18.0f

    .line 862
    :goto_2
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 863
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->ah:Landroid/graphics/Paint;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 864
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ag:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 867
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->L:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    if-eqz v0, :cond_3

    .line 869
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->Z:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    mul-int/lit8 v3, v3, 0x2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/ae;->b(Ljava/lang/String;)I

    move-result v1

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    invoke-virtual {v0, v1, v3}, Lcom/jirbo/adcolony/ADCImage;->a(II)V

    .line 870
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->Z:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    mul-int/lit8 v3, v3, 0x2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/ae;->b(Ljava/lang/String;)I

    move-result v1

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    invoke-virtual {v0, v1, v3}, Lcom/jirbo/adcolony/ADCImage;->a(II)V

    .line 876
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->z:Z

    .line 879
    :cond_4
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_6

    .line 881
    if-eqz v2, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v2, v2, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v3, v3, Lcom/jirbo/adcolony/ADCVideo;->u:I

    iget v4, p0, Lcom/jirbo/adcolony/ae;->m:I

    sub-int/2addr v3, v4

    const/16 v4, 0x11

    invoke-direct {v1, v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 882
    :cond_5
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->y:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4084000000000000L    # 640.0

    div-double/2addr v0, v2

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    cmpg-double v0, v0, v2

    if-gez v0, :cond_d

    const-wide v0, 0x3feccccccccccccdL    # 0.9

    :goto_3
    iput-wide v0, p0, Lcom/jirbo/adcolony/ae;->e:D

    .line 883
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->isTablet()Z

    move-result v0

    if-nez v0, :cond_6

    iget-wide v0, p0, Lcom/jirbo/adcolony/ae;->e:D

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    cmpl-double v0, v0, v2

    if-nez v0, :cond_6

    const-wide v0, 0x3ff3333333333333L    # 1.2

    iput-wide v0, p0, Lcom/jirbo/adcolony/ae;->e:D

    .line 885
    :cond_6
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->N:Z

    if-eqz v0, :cond_7

    .line 888
    iget v0, p0, Lcom/jirbo/adcolony/ae;->n:I

    iget v1, p0, Lcom/jirbo/adcolony/ae;->o:I

    div-int/2addr v0, v1

    int-to-double v2, v0

    .line 890
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    int-to-double v0, v0

    div-double/2addr v0, v2

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v4, v4, Lcom/jirbo/adcolony/ADCVideo;->u:I

    int-to-double v4, v4

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    div-double/2addr v4, v6

    cmpl-double v0, v0, v4

    if-lez v0, :cond_e

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    int-to-double v0, v0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    div-double/2addr v0, v4

    .line 893
    :goto_4
    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    mul-double/2addr v2, v0

    double-to-int v2, v2

    iput v2, v4, Lcom/jirbo/adcolony/ADCVideo;->x:I

    .line 894
    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v4

    double-to-int v0, v0

    iput v0, v2, Lcom/jirbo/adcolony/ADCVideo;->y:I

    .line 897
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->u:I

    if-le v0, v1, :cond_f

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->y:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4084000000000000L    # 640.0

    div-double/2addr v0, v2

    :goto_5
    iput-wide v0, p0, Lcom/jirbo/adcolony/ae;->e:D

    .line 900
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    int-to-double v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/ae;->n:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v2, v2, Lcom/jirbo/adcolony/ADCVideo;->u:I

    int-to-double v2, v2

    iget v4, p0, Lcom/jirbo/adcolony/ae;->o:I

    int-to-double v4, v4

    div-double/2addr v2, v4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_10

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    int-to-double v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/ae;->o:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    .line 902
    :goto_6
    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 903
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v2, v2, Lcom/jirbo/adcolony/ADCVideo;->u:I

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->d(II)V

    .line 907
    :cond_7
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->L:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    if-eqz v0, :cond_8

    .line 909
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_11

    .line 913
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-double v0, v0

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->f:D

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 914
    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-double v2, v1

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->f:D

    mul-double/2addr v2, v4

    double-to-int v1, v2

    .line 915
    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    invoke-virtual {v2, v3, v0}, Lcom/jirbo/adcolony/ADCImage;->b(II)V

    .line 916
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    invoke-virtual {v0, v2, v1}, Lcom/jirbo/adcolony/ADCImage;->b(II)V

    .line 922
    :cond_8
    :goto_7
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->M:Z

    if-eqz v0, :cond_9

    .line 924
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ak:Lcom/jirbo/adcolony/ADCImage;

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->f:D

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 925
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->al:Lcom/jirbo/adcolony/ADCImage;

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->f:D

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 930
    :cond_9
    return-void

    .line 856
    :cond_a
    const-wide v4, 0x4071800000000000L    # 280.0

    div-double/2addr v0, v4

    goto/16 :goto_0

    .line 860
    :cond_b
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->f:D

    mul-double/2addr v0, v4

    double-to-float v0, v0

    goto/16 :goto_1

    .line 861
    :cond_c
    const-wide/high16 v4, 0x4034000000000000L    # 20.0

    iget-wide v6, p0, Lcom/jirbo/adcolony/ae;->f:D

    mul-double/2addr v4, v6

    double-to-float v1, v4

    goto/16 :goto_2

    .line 882
    :cond_d
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->y:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4084000000000000L    # 640.0

    div-double/2addr v0, v2

    goto/16 :goto_3

    .line 890
    :cond_e
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    int-to-double v0, v0

    div-double/2addr v0, v2

    goto/16 :goto_4

    .line 897
    :cond_f
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->y:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x408e000000000000L    # 960.0

    div-double/2addr v0, v2

    goto/16 :goto_5

    .line 900
    :cond_10
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    int-to-double v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/ae;->n:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    goto/16 :goto_6

    .line 918
    :cond_11
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->L:Z

    goto :goto_7
.end method

.method a(I)V
    .locals 4

    .prologue
    .line 494
    :try_start_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->C:Z

    if-nez v0, :cond_0

    const/16 v0, 0xa

    if-ne p1, v0, :cond_1

    .line 496
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->C:Z

    .line 497
    packed-switch p1, :pswitch_data_0

    .line 562
    :pswitch_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 566
    :goto_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 567
    new-instance v1, Lcom/jirbo/adcolony/ae$1;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/ae$1;-><init>(Lcom/jirbo/adcolony/ae;)V

    .line 574
    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 582
    :cond_1
    :goto_1
    return-void

    .line 501
    :pswitch_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 502
    const-string v0, "info"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"ad_slot\":"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v2, v2, Lcom/jirbo/adcolony/ag;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-static {v0, v1, v2}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 503
    const-string v0, "info_url"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 504
    sget-object v1, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v2, "INFO "

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 506
    const-string v1, "market:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "amzn:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 508
    :cond_2
    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/ADCVideo;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 580
    :catch_0
    move-exception v0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->C:Z

    goto :goto_1

    .line 512
    :cond_3
    :try_start_1
    sput-object v0, Lcom/jirbo/adcolony/AdColonyBrowser;->url:Ljava/lang/String;

    .line 513
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    const-class v3, Lcom/jirbo/adcolony/AdColonyBrowser;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCVideo;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 520
    :pswitch_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 521
    const-string v0, "download"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"ad_slot\":"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v2, v2, Lcom/jirbo/adcolony/ag;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-static {v0, v1, v2}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 522
    const-string v0, "download_url"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 523
    sget-object v1, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v2, "DOWNLOAD "

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 525
    const-string v1, "market:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "amzn:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 527
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/ADCVideo;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 531
    :cond_5
    sput-object v0, Lcom/jirbo/adcolony/AdColonyBrowser;->url:Ljava/lang/String;

    .line 532
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    const-class v3, Lcom/jirbo/adcolony/AdColonyBrowser;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCVideo;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 539
    :pswitch_3
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 540
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->h()V

    .line 541
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    goto/16 :goto_0

    .line 548
    :pswitch_4
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 549
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->a()V

    .line 550
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->f()V

    goto/16 :goto_0

    .line 556
    :pswitch_5
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 557
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->g()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 497
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1201
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->N:Z

    if-eqz v0, :cond_1

    .line 1208
    :cond_0
    :goto_0
    return-void

    .line 1203
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 1205
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    .line 1206
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method a(Z)V
    .locals 1

    .prologue
    .line 1215
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->N:Z

    if-eqz v0, :cond_0

    .line 1225
    :goto_0
    return-void

    .line 1217
    :cond_0
    if-eqz p1, :cond_1

    .line 1219
    const-string v0, "adc_bridge.fireChangeEvent({viewable:true});"

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 1223
    :cond_1
    const-string v0, "adc_bridge.fireChangeEvent({viewable:false});"

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/jirbo/adcolony/ADCImage;II)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 816
    if-nez p1, :cond_1

    .line 817
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    iget v2, p1, Lcom/jirbo/adcolony/ADCImage;->f:I

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x8

    if-ge p2, v1, :cond_0

    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    add-int/lit8 v1, v1, -0x8

    if-le p2, v1, :cond_0

    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v1

    iget v2, p1, Lcom/jirbo/adcolony/ADCImage;->g:I

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x8

    if-ge p3, v1, :cond_0

    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x8

    if-le p3, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method b(Ljava/lang/String;)I
    .locals 4

    .prologue
    .line 1410
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ag:Landroid/graphics/Paint;

    sget-object v1, Lcom/jirbo/adcolony/ae;->ay:[F

    invoke-virtual {v0, p1, v1}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 1412
    const/4 v1, 0x0

    .line 1413
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 1414
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    sget-object v3, Lcom/jirbo/adcolony/ae;->ay:[F

    aget v3, v3, v0

    add-float/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1415
    :cond_0
    float-to-int v0, v1

    return v0
.end method

.method b()V
    .locals 7

    .prologue
    const/16 v6, 0x13

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 939
    new-instance v0, Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    .line 940
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setFocusable(Z)V

    .line 941
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 942
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 945
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 946
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 948
    sget-object v1, Landroid/webkit/WebSettings$PluginState;->ON_DEMAND:Landroid/webkit/WebSettings$PluginState;

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 949
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 950
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 955
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    new-instance v1, Lcom/jirbo/adcolony/ae$3;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/ae$3;-><init>(Lcom/jirbo/adcolony/ae;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 980
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    new-instance v1, Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/jirbo/adcolony/ADCVideo;->O:Landroid/widget/FrameLayout;

    .line 983
    const-string v0, "hardware_acceleration_disabled"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 987
    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->O:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setLayerType"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Landroid/graphics/Paint;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 988
    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 997
    :cond_0
    :goto_0
    new-instance v0, Lcom/jirbo/adcolony/m;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-direct {v0, v1, v2, v3}, Lcom/jirbo/adcolony/m;-><init>(Lcom/jirbo/adcolony/ADCVideo;Landroid/webkit/WebView;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->aw:Lcom/jirbo/adcolony/m;

    .line 1000
    new-instance v0, Lcom/jirbo/adcolony/ae$4;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/ae$4;-><init>(Lcom/jirbo/adcolony/ae;)V

    .line 1079
    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 1080
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v6, :cond_1

    .line 1082
    sget-object v0, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    sget-object v1, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    const-string v2, "text/html; charset=UTF-8"

    invoke-virtual {v0, v1, v2, v5}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1086
    :cond_1
    :goto_1
    sget-object v0, Lcom/jirbo/adcolony/a;->U:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/jirbo/adcolony/ab;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1087
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Injecting mraid"

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 1088
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    .line 1091
    sget-boolean v0, Lcom/jirbo/adcolony/a;->m:Z

    if-eqz v0, :cond_4

    const-string v0, "true"

    .line 1092
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "var is_tablet="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    .line 1094
    sget-boolean v0, Lcom/jirbo/adcolony/a;->m:Z

    if-eqz v0, :cond_5

    const-string v0, "tablet"

    .line 1097
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "adc_bridge.adc_version=\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/jirbo/adcolony/a;->W:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    .line 1098
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "adc_bridge.os_version=\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/jirbo/adcolony/a;->V:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    .line 1099
    const-string v1, "adc_bridge.os_name=\'android\'"

    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    .line 1100
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "adc_bridge.device_type=\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    .line 1101
    const-string v0, "adc_bridge.fireChangeEvent({state:\'default\'});"

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    .line 1102
    const-string v0, "adc_bridge.fireReadyEvent()"

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    .line 1106
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v6, :cond_2

    .line 1108
    sget-object v0, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    sget-object v1, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    const-string v2, "text/html; charset=UTF-8"

    invoke-virtual {v0, v1, v2, v5}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1111
    :cond_2
    :goto_4
    return-void

    .line 1083
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    sget-object v1, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1091
    :cond_4
    const-string v0, "false"

    goto/16 :goto_2

    .line 1094
    :cond_5
    const-string v0, "phone"

    goto/16 :goto_3

    .line 1109
    :cond_6
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    sget-object v1, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_0
.end method

.method b(I)V
    .locals 1

    .prologue
    .line 1465
    iput p1, p0, Lcom/jirbo/adcolony/ae;->h:I

    .line 1466
    if-gez p1, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->h:I

    .line 1467
    :cond_0
    return-void
.end method

.method b(Z)V
    .locals 1

    .prologue
    .line 1232
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->N:Z

    if-eqz v0, :cond_0

    .line 1246
    :cond_0
    return-void
.end method

.method public c()V
    .locals 6

    .prologue
    .line 1128
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    sget-boolean v1, Lcom/jirbo/adcolony/ADCVideo;->e:Z

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/d;->a(ZLcom/jirbo/adcolony/AdColonyAd;)V

    .line 1131
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->D:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/jirbo/adcolony/a;->R:Z

    if-eqz v0, :cond_0

    .line 1133
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 1134
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1135
    new-instance v1, Lcom/jirbo/adcolony/ae$5;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/ae$5;-><init>(Lcom/jirbo/adcolony/ae;)V

    .line 1149
    sget v2, Lcom/jirbo/adcolony/a;->S:I

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1153
    :cond_0
    sget-boolean v0, Lcom/jirbo/adcolony/a;->P:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->f()V

    .line 1155
    :cond_1
    const-string v0, "card_shown"

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-static {v0, v1}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 1157
    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aI:Lcom/jirbo/adcolony/ae$b;

    monitor-enter v1

    .line 1159
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ad:Lcom/jirbo/adcolony/ab$b;

    .line 1160
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->u:Lcom/jirbo/adcolony/n$h;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/n$h;->e:Z

    if-eqz v0, :cond_2

    .line 1162
    new-instance v0, Lcom/jirbo/adcolony/ab$b;

    sget-object v2, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$a;->u:Lcom/jirbo/adcolony/n$h;

    iget-wide v2, v2, Lcom/jirbo/adcolony/n$h;->g:D

    invoke-direct {v0, v2, v3}, Lcom/jirbo/adcolony/ab$b;-><init>(D)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ad:Lcom/jirbo/adcolony/ab$b;

    .line 1164
    :cond_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1167
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_3

    .line 1169
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1170
    new-instance v1, Landroid/view/View;

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1171
    new-instance v2, Lcom/jirbo/adcolony/ae$6;

    invoke-direct {v2, p0, v1}, Lcom/jirbo/adcolony/ae$6;-><init>(Lcom/jirbo/adcolony/ae;Landroid/view/View;)V

    .line 1180
    const/high16 v3, -0x1000000

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1181
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v3, v3, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 1182
    const-wide/16 v4, 0x1f4

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1183
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->O:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1185
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/jirbo/adcolony/ADCVideo;->r:J

    .line 1186
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->e()V

    .line 1187
    return-void

    .line 1164
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method c(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1334
    sput-boolean v2, Lcom/jirbo/adcolony/a;->D:Z

    .line 1336
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyAd;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 1338
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v0

    sput v0, Lcom/jirbo/adcolony/ADCVideo;->a:I

    .line 1339
    new-instance v1, Lcom/jirbo/adcolony/w;

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    check-cast v0, Lcom/jirbo/adcolony/AdColonyV4VCAd;

    invoke-direct {v1, v2, v0}, Lcom/jirbo/adcolony/w;-><init>(Lcom/jirbo/adcolony/ADCVideo;Lcom/jirbo/adcolony/AdColonyV4VCAd;)V

    sput-object v1, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    .line 1352
    :goto_0
    return-void

    .line 1343
    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 1345
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a()V

    .line 1343
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 1347
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCVideo;->finish()V

    .line 1348
    sget-object v0, Lcom/jirbo/adcolony/a;->M:Lcom/jirbo/adcolony/a$a;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/a$a;->b(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 1349
    sput-boolean v2, Lcom/jirbo/adcolony/a;->aa:Z

    .line 1350
    sput-boolean v2, Lcom/jirbo/adcolony/AdColonyBrowser;->A:Z

    goto :goto_0
.end method

.method d()V
    .locals 2

    .prologue
    .line 1192
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    sget-object v1, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1193
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Loading - end card url = "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    sget-object v1, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 1194
    return-void
.end method

.method e()V
    .locals 4

    .prologue
    .line 1265
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1266
    new-instance v1, Lcom/jirbo/adcolony/ae$7;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/ae$7;-><init>(Lcom/jirbo/adcolony/ae;)V

    .line 1273
    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1275
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->stop()I

    .line 1277
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    .line 1278
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->a()V

    .line 1279
    :cond_1
    const/4 v0, 0x0

    sput-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    .line 1280
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    .line 1281
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->I:Z

    .line 1282
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    .line 1283
    return-void
.end method

.method f()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x1

    .line 1290
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->O:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    if-nez v0, :cond_1

    .line 1323
    :cond_0
    :goto_0
    return-void

    .line 1293
    :cond_1
    sput-boolean v8, Lcom/jirbo/adcolony/a;->D:Z

    .line 1295
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/jirbo/adcolony/ADCVideo;->s:J

    .line 1296
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-wide v2, v0, Lcom/jirbo/adcolony/ADCVideo;->q:D

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-wide v4, v1, Lcom/jirbo/adcolony/ADCVideo;->s:J

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-wide v6, v1, Lcom/jirbo/adcolony/ADCVideo;->r:J

    sub-long/2addr v4, v6

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    add-double/2addr v2, v4

    iput-wide v2, v0, Lcom/jirbo/adcolony/ADCVideo;->q:D

    .line 1297
    sput-boolean v8, Lcom/jirbo/adcolony/a;->aa:Z

    .line 1299
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 1301
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a()V

    .line 1299
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 1305
    :cond_3
    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->T:Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1312
    :goto_2
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCVideo;->finish()V

    .line 1314
    iput-object v9, p0, Lcom/jirbo/adcolony/ae;->ad:Lcom/jirbo/adcolony/ab$b;

    .line 1315
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_4

    .line 1317
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->O:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 1318
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 1319
    iput-object v9, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    .line 1321
    :cond_4
    sget-object v0, Lcom/jirbo/adcolony/a;->M:Lcom/jirbo/adcolony/a$a;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/a$a;->a(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 1322
    sput-boolean v8, Lcom/jirbo/adcolony/AdColonyBrowser;->A:Z

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method g()V
    .locals 1

    .prologue
    .line 1330
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->c(Z)V

    .line 1331
    return-void
.end method

.method h()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1359
    const-string v0, "replay"

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-static {v0, v1}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 1360
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->e:Z

    .line 1361
    sput-boolean v6, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    .line 1362
    sput v6, Lcom/jirbo/adcolony/ADCVideo;->a:I

    .line 1363
    iput-boolean v6, p0, Lcom/jirbo/adcolony/ae;->S:Z

    .line 1367
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1368
    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1369
    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v3, v3, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v4, v4, Lcom/jirbo/adcolony/ADCVideo;->u:I

    const/16 v5, 0x11

    invoke-direct {v2, v3, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1370
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 1371
    new-instance v2, Lcom/jirbo/adcolony/ae$8;

    invoke-direct {v2, p0, v0}, Lcom/jirbo/adcolony/ae$8;-><init>(Lcom/jirbo/adcolony/ae;Landroid/view/View;)V

    .line 1379
    const-wide/16 v4, 0x384

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1381
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->start()V

    .line 1382
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    if-eqz v0, :cond_1

    .line 1386
    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-static {v1, v2}, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->GetNewSDKInstance(ILandroid/content/Context;)Lcom/immersion/hapticmediasdk/HapticContentSDK;

    move-result-object v1

    iput-object v1, v0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    .line 1387
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->openHaptics(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1393
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iput-boolean v6, v0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    .line 1394
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->play()I

    .line 1396
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/d;->a(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 1397
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->requestFocus()Z

    .line 1398
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0, v6}, Lcom/jirbo/adcolony/e;->setBackgroundColor(I)V

    .line 1399
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0, v6}, Lcom/jirbo/adcolony/e;->setVisibility(I)V

    .line 1400
    invoke-virtual {p0, v6}, Lcom/jirbo/adcolony/ae;->a(Z)V

    .line 1401
    return-void

    .line 1391
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iput-boolean v6, v0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    goto :goto_0
.end method

.method i()V
    .locals 2

    .prologue
    .line 1425
    .line 1426
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/jirbo/adcolony/ae$9;

    invoke-direct {v1, p0, p0}, Lcom/jirbo/adcolony/ae$9;-><init>(Lcom/jirbo/adcolony/ae;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 1435
    return-void
.end method

.method j()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1444
    iget v0, p0, Lcom/jirbo/adcolony/ae;->h:I

    const/16 v1, 0x46

    if-lt v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->E:Z

    if-nez v0, :cond_1

    .line 1447
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->E:Z

    .line 1448
    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/ae;->b(Z)V

    .line 1456
    :cond_0
    :goto_0
    return-void

    .line 1450
    :cond_1
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->E:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/jirbo/adcolony/ae;->h:I

    if-nez v0, :cond_0

    .line 1453
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->E:Z

    .line 1454
    invoke-virtual {p0, v2}, Lcom/jirbo/adcolony/ae;->b(Z)V

    goto :goto_0
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    .prologue
    .line 1118
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->c()V

    .line 1119
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .prologue
    .line 282
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->F:Z

    if-eqz v0, :cond_1

    .line 469
    :cond_0
    :goto_0
    return-void

    .line 283
    :cond_1
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->a()V

    .line 284
    iput-object p1, p0, Lcom/jirbo/adcolony/ae;->V:Landroid/graphics/Canvas;

    .line 287
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->O:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->M:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v0

    iget v1, p0, Lcom/jirbo/adcolony/ae;->p:I

    if-le v0, v1, :cond_6

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->O:Z

    .line 288
    :cond_2
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->P:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->L:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v0

    iget v1, p0, Lcom/jirbo/adcolony/ae;->q:I

    if-le v0, v1, :cond_7

    const/4 v0, 0x1

    :goto_2
    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->P:Z

    .line 296
    :cond_3
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->N:Z

    if-eqz v0, :cond_a

    .line 298
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->z:I

    shr-int/lit8 v0, v0, 0x18

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 299
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v2, v2, Lcom/jirbo/adcolony/ADCVideo;->u:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 300
    const-wide v0, 0x4067400000000000L    # 186.0

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    add-int/2addr v1, v0

    .line 301
    const-wide v2, 0x407d600000000000L    # 470.0

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v2, v4

    double-to-int v0, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v2

    add-int/2addr v2, v0

    .line 303
    const/4 v0, 0x0

    :goto_3
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    array-length v3, v3

    if-ge v0, v3, :cond_0

    .line 306
    iget v3, p0, Lcom/jirbo/adcolony/ae;->t:I

    add-int/lit8 v4, v0, 0x1

    if-eq v3, v4, :cond_4

    iget v3, p0, Lcom/jirbo/adcolony/ae;->u:I

    add-int/lit8 v4, v0, 0x1

    if-ne v3, v4, :cond_8

    iget-boolean v3, p0, Lcom/jirbo/adcolony/ae;->A:Z

    if-nez v3, :cond_8

    iget v3, p0, Lcom/jirbo/adcolony/ae;->u:I

    if-eqz v3, :cond_8

    .line 308
    :cond_4
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->av:[Lcom/jirbo/adcolony/ADCImage;

    aget-object v3, v3, v0

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->e:D

    invoke-virtual {v3, v4, v5}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 309
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->av:[Lcom/jirbo/adcolony/ADCImage;

    aget-object v3, v3, v0

    invoke-virtual {v3, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 310
    int-to-double v4, v1

    const-wide v6, 0x4063a00000000000L    # 157.0

    iget-wide v8, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    double-to-int v1, v4

    .line 322
    :cond_5
    :goto_4
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 323
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 324
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->ax:[Ljava/lang/String;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    aget-object v4, v4, v0

    invoke-virtual {v4}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    aget-object v5, v5, v0

    iget v5, v5, Lcom/jirbo/adcolony/ADCImage;->f:I

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    aget-object v5, v5, v0

    .line 325
    invoke-virtual {v5}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v5

    iget-object v6, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    aget-object v6, v6, v0

    iget v6, v6, Lcom/jirbo/adcolony/ADCImage;->g:I

    add-int/2addr v5, v6

    int-to-float v5, v5

    iget-object v6, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    .line 324
    invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 303
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 287
    :cond_6
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 288
    :cond_7
    const/4 v0, 0x0

    goto/16 :goto_2

    .line 314
    :cond_8
    iget-boolean v3, p0, Lcom/jirbo/adcolony/ae;->A:Z

    if-nez v3, :cond_9

    add-int/lit8 v3, v0, 0x1

    iget v4, p0, Lcom/jirbo/adcolony/ae;->u:I

    if-eq v3, v4, :cond_5

    .line 316
    :cond_9
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    aget-object v3, v3, v0

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->e:D

    invoke-virtual {v3, v4, v5}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 317
    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->au:[Lcom/jirbo/adcolony/ADCImage;

    aget-object v3, v3, v0

    invoke-virtual {v3, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 318
    int-to-double v4, v1

    const-wide v6, 0x4063a00000000000L    # 157.0

    iget-wide v8, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    double-to-int v1, v4

    goto :goto_4

    .line 332
    :cond_a
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v0, :cond_e

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_e

    .line 335
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->am:Lcom/jirbo/adcolony/ADCImage;

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->f:D

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 336
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->an:Lcom/jirbo/adcolony/ADCImage;

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->f:D

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 337
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ao:Lcom/jirbo/adcolony/ADCImage;

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->f:D

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 338
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ap:Lcom/jirbo/adcolony/ADCImage;

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->f:D

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 340
    sget-boolean v0, Lcom/jirbo/adcolony/a;->m:Z

    if-nez v0, :cond_b

    iget v0, p0, Lcom/jirbo/adcolony/ae;->i:I

    if-eqz v0, :cond_b

    iget v0, p0, Lcom/jirbo/adcolony/ae;->i:I

    :goto_5
    iput v0, p0, Lcom/jirbo/adcolony/ae;->i:I

    .line 341
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->j:I

    .line 342
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->k:I

    .line 343
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->l:I

    .line 346
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->H:Z

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->am:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/ae;->i:I

    iget v2, p0, Lcom/jirbo/adcolony/ae;->j:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 350
    :goto_6
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->I:Z

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ao:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/ae;->k:I

    iget v2, p0, Lcom/jirbo/adcolony/ae;->l:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 354
    :goto_7
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->i()V

    goto/16 :goto_0

    .line 340
    :cond_b
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->am:Lcom/jirbo/adcolony/ADCImage;

    iget v1, v1, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v0, v1

    goto :goto_5

    .line 347
    :cond_c
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->an:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/ae;->i:I

    iget v2, p0, Lcom/jirbo/adcolony/ae;->j:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto :goto_6

    .line 351
    :cond_d
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ap:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/ae;->k:I

    iget v2, p0, Lcom/jirbo/adcolony/ae;->l:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto :goto_7

    .line 362
    :cond_e
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v0, :cond_15

    .line 364
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v1

    int-to-double v2, v1

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/e;->getDuration()I

    move-result v1

    int-to-double v4, v1

    div-double/2addr v2, v4

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0, v2, v3, v1}, Lcom/jirbo/adcolony/d;->a(DLcom/jirbo/adcolony/AdColonyAd;)V

    .line 365
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->update(J)I

    .line 369
    :cond_f
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v1

    .line 370
    iget v0, p0, Lcom/jirbo/adcolony/ae;->s:I

    sub-int/2addr v0, v1

    .line 371
    add-int/lit16 v0, v0, 0x3e7

    div-int/lit16 v0, v0, 0x3e8

    .line 372
    iget-boolean v2, p0, Lcom/jirbo/adcolony/ae;->S:Z

    if-eqz v2, :cond_19

    const/4 v2, 0x1

    if-ne v0, v2, :cond_19

    const/4 v0, 0x0

    move v6, v0

    .line 373
    :goto_8
    if-nez v6, :cond_10

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->S:Z

    .line 375
    :cond_10
    const/16 v0, 0x1f4

    if-lt v1, v0, :cond_14

    .line 378
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->B:Z

    if-eqz v0, :cond_11

    .line 380
    const-wide v2, 0x4076800000000000L    # 360.0

    iget v0, p0, Lcom/jirbo/adcolony/ae;->s:I

    int-to-double v4, v0

    const-wide v8, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v8

    div-double/2addr v2, v4

    double-to-float v0, v2

    iput v0, p0, Lcom/jirbo/adcolony/ae;->aA:F

    .line 381
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ae;->B:Z

    .line 384
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 385
    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    const-string v3, "0123456789"

    const/4 v4, 0x0

    const/16 v5, 0x9

    invoke-virtual {v2, v3, v4, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 386
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->aD:F

    .line 390
    :cond_11
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->aB:F

    .line 391
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->aC:F

    .line 394
    iget v0, p0, Lcom/jirbo/adcolony/ae;->aD:F

    iput v0, p0, Lcom/jirbo/adcolony/ae;->aE:F

    .line 395
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    int-to-float v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/ae;->aD:F

    sub-float/2addr v0, v2

    iget v2, p0, Lcom/jirbo/adcolony/ae;->m:I

    int-to-float v2, v2

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/jirbo/adcolony/ae;->aF:F

    .line 396
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aH:Landroid/graphics/RectF;

    iget v2, p0, Lcom/jirbo/adcolony/ae;->aE:F

    iget v3, p0, Lcom/jirbo/adcolony/ae;->aD:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/jirbo/adcolony/ae;->aF:F

    const/high16 v4, 0x40000000    # 2.0f

    iget v5, p0, Lcom/jirbo/adcolony/ae;->aD:F

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/jirbo/adcolony/ae;->aE:F

    const/high16 v5, 0x40000000    # 2.0f

    iget v7, p0, Lcom/jirbo/adcolony/ae;->aD:F

    mul-float/2addr v5, v7

    add-float/2addr v4, v5

    iget v5, p0, Lcom/jirbo/adcolony/ae;->aF:F

    iget v7, p0, Lcom/jirbo/adcolony/ae;->aD:F

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    add-float/2addr v5, v7

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 399
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aG:Landroid/graphics/Paint;

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v2, v4

    double-to-int v2, v2

    int-to-float v2, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, -0x1000000

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 400
    iget v0, p0, Lcom/jirbo/adcolony/ae;->aA:F

    float-to-double v2, v0

    iget v0, p0, Lcom/jirbo/adcolony/ae;->s:I

    int-to-double v4, v0

    const-wide v8, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v8

    int-to-double v0, v1

    const-wide v8, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v8

    sub-double v0, v4, v0

    mul-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/jirbo/adcolony/ae;->az:F

    .line 401
    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aH:Landroid/graphics/RectF;

    const/high16 v2, 0x43870000    # 270.0f

    iget v3, p0, Lcom/jirbo/adcolony/ae;->az:F

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/jirbo/adcolony/ae;->aG:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 404
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-nez v0, :cond_12

    .line 406
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    const v1, -0x333334

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 407
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v2, v4

    double-to-int v1, v2

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, -0x1000000

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 408
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 409
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setLinearText(Z)V

    .line 410
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aH:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->aH:Landroid/graphics/RectF;

    .line 411
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    float-to-double v2, v2

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Paint$FontMetrics;->bottom:F

    float-to-double v4, v4

    const-wide v6, 0x3ff599999999999aL    # 1.35

    mul-double/2addr v4, v6

    add-double/2addr v2, v4

    double-to-float v2, v2

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->af:Landroid/graphics/Paint;

    .line 410
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 418
    :cond_12
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->M:Z

    if-eqz v0, :cond_13

    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-nez v0, :cond_13

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->O:Z

    if-eqz v0, :cond_13

    .line 420
    iget v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_16

    .line 422
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->al:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->al:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v1, v2

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->e:D

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    mul-double/2addr v2, v4

    double-to-int v2, v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    .line 431
    :cond_13
    :goto_9
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->L:Z

    if-eqz v0, :cond_14

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->P:Z

    if-eqz v0, :cond_14

    .line 433
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->G:Z

    if-nez v0, :cond_18

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->T:Z

    if-nez v0, :cond_18

    .line 435
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->J:Z

    if-eqz v0, :cond_17

    .line 437
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/jirbo/adcolony/ae;->aD:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v2, v2, Lcom/jirbo/adcolony/ADCVideo;->u:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/jirbo/adcolony/ae;->m:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/jirbo/adcolony/ae;->aD:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    float-to-int v3, v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->c(II)V

    .line 438
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ar:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;)V

    .line 447
    :goto_a
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ag:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 448
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->Z:Ljava/lang/String;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCImage;->e:Landroid/graphics/Rect;

    .line 449
    invoke-virtual {v2}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    int-to-double v2, v2

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->ag:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Paint$FontMetrics;->bottom:F

    float-to-double v4, v4

    const-wide v6, 0x3ff599999999999aL    # 1.35

    mul-double/2addr v4, v6

    add-double/2addr v2, v4

    double-to-float v2, v2

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->ag:Landroid/graphics/Paint;

    .line 448
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 462
    :cond_14
    :goto_b
    sget-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    if-eqz v0, :cond_15

    .line 464
    sget-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/w;->onDraw(Landroid/graphics/Canvas;)V

    .line 467
    :cond_15
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->i:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    goto/16 :goto_0

    .line 426
    :cond_16
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ak:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->ak:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v1, v2

    iget-wide v2, p0, Lcom/jirbo/adcolony/ae;->e:D

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    mul-double/2addr v2, v4

    double-to-int v2, v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto/16 :goto_9

    .line 442
    :cond_17
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/jirbo/adcolony/ae;->aD:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v2, v2, Lcom/jirbo/adcolony/ADCVideo;->u:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/jirbo/adcolony/ae;->m:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/jirbo/adcolony/ae;->aD:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    float-to-int v3, v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->c(II)V

    .line 443
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;)V

    goto/16 :goto_a

    .line 451
    :cond_18
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->G:Z

    if-nez v0, :cond_14

    iget-boolean v0, p0, Lcom/jirbo/adcolony/ae;->T:Z

    if-eqz v0, :cond_14

    .line 453
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v1, v1, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/jirbo/adcolony/ae;->aD:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iget-object v2, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v2, v2, Lcom/jirbo/adcolony/ADCVideo;->u:I

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/jirbo/adcolony/ae;->m:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcom/jirbo/adcolony/ae;->aD:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    float-to-int v3, v3

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->c(II)V

    .line 454
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;)V

    goto/16 :goto_b

    :cond_19
    move v6, v0

    goto/16 :goto_8
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 1253
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ae;->c(Z)V

    .line 1254
    return v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    .prologue
    .line 479
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget v0, v0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    sub-int/2addr v0, p2

    iput v0, p0, Lcom/jirbo/adcolony/ae;->m:I

    .line 481
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Kindle Fire"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x14

    iput v0, p0, Lcom/jirbo/adcolony/ae;->m:I

    .line 482
    :cond_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SCH-I800"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x19

    iput v0, p0, Lcom/jirbo/adcolony/ae;->m:I

    .line 483
    :cond_1
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SHW-M380K"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SHW-M380S"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SHW-M380W"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/16 v0, 0x28

    iput v0, p0, Lcom/jirbo/adcolony/ae;->m:I

    .line 484
    :cond_3
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .prologue
    const/4 v5, 0x3

    const-wide/16 v10, 0xfa

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 604
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    .line 607
    sget-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    if-eqz v0, :cond_0

    .line 609
    sget-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/w;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move v0, v2

    .line 788
    :goto_0
    return v0

    .line 614
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v1, v0

    .line 615
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    .line 620
    if-nez v4, :cond_7

    .line 623
    sget-boolean v4, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v4, :cond_3

    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v4, :cond_3

    .line 626
    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->am:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v4, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 628
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->H:Z

    .line 629
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    move v0, v2

    .line 630
    goto :goto_0

    .line 634
    :cond_1
    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->ao:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v4, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 636
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->I:Z

    .line 637
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    move v0, v2

    .line 638
    goto :goto_0

    :cond_2
    move v0, v3

    .line 642
    goto :goto_0

    .line 646
    :cond_3
    sget-boolean v4, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v4, :cond_4

    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->N:Z

    if-eqz v4, :cond_4

    .line 648
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-double v0, v0

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v4, v8

    div-double/2addr v0, v4

    double-to-int v1, v0

    .line 649
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v4}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v0, v4

    float-to-double v4, v0

    iget-wide v6, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-int v0, v4

    .line 651
    iget v4, p0, Lcom/jirbo/adcolony/ae;->t:I

    if-nez v4, :cond_4

    const/16 v4, 0xeb

    if-lt v0, v4, :cond_4

    const/16 v4, 0x131

    if-ge v0, v4, :cond_4

    .line 653
    invoke-virtual {p0, v1, v0}, Lcom/jirbo/adcolony/ae;->a(II)I

    move-result v4

    .line 654
    iput v4, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 655
    iput v4, p0, Lcom/jirbo/adcolony/ae;->u:I

    .line 656
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->A:Z

    .line 657
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    .line 662
    :cond_4
    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->M:Z

    if-eqz v4, :cond_5

    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->O:Z

    if-eqz v4, :cond_5

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v4, v4, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v4, :cond_5

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->ak:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v4, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 664
    const/16 v0, 0xa

    iput v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 665
    iget v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    iput v0, p0, Lcom/jirbo/adcolony/ae;->u:I

    .line 666
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->A:Z

    .line 667
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    move v0, v2

    .line 668
    goto/16 :goto_0

    .line 672
    :cond_5
    iget-boolean v3, p0, Lcom/jirbo/adcolony/ae;->L:Z

    if-eqz v3, :cond_14

    iget-boolean v3, p0, Lcom/jirbo/adcolony/ae;->P:Z

    if-eqz v3, :cond_14

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v3, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v3, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 674
    :cond_6
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->J:Z

    .line 675
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    move v0, v2

    .line 676
    goto/16 :goto_0

    .line 683
    :cond_7
    if-ne v4, v2, :cond_13

    .line 686
    sget-boolean v4, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v4, :cond_b

    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v4, :cond_b

    .line 689
    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->am:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v4, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->H:Z

    if-eqz v4, :cond_9

    .line 691
    const/4 v0, 0x4

    iput v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 692
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 693
    :cond_8
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aJ:Landroid/os/Handler;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aJ:Landroid/os/Handler;

    iget v3, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 694
    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 693
    invoke-virtual {v0, v1, v10, v11}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    move v0, v2

    .line 695
    goto/16 :goto_0

    .line 699
    :cond_9
    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->ao:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v4, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->I:Z

    if-eqz v4, :cond_b

    .line 701
    iput v5, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 702
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 703
    :cond_a
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aJ:Landroid/os/Handler;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aJ:Landroid/os/Handler;

    iget v3, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 704
    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 703
    invoke-virtual {v0, v1, v10, v11}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    move v0, v2

    .line 705
    goto/16 :goto_0

    .line 710
    :cond_b
    sget-boolean v4, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v4, :cond_c

    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->N:Z

    if-eqz v4, :cond_c

    .line 712
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCImage;->c()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-double v0, v0

    iget-wide v4, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v4, v8

    div-double/2addr v0, v4

    double-to-int v1, v0

    .line 713
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->aj:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v4}, Lcom/jirbo/adcolony/ADCImage;->d()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v0, v4

    float-to-double v4, v0

    iget-wide v6, p0, Lcom/jirbo/adcolony/ae;->e:D

    mul-double/2addr v6, v8

    div-double/2addr v4, v6

    double-to-int v0, v4

    .line 714
    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->A:Z

    if-nez v4, :cond_c

    const/16 v4, 0xeb

    if-lt v0, v4, :cond_c

    const/16 v4, 0x131

    if-ge v0, v4, :cond_c

    .line 716
    invoke-virtual {p0, v1, v0}, Lcom/jirbo/adcolony/ae;->a(II)I

    move-result v4

    .line 717
    if-lez v4, :cond_c

    iget v5, p0, Lcom/jirbo/adcolony/ae;->u:I

    if-ne v4, v5, :cond_c

    .line 719
    iget-object v5, p0, Lcom/jirbo/adcolony/ae;->aJ:Landroid/os/Handler;

    iget-object v6, p0, Lcom/jirbo/adcolony/ae;->aJ:Landroid/os/Handler;

    .line 720
    invoke-virtual {v6, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 719
    invoke-virtual {v5, v4, v10, v11}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 726
    :cond_c
    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->M:Z

    if-eqz v4, :cond_d

    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->O:Z

    if-eqz v4, :cond_d

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v4, v4, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v4, :cond_d

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->ak:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v4, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 728
    const/16 v0, 0xa

    iput v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 729
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->A:Z

    .line 730
    iget v0, p0, Lcom/jirbo/adcolony/ae;->t:I

    iput v0, p0, Lcom/jirbo/adcolony/ae;->u:I

    .line 731
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->aJ:Landroid/os/Handler;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae;->aJ:Landroid/os/Handler;

    iget v3, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 732
    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 731
    invoke-virtual {v0, v1, v10, v11}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    move v0, v2

    .line 733
    goto/16 :goto_0

    .line 737
    :cond_d
    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->L:Z

    if-eqz v4, :cond_12

    iget-boolean v4, p0, Lcom/jirbo/adcolony/ae;->P:Z

    if-eqz v4, :cond_12

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->aq:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v4, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v4

    if-nez v4, :cond_e

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->at:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {p0, v4, v1, v0}, Lcom/jirbo/adcolony/ae;->a(Lcom/jirbo/adcolony/ADCImage;II)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 739
    :cond_e
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->J:Z

    .line 742
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ab:Ljava/lang/String;

    const-string v1, "market:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ab:Ljava/lang/String;

    const-string v1, "amzn:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 744
    :cond_f
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    iget-object v4, p0, Lcom/jirbo/adcolony/ae;->ab:Ljava/lang/String;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCVideo;->startActivity(Landroid/content/Intent;)V

    .line 760
    :goto_1
    const-string v0, "in_video_engagement"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "{\"ad_slot\":"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v3, v3, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v3, v3, Lcom/jirbo/adcolony/ag;->c:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "}"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v3, v3, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-static {v0, v1, v3}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    move v0, v2

    .line 761
    goto/16 :goto_0

    .line 746
    :cond_10
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ab:Ljava/lang/String;

    const-string v1, "v4iap:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 748
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->m:Ljava/lang/String;

    iput-object v0, p0, Lcom/jirbo/adcolony/ae;->ac:Ljava/lang/String;

    .line 749
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    sget-object v1, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->OVERLAY:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    iput-object v1, v0, Lcom/jirbo/adcolony/AdColonyAd;->u:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    .line 750
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->L:Z

    .line 751
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->U:Z

    .line 752
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->T:Z

    .line 753
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->g()V

    goto :goto_1

    .line 757
    :cond_11
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->ab:Ljava/lang/String;

    sput-object v0, Lcom/jirbo/adcolony/AdColonyBrowser;->url:Ljava/lang/String;

    .line 758
    iget-object v0, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    new-instance v1, Landroid/content/Intent;

    iget-object v3, p0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    const-class v4, Lcom/jirbo/adcolony/AdColonyBrowser;

    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCVideo;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 765
    :cond_12
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->H:Z

    .line 766
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->I:Z

    .line 767
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->J:Z

    .line 768
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->A:Z

    .line 769
    iput v3, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 770
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    move v0, v2

    .line 771
    goto/16 :goto_0

    .line 777
    :cond_13
    if-ne v4, v5, :cond_14

    .line 780
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->H:Z

    .line 781
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->I:Z

    .line 782
    iput-boolean v3, p0, Lcom/jirbo/adcolony/ae;->J:Z

    .line 783
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ae;->A:Z

    .line 784
    iput v3, p0, Lcom/jirbo/adcolony/ae;->t:I

    .line 785
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    move v0, v2

    .line 786
    goto/16 :goto_0

    :cond_14
    move v0, v2

    .line 788
    goto/16 :goto_0
.end method
