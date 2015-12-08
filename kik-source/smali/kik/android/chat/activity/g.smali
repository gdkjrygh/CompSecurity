.class final Lkik/android/chat/activity/g;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/activity/IntroActivity;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/IntroActivity;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lkik/android/chat/activity/g;->a:Lkik/android/chat/activity/IntroActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 40
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Core teardown took more than five seconds."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
