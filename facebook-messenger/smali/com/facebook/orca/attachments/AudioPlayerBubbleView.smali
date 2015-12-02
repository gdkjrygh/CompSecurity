.class public Lcom/facebook/orca/attachments/AudioPlayerBubbleView;
.super Lcom/facebook/widget/e;
.source "AudioPlayerBubbleView.java"


# instance fields
.field private final a:Landroid/widget/ImageView;

.field private final b:Landroid/view/View;

.field private final c:Landroid/widget/TextView;

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    sget v0, Lcom/facebook/k;->orca_audio_player_bubble:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setContentView(I)V

    .line 46
    sget v0, Lcom/facebook/i;->audio_play_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a:Landroid/widget/ImageView;

    .line 47
    sget v0, Lcom/facebook/i;->audio_wave_form:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->b:Landroid/view/View;

    .line 48
    sget v0, Lcom/facebook/i;->audio_timer:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->c:Landroid/widget/TextView;

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->f:Z

    .line 51
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 128
    iget-boolean v1, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->g:Z

    if-eqz v1, :cond_0

    instance-of v1, v0, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v1, :cond_0

    .line 129
    iget-object v1, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 130
    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 137
    :goto_0
    return-void

    .line 132
    :cond_0
    instance-of v1, v0, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v1, :cond_1

    .line 133
    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 135
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a:Landroid/widget/ImageView;

    iget-boolean v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->e:Landroid/graphics/drawable/Drawable;

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->d:Landroid/graphics/drawable/Drawable;

    goto :goto_1
.end method


# virtual methods
.method public setIsLoading(Z)V
    .locals 0

    .prologue
    .line 118
    iput-boolean p1, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->g:Z

    .line 119
    invoke-direct {p0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a()V

    .line 120
    return-void
.end method

.method public setIsPlaying(Z)V
    .locals 0

    .prologue
    .line 113
    iput-boolean p1, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->f:Z

    .line 114
    invoke-direct {p0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a()V

    .line 115
    return-void
.end method

.method public setTimerText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    return-void
.end method

.method public setType(Lcom/facebook/orca/attachments/d;)V
    .locals 8

    .prologue
    .line 61
    sget-object v0, Lcom/facebook/orca/attachments/c;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/attachments/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 110
    :goto_0
    return-void

    .line 63
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_audio_loading_spinner_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 64
    sget v5, Lcom/facebook/h;->orca_voice_bubble_right_normal_button:I

    .line 65
    sget v4, Lcom/facebook/h;->orca_voice_pattern_right_normal:I

    .line 66
    sget v3, Lcom/facebook/h;->orca_voice_timerbg_right_normal:I

    .line 67
    sget v2, Lcom/facebook/h;->audio_player_timer_text_right_normal:I

    .line 68
    sget v1, Lcom/facebook/h;->orca_voice_play_right_normal:I

    .line 69
    sget v0, Lcom/facebook/h;->orca_voice_pause_right_normal:I

    move v7, v0

    move v0, v4

    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v7

    .line 100
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 101
    invoke-virtual {p0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 102
    sget-object v5, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/BitmapDrawable;->setTileModeX(Landroid/graphics/Shader$TileMode;)V

    .line 103
    iget-object v5, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->b:Landroid/view/View;

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 107
    invoke-virtual {p0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->d:Landroid/graphics/drawable/Drawable;

    .line 108
    invoke-virtual {p0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->e:Landroid/graphics/drawable/Drawable;

    .line 109
    invoke-direct {p0}, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a()V

    goto :goto_0

    .line 72
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioPlayerBubbleView;->a:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_audio_loading_spinner_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 73
    sget v5, Lcom/facebook/h;->orca_voice_bubble_left_normal_button:I

    .line 74
    sget v4, Lcom/facebook/h;->orca_voice_pattern_left_normal:I

    .line 75
    sget v3, Lcom/facebook/h;->orca_voice_timerbg_left_normal:I

    .line 76
    sget v2, Lcom/facebook/h;->audio_player_timer_text_left_normal:I

    .line 77
    sget v1, Lcom/facebook/h;->orca_voice_play_left_normal:I

    .line 78
    sget v0, Lcom/facebook/h;->orca_voice_pause_left_normal:I

    move v7, v0

    move v0, v4

    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v7

    .line 79
    goto :goto_1

    .line 81
    :pswitch_2
    sget v5, Lcom/facebook/h;->orca_voice_bubble_right_selected_button:I

    .line 82
    sget v4, Lcom/facebook/h;->orca_voice_pattern_right_selected:I

    .line 83
    sget v3, Lcom/facebook/h;->orca_voice_timerbg_right_selected:I

    .line 84
    sget v2, Lcom/facebook/h;->audio_player_timer_text_right_selected:I

    .line 85
    sget v1, Lcom/facebook/h;->orca_voice_play_right_selected:I

    .line 86
    sget v0, Lcom/facebook/h;->orca_voice_pause_right_selected:I

    move v7, v0

    move v0, v4

    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v7

    .line 87
    goto :goto_1

    .line 89
    :pswitch_3
    sget v5, Lcom/facebook/h;->orca_voice_bubble_left_selected_button:I

    .line 90
    sget v4, Lcom/facebook/h;->orca_voice_pattern_left_selected:I

    .line 91
    sget v3, Lcom/facebook/h;->orca_voice_timerbg_left_selected:I

    .line 92
    sget v2, Lcom/facebook/h;->audio_player_timer_text_left_selected:I

    .line 93
    sget v1, Lcom/facebook/h;->orca_voice_play_left_selected:I

    .line 94
    sget v0, Lcom/facebook/h;->orca_voice_pause_left_selected:I

    move v7, v0

    move v0, v4

    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v7

    .line 95
    goto/16 :goto_1

    .line 61
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
