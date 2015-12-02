.class public final Lcom/qihoo/security/v5/c;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;)I
    .locals 2

    .prologue
    .line 128
    const-string/jumbo v0, "i18n_security_lite"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/qihoo/antivirus/update/b;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;ILjava/lang/String;Ljava/util/HashMap;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 84
    if-eqz p3, :cond_0

    .line 85
    const-string/jumbo v0, "i18ncid"

    invoke-static {p0}, Lcom/qihoo/security/env/a;->a(Landroid/content/Context;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    const-string/jumbo v0, "product"

    const-string/jumbo v1, "i18n_security_lite"

    invoke-virtual {p3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    const-string/jumbo v0, "permission"

    const-string/jumbo v1, "com.qihoo.antivirus.update.permission.i18n_security_lite"

    invoke-virtual {p3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    const-string/jumbo v0, "i18ntype"

    invoke-virtual {p3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    .line 93
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0001

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    .line 97
    if-eqz v1, :cond_0

    .line 98
    const-string/jumbo v0, "i18ntype"

    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 99
    const-string/jumbo v2, "i18ntype"

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/qihoo/antivirus/update/b;->a(Landroid/content/Context;ILjava/lang/String;Ljava/util/HashMap;)I

    move-result v0

    return v0
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    const-string/jumbo v0, "1.0.8.3742"

    return-object v0
.end method

.method public static b(Landroid/content/Context;)I
    .locals 2

    .prologue
    .line 141
    const-string/jumbo v0, "i18n_security_lite"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/qihoo/antivirus/update/b;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method
