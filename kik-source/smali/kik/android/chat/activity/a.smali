.class final Lkik/android/chat/activity/a;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/activity/FragmentWrapperActivity;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/FragmentWrapperActivity;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lkik/android/chat/activity/a;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lkik/android/chat/activity/a;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    new-instance v1, Lkik/android/chat/activity/b;

    invoke-direct {v1, p0}, Lkik/android/chat/activity/b;-><init>(Lkik/android/chat/activity/a;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/activity/FragmentWrapperActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
