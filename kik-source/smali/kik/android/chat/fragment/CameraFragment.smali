.class public Lkik/android/chat/fragment/CameraFragment;
.super Lkik/android/chat/fragment/KikScopedDialogFragment;
.source "SourceFile"

# interfaces
.implements Lcom/kik/h/b;
.implements Lkik/android/sdkutils/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/CameraFragment$a;,
        Lkik/android/chat/fragment/CameraFragment$c;,
        Lkik/android/chat/fragment/CameraFragment$b;
    }
.end annotation


# static fields
.field private static final e:Lorg/c/b;

.field private static final j:I

.field private static final n:Ljava/util/List;


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:Lkik/a/e/g;

.field private E:Lkik/android/chat/fragment/KikChatFragment$d;

.field private F:I

.field private G:Z

.field private H:Z

.field private I:Landroid/view/View;

.field private J:Lkik/android/widget/a;

.field private K:Lkik/android/c/a;

.field private L:Lkik/android/chat/fragment/CameraFragment$a;

.field private M:Landroid/hardware/Camera$Size;

.field private N:I

.field private O:Landroid/os/Handler;

.field private P:Z

.field private Q:Z

.field private R:Z

.field private S:Z

.field private U:Z

.field private V:Z

.field private W:Landroid/media/MediaRecorder;

.field private X:Ljava/lang/String;

.field private Y:Ljava/lang/String;

.field private Z:Landroid/os/CountDownTimer;

.field _cameraCover:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b0
    .end annotation
.end field

.field _cameraErrorCover:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00be
    .end annotation
.end field

.field _cameraShutterBar:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b7
    .end annotation
.end field

.field _clipFrame:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00af
    .end annotation
.end field

.field _lightingButton:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00bb
    .end annotation
.end field

.field _liveCameraContainer:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00ae
    .end annotation
.end field

.field _previewContainer:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b4
    .end annotation
.end field

.field _previewImage:Lkik/android/widget/AspectRatioImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b5
    .end annotation
.end field

.field _retakeButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b8
    .end annotation
.end field

.field _shadeCover:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b1
    .end annotation
.end field

.field _shutterButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b9
    .end annotation
.end field

.field _swapCameraButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00bc
    .end annotation
.end field

.field _touchFocusImage:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b3
    .end annotation
.end field

.field _usePhotoButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00ba
    .end annotation
.end field

.field _videoInstructionText:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b2
    .end annotation
.end field

.field _videoProgress:Landroid/widget/ProgressBar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00bf
    .end annotation
.end field

.field _videoTime:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00bd
    .end annotation
.end field

.field _videoView:Landroid/widget/VideoView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00b6
    .end annotation
.end field

.field a:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private aa:Lkik/android/chat/fragment/CameraFragment$c;

.field private ab:Lkik/android/e/c;

.field private ac:F

.field private ad:Landroid/hardware/Camera$ShutterCallback;

.field private ae:Landroid/hardware/Camera$AutoFocusCallback;

.field private af:Landroid/hardware/Camera$AutoFocusCallback;

.field private ag:Landroid/hardware/Camera$PictureCallback;

.field private ah:Landroid/view/View$OnLongClickListener;

.field private ai:Landroid/view/View$OnTouchListener;

.field private aj:Landroid/view/View$OnTouchListener;

.field b:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field c:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field d:Z

.field private f:Lkik/android/chat/fragment/KikChatFragment$e;

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:I

.field private k:Landroid/hardware/Camera;

.field private final l:Ljava/lang/Object;

.field private m:I

.field private o:Ljava/util/List;

.field private p:I

.field private q:I

.field private r:I

.field private s:Landroid/graphics/Bitmap;

.field private t:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 132
    const-string v0, "CameraFragment"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/chat/fragment/CameraFragment;->e:Lorg/c/b;

    .line 141
    invoke-static {}, Lkik/android/util/u;->a()I

    move-result v0

    sput v0, Lkik/android/chat/fragment/CameraFragment;->j:I

    .line 146
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "auto"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "off"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "on"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lkik/android/chat/fragment/CameraFragment;->n:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;-><init>()V

    .line 135
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->d:Lkik/android/chat/fragment/KikChatFragment$e;

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    .line 144
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->l:Ljava/lang/Object;

    .line 145
    iput v2, p0, Lkik/android/chat/fragment/CameraFragment;->m:I

    .line 147
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    .line 148
    iput v1, p0, Lkik/android/chat/fragment/CameraFragment;->p:I

    .line 155
    const v0, -0x777778

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->t:I

    .line 160
    iput v2, p0, Lkik/android/chat/fragment/CameraFragment;->x:I

    .line 161
    iput v2, p0, Lkik/android/chat/fragment/CameraFragment;->y:I

    .line 162
    iput v2, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    .line 172
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->G:Z

    .line 173
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->H:Z

    .line 174
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->d:Z

    .line 181
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->M:Landroid/hardware/Camera$Size;

    .line 183
    sget v0, Lkik/android/chat/fragment/CameraFragment$b;->b:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    .line 184
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->O:Landroid/os/Handler;

    .line 186
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->P:Z

    .line 187
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    .line 188
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->R:Z

    .line 189
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->S:Z

    .line 190
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->U:Z

    .line 191
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->V:Z

    .line 198
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->ac:F

    .line 374
    new-instance v0, Lkik/android/chat/fragment/k;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/k;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->ad:Landroid/hardware/Camera$ShutterCallback;

    .line 385
    new-instance v0, Lkik/android/chat/fragment/s;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/s;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->ae:Landroid/hardware/Camera$AutoFocusCallback;

    .line 394
    new-instance v0, Lkik/android/chat/fragment/t;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/t;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->af:Landroid/hardware/Camera$AutoFocusCallback;

    .line 474
    new-instance v0, Lkik/android/chat/fragment/u;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/u;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->ag:Landroid/hardware/Camera$PictureCallback;

    .line 656
    new-instance v0, Lkik/android/chat/fragment/l;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/l;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->ah:Landroid/view/View$OnLongClickListener;

    .line 672
    new-instance v0, Lkik/android/chat/fragment/m;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/m;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->ai:Landroid/view/View$OnTouchListener;

    .line 692
    new-instance v0, Lkik/android/chat/fragment/n;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/n;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->aj:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method private static a(I)I
    .locals 2

    .prologue
    const/16 v0, 0x3e7

    const/16 v1, -0x3e7

    .line 1055
    if-le p0, v0, :cond_1

    move p0, v0

    .line 1061
    :cond_0
    :goto_0
    return p0

    .line 1058
    :cond_1
    if-ge p0, v1, :cond_0

    move p0, v1

    .line 1059
    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/CameraFragment;)I
    .locals 1

    .prologue
    .line 92
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->A:I

    return v0
.end method

.method static synthetic a(Lkik/android/chat/fragment/CameraFragment;I)I
    .locals 0

    .prologue
    .line 92
    iput p1, p0, Lkik/android/chat/fragment/CameraFragment;->A:I

    return p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/CameraFragment;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lkik/android/chat/fragment/CameraFragment;->s:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method private a(Lcom/kik/android/a$f;)Lcom/kik/android/a$f;
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 1399
    if-nez p1, :cond_0

    .line 1400
    const/4 p1, 0x0

    .line 1410
    :goto_0
    return-object p1

    .line 1402
    :cond_0
    const-string v1, "Is Maximized"

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->m()Z

    move-result v2

    invoke-virtual {p1, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Has Front Facing"

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->n()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Front Facing"

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->o()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Has Flash"

    iget v3, p0, Lkik/android/chat/fragment/CameraFragment;->i:I

    if-le v3, v0, :cond_1

    :goto_1
    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Flash Mode"

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v3, "on"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v0, "On"

    :goto_2
    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Landscape"

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->p()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Attempts"

    iget v2, p0, Lkik/android/chat/fragment/CameraFragment;->F:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Tapped To Focus During Preview"

    iget-boolean v2, p0, Lkik/android/chat/fragment/CameraFragment;->G:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const-string v3, "auto"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Auto"

    goto :goto_2

    :cond_3
    const-string v0, "Off"

    goto :goto_2
.end method

.method static synthetic a(Lkik/android/chat/fragment/CameraFragment;IIZ)Lkik/android/i/d;
    .locals 13

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v4

    int-to-double v6, p2

    int-to-double v8, v2

    div-double/2addr v6, v8

    int-to-double v8, p1

    int-to-double v10, v2

    div-double/2addr v8, v10

    if-eqz p3, :cond_2

    sub-int v0, v2, v0

    int-to-double v0, v0

    mul-double/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v1, v0

    sub-int v0, v3, v4

    int-to-double v4, v0

    mul-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v0, v4

    :goto_0
    if-gez v1, :cond_0

    const/4 v1, 0x0

    :cond_0
    if-gez v0, :cond_1

    const/4 v0, 0x0

    :cond_1
    const/4 v4, 0x0

    iget-object v5, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    const/4 v5, 0x0

    iget-object v6, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    int-to-double v6, v5

    int-to-double v8, v2

    div-double/2addr v6, v8

    int-to-double v4, v4

    int-to-double v2, v3

    div-double/2addr v4, v2

    if-eqz p3, :cond_3

    int-to-double v2, p1

    mul-double/2addr v2, v4

    double-to-int v3, v2

    int-to-double v4, p2

    mul-double/2addr v4, v6

    double-to-int v2, v4

    sub-int v1, p2, v1

    sub-int v0, p1, v0

    move v12, v1

    move v1, v0

    move v0, v12

    :goto_1
    new-instance v4, Lkik/android/i/d;

    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6, v1, v0}, Landroid/graphics/Point;-><init>(II)V

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v3, v2}, Landroid/graphics/Point;-><init>(II)V

    invoke-direct {v4, v5, v6, v0}, Lkik/android/i/d;-><init>(Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;)V

    return-object v4

    :cond_2
    sub-int v0, v2, v0

    int-to-double v0, v0

    mul-double/2addr v0, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v1, v0

    sub-int v0, v3, v4

    int-to-double v4, v0

    mul-double/2addr v4, v8

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v0, v4

    goto :goto_0

    :cond_3
    int-to-double v2, p1

    mul-double/2addr v2, v6

    double-to-int v3, v2

    int-to-double v6, p2

    mul-double/2addr v4, v6

    double-to-int v2, v4

    sub-int v1, p1, v1

    sub-int v0, p2, v0

    goto :goto_1
.end method

.method private a(Landroid/hardware/Camera;)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 883
    if-eqz p1, :cond_0

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 885
    :cond_0
    if-eqz p1, :cond_1

    .line 886
    invoke-virtual {p1}, Landroid/hardware/Camera;->release()V

    .line 888
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-nez v0, :cond_2

    .line 890
    invoke-direct {p0, v1}, Lkik/android/chat/fragment/CameraFragment;->b(Z)V

    .line 923
    :cond_2
    :goto_0
    return-void

    .line 894
    :cond_3
    invoke-direct {p0, v2}, Lkik/android/chat/fragment/CameraFragment;->b(Z)V

    .line 895
    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->l:Ljava/lang/Object;

    monitor-enter v3

    .line 896
    :try_start_0
    iput-object p1, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    .line 897
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->e(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 901
    :try_start_1
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->f()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_4
    :goto_1
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->i:I

    if-lez v0, :cond_e

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->i:I

    if-ne v0, v1, :cond_5

    const-string v0, "off"

    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_5
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->h:Z

    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->h:Z

    if-eqz v0, :cond_11

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    const-string v1, "kik.android.chat.fragment.CameraFragment.FlashPreference"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    iput v1, p0, Lkik/android/chat/fragment/CameraFragment;->p:I

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    :goto_3
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->P:Z

    if-eqz v0, :cond_10

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->t()Z

    move-result v0

    if-eqz v0, :cond_10

    const-string v0, "torch"

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->b(Ljava/lang/String;)V

    .line 902
    :cond_6
    :goto_4
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    invoke-interface {v1}, Lkik/android/c/a;->a()Z

    move-result v1

    if-eqz v1, :cond_7

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    sget v2, Lkik/android/chat/fragment/CameraFragment$b;->a:I

    if-ne v1, v2, :cond_7

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->k()V

    :cond_7
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_9

    const-string v2, "continuous-picture"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    const-string v1, "continuous-picture"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    :cond_8
    :goto_5
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 905
    :cond_9
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-interface {v0, v1}, Lkik/android/c/a;->a(Landroid/hardware/Camera;)V

    .line 906
    sget v0, Lkik/android/chat/fragment/CameraFragment$b;->a:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    .line 911
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/o;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/o;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    const-wide/16 v4, 0x64

    invoke-virtual {v0, v1, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 923
    :goto_6
    :try_start_2
    monitor-exit v3

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 901
    :cond_a
    :try_start_3
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v4

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-nez v4, :cond_b

    const/4 v0, 0x0

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->i:I
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    .line 921
    :catch_0
    move-exception v0

    const/4 v0, 0x1

    :try_start_4
    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->b(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_6

    .line 901
    :cond_b
    :try_start_5
    sget-object v0, Lkik/android/chat/fragment/CameraFragment;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    iget-object v6, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->i:I

    goto/16 :goto_1

    :cond_e
    move v0, v2

    goto/16 :goto_2

    :cond_f
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->p:I

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    const-string v1, "kik.android.chat.fragment.CameraFragment.FlashPreference"

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    goto/16 :goto_3

    :cond_10
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->b(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_11
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->a(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 902
    :cond_12
    const-string v2, "auto"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "auto"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_5
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1838
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    if-nez v0, :cond_1

    .line 1863
    :cond_0
    :goto_0
    return-void

    .line 1841
    :cond_1
    if-nez p1, :cond_2

    .line 1842
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 1846
    :cond_2
    new-array v0, v1, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1847
    const-string v0, "auto"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1848
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    const v3, 0x7f02011e

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1860
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_previewContainer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    move v0, v1

    :goto_2
    if-nez v0, :cond_3

    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->P:Z

    if-eqz v0, :cond_0

    .line 1861
    :cond_3
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0

    .line 1850
    :cond_4
    const-string v0, "off"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1851
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    const v3, 0x7f02011f

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 1853
    :cond_5
    const-string v0, "on"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1854
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    const v3, 0x7f020120

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 1857
    :cond_6
    new-array v0, v1, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_1

    :cond_7
    move v0, v2

    .line 1860
    goto :goto_2
.end method

.method static synthetic a(Lkik/android/chat/fragment/CameraFragment;FF)V
    .locals 6

    .prologue
    const/high16 v4, 0x42c80000    # 100.0f

    .line 92
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->k()V

    new-instance v0, Landroid/graphics/Rect;

    sub-float v1, p1, v4

    float-to-int v1, v1

    sub-float v2, p2, v4

    float-to-int v2, v2

    add-float v3, p1, v4

    float-to-int v3, v3

    add-float/2addr v4, p2

    float-to-int v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iget v1, v0, Landroid/graphics/Rect;->left:I

    mul-int/lit16 v1, v1, 0x7d0

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    div-int/2addr v1, v2

    add-int/lit16 v1, v1, -0x3e8

    iget v2, v0, Landroid/graphics/Rect;->top:I

    mul-int/lit16 v2, v2, 0x7d0

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v3

    div-int/2addr v2, v3

    add-int/lit16 v2, v2, -0x3e8

    iget v3, v0, Landroid/graphics/Rect;->right:I

    mul-int/lit16 v3, v3, 0x7d0

    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v4}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v4

    div-int/2addr v3, v4

    add-int/lit16 v3, v3, -0x3e8

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    mul-int/lit16 v0, v0, 0x7d0

    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v4}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v4

    div-int/2addr v0, v4

    add-int/lit16 v0, v0, -0x3e8

    new-instance v4, Landroid/graphics/Rect;

    invoke-static {v1}, Lkik/android/chat/fragment/CameraFragment;->a(I)I

    move-result v1

    invoke-static {v2}, Lkik/android/chat/fragment/CameraFragment;->a(I)I

    move-result v2

    invoke-static {v3}, Lkik/android/chat/fragment/CameraFragment;->a(I)I

    move-result v3

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->a(I)I

    move-result v0

    invoke-direct {v4, v1, v2, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "auto"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "auto"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getMaxNumFocusAreas()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/hardware/Camera$Area;

    const/4 v2, 0x0

    new-instance v3, Landroid/hardware/Camera$Area;

    const/16 v5, 0x3e8

    invoke-direct {v3, v4, v5}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    aput-object v3, v1, v2

    invoke-static {v1}, Lcom/c/a/b/ab;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFocusAreas(Ljava/util/List;)V

    :cond_1
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getMaxNumMeteringAreas()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/hardware/Camera$Area;

    const/4 v2, 0x0

    new-instance v3, Landroid/hardware/Camera$Area;

    const/16 v5, 0x3e8

    invoke-direct {v3, v4, v5}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    aput-object v3, v1, v2

    invoke-static {v1}, Lcom/c/a/b/ab;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setMeteringAreas(Ljava/util/List;)V

    :cond_2
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_touchFocusImage:Landroid/widget/FrameLayout;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->V:Z

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->af:Landroid/hardware/Camera$AutoFocusCallback;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/CameraFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/CameraFragment;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/CameraFragment;)I
    .locals 1

    .prologue
    .line 92
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->q:I

    return v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/CameraFragment;I)I
    .locals 0

    .prologue
    .line 92
    iput p1, p0, Lkik/android/chat/fragment/CameraFragment;->r:I

    return p1
.end method

.method private b(Lcom/kik/android/a$f;)Lcom/kik/android/a$f;
    .locals 4

    .prologue
    .line 1415
    if-nez p1, :cond_0

    .line 1416
    const/4 v0, 0x0

    .line 1424
    :goto_0
    return-object v0

    .line 1418
    :cond_0
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/CameraFragment;->a(Lcom/kik/android/a$f;)Lcom/kik/android/a$f;

    move-result-object v0

    .line 1419
    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->ac:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    .line 1420
    const-string v1, "Video Length"

    iget v2, p0, Lkik/android/chat/fragment/CameraFragment;->ac:F

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    .line 1422
    :cond_1
    const-string v1, "Tapped To Focus During Preview"

    iget-boolean v2, p0, Lkik/android/chat/fragment/CameraFragment;->G:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    .line 1423
    const-string v1, "Tapped To Focus During Recording"

    iget-boolean v2, p0, Lkik/android/chat/fragment/CameraFragment;->H:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1892
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 1893
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    .line 1894
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1895
    invoke-virtual {v0, p1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 1896
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 1899
    :cond_0
    return-void
.end method

.method private b(Z)V
    .locals 5

    .prologue
    const/4 v1, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 928
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_cameraErrorCover:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 929
    if-eqz p1, :cond_1

    .line 930
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_cameraErrorCover:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 931
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 940
    :cond_0
    :goto_0
    return-void

    .line 934
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_usePhotoButton:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_usePhotoButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    .line 935
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 937
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_cameraErrorCover:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private c(Z)I
    .locals 2

    .prologue
    .line 1268
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 1269
    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    invoke-static {v1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 1271
    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->r:I

    invoke-static {v0, v1}, Lkik/android/util/u;->a(Landroid/hardware/Camera$CameraInfo;I)I

    move-result v1

    iput v1, p0, Lkik/android/chat/fragment/CameraFragment;->B:I

    .line 1273
    if-eqz p1, :cond_0

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->A:I

    invoke-static {v0, v1}, Lkik/android/util/u;->a(Landroid/hardware/Camera$CameraInfo;I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->B:I

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/chat/fragment/CameraFragment;)Lkik/android/c/a;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/CameraFragment;I)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/CameraFragment;->e(I)V

    return-void
.end method

.method static synthetic d(Lkik/android/chat/fragment/CameraFragment;)Landroid/hardware/Camera;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    return-object v0
.end method

.method private d(Z)V
    .locals 1

    .prologue
    .line 1649
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1650
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 1652
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 1653
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 1655
    :cond_1
    return-void
.end method

.method private e(I)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 1071
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->l:Ljava/lang/Object;

    monitor-enter v1

    .line 1072
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1073
    :cond_0
    monitor-exit v1

    .line 1149
    :cond_1
    :goto_0
    return-void

    .line 1075
    :cond_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1077
    if-ltz p1, :cond_8

    .line 1078
    invoke-static {p1}, Lkik/android/util/u;->a(I)I

    move-result v0

    .line 1084
    :goto_1
    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    invoke-static {v0, v1}, Lkik/android/util/u;->a(II)I

    move-result v0

    .line 1085
    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->m:I

    if-eq v1, v0, :cond_1

    .line 1089
    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->m:I

    .line 1090
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1091
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 1092
    iput-boolean v8, p0, Lkik/android/chat/fragment/CameraFragment;->d:Z

    .line 1095
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->m:I

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 1096
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 1098
    const-wide v0, 0x3ff5555555555555L    # 1.3333333333333333

    .line 1100
    const/16 v3, 0xe

    invoke-static {v3}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedVideoSizes()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 1101
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedVideoSizes()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/u;->a(Ljava/util/List;)Landroid/hardware/Camera$Size;

    move-result-object v3

    .line 1103
    if-eqz v3, :cond_9

    .line 1104
    iget v0, v3, Landroid/hardware/Camera$Size;->width:I

    int-to-double v0, v0

    iget v4, v3, Landroid/hardware/Camera$Size;->height:I

    int-to-double v4, v4

    div-double/2addr v0, v4

    .line 1105
    iput-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->M:Landroid/hardware/Camera$Size;

    .line 1113
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lkik/android/chat/fragment/CameraFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4, v0, v1}, Lkik/android/util/u;->b(Landroid/app/Activity;Ljava/util/List;D)Landroid/hardware/Camera$Size;

    move-result-object v3

    .line 1114
    iget v0, v3, Landroid/hardware/Camera$Size;->width:I

    iget v1, v3, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v2, v0, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 1117
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v0

    .line 1118
    invoke-virtual {p0}, Lkik/android/chat/fragment/CameraFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget v4, v3, Landroid/hardware/Camera$Size;->width:I

    int-to-double v4, v4

    iget v6, v3, Landroid/hardware/Camera$Size;->height:I

    int-to-double v6, v6

    div-double/2addr v4, v6

    invoke-static {v1, v0, v4, v5}, Lkik/android/util/u;->a(Landroid/app/Activity;Ljava/util/List;D)Landroid/hardware/Camera$Size;

    move-result-object v0

    .line 1121
    if-eqz v0, :cond_5

    .line 1122
    iget v1, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v2, v1, v0}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    .line 1130
    :cond_5
    iget v1, v3, Landroid/hardware/Camera$Size;->width:I

    .line 1131
    iget v0, v3, Landroid/hardware/Camera$Size;->height:I

    .line 1132
    iget v4, p0, Lkik/android/chat/fragment/CameraFragment;->m:I

    rem-int/lit16 v4, v4, 0xb4

    if-eqz v4, :cond_6

    .line 1133
    iget v1, v3, Landroid/hardware/Camera$Size;->height:I

    .line 1134
    iget v0, v3, Landroid/hardware/Camera$Size;->width:I

    .line 1137
    :cond_6
    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 1138
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v4, v4

    int-to-float v1, v1

    div-float v1, v4, v1

    .line 1139
    int-to-float v0, v0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 1140
    iget v1, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1141
    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->J:Lkik/android/widget/a;

    invoke-interface {v3, v1, v0}, Lkik/android/widget/a;->a(II)V

    .line 1143
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/u;->b(Ljava/util/List;)[I

    move-result-object v0

    .line 1144
    if-eqz v0, :cond_7

    .line 1145
    aget v1, v0, v8

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-virtual {v2, v1, v0}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    .line 1148
    :cond_7
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    goto/16 :goto_0

    .line 1075
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 1081
    :cond_8
    invoke-virtual {p0}, Lkik/android/chat/fragment/CameraFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/u;->a(Landroid/app/Activity;)I

    move-result v0

    goto/16 :goto_1

    .line 1108
    :cond_9
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    invoke-static {v0}, Lkik/android/chat/fragment/CameraFragment;->f(I)Landroid/media/CamcorderProfile;

    move-result-object v0

    .line 1109
    iget v1, v0, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    int-to-double v4, v1

    iget v0, v0, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    int-to-double v0, v0

    div-double v0, v4, v0

    goto/16 :goto_2
.end method

.method private e(Z)V
    .locals 1

    .prologue
    .line 1659
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1660
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 1662
    :cond_0
    return-void
.end method

.method static synthetic e(Lkik/android/chat/fragment/CameraFragment;)Z
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->V:Z

    return v0
.end method

.method private static f(I)Landroid/media/CamcorderProfile;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const/4 v1, 0x4

    .line 1279
    invoke-static {p0, v1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1280
    invoke-static {p0, v1}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object v0

    .line 1284
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic f(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->k()V

    return-void
.end method

.method private f()Z
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_liveCameraContainer:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 647
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->q()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 648
    :cond_0
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_videoInstructionText:Landroid/widget/TextView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 654
    :goto_0
    return-void

    .line 651
    :cond_1
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_videoInstructionText:Landroid/widget/TextView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 652
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoInstructionText:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->bringToFront()V

    goto :goto_0
.end method

.method static synthetic g(Lkik/android/chat/fragment/CameraFragment;)Z
    .locals 1

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->p()Z

    move-result v0

    return v0
.end method

.method static synthetic h(Lkik/android/chat/fragment/CameraFragment;)I
    .locals 1

    .prologue
    .line 92
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->B:I

    return v0
.end method

.method private h()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 795
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->l:Ljava/lang/Object;

    monitor-enter v1

    .line 796
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 798
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->a(Landroid/hardware/Camera;)V

    .line 799
    monitor-exit v1

    .line 808
    :goto_0
    return-void

    .line 801
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 803
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->x:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->y:I

    if-eq v0, v2, :cond_2

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    const-string v1, "kik.android.chat.fragment.CameraFragment.SelectCameraPreference"

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    .line 805
    :cond_2
    :goto_1
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    invoke-static {v0}, Lkik/android/util/u;->b(I)Landroid/hardware/Camera;

    move-result-object v0

    .line 807
    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->a(Landroid/hardware/Camera;)V

    goto :goto_0

    .line 801
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 803
    :cond_3
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->y:I

    if-eq v0, v2, :cond_4

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->y:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    const-string v1, "kik.android.chat.fragment.CameraFragment.SelectCameraPreference"

    iget v2, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Integer;)Z

    goto :goto_1

    :cond_4
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->x:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    goto :goto_2
.end method

.method private i()V
    .locals 2

    .prologue
    .line 854
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->l:Ljava/lang/Object;

    monitor-enter v1

    .line 855
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 857
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 858
    sget v0, Lkik/android/chat/fragment/CameraFragment$b;->b:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    .line 859
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    invoke-interface {v0}, Lkik/android/c/a;->b()V

    .line 864
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 865
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    .line 866
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->d:Z

    .line 867
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->m:I

    .line 869
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic i(Lkik/android/chat/fragment/CameraFragment;)Z
    .locals 1

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->o()Z

    move-result v0

    return v0
.end method

.method private j()V
    .locals 1

    .prologue
    .line 874
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_0

    .line 875
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V

    .line 876
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 877
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    .line 879
    :cond_0
    return-void
.end method

.method static synthetic j(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 92
    invoke-direct {p0, v2}, Lkik/android/chat/fragment/CameraFragment;->d(Z)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/CameraFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    const v1, 0x7f0900ae

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method private k()V
    .locals 1

    .prologue
    .line 986
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 988
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 992
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic k(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->l:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    sget v0, Lkik/android/chat/fragment/CameraFragment$b;->a:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    monitor-exit v1

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic l(Lkik/android/chat/fragment/CameraFragment;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->s:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private l()V
    .locals 2

    .prologue
    .line 1354
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1355
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoTime:Landroid/widget/TextView;

    const-string v1, "00:00"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1356
    return-void
.end method

.method static synthetic m(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_previewContainer:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_liveCameraContainer:Landroid/view/View;

    aput-object v1, v0, v4

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v1, v0, v5

    const/4 v1, 0x3

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_videoTime:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    new-array v0, v5, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_previewContainer:Landroid/view/View;

    aput-object v1, v0, v4

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_previewImage:Lkik/android/widget/AspectRatioImageView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    new-array v0, v5, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_usePhotoButton:Landroid/view/View;

    aput-object v1, v0, v4

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_retakeButton:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    invoke-direct {p0, v3}, Lkik/android/chat/fragment/CameraFragment;->d(Z)V

    :cond_0
    return-void
.end method

.method private m()Z
    .locals 2

    .prologue
    .line 1490
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment$e;->c:Lkik/android/chat/fragment/KikChatFragment$e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private n()Z
    .locals 1

    .prologue
    .line 1495
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->x:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic n(Lkik/android/chat/fragment/CameraFragment;)Z
    .locals 1

    .prologue
    .line 92
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->P:Z

    return v0
.end method

.method static synthetic o(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->j()V

    return-void
.end method

.method private o()Z
    .locals 2

    .prologue
    .line 1500
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->x:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic p(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->i()V

    return-void
.end method

.method private p()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1510
    invoke-virtual {p0}, Lkik/android/chat/fragment/CameraFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 1511
    if-nez v1, :cond_1

    .line 1515
    :cond_0
    :goto_0
    return v0

    .line 1514
    :cond_1
    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 1515
    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic q(Lkik/android/chat/fragment/CameraFragment;)Landroid/view/View$OnTouchListener;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->aj:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method private q()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1560
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    const-string v2, "kik.num-videos-sent"

    invoke-interface {v1, v2, v0}, Lkik/a/e/v;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method static synthetic r(Lkik/android/chat/fragment/CameraFragment;)Lkik/android/e/c;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->ab:Lkik/android/e/c;

    return-object v0
.end method

.method private r()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 1670
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_previewContainer:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1671
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_liveCameraContainer:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1672
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1673
    const/4 v0, 0x4

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_usePhotoButton:Landroid/view/View;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_retakeButton:Landroid/view/View;

    aput-object v1, v0, v4

    const/4 v1, 0x2

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_previewContainer:Landroid/view/View;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1675
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->h:Z

    if-eqz v0, :cond_1

    .line 1676
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1681
    :goto_0
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->s()V

    .line 1684
    invoke-direct {p0, v4}, Lkik/android/chat/fragment/CameraFragment;->d(Z)V

    .line 1685
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1686
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    .line 1688
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1697
    :goto_1
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->g()V

    .line 1698
    invoke-static {}, Lkik/android/HeadphoneUnpluggedReceiver;->a()Lkik/android/HeadphoneUnpluggedReceiver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkik/android/HeadphoneUnpluggedReceiver;->b(Lkik/android/sdkutils/a;)V

    .line 1699
    iput-boolean v3, p0, Lkik/android/chat/fragment/CameraFragment;->R:Z

    .line 1700
    invoke-static {}, Lkik/android/util/DeviceUtils;->h()V

    .line 1702
    :cond_0
    return-void

    .line 1679
    :cond_1
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0

    .line 1691
    :catch_0
    move-exception v0

    invoke-direct {p0, v4}, Lkik/android/chat/fragment/CameraFragment;->b(Z)V

    goto :goto_1

    .line 1695
    :cond_2
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->h()V

    goto :goto_1
.end method

.method private s()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 1706
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1707
    sget v0, Lkik/android/chat/fragment/CameraFragment;->j:I

    if-le v0, v1, :cond_1

    .line 1708
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1714
    :cond_0
    :goto_0
    return-void

    .line 1711
    :cond_1
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0
.end method

.method static synthetic s(Lkik/android/chat/fragment/CameraFragment;)Z
    .locals 1

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->t()Z

    move-result v0

    return v0
.end method

.method private t()Z
    .locals 2

    .prologue
    .line 1903
    const-string v0, "on"

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->y:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v0

    const-string v1, "torch"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic t(Lkik/android/chat/fragment/CameraFragment;)Z
    .locals 1

    .prologue
    .line 92
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    return v0
.end method

.method static synthetic u(Lkik/android/chat/fragment/CameraFragment;)Z
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->H:Z

    return v0
.end method

.method static synthetic v(Lkik/android/chat/fragment/CameraFragment;)Z
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->G:Z

    return v0
.end method

.method static synthetic w(Lkik/android/chat/fragment/CameraFragment;)V
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->e(Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const v8, 0xea600

    const/16 v3, 0x10

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 1154
    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-nez v2, :cond_1

    .line 1264
    :cond_0
    :goto_0
    return-void

    .line 1159
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->m()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v3}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1160
    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->U:Z

    .line 1161
    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->E:Lkik/android/chat/fragment/KikChatFragment$d;

    if-eqz v2, :cond_2

    .line 1162
    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->E:Lkik/android/chat/fragment/KikChatFragment$d;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikChatFragment$d;->a()V

    .line 1165
    :cond_2
    iget v2, p0, Lkik/android/chat/fragment/CameraFragment;->F:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lkik/android/chat/fragment/CameraFragment;->F:I

    .line 1168
    :try_start_0
    iget v2, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    invoke-static {v2}, Lkik/android/chat/fragment/CameraFragment;->f(I)Landroid/media/CamcorderProfile;

    move-result-object v3

    .line 1169
    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v4

    .line 1170
    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v5

    .line 1171
    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getSupportedVideoSizes()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_7

    move v2, v0

    .line 1173
    :goto_1
    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v6

    const-string v7, "continuous-video"

    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 1174
    const-string v6, "continuous-video"

    invoke-virtual {v4, v6}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 1176
    :cond_3
    iget-object v6, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v6, v4}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 1178
    new-instance v4, Landroid/media/MediaRecorder;

    invoke-direct {v4}, Landroid/media/MediaRecorder;-><init>()V

    iput-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    .line 1179
    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v4}, Landroid/hardware/Camera;->stopPreview()V

    .line 1180
    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v4}, Landroid/hardware/Camera;->unlock()V

    .line 1181
    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    iget-object v6, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v4, v6}, Landroid/media/MediaRecorder;->setCamera(Landroid/hardware/Camera;)V

    .line 1182
    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    const/4 v6, 0x5

    invoke-virtual {v4, v6}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    .line 1183
    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Landroid/media/MediaRecorder;->setVideoSource(I)V

    .line 1186
    iget v4, p0, Lkik/android/chat/fragment/CameraFragment;->r:I

    if-nez v4, :cond_8

    .line 1187
    :goto_2
    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->c(Z)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/media/MediaRecorder;->setOrientationHint(I)V

    .line 1189
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0, v3}, Landroid/media/MediaRecorder;->setProfile(Landroid/media/CamcorderProfile;)V

    .line 1191
    iget v0, v3, Landroid/media/CamcorderProfile;->videoBitRate:I

    if-ge v8, v0, :cond_4

    .line 1192
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    const v3, 0xea600

    invoke-virtual {v0, v3}, Landroid/media/MediaRecorder;->setVideoEncodingBitRate(I)V

    .line 1196
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    instance-of v0, v0, Lkik/android/c/c;

    if-eqz v0, :cond_5

    .line 1197
    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    check-cast v0, Lkik/android/c/c;

    invoke-virtual {v0}, Lkik/android/c/c;->d()Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/media/MediaRecorder;->setPreviewDisplay(Landroid/view/Surface;)V

    .line 1200
    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->M:Landroid/hardware/Camera$Size;

    if-eqz v0, :cond_9

    .line 1201
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->M:Landroid/hardware/Camera$Size;

    iget v2, v2, Landroid/hardware/Camera$Size;->width:I

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->M:Landroid/hardware/Camera$Size;

    iget v3, v3, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaRecorder;->setVideoSize(II)V

    .line 1211
    :cond_6
    :goto_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->Y:Ljava/lang/String;

    .line 1212
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->c:Lcom/kik/l/ab;

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->Y:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/kik/l/ab;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->X:Ljava/lang/String;

    .line 1214
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->X:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    .line 1216
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    const/16 v2, 0x3a98

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setMaxDuration(I)V

    .line 1217
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    const-wide/32 v2, 0x4c4b40

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaRecorder;->setMaxFileSize(J)V

    .line 1219
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    new-instance v2, Lkik/android/chat/fragment/p;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/p;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setOnInfoListener(Landroid/media/MediaRecorder$OnInfoListener;)V

    .line 1229
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->prepare()V

    .line 1231
    new-instance v0, Lkik/android/chat/fragment/q;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/q;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->Z:Landroid/os/CountDownTimer;

    .line 1247
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->start()V

    .line 1248
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->Z:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 1249
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->P:Z

    .line 1250
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_videoTime:Landroid/widget/TextView;

    aput-object v3, v0, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    const/4 v0, 0x4

    new-array v0, v0, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_retakeButton:Landroid/view/View;

    aput-object v3, v0, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v3, v0, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    aput-object v3, v0, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_videoInstructionText:Landroid/widget/TextView;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1252
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->aa:Lkik/android/chat/fragment/CameraFragment$c;

    if-eqz v0, :cond_0

    .line 1253
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->aa:Lkik/android/chat/fragment/CameraFragment$c;

    invoke-interface {v0}, Lkik/android/chat/fragment/CameraFragment$c;->a()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_0

    .line 1258
    :catch_0
    move-exception v0

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f090266

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    :cond_7
    move v2, v1

    .line 1171
    goto/16 :goto_1

    :cond_8
    move v0, v1

    .line 1186
    goto/16 :goto_2

    .line 1203
    :cond_9
    if-eqz v2, :cond_6

    const/16 v0, 0x10

    :try_start_1
    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1208
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    iget v2, v5, Landroid/hardware/Camera$Size;->width:I

    iget v3, v5, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaRecorder;->setVideoSize(II)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_3

    .line 1260
    :catch_1
    move-exception v0

    .line 1262
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Something went wrong preparing video recording: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0
.end method

.method public final a(Lkik/a/e/g;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 300
    iput-object p1, p0, Lkik/android/chat/fragment/CameraFragment;->D:Lkik/a/e/g;

    .line 302
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->b:Lcom/kik/android/a;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->b:Lcom/kik/android/a;

    const-string v2, "Camera Tray Opened"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Is Maximized"

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->m()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Has Front Facing"

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->n()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Has Flash"

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->i:I

    if-le v0, v1, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v2, v3, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Is Landscape"

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->p()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Has Permission"

    invoke-virtual {v0, v2, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 310
    :cond_0
    return-void

    .line 303
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lkik/android/chat/fragment/CameraFragment$c;)V
    .locals 0

    .prologue
    .line 550
    iput-object p1, p0, Lkik/android/chat/fragment/CameraFragment;->aa:Lkik/android/chat/fragment/CameraFragment$c;

    .line 551
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikChatFragment$d;)V
    .locals 0

    .prologue
    .line 1909
    iput-object p1, p0, Lkik/android/chat/fragment/CameraFragment;->E:Lkik/android/chat/fragment/KikChatFragment$d;

    .line 1910
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikChatFragment$e;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 214
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    if-ne p1, v0, :cond_a

    .line 218
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 219
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 220
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    iget v3, p0, Lkik/android/chat/fragment/CameraFragment;->t:I

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 221
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 222
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 235
    :cond_0
    :goto_0
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->g:Lkik/android/chat/fragment/KikChatFragment$e;

    if-ne p1, v0, :cond_1

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    sget v3, Lkik/android/chat/fragment/CameraFragment$b;->a:I

    if-ne v0, v3, :cond_1

    .line 236
    invoke-direct {p0, v1}, Lkik/android/chat/fragment/CameraFragment;->d(Z)V

    .line 239
    :cond_1
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->a:Lkik/android/chat/fragment/KikChatFragment$e;

    if-ne p1, v0, :cond_2

    .line 240
    iput v2, p0, Lkik/android/chat/fragment/CameraFragment;->F:I

    .line 242
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 243
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    .line 247
    :cond_2
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->c:Lkik/android/chat/fragment/KikChatFragment$e;

    if-eq p1, v0, :cond_3

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->b:Lkik/android/chat/fragment/KikChatFragment$e;

    if-ne p1, v0, :cond_6

    .line 250
    :cond_3
    invoke-direct {p0, v1}, Lkik/android/chat/fragment/CameraFragment;->d(Z)V

    .line 252
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    if-nez v0, :cond_b

    .line 255
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 257
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 258
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 261
    :cond_4
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->h()V

    .line 273
    :cond_5
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    sget-object v3, Lkik/android/chat/fragment/KikChatFragment$e;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    if-eq v0, v3, :cond_d

    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->S:Z

    if-eqz v0, :cond_d

    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->S:Z

    .line 275
    iput-object p1, p0, Lkik/android/chat/fragment/CameraFragment;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    .line 279
    :cond_6
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    if-eq p1, v0, :cond_7

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->e:Lkik/android/chat/fragment/KikChatFragment$e;

    if-eq p1, v0, :cond_7

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->a:Lkik/android/chat/fragment/KikChatFragment$e;

    if-eq p1, v0, :cond_7

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->d:Lkik/android/chat/fragment/KikChatFragment$e;

    if-ne p1, v0, :cond_8

    .line 281
    :cond_7
    iput-object p1, p0, Lkik/android/chat/fragment/CameraFragment;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    .line 283
    iput-boolean v2, p0, Lkik/android/chat/fragment/CameraFragment;->G:Z

    .line 284
    iput-boolean v2, p0, Lkik/android/chat/fragment/CameraFragment;->H:Z

    .line 285
    new-array v0, v1, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_touchFocusImage:Landroid/widget/FrameLayout;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 288
    :cond_8
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->g:Lkik/android/chat/fragment/KikChatFragment$e;

    if-ne p1, v0, :cond_9

    .line 289
    iput-boolean v1, p0, Lkik/android/chat/fragment/CameraFragment;->S:Z

    .line 290
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_9

    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    if-eqz v0, :cond_9

    .line 291
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 295
    :cond_9
    return-void

    .line 224
    :cond_a
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->g:Lkik/android/chat/fragment/KikChatFragment$e;

    if-ne p1, v0, :cond_0

    .line 225
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 227
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 229
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 230
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shadeCover:Landroid/view/View;

    iget v3, p0, Lkik/android/chat/fragment/CameraFragment;->t:I

    sget v4, Lcom/kik/android/a/c$a;->b:I

    invoke-static {v0, v3, v4}, Lkik/android/util/av;->a(Landroid/view/View;II)V

    .line 231
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->h()V

    goto/16 :goto_0

    .line 264
    :cond_b
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_c

    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->S:Z

    if-eqz v0, :cond_c

    .line 265
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    goto/16 :goto_1

    .line 267
    :cond_c
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    sget-object v3, Lkik/android/chat/fragment/KikChatFragment$e;->e:Lkik/android/chat/fragment/KikChatFragment$e;

    if-eq v0, v3, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    sget-object v3, Lkik/android/chat/fragment/KikChatFragment$e;->d:Lkik/android/chat/fragment/KikChatFragment$e;

    if-eq v0, v3, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    sget-object v3, Lkik/android/chat/fragment/KikChatFragment$e;->h:Lkik/android/chat/fragment/KikChatFragment$e;

    if-eq v0, v3, :cond_5

    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->U:Z

    if-nez v0, :cond_5

    .line 270
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    goto/16 :goto_1

    :cond_d
    move v0, v2

    .line 273
    goto/16 :goto_2
.end method

.method public final a(Lkik/android/e/c;)V
    .locals 0

    .prologue
    .line 555
    iput-object p1, p0, Lkik/android/chat/fragment/CameraFragment;->ab:Lkik/android/e/c;

    .line 556
    return-void
.end method

.method final b()V
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 1290
    iput-boolean v4, p0, Lkik/android/chat/fragment/CameraFragment;->P:Z

    .line 1291
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->Z:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 1293
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->aa:Lkik/android/chat/fragment/CameraFragment$c;

    if-eqz v0, :cond_0

    .line 1294
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->aa:Lkik/android/chat/fragment/CameraFragment$c;

    invoke-interface {v0}, Lkik/android/chat/fragment/CameraFragment$c;->b()V

    .line 1297
    :cond_0
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->V:Z

    if-eqz v0, :cond_1

    .line 1298
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->k()V

    .line 1299
    iput-boolean v4, p0, Lkik/android/chat/fragment/CameraFragment;->V:Z

    .line 1301
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_touchFocusImage:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 1302
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_touchFocusImage:Landroid/widget/FrameLayout;

    const/16 v1, 0xfa

    invoke-static {v0, v1}, Lkik/android/util/av;->b(Landroid/view/View;I)V

    .line 1309
    :cond_1
    const-string v0, "on"

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1310
    const-string v0, "off"

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->b(Ljava/lang/String;)V

    .line 1314
    :cond_2
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v0, :cond_3

    .line 1316
    :try_start_1
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1327
    :try_start_2
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->reset()V

    .line 1328
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 1329
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    .line 1332
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_3

    .line 1333
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->lock()V

    .line 1334
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->reconnect()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 1346
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    int-to-float v0, v0

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->ac:F

    .line 1347
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->l()V

    .line 1348
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_5

    iput-boolean v5, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    invoke-static {}, Lkik/android/HeadphoneUnpluggedReceiver;->a()Lkik/android/HeadphoneUnpluggedReceiver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkik/android/HeadphoneUnpluggedReceiver;->a(Lkik/android/sdkutils/a;)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->b(Ljava/lang/String;)V

    :cond_4
    new-array v0, v8, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    aput-object v1, v0, v4

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_usePhotoButton:Landroid/view/View;

    aput-object v1, v0, v5

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_retakeButton:Landroid/view/View;

    aput-object v1, v0, v7

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    const/16 v1, 0x96

    invoke-static {v0, v1}, Lkik/android/util/av;->b(Landroid/view/View;I)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_previewContainer:Landroid/view/View;

    const/16 v1, 0x96

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3, v6}, Lkik/android/util/av;->a(Landroid/view/View;IJLandroid/animation/Animator$AnimatorListener;)V

    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_previewImage:Lkik/android/widget/AspectRatioImageView;

    aput-object v1, v0, v4

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    aput-object v1, v0, v5

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_lightingButton:Landroid/widget/ImageView;

    aput-object v1, v0, v7

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_swapCameraButton:Landroid/view/View;

    aput-object v1, v0, v8

    const/4 v1, 0x4

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_videoTime:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->X:Ljava/lang/String;

    invoke-static {v1}, Lkik/android/VideoContentProvider;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    new-instance v1, Lkik/android/chat/fragment/r;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/r;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->requestFocus()Z

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->U:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->E:Lkik/android/chat/fragment/KikChatFragment$d;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->E:Lkik/android/chat/fragment/KikChatFragment$d;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->b()V

    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->b:Lcom/kik/android/a;

    const-string v1, "Video Recorded"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->b(Lcom/kik/android/a$f;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1349
    iput-boolean v4, p0, Lkik/android/chat/fragment/CameraFragment;->U:Z

    .line 1350
    :goto_0
    return-void

    .line 1321
    :catch_0
    move-exception v0

    :try_start_3
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0900df

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1322
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->_videoTime:Landroid/widget/TextView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1323
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->r()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1327
    :try_start_4
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->reset()V

    .line 1328
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 1329
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 1341
    :catch_1
    move-exception v0

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090266

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1342
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->l()V

    goto :goto_0

    .line 1327
    :catchall_0
    move-exception v0

    :try_start_5
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v1}, Landroid/media/MediaRecorder;->reset()V

    .line 1328
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    invoke-virtual {v1}, Landroid/media/MediaRecorder;->release()V

    .line 1329
    const/4 v1, 0x0

    iput-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->W:Landroid/media/MediaRecorder;

    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 1360
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    sget v1, Lkik/android/chat/fragment/CameraFragment$b;->a:I

    if-eq v0, v1, :cond_1

    .line 1395
    :cond_0
    :goto_0
    return-void

    .line 1366
    :cond_1
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->d(Z)V

    .line 1367
    sget v0, Lkik/android/chat/fragment/CameraFragment$b;->d:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    .line 1369
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v0

    .line 1370
    const-string v1, "auto"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1371
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->ae:Landroid/hardware/Camera$AutoFocusCallback;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1391
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 1393
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->b(Z)V

    goto :goto_0

    .line 1373
    :cond_2
    :try_start_1
    const-string v1, "continuous-picture"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1384
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v2, "auto"

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "auto"

    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    :cond_3
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 1385
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->ae:Landroid/hardware/Camera$AutoFocusCallback;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    goto :goto_0

    .line 1388
    :cond_5
    invoke-virtual {p0}, Lkik/android/chat/fragment/CameraFragment;->d()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public changeFlashMode()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e00bb
        }
    .end annotation

    .prologue
    .line 1463
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 1473
    :cond_0
    :goto_0
    return-void

    .line 1466
    :cond_1
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->p:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->p:I

    .line 1468
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->i:I

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 1469
    :goto_1
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    .line 1470
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->b(Ljava/lang/String;)V

    .line 1471
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->a(Ljava/lang/String;)V

    .line 1472
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    const-string v1, "kik.android.chat.fragment.CameraFragment.FlashPreference"

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->g:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_0

    .line 1468
    :cond_2
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->p:I

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->i:I

    rem-int/2addr v0, v1

    goto :goto_1
.end method

.method public final d()V
    .locals 5

    .prologue
    .line 1429
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 1431
    sget v0, Lkik/android/chat/fragment/CameraFragment$b;->a:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    .line 1450
    :goto_0
    return-void

    .line 1435
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->l:Ljava/lang/Object;

    monitor-enter v1

    .line 1436
    :try_start_0
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    sget v2, Lkik/android/chat/fragment/CameraFragment$b;->d:I

    if-eq v0, v2, :cond_1

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    sget v2, Lkik/android/chat/fragment/CameraFragment$b;->a:I

    if-ne v0, v2, :cond_2

    .line 1438
    :cond_1
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->F:I

    .line 1440
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->b:Lcom/kik/android/a;

    const-string v2, "Photo Taken"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->a(Lcom/kik/android/a$f;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1441
    sget v0, Lkik/android/chat/fragment/CameraFragment$b;->e:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    .line 1444
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->r:I

    if-nez v0, :cond_3

    const/4 v0, 0x1

    .line 1446
    :goto_1
    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->c(Z)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->C:I

    .line 1447
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->ad:Landroid/hardware/Camera$ShutterCallback;

    const/4 v3, 0x0

    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->ag:Landroid/hardware/Camera$PictureCallback;

    invoke-virtual {v0, v2, v3, v4}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    .line 1450
    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1444
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 1757
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_0

    .line 1758
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->R:Z

    .line 1759
    invoke-static {}, Lkik/android/util/DeviceUtils;->g()V

    .line 1761
    :cond_0
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 762
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 763
    new-instance v0, Lkik/android/chat/fragment/CameraFragment$a;

    invoke-direct {v0, p0, p1}, Lkik/android/chat/fragment/CameraFragment$a;-><init>(Lkik/android/chat/fragment/CameraFragment;Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->L:Lkik/android/chat/fragment/CameraFragment$a;

    .line 764
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c0009

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->t:I

    .line 765
    invoke-static {p1}, Lkik/android/util/u;->b(Landroid/app/Activity;)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->q:I

    .line 766
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 1633
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1637
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->e(I)V

    .line 1639
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->h:Lkik/android/chat/fragment/KikChatFragment$e;

    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    .line 1642
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    if-eqz v0, :cond_0

    .line 1643
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-interface {v0, v1}, Lkik/android/c/a;->a(Landroid/hardware/Camera;)V

    .line 1645
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 561
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 562
    invoke-virtual {p0}, Lkik/android/chat/fragment/CameraFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/CameraFragment;)V

    .line 563
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v6, -0x1

    const/4 v1, 0x0

    .line 568
    const v0, 0x7f03001e

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 569
    invoke-static {p0, v2}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 570
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoProgress:Landroid/widget/ProgressBar;

    const/16 v3, 0x3a98

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 572
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 573
    const v0, 0x7f030053

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ICSCameraPreviewView;

    .line 574
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 575
    invoke-virtual {v0}, Lkik/android/widget/ICSCameraPreviewView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v3, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 576
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    .line 577
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->J:Lkik/android/widget/a;

    .line 578
    new-instance v3, Lkik/android/chat/fragment/w;

    new-instance v4, Lkik/android/chat/fragment/v;

    invoke-direct {v4, p0}, Lkik/android/chat/fragment/v;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    invoke-direct {v3, p0, v0, v4}, Lkik/android/chat/fragment/w;-><init>(Lkik/android/chat/fragment/CameraFragment;Landroid/view/TextureView;Lkik/android/c/b$c;)V

    iput-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    .line 595
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 618
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 619
    const/16 v3, 0x11

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 620
    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 622
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_cameraCover:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 623
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v3

    :goto_1
    if-ge v1, v3, :cond_3

    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    :try_start_0
    invoke-static {v1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    iget v4, p0, Lkik/android/chat/fragment/CameraFragment;->x:I

    if-ne v4, v6, :cond_2

    iget v4, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    iput v1, p0, Lkik/android/chat/fragment/CameraFragment;->x:I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 598
    :cond_1
    const v0, 0x7f030020

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/CameraPreviewView;

    .line 599
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    .line 600
    iput-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->J:Lkik/android/widget/a;

    .line 601
    new-instance v3, Lkik/android/chat/fragment/y;

    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->O:Landroid/os/Handler;

    new-instance v5, Lkik/android/chat/fragment/x;

    invoke-direct {v5, p0}, Lkik/android/chat/fragment/x;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    invoke-direct {v3, p0, v0, v4, v5}, Lkik/android/chat/fragment/y;-><init>(Lkik/android/chat/fragment/CameraFragment;Landroid/view/SurfaceView;Landroid/os/Handler;Lkik/android/c/b$c;)V

    iput-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->K:Lkik/android/c/a;

    .line 615
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_clipFrame:Landroid/widget/FrameLayout;

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->I:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 623
    :cond_2
    :try_start_1
    iget v4, p0, Lkik/android/chat/fragment/CameraFragment;->y:I

    if-ne v4, v6, :cond_0

    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-nez v0, :cond_0

    iput v1, p0, Lkik/android/chat/fragment/CameraFragment;->y:I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const/4 v4, 0x5

    invoke-static {v0, v4}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;I)V

    goto :goto_2

    :cond_3
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->y:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    .line 624
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->s()V

    .line 625
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_retakeButton:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 626
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_usePhotoButton:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 628
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->ai:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 629
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_shutterButton:Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->ah:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 631
    new-instance v0, Lkik/android/chat/fragment/z;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/z;-><init>(Lkik/android/chat/fragment/CameraFragment;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 640
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->g()V

    .line 642
    return-object v2
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 813
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onPause()V

    .line 816
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->L:Lkik/android/chat/fragment/CameraFragment$a;

    if-eqz v0, :cond_0

    .line 817
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->L:Lkik/android/chat/fragment/CameraFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/CameraFragment$a;->disable()V

    .line 819
    :cond_0
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->P:Z

    if-eqz v0, :cond_1

    .line 820
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->j()V

    .line 822
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->i()V

    .line 823
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->R:Z

    if-eqz v0, :cond_2

    .line 824
    invoke-static {}, Lkik/android/util/DeviceUtils;->h()V

    .line 827
    :cond_2
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    if-eqz v0, :cond_3

    .line 828
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    .line 830
    :cond_3
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 771
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onResume()V

    .line 772
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_cameraCover:Landroid/view/View;

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->t:I

    sget v2, Lcom/kik/android/a/c$a;->b:I

    invoke-static {v0, v1, v2}, Lkik/android/util/av;->a(Landroid/view/View;II)V

    .line 774
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->h()V

    .line 777
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_cameraShutterBar:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 780
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->L:Lkik/android/chat/fragment/CameraFragment$a;

    if-eqz v0, :cond_0

    .line 781
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->L:Lkik/android/chat/fragment/CameraFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/CameraFragment$a;->enable()V

    .line 784
    :cond_0
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->R:Z

    if-eqz v0, :cond_1

    .line 785
    invoke-static {}, Lkik/android/util/DeviceUtils;->g()V

    .line 788
    :cond_1
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    if-eqz v0, :cond_2

    .line 789
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 791
    :cond_2
    return-void
.end method

.method public retakePhoto()V
    .locals 1
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e00b8
        }
    .end annotation

    .prologue
    .line 1456
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    .line 1457
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->r()V

    .line 1458
    return-void
.end method

.method protected switchCamera()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e00bc
        }
    .end annotation

    .prologue
    .line 835
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->N:I

    sget v1, Lkik/android/chat/fragment/CameraFragment$b;->a:I

    if-eq v0, v1, :cond_0

    .line 850
    :goto_0
    return-void

    .line 839
    :cond_0
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->x:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->y:I

    if-ltz v0, :cond_1

    .line 840
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->y:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    .line 845
    :goto_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->e(Z)V

    .line 846
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->i()V

    .line 847
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    invoke-static {v0}, Lkik/android/util/u;->b(I)Landroid/hardware/Camera;

    move-result-object v0

    .line 848
    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->a(Landroid/hardware/Camera;)V

    .line 849
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    const-string v1, "kik.android.chat.fragment.CameraFragment.SelectCameraPreference"

    iget v2, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Integer;)Z

    goto :goto_0

    .line 843
    :cond_1
    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->x:I

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->z:I

    goto :goto_1
.end method

.method public usePhoto()V
    .locals 9
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e00ba
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v8, 0x0

    const/4 v3, 0x0

    .line 1478
    iget-boolean v0, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    if-eqz v0, :cond_2

    .line 1479
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->q()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    const-string v1, "kik.num-videos-sent"

    invoke-interface {v0, v1, v3}, Lkik/a/e/v;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    const-string v2, "kik.num-videos-sent"

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Integer;)Z

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->b:Lcom/kik/android/a;

    const-string v1, "Video Sent"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->b(Lcom/kik/android/a$f;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lkik/android/chat/fragment/CameraFragment;->ac:F

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->r()V

    iput-boolean v3, p0, Lkik/android/chat/fragment/CameraFragment;->Q:Z

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->k:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V

    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->_videoView:Landroid/widget/VideoView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->g()V

    invoke-static {}, Lkik/android/HeadphoneUnpluggedReceiver;->a()Lkik/android/HeadphoneUnpluggedReceiver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkik/android/HeadphoneUnpluggedReceiver;->b(Lkik/android/sdkutils/a;)V

    iput-boolean v3, p0, Lkik/android/chat/fragment/CameraFragment;->R:Z

    invoke-static {}, Lkik/android/util/DeviceUtils;->h()V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->D:Lkik/a/e/g;

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    invoke-virtual {p0}, Lkik/android/chat/fragment/CameraFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->X:Ljava/lang/String;

    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->X:Ljava/lang/String;

    invoke-static {v4}, Lkik/android/util/ct;->c(Ljava/lang/String;)I

    move-result v4

    int-to-long v4, v4

    iget-object v6, p0, Lkik/android/chat/fragment/CameraFragment;->Y:Ljava/lang/String;

    invoke-virtual/range {v1 .. v6}, Lkik/android/f/a/f;->a(Landroid/app/Activity;Ljava/lang/String;JLjava/lang/String;)Lkik/a/d/a/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/g;->a(Lkik/a/d/a/a;)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->c:Lcom/kik/l/ab;

    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->Y:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/chat/fragment/CameraFragment;->X:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/kik/l/ab;->a(Ljava/lang/String;Ljava/lang/String;)Z

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->X:Ljava/lang/String;

    invoke-static {v0}, Lkik/android/VideoContentProvider;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    invoke-interface {v0, v1}, Lkik/a/e/v;->b(Ljava/io/File;)V

    iput-object v8, p0, Lkik/android/chat/fragment/CameraFragment;->X:Ljava/lang/String;

    iput-object v8, p0, Lkik/android/chat/fragment/CameraFragment;->Y:Ljava/lang/String;

    .line 1486
    :goto_0
    return-void

    .line 1482
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->s:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->D:Lkik/a/e/g;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->b:Lcom/kik/android/a;

    const-string v1, "Photo Attached"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/CameraFragment;->a(Lcom/kik/android/a$f;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    iget-object v7, p0, Lkik/android/chat/fragment/CameraFragment;->s:Landroid/graphics/Bitmap;

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->C:I

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->B:I

    if-eq v0, v1, :cond_5

    :try_start_0
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    iget v0, p0, Lkik/android/chat/fragment/CameraFragment;->C:I

    iget v1, p0, Lkik/android/chat/fragment/CameraFragment;->B:I

    sub-int/2addr v0, v1

    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->o()Z

    move-result v1

    if-eqz v1, :cond_3

    rsub-int v0, v0, 0x168

    rem-int/lit16 v0, v0, 0x168

    :cond_3
    int-to-float v0, v0

    invoke-virtual {v5, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    iget-object v0, p0, Lkik/android/chat/fragment/CameraFragment;->s:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/android/chat/fragment/CameraFragment;->s:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->s:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lkik/android/chat/fragment/CameraFragment;->D:Lkik/a/e/g;

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v2

    invoke-virtual {p0}, Lkik/android/chat/fragment/CameraFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v5, 0x64

    invoke-static {v0, v4, v5}, Lcom/kik/m/k;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v0

    iget-object v4, p0, Lkik/android/chat/fragment/CameraFragment;->a:Lkik/a/e/v;

    invoke-virtual {v2, v3, v0, v4}, Lkik/android/f/a/f;->a(Landroid/app/Activity;[BLkik/a/e/v;)Lkik/a/d/a/a;

    move-result-object v0

    invoke-interface {v1, v0}, Lkik/a/e/g;->a(Lkik/a/d/a/a;)V

    iput-object v8, p0, Lkik/android/chat/fragment/CameraFragment;->s:Landroid/graphics/Bitmap;

    .line 1484
    :cond_4
    invoke-direct {p0}, Lkik/android/chat/fragment/CameraFragment;->r()V

    goto :goto_0

    .line 1482
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    :cond_5
    move-object v0, v7

    goto :goto_1
.end method
