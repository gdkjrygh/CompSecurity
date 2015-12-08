.class final Lkik/android/widget/preferences/ar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/NamePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/NamePreference;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lkik/android/widget/preferences/ar;->a:Lkik/android/widget/preferences/NamePreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .prologue
    .line 51
    iget-object v0, p0, Lkik/android/widget/preferences/ar;->a:Lkik/android/widget/preferences/NamePreference;

    invoke-static {v0}, Lkik/android/widget/preferences/NamePreference;->a(Lkik/android/widget/preferences/NamePreference;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lkik/android/widget/preferences/ar;->a:Lkik/android/widget/preferences/NamePreference;

    invoke-static {v0}, Lkik/android/widget/preferences/NamePreference;->a(Lkik/android/widget/preferences/NamePreference;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/ar;->a:Lkik/android/widget/preferences/NamePreference;

    invoke-static {v1}, Lkik/android/widget/preferences/NamePreference;->a(Lkik/android/widget/preferences/NamePreference;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, " "

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object v0, p0, Lkik/android/widget/preferences/ar;->a:Lkik/android/widget/preferences/NamePreference;

    invoke-static {v0}, Lkik/android/widget/preferences/NamePreference;->b(Lkik/android/widget/preferences/NamePreference;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 56
    :cond_0
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 62
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 68
    return-void
.end method
