.class public Lcom/facebook/orca/camera/w;
.super Ljava/lang/Object;
.source "MenuHelper.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/facebook/orca/camera/w;

    sput-object v0, Lcom/facebook/orca/camera/w;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()I
    .locals 2

    .prologue
    .line 63
    :try_start_0
    invoke-static {}, Lcom/facebook/orca/camera/ImageManager;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 64
    const/4 v0, -0x1

    .line 78
    :goto_0
    return v0

    .line 66
    :cond_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    .line 68
    new-instance v1, Landroid/os/StatFs;

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const v1, 0x49b71b00    # 1500000.0f

    div-float/2addr v0, v1

    .line 72
    float-to-int v0, v0

    goto :goto_0

    .line 74
    :catch_0
    move-exception v0

    .line 78
    const/4 v0, -0x2

    goto :goto_0
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 39
    invoke-static {}, Lcom/facebook/orca/camera/w;->a()I

    move-result v0

    invoke-static {p0, v0}, Lcom/facebook/orca/camera/w;->a(Landroid/app/Activity;I)V

    .line 40
    return-void
.end method

.method public static a(Landroid/app/Activity;I)V
    .locals 2

    .prologue
    .line 43
    const/4 v0, 0x0

    .line 45
    const/4 v1, -0x1

    if-ne p1, v1, :cond_3

    .line 46
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 47
    const-string v1, "checking"

    if-ne v0, v1, :cond_2

    .line 48
    sget v0, Lcom/facebook/o;->camera_preparing_sd:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 56
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 57
    const/16 v1, 0x1388

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 59
    :cond_1
    return-void

    .line 50
    :cond_2
    sget v0, Lcom/facebook/o;->camera_no_storage:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 52
    :cond_3
    const/4 v1, 0x1

    if-ge p1, v1, :cond_0

    .line 53
    sget v0, Lcom/facebook/o;->camera_not_enough_space:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
