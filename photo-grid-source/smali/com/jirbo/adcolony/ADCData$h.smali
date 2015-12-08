.class Lcom/jirbo/adcolony/ADCData$h;
.super Lcom/jirbo/adcolony/ADCData$i;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 115
    invoke-direct {p0}, Lcom/jirbo/adcolony/ADCData$i;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/af;)V
    .locals 1

    .prologue
    .line 122
    const-string v0, "true"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    return-void
.end method

.method a()Z
    .locals 1

    .prologue
    .line 117
    const/4 v0, 0x1

    return v0
.end method

.method b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 118
    const-string v0, "true"

    return-object v0
.end method

.method d()D
    .locals 2

    .prologue
    .line 119
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method e()I
    .locals 1

    .prologue
    .line 120
    const/4 v0, 0x1

    return v0
.end method

.method l()Z
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x1

    return v0
.end method
