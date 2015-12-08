.class public Lorg/OpenUDID/OpenUDID_manager;
.super Ljava/lang/Object;
.source "OpenUDID_manager.java"


# static fields
.field private static final LOG:Z = true

.field private static OpenUDID:Ljava/lang/String; = null

.field public static final PREFS_NAME:Ljava/lang/String; = "openudid_prefs"

.field public static final PREF_KEY:Ljava/lang/String; = "openudid"

.field public static final TAG:Ljava/lang/String; = "OpenUDID"

.field private static mInitialized:Z


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mPreferences:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    sput-object v0, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    .line 28
    const/4 v0, 0x0

    sput-boolean v0, Lorg/OpenUDID/OpenUDID_manager;->mInitialized:Z

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-string v0, "openudid_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lorg/OpenUDID/OpenUDID_manager;->mPreferences:Landroid/content/SharedPreferences;

    .line 24
    iput-object p1, p0, Lorg/OpenUDID/OpenUDID_manager;->mContext:Landroid/content/Context;

    .line 25
    return-void
.end method

.method private generateOpenUDID()V
    .locals 3

    .prologue
    .line 76
    const-string v1, "OpenUDID"

    const-string v2, "Generating openUDID"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    iget-object v1, p0, Lorg/OpenUDID/OpenUDID_manager;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    .line 81
    sget-object v1, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    if-eqz v1, :cond_0

    sget-object v1, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    const-string v2, "9774d56d682e549c"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 82
    sget-object v1, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xf

    if-ge v1, v2, :cond_1

    .line 83
    :cond_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 84
    .local v0, "random":Ljava/security/SecureRandom;
    new-instance v1, Ljava/math/BigInteger;

    const/16 v2, 0x40

    invoke-direct {v1, v2, v0}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    .line 86
    .end local v0    # "random":Ljava/security/SecureRandom;
    :cond_1
    return-void
.end method

.method public static getOpenUDID()Ljava/lang/String;
    .locals 2

    .prologue
    .line 36
    sget-boolean v0, Lorg/OpenUDID/OpenUDID_manager;->mInitialized:Z

    if-nez v0, :cond_0

    .line 37
    const-string v0, "OpenUDID"

    const-string v1, "Initialisation isn\'t done"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    :cond_0
    sget-object v0, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    return-object v0
.end method

.method public static isInitialized()Z
    .locals 1

    .prologue
    .line 49
    sget-boolean v0, Lorg/OpenUDID/OpenUDID_manager;->mInitialized:Z

    return v0
.end method

.method private storeOpenUDID()V
    .locals 3

    .prologue
    .line 89
    iget-object v1, p0, Lorg/OpenUDID/OpenUDID_manager;->mPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 90
    .local v0, "e":Landroid/content/SharedPreferences$Editor;
    const-string v1, "openudid"

    sget-object v2, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 91
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 92
    return-void
.end method

.method public static sync(Landroid/content/Context;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 59
    new-instance v0, Lorg/OpenUDID/OpenUDID_manager;

    invoke-direct {v0, p0}, Lorg/OpenUDID/OpenUDID_manager;-><init>(Landroid/content/Context;)V

    .line 60
    .local v0, "manager":Lorg/OpenUDID/OpenUDID_manager;
    iget-object v1, v0, Lorg/OpenUDID/OpenUDID_manager;->mPreferences:Landroid/content/SharedPreferences;

    const-string v2, "openudid"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    .line 62
    sget-object v1, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 63
    invoke-direct {v0}, Lorg/OpenUDID/OpenUDID_manager;->generateOpenUDID()V

    .line 64
    invoke-direct {v0}, Lorg/OpenUDID/OpenUDID_manager;->storeOpenUDID()V

    .line 68
    :cond_0
    const-string v1, "OpenUDID"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OpenUDID: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lorg/OpenUDID/OpenUDID_manager;->OpenUDID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    const/4 v1, 0x1

    sput-boolean v1, Lorg/OpenUDID/OpenUDID_manager;->mInitialized:Z

    .line 72
    return-void
.end method
