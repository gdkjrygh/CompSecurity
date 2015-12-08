.class final Lkik/android/chat/fragment/hr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Ljava/util/HashMap;

.field final synthetic b:Lkik/android/chat/fragment/hq;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/hq;Ljava/util/HashMap;)V
    .locals 0

    .prologue
    .line 313
    iput-object p1, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iput-object p2, p0, Lkik/android/chat/fragment/hr;->a:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 317
    iget-object v0, p0, Lkik/android/chat/fragment/hr;->a:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 318
    const-string v1, "report"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 320
    new-instance v0, Lkik/android/widget/cp;

    iget-object v1, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v1, v1, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v2, v2, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->i(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/f;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v3, v3, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikChatInfoFragment;->b:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "Chat Info Screen"

    iget-object v5, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v5, v5, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    iget-object v6, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v6, v6, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v6, v6, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/cp;-><init>(Lkik/a/d/k;Ljava/util/Vector;Landroid/content/Context;Ljava/lang/String;Lcom/kik/android/a;Lkik/a/e/i;)V

    .line 321
    iget-object v1, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v1, v1, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v2, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v3, "dialog"

    invoke-virtual {v1, v0, v2, v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 379
    :cond_0
    :goto_0
    return-void

    .line 323
    :cond_1
    const-string v1, "block"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 324
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v1, v1, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 325
    iget-object v1, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v1, v1, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v1

    invoke-static {v1}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v1

    .line 326
    const v2, 0x7f090055

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v4, v4, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v4

    invoke-virtual {v4}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    aput-object v1, v3, v6

    invoke-static {v2, v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f09003b

    new-array v3, v6, [Ljava/lang/Object;

    iget-object v4, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v4, v4, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v4

    invoke-virtual {v4}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090299

    new-instance v3, Lkik/android/chat/fragment/hv;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/hv;-><init>(Lkik/android/chat/fragment/hr;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090296

    new-instance v3, Lkik/android/chat/fragment/hs;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/hs;-><init>(Lkik/android/chat/fragment/hr;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 371
    iget-object v1, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v1, v1, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v2, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v3, "dialog"

    invoke-virtual {v1, v0, v2, v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 373
    :cond_2
    const-string v1, "stopChatting"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 374
    iget-object v0, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v0, v0, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->j(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    goto/16 :goto_0

    .line 376
    :cond_3
    const-string v1, "viewMembers"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 377
    iget-object v0, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v0, v0, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    new-instance v1, Lkik/android/chat/fragment/KikGroupMembersListFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment$a;-><init>()V

    iget-object v2, p0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v2, v2, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikGroupMembersListFragment$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    goto/16 :goto_0
.end method
