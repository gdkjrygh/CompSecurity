.class public final Lcom/kik/cards/web/video/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cards/web/video/b$1;,
        Lcom/kik/cards/web/video/b$a;
    }
.end annotation


# static fields
.field private static b:Lcom/kik/cards/web/video/b;


# instance fields
.field private a:I

.field private c:Ljava/lang/String;

.field private d:Lkik/android/widget/WebVideoView;

.field private e:Lcom/kik/cards/web/video/VideoPlayerPlugin;

.field private f:Lkik/android/chat/fragment/WebVideoFragment;

.field private g:Z

.field private h:Z

.field private i:Landroid/support/v4/app/FragmentActivity;

.field private j:Lcom/kik/cards/web/video/a;

.field private k:I

.field private l:Z


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object v0, p0, Lcom/kik/cards/web/video/b;->c:Ljava/lang/String;

    .line 34
    iput-boolean v1, p0, Lcom/kik/cards/web/video/b;->h:Z

    .line 36
    iput-object v0, p0, Lcom/kik/cards/web/video/b;->j:Lcom/kik/cards/web/video/a;

    .line 37
    sget v0, Lcom/kik/cards/web/video/b$a;->a:I

    iput v0, p0, Lcom/kik/cards/web/video/b;->k:I

    .line 38
    iput-boolean v1, p0, Lcom/kik/cards/web/video/b;->l:Z

    .line 46
    return-void
.end method

.method public static a()Lcom/kik/cards/web/video/b;
    .locals 1

    .prologue
    .line 51
    sget-object v0, Lcom/kik/cards/web/video/b;->b:Lcom/kik/cards/web/video/b;

    if-nez v0, :cond_0

    .line 52
    new-instance v0, Lcom/kik/cards/web/video/b;

    invoke-direct {v0}, Lcom/kik/cards/web/video/b;-><init>()V

    sput-object v0, Lcom/kik/cards/web/video/b;->b:Lcom/kik/cards/web/video/b;

    .line 54
    :cond_0
    sget-object v0, Lcom/kik/cards/web/video/b;->b:Lcom/kik/cards/web/video/b;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/cards/web/video/b;)Lkik/android/chat/fragment/WebVideoFragment;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->f:Lkik/android/chat/fragment/WebVideoFragment;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/cards/web/video/b;Z)Z
    .locals 0

    .prologue
    .line 25
    iput-boolean p1, p0, Lcom/kik/cards/web/video/b;->l:Z

    return p1
.end method

.method static synthetic b(Lcom/kik/cards/web/video/b;)Lkik/android/widget/WebVideoView;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cards/web/video/b;)Z
    .locals 1

    .prologue
    .line 25
    iget-boolean v0, p0, Lcom/kik/cards/web/video/b;->h:Z

    return v0
.end method

.method static synthetic d(Lcom/kik/cards/web/video/b;)Z
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cards/web/video/b;->g:Z

    return v0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 271
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0, p1}, Lkik/android/widget/WebVideoView;->a(I)V

    .line 272
    iget v0, p0, Lcom/kik/cards/web/video/b;->k:I

    sget v1, Lcom/kik/cards/web/video/b$a;->c:I

    if-ne v0, v1, :cond_0

    .line 273
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->a()V

    .line 275
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/kik/cards/web/video/b;->i:Landroid/support/v4/app/FragmentActivity;

    .line 60
    return-void
.end method

.method public final a(Lcom/kik/cards/web/video/VideoPlayerPlugin;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/kik/cards/web/video/b;->e:Lcom/kik/cards/web/video/VideoPlayerPlugin;

    .line 70
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/video/b;->g:Z

    .line 90
    iget v0, p0, Lcom/kik/cards/web/video/b;->k:I

    sget v1, Lcom/kik/cards/web/video/b$a;->a:I

    if-eq v0, v1, :cond_2

    .line 91
    invoke-virtual {p0}, Lcom/kik/cards/web/video/b;->i()V

    .line 92
    invoke-virtual {p0}, Lcom/kik/cards/web/video/b;->j()V

    .line 98
    :cond_0
    :goto_0
    invoke-static {p1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 99
    iput-object p1, p0, Lcom/kik/cards/web/video/b;->c:Ljava/lang/String;

    .line 100
    new-instance v0, Lkik/android/widget/WebVideoView;

    iget-object v1, p0, Lcom/kik/cards/web/video/b;->i:Landroid/support/v4/app/FragmentActivity;

    invoke-direct {v0, v1}, Lkik/android/widget/WebVideoView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0, p1}, Lkik/android/widget/WebVideoView;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    new-instance v1, Lcom/kik/cards/web/video/c;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/video/c;-><init>(Lcom/kik/cards/web/video/b;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/WebVideoView;->a(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    new-instance v1, Lcom/kik/cards/web/video/d;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/video/d;-><init>(Lcom/kik/cards/web/video/b;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/WebVideoView;->a(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->k()V

    .line 102
    :cond_1
    return-void

    .line 94
    :cond_2
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->c:Ljava/lang/String;

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    invoke-virtual {p0}, Lcom/kik/cards/web/video/b;->j()V

    goto :goto_0
.end method

.method public final a(Lkik/android/chat/fragment/WebVideoFragment;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/kik/cards/web/video/b;->f:Lkik/android/chat/fragment/WebVideoFragment;

    .line 65
    return-void
.end method

.method public final b(I)V
    .locals 4

    .prologue
    .line 316
    sparse-switch p1, :sswitch_data_0

    .line 337
    const-string v1, "UNKNOWN"

    .line 338
    const-string v0, "UNKNOWN"

    .line 341
    :goto_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 342
    const-string v3, "type"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 343
    const-string v1, "message"

    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 345
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->e:Lcom/kik/cards/web/video/VideoPlayerPlugin;

    invoke-virtual {v0, v2}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->a(Lorg/json/JSONObject;)V

    .line 347
    return-void

    .line 321
    :sswitch_0
    const-string v1, "NETWORK"

    .line 322
    const-string v0, "IO MEDIA ERROR"

    goto :goto_0

    .line 325
    :sswitch_1
    const-string v1, "PLAYBACK"

    .line 326
    const-string v0, "Malformed bitstream"

    goto :goto_0

    .line 329
    :sswitch_2
    const-string v1, "PLAYBACK"

    .line 330
    const-string v0, "Unsupported file type"

    goto :goto_0

    .line 333
    :sswitch_3
    const-string v1, "NETWORK"

    .line 334
    const-string v0, "Network time out"

    goto :goto_0

    .line 316
    :sswitch_data_0
    .sparse-switch
        -0x3f2 -> :sswitch_2
        -0x3ef -> :sswitch_1
        -0x3ec -> :sswitch_0
        -0x6e -> :sswitch_3
    .end sparse-switch
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lcom/kik/cards/web/video/b;->g:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 79
    iget-boolean v0, p0, Lcom/kik/cards/web/video/b;->h:Z

    return v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cards/web/video/b;->h:Z

    .line 85
    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final f()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 157
    sget-object v0, Lcom/kik/cards/web/video/b$1;->a:[I

    iget v1, p0, Lcom/kik/cards/web/video/b;->k:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 177
    :goto_0
    return-void

    .line 159
    :pswitch_0
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->i:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getRequestedOrientation()I

    move-result v0

    iput v0, p0, Lcom/kik/cards/web/video/b;->a:I

    .line 160
    iput-boolean v2, p0, Lcom/kik/cards/web/video/b;->h:Z

    .line 161
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    .line 162
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->q()I

    move-result v0

    .line 163
    iget-object v1, p0, Lcom/kik/cards/web/video/b;->c:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/kik/cards/web/video/b;->a(Ljava/lang/String;)V

    .line 164
    iput-boolean v2, p0, Lcom/kik/cards/web/video/b;->h:Z

    .line 165
    iget-object v1, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v1, v0}, Lkik/android/widget/WebVideoView;->a(I)V

    .line 167
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/WebVideoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/WebVideoFragment$a;-><init>()V

    .line 168
    iget-object v1, p0, Lcom/kik/cards/web/video/b;->i:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 176
    :goto_1
    sget v0, Lcom/kik/cards/web/video/b$a;->c:I

    iput v0, p0, Lcom/kik/cards/web/video/b;->k:I

    goto :goto_0

    .line 171
    :pswitch_1
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->a()V

    goto :goto_1

    .line 157
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final g()Lkik/android/widget/WebVideoView;
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    .line 186
    iget v0, p0, Lcom/kik/cards/web/video/b;->k:I

    sget v1, Lcom/kik/cards/web/video/b$a;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 195
    iget v0, p0, Lcom/kik/cards/web/video/b;->k:I

    sget v1, Lcom/kik/cards/web/video/b$a;->a:I

    if-eq v0, v1, :cond_1

    .line 196
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->f:Lkik/android/chat/fragment/WebVideoFragment;

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->f:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/WebVideoFragment;->b()V

    .line 198
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->f:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/WebVideoFragment;->J()V

    .line 200
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cards/web/video/b;->f:Lkik/android/chat/fragment/WebVideoFragment;

    .line 201
    invoke-virtual {p0}, Lcom/kik/cards/web/video/b;->u()V

    .line 203
    :cond_1
    return-void
.end method

.method public final j()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 211
    iput-object v0, p0, Lcom/kik/cards/web/video/b;->c:Ljava/lang/String;

    .line 212
    iput-boolean v1, p0, Lcom/kik/cards/web/video/b;->h:Z

    .line 213
    iput-object v0, p0, Lcom/kik/cards/web/video/b;->f:Lkik/android/chat/fragment/WebVideoFragment;

    .line 214
    iput-boolean v1, p0, Lcom/kik/cards/web/video/b;->l:Z

    .line 215
    iput-object v0, p0, Lcom/kik/cards/web/video/b;->j:Lcom/kik/cards/web/video/a;

    .line 216
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    if-eqz v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->j()V

    .line 218
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->m()V

    .line 220
    :cond_0
    return-void
.end method

.method public final k()Z
    .locals 1

    .prologue
    .line 224
    iget-boolean v0, p0, Lcom/kik/cards/web/video/b;->l:Z

    return v0
.end method

.method public final l()V
    .locals 1

    .prologue
    .line 229
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/video/b;->l:Z

    .line 230
    return-void
.end method

.method public final m()Z
    .locals 2

    .prologue
    .line 234
    iget v0, p0, Lcom/kik/cards/web/video/b;->k:I

    sget v1, Lcom/kik/cards/web/video/b$a;->a:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final n()I
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->p()I

    move-result v0

    return v0
.end method

.method public final o()I
    .locals 1

    .prologue
    .line 244
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->o()I

    move-result v0

    return v0
.end method

.method public final p()V
    .locals 2

    .prologue
    .line 249
    sget-object v0, Lcom/kik/cards/web/video/b$1;->a:[I

    iget v1, p0, Lcom/kik/cards/web/video/b;->k:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 260
    :goto_0
    :pswitch_0
    return-void

    .line 251
    :pswitch_1
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->b()V

    goto :goto_0

    .line 254
    :pswitch_2
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->i:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getRequestedOrientation()I

    move-result v0

    iput v0, p0, Lcom/kik/cards/web/video/b;->a:I

    .line 255
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/video/b;->h:Z

    .line 256
    new-instance v0, Lkik/android/chat/fragment/WebVideoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/WebVideoFragment$a;-><init>()V

    .line 257
    iget-object v1, p0, Lcom/kik/cards/web/video/b;->i:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 258
    invoke-virtual {p0}, Lcom/kik/cards/web/video/b;->s()V

    goto :goto_0

    .line 249
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final q()Z
    .locals 2

    .prologue
    .line 266
    iget v0, p0, Lcom/kik/cards/web/video/b;->k:I

    sget v1, Lcom/kik/cards/web/video/b$a;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final r()V
    .locals 1

    .prologue
    .line 284
    sget v0, Lcom/kik/cards/web/video/b$a;->c:I

    iput v0, p0, Lcom/kik/cards/web/video/b;->k:I

    .line 285
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->e:Lcom/kik/cards/web/video/VideoPlayerPlugin;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->c()V

    .line 286
    return-void
.end method

.method public final s()V
    .locals 1

    .prologue
    .line 290
    sget v0, Lcom/kik/cards/web/video/b$a;->b:I

    iput v0, p0, Lcom/kik/cards/web/video/b;->k:I

    .line 291
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->e:Lcom/kik/cards/web/video/VideoPlayerPlugin;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->d()V

    .line 292
    return-void
.end method

.method public final t()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x3e8

    .line 296
    sget v0, Lcom/kik/cards/web/video/b$a;->a:I

    iput v0, p0, Lcom/kik/cards/web/video/b;->k:I

    .line 297
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->j:Lcom/kik/cards/web/video/a;

    if-nez v0, :cond_0

    .line 298
    new-instance v0, Lcom/kik/cards/web/video/a;

    iget-object v1, p0, Lcom/kik/cards/web/video/b;->c:Ljava/lang/String;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    div-long/2addr v2, v4

    invoke-direct {v0, v1, v2, v3}, Lcom/kik/cards/web/video/a;-><init>(Ljava/lang/String;J)V

    iput-object v0, p0, Lcom/kik/cards/web/video/b;->j:Lcom/kik/cards/web/video/a;

    .line 303
    :goto_0
    return-void

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->j:Lcom/kik/cards/web/video/a;

    iget-object v1, p0, Lcom/kik/cards/web/video/b;->c:Ljava/lang/String;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    div-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/cards/web/video/a;->a(Ljava/lang/String;J)V

    goto :goto_0
.end method

.method public final u()V
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->n()V

    .line 310
    :cond_0
    sget v0, Lcom/kik/cards/web/video/b$a;->a:I

    iput v0, p0, Lcom/kik/cards/web/video/b;->k:I

    .line 311
    iget-object v0, p0, Lcom/kik/cards/web/video/b;->e:Lcom/kik/cards/web/video/VideoPlayerPlugin;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/VideoPlayerPlugin;->j()V

    .line 312
    return-void
.end method

.method public final v()I
    .locals 1

    .prologue
    .line 351
    iget v0, p0, Lcom/kik/cards/web/video/b;->a:I

    return v0
.end method

.method public final w()Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 360
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 361
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 362
    iget-object v2, p0, Lcom/kik/cards/web/video/b;->j:Lcom/kik/cards/web/video/a;

    if-nez v2, :cond_0

    .line 363
    const-string v1, "completion"

    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 370
    :goto_0
    return-object v0

    .line 366
    :cond_0
    const-string v2, "url"

    iget-object v3, p0, Lcom/kik/cards/web/video/b;->j:Lcom/kik/cards/web/video/a;

    invoke-virtual {v3}, Lcom/kik/cards/web/video/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 367
    const-string v2, "time"

    iget-object v3, p0, Lcom/kik/cards/web/video/b;->j:Lcom/kik/cards/web/video/a;

    invoke-virtual {v3}, Lcom/kik/cards/web/video/a;->b()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 368
    const-string v2, "completion"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0
.end method
