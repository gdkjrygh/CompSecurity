.class public Lcom/mopub/common/event/ErrorEvent;
.super Lcom/mopub/common/event/BaseEvent;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lcom/mopub/common/event/ErrorEvent$Builder;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lcom/mopub/common/event/BaseEvent;-><init>(Lcom/mopub/common/event/BaseEvent$Builder;)V

    .line 23
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->a(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->a:Ljava/lang/String;

    .line 24
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->b(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->b:Ljava/lang/String;

    .line 25
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->c(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->c:Ljava/lang/String;

    .line 26
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->d(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->d:Ljava/lang/String;

    .line 27
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->e(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->e:Ljava/lang/String;

    .line 28
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->f(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->f:Ljava/lang/String;

    .line 29
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->g(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->g:Ljava/lang/Integer;

    .line 30
    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/common/event/ErrorEvent$Builder;B)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1}, Lcom/mopub/common/event/ErrorEvent;-><init>(Lcom/mopub/common/event/ErrorEvent$Builder;)V

    return-void
.end method


# virtual methods
.method public getErrorClassName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorExceptionClassName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorFileName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorLineNumber()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public getErrorMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorMethodName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorStackTrace()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->c:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 69
    invoke-super {p0}, Lcom/mopub/common/event/BaseEvent;->toString()Ljava/lang/String;

    move-result-object v0

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ErrorEvent\nErrorExceptionClassName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorExceptionClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nErrorMessage: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nErrorStackTrace: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorStackTrace()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nErrorFileName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nErrorClassName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nErrorMethodName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nErrorLineNumber: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorLineNumber()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
