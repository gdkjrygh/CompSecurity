.class Lcom/jirbo/adcolony/ab$a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:J


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jirbo/adcolony/ab$a;->a:J

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 187
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jirbo/adcolony/ab$a;->a:J

    .line 188
    return-void
.end method

.method b()D
    .locals 4

    .prologue
    .line 192
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 193
    iget-wide v2, p0, Lcom/jirbo/adcolony/ab$a;->a:J

    sub-long/2addr v0, v2

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 198
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ab$a;->b()D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lcom/jirbo/adcolony/ab;->a(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
