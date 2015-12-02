.class public Lcom/qihoo360/i/Factory;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final PLUGIN_ENTRY_CLASS_NAME:Ljava/lang/String; = "Entry"

.field public static final PLUGIN_ENTRY_EXPORT_METHOD_NAME:Ljava/lang/String; = "create"

.field public static final PLUGIN_ENTRY_EXPORT_METHOD_PARAMS:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field public static final PLUGIN_ENTRY_PACKAGE_PREFIX:Ljava/lang/String; = "com.qihoo360.plugin"

.field public static sPluginManager:Lcom/qihoo360/i/IPluginManager;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 75
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Landroid/content/Context;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-class v2, Lcom/qihoo360/i/IPluginManager;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo360/i/Factory;->PLUGIN_ENTRY_EXPORT_METHOD_PARAMS:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final query(Ljava/lang/String;Ljava/lang/Class;)Lcom/qihoo360/i/IModule;
    .locals 1
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

    .prologue
    .line 90
    sget-object v0, Lcom/qihoo360/i/Factory;->sPluginManager:Lcom/qihoo360/i/IPluginManager;

    invoke-interface {v0, p0, p1}, Lcom/qihoo360/i/IPluginManager;->query(Ljava/lang/String;Ljava/lang/Class;)Lcom/qihoo360/i/IModule;

    move-result-object v0

    return-object v0
.end method

.method public static final queryPluginContext(Ljava/lang/String;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 100
    sget-object v0, Lcom/qihoo360/i/Factory;->sPluginManager:Lcom/qihoo360/i/IPluginManager;

    invoke-interface {v0, p0}, Lcom/qihoo360/i/IPluginManager;->queryPluginContext(Ljava/lang/String;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
