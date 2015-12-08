.class final Lkik/android/chat/fragment/bo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/KikCardBrowserFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCardBrowserFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 285
    iput-object p1, p0, Lkik/android/chat/fragment/bo;->b:Lkik/android/chat/fragment/KikCardBrowserFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/bo;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 289
    iget-object v0, p0, Lkik/android/chat/fragment/bo;->b:Lkik/android/chat/fragment/KikCardBrowserFragment;

    new-instance v1, Lkik/android/chat/fragment/ProgressDialogFragment;

    iget-object v2, p0, Lkik/android/chat/fragment/bo;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikCardBrowserFragment;->a(Lkik/android/chat/fragment/KikCardBrowserFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)Lkik/android/chat/fragment/ProgressDialogFragment;

    .line 290
    iget-object v0, p0, Lkik/android/chat/fragment/bo;->b:Lkik/android/chat/fragment/KikCardBrowserFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/bo;->b:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikCardBrowserFragment;->b(Lkik/android/chat/fragment/KikCardBrowserFragment;)Lkik/android/chat/fragment/ProgressDialogFragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikCardBrowserFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 291
    return-void
.end method
