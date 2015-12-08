.class public Lroboguice/util/Ln$Print;
.super Ljava/lang/Object;
.source "Ln.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lroboguice/util/Ln;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Print"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static getScope(I)Ljava/lang/String;
    .locals 3
    .param p0, "skipDepth"    # I

    .prologue
    .line 267
    sget-object v1, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v1, v1, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v2, 0x3

    if-gt v1, v2, :cond_0

    .line 268
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    aget-object v0, v1, p0

    .line 269
    .local v0, "trace":Ljava/lang/StackTraceElement;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget-object v2, v2, Lroboguice/util/Ln$BaseConfig;->scope:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 272
    .end local v0    # "trace":Ljava/lang/StackTraceElement;
    :goto_0
    return-object v1

    :cond_0
    sget-object v1, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget-object v1, v1, Lroboguice/util/Ln$BaseConfig;->scope:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public println(ILjava/lang/String;)I
    .locals 2
    .param p1, "priority"    # I
    .param p2, "msg"    # Ljava/lang/String;

    .prologue
    .line 257
    const/4 v0, 0x5

    invoke-static {v0}, Lroboguice/util/Ln$Print;->getScope(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2}, Lroboguice/util/Ln$Print;->processMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected processMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 261
    sget-object v0, Lroboguice/util/Ln;->config:Lroboguice/util/Ln$BaseConfig;

    iget v0, v0, Lroboguice/util/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    .line 262
    const-string v0, "%s %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 263
    :cond_0
    return-object p1
.end method
