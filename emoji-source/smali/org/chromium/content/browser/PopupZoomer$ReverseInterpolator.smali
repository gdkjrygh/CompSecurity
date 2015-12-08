.class Lorg/chromium/content/browser/PopupZoomer$ReverseInterpolator;
.super Ljava/lang/Object;
.source "PopupZoomer.java"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/PopupZoomer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ReverseInterpolator"
.end annotation


# instance fields
.field private final mInterpolator:Landroid/view/animation/Interpolator;


# direct methods
.method public constructor <init>(Landroid/view/animation/Interpolator;)V
    .locals 0
    .param p1, "i"    # Landroid/view/animation/Interpolator;

    .prologue
    .line 550
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 551
    iput-object p1, p0, Lorg/chromium/content/browser/PopupZoomer$ReverseInterpolator;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 552
    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 1
    .param p1, "input"    # F

    .prologue
    .line 556
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float p1, v0, p1

    .line 557
    iget-object v0, p0, Lorg/chromium/content/browser/PopupZoomer$ReverseInterpolator;->mInterpolator:Landroid/view/animation/Interpolator;

    if-nez v0, :cond_0

    .line 558
    .end local p1    # "input":F
    :goto_0
    return p1

    .restart local p1    # "input":F
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/PopupZoomer$ReverseInterpolator;->mInterpolator:Landroid/view/animation/Interpolator;

    invoke-interface {v0, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    goto :goto_0
.end method
