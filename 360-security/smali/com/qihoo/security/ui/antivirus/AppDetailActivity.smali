.class public Lcom/qihoo/security/ui/antivirus/AppDetailActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# instance fields
.field private A:Landroid/view/View;

.field private B:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private C:Landroid/view/View;

.field private D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

.field private E:Landroid/view/View;

.field private y:Landroid/widget/ImageView;

.field private z:Lcom/qihoo/security/locale/widget/LocaleTextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/AppDetailActivity;)Lcom/qihoo/security/malware/vo/MaliciousInfo;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    return-object v0
.end method

.method private o()V
    .locals 1

    .prologue
    .line 74
    const v0, 0x7f0b0086

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->y:Landroid/widget/ImageView;

    .line 75
    const v0, 0x7f0b0088

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->z:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 76
    const v0, 0x7f0b0087

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->A:Landroid/view/View;

    .line 77
    const v0, 0x7f0b0089

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->B:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 78
    const v0, 0x7f0b008b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->C:Landroid/view/View;

    .line 79
    const v0, 0x7f0b008a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->E:Landroid/view/View;

    .line 80
    return-void
.end method

.method private p()V
    .locals 10

    .prologue
    const/16 v9, 0x8

    const/4 v8, 0x0

    .line 83
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->E:Landroid/view/View;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;-><init>(Lcom/qihoo/security/ui/antivirus/AppDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-boolean v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    if-eqz v0, :cond_3

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->A:Landroid/view/View;

    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->E:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 117
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->p:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v2, v2, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-boolean v3, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 119
    if-eqz v0, :cond_0

    .line 120
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->y:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->p:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getLabel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 125
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 126
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    .line 129
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-boolean v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    if-nez v1, :cond_2

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->p:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getLabel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 132
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->z:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->B:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c010e

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->p:Landroid/content/Context;

    iget-object v5, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v5, v5, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v6, v6, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    iget-object v7, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-boolean v7, v7, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    invoke-static {v4, v5, v6, v7}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 137
    const v0, 0x7f0b008e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 139
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-boolean v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    if-eqz v1, :cond_5

    .line 140
    new-instance v1, Lcom/qihoo/security/ui/a/a;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v2, v2, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Lcom/qihoo/security/ui/a/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 141
    invoke-virtual {v1}, Lcom/qihoo/security/ui/a/a;->a()I

    move-result v2

    if-lez v2, :cond_4

    .line 143
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->C:Landroid/view/View;

    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 144
    invoke-virtual {v1}, Lcom/qihoo/security/ui/a/a;->b()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 170
    :goto_1
    return-void

    .line 113
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->A:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 114
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->E:Landroid/view/View;

    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 146
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->C:Landroid/view/View;

    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 150
    :cond_5
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 151
    invoke-virtual {v1}, Landroid/util/DisplayMetrics;->setToDefaults()V

    .line 153
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v3, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v8}, Lcom/qihoo360/common/utils/PortPackageParser;->parsePackage(Ljava/io/File;Ljava/lang/String;Landroid/util/DisplayMetrics;I)Landroid/content/pm/PackageParser$Package;

    move-result-object v1

    .line 156
    if-nez v1, :cond_6

    .line 158
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->C:Landroid/view/View;

    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 160
    :cond_6
    new-instance v2, Lcom/qihoo/security/ui/a/a;

    invoke-direct {v2, p0, v1}, Lcom/qihoo/security/ui/a/a;-><init>(Landroid/content/Context;Landroid/content/pm/PackageParser$Package;)V

    .line 161
    invoke-virtual {v2}, Lcom/qihoo/security/ui/a/a;->a()I

    move-result v1

    if-lez v1, :cond_7

    .line 162
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->C:Landroid/view/View;

    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 163
    invoke-virtual {v2}, Lcom/qihoo/security/ui/a/a;->b()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 165
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->C:Landroid/view/View;

    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 41
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 43
    const v0, 0x7f030027

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->setContentView(I)V

    .line 45
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    const-string/jumbo v1, "extra_detail_info"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    if-nez v0, :cond_1

    .line 51
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->finish()V

    .line 62
    :goto_0
    return-void

    .line 55
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c010d

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->b(Ljava/lang/String;)V

    .line 57
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->o()V

    .line 59
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->p()V

    .line 61
    const/16 v0, 0x36b5

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 66
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->D:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->finish()V

    .line 71
    :cond_0
    return-void
.end method
