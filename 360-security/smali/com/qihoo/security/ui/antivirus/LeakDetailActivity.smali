.class public Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$1;,
        Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;
    }
.end annotation


# instance fields
.field private A:Lcom/qihoo/security/locale/widget/LocaleButton;

.field private B:Lcom/qihoo/security/locale/widget/LocaleButton;

.field private C:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private D:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private E:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private F:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private G:Z

.field private H:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;

.field private y:Lcom/qihoo/security/leak/c;

.field private z:Lcom/qihoo/security/leak/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 180
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;)Lcom/qihoo/security/leak/c;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;)Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->H:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->o()V

    return-void
.end method

.method private o()V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 136
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->G:Z

    .line 138
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->A:Lcom/qihoo/security/locale/widget/LocaleButton;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleButton;->setVisibility(I)V

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->B:Lcom/qihoo/security/locale/widget/LocaleButton;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setVisibility(I)V

    .line 144
    :goto_0
    return-void

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->A:Lcom/qihoo/security/locale/widget/LocaleButton;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setVisibility(I)V

    .line 142
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->B:Lcom/qihoo/security/locale/widget/LocaleButton;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleButton;->setVisibility(I)V

    goto :goto_0
.end method

.method private p()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 167
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v1}, Lcom/qihoo/security/leak/c;->a()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "leak_samsung_backup"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 168
    sget-object v0, Lcom/qihoo/security/leak/b;->a:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/Utils;->showPackageDetial(Landroid/content/Context;Ljava/lang/String;)V

    .line 169
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/leak/LeakTipsService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 176
    :cond_0
    :goto_0
    return-void

    .line 171
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->H:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;

    if-nez v1, :cond_0

    .line 172
    new-instance v1, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;-><init>(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$1;)V

    iput-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->H:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;

    .line 173
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->H:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Integer;

    const/4 v3, 0x0

    check-cast v0, Ljava/lang/Integer;

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method


# virtual methods
.method protected j()V
    .locals 1

    .prologue
    .line 119
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 121
    const v0, 0x7f0c010a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->b(I)V

    .line 123
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 238
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->G:Z

    if-eqz v0, :cond_0

    .line 239
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->setResult(I)V

    .line 241
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    .line 242
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 148
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    :goto_0
    return-void

    .line 151
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 153
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->p()V

    goto :goto_0

    .line 156
    :pswitch_1
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->onBackPressed()V

    goto :goto_0

    .line 151
    nop

    :pswitch_data_0
    .packed-switch 0x7f0b0173
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 59
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 60
    invoke-static {}, Lcom/qihoo/security/leak/d;->a()Lcom/qihoo/security/leak/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->z:Lcom/qihoo/security/leak/d;

    .line 62
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "extra_leak_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 64
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->G:Z

    .line 65
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->onBackPressed()V

    .line 115
    :goto_0
    return-void

    .line 69
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->z:Lcom/qihoo/security/leak/d;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/leak/d;->a(Ljava/lang/String;)Lcom/qihoo/security/leak/c;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    .line 70
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    if-nez v0, :cond_1

    .line 71
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->G:Z

    .line 72
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->onBackPressed()V

    goto :goto_0

    .line 76
    :cond_1
    const v0, 0x7f03006d

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->setContentView(I)V

    .line 78
    const v0, 0x7f0b016a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 79
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v1}, Lcom/qihoo/security/leak/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 81
    const v0, 0x7f0b016b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 82
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v1}, Lcom/qihoo/security/leak/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 84
    const v0, 0x7f0b0049

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 85
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v1}, Lcom/qihoo/security/leak/c;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 87
    const v0, 0x7f0b0173

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleButton;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->A:Lcom/qihoo/security/locale/widget/LocaleButton;

    .line 88
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->A:Lcom/qihoo/security/locale/widget/LocaleButton;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    const v0, 0x7f0b0174

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleButton;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->B:Lcom/qihoo/security/locale/widget/LocaleButton;

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->B:Lcom/qihoo/security/locale/widget/LocaleButton;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    const v0, 0x7f0b016e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->C:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 93
    const v0, 0x7f0b0170

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->E:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 94
    const v0, 0x7f0b0171

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 95
    const v0, 0x7f0b0172

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 97
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->C:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v1}, Lcom/qihoo/security/leak/c;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 98
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->E:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v1}, Lcom/qihoo/security/leak/c;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->D:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v1}, Lcom/qihoo/security/leak/c;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v1}, Lcom/qihoo/security/leak/c;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 103
    const v0, 0x7f0b016f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 106
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v1}, Lcom/qihoo/security/leak/c;->a()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "leak_samsung_backup"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 107
    const v1, 0x7f0c00b4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 112
    :goto_1
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->o()V

    .line 114
    const/16 v0, 0x36bf

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto/16 :goto_0

    .line 109
    :cond_2
    const v1, 0x7f0c00b5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_1
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 127
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->a()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "leak_samsung_backup"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->y:Lcom/qihoo/security/leak/c;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->o()V

    .line 131
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->H:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;

    .line 133
    :cond_0
    return-void
.end method
