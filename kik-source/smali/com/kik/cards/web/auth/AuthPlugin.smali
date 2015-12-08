.class public Lcom/kik/cards/web/auth/AuthPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# instance fields
.field private a:Lcom/kik/cards/web/userdata/e;

.field private final b:Lkik/a/e/d;

.field private d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

.field private e:Lkik/android/b/s;


# direct methods
.method public constructor <init>(Lcom/kik/cards/web/userdata/a;Lkik/android/b/s;Lkik/a/e/d;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V
    .locals 1

    .prologue
    .line 54
    const-string v0, "Auth"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->a:Lcom/kik/cards/web/userdata/e;

    .line 56
    iput-object p2, p0, Lcom/kik/cards/web/auth/AuthPlugin;->e:Lkik/android/b/s;

    .line 57
    invoke-interface {p1}, Lcom/kik/cards/web/userdata/a;->a()Lcom/kik/cards/web/userdata/e;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->a:Lcom/kik/cards/web/userdata/e;

    .line 58
    iput-object p3, p0, Lcom/kik/cards/web/auth/AuthPlugin;->b:Lkik/a/e/d;

    .line 59
    iput-object p4, p0, Lcom/kik/cards/web/auth/AuthPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    .line 61
    new-instance v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {v0}, Lorg/spongycastle/jce/provider/BouncyCastleProvider;-><init>()V

    invoke-static {v0}, Ljava/security/Security;->addProvider(Ljava/security/Provider;)I

    .line 62
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/auth/AuthPlugin;)Lkik/android/b/s;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->e:Lkik/android/b/s;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/cards/web/auth/AuthPlugin;)Lcom/kik/cards/web/browser/BrowserPlugin$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cards/web/auth/AuthPlugin;)Lkik/a/e/d;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->b:Lkik/a/e/d;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/cards/web/auth/AuthPlugin;)Lorg/c/b;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->c:Lorg/c/b;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/cards/web/auth/AuthPlugin;)Lorg/c/b;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->c:Lorg/c/b;

    return-object v0
.end method


# virtual methods
.method protected final b(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->e:Lkik/android/b/s;

    invoke-virtual {v0, p1}, Lkik/android/b/s;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/auth/f;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/web/auth/f;-><init>(Lcom/kik/cards/web/auth/AuthPlugin;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/auth/e;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/auth/e;-><init>(Lcom/kik/cards/web/auth/AuthPlugin;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public getAnonymousId(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 131
    new-instance v0, Lcom/kik/cards/web/auth/g;

    invoke-direct {v0, p0, p3, p1}, Lcom/kik/cards/web/auth/g;-><init>(Lcom/kik/cards/web/auth/AuthPlugin;Ljava/lang/String;Lcom/kik/cards/web/plugin/a;)V

    .line 163
    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 165
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 167
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    return-object v0
.end method

.method public signAnonymousRequest(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 173
    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->e:Lkik/android/b/s;

    if-eqz v0, :cond_0

    invoke-static {p3}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->h()Z

    move-result v0

    if-nez v0, :cond_1

    .line 174
    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1aa

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 249
    :goto_0
    return-object v0

    .line 177
    :cond_1
    const-string v0, "request"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 179
    if-nez v0, :cond_2

    .line 180
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 183
    :cond_2
    new-instance v1, Lcom/kik/cards/web/auth/i;

    invoke-direct {v1, p0, p3, p1, v0}, Lcom/kik/cards/web/auth/i;-><init>(Lcom/kik/cards/web/auth/AuthPlugin;Ljava/lang/String;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;)V

    .line 245
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 247
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 249
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public signRequest(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 255
    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 333
    :goto_0
    return-object v0

    .line 259
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->e:Lkik/android/b/s;

    if-eqz v0, :cond_1

    invoke-static {p3}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/kik/cards/web/auth/AuthPlugin;->d:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->h()Z

    move-result v0

    if-nez v0, :cond_2

    .line 260
    :cond_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1aa

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 263
    :cond_2
    const-string v0, "request"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 264
    if-nez v0, :cond_3

    .line 265
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 268
    :cond_3
    const-string v1, "skipPrompt"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 270
    iget-object v2, p0, Lcom/kik/cards/web/auth/AuthPlugin;->a:Lcom/kik/cards/web/userdata/e;

    invoke-interface {v2, v1, p3}, Lcom/kik/cards/web/userdata/e;->a(ZLjava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 271
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1a4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 273
    :cond_4
    iget-object v2, p0, Lcom/kik/cards/web/auth/AuthPlugin;->a:Lcom/kik/cards/web/userdata/e;

    const/4 v3, 0x1

    invoke-interface {v2, v3, v1, p3}, Lcom/kik/cards/web/userdata/e;->a(ZZLjava/lang/String;)Lcom/kik/g/p;

    move-result-object v1

    .line 275
    new-instance v2, Lcom/kik/cards/web/auth/k;

    invoke-direct {v2, p0, p1, p3, v0}, Lcom/kik/cards/web/auth/k;-><init>(Lcom/kik/cards/web/auth/AuthPlugin;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 333
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method
