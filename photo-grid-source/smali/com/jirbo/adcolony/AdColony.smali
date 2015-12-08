.class public Lcom/jirbo/adcolony/AdColony;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static b:Z


# instance fields
.field a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColony;->a:Z

    .line 434
    return-void
.end method

.method public static activity()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 264
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public static addAdAvailabilityListener(Lcom/jirbo/adcolony/AdColonyAdAvailabilityListener;)V
    .locals 1

    .prologue
    .line 329
    sget-object v0, Lcom/jirbo/adcolony/a;->af:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 331
    :goto_0
    return-void

    .line 330
    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/a;->af:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public static addV4VCListener(Lcom/jirbo/adcolony/AdColonyV4VCListener;)V
    .locals 1

    .prologue
    .line 314
    sget-object v0, Lcom/jirbo/adcolony/a;->ae:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 316
    :goto_0
    return-void

    .line 315
    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/a;->ae:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public static cancelVideo()V
    .locals 2

    .prologue
    .line 368
    sget-object v0, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    if-eqz v0, :cond_0

    .line 370
    sget-object v0, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCVideo;->finish()V

    .line 371
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/a;->aa:Z

    .line 372
    sget-object v0, Lcom/jirbo/adcolony/a;->M:Lcom/jirbo/adcolony/a$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/a$a;->b(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 374
    :cond_0
    return-void
.end method

.method public static varargs configure(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 57
    sput-boolean v1, Lcom/jirbo/adcolony/AdColony;->b:Z

    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v0, v2, :cond_2

    .line 61
    new-instance v0, Lcom/jirbo/adcolony/AdColony$a;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/AdColony$a;-><init>(Landroid/app/Activity;)V

    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v3, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/AdColony$a;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 68
    :goto_0
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 69
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 70
    new-instance v2, Lcom/jirbo/adcolony/AdColony$1;

    invoke-direct {v2}, Lcom/jirbo/adcolony/AdColony$1;-><init>()V

    .line 78
    sget-boolean v3, Lcom/jirbo/adcolony/a;->y:Z

    if-eqz v3, :cond_0

    sget-boolean v3, Lcom/jirbo/adcolony/a;->z:Z

    if-eqz v3, :cond_7

    .line 80
    :cond_0
    sget-boolean v3, Lcom/jirbo/adcolony/a;->q:Z

    if-eqz v3, :cond_3

    .line 119
    :cond_1
    :goto_1
    return-void

    .line 65
    :cond_2
    new-instance v0, Lcom/jirbo/adcolony/AdColony$a;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/AdColony$a;-><init>(Landroid/app/Activity;)V

    new-array v2, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/AdColony$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 82
    :cond_3
    if-nez p2, :cond_4

    .line 84
    const-string v0, "Null App ID - disabling AdColony."

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 88
    :cond_4
    if-nez p3, :cond_5

    .line 90
    const-string v0, "Null Zone IDs array - disabling AdColony."

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 94
    :cond_5
    array-length v3, p3

    if-nez v3, :cond_6

    .line 96
    const-string v0, "No Zone IDs provided - disabling AdColony."

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 100
    :cond_6
    invoke-static {p0}, Lcom/jirbo/adcolony/a;->b(Landroid/app/Activity;)V

    .line 101
    sget-object v3, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v3, p1, p2, p3}, Lcom/jirbo/adcolony/d;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 103
    sput-boolean v6, Lcom/jirbo/adcolony/a;->o:Z

    .line 104
    sput-boolean v6, Lcom/jirbo/adcolony/a;->y:Z

    .line 105
    const-wide/32 v4, 0x1d4c0

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 111
    :cond_7
    sget-object v0, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    if-nez v0, :cond_8

    sput-boolean v6, Lcom/jirbo/adcolony/a;->v:Z

    .line 112
    :cond_8
    sget-object v0, Lcom/jirbo/adcolony/a;->ae:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 113
    sget-object v0, Lcom/jirbo/adcolony/a;->af:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 114
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/a;->ah:Ljava/util/HashMap;

    move v0, v1

    .line 115
    :goto_2
    array-length v2, p3

    if-ge v0, v2, :cond_1

    .line 117
    sget-object v2, Lcom/jirbo/adcolony/a;->ah:Ljava/util/HashMap;

    aget-object v3, p3, v0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method

.method public static disable()V
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/a;->q:Z

    .line 49
    return-void
.end method

.method public static disableDECOverride()V
    .locals 1

    .prologue
    .line 413
    const/4 v0, 0x0

    sput-object v0, Lcom/jirbo/adcolony/a;->e:Ljava/lang/String;

    .line 414
    return-void
.end method

.method public static forceMobileCache()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 418
    sget-boolean v0, Lcom/jirbo/adcolony/a;->E:Z

    if-nez v0, :cond_0

    .line 420
    sput-boolean v1, Lcom/jirbo/adcolony/a;->E:Z

    .line 421
    sput-boolean v2, Lcom/jirbo/adcolony/a;->y:Z

    .line 422
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iput-boolean v1, v0, Lcom/jirbo/adcolony/b;->d:Z

    .line 423
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iput-boolean v2, v0, Lcom/jirbo/adcolony/b;->b:Z

    .line 424
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iput-boolean v1, v0, Lcom/jirbo/adcolony/b;->c:Z

    .line 426
    :cond_0
    return-void
.end method

.method public static getCustomID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 141
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->x:Ljava/lang/String;

    return-object v0
.end method

.method public static getDeviceID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->y:Ljava/lang/String;

    return-object v0
.end method

.method public static getRemainingV4VCForZone(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 296
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    if-nez v0, :cond_1

    .line 300
    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "getRemainingV4VCForZone called before AdColony has finished configuring."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    .line 305
    :goto_0
    return v0

    .line 302
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v0

    .line 303
    if-nez v0, :cond_2

    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "getRemainingV4VCForZone called before AdColony has finished configuring, or the zone passed in is invalid."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 304
    :cond_2
    iget-object v1, v0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/n$ad;->a:Z

    if-nez v1, :cond_3

    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "getRemainingV4VCForZone called with non-V4VC zone."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->c(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 305
    :cond_3
    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->j:Lcom/jirbo/adcolony/n$ad;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ad;->b:Lcom/jirbo/adcolony/n$z;

    iget v0, v0, Lcom/jirbo/adcolony/n$z;->a:I

    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    invoke-virtual {v1, p0}, Lcom/jirbo/adcolony/t;->b(Ljava/lang/String;)I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public static get_images(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 408
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/c;->b(Ljava/lang/String;)V

    .line 409
    return-void
.end method

.method public static isTablet()Z
    .locals 1

    .prologue
    .line 172
    invoke-static {}, Lcom/jirbo/adcolony/g;->i()Z

    move-result v0

    return v0
.end method

.method public static isZoneNative(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 278
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    if-nez v0, :cond_1

    .line 291
    :cond_0
    :goto_0
    return v1

    .line 279
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    if-eqz v0, :cond_0

    .line 280
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    if-eqz v0, :cond_0

    .line 281
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    if-eqz v0, :cond_0

    .line 282
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 283
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v0

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    if-eqz v0, :cond_0

    .line 284
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v0

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    move v0, v1

    .line 286
    :goto_1
    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v2, v2, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2, p0}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v2

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 288
    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v2, v2, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2, p0}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v2

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ab;->i:Lcom/jirbo/adcolony/n$d;

    invoke-virtual {v2, v0}, Lcom/jirbo/adcolony/n$d;->a(I)Lcom/jirbo/adcolony/n$a;

    move-result-object v2

    iget-object v2, v2, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    iget-boolean v2, v2, Lcom/jirbo/adcolony/n$p;->a:Z

    if-eqz v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    .line 286
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public static isZoneV4VC(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 269
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    if-nez v1, :cond_1

    .line 273
    :cond_0
    :goto_0
    return v0

    .line 270
    :cond_1
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    if-eqz v1, :cond_0

    .line 271
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v1, v1, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    if-eqz v1, :cond_0

    .line 272
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v1, v1, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v1, v1, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    if-eqz v1, :cond_0

    .line 273
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    invoke-virtual {v1, p0, v0}, Lcom/jirbo/adcolony/b;->a(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method

.method public static notifyIAPComplete(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 339
    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    invoke-static {p0, p1, v0, v2, v3}, Lcom/jirbo/adcolony/AdColony;->notifyIAPComplete(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 340
    return-void
.end method

.method public static notifyIAPComplete(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V
    .locals 5

    .prologue
    .line 343
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "notifyIAPComplete() called."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 345
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 346
    const-string v1, "product_id"

    invoke-virtual {v0, v1, p0}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-wide/16 v2, 0x0

    cmpl-double v1, p3, v2

    if-eqz v1, :cond_0

    const-string v1, "price"

    invoke-virtual {v0, v1, p3, p4}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;D)V

    .line 348
    :cond_0
    const-string v1, "trans_id"

    invoke-virtual {v0, v1, p1}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const-string v1, "quantity"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 350
    if-eqz p2, :cond_1

    const-string v1, "price_currency_code"

    invoke-virtual {v0, v1, p2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    :cond_1
    sget-boolean v1, Lcom/jirbo/adcolony/a;->F:Z

    if-eqz v1, :cond_2

    .line 353
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v2, "in_app_purchase"

    invoke-virtual {v1, v2, v0}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 361
    :goto_0
    return-void

    .line 358
    :cond_2
    sget-object v1, Lcom/jirbo/adcolony/a;->Z:Lcom/jirbo/adcolony/ADCData$c;

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    goto :goto_0
.end method

.method public static onBackPressed()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 247
    sget-object v0, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    instance-of v0, v0, Lcom/jirbo/adcolony/ac;

    if-nez v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    instance-of v0, v0, Lcom/jirbo/adcolony/ad;

    if-eqz v0, :cond_2

    .line 250
    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/h;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget-object v2, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 251
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/a;->v:Z

    .line 252
    sget-object v0, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    iget-object v0, v0, Lcom/jirbo/adcolony/h;->G:Lcom/jirbo/adcolony/AdColonyV4VCAd;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/AdColonyV4VCAd;->c(Z)V

    .line 253
    :goto_0
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 254
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 255
    const/4 v0, 0x0

    sput-object v0, Lcom/jirbo/adcolony/a;->I:Lcom/jirbo/adcolony/h;

    .line 257
    :cond_2
    return-void
.end method

.method public static pause()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 227
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "[ADC] AdColony pause called."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 228
    sput-boolean v4, Lcom/jirbo/adcolony/a;->t:Z

    move v1, v2

    .line 229
    :goto_0
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 231
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 233
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;

    .line 234
    iput-boolean v4, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->A:Z

    .line 235
    iget-object v3, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v3, :cond_1

    iget-object v3, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v3}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 238
    sget-boolean v3, Lcom/jirbo/adcolony/a;->v:Z

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 239
    :cond_0
    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->c()V

    .line 229
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 243
    :cond_2
    return-void
.end method

.method public static removeAdAvailabilityListener(Lcom/jirbo/adcolony/AdColonyAdAvailabilityListener;)V
    .locals 1

    .prologue
    .line 334
    sget-object v0, Lcom/jirbo/adcolony/a;->af:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 335
    return-void
.end method

.method public static removeV4VCListener(Lcom/jirbo/adcolony/AdColonyV4VCListener;)V
    .locals 1

    .prologue
    .line 320
    sget-object v0, Lcom/jirbo/adcolony/a;->ae:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 321
    return-void
.end method

.method public static resume(Landroid/app/Activity;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 180
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "[ADC] AdColony resume called."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 181
    sput-boolean v2, Lcom/jirbo/adcolony/a;->t:Z

    .line 182
    invoke-static {p0}, Lcom/jirbo/adcolony/a;->a(Landroid/app/Activity;)V

    .line 183
    sput-boolean v2, Lcom/jirbo/adcolony/a;->s:Z

    .line 185
    if-nez p0, :cond_0

    .line 187
    sget-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v1, "Activity reference is null. Disabling AdColony."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 188
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->disable()V

    .line 218
    :goto_0
    return-void

    .line 191
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/jirbo/adcolony/AdColony$2;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/AdColony$2;-><init>(Landroid/app/Activity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 216
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 217
    sput-boolean v2, Lcom/jirbo/adcolony/a;->D:Z

    goto :goto_0
.end method

.method public static setCustomID(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 126
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->x:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 128
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iput-object p0, v0, Lcom/jirbo/adcolony/c;->x:Ljava/lang/String;

    .line 129
    sput-boolean v1, Lcom/jirbo/adcolony/a;->y:Z

    .line 130
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iput-boolean v2, v0, Lcom/jirbo/adcolony/b;->d:Z

    .line 131
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iput-boolean v1, v0, Lcom/jirbo/adcolony/b;->b:Z

    .line 132
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iput-boolean v2, v0, Lcom/jirbo/adcolony/b;->c:Z

    .line 134
    :cond_0
    return-void
.end method

.method public static setDeviceID(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 149
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->y:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iput-object p0, v0, Lcom/jirbo/adcolony/c;->y:Ljava/lang/String;

    .line 152
    sput-boolean v1, Lcom/jirbo/adcolony/a;->y:Z

    .line 153
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iput-boolean v2, v0, Lcom/jirbo/adcolony/b;->d:Z

    .line 154
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iput-boolean v1, v0, Lcom/jirbo/adcolony/b;->b:Z

    .line 155
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iput-boolean v2, v0, Lcom/jirbo/adcolony/b;->c:Z

    .line 157
    :cond_0
    return-void
.end method

.method public static statusForZone(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 381
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    if-nez v0, :cond_1

    .line 384
    :cond_0
    const-string v0, "unknown"

    .line 399
    :goto_0
    return-object v0

    .line 386
    :cond_1
    sget-boolean v0, Lcom/jirbo/adcolony/a;->q:Z

    if-eqz v0, :cond_2

    const-string v0, "unknown"

    goto :goto_0

    .line 388
    :cond_2
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v0, p0}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v0

    .line 390
    if-eqz v0, :cond_5

    .line 392
    iget-boolean v1, v0, Lcom/jirbo/adcolony/n$ab;->e:Z

    if-nez v1, :cond_3

    const-string v0, "off"

    goto :goto_0

    .line 393
    :cond_3
    iget-boolean v0, v0, Lcom/jirbo/adcolony/n$ab;->f:Z

    if-eqz v0, :cond_4

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lcom/jirbo/adcolony/b;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "active"

    goto :goto_0

    .line 394
    :cond_4
    const-string v0, "loading"

    goto :goto_0

    .line 397
    :cond_5
    sget-boolean v0, Lcom/jirbo/adcolony/a;->p:Z

    if-nez v0, :cond_6

    const-string v0, "unknown"

    goto :goto_0

    .line 399
    :cond_6
    const-string v0, "invalid"

    goto :goto_0
.end method
