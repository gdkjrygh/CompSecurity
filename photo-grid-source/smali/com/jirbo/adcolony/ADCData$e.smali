.class Lcom/jirbo/adcolony/ADCData$e;
.super Lcom/jirbo/adcolony/ADCData$i;
.source "SourceFile"


# instance fields
.field a:D


# direct methods
.method constructor <init>(D)V
    .locals 1

    .prologue
    .line 472
    invoke-direct {p0}, Lcom/jirbo/adcolony/ADCData$i;-><init>()V

    iput-wide p1, p0, Lcom/jirbo/adcolony/ADCData$e;->a:D

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/af;)V
    .locals 2

    .prologue
    .line 480
    iget-wide v0, p0, Lcom/jirbo/adcolony/ADCData$e;->a:D

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/af;->a(D)V

    .line 481
    return-void
.end method

.method b_()Z
    .locals 1

    .prologue
    .line 474
    const/4 v0, 0x1

    return v0
.end method

.method d()D
    .locals 2

    .prologue
    .line 475
    iget-wide v0, p0, Lcom/jirbo/adcolony/ADCData$e;->a:D

    return-wide v0
.end method

.method e()I
    .locals 2

    .prologue
    .line 476
    iget-wide v0, p0, Lcom/jirbo/adcolony/ADCData$e;->a:D

    double-to-int v0, v0

    return v0
.end method
