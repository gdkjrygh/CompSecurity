.class Lorg/chromium/content/app/ContentApplication$1;
.super Ljava/lang/Object;
.source "ContentApplication.java"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/app/ContentApplication;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/app/ContentApplication;


# direct methods
.method constructor <init>(Lorg/chromium/content/app/ContentApplication;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lorg/chromium/content/app/ContentApplication$1;->this$0:Lorg/chromium/content/app/ContentApplication;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queueIdle()Z
    .locals 2

    .prologue
    .line 37
    invoke-static {}, Lorg/chromium/base/library_loader/LibraryLoader;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 45
    :goto_0
    return v0

    .line 40
    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/chromium/content/app/ContentApplication$1;->this$0:Lorg/chromium/content/app/ContentApplication;

    invoke-virtual {v0}, Lorg/chromium/content/app/ContentApplication;->getTracingController()Lorg/chromium/content/browser/TracingControllerAndroid;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/app/ContentApplication$1;->this$0:Lorg/chromium/content/app/ContentApplication;

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/TracingControllerAndroid;->registerReceiver(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 41
    :catch_0
    move-exception v0

    goto :goto_1
.end method
