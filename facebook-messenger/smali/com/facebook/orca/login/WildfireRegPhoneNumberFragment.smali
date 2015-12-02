.class public Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;
.super Lcom/facebook/auth/login/AuthFragmentBase;
.source "WildfireRegPhoneNumberFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/orca/login/am;
.implements Lcom/facebook/orca/login/ap;
.implements Lcom/facebook/orca/login/j;


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
.field private Z:Lcom/facebook/analytics/av;

.field private aa:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private ab:Lcom/facebook/prefs/shared/d;

.field private ac:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private ad:Lcom/facebook/phonenumbers/PhoneNumberUtil;

.field private ae:Lcom/facebook/c/s;

.field private af:Lcom/facebook/orca/login/b;

.field private ag:Lcom/facebook/orca/login/ai;

.field private ah:Lcom/facebook/orca/login/an;

.field private ai:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Z

.field private i:Lcom/facebook/orca/login/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    const-class v0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;

    sput-object v0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;-><init>()V

    .line 59
    return-void
.end method

.method private T()V
    .locals 4

    .prologue
    .line 293
    sget-object v0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

    const-string v1, "Registration data verification succeeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 295
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v2, "manual_phone_number_ok"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "phone_number"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "country_code"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 300
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->U()V

    .line 301
    return-void
.end method

.method private U()V
    .locals 4

    .prologue
    .line 402
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ag:Lcom/facebook/orca/login/ai;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/login/ai;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v2, "manual_sms_started"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "phone_number"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "country_code"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 408
    return-void
.end method

.method private V()V
    .locals 4

    .prologue
    .line 481
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 486
    new-instance v1, Lcom/facebook/base/fragment/e;

    const-class v2, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;

    invoke-direct {v1, v2}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    .line 488
    invoke-virtual {v1}, Lcom/facebook/base/fragment/e;->a()Lcom/facebook/base/fragment/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->d(Landroid/content/Intent;)V

    .line 493
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    .line 494
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    invoke-interface {v0}, Lcom/facebook/orca/login/i;->stopShowingProgress()V

    .line 495
    return-void
.end method

.method private W()V
    .locals 4

    .prologue
    .line 498
    const-string v0, "https://m.facebook.com/r.php"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 499
    const-string v1, "locale"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/k/a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 500
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ae:Lcom/facebook/c/s;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 502
    const-class v0, Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a(Ljava/lang/Class;)V

    .line 504
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    .line 505
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    invoke-interface {v0}, Lcom/facebook/orca/login/i;->stopShowingProgress()V

    .line 506
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 118
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 119
    const-string v1, "orca:authparam:firstname"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const-string v1, "orca:authparam:lastname"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    return-object v0
.end method

.method private a(Lcom/facebook/http/protocol/ApiErrorResult;)V
    .locals 5

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    invoke-interface {v0}, Lcom/facebook/orca/login/i;->stopShowingProgress()V

    .line 226
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    .line 228
    const/4 v1, 0x0

    .line 230
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->aa:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/ApiErrorResult;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 235
    :goto_0
    if-eqz v0, :cond_0

    .line 236
    const-string v1, "error_title"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v1

    .line 237
    const-string v2, "error_message"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    .line 239
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/ui/d/a;->a(Ljava/lang/String;)Lcom/facebook/ui/d/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/ui/d/a;->b(Ljava/lang/String;)Lcom/facebook/ui/d/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 244
    sget-object v2, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

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

    .line 245
    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

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

    .line 250
    :cond_0
    return-void

    .line 231
    :catch_0
    move-exception v0

    .line 232
    sget-object v2, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

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

.method static synthetic a(Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->T()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->b(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 304
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v2, "manual_phone_number_error"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "phone_number"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "country_code"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 309
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v0, v1, :cond_6

    .line 310
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 311
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v1

    .line 313
    const/16 v2, 0xc2c

    if-ne v1, v2, :cond_4

    .line 316
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->aa:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 323
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 324
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const-string v2, "error_code"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt()I

    move-result v1

    const/16 v2, 0xc38

    if-ne v1, v2, :cond_2

    .line 327
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    const-string v2, "existing_uid"

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v1

    .line 329
    const-string v2, "phone"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v2, "is_existing_user_partial"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 331
    sget-object v0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

    const-string v2, "Error was caused by the phone number belonging to a partial account. False alarm."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 334
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v3, "already_wf_user"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "user_id"

    invoke-virtual {v2, v3, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 338
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->T()V

    .line 396
    :cond_0
    :goto_0
    return-void

    .line 317
    :catch_0
    move-exception v0

    .line 318
    sget-object v1, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

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

    .line 319
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->W()V

    goto :goto_0

    .line 343
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v3, "already_fb_user"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "user_id"

    invoke-virtual {v2, v3, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 347
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ah:Lcom/facebook/orca/login/an;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/login/an;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 351
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v3, "manual_phone_number_invalid"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "phone_number"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "country_code"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "error_code"

    const-string v4, "phone"

    invoke-virtual {v0, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    const-string v5, "error_code"

    invoke-virtual {v4, v5}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fasterxml/jackson/databind/JsonNode;->asInt()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 357
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->l()Landroid/support/v4/app/i;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v1

    sget v2, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v1, v2}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v1

    const-string v2, "phone"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const-string v2, "error_body"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/ui/d/a;->b(Ljava/lang/String;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 364
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    invoke-interface {v0}, Lcom/facebook/orca/login/i;->stopShowingProgress()V

    .line 365
    iput-boolean v6, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    .line 368
    iget v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->g:I

    .line 369
    iget v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->g:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 370
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->W()V

    goto/16 :goto_0

    .line 374
    :cond_4
    const/4 v2, 0x2

    if-ne v1, v2, :cond_5

    .line 375
    invoke-direct {p0, v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a(Lcom/facebook/http/protocol/ApiErrorResult;)V

    goto/16 :goto_0

    .line 378
    :cond_5
    const/16 v0, 0x170

    if-ne v1, v0, :cond_6

    .line 381
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v2, "sentry_block"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 384
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->W()V

    goto/16 :goto_0

    .line 389
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    invoke-interface {v0}, Lcom/facebook/orca/login/i;->stopShowingProgress()V

    .line 390
    iput-boolean v6, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    .line 392
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->l()Landroid/support/v4/app/i;

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
    .line 412
    sget-object v0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

    const-string v1, "SMS request succeeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 414
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v2, "manual_sms_success"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 417
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->V()V

    .line 418
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 188
    const-class v0, Lcom/facebook/orca/login/j;

    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a(Ljava/lang/Class;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 189
    check-cast v0, Lcom/facebook/orca/login/i;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    .line 190
    return-object v1
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 131
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->a(Landroid/os/Bundle;)V

    .line 133
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 134
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    .line 135
    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->aa:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 136
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ab:Lcom/facebook/prefs/shared/d;

    .line 137
    const-class v0, Ljava/lang/String;

    const-class v2, Lcom/facebook/common/hardware/PhoneIsoCountryCode;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ac:Ljavax/inject/a;

    .line 138
    const-class v0, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ad:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    .line 139
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ae:Lcom/facebook/c/s;

    .line 140
    const-class v0, Lcom/facebook/orca/login/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/b;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    .line 141
    const-class v0, Lcom/facebook/orca/login/ai;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/ai;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ag:Lcom/facebook/orca/login/ai;

    .line 142
    const-class v0, Lcom/facebook/orca/login/an;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/an;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ah:Lcom/facebook/orca/login/an;

    .line 144
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ag:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/ai;->a(Landroid/support/v4/app/Fragment;)V

    .line 145
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ag:Lcom/facebook/orca/login/ai;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/ai;->a(Lcom/facebook/orca/login/am;)V

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ag:Lcom/facebook/orca/login/ai;

    const-string v1, "wildfire_registration_manual"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/login/ai;->a(Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ah:Lcom/facebook/orca/login/an;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/an;->a(Landroid/support/v4/app/Fragment;)V

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ah:Lcom/facebook/orca/login/an;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/login/an;->a(Lcom/facebook/orca/login/ap;)V

    .line 151
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:firstname"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->c:Ljava/lang/String;

    .line 152
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:lastname"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->d:Ljava/lang/String;

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ac:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    .line 154
    if-eqz p1, :cond_0

    .line 155
    const-string v0, "phoneNumber"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    .line 156
    const-string v0, "countryCode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    .line 157
    const-string v0, "numVerificationFails"

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->g:I

    .line 159
    const-string v0, "isProgressIndicatorShowing"

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    .line 163
    :cond_0
    const-string v0, "regDataVerificationOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ai:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ai:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/login/h;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/h;-><init>(Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v2, "view_reg_phone"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 181
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 6

    .prologue
    .line 422
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    invoke-interface {v0}, Lcom/facebook/orca/login/i;->stopShowingProgress()V

    .line 423
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    .line 425
    sget-object v0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

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

    .line 426
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

    .line 427
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v1, v2, :cond_3

    .line 428
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 429
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v2

    .line 430
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 431
    sget-object v3, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

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

    .line 433
    const/16 v3, 0xcec

    if-ne v2, v3, :cond_0

    .line 434
    sget-object v0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a:Ljava/lang/Class;

    const-string v1, "We have already requested too many SMSes for this number. Continuing to confirmation code entry screen anyway."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 436
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->V()V

    .line 464
    :goto_0
    return-void

    .line 439
    :cond_0
    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 440
    invoke-direct {p0, v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->a(Lcom/facebook/http/protocol/ApiErrorResult;)V

    goto :goto_0

    .line 443
    :cond_1
    const/16 v0, 0x170

    if-ne v2, v0, :cond_2

    .line 446
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v2, "sentry_block"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 449
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->W()V

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 454
    :cond_3
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v3, "manual_sms_failure"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "phone_number"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "country_code"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "error_code"

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 460
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->n()Landroid/content/Context;

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
    .locals 0

    .prologue
    .line 216
    iput-object p1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    .line 217
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 257
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ai:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    .line 290
    :goto_0
    return-void

    .line 266
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ad:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;
    :try_end_0
    .catch Lcom/facebook/phonenumbers/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 275
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ad:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    sget-object v2, Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->E164:Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->format(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    .line 276
    iput-object p2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    .line 279
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 280
    const-string v1, "phone"

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const-string v1, "countryCode"

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    invoke-interface {v1}, Lcom/facebook/orca/login/i;->beginShowingProgress()V

    .line 283
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    .line 284
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->ai:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 286
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->Z:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->af:Lcom/facebook/orca/login/b;

    const-string v2, "manual_phone_number_entered"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->b(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "phone_number"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "country_code"

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0

    .line 267
    :catch_0
    move-exception v0

    .line 268
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->wildfire_reg_phone_number_invalid:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method public c(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 471
    invoke-virtual {p0, p1}, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->d(Landroid/content/Intent;)V

    .line 473
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    .line 474
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    invoke-interface {v0}, Lcom/facebook/orca/login/i;->stopShowingProgress()V

    .line 475
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 195
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->d(Landroid/os/Bundle;)V

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/i;->setCountryCode(Ljava/lang/String;)V

    .line 200
    iget-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    if-eqz v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->i:Lcom/facebook/orca/login/i;

    invoke-interface {v0}, Lcom/facebook/orca/login/i;->beginShowingProgress()V

    .line 203
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 207
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->e(Landroid/os/Bundle;)V

    .line 208
    const-string v0, "phoneNumber"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    const-string v0, "countryCode"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    const-string v0, "numVerificationFails"

    iget v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->g:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 211
    const-string v0, "isProgressIndicatorShowing"

    iget-boolean v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;->h:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 212
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 126
    sget-object v0, Lcom/facebook/analytics/f/a;->WILDFIRE_REG_PHONE_NUMBER_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
