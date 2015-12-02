.class Lcom/facebook/orca/chatheads/ee;
.super Lcom/facebook/orca/chatheads/dv;
.source "ScreenInsetsChangeDetector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/orca/chatheads/dv",
        "<",
        "Lcom/facebook/orca/chatheads/ed;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/WindowManager;)V
    .locals 1

    .prologue
    .line 53
    invoke-static {}, Lcom/facebook/orca/chatheads/ee;->c()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/dv;-><init>(Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V

    .line 54
    return-void
.end method

.method private static c()Landroid/view/WindowManager$LayoutParams;
    .locals 6

    .prologue
    const/4 v2, -0x1

    .line 57
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x0

    sget v3, Lcom/facebook/orca/chatheads/ee;->a:I

    const v4, 0x10100

    move v5, v2

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 65
    const/16 v1, 0x35

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 66
    return-object v0
.end method
