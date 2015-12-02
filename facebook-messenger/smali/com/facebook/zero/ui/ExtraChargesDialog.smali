.class public Lcom/facebook/zero/ui/ExtraChargesDialog;
.super Landroid/support/v4/app/DialogFragment;
.source "ExtraChargesDialog.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private Z:Lcom/facebook/prefs/shared/d;

.field private aa:Lcom/facebook/analytics/av;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/widget/TextView;

.field private ad:Landroid/widget/Button;

.field private ae:Landroid/widget/Button;

.field private af:Landroid/widget/CheckBox;

.field private ag:Landroid/app/Dialog;

.field private ah:Lcom/facebook/zero/ui/k;

.field private ai:Lcom/facebook/prefs/shared/ae;

.field private aj:Ljava/lang/String;

.field private ak:Ljava/lang/String;

.field private al:Ljava/lang/String;

.field private am:Landroid/os/Parcelable;

.field private an:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 81
    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 84
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 86
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 87
    const-string v1, "dialogTitle"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v1, "dialogContent"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v1, "dialogName"

    invoke-static {p1}, Lcom/facebook/zero/a/c;->a(Lcom/facebook/prefs/shared/ae;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v1, "dialogCheckboxPreference"

    sget-object v2, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1, v2}, Lcom/facebook/prefs/shared/ae;->b(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-virtual {p0, v0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->g(Landroid/os/Bundle;)V

    .line 93
    return-void
.end method

.method private O()V
    .locals 4

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ai:Lcom/facebook/prefs/shared/ae;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->af:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 210
    :goto_0
    iget-object v1, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->Z:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ai:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    .line 214
    if-nez v0, :cond_0

    .line 215
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->aa:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "dismiss"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->an:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "zero_extra_charges_dialog_persist_dismiss"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "dialogName"

    iget-object v3, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->al:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 222
    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ag:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 223
    return-void

    .line 209
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/zero/ui/ExtraChargesDialog;)Lcom/facebook/zero/ui/k;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ah:Lcom/facebook/zero/ui/k;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/zero/ui/ExtraChargesDialog;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->al:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/zero/ui/ExtraChargesDialog;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->an:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/zero/ui/ExtraChargesDialog;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->aa:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/zero/ui/ExtraChargesDialog;)Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->am:Landroid/os/Parcelable;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/zero/ui/ExtraChargesDialog;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ag:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/zero/ui/ExtraChargesDialog;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->O()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcelable;)Lcom/facebook/zero/ui/ExtraChargesDialog;
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->am:Landroid/os/Parcelable;

    .line 204
    return-object p0
.end method

.method public a(Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/ExtraChargesDialog;
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ah:Lcom/facebook/zero/ui/k;

    .line 199
    return-object p0
.end method

.method public c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    .line 102
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->c(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 104
    invoke-virtual {p0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 105
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->Z:Lcom/facebook/prefs/shared/d;

    .line 106
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->aa:Lcom/facebook/analytics/av;

    .line 108
    invoke-virtual {p0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->k()Landroid/os/Bundle;

    move-result-object v0

    .line 109
    if-eqz v0, :cond_0

    .line 110
    const-string v2, "dialogTitle"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->aj:Ljava/lang/String;

    .line 111
    const-string v2, "dialogContent"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ak:Ljava/lang/String;

    .line 112
    const-string v2, "dialogName"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->al:Ljava/lang/String;

    .line 113
    sget-object v2, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v3, "dialogCheckboxPreference"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ai:Lcom/facebook/prefs/shared/ae;

    .line 116
    :cond_0
    const-class v0, Landroid/view/LayoutInflater;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->extra_data_charges_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 120
    sget v0, Lcom/facebook/i;->dialog_title:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ab:Landroid/widget/TextView;

    .line 121
    sget v0, Lcom/facebook/i;->dialog_text:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ac:Landroid/widget/TextView;

    .line 122
    sget v0, Lcom/facebook/i;->cancel_button:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ad:Landroid/widget/Button;

    .line 123
    sget v0, Lcom/facebook/i;->confirm_button:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ae:Landroid/widget/Button;

    .line 124
    sget v0, Lcom/facebook/i;->disable_reminder_checkbox:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->af:Landroid/widget/CheckBox;

    .line 126
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ab:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->aj:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ac:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ak:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->n()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/p;->ZeroModalDialog:I

    invoke-direct {v0, v2, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ag:Landroid/app/Dialog;

    .line 130
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ag:Landroid/app/Dialog;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 132
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ad:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/zero/ui/i;

    invoke-direct {v1, p0}, Lcom/facebook/zero/ui/i;-><init>(Lcom/facebook/zero/ui/ExtraChargesDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ae:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/zero/ui/j;

    invoke-direct {v1, p0}, Lcom/facebook/zero/ui/j;-><init>(Lcom/facebook/zero/ui/ExtraChargesDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    if-eqz p1, :cond_1

    .line 167
    const-string v0, "extra_data"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->am:Landroid/os/Parcelable;

    .line 168
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->af:Landroid/widget/CheckBox;

    const-string v1, "dialogCheckboxKey"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 170
    const-string v0, "uuid"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->an:Ljava/lang/String;

    .line 175
    :goto_0
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->aa:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->an:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "zero_extra_charges_dialog_open"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "dialogName"

    iget-object v3, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->al:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 182
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ag:Landroid/app/Dialog;

    invoke-static {v0}, Lcom/facebook/base/b/a;->a(Landroid/app/Dialog;)V

    .line 184
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->ag:Landroid/app/Dialog;

    return-object v0

    .line 172
    :cond_1
    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->an:Ljava/lang/String;

    goto :goto_0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->am:Landroid/os/Parcelable;

    if-eqz v0, :cond_0

    .line 190
    const-string v0, "extra_data"

    iget-object v1, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->am:Landroid/os/Parcelable;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 193
    :cond_0
    const-string v0, "uuid"

    iget-object v1, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->an:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v0, "dialogCheckboxKey"

    iget-object v1, p0, Lcom/facebook/zero/ui/ExtraChargesDialog;->af:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 195
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 97
    sget-object v0, Lcom/facebook/analytics/f/a;->ZERO_EXTRA_CHARGES_DIALOG:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
