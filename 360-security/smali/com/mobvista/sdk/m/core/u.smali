.class final Lcom/mobvista/sdk/m/core/u;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V
    .locals 0

    .prologue
    .line 225
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/u;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 228
    const-string/jumbo v0, "MobvistaAdNative"

    const-string/jumbo v1, "load FB ad timeout... start to load MV ad..."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/u;->a:Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->h(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V

    .line 231
    return-void
.end method
