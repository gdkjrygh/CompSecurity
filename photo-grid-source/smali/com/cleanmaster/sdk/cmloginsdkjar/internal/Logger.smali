.class public Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LOG_TAG_BASE:Ljava/lang/String; = "CmLoginSDK."

.field private static final stringsToReplace:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private contents:Ljava/lang/StringBuilder;

.field private priority:I

.field private final tag:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->stringsToReplace:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x3

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->priority:I

    .line 46
    const-string v0, "tag"

    invoke-static {p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CmLoginSDK."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->tag:Ljava/lang/String;

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->contents:Ljava/lang/StringBuilder;

    .line 50
    return-void
.end method

.method public static log(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    return-void
.end method

.method public static log(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    return-void
.end method

.method public static varargs log(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 28
    return-void
.end method

.method private static declared-synchronized replaceStrings(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 39
    const-class v2, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->stringsToReplace:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 40
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object p0

    goto :goto_0

    .line 42
    :cond_0
    monitor-exit v2

    return-object p0

    .line 39
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method private shouldLog()Z
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public append(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->shouldLog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->contents:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    :cond_0
    return-void
.end method

.method public varargs append(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 74
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->shouldLog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->contents:Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    :cond_0
    return-void
.end method

.method public appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 80
    const-string v0, "  %s:\t%s\n"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->append(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    return-void
.end method

.method public log()V
    .locals 1

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->shouldLog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->contents:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->logString(Ljava/lang/String;)V

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->contents:Ljava/lang/StringBuilder;

    .line 58
    :cond_0
    return-void
.end method

.method public logString(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->shouldLog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->priority:I

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->tag:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Logger;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 65
    :cond_0
    return-void
.end method
