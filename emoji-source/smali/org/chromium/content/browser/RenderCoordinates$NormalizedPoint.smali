.class public Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;
.super Ljava/lang/Object;
.source "RenderCoordinates.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/RenderCoordinates;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "NormalizedPoint"
.end annotation


# instance fields
.field private mXAbsoluteCss:F

.field private mYAbsoluteCss:F

.field final synthetic this$0:Lorg/chromium/content/browser/RenderCoordinates;


# direct methods
.method private constructor <init>(Lorg/chromium/content/browser/RenderCoordinates;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/content/browser/RenderCoordinates;Lorg/chromium/content/browser/RenderCoordinates$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/content/browser/RenderCoordinates;
    .param p2, "x1"    # Lorg/chromium/content/browser/RenderCoordinates$1;

    .prologue
    .line 76
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;-><init>(Lorg/chromium/content/browser/RenderCoordinates;)V

    return-void
.end method


# virtual methods
.method public getXAbsoluteCss()F
    .locals 1

    .prologue
    .line 85
    iget v0, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->mXAbsoluteCss:F

    return v0
.end method

.method public getXLocalDip()F
    .locals 2

    .prologue
    .line 95
    iget v0, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->mXAbsoluteCss:F

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mScrollXCss:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$000(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mPageScaleFactor:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$100(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    mul-float/2addr v0, v1

    return v0
.end method

.method public getXPix()F
    .locals 2

    .prologue
    .line 105
    invoke-virtual {p0}, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->getXLocalDip()F

    move-result v0

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mDeviceScaleFactor:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$300(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    mul-float/2addr v0, v1

    return v0
.end method

.method public getYAbsoluteCss()F
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->mYAbsoluteCss:F

    return v0
.end method

.method public getYLocalDip()F
    .locals 2

    .prologue
    .line 100
    iget v0, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->mYAbsoluteCss:F

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mScrollYCss:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$200(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mPageScaleFactor:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$100(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    mul-float/2addr v0, v1

    return v0
.end method

.method public getYPix()F
    .locals 2

    .prologue
    .line 110
    invoke-virtual {p0}, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->getYLocalDip()F

    move-result v0

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mDeviceScaleFactor:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$300(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mContentOffsetYPix:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$400(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    add-float/2addr v0, v1

    return v0
.end method

.method public setAbsoluteCss(FF)V
    .locals 0
    .param p1, "xCss"    # F
    .param p2, "yCss"    # F

    .prologue
    .line 116
    iput p1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->mXAbsoluteCss:F

    .line 117
    iput p2, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->mYAbsoluteCss:F

    .line 118
    return-void
.end method

.method public setLocalDip(FF)V
    .locals 3
    .param p1, "xDip"    # F
    .param p2, "yDip"    # F

    .prologue
    .line 124
    iget-object v0, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mPageScaleFactor:F
    invoke-static {v0}, Lorg/chromium/content/browser/RenderCoordinates;->access$100(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v0

    div-float v0, p1, v0

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mScrollXCss:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$000(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mPageScaleFactor:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$100(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    div-float v1, p2, v1

    iget-object v2, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mScrollYCss:F
    invoke-static {v2}, Lorg/chromium/content/browser/RenderCoordinates;->access$200(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->setAbsoluteCss(FF)V

    .line 127
    return-void
.end method

.method public setScreen(FF)V
    .locals 2
    .param p1, "xPix"    # F
    .param p2, "yPix"    # F

    .prologue
    .line 133
    iget-object v0, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mDeviceScaleFactor:F
    invoke-static {v0}, Lorg/chromium/content/browser/RenderCoordinates;->access$300(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v0

    div-float v0, p1, v0

    iget-object v1, p0, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->this$0:Lorg/chromium/content/browser/RenderCoordinates;

    # getter for: Lorg/chromium/content/browser/RenderCoordinates;->mDeviceScaleFactor:F
    invoke-static {v1}, Lorg/chromium/content/browser/RenderCoordinates;->access$300(Lorg/chromium/content/browser/RenderCoordinates;)F

    move-result v1

    div-float v1, p2, v1

    invoke-virtual {p0, v0, v1}, Lorg/chromium/content/browser/RenderCoordinates$NormalizedPoint;->setLocalDip(FF)V

    .line 134
    return-void
.end method
