.class public final Lorg/chromium/content/browser/SPenSupport;
.super Ljava/lang/Object;
.source "SPenSupport.java"


# static fields
.field private static final SPEN_ACTION_CANCEL:I = 0xd6

.field private static final SPEN_ACTION_DOWN:I = 0xd3

.field private static final SPEN_ACTION_MOVE:I = 0xd5

.field private static final SPEN_ACTION_UP:I = 0xd4

.field private static sIsSPenSupported:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertSPenEventAction(I)I
    .locals 0
    .param p0, "eventActionMasked"    # I

    .prologue
    .line 57
    packed-switch p0, :pswitch_data_0

    .line 67
    .end local p0    # "eventActionMasked":I
    :goto_0
    return p0

    .line 59
    .restart local p0    # "eventActionMasked":I
    :pswitch_0
    const/4 p0, 0x0

    goto :goto_0

    .line 61
    :pswitch_1
    const/4 p0, 0x1

    goto :goto_0

    .line 63
    :pswitch_2
    const/4 p0, 0x2

    goto :goto_0

    .line 65
    :pswitch_3
    const/4 p0, 0x3

    goto :goto_0

    .line 57
    :pswitch_data_0
    .packed-switch 0xd3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static detectSPenSupport(Landroid/content/Context;)Z
    .locals 8
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v5, 0x0

    .line 35
    const-string v6, "SAMSUNG"

    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 45
    :cond_0
    :goto_0
    return v5

    .line 39
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/pm/PackageManager;->getSystemAvailableFeatures()[Landroid/content/pm/FeatureInfo;

    move-result-object v3

    .line 40
    .local v3, "infos":[Landroid/content/pm/FeatureInfo;
    move-object v0, v3

    .local v0, "arr$":[Landroid/content/pm/FeatureInfo;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_1
    if-ge v1, v4, :cond_0

    aget-object v2, v0, v1

    .line 41
    .local v2, "info":Landroid/content/pm/FeatureInfo;
    const-string v6, "com.sec.feature.spen_usp"

    iget-object v7, v2, Landroid/content/pm/FeatureInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 42
    const/4 v5, 0x1

    goto :goto_0

    .line 40
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public static isSPenSupported(Landroid/content/Context;)Z
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 28
    sget-object v0, Lorg/chromium/content/browser/SPenSupport;->sIsSPenSupported:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 29
    invoke-static {p0}, Lorg/chromium/content/browser/SPenSupport;->detectSPenSupport(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lorg/chromium/content/browser/SPenSupport;->sIsSPenSupported:Ljava/lang/Boolean;

    .line 31
    :cond_0
    sget-object v0, Lorg/chromium/content/browser/SPenSupport;->sIsSPenSupported:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
