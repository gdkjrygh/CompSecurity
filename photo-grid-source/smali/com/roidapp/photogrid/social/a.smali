.class public final Lcom/roidapp/photogrid/social/a;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lcom/roidapp/cloudlib/sns/b/p;

.field private b:Lcom/roidapp/cloudlib/sns/b/x;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/social/a;)V
    .locals 8

    .prologue
    .line 1102
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Profile/Logout"

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 1103
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1104
    iget-object v0, p0, Lcom/roidapp/photogrid/social/a;->a:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/photogrid/social/a;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-static {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;J)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 1109
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->b(Landroid/content/Context;)V

    .line 1128
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1129
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/g/b;->c()V

    .line 35
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .prologue
    .line 66
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/social/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/social/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    iget-object v1, p0, Lcom/roidapp/photogrid/social/a;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/social/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/ab;->d()V

    .line 69
    iget-object v0, p0, Lcom/roidapp/photogrid/social/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    return-object v0
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 61
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onActivityCreated(Landroid/os/Bundle;)V

    .line 62
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d03db

    if-ne v0, v1, :cond_1

    .line 75
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xb

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/app/Activity;ZI)V

    .line 84
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d03dc

    if-ne v0, v1, :cond_2

    .line 77
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "suggest users"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d03dd

    if-ne v0, v1, :cond_3

    .line 79
    new-instance v0, Lcom/roidapp/cloudlib/sns/h/a;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/h/a;-><init>()V

    .line 80
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-class v2, Lcom/roidapp/cloudlib/sns/h/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d03de

    if-ne v0, v1, :cond_0

    .line 1087
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0700bf

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f07036b

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0700a6

    new-instance v2, Lcom/roidapp/photogrid/social/b;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/social/b;-><init>(Lcom/roidapp/photogrid/social/a;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f07005f

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 41
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 42
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/social/a;->a:Lcom/roidapp/cloudlib/sns/b/p;

    .line 43
    iget-object v0, p0, Lcom/roidapp/photogrid/social/a;->a:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/roidapp/photogrid/social/a;->a:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/photogrid/social/a;->b:Lcom/roidapp/cloudlib/sns/b/x;

    .line 46
    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 51
    const v0, 0x7f0300f7

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 52
    const v1, 0x7f0d03db

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    const v1, 0x7f0d03dc

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    const v1, 0x7f0d03dd

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    const v1, 0x7f0d03de

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    return-object v0
.end method
