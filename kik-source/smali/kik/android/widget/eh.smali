.class final Lkik/android/widget/eh;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/UpdatingDateView;


# direct methods
.method constructor <init>(Lkik/android/widget/UpdatingDateView;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lkik/android/widget/eh;->a:Lkik/android/widget/UpdatingDateView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 55
    iget-object v0, p0, Lkik/android/widget/eh;->a:Lkik/android/widget/UpdatingDateView;

    invoke-static {v0}, Lkik/android/widget/UpdatingDateView;->a(Lkik/android/widget/UpdatingDateView;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const-string v0, "android.intent.action.TIME_TICK"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lkik/android/widget/eh;->a:Lkik/android/widget/UpdatingDateView;

    invoke-static {v2}, Lkik/android/widget/UpdatingDateView;->a(Lkik/android/widget/UpdatingDateView;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 60
    :cond_0
    :goto_0
    return-void

    .line 59
    :cond_1
    iget-object v0, p0, Lkik/android/widget/eh;->a:Lkik/android/widget/UpdatingDateView;

    invoke-static {v0}, Lkik/android/widget/UpdatingDateView;->b(Lkik/android/widget/UpdatingDateView;)V

    goto :goto_0
.end method
