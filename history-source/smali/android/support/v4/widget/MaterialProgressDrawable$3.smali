.class Landroid/support/v4/widget/MaterialProgressDrawable$3;
.super Landroid/view/animation/Animation;
.source "MaterialProgressDrawable.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/widget/MaterialProgressDrawable;->setupAnimators()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/widget/MaterialProgressDrawable;

.field final synthetic val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;


# direct methods
.method constructor <init>(Landroid/support/v4/widget/MaterialProgressDrawable;Landroid/support/v4/widget/MaterialProgressDrawable$Ring;)V
    .locals 0

    .prologue
    .line 331
    iput-object p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;

    iput-object p2, p0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 16
    .param p1, "interpolatedTime"    # F
    .param p2, "t"    # Landroid/view/animation/Transformation;

    .prologue
    .line 336
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v10}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStrokeWidth()F

    move-result v10

    float-to-double v10, v10

    const-wide v12, 0x401921fb54442d18L    # 6.283185307179586

    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v14}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getCenterRadius()D

    move-result-wide v14

    mul-double/2addr v12, v14

    div-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v10

    double-to-float v4, v10

    .line 338
    .local v4, "minProgressArc":F
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v10}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartingEndTrim()F

    move-result v7

    .line 339
    .local v7, "startingEndTrim":F
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v10}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartingStartTrim()F

    move-result v9

    .line 340
    .local v9, "startingTrim":F
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v10}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartingRotation()F

    move-result v8

    .line 343
    .local v8, "startingRotation":F
    const v10, 0x3f4ccccd    # 0.8f

    sub-float v3, v10, v4

    .line 344
    .local v3, "minArc":F
    # getter for: Landroid/support/v4/widget/MaterialProgressDrawable;->START_CURVE_INTERPOLATOR:Landroid/view/animation/Interpolator;
    invoke-static {}, Landroid/support/v4/widget/MaterialProgressDrawable;->access$400()Landroid/view/animation/Interpolator;

    move-result-object v10

    move/from16 v0, p1

    invoke-interface {v10, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v10

    mul-float/2addr v10, v3

    add-float v1, v7, v10

    .line 346
    .local v1, "endTrim":F
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v10, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setEndTrim(F)V

    .line 348
    const v10, 0x3f4ccccd    # 0.8f

    # getter for: Landroid/support/v4/widget/MaterialProgressDrawable;->END_CURVE_INTERPOLATOR:Landroid/view/animation/Interpolator;
    invoke-static {}, Landroid/support/v4/widget/MaterialProgressDrawable;->access$500()Landroid/view/animation/Interpolator;

    move-result-object v11

    move/from16 v0, p1

    invoke-interface {v11, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v11

    mul-float/2addr v10, v11

    add-float v6, v9, v10

    .line 351
    .local v6, "startTrim":F
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v10, v6}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setStartTrim(F)V

    .line 353
    const/high16 v10, 0x3e800000    # 0.25f

    mul-float v10, v10, p1

    add-float v5, v8, v10

    .line 354
    .local v5, "rotation":F
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;

    invoke-virtual {v10, v5}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setRotation(F)V

    .line 356
    const/high16 v10, 0x43100000    # 144.0f

    mul-float v10, v10, p1

    const/high16 v11, 0x44340000    # 720.0f

    move-object/from16 v0, p0

    iget-object v12, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;

    # getter for: Landroid/support/v4/widget/MaterialProgressDrawable;->mRotationCount:F
    invoke-static {v12}, Landroid/support/v4/widget/MaterialProgressDrawable;->access$600(Landroid/support/v4/widget/MaterialProgressDrawable;)F

    move-result v12

    const/high16 v13, 0x40a00000    # 5.0f

    div-float/2addr v12, v13

    mul-float/2addr v11, v12

    add-float v2, v10, v11

    .line 358
    .local v2, "groupRotation":F
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;

    invoke-virtual {v10, v2}, Landroid/support/v4/widget/MaterialProgressDrawable;->setRotation(F)V

    .line 359
    return-void
.end method
