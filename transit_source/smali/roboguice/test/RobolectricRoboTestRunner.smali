.class public Lroboguice/test/RobolectricRoboTestRunner;
.super Lcom/xtremelabs/robolectric/RobolectricTestRunner;
.source "RobolectricRoboTestRunner.java"


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runners/model/InitializationError;
        }
    .end annotation

    .prologue
    .line 17
    .local p1, "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, p1}, Lcom/xtremelabs/robolectric/RobolectricTestRunner;-><init>(Ljava/lang/Class;)V

    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lcom/xtremelabs/robolectric/RobolectricConfig;)V
    .locals 0
    .param p2, "robolectricConfig"    # Lcom/xtremelabs/robolectric/RobolectricConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/xtremelabs/robolectric/RobolectricConfig;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runners/model/InitializationError;
        }
    .end annotation

    .prologue
    .line 37
    .local p1, "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, p1, p2}, Lcom/xtremelabs/robolectric/RobolectricTestRunner;-><init>(Ljava/lang/Class;Lcom/xtremelabs/robolectric/RobolectricConfig;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lcom/xtremelabs/robolectric/bytecode/ClassHandler;Lcom/xtremelabs/robolectric/RobolectricConfig;)V
    .locals 0
    .param p2, "classHandler"    # Lcom/xtremelabs/robolectric/bytecode/ClassHandler;
    .param p3, "robolectricConfig"    # Lcom/xtremelabs/robolectric/RobolectricConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/xtremelabs/robolectric/bytecode/ClassHandler;",
            "Lcom/xtremelabs/robolectric/RobolectricConfig;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runners/model/InitializationError;
        }
    .end annotation

    .prologue
    .line 33
    .local p1, "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, p1, p2, p3}, Lcom/xtremelabs/robolectric/RobolectricTestRunner;-><init>(Ljava/lang/Class;Lcom/xtremelabs/robolectric/bytecode/ClassHandler;Lcom/xtremelabs/robolectric/RobolectricConfig;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lcom/xtremelabs/robolectric/bytecode/ClassHandler;Lcom/xtremelabs/robolectric/bytecode/RobolectricClassLoader;Lcom/xtremelabs/robolectric/RobolectricConfig;)V
    .locals 0
    .param p2, "classHandler"    # Lcom/xtremelabs/robolectric/bytecode/ClassHandler;
    .param p3, "classLoader"    # Lcom/xtremelabs/robolectric/bytecode/RobolectricClassLoader;
    .param p4, "robolectricConfig"    # Lcom/xtremelabs/robolectric/RobolectricConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/xtremelabs/robolectric/bytecode/ClassHandler;",
            "Lcom/xtremelabs/robolectric/bytecode/RobolectricClassLoader;",
            "Lcom/xtremelabs/robolectric/RobolectricConfig;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runners/model/InitializationError;
        }
    .end annotation

    .prologue
    .line 29
    .local p1, "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/xtremelabs/robolectric/RobolectricTestRunner;-><init>(Ljava/lang/Class;Lcom/xtremelabs/robolectric/bytecode/ClassHandler;Lcom/xtremelabs/robolectric/bytecode/RobolectricClassLoader;Lcom/xtremelabs/robolectric/RobolectricConfig;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/io/File;)V
    .locals 0
    .param p2, "androidProjectRoot"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runners/model/InitializationError;
        }
    .end annotation

    .prologue
    .line 25
    .local p1, "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, p1, p2}, Lcom/xtremelabs/robolectric/RobolectricTestRunner;-><init>(Ljava/lang/Class;Ljava/io/File;)V

    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/io/File;Ljava/io/File;)V
    .locals 0
    .param p2, "androidManifestPath"    # Ljava/io/File;
    .param p3, "resourceDirectory"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/io/File;",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runners/model/InitializationError;
        }
    .end annotation

    .prologue
    .line 21
    .local p1, "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0, p1, p2, p3}, Lcom/xtremelabs/robolectric/RobolectricTestRunner;-><init>(Ljava/lang/Class;Ljava/io/File;Ljava/io/File;)V

    .line 22
    return-void
.end method


# virtual methods
.method protected bindShadowClasses()V
    .locals 1

    .prologue
    .line 42
    invoke-super {p0}, Lcom/xtremelabs/robolectric/RobolectricTestRunner;->bindShadowClasses()V

    .line 43
    const-class v0, Lroboguice/test/shadow/ShadowFragmentActivity;

    invoke-static {v0}, Lcom/xtremelabs/robolectric/Robolectric;->bindShadowClass(Ljava/lang/Class;)V

    .line 44
    const-class v0, Lroboguice/test/shadow/ShadowFragment;

    invoke-static {v0}, Lcom/xtremelabs/robolectric/Robolectric;->bindShadowClass(Ljava/lang/Class;)V

    .line 45
    return-void
.end method
