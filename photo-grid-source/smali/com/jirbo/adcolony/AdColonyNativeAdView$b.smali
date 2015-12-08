.class Lcom/jirbo/adcolony/AdColonyNativeAdView$b;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field a:Z

.field final synthetic b:Lcom/jirbo/adcolony/AdColonyNativeAdView;


# direct methods
.method public constructor <init>(Lcom/jirbo/adcolony/AdColonyNativeAdView;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 1107
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    .line 1108
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1109
    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 1117
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->g:Landroid/view/ViewGroup;

    .line 1120
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 1122
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->n:Z

    if-eqz v1, :cond_0

    iput-boolean v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->a:Z

    .line 1124
    :cond_0
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v1, v2, :cond_a

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->z:Z

    if-eqz v1, :cond_a

    .line 1126
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->n:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->n:Z

    if-eqz v1, :cond_3

    iget v1, v0, Landroid/graphics/Rect;->top:I

    if-eqz v1, :cond_1

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->getNativeAdHeight()I

    move-result v2

    if-le v1, v2, :cond_3

    :cond_1
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->top:I

    sub-int v0, v1, v0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    .line 1127
    invoke-virtual {v1}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->getNativeAdHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    if-le v0, v1, :cond_3

    .line 1129
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->a:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->A:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v4}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->a(Z)Z

    .line 1131
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->t:Z

    if-nez v0, :cond_7

    .line 1134
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "[ADC] Native Ad Starting"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 1135
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->b()V

    .line 1136
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iput-boolean v4, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->t:Z

    .line 1137
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v1, "native"

    iput-object v1, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->j:Ljava/lang/String;

    .line 1138
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v1, "native"

    iput-object v1, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->k:Ljava/lang/String;

    .line 1159
    :cond_3
    :goto_0
    iput-boolean v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->a:Z

    .line 1165
    :goto_1
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_4

    invoke-static {}, Lcom/jirbo/adcolony/q;->c()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1167
    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 1168
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1169
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iput-boolean v4, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    .line 1172
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1174
    invoke-virtual {p0, v5}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 1175
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1186
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->A:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->invalidate()V

    .line 1187
    :cond_6
    return-void

    .line 1141
    :cond_7
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->v:Z

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/jirbo/adcolony/q;->c()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_9

    sget-boolean v0, Lcom/jirbo/adcolony/a;->t:Z

    if-nez v0, :cond_9

    .line 1144
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "[ADC] Native Ad Resuming"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 1145
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v1, "video_resumed"

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 1146
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->r:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    invoke-virtual {v0, v4}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->c(Z)V

    .line 1147
    :cond_8
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->setVolume(F)V

    .line 1148
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget v1, v1, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->p:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 1149
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    goto/16 :goto_0

    .line 1151
    :cond_9
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->t:Z

    if-nez v0, :cond_3

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v4, v3}, Lcom/jirbo/adcolony/d;->a(Ljava/lang/String;ZZ)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1153
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iput-boolean v4, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    .line 1154
    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 1155
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    .line 1163
    :cond_a
    iput-boolean v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->a:Z

    goto/16 :goto_1

    .line 1177
    :cond_b
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->v:Z

    if-eqz v0, :cond_5

    .line 1180
    :cond_c
    const/16 v0, 0xff

    invoke-virtual {p1, v0, v3, v3, v3}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 1181
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1182
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->N:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyNativeAdView;->N:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget v2, v2, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->b:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyNativeAdView;->N:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/ADCImage;->a(Landroid/graphics/Canvas;II)V

    goto/16 :goto_2
.end method
