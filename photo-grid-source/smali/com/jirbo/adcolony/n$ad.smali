.class Lcom/jirbo/adcolony/n$ad;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field b:Lcom/jirbo/adcolony/n$z;

.field c:I

.field d:Ljava/lang/String;

.field e:Z

.field f:I


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 1278
    if-nez p1, :cond_1

    .line 1291
    :cond_0
    :goto_0
    return v0

    .line 1280
    :cond_1
    const-string v2, "enabled"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jirbo/adcolony/n$ad;->a:Z

    .line 1281
    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$ad;->a:Z

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 1283
    :cond_2
    new-instance v2, Lcom/jirbo/adcolony/n$z;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$z;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$ad;->b:Lcom/jirbo/adcolony/n$z;

    .line 1284
    iget-object v2, p0, Lcom/jirbo/adcolony/n$ad;->b:Lcom/jirbo/adcolony/n$z;

    const-string v3, "limits"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$z;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1286
    const-string v0, "reward_amount"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/n$ad;->c:I

    .line 1287
    const-string v0, "reward_name"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$ad;->d:Ljava/lang/String;

    .line 1288
    const-string v0, "client_side"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/n$ad;->e:Z

    .line 1289
    const-string v0, "videos_per_reward"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/n$ad;->f:I

    move v0, v1

    .line 1291
    goto :goto_0
.end method
