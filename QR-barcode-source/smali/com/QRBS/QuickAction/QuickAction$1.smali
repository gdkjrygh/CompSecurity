.class Lcom/QRBS/QuickAction/QuickAction$1;
.super Ljava/lang/Object;
.source "QuickAction.java"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/QuickAction/QuickAction;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/QuickAction/QuickAction;


# direct methods
.method constructor <init>(Lcom/QRBS/QuickAction/QuickAction;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/QuickAction/QuickAction$1;->this$0:Lcom/QRBS/QuickAction/QuickAction;

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 3
    .param p1, "t"    # F

    .prologue
    .line 46
    const v1, 0x3fc66666    # 1.55f

    mul-float/2addr v1, p1

    const v2, 0x3f8ccccd    # 1.1f

    sub-float v0, v1, v2

    .line 48
    .local v0, "inner":F
    const v1, 0x3f99999a    # 1.2f

    mul-float v2, v0, v0

    sub-float/2addr v1, v2

    return v1
.end method
