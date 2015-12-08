.class public abstract Lkik/android/chat/fragment/KikFragmentBase;
.super Lcom/kik/ui/fragment/FragmentBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikFragmentBase$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/Vector;

.field private b:Lcom/kik/g/f;

.field private c:Lcom/kik/g/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase;-><init>()V

    .line 45
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->a:Ljava/util/Vector;

    .line 46
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->b:Lcom/kik/g/f;

    .line 47
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->c:Lcom/kik/g/f;

    return-void
.end method


# virtual methods
.method protected final U()Lcom/kik/g/f;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->c:Lcom/kik/g/f;

    return-object v0
.end method

.method public final V()Lcom/kik/e/a;
    .locals 2

    .prologue
    .line 88
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 89
    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/a;

    invoke-interface {v0}, Lkik/android/chat/a;->a()Lcom/kik/e/a;

    move-result-object v0

    .line 95
    :goto_0
    return-object v0

    .line 93
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Activity was null when fetching core component"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 95
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final W()V
    .locals 3

    .prologue
    .line 189
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 190
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 191
    const-string v0, "input_method"

    invoke-virtual {v1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 192
    invoke-virtual {v1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 194
    :cond_0
    return-void
.end method

.method public final a(Lkik/android/util/an;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 157
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 158
    if-eqz v0, :cond_0

    .line 159
    invoke-static {p1, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    .line 164
    :goto_0
    return-object v0

    .line 162
    :cond_0
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 163
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Unable to start fragment: no activity attached"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected a(Lcom/kik/g/f;)V
    .locals 0

    .prologue
    .line 60
    return-void
.end method

.method public final a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 56
    return-void
.end method

.method protected abstract a(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method protected b(Lcom/kik/g/f;)V
    .locals 0

    .prologue
    .line 64
    return-void
.end method

.method public final b(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 180
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 182
    if-eqz v0, :cond_0

    .line 183
    new-instance v1, Lkik/android/chat/fragment/KikFragmentBase$a;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/KikFragmentBase$a;-><init>(Lkik/android/chat/fragment/KikFragmentBase;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 185
    :cond_0
    return-void
.end method

.method protected final d(I)V
    .locals 2

    .prologue
    .line 146
    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikFragmentBase;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 124
    invoke-super {p0, p1}, Lcom/kik/ui/fragment/FragmentBase;->onAttach(Landroid/app/Activity;)V

    .line 125
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 108
    invoke-super {p0, p1}, Lcom/kik/ui/fragment/FragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 110
    iget-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->c:Lcom/kik/g/f;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikFragmentBase;->b(Lcom/kik/g/f;)V

    .line 111
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 116
    invoke-super {p0}, Lcom/kik/ui/fragment/FragmentBase;->onDestroy()V

    .line 118
    iget-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->c:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 119
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 101
    invoke-super {p0}, Lcom/kik/ui/fragment/FragmentBase;->onPause()V

    .line 102
    iget-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->b:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 103
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 135
    invoke-super {p0}, Lcom/kik/ui/fragment/FragmentBase;->onResume()V

    .line 137
    iget-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->b:Lcom/kik/g/f;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikFragmentBase;->a(Lcom/kik/g/f;)V

    .line 138
    iget-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 139
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikFragmentBase;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 142
    return-void
.end method
