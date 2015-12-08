.class Lcom/jirbo/adcolony/n$ac;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 846
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 854
    if-nez p1, :cond_0

    .line 858
    :goto_0
    return v2

    .line 856
    :cond_0
    const-string v0, "request"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$ac;->a:Ljava/lang/String;

    goto :goto_0
.end method
