.class public Lcom/facebook/orca/threadlist/VersionUpgradePromoView;
.super Lcom/facebook/widget/d;
.source "VersionUpgradePromoView.java"


# instance fields
.field private final a:Lcom/facebook/orca/c/a;

.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/config/a/a;

.field private final d:Lcom/facebook/appconfig/m;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/Button;

.field private g:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 39
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 47
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 50
    const-class v0, Lcom/facebook/orca/c/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/c/a;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->a:Lcom/facebook/orca/c/a;

    .line 51
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->b:Lcom/facebook/prefs/shared/d;

    .line 52
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->c:Lcom/facebook/config/a/a;

    .line 53
    const-class v0, Lcom/facebook/appconfig/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/appconfig/m;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->d:Lcom/facebook/appconfig/m;

    .line 55
    sget v0, Lcom/facebook/k;->orca_version_upgrade_promo:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->setContentView(I)V

    .line 57
    sget v0, Lcom/facebook/i;->version_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->e:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/facebook/i;->version_get_it_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->f:Landroid/widget/Button;

    .line 59
    iget-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->f:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/threadlist/bp;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/bp;-><init>(Lcom/facebook/orca/threadlist/VersionUpgradePromoView;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->setVisibility(I)V

    .line 66
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/VersionUpgradePromoView;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->c()V

    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->d:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->c:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-eq v0, v1, :cond_2

    .line 88
    :cond_0
    invoke-virtual {p0, v3}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->setVisibility(I)V

    .line 106
    :cond_1
    :goto_0
    return-void

    .line 92
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->B:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->d:Lcom/facebook/appconfig/m;

    invoke-virtual {v1}, Lcom/facebook/appconfig/m;->b()Ljava/lang/String;

    move-result-object v1

    .line 95
    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->a:Lcom/facebook/orca/c/a;

    invoke-virtual {v0}, Lcom/facebook/orca/c/a;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 101
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->setVisibility(I)V

    goto :goto_0

    .line 105
    :cond_3
    invoke-virtual {p0, v3}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->setVisibility(I)V

    goto :goto_0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->d:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->d:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 116
    :goto_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 117
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 118
    return-void

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->c:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->d:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->f()J

    move-result-wide v0

    .line 70
    iget-wide v2, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->g:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 71
    iput-wide v0, p0, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->g:J

    .line 72
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->b()V

    .line 74
    :cond_0
    return-void
.end method
