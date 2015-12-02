.class public Lcom/facebook/orca/login/WildfireRegNameFragment;
.super Lcom/facebook/auth/login/AuthFragmentBase;
.source "WildfireRegNameFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/orca/login/am;
.implements Lcom/facebook/orca/login/ap;
.implements Lcom/facebook/orca/login/e;


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
.field private Z:Z

.field private aa:Z

.field private ab:Lcom/facebook/orca/login/d;

.field private ac:Lcom/facebook/analytics/av;

.field private ad:Lcom/facebook/user/i;

.field private ae:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private af:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private ag:Lcom/facebook/c/s;

.field private ah:Lcom/facebook/orca/login/b;

.field private ai:Lcom/facebook/orca/login/ai;

.field private aj:Lcom/facebook/orca/login/an;

.field private ak:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 71
    const-class v0, Lcom/facebook/orca/login/WildfireRegNameFragment;

    sput-object v0, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;-><init>()V

    .line 60
    return-void
.end method

.method private T()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 251
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    const-string v1, "Attempting to start phone verification operation..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 252
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ai:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0}, Lcom/facebook/orca/login/ai;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->g:Z

    if-eqz v0, :cond_1

    .line 286
    :cond_0
    :goto_0
    return-void

    .line 257
    :cond_1
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    const-string v1, "Preparing to start phone verification operation..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 260
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->n()Landroid/content/Context;

    move-result-object v0

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 262
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    .line 263
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->af:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    .line 265
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    aput-object v1, v0, v3

    invoke-static {v0}, Lcom/facebook/common/w/n;->a([Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 267
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v2, "sms_request_skipped"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "phone_number"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "country_code"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 272
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->U()V

    .line 274
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    const-string v1, "Skipped phone verification operation"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 276
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ai:Lcom/facebook/orca/login/ai;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/login/ai;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    iput-boolean v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->g:Z

    .line 279
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v2, "sms_request_started"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "phone_number"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "country_code"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 284
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    const-string v1, "Started phone verification operation"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method private U()V
    .locals 1

    .prologue
    .line 289
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->h:Lcom/google/common/base/Optional;

    .line 294
    iget-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->Z:Z

    if-eqz v0, :cond_0

    .line 295
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->W()V

    .line 297
    :cond_0
    return-void
.end method

.method private V()V
    .locals 3

    .prologue
    .line 362
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    const-string v1, "Registration data verification succeeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 364
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    sget v1, Lcom/facebook/o;->wildfire_reg_enter_name:I

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/d;->setNamePromptResource(I)V

    .line 365
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->hideFirstNameError()V

    .line 366
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->hideLastNameError()V

    .line 368
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->Z:Z

    .line 370
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v2, "reg_data_ok"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 372
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->h:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->h:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 373
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->X()V

    .line 379
    :goto_0
    return-void

    .line 377
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->W()V

    goto :goto_0
.end method

.method private W()V
    .locals 3

    .prologue
    .line 507
    new-instance v0, Lcom/facebook/base/fragment/e;

    const-class v1, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;

    invoke-direct {v0, v1}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    .line 509
    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->a()Lcom/facebook/base/fragment/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->f:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->d(Landroid/content/Intent;)V

    .line 514
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    .line 515
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->stopShowingProgress()V

    .line 516
    return-void
.end method

.method private X()V
    .locals 4

    .prologue
    .line 519
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 524
    new-instance v1, Lcom/facebook/base/fragment/e;

    const-class v2, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;

    invoke-direct {v1, v2}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    .line 526
    invoke-virtual {v1}, Lcom/facebook/base/fragment/e;->a()Lcom/facebook/base/fragment/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->d(Landroid/content/Intent;)V

    .line 531
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    .line 532
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->stopShowingProgress()V

    .line 533
    return-void
.end method

.method private Y()V
    .locals 4

    .prologue
    .line 536
    const-string v0, "https://m.facebook.com/r.php"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 537
    const-string v1, "locale"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/k/a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 538
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ag:Lcom/facebook/c/s;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 540
    const-class v0, Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->a(Ljava/lang/Class;)V

    .line 542
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    .line 543
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->stopShowingProgress()V

    .line 544
    return-void
.end method

.method private a(Lcom/facebook/http/protocol/ApiErrorResult;)V
    .locals 5

    .prologue
    .line 220
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->stopShowingProgress()V

    .line 221
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    .line 223
    const/4 v1, 0x0

    .line 225
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ae:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/ApiErrorResult;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 230
    :goto_0
    if-eqz v0, :cond_0

    .line 231
    const-string v1, "error_title"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v1

    .line 232
    const-string v2, "error_message"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    .line 234
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/ui/d/a;->a(Ljava/lang/String;)Lcom/facebook/ui/d/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/ui/d/a;->b(Ljava/lang/String;)Lcom/facebook/ui/d/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 239
    sget-object v2, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

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

    .line 240
    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v4, "service_error"

    invoke-virtual {v3, v4}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "title"

    invoke-virtual {v3, v4, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v3, "message"

    invoke-virtual {v1, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 245
    :cond_0
    return-void

    .line 226
    :catch_0
    move-exception v0

    .line 227
    sget-object v2, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

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

.method static synthetic a(Lcom/facebook/orca/login/WildfireRegNameFragment;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->V()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/WildfireRegNameFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/WildfireRegNameFragment;->b(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 382
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v2, "reg_data_invalid"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "first_name"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "last_name"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "phone_number"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "country_code"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 389
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v0, v1, :cond_7

    .line 390
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 391
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v1

    .line 393
    const/16 v2, 0xc2c

    if-ne v1, v2, :cond_5

    .line 396
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ae:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 403
    const-string v1, "name"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 405
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    const-string v2, "name"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    const-string v3, "error_body"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/orca/login/d;->setNamePrompt(Ljava/lang/String;)V

    .line 406
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v1}, Lcom/facebook/orca/login/d;->showFirstNameError()V

    .line 407
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v1}, Lcom/facebook/orca/login/d;->showLastNameError()V

    .line 409
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v3, "invalid_name_restart"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "first_name"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->e:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "last_name"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->f:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "error_code"

    const-string v4, "name"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v4, "error_code"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt()I

    move-result v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 457
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->stopShowingProgress()V

    .line 458
    iput-boolean v5, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    .line 461
    iget v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->i:I

    .line 462
    iget v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->i:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    .line 463
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->Y()V

    .line 490
    :cond_1
    :goto_0
    return-void

    .line 397
    :catch_0
    move-exception v0

    .line 398
    sget-object v1, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to parse error data! "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 399
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->Y()V

    goto :goto_0

    .line 415
    :cond_2
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 416
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const-string v2, "error_code"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt()I

    move-result v1

    const/16 v2, 0xc38

    if-ne v1, v2, :cond_4

    .line 419
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const-string v2, "existing_uid"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v1

    .line 421
    const-string v2, "phone"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v2, "is_existing_user_partial"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 423
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    const-string v2, "Error was caused by the phone number belonging to a partial account. False alarm."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v3, "already_wf_user"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "user_id"

    invoke-virtual {v2, v3, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 430
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->V()V

    goto :goto_0

    .line 434
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v3, "already_fb_user"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "user_id"

    invoke-virtual {v2, v3, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 438
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aj:Lcom/facebook/orca/login/an;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/login/an;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 443
    :cond_4
    sget-object v1, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error with phone number validation: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "phone"

    invoke-virtual {v0, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    const-string v4, "error_body"

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 446
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v3, "invalid_phone_number"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "phone_number"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "country_code"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "error_code"

    const-string v4, "phone"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v4, "error_code"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt()I

    move-result v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 452
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->W()V

    goto/16 :goto_0

    .line 467
    :cond_5
    const/4 v2, 0x2

    if-ne v1, v2, :cond_6

    .line 468
    invoke-direct {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->a(Lcom/facebook/http/protocol/ApiErrorResult;)V

    goto/16 :goto_0

    .line 471
    :cond_6
    const/16 v0, 0x170

    if-ne v1, v0, :cond_7

    .line 474
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v2, "sentry_block"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 477
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->Y()V

    goto/16 :goto_0

    .line 482
    :cond_7
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->stopShowingProgress()V

    .line 483
    iput-boolean v5, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    .line 485
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    sget v1, Lcom/facebook/o;->wildfire_reg_enter_name:I

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/d;->setNamePromptResource(I)V

    .line 486
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->n()Landroid/content/Context;

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


# virtual methods
.method public Q()V
    .locals 3

    .prologue
    .line 301
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->h:Lcom/google/common/base/Optional;

    .line 303
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v2, "sms_request_success"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 306
    iget-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->Z:Z

    if-eqz v0, :cond_0

    .line 307
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->X()V

    .line 309
    :cond_0
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 179
    const-class v0, Lcom/facebook/orca/login/e;

    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/login/WildfireRegNameFragment;->a(Ljava/lang/Class;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 180
    check-cast v0, Lcom/facebook/orca/login/d;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    .line 181
    return-object v1
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 116
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->a(Landroid/os/Bundle;)V

    .line 118
    if-eqz p1, :cond_0

    .line 119
    const-string v0, "phoneNumber"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    .line 120
    const-string v0, "countryCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    .line 121
    const-string v0, "firstName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->e:Ljava/lang/String;

    .line 122
    const-string v0, "lastName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->f:Ljava/lang/String;

    .line 123
    const-string v0, "smsRequestStarted"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->g:Z

    .line 125
    const-string v0, "smsRequestResult"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Optional;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->h:Lcom/google/common/base/Optional;

    .line 127
    const-string v0, "numNameVerificationFails"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->i:I

    .line 129
    const-string v0, "isNameVerificationComplete"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->Z:Z

    .line 131
    const-string v0, "isProgressIndicatorShowing"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->h:Lcom/google/common/base/Optional;

    if-nez v0, :cond_1

    .line 135
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->h:Lcom/google/common/base/Optional;

    .line 138
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 139
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    .line 140
    const-class v0, Lcom/facebook/user/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/i;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ad:Lcom/facebook/user/i;

    .line 141
    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ae:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 142
    const-class v0, Ljava/lang/String;

    const-class v2, Lcom/facebook/common/hardware/PhoneIsoCountryCode;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->af:Ljavax/inject/a;

    .line 143
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ag:Lcom/facebook/c/s;

    .line 144
    const-class v0, Lcom/facebook/orca/login/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/b;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    .line 145
    const-class v0, Lcom/facebook/orca/login/ai;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/ai;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ai:Lcom/facebook/orca/login/ai;

    .line 146
    const-class v0, Lcom/facebook/orca/login/an;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/an;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aj:Lcom/facebook/orca/login/an;

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ai:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/ai;->a(Landroid/support/v4/app/Fragment;)V

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ai:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/ai;->a(Lcom/facebook/orca/login/am;)V

    .line 150
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ai:Lcom/facebook/orca/login/ai;

    const-string v1, "wildfire_registration"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/login/ai;->a(Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aj:Lcom/facebook/orca/login/an;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/an;->a(Landroid/support/v4/app/Fragment;)V

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aj:Lcom/facebook/orca/login/an;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/an;->a(Lcom/facebook/orca/login/ap;)V

    .line 154
    const-string v0, "regDataVerificationOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ak:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 156
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ak:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/login/c;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/c;-><init>(Lcom/facebook/orca/login/WildfireRegNameFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 170
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v2, "view_reg_name"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 172
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 5

    .prologue
    .line 313
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/t;->toString()Ljava/lang/String;

    move-result-object v0

    .line 314
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v1, v2, :cond_0

    .line 315
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 316
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v1

    .line 317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 318
    sget-object v2, Lcom/facebook/orca/login/WildfireRegNameFragment;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "API error code: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 321
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v3, "sms_request_failure"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "phone_number"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "country_code"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "error_code"

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 327
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->U()V

    .line 328
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 337
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ak:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    .line 359
    :goto_0
    return-void

    .line 342
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->e:Ljava/lang/String;

    .line 343
    iput-object p2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->f:Ljava/lang/String;

    .line 346
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 347
    const-string v1, "firstName"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    const-string v1, "lastName"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const-string v1, "phone"

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ad:Lcom/facebook/user/i;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/facebook/user/i;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    const-string v1, "countryCode"

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v1}, Lcom/facebook/orca/login/d;->beginShowingProgress()V

    .line 352
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    .line 353
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ak:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 355
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ac:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ah:Lcom/facebook/orca/login/b;

    const-string v2, "name_entered"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "first_name"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "last_name"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method

.method public c(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 497
    invoke-virtual {p0, p1}, Lcom/facebook/orca/login/WildfireRegNameFragment;->d(Landroid/content/Intent;)V

    .line 499
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    .line 500
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->stopShowingProgress()V

    .line 501
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 186
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->d(Landroid/os/Bundle;)V

    .line 189
    iget-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->ab:Lcom/facebook/orca/login/d;

    invoke-interface {v0}, Lcom/facebook/orca/login/d;->beginShowingProgress()V

    .line 192
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 202
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->e(Landroid/os/Bundle;)V

    .line 203
    const-string v0, "phoneNumber"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    const-string v0, "countryCode"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const-string v0, "firstName"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    const-string v0, "lastName"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const-string v0, "smsRequestStarted"

    iget-boolean v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->g:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 208
    const-string v0, "smsRequestResult"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->h:Lcom/google/common/base/Optional;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 209
    const-string v0, "numNameVerificationFails"

    iget v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->i:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 210
    const-string v0, "isNameVerificationComplete"

    iget-boolean v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->Z:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 211
    const-string v0, "isProgressIndicatorShowing"

    iget-boolean v1, p0, Lcom/facebook/orca/login/WildfireRegNameFragment;->aa:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 212
    return-void
.end method

.method public f()V
    .locals 0

    .prologue
    .line 196
    invoke-super {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->f()V

    .line 197
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameFragment;->T()V

    .line 198
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 111
    sget-object v0, Lcom/facebook/analytics/f/a;->WILDFIRE_REG_NAME_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
