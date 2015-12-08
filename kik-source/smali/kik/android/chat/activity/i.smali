.class final Lkik/android/chat/activity/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/activity/h;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/h;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lkik/android/chat/activity/i;->a:Lkik/android/chat/activity/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lkik/android/chat/activity/i;->a:Lkik/android/chat/activity/h;

    iget-object v0, v0, Lkik/android/chat/activity/h;->a:Lkik/android/chat/activity/IntroActivity;

    invoke-static {v0}, Lkik/android/chat/activity/IntroActivity;->e(Lkik/android/chat/activity/IntroActivity;)V

    .line 107
    return-void
.end method
