.class public interface abstract Lcom/qihoo360/i/IPluginManager;
.super Ljava/lang/Object;
.source "360Security"


# virtual methods
.method public abstract query(Ljava/lang/String;Ljava/lang/Class;)Lcom/qihoo360/i/IModule;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/qihoo360/i/IModule;",
            ">;)",
            "Lcom/qihoo360/i/IModule;"
        }
    .end annotation
.end method

.method public abstract queryPluginContext(Ljava/lang/String;)Landroid/content/Context;
.end method
