.class public Lcom/facebook/http/f/a;
.super Landroid/preference/CheckBoxPreference;
.source "CheckSslCertsPreference.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 19
    sget-object v0, Lcom/facebook/http/f/c;->f:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/http/f/a;->setKey(Ljava/lang/String;)V

    .line 20
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/http/f/a;->setDefaultValue(Ljava/lang/Object;)V

    .line 21
    sget v0, Lcom/facebook/o;->debug_ssl_cert_check_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/http/f/a;->setTitle(I)V

    .line 22
    sget v0, Lcom/facebook/o;->debug_ssl_cert_check_summary:I

    invoke-virtual {p0, v0}, Lcom/facebook/http/f/a;->setSummary(I)V

    .line 23
    return-void
.end method
