.class final Lcom/mixpanel/android/mpmetrics/ak;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/Boolean;

.field private final c:Ljava/lang/Boolean;

.field private final d:Landroid/util/DisplayMetrics;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/ak;->a:Landroid/content/Context;

    .line 30
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 35
    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 36
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    :try_start_1
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_6

    move-result-object v0

    .line 42
    :goto_0
    iput-object v1, p0, Lcom/mixpanel/android/mpmetrics/ak;->e:Ljava/lang/String;

    .line 43
    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->f:Ljava/lang/Integer;

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 51
    :try_start_2
    const-string v1, "hasSystemFeature"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    move-object v1, v0

    .line 58
    :goto_1
    if-eqz v1, :cond_0

    .line 60
    const/4 v0, 0x1

    :try_start_3
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "android.hardware.nfc"

    aput-object v5, v0, v4

    invoke-virtual {v1, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;
    :try_end_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    .line 61
    const/4 v4, 0x1

    :try_start_4
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "android.hardware.telephony"

    aput-object v6, v4, v5

    invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;
    :try_end_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_4

    move-object v2, v1

    .line 69
    :goto_2
    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->b:Ljava/lang/Boolean;

    .line 70
    iput-object v2, p0, Lcom/mixpanel/android/mpmetrics/ak;->c:Ljava/lang/Boolean;

    .line 71
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->d:Landroid/util/DisplayMetrics;

    .line 73
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 74
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/ak;->d:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 75
    return-void

    .line 39
    :catch_0
    move-exception v0

    move-object v0, v2

    :goto_3
    const-string v1, "MixpanelAPI"

    const-string v4, "System information constructed with a context that apparently doesn\'t exist."

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, v0

    move-object v0, v2

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v1, v2

    goto :goto_1

    .line 63
    :catch_2
    move-exception v0

    move-object v0, v2

    :goto_4
    const-string v1, "MixpanelAPI"

    const-string v3, "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it."

    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 65
    :catch_3
    move-exception v0

    move-object v0, v2

    :goto_5
    const-string v1, "MixpanelAPI"

    const-string v3, "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it."

    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_4
    move-exception v1

    goto :goto_5

    .line 63
    :catch_5
    move-exception v1

    goto :goto_4

    .line 39
    :catch_6
    move-exception v0

    move-object v0, v1

    goto :goto_3

    :cond_0
    move-object v0, v2

    goto :goto_2
.end method

.method public static g()Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 140
    const/4 v0, 0x0

    .line 142
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    .line 143
    if-eqz v1, :cond_0

    .line 144
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 149
    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d()Landroid/util/DisplayMetrics;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->d:Landroid/util/DisplayMetrics;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    .prologue
    .line 117
    const/4 v1, 0x0

    .line 119
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->a:Landroid/content/Context;

    const-string v2, "phone"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 120
    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    .line 123
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public final f()Ljava/lang/Boolean;
    .locals 3

    .prologue
    .line 128
    const/4 v0, 0x0

    .line 130
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/ak;->a:Landroid/content/Context;

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v1, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    .line 131
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/ak;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 132
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 133
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 136
    :cond_0
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 3

    .prologue
    .line 153
    const/4 v0, 0x0

    .line 154
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x8

    if-lt v1, v2, :cond_0

    .line 155
    const-string v0, "none"

    .line 156
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x12

    if-lt v1, v2, :cond_1

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/ak;->a:Landroid/content/Context;

    .line 157
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.bluetooth_le"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 158
    const-string v0, "ble"

    .line 163
    :cond_0
    :goto_0
    return-object v0

    .line 159
    :cond_1
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/ak;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.bluetooth"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 160
    const-string v0, "classic"

    goto :goto_0
.end method
