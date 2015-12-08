.class final Lkik/android/chat/fragment/dm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 2158
    iput-object p1, p0, Lkik/android/chat/fragment/dm;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2163
    iget-object v0, p0, Lkik/android/chat/fragment/dm;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 2164
    iget-object v0, p0, Lkik/android/chat/fragment/dm;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->ag(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/f/a/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    .line 2165
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 2166
    return-void
.end method
