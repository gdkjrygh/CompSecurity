.class public Lcom/facebook/orca/fbwebrtc/bb;
.super Ljava/lang/Object;
.source "WebrtcUiHandler.java"

# interfaces
.implements Lcom/facebook/webrtc/IWebrtcUiInterface;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:[J


# instance fields
.field private A:I

.field private B:I

.field private C:Z

.field private D:J

.field private E:J

.field private F:J

.field private G:I

.field private final H:Ljava/lang/Runnable;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/c/s;

.field private final e:Lcom/facebook/orca/fbwebrtc/ax;

.field private final f:Lcom/facebook/push/mqtt/v;

.field private final g:Lcom/facebook/prefs/shared/d;

.field private final h:Lcom/facebook/orca/fbwebrtc/a;

.field private final i:Landroid/media/AudioManager;

.field private final j:Landroid/telephony/TelephonyManager;

.field private final k:Landroid/telephony/PhoneStateListener;

.field private final l:Ljava/util/concurrent/Executor;

.field private final m:Ljava/util/concurrent/ScheduledExecutorService;

.field private final n:Lcom/facebook/common/time/a;

.field private final o:Lcom/facebook/common/executors/a;

.field private final p:Landroid/support/v4/a/e;

.field private final q:Landroid/os/Handler;

.field private r:Lcom/facebook/orca/fbwebrtc/ag;

.field private s:Landroid/media/MediaPlayer;

.field private t:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private u:Landroid/os/Vibrator;

.field private v:Lcom/facebook/webrtc/IWebrtcUiInterface;

.field private w:Z

.field private x:J

.field private y:I

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    const-class v0, Lcom/facebook/orca/fbwebrtc/bb;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    .line 54
    const/4 v0, 0x3

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lcom/facebook/orca/fbwebrtc/bb;->b:[J

    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0x320
        0x72e
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/c/s;Lcom/facebook/orca/fbwebrtc/ax;Lcom/facebook/push/mqtt/v;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/fbwebrtc/a;Landroid/media/AudioManager;Landroid/os/Vibrator;Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/common/time/a;Lcom/facebook/common/executors/a;Landroid/support/v4/a/e;Landroid/os/Handler;)V
    .locals 2

    .prologue
    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 788
    new-instance v1, Lcom/facebook/orca/fbwebrtc/bi;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/bi;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    iput-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->H:Ljava/lang/Runnable;

    .line 112
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bb;->c:Landroid/content/Context;

    .line 113
    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/bb;->d:Lcom/facebook/c/s;

    .line 114
    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/bb;->e:Lcom/facebook/orca/fbwebrtc/ax;

    .line 115
    iput-object p4, p0, Lcom/facebook/orca/fbwebrtc/bb;->f:Lcom/facebook/push/mqtt/v;

    .line 116
    iput-object p5, p0, Lcom/facebook/orca/fbwebrtc/bb;->g:Lcom/facebook/prefs/shared/d;

    .line 117
    iput-object p6, p0, Lcom/facebook/orca/fbwebrtc/bb;->h:Lcom/facebook/orca/fbwebrtc/a;

    .line 118
    iput-object p7, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    .line 119
    iput-object p8, p0, Lcom/facebook/orca/fbwebrtc/bb;->u:Landroid/os/Vibrator;

    .line 120
    iput-object p9, p0, Lcom/facebook/orca/fbwebrtc/bb;->j:Landroid/telephony/TelephonyManager;

    .line 121
    iput-object p10, p0, Lcom/facebook/orca/fbwebrtc/bb;->l:Ljava/util/concurrent/Executor;

    .line 122
    iput-object p11, p0, Lcom/facebook/orca/fbwebrtc/bb;->m:Ljava/util/concurrent/ScheduledExecutorService;

    .line 123
    iput-object p12, p0, Lcom/facebook/orca/fbwebrtc/bb;->n:Lcom/facebook/common/time/a;

    .line 124
    iput-object p13, p0, Lcom/facebook/orca/fbwebrtc/bb;->o:Lcom/facebook/common/executors/a;

    .line 125
    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->p:Landroid/support/v4/a/e;

    .line 126
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->q:Landroid/os/Handler;

    .line 128
    const/4 v1, 0x0

    iput v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    .line 130
    new-instance v1, Lcom/facebook/orca/fbwebrtc/bc;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/bc;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    iput-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->k:Landroid/telephony/PhoneStateListener;

    .line 141
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/bb;)Landroid/media/AudioManager;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 182
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->l()I

    move-result v0

    .line 183
    if-ne v0, p1, :cond_0

    .line 190
    :goto_0
    return-void

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ay;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, p1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0
.end method

.method private a(II)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    .line 304
    new-instance v0, Lcom/facebook/orca/fbwebrtc/bj;

    invoke-direct {v0, p0}, Lcom/facebook/orca/fbwebrtc/bj;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->t:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 325
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->t:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1, p1, p2}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v0

    .line 329
    if-eq v0, v3, :cond_0

    .line 330
    sget-object v1, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v2, "Failed to get audio focus. res = %d"

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->t:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 333
    :cond_0
    return-void
.end method

.method private a(IIZ)V
    .locals 3

    .prologue
    .line 350
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->n()V

    .line 352
    const/4 v0, 0x2

    invoke-direct {p0, p2, v0}, Lcom/facebook/orca/fbwebrtc/bb;->a(II)V

    .line 354
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 355
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    const-string v2, "android.resource"

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    .line 364
    new-instance v1, Landroid/media/MediaPlayer;

    invoke-direct {v1}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    .line 365
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    invoke-virtual {v1, p2}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 366
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    invoke-virtual {v1, p3}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 368
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    new-instance v2, Lcom/facebook/orca/fbwebrtc/bk;

    invoke-direct {v2, p0}, Lcom/facebook/orca/fbwebrtc/bk;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 376
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    new-instance v2, Lcom/facebook/orca/fbwebrtc/bl;

    invoke-direct {v2, p0}, Lcom/facebook/orca/fbwebrtc/bl;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 383
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    new-instance v2, Lcom/facebook/orca/fbwebrtc/bm;

    invoke-direct {v2, p0}, Lcom/facebook/orca/fbwebrtc/bm;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 393
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->c:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 400
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 401
    :goto_0
    return-void

    .line 394
    :catch_0
    move-exception v0

    .line 395
    sget-object v1, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v2, "Failed to play ringtone"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 396
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->n()V

    goto :goto_0
.end method

.method private a(IJZ)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 685
    sget-object v0, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v1, "HideCallUI call_id=%d: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v5

    const/4 v3, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->p()V

    .line 688
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->e:Lcom/facebook/orca/fbwebrtc/ax;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ax;->a()V

    .line 689
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->m()V

    .line 690
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->s()V

    .line 691
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->j:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->k:Landroid/telephony/PhoneStateListener;

    invoke-virtual {v0, v1, v5}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 693
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0, v5}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/bb;->a(I)V

    .line 695
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    iget v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->A:I

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V

    .line 696
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    iget v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->B:I

    invoke-virtual {v0, v5, v1, v5}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 698
    iput v5, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    .line 699
    iput p1, p0, Lcom/facebook/orca/fbwebrtc/bb;->G:I

    .line 700
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->n:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->F:J

    .line 703
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->y()V

    .line 705
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/bb;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 706
    sget v0, Lcom/facebook/n;->end_call:I

    invoke-direct {p0, v0, v5, v5}, Lcom/facebook/orca/fbwebrtc/bb;->a(IIZ)V

    .line 708
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->z:Z

    if-eqz v0, :cond_1

    .line 709
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/fbwebrtc/bb;->a(J)Z

    .line 714
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    if-eqz v0, :cond_2

    .line 715
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/facebook/webrtc/IWebrtcUiInterface;->hideCallUI(IJZ)V

    .line 717
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/bb;IJZ)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/orca/fbwebrtc/bb;->a(IJZ)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/bb;J)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/fbwebrtc/bb;->b(J)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/bb;ZJ)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/fbwebrtc/bb;->a(ZJ)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/bb;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/fbwebrtc/bb;->a(ZLjava/lang/String;)V

    return-void
.end method

.method private a(ZJ)V
    .locals 5

    .prologue
    .line 763
    sget-object v1, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v2, "%s call failed because peer_id=%d has an outdated version."

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    if-eqz p1, :cond_1

    const-string v0, "Outgoing"

    :goto_0
    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    if-nez p1, :cond_2

    .line 773
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->c:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 774
    const-string v1, "com.facebook.orca.fbwebrtc.intent.action.UPGRADE_ALERT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 776
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 777
    const-string v1, "CONTACT_ID"

    invoke-virtual {v0, v1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 778
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->d:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->c:Landroid/content/Context;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 786
    :cond_0
    :goto_1
    return-void

    .line 763
    :cond_1
    const-string v0, "Incoming"

    goto :goto_0

    .line 783
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    if-eqz v0, :cond_0

    .line 784
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/webrtc/IWebrtcUiInterface;->showOutdatedProtocolAlert(ZJ)V

    goto :goto_1
.end method

.method private a(ZLjava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 656
    if-eqz p1, :cond_0

    iget-wide v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->E:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 657
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->n:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->E:J

    .line 658
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/bb;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 659
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->n()V

    .line 660
    invoke-direct {p0, v4, v5}, Lcom/facebook/orca/fbwebrtc/bb;->a(II)V

    .line 661
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->t()V

    .line 664
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/orca/fbwebrtc/bb;->C:Z

    .line 666
    sget-object v1, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v2, "ShowConnectionDetails connected=%s"

    new-array v3, v5, [Ljava/lang/Object;

    if-eqz p1, :cond_2

    const-string v0, "true"

    :goto_0
    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    sget-object v0, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    invoke-static {v0, p2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 668
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    .line 670
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    if-eqz v0, :cond_1

    .line 671
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    invoke-interface {v0, p1, p2}, Lcom/facebook/webrtc/IWebrtcUiInterface;->showConnectionDetails(ZLjava/lang/String;)V

    .line 673
    :cond_1
    return-void

    .line 666
    :cond_2
    const-string v0, "false"

    goto :goto_0
.end method

.method private a(J)Z
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 504
    new-instance v2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v3, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 505
    const-string v3, "event_name"

    const-string v4, "call_record"

    invoke-virtual {v2, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 506
    const-string v3, "%d:%d"

    new-array v4, v7, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/facebook/orca/fbwebrtc/bb;->n:Lcom/facebook/common/time/a;

    invoke-interface {v5}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-static {v3, v4}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 507
    const-string v4, "msg_id"

    invoke-virtual {v2, v4, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 508
    const-string v3, "call_id"

    invoke-virtual {v2, v3, p1, p2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 509
    const-string v3, "to"

    iget-wide v4, p0, Lcom/facebook/orca/fbwebrtc/bb;->x:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 510
    const-string v3, "call_start_time"

    iget-wide v4, p0, Lcom/facebook/orca/fbwebrtc/bb;->D:J

    invoke-virtual {v2, v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 511
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/bb;->d()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_0

    .line 513
    const-string v3, "call_type"

    invoke-virtual {v2, v3, v7}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 514
    const-string v3, "call_duration"

    iget-object v4, p0, Lcom/facebook/orca/fbwebrtc/bb;->n:Lcom/facebook/common/time/a;

    invoke-interface {v4}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/facebook/orca/fbwebrtc/bb;->D:J

    sub-long/2addr v4, v6

    invoke-virtual {v2, v3, v4, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 521
    :goto_0
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v4, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 522
    const-string v4, "payload"

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 523
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->f:Lcom/facebook/push/mqtt/v;

    const-string v4, "/send_chat_event"

    sget-object v5, Lcom/facebook/mqtt/x;->FIRE_AND_FORGET:Lcom/facebook/mqtt/x;

    invoke-virtual {v2, v4, v3, v5}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/mqtt/x;)I

    move-result v2

    .line 524
    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    :goto_1
    return v0

    .line 517
    :cond_0
    const-string v3, "call_type"

    const/4 v4, 0x3

    invoke-virtual {v2, v3, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 518
    const-string v3, "call_duration"

    invoke-virtual {v2, v3, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    goto :goto_0

    :cond_1
    move v0, v1

    .line 524
    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/bb;Z)Z
    .locals 0

    .prologue
    .line 50
    iput-boolean p1, p0, Lcom/facebook/orca/fbwebrtc/bb;->w:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/orca/fbwebrtc/bb;)Lcom/facebook/orca/fbwebrtc/ag;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->r:Lcom/facebook/orca/fbwebrtc/ag;

    return-object v0
.end method

.method private b(J)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x2

    .line 578
    sget-object v0, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v1, "SwitchToIncomingCallUI"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 580
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->j:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    if-eqz v0, :cond_0

    .line 581
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->r:Lcom/facebook/orca/fbwebrtc/ag;

    sget-object v1, Lcom/facebook/webrtc/a;->CallEndInAnotherCall:Lcom/facebook/webrtc/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/fbwebrtc/ag;->a(Lcom/facebook/webrtc/a;)V

    .line 613
    :goto_0
    return-void

    .line 585
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/orca/fbwebrtc/bb;->a(JZ)V

    .line 586
    iput v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    .line 590
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->o()V

    .line 591
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->x()V

    .line 593
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    .line 595
    if-ne v0, v2, :cond_1

    .line 596
    sget v1, Lcom/facebook/n;->incoming_7a:I

    invoke-direct {p0, v1, v2, v3}, Lcom/facebook/orca/fbwebrtc/bb;->a(IIZ)V

    .line 601
    :cond_1
    if-eq v0, v2, :cond_2

    if-ne v0, v3, :cond_3

    .line 603
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->q()V

    .line 607
    :cond_3
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->c:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 608
    const-string v1, "com.facebook.orca.fbwebrtc.intent.action.INCOMING_CALL"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 610
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 611
    const-string v1, "CONTACT_ID"

    invoke-virtual {v0, v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 612
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->d:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->c:Landroid/content/Context;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/fbwebrtc/bb;Z)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/bb;->b(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 5

    .prologue
    .line 745
    sget-object v1, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v2, "Mute state is changed to %s"

    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    if-eqz p1, :cond_1

    const-string v0, "muted"

    :goto_0
    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 746
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    .line 748
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    if-eqz v0, :cond_0

    .line 749
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    invoke-interface {v0, p1}, Lcom/facebook/webrtc/IWebrtcUiInterface;->updateMuteState(Z)V

    .line 751
    :cond_0
    return-void

    .line 745
    :cond_1
    const-string v0, "normal"

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/fbwebrtc/bb;)Landroid/media/MediaPlayer;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->n()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/fbwebrtc/bb;)I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    return v0
.end method

.method static synthetic f(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->p()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/fbwebrtc/bb;)Lcom/facebook/webrtc/IWebrtcUiInterface;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->u()V

    return-void
.end method

.method static synthetic i(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->v()V

    return-void
.end method

.method static synthetic j(Lcom/facebook/orca/fbwebrtc/bb;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->H:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic k(Lcom/facebook/orca/fbwebrtc/bb;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->q:Landroid/os/Handler;

    return-object v0
.end method

.method private l()I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 196
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ay;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    .line 198
    if-gtz v1, :cond_0

    move v1, v0

    .line 201
    :cond_0
    if-le v1, v0, :cond_1

    .line 204
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method static synthetic l(Lcom/facebook/orca/fbwebrtc/bb;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->w()V

    return-void
.end method

.method private m()V
    .locals 2

    .prologue
    .line 336
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->t:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->t:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 338
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->t:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 340
    :cond_0
    return-void
.end method

.method private n()V
    .locals 1

    .prologue
    .line 404
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->m()V

    .line 405
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 407
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 408
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->s:Landroid/media/MediaPlayer;

    .line 410
    :cond_0
    return-void
.end method

.method private o()V
    .locals 1

    .prologue
    .line 437
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->h:Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/a;->e()V

    .line 438
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->h:Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/a;->a()V

    .line 439
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->h:Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/a;->c()V

    .line 440
    return-void
.end method

.method private p()V
    .locals 1

    .prologue
    .line 444
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->h:Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/a;->f()V

    .line 445
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->h:Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/a;->b()V

    .line 446
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->h:Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/a;->d()V

    .line 447
    return-void
.end method

.method private q()V
    .locals 3

    .prologue
    .line 450
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->u:Landroid/os/Vibrator;

    sget-object v1, Lcom/facebook/orca/fbwebrtc/bb;->b:[J

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 451
    return-void
.end method

.method private r()V
    .locals 1

    .prologue
    .line 454
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->u:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    .line 455
    return-void
.end method

.method private s()V
    .locals 0

    .prologue
    .line 458
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->n()V

    .line 459
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->r()V

    .line 460
    return-void
.end method

.method private t()V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x2

    .line 464
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/f;->b:Lcom/facebook/prefs/shared/ae;

    const-string v2, "-1"

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 468
    if-ltz v0, :cond_1

    .line 469
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->setMode(I)V

    .line 485
    :cond_0
    :goto_0
    return-void

    .line 474
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_2

    .line 476
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->setMode(I)V

    goto :goto_0

    .line 479
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0, v4}, Landroid/media/AudioManager;->setMode(I)V

    .line 481
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v0

    if-eq v0, v4, :cond_0

    .line 482
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->setMode(I)V

    goto :goto_0
.end method

.method private u()V
    .locals 3

    .prologue
    .line 555
    sget-object v0, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v1, "SwitchToRingingUI"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 558
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->o()V

    .line 559
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->x()V

    .line 561
    sget v0, Lcom/facebook/n;->outgoing_09:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/fbwebrtc/bb;->a(IIZ)V

    .line 563
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    if-eqz v0, :cond_0

    .line 564
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    invoke-interface {v0}, Lcom/facebook/webrtc/IWebrtcUiInterface;->switchToRingingUI()V

    .line 566
    :cond_0
    return-void
.end method

.method private v()V
    .locals 3

    .prologue
    .line 625
    sget-object v0, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v1, "SwitchToStreamingUI"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 626
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/bb;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 628
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->r()V

    .line 635
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    .line 637
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->j:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->k:Landroid/telephony/PhoneStateListener;

    const/16 v2, 0x20

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 639
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    .line 641
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    if-eqz v0, :cond_0

    .line 642
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    invoke-interface {v0}, Lcom/facebook/webrtc/IWebrtcUiInterface;->switchToStreamingUI()V

    .line 644
    :cond_0
    return-void

    .line 630
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->s()V

    .line 631
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/fbwebrtc/bb;->a(II)V

    .line 632
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->t()V

    goto :goto_0
.end method

.method private w()V
    .locals 2

    .prologue
    .line 799
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 800
    const-string v1, "com.facebook.orca.fbwebrtc.CALL_STATUS_AND_DURATION_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 801
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->p:Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 802
    return-void
.end method

.method private x()V
    .locals 2

    .prologue
    .line 805
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->H:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 806
    return-void
.end method

.method private y()V
    .locals 2

    .prologue
    .line 809
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->H:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 811
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->w()V

    .line 812
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 175
    iget-wide v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->x:J

    return-wide v0
.end method

.method public a(JZ)V
    .locals 5

    .prologue
    const-wide/16 v3, 0x0

    const/4 v2, 0x0

    .line 151
    iput-wide p1, p0, Lcom/facebook/orca/fbwebrtc/bb;->x:J

    .line 152
    const/4 v0, 0x1

    iput v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    .line 153
    iput-boolean p3, p0, Lcom/facebook/orca/fbwebrtc/bb;->z:Z

    .line 154
    iput-boolean v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->C:Z

    .line 155
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->n:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->D:J

    .line 156
    iput-wide v3, p0, Lcom/facebook/orca/fbwebrtc/bb;->E:J

    .line 157
    iput-wide v3, p0, Lcom/facebook/orca/fbwebrtc/bb;->F:J

    .line 158
    iput v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->G:I

    .line 160
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->A:I

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->B:I

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->l()I

    move-result v1

    invoke-virtual {v0, v2, v1, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 168
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    .line 169
    return-void
.end method

.method public a(Lcom/facebook/orca/fbwebrtc/ag;)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bb;->r:Lcom/facebook/orca/fbwebrtc/ag;

    .line 145
    return-void
.end method

.method a(Lcom/facebook/webrtc/IWebrtcUiInterface;)V
    .locals 1

    .prologue
    .line 299
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->o:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 300
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    .line 301
    return-void
.end method

.method a(Z)V
    .locals 3

    .prologue
    .line 489
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/f;->c:Lcom/facebook/prefs/shared/ae;

    const-string v2, "-1"

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 493
    if-ltz v0, :cond_0

    .line 494
    if-eqz p1, :cond_1

    .line 495
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->i:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->setMode(I)V

    .line 501
    :cond_0
    :goto_0
    return-void

    .line 498
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->t()V

    goto :goto_0
.end method

.method b()Z
    .locals 1

    .prologue
    .line 213
    iget v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->w:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 220
    iget v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    return v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 234
    iget-wide v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->E:J

    return-wide v0
.end method

.method public e()J
    .locals 6

    .prologue
    const-wide/16 v0, 0x0

    .line 241
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/bb;->h()Z

    move-result v2

    if-nez v2, :cond_1

    .line 248
    :cond_0
    :goto_0
    return-wide v0

    .line 244
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->n:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/facebook/orca/fbwebrtc/bb;->E:J

    sub-long/2addr v2, v4

    .line 245
    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    move-wide v0, v2

    goto :goto_0
.end method

.method public f()Ljava/lang/String;
    .locals 14

    .prologue
    const/4 v13, 0x2

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-wide/16 v9, 0xe10

    const-wide/16 v7, 0x3c

    .line 255
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/bb;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 256
    cmp-long v2, v0, v9

    if-gez v2, :cond_0

    .line 258
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->c:Landroid/content/Context;

    sget v3, Lcom/facebook/o;->webrtc_incall_connection_duration_short:I

    new-array v4, v13, [Ljava/lang/Object;

    div-long v5, v0, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v11

    rem-long/2addr v0, v7

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v12

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 262
    :goto_0
    return-object v0

    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/bb;->c:Landroid/content/Context;

    sget v3, Lcom/facebook/o;->webrtc_incall_connection_duration_long:I

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    div-long v5, v0, v9

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v11

    rem-long v5, v0, v9

    div-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v12

    rem-long/2addr v0, v7

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v13

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 273
    iget-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->z:Z

    return v0
.end method

.method public h()Z
    .locals 4

    .prologue
    .line 280
    iget v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->E:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public handleError(I)V
    .locals 5

    .prologue
    .line 529
    sget-object v0, Lcom/facebook/orca/fbwebrtc/bb;->a:Ljava/lang/Class;

    const-string v1, "Handle error=%d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/bb;->s()V

    .line 532
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    .line 534
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->v:Lcom/facebook/webrtc/IWebrtcUiInterface;

    if-eqz v0, :cond_0

    .line 535
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->l:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/bo;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/fbwebrtc/bo;-><init>(Lcom/facebook/orca/fbwebrtc/bb;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 543
    :cond_0
    return-void
.end method

.method public hideCallUI(IJZ)V
    .locals 7

    .prologue
    .line 677
    iget-object v6, p0, Lcom/facebook/orca/fbwebrtc/bb;->l:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/facebook/orca/fbwebrtc/bf;

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/fbwebrtc/bf;-><init>(Lcom/facebook/orca/fbwebrtc/bb;IJZ)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 682
    return-void
.end method

.method public i()Z
    .locals 4

    .prologue
    .line 287
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/bb;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method j()V
    .locals 5

    .prologue
    .line 417
    iget v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->y:I

    if-eqz v0, :cond_0

    .line 433
    :goto_0
    return-void

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->h:Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/a;->e()V

    .line 421
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->h:Lcom/facebook/orca/fbwebrtc/a;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/a;->c()V

    .line 422
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->w:Z

    .line 423
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->m:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/bn;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/bn;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    const-wide/16 v2, 0xfa0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0
.end method

.method public k()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const-wide/16 v1, 0x0

    .line 723
    sget-object v0, Lcom/facebook/webrtc/a;->CallEndHangupCall:Lcom/facebook/webrtc/a;

    invoke-virtual {v0}, Lcom/facebook/webrtc/a;->ordinal()I

    move-result v0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/facebook/orca/fbwebrtc/bb;->hideCallUI(IJZ)V

    .line 726
    iput-wide v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->x:J

    .line 727
    iput-boolean v3, p0, Lcom/facebook/orca/fbwebrtc/bb;->z:Z

    .line 728
    iput-boolean v3, p0, Lcom/facebook/orca/fbwebrtc/bb;->C:Z

    .line 729
    iput-wide v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->D:J

    .line 730
    iput-wide v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->E:J

    .line 731
    iput-wide v1, p0, Lcom/facebook/orca/fbwebrtc/bb;->F:J

    .line 732
    iput v3, p0, Lcom/facebook/orca/fbwebrtc/bb;->G:I

    .line 733
    return-void
.end method

.method public showConnectionDetails(ZLjava/lang/String;)V
    .locals 2

    .prologue
    .line 648
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->l:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/be;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/orca/fbwebrtc/be;-><init>(Lcom/facebook/orca/fbwebrtc/bb;ZLjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 653
    return-void
.end method

.method public showOutdatedProtocolAlert(ZJ)V
    .locals 2

    .prologue
    .line 755
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->l:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/bh;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/facebook/orca/fbwebrtc/bh;-><init>(Lcom/facebook/orca/fbwebrtc/bb;ZJ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 760
    return-void
.end method

.method public switchToIncomingCallUI(J)V
    .locals 2

    .prologue
    .line 570
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->l:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/bq;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/orca/fbwebrtc/bq;-><init>(Lcom/facebook/orca/fbwebrtc/bb;J)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 575
    return-void
.end method

.method public switchToRingingUI()V
    .locals 2

    .prologue
    .line 547
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->l:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/bp;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/bp;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 552
    return-void
.end method

.method public switchToStreamingUI()V
    .locals 2

    .prologue
    .line 617
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->l:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/bd;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/bd;-><init>(Lcom/facebook/orca/fbwebrtc/bb;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 622
    return-void
.end method

.method public updateMuteState(Z)V
    .locals 2

    .prologue
    .line 737
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/bb;->l:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/bg;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/fbwebrtc/bg;-><init>(Lcom/facebook/orca/fbwebrtc/bb;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 742
    return-void
.end method
