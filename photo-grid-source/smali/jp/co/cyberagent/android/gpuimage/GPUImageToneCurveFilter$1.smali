.class Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    const/4 v9, -0x1

    const/4 v1, 0x0

    const/16 v3, 0x100

    const/high16 v8, 0x437f0000    # 255.0f

    const/4 v7, 0x0

    .line 173
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 174
    const/16 v0, 0xde1

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mToneCurveTexture:[I
    invoke-static {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$000(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)[I

    move-result-object v2

    aget v2, v2, v1

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 176
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mRedCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$100(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v0, v3, :cond_1

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mGreenCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$200(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v0, v3, :cond_1

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mBlueCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$300(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v0, v3, :cond_1

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mRgbCompositeCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v0, v3, :cond_1

    .line 177
    const/16 v0, 0x800

    new-array v5, v0, [B

    move v2, v1

    .line 178
    :goto_0
    if-ge v2, v3, :cond_0

    .line 180
    mul-int/lit8 v0, v2, 0x4

    add-int/lit8 v4, v0, 0x2

    int-to-float v6, v2

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mRgbCompositeCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0, v7}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0, v8}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    .line 181
    mul-int/lit8 v0, v2, 0x4

    add-int/lit8 v4, v0, 0x1

    int-to-float v6, v2

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mRgbCompositeCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0, v7}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0, v8}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    .line 182
    mul-int/lit8 v4, v2, 0x4

    int-to-float v6, v2

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mRgbCompositeCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0, v7}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0, v8}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    .line 183
    mul-int/lit8 v0, v2, 0x4

    add-int/lit8 v0, v0, 0x3

    aput-byte v9, v5, v0

    .line 185
    mul-int/lit8 v0, v2, 0x4

    add-int/lit8 v0, v0, 0x2

    add-int/lit16 v4, v0, 0x400

    int-to-float v6, v2

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mBlueCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$300(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0, v7}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0, v8}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    .line 186
    mul-int/lit8 v0, v2, 0x4

    add-int/lit8 v0, v0, 0x1

    add-int/lit16 v4, v0, 0x400

    int-to-float v6, v2

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mGreenCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$200(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0, v7}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0, v8}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    .line 187
    mul-int/lit8 v0, v2, 0x4

    add-int/lit16 v4, v0, 0x400

    int-to-float v6, v2

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$1;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    # getter for: Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->mRedCurve:Ljava/util/ArrayList;
    invoke-static {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;->access$100(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0, v7}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0, v8}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    .line 188
    mul-int/lit8 v0, v2, 0x4

    add-int/lit8 v0, v0, 0x3

    add-int/lit16 v0, v0, 0x400

    aput-byte v9, v5, v0

    .line 178
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_0

    .line 192
    :cond_0
    const/16 v0, 0xde1

    const/16 v2, 0x1908

    const/4 v4, 0x2

    const/16 v6, 0x1908

    const/16 v7, 0x1401

    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v8

    move v5, v1

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 204
    :cond_1
    return-void
.end method
