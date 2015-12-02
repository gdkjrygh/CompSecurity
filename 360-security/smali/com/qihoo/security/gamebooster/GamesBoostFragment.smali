.class public Lcom/qihoo/security/gamebooster/GamesBoostFragment;
.super Lcom/qihoo/security/ui/fragment/BaseFragment;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/qihoo/security/gamebooster/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/ui/fragment/BaseFragment;",
        "Landroid/view/View$OnClickListener;",
        "Lcom/qihoo/security/gamebooster/h",
        "<",
        "Lcom/qihoo/security/gamebooster/g;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Landroid/view/Menu;

.field private c:Landroid/view/View;

.field private j:Landroid/widget/ListView;

.field private k:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private l:Lcom/qihoo/security/gamebooster/g;

.field private m:Lcom/qihoo/security/gamebooster/c;

.field private n:Landroid/view/LayoutInflater;

.field private o:Landroid/graphics/Bitmap;

.field private final p:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;-><init>()V

    .line 49
    new-instance v0, Lcom/qihoo/security/gamebooster/GamesBoostFragment$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment$1;-><init>(Lcom/qihoo/security/gamebooster/GamesBoostFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->p:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 78
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 79
    const-string/jumbo v1, "com.qihoo.security.gamebooster.LocalGamePackageUpdate"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 80
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 81
    return-void
.end method

.method private a(Landroid/app/Activity;II)V
    .locals 5

    .prologue
    const/4 v2, 0x2

    const/4 v4, 0x1

    .line 198
    if-nez p1, :cond_0

    .line 228
    :goto_0
    return-void

    .line 201
    :cond_0
    new-instance v0, Lcom/qihoo/security/dialog/i;

    invoke-direct {v0, p1, p2, p3}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;II)V

    .line 202
    new-array v1, v2, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonText([I)V

    .line 203
    invoke-virtual {v0, v4}, Lcom/qihoo/security/dialog/i;->setCancelable(Z)V

    .line 204
    new-array v1, v2, [Landroid/view/View$OnClickListener;

    const/4 v2, 0x0

    new-instance v3, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;

    invoke-direct {v3, p0, v0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment$2;-><init>(Lcom/qihoo/security/gamebooster/GamesBoostFragment;Lcom/qihoo/security/dialog/i;)V

    aput-object v3, v1, v2

    new-instance v2, Lcom/qihoo/security/gamebooster/GamesBoostFragment$3;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment$3;-><init>(Lcom/qihoo/security/gamebooster/GamesBoostFragment;Lcom/qihoo/security/dialog/i;)V

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 227
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    goto :goto_0

    .line 202
    nop

    :array_0
    .array-data 4
        0x7f0c0156
        0x7f0c014f
    .end array-data
.end method

.method private a(Landroid/view/Menu;)V
    .locals 4

    .prologue
    const v3, 0x7f0b0252

    .line 149
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "game_booster_show_toast"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a:Z

    .line 151
    iget-boolean v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a:Z

    if-eqz v0, :cond_0

    .line 152
    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0099

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 156
    :goto_0
    return-void

    .line 154
    :cond_0
    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c009a

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GamesBoostFragment;Landroid/view/Menu;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Landroid/view/Menu;)V

    return-void
.end method

.method private a(Lcom/qihoo/security/gamebooster/g;)V
    .locals 2

    .prologue
    .line 119
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->m:Lcom/qihoo/security/gamebooster/c;

    if-nez v0, :cond_1

    .line 120
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 121
    if-eqz v0, :cond_0

    .line 122
    new-instance v1, Lcom/qihoo/security/gamebooster/c;

    invoke-direct {v1, p1, v0}, Lcom/qihoo/security/gamebooster/c;-><init>(Lcom/qihoo/security/gamebooster/g;Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->m:Lcom/qihoo/security/gamebooster/c;

    .line 123
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->j:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->m:Lcom/qihoo/security/gamebooster/c;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 129
    :cond_0
    :goto_0
    return-void

    .line 126
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->m:Lcom/qihoo/security/gamebooster/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/gamebooster/c;->a(Lcom/qihoo/security/gamebooster/g;)V

    .line 127
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->m:Lcom/qihoo/security/gamebooster/c;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/c;->notifyDataSetChanged()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GamesBoostFragment;)Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a:Z

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GamesBoostFragment;Z)Z
    .locals 0

    .prologue
    .line 35
    iput-boolean p1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/gamebooster/GamesBoostFragment;)Landroid/view/Menu;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->b:Landroid/view/Menu;

    return-object v0
.end method

.method private b()V
    .locals 1

    .prologue
    .line 84
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/h;)V

    .line 85
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/b;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->o:Landroid/graphics/Bitmap;

    .line 86
    return-void
.end method

.method private c()V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->c:Landroid/view/View;

    const v1, 0x7f0b00f6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->k:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->k:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0097

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->k:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->c:Landroid/view/View;

    const v1, 0x7f0b0122

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->j:Landroid/widget/ListView;

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->n:Landroid/view/LayoutInflater;

    const v1, 0x7f030062

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 94
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->n:Landroid/view/LayoutInflater;

    const v1, 0x7f030059

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 95
    const v0, 0x7f0b0144

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 96
    const v1, 0x7f0b0145

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 98
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c0085

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->h()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 100
    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 102
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 104
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/gamebooster/g;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 108
    if-nez p1, :cond_0

    .line 116
    :goto_0
    return-void

    .line 111
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->l:Lcom/qihoo/security/gamebooster/g;

    .line 115
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->l:Lcom/qihoo/security/gamebooster/g;

    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Lcom/qihoo/security/gamebooster/g;)V

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 35
    check-cast p1, Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Lcom/qihoo/security/gamebooster/g;Ljava/lang/Object;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 241
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->k:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-ne p1, v0, :cond_0

    .line 242
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/b;->c()V

    .line 243
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->k:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setEnabled(Z)V

    .line 244
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->k:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0098

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->k:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0200fe

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setBackgroundResource(I)V

    .line 246
    const/16 v0, 0x2b6e

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 248
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/fragment/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 63
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->setHasOptionsMenu(Z)V

    .line 64
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a()V

    .line 69
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->n:Landroid/view/LayoutInflater;

    .line 70
    const v0, 0x7f030054

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->c:Landroid/view/View;

    .line 71
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->b()V

    .line 72
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->c()V

    .line 73
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->c:Landroid/view/View;

    return-object v0
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    .line 232
    invoke-super {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;->onDestroyView()V

    .line 233
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->o:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->o:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 236
    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    const v2, 0x7f0c00a0

    .line 173
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 174
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 191
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/fragment/BaseFragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0

    .line 176
    :pswitch_0
    iget-boolean v1, p0, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a:Z

    if-eqz v1, :cond_1

    .line 177
    const/16 v1, 0x2b6a

    invoke-static {v1}, Lcom/qihoo/security/support/b;->b(I)V

    .line 178
    const v1, 0x7f0c009c

    invoke-direct {p0, v0, v2, v1}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Landroid/app/Activity;II)V

    .line 183
    :goto_1
    if-eqz v0, :cond_0

    .line 184
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->c()V

    goto :goto_0

    .line 180
    :cond_1
    const/16 v1, 0x2b6c

    invoke-static {v1}, Lcom/qihoo/security/support/b;->b(I)V

    .line 181
    const v1, 0x7f0c009e

    invoke-direct {p0, v0, v2, v1}, Lcom/qihoo/security/gamebooster/GamesBoostFragment;->a(Landroid/app/Activity;II)V

    goto :goto_1

    .line 174
    :pswitch_data_0
    .packed-switch 0x7f0b0252
        :pswitch_0
    .end packed-switch
.end method
