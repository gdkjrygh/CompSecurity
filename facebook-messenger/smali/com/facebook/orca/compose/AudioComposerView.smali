.class public Lcom/facebook/orca/compose/AudioComposerView;
.super Lcom/facebook/widget/f;
.source "AudioComposerView.java"


# instance fields
.field private final a:Lcom/facebook/orca/d/af;

.field private final b:Lcom/facebook/orca/d/aq;

.field private final c:Lcom/facebook/orca/d/aw;

.field private final d:Lcom/facebook/orca/d/m;

.field private final e:Lcom/facebook/orca/nux/h;

.field private final f:Lcom/facebook/analytics/av;

.field private final g:Lcom/facebook/common/time/a;

.field private final h:Lcom/facebook/ui/media/attachments/d;

.field private final i:Landroid/widget/ImageView;

.field private final j:Landroid/widget/ImageView;

.field private final k:Landroid/widget/Button;

.field private final l:Ljava/lang/Runnable;

.field private final m:Ljava/lang/Runnable;

.field private n:Z

.field private o:Lcom/facebook/orca/compose/g;

.field private p:Z

.field private q:Z

.field private r:J

.field private s:Landroid/graphics/Rect;

.field private t:J

.field private final u:Lcom/facebook/orca/compose/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 150
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/compose/AudioComposerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 151
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/compose/AudioComposerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 155
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 158
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    new-instance v0, Lcom/facebook/orca/compose/a;

    invoke-direct {v0, p0}, Lcom/facebook/orca/compose/a;-><init>(Lcom/facebook/orca/compose/AudioComposerView;)V

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->l:Ljava/lang/Runnable;

    .line 78
    new-instance v0, Lcom/facebook/orca/compose/b;

    invoke-direct {v0, p0}, Lcom/facebook/orca/compose/b;-><init>(Lcom/facebook/orca/compose/AudioComposerView;)V

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->m:Ljava/lang/Runnable;

    .line 142
    new-instance v0, Lcom/facebook/orca/compose/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/compose/h;-><init>(Lcom/facebook/orca/compose/AudioComposerView;Lcom/facebook/orca/compose/a;)V

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->u:Lcom/facebook/orca/compose/h;

    .line 160
    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 161
    const-class v0, Lcom/facebook/orca/d/af;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/af;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    .line 162
    new-instance v0, Lcom/facebook/orca/d/aq;

    invoke-direct {v0, p0}, Lcom/facebook/orca/d/aq;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    .line 163
    const-class v0, Lcom/facebook/orca/d/aw;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/aw;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    .line 164
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/d/aw;->a(Landroid/view/View;)V

    .line 165
    const-class v0, Lcom/facebook/orca/d/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/m;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->d:Lcom/facebook/orca/d/m;

    .line 166
    const-class v0, Lcom/facebook/orca/nux/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/h;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->e:Lcom/facebook/orca/nux/h;

    .line 167
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->f:Lcom/facebook/analytics/av;

    .line 168
    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->g:Lcom/facebook/common/time/a;

    .line 169
    const-class v0, Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/d;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->h:Lcom/facebook/ui/media/attachments/d;

    .line 172
    sget v0, Lcom/facebook/k;->orca_audio_composer:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/AudioComposerView;->setContentView(I)V

    .line 173
    sget v0, Lcom/facebook/i;->audio_volume_indicator:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/AudioComposerView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->i:Landroid/widget/ImageView;

    .line 174
    sget v0, Lcom/facebook/i;->audio_composer_record_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/AudioComposerView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    .line 175
    sget v0, Lcom/facebook/i;->audio_composer_done_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/AudioComposerView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->k:Landroid/widget/Button;

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    new-instance v1, Lcom/facebook/orca/compose/c;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/c;-><init>(Lcom/facebook/orca/compose/AudioComposerView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 206
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->k:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/compose/d;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/d;-><init>(Lcom/facebook/orca/compose/AudioComposerView;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 217
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/AudioComposerView;->setFocusableInTouchMode(Z)V

    .line 218
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/AudioComposerView;J)J
    .locals 0

    .prologue
    .line 42
    iput-wide p1, p0, Lcom/facebook/orca/compose/AudioComposerView;->r:J

    return-wide p1
.end method

.method private a(Landroid/net/Uri;)V
    .locals 4

    .prologue
    .line 339
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_send"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 343
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->h:Lcom/facebook/ui/media/attachments/d;

    iget-object v1, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    invoke-virtual {v1}, Lcom/facebook/orca/d/af;->e()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/ui/media/attachments/d;->a(Landroid/net/Uri;J)Lcom/facebook/ui/media/attachments/a;

    move-result-object v0

    .line 347
    if-nez v0, :cond_0

    .line 348
    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/o;->audio_recording_attachment_error:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 353
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_creation_failed"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "error_message"

    const-string v3, "The attachment instance for audio clip can\'t be created."

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 366
    :goto_0
    return-void

    .line 362
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/compose/AudioComposerView;->o:Lcom/facebook/orca/compose/g;

    invoke-interface {v1, v0}, Lcom/facebook/orca/compose/g;->a(Lcom/facebook/ui/media/attachments/a;)V

    .line 365
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->e:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->r()V

    goto :goto_0
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 2

    .prologue
    .line 267
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->d()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->u:Lcom/facebook/orca/compose/h;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/h;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 289
    :cond_0
    :goto_0
    return-void

    .line 270
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/AudioComposerView;->c(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->n:Z

    if-nez v0, :cond_3

    .line 271
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->u:Lcom/facebook/orca/compose/h;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/h;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 272
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aw;->c()V

    .line 276
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->n:Z

    .line 277
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    sget-object v1, Lcom/facebook/orca/d/av;->TOOLTIP:Lcom/facebook/orca/d/av;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/aq;->a(Lcom/facebook/orca/d/av;)V

    goto :goto_0

    .line 274
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aw;->d()V

    goto :goto_1

    .line 278
    :cond_3
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/AudioComposerView;->c(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->n:Z

    if-eqz v0, :cond_0

    .line 281
    iget-boolean v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->p:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->q:Z

    if-nez v0, :cond_5

    .line 282
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    goto :goto_0

    .line 285
    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->n:Z

    .line 286
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    sget-object v1, Lcom/facebook/orca/d/av;->TOOLTIP_HOVER_OFF:Lcom/facebook/orca/d/av;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/aq;->a(Lcom/facebook/orca/d/av;)V

    .line 287
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aw;->b()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/compose/AudioComposerView;I)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/AudioComposerView;->setVolumeLevel(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/AudioComposerView;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/AudioComposerView;->a(Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/AudioComposerView;Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/AudioComposerView;->a(Landroid/view/MotionEvent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/AudioComposerView;)Z
    .locals 1

    .prologue
    .line 42
    iget-boolean v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->q:Z

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/compose/AudioComposerView;Z)Z
    .locals 0

    .prologue
    .line 42
    iput-boolean p1, p0, Lcom/facebook/orca/compose/AudioComposerView;->p:Z

    return p1
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 4

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->u:Lcom/facebook/orca/compose/h;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/AudioComposerView;->c(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->u:Lcom/facebook/orca/compose/h;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/h;->d()V

    .line 296
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->j()V

    .line 332
    :goto_0
    return-void

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->u:Lcom/facebook/orca/compose/h;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/h;->c()V

    .line 299
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->j()V

    .line 300
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aw;->a()V

    goto :goto_0

    .line 307
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->r:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/time/c;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/compose/AudioComposerView;->r:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x190

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 309
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_cancelled_too_short"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 312
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 313
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->j()V

    .line 314
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->b()V

    goto :goto_0

    .line 319
    :cond_3
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/AudioComposerView;->c(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 320
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_cancelled_by_user"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 323
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 324
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->j()V

    .line 325
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aw;->a()V

    goto :goto_0

    .line 328
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->m:Ljava/lang/Runnable;

    const-wide/16 v1, 0x12c

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/orca/compose/AudioComposerView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 331
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->j()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/compose/AudioComposerView;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->h()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/compose/AudioComposerView;Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/AudioComposerView;->b(Landroid/view/MotionEvent;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/compose/AudioComposerView;Z)Z
    .locals 0

    .prologue
    .line 42
    iput-boolean p1, p0, Lcom/facebook/orca/compose/AudioComposerView;->q:Z

    return p1
.end method

.method static synthetic c(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/compose/h;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->u:Lcom/facebook/orca/compose/h;

    return-object v0
.end method

.method private c(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    .line 384
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->s:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 385
    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42700000    # 60.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    .line 388
    new-instance v1, Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLeft()I

    move-result v2

    iget-object v3, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getTop()I

    move-result v3

    sub-int v0, v3, v0

    iget-object v3, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getRight()I

    move-result v3

    iget-object v4, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getBottom()I

    move-result v4

    invoke-direct {v1, v2, v0, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v1, p0, Lcom/facebook/orca/compose/AudioComposerView;->s:Landroid/graphics/Rect;

    .line 395
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v1, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLeft()I

    move-result v1

    add-int/2addr v0, v1

    .line 396
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getTop()I

    move-result v2

    add-int/2addr v1, v2

    .line 398
    iget-object v2, p0, Lcom/facebook/orca/compose/AudioComposerView;->s:Landroid/graphics/Rect;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/af;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/compose/AudioComposerView;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->j()V

    return-void
.end method

.method private e()Z
    .locals 4

    .prologue
    .line 260
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->g:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/compose/AudioComposerView;->t:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1f4

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    .line 262
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/compose/AudioComposerView;->g:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/facebook/orca/compose/AudioComposerView;->t:J

    .line 263
    return v0

    .line 260
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 372
    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/orca/activity/k;

    if-eqz v0, :cond_0

    .line 373
    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/activity/k;

    invoke-interface {v0}, Lcom/facebook/orca/activity/k;->c()Lcom/facebook/orca/common/ui/titlebar/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->m()V

    .line 375
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/compose/AudioComposerView;)Z
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->e()Z

    move-result v0

    return v0
.end method

.method private g()V
    .locals 1

    .prologue
    .line 378
    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/orca/activity/k;

    if-eqz v0, :cond_0

    .line 379
    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/activity/k;

    invoke-interface {v0}, Lcom/facebook/orca/activity/k;->c()Lcom/facebook/orca/common/ui/titlebar/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->n()V

    .line 381
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/compose/AudioComposerView;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->i()V

    return-void
.end method

.method private h()V
    .locals 3

    .prologue
    .line 406
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->e()V

    .line 407
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_record_button_selected:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 409
    return-void
.end method

.method static synthetic h(Lcom/facebook/orca/compose/AudioComposerView;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->g()V

    return-void
.end method

.method static synthetic i(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/compose/g;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->o:Lcom/facebook/orca/compose/g;

    return-object v0
.end method

.method private i()V
    .locals 3

    .prologue
    .line 412
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_record_button_pressed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 414
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->f()V

    .line 415
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->d:Lcom/facebook/orca/d/m;

    invoke-virtual {v0}, Lcom/facebook/orca/d/m;->b()V

    .line 416
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->n:Z

    .line 418
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->f()V

    .line 419
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aw;->d()V

    .line 420
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->l:Ljava/lang/Runnable;

    const-wide/16 v1, 0x190

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/orca/compose/AudioComposerView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 422
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 423
    iget-object v1, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    new-instance v2, Lcom/facebook/orca/compose/e;

    invoke-direct {v2, p0, v0}, Lcom/facebook/orca/compose/e;-><init>(Lcom/facebook/orca/compose/AudioComposerView;Landroid/os/Handler;)V

    invoke-virtual {v1, v2}, Lcom/facebook/orca/d/af;->a(Lcom/facebook/orca/d/ao;)V

    .line 487
    return-void
.end method

.method private j()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 493
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->l:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/AudioComposerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 494
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->r:J

    .line 495
    iput-boolean v2, p0, Lcom/facebook/orca/compose/AudioComposerView;->q:Z

    .line 496
    iput-boolean v2, p0, Lcom/facebook/orca/compose/AudioComposerView;->p:Z

    .line 497
    invoke-direct {p0, v2}, Lcom/facebook/orca/compose/AudioComposerView;->setVolumeLevel(I)V

    .line 498
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->d()V

    .line 499
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->f()V

    .line 500
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aw;->d()V

    .line 501
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->j:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_record_button_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 503
    invoke-direct {p0}, Lcom/facebook/orca/compose/AudioComposerView;->g()V

    .line 504
    return-void
.end method

.method static synthetic j(Lcom/facebook/orca/compose/AudioComposerView;)Z
    .locals 1

    .prologue
    .line 42
    iget-boolean v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->p:Z

    return v0
.end method

.method static synthetic k(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/aq;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    return-object v0
.end method

.method static synthetic l(Lcom/facebook/orca/compose/AudioComposerView;)Lcom/facebook/orca/d/aw;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->c:Lcom/facebook/orca/d/aw;

    return-object v0
.end method

.method static synthetic m(Lcom/facebook/orca/compose/AudioComposerView;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->m:Ljava/lang/Runnable;

    return-object v0
.end method

.method private setVolumeLevel(I)V
    .locals 1

    .prologue
    .line 507
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->i:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/LevelListDrawable;

    .line 508
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/LevelListDrawable;->setLevel(I)Z

    .line 509
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 221
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "audio_clips_show_composer"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "audio_clips"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->e:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->a()V

    .line 229
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/compose/AudioComposerView;->requestFocus()Z

    .line 230
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->f()V

    .line 234
    return-void
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 512
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->d()Z

    move-result v0

    return v0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 516
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->b:Lcom/facebook/orca/d/aq;

    invoke-virtual {v0}, Lcom/facebook/orca/d/aq;->g()V

    .line 517
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 247
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->a:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 241
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/f;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 251
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/f;->onLayout(ZIIII)V

    .line 252
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/compose/AudioComposerView;->s:Landroid/graphics/Rect;

    .line 253
    return-void
.end method

.method public setListener(Lcom/facebook/orca/compose/g;)V
    .locals 0

    .prologue
    .line 256
    iput-object p1, p0, Lcom/facebook/orca/compose/AudioComposerView;->o:Lcom/facebook/orca/compose/g;

    .line 257
    return-void
.end method
