.class final Lkik/android/chat/fragment/ke;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 0

    .prologue
    .line 846
    iput-object p1, p0, Lkik/android/chat/fragment/ke;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 850
    invoke-static {}, Lkik/android/q;->a()Lkik/android/q;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/q;->b()V

    .line 851
    iget-object v0, p0, Lkik/android/chat/fragment/ke;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    const/4 v1, 0x0

    iput-object v1, v0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    .line 852
    return-void
.end method
