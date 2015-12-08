.class public abstract Lkik/android/chat/fragment/BaseChatInfoFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"


# instance fields
.field protected a:Landroid/view/LayoutInflater;

.field protected b:Landroid/view/View;

.field protected c:Lkik/android/util/cp;

.field protected d:Lcom/kik/cache/SoftwareContactImageView;

.field protected e:Landroid/widget/LinearLayout;

.field protected f:Landroid/widget/ListView;

.field protected g:Landroid/view/ViewGroup;

.field protected h:Landroid/view/ViewGroup;

.field protected i:Landroid/widget/TextView;

.field protected j:Landroid/widget/TextView;

.field protected k:Landroid/widget/TextView;

.field protected l:Landroid/view/View;

.field protected m:Landroid/view/View;

.field protected n:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected o:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected p:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    return-void
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 156
    const v0, 0x7f090016

    return v0
.end method

.method protected abstract a()Landroid/view/View$OnClickListener;
.end method

.method protected final a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;
    .locals 4

    .prologue
    .line 130
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->a:Landroid/view/LayoutInflater;

    const v1, 0x7f030023

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 131
    const v0, 0x7f0e00c4

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 132
    const v1, 0x7f0e00c3

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 133
    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 134
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    const v0, 0x7f0e00c2

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 136
    invoke-virtual {v0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    return-object v2
.end method

.method protected abstract b()V
.end method

.method protected abstract b(Z)V
.end method

.method protected abstract c()V
.end method

.method protected final c(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 126
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 119
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 120
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->b(Z)V

    .line 121
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 62
    invoke-virtual {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/BaseChatInfoFragment;)V

    .line 67
    :cond_0
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 68
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, -0x1

    .line 73
    iput-object p1, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->a:Landroid/view/LayoutInflater;

    .line 74
    const v0, 0x7f030006

    invoke-virtual {p1, v0, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    .line 81
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e0030

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/SoftwareContactImageView;

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->d:Lcom/kik/cache/SoftwareContactImageView;

    .line 82
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e000b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->e:Landroid/widget/LinearLayout;

    .line 83
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e0034

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->f:Landroid/widget/ListView;

    .line 84
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e002d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->g:Landroid/view/ViewGroup;

    .line 85
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e002c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->h:Landroid/view/ViewGroup;

    .line 86
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e0032

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->i:Landroid/widget/TextView;

    .line 87
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e0033

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->j:Landroid/widget/TextView;

    .line 88
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e0079

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->k:Landroid/widget/TextView;

    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e000c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->l:Landroid/view/View;

    .line 90
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    const v1, 0x7f0e0036

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->m:Landroid/view/View;

    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 93
    new-instance v0, Lkik/android/util/cp;

    invoke-virtual {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/util/cp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->c:Lkik/android/util/cp;

    .line 98
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->h:Landroid/view/ViewGroup;

    iget-object v1, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 99
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->h:Landroid/view/ViewGroup;

    iget-object v1, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 100
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->g:Landroid/view/ViewGroup;

    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 101
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->l:Landroid/view/View;

    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    const/16 v2, 0x8

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    invoke-direct {v1, v3, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 103
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 105
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->m:Landroid/view/View;

    invoke-virtual {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->a()Landroid/view/View$OnClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->m:Landroid/view/View;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 107
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->m:Landroid/view/View;

    const-string v1, "AUTOMATION_CHAT_INFO_OPTIONS"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->registerForContextMenu(Landroid/view/View;)V

    .line 110
    invoke-virtual {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->b()V

    .line 111
    invoke-virtual {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->c()V

    .line 113
    iget-object v0, p0, Lkik/android/chat/fragment/BaseChatInfoFragment;->b:Landroid/view/View;

    return-object v0
.end method

.method public onDestroyView()V
    .locals 0

    .prologue
    .line 149
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroyView()V

    .line 150
    invoke-static {p0}, Lbutterknife/ButterKnife;->reset(Ljava/lang/Object;)V

    .line 151
    return-void
.end method
