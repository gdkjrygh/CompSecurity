.class Lcom/facebook/analytics/periodicreporters/h;
.super Ljava/lang/Object;
.source "DeviceInfoPeriodicReporter.java"


# instance fields
.field private final a:I

.field private final b:Lcom/facebook/analytics/periodicreporters/i;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/periodicreporters/i;I)V
    .locals 0

    .prologue
    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 263
    iput p2, p0, Lcom/facebook/analytics/periodicreporters/h;->a:I

    .line 264
    iput-object p1, p0, Lcom/facebook/analytics/periodicreporters/h;->b:Lcom/facebook/analytics/periodicreporters/i;

    .line 265
    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/periodicreporters/h;)Lcom/facebook/analytics/periodicreporters/i;
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/h;->b:Lcom/facebook/analytics/periodicreporters/i;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/analytics/periodicreporters/h;)I
    .locals 1

    .prologue
    .line 250
    iget v0, p0, Lcom/facebook/analytics/periodicreporters/h;->a:I

    return v0
.end method
