.class public final enum Lcom/mixpanel/android/mpmetrics/u$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum a:Lcom/mixpanel/android/mpmetrics/u$b;

.field public static final enum b:Lcom/mixpanel/android/mpmetrics/u$b;

.field private static final synthetic d:[Lcom/mixpanel/android/mpmetrics/u$b;


# instance fields
.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 28
    new-instance v0, Lcom/mixpanel/android/mpmetrics/u$b;

    const-string v1, "EVENTS"

    const-string v2, "events"

    invoke-direct {v0, v1, v3, v2}, Lcom/mixpanel/android/mpmetrics/u$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/u$b;->a:Lcom/mixpanel/android/mpmetrics/u$b;

    .line 29
    new-instance v0, Lcom/mixpanel/android/mpmetrics/u$b;

    const-string v1, "PEOPLE"

    const-string v2, "people"

    invoke-direct {v0, v1, v4, v2}, Lcom/mixpanel/android/mpmetrics/u$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/u$b;->b:Lcom/mixpanel/android/mpmetrics/u$b;

    .line 27
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/mixpanel/android/mpmetrics/u$b;

    sget-object v1, Lcom/mixpanel/android/mpmetrics/u$b;->a:Lcom/mixpanel/android/mpmetrics/u$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mixpanel/android/mpmetrics/u$b;->b:Lcom/mixpanel/android/mpmetrics/u$b;

    aput-object v1, v0, v4

    sput-object v0, Lcom/mixpanel/android/mpmetrics/u$b;->d:[Lcom/mixpanel/android/mpmetrics/u$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/u$b;->c:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/u$b;
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/mixpanel/android/mpmetrics/u$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/u$b;

    return-object v0
.end method

.method public static values()[Lcom/mixpanel/android/mpmetrics/u$b;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/mixpanel/android/mpmetrics/u$b;->d:[Lcom/mixpanel/android/mpmetrics/u$b;

    invoke-virtual {v0}, [Lcom/mixpanel/android/mpmetrics/u$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mixpanel/android/mpmetrics/u$b;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/u$b;->c:Ljava/lang/String;

    return-object v0
.end method
