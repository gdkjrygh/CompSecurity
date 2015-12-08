.class public enum Lcom/mixpanel/android/mpmetrics/Survey$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/Survey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "b"
.end annotation


# static fields
.field public static final enum a:Lcom/mixpanel/android/mpmetrics/Survey$b;

.field public static final enum b:Lcom/mixpanel/android/mpmetrics/Survey$b;

.field public static final enum c:Lcom/mixpanel/android/mpmetrics/Survey$b;

.field private static final synthetic d:[Lcom/mixpanel/android/mpmetrics/Survey$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 92
    new-instance v0, Lcom/mixpanel/android/mpmetrics/ah;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/ah;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->a:Lcom/mixpanel/android/mpmetrics/Survey$b;

    .line 98
    new-instance v0, Lcom/mixpanel/android/mpmetrics/ai;

    const-string v1, "MULTIPLE_CHOICE"

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/ai;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->b:Lcom/mixpanel/android/mpmetrics/Survey$b;

    .line 104
    new-instance v0, Lcom/mixpanel/android/mpmetrics/aj;

    const-string v1, "TEXT"

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/aj;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->c:Lcom/mixpanel/android/mpmetrics/Survey$b;

    .line 91
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/mixpanel/android/mpmetrics/Survey$b;

    const/4 v1, 0x0

    sget-object v2, Lcom/mixpanel/android/mpmetrics/Survey$b;->a:Lcom/mixpanel/android/mpmetrics/Survey$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/mixpanel/android/mpmetrics/Survey$b;->b:Lcom/mixpanel/android/mpmetrics/Survey$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/mixpanel/android/mpmetrics/Survey$b;->c:Lcom/mixpanel/android/mpmetrics/Survey$b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->d:[Lcom/mixpanel/android/mpmetrics/Survey$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/Survey$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Survey$b;
    .locals 1

    .prologue
    .line 91
    const-class v0, Lcom/mixpanel/android/mpmetrics/Survey$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/Survey$b;

    return-object v0
.end method

.method public static values()[Lcom/mixpanel/android/mpmetrics/Survey$b;
    .locals 1

    .prologue
    .line 91
    sget-object v0, Lcom/mixpanel/android/mpmetrics/Survey$b;->d:[Lcom/mixpanel/android/mpmetrics/Survey$b;

    invoke-virtual {v0}, [Lcom/mixpanel/android/mpmetrics/Survey$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mixpanel/android/mpmetrics/Survey$b;

    return-object v0
.end method
