.class Lcom/qihoo/b/a/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/qihoo/b/a/c;

.field private c:Lcom/qihoo/b/a/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/qihoo/b/a/b;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    .line 37
    iput-object p1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    .line 38
    iput-object p3, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    .line 39
    new-instance v0, Lcom/qihoo/b/a/c;

    invoke-direct {v0, p2}, Lcom/qihoo/b/a/c;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Lcom/qihoo/b/a/a;->b:Lcom/qihoo/b/a/c;

    .line 40
    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 3

    .prologue
    .line 43
    const/4 v0, 0x0

    .line 44
    iget-object v1, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    invoke-interface {v1}, Lcom/qihoo/b/a/b;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 45
    iget-object v0, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    invoke-interface {v0}, Lcom/qihoo/b/a/b;->a()Ljava/lang/String;

    move-result-object v0

    .line 77
    :cond_0
    :goto_0
    return-object v0

    .line 46
    :cond_1
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.android.browser"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 47
    const-string/jumbo v0, "com.android.browser/.BrowserActivity"

    goto :goto_0

    .line 48
    :cond_2
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.google.android.browser"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 49
    const-string/jumbo v0, "com.google.android.browser/com.android.browser.BrowserActivity"

    goto :goto_0

    .line 50
    :cond_3
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.android.chrome"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 51
    const-string/jumbo v0, "com.android.chrome/com.google.android.apps.chrome.Main"

    goto :goto_0

    .line 52
    :cond_4
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.opera.browser"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 53
    const-string/jumbo v0, "com.opera.browser/com.opera.Opera"

    goto :goto_0

    .line 54
    :cond_5
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.UCMobile.intl"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 55
    const-string/jumbo v0, "com.UCMobile.intl/com.UCMobile.main.UCMobile"

    goto :goto_0

    .line 56
    :cond_6
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.baidu.browser.inter"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 57
    const-string/jumbo v0, "com.baidu.browser.inter/com.baidu.browser.inter.BrowserActivity"

    goto :goto_0

    .line 58
    :cond_7
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.jiubang.browser"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 59
    const-string/jumbo v0, "com.jiubang.browser/.main.BrowserActivity"

    goto :goto_0

    .line 60
    :cond_8
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.ksmobile.cb"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 61
    const-string/jumbo v0, "com.ksmobile.cb/com.ijinshan.browser.screen.BrowserActivity"

    goto :goto_0

    .line 62
    :cond_9
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.opera.mini.android"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 63
    const-string/jumbo v0, "com.opera.mini.android/com.opera.mini.android.Browser"

    goto/16 :goto_0

    .line 64
    :cond_a
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.mx.browser"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 65
    const-string/jumbo v0, "com.mx.browser/.MxBrowserActivity"

    goto/16 :goto_0

    .line 66
    :cond_b
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.uc.browser.en"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 67
    const-string/jumbo v0, "com.uc.browser.en/com.uc.browser.ActivityBrowser"

    goto/16 :goto_0

    .line 68
    :cond_c
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "com.yandex.browser"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 69
    const-string/jumbo v0, "com.yandex.browser/com.yandex.browser.YandexBrowserActivity"

    goto/16 :goto_0

    .line 70
    :cond_d
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "mobi.mgeek.TunnyBrowser"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 71
    const-string/jumbo v0, "mobi.mgeek.TunnyBrowser/mobi.mgeek.TunnyBrowser.BrowserActivity"

    goto/16 :goto_0

    .line 72
    :cond_e
    iget-object v1, p0, Lcom/qihoo/b/a/a;->a:Landroid/content/Context;

    const-string/jumbo v2, "org.mozilla.firefox"

    invoke-static {v1, v2}, Lcom/qihoo/b/a/e;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 73
    const-string/jumbo v0, "org.mozilla.firefox/.App"

    goto/16 :goto_0

    .line 74
    :cond_f
    iget-object v1, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    invoke-interface {v1}, Lcom/qihoo/b/a/b;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 75
    iget-object v0, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    invoke-interface {v0}, Lcom/qihoo/b/a/b;->b()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 6

    .prologue
    .line 81
    invoke-direct {p0}, Lcom/qihoo/b/a/a;->b()Ljava/lang/String;

    move-result-object v2

    .line 83
    iget-object v0, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    invoke-interface {v0}, Lcom/qihoo/b/a/b;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/qihoo/b/a/a;->c:Lcom/qihoo/b/a/b;

    invoke-interface {v0}, Lcom/qihoo/b/a/b;->c()Ljava/lang/String;

    move-result-object v0

    .line 88
    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v1, v3, :cond_1

    const-string/jumbo v1, " --user 0 "

    .line 89
    :goto_1
    if-nez v0, :cond_2

    .line 90
    const/4 v0, 0x0

    .line 92
    :goto_2
    return-object v0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/qihoo/b/a/a;->b:Lcom/qihoo/b/a/c;

    invoke-virtual {v0}, Lcom/qihoo/b/a/c;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 88
    :cond_1
    const-string/jumbo v1, ""

    goto :goto_1

    .line 92
    :cond_2
    const-string/jumbo v3, " am start -n %s -a android.intent.action.VIEW -d %s %s "

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v0, v4, v2

    const/4 v0, 0x2

    aput-object v1, v4, v0

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2
.end method
