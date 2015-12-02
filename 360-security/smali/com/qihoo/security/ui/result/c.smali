.class public Lcom/qihoo/security/ui/result/c;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 24
    const/4 v0, 0x0

    .line 25
    const-string/jumbo v1, "com.android.browser"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 26
    const-string/jumbo v0, "com.android.browser"

    .line 54
    :cond_0
    :goto_0
    return-object v0

    .line 27
    :cond_1
    const-string/jumbo v1, "com.google.android.browser"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 28
    const-string/jumbo v0, "com.google.android.browser"

    goto :goto_0

    .line 29
    :cond_2
    const-string/jumbo v1, "com.android.chrome"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 30
    const-string/jumbo v0, "com.android.chrome"

    goto :goto_0

    .line 31
    :cond_3
    const-string/jumbo v1, "com.opera.browser"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 32
    const-string/jumbo v0, "com.opera.browser"

    goto :goto_0

    .line 33
    :cond_4
    const-string/jumbo v1, "com.UCMobile.intl"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 34
    const-string/jumbo v0, "com.UCMobile.intl"

    goto :goto_0

    .line 35
    :cond_5
    const-string/jumbo v1, "com.baidu.browser.inter"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 36
    const-string/jumbo v0, "com.baidu.browser.inter"

    goto :goto_0

    .line 37
    :cond_6
    const-string/jumbo v1, "com.jiubang.browser"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 38
    const-string/jumbo v0, "com.jiubang.browser"

    goto :goto_0

    .line 39
    :cond_7
    const-string/jumbo v1, "com.ksmobile.cb"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 40
    const-string/jumbo v0, "com.ksmobile.cb"

    goto :goto_0

    .line 41
    :cond_8
    const-string/jumbo v1, "com.opera.mini.android"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 42
    const-string/jumbo v0, "com.opera.mini.android"

    goto :goto_0

    .line 43
    :cond_9
    const-string/jumbo v1, "com.mx.browser"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 44
    const-string/jumbo v0, "com.mx.browser"

    goto :goto_0

    .line 45
    :cond_a
    const-string/jumbo v1, "com.uc.browser.en"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 46
    const-string/jumbo v0, "com.uc.browser.en"

    goto/16 :goto_0

    .line 47
    :cond_b
    const-string/jumbo v1, "com.yandex.browser"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 48
    const-string/jumbo v0, "com.yandex.browser"

    goto/16 :goto_0

    .line 49
    :cond_c
    const-string/jumbo v1, "mobi.mgeek.TunnyBrowser"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 50
    const-string/jumbo v0, "mobi.mgeek.TunnyBrowser"

    goto/16 :goto_0

    .line 51
    :cond_d
    const-string/jumbo v1, "org.mozilla.irefox"

    invoke-static {p0, v1}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 52
    const-string/jumbo v0, "org.mozilla.irefox"

    goto/16 :goto_0
.end method
