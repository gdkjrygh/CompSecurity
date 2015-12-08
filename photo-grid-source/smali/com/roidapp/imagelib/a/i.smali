.class public final Lcom/roidapp/imagelib/a/i;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/imagelib/a/e;
.implements Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xc
.end annotation


# static fields
.field private static X:Ljava/lang/String;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Ljava/lang/String;

.field private E:Lcom/roidapp/imagelib/a/y;

.field private F:Z

.field private G:Z

.field private H:Z

.field private I:Lcom/roidapp/imagelib/b/b;

.field private volatile J:Z

.field private K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

.field private L:Landroid/opengl/GLSurfaceView;

.field private M:Landroid/hardware/Camera$Size;

.field private N:Landroid/view/animation/Animation;

.field private O:Landroid/view/animation/Animation;

.field private P:J

.field private Q:Lcom/roidapp/imagelib/a/a;

.field private R:Lcom/roidapp/imagelib/filter/FilterListView;

.field private S:I

.field private T:I

.field private U:Z

.field private V:I

.field private final W:Landroid/view/animation/Interpolator;

.field private Y:Landroid/view/View;

.field private Z:Landroid/os/Handler;

.field protected a:Landroid/view/View;

.field private aa:Ljava/lang/Runnable;

.field private ab:Ljava/lang/Runnable;

.field private ac:Ljava/lang/Runnable;

.field private ad:Ljava/lang/Runnable;

.field protected b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/FrameLayout;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/FrameLayout;

.field private j:Landroid/widget/FrameLayout;

.field private k:Landroid/widget/FrameLayout;

.field private l:Landroid/widget/FrameLayout;

.field private m:Landroid/widget/FrameLayout;

.field private n:Landroid/widget/FrameLayout;

.field private o:Landroid/widget/CheckedTextView;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Lcom/roidapp/imagelib/a/ah;

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/widget/ImageView;

.field private u:Landroid/widget/ImageView;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/SeekBar;

.field private x:Landroid/widget/SeekBar;

.field private y:I

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 131
    const-string v0, "#0Cffffff"

    sput-object v0, Lcom/roidapp/imagelib/a/i;->X:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 63
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 100
    sget v0, Lcom/roidapp/imagelib/a/h;->a:I

    iput v0, p0, Lcom/roidapp/imagelib/a/i;->y:I

    .line 102
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->z:Z

    .line 103
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->A:Z

    .line 104
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    .line 105
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->C:Z

    .line 112
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->G:Z

    .line 115
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->I:Lcom/roidapp/imagelib/b/b;

    .line 116
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->J:Z

    .line 117
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->b:Ljava/lang/String;

    .line 123
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/roidapp/imagelib/a/i;->P:J

    .line 130
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->W:Landroid/view/animation/Interpolator;

    .line 192
    new-instance v0, Lcom/roidapp/imagelib/a/j;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/a/j;-><init>(Lcom/roidapp/imagelib/a/i;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    .line 412
    new-instance v0, Lcom/roidapp/imagelib/a/q;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/a/q;-><init>(Lcom/roidapp/imagelib/a/i;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->aa:Ljava/lang/Runnable;

    .line 763
    new-instance v0, Lcom/roidapp/imagelib/a/v;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/a/v;-><init>(Lcom/roidapp/imagelib/a/i;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->ab:Ljava/lang/Runnable;

    .line 773
    new-instance v0, Lcom/roidapp/imagelib/a/w;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/a/w;-><init>(Lcom/roidapp/imagelib/a/i;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->ac:Ljava/lang/Runnable;

    .line 782
    new-instance v0, Lcom/roidapp/imagelib/a/k;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/a/k;-><init>(Lcom/roidapp/imagelib/a/i;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->ad:Ljava/lang/Runnable;

    .line 1124
    return-void
.end method

.method static synthetic A(Lcom/roidapp/imagelib/a/i;)I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/roidapp/imagelib/a/i;->c:I

    return v0
.end method

.method static synthetic B(Lcom/roidapp/imagelib/a/i;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic C(Lcom/roidapp/imagelib/a/i;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/a/i;J)J
    .locals 1

    .prologue
    .line 63
    iput-wide p1, p0, Lcom/roidapp/imagelib/a/i;->P:J

    return-wide p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/a;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/a/i;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/roidapp/imagelib/a/i;->D:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/a/i;Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 4850
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->f()V

    .line 4851
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4852
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->L:Landroid/opengl/GLSurfaceView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    .line 4853
    iget v0, p0, Lcom/roidapp/imagelib/a/i;->y:I

    sget v1, Lcom/roidapp/imagelib/a/h;->a:I

    if-ne v0, v1, :cond_1

    .line 4854
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    sget-object v1, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setRotationCamera(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 4857
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->deleteImage()V

    .line 4858
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setImage(Landroid/graphics/Bitmap;)V

    .line 4863
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 4865
    const/high16 v1, 0x43b40000    # 360.0f

    div-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 4866
    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v1, v0, p0}, Lcom/roidapp/imagelib/a/a;->a(ILcom/roidapp/imagelib/a/e;)V

    .line 4871
    :cond_0
    :goto_1
    return-void

    .line 4856
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    sget-object v1, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setRotationCamera(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 4868
    :catch_0
    move-exception v0

    .line 4869
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 4870
    const-string v1, "Capture Image Error"

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/a/i;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Lcom/roidapp/imagelib/a/i;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1059
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/a/o;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/imagelib/a/o;-><init>(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1070
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/a/i;Z)Z
    .locals 0

    .prologue
    .line 63
    iput-boolean p1, p0, Lcom/roidapp/imagelib/a/i;->J:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/y;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/imagelib/a/i;Z)Z
    .locals 0

    .prologue
    .line 63
    iput-boolean p1, p0, Lcom/roidapp/imagelib/a/i;->H:Z

    return p1
.end method

.method static synthetic c(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/filter/FilterListView;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    return-object v0
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lcom/roidapp/imagelib/a/i;->X:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->h:Landroid/widget/TextView;

    return-object v0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 317
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 318
    const-string v1, "Camera Error"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 319
    const-string v1, "Failed to connect to camera service. Please restart your device or allow camera permission"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 320
    const-string v1, "OK"

    new-instance v2, Lcom/roidapp/imagelib/a/p;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/a/p;-><init>(Lcom/roidapp/imagelib/a/i;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 329
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 330
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 331
    return-void
.end method

.method static synthetic e(Lcom/roidapp/imagelib/a/i;)Landroid/widget/FrameLayout;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->j:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method private e()Landroid/widget/SeekBar$OnSeekBarChangeListener;
    .locals 1

    .prologue
    .line 817
    new-instance v0, Lcom/roidapp/imagelib/a/m;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/a/m;-><init>(Lcom/roidapp/imagelib/a/i;)V

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->v:Landroid/widget/TextView;

    return-object v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 876
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    if-eqz v0, :cond_0

    .line 879
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->l()V

    .line 880
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    .line 882
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/roidapp/imagelib/a/i;)Landroid/widget/SeekBar;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->x:Landroid/widget/SeekBar;

    return-object v0
.end method

.method private g()Z
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 889
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    if-eqz v0, :cond_0

    move v0, v6

    .line 910
    :goto_0
    return v0

    .line 891
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/a;->b(Z)V

    .line 892
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->clearDrawQueue()V

    .line 893
    new-instance v0, Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/imagelib/a/i;->y:I

    sget v3, Lcom/roidapp/imagelib/a/af;->a:I

    iget-object v4, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    iget-object v5, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/a/ah;-><init>(Landroid/app/Activity;IILandroid/os/Handler;Ljp/co/cyberagent/android/gpuimage/GPUImage;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    .line 894
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 895
    sget v0, Lcom/roidapp/imagelib/a/h;->a:I

    iput v0, p0, Lcom/roidapp/imagelib/a/i;->y:I

    sput v0, Lcom/roidapp/imagelib/a/h;->c:I

    .line 900
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    iget v1, p0, Lcom/roidapp/imagelib/a/i;->S:I

    div-int/lit8 v1, v1, 0x2

    iget v2, p0, Lcom/roidapp/imagelib/a/i;->T:I

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/a/ah;->a(II)V

    .line 901
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->L:Landroid/opengl/GLSurfaceView;

    iget v2, p0, Lcom/roidapp/imagelib/a/i;->S:I

    iget v3, p0, Lcom/roidapp/imagelib/a/i;->T:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/imagelib/a/ah;->a(Landroid/view/View;II)Landroid/hardware/Camera$Size;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->M:Landroid/hardware/Camera$Size;

    .line 902
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/a/ah;->a()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/a/ah;->b()Z

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/a/ah;->c()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/imagelib/a/a;->a(IZZ)V

    .line 903
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/a;->c()V

    .line 904
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    sget-boolean v1, Lcom/roidapp/imagelib/a/h;->g:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/a;->a(Z)V

    .line 905
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/a;->a()V

    move v0, v6

    .line 910
    goto :goto_0

    .line 897
    :cond_1
    sget v0, Lcom/roidapp/imagelib/a/h;->b:I

    iput v0, p0, Lcom/roidapp/imagelib/a/i;->y:I

    sput v0, Lcom/roidapp/imagelib/a/h;->c:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 907
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 908
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic h(Lcom/roidapp/imagelib/a/i;)Landroid/widget/FrameLayout;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->m:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/imagelib/a/i;)Landroid/widget/CheckedTextView;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->o:Landroid/widget/CheckedTextView;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->aa:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/imagelib/a/i;)Z
    .locals 1

    .prologue
    .line 63
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->J:Z

    return v0
.end method

.method static synthetic l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/imagelib/a/i;)J
    .locals 2

    .prologue
    .line 63
    iget-wide v0, p0, Lcom/roidapp/imagelib/a/i;->P:J

    return-wide v0
.end method

.method static synthetic n(Lcom/roidapp/imagelib/a/i;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->s:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/imagelib/a/i;)Landroid/view/animation/Animation;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->N:Landroid/view/animation/Animation;

    return-object v0
.end method

.method static synthetic p(Lcom/roidapp/imagelib/a/i;)I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/roidapp/imagelib/a/i;->S:I

    return v0
.end method

.method static synthetic q(Lcom/roidapp/imagelib/a/i;)I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/roidapp/imagelib/a/i;->T:I

    return v0
.end method

.method static synthetic r(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->ab:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic t(Lcom/roidapp/imagelib/a/i;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->p:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic u(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->ac:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic v(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->ad:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic w(Lcom/roidapp/imagelib/a/i;)Landroid/widget/SeekBar;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    return-object v0
.end method

.method static synthetic x(Lcom/roidapp/imagelib/a/i;)Landroid/view/animation/Animation;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->O:Landroid/view/animation/Animation;

    return-object v0
.end method

.method static synthetic y(Lcom/roidapp/imagelib/a/i;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->f()V

    return-void
.end method

.method static synthetic z(Lcom/roidapp/imagelib/a/i;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->D:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 150
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/a;->g()V

    .line 152
    :cond_0
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, ".PhotoGrid_"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".jpg"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 160
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v1, v0, v2}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 171
    invoke-static {p1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 172
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 175
    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    const/4 v2, 0x5

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 176
    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 178
    :goto_0
    return-void

    .line 162
    :catch_0
    move-exception v0

    .line 163
    :try_start_1
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 164
    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/a/i;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    invoke-static {p1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 172
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 166
    :catch_1
    move-exception v0

    .line 167
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 168
    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/a/i;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 171
    invoke-static {p1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 172
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 171
    :catchall_0
    move-exception v0

    invoke-static {p1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 172
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 405
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->isShown()Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 409
    .line 2044
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    if-eqz v0, :cond_0

    .line 2045
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/FilterListView;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2046
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->x:Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 2047
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2048
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2049
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Y:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    :goto_0
    return-void

    .line 2051
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->x:Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 2052
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/FilterListView;->d()V

    goto :goto_0
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 276
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 277
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 281
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 282
    instance-of v0, p1, Lcom/roidapp/imagelib/a/y;

    if-eqz v0, :cond_0

    .line 283
    check-cast p1, Lcom/roidapp/imagelib/a/y;

    iput-object p1, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    return-void

    .line 285
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet CameraPreivewFragment.OnCameraEditListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 965
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->J:Z

    if-eqz v2, :cond_1

    .line 1041
    :cond_0
    :goto_0
    return-void

    .line 967
    :cond_1
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    if-eqz v2, :cond_0

    .line 969
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 970
    sget v3, Lcom/roidapp/imagelib/g;->ad:I

    if-ne v2, v3, :cond_8

    .line 971
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->F:Z

    if-eqz v2, :cond_0

    .line 973
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->H:Z

    .line 974
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->f()V

    .line 975
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->z:Z

    if-nez v2, :cond_4

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->z:Z

    .line 976
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->z:Z

    if-eqz v0, :cond_5

    sget v0, Lcom/roidapp/imagelib/a/h;->a:I

    :goto_2
    iput v0, p0, Lcom/roidapp/imagelib/a/i;->y:I

    .line 977
    iget v0, p0, Lcom/roidapp/imagelib/a/i;->y:I

    sput v0, Lcom/roidapp/imagelib/a/h;->c:I

    .line 978
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->g()Z

    .line 2914
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->z:Z

    if-nez v0, :cond_6

    .line 2915
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2916
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2920
    :cond_2
    :goto_3
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    sput-boolean v1, Lcom/roidapp/imagelib/a/h;->e:Z

    .line 2921
    sput v1, Lcom/roidapp/imagelib/a/h;->i:I

    .line 2922
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->t:Landroid/widget/ImageView;

    sget v2, Lcom/roidapp/imagelib/f;->as:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 2923
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    if-eqz v0, :cond_3

    .line 2924
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->j()Z

    move-result v0

    if-nez v0, :cond_7

    .line 2925
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2926
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 980
    :cond_3
    :goto_4
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->F:Z

    .line 981
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->ad:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_4
    move v0, v1

    .line 975
    goto :goto_1

    .line 976
    :cond_5
    sget v0, Lcom/roidapp/imagelib/a/h;->b:I

    goto :goto_2

    .line 2918
    :cond_6
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v6}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_3

    .line 2928
    :cond_7
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->e()Landroid/widget/SeekBar$OnSeekBarChangeListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 2929
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/a/ah;->i()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setMax(I)V

    .line 2930
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 2931
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/ah;->a(I)V

    goto :goto_4

    .line 982
    :cond_8
    sget v3, Lcom/roidapp/imagelib/g;->aE:I

    if-ne v2, v3, :cond_b

    .line 983
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->G:Z

    if-eqz v2, :cond_0

    .line 985
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->H:Z

    if-eqz v2, :cond_0

    .line 987
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    if-eqz v2, :cond_9

    .line 988
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    invoke-interface {v2}, Lcom/roidapp/imagelib/a/y;->a()V

    .line 990
    :cond_9
    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->J:Z

    .line 991
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v2, v1}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Z)V

    .line 992
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/a/ah;->m()Z

    move-result v2

    if-nez v2, :cond_0

    .line 993
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    if-eqz v2, :cond_a

    .line 994
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    invoke-interface {v2}, Lcom/roidapp/imagelib/a/y;->b()V

    .line 995
    :cond_a
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->J:Z

    .line 996
    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Z)V

    goto/16 :goto_0

    .line 1000
    :cond_b
    sget v3, Lcom/roidapp/imagelib/g;->W:I

    if-ne v2, v3, :cond_c

    .line 1001
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->f()V

    .line 1003
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    if-eqz v0, :cond_0

    .line 1004
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    invoke-interface {v0}, Lcom/roidapp/imagelib/a/y;->c()V

    goto/16 :goto_0

    .line 1005
    :cond_c
    sget v3, Lcom/roidapp/imagelib/g;->ab:I

    if-ne v2, v3, :cond_f

    .line 1006
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    if-nez v2, :cond_d

    :goto_5
    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    .line 1007
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    sput-boolean v0, Lcom/roidapp/imagelib/a/h;->e:Z

    .line 1008
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    if-eqz v0, :cond_e

    .line 1009
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->t:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->ar:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1013
    :goto_6
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    iget-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/ah;->a(Z)V

    goto/16 :goto_0

    :cond_d
    move v0, v1

    .line 1006
    goto :goto_5

    .line 1011
    :cond_e
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->t:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->as:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_6

    .line 1014
    :cond_f
    sget v3, Lcom/roidapp/imagelib/g;->Z:I

    if-ne v2, v3, :cond_13

    .line 2957
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 2958
    const-string v2, "key_selfiecamera_new"

    invoke-interface {v3, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 3937
    new-instance v2, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/k;->a:I

    invoke-direct {v2, v4, v5}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 3939
    :try_start_0
    sget v4, Lcom/roidapp/imagelib/h;->l:I

    invoke-virtual {v2, v4}, Landroid/app/Dialog;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 3947
    sget v4, Lcom/roidapp/imagelib/g;->j:I

    invoke-virtual {v2, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    new-instance v5, Lcom/roidapp/imagelib/a/n;

    invoke-direct {v5, p0, v2}, Lcom/roidapp/imagelib/a/n;-><init>(Lcom/roidapp/imagelib/a/i;Landroid/app/Dialog;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3953
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 2960
    :goto_7
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "key_selfiecamera_new"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1016
    :cond_10
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/a/a;->b()I

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/FilterListView;->a()Z

    move-result v2

    if-nez v2, :cond_11

    .line 1017
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->x:Landroid/widget/SeekBar;

    invoke-virtual {v2, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 1018
    :cond_11
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1019
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1020
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->Y:Landroid/view/View;

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1021
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->U:Z

    if-nez v2, :cond_12

    :goto_8
    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->U:Z

    .line 1022
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->U:Z

    sput-boolean v0, Lcom/roidapp/imagelib/a/h;->f:Z

    goto/16 :goto_0

    .line 3941
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_7

    .line 3944
    :catch_1
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_7

    :cond_12
    move v0, v1

    .line 1021
    goto :goto_8

    .line 1023
    :cond_13
    sget v3, Lcom/roidapp/imagelib/g;->Y:I

    if-ne v2, v3, :cond_16

    .line 1024
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->C:Z

    if-nez v2, :cond_14

    move v2, v0

    :goto_9
    iput-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->C:Z

    .line 1025
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->C:Z

    sput-boolean v2, Lcom/roidapp/imagelib/a/h;->g:Z

    .line 1026
    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->C:Z

    if-eqz v2, :cond_15

    .line 1027
    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/a/a;->c(Z)V

    .line 1028
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->u:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->v:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_0

    :cond_14
    move v2, v1

    .line 1024
    goto :goto_9

    .line 1030
    :cond_15
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/a;->c(Z)V

    .line 1031
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->u:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->u:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 1033
    :cond_16
    sget v0, Lcom/roidapp/imagelib/g;->D:I

    if-ne v2, v0, :cond_17

    .line 1034
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/FilterListView;->e()V

    goto/16 :goto_0

    .line 1035
    :cond_17
    sget v0, Lcom/roidapp/imagelib/g;->ah:I

    if-ne v2, v0, :cond_0

    .line 1036
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->x:Landroid/widget/SeekBar;

    invoke-virtual {v0, v6}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 1037
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->m:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v6}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1038
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1039
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Y:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .prologue
    .line 383
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 384
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 385
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 386
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->H:Z

    .line 387
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->f()V

    .line 388
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/a;->e()V

    .line 389
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 390
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->d()V

    .line 402
    :cond_0
    :goto_0
    return-void

    .line 393
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    if-eqz v0, :cond_2

    .line 394
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    sget v1, Lcom/roidapp/imagelib/a/h;->i:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/ah;->a(I)V

    .line 395
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    iget-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/ah;->a(Z)V

    .line 397
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 398
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->ad:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 236
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 237
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CameraPreivewFragment/onCreate"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 238
    sget v0, Lcom/roidapp/imagelib/a/h;->c:I

    iput v0, p0, Lcom/roidapp/imagelib/a/i;->y:I

    .line 239
    iget v0, p0, Lcom/roidapp/imagelib/a/i;->y:I

    sget v1, Lcom/roidapp/imagelib/a/h;->a:I

    if-ne v0, v1, :cond_1

    .line 240
    iput-boolean v4, p0, Lcom/roidapp/imagelib/a/i;->z:Z

    .line 244
    :goto_0
    sget v0, Lcom/roidapp/imagelib/a/h;->d:I

    iput v0, p0, Lcom/roidapp/imagelib/a/i;->V:I

    .line 245
    sget-boolean v0, Lcom/roidapp/imagelib/a/h;->f:Z

    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->U:Z

    .line 246
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 247
    if-eqz v0, :cond_0

    .line 248
    const-string v1, "current_mode"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 249
    const-string v2, "ImageSelector"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 250
    iput v4, p0, Lcom/roidapp/imagelib/a/i;->c:I

    .line 251
    const-string v1, "camera_image_dir"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/imagelib/a/i;->d:Ljava/lang/String;

    .line 252
    const-string v1, "camera_image_filename"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->e:Ljava/lang/String;

    .line 259
    :cond_0
    :goto_1
    return-void

    .line 242
    :cond_1
    iput-boolean v3, p0, Lcom/roidapp/imagelib/a/i;->z:Z

    goto :goto_0

    .line 254
    :cond_2
    iput v3, p0, Lcom/roidapp/imagelib/a/i;->c:I

    .line 255
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->d:Ljava/lang/String;

    .line 256
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->e:Ljava/lang/String;

    goto :goto_1
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const-wide/16 v8, 0x1f4

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/16 v4, 0x8

    .line 265
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CameraPreivewFragment/onCreateView"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 267
    sget v0, Lcom/roidapp/imagelib/h;->c:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->a:Landroid/view/View;

    .line 269
    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->a:Landroid/view/View;

    .line 1425
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v2, "CameraPreivewFragment/initView"

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1427
    sget v0, Lcom/roidapp/imagelib/g;->ah:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->f:Landroid/widget/RelativeLayout;

    .line 1428
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1430
    sget v0, Lcom/roidapp/imagelib/g;->D:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1431
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1432
    sget v0, Lcom/roidapp/imagelib/g;->aE:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->g:Landroid/widget/FrameLayout;

    .line 1433
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1434
    sget v0, Lcom/roidapp/imagelib/g;->S:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1435
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->g:Landroid/widget/FrameLayout;

    new-instance v3, Lcom/roidapp/imagelib/a/r;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/imagelib/a/r;-><init>(Lcom/roidapp/imagelib/a/i;Landroid/widget/ImageView;)V

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1446
    sget v0, Lcom/roidapp/imagelib/g;->ad:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->i:Landroid/widget/FrameLayout;

    .line 1447
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->i:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1448
    sget v0, Lcom/roidapp/imagelib/g;->W:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->j:Landroid/widget/FrameLayout;

    .line 1449
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->j:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1450
    sget v0, Lcom/roidapp/imagelib/g;->R:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1451
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->j:Landroid/widget/FrameLayout;

    new-instance v2, Lcom/roidapp/imagelib/a/s;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/a/s;-><init>(Lcom/roidapp/imagelib/a/i;)V

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1465
    sget v0, Lcom/roidapp/imagelib/g;->Y:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->n:Landroid/widget/FrameLayout;

    .line 1466
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->n:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1467
    sget v0, Lcom/roidapp/imagelib/g;->ab:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->k:Landroid/widget/FrameLayout;

    .line 1468
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1469
    sget v0, Lcom/roidapp/imagelib/g;->Z:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->l:Landroid/widget/FrameLayout;

    .line 1470
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->l:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1472
    sget v0, Lcom/roidapp/imagelib/g;->h:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->u:Landroid/widget/ImageView;

    .line 1473
    sget-boolean v0, Lcom/roidapp/imagelib/a/h;->g:Z

    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->C:Z

    .line 1474
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->C:Z

    if-eqz v0, :cond_1

    .line 1475
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->u:Landroid/widget/ImageView;

    sget v2, Lcom/roidapp/imagelib/f;->v:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1479
    :goto_0
    sget v0, Lcom/roidapp/imagelib/g;->U:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->t:Landroid/widget/ImageView;

    .line 1480
    sget v0, Lcom/roidapp/imagelib/g;->V:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->q:Landroid/widget/RelativeLayout;

    .line 1482
    sget v0, Lcom/roidapp/imagelib/g;->af:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->v:Landroid/widget/TextView;

    .line 1484
    sget v0, Lcom/roidapp/imagelib/g;->ag:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    .line 1485
    sget v0, Lcom/roidapp/imagelib/g;->ae:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->p:Landroid/widget/RelativeLayout;

    .line 1486
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1488
    sget v0, Lcom/roidapp/imagelib/g;->T:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->x:Landroid/widget/SeekBar;

    .line 1489
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->x:Landroid/widget/SeekBar;

    .line 1790
    new-instance v2, Lcom/roidapp/imagelib/a/l;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/a/l;-><init>(Lcom/roidapp/imagelib/a/i;)V

    .line 1489
    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1490
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->x:Landroid/widget/SeekBar;

    sget v2, Lcom/roidapp/imagelib/a/h;->h:I

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 1491
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->x:Landroid/widget/SeekBar;

    invoke-virtual {v0, v4}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 1494
    sget v0, Lcom/roidapp/imagelib/g;->m:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->s:Landroid/widget/ImageView;

    .line 1495
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1497
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v5, v6}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->N:Landroid/view/animation/Animation;

    .line 1498
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->N:Landroid/view/animation/Animation;

    invoke-virtual {v0, v8, v9}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1500
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v6, v5}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->O:Landroid/view/animation/Animation;

    .line 1501
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->O:Landroid/view/animation/Animation;

    invoke-virtual {v0, v8, v9}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1503
    sget v0, Lcom/roidapp/imagelib/g;->X:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->Y:Landroid/view/View;

    .line 1504
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Y:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1506
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 1507
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v3, p0, Lcom/roidapp/imagelib/a/i;->S:I

    .line 1508
    iget v3, p0, Lcom/roidapp/imagelib/a/i;->S:I

    int-to-double v4, v3

    const-wide v6, 0x3ff5555555555555L    # 1.3333333333333333

    mul-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v3, v4

    iput v3, p0, Lcom/roidapp/imagelib/a/i;->T:I

    .line 1509
    iget v3, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v4, p0, Lcom/roidapp/imagelib/a/i;->T:I

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-le v3, v4, :cond_2

    .line 1510
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v3, p0, Lcom/roidapp/imagelib/a/i;->T:I

    sub-int/2addr v2, v3

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1516
    :goto_1
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImage;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    .line 1517
    sget v0, Lcom/roidapp/imagelib/g;->ac:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/opengl/GLSurfaceView;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->L:Landroid/opengl/GLSurfaceView;

    .line 1518
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->L:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setGLSurfaceView(Landroid/opengl/GLSurfaceView;)V

    .line 1519
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setDrawListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;)V

    .line 1521
    new-instance v0, Lcom/roidapp/imagelib/a/a;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/roidapp/imagelib/a/a;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    .line 1522
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->K:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v3, p0, Lcom/roidapp/imagelib/a/i;->L:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/imagelib/a/a;->a(Ljp/co/cyberagent/android/gpuimage/GPUImage;Landroid/opengl/GLSurfaceView;)V

    .line 1523
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    iget-boolean v2, p0, Lcom/roidapp/imagelib/a/i;->C:Z

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/a/a;->a(Z)V

    .line 1524
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    sget v2, Lcom/roidapp/imagelib/a/h;->h:I

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/a/a;->a(I)V

    .line 1526
    sget v0, Lcom/roidapp/imagelib/g;->i:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckedTextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->o:Landroid/widget/CheckedTextView;

    .line 1527
    sget v0, Lcom/roidapp/imagelib/g;->aa:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->m:Landroid/widget/FrameLayout;

    .line 1528
    new-instance v0, Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const-string v3, "SelfieCam"

    invoke-direct {v0, v2, v3}, Lcom/roidapp/imagelib/filter/FilterListView;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    .line 1529
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->m:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 1532
    sget v0, Lcom/roidapp/imagelib/g;->aQ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->h:Landroid/widget/TextView;

    .line 1533
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/Roboto-Thin.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 1544
    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1545
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    new-instance v1, Lcom/roidapp/imagelib/a/t;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/a/t;-><init>(Lcom/roidapp/imagelib/a/i;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/l;)V

    .line 1593
    sget-object v0, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_0

    .line 1594
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    sget-object v1, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    sget-object v2, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 1635
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/f;->t:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 1636
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/imagelib/f;->t:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 1637
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->L:Landroid/opengl/GLSurfaceView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/opengl/GLSurfaceView;->setClickable(Z)V

    .line 1638
    iget-object v2, p0, Lcom/roidapp/imagelib/a/i;->L:Landroid/opengl/GLSurfaceView;

    new-instance v3, Lcom/roidapp/imagelib/a/u;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/imagelib/a/u;-><init>(Lcom/roidapp/imagelib/a/i;II)V

    invoke-virtual {v2, v3}, Landroid/opengl/GLSurfaceView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 271
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->a:Landroid/view/View;

    return-object v0

    .line 1477
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->u:Landroid/widget/ImageView;

    sget v2, Lcom/roidapp/imagelib/f;->u:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 1513
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Y:Landroid/view/View;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/i;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/d;->d:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    goto/16 :goto_1
.end method

.method public final onDestroyView()V
    .locals 2

    .prologue
    .line 298
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CameraPreivewFragment/onDestroyView"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 299
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->aa:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 300
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 301
    return-void
.end method

.method public final onDetach()V
    .locals 1

    .prologue
    .line 292
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 293
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    .line 294
    return-void
.end method

.method public final onDrawLoadDone()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 138
    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->F:Z

    .line 139
    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->G:Z

    .line 140
    return-void
.end method

.method public final onPause()V
    .locals 3

    .prologue
    .line 305
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CameraPreivewFragment/onPause"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 306
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    if-eqz v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    sget-object v1, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    sget-boolean v2, Lcom/roidapp/imagelib/a/h;->g:Z

    invoke-interface {v0, v1, v2}, Lcom/roidapp/imagelib/a/y;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Z)V

    .line 309
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->f()V

    .line 310
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Q:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/a;->e()V

    .line 311
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 313
    return-void
.end method

.method public final onPreviewFailed()V
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 145
    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 146
    return-void
.end method

.method public final onResume()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/16 v2, 0x8

    .line 335
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CameraPreivewFragment/onResume"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 336
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 337
    iput-boolean v3, p0, Lcom/roidapp/imagelib/a/i;->H:Z

    .line 339
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->E:Lcom/roidapp/imagelib/a/y;

    invoke-interface {v0}, Lcom/roidapp/imagelib/a/y;->b()V

    .line 341
    :cond_0
    iput-boolean v3, p0, Lcom/roidapp/imagelib/a/i;->J:Z

    .line 343
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    if-eqz v0, :cond_1

    .line 344
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v0, v4}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Z)V

    .line 345
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->R:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/FilterListView;->c()V

    .line 347
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->g()Z

    move-result v0

    if-nez v0, :cond_2

    .line 348
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->d()V

    .line 379
    :goto_0
    return-void

    .line 352
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 353
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->i:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 354
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 355
    :cond_4
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 357
    :cond_5
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->j()Z

    move-result v0

    if-nez v0, :cond_7

    .line 358
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 359
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 367
    :goto_1
    sget-boolean v0, Lcom/roidapp/imagelib/a/h;->e:Z

    iput-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    .line 368
    iget-boolean v0, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    if-eqz v0, :cond_8

    .line 369
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->t:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->ar:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 373
    :goto_2
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    if-eqz v0, :cond_6

    .line 374
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    iget-boolean v1, p0, Lcom/roidapp/imagelib/a/i;->B:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/ah;->a(Z)V

    .line 375
    :cond_6
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    if-eqz v0, :cond_9

    .line 376
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->Z:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->ad:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 361
    :cond_7
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    invoke-direct {p0}, Lcom/roidapp/imagelib/a/i;->e()Landroid/widget/SeekBar$OnSeekBarChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 362
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/a/ah;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 363
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->w:Landroid/widget/SeekBar;

    sget v1, Lcom/roidapp/imagelib/a/h;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 364
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->r:Lcom/roidapp/imagelib/a/ah;

    sget v1, Lcom/roidapp/imagelib/a/h;->i:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/ah;->a(I)V

    goto :goto_1

    .line 371
    :cond_8
    iget-object v0, p0, Lcom/roidapp/imagelib/a/i;->t:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->as:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 378
    :cond_9
    iput-boolean v4, p0, Lcom/roidapp/imagelib/a/i;->H:Z

    goto/16 :goto_0
.end method
