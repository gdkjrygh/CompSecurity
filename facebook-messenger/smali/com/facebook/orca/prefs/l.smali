.class public Lcom/facebook/orca/prefs/l;
.super Landroid/preference/DialogPreference;
.source "LocationServicesPreference.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Landroid/view/LayoutInflater;

.field private c:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 30
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    sget-object v0, Lcom/facebook/orca/prefs/n;->x:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/l;->setKey(Ljava/lang/String;)V

    .line 32
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 33
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/prefs/l;->a:Lcom/facebook/prefs/shared/d;

    .line 34
    const-class v0, Landroid/view/LayoutInflater;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/facebook/orca/prefs/l;->b:Landroid/view/LayoutInflater;

    .line 35
    invoke-direct {p0}, Lcom/facebook/orca/prefs/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/l;->setSummary(Ljava/lang/CharSequence;)V

    .line 36
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/l;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/facebook/orca/prefs/l;->c:Ljava/lang/Boolean;

    return-object p1
.end method

.method private a()Ljava/lang/String;
    .locals 3

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/prefs/l;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->x:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/l;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/facebook/o;->preference_location_services_enabled_summary:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 71
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/l;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/facebook/o;->preference_location_services_disabled_summary:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 53
    instance-of v1, p1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 54
    check-cast p1, Landroid/view/ViewGroup;

    .line 55
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 56
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/prefs/l;->a(Landroid/view/View;)V

    .line 55
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 58
    :cond_0
    instance-of v1, p1, Landroid/widget/TextView;

    if-eqz v1, :cond_1

    .line 59
    check-cast p1, Landroid/widget/TextView;

    .line 60
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 61
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 63
    :cond_1
    return-void
.end method


# virtual methods
.method protected onBindView(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 40
    invoke-super {p0, p1}, Landroid/preference/DialogPreference;->onBindView(Landroid/view/View;)V

    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/l;->a(Landroid/view/View;)V

    .line 42
    return-void
.end method

.method protected onDialogClosed(Z)V
    .locals 3

    .prologue
    .line 112
    invoke-super {p0, p1}, Landroid/preference/DialogPreference;->onDialogClosed(Z)V

    .line 114
    if-eqz p1, :cond_0

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/prefs/l;->c:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/prefs/l;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 117
    sget-object v1, Lcom/facebook/orca/prefs/n;->x:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/prefs/l;->c:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 118
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 119
    invoke-direct {p0}, Lcom/facebook/orca/prefs/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/l;->setSummary(Ljava/lang/CharSequence;)V

    .line 120
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/l;->notifyChanged()V

    .line 123
    :cond_0
    return-void
.end method

.method protected onPrepareDialogBuilder(Landroid/app/AlertDialog$Builder;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    .line 77
    invoke-virtual {p1, v2}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;

    .line 78
    iget-object v0, p0, Lcom/facebook/orca/prefs/l;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->x:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    .line 80
    sget v0, Lcom/facebook/o;->preference_location_services_dialog_title:I

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 82
    iget-object v0, p0, Lcom/facebook/orca/prefs/l;->b:Landroid/view/LayoutInflater;

    sget v2, Lcom/facebook/k;->orca_location_services_dialog_content:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 83
    sget v0, Lcom/facebook/i;->location_services_text:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/orca/prefs/l;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/facebook/o;->preference_location_services_dialog_description1:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\n\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/facebook/orca/prefs/l;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/facebook/o;->preference_location_services_dialog_description2:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 88
    new-instance v4, Landroid/text/style/ImageSpan;

    invoke-virtual {p0}, Lcom/facebook/orca/prefs/l;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/facebook/h;->orca_composer_location_on_normal_cropped:I

    invoke-direct {v4, v5, v6}, Landroid/text/style/ImageSpan;-><init>(Landroid/content/Context;I)V

    .line 91
    new-instance v5, Landroid/text/SpannableString;

    invoke-direct {v5, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 92
    const-string v6, "[[location_icon]]"

    .line 93
    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 94
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v3

    .line 95
    const/4 v7, 0x0

    invoke-virtual {v5, v4, v3, v6, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 97
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    sget v0, Lcom/facebook/i;->location_services_enable_checkbox:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 100
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 101
    new-instance v1, Lcom/facebook/orca/prefs/m;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/m;-><init>(Lcom/facebook/orca/prefs/l;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 107
    invoke-virtual {p1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 108
    return-void
.end method
