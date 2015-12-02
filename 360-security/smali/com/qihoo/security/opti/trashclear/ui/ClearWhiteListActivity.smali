.class public Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$1;,
        Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$b;,
        Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;
    }
.end annotation


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;"
        }
    .end annotation
.end field

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;"
        }
    .end annotation
.end field

.field private C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;"
        }
    .end annotation
.end field

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;"
        }
    .end annotation
.end field

.field private E:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private F:Landroid/widget/LinearLayout;

.field private G:Lcom/qihoo/security/enginehelper/clean/a;

.field private H:Lcom/qihoo360/mobilesafe/b/g;

.field private I:Landroid/content/pm/PackageManager;

.field private J:Z

.field private y:Landroid/widget/ListView;

.field private z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 187
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->J:Z

    .line 726
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo360/mobilesafe/b/g;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->H:Lcom/qihoo360/mobilesafe/b/g;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;Z)Z
    .locals 0

    .prologue
    .line 43
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->J:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Landroid/content/pm/PackageManager;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->I:Landroid/content/pm/PackageManager;

    return-object v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v4, 0x1

    .line 699
    if-nez p1, :cond_1

    .line 700
    const/4 p1, 0x0

    .line 723
    :cond_0
    :goto_0
    return-object p1

    .line 706
    :cond_1
    const-string/jumbo v0, ""

    .line 707
    const-string/jumbo v1, "[[["

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string/jumbo v1, "]]]"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 708
    const-string/jumbo v1, "\\[\\[\\[(\\d)\\]\\]\\]"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 709
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 710
    :goto_1
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 711
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 713
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "[[["

    const-string/jumbo v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "]]]"

    const-string/jumbo v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 714
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 715
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c005f

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Z
    .locals 1

    .prologue
    .line 43
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->J:Z

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->A:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo/security/enginehelper/clean/a;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->G:Lcom/qihoo/security/enginehelper/clean/a;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->B:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->D:Ljava/util/List;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->C:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method protected j()V
    .locals 1

    .prologue
    .line 181
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 182
    const v0, 0x7f0c0060

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->b(I)V

    .line 183
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/16 v2, 0x28

    .line 106
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 108
    const v0, 0x7f030095

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->setContentView(I)V

    .line 110
    new-instance v0, Lcom/qihoo360/mobilesafe/b/g;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->p:Landroid/content/Context;

    invoke-direct {v0, v1, v2, v2}, Lcom/qihoo360/mobilesafe/b/g;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->H:Lcom/qihoo360/mobilesafe/b/g;

    .line 112
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->I:Landroid/content/pm/PackageManager;

    .line 114
    const v0, 0x7f0b0094

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->F:Landroid/widget/LinearLayout;

    .line 115
    const v0, 0x7f0b0091

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->E:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 116
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->E:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0069

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 118
    const v0, 0x7f0b0182

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->y:Landroid/widget/ListView;

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->y:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->F:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Landroid/content/Context;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->G:Lcom/qihoo/security/enginehelper/clean/a;

    .line 122
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->G:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->e()V

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->G:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->A:Ljava/util/List;

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->G:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->B:Ljava/util/List;

    .line 126
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->G:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->D:Ljava/util/List;

    .line 127
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->G:Lcom/qihoo/security/enginehelper/clean/a;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->C:Ljava/util/List;

    .line 143
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->p:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->y:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 145
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->A:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;-><init>()V

    .line 147
    const/4 v1, -0x1

    iput v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    .line 148
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 149
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Ljava/util/List;)V

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Ljava/util/List;)V

    .line 153
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->B:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 154
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;-><init>()V

    .line 155
    const/4 v1, -0x2

    iput v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    .line 156
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 157
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Ljava/util/List;)V

    .line 160
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->B:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Ljava/util/List;)V

    .line 161
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->D:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 162
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;-><init>()V

    .line 163
    const/4 v1, -0x3

    iput v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    .line 164
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 165
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Ljava/util/List;)V

    .line 168
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->D:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Ljava/util/List;)V

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->C:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 170
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;-><init>()V

    .line 171
    const/4 v1, -0x4

    iput v1, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    .line 172
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 173
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Ljava/util/List;)V

    .line 176
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->z:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->C:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Ljava/util/List;)V

    .line 177
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 65
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 66
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->H:Lcom/qihoo360/mobilesafe/b/g;

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->H:Lcom/qihoo360/mobilesafe/b/g;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/g;->a()V

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->G:Lcom/qihoo/security/enginehelper/clean/a;

    if-eqz v0, :cond_1

    .line 70
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->G:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->f()V

    .line 72
    :cond_1
    return-void
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 688
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onPause()V

    .line 690
    return-void
.end method
