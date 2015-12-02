.class public Lcom/facebook/orca/login/ai;
.super Ljava/lang/Object;
.source "WildfireSmsRequestOperation.java"


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
.field private b:Lcom/facebook/orca/login/am;

.field private c:Lcom/facebook/analytics/av;

.field private d:Lcom/facebook/prefs/shared/d;

.field private e:Lcom/facebook/phonenumbers/PhoneNumberUtil;

.field private f:Lcom/facebook/orca/login/b;

.field private g:Lcom/facebook/base/broadcast/q;

.field private h:Ljava/lang/String;

.field private i:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    const-class v0, Lcom/facebook/orca/login/ai;

    sput-object v0, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/av;Lcom/facebook/prefs/shared/d;Lcom/facebook/phonenumbers/PhoneNumberUtil;Lcom/facebook/orca/login/b;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lcom/facebook/orca/login/ai;->c:Lcom/facebook/analytics/av;

    .line 84
    iput-object p2, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    .line 85
    iput-object p3, p0, Lcom/facebook/orca/login/ai;->e:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    .line 86
    iput-object p4, p0, Lcom/facebook/orca/login/ai;->f:Lcom/facebook/orca/login/b;

    .line 87
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 132
    const-string v0, "confirmation_code"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 135
    iget-object v1, p0, Lcom/facebook/orca/login/ai;->c:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/ai;->f:Lcom/facebook/orca/login/b;

    const-string v3, "confirmation_sms_received"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "code"

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 139
    iget-object v1, p0, Lcom/facebook/orca/login/ai;->j:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/login/ai;->k:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/orca/login/ai;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    .line 264
    sget-object v0, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

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

    .line 266
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->b:Lcom/facebook/orca/login/am;

    invoke-interface {v0, p1}, Lcom/facebook/orca/login/am;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    .line 267
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/ai;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/orca/login/ai;->c()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/ai;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/ai;->a(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/ai;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/ai;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 258
    sget-object v0, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

    const-string v1, "SMS request succeeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 260
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->b:Lcom/facebook/orca/login/am;

    invoke-interface {v0}, Lcom/facebook/orca/login/am;->Q()V

    .line 261
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/orca/login/al;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 146
    iget-object v1, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/auth/e/a;->q:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/auth/e/a;->r:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/auth/e/a;->s:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/auth/e/a;->t:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 150
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/auth/e/a;->t:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v5, 0x0

    invoke-interface {v3, v4, v5, v6}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide v3, 0x34630b8a000L

    cmp-long v1, v1, v3

    if-gez v1, :cond_2

    .line 152
    iget-object v1, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/auth/e/a;->r:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 153
    iget-object v2, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/auth/e/a;->s:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 154
    iget-object v3, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/auth/e/a;->q:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v3, v4, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 156
    const-string v4, ""

    .line 157
    const-string v4, ""

    .line 162
    :try_start_0
    iget-object v4, p0, Lcom/facebook/orca/login/ai;->e:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {v4, p1, p2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    move-result-object v4

    .line 163
    iget-object v5, p0, Lcom/facebook/orca/login/ai;->e:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    sget-object v6, Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->E164:Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {v5, v4, v6}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->format(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v4

    .line 165
    iget-object v5, p0, Lcom/facebook/orca/login/ai;->e:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {v5, v1, v2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    move-result-object v1

    .line 166
    iget-object v2, p0, Lcom/facebook/orca/login/ai;->e:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    sget-object v5, Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->E164:Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {v2, v1, v5}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->format(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
    :try_end_0
    .catch Lcom/facebook/phonenumbers/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 173
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 174
    sget-object v0, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

    const-string v1, "Using cached confirmation code."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->c:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/ai;->f:Lcom/facebook/orca/login/b;

    const-string v2, "sms_cache_used"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 179
    new-instance v0, Lcom/facebook/orca/login/al;

    invoke-direct {v0, p0, p1, p2, v3}, Lcom/facebook/orca/login/al;-><init>(Lcom/facebook/orca/login/ai;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    :cond_0
    :goto_0
    return-object v0

    .line 168
    :catch_0
    move-exception v1

    .line 169
    sget-object v1, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

    const-string v2, "Error parsing phone number for comparison."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 181
    :cond_1
    sget-object v1, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

    const-string v2, "Cached confirmation code exists, but not for the specified phone number"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 185
    :cond_2
    sget-object v1, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

    const-string v2, "Cached confirmation code expired."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 186
    invoke-virtual {p0}, Lcom/facebook/orca/login/ai;->a()V

    goto :goto_0
.end method

.method public a()V
    .locals 3

    .prologue
    .line 217
    sget-object v0, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

    const-string v1, "Clearing cached confirmation code."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 219
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->q:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->r:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->s:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->t:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 226
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->c:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/ai;->f:Lcom/facebook/orca/login/b;

    const-string v2, "sms_cache_cleared"

    invoke-virtual {v1, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 228
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 3

    .prologue
    .line 90
    const-string v0, "requestSmsOperation"

    invoke-static {p1, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/ai;->i:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->i:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/login/aj;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/aj;-><init>(Lcom/facebook/orca/login/ai;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 106
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->n()Landroid/content/Context;

    move-result-object v0

    .line 108
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 109
    const-string v2, "com.facebook.orca.phonenumber.CONFIRMATION_CODE_RECEIVED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 110
    new-instance v2, Lcom/facebook/orca/login/ak;

    invoke-direct {v2, p0, v0, v1}, Lcom/facebook/orca/login/ak;-><init>(Lcom/facebook/orca/login/ai;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v2, p0, Lcom/facebook/orca/login/ai;->g:Lcom/facebook/base/broadcast/q;

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->g:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 121
    return-void
.end method

.method public a(Lcom/facebook/fbservice/ops/ab;)V
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->i:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 236
    return-void
.end method

.method public a(Lcom/facebook/orca/login/am;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/facebook/orca/login/ai;->b:Lcom/facebook/orca/login/am;

    .line 125
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/facebook/orca/login/ai;->h:Ljava/lang/String;

    .line 129
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 194
    sget-object v0, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

    const-string v1, "Caching confirmation code."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 198
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->q:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, p1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->r:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, p2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->s:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, p3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->t:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 206
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->c:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/ai;->f:Lcom/facebook/orca/login/b;

    iget-object v2, p0, Lcom/facebook/orca/login/ai;->h:Ljava/lang/String;

    const-string v3, "sms_cache_set"

    invoke-virtual {v1, v2, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 214
    :goto_0
    return-void

    .line 209
    :cond_0
    sget-object v0, Lcom/facebook/orca/login/ai;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error caching confirmation code. One or more values were null. Confirmation code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "Phone number: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "Country code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 239
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->i:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    .line 255
    :goto_0
    return-void

    .line 244
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/login/ai;->j:Ljava/lang/String;

    .line 245
    iput-object p2, p0, Lcom/facebook/orca/login/ai;->k:Ljava/lang/String;

    .line 247
    new-instance v0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;

    invoke-direct {v0, p1, p2}, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 250
    const-string v2, "verifyPhoneNumberParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 251
    const-string v0, "flow"

    const-string v2, "PARTIAL_REGISTRATION"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    const-string v0, "reg_instance"

    iget-object v2, p0, Lcom/facebook/orca/login/ai;->d:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/auth/e/a;->p:Lcom/facebook/prefs/shared/ae;

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->i:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->H:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 231
    iget-object v0, p0, Lcom/facebook/orca/login/ai;->i:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
