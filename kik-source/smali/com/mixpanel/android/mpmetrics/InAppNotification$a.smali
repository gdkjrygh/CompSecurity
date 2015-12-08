.class public enum Lcom/mixpanel/android/mpmetrics/InAppNotification$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/InAppNotification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

.field public static final enum b:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

.field public static final enum c:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

.field private static final synthetic d:[Lcom/mixpanel/android/mpmetrics/InAppNotification$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 19
    new-instance v0, Lcom/mixpanel/android/mpmetrics/q;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/q;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->a:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    .line 25
    new-instance v0, Lcom/mixpanel/android/mpmetrics/r;

    const-string v1, "MINI"

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/r;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->b:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    .line 31
    new-instance v0, Lcom/mixpanel/android/mpmetrics/s;

    const-string v1, "TAKEOVER"

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/s;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->c:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    .line 18
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    const/4 v1, 0x0

    sget-object v2, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->a:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->b:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->c:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->d:[Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/InAppNotification$a;
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    return-object v0
.end method

.method public static values()[Lcom/mixpanel/android/mpmetrics/InAppNotification$a;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->d:[Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    invoke-virtual {v0}, [Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    return-object v0
.end method
