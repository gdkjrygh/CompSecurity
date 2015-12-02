.class public Lcom/qihoo/security/ui/antivirus/a;
.super Lcom/qihoo/security/dialog/b;
.source "360Security"


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/qihoo/security/widget/CheckBoxPreference;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;)V

    .line 25
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/a;->b:Landroid/content/Context;

    .line 26
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/a;->b:Landroid/content/Context;

    const v1, 0x7f030075

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 29
    const v0, 0x7f0b018b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CheckBoxPreference;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/a;->c:Lcom/qihoo/security/widget/CheckBoxPreference;

    .line 31
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "setting_auto_start"

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/a;->d:Z

    .line 34
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/a;->c:Lcom/qihoo/security/widget/CheckBoxPreference;

    iget-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/a;->d:Z

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 36
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/a;->c:Lcom/qihoo/security/widget/CheckBoxPreference;

    new-instance v2, Lcom/qihoo/security/ui/antivirus/a$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/antivirus/a$1;-><init>(Lcom/qihoo/security/ui/antivirus/a;)V

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 49
    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/antivirus/a;->a(Landroid/view/View;)Landroid/view/View;

    .line 50
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/a;)Z
    .locals 1

    .prologue
    .line 15
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/a;->d:Z

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/a;Z)Z
    .locals 0

    .prologue
    .line 15
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/a;->d:Z

    return p1
.end method
