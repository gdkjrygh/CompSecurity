.class final Lkik/android/chat/fragment/lk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ProgressDialogFragment;

.field final synthetic b:Lkik/a/d/k;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:Lkik/android/chat/fragment/KikGroupMembersListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;Lkik/android/chat/fragment/ProgressDialogFragment;Lkik/a/d/k;ZZ)V
    .locals 0

    .prologue
    .line 546
    iput-object p1, p0, Lkik/android/chat/fragment/lk;->e:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/lk;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    iput-object p3, p0, Lkik/android/chat/fragment/lk;->b:Lkik/a/d/k;

    iput-boolean p4, p0, Lkik/android/chat/fragment/lk;->c:Z

    iput-boolean p5, p0, Lkik/android/chat/fragment/lk;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .prologue
    .line 550
    iget-object v0, p0, Lkik/android/chat/fragment/lk;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    .line 551
    iget-object v0, p0, Lkik/android/chat/fragment/lk;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    .line 552
    iget-object v0, p0, Lkik/android/chat/fragment/lk;->e:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/lk;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 553
    iget-object v0, p0, Lkik/android/chat/fragment/lk;->e:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->c:Lkik/a/e/l;

    iget-object v1, p0, Lkik/android/chat/fragment/lk;->b:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/lk;->e:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lkik/a/d/n;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v2

    iget-boolean v3, p0, Lkik/android/chat/fragment/lk;->c:Z

    iget-boolean v4, p0, Lkik/android/chat/fragment/lk;->d:Z

    invoke-interface {v0, v1, v2, v3, v4}, Lkik/a/e/l;->a(Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/kik/g/p;

    move-result-object v0

    .line 554
    iget-object v1, p0, Lkik/android/chat/fragment/lk;->e:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->p(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 555
    return-void
.end method
