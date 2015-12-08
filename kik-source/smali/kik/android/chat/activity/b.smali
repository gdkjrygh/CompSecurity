.class final Lkik/android/chat/activity/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/activity/a;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/a;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lkik/android/chat/activity/b;->a:Lkik/android/chat/activity/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lkik/android/chat/activity/b;->a:Lkik/android/chat/activity/a;

    iget-object v0, v0, Lkik/android/chat/activity/a;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-static {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a(Lkik/android/chat/activity/FragmentWrapperActivity;)Lcom/kik/g/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 79
    iget-object v0, p0, Lkik/android/chat/activity/b;->a:Lkik/android/chat/activity/a;

    iget-object v0, v0, Lkik/android/chat/activity/a;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-virtual {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->finish()V

    .line 80
    return-void
.end method
