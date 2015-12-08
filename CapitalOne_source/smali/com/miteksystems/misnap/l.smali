.class public final Lcom/miteksystems/misnap/l;
.super Landroid/view/SurfaceView;

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;
.implements Landroid/hardware/Camera$ErrorCallback;
.implements Landroid/hardware/Camera$PictureCallback;
.implements Landroid/hardware/Camera$PreviewCallback;
.implements Landroid/view/SurfaceHolder$Callback;


# static fields
.field private static final l:Landroid/net/Uri;

.field private static final m:Ljava/util/ArrayList;

.field private static n:Landroid/media/MediaPlayer;

.field private static o:Z


# instance fields
.field private A:Landroid/os/Handler;

.field a:Landroid/hardware/Camera;

.field b:I

.field c:I

.field d:Z

.field e:Ljava/lang/Runnable;

.field f:Ljava/lang/Runnable;

.field g:Ljava/lang/Runnable;

.field private h:Lcom/miteksystems/misnap/MiSnap;

.field private i:Lcom/miteksystems/misnap/MitekAnalyzer;

.field private j:Lcom/miteksystems/misnap/u;

.field private k:Landroid/os/Handler;

.field private p:[B

.field private q:Landroid/hardware/Camera;

.field private r:Landroid/hardware/Camera$Parameters;

.field private s:Landroid/hardware/Camera$Size;

.field private t:Z

.field private u:[B

.field private v:J

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x0

    const-string v0, "file:///system/media/audio/ui/camera_click.ogg"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/miteksystems/misnap/l;->l:Landroid/net/Uri;

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "DROID BIONIC"

    aput-object v2, v1, v4

    const/4 v2, 0x1

    const-string v3, "DROID RAZR MAXX HD"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "GT-I9300"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "GT-N7100"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "HTC Desire HD A9191"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "PantechP9070"

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/miteksystems/misnap/l;->m:Ljava/util/ArrayList;

    sput-boolean v4, Lcom/miteksystems/misnap/l;->o:Z

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/hardware/Camera;Landroid/os/Handler;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->p:[B

    iput-boolean v2, p0, Lcom/miteksystems/misnap/l;->t:Z

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->a:Landroid/hardware/Camera;

    iput-boolean v2, p0, Lcom/miteksystems/misnap/l;->x:Z

    iput-boolean v2, p0, Lcom/miteksystems/misnap/l;->y:Z

    iput-boolean v2, p0, Lcom/miteksystems/misnap/l;->d:Z

    new-instance v0, Lcom/miteksystems/misnap/m;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/m;-><init>(Lcom/miteksystems/misnap/l;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/n;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/n;-><init>(Lcom/miteksystems/misnap/l;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->f:Ljava/lang/Runnable;

    new-instance v0, Lcom/miteksystems/misnap/o;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/o;-><init>(Lcom/miteksystems/misnap/l;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->g:Ljava/lang/Runnable;

    check-cast p1, Lcom/miteksystems/misnap/MiSnap;

    iput-object p1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    sput-boolean v2, Lcom/miteksystems/misnap/l;->o:Z

    iput-object p3, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    iput-object p2, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    return-void
.end method

.method private a(Landroid/hardware/Camera$Size;)Landroid/hardware/Camera$Size;
    .locals 21

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v2, v2, Lcom/miteksystems/misnap/MiSnap;->l:Z

    if-eqz v2, :cond_1

    new-instance v2, Landroid/hardware/Camera$Size;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v4, 0x780

    const/16 v5, 0x438

    invoke-direct {v2, v3, v4, v5}, Landroid/hardware/Camera$Size;-><init>(Landroid/hardware/Camera;II)V

    :cond_0
    :goto_0
    return-object v2

    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v2, v2, Lcom/miteksystems/misnap/MiSnap;->m:Z

    if-eqz v2, :cond_2

    new-instance v2, Landroid/hardware/Camera$Size;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v4, 0x500

    const/16 v5, 0x2d0

    invoke-direct {v2, v3, v4, v5}, Landroid/hardware/Camera$Size;-><init>(Landroid/hardware/Camera;II)V

    goto :goto_0

    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    move-object/from16 v0, p1

    invoke-interface {v10, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object/from16 v2, p1

    goto :goto_0

    :cond_5
    move-object/from16 v0, p1

    iget v11, v0, Landroid/hardware/Camera$Size;->width:I

    move-object/from16 v0, p1

    iget v12, v0, Landroid/hardware/Camera$Size;->height:I

    int-to-double v2, v12

    int-to-double v4, v11

    div-double v14, v2, v4

    const/4 v5, 0x0

    const v4, 0x4b000

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move-object v9, v5

    move/from16 v20, v4

    move-wide v4, v2

    move/from16 v3, v20

    :cond_6
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_9

    if-nez v9, :cond_8

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_d

    :cond_8
    move-object v2, v9

    if-eqz v2, :cond_11

    const/16 v3, 0x258

    iget v4, v2, Landroid/hardware/Camera$Size;->height:I

    if-le v3, v4, :cond_10

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v3

    if-eqz v3, :cond_10

    const-string v3, "MiSnap"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "warning: previewFrame size ("

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v2, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "x"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ") insufficient for AllowVideoFrames"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_9
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Camera$Size;

    iget v6, v2, Landroid/hardware/Camera$Size;->height:I

    int-to-double v6, v6

    iget v8, v2, Landroid/hardware/Camera$Size;->width:I

    int-to-double v0, v8

    move-wide/from16 v16, v0

    div-double v6, v6, v16

    iget v8, v2, Landroid/hardware/Camera$Size;->width:I

    iget v0, v2, Landroid/hardware/Camera$Size;->height:I

    move/from16 v16, v0

    mul-int v8, v8, v16

    cmpl-double v16, v14, v6

    if-nez v16, :cond_b

    cmpl-double v16, v14, v4

    if-nez v16, :cond_a

    if-ge v8, v3, :cond_c

    :cond_a
    cmpl-double v16, v14, v4

    if-eqz v16, :cond_b

    const v16, 0x4b000

    move/from16 v0, v16

    if-ge v8, v0, :cond_c

    :cond_b
    sub-double v16, v14, v6

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->abs(D)D

    move-result-wide v16

    sub-double v18, v14, v4

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->abs(D)D

    move-result-wide v18

    cmpg-double v16, v16, v18

    if-gez v16, :cond_6

    if-lt v8, v3, :cond_6

    :cond_c
    move-wide v4, v6

    move v3, v8

    move-object v9, v2

    goto/16 :goto_1

    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Camera$Size;

    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    if-gt v4, v11, :cond_7

    iget v4, v2, Landroid/hardware/Camera$Size;->height:I

    if-gt v4, v12, :cond_7

    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    iget v6, v2, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr v4, v6

    if-eqz v9, :cond_f

    iget v6, v2, Landroid/hardware/Camera$Size;->width:I

    iget v7, v9, Landroid/hardware/Camera$Size;->width:I

    if-gt v6, v7, :cond_e

    iget v6, v2, Landroid/hardware/Camera$Size;->height:I

    iget v7, v9, Landroid/hardware/Camera$Size;->height:I

    if-le v6, v7, :cond_7

    :cond_e
    if-le v4, v3, :cond_7

    :cond_f
    move v3, v4

    move-object v9, v2

    goto/16 :goto_2

    :cond_10
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "preview size "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto/16 :goto_0

    :cond_11
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    const/4 v2, 0x0

    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Camera$Size;

    goto/16 :goto_0
.end method

.method private static a(Ljava/util/List;I)Landroid/hardware/Camera$Size;
    .locals 18

    if-nez p0, :cond_1

    const/4 v3, 0x0

    :cond_0
    return-object v3

    :cond_1
    const/4 v4, 0x0

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-wide/from16 v16, v2

    move-object v3, v4

    move-wide/from16 v4, v16

    :cond_2
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Camera$Size;

    iget v6, v2, Landroid/hardware/Camera$Size;->width:I

    sub-int v6, v6, p1

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-double v6, v6

    cmpg-double v9, v6, v4

    if-gez v9, :cond_2

    iget v9, v2, Landroid/hardware/Camera$Size;->width:I

    move/from16 v0, p1

    if-lt v9, v0, :cond_2

    iget v9, v2, Landroid/hardware/Camera$Size;->height:I

    int-to-double v10, v9

    const-wide/high16 v12, 0x3fe2000000000000L    # 0.5625

    move/from16 v0, p1

    int-to-double v14, v0

    mul-double/2addr v12, v14

    cmpl-double v9, v10, v12

    if-lez v9, :cond_2

    move-wide v4, v6

    move-object v3, v2

    goto :goto_0
.end method

.method static synthetic a(Lcom/miteksystems/misnap/l;)Landroid/hardware/Camera;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    return-object v0
.end method

.method private static a(Landroid/content/Context;)V
    .locals 6

    const-wide/16 v4, 0x64

    const-string v0, "audio"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/miteksystems/misnap/l;->n:Landroid/media/MediaPlayer;

    if-nez v1, :cond_2

    sget-object v1, Lcom/miteksystems/misnap/l;->l:Landroid/net/Uri;

    invoke-static {p0, v1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/MediaPlayer;

    move-result-object v1

    sput-object v1, Lcom/miteksystems/misnap/l;->n:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_1

    sget-object v1, Lcom/miteksystems/misnap/l;->n:Landroid/media/MediaPlayer;

    new-instance v2, Lcom/miteksystems/misnap/q;

    invoke-direct {v2, v0}, Lcom/miteksystems/misnap/q;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    :cond_0
    :goto_0
    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    const/4 v1, 0x4

    new-array v1, v1, [J

    const/4 v2, 0x1

    aput-wide v4, v1, v2

    const/4 v2, 0x2

    aput-wide v4, v1, v2

    const/4 v2, 0x3

    const-wide/16 v4, 0xc8

    aput-wide v4, v1, v2

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate([JI)V

    return-void

    :cond_1
    const-string v0, "MiSnapCamera"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/miteksystems/misnap/l;->l:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " still null after create()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/miteksystems/misnap/l;->n:Landroid/media/MediaPlayer;

    int-to-float v2, v0

    int-to-float v0, v0

    invoke-virtual {v1, v2, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V

    sget-object v0, Lcom/miteksystems/misnap/l;->n:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/miteksystems/misnap/l;Landroid/view/SurfaceHolder;)V
    .locals 9

    const/4 v1, 0x1

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v3

    if-eqz v3, :cond_13

    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "focusModes="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget-object v4, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const-string v5, "auto"

    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    iput-boolean v2, v4, Lcom/miteksystems/misnap/MiSnap;->k:Z

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v2, v2, Lcom/miteksystems/misnap/MiSnap;->k:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    const-string v5, "android.hardware.camera.autofocus"

    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v4

    iput-boolean v4, v2, Lcom/miteksystems/misnap/MiSnap;->k:Z

    :cond_0
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v2, v2, Lcom/miteksystems/misnap/MiSnap;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v2, v2, Lcom/miteksystems/misnap/MiSnap;->k:Z

    if-eqz v2, :cond_3

    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Landroid/hardware/Camera$Size;

    iget-object v5, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v6, 0x780

    const/16 v7, 0x438

    invoke-direct {v4, v5, v6, v7}, Landroid/hardware/Camera$Size;-><init>(Landroid/hardware/Camera;II)V

    new-instance v5, Landroid/hardware/Camera$Size;

    iget-object v6, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v7, 0x500

    const/16 v8, 0x2d0

    invoke-direct {v5, v6, v7, v8}, Landroid/hardware/Camera$Size;-><init>(Landroid/hardware/Camera;II)V

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    iget-object v5, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v5, v4, v2}, Lcom/miteksystems/misnap/MiSnap;->a(ZZ)V

    :cond_1
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "focusMode="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "; hasAutoFocus="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->n()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "; sendingVideoFrames="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v2

    iget-object v4, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->e()I

    move-result v4

    invoke-static {v2, v4}, Lcom/miteksystems/misnap/l;->a(Ljava/util/List;I)Landroid/hardware/Camera$Size;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x0

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "CameraNotSufficient"

    invoke-virtual {v0, v1, v2, v3}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void

    :cond_3
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const/4 v4, 0x1

    iput-boolean v4, v2, Lcom/miteksystems/misnap/MiSnap;->j:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "MiSnapCamera"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error starting camera preview: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_4
    :try_start_1
    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    iget v5, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v3, v4, v5}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    invoke-direct {p0, v2}, Lcom/miteksystems/misnap/l;->a(Landroid/hardware/Camera$Size;)Landroid/hardware/Camera$Size;

    move-result-object v2

    if-eqz v2, :cond_b

    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v3, v4, v2}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    :goto_2
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v2, v2, Lcom/miteksystems/misnap/MiSnap;->l:Z

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v2, v2, Lcom/miteksystems/misnap/MiSnap;->m:Z

    if-eqz v2, :cond_c

    :cond_5
    :goto_3
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v2, v2, Lcom/miteksystems/misnap/MiSnap;->w:Z

    if-eqz v2, :cond_d

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/l;->a(Z)V

    :goto_4
    const/16 v0, 0x100

    invoke-virtual {v3, v0}, Landroid/hardware/Camera$Parameters;->setPictureFormat(I)V

    const/16 v0, 0x11

    invoke-virtual {v3, v0}, Landroid/hardware/Camera$Parameters;->setPreviewFormat(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->f()I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/hardware/Camera$Parameters;->setJpegQuality(I)V

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Build.MODEL: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    sget-object v1, Lcom/miteksystems/misnap/l;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->e()Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getSupportedSceneModes()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Scene modes="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "steadyphoto"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "steadyphoto"

    invoke-virtual {v3, v0}, Landroid/hardware/Camera$Parameters;->setSceneMode(Ljava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0, v3}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPictureSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Photo size="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v0, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "; Preview size="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, v1, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "x"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v1, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :cond_8
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {}, Lcom/miteksystems/misnap/MiSnap;->d()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->aj()I

    move-result v0

    if-nez v0, :cond_2

    :cond_9
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/l;->b(Lcom/miteksystems/misnap/u;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->j()V

    :cond_a
    :goto_5
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v0, 0x0

    sput-boolean v0, Lcom/miteksystems/misnap/l;->o:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {}, Lcom/miteksystems/misnap/MiSnap;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_1

    :cond_b
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->a()V

    goto/16 :goto_2

    :cond_c
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->a()V

    goto/16 :goto_3

    :cond_d
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v2

    iget-object v4, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->n()Ljava/lang/String;

    move-result-object v4

    const-string v5, "LICENSE"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    iget-object v5, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v5}, Lcom/miteksystems/misnap/MiSnap;->e()I

    move-result v5

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/l;->a(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/miteksystems/misnap/MiSnap;->p:Z

    goto/16 :goto_4

    :pswitch_1
    if-eqz v4, :cond_e

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/l;->a(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/miteksystems/misnap/MiSnap;->p:Z

    goto/16 :goto_4

    :cond_e
    if-eqz v2, :cond_f

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/l;->a(Z)V

    goto/16 :goto_4

    :cond_f
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->p()V

    goto/16 :goto_4

    :pswitch_2
    if-eqz v4, :cond_10

    move v2, v0

    :goto_6
    invoke-virtual {p0, v2}, Lcom/miteksystems/misnap/l;->a(Z)V

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    if-eqz v4, :cond_11

    :goto_7
    iput-boolean v0, v2, Lcom/miteksystems/misnap/MiSnap;->w:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/miteksystems/misnap/MiSnap;->p:Z

    goto/16 :goto_4

    :cond_10
    move v2, v1

    goto :goto_6

    :cond_11
    move v0, v1

    goto :goto_7

    :pswitch_3
    if-eqz v2, :cond_12

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/l;->a(Z)V

    goto/16 :goto_4

    :cond_12
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->p()V

    goto/16 :goto_4

    :cond_13
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x0

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "CameraNotSufficient"

    invoke-virtual {v0, v1, v2, v3}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_14
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->l()V

    goto/16 :goto_5

    :cond_15
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {}, Lcom/miteksystems/misnap/MiSnap;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic a(Lcom/miteksystems/misnap/l;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/miteksystems/misnap/l;->t:Z

    return-void
.end method

.method private a(I)[B
    .locals 8

    const/4 v5, 0x0

    const/16 v2, 0x11

    const/4 v7, 0x0

    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v0

    if-ne v2, v0, :cond_1

    new-instance v0, Landroid/graphics/YuvImage;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->u:[B

    iget v3, p0, Lcom/miteksystems/misnap/l;->b:I

    iget v4, p0, Lcom/miteksystems/misnap/l;->c:I

    invoke-direct/range {v0 .. v5}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    new-instance v1, Landroid/graphics/Rect;

    iget v2, p0, Lcom/miteksystems/misnap/l;->b:I

    iget v3, p0, Lcom/miteksystems/misnap/l;->c:I

    invoke-direct {v1, v7, v7, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v0, v1, p1, v6}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    :cond_0
    :goto_0
    iput-object v5, p0, Lcom/miteksystems/misnap/l;->u:[B

    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    :try_start_0
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object v0

    :cond_1
    const/16 v1, 0x100

    if-eq v1, v0, :cond_2

    const/4 v1, 0x4

    if-ne v1, v0, :cond_0

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->u:[B

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->u:[B

    array-length v1, v1

    invoke-static {v0, v7, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v0, v1, p1, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method

.method private static a([BLjava/lang/String;)[B
    .locals 8

    const/4 v1, 0x0

    new-instance v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;

    const/16 v0, 0x4d

    invoke-direct {v2, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;-><init>(I)V

    :try_start_0
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/ExifTagConstants;->dk:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->g_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    iget v4, v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a:I

    invoke-virtual {v0, v3, p1, v4}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a(Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Ljava/lang/Object;I)[B

    move-result-object v0

    new-instance v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/constants/ExifTagConstants;->dk:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/ExifTagConstants;->dk:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v5, v5, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->c:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v6, 0x0

    aget-object v5, v5, v6

    array-length v6, v0

    invoke-direct {v3, v4, v5, v6, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->c()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    invoke-virtual {v0, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v3, 0x64

    invoke-direct {v0, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
    :try_end_0
    .catch Lorg/apache/sanselan/ImageWriteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/apache/sanselan/ImageReadException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    new-instance v1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;

    invoke-direct {v1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;-><init>()V

    invoke-virtual {v1, p0, v0, v2}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->a([BLjava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    :try_end_1
    .catch Lorg/apache/sanselan/ImageWriteException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lorg/apache/sanselan/ImageReadException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move-object v7, v0

    move-object v0, v1

    move-object v1, v7

    :goto_1
    invoke-virtual {v1}, Lorg/apache/sanselan/ImageWriteException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v7, v0

    move-object v0, v1

    move-object v1, v7

    :goto_2
    invoke-virtual {v1}, Lorg/apache/sanselan/ImageReadException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception v0

    move-object v7, v0

    move-object v0, v1

    move-object v1, v7

    :goto_3
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_3

    :catch_4
    move-exception v1

    goto :goto_2

    :catch_5
    move-exception v1

    goto :goto_1
.end method

.method private b(Lcom/miteksystems/misnap/u;)V
    .locals 2

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    iget v1, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {p1, v1, v0}, Lcom/miteksystems/misnap/u;->a(II)V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->e()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/miteksystems/misnap/u;->a(Z)V

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/miteksystems/misnap/l;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/l;->x:Z

    return v0
.end method

.method private b(I)[B
    .locals 9

    const/4 v2, 0x0

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->s:Landroid/hardware/Camera$Size;

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->s:Landroid/hardware/Camera$Size;

    iget v1, v1, Landroid/hardware/Camera$Size;->width:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-double v4, v0

    const-wide/high16 v0, 0x3fe2000000000000L    # 0.5625

    cmpl-double v0, v0, v4

    if-nez v0, :cond_0

    const/16 v0, 0x780

    :goto_0
    int-to-float v1, v0

    float-to-double v6, v1

    mul-double/2addr v4, v6

    double-to-int v3, v4

    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v8, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    iput-boolean v8, v1, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    iget-object v4, p0, Lcom/miteksystems/misnap/l;->p:[B

    iget-object v5, p0, Lcom/miteksystems/misnap/l;->p:[B

    array-length v5, v5

    invoke-static {v4, v8, v5, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v2, p0, Lcom/miteksystems/misnap/l;->p:[B

    if-nez v1, :cond_1

    move-object v0, v2

    :goto_1
    return-object v0

    :cond_0
    const/16 v0, 0x640

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lcom/miteksystems/misnap/l;->s:Landroid/hardware/Camera$Size;

    iget v4, v4, Landroid/hardware/Camera$Size;->width:I

    if-le v4, v0, :cond_2

    const/4 v4, 0x1

    :try_start_0
    invoke-static {v1, v0, v3, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_2
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v0, v2, p1, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    :try_start_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v2

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_2
.end method

.method static synthetic c(Lcom/miteksystems/misnap/l;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/l;->w:Z

    return v0
.end method

.method static synthetic d(Lcom/miteksystems/misnap/l;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lcom/miteksystems/misnap/l;)Lcom/miteksystems/misnap/MitekAnalyzer;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    return-object v0
.end method

.method static synthetic f(Lcom/miteksystems/misnap/l;)Lcom/miteksystems/misnap/u;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    return-object v0
.end method

.method static synthetic g(Lcom/miteksystems/misnap/l;)Lcom/miteksystems/misnap/MiSnap;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    return-object v0
.end method

.method static synthetic h(Lcom/miteksystems/misnap/l;)[B
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->u:[B

    return-object v0
.end method

.method static synthetic i(Lcom/miteksystems/misnap/l;)V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/miteksystems/misnap/l;->w:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/miteksystems/misnap/l;->x:Z

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v3, "HardwareIsReady == (!pictureInProgress="

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/miteksystems/misnap/l;->w:Z

    if-eqz v3, :cond_3

    move v3, v2

    :goto_1
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", !focusing="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-boolean v3, p0, Lcom/miteksystems/misnap/l;->x:Z

    if-eqz v3, :cond_4

    move v3, v2

    :goto_2
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v3, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->r()Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_3
    move v0, v1

    :cond_0
    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->t()V

    :cond_1
    return-void

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v3, v1

    goto :goto_1

    :cond_4
    move v3, v1

    goto :goto_2

    :cond_5
    move v1, v2

    goto :goto_3
.end method

.method private m()Landroid/hardware/Camera$Parameters;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/miteksystems/misnap/l;->r:Landroid/hardware/Camera$Parameters;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    iput-object v1, p0, Lcom/miteksystems/misnap/l;->r:Landroid/hardware/Camera$Parameters;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->r:Landroid/hardware/Camera$Parameters;

    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->r:Landroid/hardware/Camera$Parameters;

    goto :goto_0
.end method

.method private n()Z
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-boolean v0, v0, Lcom/miteksystems/misnap/MiSnap;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private declared-synchronized o()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/miteksystems/misnap/l;->u:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/l;->d:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private p()V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "auto"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private q()Z
    .locals 4

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v2, :cond_4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "off"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_0
.end method

.method private r()Z
    .locals 5

    const/4 v1, 0x1

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v2, Lcom/miteksystems/misnap/MiSnap;->g:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnap;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v3

    :goto_0
    return v0

    :cond_0
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-nez v2, :cond_1

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_1
    :try_start_1
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->d()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->b()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->c()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_2
    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->l()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_5

    const/4 v2, 0x5

    iget-object v4, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v4, v4, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MitekAnalyzer;->l()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ne v2, v4, :cond_5

    move v2, v1

    :goto_1
    if-nez v2, :cond_3

    const/4 v4, 0x0

    iput v4, p0, Lcom/miteksystems/misnap/l;->z:I

    :cond_3
    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnap;->f()Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    :cond_4
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_5
    move v2, v0

    goto :goto_1
.end method

.method private s()V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->r()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/miteksystems/misnap/l;->v:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/l;->w:Z

    :try_start_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p0}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x0

    const-string v2, "VideoCaptureFailed"

    invoke-virtual {v0, v1, v4, v2}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private t()V
    .locals 12

    const/4 v8, 0x1

    const/4 v9, 0x0

    iget-boolean v0, p0, Lcom/miteksystems/misnap/l;->y:Z

    if-nez v0, :cond_4

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->r()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v8

    :goto_0
    iget-boolean v1, p0, Lcom/miteksystems/misnap/l;->y:Z

    if-nez v1, :cond_0

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/miteksystems/misnap/l;->z:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->d()I

    move-result v2

    if-lt v1, v2, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    :cond_1
    iget-boolean v1, p0, Lcom/miteksystems/misnap/l;->y:Z

    if-eqz v1, :cond_5

    move v0, v8

    :goto_1
    if-eqz v9, :cond_b

    iget v0, p0, Lcom/miteksystems/misnap/l;->z:I

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->d()I

    move-result v1

    if-lt v0, v1, :cond_a

    iput-boolean v8, p0, Lcom/miteksystems/misnap/l;->w:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->a()V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_capture_time:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->a()V

    :cond_3
    :goto_2
    return-void

    :cond_4
    move v0, v9

    goto :goto_0

    :cond_5
    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->o()Landroid/graphics/Rect;

    move-result-object v10

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->u:[B

    iget v2, p0, Lcom/miteksystems/misnap/l;->b:I

    iget v3, v10, Landroid/graphics/Rect;->left:I

    iget v4, v10, Landroid/graphics/Rect;->top:I

    iget v5, v10, Landroid/graphics/Rect;->right:I

    iget v6, v10, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v6

    iget v6, v10, Landroid/graphics/Rect;->bottom:I

    iget v7, v10, Landroid/graphics/Rect;->top:I

    sub-int/2addr v6, v7

    iget-object v7, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v7, v7, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v7}, Lcom/miteksystems/misnap/MiSnapAPI;->n()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v0 .. v7}, Lcom/miteksystems/misnap/MitekAnalyzer;->a([BIIIIILjava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Preview oof ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] vs threshold ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "], cropRect = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    sget-boolean v1, Lcom/miteksystems/misnap/r;->a:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/miteksystems/misnap/u;->a(Ljava/lang/Integer;)V

    :cond_6
    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->h()I

    move-result v1

    if-lt v0, v1, :cond_9

    move v0, v8

    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "useThisVideoFrame: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    if-nez v0, :cond_7

    iput v9, p0, Lcom/miteksystems/misnap/l;->z:I

    :cond_7
    :goto_4
    if-eqz v0, :cond_8

    iget v1, p0, Lcom/miteksystems/misnap/l;->z:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/miteksystems/misnap/l;->z:I

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    sget v2, Lcom/miteksystems/misnap/R$string;->uxp_measured_videoframe:I

    invoke-virtual {v1, v2}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    :cond_8
    move v11, v0

    move v0, v9

    move v9, v11

    goto/16 :goto_1

    :cond_9
    move v0, v9

    goto :goto_3

    :cond_a
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_consecutive_frame_count:I

    iget v2, p0, Lcom/miteksystems/misnap/l;->z:I

    invoke-virtual {v0, v1, v2}, Lcom/miteksystems/misnap/MiSnap;->a(II)V

    goto/16 :goto_2

    :cond_b
    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnap;->f()Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz v0, :cond_c

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->s()V

    goto/16 :goto_2

    :cond_c
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->f()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_2

    :cond_d
    move v0, v9

    goto :goto_4

    :cond_e
    move v0, v9

    goto/16 :goto_1
.end method


# virtual methods
.method final a()V
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/miteksystems/misnap/l;->t:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/l;->w:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->p()V

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method final a(Lcom/miteksystems/misnap/MitekAnalyzer;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    return-void
.end method

.method public final a(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    return-void
.end method

.method final a(Z)V
    .locals 3

    :try_start_0
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_2

    const-string v0, "torch"

    :goto_1
    invoke-virtual {v1, v0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "Behold II"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "flash-value"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    :goto_2
    const-string v0, "off"

    goto :goto_1

    :cond_3
    const-string v0, "flash-value"

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2
.end method

.method final b()V
    .locals 2

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/miteksystems/misnap/l;->w:Z

    iput-boolean v1, p0, Lcom/miteksystems/misnap/l;->x:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/miteksystems/misnap/l;->t:Z

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->q()V

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/l;->t:Z

    :cond_2
    return-void
.end method

.method final b(Z)V
    .locals 4

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/miteksystems/misnap/MitekAnalyzer;->i:Z

    :cond_0
    invoke-virtual {p0, p1}, Lcom/miteksystems/misnap/l;->a(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iput-boolean p1, v0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    iget-object v1, v1, Lcom/miteksystems/misnap/u;->o:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->H()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method final c()V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/l;->x:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const-string v0, "MiSnapCamera"

    const-string v1, "auto focus failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method final d()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/l;->b(Lcom/miteksystems/misnap/u;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->j()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/miteksystems/misnap/l;->o:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->l()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method

.method final e()Z
    .locals 3

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "torch"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1
.end method

.method public final f()V
    .locals 5

    const/16 v4, 0x10

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->f:Ljava/lang/Runnable;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method public final g()V
    .locals 4

    const/16 v1, 0x10

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/l;->d:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->c()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->c()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method final h()Ljava/lang/String;
    .locals 5

    const-string v0, ""

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "MiSnapVersion"

    iget-object v3, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    sget v4, Lcom/miteksystems/misnap/R$string;->misnap_versionName:I

    invoke-virtual {v3, v4}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "BarcodeLibVersion"

    const-string v3, "MiSnap231_with_no_bar_no_card"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, ""

    iget-object v3, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnapAPI;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "ServerVersion"

    iget-object v3, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnapAPI;->e:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    :goto_0
    const-string v1, "Platform"

    const-string v3, "Android"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "OS"

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Manufacturer"

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Model"

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Device"

    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "MibiVersion"

    const-string v3, "1.2"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->q()Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "Flash"

    const-string v3, "NA"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    :goto_1
    const-string v3, "Orientation"

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnap;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/Display;->getHeight()I

    move-result v1

    if-ge v4, v1, :cond_a

    const-string v1, "Portrait"

    :goto_2
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "CaptureMode"

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "2"

    :goto_3
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Document"

    iget-object v3, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->aB()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v1, Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->aB()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "RequiredMaxImageSize"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    const-string v3, "CameraViewFinderMinVericalFill"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    const-string v3, "TutorialBrandNewUserDuration"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    const-string v3, "SecurityResult"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    const-string v3, "Parameters"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    if-eqz v1, :cond_3

    const-string v1, "UXP"

    iget-object v3, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/am;->a()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_4
    return-object v0

    :cond_4
    const-string v1, ""

    iget-object v3, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnapAPI;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "ServerVersion"

    iget-object v3, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    iget-object v3, v3, Lcom/miteksystems/misnap/MiSnapAPI;->c:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    :catch_0
    move-exception v1

    goto :goto_4

    :cond_5
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v3, "torch"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v1, "Flash"

    const-string v3, "ON"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    :goto_5
    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v1

    :goto_6
    const-string v3, "OriginalWidth"

    iget v4, v1, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "OriginalHeight"

    iget v1, v1, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_1

    :cond_7
    const-string v3, "off"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v1, "Flash"

    const-string v3, "OFF"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_5

    :cond_8
    const-string v3, "auto"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "Flash"

    const-string v3, "AUTO"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_5

    :cond_9
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getPictureSize()Landroid/hardware/Camera$Size;

    move-result-object v1

    goto :goto_6

    :cond_a
    const-string v1, "Landscape"

    goto/16 :goto_2

    :cond_b
    const-string v1, "1"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3
.end method

.method final i()V
    .locals 4

    const/4 v3, -0x1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->f()I

    move-result v0

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/l;->a(I)[B

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/l;->a([BLjava/lang/String;)[B

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.miteksystems.misnap.PICTURE"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    const-string v0, "com.miteksystems.misnap.MIBI_DATA"

    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "com.miteksystems.misnap.HEIGHT"

    iget v2, p0, Lcom/miteksystems/misnap/l;->c:I

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "com.miteksystems.misnap.WIDTH"

    iget v2, p0, Lcom/miteksystems/misnap/l;->b:I

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :goto_1
    const-string v0, "com.miteksystems.misnap.QUALITY"

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->f()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const-string v2, "SuccessVideo"

    invoke-virtual {v0, v3, v1, v2}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    :goto_2
    return-void

    :cond_0
    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/l;->b(I)[B

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, "com.miteksystems.misnap.HEIGHT"

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->s:Landroid/hardware/Camera$Size;

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "com.miteksystems.misnap.WIDTH"

    iget-object v2, p0, Lcom/miteksystems/misnap/l;->s:Landroid/hardware/Camera$Size;

    iget v2, v2, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    const-string v2, "SuccessStillCamera"

    invoke-virtual {v0, v3, v1, v2}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    goto :goto_2
.end method

.method public final j()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/l;->y:Z

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    invoke-virtual {v0, p0}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/l;->x:Z

    :goto_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_capture_manual:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->s()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method final k()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->o()V

    iput-object v2, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    iput-object v2, p0, Lcom/miteksystems/misnap/l;->i:Lcom/miteksystems/misnap/MitekAnalyzer;

    return-void
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/miteksystems/misnap/l;->z:I

    return-void
.end method

.method public final onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/miteksystems/misnap/l;->d:Z

    if-eqz v0, :cond_0

    iput-boolean v2, p0, Lcom/miteksystems/misnap/l;->d:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->A:Landroid/os/Handler;

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    iput-boolean v2, p0, Lcom/miteksystems/misnap/l;->x:Z

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Done focusing...pictureInProgress:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/miteksystems/misnap/l;->w:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "mSnapPressed:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/miteksystems/misnap/l;->y:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget-boolean v0, p0, Lcom/miteksystems/misnap/l;->w:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/miteksystems/misnap/l;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->t()V

    :cond_2
    return-void
.end method

.method public final onError(ILandroid/hardware/Camera;)V
    .locals 2

    const/16 v0, 0x64

    if-ne p1, v0, :cond_0

    const-string v0, "MiSnapCamera"

    const-string v1, "Camera Server died"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    const-string v0, "MiSnapCamera"

    const-string v1, "Camera unknown error"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public final onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Picture taken: format = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getPictureFormat()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPictureSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->s:Landroid/hardware/Camera$Size;

    iput-object p1, p0, Lcom/miteksystems/misnap/l;->p:[B

    invoke-virtual {p0}, Lcom/miteksystems/misnap/l;->a()V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_capture_time:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/miteksystems/misnap/l;->v:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/miteksystems/misnap/l;->v:J

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "takePicture time:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/miteksystems/misnap/l;->v:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/l;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->a()V

    return-void
.end method

.method public final onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 5

    const/4 v4, 0x1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/l;->t:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v4, p0, Lcom/miteksystems/misnap/l;->t:Z

    sget-boolean v0, Lcom/miteksystems/misnap/l;->o:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->e:Ljava/lang/Runnable;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    sput-boolean v4, Lcom/miteksystems/misnap/l;->o:Z

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->a:Landroid/hardware/Camera;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->m()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    iget v1, v0, Landroid/hardware/Camera$Size;->width:I

    iput v1, p0, Lcom/miteksystems/misnap/l;->b:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    iput v0, p0, Lcom/miteksystems/misnap/l;->c:I

    :cond_1
    iput-object p2, p0, Lcom/miteksystems/misnap/l;->a:Landroid/hardware/Camera;

    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lcom/miteksystems/misnap/l;->u:[B

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/l;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->h:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_touch_screen:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    const/4 v0, 0x1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->q:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/l;->k:Landroid/os/Handler;

    new-instance v1, Lcom/miteksystems/misnap/p;

    invoke-direct {v1, p0, p1}, Lcom/miteksystems/misnap/p;-><init>(Lcom/miteksystems/misnap/l;Landroid/view/SurfaceHolder;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public final surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 0

    return-void
.end method

.method public final surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/l;->j:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->i()V

    :cond_0
    invoke-direct {p0}, Lcom/miteksystems/misnap/l;->o()V

    return-void
.end method
