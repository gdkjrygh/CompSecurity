.class Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;
.super Lcom/fasterxml/jackson/core/util/VersionUtil;
.source "ModuleVersion.java"


# static fields
.field public static final instance:Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;

    invoke-direct {v0}, Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;->instance:Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/util/VersionUtil;-><init>()V

    return-void
.end method
