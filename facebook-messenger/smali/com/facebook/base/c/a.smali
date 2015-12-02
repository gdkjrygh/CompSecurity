.class public Lcom/facebook/base/c/a;
.super Lcom/facebook/inject/b;
.source "FbBaseModule.java"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 152
    new-instance v0, Lcom/facebook/base/c/b;

    invoke-direct {v0}, Lcom/facebook/base/c/b;-><init>()V

    invoke-static {v0}, Lcom/google/common/d/a/d;->a(Lcom/google/common/d/a/f;)V

    .line 158
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 147
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 1046
    return-void
.end method

.method private a(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 549
    invoke-virtual {p0, p1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/bc;

    invoke-direct {v1, p0, p2}, Lcom/facebook/base/c/bc;-><init>(Lcom/facebook/base/c/a;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 551
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 162
    const-class v0, Lcom/facebook/auth/d/u;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 163
    const-class v0, Lcom/facebook/common/v/k;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 164
    const-class v0, Lcom/facebook/c/d;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 165
    const-class v0, Lcom/facebook/debug/log/h;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 166
    const-class v0, Lcom/facebook/common/l/c;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 167
    const-class v0, Lcom/facebook/common/json/e;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 172
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->d(Ljava/lang/Class;)V

    .line 175
    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/time/c;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 177
    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/time/MonotonicSinceBoot;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/common/time/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 180
    const-class v0, Lcom/facebook/common/time/c;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/bb;

    invoke-direct {v1, v3}, Lcom/facebook/base/c/bb;-><init>(Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 183
    const-class v0, Lcom/facebook/common/time/b;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/am;

    invoke-direct {v1, v3}, Lcom/facebook/base/c/am;-><init>(Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 186
    const-class v0, Ljava/util/Random;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/random/InsecureRandom;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/au;

    invoke-direct {v1, v3}, Lcom/facebook/base/c/au;-><init>(Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 189
    const-class v0, Lcom/facebook/common/o/e;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/aq;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/aq;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 192
    const-class v0, Ljava/util/Locale;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/aj;

    invoke-direct {v1, v3}, Lcom/facebook/base/c/aj;-><init>(Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 194
    const-class v0, Lcom/facebook/base/broadcast/j;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/base/broadcast/LocalBroadcast;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ai;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ai;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 198
    const-class v0, Lcom/facebook/base/broadcast/j;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/base/broadcast/CrossFbProcessBroadcast;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/q;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/q;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 202
    const-class v0, Lcom/facebook/base/broadcast/j;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/base/broadcast/CrossFbAppBroadcast;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/p;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/p;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->d()V

    .line 206
    const-class v0, Lcom/facebook/ui/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/j;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/j;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 210
    const-class v0, Landroid/location/LocationManager;

    const-string v1, "location"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 211
    const-class v0, Landroid/view/WindowManager;

    const-string v1, "window"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 212
    const-class v0, Landroid/view/LayoutInflater;

    const-string v1, "layout_inflater"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 213
    const-class v0, Landroid/app/ActivityManager;

    const-string v1, "activity"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 214
    const-class v0, Landroid/os/PowerManager;

    const-string v1, "power"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 215
    const-class v0, Landroid/app/admin/DevicePolicyManager;

    const-string v1, "device_policy"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 216
    const-class v0, Landroid/app/AlarmManager;

    const-string v1, "alarm"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 217
    const-class v0, Landroid/app/NotificationManager;

    const-string v1, "notification"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 218
    const-class v0, Landroid/app/KeyguardManager;

    const-string v1, "keyguard"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 219
    const-class v0, Landroid/app/SearchManager;

    const-string v1, "search"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 220
    const-class v0, Landroid/os/Vibrator;

    const-string v1, "vibrator"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 221
    const-class v0, Landroid/net/ConnectivityManager;

    const-string v1, "connectivity"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 222
    const-class v0, Landroid/net/wifi/WifiManager;

    const-string v1, "wifi"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 223
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    const-string v1, "input_method"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 224
    const-class v0, Landroid/hardware/SensorManager;

    const-string v1, "sensor"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 225
    const-class v0, Landroid/text/ClipboardManager;

    const-string v1, "clipboard"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 226
    const-class v0, Landroid/telephony/TelephonyManager;

    const-string v1, "phone"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 227
    const-class v0, Landroid/media/AudioManager;

    const-string v1, "audio"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 228
    const-class v0, Landroid/accounts/AccountManager;

    const-string v1, "account"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 230
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 231
    const-class v0, Landroid/app/DownloadManager;

    const-string v1, "download"

    invoke-direct {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 235
    :cond_0
    const-class v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/d;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/d;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 237
    const-class v0, Landroid/app/Service;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ay;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ay;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 239
    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/av;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/av;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 241
    const-class v0, Landroid/content/ContentResolver;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/o;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/o;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 243
    const-class v0, Landroid/support/v4/app/q;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ab;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ab;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 245
    const-class v0, Landroid/content/pm/PackageManager;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/at;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/at;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 248
    const-class v0, Landroid/content/pm/PackageInfo;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/as;

    invoke-direct {v1, v3}, Lcom/facebook/base/c/as;-><init>(Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 251
    const-class v0, Lcom/facebook/common/q/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/f;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/f;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 253
    const-class v0, Landroid/support/v4/a/e;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ah;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ah;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 256
    const-class v0, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ap;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ap;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 259
    const-class v0, Landroid_src/e/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ak;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ak;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 263
    const-class v0, Lcom/facebook/common/process/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/u;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/u;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 266
    const-class v0, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/process/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 268
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/process/MyProcessId;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/an;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/an;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 271
    const-class v0, Lcom/facebook/common/process/c;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ao;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ao;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 275
    const-class v0, Landroid/os/HandlerThread;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ad;

    invoke-direct {v1, v3}, Lcom/facebook/base/c/ad;-><init>(Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 278
    const-class v0, Landroid/os/Handler;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/bd;

    invoke-direct {v1, v3}, Lcom/facebook/base/c/bd;-><init>(Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 281
    const-class v0, Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/r;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/r;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 285
    const-class v0, Lcom/google/common/d/a/u;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/s;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/s;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 289
    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/g;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/g;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 292
    const-class v0, Lcom/facebook/common/executors/n;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ag;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ag;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 295
    const-class v0, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/aw;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/aw;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 299
    const-class v0, Lcom/facebook/common/executors/u;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/t;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/t;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 302
    const-class v0, Lcom/facebook/debug/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/e;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/e;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 305
    const-class v0, Lcom/facebook/common/hardware/f;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/n;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/n;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 310
    const-class v0, Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Ljava/util/concurrent/ExecutorService;

    const-class v2, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 313
    const-class v0, Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/google/common/d/a/v;

    const-class v2, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 316
    const-class v0, Lcom/google/common/d/a/u;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/google/common/d/a/v;

    const-class v2, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 319
    const-class v0, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/google/common/d/a/v;

    const-class v2, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 322
    const-class v0, Lcom/google/common/d/a/v;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/bh;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/bh;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 328
    const-class v0, Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Ljava/util/concurrent/ExecutorService;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 331
    const-class v0, Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/google/common/d/a/u;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 334
    const-class v0, Lcom/google/common/d/a/u;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/google/common/d/a/v;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 337
    const-class v0, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/google/common/d/a/v;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 340
    const-class v0, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForLightweightTaskHandlerThread;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/google/common/d/a/v;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1, v2}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 343
    const-class v0, Lcom/google/common/d/a/v;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/executors/ForUiThread;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/be;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/be;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 347
    const-class v0, Lcom/facebook/common/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/v;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/v;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 350
    const-class v0, Landroid/location/Geocoder;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ac;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ac;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 353
    const-class v0, Lcom/facebook/common/i/b;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ae;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ae;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 358
    const-class v0, Lcom/facebook/common/v/f;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/bg;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/bg;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 361
    const-class v0, Lcom/facebook/common/v/i;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/bf;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/bf;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 364
    const-class v0, Lcom/facebook/common/hardware/q;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ax;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ax;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 368
    const-class v0, Lcom/facebook/common/hardware/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/l;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/l;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 372
    const-class v0, Lcom/facebook/common/hardware/e;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/m;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/m;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 376
    const-class v0, Lcom/facebook/common/hardware/ab;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/bi;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/bi;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 380
    const-class v0, Lcom/facebook/common/hardware/j;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/w;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/w;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 385
    const-class v0, Lcom/facebook/base/broadcast/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/c;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/c;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 390
    const-class v0, Lcom/facebook/base/a/k;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/y;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/y;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 392
    const-class v0, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/i;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/i;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 395
    const-class v0, Lcom/facebook/base/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/h;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/h;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 397
    const-class v0, Lcom/facebook/common/u/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/aa;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/aa;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 400
    const-class v0, Lcom/facebook/config/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->UNKNOWN:Lcom/facebook/config/a/d;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 402
    const-class v0, Lcom/facebook/base/j;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/az;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/az;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 406
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/base/IsBetaBuild;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/af;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/af;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 411
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/e/o;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 413
    const-class v0, Lcom/facebook/common/e/o;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ba;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ba;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 418
    const-class v0, Lcom/facebook/common/hardware/n;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/ar;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/ar;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 423
    const-class v0, Lcom/facebook/common/c/i;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/al;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/al;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 427
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 428
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 429
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnUiThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 430
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 431
    const-class v0, Lcom/facebook/base/d;

    const-class v1, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 432
    const-class v0, Lcom/facebook/base/d;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnUiThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 433
    const-class v0, Lcom/facebook/base/d;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 435
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/common/v/i;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 438
    const-class v0, Lcom/facebook/base/d;

    const-class v1, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/base/a/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 442
    const-class v0, Lcom/facebook/inject/x;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/z;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/z;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 444
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnUiThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/inject/x;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 448
    const-class v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/common/hardware/PhoneIsoCountryCode;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/common/hardware/p;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 453
    const-class v0, Lcom/facebook/c/l;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/x;

    invoke-direct {v1, v3}, Lcom/facebook/base/c/x;-><init>(Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 458
    const-class v0, Lcom/facebook/config/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/base/c/k;

    invoke-direct {v1, p0, v3}, Lcom/facebook/base/c/k;-><init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 461
    return-void
.end method
