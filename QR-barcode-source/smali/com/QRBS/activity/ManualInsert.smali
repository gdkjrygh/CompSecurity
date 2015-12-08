.class public Lcom/QRBS/activity/ManualInsert;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "ManualInsert.java"


# instance fields
.field private edit:Landroid/widget/EditText;

.field private filters:[Landroid/text/InputFilter;

.field private four:Landroid/widget/CheckBox;

.field private image:Landroid/widget/ImageView;

.field private one:Landroid/widget/CheckBox;

.field private result:Ljava/lang/String;

.field private search:Landroid/widget/Button;

.field private three:Landroid/widget/CheckBox;

.field private two:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert;->two:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic access$1(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert;->three:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic access$2(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert;->four:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic access$3(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert;->image:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$4(Lcom/QRBS/activity/ManualInsert;)[Landroid/text/InputFilter;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert;->filters:[Landroid/text/InputFilter;

    return-object v0
.end method

.method static synthetic access$5(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$6(Lcom/QRBS/activity/ManualInsert;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert;->one:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic access$7(Lcom/QRBS/activity/ManualInsert;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/QRBS/activity/ManualInsert;->result:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$8(Lcom/QRBS/activity/ManualInsert;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/QRBS/activity/ManualInsert;->result:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 37
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 38
    const v3, 0x7f030033

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/ManualInsert;->setContentView(I)V

    .line 40
    invoke-virtual {p0}, Lcom/QRBS/activity/ManualInsert;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 41
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v3, 0x7f0200d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 42
    const v3, 0x7f0800b1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 43
    const v3, 0x7f0800d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 44
    invoke-virtual {v0, v5}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 47
    const v3, 0x7f0d0061

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/ManualInsert;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 48
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v3, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 49
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 51
    const v3, 0x7f0d00a8

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/ManualInsert;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;

    .line 52
    const v3, 0x7f0d00a7

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/ManualInsert;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, p0, Lcom/QRBS/activity/ManualInsert;->image:Landroid/widget/ImageView;

    .line 53
    const v3, 0x7f0d00aa

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/ManualInsert;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    iput-object v3, p0, Lcom/QRBS/activity/ManualInsert;->one:Landroid/widget/CheckBox;

    .line 54
    const v3, 0x7f0d00ad

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/ManualInsert;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    iput-object v3, p0, Lcom/QRBS/activity/ManualInsert;->two:Landroid/widget/CheckBox;

    .line 55
    const v3, 0x7f0d00b0

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/ManualInsert;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    iput-object v3, p0, Lcom/QRBS/activity/ManualInsert;->three:Landroid/widget/CheckBox;

    .line 56
    const v3, 0x7f0d00b3

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/ManualInsert;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    iput-object v3, p0, Lcom/QRBS/activity/ManualInsert;->four:Landroid/widget/CheckBox;

    .line 57
    const v3, 0x7f0d0092

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/ManualInsert;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/ManualInsert;->search:Landroid/widget/Button;

    .line 58
    new-array v3, v5, [Landroid/text/InputFilter;

    iput-object v3, p0, Lcom/QRBS/activity/ManualInsert;->filters:[Landroid/text/InputFilter;

    .line 59
    iget-object v3, p0, Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 60
    iget-object v3, p0, Lcom/QRBS/activity/ManualInsert;->edit:Landroid/widget/EditText;

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 61
    iget-object v3, p0, Lcom/QRBS/activity/ManualInsert;->one:Landroid/widget/CheckBox;

    new-instance v4, Lcom/QRBS/activity/ManualInsert$1;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/ManualInsert$1;-><init>(Lcom/QRBS/activity/ManualInsert;)V

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 91
    iget-object v3, p0, Lcom/QRBS/activity/ManualInsert;->two:Landroid/widget/CheckBox;

    new-instance v4, Lcom/QRBS/activity/ManualInsert$2;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/ManualInsert$2;-><init>(Lcom/QRBS/activity/ManualInsert;)V

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 122
    iget-object v3, p0, Lcom/QRBS/activity/ManualInsert;->three:Landroid/widget/CheckBox;

    new-instance v4, Lcom/QRBS/activity/ManualInsert$3;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/ManualInsert$3;-><init>(Lcom/QRBS/activity/ManualInsert;)V

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 151
    iget-object v3, p0, Lcom/QRBS/activity/ManualInsert;->four:Landroid/widget/CheckBox;

    new-instance v4, Lcom/QRBS/activity/ManualInsert$4;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/ManualInsert$4;-><init>(Lcom/QRBS/activity/ManualInsert;)V

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 179
    iget-object v3, p0, Lcom/QRBS/activity/ManualInsert;->search:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/ManualInsert$5;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/ManualInsert$5;-><init>(Lcom/QRBS/activity/ManualInsert;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 245
    invoke-virtual {p0}, Lcom/QRBS/activity/ManualInsert;->finish()V

    .line 246
    const/4 v0, 0x1

    return v0
.end method
