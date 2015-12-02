.class Lcom/fasterxml/jackson/datatype/guava/ModuleVersion;
.super Lcom/fasterxml/jackson/core/util/VersionUtil;
.source "ModuleVersion.java"


# static fields
.field public static final instance:Lcom/fasterxml/jackson/datatype/guava/ModuleVersion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    new-instance v0, Lcom/fasterxml/jackson/datatype/guava/ModuleVersion;

    invoke-direct {v0}, Lcom/fasterxml/jackson/datatype/guava/ModuleVersion;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/datatype/guava/ModuleVersion;->instance:Lcom/fasterxml/jackson/datatype/guava/ModuleVersion;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/util/VersionUtil;-><init>()V

    return-void
.end method
