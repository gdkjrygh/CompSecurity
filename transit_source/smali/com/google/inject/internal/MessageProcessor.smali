.class final Lcom/google/inject/internal/MessageProcessor;
.super Lcom/google/inject/internal/AbstractProcessor;
.source "MessageProcessor.java"


# static fields
.field private static final logger:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/google/inject/Guice;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/inject/internal/MessageProcessor;->logger:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>(Lcom/google/inject/internal/Errors;)V
    .locals 0
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/google/inject/internal/AbstractProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    .line 36
    return-void
.end method

.method public static getRootMessage(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2
    .param p0, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 51
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 52
    .local v0, "cause":Ljava/lang/Throwable;
    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lcom/google/inject/internal/MessageProcessor;->getRootMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method


# virtual methods
.method public visit(Lcom/google/inject/spi/Message;)Ljava/lang/Boolean;
    .locals 5
    .param p1, "message"    # Lcom/google/inject/spi/Message;

    .prologue
    .line 39
    invoke-virtual {p1}, Lcom/google/inject/spi/Message;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 40
    invoke-virtual {p1}, Lcom/google/inject/spi/Message;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/internal/MessageProcessor;->getRootMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    .line 41
    .local v0, "rootMessage":Ljava/lang/String;
    sget-object v1, Lcom/google/inject/internal/MessageProcessor;->logger:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "An exception was caught and reported. Message: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/inject/spi/Message;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .end local v0    # "rootMessage":Ljava/lang/String;
    :cond_0
    iget-object v1, p0, Lcom/google/inject/internal/MessageProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v1, p1}, Lcom/google/inject/internal/Errors;->addMessage(Lcom/google/inject/spi/Message;)Lcom/google/inject/internal/Errors;

    .line 47
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/Message;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/Message;

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/MessageProcessor;->visit(Lcom/google/inject/spi/Message;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
