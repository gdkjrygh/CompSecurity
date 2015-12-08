.class Lcom/google/inject/internal/BytecodeGen$BridgeClassLoader;
.super Ljava/lang/ClassLoader;
.source "BytecodeGen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/BytecodeGen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BridgeClassLoader"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 296
    invoke-direct {p0}, Ljava/lang/ClassLoader;-><init>()V

    .line 298
    return-void
.end method

.method constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0
    .param p1, "usersClassLoader"    # Ljava/lang/ClassLoader;

    .prologue
    .line 301
    invoke-direct {p0, p1}, Ljava/lang/ClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 302
    return-void
.end method


# virtual methods
.method classicLoadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "resolve"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 334
    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method protected loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "resolve"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 307
    const-string v1, "sun.reflect"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 309
    sget-object v1, Lcom/google/inject/internal/BytecodeGen$SystemBridgeHolder;->SYSTEM_BRIDGE:Lcom/google/inject/internal/BytecodeGen$BridgeClassLoader;

    invoke-virtual {v1, p1, p2}, Lcom/google/inject/internal/BytecodeGen$BridgeClassLoader;->classicLoadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    .line 328
    :cond_0
    :goto_0
    return-object v0

    .line 312
    :cond_1
    sget-object v1, Lcom/google/inject/internal/BytecodeGen;->GUICE_INTERNAL_PACKAGE:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, " "

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 313
    :cond_2
    sget-object v1, Lcom/google/inject/internal/BytecodeGen;->GUICE_CLASS_LOADER:Ljava/lang/ClassLoader;

    if-nez v1, :cond_3

    .line 315
    sget-object v1, Lcom/google/inject/internal/BytecodeGen$SystemBridgeHolder;->SYSTEM_BRIDGE:Lcom/google/inject/internal/BytecodeGen$BridgeClassLoader;

    invoke-virtual {v1, p1, p2}, Lcom/google/inject/internal/BytecodeGen$BridgeClassLoader;->classicLoadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    .line 318
    :cond_3
    :try_start_0
    sget-object v1, Lcom/google/inject/internal/BytecodeGen;->GUICE_CLASS_LOADER:Ljava/lang/ClassLoader;

    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 319
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-eqz p2, :cond_0

    .line 320
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/BytecodeGen$BridgeClassLoader;->resolveClass(Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 323
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :catch_0
    move-exception v1

    .line 328
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/google/inject/internal/BytecodeGen$BridgeClassLoader;->classicLoadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    goto :goto_0
.end method
