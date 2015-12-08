.class public final Lcom/roidapp/imagelib/a/ah;
.super Lcom/roidapp/imagelib/a/aa;
.source "SourceFile"


# static fields
.field private static s:Z


# instance fields
.field private t:F

.field private u:Landroid/graphics/PointF;

.field private v:I

.field private w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/imagelib/a/ah;->s:Z

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;IILandroid/os/Handler;Ljp/co/cyberagent/android/gpuimage/GPUImage;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 31
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/roidapp/imagelib/a/aa;-><init>(Landroid/app/Activity;IILjp/co/cyberagent/android/gpuimage/GPUImage;)V

    .line 25
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/imagelib/a/ah;->t:F

    .line 26
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/ah;->u:Landroid/graphics/PointF;

    .line 27
    iput v1, p0, Lcom/roidapp/imagelib/a/ah;->v:I

    .line 28
    iput-boolean v1, p0, Lcom/roidapp/imagelib/a/ah;->w:Z

    .line 32
    iput-object p4, p0, Lcom/roidapp/imagelib/a/ah;->g:Landroid/os/Handler;

    .line 33
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;II)Landroid/hardware/Camera$Size;
    .locals 6

    .prologue
    .line 37
    iput p2, p0, Lcom/roidapp/imagelib/a/ah;->j:I

    .line 38
    iput p3, p0, Lcom/roidapp/imagelib/a/ah;->k:I

    .line 39
    iget-object v0, p0, Lcom/roidapp/imagelib/a/ah;->b:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 40
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/ah;->n()Z

    move-result v2

    .line 47
    invoke-virtual {p0, v2, p2, p3}, Lcom/roidapp/imagelib/a/ah;->a(ZII)Landroid/hardware/Camera$Size;

    move-result-object v1

    .line 48
    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/a/ah;->a(Landroid/hardware/Camera$Size;)Landroid/hardware/Camera$Size;

    move-result-object v0

    .line 49
    sget-boolean v3, Lcom/roidapp/imagelib/a/ah;->s:Z

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Desired Preview Size - w: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", h: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    :cond_0
    iput-object v1, p0, Lcom/roidapp/imagelib/a/ah;->e:Landroid/hardware/Camera$Size;

    .line 51
    iput-object v0, p0, Lcom/roidapp/imagelib/a/ah;->f:Landroid/hardware/Camera$Size;

    move-object v0, p0

    move v3, p2

    move v4, p3

    move-object v5, p1

    .line 52
    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/a/ah;->a(Landroid/hardware/Camera$Size;ZIILandroid/view/View;)Z

    .line 54
    invoke-virtual {p0, v2}, Lcom/roidapp/imagelib/a/ah;->b(Z)V

    .line 56
    return-object v1
.end method
