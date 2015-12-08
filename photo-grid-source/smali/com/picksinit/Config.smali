.class public Lcom/picksinit/Config;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private isDebug:Z

.field private isNeedWebView:Z

.field private mtType:Ljava/util/Set;

.field private showType:Ljava/util/Set;

.field private testReportIp:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljava/util/Set;ZZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/picksinit/Config;->showType:Ljava/util/Set;

    .line 23
    iput-object p2, p0, Lcom/picksinit/Config;->mtType:Ljava/util/Set;

    .line 24
    iput-boolean p3, p0, Lcom/picksinit/Config;->isNeedWebView:Z

    .line 25
    iput-boolean p4, p0, Lcom/picksinit/Config;->isDebug:Z

    .line 26
    iput-object p5, p0, Lcom/picksinit/Config;->testReportIp:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public getMtType()Ljava/util/Set;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/picksinit/Config;->mtType:Ljava/util/Set;

    return-object v0
.end method

.method public getShowType()Ljava/util/Set;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/picksinit/Config;->showType:Ljava/util/Set;

    return-object v0
.end method

.method public getTestReportIp()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/picksinit/Config;->testReportIp:Ljava/lang/String;

    return-object v0
.end method

.method public isDebug()Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/picksinit/Config;->isDebug:Z

    return v0
.end method

.method public isNeedWebView()Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/picksinit/Config;->isNeedWebView:Z

    return v0
.end method

.method public setDebug(Z)V
    .locals 0

    .prologue
    .line 58
    iput-boolean p1, p0, Lcom/picksinit/Config;->isDebug:Z

    .line 59
    return-void
.end method

.method public setMtType(Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/picksinit/Config;->mtType:Ljava/util/Set;

    .line 43
    return-void
.end method

.method public setNeedWebView(Z)V
    .locals 0

    .prologue
    .line 50
    iput-boolean p1, p0, Lcom/picksinit/Config;->isNeedWebView:Z

    .line 51
    return-void
.end method

.method public setShowType(Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/picksinit/Config;->showType:Ljava/util/Set;

    .line 35
    return-void
.end method

.method public setTestReportIp(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/picksinit/Config;->testReportIp:Ljava/lang/String;

    .line 67
    return-void
.end method
