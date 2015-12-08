.class final Lkik/android/chat/fragment/cs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikDialogFragment;

.field final synthetic b:Lkik/android/chat/fragment/cr;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/cr;Lkik/android/chat/fragment/KikDialogFragment;)V
    .locals 0

    .prologue
    .line 1398
    iput-object p1, p0, Lkik/android/chat/fragment/cs;->b:Lkik/android/chat/fragment/cr;

    iput-object p2, p0, Lkik/android/chat/fragment/cs;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1403
    iget-object v0, p0, Lkik/android/chat/fragment/cs;->b:Lkik/android/chat/fragment/cr;

    iget-object v0, v0, Lkik/android/chat/fragment/cr;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/cs;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 1404
    return-void
.end method
