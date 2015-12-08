.class final Lkik/android/chat/fragment/hc;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ProgressDialogFragment;

.field final synthetic b:Lkik/android/chat/fragment/KikChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V
    .locals 0

    .prologue
    .line 1319
    iput-object p1, p0, Lkik/android/chat/fragment/hc;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/hc;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1319
    iget-object v0, p0, Lkik/android/chat/fragment/hc;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/hc;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 1329
    iget-object v0, p0, Lkik/android/chat/fragment/hc;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/hc;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V

    .line 1330
    return-void
.end method
