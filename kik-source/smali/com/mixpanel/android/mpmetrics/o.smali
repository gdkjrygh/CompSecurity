.class final Lcom/mixpanel/android/mpmetrics/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/k;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/k;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/o;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 94
    const/4 v0, 0x1

    return v0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 100
    const/4 v0, 0x0

    cmpl-float v0, p4, v0

    if-lez v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/o;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/k;->a(Lcom/mixpanel/android/mpmetrics/k;)V

    .line 103
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 107
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 112
    const/4 v0, 0x0

    return v0
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 116
    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 120
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/o;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/k;->c(Lcom/mixpanel/android/mpmetrics/k;)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->c()Lcom/mixpanel/android/mpmetrics/InAppNotification;

    move-result-object v0

    .line 122
    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->i()Ljava/lang/String;

    move-result-object v0

    .line 123
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 126
    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 133
    :try_start_1
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 134
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/o;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/k;->e(Lcom/mixpanel/android/mpmetrics/k;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 136
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/o;->a:Lcom/mixpanel/android/mpmetrics/k;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/k;->a(Lcom/mixpanel/android/mpmetrics/k;)V

    .line 141
    :goto_1
    return v3

    .line 128
    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
