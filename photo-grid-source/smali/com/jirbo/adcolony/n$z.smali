.class Lcom/jirbo/adcolony/n$z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:I

.field b:I

.field c:I


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1295
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 1

    .prologue
    .line 1305
    if-nez p1, :cond_0

    const/4 v0, 0x0

    .line 1311
    :goto_0
    return v0

    .line 1307
    :cond_0
    const-string v0, "daily_play_cap"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/n$z;->a:I

    .line 1308
    const-string v0, "custom_play_cap"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/n$z;->b:I

    .line 1309
    const-string v0, "custom_play_cap_period"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/n$z;->c:I

    .line 1311
    const/4 v0, 0x1

    goto :goto_0
.end method
