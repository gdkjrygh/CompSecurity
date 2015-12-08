.class Lcom/jirbo/adcolony/ADCData$a;
.super Lcom/jirbo/adcolony/ADCData$i;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 125
    invoke-direct {p0}, Lcom/jirbo/adcolony/ADCData$i;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/af;)V
    .locals 1

    .prologue
    .line 129
    const-string v0, "false"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    return-void
.end method

.method a()Z
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x1

    return v0
.end method

.method b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 128
    const-string v0, "false"

    return-object v0
.end method
