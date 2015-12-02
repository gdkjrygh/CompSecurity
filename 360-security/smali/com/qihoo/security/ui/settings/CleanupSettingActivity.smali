.class public Lcom/qihoo/security/ui/settings/CleanupSettingActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;
    }
.end annotation


# instance fields
.field private A:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private B:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private C:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private D:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private E:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private F:[I

.field private G:[I

.field private H:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

.field private I:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

.field private y:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private z:Lcom/qihoo/security/widget/CheckBoxPreference;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 45
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->F:[I

    .line 51
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->G:[I

    .line 57
    return-void

    .line 45
    :array_0
    .array-data 4
        0x7f0b00dd
        0x7f0b00de
        0x7f0b00df
        0x7f0b00e0
    .end array-data

    .line 51
    :array_1
    .array-data 4
        0x7f0b00da
        0x7f0b00db
        0x7f0b00dc
    .end array-data
.end method

.method static synthetic a(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    return-object v0
.end method

.method private o()V
    .locals 6

    .prologue
    const/16 v5, 0x32

    const/4 v4, 0x7

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 154
    const v0, 0x7f0b00d2

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 155
    const v0, 0x7f0b00d3

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 156
    const v0, 0x7f0b00d4

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 157
    const v0, 0x7f0b00d5

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 158
    const v0, 0x7f0b00d6

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->C:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 159
    const v0, 0x7f0b00d7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->D:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 160
    const v0, 0x7f0b00d8

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->E:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 162
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_notification_swtich"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 168
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 170
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    .line 171
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    .line 177
    :goto_1
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich_time"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 179
    if-ne v0, v2, :cond_4

    .line 180
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c019b

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    .line 186
    :cond_0
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "remind_trash_swtich_size"

    invoke-static {v0, v1, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 187
    if-ne v0, v5, :cond_6

    .line 188
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c01e0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    .line 197
    :cond_1
    :goto_3
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_delpackage_swtich"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 198
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->C:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 202
    :goto_4
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_uninstallReminder_swtich"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 203
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->D:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 207
    :goto_5
    return-void

    .line 165
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    goto :goto_0

    .line 173
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    .line 175
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    goto :goto_1

    .line 181
    :cond_4
    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 182
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c019c

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    goto :goto_2

    .line 183
    :cond_5
    if-ne v0, v4, :cond_0

    .line 184
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c019d

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    goto :goto_2

    .line 189
    :cond_6
    const/16 v1, 0x64

    if-ne v0, v1, :cond_7

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c01e1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    goto :goto_3

    .line 191
    :cond_7
    const/16 v1, 0x12c

    if-ne v0, v1, :cond_8

    .line 192
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c01e2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    goto :goto_3

    .line 193
    :cond_8
    const/16 v1, 0x1f4

    if-ne v0, v1, :cond_1

    .line 194
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c01e3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    goto :goto_3

    .line 200
    :cond_9
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->C:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    goto :goto_4

    .line 205
    :cond_a
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->D:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    goto :goto_5
.end method

.method private p()V
    .locals 2

    .prologue
    .line 210
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->E:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$1;-><init>(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$2;-><init>(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 235
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->C:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$3;-><init>(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 242
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->D:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$4;-><init>(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 248
    return-void
.end method

.method private q()V
    .locals 7

    .prologue
    const/16 v6, 0x32

    .line 310
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->H:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    if-nez v0, :cond_0

    .line 311
    new-instance v0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    const v3, 0x7f03003e

    iget-object v4, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->F:[I

    move-object v1, p0

    move-object v2, p0

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;-><init>(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;Landroid/content/Context;I[ILandroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->H:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    .line 314
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "remind_trash_swtich_size"

    invoke-static {v0, v1, v6}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 315
    if-ne v0, v6, :cond_2

    .line 316
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->H:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    const v1, 0x7f0b00dd

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->a(I)V

    .line 325
    :cond_1
    :goto_0
    return-void

    .line 317
    :cond_2
    const/16 v1, 0x64

    if-ne v0, v1, :cond_3

    .line 318
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->H:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    const v1, 0x7f0b00de

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->a(I)V

    goto :goto_0

    .line 319
    :cond_3
    const/16 v1, 0x12c

    if-ne v0, v1, :cond_4

    .line 320
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->H:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    const v1, 0x7f0b00df

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->a(I)V

    goto :goto_0

    .line 321
    :cond_4
    const/16 v1, 0x1f4

    if-ne v0, v1, :cond_1

    .line 322
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->H:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    const v1, 0x7f0b00e0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->a(I)V

    goto :goto_0
.end method

.method private r()V
    .locals 1

    .prologue
    .line 328
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->H:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->H:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->b()V

    .line 331
    :cond_0
    return-void
.end method

.method private s()V
    .locals 7

    .prologue
    const/4 v6, 0x7

    .line 334
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->I:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    if-nez v0, :cond_0

    .line 335
    new-instance v0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    const v3, 0x7f03003d

    iget-object v4, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->G:[I

    move-object v1, p0

    move-object v2, p0

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;-><init>(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;Landroid/content/Context;I[ILandroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->I:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    .line 338
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich_time"

    invoke-static {v0, v1, v6}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 340
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 341
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->I:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    const v1, 0x7f0b00da

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->a(I)V

    .line 348
    :cond_1
    :goto_0
    return-void

    .line 342
    :cond_2
    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 343
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->I:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    const v1, 0x7f0b00db

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->a(I)V

    goto :goto_0

    .line 344
    :cond_3
    if-ne v0, v6, :cond_1

    .line 345
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->I:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    const v1, 0x7f0b00dc

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->a(I)V

    goto :goto_0
.end method

.method private t()V
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->I:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    if-eqz v0, :cond_0

    .line 352
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->I:Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$a;->b()V

    .line 354
    :cond_0
    return-void
.end method


# virtual methods
.method protected j()V
    .locals 2

    .prologue
    .line 139
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0191

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->b(Ljava/lang/String;)V

    .line 143
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 252
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 307
    :goto_0
    :pswitch_0
    return-void

    .line 256
    :pswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->s()V

    goto :goto_0

    .line 261
    :pswitch_2
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->q()V

    goto :goto_0

    .line 266
    :pswitch_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 269
    :pswitch_4
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c019b

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    .line 270
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->t()V

    .line 271
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich_time"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 275
    :pswitch_5
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c019c

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    .line 276
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->t()V

    .line 277
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich_time"

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 281
    :pswitch_6
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c019d

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    .line 282
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->t()V

    .line 283
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich_time"

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 287
    :pswitch_7
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c01e0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    .line 288
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->r()V

    .line 289
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "remind_trash_swtich_size"

    const/16 v2, 0x32

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    .line 292
    :pswitch_8
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c01e1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    .line 293
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->r()V

    .line 294
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "remind_trash_swtich_size"

    const/16 v2, 0x64

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 297
    :pswitch_9
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c01e2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    .line 298
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->r()V

    .line 299
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "remind_trash_swtich_size"

    const/16 v2, 0x12c

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 302
    :pswitch_a
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    const v1, 0x7f0c01e3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(I)V

    .line 303
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->r()V

    .line 304
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "remind_trash_swtich_size"

    const/16 v2, 0x1f4

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 252
    nop

    :pswitch_data_0
    .packed-switch 0x7f0b00d4
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 147
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 148
    const v0, 0x7f03003c

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->setContentView(I)V

    .line 149
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->o()V

    .line 150
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->p()V

    .line 151
    return-void
.end method
