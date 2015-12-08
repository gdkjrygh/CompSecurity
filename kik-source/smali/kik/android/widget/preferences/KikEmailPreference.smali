.class public Lkik/android/widget/preferences/KikEmailPreference;
.super Lkik/android/widget/preferences/KikEditTextPreference;
.source "SourceFile"


# instance fields
.field protected b:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private d:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 43
    const v0, 0x1010092

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikEmailPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/kik/d/b/a$c;->j:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikEditTextPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 50
    const v0, 0x7f03008a

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikEmailPreference;->setDialogLayoutResource(I)V

    .line 52
    const v0, 0x7f09029a

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikEmailPreference;->setDialogTitle(I)V

    .line 54
    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/KikEmailPreference;)V
    .locals 0

    .prologue
    .line 33
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEmailPreference;->notifyChanged()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 59
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/KikEmailPreference;)V

    .line 60
    return-void
.end method

.method protected onBindDialogView(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 65
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikEditTextPreference;->onBindDialogView(Landroid/view/View;)V

    .line 67
    iget-object v0, p0, Lkik/android/widget/preferences/KikEmailPreference;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    .line 69
    const v0, 0x7f0e01c2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/widget/preferences/KikEmailPreference;->d:Landroid/widget/EditText;

    .line 71
    iget-object v0, p0, Lkik/android/widget/preferences/KikEmailPreference;->d:Landroid/widget/EditText;

    iget-object v2, v1, Lkik/a/d/aa;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object v0, p0, Lkik/android/widget/preferences/KikEmailPreference;->d:Landroid/widget/EditText;

    iget-object v1, v1, Lkik/a/d/aa;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 75
    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 92
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikEditTextPreference;->onBindView(Landroid/view/View;)V

    .line 95
    iget-object v0, p0, Lkik/android/widget/preferences/KikEmailPreference;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    .line 97
    iget-object v0, v2, Lkik/a/d/aa;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikEmailPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 101
    const v0, 0x1020010

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 105
    const v1, 0x7f0e01c1

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 107
    if-eqz v1, :cond_0

    .line 108
    iget-object v3, v2, Lkik/a/d/aa;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    :cond_0
    if-eqz v0, :cond_1

    .line 112
    iget-object v1, v2, Lkik/a/d/aa;->b:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 113
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x7f09000c

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    :goto_0
    const v1, 0x7f070086

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 121
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 122
    new-instance v1, Lkik/android/widget/preferences/m;

    invoke-direct {v1, p0, v2, p1, p0}, Lkik/android/widget/preferences/m;-><init>(Lkik/android/widget/preferences/KikEmailPreference;Lkik/a/d/aa;Landroid/view/View;Landroid/preference/Preference;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    :cond_1
    return-void

    .line 116
    :cond_2
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x7f09000d

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method protected onDialogClosed(Z)V
    .locals 1

    .prologue
    .line 80
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEmailPreference;->c()V

    .line 81
    if-nez p1, :cond_0

    .line 87
    :goto_0
    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lkik/android/widget/preferences/KikEmailPreference;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 86
    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikEmailPreference;->callChangeListener(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 171
    iget-object v0, p0, Lkik/android/widget/preferences/KikEmailPreference;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v0, p1

    .line 173
    check-cast v0, Lkik/android/widget/preferences/KikEmailPreference;

    .line 175
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    const v3, 0x7f0901e9

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 176
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0900d2

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 225
    :goto_0
    return v5

    .line 180
    :cond_0
    invoke-virtual {p1, v5}, Landroid/preference/Preference;->setEnabled(Z)V

    .line 182
    iget-object v2, p0, Lkik/android/widget/preferences/KikEmailPreference;->b:Lkik/a/e/w;

    invoke-interface {v2, v1}, Lkik/a/e/w;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v2

    .line 184
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v3

    new-instance v4, Lkik/android/widget/preferences/q;

    invoke-direct {v4, p0, v0, v1}, Lkik/android/widget/preferences/q;-><init>(Lkik/android/widget/preferences/KikEmailPreference;Lkik/android/widget/preferences/KikEmailPreference;Ljava/lang/String;)V

    invoke-static {v3, v4}, Lcom/kik/sdkutils/d;->a(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 223
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090346

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2}, Lcom/kik/g/s;->a(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v1

    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEmailPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lkik/android/widget/preferences/KikPreference;->a(Ljava/lang/String;Lcom/kik/g/p;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    goto :goto_0
.end method
