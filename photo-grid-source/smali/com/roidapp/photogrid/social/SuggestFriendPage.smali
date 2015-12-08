.class public Lcom/roidapp/photogrid/social/SuggestFriendPage;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/view/View;

.field private e:I

.field private f:Z

.field private g:Landroid/support/v4/app/FragmentManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    const v3, 0x7f0c0020

    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 82
    iget v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    if-nez v0, :cond_2

    .line 83
    iget-boolean v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->f:Z

    if-eqz v0, :cond_1

    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 85
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->d:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->c:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 87
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->c:Landroid/widget/TextView;

    const v1, 0x7f070360

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 94
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->b:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 96
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->b:Landroid/widget/TextView;

    const v1, 0x7f07035b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 107
    :cond_0
    :goto_1
    return-void

    .line 90
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->d:Landroid/view/View;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->c:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    goto :goto_0

    .line 97
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->d:Landroid/view/View;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 100
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->b:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 101
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->c:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/view/View;I)V

    .line 103
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->b:Landroid/widget/TextView;

    const v1, 0x7f070374

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->c:Landroid/widget/TextView;

    const v1, 0x7f07035f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1
.end method

.method public static a(Landroid/app/Activity;ZI)V
    .locals 3

    .prologue
    .line 35
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/social/SuggestFriendPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 36
    const-string v1, "page_type"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 37
    const-string v1, "is_first_login"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 38
    invoke-virtual {p0, v0, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 39
    return-void
.end method

.method private a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 122
    .line 1075
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->g:Landroid/support/v4/app/FragmentManager;

    if-nez v0, :cond_0

    .line 1076
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->g:Landroid/support/v4/app/FragmentManager;

    .line 1078
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->g:Landroid/support/v4/app/FragmentManager;

    .line 122
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 123
    const v1, 0x7f0d00e6

    invoke-virtual {v0, v1, p1, p2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 124
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 125
    return-void
.end method

.method private static a(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 166
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 167
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 169
    :cond_0
    return-void
.end method

.method private b()V
    .locals 1

    .prologue
    .line 161
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->setResult(I)V

    .line 162
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->finish()V

    .line 163
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 111
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 112
    const/16 v0, 0x33d7

    if-ne p1, v0, :cond_0

    .line 113
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 114
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "is_error"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    const v0, 0x7f070112

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 119
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 151
    iget v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 152
    invoke-static {v2}, Lcom/roidapp/photogrid/social/d;->a(I)Lcom/roidapp/photogrid/social/d;

    move-result-object v0

    const-string v1, "pg_fb_friend"

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 153
    iput v2, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    .line 154
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a()V

    .line 158
    :goto_0
    return-void

    .line 156
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->b()V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 129
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d0028

    if-ne v0, v1, :cond_2

    .line 130
    iget v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->f:Z

    if-eqz v0, :cond_1

    .line 131
    invoke-static {v3}, Lcom/roidapp/photogrid/social/d;->a(I)Lcom/roidapp/photogrid/social/d;

    move-result-object v0

    const-string v1, "pg_fb_friend"

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 132
    iput v3, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    .line 133
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a()V

    .line 146
    :cond_0
    :goto_0
    return-void

    .line 135
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->b()V

    goto :goto_0

    .line 137
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d00e5

    if-ne v0, v1, :cond_0

    .line 138
    iget v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->f:Z

    if-eqz v0, :cond_3

    .line 139
    invoke-static {v2}, Lcom/roidapp/photogrid/social/d;->a(I)Lcom/roidapp/photogrid/social/d;

    move-result-object v0

    const-string v1, "pg_suggest"

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 140
    iput v2, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    .line 141
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a()V

    goto :goto_0

    .line 143
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->b()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 43
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    const v0, 0x7f030029

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->setContentView(I)V

    .line 45
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 46
    const-string v1, "page_type"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    .line 47
    const-string v1, "is_first_login"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->f:Z

    .line 49
    iget v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    if-nez v0, :cond_0

    .line 50
    invoke-static {v3}, Lcom/roidapp/photogrid/social/d;->a(I)Lcom/roidapp/photogrid/social/d;

    move-result-object v0

    const-string v1, "pg_fb_friend"

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 58
    :goto_0
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a:Landroid/widget/TextView;

    .line 59
    const v0, 0x7f0d00e3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->d:Landroid/view/View;

    .line 60
    const v0, 0x7f0d00e4

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->b:Landroid/widget/TextView;

    .line 61
    const v0, 0x7f0d00e5

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->c:Landroid/widget/TextView;

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    iget-object v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    invoke-direct {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a()V

    .line 67
    :goto_1
    return-void

    .line 51
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/social/SuggestFriendPage;->e:I

    if-ne v0, v4, :cond_1

    .line 52
    invoke-static {v4}, Lcom/roidapp/photogrid/social/d;->a(I)Lcom/roidapp/photogrid/social/d;

    move-result-object v0

    const-string v1, "pg_suggest"

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->finish()V

    goto :goto_1
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 71
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 72
    return-void
.end method
