.class Lcom/jirbo/adcolony/n$i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 2

    .prologue
    .line 102
    if-nez p1, :cond_0

    const/4 v0, 0x0

    .line 107
    :goto_0
    return v0

    .line 104
    :cond_0
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$i;->a:Ljava/lang/String;

    .line 105
    iget-object v0, p0, Lcom/jirbo/adcolony/n$i;->a:Ljava/lang/String;

    sput-object v0, Lcom/jirbo/adcolony/a;->X:Ljava/lang/String;

    .line 107
    const/4 v0, 0x1

    goto :goto_0
.end method
