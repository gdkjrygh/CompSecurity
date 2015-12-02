.class public Lcom/facebook/common/m/d;
.super Ljava/io/IOException;
.source "DNSUnresolvedException.java"


# instance fields
.field private a:Lcom/facebook/common/m/c;


# direct methods
.method public constructor <init>(Lcom/facebook/common/m/c;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/facebook/common/m/d;->a:Lcom/facebook/common/m/c;

    .line 16
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/m/c;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/facebook/common/m/d;->a:Lcom/facebook/common/m/c;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DNSUnresolvedException Status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/common/m/d;->a:Lcom/facebook/common/m/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
