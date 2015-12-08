.class public Lkik/android/widget/preferences/NamePreference;
.super Lkik/android/widget/preferences/KikEditTextPreference;
.source "SourceFile"


# instance fields
.field protected b:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field d:Landroid/text/TextWatcher;

.field private e:Landroid/widget/EditText;

.field private f:Landroid/widget/EditText;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 73
    const v0, 0x1010092

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/NamePreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 74
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 78
    sget-object v0, Lcom/kik/d/b/a$c;->i:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikEditTextPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 47
    new-instance v0, Lkik/android/widget/preferences/ar;

    invoke-direct {v0, p0}, Lkik/android/widget/preferences/ar;-><init>(Lkik/android/widget/preferences/NamePreference;)V

    iput-object v0, p0, Lkik/android/widget/preferences/NamePreference;->d:Landroid/text/TextWatcher;

    .line 79
    const v0, 0x7f03008b

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/NamePreference;->setDialogLayoutResource(I)V

    .line 80
    const v0, 0x7f030088

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/NamePreference;->setLayoutResource(I)V

    .line 81
    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/NamePreference;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->e:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic b(Lkik/android/widget/preferences/NamePreference;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->f:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic c(Lkik/android/widget/preferences/NamePreference;)V
    .locals 0

    .prologue
    .line 37
    invoke-virtual {p0}, Lkik/android/widget/preferences/NamePreference;->notifyChanged()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 86
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/NamePreference;)V

    .line 87
    return-void
.end method

.method protected onBindDialogView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 92
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikEditTextPreference;->onBindDialogView(Landroid/view/View;)V

    .line 94
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/widget/preferences/NamePreference;->h:Ljava/lang/String;

    .line 95
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/widget/preferences/NamePreference;->g:Ljava/lang/String;

    .line 96
    const v0, 0x7f0e01c3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/widget/preferences/NamePreference;->e:Landroid/widget/EditText;

    .line 97
    const v0, 0x7f0e01c4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/widget/preferences/NamePreference;->f:Landroid/widget/EditText;

    .line 98
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->e:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/widget/preferences/NamePreference;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 99
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->f:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/widget/preferences/NamePreference;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 100
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->e:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/widget/preferences/NamePreference;->d:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 102
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->e:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/widget/preferences/NamePreference;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 103
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 105
    invoke-virtual {p0}, Lkik/android/widget/preferences/NamePreference;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 106
    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 111
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikEditTextPreference;->onBindView(Landroid/view/View;)V

    .line 112
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/widget/preferences/NamePreference;->h:Ljava/lang/String;

    .line 113
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    iput-object v0, p0, Lkik/android/widget/preferences/NamePreference;->g:Ljava/lang/String;

    .line 114
    const v0, 0x7f0e01c1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 115
    if-eqz v0, :cond_0

    .line 116
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lkik/android/widget/preferences/NamePreference;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/preferences/NamePreference;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    :cond_0
    return-void
.end method

.method protected onDialogClosed(Z)V
    .locals 4

    .prologue
    .line 123
    invoke-virtual {p0}, Lkik/android/widget/preferences/NamePreference;->c()V

    .line 124
    invoke-virtual {p0}, Lkik/android/widget/preferences/NamePreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0901eb

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 125
    if-nez p1, :cond_1

    .line 145
    :cond_0
    :goto_0
    return-void

    .line 129
    :cond_1
    iget-object v1, p0, Lkik/android/widget/preferences/NamePreference;->e:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 130
    iget-object v2, p0, Lkik/android/widget/preferences/NamePreference;->f:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 132
    invoke-virtual {v1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 133
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->h:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->g:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->g:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 137
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 138
    const-string v3, "first_name"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    const-string v1, "last_name"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/NamePreference;->callChangeListener(Ljava/lang/Object;)Z

    goto :goto_0

    .line 143
    :cond_3
    invoke-virtual {p0}, Lkik/android/widget/preferences/NamePreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090164

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 150
    iget-object v0, p0, Lkik/android/widget/preferences/NamePreference;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 151
    iget-object v1, p0, Lkik/android/widget/preferences/NamePreference;->f:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 153
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    .line 154
    :cond_0
    invoke-virtual {p0}, Lkik/android/widget/preferences/NamePreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090164

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 208
    :goto_0
    return v3

    .line 158
    :cond_1
    invoke-virtual {p1, v3}, Landroid/preference/Preference;->setEnabled(Z)V

    .line 160
    iget-object v2, p0, Lkik/android/widget/preferences/NamePreference;->b:Lkik/a/e/w;

    invoke-interface {v2, v0, v1}, Lkik/a/e/w;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    .line 162
    invoke-virtual {p0}, Lkik/android/widget/preferences/NamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    new-instance v2, Lkik/android/widget/preferences/as;

    invoke-direct {v2, p0, p1}, Lkik/android/widget/preferences/as;-><init>(Lkik/android/widget/preferences/NamePreference;Landroid/preference/Preference;)V

    invoke-static {v1, v2}, Lcom/kik/sdkutils/d;->a(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 206
    invoke-virtual {p0}, Lkik/android/widget/preferences/NamePreference;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f090346

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lcom/kik/g/s;->a(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/widget/preferences/NamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lkik/android/widget/preferences/KikPreference;->a(Ljava/lang/String;Lcom/kik/g/p;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    goto :goto_0
.end method
