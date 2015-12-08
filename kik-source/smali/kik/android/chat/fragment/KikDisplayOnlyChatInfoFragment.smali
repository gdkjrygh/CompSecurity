.class public Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;
.super Lkik/android/chat/fragment/BaseChatInfoFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;
    }
.end annotation


# instance fields
.field protected q:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private r:Lkik/android/util/aj;

.field private s:Lkik/a/d/m;

.field private t:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;-><init>()V

    .line 51
    new-instance v0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->t:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;

    .line 194
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 46
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v1, 0x7f090148

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    const v0, 0x7f09036a

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v3}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->b(Ljava/lang/String;Z)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v0}, Lkik/a/d/m;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->n:Lkik/a/e/l;

    iget-object v2, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v2}, Lkik/a/d/m;->f()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v3}, Lkik/a/d/m;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lkik/a/e/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/ld;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/ld;-><init>(Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-void
.end method


# virtual methods
.method protected final a()Landroid/view/View$OnClickListener;
    .locals 1

    .prologue
    .line 191
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final b()V
    .locals 3

    .prologue
    .line 83
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 84
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->c:Lkik/android/util/cp;

    const v1, 0x7f0202d2

    const v2, 0x7f0202d4

    invoke-virtual {v0, v1, v2}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/lc;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/lc;-><init>(Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;)V

    const v2, 0x7f090143

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0, v1}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    const-string v1, "CHAT_INFO_START_CHATTING"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->c(Landroid/view/View;)V

    .line 85
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->b(Z)V

    .line 86
    return-void
.end method

.method protected final b(Z)V
    .locals 3

    .prologue
    .line 91
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->r:Lkik/android/util/aj;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    iget-object v2, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {v0, p1, v1, v2}, Lkik/android/util/aj;->a(ZLkik/a/d/m;Landroid/widget/ListView;)V

    .line 92
    return-void
.end method

.method protected final c()V
    .locals 8

    .prologue
    const/16 v7, 0x32

    const/4 v6, 0x1

    const/4 v3, 0x0

    .line 113
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v0}, Lkik/a/d/m;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->q:Lkik/a/e/r;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v1}, Lkik/a/d/m;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->d:Lcom/kik/cache/SoftwareContactImageView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->p:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->q:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->o:Lcom/kik/android/a;

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/SoftwareContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 115
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v0}, Lkik/a/d/m;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 117
    if-ne v0, v6, :cond_1

    .line 118
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->k:Landroid/widget/TextView;

    const v1, 0x7f090194

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    :goto_1
    new-array v0, v6, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->k:Landroid/widget/TextView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 124
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->j:Landroid/widget/TextView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v1}, Lkik/a/d/m;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v0}, Lkik/a/d/m;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 126
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v0}, Lkik/a/d/m;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 127
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 128
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v0}, Lkik/a/d/m;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/l;

    .line 129
    invoke-virtual {v0}, Lkik/a/d/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 113
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v0}, Lkik/a/d/m;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->d:Lcom/kik/cache/SoftwareContactImageView;

    invoke-virtual {v1}, Lcom/kik/cache/SoftwareContactImageView;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->d:Lcom/kik/cache/SoftwareContactImageView;

    invoke-virtual {v2}, Lcom/kik/cache/SoftwareContactImageView;->getMeasuredHeight()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/kik/cache/av;->a(Ljava/lang/String;II)Lcom/kik/cache/av;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->d:Lcom/kik/cache/SoftwareContactImageView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->p:Lcom/kik/cache/ad;

    invoke-virtual {v1, v0, v2}, Lcom/kik/cache/SoftwareContactImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;)V

    goto/16 :goto_0

    .line 120
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->k:Landroid/widget/TextView;

    const v2, 0x7f09011e

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v6

    invoke-static {v2, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 131
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->i:Landroid/widget/TextView;

    invoke-static {v1}, Lkik/android/util/cq;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    :goto_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->i:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v1

    const/16 v2, 0x8

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    iget-object v4, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->i:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v4

    invoke-virtual {v0, v1, v2, v4, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 143
    return-void

    .line 134
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v1}, Lkik/a/d/m;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 138
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    invoke-virtual {v1}, Lkik/a/d/m;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 58
    invoke-super {p0, p1}, Lkik/android/chat/fragment/BaseChatInfoFragment;->onCreate(Landroid/os/Bundle;)V

    .line 59
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;)V

    .line 60
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Chat Info Shown"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 61
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->t:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;->a(Landroid/os/Bundle;)V

    .line 63
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->t:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;->a()Lkik/a/d/m;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    .line 64
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->s:Lkik/a/d/m;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Ensure a backingGroup is provided to this fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_0
    new-instance v0, Lkik/android/util/aj;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->p:Lcom/kik/cache/ad;

    invoke-direct {v0, v1, v2}, Lkik/android/util/aj;-><init>(Landroid/content/Context;Lcom/kik/cache/ad;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->r:Lkik/android/util/aj;

    .line 69
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Opened Public Group Profile"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 70
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 74
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/BaseChatInfoFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 75
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->m:Landroid/view/View;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 77
    iget-object v0, p0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->b:Landroid/view/View;

    return-object v0
.end method
