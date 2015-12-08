.class final Lkik/android/chat/fragment/lw;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikIqFragmentBase;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikIqFragmentBase;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lkik/android/chat/fragment/lw;->a:Lkik/android/chat/fragment/KikIqFragmentBase;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 82
    iget-object v0, p0, Lkik/android/chat/fragment/lw;->a:Lkik/android/chat/fragment/KikIqFragmentBase;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 84
    if-eqz v0, :cond_0

    .line 85
    new-instance v1, Lkik/android/chat/fragment/lx;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/lx;-><init>(Lkik/android/chat/fragment/lw;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 93
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 98
    iget-object v0, p0, Lkik/android/chat/fragment/lw;->a:Lkik/android/chat/fragment/KikIqFragmentBase;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 100
    if-eqz v0, :cond_0

    .line 101
    new-instance v1, Lkik/android/chat/fragment/ly;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/ly;-><init>(Lkik/android/chat/fragment/lw;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 121
    :goto_0
    return-void

    .line 119
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/lw;->a:Lkik/android/chat/fragment/KikIqFragmentBase;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->w()V

    goto :goto_0
.end method
