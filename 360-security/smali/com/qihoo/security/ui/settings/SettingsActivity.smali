.class public Lcom/qihoo/security/ui/settings/SettingsActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/settings/SettingsActivity$5;
    }
.end annotation


# instance fields
.field private A:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private B:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private C:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private D:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private E:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private F:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private G:Z

.field private H:Z

.field private I:Z

.field private J:Z

.field private K:Z

.field private L:Z

.field private M:Z

.field private N:Lcom/qihoo/security/floatview/a/b;

.field private O:Z

.field private P:Landroid/widget/TextView;

.field private final Q:Landroid/os/Handler;

.field private R:Lcom/qihoo/security/service/a;

.field private final S:Landroid/content/ServiceConnection;

.field private final T:Landroid/content/ServiceConnection;

.field private final U:Landroid/content/BroadcastReceiver;

.field y:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private z:Lcom/qihoo/security/widget/CheckBoxPreference;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->O:Z

    .line 98
    new-instance v0, Lcom/qihoo/security/ui/settings/SettingsActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$1;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->Q:Landroid/os/Handler;

    .line 669
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->R:Lcom/qihoo/security/service/a;

    .line 670
    new-instance v0, Lcom/qihoo/security/ui/settings/SettingsActivity$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$2;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->S:Landroid/content/ServiceConnection;

    .line 686
    new-instance v0, Lcom/qihoo/security/ui/settings/SettingsActivity$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$3;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->T:Landroid/content/ServiceConnection;

    .line 717
    new-instance v0, Lcom/qihoo/security/ui/settings/SettingsActivity$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$4;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->U:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/settings/SettingsActivity;Lcom/qihoo/security/floatview/a/b;)Lcom/qihoo/security/floatview/a/b;
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->N:Lcom/qihoo/security/floatview/a/b;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/settings/SettingsActivity;Lcom/qihoo/security/service/a;)Lcom/qihoo/security/service/a;
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->R:Lcom/qihoo/security/service/a;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/settings/SettingsActivity;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->u()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->G:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->G:Z

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->H:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/ui/settings/SettingsActivity;)Lcom/qihoo/security/floatview/a/b;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->N:Lcom/qihoo/security/floatview/a/b;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->I:Z

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->H:Z

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->J:Z

    return p1
.end method

.method static synthetic e(Lcom/qihoo/security/ui/settings/SettingsActivity;)Lcom/qihoo/security/service/a;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->R:Lcom/qihoo/security/service/a;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->K:Z

    return p1
.end method

.method static synthetic f(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->I:Z

    return v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->L:Z

    return p1
.end method

.method static synthetic g(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->J:Z

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->M:Z

    return p1
.end method

.method static synthetic h(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->K:Z

    return v0
.end method

.method static synthetic i(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->L:Z

    return v0
.end method

.method static synthetic j(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->M:Z

    return v0
.end method

.method static synthetic k(Lcom/qihoo/security/ui/settings/SettingsActivity;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->p()V

    return-void
.end method

.method private o()V
    .locals 5

    .prologue
    const v4, 0x7f0b01d2

    .line 138
    const v0, 0x7f0b01cc

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 141
    const v0, 0x7f0b01cd

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 143
    const v0, 0x7f0b01ce

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    const v0, 0x7f0b01d5

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    const v0, 0x7f0b00d3

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 153
    const v0, 0x7f0b00d7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->C:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 155
    const v0, 0x7f0b00d8

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    const v0, 0x7f0b01cf

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 159
    const v0, 0x7f0b01d1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    invoke-virtual {p0, v4}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 179
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 180
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01b5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 182
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(Ljava/lang/String;)V

    .line 185
    const v0, 0x7f0b01d3

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 186
    invoke-virtual {v0, p0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    const v1, 0x7f0b01b7

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->P:Landroid/widget/TextView;

    .line 188
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->p()V

    .line 191
    invoke-virtual {p0, v4}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 193
    const v0, 0x7f0b018b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->D:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 195
    const v0, 0x7f0b01d0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->E:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 197
    const v0, 0x7f0b01d4

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->F:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 199
    const v0, 0x7f0b01d6

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    return-void
.end method

.method private p()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 203
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->P:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 214
    :goto_0
    return-void

    .line 206
    :cond_0
    invoke-static {p0}, Lcom/qihoo/security/v5/a;->b(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->O:Z

    .line 207
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->O:Z

    if-eqz v0, :cond_1

    .line 208
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020097

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 209
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {v0, v4, v4, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(IIII)V

    .line 210
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v3, v0, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 212
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private q()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 217
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "fv_enabled"

    invoke-static {}, Lcom/qihoo/security/floatview/a/a;->e()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->G:Z

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "notification"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->H:Z

    .line 220
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "remind_trash_swtich"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->I:Z

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "remind_uninstallReminder_swtich"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->J:Z

    .line 224
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "setting_auto_start"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->K:Z

    .line 225
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "setting_app_security_alert"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->L:Z

    .line 226
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "user_ex"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->M:Z

    .line 228
    return-void
.end method

.method private r()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 232
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsActivity$7;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$7;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 262
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->setVisibility(I)V

    .line 264
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/CheckBoxPreference;->setVisibility(I)V

    .line 270
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsActivity$8;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$8;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 297
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsActivity$9;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$9;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 312
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->C:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsActivity$10;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$10;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 360
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->D:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsActivity$11;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$11;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 382
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->E:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsActivity$12;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$12;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 403
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->F:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsActivity$13;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$13;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 416
    return-void

    .line 266
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setVisibility(I)V

    .line 267
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setVisibility(I)V

    goto :goto_0
.end method

.method private s()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 419
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    const-string/jumbo v2, "com.qihoo.security.service.INTERNAL_CONTROL"

    iget-object v3, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->S:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 421
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    const-string/jumbo v2, "com.qihoo.security.floatview.SERVICER"

    iget-object v3, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->T:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 423
    return-void
.end method

.method private t()V
    .locals 3

    .prologue
    .line 426
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    .line 427
    new-instance v1, Landroid/content/IntentFilter;

    const-string/jumbo v2, "com.qihoo.security.FINISH_MAIN_SCREEN"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 428
    const-string/jumbo v2, "com.qihoo.security.REBOOT_MAIN_SCREEN"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 429
    const-string/jumbo v2, "com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 430
    const-string/jumbo v2, "com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 431
    iget-object v2, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->U:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 432
    return-void
.end method

.method private u()V
    .locals 1

    .prologue
    .line 436
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->C:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->a()V

    .line 437
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->a()V

    .line 438
    return-void
.end method

.method private v()V
    .locals 4

    .prologue
    .line 448
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->z:Lcom/qihoo/security/widget/CheckBoxPreference;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->G:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 449
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->A:Lcom/qihoo/security/widget/CheckBoxPreference;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->H:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 450
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->B:Lcom/qihoo/security/widget/CheckBoxPreference;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->I:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 451
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->C:Lcom/qihoo/security/widget/CheckBoxPreference;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->J:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 454
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->D:Lcom/qihoo/security/widget/CheckBoxPreference;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->K:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 455
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->E:Lcom/qihoo/security/widget/CheckBoxPreference;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->L:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 456
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->F:Lcom/qihoo/security/widget/CheckBoxPreference;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->M:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 461
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->Q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->Q:Landroid/os/Handler;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 463
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01b5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 465
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->y:Lcom/qihoo/security/widget/CheckBoxPreference;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/CheckBoxPreference;->setSummary(Ljava/lang/String;)V

    .line 466
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 504
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/BaseActivity;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 505
    sget-object v0, Lcom/qihoo/security/ui/settings/SettingsActivity$5;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ordinal()I

    move-result v1

    aget v0, v0, v1

    .line 514
    return-void
.end method

.method public finish()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 661
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 662
    if-eqz v0, :cond_0

    const-string/jumbo v1, "from"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 664
    const-class v0, Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 666
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->finish()V

    .line 667
    return-void
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 741
    const-string/jumbo v0, "set"

    return-object v0
.end method

.method protected j()V
    .locals 2

    .prologue
    .line 470
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 471
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 472
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0160

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->b(Ljava/lang/String;)V

    .line 474
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 737
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    .line 738
    const v0, 0x7f040007

    const v1, 0x7f040009

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/settings/SettingsActivity;->overridePendingTransition(II)V

    .line 739
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 518
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 618
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 520
    :sswitch_1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    .line 521
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x13d

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 522
    const/16 v0, 0x4a3b

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0

    .line 571
    :sswitch_2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 575
    :sswitch_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 578
    :sswitch_4
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 596
    :sswitch_5
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/settings/AboutUsActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    .line 597
    const/16 v0, 0x4a42

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0

    .line 600
    :sswitch_6
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 601
    sget-object v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->SettingOther:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    invoke-static {p0, v0}, Lcom/qihoo/security/v5/UpdateHelper;->a(Landroid/content/Context;Lcom/qihoo/security/v5/UpdateHelper$UpdateType;)V

    goto :goto_0

    .line 605
    :sswitch_7
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 606
    sget-object v0, Lcom/qihoo/security/v5/UpdateHelper$UpdateType;->SettingAPP:Lcom/qihoo/security/v5/UpdateHelper$UpdateType;

    invoke-static {p0, v0}, Lcom/qihoo/security/v5/UpdateHelper;->a(Landroid/content/Context;Lcom/qihoo/security/v5/UpdateHelper$UpdateType;)V

    .line 608
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->O:Z

    if-eqz v0, :cond_0

    .line 609
    invoke-static {p0}, Lcom/qihoo/security/v5/a;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 613
    :sswitch_8
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 518
    :sswitch_data_0
    .sparse-switch
        0x7f0b00d3 -> :sswitch_0
        0x7f0b00d7 -> :sswitch_0
        0x7f0b00d8 -> :sswitch_2
        0x7f0b01ce -> :sswitch_1
        0x7f0b01cf -> :sswitch_3
        0x7f0b01d1 -> :sswitch_4
        0x7f0b01d2 -> :sswitch_6
        0x7f0b01d3 -> :sswitch_7
        0x7f0b01d5 -> :sswitch_8
        0x7f0b01d6 -> :sswitch_5
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 107
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 108
    const v0, 0x7f03008e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->setContentView(I)V

    .line 110
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->o()V

    .line 112
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->q()V

    .line 114
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/r;->a()V

    .line 116
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->r()V

    .line 118
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->s()V

    .line 120
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->t()V

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->Q:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/ui/settings/SettingsActivity$6;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/settings/SettingsActivity$6;-><init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 134
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    .line 647
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 652
    const-string/jumbo v0, "SettingsActivity"

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->T:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->unbindService(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 653
    const-string/jumbo v0, "SettingsActivity"

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->S:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->unbindService(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 655
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    .line 656
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity;->U:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;)V

    .line 657
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 442
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 444
    const v0, 0x7f0b01cb

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    invoke-virtual {v0, v1, v1}, Landroid/widget/ScrollView;->scrollTo(II)V

    .line 445
    return-void
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 639
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onPause()V

    .line 643
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 487
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 491
    invoke-direct {p0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->v()V

    .line 492
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 478
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStart()V

    .line 479
    sget-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;->UI_ENTER_SETTING:Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;

    invoke-static {v0}, Lcom/qihoo/security/quc/AccountLog;->a(Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;)V

    .line 483
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 496
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStop()V

    .line 500
    return-void
.end method
