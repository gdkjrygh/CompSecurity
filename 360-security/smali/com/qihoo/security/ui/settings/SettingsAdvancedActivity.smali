.class public Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# instance fields
.field private A:Lcom/qihoo/security/dialog/b;

.field private B:Lcom/qihoo/security/dialog/b;

.field private C:Lcom/qihoo/security/dialog/b;

.field private D:Landroid/view/View;

.field private E:Landroid/view/View;

.field private F:Landroid/view/View;

.field private G:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private H:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private I:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private J:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private K:Lcom/qihoo/security/widget/ProgressView;

.field private final L:Lcom/qihoo/security/v5/AveDBUpdateService$a;

.field private y:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private z:Lcom/qihoo/security/widget/CheckBoxPreference;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 57
    new-instance v0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->L:Lcom/qihoo/security/v5/AveDBUpdateService$a;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/ProgressView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->K:Lcom/qihoo/security/widget/ProgressView;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->I:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->J:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->F:Landroid/view/View;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->E:Landroid/view/View;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->D:Landroid/view/View;

    return-object v0
.end method

.method static synthetic i(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->H:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->r()V

    return-void
.end method

.method static synthetic k(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p()V

    return-void
.end method

.method static synthetic m(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->q()V

    return-void
.end method

.method static synthetic n(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->A:Lcom/qihoo/security/dialog/b;

    return-object v0
.end method

.method static synthetic o(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    return-object v0
.end method

.method private o()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 235
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "key_virus_scan_strict_mode"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    .line 242
    :goto_0
    return-void

    .line 239
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    goto :goto_0
.end method

.method static synthetic p(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->B:Lcom/qihoo/security/dialog/b;

    return-object v0
.end method

.method private p()V
    .locals 4

    .prologue
    const/4 v3, 0x2

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->A:Lcom/qihoo/security/dialog/b;

    if-nez v0, :cond_0

    .line 246
    new-instance v0, Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0c01aa

    const v2, 0x7f0c01ab

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->A:Lcom/qihoo/security/dialog/b;

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->A:Lcom/qihoo/security/dialog/b;

    new-array v1, v3, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonText([I)V

    .line 249
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->A:Lcom/qihoo/security/dialog/b;

    new-array v1, v3, [Landroid/view/View$OnClickListener;

    const/4 v2, 0x0

    new-instance v3, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$4;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$4;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    aput-object v3, v1, v2

    const/4 v2, 0x1

    new-instance v3, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$5;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$5;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 268
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->A:Lcom/qihoo/security/dialog/b;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$6;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$6;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 277
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->A:Lcom/qihoo/security/dialog/b;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/b;->show()V

    .line 278
    return-void

    .line 248
    nop

    :array_0
    .array-data 4
        0x7f0c01ac
        0x7f0c014f
    .end array-data
.end method

.method private q()V
    .locals 4

    .prologue
    const/4 v3, 0x2

    .line 281
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->B:Lcom/qihoo/security/dialog/b;

    if-nez v0, :cond_0

    .line 282
    new-instance v0, Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0c01ad

    const v2, 0x7f0c01ae

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->B:Lcom/qihoo/security/dialog/b;

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->B:Lcom/qihoo/security/dialog/b;

    new-array v1, v3, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonText([I)V

    .line 285
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->B:Lcom/qihoo/security/dialog/b;

    new-array v1, v3, [Landroid/view/View$OnClickListener;

    const/4 v2, 0x0

    new-instance v3, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$7;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$7;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    aput-object v3, v1, v2

    const/4 v2, 0x1

    new-instance v3, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$8;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$8;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->B:Lcom/qihoo/security/dialog/b;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/b;->show()V

    .line 303
    return-void

    .line 284
    nop

    :array_0
    .array-data 4
        0x7f0c01af
        0x7f0c014f
    .end array-data
.end method

.method static synthetic q(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->s()V

    return-void
.end method

.method static synthetic r(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/v5/AveDBUpdateService$a;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->L:Lcom/qihoo/security/v5/AveDBUpdateService$a;

    return-object v0
.end method

.method private r()V
    .locals 4

    .prologue
    .line 307
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "key_virus_scan_strict_version"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 308
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p:Landroid/content/Context;

    const-string/jumbo v2, "key_virus_scan_strict_mode"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 314
    :cond_0
    const/4 v0, 0x0

    .line 326
    if-eqz v0, :cond_1

    .line 327
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V

    .line 328
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 335
    :cond_1
    :goto_0
    return-void

    .line 331
    :catch_0
    move-exception v0

    .line 332
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method private s()V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 338
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    if-nez v0, :cond_0

    .line 339
    new-instance v0, Lcom/qihoo/security/dialog/b;

    invoke-direct {v0, p0}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    .line 340
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0c01ad

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setDialogTitle(I)V

    .line 341
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0300af

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->a(I)Landroid/view/View;

    .line 343
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0b0247

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->D:Landroid/view/View;

    .line 344
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0b024a

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->E:Landroid/view/View;

    .line 345
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0b024e

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->F:Landroid/view/View;

    .line 346
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0b0248

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 347
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0b0249

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->H:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 348
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0b024c

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->I:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 349
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0b024d

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->J:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 350
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    const v1, 0x7f0b024b

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ProgressView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->K:Lcom/qihoo/security/widget/ProgressView;

    .line 351
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->K:Lcom/qihoo/security/widget/ProgressView;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/ProgressView;->setAnimation(Z)V

    .line 353
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    new-array v1, v4, [I

    const v2, 0x7f0c014f

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonText([I)V

    .line 354
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    new-array v1, v4, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$9;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$9;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 361
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->D:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 362
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->E:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 363
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->F:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 364
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->C:Lcom/qihoo/security/dialog/b;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/b;->show()V

    .line 366
    return-void
.end method


# virtual methods
.method protected j()V
    .locals 2

    .prologue
    .line 228
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 229
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 230
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01a5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->b(Ljava/lang/String;)V

    .line 232
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    .line 190
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 191
    const v0, 0x7f03008f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->setContentView(I)V

    .line 192
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p:Landroid/content/Context;

    .line 193
    const v0, 0x7f0b01d7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 194
    const v0, 0x7f0b01d2

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 196
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->o()V

    .line 198
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$2;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 211
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$3;-><init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "key_virus_scan_strict_version"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 220
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 221
    const-string/jumbo v0, "1.0.0"

    .line 223
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    iget-object v2, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c01a9

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(Ljava/lang/String;)V

    .line 224
    return-void
.end method
