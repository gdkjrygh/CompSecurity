.class public Lcom/cleanmaster/ui/app/market/deeplink/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lcom/cleanmaster/ui/app/market/Ad;)Z
    .locals 3

    .prologue
    .line 17
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/Ad;->getDeepLink()Ljava/lang/String;

    move-result-object v1

    .line 20
    if-eqz p0, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    return v0

    .line 26
    :cond_1
    invoke-static {p0, v0, v1}, Lcom/cleanmaster/ui/app/market/deeplink/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 32
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-static {p0, p1}, Lcom/cleanmaster/common/a;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 42
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 35
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 36
    instance-of v1, p0, Landroid/app/Activity;

    if-nez v1, :cond_1

    .line 37
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 39
    :cond_1
    invoke-static {p0, v0}, Lcom/cleanmaster/common/a;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    goto :goto_0
.end method
