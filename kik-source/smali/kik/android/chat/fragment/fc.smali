.class final Lkik/android/chat/fragment/fc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Landroid/widget/CheckBox;

.field final synthetic c:I

.field final synthetic d:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;Landroid/widget/CheckBox;I)V
    .locals 0

    .prologue
    .line 4026
    iput-object p1, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/fc;->a:Lkik/a/d/a/a;

    iput-object p3, p0, Lkik/android/chat/fragment/fc;->b:Landroid/widget/CheckBox;

    iput p4, p0, Lkik/android/chat/fragment/fc;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 11

    .prologue
    .line 4031
    new-instance v0, Lkik/android/net/a/c;

    iget-object v1, p0, Lkik/android/chat/fragment/fc;->a:Lkik/a/d/a/a;

    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->p()Lkik/a/d/s;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->p()Lkik/a/d/s;

    move-result-object v3

    invoke-virtual {v3}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->p()Lkik/a/d/s;

    move-result-object v4

    invoke-virtual {v4}, Lkik/a/d/s;->o()[B

    move-result-object v4

    iget-object v5, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    iget-object v6, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v6, v6, Lkik/android/chat/fragment/KikChatFragment;->i:Lkik/a/f/k;

    iget-object v7, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v7, v7, Lkik/android/chat/fragment/KikChatFragment;->h:Lkik/a/e/n;

    iget-object v8, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v8, v8, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    iget-object v9, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v9, v9, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    iget-object v10, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v10, v10, Lkik/android/chat/fragment/KikChatFragment;->p:Lkik/a/e/t;

    invoke-direct/range {v0 .. v10}, Lkik/android/net/a/c;-><init>(Lkik/a/d/a/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/v;Lkik/a/e/i;Lkik/a/e/t;)V

    .line 4032
    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/net/a/e;->a(Lkik/android/net/a/b;)V

    .line 4033
    iget-object v0, p0, Lkik/android/chat/fragment/fc;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4034
    iget-object v0, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->ag(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/f/a/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/fc;->a:Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/f/a/f;->f(Ljava/lang/String;)V

    .line 4036
    :cond_0
    invoke-static {}, Lkik/android/chat/KikApplication;->d()Lkik/android/util/bo;

    move-result-object v0

    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->p()Lkik/a/d/s;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/util/bo;->a(Lkik/a/d/s;)V

    .line 4037
    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->o()Lkik/a/d/s;

    .line 4038
    iget-object v0, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aL(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 4039
    iget-object v0, p0, Lkik/android/chat/fragment/fc;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget v1, p0, Lkik/android/chat/fragment/fc;->c:I

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->k(Lkik/android/chat/fragment/KikChatFragment;I)V

    .line 4040
    return-void
.end method
