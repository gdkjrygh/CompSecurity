.class final Lkik/android/chat/activity/d;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/activity/FragmentWrapperActivity;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/FragmentWrapperActivity;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lkik/android/chat/activity/d;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 96
    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/activity/d;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-static {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->c(Lkik/android/chat/activity/FragmentWrapperActivity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/activity/d;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-static {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->c(Lkik/android/chat/activity/FragmentWrapperActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/activity/d;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-static {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a(Lkik/android/chat/activity/FragmentWrapperActivity;)Lcom/kik/g/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    iget-object v0, p0, Lkik/android/chat/activity/d;->a:Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-virtual {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->finish()V

    :cond_0
    return-void
.end method
