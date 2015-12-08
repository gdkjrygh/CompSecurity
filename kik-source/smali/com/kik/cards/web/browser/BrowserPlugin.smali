.class public Lcom/kik/cards/web/browser/BrowserPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cards/web/browser/BrowserPlugin$a;
    }
.end annotation


# static fields
.field private static a:J

.field private static final b:Lorg/c/b;


# instance fields
.field private d:Ljava/util/Map;

.field private e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

.field private f:Ljava/util/concurrent/ScheduledExecutorService;

.field private g:Lcom/kik/cards/web/aw;

.field private h:Ljava/lang/String;

.field private i:Z

.field private j:Z

.field private final k:Lcom/kik/cards/web/a/a;

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 89
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/kik/cards/web/browser/BrowserPlugin;->a:J

    .line 91
    const-string v0, "CardsWebDebug"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/browser/BrowserPlugin;->b:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/kik/cards/web/browser/BrowserPlugin$a;Lcom/kik/cards/web/a/a;Ljava/lang/String;Lcom/kik/cards/web/aw;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 128
    const-string v0, "Browser"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 95
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->d:Ljava/util/Map;

    .line 103
    iput-boolean v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->i:Z

    .line 105
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->j:Z

    .line 107
    iput-boolean v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->l:Z

    .line 129
    iput-object p1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 130
    iput-object p2, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    .line 131
    iput-object p3, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->k:Lcom/kik/cards/web/a/a;

    .line 132
    iput-object p4, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->h:Ljava/lang/String;

    .line 133
    iput-object p5, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->g:Lcom/kik/cards/web/aw;

    .line 134
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/browser/BrowserPlugin;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->d:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/cards/web/browser/BrowserPlugin;)Lcom/kik/cards/web/browser/BrowserPlugin$a;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .prologue
    .line 221
    const-string v0, "free"

    .line 223
    packed-switch p1, :pswitch_data_0

    .line 236
    :goto_0
    :try_start_0
    new-instance v1, Lcom/kik/cards/web/plugin/f;

    const-string v2, "orientationChanged"

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "orientation"

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {p0, v1}, Lcom/kik/cards/web/browser/BrowserPlugin;->a(Lcom/kik/cards/web/plugin/f;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    :goto_1
    return-void

    .line 225
    :pswitch_0
    const-string v0, "free"

    goto :goto_0

    .line 228
    :pswitch_1
    const-string v0, "landscape"

    goto :goto_0

    .line 231
    :pswitch_2
    const-string v0, "portrait"

    goto :goto_0

    .line 239
    :catch_0
    move-exception v0

    sget-object v0, Lcom/kik/cards/web/browser/BrowserPlugin;->b:Lorg/c/b;

    const-string v1, "Error firing orientation change"

    invoke-interface {v0, v1}, Lorg/c/b;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 223
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 434
    const-string v0, "unpause"

    .line 436
    if-eqz p1, :cond_0

    .line 437
    const-string v0, "pause"

    .line 440
    :cond_0
    iget-boolean v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->l:Z

    if-eqz v1, :cond_2

    if-nez p1, :cond_2

    iget-boolean v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->j:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->k:Lcom/kik/cards/web/a/a;

    invoke-interface {v1}, Lcom/kik/cards/web/a/a;->a()V

    :cond_1
    :goto_0
    iput-boolean p1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->l:Z

    .line 442
    invoke-virtual {p0, v0}, Lcom/kik/cards/web/browser/BrowserPlugin;->c(Ljava/lang/String;)V

    .line 443
    return-void

    .line 440
    :cond_2
    iget-boolean v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->l:Z

    if-nez v1, :cond_1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->k:Lcom/kik/cards/web/a/a;

    invoke-interface {v1}, Lcom/kik/cards/web/a/a;->b()V

    goto :goto_0
.end method

.method public final c()V
    .locals 6

    .prologue
    .line 267
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    .line 268
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->f:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/kik/cards/web/browser/a;

    invoke-direct {v2, p0, v1}, Lcom/kik/cards/web/browser/a;-><init>(Lcom/kik/cards/web/browser/BrowserPlugin;Ljava/lang/String;)V

    const-wide/16 v4, 0x7d0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    .line 285
    iget-object v2, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->d:Ljava/util/Map;

    monitor-enter v2

    .line 286
    :try_start_0
    iget-object v3, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->d:Ljava/util/Map;

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    const/4 v0, 0x0

    .line 292
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "requestToken"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 298
    :goto_0
    new-instance v1, Lcom/kik/cards/web/plugin/f;

    const-string v2, "back"

    invoke-direct {v1, v2, v0}, Lcom/kik/cards/web/plugin/f;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {p0, v1}, Lcom/kik/cards/web/browser/BrowserPlugin;->a(Lcom/kik/cards/web/plugin/f;)V

    .line 299
    return-void

    .line 287
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 294
    :catch_0
    move-exception v1

    .line 295
    sget-object v2, Lcom/kik/cards/web/browser/BrowserPlugin;->b:Lorg/c/b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error firing back event: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lorg/c/b;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public closePopup(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 338
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 341
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 342
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->a(Lorg/json/JSONObject;)V

    .line 348
    :goto_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    .line 351
    :goto_1
    return-object v0

    .line 345
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->o()V

    goto :goto_0

    .line 351
    :cond_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_1
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 470
    const-string v0, "reveal"

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/browser/BrowserPlugin;->c(Ljava/lang/String;)V

    .line 471
    return-void
.end method

.method public getOrientationLock(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 201
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->n()I

    move-result v1

    .line 202
    const-string v0, "free"

    .line 204
    packed-switch v1, :pswitch_data_0

    .line 216
    :goto_0
    new-instance v1, Lcom/kik/cards/web/plugin/j;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "position"

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v1

    .line 206
    :pswitch_0
    const-string v0, "free"

    goto :goto_0

    .line 209
    :pswitch_1
    const-string v0, "landscape"

    goto :goto_0

    .line 212
    :pswitch_2
    const-string v0, "portrait"

    goto :goto_0

    .line 204
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public handleBack(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 311
    const-string v0, "requestToken"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 312
    const-string v1, "override"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 315
    iget-object v2, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->d:Ljava/util/Map;

    monitor-enter v2

    .line 316
    :try_start_0
    iget-object v3, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->d:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    .line 317
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 319
    if-eqz v0, :cond_0

    .line 320
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 321
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->q()V

    .line 325
    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0

    .line 317
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public isDebugModeEnabled(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 305
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "enabled"

    iget-object v3, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v3}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->h()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public isPopupMode(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 501
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "popup"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public isStatusBarVisible(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 254
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 255
    const-string v1, "visible"

    iget-object v2, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v2}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->d()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 256
    new-instance v1, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0xc8

    invoke-direct {v1, v2, v0}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V

    return-object v1
.end method

.method public openCard(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 139
    invoke-virtual {p0, p1}, Lcom/kik/cards/web/browser/BrowserPlugin;->openPage(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;

    move-result-object v0

    return-object v0
.end method

.method public openExternal(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 448
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 449
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 465
    :goto_0
    return-object v0

    .line 456
    :cond_0
    const-string v0, "url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 458
    if-nez v0, :cond_1

    .line 459
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 462
    :cond_1
    iget-object v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1, v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->d(Ljava/lang/String;)V

    .line 464
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/kik/cards/web/browser/BrowserPlugin;->a:J

    .line 465
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    goto :goto_0
.end method

.method public openPage(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 145
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 157
    :goto_0
    return-object v0

    .line 148
    :cond_0
    const-string v0, "url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 150
    invoke-static {v0}, Lcom/kik/cards/util/b;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 151
    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 152
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 155
    :cond_1
    iget-object v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    const-string v2, "popup"

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-interface {v1, v0, v2}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->a(Ljava/lang/String;Z)V

    .line 157
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    goto :goto_0
.end method

.method public pageLoaded(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 483
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method

.method public performHttpsUpgradeCleanup(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 477
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method

.method public refresh(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 489
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method

.method public refreshPlanned(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 495
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method

.method public setBacklightTimeoutEnabled(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 1
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 507
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method

.method public setCardInfo(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 190
    iget-object v0, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->g:Lcom/kik/cards/web/aw;

    if-eqz v0, :cond_0

    .line 191
    const-string v0, "privacy"

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 192
    const-string v1, "terms"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 193
    iget-object v2, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->g:Lcom/kik/cards/web/aw;

    invoke-interface {v2, v1, v0, p2}, Lcom/kik/cards/web/aw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    return-object v0
.end method

.method public setOrientationLock(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    const/16 v2, 0x190

    .line 163
    const-string v0, "position"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 166
    if-nez v0, :cond_0

    .line 167
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 184
    :goto_0
    return-object v0

    .line 169
    :cond_0
    const-string v1, "free"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 170
    const/4 v0, 0x0

    .line 182
    :goto_1
    iget-object v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1, v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->a(I)V

    .line 184
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    goto :goto_0

    .line 172
    :cond_1
    const-string v1, "portrait"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 173
    const/4 v0, 0x1

    goto :goto_1

    .line 175
    :cond_2
    const-string v1, "landscape"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 176
    const/4 v0, 0x2

    goto :goto_1

    .line 179
    :cond_3
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public setStatusBarVisible(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 246
    const-string v0, "visible"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 247
    iget-object v1, p0, Lcom/kik/cards/web/browser/BrowserPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1, v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->b(Z)V

    .line 248
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method
