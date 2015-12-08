.class public Lcom/QRBS/activity/CreateCalendar;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "CreateCalendar.java"


# instance fields
.field date:Landroid/widget/Button;

.field date2:Landroid/widget/Button;

.field des:Landroid/widget/EditText;

.field encode:Landroid/widget/Button;

.field flag:[Z

.field pick:Landroid/widget/Button;

.field time:Landroid/widget/Button;

.field time2:Landroid/widget/Button;

.field private updateData:Landroid/app/DatePickerDialog$OnDateSetListener;

.field private updateData2:Landroid/app/DatePickerDialog$OnDateSetListener;

.field private updateTime:Landroid/app/TimePickerDialog$OnTimeSetListener;

.field private updateTime2:Landroid/app/TimePickerDialog$OnTimeSetListener;

.field what:Landroid/widget/EditText;

.field where:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    .line 37
    const/4 v0, 0x4

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/QRBS/activity/CreateCalendar;->flag:[Z

    .line 146
    new-instance v0, Lcom/QRBS/activity/CreateCalendar$1;

    invoke-direct {v0, p0}, Lcom/QRBS/activity/CreateCalendar$1;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    iput-object v0, p0, Lcom/QRBS/activity/CreateCalendar;->updateData:Landroid/app/DatePickerDialog$OnDateSetListener;

    .line 166
    new-instance v0, Lcom/QRBS/activity/CreateCalendar$2;

    invoke-direct {v0, p0}, Lcom/QRBS/activity/CreateCalendar$2;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    iput-object v0, p0, Lcom/QRBS/activity/CreateCalendar;->updateData2:Landroid/app/DatePickerDialog$OnDateSetListener;

    .line 191
    new-instance v0, Lcom/QRBS/activity/CreateCalendar$3;

    invoke-direct {v0, p0}, Lcom/QRBS/activity/CreateCalendar$3;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    iput-object v0, p0, Lcom/QRBS/activity/CreateCalendar;->updateTime:Landroid/app/TimePickerDialog$OnTimeSetListener;

    .line 201
    new-instance v0, Lcom/QRBS/activity/CreateCalendar$4;

    invoke-direct {v0, p0}, Lcom/QRBS/activity/CreateCalendar$4;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    iput-object v0, p0, Lcom/QRBS/activity/CreateCalendar;->updateTime2:Landroid/app/TimePickerDialog$OnTimeSetListener;

    .line 26
    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/CreateCalendar;)V
    .locals 0

    .prologue
    .line 138
    invoke-direct {p0}, Lcom/QRBS/activity/CreateCalendar;->showDataDialog()V

    return-void
.end method

.method static synthetic access$1(Lcom/QRBS/activity/CreateCalendar;)V
    .locals 0

    .prologue
    .line 158
    invoke-direct {p0}, Lcom/QRBS/activity/CreateCalendar;->showDataDialog2()V

    return-void
.end method

.method static synthetic access$2(Lcom/QRBS/activity/CreateCalendar;)V
    .locals 0

    .prologue
    .line 178
    invoke-direct {p0}, Lcom/QRBS/activity/CreateCalendar;->showTimeDialog()V

    return-void
.end method

.method static synthetic access$3(Lcom/QRBS/activity/CreateCalendar;)V
    .locals 0

    .prologue
    .line 184
    invoke-direct {p0}, Lcom/QRBS/activity/CreateCalendar;->showTimeDialog2()V

    return-void
.end method

.method static synthetic access$4(Lcom/QRBS/activity/CreateCalendar;)Z
    .locals 1

    .prologue
    .line 210
    invoke-direct {p0}, Lcom/QRBS/activity/CreateCalendar;->controlEdit()Z

    move-result v0

    return v0
.end method

.method static synthetic access$5(Lcom/QRBS/activity/CreateCalendar;Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 216
    invoke-direct {p0, p1}, Lcom/QRBS/activity/CreateCalendar;->check(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private check(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 1
    .param p1, "str"    # Ljava/lang/CharSequence;

    .prologue
    .line 217
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private controlEdit()Z
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar;->what:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar;->where:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar;->des:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    const/4 v0, 0x1

    .line 213
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private showDataDialog()V
    .locals 7

    .prologue
    .line 139
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 140
    .local v6, "c":Ljava/util/Calendar;
    new-instance v0, Landroid/app/DatePickerDialog;

    iget-object v2, p0, Lcom/QRBS/activity/CreateCalendar;->updateData:Landroid/app/DatePickerDialog$OnDateSetListener;

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v1, 0x2

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v1, 0x5

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v5

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 141
    .local v0, "dp":Landroid/app/DatePickerDialog;
    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    .line 142
    return-void
.end method

.method private showDataDialog2()V
    .locals 7

    .prologue
    .line 159
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 160
    .local v6, "c":Ljava/util/Calendar;
    new-instance v0, Landroid/app/DatePickerDialog;

    iget-object v2, p0, Lcom/QRBS/activity/CreateCalendar;->updateData2:Landroid/app/DatePickerDialog$OnDateSetListener;

    const/4 v1, 0x1

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x5

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 161
    .local v0, "dp":Landroid/app/DatePickerDialog;
    invoke-virtual {v0}, Landroid/app/DatePickerDialog;->show()V

    .line 162
    return-void
.end method

.method private showTimeDialog()V
    .locals 7

    .prologue
    .line 179
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 180
    .local v6, "c":Ljava/util/Calendar;
    new-instance v0, Landroid/app/TimePickerDialog;

    iget-object v2, p0, Lcom/QRBS/activity/CreateCalendar;->updateTime:Landroid/app/TimePickerDialog$OnTimeSetListener;

    const/16 v1, 0xb

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/16 v1, 0xc

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v5, 0x1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 181
    .local v0, "dp":Landroid/app/TimePickerDialog;
    invoke-virtual {v0}, Landroid/app/TimePickerDialog;->show()V

    .line 182
    return-void
.end method

.method private showTimeDialog2()V
    .locals 7

    .prologue
    .line 185
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 186
    .local v6, "c":Ljava/util/Calendar;
    new-instance v0, Landroid/app/TimePickerDialog;

    iget-object v2, p0, Lcom/QRBS/activity/CreateCalendar;->updateTime2:Landroid/app/TimePickerDialog$OnTimeSetListener;

    const/16 v1, 0xb

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/16 v1, 0xc

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v5, 0x1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 187
    .local v0, "dp":Landroid/app/TimePickerDialog;
    invoke-virtual {v0}, Landroid/app/TimePickerDialog;->show()V

    .line 188
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 40
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 41
    const v3, 0x7f030022

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->setContentView(I)V

    .line 43
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateCalendar;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 44
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v3, 0x7f0200d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 45
    const v3, 0x7f0800b1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 46
    const v3, 0x7f0800cb

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 47
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 50
    const v3, 0x7f0d0061

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 51
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v3, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 52
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 55
    const v3, 0x7f0d007e

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->what:Landroid/widget/EditText;

    .line 56
    const v3, 0x7f0d0083

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->where:Landroid/widget/EditText;

    .line 57
    const v3, 0x7f0d0084

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->des:Landroid/widget/EditText;

    .line 58
    const v3, 0x7f0d007f

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->date:Landroid/widget/Button;

    .line 59
    const v3, 0x7f0d0081

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->date2:Landroid/widget/Button;

    .line 60
    const v3, 0x7f0d0080

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->time:Landroid/widget/Button;

    .line 61
    const v3, 0x7f0d0082

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->time2:Landroid/widget/Button;

    .line 62
    const v3, 0x7f0d007c

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->encode:Landroid/widget/Button;

    .line 63
    const v3, 0x7f0d007b

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateCalendar;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->pick:Landroid/widget/Button;

    .line 65
    iget-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->pick:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateCalendar$5;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateCalendar$5;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    iget-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->date:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateCalendar$6;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateCalendar$6;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    iget-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->date2:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateCalendar$7;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateCalendar$7;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    iget-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->time:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateCalendar$8;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateCalendar$8;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    iget-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->time2:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateCalendar$9;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateCalendar$9;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    iget-object v3, p0, Lcom/QRBS/activity/CreateCalendar;->encode:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateCalendar$10;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateCalendar$10;-><init>(Lcom/QRBS/activity/CreateCalendar;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 133
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateCalendar;->finish()V

    .line 134
    const/4 v0, 0x1

    return v0
.end method
