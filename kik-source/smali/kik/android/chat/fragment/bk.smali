.class final Lkik/android/chat/fragment/bk;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikCardBrowserFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCardBrowserFragment;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lkik/android/chat/fragment/bk;->a:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 52
    iget-object v0, p0, Lkik/android/chat/fragment/bk;->a:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCardBrowserFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 54
    iget-object v1, p0, Lkik/android/chat/fragment/bk;->a:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikCardBrowserFragment;->j()Lcom/kik/cards/web/bd;

    move-result-object v1

    .line 56
    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->canGoBack()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 57
    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->goBack()V

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 59
    :cond_1
    instance-of v1, v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    if-eqz v1, :cond_2

    .line 60
    check-cast v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/activity/FragmentWrapperActivity;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    iget-object v0, p0, Lkik/android/chat/fragment/bk;->a:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCardBrowserFragment;->J()V

    .line 62
    iget-object v0, p0, Lkik/android/chat/fragment/bk;->a:Lkik/android/chat/fragment/KikCardBrowserFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikCardBrowserFragment;->a(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 66
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/bk;->a:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCardBrowserFragment;->J()V

    goto :goto_0
.end method
