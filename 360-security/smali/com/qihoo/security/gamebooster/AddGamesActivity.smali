.class public Lcom/qihoo/security/gamebooster/AddGamesActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/gamebooster/AddGamesActivity$a;
    }
.end annotation


# instance fields
.field A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/c/a;",
            ">;"
        }
    .end annotation
.end field

.field B:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/c/a;",
            ">;"
        }
    .end annotation
.end field

.field C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private D:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private E:Landroid/view/View;

.field private F:Landroid/widget/ListView;

.field private G:Landroid/view/View;

.field private H:Lcom/qihoo/security/gamebooster/a;

.field private I:Landroid/content/Intent;

.field private J:Landroid/content/pm/PackageManager;

.field private K:Lcom/qihoo/security/gamebooster/AddGamesActivity$a;

.field private L:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/c/a;",
            ">;"
        }
    .end annotation
.end field

.field public y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/c/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 44
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->E:Landroid/view/View;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/AddGamesActivity;Lcom/qihoo/security/gamebooster/AddGamesActivity$a;)Lcom/qihoo/security/gamebooster/AddGamesActivity$a;
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->K:Lcom/qihoo/security/gamebooster/AddGamesActivity$a;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->G:Landroid/view/View;

    return-object v0
.end method

.method private c(Landroid/content/Intent;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 158
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->F:Landroid/widget/ListView;

    invoke-virtual {v0, v5}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 159
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->E:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 160
    const-string/jumbo v0, "packages"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->y:Ljava/util/ArrayList;

    .line 164
    const-string/jumbo v0, "from_gameboost"

    invoke-virtual {p1, v0, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 165
    new-instance v1, Lcom/qihoo/security/gamebooster/a;

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->p:Landroid/content/Context;

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->J:Landroid/content/pm/PackageManager;

    invoke-direct {v1, v2, v5, v3, v0}, Lcom/qihoo/security/gamebooster/a;-><init>(Landroid/content/Context;Ljava/util/List;Landroid/content/pm/PackageManager;Z)V

    iput-object v1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->H:Lcom/qihoo/security/gamebooster/a;

    .line 166
    new-instance v0, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;

    invoke-direct {v0, p0, p0}, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;-><init>(Lcom/qihoo/security/gamebooster/AddGamesActivity;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->K:Lcom/qihoo/security/gamebooster/AddGamesActivity$a;

    .line 167
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->K:Lcom/qihoo/security/gamebooster/AddGamesActivity$a;

    new-array v1, v4, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/gamebooster/AddGamesActivity$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 168
    const/16 v0, 0x2b66

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 169
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->F:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/gamebooster/AddGamesActivity;)Lcom/qihoo/security/gamebooster/a;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->H:Lcom/qihoo/security/gamebooster/a;

    return-object v0
.end method

.method private o()V
    .locals 2

    .prologue
    .line 198
    const v0, 0x7f0b0077

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 199
    const v0, 0x7f0b009b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->E:Landroid/view/View;

    .line 200
    const v0, 0x102000a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->F:Landroid/widget/ListView;

    .line 201
    const v0, 0x7f0b008f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->G:Landroid/view/View;

    .line 202
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->G:Landroid/view/View;

    const v1, 0x7f0b0091

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 203
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 204
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->z:Ljava/util/ArrayList;

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->A:Ljava/util/ArrayList;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->C:Ljava/util/ArrayList;

    .line 95
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/pm/PackageManager;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->B:Ljava/util/ArrayList;

    .line 100
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 101
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 102
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/c/a;

    .line 104
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->y:Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string/jumbo v2, "com.qihoo.security.lite"

    iget-object v0, v0, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 109
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 110
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 111
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/c/a;

    .line 112
    const-string/jumbo v2, "com.qihoo.security.lite"

    iget-object v0, v0, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 113
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 118
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->B:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 142
    :cond_5
    :goto_2
    return-void

    .line 125
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/c/a;

    .line 126
    iget-object v2, v0, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_7

    .line 127
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 129
    :cond_7
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->A:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 133
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->z:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_9

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->C:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->z:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 136
    :cond_9
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->A:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_5

    .line 137
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->C:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_2
.end method

.method protected j()V
    .locals 1

    .prologue
    .line 208
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 209
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 210
    const v0, 0x7f0c008f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->b(I)V

    .line 212
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 224
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    .line 225
    const v0, 0x7f040023

    const v1, 0x7f040017

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->overridePendingTransition(II)V

    .line 226
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 146
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 147
    const v0, 0x7f03001f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->setContentView(I)V

    .line 148
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->J:Landroid/content/pm/PackageManager;

    .line 149
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->o()V

    .line 150
    if-eqz p1, :cond_0

    const-string/jumbo v0, "hasSave"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    :goto_0
    return-void

    .line 153
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->I:Landroid/content/Intent;

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->I:Landroid/content/Intent;

    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->c(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 233
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 234
    iput-object v1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->y:Ljava/util/ArrayList;

    .line 236
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->K:Lcom/qihoo/security/gamebooster/AddGamesActivity$a;

    if-eqz v0, :cond_1

    .line 237
    iput-object v1, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->K:Lcom/qihoo/security/gamebooster/AddGamesActivity$a;

    .line 240
    :cond_1
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 241
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 179
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 180
    invoke-direct {p0, p1}, Lcom/qihoo/security/gamebooster/AddGamesActivity;->c(Landroid/content/Intent;)V

    .line 181
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 216
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onPause()V

    .line 217
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->H:Lcom/qihoo/security/gamebooster/a;

    if-eqz v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->H:Lcom/qihoo/security/gamebooster/a;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/a;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->L:Ljava/util/ArrayList;

    .line 220
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 4

    .prologue
    .line 185
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 186
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->L:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 187
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->C:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 188
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/c/a;

    .line 189
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/AddGamesActivity;->L:Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 190
    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/qihoo/security/c/a;->g:Z

    goto :goto_0

    .line 195
    :cond_1
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 173
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 174
    const-string/jumbo v0, "hasSave"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 175
    return-void
.end method
