.class Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$8;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 341
    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 342
    return-void
.end method
