.class public Lcom/facebook/orca/login/WildfireRegStartFragment;
.super Lcom/facebook/auth/login/AuthFragmentBase;
.source "WildfireRegStartFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/orca/login/x;


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
.field private Z:Lcom/facebook/auth/login/v;

.field private aa:Lcom/facebook/config/a/a;

.field private ab:Lcom/facebook/prefs/shared/d;

.field private ac:Lcom/facebook/c/s;

.field private ad:Lcom/facebook/auth/login/bm;

.field private ae:Lcom/facebook/orca/login/b;

.field private af:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private c:Z

.field private d:Z

.field private e:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/orca/login/w;

.field private i:Lcom/facebook/analytics/av;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 61
    const-class v0, Lcom/facebook/orca/login/WildfireRegStartFragment;

    sput-object v0, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;-><init>()V

    .line 55
    return-void
.end method

.method private X()V
    .locals 3

    .prologue
    .line 199
    sget-object v0, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    const-string v1, "Attempting to start wildfire gatekeeper checks"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 200
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->af:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    .line 217
    :goto_0
    return-void

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->e:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v0

    if-nez v0, :cond_2

    .line 208
    :cond_1
    sget-object v0, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    const-string v1, "Preparing to start wildfire gatekeeper checks"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->h:Lcom/facebook/orca/login/w;

    invoke-interface {v0}, Lcom/facebook/orca/login/w;->beginShowingProgress()V

    .line 210
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->d:Z

    .line 211
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->af:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v1, Lcom/facebook/orca/server/aq;->a:Lcom/facebook/fbservice/service/OperationType;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 212
    sget-object v0, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    const-string v1, "Started wildfire gatekeeper checks"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 214
    :cond_2
    sget-object v0, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    const-string v1, "Using cached wildfire gatekeeper values"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 215
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->Y()V

    goto :goto_0
.end method

.method private Y()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 267
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->e:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    sget-object v0, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    const-string v1, "Registration enabled"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->c:Z

    if-nez v0, :cond_0

    .line 272
    invoke-virtual {p0, v6}, Lcom/facebook/orca/login/WildfireRegStartFragment;->a(Z)V

    .line 297
    :goto_0
    return-void

    .line 274
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 277
    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->i:Lcom/facebook/analytics/av;

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v3, "view_reg_start"

    invoke-virtual {v0, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v3, "has_fb4a"

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ad:Lcom/facebook/auth/login/bm;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->l()Landroid/support/v4/app/i;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/facebook/auth/login/bm;->c(Landroid/content/Context;)Z

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v3, "used_signup_button"

    iget-boolean v4, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->c:Z

    invoke-virtual {v0, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "alternate_start_page"

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v3, v4, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "skipped_signup_page"

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v3, v4, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v3, "device_id"

    invoke-virtual {v0, v3, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 285
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->h:Lcom/facebook/orca/login/w;

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-interface {v1, v0}, Lcom/facebook/orca/login/w;->showStartPage(Z)V

    .line 286
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->h:Lcom/facebook/orca/login/w;

    invoke-interface {v0}, Lcom/facebook/orca/login/w;->stopShowingProgress()V

    .line 287
    iput-boolean v6, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->d:Z

    goto :goto_0

    .line 290
    :cond_1
    sget-object v0, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    const-string v1, "Registration disabled"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 291
    iget-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->c:Z

    if-eqz v0, :cond_2

    .line 292
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->Z()V

    goto/16 :goto_0

    .line 294
    :cond_2
    invoke-virtual {p0, v6}, Lcom/facebook/orca/login/WildfireRegStartFragment;->a(Z)V

    goto/16 :goto_0
.end method

.method private Z()V
    .locals 4

    .prologue
    .line 381
    const-string v0, "https://m.facebook.com/r.php"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 382
    const-string v1, "locale"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/k/a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 383
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ac:Lcom/facebook/c/s;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 385
    const-class v0, Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->a(Ljava/lang/Class;)V

    .line 387
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->d:Z

    .line 388
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->h:Lcom/facebook/orca/login/w;

    invoke-interface {v0}, Lcom/facebook/orca/login/w;->stopShowingProgress()V

    .line 389
    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .prologue
    .line 315
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 316
    const-string v1, "cid"

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->aa:Lcom/facebook/config/a/a;

    invoke-virtual {v2}, Lcom/facebook/config/a/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 317
    const-string v1, "locale"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/k/a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 318
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 220
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 223
    const-string v1, "messenger_wildfire_android"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 225
    sget-object v4, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "messenger_wildfire_android: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 226
    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->aa:Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->h()Lcom/facebook/config/a/b;

    move-result-object v1

    sget-object v4, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    if-eq v1, v4, :cond_4

    :cond_0
    move v1, v3

    .line 228
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->e:Lcom/google/common/base/Optional;

    .line 231
    const-string v1, "messenger_wildfire_entry_test"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 233
    sget-object v4, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "messenger_wildfire_entry_test: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 235
    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ab:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/orca/prefs/o;->y:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v4, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_1
    move v1, v3

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    .line 240
    const-string v1, "messenger_wildfire_skip_start_test"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 242
    sget-object v1, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "messenger_wildfire_skip_start_test: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 244
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ab:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->z:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v2, v3

    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    .line 248
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->Y()V

    .line 249
    return-void

    :cond_4
    move v1, v2

    .line 226
    goto :goto_0

    :cond_5
    move v1, v2

    .line 235
    goto :goto_1
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 252
    sget-object v0, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->af:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " failed with error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 253
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v0, v1, :cond_0

    .line 254
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 255
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v0

    .line 256
    sget-object v1, Lcom/facebook/orca/login/WildfireRegStartFragment;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "API error code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 259
    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->e:Lcom/google/common/base/Optional;

    .line 260
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    .line 261
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    .line 263
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->Y()V

    .line 264
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/WildfireRegStartFragment;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/WildfireRegStartFragment;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/WildfireRegStartFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/WildfireRegStartFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method


# virtual methods
.method public Q()V
    .locals 4

    .prologue
    .line 304
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->i:Lcom/facebook/analytics/av;

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v2, "create_tapped"

    invoke-virtual {v0, v2}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "alternate_start_page"

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "skipped_signup_page"

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 309
    new-instance v0, Lcom/facebook/base/fragment/e;

    const-class v1, Lcom/facebook/orca/login/WildfireRegNameFragment;

    invoke-direct {v0, v1}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    .line 311
    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->d(Landroid/content/Intent;)V

    .line 312
    return-void
.end method

.method public T()V
    .locals 4

    .prologue
    .line 326
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ac:Lcom/facebook/c/s;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    const-string v3, "https://m.facebook.com/srr"

    invoke-direct {p0, v3}, Lcom/facebook/orca/login/WildfireRegStartFragment;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 329
    return-void
.end method

.method public U()V
    .locals 4

    .prologue
    .line 336
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ac:Lcom/facebook/c/s;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    const-string v3, "https://m.facebook.com/dup"

    invoke-direct {p0, v3}, Lcom/facebook/orca/login/WildfireRegStartFragment;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 339
    return-void
.end method

.method public V()V
    .locals 4

    .prologue
    .line 346
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ac:Lcom/facebook/c/s;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    const-string v3, "https://m.facebook.com/help/mobilecookies"

    invoke-direct {p0, v3}, Lcom/facebook/orca/login/WildfireRegStartFragment;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 349
    return-void
.end method

.method public W()V
    .locals 3

    .prologue
    .line 356
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->n()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/nux/LearnMoreActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 357
    const-string v1, "layout"

    sget v2, Lcom/facebook/k;->orca_wildfire_reg_learn_more:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 358
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ac:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 359
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 167
    const-class v0, Lcom/facebook/orca/login/x;

    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/login/WildfireRegStartFragment;->a(Ljava/lang/Class;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 168
    check-cast v0, Lcom/facebook/orca/login/w;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->h:Lcom/facebook/orca/login/w;

    .line 169
    return-object v1
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 100
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->a(Landroid/os/Bundle;)V

    .line 102
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    .line 103
    if-eqz v0, :cond_0

    .line 104
    const-string v1, "orca:authparam:userrequestedsignup"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->c:Z

    .line 107
    :cond_0
    if-eqz p1, :cond_1

    .line 108
    const-string v0, "isProgressIndicatorShowing"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->d:Z

    .line 110
    const-string v0, "wildfireGkResult"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Optional;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->e:Lcom/google/common/base/Optional;

    .line 112
    const-string v0, "wildfireEntryTestGkResult"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Optional;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    .line 114
    const-string v0, "wildfireSkipStartTestGkResult"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Optional;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    .line 118
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->e:Lcom/google/common/base/Optional;

    if-nez v0, :cond_2

    .line 119
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->e:Lcom/google/common/base/Optional;

    .line 122
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    if-nez v0, :cond_3

    .line 123
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    .line 126
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    if-nez v0, :cond_4

    .line 127
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    .line 130
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 131
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->i:Lcom/facebook/analytics/av;

    .line 132
    const-class v0, Lcom/facebook/auth/login/v;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/v;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->Z:Lcom/facebook/auth/login/v;

    .line 133
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->aa:Lcom/facebook/config/a/a;

    .line 134
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ab:Lcom/facebook/prefs/shared/d;

    .line 135
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ac:Lcom/facebook/c/s;

    .line 136
    const-class v0, Lcom/facebook/auth/login/bm;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/bm;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ad:Lcom/facebook/auth/login/bm;

    .line 137
    const-class v0, Lcom/facebook/orca/login/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/b;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ae:Lcom/facebook/orca/login/b;

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ab:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/auth/e/a;->p:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 141
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ab:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 142
    sget-object v1, Lcom/facebook/auth/e/a;->p:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 143
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 146
    :cond_5
    const-string v0, "getWildfireGksOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->af:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->af:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/login/v;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/v;-><init>(Lcom/facebook/orca/login/WildfireRegStartFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 160
    return-void
.end method

.method public a(Z)V
    .locals 5

    .prologue
    .line 366
    new-instance v1, Lcom/facebook/base/fragment/e;

    const-class v0, Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-direct {v1, v0}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    .line 368
    if-eqz p1, :cond_0

    .line 369
    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->i:Lcom/facebook/analytics/av;

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->ae:Lcom/facebook/orca/login/b;

    const-string v3, "login_tapped"

    invoke-virtual {v0, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "alternate_start_page"

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v3, v4, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "skipped_signup_page"

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v3, v4, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 372
    invoke-virtual {v1}, Lcom/facebook/base/fragment/e;->a()Lcom/facebook/base/fragment/e;

    .line 374
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->d(Landroid/content/Intent;)V

    .line 376
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->h:Lcom/facebook/orca/login/w;

    invoke-interface {v0}, Lcom/facebook/orca/login/w;->stopShowingProgress()V

    .line 377
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->d:Z

    .line 378
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 174
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->d(Landroid/os/Bundle;)V

    .line 175
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->Z:Lcom/facebook/auth/login/v;

    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->a()V

    .line 178
    iget-boolean v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->d:Z

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->h:Lcom/facebook/orca/login/w;

    invoke-interface {v0}, Lcom/facebook/orca/login/w;->beginShowingProgress()V

    .line 181
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 191
    invoke-super {p0, p1}, Lcom/facebook/auth/login/AuthFragmentBase;->e(Landroid/os/Bundle;)V

    .line 192
    const-string v0, "isProgressIndicatorShowing"

    iget-boolean v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->d:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 193
    const-string v0, "wildfireGkResult"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->e:Lcom/google/common/base/Optional;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 194
    const-string v0, "wildfireEntryTestGkResult"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->f:Lcom/google/common/base/Optional;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 195
    const-string v0, "wildfireSkipStartTestGkResult"

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegStartFragment;->g:Lcom/google/common/base/Optional;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 196
    return-void
.end method

.method public f()V
    .locals 0

    .prologue
    .line 185
    invoke-super {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->f()V

    .line 186
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartFragment;->X()V

    .line 187
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 95
    sget-object v0, Lcom/facebook/analytics/f/a;->WILDFIRE_REG_START_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
