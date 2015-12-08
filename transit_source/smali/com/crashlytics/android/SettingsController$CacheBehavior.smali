.class public final enum Lcom/crashlytics/android/SettingsController$CacheBehavior;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/crashlytics/android/SettingsController$CacheBehavior;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum IGNORE_CACHE_EXPIRATION:Lcom/crashlytics/android/SettingsController$CacheBehavior;

.field public static final enum SKIP_CACHE_LOOKUP:Lcom/crashlytics/android/SettingsController$CacheBehavior;

.field public static final enum USE_CACHE:Lcom/crashlytics/android/SettingsController$CacheBehavior;

.field private static final synthetic a:[Lcom/crashlytics/android/SettingsController$CacheBehavior;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 20
    new-instance v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;

    const-string v1, "USE_CACHE"

    invoke-direct {v0, v1, v2}, Lcom/crashlytics/android/SettingsController$CacheBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;->USE_CACHE:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    .line 25
    new-instance v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;

    const-string v1, "SKIP_CACHE_LOOKUP"

    invoke-direct {v0, v1, v3}, Lcom/crashlytics/android/SettingsController$CacheBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;->SKIP_CACHE_LOOKUP:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    .line 30
    new-instance v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;

    const-string v1, "IGNORE_CACHE_EXPIRATION"

    invoke-direct {v0, v1, v4}, Lcom/crashlytics/android/SettingsController$CacheBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;->IGNORE_CACHE_EXPIRATION:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    .line 15
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/crashlytics/android/SettingsController$CacheBehavior;

    sget-object v1, Lcom/crashlytics/android/SettingsController$CacheBehavior;->USE_CACHE:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    aput-object v1, v0, v2

    sget-object v1, Lcom/crashlytics/android/SettingsController$CacheBehavior;->SKIP_CACHE_LOOKUP:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    aput-object v1, v0, v3

    sget-object v1, Lcom/crashlytics/android/SettingsController$CacheBehavior;->IGNORE_CACHE_EXPIRATION:Lcom/crashlytics/android/SettingsController$CacheBehavior;

    aput-object v1, v0, v4

    sput-object v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;->a:[Lcom/crashlytics/android/SettingsController$CacheBehavior;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/crashlytics/android/SettingsController$CacheBehavior;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 15
    const-class v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;

    return-object v0
.end method

.method public static values()[Lcom/crashlytics/android/SettingsController$CacheBehavior;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/crashlytics/android/SettingsController$CacheBehavior;->a:[Lcom/crashlytics/android/SettingsController$CacheBehavior;

    invoke-virtual {v0}, [Lcom/crashlytics/android/SettingsController$CacheBehavior;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/crashlytics/android/SettingsController$CacheBehavior;

    return-object v0
.end method
