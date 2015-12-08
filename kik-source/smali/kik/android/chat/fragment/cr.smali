.class final Lkik/android/chat/fragment/cr;
.super Lcom/kik/h/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 1393
    iput-object p1, p0, Lkik/android/chat/fragment/cr;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Lcom/kik/h/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/android/chat/fragment/KikDialogFragment;)V
    .locals 2

    .prologue
    .line 1398
    iget-object v0, p0, Lkik/android/chat/fragment/cr;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->w(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/BugmeBarView;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/cs;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/cs;-><init>(Lkik/android/chat/fragment/cr;Lkik/android/chat/fragment/KikDialogFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/BugmeBarView;->post(Ljava/lang/Runnable;)Z

    .line 1406
    return-void
.end method
