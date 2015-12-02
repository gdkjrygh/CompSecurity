.class public Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;
.super Lcom/facebook/auth/login/AuthFragmentBase;
.source "WildfireRegSmsCodeFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/orca/login/ah;
.implements Lcom/facebook/orca/login/am;
.implements Lcom/facebook/orca/login/q;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private Z:Lcom/facebook/orca/login/p;

.field private aa:Lcom/facebook/analytics/av;

.field private ab:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private ac:Lcom/facebook/user/i;

.field private ad:Lcom/facebook/c/s;

.field private ae:Lcom/facebook/orca/login/b;

.field private af:Lcom/facebook/orca/login/af;

.field private ag:Lcom/facebook/orca/login/ai;

.field private ah:Lcom/facebook/base/broadcast/q;

.field private c:I

.field private d:Z

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    const-class v0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;

    sput-object v0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;-><init>()V

    .line 55
    return-void
.end method

.method private V()V
    .locals 4

    .prologue
    .line 487
    const-string v0, "https://m.facebook.com/r.php"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 488
    const-string v1, "locale"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/k/a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 489
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ad:Lcom/facebook/c/s;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 491
    const-class v0, Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a(Ljava/lang/Class;)V

    .line 493
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d:Z

    .line 494
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-interface {v0}, Lcom/facebook/orca/login/p;->stopShowingProgress()V

    .line 495
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 123
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 124
    const-string v1, "orca:authparam:firstname"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const-string v1, "orca:authparam:lastname"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const-string v1, "orca:authparam:phonenumber"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const-string v1, "orca:authparam:countrycode"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    return-object v0
.end method

.method private a(Lcom/facebook/http/protocol/ApiErrorResult;)V
    .locals 5

    .prologue
    .line 246
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-interface {v0}, Lcom/facebook/orca/login/p;->stopShowingProgress()V

    .line 247
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d:Z

    .line 249
    const/4 v1, 0x0

    .line 251
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ab:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/ApiErrorResult;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 256
    :goto_0
    if-eqz v0, :cond_0

    .line 257
    const-string v1, "error_title"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v1

    .line 258
    const-string v2, "error_message"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    .line 260
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/ui/d/a;->a(Ljava/lang/String;)Lcom/facebook/ui/d/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/ui/d/a;->b(Ljava/lang/String;)Lcom/facebook/ui/d/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 265
    sget-object v2, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 266
    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v4, "service_error"

    invoke-virtual {v3, v4}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "title"

    invoke-virtual {v3, v4, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v3, "message"

    invoke-virtual {v1, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 271
    :cond_0
    return-void

    .line 252
    :catch_0
    move-exception v0

    .line 253
    sget-object v2, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to parse error data! "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->c(Landroid/content/Intent;)V

    return-void
.end method

.method private c(Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 276
    const-string v0, "confirmation_code"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 280
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Lcom/facebook/orca/login/p;->setSmsCode(Ljava/lang/String;Z)V

    .line 281
    return-void
.end method


# virtual methods
.method public C()V
    .locals 1

    .prologue
    .line 236
    invoke-super {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->C()V

    .line 237
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ah:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 238
    return-void
.end method

.method public Q()V
    .locals 7

    .prologue
    .line 307
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v2, "resend_sms_success"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 310
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->wildfire_reg_enter_code_resent:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ac:Lcom/facebook/user/i;

    iget-object v6, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/facebook/user/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/p;->setSmsCodePrompt(Ljava/lang/String;)V

    .line 314
    return-void
.end method

.method public T()V
    .locals 2

    .prologue
    .line 459
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0}, Lcom/facebook/orca/login/ai;->a()V

    .line 461
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d(Landroid/content/Intent;)V

    .line 463
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d:Z

    .line 464
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-interface {v0}, Lcom/facebook/orca/login/p;->stopShowingProgress()V

    .line 465
    return-void
.end method

.method public U()V
    .locals 3

    .prologue
    .line 472
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v2, "edit_number_tapped"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 475
    new-instance v0, Lcom/facebook/base/fragment/e;

    const-class v1, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;

    invoke-direct {v0, v1}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    .line 477
    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->a()Lcom/facebook/base/fragment/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->f:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d(Landroid/content/Intent;)V

    .line 482
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d:Z

    .line 483
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-interface {v0}, Lcom/facebook/orca/login/p;->stopShowingProgress()V

    .line 484
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 193
    const-class v0, Lcom/facebook/orca/login/q;

    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a(Ljava/lang/Class;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 194
    check-cast v0, Lcom/facebook/orca/login/p;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    .line 195
    return-object v1
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 138
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->a(Landroid/os/Bundle;)V

    .line 140
    if-eqz p1, :cond_0

    .line 141
    const-string v0, "confirmationCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->i:Ljava/lang/String;

    .line 142
    const-string v0, "numFails"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->c:I

    .line 143
    const-string v0, "isProgressIndicatorShowing"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d:Z

    .line 147
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:firstname"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->e:Ljava/lang/String;

    .line 148
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:lastname"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->f:Ljava/lang/String;

    .line 149
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:phonenumber"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    .line 150
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:countrycode"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->h:Ljava/lang/String;

    .line 152
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 153
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    .line 154
    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ab:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 155
    const-class v0, Lcom/facebook/user/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/i;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ac:Lcom/facebook/user/i;

    .line 156
    const-class v0, Lcom/facebook/orca/login/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/b;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    .line 157
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ad:Lcom/facebook/c/s;

    .line 158
    const-class v0, Lcom/facebook/orca/login/ai;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/ai;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    .line 159
    const-class v0, Lcom/facebook/orca/login/af;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/af;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->af:Lcom/facebook/orca/login/af;

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/ai;->a(Landroid/support/v4/app/Fragment;)V

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/ai;->a(Lcom/facebook/orca/login/am;)V

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    const-string v1, "wildfire_registration_manual"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/login/ai;->a(Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->af:Lcom/facebook/orca/login/af;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/af;->a(Landroid/support/v4/app/Fragment;)V

    .line 166
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->af:Lcom/facebook/orca/login/af;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/af;->a(Lcom/facebook/orca/login/ah;)V

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->af:Lcom/facebook/orca/login/af;

    const-string v1, "wildfire_registration_manual"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/login/af;->a(Ljava/lang/String;)V

    .line 170
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 171
    const-string v1, "com.facebook.orca.phonenumber.CONFIRMATION_CODE_RECEIVED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 172
    new-instance v1, Lcom/facebook/orca/login/o;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2, v0}, Lcom/facebook/orca/login/o;-><init>(Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ah:Lcom/facebook/base/broadcast/q;

    .line 182
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ah:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 184
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v2, "view_reg_sms"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 186
    return-void
.end method

.method public a(Lcom/facebook/fbservice/ops/ab;)V
    .locals 4

    .prologue
    .line 291
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0}, Lcom/facebook/orca/login/ai;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    :goto_0
    return-void

    .line 296
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/login/ai;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 297
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/login/ai;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v2, "resend_sms_started"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "phone_number"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "country_code"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->h:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 6

    .prologue
    .line 318
    sget-object v0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SMS request failed with error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 320
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v1, v2, :cond_2

    .line 321
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 322
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v2

    .line 323
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 324
    sget-object v3, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "API error code: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 326
    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 327
    invoke-direct {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a(Lcom/facebook/http/protocol/ApiErrorResult;)V

    .line 351
    :goto_0
    return-void

    .line 330
    :cond_0
    const/16 v0, 0x170

    if-ne v2, v0, :cond_1

    .line 333
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v2, "sentry_block"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 336
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->V()V

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 341
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v3, "resend_sms_failure"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "phone_number"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "country_code"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->h:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "error_code"

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 347
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 358
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->af:Lcom/facebook/orca/login/af;

    invoke-virtual {v0}, Lcom/facebook/orca/login/af;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 377
    :goto_0
    return-void

    .line 362
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-interface {v0}, Lcom/facebook/orca/login/p;->beginShowingProgress()V

    .line 363
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d:Z

    .line 365
    iput-object p1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->i:Ljava/lang/String;

    .line 367
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->af:Lcom/facebook/orca/login/af;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->h:Ljava/lang/String;

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/login/af;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v2, "manual_sms_code_entered"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method

.method public b(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 5

    .prologue
    .line 381
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-interface {v0}, Lcom/facebook/orca/login/p;->stopShowingProgress()V

    .line 382
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d:Z

    .line 384
    sget-object v0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Registration failed with error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 387
    iget v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->c:I

    .line 388
    iget v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->c:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 389
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->V()V

    .line 455
    :goto_0
    return-void

    .line 393
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v0, v1, :cond_6

    .line 394
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 395
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v1

    .line 396
    sget-object v2, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "API error code: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 398
    const/16 v2, 0xce5

    if-ne v1, v2, :cond_2

    .line 402
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->h:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/facebook/orca/login/ai;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/orca/login/al;

    move-result-object v0

    .line 404
    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->i:Ljava/lang/String;

    iget-object v0, v0, Lcom/facebook/orca/login/al;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 405
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0}, Lcom/facebook/orca/login/ai;->a()V

    .line 408
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v3, "confirmation_code_invalid"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "code"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->i:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "error_code"

    invoke-virtual {v2, v3, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 413
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    sget v1, Lcom/facebook/o;->wildfire_reg_enter_code_invalid:I

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/p;->setSmsCodePromptResource(I)V

    .line 414
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-interface {v0}, Lcom/facebook/orca/login/p;->showSmsCodeError()V

    goto :goto_0

    .line 417
    :cond_2
    const/16 v2, 0xce6

    if-ne v1, v2, :cond_4

    .line 421
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->h:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/facebook/orca/login/ai;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/orca/login/al;

    move-result-object v0

    .line 423
    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->i:Ljava/lang/String;

    iget-object v0, v0, Lcom/facebook/orca/login/al;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 424
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0}, Lcom/facebook/orca/login/ai;->a()V

    .line 427
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v3, "confirmation_code_invalid"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "code"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->i:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "error_code"

    invoke-virtual {v2, v3, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 432
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    sget v1, Lcom/facebook/o;->wildfire_reg_enter_code_expired:I

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/p;->setSmsCodePromptResource(I)V

    .line 433
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-interface {v0}, Lcom/facebook/orca/login/p;->showSmsCodeError()V

    goto/16 :goto_0

    .line 436
    :cond_4
    const/4 v2, 0x2

    if-ne v1, v2, :cond_5

    .line 437
    invoke-direct {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a(Lcom/facebook/http/protocol/ApiErrorResult;)V

    goto/16 :goto_0

    .line 440
    :cond_5
    const/16 v0, 0x170

    if-ne v1, v0, :cond_6

    .line 443
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->aa:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v2, "sentry_block"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 446
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->V()V

    goto/16 :goto_0

    .line 451
    :cond_6
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto/16 :goto_0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    .line 200
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->d(Landroid/os/Bundle;)V

    .line 201
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->wildfire_reg_enter_code:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ac:Lcom/facebook/user/i;

    iget-object v6, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/facebook/user/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/p;->setSmsCodePrompt(Ljava/lang/String;)V

    .line 207
    iget-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d:Z

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    invoke-interface {v0}, Lcom/facebook/orca/login/p;->beginShowingProgress()V

    .line 210
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 229
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->e(Landroid/os/Bundle;)V

    .line 230
    const-string v0, "numFails"

    iget v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->c:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 231
    const-string v0, "isProgressIndicatorShowing"

    iget-boolean v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->d:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 232
    return-void
.end method

.method public f()V
    .locals 3

    .prologue
    .line 214
    invoke-super {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->f()V

    .line 220
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->ag:Lcom/facebook/orca/login/ai;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/login/ai;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/orca/login/al;

    move-result-object v0

    .line 222
    if-eqz v0, :cond_0

    .line 223
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->Z:Lcom/facebook/orca/login/p;

    iget-object v0, v0, Lcom/facebook/orca/login/al;->c:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/facebook/orca/login/p;->setSmsCode(Ljava/lang/String;Z)V

    .line 225
    :cond_0
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 133
    sget-object v0, Lcom/facebook/analytics/f/a;->WILDFIRE_REG_SMS_CODE_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
