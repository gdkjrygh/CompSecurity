.class final Lkik/android/chat/fragment/gp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/KikChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatInfoFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 884
    iput-object p1, p0, Lkik/android/chat/fragment/gp;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/gp;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 888
    iget-object v0, p0, Lkik/android/chat/fragment/gp;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    iget-object v1, p0, Lkik/android/chat/fragment/gp;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 889
    iget-object v0, p0, Lkik/android/chat/fragment/gp;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->n(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    .line 890
    iget-object v0, p0, Lkik/android/chat/fragment/gp;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/gp;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->o(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    .line 891
    iget-object v0, p0, Lkik/android/chat/fragment/gp;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->p(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->d()Lkik/android/scan/a/c;

    move-result-object v0

    .line 892
    if-eqz v0, :cond_0

    .line 893
    iget-object v1, p0, Lkik/android/chat/fragment/gp;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatInfoFragment;->A:Lkik/android/scan/d;

    iget-object v2, p0, Lkik/android/chat/fragment/gp;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lkik/android/scan/d;->a(Lkik/android/scan/a/c;Lkik/a/d/k;)V

    .line 895
    :cond_0
    return-void
.end method
