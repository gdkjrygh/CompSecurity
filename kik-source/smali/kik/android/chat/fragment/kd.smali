.class final Lkik/android/chat/fragment/kd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 0

    .prologue
    .line 836
    iput-object p1, p0, Lkik/android/chat/fragment/kd;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 840
    invoke-static {}, Lkik/android/q;->a()Lkik/android/q;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/q;->b()V

    .line 841
    iget-object v0, p0, Lkik/android/chat/fragment/kd;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 842
    iget-object v0, p0, Lkik/android/chat/fragment/kd;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iput-object v1, v0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    .line 843
    return-void
.end method
