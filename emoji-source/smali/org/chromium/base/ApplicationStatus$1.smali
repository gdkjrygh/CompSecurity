.class final Lorg/chromium/base/ApplicationStatus$1;
.super Ljava/lang/Object;
.source "ApplicationStatus.java"

# interfaces
.implements Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/base/ApplicationStatus;->initialize(Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onWindowFocusChanged(Landroid/app/Activity;Z)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "hasFocus"    # Z

    .prologue
    .line 119
    if-eqz p2, :cond_0

    # getter for: Lorg/chromium/base/ApplicationStatus;->sActivity:Landroid/app/Activity;
    invoke-static {}, Lorg/chromium/base/ApplicationStatus;->access$000()Landroid/app/Activity;

    move-result-object v1

    if-ne p1, v1, :cond_1

    .line 128
    :cond_0
    :goto_0
    return-void

    .line 121
    :cond_1
    invoke-static {p1}, Lorg/chromium/base/ApplicationStatus;->getStateForActivity(Landroid/app/Activity;)I

    move-result v0

    .line 123
    .local v0, "state":I
    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 124
    # setter for: Lorg/chromium/base/ApplicationStatus;->sActivity:Landroid/app/Activity;
    invoke-static {p1}, Lorg/chromium/base/ApplicationStatus;->access$002(Landroid/app/Activity;)Landroid/app/Activity;

    goto :goto_0
.end method
