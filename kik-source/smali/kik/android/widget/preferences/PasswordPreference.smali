.class public Lkik/android/widget/preferences/PasswordPreference;
.super Lkik/android/widget/preferences/KikEditTextPreference;
.source "SourceFile"


# instance fields
.field protected b:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private d:Landroid/widget/EditText;

.field private e:Landroid/widget/EditText;

.field private f:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 44
    const v0, 0x1010092

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/PasswordPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 49
    sget-object v0, Lcom/kik/d/b/a$c;->k:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikEditTextPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 51
    const v0, 0x7f03008c

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/PasswordPreference;->setDialogLayoutResource(I)V

    .line 52
    const v0, 0x7f030088

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/PasswordPreference;->setLayoutResource(I)V

    .line 53
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 58
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/PasswordPreference;)V

    .line 59
    return-void
.end method

.method protected onBindDialogView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 64
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikEditTextPreference;->onBindDialogView(Landroid/view/View;)V

    .line 66
    const v0, 0x7f0e01c5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/widget/preferences/PasswordPreference;->d:Landroid/widget/EditText;

    .line 67
    const v0, 0x7f0e01c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/widget/preferences/PasswordPreference;->e:Landroid/widget/EditText;

    .line 68
    const v0, 0x7f0e01c7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/widget/preferences/PasswordPreference;->f:Landroid/widget/EditText;

    .line 70
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 71
    return-void
.end method

.method protected onDialogClosed(Z)V
    .locals 9

    .prologue
    const v8, 0x7f0901a7

    const/4 v7, 0x1

    .line 82
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->c()V

    .line 83
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0901ec

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 84
    if-nez p1, :cond_0

    .line 128
    :goto_0
    return-void

    .line 88
    :cond_0
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v2, p0, Lkik/android/widget/preferences/PasswordPreference;->d:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 90
    iget-object v0, p0, Lkik/android/widget/preferences/PasswordPreference;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 91
    iget-object v0, p0, Lkik/android/widget/preferences/PasswordPreference;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 92
    iget-object v0, p0, Lkik/android/widget/preferences/PasswordPreference;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 93
    const/4 v0, 0x0

    .line 95
    :try_start_0
    const-string v5, "SHA-1"

    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5

    .line 100
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v5

    invoke-static {v5}, Lkik/android/util/cq;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 105
    :goto_1
    iget-object v5, p0, Lkik/android/widget/preferences/PasswordPreference;->c:Lkik/a/e/v;

    invoke-static {v5}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v5

    .line 107
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    .line 109
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0901ba

    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {v5}, Lkik/a/z;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 113
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0901a5

    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 115
    :cond_2
    invoke-virtual {v3, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 116
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v8, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 118
    :cond_3
    invoke-virtual {v4, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 119
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v8, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 121
    :cond_4
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 123
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0901a8

    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 126
    :cond_5
    invoke-virtual {p0, v3}, Lkik/android/widget/preferences/PasswordPreference;->callChangeListener(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :catch_0
    move-exception v5

    goto :goto_1
.end method

.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 138
    iget-object v0, p0, Lkik/android/widget/preferences/PasswordPreference;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 140
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    const v2, 0x7f0901ec

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 141
    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/widget/preferences/PasswordPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    const v2, 0x7f0901a7

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 182
    :goto_0
    return v3

    .line 145
    :cond_0
    invoke-virtual {p1, v3}, Landroid/preference/Preference;->setEnabled(Z)V

    .line 147
    new-instance v1, Lkik/android/widget/preferences/bd;

    invoke-direct {v1, p0, v0, p1}, Lkik/android/widget/preferences/bd;-><init>(Lkik/android/widget/preferences/PasswordPreference;Ljava/lang/String;Landroid/preference/Preference;)V

    .line 180
    new-array v0, v3, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lkik/android/util/bf;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method
