.class public Lcom/miteksystems/misnap/MiSnap;
.super Landroid/app/Activity;


# static fields
.field static h:I

.field static i:Z

.field static r:Z

.field static u:I


# instance fields
.field private A:I

.field private B:Z

.field private final C:Landroid/content/DialogInterface$OnClickListener;

.field private final D:Landroid/content/DialogInterface$OnClickListener;

.field private E:Z

.field a:Lcom/miteksystems/misnap/MiSnapAPI;

.field b:Lcom/miteksystems/misnap/l;

.field c:Lcom/miteksystems/misnap/MitekAnalyzer;

.field d:Lcom/miteksystems/misnap/am;

.field e:Lcom/miteksystems/misnap/s;

.field f:Lcom/miteksystems/misnap/i;

.field g:Ljava/lang/Object;

.field j:Z

.field k:Z

.field l:Z

.field m:Z

.field n:Z

.field o:Landroid/content/Context;

.field p:Z

.field protected q:I

.field s:Landroid/hardware/Camera;

.field t:I

.field v:Landroid/os/Handler;

.field w:Z

.field private x:Landroid/widget/FrameLayout$LayoutParams;

.field private y:Lcom/miteksystems/misnap/u;

.field private z:Landroid/view/OrientationEventListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x257

    sput v0, Lcom/miteksystems/misnap/MiSnap;->h:I

    const/4 v0, 0x0

    sput-boolean v0, Lcom/miteksystems/misnap/MiSnap;->r:Z

    const/4 v0, -0x1

    sput v0, Lcom/miteksystems/misnap/MiSnap;->u:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    iput-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    iput-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->e:Lcom/miteksystems/misnap/s;

    iput-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->f:Lcom/miteksystems/misnap/i;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->g:Ljava/lang/Object;

    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->p:Z

    iput-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->z:Landroid/view/OrientationEventListener;

    const/16 v0, 0x168

    iput v0, p0, Lcom/miteksystems/misnap/MiSnap;->q:I

    iput v1, p0, Lcom/miteksystems/misnap/MiSnap;->A:I

    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->B:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/miteksystems/misnap/MiSnap;->t:I

    new-instance v0, Lcom/miteksystems/misnap/d;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/d;-><init>(Lcom/miteksystems/misnap/MiSnap;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    new-instance v0, Lcom/miteksystems/misnap/e;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/e;-><init>(Lcom/miteksystems/misnap/MiSnap;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->C:Landroid/content/DialogInterface$OnClickListener;

    new-instance v0, Lcom/miteksystems/misnap/f;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/f;-><init>(Lcom/miteksystems/misnap/MiSnap;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->D:Landroid/content/DialogInterface$OnClickListener;

    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->E:Z

    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    return-void
.end method

.method private a(Landroid/content/Context;)Landroid/hardware/Camera;
    .locals 6

    const/4 v0, 0x0

    const/4 v5, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string v3, "android.hardware.camera"

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v1, "MiSnapCamera"

    const-string v2, "No Camera"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v2

    iput-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    iget-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->t()I

    move-result v2

    if-ne v2, v5, :cond_1

    new-instance v2, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v2}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    const/4 v3, 0x0

    invoke-static {v3, v2}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    sget v3, Lcom/miteksystems/misnap/MiSnap;->u:I

    packed-switch v3, :pswitch_data_0

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "rotation="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v4, Lcom/miteksystems/misnap/MiSnap;->u:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "device orientation="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/MiSnap;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->orientation:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget v3, v2, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v3, v5, :cond_3

    iget v2, v2, Landroid/hardware/Camera$CameraInfo;->orientation:I

    add-int/2addr v1, v2

    rem-int/lit16 v1, v1, 0x168

    rsub-int v1, v1, 0x168

    rem-int/lit16 v1, v1, 0x168

    :goto_2
    iget-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    invoke-virtual {v2, v1}, Landroid/hardware/Camera;->setDisplayOrientation(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    goto :goto_0

    :pswitch_0
    const/16 v1, 0x5a

    goto :goto_1

    :pswitch_1
    :try_start_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v1, v3, :cond_2

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lcom/miteksystems/misnap/MiSnap;->setRequestedOrientation(I)V

    :cond_2
    const/16 v1, 0x10e

    goto :goto_1

    :cond_3
    iget v2, v2, Landroid/hardware/Camera$CameraInfo;->orientation:I

    sub-int v1, v2, v1

    add-int/lit16 v1, v1, 0x168

    rem-int/lit16 v1, v1, 0x168
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    const-string v1, "MiSnapCamera"

    const-string v2, "Camera busy or not available"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lt v1, v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_1
    return-void

    :cond_2
    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/MiSnap;->a(Landroid/view/View;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/miteksystems/misnap/MiSnap;)V
    .locals 3

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    invoke-direct {p0, p0}, Lcom/miteksystems/misnap/MiSnap;->a(Landroid/content/Context;)Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    const-string v0, "CameraNotSufficient"

    invoke-virtual {p0, v2, v1, v0}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    if-nez v0, :cond_1

    const-string v0, "VideoCaptureFailed"

    invoke-virtual {p0, v2, v1, v0}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget v0, Lcom/miteksystems/misnap/R$xml;->settings:I

    invoke-static {p0, v0, v2}, Landroid/preference/PreferenceManager;->setDefaultValues(Landroid/content/Context;IZ)V

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sget-boolean v1, Lcom/miteksystems/misnap/r;->g:Z

    if-eqz v1, :cond_3

    sput-boolean v2, Lcom/miteksystems/misnap/MiSnap;->i:Z

    :goto_1
    const-string v1, "cameraSupportCalculated"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->j:Z

    iget-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->j:Z

    if-eqz v1, :cond_2

    const-string v1, "supportsAutoFocus"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->k:Z

    const-string v1, "supports1080p"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->l:Z

    const-string v1, "supports720p"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->m:Z

    const-string v1, "supportsVGA"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->n:Z

    :cond_2
    new-instance v0, Lcom/miteksystems/misnap/l;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    iget-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    invoke-direct {v0, p0, v1, v2}, Lcom/miteksystems/misnap/l;-><init>(Landroid/content/Context;Landroid/hardware/Camera;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/l;->a(Lcom/miteksystems/misnap/MitekAnalyzer;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/l;->a(Lcom/miteksystems/misnap/u;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->x:Landroid/widget/FrameLayout$LayoutParams;

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->x:Landroid/widget/FrameLayout$LayoutParams;

    const/16 v1, 0x11

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->x:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0, v0, v1}, Lcom/miteksystems/misnap/MiSnap;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->x:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0, v0, v1}, Lcom/miteksystems/misnap/MiSnap;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-boolean v0, Lcom/miteksystems/misnap/MiSnap;->i:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->g()V

    goto/16 :goto_0

    :cond_3
    const-string v1, "showAnimationNextTime"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Lcom/miteksystems/misnap/MiSnap;->i:Z

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->b()V

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/miteksystems/misnap/MiSnap;I)V
    .locals 0

    iput p1, p0, Lcom/miteksystems/misnap/MiSnap;->A:I

    return-void
.end method

.method static synthetic b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    return-object v0
.end method

.method static synthetic b(Lcom/miteksystems/misnap/MiSnap;I)V
    .locals 2

    const/16 v0, 0x168

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->f:Lcom/miteksystems/misnap/i;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->f:Lcom/miteksystems/misnap/i;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/i;->a()Z

    move-result v1

    if-nez v1, :cond_4

    :cond_0
    const/4 v1, -0x1

    if-eq p1, v1, :cond_4

    const/16 v1, 0x154

    if-gt v1, p1, :cond_1

    if-lt p1, v0, :cond_4

    :cond_1
    if-ltz p1, :cond_2

    const/16 v1, 0x14

    if-le p1, v1, :cond_4

    :cond_2
    const/16 v1, 0xa

    if-ge v1, p1, :cond_3

    const/16 v1, 0xb0

    if-ge p1, v1, :cond_3

    const/16 v0, 0xb4

    :cond_3
    iget v1, p0, Lcom/miteksystems/misnap/MiSnap;->q:I

    if-eq v0, v1, :cond_4

    iput v0, p0, Lcom/miteksystems/misnap/MiSnap;->q:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->n()V

    :cond_4
    return-void
.end method

.method static synthetic c(Lcom/miteksystems/misnap/MiSnap;)I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MiSnap;->A:I

    return v0
.end method

.method static synthetic d(Lcom/miteksystems/misnap/MiSnap;)V
    .locals 0

    invoke-direct {p0}, Lcom/miteksystems/misnap/MiSnap;->m()V

    return-void
.end method

.method public static d()Z
    .locals 1

    sget-boolean v0, Lcom/miteksystems/misnap/MiSnap;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private m()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->E:Z

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    iget-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    invoke-virtual {v0, v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->b(Lcom/miteksystems/misnap/a;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    iget-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0, v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->b(Lcom/miteksystems/misnap/a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->k()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->z:Landroid/view/OrientationEventListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->z:Landroid/view/OrientationEventListener;

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->z:Landroid/view/OrientationEventListener;

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/MiSnap;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->o()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/miteksystems/misnap/R$id;->camera_surface_frame:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/MiSnap;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/MiSnap;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->e:Lcom/miteksystems/misnap/s;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->e:Lcom/miteksystems/misnap/s;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/s;->b()V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private n()V
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_cancel:I

    invoke-virtual {p0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v1, v3}, Lcom/miteksystems/misnap/l;->a(Z)V

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/l;->a()V

    const-string v1, "com.miteksystems.misnap.MIBI_DATA"

    iget-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/l;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    const-string v1, "Cancelled"

    invoke-virtual {p0, v3, v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method

.method private o()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MiSnap;->t:I

    return v0
.end method

.method final a(I)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    invoke-virtual {p0, p1}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/am;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method final a(II)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    invoke-virtual {p0, p1}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/miteksystems/misnap/am;->a(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method final a(ILandroid/content/Intent;Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->B:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "exitApp called with code="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    invoke-direct {p0}, Lcom/miteksystems/misnap/MiSnap;->o()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->B:Z

    if-nez p2, :cond_1

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    :cond_1
    const-string v0, "com.miteksystems.misnap.ResultCode"

    invoke-virtual {p2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, p1, p2}, Lcom/miteksystems/misnap/MiSnap;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/MiSnap;->finish()V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    new-instance v1, Lcom/miteksystems/misnap/g;

    invoke-direct {v1, p0}, Lcom/miteksystems/misnap/g;-><init>(Lcom/miteksystems/misnap/MiSnap;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method final a(ZZ)V
    .locals 8

    const-wide v6, 0x4075e00000000000L    # 350.0

    const/4 v2, 0x0

    const/4 v1, 0x1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->j:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->k:Z

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->j:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->aC()Lorg/json/JSONObject;

    move-result-object v3

    if-eqz p1, :cond_0

    new-instance v0, Lcom/miteksystems/misnap/k;

    const/4 v4, 0x2

    invoke-direct {v0, v4, v3}, Lcom/miteksystems/misnap/k;-><init>(ILorg/json/JSONObject;)V

    invoke-virtual {v0}, Lcom/miteksystems/misnap/k;->a()D

    move-result-wide v4

    cmpl-double v0, v6, v4

    if-lez v0, :cond_3

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->l:Z

    :cond_0
    if-eqz p2, :cond_1

    new-instance v0, Lcom/miteksystems/misnap/k;

    invoke-direct {v0, v1, v3}, Lcom/miteksystems/misnap/k;-><init>(ILorg/json/JSONObject;)V

    invoke-virtual {v0}, Lcom/miteksystems/misnap/k;->a()D

    move-result-wide v4

    cmpl-double v0, v6, v4

    if-lez v0, :cond_4

    :goto_1
    iput-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->m:Z

    :cond_1
    iput-boolean v2, p0, Lcom/miteksystems/misnap/MiSnap;->n:Z

    invoke-virtual {p0}, Lcom/miteksystems/misnap/MiSnap;->j()V

    :cond_2
    return-void

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    move v1, v2

    goto :goto_1
.end method

.method final b()V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lcom/miteksystems/misnap/MiSnap;->t:I

    return-void
.end method

.method protected final c()V
    .locals 8

    const/4 v7, 0x0

    invoke-direct {p0, p0}, Lcom/miteksystems/misnap/MiSnap;->a(Landroid/content/Context;)Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const-string v1, "CameraNotSufficient"

    invoke-virtual {p0, v7, v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/miteksystems/misnap/MitekAnalyzer;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->j()I

    move-result v1

    iget-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->i()I

    move-result v2

    iget-object v3, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MiSnapAPI;->g()I

    move-result v3

    iget-object v4, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v4}, Lcom/miteksystems/misnap/MiSnapAPI;->h()I

    move-result v4

    iget-object v5, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v5}, Lcom/miteksystems/misnap/MiSnapAPI;->s()I

    move-result v5

    iget-object v6, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v6}, Lcom/miteksystems/misnap/MiSnapAPI;->n()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/miteksystems/misnap/MitekAnalyzer;-><init>(IIIIILjava/lang/String;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    new-instance v0, Lcom/miteksystems/misnap/u;

    iget-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    iget-object v3, p0, Lcom/miteksystems/misnap/MiSnap;->e:Lcom/miteksystems/misnap/s;

    iget-object v4, p0, Lcom/miteksystems/misnap/MiSnap;->f:Lcom/miteksystems/misnap/i;

    move-object v1, p0

    move v5, v7

    invoke-direct/range {v0 .. v5}, Lcom/miteksystems/misnap/u;-><init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;Lcom/miteksystems/misnap/s;Lcom/miteksystems/misnap/i;C)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/u;->a(I)V

    new-instance v0, Lcom/miteksystems/misnap/am;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    invoke-direct {v0, p0, v1, v7}, Lcom/miteksystems/misnap/am;-><init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;C)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MitekAnalyzer;->a(Lcom/miteksystems/misnap/a;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->c:Lcom/miteksystems/misnap/MitekAnalyzer;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->d:Lcom/miteksystems/misnap/am;

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MitekAnalyzer;->a(Lcom/miteksystems/misnap/a;)V

    const/4 v0, 0x2

    iput v0, p0, Lcom/miteksystems/misnap/MiSnap;->t:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    iget v1, p0, Lcom/miteksystems/misnap/MiSnap;->t:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method final e()I
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->F()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->G()I

    move-result v0

    goto :goto_0
.end method

.method final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->E:Z

    return v0
.end method

.method final g()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->k()V

    iput-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    iput-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->s:Landroid/hardware/Camera;

    :cond_0
    return-void
.end method

.method final h()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/miteksystems/misnap/MiSnap;->A:I

    return-void
.end method

.method final i()V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->a()V

    sget v0, Lcom/miteksystems/misnap/R$string;->uxp_start_still_camera:I

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    const/4 v0, 0x2

    iput v0, p0, Lcom/miteksystems/misnap/MiSnap;->t:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    iget v1, p0, Lcom/miteksystems/misnap/MiSnap;->t:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method final j()V
    .locals 3

    const/4 v2, 0x1

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "showAnimationNextTime"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    iget-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->j:Z

    if-eqz v1, :cond_0

    const-string v1, "cameraSupportCalculated"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v1, "supportsAutoFocus"

    iget-boolean v2, p0, Lcom/miteksystems/misnap/MiSnap;->k:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v1, "supports1080p"

    iget-boolean v2, p0, Lcom/miteksystems/misnap/MiSnap;->l:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v1, "supports720p"

    iget-boolean v2, p0, Lcom/miteksystems/misnap/MiSnap;->m:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v1, "supportsVGA"

    iget-boolean v2, p0, Lcom/miteksystems/misnap/MiSnap;->n:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method final k()F
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MiSnap;->q:I

    int-to-float v0, v0

    return v0
.end method

.method final l()Z
    .locals 2

    iget v0, p0, Lcom/miteksystems/misnap/MiSnap;->q:I

    const/16 v1, 0x168

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lcom/miteksystems/misnap/MiSnap;->n()V

    return-void
.end method

.method public onCancelButton(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/miteksystems/misnap/MiSnap;->o()V

    invoke-direct {p0}, Lcom/miteksystems/misnap/MiSnap;->n()V

    return-void
.end method

.method public onCaptureButton(Landroid/view/View;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/miteksystems/misnap/MiSnap;->o()V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->e:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setClickable(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->j()V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setClickable(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->g:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setClickable(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setClickable(Z)V

    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    const/16 v2, 0x2000

    const/16 v4, 0x400

    const/4 v3, 0x1

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/MiSnap;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    sput v0, Lcom/miteksystems/misnap/MiSnap;->u:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/miteksystems/misnap/MiSnap;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/MiSnap;->setRequestedOrientation(I)V

    :cond_1
    iput-object p0, p0, Lcom/miteksystems/misnap/MiSnap;->o:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/miteksystems/misnap/MiSnap;->getIntent()Landroid/content/Intent;

    move-result-object v0

    new-instance v1, Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-direct {v1, v0}, Lcom/miteksystems/misnap/MiSnapAPI;-><init>(Landroid/content/Intent;)V

    iput-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->t()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/miteksystems/misnap/h;

    invoke-direct {v0, p0, p0}, Lcom/miteksystems/misnap/h;-><init>(Lcom/miteksystems/misnap/MiSnap;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->z:Landroid/view/OrientationEventListener;

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->z:Landroid/view/OrientationEventListener;

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->enable()V

    :cond_2
    new-instance v0, Lcom/miteksystems/misnap/i;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/i;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->f:Lcom/miteksystems/misnap/i;

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->f:Lcom/miteksystems/misnap/i;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/miteksystems/misnap/s;

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    iget-object v2, p0, Lcom/miteksystems/misnap/MiSnap;->f:Lcom/miteksystems/misnap/i;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/i;->a()Z

    move-result v2

    invoke-direct {v0, p0, v1, v2}, Lcom/miteksystems/misnap/s;-><init>(Landroid/content/Context;Lcom/miteksystems/misnap/MiSnapAPI;Z)V

    iput-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->e:Lcom/miteksystems/misnap/s;

    :cond_3
    invoke-virtual {p0}, Lcom/miteksystems/misnap/MiSnap;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v4, v4}, Landroid/view/Window;->setFlags(II)V

    invoke-virtual {p0, v3}, Lcom/miteksystems/misnap/MiSnap;->requestWindowFeature(I)Z

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    invoke-direct {p0}, Lcom/miteksystems/misnap/MiSnap;->m()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/miteksystems/misnap/MiSnap;->t:I

    return-void
.end method

.method public onFlashToggle(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->p:Z

    iget-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    iput-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    iget-boolean v1, p0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/l;->b(Z)V

    iget-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    if-eqz v0, :cond_2

    sget v0, Lcom/miteksystems/misnap/R$string;->uxp_flash_on:I

    :goto_0
    invoke-virtual {p0, v0}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    iget-boolean v0, p0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    if-eqz v0, :cond_3

    sget v0, Lcom/miteksystems/misnap/R$drawable;->icon_flash_on:I

    :goto_1
    check-cast p1, Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->postInvalidate()V

    :cond_1
    return-void

    :cond_2
    sget v0, Lcom/miteksystems/misnap/R$string;->uxp_flash_off:I

    goto :goto_0

    :cond_3
    sget v0, Lcom/miteksystems/misnap/R$drawable;->icon_flash_off:I

    goto :goto_1
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const-string v0, "CREDIT_CARD"

    iget-object v1, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/miteksystems/misnap/MiSnap;->n()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_0
    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->y:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
