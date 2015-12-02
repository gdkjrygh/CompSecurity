.class public Lcom/facebook/orca/app/h;
.super Lcom/facebook/inject/c;
.source "MessagesModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 338
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 2136
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 342
    new-instance v0, Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {v0}, Lcom/facebook/orca/contacts/picker/bi;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 343
    new-instance v0, Lcom/facebook/orca/emoji/s;

    invoke-direct {v0}, Lcom/facebook/orca/emoji/s;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 344
    new-instance v0, Lcom/facebook/orca/server/module/a;

    invoke-direct {v0}, Lcom/facebook/orca/server/module/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 345
    new-instance v0, Lcom/facebook/orca/sms/ah;

    invoke-direct {v0}, Lcom/facebook/orca/sms/ah;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 346
    new-instance v0, Lcom/facebook/orca/g/ab;

    invoke-direct {v0}, Lcom/facebook/orca/g/ab;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 347
    new-instance v0, Lcom/facebook/messages/ipc/f;

    invoke-direct {v0}, Lcom/facebook/messages/ipc/f;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 348
    new-instance v0, Lcom/facebook/b/a/g;

    invoke-direct {v0}, Lcom/facebook/b/a/g;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 349
    new-instance v0, Lcom/facebook/orca/notify/x;

    invoke-direct {v0}, Lcom/facebook/orca/notify/x;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 350
    new-instance v0, Lcom/facebook/orca/d/s;

    invoke-direct {v0}, Lcom/facebook/orca/d/s;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 351
    const-class v0, Lcom/facebook/breakpad/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 352
    new-instance v0, Lcom/facebook/orca/fbwebrtc/ai;

    invoke-direct {v0}, Lcom/facebook/orca/fbwebrtc/ai;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 353
    const-class v0, Lcom/facebook/e/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 354
    new-instance v0, Lcom/facebook/orca/push/c;

    invoke-direct {v0}, Lcom/facebook/orca/push/c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 355
    new-instance v0, Lcom/facebook/orca/background/f;

    invoke-direct {v0}, Lcom/facebook/orca/background/f;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 356
    new-instance v0, Lcom/facebook/orca/protocol/d;

    invoke-direct {v0}, Lcom/facebook/orca/protocol/d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 357
    new-instance v0, Lcom/facebook/zero/c;

    invoke-direct {v0}, Lcom/facebook/zero/c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 358
    new-instance v0, Lcom/facebook/messages/b/a;

    invoke-direct {v0}, Lcom/facebook/messages/b/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 359
    new-instance v0, Lcom/facebook/user/x;

    invoke-direct {v0}, Lcom/facebook/user/x;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 360
    new-instance v0, Lcom/facebook/user/tiles/g;

    invoke-direct {v0}, Lcom/facebook/user/tiles/g;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 361
    new-instance v0, Lcom/facebook/orca/stickers/am;

    invoke-direct {v0}, Lcom/facebook/orca/stickers/am;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 362
    new-instance v0, Lcom/facebook/orca/photos/b/o;

    invoke-direct {v0}, Lcom/facebook/orca/photos/b/o;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 363
    const-class v0, Lcom/facebook/backgroundtasks/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 364
    const-class v0, Lcom/facebook/debug/f/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 365
    const-class v0, Lcom/facebook/debug/fps/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 366
    const-class v0, Lcom/facebook/d/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 369
    const-class v0, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsAnalyticsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/b/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 372
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsPresenceEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 375
    const-class v0, Lcom/facebook/l/j;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/prefs/au;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 377
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsThreadlistOnlinePresenceEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/presence/c;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 380
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsThreadlistOnlineAndMobilePresenceEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/presence/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 383
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsMusicPresenceEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/presence/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 386
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsDivebarMoreMobileFriendsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/a/f;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 389
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/annotations/IsChatContextEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/a/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 392
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsDivebarMoreMobileFriendsNewSectionEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/a/g;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 395
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsThreadviewDivebarButtonEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/threadview/h;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 398
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsTesterPrefsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/prefs/k;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 401
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsMergeThreadsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/sms/j;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 404
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/annotations/IsContactEventsUploadPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/i/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 407
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsContactsUploadPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/a/c;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 410
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ShouldShowInviteAllContacts;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/a/l;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 413
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsPartialAccount;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/auth/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 416
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ShouldSkipContactImportNux;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/nux/i;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 419
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/prefs/shared/IsInternalPrefsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/prefs/g;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 422
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsMessengerBugReporterEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/e/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 425
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsInviteByPhonePermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/a/i;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 428
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsNuxSmsForced;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/nux/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 431
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsSmsNuxSendCliffDisabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/nux/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 434
    const-class v0, Lcom/facebook/orca/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/a/h;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 436
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ShowGroupsSectionInDivebar;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/divebar/bq;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 439
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsSuggestionsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/creation/j;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 442
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsBroadcastEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/broadcast/r;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 445
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ShowThirdButtonInThreadList;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/broadcast/s;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 448
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsEmptyComposeLikeEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/compose/ar;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 451
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsInstallMessengerChatHeadPromoEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/upsell/c;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 454
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/WillShowInstallMessengerChatHeadPromo;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/upsell/e;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 457
    const-class v0, Lcom/facebook/orca/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bk;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/bk;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 460
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsTextOnlyEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/divebar/bm;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 463
    const-class v0, Lcom/facebook/orca/threads/g;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/az;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/az;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 465
    const-class v0, Lcom/facebook/orca/threads/FolderType;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/CurrentFolder;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/threads/c;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 468
    const-class v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/CurrentFolder;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/threads/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 471
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/annotations/IsDebugLogsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/common/c/e;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 475
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsDataProcessEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 479
    const-class v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/LoggedInUserPhoneNumber;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/common/a/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 483
    const-class v0, Lcom/facebook/orca/app/fg;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bu;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bu;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 486
    const-class v0, Lcom/facebook/orca/app/dt;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bg;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bg;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 490
    const-class v0, Lcom/facebook/orca/app/fj;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bt;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bt;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 492
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/t;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/t;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 495
    const-class v0, Lcom/facebook/user/p;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/f/k;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 497
    const-class v0, Lcom/facebook/orca/f/g;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/o;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/o;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 499
    const-class v0, Lcom/facebook/orca/f/i;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/p;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/p;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 501
    const-class v0, Lcom/facebook/orca/f/af;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dj;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dj;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 504
    const-class v0, Lcom/facebook/orca/f/ac;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cx;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cx;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 507
    const-class v0, Lcom/facebook/orca/f/r;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cj;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cj;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 510
    const-class v0, Lcom/facebook/orca/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/l;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/l;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 513
    const-class v0, Lcom/facebook/orca/f/x;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/co;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/co;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 516
    const-class v0, Lcom/facebook/orca/f/o;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cf;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cf;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 519
    const-class v0, Lcom/facebook/orca/f/p;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ci;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ci;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 522
    const-class v0, Lcom/facebook/orca/f/z;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ct;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ct;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 525
    const-class v0, Lcom/facebook/orca/threads/q;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/db;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/db;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 528
    const-class v0, Lcom/facebook/orca/f/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/di;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/di;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 531
    const-class v0, Lcom/facebook/orca/prefs/az;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dl;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dl;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 534
    const-class v0, Lcom/facebook/l/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cc;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cc;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 537
    const-class v0, Lcom/facebook/l/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bp;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bp;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 539
    const-class v0, Lcom/facebook/l/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bo;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bo;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 542
    const-class v0, Lcom/facebook/common/c/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/al;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/al;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 545
    const-class v0, Lcom/facebook/orca/photos/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ae;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ae;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 548
    const-class v0, Lcom/facebook/orca/photos/a/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bm;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bm;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 551
    const-class v0, Lcom/facebook/orca/common/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/br;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/br;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 554
    const-class v0, Lcom/facebook/user/i;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bw;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bw;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 557
    const-class v0, Lcom/facebook/orca/g/p;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/z;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/z;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 560
    const-class v0, Lcom/facebook/orca/g/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/v;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/v;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 563
    const-class v0, Lcom/facebook/orca/f/l;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/af;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/af;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 565
    const-class v0, Lcom/facebook/orca/threadview/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bb;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bb;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 568
    const-class v0, Lcom/facebook/orca/threads/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/j;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/j;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 572
    const-class v0, Lcom/facebook/orca/prefs/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ap;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ap;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->c()V

    .line 575
    const-class v0, Lcom/facebook/orca/prefs/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cz;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cz;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    sget-object v2, Lcom/facebook/inject/f;->EAGER:Lcom/facebook/inject/f;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/g;->a(Ljava/lang/Class;Lcom/facebook/inject/f;)V

    .line 578
    const-class v0, Lcom/facebook/orca/server/aj;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bh;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bh;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->c()V

    .line 583
    const-class v0, Lcom/facebook/orca/app/g;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bf;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bf;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 585
    const-class v0, Lcom/facebook/orca/attachments/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/m;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/m;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 588
    const-class v0, Lcom/facebook/orca/f/j;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/q;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/q;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 590
    const-class v0, Lcom/facebook/ui/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ai;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ai;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 592
    const-class v0, Lcom/facebook/ui/d/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/aj;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/aj;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 594
    const-class v0, Lcom/facebook/orca/common/ui/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bd;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bd;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 596
    const-class v0, Lcom/facebook/orca/p/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/at;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/at;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 599
    const-class v0, Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/k;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/k;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 601
    const-class v0, Lcom/facebook/messages/threads/ui/name/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/messages/threads/ui/name/DefaultThreadNameViewComputer;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ad;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ad;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 604
    const-class v0, Lcom/facebook/messages/threads/ui/name/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/messages/threads/ui/name/NamesOnlyThreadNameViewComputer;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bq;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bq;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 607
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ch;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ch;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 609
    const-class v0, Lcom/facebook/messages/threads/ui/name/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cq;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cq;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 611
    const-class v0, Lcom/facebook/common/n/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/an;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/an;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 614
    const-class v0, Lcom/facebook/orca/g/o;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/y;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/y;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 616
    const-class v0, Lcom/facebook/orca/g/g;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/x;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/x;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 618
    const-class v0, Lcom/facebook/orca/g/r;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ab;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ab;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 620
    const-class v0, Lcom/facebook/orca/g/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/u;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/u;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 622
    const-class v0, Lcom/facebook/orca/g/w;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ac;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ac;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 624
    const-class v0, Lcom/facebook/orca/g/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/w;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/w;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 626
    const-class v0, Lcom/facebook/orca/g/q;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/aa;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/aa;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 628
    const-class v0, Lcom/facebook/ui/d/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ak;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ak;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 630
    const-class v0, Lcom/facebook/orca/h/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ax;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ax;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 632
    const-class v0, Lcom/facebook/orca/images/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ar;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ar;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 634
    const-class v0, Lcom/facebook/orca/images/i;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/as;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/as;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 636
    const-class v0, Lcom/facebook/orca/k/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/au;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/au;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 638
    const-class v0, Lcom/facebook/orca/k/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ao;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ao;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 640
    const-class v0, Lcom/facebook/orca/photos/picking/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bs;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bs;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 642
    const-class v0, Lcom/facebook/orca/push/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ce;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ce;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 644
    const-class v0, Lcom/facebook/orca/f/n;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bx;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bx;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 647
    const-class v0, Lcom/facebook/mqtt/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ba;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ba;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 649
    const-class v0, Lcom/facebook/orca/threadlist/m;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cr;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cr;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 651
    const-class v0, Lcom/facebook/orca/threadlist/af;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cv;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cv;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 653
    const-class v0, Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cw;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cw;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 655
    const-class v0, Lcom/facebook/orca/threadlist/i;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cd;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/cd;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 657
    const-class v0, Lcom/facebook/orca/nux/u;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/da;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/da;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 659
    const-class v0, Lcom/facebook/orca/threads/n;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cs;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cs;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->b()V

    .line 662
    const-class v0, Lcom/facebook/orca/threads/s;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dd;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dd;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 664
    const-class v0, Lcom/facebook/orca/threads/r;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dc;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dc;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 666
    const-class v0, Lcom/facebook/orca/threadview/s;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bc;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bc;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 668
    const-class v0, Lcom/facebook/orca/threadview/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cy;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cy;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 670
    const-class v0, Lcom/facebook/contacts/e/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ca;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ca;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 672
    const-class v0, Lcom/facebook/orca/p/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/n;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/n;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 674
    const-class v0, Lcom/facebook/orca/threads/l;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bi;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bi;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 676
    const-class v0, Lcom/facebook/orca/h/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/av;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/av;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 678
    const-class v0, Lcom/facebook/orca/h/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/aw;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/aw;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 680
    const-class v0, Lcom/facebook/orca/l/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ay;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ay;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 682
    const-class v0, Lcom/facebook/orca/i/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ag;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ag;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 684
    const-class v0, Lcom/facebook/orca/o/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cl;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cl;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 686
    const-class v0, Lcom/facebook/orca/nux/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bv;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bv;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 689
    const-class v0, Lcom/facebook/orca/p/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/r;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/r;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 691
    const-class v0, Lcom/facebook/orca/threadview/dn;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dg;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dg;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 693
    const-class v0, Lcom/facebook/orca/threads/x;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/de;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/de;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 695
    const-class v0, Lcom/facebook/orca/threadview/z;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/by;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/by;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 698
    const-class v0, Lcom/facebook/orca/threadview/ci;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/df;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/df;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 700
    const-class v0, Lcom/facebook/orca/threadview/z;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/by;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/by;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 702
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bl;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bl;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 706
    const-class v0, Lcom/facebook/orca/c/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dn;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dn;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 709
    const-class v0, Lcom/facebook/orca/phonenumber/identification/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bz;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/bz;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 711
    const-class v0, Lcom/facebook/orca/phonenumber/identification/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dm;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dm;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 715
    const-class v0, Lcom/facebook/orca/threadview/do;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dh;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dh;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 719
    const-class v0, Lcom/facebook/orca/j/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cp;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cp;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 723
    const-class v0, Lcom/facebook/orca/p/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cm;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cm;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 727
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsMobileOnlineAvailabilityPermitted;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/prefs/i;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 730
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/push/annotations/IsMobileOnlineAvailabilityEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/prefs/h;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 734
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsPartialUpgradeEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/prefs/j;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 739
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/ShouldExpireAuthToken;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cn;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cn;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 744
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsAppIconBadgingEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/app/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 749
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/IsWildfireRegEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 750
    const-class v0, Lcom/facebook/orca/login/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/do;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/do;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 752
    const-class v0, Lcom/facebook/orca/login/af;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dq;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dq;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 754
    const-class v0, Lcom/facebook/orca/login/ai;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dr;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dr;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 756
    const-class v0, Lcom/facebook/orca/login/an;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ds;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/ds;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 758
    const-class v0, Lcom/facebook/orca/contacts/divebar/bs;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dp;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dp;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 762
    const-class v0, Lcom/facebook/orca/e/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bj;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/bj;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 767
    const-class v0, Lcom/facebook/orca/contacts/divebar/bn;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cg;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/cg;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 772
    const-class v0, Lcom/facebook/orca/threadlist/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/s;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/s;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 777
    const-class v0, Lcom/facebook/orca/contacts/divebar/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ah;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/ah;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 780
    const-class v0, Lcom/facebook/orca/common/ui/titlebar/ap;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/dk;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/dk;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 784
    const-class v0, Lcom/facebook/orca/compose/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/aq;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/aq;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 789
    const-class v0, Lcom/facebook/orca/photos/c/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cb;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cb;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 794
    const-class v0, Lcom/facebook/debug/log/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/common/c/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 796
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/app/fg;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 798
    const-class v0, Lcom/facebook/auth/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/app/fj;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 800
    const-class v0, Lcom/facebook/f/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/protocol/methods/y;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 803
    const-class v0, Lcom/facebook/abtest/qe/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/a/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 807
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/upload/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/divebar/bs;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 811
    const-class v0, Lcom/facebook/bugreporter/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/e/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 815
    const-class v0, Lcom/facebook/orca/presence/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/bn;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/bn;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 819
    const-class v0, Landroid/content/ComponentName;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/cu;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/cu;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 823
    const-class v0, Lcom/facebook/orca/threadview/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/ck;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/ck;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 827
    const-class v0, Lcom/facebook/messages/model/threads/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/be;

    invoke-direct {v1, v3}, Lcom/facebook/orca/app/be;-><init>(Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 831
    const-class v0, Lcom/facebook/orca/common/ui/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/h;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/app/am;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/app/am;-><init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 834
    return-void
.end method
