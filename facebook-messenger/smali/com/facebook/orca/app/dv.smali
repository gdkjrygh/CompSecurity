.class public Lcom/facebook/orca/app/dv;
.super Lcom/facebook/inject/c;
.source "MessengerAppModule.java"


# instance fields
.field private final a:Landroid/app/Application;

.field private final b:Lcom/facebook/config/a/a;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/facebook/config/a/a;)V
    .locals 0

    .prologue
    .line 189
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 190
    iput-object p1, p0, Lcom/facebook/orca/app/dv;->a:Landroid/app/Application;

    .line 191
    iput-object p2, p0, Lcom/facebook/orca/app/dv;->b:Lcom/facebook/config/a/a;

    .line 192
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/app/dv;)Landroid/app/Application;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/facebook/orca/app/dv;->a:Landroid/app/Application;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 196
    const-string v0, "OrcaAppModule.configure"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 198
    const-class v1, Lcom/facebook/base/c/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 199
    new-instance v1, Lcom/facebook/debug/log/a;

    const-string v2, "msgr"

    invoke-direct {v1, v2}, Lcom/facebook/debug/log/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 200
    const-class v1, Lcom/facebook/common/f/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 201
    const-class v1, Lcom/facebook/common/e/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 202
    new-instance v1, Lcom/facebook/prefs/shared/t;

    const-string v2, "com.facebook.orca.prefs"

    const-string v3, "com.facebook.orca.provider.ACCESS"

    invoke-direct {v1, v2, v3}, Lcom/facebook/prefs/shared/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 203
    new-instance v1, Lcom/facebook/h/d;

    invoke-direct {v1}, Lcom/facebook/h/d;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 204
    new-instance v1, Lcom/facebook/auth/login/ap;

    invoke-direct {v1}, Lcom/facebook/auth/login/ap;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 205
    new-instance v1, Lcom/facebook/auth/broadcast/d;

    invoke-direct {v1}, Lcom/facebook/auth/broadcast/d;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 206
    new-instance v1, Lcom/facebook/auth/d/q;

    invoke-direct {v1}, Lcom/facebook/auth/d/q;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 207
    new-instance v1, Lcom/facebook/device_id/b;

    invoke-direct {v1}, Lcom/facebook/device_id/b;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 208
    new-instance v1, Lcom/facebook/ui/g/a;

    invoke-direct {v1}, Lcom/facebook/ui/g/a;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 209
    new-instance v1, Lcom/facebook/f/j;

    invoke-direct {v1}, Lcom/facebook/f/j;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 210
    new-instance v1, Lcom/facebook/orca/app/h;

    invoke-direct {v1}, Lcom/facebook/orca/app/h;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 211
    new-instance v1, Lcom/facebook/orca/chatheads/cn;

    invoke-direct {v1}, Lcom/facebook/orca/chatheads/cn;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 212
    new-instance v1, Lcom/facebook/i/a/n;

    invoke-direct {v1}, Lcom/facebook/i/a/n;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 213
    new-instance v1, Lcom/facebook/messages/ipc/peer/f;

    sget-object v2, Lcom/facebook/messages/ipc/peer/j;->Messenger:Lcom/facebook/messages/ipc/peer/j;

    invoke-direct {v1, v2}, Lcom/facebook/messages/ipc/peer/f;-><init>(Lcom/facebook/messages/ipc/peer/j;)V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 214
    new-instance v1, Lcom/facebook/analytics/aw;

    invoke-direct {v1}, Lcom/facebook/analytics/aw;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 215
    new-instance v1, Lcom/facebook/contacts/data/d;

    invoke-direct {v1}, Lcom/facebook/contacts/data/d;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 216
    new-instance v1, Lcom/facebook/http/b/w;

    invoke-direct {v1}, Lcom/facebook/http/b/w;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 217
    const-class v1, Lcom/facebook/fbservice/b/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 218
    new-instance v1, Lcom/facebook/push/a;

    invoke-direct {v1}, Lcom/facebook/push/a;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 219
    new-instance v1, Lcom/facebook/push/mqtt/ax;

    invoke-direct {v1}, Lcom/facebook/push/mqtt/ax;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 220
    new-instance v1, Lcom/facebook/orca/push/b/b;

    invoke-direct {v1}, Lcom/facebook/orca/push/b/b;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 221
    new-instance v1, Lcom/facebook/push/c2dm/d;

    invoke-direct {v1}, Lcom/facebook/push/c2dm/d;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 222
    new-instance v1, Lcom/facebook/push/fbpushdata/b;

    invoke-direct {v1}, Lcom/facebook/push/fbpushdata/b;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 223
    new-instance v1, Lcom/facebook/config/server/k;

    invoke-direct {v1}, Lcom/facebook/config/server/k;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 224
    new-instance v1, Lcom/facebook/config/server/d;

    const-string v2, "Orca-Android"

    invoke-direct {v1, v2}, Lcom/facebook/config/server/d;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 225
    new-instance v1, Lcom/facebook/backgroundlocation/status/e;

    invoke-direct {v1}, Lcom/facebook/backgroundlocation/status/e;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 226
    const-class v1, Lcom/facebook/reflex/z;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 229
    new-instance v1, Lcom/facebook/abtest/qe/g;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/g;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 230
    new-instance v1, Lcom/facebook/bugreporter/o;

    invoke-direct {v1}, Lcom/facebook/bugreporter/o;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 231
    new-instance v1, Lcom/facebook/location/s;

    invoke-direct {v1}, Lcom/facebook/location/s;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 232
    new-instance v1, Lcom/facebook/appconfig/f;

    invoke-direct {v1}, Lcom/facebook/appconfig/f;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 233
    new-instance v1, Lcom/facebook/config/background/b;

    invoke-direct {v1}, Lcom/facebook/config/background/b;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 234
    new-instance v1, Lcom/facebook/selfupdate/u;

    invoke-direct {v1}, Lcom/facebook/selfupdate/u;-><init>()V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 236
    const-class v1, Lcom/facebook/orca/app/LoginReminderManager;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ee;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ee;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->c()V

    .line 240
    const-class v1, Lcom/facebook/config/a/c;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/config/a/a;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 242
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/auth/annotations/IsFirstPartySsoEnabled;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 245
    const-class v1, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/app/dv;->b:Lcom/facebook/config/a/a;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 248
    const-class v1, Lcom/facebook/orca/emoji/p;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ex;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ex;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 254
    const-class v1, Lcom/facebook/config/a/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/eb;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/eb;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 256
    const-class v1, Lcom/facebook/config/a/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/eu;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/eu;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 260
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/zero/annotations/IsZeroRatingFeatureEnabled;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/r/b;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 263
    const-class v1, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/zero/annotations/IsUserCurrentlyZeroRated;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/r/a;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 266
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/config/server/IsBootstrapEnabled;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 269
    const-class v1, Lcom/facebook/c/o;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/zero/rewrite/c;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 271
    const-class v1, Lcom/facebook/config/background/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/zero/a;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 273
    const-class v1, Lcom/facebook/auth/a/c;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/zero/a;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 276
    const-class v1, Lcom/facebook/orca/intents/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ec;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ec;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 278
    const-class v1, Lcom/facebook/messages/ipc/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/eg;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/eg;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 281
    const-class v1, Lcom/facebook/analytics/ak;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/dx;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/dx;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 284
    const-class v1, Lcom/facebook/orca/notify/an;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/eh;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/eh;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 287
    const-class v1, Lcom/facebook/orca/notify/MessengerForegroundProvider;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/el;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/el;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 290
    const-class v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/annotations/MessagesForegroundProviderUri;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-string v2, "content://com.facebook.orca.notify.FbandroidMessagesForegroundProvider/orca_foreground"

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 293
    const-class v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/annotations/MessagesForegroundProviderAuthority;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-string v2, "content://com.facebook.orca.notify.MessengerForegroundProvider/orca_foreground"

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 296
    const-class v1, Lcom/facebook/auth/login/y;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/em;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/em;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 299
    const-class v1, Lcom/facebook/orca/activity/m;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/en;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/en;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 301
    const-class v1, Lcom/facebook/orca/app/du;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ej;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ej;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 303
    const-class v1, Lcom/facebook/base/a/h;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/app/du;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 306
    const-class v1, Lcom/facebook/orca/common/b/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ez;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ez;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 310
    const-class v1, Lcom/facebook/orca/app/fk;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/es;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/es;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 312
    const-class v1, Lcom/facebook/orca/app/fl;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/et;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/et;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 314
    const-class v1, Lcom/facebook/orca/app/fl;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/et;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/et;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 316
    const-class v1, Lcom/facebook/ui/media/cache/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ef;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ef;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 318
    const-class v1, Lcom/facebook/ui/images/cache/c;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ea;

    invoke-direct {v2, v4}, Lcom/facebook/orca/app/ea;-><init>(Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 320
    const-class v1, Lcom/facebook/orca/j/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ey;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ey;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 323
    const-class v1, Lcom/facebook/ui/f/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ep;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ep;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 325
    const-class v1, Lcom/facebook/orca/auth/c;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/activity/n;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 327
    const-class v1, Lcom/facebook/orca/prefs/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/activity/l;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 329
    const-class v1, Lcom/facebook/orca/activity/n;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/eo;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/eo;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 331
    const-class v1, Lcom/facebook/orca/activity/l;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ei;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ei;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 333
    new-instance v1, Lcom/facebook/orca/app/dw;

    invoke-direct {v1, p0}, Lcom/facebook/orca/app/dw;-><init>(Lcom/facebook/orca/app/dv;)V

    invoke-static {v1}, Lcom/google/inject/a;->a(Lcom/google/inject/f;)Lcom/google/inject/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Lcom/google/inject/a;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/app/a;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 335
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/contacts/annotations/IsMobileAppDataEnabled;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/p/g;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 338
    const-class v1, Lcom/facebook/orca/n/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/eq;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/eq;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 340
    const-class v1, Lcom/facebook/selfupdate/ae;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/n/a;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 343
    const-class v1, Lcom/facebook/orca/common/b/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ez;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ez;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 345
    const-class v1, Lcom/facebook/base/activity/f;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/base/a/h;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/auth/login/w;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/ui/f/b;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/h;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 351
    const-class v1, Lcom/facebook/base/c;

    const-class v2, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/app/fk;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/zero/d/a;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 355
    const-class v1, Lcom/facebook/base/c;

    const-class v2, Lcom/facebook/common/init/NeedsLowPriorityInitOnUiThread;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/common/hardware/k;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/l/k;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/l/c;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/push/mqtt/ca;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/analytics/bt;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/common/c/a;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/e;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/app/fm;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 365
    const-class v1, Lcom/facebook/abtest/qe/f/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/a/i;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 368
    const-class v1, Lcom/facebook/base/c;

    const-class v2, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/app/fl;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/ui/media/cache/k;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/ui/images/cache/c;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/j/b;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 374
    const-class v1, Lcom/facebook/prefs/shared/ad;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/d;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 377
    const-class v1, Lcom/facebook/push/mqtt/as;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/push/mqtt/a;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 380
    const-class v1, Lcom/facebook/orca/auth/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/dy;

    invoke-direct {v2, v4}, Lcom/facebook/orca/app/dy;-><init>(Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 382
    const-class v1, Lcom/facebook/auth/broadcast/c;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/auth/a;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 386
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/vvm/annotations/IsVvmSmsReportingEnabledForUser;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/q/b;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 390
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/vvm/annotations/IsVvmSmsDetailedReportingEnabledForUser;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/q/a;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 394
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/bugreporter/annotations/IsOldVersionOfTheApp;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ed;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ed;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 398
    const-class v1, Lcom/facebook/bugreporter/l;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ek;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ek;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 402
    const-class v1, Lcom/facebook/analytics/ck;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/er;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/er;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 406
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/IsReflexThreadListEnabled;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/b;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 410
    const-class v1, Landroid/content/ComponentName;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/j;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 414
    const-class v1, Lcom/facebook/f/f;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/c;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 417
    const-class v1, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/ReflexThreadListGatekeeper;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    new-instance v2, Lcom/facebook/f/d;

    const-string v3, "reflex_threadlistactivity"

    invoke-direct {v2, v3}, Lcom/facebook/f/d;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 421
    const-class v1, Lcom/facebook/orca/reflex/e;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ew;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ew;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 425
    const-class v1, Lcom/facebook/orca/reflex/h;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/ev;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/ev;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 428
    const-class v1, Lcom/facebook/orca/common/ui/a/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/app/dz;

    invoke-direct {v2, p0, v4}, Lcom/facebook/orca/app/dz;-><init>(Lcom/facebook/orca/app/dv;Lcom/facebook/orca/app/dw;)V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 432
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsMultiProcessEnabled;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/app/c;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 435
    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/annotations/IsDataProcessEnabled;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/app/c;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 439
    const-class v1, Lcom/facebook/launcherbadges/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    new-instance v2, Lcom/facebook/launcherbadges/b;

    invoke-direct {v2}, Lcom/facebook/launcherbadges/b;-><init>()V

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/inject/a/g;->a()V

    .line 442
    const-class v1, Ljava/lang/Class;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dv;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    const-class v2, Lcom/facebook/launcherbadges/AppLaunchClass;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/auth/StartScreenActivity;

    invoke-interface {v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 446
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 447
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 5

    .prologue
    .line 451
    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/orca/annotations/IsDataProcessEnabled;

    invoke-virtual {p1, v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 452
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    .line 453
    const-class v1, Lcom/facebook/d/b/a;

    invoke-virtual {p1, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/d/b/a;

    .line 456
    sget-object v3, Lcom/facebook/orca/app/DataProcess;->a:Lcom/facebook/common/process/c;

    const-class v4, Lcom/facebook/orca/app/MessagesDataBlueService;

    invoke-virtual {v0, v3, v4}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/common/process/c;Ljava/lang/Class;)V

    .line 461
    if-eqz v2, :cond_0

    .line 462
    const-class v2, Lcom/facebook/orca/server/MessagesDataQueueSet;

    const-class v3, Lcom/facebook/orca/app/MessagesDataBlueService;

    invoke-virtual {v0, v2, v3}, Lcom/facebook/fbservice/service/p;->b(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 463
    const-class v2, Lcom/facebook/contacts/service/ContactsQueueSet;

    const-class v3, Lcom/facebook/orca/app/MessagesDataBlueService;

    invoke-virtual {v0, v2, v3}, Lcom/facebook/fbservice/service/p;->b(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 464
    sget-object v0, Lcom/facebook/orca/app/DataProcess;->a:Lcom/facebook/common/process/c;

    .line 470
    :goto_0
    const-class v2, Lcom/facebook/orca/g/aa;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/d/b/a;->a(Ljava/lang/Class;Lcom/facebook/common/process/c;)V

    .line 471
    const-class v2, Lcom/facebook/contacts/data/b;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/d/b/a;->a(Ljava/lang/Class;Lcom/facebook/common/process/c;)V

    .line 474
    const-string v2, "contacts"

    invoke-virtual {v1, v2, v0}, Lcom/facebook/d/b/a;->a(Ljava/lang/String;Lcom/facebook/common/process/c;)V

    .line 476
    return-void

    .line 466
    :cond_0
    const-class v0, Lcom/facebook/common/process/d;

    invoke-virtual {p1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/process/d;

    invoke-interface {v0}, Lcom/facebook/common/process/d;->c()Lcom/facebook/common/process/c;

    move-result-object v0

    goto :goto_0
.end method
